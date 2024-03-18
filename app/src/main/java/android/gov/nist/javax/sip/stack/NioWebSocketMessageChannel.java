package android.gov.nist.javax.sip.stack;

import R.a;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import b.AbstractC2094d;
import c.AbstractC2244P;
import c.AbstractC2257l;
import c.g0;
import d.AbstractC2561b;
import java.io.ByteArrayInputStream;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.text.ParseException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class NioWebSocketMessageChannel extends NioTcpMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(NioWebSocketMessageChannel.class);
    boolean client;
    private WebSocketCodec codec;
    AtomicBoolean httpClientRequestSent;
    String httpHostHeader;
    String httpInput;
    String httpLocation;
    String httpMethod;
    boolean readingHttp;
    private SIPTransactionStack stack;

    public NioWebSocketMessageChannel(SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        super(nioTcpMessageProcessor, socketChannel);
        this.codec = new WebSocketCodec(true, true);
        this.readingHttp = true;
        this.httpInput = "";
        this.httpClientRequestSent = new AtomicBoolean(false);
        this.stack = sIPTransactionStack;
        this.messageProcessor = nioTcpMessageProcessor;
        this.myClientInputStream = socketChannel.socket().getInputStream();
    }

    public static byte[] wrapBufferIntoWebSocketFrame(byte[] bArr, boolean z10) {
        try {
            return WebSocketCodec.encode(bArr, 0, true, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void addBytes(byte[] bArr) {
        String str = new String(bArr);
        boolean z10 = this.readingHttp;
        if (z10) {
            byte[] bArr2 = null;
            for (int i10 = 0; i10 < bArr.length - 3; i10++) {
                if (bArr[i10] == 13 && bArr[i10 + 1] == 10 && bArr[i10 + 2] == 13 && bArr[i10 + 3] == 10) {
                    int i11 = i10 + 4;
                    str = str.substring(0, i11);
                    int length = (bArr.length - i10) - 4;
                    byte[] bArr3 = new byte[length];
                    for (int i12 = 0; i12 < length; i12++) {
                        bArr3[i12] = bArr[i11 + i12];
                    }
                    bArr2 = bArr3;
                }
            }
            this.httpInput = a.t(new StringBuilder(), this.httpInput, str);
            if (str.endsWith(Separators.NEWLINE) || str.endsWith(Separators.RETURN)) {
                this.readingHttp = false;
                if (!this.httpInput.startsWith("HTTP")) {
                    sendNonWebSocketMessage(new WebSocketHttpHandshake().createHttpResponse(str), false);
                } else {
                    logger.logDebug("HTTP Response. We are websocket client.\n" + this.httpInput);
                }
            }
            if (bArr2 != null) {
                addBytes(bArr2);
            }
        } else if (!z10) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (true) {
                byte[] decode = this.codec.decode(byteArrayInputStream);
                if (this.codec.isCloseOpcodeReceived()) {
                    logger.logDebug("Websocket close, sending polite close response");
                    this.socketChannel.write(ByteBuffer.wrap(new byte[]{-120, 0}));
                    return;
                } else if (decode == null) {
                    return;
                } else {
                    this.nioParser.addBytes(decode);
                    logger.logDebug("Nio websocket bytes were added " + decode.length);
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return this.messageProcessor.transport;
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel
    public void onNewSocket(byte[] bArr) {
        super.onNewSocket(bArr);
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel, android.gov.nist.javax.sip.parser.SIPMessageListener, android.gov.nist.javax.sip.stack.RawMessageChannel
    public void processMessage(SIPMessage sIPMessage) {
        if (this.stack.isPatchWebSocketHeaders()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Patching WebSocket headers");
            }
            if (sIPMessage instanceof AbstractC2561b) {
                AbstractC2257l abstractC2257l = (AbstractC2257l) sIPMessage.getHeader(SIPHeaderNames.CONTACT);
                AbstractC2244P abstractC2244P = (AbstractC2244P) sIPMessage.getHeader(SIPHeaderNames.RECORD_ROUTE);
                g0 topmostViaHeader = sIPMessage.getTopmostViaHeader();
                if (abstractC2244P == null) {
                    if (abstractC2257l != null) {
                        rewriteUri((AbstractC2094d) abstractC2257l.getAddress().getURI());
                    }
                } else {
                    rewriteUri((AbstractC2094d) abstractC2244P.getAddress().getURI());
                }
                if (topmostViaHeader.getHost().endsWith(".invalid")) {
                    topmostViaHeader.setHost(getPeerAddress());
                    topmostViaHeader.setPort(getPeerPort());
                }
            } else {
                AbstractC2257l abstractC2257l2 = (AbstractC2257l) sIPMessage.getHeader(SIPHeaderNames.CONTACT);
                if (abstractC2257l2 != null) {
                    rewriteUri((AbstractC2094d) abstractC2257l2.getAddress().getURI());
                }
            }
        }
        super.processMessage(sIPMessage);
    }

    public void rewriteUri(AbstractC2094d abstractC2094d) {
        try {
            if (abstractC2094d.getHost().endsWith(".invalid")) {
                abstractC2094d.setHost(getPeerAddress());
            }
        } catch (ParseException e10) {
            logger.logError("Cant parse address", e10);
        }
        abstractC2094d.setPort(getPeerPort());
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void sendMessage(byte[] bArr, boolean z10) {
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
        sendWrapped(bArr, this.peerAddress, this.peerPort, z10);
    }

    public void sendNonWebSocketMessage(byte[] bArr, boolean z10) {
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
        super.sendTCPMessage(bArr, this.peerAddress, this.peerPort, z10);
    }

    public void sendWrapped(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        if (this.client && this.readingHttp && this.httpClientRequestSent.compareAndSet(false, true)) {
            super.sendTCPMessage("null null HTTP/1.1\r\nHost: null \r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n".getBytes(), inetAddress, i10, false);
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
        super.sendTCPMessage(wrapBufferIntoWebSocketFrame(bArr, this.client), inetAddress, i10, z10);
    }

    @Override // android.gov.nist.javax.sip.stack.NioTcpMessageChannel, android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        sendWrapped(bArr, inetAddress, i10, z10);
    }

    public NioWebSocketMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        super(inetAddress, i10, sIPTransactionStack, nioTcpMessageProcessor);
        this.codec = new WebSocketCodec(true, true);
        this.readingHttp = true;
        this.httpInput = "";
        this.httpClientRequestSent = new AtomicBoolean(false);
        this.client = true;
        this.stack = sIPTransactionStack;
        this.codec = new WebSocketCodec(false, true);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(SIPMessage sIPMessage, InetAddress inetAddress, int i10) {
        if ((sIPMessage instanceof SIPRequest) && this.client && this.httpClientRequestSent.compareAndSet(false, true)) {
            AbstractC2094d abstractC2094d = (AbstractC2094d) ((SIPRequest) sIPMessage).getRequestURI();
            this.httpHostHeader = abstractC2094d.getHeader("Host");
            this.httpLocation = abstractC2094d.getHeader("Location");
            this.httpMethod = abstractC2094d.getMethodParam();
            super.sendTCPMessage((this.httpMethod + Separators.SP + this.httpLocation + " HTTP/1.1\r\nHost: " + this.httpHostHeader + "\r\nUpgrade: websocket\r\nConnection: Upgrade\r\nSec-WebSocket-Key: dGhlIHNhbXBsZSBub25jZQ==\r\nSec-WebSocket-Protocol: sip\r\nSec-WebSocket-Version: 13\r\n\r\n").getBytes(), inetAddress, i10, false);
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
        super.sendMessage(sIPMessage, inetAddress, i10);
    }
}
