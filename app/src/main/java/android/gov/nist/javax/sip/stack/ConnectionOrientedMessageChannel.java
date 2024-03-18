package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.IOExceptionEventExt;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipListenerExt;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.header.RetryAfter;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.ViaList;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.Pipeline;
import android.gov.nist.javax.sip.parser.PipelinedMsgParser;
import android.gov.nist.javax.sip.parser.SIPMessageListener;
import android.javax.sip.h;
import android.javax.sip.p;
import b.AbstractC2092b;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.text.ParseException;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public abstract class ConnectionOrientedMessageChannel extends MessageChannel implements SIPMessageListener, Runnable, RawMessageChannel {
    private static StackLogger logger = CommonLogger.getLogger(ConnectionOrientedMessageChannel.class);
    protected boolean isCached;
    private Semaphore keepAliveSemaphore;
    private long keepAliveTimeout;
    protected String key;
    private volatile long lastKeepAliveReceivedTime;
    protected String myAddress;
    protected InputStream myClientInputStream;
    protected PipelinedMsgParser myParser;
    protected int myPort;
    protected Socket mySock;
    protected Thread mythread;
    protected InetAddress peerAddress;
    protected String peerAddressAdvertisedInHeaders;
    protected int peerPort;
    protected String peerProtocol;
    private SIPStackTimerTask pingKeepAliveTimeoutTask;
    protected SIPTransactionStack sipStack;
    protected boolean isRunning = true;
    protected int peerPortAdvertisedInHeaders = -1;

    /* loaded from: classes2.dex */
    public class KeepAliveTimeoutTimerTask extends SIPStackTimerTask {
        public KeepAliveTimeoutTimerTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            h[] listeningPoints;
            if (ConnectionOrientedMessageChannel.logger.isLoggingEnabled(32)) {
                ConnectionOrientedMessageChannel.logger.logDebug("~~~ Starting processing of KeepAliveTimeoutEvent( " + ConnectionOrientedMessageChannel.this.peerAddress.getHostAddress() + Separators.COMMA + ConnectionOrientedMessageChannel.this.peerPort + ")...");
            }
            ConnectionOrientedMessageChannel.this.close(true, true);
            SIPTransactionStack sIPTransactionStack = ConnectionOrientedMessageChannel.this.sipStack;
            if (sIPTransactionStack instanceof SipStackImpl) {
                Iterator<SipProviderImpl> sipProviders = ((SipStackImpl) sIPTransactionStack).getSipProviders();
                while (sipProviders.hasNext()) {
                    SipProviderImpl next = sipProviders.next();
                    p sipListener = next.getSipListener();
                    for (h hVar : next.getListeningPoints()) {
                        if (sipListener != null && (sipListener instanceof SipListenerExt) && hVar.getIPAddress().equalsIgnoreCase(ConnectionOrientedMessageChannel.this.myAddress) && hVar.getPort() == ConnectionOrientedMessageChannel.this.myPort && hVar.getTransport().equalsIgnoreCase(ConnectionOrientedMessageChannel.this.getTransport())) {
                            IOExceptionEventExt.Reason reason = IOExceptionEventExt.Reason.KeepAliveTimeout;
                            ConnectionOrientedMessageChannel connectionOrientedMessageChannel = ConnectionOrientedMessageChannel.this;
                            String str = connectionOrientedMessageChannel.myAddress;
                            int i10 = connectionOrientedMessageChannel.myPort;
                            String hostAddress = connectionOrientedMessageChannel.peerAddress.getHostAddress();
                            ConnectionOrientedMessageChannel connectionOrientedMessageChannel2 = ConnectionOrientedMessageChannel.this;
                            ((SipListenerExt) sipListener).processIOException(new IOExceptionEventExt(next, reason, str, i10, hostAddress, connectionOrientedMessageChannel2.peerPort, connectionOrientedMessageChannel2.getTransport()));
                        }
                    }
                }
                return;
            }
            p sipListener2 = sIPTransactionStack.getSipListener();
            if (sipListener2 instanceof SipListenerExt) {
                SipListenerExt sipListenerExt = (SipListenerExt) sipListener2;
                IOExceptionEventExt.Reason reason2 = IOExceptionEventExt.Reason.KeepAliveTimeout;
                ConnectionOrientedMessageChannel connectionOrientedMessageChannel3 = ConnectionOrientedMessageChannel.this;
                String str2 = connectionOrientedMessageChannel3.myAddress;
                int i11 = connectionOrientedMessageChannel3.myPort;
                String hostAddress2 = connectionOrientedMessageChannel3.peerAddress.getHostAddress();
                ConnectionOrientedMessageChannel connectionOrientedMessageChannel4 = ConnectionOrientedMessageChannel.this;
                sipListenerExt.processIOException(new IOExceptionEventExt(this, reason2, str2, i11, hostAddress2, connectionOrientedMessageChannel4.peerPort, connectionOrientedMessageChannel4.getTransport()));
            }
        }
    }

    public ConnectionOrientedMessageChannel(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
        long reliableConnectionKeepAliveTimeout = sIPTransactionStack.getReliableConnectionKeepAliveTimeout();
        this.keepAliveTimeout = reliableConnectionKeepAliveTimeout;
        if (reliableConnectionKeepAliveTimeout > 0) {
            this.keepAliveSemaphore = new Semaphore(1);
        }
    }

    public void cancelPingKeepAliveTimeoutTaskIfStarted() {
        SIPStackTimerTask sIPStackTimerTask = this.pingKeepAliveTimeoutTask;
        if (sIPStackTimerTask != null && sIPStackTimerTask.getSipTimerTask() != null) {
            try {
                this.keepAliveSemaphore.acquire();
                try {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger = logger;
                        stackLogger.logDebug("~~~ cancelPingKeepAliveTimeoutTaskIfStarted for MessageChannel(key=" + this.key + "), clientAddress=" + this.peerAddress + ", clientPort=" + this.peerPort + ", timeout=" + this.keepAliveTimeout + Separators.RPAREN);
                    }
                    this.sipStack.getTimer().cancel(this.pingKeepAliveTimeoutTask);
                    this.keepAliveSemaphore.release();
                } catch (Throwable th2) {
                    this.keepAliveSemaphore.release();
                    throw th2;
                }
            } catch (InterruptedException unused) {
                logger.logError("Couldn't acquire keepAliveSemaphore");
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void close() {
        close(true, true);
    }

    public abstract void close(boolean z10, boolean z11);

    public long getKeepAliveTimeout() {
        return this.keepAliveTimeout;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getKey() {
        String str = this.key;
        if (str != null) {
            return str;
        }
        String key = MessageChannel.getKey(this.peerAddress, this.peerPort, getTransport());
        this.key = key;
        return key;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerAddress() {
        InetAddress inetAddress = this.peerAddress;
        if (inetAddress != null) {
            return inetAddress.getHostAddress();
        }
        return getHost();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerInetAddress() {
        return this.peerAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerPacketSourceAddress() {
        return this.peerAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPacketSourcePort() {
        return this.peerPort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPort() {
        return this.peerPort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerProtocol() {
        return this.peerProtocol;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getViaHost() {
        return this.myAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getViaPort() {
        return this.myPort;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isReliable() {
        return true;
    }

    public void processMessage(SIPMessage sIPMessage, InetAddress inetAddress) {
        this.peerAddress = inetAddress;
        try {
            processMessage(sIPMessage);
        } catch (Exception e10) {
            if (!logger.isLoggingEnabled(4)) {
                return;
            }
            logger.logError("ERROR processing self routing", e10);
        }
    }

    public void rescheduleKeepAliveTimeout(long j6) {
        StringBuilder sb2 = new StringBuilder();
        if (logger.isLoggingEnabled(32)) {
            sb2.append("~~~ rescheduleKeepAliveTimeout for MessageChannel(key=" + this.key + "), clientAddress=" + this.peerAddress + ", clientPort=" + this.peerPort + ", timeout=" + this.keepAliveTimeout + "): newKeepAliveTimeout=");
            if (j6 == Long.MAX_VALUE) {
                sb2.append("Long.MAX_VALUE");
            } else {
                sb2.append(j6);
            }
        }
        try {
            this.keepAliveSemaphore.acquire();
            try {
                if (this.pingKeepAliveTimeoutTask == null) {
                    this.pingKeepAliveTimeoutTask = new KeepAliveTimeoutTimerTask();
                    if (logger.isLoggingEnabled(32)) {
                        sb2.append(", scheduling pingKeepAliveTimeoutTask to execute after ");
                        sb2.append(this.keepAliveTimeout / 1000);
                        sb2.append(" seconds");
                        logger.logDebug(sb2.toString());
                    }
                    this.sipStack.getTimer().schedule(this.pingKeepAliveTimeoutTask, this.keepAliveTimeout);
                } else {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger = logger;
                        stackLogger.logDebug("~~~ cancelPingKeepAliveTimeout for MessageChannel(key=" + this.key + "), clientAddress=" + this.peerAddress + ", clientPort=" + this.peerPort + ", timeout=" + this.keepAliveTimeout + Separators.RPAREN);
                    }
                    this.sipStack.getTimer().cancel(this.pingKeepAliveTimeoutTask);
                    this.pingKeepAliveTimeoutTask = new KeepAliveTimeoutTimerTask();
                    if (logger.isLoggingEnabled(32)) {
                        sb2.append(", scheduling pingKeepAliveTimeoutTask to execute after ");
                        sb2.append(this.keepAliveTimeout / 1000);
                        sb2.append(" seconds");
                        logger.logDebug(sb2.toString());
                    }
                    this.sipStack.getTimer().schedule(this.pingKeepAliveTimeoutTask, this.keepAliveTimeout);
                }
                this.keepAliveSemaphore.release();
            } catch (Throwable th2) {
                this.keepAliveSemaphore.release();
                throw th2;
            }
        } catch (InterruptedException unused) {
            logger.logWarning("Couldn't acquire keepAliveSemaphore");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        int read;
        InputStream inputStream = this.myClientInputStream;
        SIPTransactionStack sIPTransactionStack = this.sipStack;
        Pipeline pipeline = new Pipeline(inputStream, sIPTransactionStack.readTimeout, sIPTransactionStack.getTimer());
        SIPTransactionStack sIPTransactionStack2 = this.sipStack;
        PipelinedMsgParser pipelinedMsgParser = new PipelinedMsgParser(sIPTransactionStack2, this, pipeline, sIPTransactionStack2.getMaxMessageSize());
        this.myParser = pipelinedMsgParser;
        pipelinedMsgParser.processInput();
        ((ConnectionOrientedMessageProcessor) this.messageProcessor).useCount++;
        this.isRunning = true;
        while (true) {
            try {
                try {
                    try {
                        bArr = new byte[4096];
                        read = this.myClientInputStream.read(bArr, 0, 4096);
                    } catch (IOException e10) {
                        try {
                            pipeline.write("\r\n\r\n".getBytes("UTF-8"));
                        } catch (Exception unused) {
                        }
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("IO issue while closing socket " + e10.getMessage());
                            }
                            if (this.sipStack.maxConnections != -1) {
                                synchronized (this.messageProcessor) {
                                    MessageProcessor messageProcessor = this.messageProcessor;
                                    ((ConnectionOrientedMessageProcessor) messageProcessor).nConnections--;
                                    messageProcessor.notify();
                                }
                            }
                            close();
                            pipeline.close();
                        } catch (IOException | Exception unused2) {
                        }
                        this.isRunning = false;
                        ((ConnectionOrientedMessageProcessor) this.messageProcessor).remove(this);
                        ((ConnectionOrientedMessageProcessor) this.messageProcessor).useCount--;
                        PipelinedMsgParser pipelinedMsgParser2 = this.myParser;
                        if (pipelinedMsgParser2 != null) {
                            pipelinedMsgParser2.close();
                            return;
                        }
                        return;
                    }
                } catch (Exception e11) {
                    InternalErrorHandler.handleException(e11, logger);
                }
                if (read == -1) {
                    break;
                }
                pipeline.write(bArr, 0, read);
            } catch (Throwable th2) {
                this.isRunning = false;
                ((ConnectionOrientedMessageProcessor) this.messageProcessor).remove(this);
                ((ConnectionOrientedMessageProcessor) this.messageProcessor).useCount--;
                PipelinedMsgParser pipelinedMsgParser3 = this.myParser;
                if (pipelinedMsgParser3 != null) {
                    pipelinedMsgParser3.close();
                }
                throw th2;
            }
        }
        pipeline.write("\r\n\r\n".getBytes("UTF-8"));
        try {
            if (this.sipStack.maxConnections != -1) {
                synchronized (this.messageProcessor) {
                    MessageProcessor messageProcessor2 = this.messageProcessor;
                    ((ConnectionOrientedMessageProcessor) messageProcessor2).nConnections--;
                    messageProcessor2.notify();
                }
            }
            pipeline.close();
            close();
        } catch (IOException unused3) {
        }
        this.isRunning = false;
        ((ConnectionOrientedMessageProcessor) this.messageProcessor).remove(this);
        ((ConnectionOrientedMessageProcessor) this.messageProcessor).useCount--;
        PipelinedMsgParser pipelinedMsgParser4 = this.myParser;
        if (pipelinedMsgParser4 != null) {
            pipelinedMsgParser4.close();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(final SIPMessage sIPMessage) {
        MessageProcessor[] messageProcessors;
        if (logger.isLoggingEnabled(32) && !sIPMessage.isNullRequest()) {
            logger.logDebug("sendMessage:: " + sIPMessage.getFirstLine() + " cseq method = " + sIPMessage.getCSeq().getMethod());
        }
        for (MessageProcessor messageProcessor : getSIPStack().getMessageProcessors()) {
            if (messageProcessor.getIpAddress().getHostAddress().equals(getPeerAddress()) && messageProcessor.getPort() == getPeerPort() && messageProcessor.getTransport().equalsIgnoreCase(getPeerProtocol())) {
                getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.ConnectionOrientedMessageChannel.1
                    @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                    public Object getThreadHash() {
                        return sIPMessage.getCallId().getCallId();
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ConnectionOrientedMessageChannel.this.processMessage((SIPMessage) sIPMessage.clone());
                        } catch (Exception e10) {
                            if (ConnectionOrientedMessageChannel.logger.isLoggingEnabled(4)) {
                                ConnectionOrientedMessageChannel.logger.logError("Error self routing message cause by: ", e10);
                            }
                        }
                    }
                });
                if (!logger.isLoggingEnabled(32)) {
                    return;
                }
                logger.logDebug("Self routing message");
                return;
            }
        }
        byte[] encodeAsBytes = sIPMessage.encodeAsBytes(getTransport());
        long currentTimeMillis = System.currentTimeMillis();
        if (this.peerPortAdvertisedInHeaders <= 0 && (sIPMessage instanceof SIPResponse)) {
            Via topmostVia = ((SIPResponse) sIPMessage).getTopmostVia();
            if (topmostVia.getRPort() > 0) {
                if (topmostVia.getPort() <= 0) {
                    this.peerPortAdvertisedInHeaders = SIPConstants.DEFAULT_PORT;
                } else {
                    this.peerPortAdvertisedInHeaders = topmostVia.getPort();
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("1.Storing peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " for via port = " + topmostVia.getPort() + " via rport = " + topmostVia.getRPort() + " and peer port = " + this.peerPort + " for this channel " + this + " key " + this.key);
                }
            }
        }
        sendMessage(encodeAsBytes, sIPMessage instanceof SIPRequest);
        sIPMessage.setRemoteAddress(this.peerAddress);
        sIPMessage.setRemotePort(this.peerPort);
        sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
        sIPMessage.setLocalPort(getPort());
        if (logger.isLoggingEnabled(16)) {
            logMessage(sIPMessage, this.peerAddress, this.peerPort, currentTimeMillis);
        }
    }

    public abstract void sendMessage(byte[] bArr, boolean z10);

    @Override // android.gov.nist.javax.sip.parser.SIPMessageListener
    public void sendSingleCLRF() {
        this.lastKeepAliveReceivedTime = System.currentTimeMillis();
        Socket socket = this.mySock;
        if (socket != null && !socket.isClosed()) {
            sendMessage(Separators.NEWLINE.getBytes("UTF-8"), false);
        }
        synchronized (this) {
            try {
                if (this.isRunning) {
                    long j6 = this.keepAliveTimeout;
                    if (j6 > 0) {
                        rescheduleKeepAliveTimeout(j6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setKeepAliveTimeout(long j6) {
        int i10 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        if (i10 < 0) {
            cancelPingKeepAliveTimeoutTaskIfStarted();
        }
        if (i10 == 0) {
            j6 = this.messageProcessor.getSIPStack().getReliableConnectionKeepAliveTimeout();
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("~~~ setKeepAliveTimeout for MessageChannel(key=" + this.key + "), clientAddress=" + this.peerAddress + ", clientPort=" + this.peerPort + ", timeout=" + j6 + Separators.RPAREN);
        }
        this.keepAliveTimeout = j6;
        if (this.keepAliveSemaphore == null) {
            this.keepAliveSemaphore = new Semaphore(1);
        }
        if (this.pingKeepAliveTimeoutTask != null && j6 > 0) {
            rescheduleKeepAliveTimeout(j6);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void uncache() {
        if (this.isCached && !this.isRunning) {
            ((ConnectionOrientedMessageProcessor) this.messageProcessor).remove(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0196, code lost:
        if (r12.getHost().equals(r18.peerAddress.getHostAddress()) != false) goto L50;
     */
    @Override // android.gov.nist.javax.sip.parser.SIPMessageListener, android.gov.nist.javax.sip.stack.RawMessageChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processMessage(SIPMessage sIPMessage) {
        String str;
        String str2;
        boolean z10;
        boolean passToListener;
        boolean z11;
        boolean passToListener2;
        Socket socket;
        if (sIPMessage.getFrom() != null && sIPMessage.getTo() != null && sIPMessage.getCallId() != null && sIPMessage.getCSeq() != null && sIPMessage.getViaHeaders() != null) {
            sIPMessage.setRemoteAddress(this.peerAddress);
            sIPMessage.setRemotePort(getPeerPort());
            sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
            sIPMessage.setLocalPort(getPort());
            sIPMessage.setPeerPacketSourceAddress(this.peerAddress);
            sIPMessage.setPeerPacketSourcePort(this.peerPort);
            ViaList viaHeaders = sIPMessage.getViaHeaders();
            if (sIPMessage instanceof SIPRequest) {
                Via via = (Via) viaHeaders.getFirst();
                AbstractC2092b resolveAddress = this.sipStack.addressResolver.resolveAddress(via.getHop());
                this.peerProtocol = via.getTransport();
                int port = via.getPort();
                str2 = "Dropping Badly formatted response message >>> ";
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    str = "Dropping response message with invalid tag >>> ";
                    stackLogger.logDebug("hop port = " + port + " for request " + sIPMessage + " for this channel " + this + " key " + this.key);
                } else {
                    str = "Dropping response message with invalid tag >>> ";
                }
                if (port <= 0) {
                    this.peerPortAdvertisedInHeaders = SIPConstants.DEFAULT_PORT;
                } else {
                    this.peerPortAdvertisedInHeaders = port;
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("3.Storing peerPortAdvertisedInHeaders = " + this.peerPortAdvertisedInHeaders + " for this channel " + this + " key " + this.key);
                }
                if (this.peerAddressAdvertisedInHeaders == null) {
                    this.peerAddressAdvertisedInHeaders = resolveAddress.getHost();
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logDebug("3.Storing peerAddressAdvertisedInHeaders = " + this.peerAddressAdvertisedInHeaders + " for this channel " + this + " key " + this.key);
                    }
                }
                if (!this.sipStack.isPatchReceivedRport()) {
                    try {
                        try {
                            Socket socket2 = this.mySock;
                            if (socket2 != null) {
                                this.peerAddress = socket2.getInetAddress();
                            }
                            boolean hasParameter = via.hasParameter("rport");
                            if (!this.sipStack.isPatchRport() || hasParameter || via.getPort() == this.peerPort) {
                                if (!hasParameter) {
                                }
                            } else if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger4 = logger;
                                stackLogger4.logDebug("setting rport since viaPort " + via.getPort() + " different than peerPacketSourcePort " + this.peerPort + " so that the response can be routed back");
                            }
                            via.setParameter("received", this.peerAddress.getHostAddress());
                            via.setParameter("rport", Integer.toString(this.peerPort));
                        } catch (ParseException e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                    } finally {
                    }
                } else if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("We did not use recived and rport");
                }
                if (!this.isCached && (socket = this.mySock) != null) {
                    this.isCached = true;
                    String makeKey = IOHandler.makeKey(this.mySock.getInetAddress(), ((InetSocketAddress) socket.getRemoteSocketAddress()).getPort());
                    MessageProcessor messageProcessor = this.messageProcessor;
                    if (messageProcessor instanceof NioTcpMessageProcessor) {
                        ((NioTcpMessageProcessor) messageProcessor).nioHandler.putSocket(makeKey, this.mySock.getChannel());
                    } else {
                        this.sipStack.ioHandler.putSocket(makeKey, this.mySock);
                    }
                    ((ConnectionOrientedMessageProcessor) this.messageProcessor).cacheMessageChannel(this);
                }
            } else {
                str2 = "Dropping Badly formatted response message >>> ";
                str = "Dropping response message with invalid tag >>> ";
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i10 = 0;
            if (sIPMessage instanceof SIPRequest) {
                SIPRequest sIPRequest = (SIPRequest) sIPMessage;
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("----Processing Message---");
                }
                if (logger.isLoggingEnabled(16)) {
                    ServerLogger serverLogger = this.sipStack.serverLogger;
                    String hostPort = getPeerHostPort().toString();
                    serverLogger.logMessage(sIPMessage, hostPort, this.messageProcessor.getIpAddress().getHostAddress() + ":" + this.messageProcessor.getPort(), false, currentTimeMillis);
                }
                if (this.sipStack.getMaxMessageSize() > 0) {
                    if (sIPRequest.getSize() + (sIPRequest.getContentLength() == null ? 0 : sIPRequest.getContentLength().getContentLength()) > this.sipStack.getMaxMessageSize()) {
                        sendMessage(sIPRequest.createResponse(513).encodeAsBytes(getTransport()), false);
                        throw new Exception("Message size exceeded");
                    }
                }
                String sipVersion = ((SIPRequest) sIPMessage).getRequestLine().getSipVersion();
                if (sipVersion.equals(SIPConstants.SIP_VERSION_STRING)) {
                    String method = ((SIPRequest) sIPMessage).getMethod();
                    if (method.equalsIgnoreCase(((SIPRequest) sIPMessage).getCSeqHeader().getMethod())) {
                        ServerRequestInterface newSIPServerRequest = this.sipStack.newSIPServerRequest(sIPRequest, this);
                        if (newSIPServerRequest != null) {
                            try {
                                newSIPServerRequest.processRequest(sIPRequest, this);
                                if (!z11) {
                                    return;
                                }
                                if (passToListener2) {
                                    return;
                                }
                                return;
                            } finally {
                                if ((newSIPServerRequest instanceof SIPTransaction) && !((SIPServerTransaction) newSIPServerRequest).passToListener()) {
                                    ((SIPTransaction) newSIPServerRequest).releaseSem();
                                }
                            }
                        } else if (this.sipStack.sipMessageValves.size() != 0) {
                            return;
                        } else {
                            SIPMessage createResponse = sIPRequest.createResponse(503);
                            RetryAfter retryAfter = new RetryAfter();
                            try {
                                retryAfter.setRetryAfter((int) (Math.random() * 10.0d));
                                createResponse.setHeader(retryAfter);
                                sendMessage(createResponse);
                            } catch (Exception unused) {
                            }
                            if (!logger.isLoggingEnabled()) {
                                return;
                            }
                            logger.logWarning("Dropping message -- could not acquire semaphore");
                            return;
                        }
                    }
                    sendMessage(sIPRequest.createResponse(RCHTTPStatusCodes.BAD_REQUEST).encodeAsBytes(getTransport()), false);
                    throw new Exception("Bad CSeq method" + sIPMessage + " method " + method);
                }
                sendMessage(((SIPRequest) sIPMessage).createResponse(505, "Bad SIP version ".concat(sipVersion)).encodeAsBytes(getTransport()), false);
                throw new Exception("Bad version ");
            }
            SIPResponse sIPResponse = (SIPResponse) sIPMessage;
            try {
                sIPResponse.checkHeaders();
                if (this.sipStack.getMaxMessageSize() > 0) {
                    int size = sIPResponse.getSize();
                    if (sIPResponse.getContentLength() != null) {
                        i10 = sIPResponse.getContentLength().getContentLength();
                    }
                    if (size + i10 > this.sipStack.getMaxMessageSize()) {
                        if (!logger.isLoggingEnabled(32)) {
                            return;
                        }
                        logger.logDebug("Message size exceeded");
                        return;
                    }
                }
                ServerResponseInterface newSIPServerResponse = this.sipStack.newSIPServerResponse(sIPResponse, this);
                if (newSIPServerResponse != null) {
                    try {
                        if ((newSIPServerResponse instanceof SIPClientTransaction) && !((SIPClientTransaction) newSIPServerResponse).checkFromTag(sIPResponse)) {
                            if (logger.isLoggingEnabled()) {
                                StackLogger stackLogger5 = logger;
                                stackLogger5.logError(str + sIPResponse);
                            }
                            if (!z10) {
                                return;
                            }
                            if (passToListener) {
                                return;
                            }
                            return;
                        }
                        newSIPServerResponse.processResponse(sIPResponse, this);
                        if (!(newSIPServerResponse instanceof SIPTransaction) || ((SIPTransaction) newSIPServerResponse).passToListener()) {
                            return;
                        }
                        ((SIPTransaction) newSIPServerResponse).releaseSem();
                    } finally {
                        if ((newSIPServerResponse instanceof SIPTransaction) && !((SIPTransaction) newSIPServerResponse).passToListener()) {
                            ((SIPTransaction) newSIPServerResponse).releaseSem();
                        }
                    }
                } else if (!logger.isLoggingEnabled(32)) {
                } else {
                    logger.logDebug("null sipServerResponse as could not acquire semaphore or the valve dropped the message.");
                }
            } catch (ParseException unused2) {
                if (!logger.isLoggingEnabled()) {
                    return;
                }
                StackLogger stackLogger6 = logger;
                stackLogger6.logError(str2 + sIPResponse);
            }
        } else if (!logger.isLoggingEnabled()) {
        } else {
            String encode = sIPMessage.encode();
            StackLogger stackLogger7 = logger;
            stackLogger7.logError("bad message " + encode);
            logger.logError(">>> Dropped Bad Msg");
        }
    }
}
