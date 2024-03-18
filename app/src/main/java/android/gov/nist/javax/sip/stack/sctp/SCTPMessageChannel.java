package android.gov.nist.javax.sip.stack.sctp;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.StatusLine;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.gov.nist.javax.sip.stack.ServerRequestInterface;
import android.gov.nist.javax.sip.stack.ServerResponseInterface;
import com.statsig.androidsdk.ErrorBoundaryKt;
import com.sun.nio.sctp.MessageInfo;
import com.sun.nio.sctp.NotificationHandler;
import com.sun.nio.sctp.SctpChannel;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.text.ParseException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SCTPMessageChannel extends MessageChannel implements ParseExceptionListener, Comparable<SCTPMessageChannel> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static StackLogger logger = CommonLogger.getLogger(SCTPMessageChannel.class);
    private final SctpChannel channel;
    private final SelectionKey key;
    private final MessageInfo messageInfo;
    private InetSocketAddress peerAddress;
    private InetSocketAddress peerSrcAddress;
    private final SCTPMessageProcessor processor;
    private long rxTime;
    private final ByteBuffer rxBuffer = ByteBuffer.allocateDirect(ErrorBoundaryKt.SAMPLING_RATE);
    private final StringMsgParser parser = new StringMsgParser();

    public SCTPMessageChannel(SCTPMessageProcessor sCTPMessageProcessor, InetSocketAddress inetSocketAddress) {
        this.processor = sCTPMessageProcessor;
        this.messageProcessor = sCTPMessageProcessor;
        this.peerAddress = inetSocketAddress;
        this.peerSrcAddress = inetSocketAddress;
        MessageInfo createOutgoing = MessageInfo.createOutgoing(inetSocketAddress, 0);
        this.messageInfo = createOutgoing;
        createOutgoing.unordered(true);
        SctpChannel open = SctpChannel.open(inetSocketAddress, 1, 1);
        this.channel = open;
        open.configureBlocking(false);
        this.key = sCTPMessageProcessor.registerChannel(this, open);
    }

    private void processMessage(SIPMessage sIPMessage, long j6) {
        boolean z10;
        boolean passToListener;
        SIPTransactionStack sIPStack = this.processor.getSIPStack();
        sIPMessage.setRemoteAddress(this.peerAddress.getAddress());
        sIPMessage.setRemotePort(getPeerPort());
        sIPMessage.setLocalPort(getPort());
        sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
        if (sIPMessage instanceof SIPRequest) {
            SIPRequest sIPRequest = (SIPRequest) sIPMessage;
            if (logger.isLoggingEnabled(16)) {
                ServerLogger serverLogger = sIPStack.getServerLogger();
                String hostPort = getPeerHostPort().toString();
                serverLogger.logMessage(sIPMessage, hostPort, getHost() + ":" + getPort(), false, j6);
            }
            ServerRequestInterface newSIPServerRequest = sIPStack.newSIPServerRequest(sIPRequest, this);
            if (newSIPServerRequest == null) {
                if (logger.isLoggingEnabled()) {
                    logger.logWarning("Null request interface returned -- dropping request");
                    return;
                }
                return;
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("About to process " + sIPRequest.getFirstLine() + Separators.SLASH + newSIPServerRequest);
            }
            try {
                newSIPServerRequest.processRequest(sIPRequest, this);
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Done processing " + sIPRequest.getFirstLine() + Separators.SLASH + newSIPServerRequest);
                    return;
                }
                return;
            } finally {
                if ((newSIPServerRequest instanceof SIPTransaction) && !((SIPServerTransaction) newSIPServerRequest).passToListener()) {
                    ((SIPTransaction) newSIPServerRequest).releaseSem();
                }
            }
        }
        SIPResponse sIPResponse = (SIPResponse) sIPMessage;
        try {
            sIPResponse.checkHeaders();
            ServerResponseInterface newSIPServerResponse = sIPStack.newSIPServerResponse(sIPResponse, this);
            if (newSIPServerResponse != null) {
                try {
                    if ((newSIPServerResponse instanceof SIPClientTransaction) && !((SIPClientTransaction) newSIPServerResponse).checkFromTag(sIPResponse)) {
                        if (logger.isLoggingEnabled()) {
                            StackLogger stackLogger3 = logger;
                            stackLogger3.logError("Dropping response message with invalid tag >>> " + sIPResponse);
                        }
                        if (z10) {
                            if (!passToListener) {
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    newSIPServerResponse.processResponse(sIPResponse, this);
                    if (newSIPServerResponse instanceof SIPTransaction) {
                        SIPTransaction sIPTransaction = (SIPTransaction) newSIPServerResponse;
                        if (!sIPTransaction.passToListener()) {
                            sIPTransaction.releaseSem();
                        }
                    }
                } finally {
                    if (newSIPServerResponse instanceof SIPTransaction) {
                        SIPTransaction sIPTransaction2 = (SIPTransaction) newSIPServerResponse;
                        if (!sIPTransaction2.passToListener()) {
                            sIPTransaction2.releaseSem();
                        }
                    }
                }
            } else if (logger.isLoggingEnabled(32)) {
                logger.logDebug("null sipServerResponse as could not acquire semaphore or the valve dropped the message.");
            }
        } catch (ParseException unused) {
            if (logger.isLoggingEnabled()) {
                StackLogger stackLogger4 = logger;
                stackLogger4.logError("Dropping Badly formatted response message >>> " + sIPResponse);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void close() {
        try {
            try {
                this.key.cancel();
                this.channel.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } finally {
            this.processor.removeChannel(this);
        }
    }

    public void closeNoRemove() {
        try {
            this.key.cancel();
            this.channel.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getKey() {
        return MessageChannel.getKey(getPeerInetAddress(), getPeerPort(), getTransport());
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerAddress() {
        return this.peerAddress.getHostString();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerInetAddress() {
        return this.peerAddress.getAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerPacketSourceAddress() {
        return this.peerSrcAddress.getAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPacketSourcePort() {
        return this.peerSrcAddress.getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPort() {
        return this.peerAddress.getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerProtocol() {
        return "sctp";
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public SIPTransactionStack getSIPStack() {
        return this.processor.getSIPStack();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return "sctp";
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getViaHost() {
        return this.processor.getSavedIpAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getViaPort() {
        return this.processor.getPort();
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Parsing Exception: ", parseException);
        }
        if (cls != null && (cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logError("BAD MESSAGE!" + str2);
            }
            String sIPMessage2 = sIPMessage.toString();
            if (!sIPMessage2.startsWith("SIP/") && !sIPMessage2.startsWith("ACK ") && this.channel != null) {
                if (logger.isLoggingEnabled(4)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logError("Malformed mandatory headers: closing socket! :" + this.channel.toString());
                }
                try {
                    this.channel.close();
                } catch (IOException e10) {
                    if (logger.isLoggingEnabled(4)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logError("Exception while closing socket! :" + this.channel.toString() + ":" + e10.toString());
                    }
                }
            }
            throw parseException;
        }
        sIPMessage.addUnparsed(str);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isReliable() {
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    public void readMessages() {
        if (this.rxTime == 0) {
            this.rxTime = System.currentTimeMillis();
        }
        MessageInfo receive = this.channel.receive(this.rxBuffer, (Object) null, (NotificationHandler) null);
        if (receive == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SCTP read-event but no message");
            }
        } else if (receive.bytes() == -1) {
            logger.logWarning("SCTP peer closed, closing too...");
            close();
        } else if (!receive.isComplete()) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("SCTP incomplete message; bytes=" + receive.bytes());
            }
        } else {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("SCTP message now complete; bytes=" + receive.bytes());
            }
            int position = this.rxBuffer.position();
            byte[] bArr = new byte[position];
            this.rxBuffer.flip();
            this.rxBuffer.get(bArr);
            this.rxBuffer.compact();
            try {
                processMessage(this.parser.parseSIPMessage(bArr, true, true, this), this.rxTime);
                this.rxTime = 0L;
            } catch (ParseException e10) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    StringBuilder q10 = a.q("Invalid message bytes=", position, ":");
                    q10.append(new String(bArr));
                    stackLogger3.logDebug(q10.toString(), e10);
                }
                close();
                throw new IOException("Error parsing incoming SCTP message", e10);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(SIPMessage sIPMessage) {
        sendMessage(sIPMessage.encodeAsBytes(getTransport()), getPeerInetAddress(), getPeerPort(), false);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void uncache() {
        this.processor.removeChannel(this);
    }

    public int compareTo(SCTPMessageChannel sCTPMessageChannel) {
        return hashCode() - sCTPMessageChannel.hashCode();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        int send = this.channel.send(ByteBuffer.wrap(bArr), this.messageInfo);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("SCTP bytes sent:" + send);
        }
    }

    public SCTPMessageChannel(SCTPMessageProcessor sCTPMessageProcessor, SctpChannel sctpChannel) {
        this.processor = sCTPMessageProcessor;
        this.messageProcessor = sCTPMessageProcessor;
        SocketAddress socketAddress = (SocketAddress) sctpChannel.getRemoteAddresses().iterator().next();
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        this.peerAddress = inetSocketAddress;
        this.peerSrcAddress = inetSocketAddress;
        MessageInfo createOutgoing = MessageInfo.createOutgoing(socketAddress, 0);
        this.messageInfo = createOutgoing;
        createOutgoing.unordered(true);
        this.channel = sctpChannel;
        sctpChannel.configureBlocking(false);
        this.key = sCTPMessageProcessor.registerChannel(this, sctpChannel);
    }
}
