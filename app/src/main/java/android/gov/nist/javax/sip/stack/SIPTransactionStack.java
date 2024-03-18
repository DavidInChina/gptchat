package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.core.ServerLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.core.a;
import android.gov.nist.core.net.AddressResolver;
import android.gov.nist.core.net.DefaultNetworkLayer;
import android.gov.nist.core.net.NetworkLayer;
import android.gov.nist.core.net.SecurityManagerProvider;
import android.gov.nist.javax.sip.DefaultAddressResolver;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.LogRecordFactory;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipListenerExt;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.ThreadAffinityExecutor;
import android.gov.nist.javax.sip.TransactionExt;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.MessageParserFactory;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.b;
import android.javax.sip.d;
import android.javax.sip.e;
import android.javax.sip.m;
import android.javax.sip.p;
import android.javax.sip.v;
import b.AbstractC2092b;
import b.AbstractC2093c;
import c.AbstractC2255j;
import com.statsig.androidsdk.ErrorBoundaryKt;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class SIPTransactionStack implements SIPTransactionEventListener, SIPDialogEventListener {
    public static final int BASE_TIMER_INTERVAL = 500;
    protected static final Set<String> dialogCreatingMethods;
    protected static ScheduledExecutorService selfRoutingThreadpoolExecutor;
    private AtomicInteger activeClientTransactionCount;
    protected AddressResolver addressResolver;
    protected boolean cacheClientConnections;
    protected boolean cacheServerConnections;
    protected boolean cancelClientTransactionChecked;
    protected boolean checkBranchId;
    protected ClientAuthType clientAuth;
    protected ConcurrentHashMap<String, SIPClientTransaction> clientTransactionTable;
    protected int clientTransactionTableHiwaterMark;
    protected int clientTransactionTableLowaterMark;
    protected int connTimeout;
    protected DefaultRouter defaultRouter;
    protected boolean deliverRetransmittedAckToListener;
    private boolean deliverTerminatedEventForAck;
    private boolean deliverUnsolicitedNotify;
    protected ConcurrentHashMap<String, SIPDialog> dialogTable;
    protected int dialogTimeoutFactor;
    protected ConcurrentHashMap<String, SIPDialog> earlyDialogTable;
    protected int earlyDialogTimeout;
    private ConcurrentHashMap<String, SIPClientTransaction> forkedClientTransactionTable;
    protected HashSet<String> forkedEvents;
    protected boolean generateTimeStampHeader;
    protected IOHandler ioHandler;
    protected boolean isAutomaticDialogErrorHandlingEnabled;
    protected boolean isAutomaticDialogSupportEnabled;
    protected boolean isBackToBackUserAgent;
    protected boolean isDialogTerminatedEventDeliveredForNullDialog;
    protected LogRecordFactory logRecordFactory;
    protected boolean logStackTraceOnMessageSend;
    protected int maxConnections;
    protected int maxContentLength;
    protected int maxForkTime;
    protected int maxListenerResponseTime;
    protected int maxMessageSize;
    protected int maxTxLifetimeInvite;
    protected int maxTxLifetimeNonInvite;
    private ConcurrentHashMap<String, SIPServerTransaction> mergeTable;
    public MessageParserFactory messageParserFactory;
    public MessageProcessorFactory messageProcessorFactory;
    private Collection<MessageProcessor> messageProcessors;
    protected long minKeepAliveInterval;
    protected boolean needsLogging;
    protected NetworkLayer networkLayer;
    public NIOMode nioMode;
    public long nioSocketMaxIdleTime;
    private boolean non2XXAckPassedToListener;
    protected String outboundProxy;
    protected boolean patchReceivedRport;
    protected boolean patchRport;
    protected boolean patchWebSocketHeaders;
    private ConcurrentHashMap<String, SIPServerTransaction> pendingTransactions;
    protected int readTimeout;
    protected int receiveUdpBufferSize;
    private ExecutorService reinviteExecutor;
    private ReleaseReferencesStrategy releaseReferencesStrategy;
    protected int reliableConnectionKeepAliveTimeout;
    protected boolean remoteTagReassignmentAllowed;
    protected ConcurrentHashMap<String, SIPServerTransaction> retransmissionAlertTransactions;
    protected boolean rfc2543Supported;
    protected AbstractC2093c router;
    protected String routerPath;
    protected SecurityManagerProvider securityManagerProvider;
    protected int sendUdpBufferSize;
    protected ConcurrentHashMap<String, SIPDialog> serverDialogMergeTestTable;
    protected ServerLogger serverLogger;
    protected ConcurrentHashMap<String, SIPServerTransaction> serverTransactionTable;
    protected int serverTransactionTableHighwaterMark;
    protected int serverTransactionTableLowaterMark;
    public SIPEventInterceptor sipEventInterceptor;
    protected StackMessageFactory sipMessageFactory;
    public List<SIPMessageValve> sipMessageValves;
    private long sslHandshakeTimeout;
    private boolean sslRenegotiationEnabled;
    protected String stackAddress;
    private int stackCongestionControlTimeout;
    protected InetAddress stackInetAddress;
    protected String stackName;
    private int tcpPostParsingThreadPoolSize;
    private ConcurrentHashMap<String, SIPServerTransaction> terminatedServerTransactionsPendingAck;
    protected ThreadAuditor threadAuditor;
    protected int threadPoolSize;
    private int threadPriority;
    private SipTimer timer;
    protected boolean toExit;
    boolean udpFlag;
    protected boolean unlimitedClientTransactionTableSize;
    protected boolean unlimitedServerTransactionTableSize;
    protected boolean useRouterForAll;
    private static StackLogger logger = CommonLogger.getLogger(SIPTransactionStack.class);
    private static int connectionLingerTimer = 8;

    /* loaded from: classes2.dex */
    public class PingTimer extends SIPStackTimerTask {
        ThreadAuditor.ThreadHandle threadHandle;

        public PingTimer(ThreadAuditor.ThreadHandle threadHandle) {
            this.threadHandle = threadHandle;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPTransactionStack.this.getTimer() != null) {
                if (this.threadHandle == null && SIPTransactionStack.this.getThreadAuditor() != null) {
                    this.threadHandle = SIPTransactionStack.this.getThreadAuditor().addCurrentThread();
                }
                this.threadHandle.ping();
                SIPTransactionStack.this.getTimer().schedule(new PingTimer(this.threadHandle), this.threadHandle.getPingIntervalInMillisecs());
            }
        }
    }

    /* loaded from: classes.dex */
    public class RemoveForkedTransactionTimerTask extends SIPStackTimerTask {
        private final String forkId;

        public RemoveForkedTransactionTimerTask(String str) {
            this.forkId = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPTransactionStack.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = SIPTransactionStack.logger;
                stackLogger.logDebug("Removing forked client transaction : forkId = " + this.forkId);
            }
            SIPTransactionStack.this.forkedClientTransactionTable.remove(this.forkId);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        dialogCreatingMethods = hashSet;
        hashSet.add("REFER");
        hashSet.add(TokenNames.INVITE);
        hashSet.add(TokenNames.SUBSCRIBE);
    }

    public SIPTransactionStack() {
        this.earlyDialogTimeout = 180;
        this.unlimitedServerTransactionTableSize = true;
        this.unlimitedClientTransactionTableSize = true;
        this.serverTransactionTableHighwaterMark = 5000;
        this.serverTransactionTableLowaterMark = 4000;
        this.clientTransactionTableHiwaterMark = 1000;
        this.clientTransactionTableLowaterMark = 800;
        this.activeClientTransactionCount = new AtomicInteger(0);
        this.deliverRetransmittedAckToListener = false;
        this.connTimeout = ErrorBoundaryKt.SAMPLING_RATE;
        this.rfc2543Supported = true;
        this.threadAuditor = null;
        this.cancelClientTransactionChecked = true;
        this.remoteTagReassignmentAllowed = true;
        this.logStackTraceOnMessageSend = true;
        this.stackCongestionControlTimeout = 0;
        this.isBackToBackUserAgent = false;
        this.isAutomaticDialogErrorHandlingEnabled = true;
        this.isDialogTerminatedEventDeliveredForNullDialog = false;
        this.maxForkTime = 0;
        this.deliverUnsolicitedNotify = false;
        this.deliverTerminatedEventForAck = false;
        this.patchWebSocketHeaders = false;
        this.patchRport = false;
        this.patchReceivedRport = false;
        this.clientAuth = ClientAuthType.Default;
        this.tcpPostParsingThreadPoolSize = 0;
        this.minKeepAliveInterval = -1L;
        this.dialogTimeoutFactor = 64;
        this.nioMode = NIOMode.BLOCKING;
        this.releaseReferencesStrategy = ReleaseReferencesStrategy.None;
        this.threadPriority = 10;
        this.reliableConnectionKeepAliveTimeout = -1;
        this.sslHandshakeTimeout = -1L;
        this.sslRenegotiationEnabled = false;
        this.reinviteExecutor = Executors.newCachedThreadPool(new ThreadFactory() { // from class: android.gov.nist.javax.sip.stack.SIPTransactionStack.1
            private int threadCount = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                int i10 = this.threadCount;
                this.threadCount = i10 + 1;
                return new Thread(runnable, String.format("%s-%d", "ReInviteSender", Integer.valueOf(i10)));
            }
        });
        this.toExit = false;
        this.forkedEvents = new HashSet<>();
        this.threadPoolSize = -1;
        this.cacheServerConnections = true;
        this.cacheClientConnections = true;
        this.maxConnections = -1;
        this.messageProcessors = new CopyOnWriteArrayList();
        this.ioHandler = new IOHandler(this);
        this.readTimeout = -1;
        this.maxListenerResponseTime = -1;
        this.addressResolver = new DefaultAddressResolver();
        this.sipMessageValves = new ArrayList();
        this.dialogTable = new ConcurrentHashMap<>();
        this.earlyDialogTable = new ConcurrentHashMap<>();
        this.serverDialogMergeTestTable = new ConcurrentHashMap<>();
        this.clientTransactionTable = new ConcurrentHashMap<>();
        this.serverTransactionTable = new ConcurrentHashMap<>();
        this.terminatedServerTransactionsPendingAck = new ConcurrentHashMap<>();
        this.mergeTable = new ConcurrentHashMap<>();
        this.retransmissionAlertTransactions = new ConcurrentHashMap<>();
        this.pendingTransactions = new ConcurrentHashMap<>();
        this.forkedClientTransactionTable = new ConcurrentHashMap<>();
    }

    private void addTransactionHash(SIPTransaction sIPTransaction) {
        SIPServerTransaction sIPServerTransaction;
        SIPRequest originalRequest = sIPTransaction.getOriginalRequest();
        if (sIPTransaction instanceof SIPClientTransaction) {
            if (!this.unlimitedClientTransactionTableSize) {
                if (this.activeClientTransactionCount.get() > this.clientTransactionTableHiwaterMark) {
                    try {
                        synchronized (this.clientTransactionTable) {
                            this.clientTransactionTable.wait();
                            this.activeClientTransactionCount.incrementAndGet();
                        }
                    } catch (Exception e10) {
                        if (logger.isLoggingEnabled()) {
                            logger.logError("Exception occured while waiting for room", e10);
                        }
                    }
                }
            } else {
                this.activeClientTransactionCount.incrementAndGet();
            }
            String transactionId = originalRequest.getTransactionId();
            sIPServerTransaction = this.clientTransactionTable.putIfAbsent(transactionId, (SIPClientTransaction) sIPTransaction);
            if (logger.isLoggingEnabled(32)) {
                a.w(" putTransactionHash :  key = ", transactionId, logger);
            }
        } else {
            String transactionId2 = originalRequest.getTransactionId();
            if (logger.isLoggingEnabled(32)) {
                a.w(" putTransactionHash :  key = ", transactionId2, logger);
            }
            sIPServerTransaction = this.serverTransactionTable.putIfAbsent(transactionId2, (SIPServerTransaction) sIPTransaction);
        }
        if (sIPServerTransaction == null) {
            sIPTransaction.scheduleMaxTxLifeTimeTimer();
        }
    }

    private String auditDialogs(Set set, long j6) {
        LinkedList linkedList;
        AbstractC2255j abstractC2255j;
        String str;
        String str2 = "  Leaked dialogs:\n";
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.dialogTable) {
            linkedList = new LinkedList(this.dialogTable.values());
        }
        Iterator it = linkedList.iterator();
        int i10 = 0;
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            SIPDialog sIPDialog = (SIPDialog) it.next();
            if (sIPDialog != null) {
                abstractC2255j = sIPDialog.getCallId();
            } else {
                abstractC2255j = null;
            }
            if (abstractC2255j != null) {
                str3 = abstractC2255j.getCallId();
            }
            if (sIPDialog != null && str3 != null && !set.contains(str3)) {
                long j10 = sIPDialog.auditTag;
                if (j10 == 0) {
                    sIPDialog.auditTag = currentTimeMillis;
                } else if (currentTimeMillis - j10 >= j6) {
                    i10++;
                    d state = sIPDialog.getState();
                    StringBuilder sb2 = new StringBuilder("dialog id: ");
                    sb2.append(sIPDialog.getDialogId());
                    sb2.append(", dialog state: ");
                    if (state != null) {
                        str = state.toString();
                    } else {
                        str = "null";
                    }
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    str2 = str2 + "    " + sb3 + Separators.RETURN;
                    sIPDialog.setState(3);
                    if (logger.isLoggingEnabled(32)) {
                        a.w("auditDialogs: leaked ", sb3, logger);
                    }
                }
            }
        }
        if (i10 <= 0) {
            return null;
        }
        StringBuilder r10 = a.r(str2, "    Total: ");
        r10.append(Integer.toString(i10));
        r10.append(" leaked dialogs detected and removed.\n");
        return r10.toString();
    }

    private String auditTransactions(ConcurrentHashMap concurrentHashMap, long j6) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = new LinkedList(concurrentHashMap.values()).iterator();
        String str2 = "  Leaked transactions:\n";
        int i10 = 0;
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            SIPTransaction sIPTransaction = (SIPTransaction) it.next();
            if (sIPTransaction != null) {
                if (sIPTransaction.getAuditTag() == 0) {
                    sIPTransaction.setAuditTag(currentTimeMillis);
                } else if (currentTimeMillis - sIPTransaction.getAuditTag() >= j6) {
                    i10++;
                    v state = sIPTransaction.getState();
                    SIPRequest originalRequest = sIPTransaction.getOriginalRequest();
                    if (originalRequest != null) {
                        str3 = originalRequest.getMethod();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(sIPTransaction.getClass().getName());
                    sb2.append(", state: ");
                    if (state == null) {
                        str = "null";
                    } else {
                        str = state.toString();
                    }
                    sb2.append(str);
                    sb2.append(", OR: ");
                    if (str3 == null) {
                        str3 = "null";
                    }
                    sb2.append(str3);
                    String sb3 = sb2.toString();
                    str2 = str2 + "    " + sb3 + Separators.RETURN;
                    removeTransaction(sIPTransaction);
                    if (logger.isLoggingEnabled(32)) {
                        a.w("auditTransactions: leaked ", sb3, logger);
                    }
                }
            }
        }
        if (i10 <= 0) {
            return null;
        }
        StringBuilder r10 = a.r(str2, "    Total: ");
        r10.append(Integer.toString(i10));
        r10.append(" leaked transactions detected and removed.\n");
        return r10.toString();
    }

    private MessageProcessor findMessageProcessor(String str, int i10, String str2) {
        MessageProcessor[] messageProcessors;
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            if (messageProcessor.getTransport().equalsIgnoreCase(str2) && messageProcessor.getSavedIpAddress().equals(str) && messageProcessor.getPort() == i10) {
                return messageProcessor;
            }
        }
        return null;
    }

    public static boolean isDialogCreated(String str) {
        return dialogCreatingMethods.contains(str);
    }

    public void addExtensionMethod(String str) {
        if (str.equals(TokenNames.NOTIFY)) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("NOTIFY Supported Natively");
                return;
            }
            return;
        }
        dialogCreatingMethods.add(Utils.toUpperCase(str.trim()));
    }

    public void addForkedClientTransaction(SIPClientTransaction sIPClientTransaction) {
        String forkId = ((SIPRequest) sIPClientTransaction.getRequest()).getForkId();
        sIPClientTransaction.setForkId(forkId);
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Adding forked client transaction : " + sIPClientTransaction + " branch=" + sIPClientTransaction.getBranch() + " forkId = " + forkId + "  sipDialog = " + sIPClientTransaction.getDefaultDialog() + " sipDialogId= " + sIPClientTransaction.getDefaultDialog().getDialogId());
        }
        this.forkedClientTransactionTable.put(forkId, sIPClientTransaction);
    }

    public void addMessageProcessor(MessageProcessor messageProcessor) {
        this.messageProcessors.add(messageProcessor);
    }

    public void addTransaction(SIPClientTransaction sIPClientTransaction) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("added transaction " + sIPClientTransaction);
        }
        addTransactionHash(sIPClientTransaction);
    }

    public void addTransactionPendingAck(SIPServerTransaction sIPServerTransaction) {
        String branch = ((SIPRequest) sIPServerTransaction.getRequest()).getTopmostVia().getBranch();
        if (branch != null) {
            this.terminatedServerTransactionsPendingAck.put(branch, sIPServerTransaction);
        }
    }

    public String auditStack(Set set, long j6, long j10) {
        String auditDialogs = auditDialogs(set, j6);
        String auditTransactions = auditTransactions(this.serverTransactionTable, j10);
        String auditTransactions2 = auditTransactions(this.clientTransactionTable, j10);
        if (auditDialogs == null && auditTransactions == null && auditTransactions2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("SIP Stack Audit:\n");
        if (auditDialogs == null) {
            auditDialogs = "";
        }
        sb2.append(auditDialogs);
        if (auditTransactions == null) {
            auditTransactions = "";
        }
        sb2.append(auditTransactions);
        if (auditTransactions2 == null) {
            auditTransactions2 = "";
        }
        sb2.append(auditTransactions2);
        return sb2.toString();
    }

    public boolean checkBranchId() {
        return this.checkBranchId;
    }

    public void closeAllSockets() {
        this.ioHandler.closeAll();
        for (MessageProcessor messageProcessor : this.messageProcessors) {
            if (messageProcessor instanceof NioTcpMessageProcessor) {
                ((NioTcpMessageProcessor) messageProcessor).nioHandler.closeAll();
            }
        }
    }

    public boolean closeReliableConnection(String str, int i10, String str2, String str3, int i11) {
        MessageProcessor findMessageProcessor = findMessageProcessor(str, i10, str2);
        if (findMessageProcessor != null && (findMessageProcessor instanceof ConnectionOrientedMessageProcessor)) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                StringBuilder sb2 = new StringBuilder("~~~ closeReliableConnection( myAddress=");
                sb2.append(str);
                sb2.append(", myPort=");
                sb2.append(i10);
                sb2.append(", transport=");
                a.y(sb2, str2, ", peerAddress=", str3, ", peerPort=");
                sb2.append(i11);
                sb2.append("), MessageProcessor=");
                sb2.append(findMessageProcessor);
                stackLogger.logDebug(sb2.toString());
            }
            return ((ConnectionOrientedMessageProcessor) findMessageProcessor).closeReliableConnection(str3, i11);
        }
        return false;
    }

    public SIPClientTransaction createClientTransaction(SIPRequest sIPRequest, MessageChannel messageChannel) {
        SIPClientTransactionImpl sIPClientTransactionImpl = new SIPClientTransactionImpl(this, messageChannel);
        sIPClientTransactionImpl.setOriginalRequest(sIPRequest);
        return sIPClientTransactionImpl;
    }

    public SIPDialog createDialog(SIPTransaction sIPTransaction) {
        if (sIPTransaction instanceof SIPClientTransaction) {
            String dialogId = ((SIPRequest) sIPTransaction.getRequest()).getDialogId(false);
            if (logger.isLoggingEnabled(32)) {
                a.w("createDialog dialogId=", dialogId, logger);
            }
            if (this.earlyDialogTable.get(dialogId) != null) {
                SIPDialog sIPDialog = this.earlyDialogTable.get(dialogId);
                if (sIPDialog.getState() != null && sIPDialog.getState() != d.f24327h0) {
                    SIPDialog sIPDialog2 = new SIPDialog(sIPTransaction);
                    this.earlyDialogTable.put(dialogId, sIPDialog2);
                    return sIPDialog2;
                } else if (!logger.isLoggingEnabled(32)) {
                    return sIPDialog;
                } else {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("createDialog early Dialog found : earlyDialogId=" + dialogId + " earlyDialog= " + sIPDialog);
                    return sIPDialog;
                }
            }
            SIPDialog sIPDialog3 = new SIPDialog(sIPTransaction);
            this.earlyDialogTable.put(dialogId, sIPDialog3);
            if (!logger.isLoggingEnabled(32)) {
                return sIPDialog3;
            }
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("createDialog early Dialog not found : earlyDialogId=" + dialogId + " created one " + sIPDialog3);
            return sIPDialog3;
        }
        return new SIPDialog(sIPTransaction);
    }

    public MessageChannel createMessageChannel(SIPRequest sIPRequest, MessageProcessor messageProcessor, AbstractC2092b abstractC2092b) {
        Host host = new Host();
        host.setHostname(abstractC2092b.getHost());
        HostPort hostPort = new HostPort();
        hostPort.setHost(host);
        hostPort.setPort(abstractC2092b.getPort());
        return messageProcessor.createMessageChannel(hostPort);
    }

    public MessageProcessor createMessageProcessor(InetAddress inetAddress, int i10, String str) {
        MessageProcessor createMessageProcessor = this.messageProcessorFactory.createMessageProcessor(this, inetAddress, i10, str);
        addMessageProcessor(createMessageProcessor);
        return createMessageProcessor;
    }

    public MessageChannel createRawMessageChannel(String str, int i10, AbstractC2092b abstractC2092b) {
        Host host = new Host();
        host.setHostname(abstractC2092b.getHost());
        HostPort hostPort = new HostPort();
        hostPort.setHost(host);
        hostPort.setPort(abstractC2092b.getPort());
        Iterator<MessageProcessor> it = this.messageProcessors.iterator();
        MessageChannel messageChannel = null;
        while (it.hasNext() && messageChannel == null) {
            MessageProcessor next = it.next();
            if (abstractC2092b.getTransport().equalsIgnoreCase(next.getTransport()) && str.equals(next.getIpAddress().getHostAddress()) && i10 == next.getPort()) {
                try {
                    messageChannel = next.createMessageChannel(hostPort);
                } catch (UnknownHostException e10) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger = logger;
                        stackLogger.logDebug("host is not known " + hostPort + Separators.SP + e10.getMessage());
                    }
                    throw e10;
                } catch (IOException e11) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("host is reachable " + hostPort + Separators.SP + e11.getMessage());
                    }
                }
            }
        }
        if (messageChannel == null && logger.isLoggingEnabled(32)) {
            StackLogger stackLogger3 = logger;
            stackLogger3.logDebug("newChanne is null, messageProcessors.size = " + this.messageProcessors.size());
            Iterator<MessageProcessor> it2 = this.messageProcessors.iterator();
            while (it2.hasNext() && messageChannel == null) {
                MessageProcessor next2 = it2.next();
                StackLogger stackLogger4 = logger;
                stackLogger4.logDebug("nextProcessor:" + next2 + "| transport = " + next2.getTransport() + " ipAddress=" + next2.getIpAddress() + " port=" + next2.getPort());
            }
            logger.logDebug("More info on newChannel=null");
            StackLogger stackLogger5 = logger;
            stackLogger5.logDebug("nextHop=" + abstractC2092b + " sourceIp=" + str + " sourcePort=" + i10 + " targetHostPort=" + hostPort);
        }
        return messageChannel;
    }

    public SIPServerTransaction createServerTransaction(MessageChannel messageChannel) {
        if (this.unlimitedServerTransactionTableSize) {
            return new SIPServerTransactionImpl(this, messageChannel);
        }
        int size = this.serverTransactionTable.size();
        int i10 = this.serverTransactionTableLowaterMark;
        if (Math.random() > 1.0d - ((size - i10) / (this.serverTransactionTableHighwaterMark - i10))) {
            return null;
        }
        return new SIPServerTransactionImpl(this, messageChannel);
    }

    public void decrementActiveClientTransactionCount() {
        if (this.activeClientTransactionCount.decrementAndGet() <= this.clientTransactionTableLowaterMark && !this.unlimitedClientTransactionTableSize) {
            synchronized (this.clientTransactionTable) {
                this.clientTransactionTable.notify();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPDialogEventListener
    public synchronized void dialogErrorEvent(SIPDialogErrorEvent sIPDialogErrorEvent) {
        SIPDialog sIPDialog = (SIPDialog) sIPDialogErrorEvent.getSource();
        p sipListener = ((SipStackImpl) this).getSipListener();
        if (sIPDialog != null && !(sipListener instanceof SipListenerExt)) {
            sIPDialog.delete();
        }
    }

    public void disableLogging() {
        logger.disableLogging();
    }

    public void enableLogging() {
        logger.enableLogging();
    }

    public SIPTransaction findCancelTransaction(SIPRequest sIPRequest, boolean z10) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("findCancelTransaction request= \n" + sIPRequest + "\nfindCancelRequest isServer=" + z10);
        }
        if (z10) {
            for (SIPServerTransaction sIPServerTransaction : this.serverTransactionTable.values()) {
                if (sIPServerTransaction.doesCancelMatchTransaction(sIPRequest)) {
                    return sIPServerTransaction;
                }
            }
        } else {
            for (SIPClientTransaction sIPClientTransaction : this.clientTransactionTable.values()) {
                if (sIPClientTransaction.doesCancelMatchTransaction(sIPRequest)) {
                    return sIPClientTransaction;
                }
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Could not find transaction for cancel request");
            return null;
        }
        return null;
    }

    public boolean findMergedTransaction(SIPRequest sIPRequest) {
        String mergeId;
        if (sIPRequest.getMethod().equals(TokenNames.INVITE) && (mergeId = sIPRequest.getMergeId()) != null) {
            SIPServerTransaction sIPServerTransaction = this.mergeTable.get(mergeId);
            if (sIPServerTransaction != null && !sIPServerTransaction.isMessagePartOfTransaction(sIPRequest)) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Mathcing merged transaction for merge id " + mergeId + " with " + sIPServerTransaction);
                }
                return true;
            }
            SIPDialog sIPDialog = this.serverDialogMergeTestTable.get(mergeId);
            if (sIPDialog != null && sIPDialog.firstTransactionIsServerTransaction && sIPDialog.getState() == d.f24328i0) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Mathcing merged dialog for merge id " + mergeId + " with " + sIPDialog);
                }
                return true;
            }
        }
        return false;
    }

    public SIPServerTransaction findPendingTransaction(String str) {
        if (logger.isLoggingEnabled(32)) {
            a.w("looking for pending tx for :", str, logger);
        }
        return this.pendingTransactions.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SIPClientTransaction findSubscribeTransaction(SIPRequest sIPRequest, ListeningPointImpl listeningPointImpl) {
        SIPClientTransaction sIPClientTransaction = null;
        try {
            String dialogId = sIPRequest.getDialogId(true);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("ct table size = " + this.clientTransactionTable.size());
            }
            String tag = sIPRequest.getTo().getTag();
            if (tag == null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("findSubscribeTransaction : returning null");
                }
                return null;
            }
            Event event = (Event) sIPRequest.getHeader(SIPHeaderNames.EVENT);
            if (event == null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("event Header is null -- returning null");
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("findSubscribeTransaction : returning null");
                }
                return null;
            }
            for (SIPClientTransaction sIPClientTransaction2 : this.clientTransactionTable.values()) {
                if (sIPClientTransaction2.getMethod().equals(TokenNames.SUBSCRIBE)) {
                    String originalRequestFromTag = sIPClientTransaction2.getOriginalRequestFromTag();
                    Event originalRequestEvent = sIPClientTransaction2.getOriginalRequestEvent();
                    if (originalRequestEvent != null) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger2 = logger;
                            stackLogger2.logDebug("ct.fromTag = " + originalRequestFromTag);
                            StackLogger stackLogger3 = logger;
                            stackLogger3.logDebug("thisToTag = " + tag);
                            StackLogger stackLogger4 = logger;
                            stackLogger4.logDebug("hisEvent = " + originalRequestEvent);
                            StackLogger stackLogger5 = logger;
                            stackLogger5.logDebug("eventHdr " + event);
                            StackLogger stackLogger6 = logger;
                            stackLogger6.logDebug("ct.req.contact = " + sIPClientTransaction2.getOriginalRequestContact());
                            if (sIPClientTransaction2.getOriginalRequest() != null) {
                                StackLogger stackLogger7 = logger;
                                stackLogger7.logDebug("ct.req.reqURI = " + sIPClientTransaction2.getOriginalRequest().getRequestURI());
                            }
                            StackLogger stackLogger8 = logger;
                            stackLogger8.logDebug("msg.Contact= " + sIPRequest.getContactHeader());
                            StackLogger stackLogger9 = logger;
                            stackLogger9.logDebug("msg.reqURI " + sIPRequest.getRequestURI());
                        }
                        if (originalRequestFromTag.equalsIgnoreCase(tag) && event.match(originalRequestEvent) && sIPRequest.getCallId().getCallId().equalsIgnoreCase(sIPClientTransaction2.getOriginalRequestCallId())) {
                            if (!isDeliverUnsolicitedNotify()) {
                                sIPClientTransaction2.acquireSem();
                            }
                            if (sIPClientTransaction == null) {
                                sIPClientTransaction = sIPClientTransaction2;
                            }
                            if (sIPClientTransaction2.getOriginalRequest() != null && sIPRequest.getRequestURI().equals(sIPClientTransaction2.getOriginalRequest().getContactHeader().getAddress().getURI()) && (sIPClientTransaction2.getDefaultDialog() != null || sIPClientTransaction2.getDialog(dialogId) != null)) {
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger10 = logger;
                                    stackLogger10.logDebug("Tx compl conditions met." + sIPClientTransaction2);
                                }
                                sIPClientTransaction = sIPClientTransaction2;
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger11 = logger;
                                    stackLogger11.logDebug("findSubscribeTransaction : returning " + sIPClientTransaction);
                                }
                                return sIPClientTransaction;
                            }
                        }
                    }
                }
            }
            if (logger.isLoggingEnabled(32)) {
            }
            return sIPClientTransaction;
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger12 = logger;
                stackLogger12.logDebug("findSubscribeTransaction : returning " + ((Object) null));
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SIPTransaction findTransaction(SIPMessage sIPMessage, boolean z10) {
        Throwable th2;
        SIPTransaction sIPTransaction = null;
        try {
            try {
                if (z10) {
                    if (sIPMessage.getTopmostVia().getBranch() != null) {
                        String transactionId = sIPMessage.getTransactionId();
                        SIPTransaction sIPTransaction2 = this.serverTransactionTable.get(transactionId);
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger = logger;
                            stackLogger.logDebug("serverTx: looking for key " + transactionId + " existing=" + this.serverTransactionTable);
                        }
                        if (transactionId.startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger2 = logger;
                                stackLogger2.logDebug("findTransaction: returning  : " + sIPTransaction2);
                            }
                            return sIPTransaction2;
                        }
                        sIPTransaction = sIPTransaction2;
                    }
                    for (SIPServerTransaction sIPServerTransaction : this.serverTransactionTable.values()) {
                        if (sIPServerTransaction.isMessagePartOfTransaction(sIPMessage)) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger3 = logger;
                                stackLogger3.logDebug("findTransaction: returning  : " + sIPServerTransaction);
                            }
                            return sIPServerTransaction;
                        }
                    }
                } else {
                    if (sIPMessage.getTopmostVia().getBranch() != null) {
                        String transactionId2 = sIPMessage.getTransactionId();
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger4 = logger;
                            stackLogger4.logDebug("clientTx: looking for key " + transactionId2);
                        }
                        SIPTransaction sIPTransaction3 = this.clientTransactionTable.get(transactionId2);
                        if (transactionId2.startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger5 = logger;
                                stackLogger5.logDebug("findTransaction: returning  : " + sIPTransaction3);
                            }
                            return sIPTransaction3;
                        }
                        sIPTransaction = sIPTransaction3;
                    }
                    for (SIPClientTransaction sIPClientTransaction : this.clientTransactionTable.values()) {
                        if (sIPClientTransaction.isMessagePartOfTransaction(sIPMessage)) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger6 = logger;
                                stackLogger6.logDebug("findTransaction: returning  : " + sIPClientTransaction);
                            }
                            return sIPClientTransaction;
                        }
                    }
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger7 = logger;
                    stackLogger7.logDebug("findTransaction: returning  : " + sIPTransaction);
                }
                return sIPTransaction;
            } catch (Throwable th3) {
                th2 = th3;
                sIPTransaction = "clientTx: looking for key ";
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger8 = logger;
                    stackLogger8.logDebug("findTransaction: returning  : " + sIPTransaction);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            if (logger.isLoggingEnabled(32)) {
            }
            throw th2;
        }
    }

    public SIPServerTransaction findTransactionPendingAck(SIPRequest sIPRequest) {
        return this.terminatedServerTransactionsPendingAck.get(sIPRequest.getTopmostVia().getBranch());
    }

    public int getAckTimeoutFactor() {
        if (getSipListener() != null && (getSipListener() instanceof SipListenerExt)) {
            return this.dialogTimeoutFactor;
        }
        return 64;
    }

    public int getActiveClientTransactionCount() {
        return this.activeClientTransactionCount.get();
    }

    public AddressResolver getAddressResolver() {
        return this.addressResolver;
    }

    public ClientAuthType getClientAuth() {
        return this.clientAuth;
    }

    public int getClientTransactionTableSize() {
        return this.clientTransactionTable.size();
    }

    public int getConnectionLingerTimer() {
        return connectionLingerTimer;
    }

    public SIPDialog getDialog(String str) {
        SIPDialog sIPDialog = this.dialogTable.get(str);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("getDialog(" + str + ") : returning " + sIPDialog);
        }
        return sIPDialog;
    }

    public Collection<b> getDialogs() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.dialogTable.values());
        hashSet.addAll(this.earlyDialogTable.values());
        return hashSet;
    }

    public SIPDialog getEarlyDialog(String str) {
        SIPDialog sIPDialog = this.earlyDialogTable.get(str);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("getEarlyDialog(" + str + ") : returning " + sIPDialog);
        }
        return sIPDialog;
    }

    public int getEarlyDialogTimeout() {
        return this.earlyDialogTimeout;
    }

    public SIPClientTransaction getForkedTransaction(String str) {
        return this.forkedClientTransactionTable.get(str);
    }

    public String getHostAddress() {
        return this.stackAddress;
    }

    public b getJoinDialog(JoinHeader joinHeader) {
        String callId = joinHeader.getCallId();
        String fromTag = joinHeader.getFromTag();
        String toTag = joinHeader.getToTag();
        StringBuilder sb2 = new StringBuilder(callId);
        if (toTag != null) {
            sb2.append(":");
            sb2.append(toTag);
        }
        if (fromTag != null) {
            sb2.append(":");
            sb2.append(fromTag);
        }
        return this.dialogTable.get(sb2.toString().toLowerCase());
    }

    public SocketAddress getLocalAddressForTcpDst(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        MessageProcessor[] messageProcessors;
        if (getMessageProcessorFactory() instanceof NioMessageProcessorFactory) {
            for (MessageProcessor messageProcessor : getMessageProcessors()) {
                if ("TCP".equals(messageProcessor.getTransport())) {
                    return ((NioTcpMessageChannel) messageProcessor.createMessageChannel(inetAddress, i10)).socketChannel.socket().getLocalSocketAddress();
                }
            }
            return null;
        }
        return this.ioHandler.getLocalAddressForTcpDst(inetAddress, i10, inetAddress2, i11);
    }

    public SocketAddress getLocalAddressForTlsDst(InetAddress inetAddress, int i10, InetAddress inetAddress2) {
        MessageProcessor[] messageProcessors;
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            if (messageProcessor instanceof TLSMessageProcessor) {
                return this.ioHandler.getLocalAddressForTlsDst(inetAddress, i10, inetAddress2, (TLSMessageChannel) messageProcessor.createMessageChannel(inetAddress, i10));
            } else if (messageProcessor instanceof NioTlsMessageProcessor) {
                return ((NioTlsMessageChannel) messageProcessor.createMessageChannel(inetAddress, i10)).socketChannel.socket().getLocalSocketAddress();
            }
        }
        return null;
    }

    public int getMaxForkTime() {
        return this.maxForkTime;
    }

    public int getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public int getMaxTxLifetimeInvite() {
        return this.maxTxLifetimeInvite;
    }

    public int getMaxTxLifetimeNonInvite() {
        return this.maxTxLifetimeNonInvite;
    }

    public MessageParserFactory getMessageParserFactory() {
        return this.messageParserFactory;
    }

    public MessageProcessorFactory getMessageProcessorFactory() {
        return this.messageProcessorFactory;
    }

    public MessageProcessor[] getMessageProcessors() {
        return (MessageProcessor[]) this.messageProcessors.toArray(new MessageProcessor[0]);
    }

    public long getMinKeepAliveInterval() {
        return this.minKeepAliveInterval;
    }

    public NetworkLayer getNetworkLayer() {
        NetworkLayer networkLayer = this.networkLayer;
        if (networkLayer == null) {
            return DefaultNetworkLayer.SINGLETON;
        }
        return networkLayer;
    }

    public AbstractC2092b getNextHop(SIPRequest sIPRequest) {
        if (this.useRouterForAll) {
            AbstractC2093c abstractC2093c = this.router;
            if (abstractC2093c == null) {
                return null;
            }
            return abstractC2093c.getNextHop(sIPRequest);
        } else if (!sIPRequest.getRequestURI().isSipURI() && sIPRequest.getRouteHeaders() == null) {
            AbstractC2093c abstractC2093c2 = this.router;
            if (abstractC2093c2 == null) {
                return null;
            }
            return abstractC2093c2.getNextHop(sIPRequest);
        } else {
            return this.defaultRouter.getNextHop(sIPRequest);
        }
    }

    public int getReceiveUdpBufferSize() {
        return this.receiveUdpBufferSize;
    }

    public ExecutorService getReinviteExecutor() {
        return this.reinviteExecutor;
    }

    public ReleaseReferencesStrategy getReleaseReferencesStrategy() {
        return this.releaseReferencesStrategy;
    }

    public int getReliableConnectionKeepAliveTimeout() {
        return this.reliableConnectionKeepAliveTimeout;
    }

    public b getReplacesDialog(ReplacesHeader replacesHeader) {
        String callId = replacesHeader.getCallId();
        String fromTag = replacesHeader.getFromTag();
        String toTag = replacesHeader.getToTag();
        for (SIPDialog sIPDialog : this.dialogTable.values()) {
            if (sIPDialog.getCallId().getCallId().equals(callId) && fromTag.equalsIgnoreCase(sIPDialog.lastResponseFromTag) && toTag.equalsIgnoreCase(sIPDialog.lastResponseToTag)) {
                return sIPDialog;
            }
        }
        StringBuilder sb2 = new StringBuilder(callId);
        if (toTag != null) {
            sb2.append(":");
            sb2.append(toTag);
        }
        if (fromTag != null) {
            sb2.append(":");
            sb2.append(fromTag);
        }
        String lowerCase = sb2.toString().toLowerCase();
        if (logger.isLoggingEnabled(32)) {
            a.w("Looking for dialog ", lowerCase, logger);
        }
        SIPDialog sIPDialog2 = this.dialogTable.get(lowerCase);
        if (sIPDialog2 == null) {
            for (SIPClientTransaction sIPClientTransaction : this.clientTransactionTable.values()) {
                if (sIPClientTransaction.getDialog(lowerCase) != null) {
                    return sIPClientTransaction.getDialog(lowerCase);
                }
            }
            return sIPDialog2;
        }
        return sIPDialog2;
    }

    public SIPServerTransaction getRetransmissionAlertTransaction(String str) {
        return this.retransmissionAlertTransactions.get(str);
    }

    public AbstractC2093c getRouter(SIPRequest sIPRequest) {
        if (sIPRequest.getRequestLine() == null) {
            return this.defaultRouter;
        }
        if (this.useRouterForAll) {
            return this.router;
        }
        if (!sIPRequest.getRequestURI().getScheme().equals("sip") && !sIPRequest.getRequestURI().getScheme().equals("sips")) {
            AbstractC2093c abstractC2093c = this.router;
            return abstractC2093c != null ? abstractC2093c : this.defaultRouter;
        }
        return this.defaultRouter;
    }

    public ScheduledExecutorService getSelfRoutingThreadpoolExecutor() {
        if (selfRoutingThreadpoolExecutor == null) {
            if (this.threadPoolSize <= 0) {
                selfRoutingThreadpoolExecutor = new ThreadAffinityExecutor(16);
            } else {
                selfRoutingThreadpoolExecutor = new ThreadAffinityExecutor(this.threadPoolSize);
            }
        }
        return selfRoutingThreadpoolExecutor;
    }

    public int getSendUdpBufferSize() {
        return this.sendUdpBufferSize;
    }

    public ServerLogger getServerLogger() {
        return this.serverLogger;
    }

    public int getServerTransactionTableSize() {
        return this.serverTransactionTable.size();
    }

    public abstract p getSipListener();

    public long getSslHandshakeTimeout() {
        return this.sslHandshakeTimeout;
    }

    public int getStackCongestionControlTimeout() {
        return this.stackCongestionControlTimeout;
    }

    @Deprecated
    public StackLogger getStackLogger() {
        return logger;
    }

    public int getTcpPostParsingThreadPoolSize() {
        return this.tcpPostParsingThreadPoolSize;
    }

    public ThreadAuditor getThreadAuditor() {
        return this.threadAuditor;
    }

    public int getThreadPriority() {
        return this.threadPriority;
    }

    public SipTimer getTimer() {
        return this.timer;
    }

    public boolean isAggressiveCleanup() {
        if (this.releaseReferencesStrategy == ReleaseReferencesStrategy.None) {
            return false;
        }
        return true;
    }

    public boolean isAlive() {
        return !this.toExit;
    }

    public boolean isCancelClientTransactionChecked() {
        return this.cancelClientTransactionChecked;
    }

    public boolean isDeliverRetransmittedAckToListener() {
        return this.deliverRetransmittedAckToListener;
    }

    public boolean isDeliverTerminatedEventForAck() {
        return this.deliverTerminatedEventForAck;
    }

    public boolean isDeliverUnsolicitedNotify() {
        return this.deliverUnsolicitedNotify;
    }

    public boolean isEventForked(String str) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            StringBuilder s10 = a.s("isEventForked: ", str, " returning ");
            s10.append(this.forkedEvents.contains(str));
            stackLogger.logDebug(s10.toString());
        }
        return this.forkedEvents.contains(str);
    }

    public boolean isLogStackTraceOnMessageSend() {
        return this.logStackTraceOnMessageSend;
    }

    @Deprecated
    public boolean isLoggingEnabled() {
        StackLogger stackLogger = logger;
        if (stackLogger == null) {
            return false;
        }
        return stackLogger.isLoggingEnabled();
    }

    public boolean isNon2XXAckPassedToListener() {
        return this.non2XXAckPassedToListener;
    }

    public boolean isPatchReceivedRport() {
        return this.patchReceivedRport;
    }

    public boolean isPatchRport() {
        return this.patchRport;
    }

    public boolean isPatchWebSocketHeaders() {
        return this.patchWebSocketHeaders;
    }

    public boolean isRemoteTagReassignmentAllowed() {
        return this.remoteTagReassignmentAllowed;
    }

    public boolean isRfc2543Supported() {
        return this.rfc2543Supported;
    }

    public boolean isSslRenegotiationEnabled() {
        return this.sslRenegotiationEnabled;
    }

    public boolean isTransactionPendingAck(SIPServerTransaction sIPServerTransaction) {
        return this.terminatedServerTransactionsPendingAck.contains(((SIPRequest) sIPServerTransaction.getRequest()).getTopmostVia().getBranch());
    }

    public void mapTransaction(SIPServerTransaction sIPServerTransaction) {
        if (sIPServerTransaction.isTransactionMapped()) {
            return;
        }
        addTransactionHash(sIPServerTransaction);
        sIPServerTransaction.setTransactionMapped(true);
    }

    public ServerRequestInterface newSIPServerRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        String transactionId = sIPRequest.getTransactionId();
        sIPRequest.setMessageChannel(messageChannel);
        if (this.sipMessageValves.size() != 0) {
            try {
                for (SIPMessageValve sIPMessageValve : this.sipMessageValves) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Checking SIP message valve " + sIPMessageValve + " for Request = " + sIPRequest.getFirstLine());
                    }
                    if (!sIPMessageValve.processRequest(sIPRequest, messageChannel)) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Request dropped by the SIP message valve. Request = " + sIPRequest);
                        }
                        return null;
                    }
                }
            } catch (Exception e10) {
                if (logger.isLoggingEnabled(4)) {
                    logger.logError("An issue happening the valve on request " + sIPRequest + " thus the message will not be processed further", e10);
                }
                return null;
            }
        }
        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) findTransaction(transactionId, true);
        if (sIPServerTransaction == null || !sIPServerTransaction.isMessagePartOfTransaction(sIPRequest)) {
            if (!transactionId.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
                Iterator<SIPServerTransaction> it = this.serverTransactionTable.values().iterator();
                SIPServerTransaction sIPServerTransaction2 = null;
                while (it.hasNext() && sIPServerTransaction2 == null) {
                    SIPServerTransaction next = it.next();
                    if (next.isMessagePartOfTransaction(sIPRequest)) {
                        sIPServerTransaction2 = next;
                    }
                }
                sIPServerTransaction = sIPServerTransaction2;
            } else {
                sIPServerTransaction = null;
            }
            if (sIPServerTransaction == null) {
                SIPServerTransaction findPendingTransaction = findPendingTransaction(transactionId);
                if (findPendingTransaction != null) {
                    sIPRequest.setTransaction(findPendingTransaction);
                    if (!findPendingTransaction.acquireSem()) {
                        return null;
                    }
                    return findPendingTransaction;
                }
                sIPServerTransaction = createServerTransaction(messageChannel);
                if (sIPServerTransaction != null) {
                    sIPServerTransaction.setOriginalRequest(sIPRequest);
                    sIPRequest.setTransaction(sIPServerTransaction);
                }
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("newSIPServerRequest( " + sIPRequest.getMethod() + ":" + sIPRequest.getTopmostVia().getBranch() + "):" + sIPServerTransaction);
        }
        if (sIPServerTransaction != null) {
            sIPServerTransaction.setRequestInterface(this.sipMessageFactory.newSIPServerRequest(sIPRequest, sIPServerTransaction));
        }
        if (sIPServerTransaction != null && sIPServerTransaction.acquireSem()) {
            return sIPServerTransaction;
        }
        if (sIPServerTransaction != null) {
            try {
                if (sIPServerTransaction.isMessagePartOfTransaction(sIPRequest) && sIPServerTransaction.getMethod().equals(sIPRequest.getMethod())) {
                    SIPResponse createResponse = sIPRequest.createResponse(100);
                    createResponse.removeContent();
                    sIPServerTransaction.getMessageChannel().sendMessage(createResponse);
                }
            } catch (Exception unused) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Exception occured sending TRYING");
                }
            }
        }
        return null;
    }

    public ServerResponseInterface newSIPServerResponse(SIPResponse sIPResponse, MessageChannel messageChannel) {
        if (this.sipMessageValves.size() != 0) {
            try {
                for (SIPMessageValve sIPMessageValve : this.sipMessageValves) {
                    if (!sIPMessageValve.processResponse(sIPResponse, messageChannel)) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Response dropped by the SIP message valve. Response = " + sIPResponse);
                        }
                        return null;
                    }
                }
            } catch (Exception e10) {
                if (logger.isLoggingEnabled(4)) {
                    logger.logError("An issue happening the valve on response " + sIPResponse + " thus the message will not be processed further", e10);
                }
                return null;
            }
        }
        String transactionId = sIPResponse.getTransactionId();
        SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) findTransaction(transactionId, false);
        if (sIPClientTransaction == null || (!sIPClientTransaction.isMessagePartOfTransaction(sIPResponse) && !transactionId.startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE))) {
            Iterator<SIPClientTransaction> it = this.clientTransactionTable.values().iterator();
            sIPClientTransaction = null;
            while (it.hasNext() && sIPClientTransaction == null) {
                SIPClientTransaction next = it.next();
                if (next.isMessagePartOfTransaction(sIPResponse)) {
                    sIPClientTransaction = next;
                }
            }
            if (sIPClientTransaction == null) {
                if (logger.isLoggingEnabled(16)) {
                    messageChannel.logResponse(sIPResponse, System.currentTimeMillis(), "before processing");
                }
                return this.sipMessageFactory.newSIPServerResponse(sIPResponse, messageChannel);
            }
        }
        boolean acquireSem = sIPClientTransaction.acquireSem();
        if (logger.isLoggingEnabled(16)) {
            sIPClientTransaction.getMessageChannel().logResponse(sIPResponse, System.currentTimeMillis(), "before processing");
        }
        if (acquireSem) {
            ServerResponseInterface newSIPServerResponse = this.sipMessageFactory.newSIPServerResponse(sIPResponse, sIPClientTransaction.getMessageChannel());
            if (newSIPServerResponse != null) {
                sIPClientTransaction.setResponseInterface(newSIPServerResponse);
            } else {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("returning null - serverResponseInterface is null!");
                }
                sIPClientTransaction.releaseSem();
                return null;
            }
        } else {
            logger.logWarning("Application is blocked -- could not acquire semaphore -- dropping response");
        }
        if (!acquireSem) {
            return null;
        }
        return sIPClientTransaction;
    }

    public void printDialogTable() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("dialog table  = " + this.dialogTable);
        }
    }

    public SIPDialog putDialog(SIPDialog sIPDialog) {
        String dialogId = sIPDialog.getDialogId();
        if (this.dialogTable.containsKey(dialogId)) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                StringBuilder s10 = a.s("putDialog: dialog already exists", dialogId, " in table = ");
                s10.append(this.dialogTable.get(dialogId));
                stackLogger.logDebug(s10.toString());
            }
            return this.dialogTable.get(dialogId);
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("putDialog dialogId=" + dialogId + " dialog = " + sIPDialog);
        }
        sIPDialog.setStack(this);
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
        }
        this.dialogTable.put(dialogId, sIPDialog);
        putMergeDialog(sIPDialog);
        return sIPDialog;
    }

    public void putInMergeTable(SIPServerTransaction sIPServerTransaction, SIPRequest sIPRequest) {
        String mergeId = sIPRequest.getMergeId();
        if (mergeId != null) {
            this.mergeTable.put(mergeId, sIPServerTransaction);
        }
    }

    public void putMergeDialog(SIPDialog sIPDialog) {
        String mergeId;
        if (sIPDialog != null && (mergeId = sIPDialog.getMergeId()) != null) {
            this.serverDialogMergeTestTable.put(mergeId, sIPDialog);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("put Dialog " + sIPDialog + " in serverDialogMerge table with Merge Dialog Id " + mergeId);
            }
        }
    }

    public void putPendingTransaction(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("putPendingTransaction: " + sIPServerTransaction);
        }
        this.pendingTransactions.put(sIPServerTransaction.getTransactionId(), sIPServerTransaction);
    }

    public void reInit() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Re-initializing !");
        }
        this.messageProcessors = new CopyOnWriteArrayList();
        this.ioHandler = new IOHandler(this);
        this.pendingTransactions = new ConcurrentHashMap<>();
        this.clientTransactionTable = new ConcurrentHashMap<>();
        this.serverTransactionTable = new ConcurrentHashMap<>();
        this.retransmissionAlertTransactions = new ConcurrentHashMap<>();
        this.mergeTable = new ConcurrentHashMap<>();
        this.dialogTable = new ConcurrentHashMap<>();
        this.earlyDialogTable = new ConcurrentHashMap<>();
        this.serverDialogMergeTestTable = new ConcurrentHashMap<>();
        this.terminatedServerTransactionsPendingAck = new ConcurrentHashMap<>();
        this.forkedClientTransactionTable = new ConcurrentHashMap<>();
        this.activeClientTransactionCount = new AtomicInteger(0);
    }

    public void removeDialog(SIPDialog sIPDialog) {
        String dialogId = sIPDialog.getDialogId();
        String earlyDialogId = sIPDialog.getEarlyDialogId();
        if (earlyDialogId != null) {
            this.earlyDialogTable.remove(earlyDialogId);
            this.dialogTable.remove(earlyDialogId);
        }
        removeMergeDialog(sIPDialog.getMergeId());
        if (dialogId != null) {
            if (this.dialogTable.get(dialogId) == sIPDialog) {
                this.dialogTable.remove(dialogId);
            }
            if (sIPDialog.testAndSetIsDialogTerminatedEventDelivered()) {
                return;
            }
            sIPDialog.getSipProvider().handleEvent(new e(sIPDialog.getSipProvider(), sIPDialog), null);
        } else if (!this.isDialogTerminatedEventDeliveredForNullDialog || sIPDialog.testAndSetIsDialogTerminatedEventDelivered()) {
        } else {
            sIPDialog.getSipProvider().handleEvent(new e(sIPDialog.getSipProvider(), sIPDialog), null);
        }
    }

    public void removeFromMergeTable(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Removing tx from merge table ");
        }
        String mergeId = sIPServerTransaction.getMergeId();
        if (mergeId != null) {
            this.mergeTable.remove(mergeId);
        }
    }

    public void removeMergeDialog(String str) {
        if (str != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Tyring to remove Dialog from serverDialogMerge table with Merge Dialog Id ".concat(str));
            }
            SIPDialog remove = this.serverDialogMergeTestTable.remove(str);
            if (logger.isLoggingEnabled(32) && remove != null) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("removed Dialog " + remove + " from serverDialogMerge table with Merge Dialog Id " + str);
            }
        }
    }

    public void removeMessageProcessor(MessageProcessor messageProcessor) {
        if (this.messageProcessors.remove(messageProcessor)) {
            messageProcessor.stop();
        }
    }

    public void removePendingTransaction(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("removePendingTx: " + sIPServerTransaction.getTransactionId());
        }
        this.pendingTransactions.remove(sIPServerTransaction.getTransactionId());
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a7  */
    /* JADX WARN: Type inference failed for: r14v9, types: [android.javax.sip.w, java.util.EventObject] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.javax.sip.w, java.util.EventObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void removeTransaction(SIPTransaction sIPTransaction) {
        Throwable th2;
        TransactionExt transactionExt;
        SIPClientTransaction sIPClientTransaction;
        String forkId;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("removeTransaction: Removing Transaction = " + sIPTransaction.getTransactionId() + " transaction = " + sIPTransaction);
        }
        TransactionExt transactionExt2 = null;
        try {
            if (sIPTransaction instanceof SIPServerTransaction) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                }
                transactionExt = this.serverTransactionTable.remove(sIPTransaction.getTransactionId());
                try {
                    String method = sIPTransaction.getMethod();
                    removePendingTransaction((SIPServerTransaction) sIPTransaction);
                    removeTransactionPendingAck((SIPServerTransaction) sIPTransaction);
                    if (method.equalsIgnoreCase(TokenNames.INVITE)) {
                        removeFromMergeTable((SIPServerTransaction) sIPTransaction);
                    }
                    SipProviderImpl sipProvider = sIPTransaction.getSipProvider();
                    if (transactionExt != null && sIPTransaction.testAndSetTransactionTerminatedEvent()) {
                        ?? eventObject = new EventObject(sipProvider);
                        eventObject.f24348Z = null;
                        eventObject.f24347Y = (m) sIPTransaction;
                        sipProvider.handleEvent(eventObject, sIPTransaction);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    transactionExt2 = transactionExt;
                    if (transactionExt2 != null) {
                    }
                    if (logger.isLoggingEnabled(32)) {
                    }
                    throw th2;
                }
            } else {
                String transactionId = sIPTransaction.getTransactionId();
                TransactionExt remove = this.clientTransactionTable.remove(transactionId);
                try {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("REMOVED client tx " + remove + " KEY = " + transactionId);
                    }
                    if (remove != null && (forkId = (sIPClientTransaction = (SIPClientTransaction) remove).getForkId()) != null && sIPClientTransaction.isInviteTransaction() && this.maxForkTime != 0) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger3 = logger;
                            stackLogger3.logDebug("Scheduling to remove forked client transaction : forkId = " + forkId + " in " + this.maxForkTime + " seconds");
                        }
                        this.timer.schedule(new RemoveForkedTransactionTimerTask(forkId), this.maxForkTime * 1000);
                        sIPClientTransaction.stopExpiresTimer();
                    }
                    if (remove != null && sIPTransaction.testAndSetTransactionTerminatedEvent()) {
                        SipProviderImpl sipProvider2 = sIPTransaction.getSipProvider();
                        ?? eventObject2 = new EventObject(sipProvider2);
                        eventObject2.f24347Y = null;
                        eventObject2.f24348Z = (android.javax.sip.a) sIPTransaction;
                        sipProvider2.handleEvent(eventObject2, sIPTransaction);
                    }
                    transactionExt = remove;
                } catch (Throwable th4) {
                    th2 = th4;
                    transactionExt2 = remove;
                    if (transactionExt2 != null) {
                        ((SIPTransaction) transactionExt2).cancelMaxTxLifeTimeTimer();
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug(String.format("removeTransaction: Table size :  clientTransactionTable %d  serverTransactionTable %d  mergetTable %d  terminatedServerTransactionsPendingAck %d   forkedClientTransactionTable %d  pendingTransactions %d ", Integer.valueOf(this.clientTransactionTable.size()), Integer.valueOf(this.serverTransactionTable.size()), Integer.valueOf(this.mergeTable.size()), Integer.valueOf(this.terminatedServerTransactionsPendingAck.size()), Integer.valueOf(this.forkedClientTransactionTable.size()), Integer.valueOf(this.pendingTransactions.size())));
                    }
                    throw th2;
                }
            }
            if (transactionExt != null) {
                ((SIPTransaction) transactionExt).cancelMaxTxLifeTimeTimer();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(String.format("removeTransaction: Table size :  clientTransactionTable %d  serverTransactionTable %d  mergetTable %d  terminatedServerTransactionsPendingAck %d   forkedClientTransactionTable %d  pendingTransactions %d ", Integer.valueOf(this.clientTransactionTable.size()), Integer.valueOf(this.serverTransactionTable.size()), Integer.valueOf(this.mergeTable.size()), Integer.valueOf(this.terminatedServerTransactionsPendingAck.size()), Integer.valueOf(this.forkedClientTransactionTable.size()), Integer.valueOf(this.pendingTransactions.size())));
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public void removeTransactionHash(SIPTransaction sIPTransaction) {
        SIPClientTransaction sIPClientTransaction;
        if (sIPTransaction.getOriginalRequest() == null) {
            return;
        }
        if (sIPTransaction instanceof SIPClientTransaction) {
            String transactionId = sIPTransaction.getTransactionId();
            if (logger.isLoggingEnabled(32)) {
                logger.logStackTrace();
                a.w("removing client Tx : ", transactionId, logger);
            }
            sIPClientTransaction = this.clientTransactionTable.remove(transactionId);
        } else if (sIPTransaction instanceof SIPServerTransaction) {
            String transactionId2 = sIPTransaction.getTransactionId();
            SIPServerTransaction remove = this.serverTransactionTable.remove(transactionId2);
            if (logger.isLoggingEnabled(32)) {
                a.w("removing server Tx : ", transactionId2, logger);
            }
            sIPClientTransaction = remove;
        } else {
            sIPClientTransaction = null;
        }
        if (sIPClientTransaction != null) {
            sIPClientTransaction.cancelMaxTxLifeTimeTimer();
        }
    }

    public boolean removeTransactionPendingAck(SIPServerTransaction sIPServerTransaction) {
        String branchId = sIPServerTransaction.getBranchId();
        if (branchId != null && this.terminatedServerTransactionsPendingAck.containsKey(branchId)) {
            this.terminatedServerTransactionsPendingAck.remove(branchId);
            return true;
        }
        return false;
    }

    public void setAddressResolver(AddressResolver addressResolver) {
        this.addressResolver = addressResolver;
    }

    public void setAggressiveCleanup(boolean z10) {
        if (z10) {
            this.releaseReferencesStrategy = ReleaseReferencesStrategy.Normal;
        } else {
            this.releaseReferencesStrategy = ReleaseReferencesStrategy.None;
        }
    }

    public void setClientAuth(ClientAuthType clientAuthType) {
        this.clientAuth = clientAuthType;
    }

    public void setConnectionLingerTimer(int i10) {
        connectionLingerTimer = i10;
    }

    public void setDeliverDialogTerminatedEventForNullDialog() {
        this.isDialogTerminatedEventDeliveredForNullDialog = true;
    }

    public void setDeliverTerminatedEventForAck(boolean z10) {
        this.deliverTerminatedEventForAck = z10;
    }

    public void setDeliverUnsolicitedNotify(boolean z10) {
        this.deliverUnsolicitedNotify = z10;
    }

    public void setEarlyDialogTimeout(int i10) {
        this.earlyDialogTimeout = i10;
    }

    public void setHostAddress(String str) {
        if (str.indexOf(58) != str.lastIndexOf(58) && str.trim().charAt(0) != '[') {
            this.stackAddress = a.h("[", str, ']');
        } else {
            this.stackAddress = str;
        }
        this.stackInetAddress = InetAddress.getByName(str);
    }

    public boolean setKeepAliveTimeout(String str, int i10, String str2, String str3, int i11, long j6) {
        MessageProcessor findMessageProcessor = findMessageProcessor(str, i10, str2);
        if (findMessageProcessor != null && (findMessageProcessor instanceof ConnectionOrientedMessageProcessor)) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                StringBuilder sb2 = new StringBuilder("~~~ Trying to find MessageChannel and set new KeepAliveTimeout( myAddress=");
                sb2.append(str);
                sb2.append(", myPort=");
                sb2.append(i10);
                sb2.append(", transport=");
                a.y(sb2, str2, ", peerAddress=", str3, ", peerPort=");
                sb2.append(i11);
                sb2.append(", keepAliveTimeout=");
                sb2.append(j6);
                sb2.append("), MessageProcessor=");
                sb2.append(findMessageProcessor);
                stackLogger.logDebug(sb2.toString());
            }
            return ((ConnectionOrientedMessageProcessor) findMessageProcessor).setKeepAliveTimeout(str3, i11, j6);
        }
        return false;
    }

    public void setLogRecordFactory(LogRecordFactory logRecordFactory) {
        this.logRecordFactory = logRecordFactory;
    }

    public void setLogStackTraceOnMessageSend(boolean z10) {
        this.logStackTraceOnMessageSend = z10;
    }

    public void setMaxConnections(int i10) {
        this.maxConnections = i10;
    }

    public void setMaxForkTime(int i10) {
        this.maxForkTime = i10;
    }

    public void setMaxTxLifetimeInvite(int i10) {
        this.maxTxLifetimeInvite = i10;
    }

    public void setMaxTxLifetimeNonInvite(int i10) {
        this.maxTxLifetimeNonInvite = i10;
    }

    public void setMessageFactory(StackMessageFactory stackMessageFactory) {
        this.sipMessageFactory = stackMessageFactory;
    }

    public void setMessageParserFactory(MessageParserFactory messageParserFactory) {
        this.messageParserFactory = messageParserFactory;
    }

    public void setMessageProcessorFactory(MessageProcessorFactory messageProcessorFactory) {
        this.messageProcessorFactory = messageProcessorFactory;
    }

    public void setNon2XXAckPassedToListener(boolean z10) {
        this.non2XXAckPassedToListener = z10;
    }

    public void setPatchReceivedRport(boolean z10) {
        this.patchReceivedRport = z10;
    }

    public void setPatchRport(Boolean bool) {
        this.patchRport = bool.booleanValue();
    }

    public void setPatchWebSocketHeaders(Boolean bool) {
        this.patchWebSocketHeaders = bool.booleanValue();
    }

    public void setReceiveUdpBufferSize(int i10) {
        this.receiveUdpBufferSize = i10;
    }

    public void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy) {
        this.releaseReferencesStrategy = releaseReferencesStrategy;
    }

    public void setReliableConnectionKeepAliveTimeout(int i10) {
        if (i10 == 0) {
            if (logger.isLoggingEnabled(16)) {
                logger.logInfo("Default value (840000 ms) will be used for reliableConnectionKeepAliveTimeout stack property");
            }
            i10 = 840000;
        }
        if (logger.isLoggingEnabled(16)) {
            StackLogger stackLogger = logger;
            stackLogger.logInfo("value " + i10 + " will be used for reliableConnectionKeepAliveTimeout stack property");
        }
        this.reliableConnectionKeepAliveTimeout = i10;
    }

    public void setRouter(AbstractC2093c abstractC2093c) {
        this.router = abstractC2093c;
    }

    public void setSendUdpBufferSize(int i10) {
        this.sendUdpBufferSize = i10;
    }

    public void setSingleThreaded() {
        this.threadPoolSize = 1;
    }

    public void setSslHandshakeTimeout(long j6) {
        this.sslHandshakeTimeout = j6;
    }

    public void setSslRenegotiationEnabled(boolean z10) {
        this.sslRenegotiationEnabled = z10;
    }

    public void setStackCongestionControlTimeout(int i10) {
        this.stackCongestionControlTimeout = i10;
    }

    public void setStackName(String str) {
        this.stackName = str;
    }

    public void setTcpPostParsingThreadPoolSize(int i10) {
        this.tcpPostParsingThreadPoolSize = i10;
    }

    public void setThreadPoolSize(int i10) {
        this.threadPoolSize = i10;
    }

    public void setThreadPriority(int i10) {
        if (i10 >= 1) {
            if (i10 <= 10) {
                if (logger.isLoggingEnabled(16)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logInfo("Setting Stack Thread priority to " + i10);
                }
                this.threadPriority = i10;
                return;
            }
            throw new IllegalArgumentException("The Stack Thread Priority shouldn't be higher than Thread.MAX_PRIORITY");
        }
        throw new IllegalArgumentException("The Stack Thread Priority shouldn't be lower than Thread.MIN_PRIORITY");
    }

    public void setTimer(SipTimer sipTimer) {
        this.timer = sipTimer;
    }

    public void stopStack() {
        this.toExit = true;
        this.pendingTransactions.clear();
        synchronized (this) {
            notifyAll();
        }
        synchronized (this.clientTransactionTable) {
            this.clientTransactionTable.notifyAll();
        }
        ScheduledExecutorService scheduledExecutorService = selfRoutingThreadpoolExecutor;
        if (scheduledExecutorService != null && (scheduledExecutorService instanceof ExecutorService)) {
            scheduledExecutorService.shutdown();
        }
        selfRoutingThreadpoolExecutor = null;
        for (MessageProcessor messageProcessor : getMessageProcessors()) {
            removeMessageProcessor(messageProcessor);
        }
        closeAllSockets();
        SipTimer sipTimer = this.timer;
        if (sipTimer != null) {
            sipTimer.stop();
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
        this.clientTransactionTable.clear();
        this.serverTransactionTable.clear();
        this.dialogTable.clear();
        this.serverLogger.closeLogFile();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionEventListener
    public synchronized void transactionErrorEvent(SIPTransactionErrorEvent sIPTransactionErrorEvent) {
        try {
            SIPTransaction sIPTransaction = (SIPTransaction) sIPTransactionErrorEvent.getSource();
            if (sIPTransactionErrorEvent.getErrorID() == 2) {
                sIPTransaction.setState(5);
                if (sIPTransaction instanceof SIPServerTransaction) {
                    ((SIPServerTransaction) sIPTransaction).setCollectionTime(0);
                }
                sIPTransaction.disableTimeoutTimer();
                sIPTransaction.disableRetransmissionTimer();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Deprecated
    public boolean isLoggingEnabled(int i10) {
        StackLogger stackLogger = logger;
        if (stackLogger == null) {
            return false;
        }
        return stackLogger.isLoggingEnabled(i10);
    }

    public void addTransaction(SIPServerTransaction sIPServerTransaction) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("added transaction " + sIPServerTransaction);
        }
        sIPServerTransaction.map();
        addTransactionHash(sIPServerTransaction);
    }

    public Collection<b> getDialogs(d dVar) {
        HashSet hashSet = new HashSet();
        if (d.f24327h0.equals(dVar)) {
            hashSet.addAll(this.earlyDialogTable.values());
        } else {
            for (SIPDialog sIPDialog : this.dialogTable.values()) {
                if (sIPDialog.getState() != null && sIPDialog.getState().equals(dVar)) {
                    hashSet.add(sIPDialog);
                }
            }
        }
        return hashSet;
    }

    public AbstractC2093c getRouter() {
        return this.router;
    }

    public void removeDialog(String str) {
        if (logger.isLoggingEnabled()) {
            logger.logWarning("Silently removing dialog from table");
        }
        this.dialogTable.remove(str);
    }

    public SIPDialog createDialog(SIPClientTransaction sIPClientTransaction, SIPResponse sIPResponse) {
        String dialogId = ((SIPRequest) sIPClientTransaction.getRequest()).getDialogId(false);
        String dialogId2 = sIPResponse.getDialogId(false);
        if (logger.isLoggingEnabled(32)) {
            a.w("createDialog originalDialogId=", dialogId, logger);
            a.w("createDialog earlyDialogId=", dialogId2, logger);
            StackLogger stackLogger = logger;
            stackLogger.logDebug("createDialog default Dialog=" + sIPClientTransaction.getDefaultDialog());
            if (sIPClientTransaction.getDefaultDialog() != null) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("createDialog default Dialog Id=" + sIPClientTransaction.getDefaultDialog().getDialogId());
            }
        }
        SIPDialog sIPDialog = this.earlyDialogTable.get(dialogId);
        if (sIPDialog != null && (sIPClientTransaction.getDefaultDialog() == null || sIPClientTransaction.getDefaultDialog().getDialogId().equals(dialogId))) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger3 = logger;
                stackLogger3.logDebug("createDialog early Dialog found : earlyDialogId=" + dialogId + " earlyDialog= " + sIPDialog);
            }
            if (sIPResponse.isFinalResponse()) {
                this.earlyDialogTable.remove(dialogId);
            }
        } else {
            sIPDialog = new SIPDialog(sIPClientTransaction, sIPResponse);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger4 = logger;
                stackLogger4.logDebug("createDialog early Dialog not found : earlyDialogId=" + dialogId2 + " created one " + sIPDialog);
            }
        }
        return sIPDialog;
    }

    public SIPTransaction findTransaction(String str, boolean z10) {
        if (z10) {
            return this.serverTransactionTable.get(str);
        }
        return this.clientTransactionTable.get(str);
    }

    public SIPDialog createDialog(SipProviderImpl sipProviderImpl, SIPResponse sIPResponse) {
        return new SIPDialog(sipProviderImpl, sIPResponse);
    }

    public SIPDialog createDialog(SIPClientTransaction sIPClientTransaction, SIPTransaction sIPTransaction) {
        return new SIPDialog(sIPClientTransaction, sIPTransaction);
    }

    public SIPTransactionStack(StackMessageFactory stackMessageFactory) {
        this();
        this.sipMessageFactory = stackMessageFactory;
    }
}
