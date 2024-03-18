package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ClientTransactionExt;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.SSLStateMachine;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import livekit.org.webrtc.PeerConnectionFactory;

/* loaded from: classes.dex */
public class NioTlsMessageChannel extends NioTcpMessageChannel implements NioTlsChannelInterface {
    private static StackLogger logger = CommonLogger.getLogger(NioTlsMessageChannel.class);
    private int appBufferMax;
    private boolean handshakeCompleted = false;
    private HandshakeCompletedListener handshakeCompletedListener;
    private int netBufferMax;
    SSLStateMachine sslStateMachine;

    /* loaded from: classes.dex */
    public static class SSLReconnectedException extends IOException {
        private static final long serialVersionUID = 1;
    }

    public NioTlsMessageChannel(NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        super(nioTcpMessageProcessor, socketChannel);
        this.messageProcessor = nioTcpMessageProcessor;
        this.myClientInputStream = socketChannel.socket().getInputStream();
        try {
            init(false);
            createBuffers();
        } catch (Exception e10) {
            throw new IOException("Can't do TLS init", e10);
        }
    }

    private void checkSocketState() {
        SocketChannel socketChannel = this.socketChannel;
        if (socketChannel != null) {
            if (!socketChannel.isConnected() || !this.socketChannel.isOpen()) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Need to reset SSL engine for socket " + this.socketChannel);
                }
                try {
                    init(this.sslStateMachine.sslEngine.getUseClientMode());
                } catch (Exception e10) {
                    logger.logError("Cannot reset SSL engine", e10);
                    throw new IOException(e10);
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void addBytes(byte[] bArr) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Adding TLS bytes for decryption " + bArr.length);
        }
        if (bArr.length <= 0) {
            return;
        }
        this.sslStateMachine.unwrap(ByteBuffer.wrap(bArr));
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public void addPlaintextBytes(byte[] bArr) {
        this.nioParser.addBytes(bArr);
    }

    public void createBuffers() {
        SSLSession session = this.sslStateMachine.sslEngine.getSession();
        this.appBufferMax = session.getApplicationBufferSize();
        this.netBufferMax = session.getPacketBufferSize();
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("appBufferMax=" + this.appBufferMax + " netBufferMax=" + this.netBufferMax);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel, android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public /* bridge */ /* synthetic */ ClientTransactionExt getEncapsulatedClientTransaction() {
        return super.getEncapsulatedClientTransaction();
    }

    public HandshakeCompletedListenerImpl getHandshakeCompletedListener() {
        return (HandshakeCompletedListenerImpl) this.handshakeCompletedListener;
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return "TLS";
    }

    public void init(boolean z10) {
        SSLContext sSLContext;
        NioTlsMessageProcessor nioTlsMessageProcessor = (NioTlsMessageProcessor) this.messageProcessor;
        if (z10) {
            sSLContext = nioTlsMessageProcessor.sslClientCtx;
        } else {
            sSLContext = nioTlsMessageProcessor.sslServerCtx;
        }
        SSLStateMachine sSLStateMachine = new SSLStateMachine(sSLContext.createSSLEngine(), this);
        this.sslStateMachine = sSLStateMachine;
        sSLStateMachine.sslEngine.setUseClientMode(z10);
        String property = ((SipStackImpl) this.sipStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE");
        if (property == null) {
            property = PeerConnectionFactory.TRIAL_ENABLED;
        }
        if (!property.equals("Disabled") && !property.equals("DisabledAll")) {
            if (property.equals(PeerConnectionFactory.TRIAL_ENABLED)) {
                this.sslStateMachine.sslEngine.setNeedClientAuth(true);
            } else if (property.equals("Want")) {
                this.sslStateMachine.sslEngine.setNeedClientAuth(false);
                this.sslStateMachine.sslEngine.setWantClientAuth(true);
            } else {
                throw new RuntimeException("Invalid parameter for TLS authentication: ".concat(property));
            }
        } else {
            this.sslStateMachine.sslEngine.setNeedClientAuth(false);
            this.sslStateMachine.sslEngine.setWantClientAuth(false);
        }
        this.sslStateMachine.sslEngine.setEnabledProtocols(((SipStackImpl) this.sipStack).getEnabledProtocols());
        this.sslStateMachine.sslEngine.setEnabledCipherSuites(((SipStackImpl) this.sipStack).getEnabledCipherSuites());
        if (getHandshakeCompletedListener() == null) {
            setHandshakeCompletedListener(new HandshakeCompletedListenerImpl(this, getSocketChannel()));
        }
    }

    public boolean isHandshakeCompleted() {
        return this.handshakeCompleted;
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void onNewSocket(byte[] bArr) {
        String str;
        super.onNewSocket(bArr);
        try {
            if (logger.isLoggingEnabled(32)) {
                if (bArr != null) {
                    str = new String(bArr, "UTF-8");
                } else {
                    str = null;
                }
                StackLogger stackLogger = logger;
                stackLogger.logDebug("New socket for " + this + " last message = " + str);
            }
            init(true);
            createBuffers();
            sendMessage(bArr, false);
        } catch (Exception e10) {
            logger.logError("Cant reinit", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public ByteBuffer prepareAppDataBuffer() {
        return ByteBufferFactory.getInstance().allocateDirect(this.appBufferMax);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public ByteBuffer prepareEncryptedDataBuffer() {
        return ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public void sendEncryptedData(byte[] bArr) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("sendEncryptedData  this = " + this + " peerPort = " + this.peerPort + " addr = " + this.peerAddress);
        }
        this.lastActivityTimeStamp = System.currentTimeMillis();
        NIOHandler nIOHandler = ((NioTcpMessageProcessor) this.messageProcessor).nioHandler;
        SocketChannel socketChannel = this.socketChannel;
        if (socketChannel != null && socketChannel.isConnected() && this.socketChannel.isOpen()) {
            nIOHandler.putSocket(NIOHandler.makeKey(this.peerAddress, this.peerPort), this.socketChannel);
        }
        super.sendMessage(bArr, this.peerAddress, this.peerPort, true);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void sendMessage(byte[] bArr, final boolean z10) {
        checkSocketState();
        try {
            this.sslStateMachine.wrap(ByteBuffer.wrap(bArr), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsMessageChannel.1
                @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
                public void doSend(byte[] bArr2) {
                    NioTlsMessageChannel.super.sendMessage(bArr2, z10);
                }
            });
        } catch (Exception e10) {
            throw new IOException("Can't send message", e10);
        }
    }

    public void setHandshakeCompleted(boolean z10) {
        this.handshakeCompleted = z10;
    }

    public void setHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.handshakeCompletedListener = handshakeCompletedListener;
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public SipStackImpl getSIPStack() {
        return (SipStackImpl) super.getSIPStack();
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public ByteBuffer prepareAppDataBuffer(int i10) {
        return ByteBufferFactory.getInstance().allocateDirect(i10);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, final InetAddress inetAddress, final int i10, final boolean z10) {
        checkSocketState();
        this.sslStateMachine.wrap(ByteBuffer.wrap(bArr), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsMessageChannel.2
            @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
            public void doSend(byte[] bArr2) {
                NioTlsMessageChannel.super.sendMessage(bArr2, inetAddress, i10, z10);
            }
        });
    }

    public NioTlsMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        super(inetAddress, i10, sIPTransactionStack, nioTcpMessageProcessor);
        try {
            init(true);
            createBuffers();
        } catch (Exception e10) {
            throw new IOException("Can't init the TLS channel", e10);
        }
    }
}
