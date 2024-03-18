package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ClientTransactionExt;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.stack.SSLStateMachine;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public class NioTlsWebSocketMessageChannel extends NioWebSocketMessageChannel implements NioTlsChannelInterface {
    private static StackLogger logger = CommonLogger.getLogger(NioTlsWebSocketMessageChannel.class);
    private int appBufferMax;
    private int netBufferMax;
    SSLStateMachine sslStateMachine;

    /* loaded from: classes2.dex */
    public static class SSLReconnectedException extends IOException {
        private static final long serialVersionUID = 1;
    }

    public NioTlsWebSocketMessageChannel(SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        super(sIPTransactionStack, nioTcpMessageProcessor, socketChannel);
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

    private void createBuffers() {
        SSLSession session = this.sslStateMachine.sslEngine.getSession();
        this.appBufferMax = session.getApplicationBufferSize();
        this.netBufferMax = session.getPacketBufferSize();
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("appBufferMax=" + this.appBufferMax + " netBufferMax=" + this.netBufferMax);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel, android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void addBytes(byte[] bArr) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Adding WSS bytes for decryption " + bArr.length);
        }
        if (bArr.length <= 0) {
            return;
        }
        this.sslStateMachine.unwrap(ByteBuffer.wrap(bArr));
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public void addPlaintextBytes(byte[] bArr) {
        super.addBytes(bArr);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel, android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public /* bridge */ /* synthetic */ ClientTransactionExt getEncapsulatedClientTransaction() {
        return super.getEncapsulatedClientTransaction();
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel, android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return this.messageProcessor.transport;
    }

    public void init(boolean z10) {
        SSLContext sSLContext;
        NioTlsWebSocketMessageProcessor nioTlsWebSocketMessageProcessor = (NioTlsWebSocketMessageProcessor) this.messageProcessor;
        if (z10) {
            sSLContext = nioTlsWebSocketMessageProcessor.sslClientCtx;
        } else {
            sSLContext = nioTlsWebSocketMessageProcessor.sslServerCtx;
        }
        SSLStateMachine sSLStateMachine = new SSLStateMachine(sSLContext.createSSLEngine(), this);
        this.sslStateMachine = sSLStateMachine;
        sSLStateMachine.sslEngine.setUseClientMode(z10);
        ((SipStackImpl) this.sipStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE");
        this.sslStateMachine.sslEngine.setNeedClientAuth(false);
        this.sslStateMachine.sslEngine.setWantClientAuth(false);
        String property = ((SipStackImpl) this.sipStack).getConfigurationProperties().getProperty("android.gov.nist.javax.sip.TLS_CLIENT_PROTOCOLS");
        if (property != null) {
            this.sslStateMachine.sslEngine.setEnabledProtocols(property.split(Separators.COMMA));
        }
        String[] enabledCipherSuites = ((SipStackImpl) this.sipStack).getEnabledCipherSuites();
        if (!Arrays.equals(enabledCipherSuites, SipStackImpl.DEFAULT_CIPHERS)) {
            logger.logDebug("Changing cipher suites");
            this.sslStateMachine.sslEngine.setEnabledCipherSuites(enabledCipherSuites);
            return;
        }
        logger.logDebug("JDK default ciphers will be used.");
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel, android.gov.nist.javax.sip.stack.NioTcpMessageChannel
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
        super.sendNonWebSocketMessage(bArr, false);
    }

    public void sendHttpMessage(byte[] bArr, final InetAddress inetAddress, final int i10, final boolean z10) {
        checkSocketState();
        this.sslStateMachine.wrap(ByteBuffer.wrap(bArr), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.5
            @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
            public void doSend(byte[] bArr2) {
                NioTlsWebSocketMessageChannel.super.sendMessage(bArr2, inetAddress, i10, z10);
            }
        });
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel, android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void sendMessage(byte[] bArr, final boolean z10) {
        checkSocketState();
        if (this.client && this.readingHttp && this.httpClientRequestSent.compareAndSet(false, true)) {
            final ByteBuffer wrap = ByteBuffer.wrap(NioWebSocketMessageChannel.wrapBufferIntoWebSocketFrame(bArr, this.client));
            this.sslStateMachine.wrap(ByteBuffer.wrap("null null HTTP/1.1\r\nHost: null\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n".getBytes()), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.1
                @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
                public void doSend(byte[] bArr2) {
                    NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel = NioTlsWebSocketMessageChannel.this;
                    NioTlsWebSocketMessageChannel.super.sendTCPMessage(bArr2, nioTlsWebSocketMessageChannel.peerAddress, NioTlsWebSocketMessageChannel.this.peerPort, false);
                    try {
                        NioTlsWebSocketMessageChannel.this.sslStateMachine.wrap(wrap, ByteBufferFactory.getInstance().allocateDirect(NioTlsWebSocketMessageChannel.this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.1.1
                            @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
                            public void doSend(byte[] bArr3) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                NioTlsWebSocketMessageChannel.super.sendNonWebSocketMessage(bArr3, z10);
                            }
                        });
                    } catch (Exception e10) {
                        throw new IOException("Can't send message", e10);
                    }
                }
            });
            return;
        }
        try {
            this.sslStateMachine.wrap(ByteBuffer.wrap(NioWebSocketMessageChannel.wrapBufferIntoWebSocketFrame(bArr, this.client)), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.2
                @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
                public void doSend(byte[] bArr2) {
                    NioTlsWebSocketMessageChannel.super.sendNonWebSocketMessage(bArr2, z10);
                }
            });
        } catch (Exception e10) {
            throw new IOException("Can't send message", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel
    public void sendNonWebSocketMessage(byte[] bArr, final boolean z10) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("sendMessage isClient  = " + z10 + " this = " + this);
        }
        this.lastActivityTimeStamp = System.currentTimeMillis();
        NIOHandler nIOHandler = ((NioTcpMessageProcessor) this.messageProcessor).nioHandler;
        SocketChannel socketChannel = this.socketChannel;
        if (socketChannel != null && socketChannel.isConnected() && this.socketChannel.isOpen()) {
            nIOHandler.putSocket(NIOHandler.makeKey(this.peerAddress, this.peerPort), this.socketChannel);
        }
        checkSocketState();
        this.sslStateMachine.wrap(ByteBuffer.wrap(bArr), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.6
            @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
            public void doSend(byte[] bArr2) {
                NioTlsWebSocketMessageChannel nioTlsWebSocketMessageChannel = NioTlsWebSocketMessageChannel.this;
                NioTlsWebSocketMessageChannel.super.sendTCPMessage(bArr2, nioTlsWebSocketMessageChannel.peerAddress, nioTlsWebSocketMessageChannel.peerPort, z10);
            }
        });
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public SipStackImpl getSIPStack() {
        return (SipStackImpl) super.getSIPStack();
    }

    @Override // android.gov.nist.javax.sip.stack.NioTlsChannelInterface
    public ByteBuffer prepareAppDataBuffer(int i10) {
        return ByteBufferFactory.getInstance().allocateDirect(i10);
    }

    public NioTlsWebSocketMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        super(inetAddress, i10, sIPTransactionStack, nioTcpMessageProcessor);
        try {
            init(true);
            createBuffers();
        } catch (Exception e10) {
            throw new IOException("Can't init the TLS channel", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel, android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, final InetAddress inetAddress, final int i10, final boolean z10) {
        checkSocketState();
        if (this.client && this.readingHttp && this.httpClientRequestSent.compareAndSet(false, true)) {
            final ByteBuffer wrap = ByteBuffer.wrap(NioWebSocketMessageChannel.wrapBufferIntoWebSocketFrame(bArr, this.client));
            this.sslStateMachine.wrap(ByteBuffer.wrap("null null HTTP/1.1\r\nHost: null\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n".getBytes()), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.3
                @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
                public void doSend(byte[] bArr2) {
                    NioTlsWebSocketMessageChannel.super.sendTCPMessage(bArr2, inetAddress, i10, false);
                    NioTlsWebSocketMessageChannel.this.sslStateMachine.wrap(wrap, ByteBufferFactory.getInstance().allocateDirect(NioTlsWebSocketMessageChannel.this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.3.1
                        @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
                        public void doSend(byte[] bArr3) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            NioTlsWebSocketMessageChannel.super.sendTCPMessage(bArr3, inetAddress, i10, z10);
                        }
                    });
                }
            });
            return;
        }
        this.sslStateMachine.wrap(ByteBuffer.wrap(NioWebSocketMessageChannel.wrapBufferIntoWebSocketFrame(bArr, this.client)), ByteBufferFactory.getInstance().allocateDirect(this.netBufferMax), new SSLStateMachine.MessageSendCallback() { // from class: android.gov.nist.javax.sip.stack.NioTlsWebSocketMessageChannel.4
            @Override // android.gov.nist.javax.sip.stack.SSLStateMachine.MessageSendCallback
            public void doSend(byte[] bArr2) {
                NioTlsWebSocketMessageChannel.super.sendTCPMessage(bArr2, inetAddress, i10, z10);
            }
        });
    }

    @Override // android.gov.nist.javax.sip.stack.NioWebSocketMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10) {
        sendMessage(sIPMessage.encodeAsBytes(getTransport()), inetAddress, i10, this.client);
        if (logger.isLoggingEnabled(16)) {
            logMessage(sIPMessage, inetAddress, i10, System.currentTimeMillis());
        }
    }
}
