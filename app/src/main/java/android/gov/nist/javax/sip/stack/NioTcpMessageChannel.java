package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.ContentLength;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.parser.NioPipelineParser;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.NioTcpMessageProcessor;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.text.ParseException;
import java.util.Queue;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public class NioTcpMessageChannel extends ConnectionOrientedMessageChannel {
    private static final int BUF_SIZE = 4096;
    private static StackLogger logger = CommonLogger.getLogger(NioTcpMessageChannel.class);
    private final ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4096);
    protected long lastActivityTimeStamp;
    NioPipelineParser nioParser;
    protected SocketChannel socketChannel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioTcpMessageChannel(NioTcpMessageProcessor nioTcpMessageProcessor, SocketChannel socketChannel) {
        super(nioTcpMessageProcessor.getSIPStack());
        this.nioParser = null;
        this.myClientInputStream = socketChannel.socket().getInputStream();
        try {
            this.peerAddress = socketChannel.socket().getInetAddress();
            this.peerPort = socketChannel.socket().getPort();
            this.socketChannel = socketChannel;
            this.mySock = socketChannel.socket();
            SIPTransactionStack sIPTransactionStack = this.sipStack;
            this.nioParser = new NioPipelineParser(sIPTransactionStack, this, sIPTransactionStack.getMaxMessageSize());
            this.peerProtocol = nioTcpMessageProcessor.transport;
            this.lastActivityTimeStamp = System.currentTimeMillis();
            this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, nioTcpMessageProcessor.transport);
            this.myAddress = nioTcpMessageProcessor.getIpAddress().getHostAddress();
            this.myPort = nioTcpMessageProcessor.getPort();
        } finally {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Done creating NioTcpMessageChannel " + this + " socketChannel = " + socketChannel);
            }
        }
    }

    public void addBytes(byte[] bArr) {
        this.nioParser.addBytes(bArr);
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
    public void close(boolean z10, boolean z11) {
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Closing NioTcpMessageChannel " + this + " socketChannel = " + this.socketChannel);
            }
            ((NioTcpMessageProcessor) this.messageProcessor).nioHandler.removeMessageChannel(this.socketChannel);
            SocketChannel socketChannel = this.socketChannel;
            if (socketChannel != null) {
                socketChannel.close();
            }
            NioPipelineParser nioPipelineParser = this.nioParser;
            if (nioPipelineParser != null) {
                nioPipelineParser.close();
            }
            this.isRunning = false;
            if (z10) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Removing NioTcpMessageChannel " + this + " socketChannel = " + this.socketChannel);
                }
                ((NioTcpMessageProcessor) this.messageProcessor).nioHandler.removeSocket(this.socketChannel);
                ((ConnectionOrientedMessageProcessor) this.messageProcessor).remove(this);
            }
            if (z11) {
                cancelPingKeepAliveTimeoutTaskIfStarted();
            }
        } catch (IOException e10) {
            logger.logError("Problem occured while closing", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!getClass().equals(obj.getClass()) || this.socketChannel != ((NioTcpMessageChannel) obj).socketChannel) {
            return false;
        }
        return true;
    }

    public long getLastActivityTimestamp() {
        return this.lastActivityTimeStamp;
    }

    public SocketChannel getSocketChannel() {
        return this.socketChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return this.messageProcessor.transport;
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Parsing Exception: ", parseException);
        }
        if (cls != null && (cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Encountered Bad Message \n" + sIPMessage.toString());
            }
            String sIPMessage2 = sIPMessage.toString();
            if (!sIPMessage2.startsWith("SIP/") && !sIPMessage2.startsWith("ACK ") && this.socketChannel != null) {
                if (logger.isLoggingEnabled(4)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logError("Malformed mandatory headers: closing socket! :" + this.socketChannel.toString());
                }
                try {
                    this.socketChannel.close();
                } catch (IOException e10) {
                    if (logger.isLoggingEnabled(4)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logError("Exception while closing socket! :" + this.socketChannel.toString() + ":" + e10.toString());
                    }
                }
            }
            throw parseException;
        }
        sIPMessage.addUnparsed(str);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    public void onNewSocket(byte[] bArr) {
    }

    public void readChannel() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("NioTcpMessageChannel::readChannel");
        }
        this.isRunning = true;
        try {
            int read = this.socketChannel.read(this.byteBuffer);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Read " + read + " from socketChannel");
            }
            if (read != -1) {
                if (read != 0) {
                    this.byteBuffer.flip();
                    byte[] bArr = new byte[this.byteBuffer.remaining()];
                    this.byteBuffer.get(bArr);
                    this.byteBuffer.clear();
                    addBytes(bArr);
                    this.lastActivityTimeStamp = System.currentTimeMillis();
                    return;
                }
                throw new IOException("The socket is giving us empty TCP packets. This is usually an indication we are stuck and it is better to disconnect.");
            }
            throw new IOException("End-of-stream read (-1). This is usually an indication we are stuck and it is better to disconnect.");
        } catch (Exception e10) {
            if ((e10 instanceof IOException) && !(e10 instanceof SSLException)) {
                try {
                    this.nioParser.addBytes("\r\n\r\n".getBytes("UTF-8"));
                } catch (Exception unused) {
                }
            }
            try {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("I/O Issue closing sock " + e10.getMessage() + "myAddress:myport " + this.myAddress + ":" + this.myPort + ", remoteAddress:remotePort " + this.peerAddress + ":" + this.peerPort);
                    logger.logStackTrace();
                }
                close(true, false);
            } catch (Exception e11) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("Issue closing the socket " + e11);
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel
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
        sendTCPMessage(bArr, this.peerAddress, this.peerPort, z10);
    }

    public void sendTCPMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        if (bArr != null && inetAddress != null) {
            this.lastActivityTimeStamp = System.currentTimeMillis();
            if (this.peerPortAdvertisedInHeaders <= 0) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("receiver port = " + i10 + " for this channel " + this + " key " + this.key);
                }
                if (i10 <= 0) {
                    this.peerPortAdvertisedInHeaders = SIPConstants.DEFAULT_PORT;
                } else {
                    this.peerPortAdvertisedInHeaders = i10;
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("2.Storing peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " for this channel " + this + " key " + this.key);
                }
            }
            MessageProcessor messageProcessor = this.messageProcessor;
            NIOHandler nIOHandler = ((NioTcpMessageProcessor) messageProcessor).nioHandler;
            SocketChannel sendBytes = nIOHandler.sendBytes(messageProcessor.getIpAddress(), inetAddress, i10, this.messageProcessor.transport, bArr, z10, this);
            SocketChannel socketChannel = this.socketChannel;
            if (sendBytes != socketChannel && sendBytes != null) {
                if (socketChannel != null) {
                    if (logger.isLoggingEnabled(8)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logWarning("[2] Old socket different than new socket on channel " + this.key + this.socketChannel + Separators.SP + sendBytes);
                        logger.logStackTrace();
                        StackLogger stackLogger4 = logger;
                        StringBuilder sb2 = new StringBuilder("Old socket local ip address ");
                        sb2.append(this.socketChannel.socket().getLocalSocketAddress());
                        stackLogger4.logWarning(sb2.toString());
                        StackLogger stackLogger5 = logger;
                        stackLogger5.logWarning("Old socket remote ip address " + this.socketChannel.socket().getRemoteSocketAddress());
                        StackLogger stackLogger6 = logger;
                        stackLogger6.logWarning("New socket local ip address " + sendBytes.socket().getLocalSocketAddress());
                        StackLogger stackLogger7 = logger;
                        stackLogger7.logWarning("New socket remote ip address " + sendBytes.socket().getRemoteSocketAddress());
                    }
                    close(false, false);
                    this.socketChannel = sendBytes;
                    nIOHandler.putMessageChannel(sendBytes, this);
                    onNewSocket(bArr);
                }
                if (this.socketChannel != null && logger.isLoggingEnabled(8)) {
                    StackLogger stackLogger8 = logger;
                    stackLogger8.logWarning("There was no exception for the retry mechanism so we keep going " + this.key);
                }
                this.socketChannel = sendBytes;
                return;
            }
            return;
        }
        StackLogger stackLogger9 = logger;
        stackLogger9.logError("receiverAddress = " + inetAddress);
        throw new IllegalArgumentException("Null argument");
    }

    public synchronized void triggerConnectFailure(Queue<NioTcpMessageProcessor.PendingData> queue) {
        while (queue != null) {
            if (queue.peek() == null) {
                break;
            }
            SIPTransaction findTransaction = this.sipStack.findTransaction(queue.poll().txId, false);
            if (findTransaction != null) {
                if (findTransaction instanceof SIPClientTransaction) {
                    if (findTransaction.getRequest() != null && !findTransaction.getRequest().getMethod().equalsIgnoreCase(TokenNames.ACK)) {
                        try {
                            processMessage(((SIPRequest) findTransaction.getRequest()).createResponse(503, "Transport error sending request."));
                        } catch (Exception e10) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("failed to report transport error", e10);
                            }
                        }
                    }
                } else {
                    findTransaction.raiseIOExceptionEvent();
                }
            }
        }
        close();
    }

    public void triggerConnectSuccess() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Connection Success. Nothing else to do.");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        sendTCPMessage(bArr, inetAddress, i10, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioTcpMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, NioTcpMessageProcessor nioTcpMessageProcessor) {
        super(sIPTransactionStack);
        this.nioParser = null;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("NioTcpMessageChannel::NioTcpMessageChannel: " + inetAddress.getHostAddress() + ":" + i10);
        }
        try {
            this.messageProcessor = nioTcpMessageProcessor;
            SocketChannel createOrReuseSocket = nioTcpMessageProcessor.nioHandler.createOrReuseSocket(inetAddress, i10);
            this.socketChannel = createOrReuseSocket;
            this.peerAddress = createOrReuseSocket.socket().getInetAddress();
            this.peerPort = this.socketChannel.socket().getPort();
            this.mySock = this.socketChannel.socket();
            this.peerProtocol = getTransport();
            this.nioParser = new NioPipelineParser(sIPTransactionStack, this, this.sipStack.getMaxMessageSize());
            nioTcpMessageProcessor.nioHandler.putMessageChannel(this.socketChannel, this);
            this.lastActivityTimeStamp = System.currentTimeMillis();
            this.key = MessageChannel.getKey(this.peerAddress, this.peerPort, getTransport());
            this.myAddress = nioTcpMessageProcessor.getIpAddress().getHostAddress();
            this.myPort = nioTcpMessageProcessor.getPort();
        } finally {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("NioTcpMessageChannel::NioTcpMessageChannel: Done creating NioTcpMessageChannel " + this + " socketChannel = " + this.socketChannel);
            }
        }
    }
}
