package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.ParameterNames;
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
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.MessageParser;
import android.gov.nist.javax.sip.parser.ParseExceptionListener;
import b.AbstractC2092b;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class UDPMessageChannel extends MessageChannel implements ParseExceptionListener, Runnable, RawMessageChannel {
    private static final StackLogger logger = CommonLogger.getLogger(UDPMessageChannel.class);
    private static Hashtable<String, PingBackTimerTask> pingBackRecord = new Hashtable<>();
    private DatagramPacket incomingPacket;
    private String myAddress;
    protected MessageParser myParser;
    protected int myPort;
    private Thread mythread;
    private InetAddress peerAddress;
    private InetAddress peerPacketSourceAddress;
    private int peerPacketSourcePort;
    private int peerPort;
    private String peerProtocol;
    private long receptionTime;
    protected SIPTransactionStack sipStack;

    /* loaded from: classes2.dex */
    public class PingBackTimerTask extends SIPStackTimerTask {
        String ipAddress;
        int port;

        public PingBackTimerTask(String str, int i10) {
            this.ipAddress = str;
            this.port = i10;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        public int hashCode() {
            return (this.ipAddress + ":" + this.port).hashCode();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            Hashtable hashtable = UDPMessageChannel.pingBackRecord;
            hashtable.remove(this.ipAddress + ":" + this.port);
        }
    }

    public UDPMessageChannel(SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor, String str) {
        this.mythread = null;
        this.messageProcessor = uDPMessageProcessor;
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(this.sipStack);
        this.mythread = new Thread(this);
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        this.mythread.setName(str);
        this.mythread.setDaemon(true);
        this.mythread.start();
    }

    private void processIncomingDataPacket(DatagramPacket datagramPacket) {
        this.peerAddress = datagramPacket.getAddress();
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("UDPMessageChannel: processIncomingDataPacket : peerAddress = " + this.peerAddress.getHostAddress() + Separators.SLASH + datagramPacket.getPort() + " Length = " + length);
        }
        try {
            this.receptionTime = System.currentTimeMillis();
            boolean z10 = true;
            SIPMessage parseSIPMessage = this.myParser.parseSIPMessage(bArr, true, false, this);
            if (parseSIPMessage instanceof SIPRequest) {
                String sipVersion = ((SIPRequest) parseSIPMessage).getRequestLine().getSipVersion();
                if (!sipVersion.equals(SIPConstants.SIP_VERSION_STRING)) {
                    sendMessage(((SIPRequest) parseSIPMessage).createResponse(505, "Bad version ".concat(sipVersion)).toString().getBytes(), this.peerAddress, datagramPacket.getPort(), "UDP", false);
                    return;
                } else if (!((SIPRequest) parseSIPMessage).getMethod().equalsIgnoreCase(((SIPRequest) parseSIPMessage).getCSeqHeader().getMethod())) {
                    sendMessage(((SIPRequest) parseSIPMessage).createResponse(RCHTTPStatusCodes.BAD_REQUEST).encodeAsBytes(getTransport()), this.peerAddress, datagramPacket.getPort(), "UDP", false);
                    return;
                }
            }
            if (parseSIPMessage == null) {
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("Rejecting message !  + Null message parsed.");
                }
                String str = datagramPacket.getAddress().getHostAddress() + ":" + datagramPacket.getPort();
                if (pingBackRecord.get(str) == null && this.sipStack.getMinKeepAliveInterval() > 0) {
                    byte[] bytes = "\r\n\r\n".getBytes();
                    DatagramPacket datagramPacket2 = new DatagramPacket(bytes, 0, bytes.length, datagramPacket.getAddress(), datagramPacket.getPort());
                    PingBackTimerTask pingBackTimerTask = new PingBackTimerTask(datagramPacket.getAddress().getHostAddress(), datagramPacket.getPort());
                    pingBackRecord.put(str, pingBackTimerTask);
                    this.sipStack.getTimer().schedule(pingBackTimerTask, this.sipStack.getMinKeepAliveInterval() * 1000);
                    ((UDPMessageProcessor) this.messageProcessor).sock.send(datagramPacket2);
                    return;
                }
                stackLogger.logDebug("Not sending ping back");
                return;
            }
            Via topmostVia = parseSIPMessage.getTopmostVia();
            if (parseSIPMessage.getFrom() != null && parseSIPMessage.getTo() != null && parseSIPMessage.getCallId() != null && parseSIPMessage.getCSeq() != null && topmostVia != null) {
                SIPEventInterceptor sIPEventInterceptor = this.sipStack.sipEventInterceptor;
                if (sIPEventInterceptor != null) {
                    sIPEventInterceptor.beforeMessage(parseSIPMessage);
                }
                if (parseSIPMessage instanceof SIPRequest) {
                    AbstractC2092b resolveAddress = this.sipStack.addressResolver.resolveAddress(topmostVia.getHop());
                    this.peerPort = resolveAddress.getPort();
                    this.peerProtocol = topmostVia.getTransport();
                    this.peerPacketSourceAddress = datagramPacket.getAddress();
                    this.peerPacketSourcePort = datagramPacket.getPort();
                    try {
                        this.peerAddress = datagramPacket.getAddress();
                        boolean hasParameter = topmostVia.hasParameter("rport");
                        if (this.sipStack.isPatchRport() && !hasParameter && topmostVia.getPort() != this.peerPacketSourcePort) {
                            if (stackLogger.isLoggingEnabled(32)) {
                                stackLogger.logDebug("setting rport since viaPort " + topmostVia.getPort() + " different than peerPacketSourcePort " + this.peerPacketSourcePort + " so that the response can be routed back");
                            }
                        } else {
                            z10 = hasParameter;
                        }
                        if (z10 || !resolveAddress.getHost().equals(this.peerAddress.getHostAddress())) {
                            topmostVia.setParameter("received", this.peerAddress.getHostAddress());
                        }
                        if (z10) {
                            topmostVia.setParameter("rport", Integer.toString(this.peerPacketSourcePort));
                        }
                    } catch (ParseException e10) {
                        InternalErrorHandler.handleException(e10);
                    }
                } else {
                    this.peerPacketSourceAddress = datagramPacket.getAddress();
                    this.peerPacketSourcePort = datagramPacket.getPort();
                    this.peerAddress = datagramPacket.getAddress();
                    this.peerPort = datagramPacket.getPort();
                    this.peerProtocol = topmostVia.getTransport();
                }
                processMessage(parseSIPMessage);
                SIPEventInterceptor sIPEventInterceptor2 = this.sipStack.sipEventInterceptor;
                if (sIPEventInterceptor2 != null) {
                    sIPEventInterceptor2.afterMessage(parseSIPMessage);
                    return;
                }
                return;
            }
            String str2 = new String(bArr);
            if (stackLogger.isLoggingEnabled()) {
                stackLogger.logError("bad message ".concat(str2));
                stackLogger.logError(">>> Dropped Bad Msg From = " + parseSIPMessage.getFrom() + "To = " + parseSIPMessage.getTo() + "CallId = " + parseSIPMessage.getCallId() + "CSeq = " + parseSIPMessage.getCSeq() + "Via = " + parseSIPMessage.getViaHeaders());
            }
        } catch (ParseException e11) {
            StackLogger stackLogger2 = logger;
            if (stackLogger2.isLoggingEnabled(32)) {
                stackLogger2.logDebug("Rejecting message !  " + new String(bArr) + Separators.SP + e11.getMessage());
            }
            String str3 = new String(bArr, 0, length);
            if (!str3.startsWith("SIP/") && !str3.startsWith("ACK ")) {
                String createBadReqRes = createBadReqRes(str3, e11);
                if (createBadReqRes != null) {
                    if (stackLogger2.isLoggingEnabled(32)) {
                        stackLogger2.logDebug("Sending automatic 400 Bad Request:");
                        stackLogger2.logDebug(createBadReqRes);
                    }
                    try {
                        sendMessage(createBadReqRes.getBytes(), this.peerAddress, datagramPacket.getPort(), "UDP", false);
                    } catch (IOException e12) {
                        logger.logException(e12);
                    }
                } else if (stackLogger2.isLoggingEnabled(32)) {
                    stackLogger2.logDebug("Could not formulate automatic 400 Bad Request");
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void close() {
        Thread thread = this.mythread;
        if (thread != null) {
            thread.interrupt();
            this.mythread = null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return getKey().equals(((UDPMessageChannel) obj).getKey());
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getHost() {
        return this.messageProcessor.getIpAddress().getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getKey() {
        return MessageChannel.getKey(this.peerAddress, this.peerPort, "UDP");
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getPeerAddress() {
        return this.peerAddress.getHostAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerInetAddress() {
        return this.peerAddress;
    }

    public String getPeerName() {
        return this.peerAddress.getHostName();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public InetAddress getPeerPacketSourceAddress() {
        return this.peerPacketSourceAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getPeerPacketSourcePort() {
        return this.peerPacketSourcePort;
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
    public int getPort() {
        return ((UDPMessageProcessor) this.messageProcessor).getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getTransport() {
        return ParameterNames.UDP;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public String getViaHost() {
        return this.myAddress;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public int getViaPort() {
        return this.myPort;
    }

    @Override // android.gov.nist.javax.sip.parser.ParseExceptionListener
    public void handleException(ParseException parseException, SIPMessage sIPMessage, Class cls, String str, String str2) {
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("Parsing Issue " + parseException.getMessage());
        }
        if (cls != null && (cls.equals(From.class) || cls.equals(To.class) || cls.equals(CSeq.class) || cls.equals(Via.class) || cls.equals(CallID.class) || cls.equals(ContentLength.class) || cls.equals(RequestLine.class) || cls.equals(StatusLine.class))) {
            if (stackLogger.isLoggingEnabled(32)) {
                a.w("BAD MESSAGE! ", str2, stackLogger);
            }
            throw parseException;
        }
        sIPMessage.addUnparsed(str);
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isReliable() {
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public boolean isSecure() {
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.RawMessageChannel
    public void processMessage(SIPMessage sIPMessage) {
        boolean z10;
        boolean passToListener;
        sIPMessage.setRemoteAddress(this.peerAddress);
        sIPMessage.setRemotePort(getPeerPort());
        sIPMessage.setLocalPort(getPort());
        sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16)) {
            stackLogger.logInfo("Setting SIPMessage peerPacketSource to: " + this.peerPacketSourceAddress + ":" + this.peerPacketSourcePort);
        }
        sIPMessage.setPeerPacketSourceAddress(this.peerPacketSourceAddress);
        sIPMessage.setPeerPacketSourcePort(this.peerPacketSourcePort);
        if (sIPMessage instanceof SIPRequest) {
            SIPRequest sIPRequest = (SIPRequest) sIPMessage;
            if (stackLogger.isLoggingEnabled(16)) {
                ServerLogger serverLogger = this.sipStack.serverLogger;
                String hostPort = getPeerHostPort().toString();
                serverLogger.logMessage(sIPMessage, hostPort, getHost() + ":" + this.myPort, false, this.receptionTime);
            }
            ServerRequestInterface newSIPServerRequest = this.sipStack.newSIPServerRequest(sIPRequest, this);
            if (newSIPServerRequest == null) {
                if (stackLogger.isLoggingEnabled()) {
                    stackLogger.logWarning("Null request interface returned -- dropping request");
                    return;
                }
                return;
            }
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug("About to process " + sIPRequest.getFirstLine() + Separators.SLASH + newSIPServerRequest);
            }
            try {
                newSIPServerRequest.processRequest(sIPRequest, this);
                if (stackLogger.isLoggingEnabled(32)) {
                    stackLogger.logDebug("Done processing " + sIPRequest.getFirstLine() + Separators.SLASH + newSIPServerRequest);
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
            if (stackLogger.isLoggingEnabled(16)) {
                ServerLogger serverLogger2 = this.sipStack.serverLogger;
                String hostPort2 = getPeerHostPort().toString();
                serverLogger2.logMessage((SIPMessage) sIPResponse, hostPort2, getHost() + ":" + this.myPort, false, this.receptionTime);
            }
            ServerResponseInterface newSIPServerResponse = this.sipStack.newSIPServerResponse(sIPResponse, this);
            if (newSIPServerResponse != null) {
                try {
                    if ((newSIPServerResponse instanceof SIPClientTransaction) && !((SIPClientTransaction) newSIPServerResponse).checkFromTag(sIPResponse)) {
                        if (stackLogger.isLoggingEnabled()) {
                            stackLogger.logError("Dropping response message with invalid tag >>> " + sIPResponse);
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
            } else if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug("null sipServerResponse as could not acquire semaphore or the valve dropped the message.");
            }
        } catch (ParseException unused) {
            if (logger.isLoggingEnabled()) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logError("Dropping Badly formatted response message >>> " + sIPResponse);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:3|(6:(1:8)|(1:10)|(3:41|12|(3:16|19|(2:44|21)(1:(4:47|23|50|49)(4:45|24|39|25))))|18|19|(0)(0))(2:43|29)|37|30|33|(2:46|35)(2:51|49)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        android.gov.nist.javax.sip.stack.UDPMessageChannel.logger.logError("Error while processing incoming UDP packet" + java.util.Arrays.toString(r3.getData()), r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0006 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        DatagramPacket datagramPacket;
        DatagramQueuedMessageDispatch poll;
        UDPMessageProcessor uDPMessageProcessor = (UDPMessageProcessor) this.messageProcessor;
        ThreadAuditor.ThreadHandle threadHandle = null;
        while (true) {
            SIPTransactionStack sIPTransactionStack = this.sipStack;
            if (sIPTransactionStack.threadPoolSize != -1) {
                if (threadHandle == null && sIPTransactionStack.getThreadAuditor() != null) {
                    threadHandle = this.sipStack.getThreadAuditor().addCurrentThread();
                }
                if (threadHandle != null) {
                    threadHandle.ping();
                }
                if (threadHandle != null) {
                    try {
                    } catch (InterruptedException unused) {
                        datagramPacket = null;
                        if (!uDPMessageProcessor.isRunning) {
                        }
                        processIncomingDataPacket(datagramPacket);
                        if (this.sipStack.threadPoolSize == -1) {
                        }
                    }
                    if (this.sipStack.getThreadAuditor() != null && this.sipStack.getThreadAuditor().isEnabled()) {
                        poll = uDPMessageProcessor.messageQueue.poll(threadHandle.getPingIntervalInMillisecs(), TimeUnit.MILLISECONDS);
                        if (uDPMessageProcessor.isRunning) {
                            return;
                        }
                        if (poll != null) {
                            datagramPacket = poll.packet;
                            try {
                                this.incomingPacket = datagramPacket;
                            } catch (InterruptedException unused2) {
                                if (!uDPMessageProcessor.isRunning) {
                                    return;
                                }
                                processIncomingDataPacket(datagramPacket);
                                if (this.sipStack.threadPoolSize == -1) {
                                }
                            }
                        }
                    }
                }
                poll = uDPMessageProcessor.messageQueue.take();
                if (uDPMessageProcessor.isRunning) {
                }
            } else {
                datagramPacket = this.incomingPacket;
            }
            processIncomingDataPacket(datagramPacket);
            if (this.sipStack.threadPoolSize == -1) {
                return;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(final SIPMessage sIPMessage) {
        MessageProcessor[] messageProcessors;
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            if ((sIPMessage instanceof SIPRequest) && ((SIPRequest) sIPMessage).getRequestLine() != null) {
                stackLogger.logStackTrace(16);
            } else {
                stackLogger.logStackTrace(16);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                for (MessageProcessor messageProcessor : this.sipStack.getMessageProcessors()) {
                    if (messageProcessor.getIpAddress().equals(this.peerAddress) && messageProcessor.getPort() == this.peerPort && messageProcessor.getTransport().equalsIgnoreCase(this.peerProtocol)) {
                        MessageChannel createMessageChannel = messageProcessor.createMessageChannel(this.peerAddress, this.peerPort);
                        if (createMessageChannel instanceof RawMessageChannel) {
                            final RawMessageChannel rawMessageChannel = (RawMessageChannel) createMessageChannel;
                            getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.UDPMessageChannel.1
                                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                                public Object getThreadHash() {
                                    return sIPMessage.getCallId().getCallId();
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                    } catch (Exception e10) {
                                        if (UDPMessageChannel.logger.isLoggingEnabled(4)) {
                                            UDPMessageChannel.logger.logError("Error self routing message cause by: ", e10);
                                        }
                                    }
                                }
                            });
                            StackLogger stackLogger2 = logger;
                            if (stackLogger2.isLoggingEnabled(32)) {
                                stackLogger2.logDebug("Self routing message");
                            }
                            if (stackLogger2.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                                logMessage(sIPMessage, this.peerAddress, this.peerPort, currentTimeMillis);
                                return;
                            } else if (!stackLogger2.isLoggingEnabled(32)) {
                                return;
                            } else {
                                stackLogger2.logDebug("Sent EMPTY Message");
                                return;
                            }
                        }
                    }
                }
                sendMessage(sIPMessage.encodeAsBytes(getTransport()), this.peerAddress, this.peerPort, this.peerProtocol, sIPMessage instanceof SIPRequest);
                sIPMessage.setRemoteAddress(this.peerAddress);
                sIPMessage.setRemotePort(this.peerPort);
                sIPMessage.setLocalPort(getPort());
                sIPMessage.setLocalAddress(getMessageProcessor().getIpAddress());
                StackLogger stackLogger3 = logger;
                if (stackLogger3.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                    logMessage(sIPMessage, this.peerAddress, this.peerPort, currentTimeMillis);
                } else if (stackLogger3.isLoggingEnabled(32)) {
                    stackLogger3.logDebug("Sent EMPTY Message");
                }
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                logger.logError("An exception occured while sending message", e11);
                throw new IOException("An exception occured while sending message");
            }
        } catch (Throwable th2) {
            StackLogger stackLogger4 = logger;
            if (stackLogger4.isLoggingEnabled(16) && !sIPMessage.isNullRequest()) {
                logMessage(sIPMessage, this.peerAddress, this.peerPort, currentTimeMillis);
            } else if (stackLogger4.isLoggingEnabled(32)) {
                stackLogger4.logDebug("Sent EMPTY Message");
            }
            throw th2;
        }
    }

    public UDPMessageChannel(SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor, DatagramPacket datagramPacket) {
        this.mythread = null;
        this.incomingPacket = datagramPacket;
        this.messageProcessor = uDPMessageProcessor;
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(this.sipStack);
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        Thread thread = new Thread(this);
        this.mythread = thread;
        thread.setDaemon(true);
        this.mythread.start();
    }

    public UDPMessageChannel(InetAddress inetAddress, int i10, SIPTransactionStack sIPTransactionStack, UDPMessageProcessor uDPMessageProcessor) {
        this.mythread = null;
        this.peerAddress = inetAddress;
        this.peerPort = i10;
        this.peerProtocol = "UDP";
        this.messageProcessor = uDPMessageProcessor;
        this.myAddress = uDPMessageProcessor.getIpAddress().getHostAddress();
        this.myPort = uDPMessageProcessor.getPort();
        this.sipStack = sIPTransactionStack;
        this.myParser = sIPTransactionStack.getMessageParserFactory().createMessageParser(sIPTransactionStack);
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("Creating message channel " + inetAddress.getHostAddress() + Separators.SLASH + i10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.MessageChannel
    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        boolean z11;
        DatagramSocket datagramSocket;
        StackLogger stackLogger = logger;
        if (stackLogger.isLoggingEnabled(16) && this.sipStack.isLogStackTraceOnMessageSend()) {
            stackLogger.logStackTrace(16);
        }
        if (i10 == -1) {
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug(getClass().getName().concat(":sendMessage: Dropping reply!"));
            }
            throw new IOException("Receiver port not set ");
        }
        if (stackLogger.isLoggingEnabled(32)) {
            stackLogger.logDebug("sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i10 + "\nmessageSize =  " + bArr.length + " message = " + new String(bArr));
            stackLogger.logDebug("*******************\n");
        }
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i10);
        try {
            if (this.sipStack.udpFlag) {
                datagramSocket = ((UDPMessageProcessor) this.messageProcessor).sock;
                z11 = false;
            } else {
                datagramSocket = new DatagramSocket();
                z11 = true;
            }
            datagramSocket.send(datagramPacket);
            if (!z11) {
                return;
            }
            datagramSocket.close();
        } catch (IOException e10) {
            throw e10;
        } catch (Exception e11) {
            InternalErrorHandler.handleException(e11);
        }
    }

    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, String str, boolean z10) {
        DatagramSocket datagramSocket;
        if (i10 == -1) {
            StackLogger stackLogger = logger;
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug(getClass().getName().concat(":sendMessage: Dropping reply!"));
            }
            throw new IOException("Receiver port not set ");
        }
        StackLogger stackLogger2 = logger;
        if (stackLogger2.isLoggingEnabled(32)) {
            stackLogger2.logDebug(":sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i10 + "\n messageSize = " + bArr.length);
        }
        if (str.compareToIgnoreCase("UDP") == 0) {
            DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i10);
            try {
                SIPTransactionStack sIPTransactionStack = this.sipStack;
                if (sIPTransactionStack.udpFlag) {
                    datagramSocket = ((UDPMessageProcessor) this.messageProcessor).sock;
                } else {
                    datagramSocket = sIPTransactionStack.getNetworkLayer().createDatagramSocket();
                }
                if (stackLogger2.isLoggingEnabled(32)) {
                    stackLogger2.logDebug("sendMessage " + inetAddress.getHostAddress() + Separators.SLASH + i10 + Separators.RETURN + new String(bArr));
                }
                datagramSocket.send(datagramPacket);
                if (this.sipStack.udpFlag) {
                    return;
                }
                datagramSocket.close();
                return;
            } catch (IOException e10) {
                throw e10;
            } catch (Exception e11) {
                InternalErrorHandler.handleException(e11);
                return;
            }
        }
        OutputStream outputStream = this.sipStack.ioHandler.sendBytes(this.messageProcessor.getIpAddress(), inetAddress, i10, ParameterNames.TCP, bArr, z10, this).getOutputStream();
        outputStream.write(bArr, 0, bArr.length);
        outputStream.flush();
    }
}
