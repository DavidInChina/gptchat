package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.DialogExt;
import android.gov.nist.javax.sip.ListeningPointImpl;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipListenerExt;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.CSeq;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.ContactList;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.From;
import android.gov.nist.javax.sip.header.MaxForwards;
import android.gov.nist.javax.sip.header.RAck;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.Reason;
import android.gov.nist.javax.sip.header.RecordRoute;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.Require;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.TimeStamp;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.AddressParser;
import android.gov.nist.javax.sip.parser.CallIDParser;
import android.gov.nist.javax.sip.parser.ContactParser;
import android.gov.nist.javax.sip.parser.RecordRouteParser;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.javax.sip.a;
import android.javax.sip.b;
import android.javax.sip.d;
import android.javax.sip.f;
import android.javax.sip.g;
import android.javax.sip.i;
import android.javax.sip.n;
import android.javax.sip.u;
import android.javax.sip.v;
import b.AbstractC2091a;
import b.AbstractC2092b;
import b.AbstractC2094d;
import c.AbstractC2234F;
import c.AbstractC2239K;
import c.AbstractC2254i;
import c.AbstractC2255j;
import c.AbstractC2257l;
import c.AbstractC2264t;
import c.AbstractC2268x;
import c.T;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SIPDialog implements b, DialogExt {
    public static final int CONFIRMED_STATE = 1;
    public static final int EARLY_STATE = 0;
    public static final int NULL_STATE = -1;
    public static final int TERMINATED_STATE = 3;
    private static StackLogger logger = CommonLogger.getLogger(SIPDialog.class);
    private static final long serialVersionUID = -1429794423085204069L;
    private transient int ackLine;
    protected transient boolean ackProcessed;
    private transient Semaphore ackSem;
    private transient AckSendingStrategy ackSendingStrategy;
    private transient Object applicationData;
    public transient long auditTag;
    protected transient boolean byeSent;
    protected AbstractC2255j callIdHeader;
    protected String callIdHeaderString;
    protected Contact contactHeader;
    protected String contactHeaderStringified;
    private transient DialogDeleteIfNoAckSentTask dialogDeleteIfNoAckSentTask;
    private transient DialogDeleteTask dialogDeleteTask;
    protected String dialogId;
    private int dialogState;
    private transient boolean dialogTerminatedEventDelivered;
    protected transient String earlyDialogId;
    private int earlyDialogTimeout;
    private transient EarlyStateTimerTask earlyStateTimerTask;
    protected AbstractC2264t eventHeader;
    private transient Set<SIPDialogEventListener> eventListeners;
    protected SIPTransaction firstTransaction;
    protected String firstTransactionId;
    protected boolean firstTransactionIsServerTransaction;
    protected String firstTransactionMergeId;
    protected String firstTransactionMethod;
    protected int firstTransactionPort;
    protected boolean firstTransactionSecure;
    protected boolean firstTransactionSeen;
    private transient long highestSequenceNumberAcknowledged;
    protected String hisTag;
    protected transient boolean isAcknowledged;
    protected transient boolean isAssigned;
    protected boolean isBackToBackUserAgent;
    protected Long lastAckReceivedCSeqNumber;
    private transient ACKWrapper lastAckSent;
    protected transient long lastInviteOkReceived;
    protected long lastInviteResponseCSeqNumber;
    protected int lastInviteResponseCode;
    protected long lastResponseCSeqNumber;
    protected String lastResponseDialogId;
    protected String lastResponseFromTag;
    protected String lastResponseMethod;
    protected Integer lastResponseStatusCode;
    protected String lastResponseToTag;
    private Via lastResponseTopMostVia;
    protected SIPTransaction lastTransaction;
    protected AbstractC2091a localParty;
    protected String localPartyStringified;
    protected long localSequenceNumber;
    protected String method;
    protected String myTag;
    protected transient long nextSeqno;
    private SIPDialog originalDialog;
    protected long originalLocalSequenceNumber;
    private transient SIPRequest originalRequest;
    protected transient RecordRouteList originalRequestRecordRouteHeaders;
    protected transient String originalRequestRecordRouteHeadersString;
    private boolean pendingRouteUpdateOn202Response;
    private transient int prevRetransmissionTicks;
    protected AbstractC2239K proxyAuthorizationHeader;
    protected boolean reInviteFlag;
    protected transient int reInviteWaitTime;
    private ReleaseReferencesStrategy releaseReferencesStrategy;
    protected AbstractC2091a remoteParty;
    protected String remotePartyStringified;
    protected long remoteSequenceNumber;
    protected AbstractC2091a remoteTarget;
    protected String remoteTargetStringified;
    private Set<String> responsesReceivedInForkingCase;
    private transient int retransmissionTicksLeft;
    protected RouteList routeList;
    protected boolean sequenceNumberValidation;
    protected boolean serverTransactionFlag;
    private transient SipProviderImpl sipProvider;
    private transient SIPTransactionStack sipStack;
    private transient String stackTrace;
    protected boolean terminateOnBye;
    protected transient DialogTimerTask timerTask;
    private transient Semaphore timerTaskLock;

    /* loaded from: classes.dex */
    public final class ACKWrapper {
        AbstractC2254i cSeq;
        String dialogId;
        String fromTag;
        String msgBytes;

        public ACKWrapper(SIPRequest sIPRequest) {
            sIPRequest.setTransaction(null);
            this.msgBytes = sIPRequest.encode();
            this.fromTag = sIPRequest.getFromTag();
            this.dialogId = sIPRequest.getDialogId(false);
            this.cSeq = sIPRequest.getCSeq();
        }

        public AbstractC2254i getCSeq() {
            return this.cSeq;
        }

        public String getDialogId() {
            return this.dialogId;
        }

        public String getFromTag() {
            return this.fromTag;
        }

        public SIPRequest reparseRequest() {
            try {
                return (SIPRequest) SIPDialog.this.sipStack.getMessageParserFactory().createMessageParser(SIPDialog.this.sipStack).parseSIPMessage(this.msgBytes.getBytes("UTF-8"), true, false, null);
            } catch (Exception unused) {
                if (SIPDialog.logger.isLoggingEnabled(32)) {
                    SIPDialog.logger.logDebug("SIPDialog::resendAck:lastAck failed reparsing, hence not resending ACK");
                }
                return null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class AckSendingStrategyImpl implements AckSendingStrategy {
        private AbstractC2092b hop = null;

        public AckSendingStrategyImpl() {
        }

        @Override // android.gov.nist.javax.sip.stack.AckSendingStrategy
        public AbstractC2092b getLastHop() {
            return this.hop;
        }

        @Override // android.gov.nist.javax.sip.stack.AckSendingStrategy
        public void send(SIPRequest sIPRequest) {
            AbstractC2092b nextHop = SIPDialog.this.sipStack.getNextHop(sIPRequest);
            this.hop = nextHop;
            if (nextHop != null) {
                if (SIPDialog.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = SIPDialog.logger;
                    stackLogger.logDebug("hop = " + this.hop);
                }
                ListeningPointImpl listeningPointImpl = (ListeningPointImpl) SIPDialog.this.sipProvider.getListeningPoint(this.hop.getTransport());
                if (listeningPointImpl != null) {
                    listeningPointImpl.getMessageProcessor().createMessageChannel(InetAddress.getByName(this.hop.getHost()), this.hop.getPort()).sendMessage(sIPRequest);
                    return;
                }
                throw new n("No listening point for this provider registered at " + this.hop);
            }
            throw new n("No route!");
        }
    }

    /* loaded from: classes.dex */
    public class DialogDeleteIfNoAckSentTask extends SIPStackTimerTask implements Serializable {
        private long seqno;

        public DialogDeleteIfNoAckSentTask(long j6) {
            this.seqno = j6;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPDialog.this.highestSequenceNumberAcknowledged < this.seqno) {
                SIPDialog.this.dialogDeleteIfNoAckSentTask = null;
                if (!SIPDialog.this.isBackToBackUserAgent) {
                    if (SIPDialog.logger.isLoggingEnabled()) {
                        StackLogger stackLogger = SIPDialog.logger;
                        stackLogger.logError("ACK Was not sent. killing dialog " + SIPDialog.this.dialogId);
                    }
                    if (SIPDialog.this.sipProvider.getSipListener() instanceof SipListenerExt) {
                        SIPDialog.this.raiseErrorEvent(2);
                        return;
                    } else {
                        SIPDialog.this.delete();
                        return;
                    }
                }
                if (SIPDialog.logger.isLoggingEnabled()) {
                    StackLogger stackLogger2 = SIPDialog.logger;
                    stackLogger2.logError("ACK Was not sent. Sending BYE " + SIPDialog.this.dialogId);
                }
                if (SIPDialog.this.sipProvider.getSipListener() instanceof SipListenerExt) {
                    SIPDialog.this.raiseErrorEvent(2);
                    return;
                }
                try {
                    AbstractC2561b createRequest = SIPDialog.this.createRequest(TokenNames.BYE);
                    if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
                        createRequest.addHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
                    }
                    Reason reason = new Reason();
                    reason.setProtocol("SIP");
                    reason.setCause(1025);
                    reason.setText("Timed out waiting to send ACK " + SIPDialog.this.dialogId);
                    createRequest.addHeader(reason);
                    SIPDialog.this.sendRequest(SIPDialog.this.getSipProvider().getNewClientTransaction(createRequest));
                } catch (Exception unused) {
                    SIPDialog.this.delete();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class DialogDeleteTask extends SIPStackTimerTask implements Serializable {
        public DialogDeleteTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPDialog.this.delete();
        }
    }

    /* loaded from: classes2.dex */
    public class DialogTimerTask extends SIPStackTimerTask implements Serializable {
        int nRetransmissions = 0;
        SIPServerTransaction transaction;

        public DialogTimerTask(SIPServerTransaction sIPServerTransaction) {
            this.transaction = sIPServerTransaction;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void cleanUpBeforeCancel() {
            this.transaction = null;
            SIPDialog.this.cleanUpOnAck();
            super.cleanUpBeforeCancel();
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            StackLogger stackLogger;
            StringBuilder sb2;
            SIPDialog sIPDialog = SIPDialog.this;
            if (SIPDialog.logger.isLoggingEnabled(32)) {
                SIPDialog.logger.logDebug("Running dialog timer");
            }
            int i10 = this.nRetransmissions + 1;
            this.nRetransmissions = i10;
            SIPServerTransaction sIPServerTransaction = this.transaction;
            if (i10 > SIPDialog.this.sipStack.getAckTimeoutFactor()) {
                if (SIPDialog.this.getSipProvider().getSipListener() != null && (SIPDialog.this.getSipProvider().getSipListener() instanceof SipListenerExt)) {
                    SIPDialog.this.raiseErrorEvent(1);
                } else {
                    SIPDialog.this.delete();
                }
                if (sIPServerTransaction != null && sIPServerTransaction.getState() != v.f24345m0) {
                    sIPServerTransaction.raiseErrorEvent(1);
                }
            } else if (sIPServerTransaction != null && !sIPDialog.isAckSeen() && SIPDialog.this.lastResponseStatusCode.intValue() / 100 == 2) {
                try {
                    try {
                        if (sIPDialog.toRetransmitFinalResponse(sIPServerTransaction.getTimerT2())) {
                            sIPServerTransaction.resendLastResponseAsBytes();
                        }
                        SIPTransactionStack unused = sIPDialog.sipStack;
                    } catch (IOException unused2) {
                        SIPDialog.this.raiseIOException(sIPServerTransaction.getPeerAddress(), sIPServerTransaction.getPeerPort(), sIPServerTransaction.getPeerProtocol());
                        SIPTransactionStack unused3 = sIPDialog.sipStack;
                        if (SIPDialog.logger.isLoggingEnabled(32)) {
                            stackLogger = SIPDialog.logger;
                            sb2 = new StringBuilder("resend 200 response from ");
                        }
                    }
                    if (SIPDialog.logger.isLoggingEnabled(32)) {
                        stackLogger = SIPDialog.logger;
                        sb2 = new StringBuilder("resend 200 response from ");
                        sb2.append(sIPDialog);
                        stackLogger.logDebug(sb2.toString());
                    }
                    sIPServerTransaction.fireTimer();
                } catch (Throwable th2) {
                    SIPTransactionStack unused4 = sIPDialog.sipStack;
                    if (SIPDialog.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = SIPDialog.logger;
                        stackLogger2.logDebug("resend 200 response from " + sIPDialog);
                    }
                    sIPServerTransaction.fireTimer();
                    throw th2;
                }
            }
            if (sIPDialog.isAckSeen() || sIPDialog.dialogState == 3) {
                this.transaction = null;
                SIPDialog.this.getStack().getTimer().cancel(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class EarlyStateTimerTask extends SIPStackTimerTask implements Serializable {
        public EarlyStateTimerTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            try {
                if (SIPDialog.this.getState().equals(d.f24327h0)) {
                    SIPDialog.this.raiseErrorEvent(4);
                } else if (SIPDialog.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = SIPDialog.logger;
                    stackLogger.logDebug("EarlyStateTimerTask : Dialog state is " + SIPDialog.this.getState());
                }
            } catch (Exception e10) {
                SIPDialog.logger.logError("Unexpected exception delivering event", e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class LingerTimer extends SIPStackTimerTask implements Serializable {
        public LingerTimer() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            return SIPDialog.this.getCallId().getCallId();
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPDialog sIPDialog = SIPDialog.this;
            sIPDialog.sipStack.removeDialog(sIPDialog);
            if (((SipStackImpl) SIPDialog.this.getStack()).isReEntrantListener()) {
                SIPDialog.this.cleanUp();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class ReInviteSender implements Runnable, Serializable {
        private static final long serialVersionUID = 1019346148741070635L;
        a ctx;

        public ReInviteSender(a aVar) {
            this.ctx = aVar;
            if (SIPDialog.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = SIPDialog.logger;
                stackLogger.logDebug("ReInviteSender::ReInviteSender: ctx = " + aVar);
                SIPDialog.logger.logStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            long j6;
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (SIPDialog.logger.isLoggingEnabled(32)) {
                        SIPDialog.logger.logDebug("SIPDialog::reInviteSender: dialog = " + this.ctx.getDialog() + " lastTransaction = " + SIPDialog.this.lastTransaction + " lastTransactionState " + SIPDialog.this.lastTransaction.getState());
                    }
                    SIPTransaction sIPTransaction = SIPDialog.this.lastTransaction;
                    if (sIPTransaction != null && (sIPTransaction instanceof SIPServerTransaction) && sIPTransaction.isInviteTransaction() && SIPDialog.this.lastTransaction.getState() != v.f24345m0) {
                        ((SIPServerTransaction) SIPDialog.this.lastTransaction).waitForTermination();
                        Thread.sleep(50L);
                    }
                    if (!SIPDialog.this.takeAckSem()) {
                        if (SIPDialog.logger.isLoggingEnabled()) {
                            SIPDialog.logger.logError("Could not send re-INVITE time out ClientTransaction");
                        }
                        ((SIPClientTransaction) this.ctx).fireTimeoutTimer();
                        if (SIPDialog.this.sipProvider.getSipListener() != null && (SIPDialog.this.sipProvider.getSipListener() instanceof SipListenerExt)) {
                            SIPDialog.this.raiseErrorEvent(3, (SIPClientTransaction) this.ctx);
                            z10 = true;
                        } else {
                            AbstractC2561b createRequest = SIPDialog.this.createRequest(TokenNames.BYE);
                            if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
                                createRequest.addHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
                            }
                            Reason reason = new Reason();
                            reason.setCause(1024);
                            reason.setText("Timed out waiting to re-INVITE");
                            createRequest.addHeader(reason);
                            SIPDialog.this.sendRequest(SIPDialog.this.getSipProvider().getNewClientTransaction(createRequest));
                            this.ctx = null;
                            return;
                        }
                    } else {
                        z10 = false;
                    }
                    d state = SIPDialog.this.getState();
                    d dVar = d.f24329j0;
                    if (state != dVar) {
                        j6 = System.currentTimeMillis() - currentTimeMillis;
                    } else {
                        j6 = 0;
                    }
                    if (j6 != 0) {
                        try {
                            Thread.sleep(SIPDialog.this.reInviteWaitTime);
                        } catch (InterruptedException unused) {
                            if (SIPDialog.logger.isLoggingEnabled(32)) {
                                SIPDialog.logger.logDebug("Interrupted sleep");
                            }
                            this.ctx = null;
                            return;
                        }
                    }
                    if (SIPDialog.this.getState() != dVar && !z10 && this.ctx.getState() != v.f24345m0) {
                        SIPDialog.this.sendRequest(this.ctx, true);
                        if (SIPDialog.logger.isLoggingEnabled(32)) {
                            SIPDialog.logger.logDebug("re-INVITE successfully sent");
                        }
                    }
                } catch (Exception e10) {
                    SIPDialog.logger.logError("Error sending re-INVITE", e10);
                }
                this.ctx = null;
            } catch (Throwable th2) {
                this.ctx = null;
                throw th2;
            }
        }

        public void terminate() {
            try {
                if (SIPDialog.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = SIPDialog.logger;
                    stackLogger.logDebug("ReInviteSender::terminate: ctx = " + this.ctx);
                }
                this.ctx.terminate();
                Thread.currentThread().interrupt();
            } catch (i e10) {
                SIPDialog.logger.logError("unexpected error", e10);
            }
        }
    }

    private SIPDialog(SipProviderImpl sipProviderImpl) {
        this.auditTag = 0L;
        this.ackSem = new Semaphore(1);
        this.reInviteWaitTime = 100;
        this.highestSequenceNumberAcknowledged = -1L;
        this.sequenceNumberValidation = true;
        this.timerTaskLock = new Semaphore(1);
        this.firstTransactionPort = SIPConstants.DEFAULT_PORT;
        this.earlyDialogTimeout = 180;
        this.responsesReceivedInForkingCase = new HashSet(0);
        this.ackSendingStrategy = new AckSendingStrategyImpl();
        this.terminateOnBye = true;
        this.routeList = new RouteList();
        this.dialogState = -1;
        this.localSequenceNumber = 0L;
        this.remoteSequenceNumber = -1L;
        this.sipProvider = sipProviderImpl;
        this.eventListeners = new CopyOnWriteArraySet();
        this.earlyDialogTimeout = ((SIPTransactionStack) sipProviderImpl.getSipStack()).getEarlyDialogTimeout();
    }

    private void addRoute(RecordRouteList recordRouteList) {
        try {
            if (!isServer()) {
                this.routeList = new RouteList();
                ListIterator<RecordRoute> listIterator = recordRouteList.listIterator(recordRouteList.size());
                while (listIterator.hasPrevious()) {
                    RecordRoute previous = listIterator.previous();
                    Route route = new Route();
                    route.setAddress((AddressImpl) ((AddressImpl) previous.getAddress()).clone());
                    route.setParameters((NameValueList) previous.getParameters().clone());
                    this.routeList.add((RouteList) route);
                }
            } else {
                this.routeList = new RouteList();
                ListIterator<RecordRoute> listIterator2 = recordRouteList.listIterator();
                while (listIterator2.hasNext()) {
                    RecordRoute next = listIterator2.next();
                    Route route2 = new Route();
                    route2.setAddress((AddressImpl) ((AddressImpl) next.getAddress()).clone());
                    route2.setParameters((NameValueList) next.getParameters().clone());
                    this.routeList.add((RouteList) route2);
                }
            }
            if (!logger.isLoggingEnabled()) {
                return;
            }
            Iterator<Route> it = this.routeList.iterator();
            while (it.hasNext()) {
                AbstractC2094d abstractC2094d = (AbstractC2094d) it.next().getAddress().getURI();
                if (!abstractC2094d.hasLrParam()) {
                    if (logger.isLoggingEnabled()) {
                        StackLogger stackLogger = logger;
                        stackLogger.logWarning("NON LR route in Route set detected for dialog : " + this);
                        logger.logStackTrace();
                    }
                } else if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("route = " + abstractC2094d);
                }
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled()) {
                Iterator<Route> it2 = this.routeList.iterator();
                while (it2.hasNext()) {
                    AbstractC2094d abstractC2094d2 = (AbstractC2094d) it2.next().getAddress().getURI();
                    if (!abstractC2094d2.hasLrParam()) {
                        if (logger.isLoggingEnabled()) {
                            StackLogger stackLogger3 = logger;
                            stackLogger3.logWarning("NON LR route in Route set detected for dialog : " + this);
                            logger.logStackTrace();
                        }
                    } else if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger4 = logger;
                        stackLogger4.logDebug("route = " + abstractC2094d2);
                    }
                }
            }
            throw th2;
        }
    }

    private void doTargetRefresh(SIPMessage sIPMessage) {
        ContactList contactHeaders = sIPMessage.getContactHeaders();
        if (contactHeaders != null) {
            setRemoteTarget((Contact) contactHeaders.getFirst());
        }
    }

    private synchronized RouteList getRouteList() {
        RouteList routeList;
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("getRouteList " + this);
            }
            new RouteList();
            routeList = new RouteList();
            RouteList routeList2 = this.routeList;
            if (routeList2 != null) {
                ListIterator<Route> listIterator = routeList2.listIterator();
                while (listIterator.hasNext()) {
                    routeList.add((RouteList) ((Route) listIterator.next().clone()));
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("----- ");
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("getRouteList for " + this);
                StackLogger stackLogger3 = logger;
                stackLogger3.logDebug("RouteList = " + routeList.encode());
                if (this.routeList != null) {
                    StackLogger stackLogger4 = logger;
                    stackLogger4.logDebug("myRouteList = " + this.routeList.encode());
                }
                logger.logDebug("----- ");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return routeList;
    }

    private static final boolean optionPresent(ListIterator listIterator, String str) {
        while (listIterator.hasNext()) {
            AbstractC2234F abstractC2234F = (AbstractC2234F) listIterator.next();
            if (abstractC2234F != null && str.equalsIgnoreCase(abstractC2234F.getOptionTag())) {
                return true;
            }
        }
        return false;
    }

    private void printRouteList() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("this : " + this);
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("printRouteList : " + this.routeList.encode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseErrorEvent(int i10, SIPClientTransaction sIPClientTransaction) {
        SIPDialogErrorEvent sIPDialogErrorEvent = new SIPDialogErrorEvent(this, i10);
        sIPDialogErrorEvent.setClientTransaction(sIPClientTransaction);
        synchronized (this.eventListeners) {
            try {
                for (SIPDialogEventListener sIPDialogEventListener : this.eventListeners) {
                    sIPDialogEventListener.dialogErrorEvent(sIPDialogErrorEvent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.eventListeners.clear();
        if (i10 != 2 && i10 != 1 && i10 != 4 && i10 != 3) {
            delete();
        }
        stopTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseIOException(String str, int i10, String str2) {
        this.sipProvider.handleEvent(new f(i10, this, str, str2), null);
        setState(3);
    }

    private void recordStackTrace() {
        StringWriter stringWriter = new StringWriter();
        new Exception().printStackTrace(new PrintWriter(stringWriter));
        String num = Integer.toString(Math.abs(new Random().nextInt()));
        StackLogger stackLogger = logger;
        stackLogger.logDebug("TraceRecord = " + num);
        this.stackTrace = "TraceRecord = " + num + ":" + stringWriter.getBuffer().toString();
    }

    private final void setBranch(Via via, String str) {
        String str2;
        if (str.equals(TokenNames.ACK)) {
            if (getLastResponseStatusCode().intValue() >= 300) {
                str2 = this.lastResponseTopMostVia.getBranch();
            } else {
                str2 = Utils.getInstance().generateBranchId();
            }
        } else if (str.equals("CANCEL")) {
            str2 = this.lastResponseTopMostVia.getBranch();
        } else {
            return;
        }
        try {
            via.setBranch(str2);
        } catch (ParseException e10) {
            e10.printStackTrace();
        }
    }

    private void setCallId(SIPRequest sIPRequest) {
        this.callIdHeader = sIPRequest.getCallId();
    }

    private void setLastAckSent(SIPRequest sIPRequest) {
        this.lastAckSent = new ACKWrapper(sIPRequest);
    }

    private void setLocalSequenceNumber(long j6) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setLocalSequenceNumber: original  " + this.localSequenceNumber + " new  = " + j6);
        }
        if (j6 > this.localSequenceNumber) {
            this.localSequenceNumber = j6;
            return;
        }
        throw new RuntimeException("Sequence number should not decrease !");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean toRetransmitFinalResponse(int i10) {
        int i11 = this.retransmissionTicksLeft - 1;
        this.retransmissionTicksLeft = i11;
        if (i11 == 0) {
            int i12 = this.prevRetransmissionTicks;
            if (i12 * 2 <= i10) {
                this.retransmissionTicksLeft = i12 * 2;
            } else {
                this.retransmissionTicksLeft = i12;
            }
            this.prevRetransmissionTicks = this.retransmissionTicksLeft;
            return true;
        }
        return false;
    }

    private void updateRequest(SIPRequest sIPRequest) {
        RouteList routeList = getRouteList();
        if (routeList.size() > 0) {
            sIPRequest.setHeader((AbstractC2268x) routeList);
        } else {
            sIPRequest.removeHeader(SIPHeaderNames.ROUTE);
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        if (this.proxyAuthorizationHeader != null && sIPRequest.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION) == null) {
            sIPRequest.setHeader(this.proxyAuthorizationHeader);
        }
    }

    public void ackReceived(long j6) {
        if (isAckSeen()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Ack already seen for response -- dropping");
                return;
            }
            return;
        }
        SIPServerTransaction inviteTransaction = getInviteTransaction();
        if (inviteTransaction != null) {
            if (inviteTransaction.getCSeq() == j6) {
                acquireTimerTaskSem();
                try {
                    if (this.timerTask != null) {
                        getStack().getTimer().cancel(this.timerTask);
                        this.timerTask = null;
                    }
                    releaseTimerTaskSem();
                    if (this.dialogDeleteTask != null) {
                        getStack().getTimer().cancel(this.dialogDeleteTask);
                        this.dialogDeleteTask = null;
                    }
                    this.lastAckReceivedCSeqNumber = Long.valueOf(j6);
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger = logger;
                        stackLogger.logDebug("ackReceived for " + inviteTransaction.getMethod());
                        this.ackLine = logger.getLineCount();
                        printDebugInfo();
                    }
                    if (this.isBackToBackUserAgent) {
                        releaseAckSem();
                    }
                    setState(1);
                } catch (Throwable th2) {
                    releaseTimerTaskSem();
                    throw th2;
                }
            }
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("tr is null -- not updating the ack state");
        }
    }

    public void acquireTimerTaskSem() {
        try {
            if (this.timerTaskLock.tryAcquire(10L, TimeUnit.SECONDS)) {
                return;
            }
        } catch (InterruptedException unused) {
        }
        throw new IllegalStateException("Impossible to acquire the dialog timer task lock");
    }

    public void addEventListener(SIPDialogEventListener sIPDialogEventListener) {
        this.eventListeners.add(sIPDialogEventListener);
    }

    public boolean addTransaction(SIPTransaction sIPTransaction) {
        SIPRequest originalRequest = sIPTransaction.getOriginalRequest();
        if (this.firstTransactionSeen && !this.firstTransactionId.equals(sIPTransaction.getBranchId()) && sIPTransaction.getMethod().equals(this.firstTransactionMethod)) {
            setReInviteFlag(true);
            this.ackProcessed = false;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("SipDialog.addTransaction() " + this + " transaction = " + sIPTransaction);
        }
        if (!this.firstTransactionSeen) {
            storeFirstTransactionInfo(this, sIPTransaction);
            if (originalRequest.getMethod().equals(TokenNames.SUBSCRIBE)) {
                this.eventHeader = (AbstractC2264t) originalRequest.getHeader(SIPHeaderNames.EVENT);
            }
            setLocalParty(originalRequest);
            setRemoteParty(originalRequest);
            setCallId(originalRequest);
            if (this.originalRequest == null && sIPTransaction.isInviteTransaction()) {
                this.originalRequest = originalRequest;
            } else if (this.originalRequest != null) {
                this.originalRequestRecordRouteHeaders = originalRequest.getRecordRouteHeaders();
            }
            if (this.method == null) {
                this.method = originalRequest.getMethod();
            }
            if (sIPTransaction instanceof SIPServerTransaction) {
                this.hisTag = originalRequest.getFrom().getTag();
            } else {
                setLocalSequenceNumber(originalRequest.getCSeq().getSeqNumber());
                this.originalLocalSequenceNumber = getLocalSeqNumber();
                setLocalTag(originalRequest.getFrom().getTag());
                if (this.myTag == null && logger.isLoggingEnabled()) {
                    logger.logError("The request's From header is missing the required Tag parameter.");
                }
            }
        } else if (sIPTransaction.getMethod().equals(this.firstTransactionMethod) && this.firstTransactionIsServerTransaction != sIPTransaction.isServerTransaction()) {
            storeFirstTransactionInfo(this, sIPTransaction);
            setLocalParty(originalRequest);
            setRemoteParty(originalRequest);
            setCallId(originalRequest);
            if (sIPTransaction.isInviteTransaction()) {
                this.originalRequest = originalRequest;
            } else {
                this.originalRequestRecordRouteHeaders = originalRequest.getRecordRouteHeaders();
            }
            this.method = originalRequest.getMethod();
        } else if (this.firstTransaction == null && sIPTransaction.isInviteTransaction()) {
            this.firstTransaction = sIPTransaction;
        }
        if (sIPTransaction instanceof SIPServerTransaction) {
            setRemoteSequenceNumber(originalRequest.getCSeq().getSeqNumber());
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("isBackToBackUserAgent = " + this.isBackToBackUserAgent);
        }
        if (sIPTransaction.isInviteTransaction()) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger3 = logger;
                stackLogger3.logDebug("SIPDialog::setLastTransaction:dialog= " + this + " lastTransaction = " + sIPTransaction);
            }
            this.lastTransaction = sIPTransaction;
        }
        try {
            if (sIPTransaction.getRequest().getMethod().equals("REFER") && (sIPTransaction instanceof SIPServerTransaction)) {
                long seqNumber = ((SIPRequest) sIPTransaction.getRequest()).getCSeq().getSeqNumber();
                Event event = new Event();
                this.eventHeader = event;
                event.setEventType(ReferencesHeader.REFER);
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger4 = logger;
                    stackLogger4.logDebug("SIPDialog::setLastTransaction:lastReferCSeq = " + seqNumber);
                }
                this.eventHeader.setEventId(Long.toString(seqNumber));
            }
        } catch (Exception unused) {
            logger.logFatalError("Unexpected exception in REFER processing");
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger5 = logger;
            stackLogger5.logDebug("Transaction Added " + this + this.myTag + Separators.SLASH + this.hisTag);
            StackLogger stackLogger6 = logger;
            stackLogger6.logDebug("TID = " + sIPTransaction.getTransactionId() + Separators.SLASH + sIPTransaction.isServerTransaction());
            logger.logStackTrace();
        }
        return true;
    }

    public void checkRetransmissionForForking(SIPResponse sIPResponse) {
        int statusCode = sIPResponse.getStatusCode();
        String method = sIPResponse.getCSeqHeader().getMethod();
        long seqNumber = sIPResponse.getCSeq().getSeqNumber();
        RSeq rSeq = (RSeq) sIPResponse.getHeader(SIPHeaderNames.RSEQ);
        String str = statusCode + Separators.SLASH + seqNumber + Separators.SLASH + method;
        if (rSeq != null) {
            StringBuilder r10 = android.gov.nist.core.a.r(str, Separators.SLASH);
            r10.append(rSeq.getSeqNumber());
            str = r10.toString();
        }
        boolean z10 = !this.responsesReceivedInForkingCase.add(str);
        sIPResponse.setRetransmission(z10);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("marking response as retransmission " + z10 + " for dialog " + this);
        }
    }

    public void cleanUp() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            cleanUpOnAck();
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("dialog cleanup : " + getDialogId());
            }
            Set<SIPDialogEventListener> set = this.eventListeners;
            if (set != null) {
                set.clear();
            }
            this.timerTaskLock = null;
            this.ackSem = null;
            this.contactHeader = null;
            this.eventHeader = null;
            this.firstTransactionId = null;
            this.firstTransactionMethod = null;
            this.lastResponseDialogId = null;
            this.lastResponseMethod = null;
            this.lastResponseTopMostVia = null;
            RecordRouteList recordRouteList = this.originalRequestRecordRouteHeaders;
            if (recordRouteList != null) {
                recordRouteList.clear();
                this.originalRequestRecordRouteHeaders = null;
                this.originalRequestRecordRouteHeadersString = null;
            }
            RouteList routeList = this.routeList;
            if (routeList != null) {
                routeList.clear();
                this.routeList = null;
            }
            this.responsesReceivedInForkingCase.clear();
        }
    }

    public void cleanUpOnAck() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("cleanupOnAck : " + getDialogId());
            }
            if (this.originalRequest != null) {
                RecordRouteList recordRouteList = this.originalRequestRecordRouteHeaders;
                if (recordRouteList != null) {
                    this.originalRequestRecordRouteHeadersString = recordRouteList.toString();
                }
                this.originalRequestRecordRouteHeaders = null;
                this.originalRequest = null;
            }
            SIPTransaction sIPTransaction = this.firstTransaction;
            if (sIPTransaction != null) {
                if (sIPTransaction.getOriginalRequest() != null) {
                    this.firstTransaction.getOriginalRequest().cleanUp();
                }
                this.firstTransaction = null;
            }
            SIPTransaction sIPTransaction2 = this.lastTransaction;
            if (sIPTransaction2 != null) {
                if (sIPTransaction2.getOriginalRequest() != null) {
                    this.lastTransaction.getOriginalRequest().cleanUp();
                }
                this.lastTransaction = null;
            }
            AbstractC2255j abstractC2255j = this.callIdHeader;
            if (abstractC2255j != null) {
                this.callIdHeaderString = abstractC2255j.toString();
                this.callIdHeader = null;
            }
            Contact contact = this.contactHeader;
            if (contact != null) {
                this.contactHeaderStringified = contact.toString();
                this.contactHeader = null;
            }
            AbstractC2091a abstractC2091a = this.remoteTarget;
            if (abstractC2091a != null) {
                this.remoteTargetStringified = abstractC2091a.toString();
                this.remoteTarget = null;
            }
            AbstractC2091a abstractC2091a2 = this.remoteParty;
            if (abstractC2091a2 != null) {
                this.remotePartyStringified = abstractC2091a2.toString();
                this.remoteParty = null;
            }
            AbstractC2091a abstractC2091a3 = this.localParty;
            if (abstractC2091a3 != null) {
                this.localPartyStringified = abstractC2091a3.toString();
                this.localParty = null;
            }
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2561b createAck(long j6) {
        AbstractC2094d abstractC2094d;
        ListeningPointImpl listeningPointImpl;
        NameValueList parameters;
        if (this.method.equals(TokenNames.INVITE)) {
            if (j6 > 0) {
                if (j6 <= 4294967295L) {
                    if (getRemoteTarget() != null) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger = logger;
                            stackLogger.logDebug("createAck " + this + " cseqno " + j6);
                        }
                        if (this.lastInviteOkReceived < j6) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger2 = logger;
                                stackLogger2.logDebug("WARNING : Attempt to crete ACK without OK " + this);
                                StackLogger stackLogger3 = logger;
                                stackLogger3.logDebug("LAST RESPONSE = " + getLastResponseStatusCode());
                            }
                            throw new n("Dialog not yet established -- no OK response! lastInviteOkReceived=" + this.lastInviteOkReceived + " cseqno=" + j6);
                        }
                        try {
                            RouteList routeList = this.routeList;
                            if (routeList != null && !routeList.isEmpty()) {
                                abstractC2094d = (AbstractC2094d) ((Route) this.routeList.getFirst()).getAddress().getURI();
                            } else {
                                abstractC2094d = (AbstractC2094d) getRemoteTarget().getURI();
                            }
                            String transportParam = abstractC2094d.getTransportParam();
                            if (abstractC2094d.isSecure()) {
                                if (transportParam != null && transportParam.equalsIgnoreCase("UDP")) {
                                    throw new n("Cannot create ACK - impossible to use sips uri with transport UDP:" + abstractC2094d);
                                }
                                transportParam = "TLS";
                            }
                            if (transportParam != null) {
                                listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint(transportParam);
                            } else if (abstractC2094d.isSecure()) {
                                listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint("TLS");
                            } else {
                                listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint("UDP");
                                if (listeningPointImpl == null) {
                                    listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint("TCP");
                                }
                            }
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger4 = logger;
                                stackLogger4.logDebug("uri4transport =  " + abstractC2094d);
                            }
                            if (listeningPointImpl == null) {
                                if (!abstractC2094d.isSecure()) {
                                    if (logger.isLoggingEnabled(32)) {
                                        StackLogger stackLogger5 = logger;
                                        stackLogger5.logDebug("No Listening point for " + abstractC2094d + " Using last response topmost");
                                    }
                                    listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint(this.lastResponseTopMostVia.getTransport());
                                }
                                if (listeningPointImpl == null) {
                                    if (logger.isLoggingEnabled(4)) {
                                        StackLogger stackLogger6 = logger;
                                        stackLogger6.logError("remoteTargetURI " + getRemoteTarget().getURI());
                                        StackLogger stackLogger7 = logger;
                                        stackLogger7.logError("uri4transport = " + abstractC2094d);
                                        StackLogger stackLogger8 = logger;
                                        stackLogger8.logError("No LP found for transport=" + transportParam);
                                    }
                                    throw new n("Cannot create ACK - no ListeningPoint for transport towards next hop found:" + transportParam);
                                }
                            }
                            SIPRequest sIPRequest = new SIPRequest();
                            sIPRequest.setMethod(TokenNames.ACK);
                            sIPRequest.setRequestURI((SipUri) getRemoteTarget().getURI().clone());
                            sIPRequest.setCallId(getCallId());
                            sIPRequest.setCSeq(new CSeq(j6, TokenNames.ACK));
                            ArrayList arrayList = new ArrayList();
                            Via via = this.lastResponseTopMostVia;
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger9 = logger;
                                stackLogger9.logDebug("lastResponseTopMostVia " + this.lastResponseTopMostVia);
                            }
                            via.removeParameters();
                            SIPRequest sIPRequest2 = this.originalRequest;
                            if (sIPRequest2 != null && sIPRequest2.getTopmostVia() != null && (parameters = this.originalRequest.getTopmostVia().getParameters()) != null && parameters.size() > 0) {
                                via.setParameters((NameValueList) parameters.clone());
                            }
                            via.setBranch(Utils.getInstance().generateBranchId());
                            arrayList.add(via);
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger10 = logger;
                                stackLogger10.logDebug("Adding via to the ACK we are creating : " + via + " lastResponseTopMostVia " + this.lastResponseTopMostVia);
                            }
                            sIPRequest.setVia(arrayList);
                            From from = new From();
                            from.setAddress(getLocalParty());
                            from.setTag(this.myTag);
                            sIPRequest.setFrom(from);
                            To to = new To();
                            to.setAddress(getRemoteParty());
                            String str = this.hisTag;
                            if (str != null) {
                                to.setTag(str);
                            }
                            sIPRequest.setTo(to);
                            sIPRequest.setMaxForwards(new MaxForwards(70));
                            SIPRequest sIPRequest3 = this.originalRequest;
                            if (sIPRequest3 != null) {
                                AbstractC2268x authorization = sIPRequest3.getAuthorization();
                                if (authorization != null) {
                                    sIPRequest.setHeader(authorization);
                                }
                                this.originalRequestRecordRouteHeaders = this.originalRequest.getRecordRouteHeaders();
                                this.originalRequest = null;
                            }
                            updateRequest(sIPRequest);
                            return sIPRequest;
                        } catch (Exception e10) {
                            InternalErrorHandler.handleException(e10);
                            throw new n("unexpected exception ", e10);
                        }
                    }
                    throw new n("Cannot create ACK - no remote Target!");
                }
                throw new g("bad cseq > 4294967295");
            }
            throw new g("bad cseq <= 0 ");
        }
        throw new n("Dialog was not created with an INVITE" + this.method);
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2561b createPrack(AbstractC2562c abstractC2562c) {
        if (getState() != null && !getState().equals(d.f24329j0)) {
            if (((RSeq) abstractC2562c.getHeader(SIPHeaderNames.RSEQ)) != null) {
                try {
                    SIPResponse sIPResponse = (SIPResponse) abstractC2562c;
                    SIPRequest createRequest = createRequest("PRACK", sIPResponse.getTopmostVia().getTransport());
                    createRequest.setToTag(sIPResponse.getTo().getTag());
                    RAck rAck = new RAck();
                    rAck.setMethod(sIPResponse.getCSeq().getMethod());
                    rAck.setCSequenceNumber((int) sIPResponse.getCSeq().getSeqNumber());
                    rAck.setRSequenceNumber(((RSeq) abstractC2562c.getHeader(SIPHeaderNames.RSEQ)).getSeqNumber());
                    createRequest.setHeader(rAck);
                    AbstractC2239K abstractC2239K = this.proxyAuthorizationHeader;
                    if (abstractC2239K != null) {
                        createRequest.addHeader(abstractC2239K);
                    }
                    return createRequest;
                } catch (Exception e10) {
                    InternalErrorHandler.handleException(e10);
                    return null;
                }
            }
            throw new n("Missing RSeq Header");
        }
        throw new n("Dialog not initialized or terminated");
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2562c createReliableProvisionalResponse(int i10) {
        ListIterator<SIPHeader> headers;
        if (this.firstTransactionIsServerTransaction) {
            if (i10 > 100 && i10 <= 199) {
                SIPRequest sIPRequest = this.originalRequest;
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    ListIterator<SIPHeader> headers2 = sIPRequest.getHeaders(SIPHeaderNames.SUPPORTED);
                    if ((headers2 != null && optionPresent(headers2, "100rel")) || ((headers = sIPRequest.getHeaders(SIPHeaderNames.REQUIRE)) != null && optionPresent(headers, "100rel"))) {
                        SIPResponse createResponse = sIPRequest.createResponse(i10);
                        Require require = new Require();
                        try {
                            require.setOptionTag("100rel");
                        } catch (Exception e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                        createResponse.addHeader(require);
                        new RSeq().setSeqNumber(1L);
                        RecordRouteList recordRouteHeaders = sIPRequest.getRecordRouteHeaders();
                        if (recordRouteHeaders != null) {
                            createResponse.setHeader((AbstractC2268x) ((RecordRouteList) recordRouteHeaders.clone()));
                        }
                        return createResponse;
                    }
                    throw new n("No Supported/Require 100rel header in the request");
                }
                throw new n("Bad method");
            }
            throw new g("Bad status code ");
        }
        throw new n("Not a Server Dialog!");
    }

    @Override // android.javax.sip.b
    public AbstractC2561b createRequest(String str) {
        if (!str.equals(TokenNames.ACK) && !str.equals("PRACK")) {
            Via via = this.lastResponseTopMostVia;
            if (via != null) {
                return createRequest(str, via.getTransport());
            }
            throw new n("Dialog not yet established -- no response!");
        }
        throw new n("Invalid method specified for createRequest:".concat(str));
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void delete() {
        setState(3);
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void disableSequenceNumberValidation() {
        this.sequenceNumberValidation = false;
    }

    public void doDeferredDelete() {
        int i10;
        if (this.sipStack.getTimer() == null) {
            setState(3);
            return;
        }
        this.dialogDeleteTask = new DialogDeleteTask();
        if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            SIPTransaction sIPTransaction = this.lastTransaction;
            if (sIPTransaction != null) {
                i10 = sIPTransaction.getBaseTimerInterval();
            } else {
                i10 = 500;
            }
            this.sipStack.getTimer().schedule(this.dialogDeleteTask, i10 * 64);
            return;
        }
        delete();
    }

    public synchronized void doDeferredDeleteIfNoAckSent(long j6) {
        int i10;
        try {
            if (this.sipStack.getTimer() == null) {
                setState(3);
            } else if (this.dialogDeleteIfNoAckSentTask == null) {
                this.dialogDeleteIfNoAckSentTask = new DialogDeleteIfNoAckSentTask(j6);
                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                    SIPTransaction sIPTransaction = this.lastTransaction;
                    if (sIPTransaction != null) {
                        i10 = sIPTransaction.getBaseTimerInterval();
                    } else {
                        i10 = 500;
                    }
                    this.sipStack.getTimer().schedule(this.dialogDeleteIfNoAckSentTask, this.sipStack.getAckTimeoutFactor() * i10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public Object getApplicationData() {
        return this.applicationData;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2255j getCallId() {
        if (this.callIdHeader == null && this.callIdHeaderString != null) {
            try {
                this.callIdHeader = (AbstractC2255j) new CallIDParser(this.callIdHeaderString).parse();
            } catch (ParseException e10) {
                logger.logError("error reparsing the call id header", e10);
            }
        }
        return this.callIdHeader;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public String getDialogId() {
        String str;
        if (this.dialogId == null && (str = this.lastResponseDialogId) != null) {
            this.dialogId = str;
        }
        return this.dialogId;
    }

    public String getEarlyDialogId() {
        return this.earlyDialogId;
    }

    public AbstractC2264t getEventHeader() {
        return this.eventHeader;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    @Deprecated
    public u getFirstTransaction() {
        throw new UnsupportedOperationException("This method has been deprecated and is no longer supported");
    }

    public u getFirstTransactionInt() {
        SIPTransaction sIPTransaction = this.firstTransaction;
        if (sIPTransaction != null) {
            return sIPTransaction;
        }
        return this.sipStack.findTransaction(this.firstTransactionId, this.firstTransactionIsServerTransaction);
    }

    public SIPServerTransaction getInviteTransaction() {
        DialogTimerTask dialogTimerTask = this.timerTask;
        if (dialogTimerTask != null) {
            return dialogTimerTask.transaction;
        }
        return null;
    }

    public AbstractC2254i getLastAckSentCSeq() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            return aCKWrapper.getCSeq();
        }
        return null;
    }

    public String getLastAckSentDialogId() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            return aCKWrapper.getDialogId();
        }
        return null;
    }

    public String getLastAckSentFromTag() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            return aCKWrapper.getFromTag();
        }
        return null;
    }

    public long getLastResponseCSeqNumber() {
        return this.lastResponseCSeqNumber;
    }

    public String getLastResponseMethod() {
        return this.lastResponseMethod;
    }

    public Integer getLastResponseStatusCode() {
        return this.lastResponseStatusCode;
    }

    public Via getLastResponseTopMostVia() {
        return this.lastResponseTopMostVia;
    }

    public SIPTransaction getLastTransaction() {
        return this.lastTransaction;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2091a getLocalParty() {
        if (this.localParty == null && this.localPartyStringified != null) {
            try {
                this.localParty = new AddressParser(this.localPartyStringified).address(true);
            } catch (ParseException e10) {
                logger.logError("error reparsing the localParty", e10);
            }
        }
        return this.localParty;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public long getLocalSeqNumber() {
        return this.localSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public int getLocalSequenceNumber() {
        return (int) this.localSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public String getLocalTag() {
        return this.myTag;
    }

    public String getMergeId() {
        return this.firstTransactionMergeId;
    }

    public String getMethod() {
        return this.method;
    }

    public Contact getMyContactHeader() {
        if (this.contactHeader == null && this.contactHeaderStringified != null) {
            try {
                this.contactHeader = (Contact) new ContactParser(this.contactHeaderStringified).parse();
            } catch (ParseException e10) {
                logger.logError("error reparsing the contact header", e10);
            }
        }
        return this.contactHeader;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public b getOriginalDialog() {
        return this.originalDialog;
    }

    public long getOriginalLocalSequenceNumber() {
        return this.originalLocalSequenceNumber;
    }

    public RecordRouteList getOriginalRequestRecordRouteHeaders() {
        if (this.originalRequestRecordRouteHeaders == null && this.originalRequestRecordRouteHeadersString != null) {
            try {
                this.originalRequestRecordRouteHeaders = (RecordRouteList) new RecordRouteParser(this.originalRequestRecordRouteHeadersString).parse();
            } catch (ParseException e10) {
                logger.logError("error reparsing the originalRequest RecordRoute Headers", e10);
            }
            this.originalRequestRecordRouteHeadersString = null;
        }
        return this.originalRequestRecordRouteHeaders;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public ReleaseReferencesStrategy getReleaseReferencesStrategy() {
        return this.releaseReferencesStrategy;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2091a getRemoteParty() {
        if (this.remoteParty == null && this.remotePartyStringified != null) {
            try {
                this.remoteParty = new AddressParser(this.remotePartyStringified).address(true);
            } catch (ParseException e10) {
                logger.logError("error reparsing the remoteParty", e10);
            }
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("gettingRemoteParty " + this.remoteParty);
        }
        return this.remoteParty;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public long getRemoteSeqNumber() {
        return this.remoteSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public int getRemoteSequenceNumber() {
        return (int) this.remoteSequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public String getRemoteTag() {
        return this.hisTag;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public AbstractC2091a getRemoteTarget() {
        if (this.remoteTarget == null && this.remoteTargetStringified != null) {
            try {
                this.remoteTarget = new AddressParser(this.remoteTargetStringified).address(true);
            } catch (ParseException e10) {
                logger.logError("error reparsing the remoteTarget", e10);
            }
        }
        return this.remoteTarget;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public Iterator getRouteSet() {
        if (this.routeList == null) {
            return new LinkedList().listIterator();
        }
        return getRouteList().listIterator();
    }

    public SIPTransactionStack getStack() {
        return this.sipStack;
    }

    @Override // android.javax.sip.b
    public d getState() {
        int i10 = this.dialogState;
        if (i10 == -1) {
            return null;
        }
        d[] dVarArr = d.f24326Z;
        if (i10 >= 0 && i10 < 4) {
            return d.f24326Z[i10];
        }
        throw new IllegalArgumentException("Invalid dialogState value");
    }

    public boolean handleAck(SIPServerTransaction sIPServerTransaction) {
        if (isAckSeen() && getRemoteSeqNumber() == sIPServerTransaction.getCSeq()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::handleAck: ACK already seen by dialog -- dropping Ack retransmission");
            }
            acquireTimerTaskSem();
            try {
                if (this.timerTask != null) {
                    getStack().getTimer().cancel(this.timerTask);
                    this.timerTask = null;
                }
                return false;
            } finally {
                releaseTimerTaskSem();
            }
        } else if (getState() == d.f24329j0) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::handleAck: Dialog is terminated -- dropping ACK");
            }
            return false;
        } else {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("SIPDialog::handleAck: lastResponseCSeqNumber = " + this.lastInviteOkReceived + " ackTxCSeq " + sIPServerTransaction.getCSeq());
            }
            if (this.lastResponseStatusCode != null && this.lastInviteResponseCode / 100 == 2 && this.lastInviteResponseCSeqNumber == sIPServerTransaction.getCSeq()) {
                sIPServerTransaction.setDialog(this, this.lastResponseDialogId);
                ackReceived(sIPServerTransaction.getCSeq());
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::handleACK: ACK for 2XX response --- sending to TU ");
                    return true;
                }
                return true;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug(" INVITE transaction not found");
            }
            if (isBackToBackUserAgent()) {
                releaseAckSem();
            }
            return false;
        }
    }

    public boolean handlePrack(SIPRequest sIPRequest) {
        if (!isServer()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- not a server Dialog");
            }
            return false;
        }
        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) getFirstTransactionInt();
        if (sIPServerTransaction.getReliableProvisionalResponse() == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- ReliableResponse not found");
            }
            return false;
        }
        RAck rAck = (RAck) sIPRequest.getHeader(SIPHeaderNames.RACK);
        if (rAck == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- rack header not found");
            }
            return false;
        } else if (!rAck.getMethod().equals(sIPServerTransaction.getPendingReliableResponseMethod())) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- CSeq Header does not match PRACK");
            }
            return false;
        } else if (rAck.getCSeqNumberLong() != sIPServerTransaction.getPendingReliableCSeqNumber()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- CSeq Header does not match PRACK");
            }
            return false;
        } else if (rAck.getRSequenceNumber() != sIPServerTransaction.getPendingReliableRSeqNumber()) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping Prack -- RSeq Header does not match PRACK");
            }
            return false;
        } else {
            return sIPServerTransaction.prackRecieved();
        }
    }

    public int hashCode() {
        if (this.callIdHeader == null && this.callIdHeaderString == null) {
            return 0;
        }
        return getCallId().getCallId().hashCode();
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void incrementLocalSequenceNumber() {
        this.localSequenceNumber++;
    }

    public boolean isAckSeen() {
        if (this.lastAckReceivedCSeqNumber == null && this.lastResponseStatusCode.intValue() == 200) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("SIPDialog::isAckSeen:" + this + "lastAckReceived is null -- returning false");
            }
            return false;
        } else if (this.lastResponseMethod == null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("SIPDialog::isAckSeen:" + this + "lastResponse is null -- returning false");
            }
            return false;
        } else if (this.lastAckReceivedCSeqNumber == null && this.lastResponseStatusCode.intValue() / 100 > 2) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger3 = logger;
                stackLogger3.logDebug("SIPDialog::isAckSeen:" + this + "lastResponse statusCode " + this.lastResponseStatusCode);
            }
            return true;
        } else {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger4 = logger;
                stackLogger4.logDebug("SIPDialog::isAckSeen:lastAckReceivedCSeqNumber = " + this.lastAckReceivedCSeqNumber + " remoteCSeqNumber = " + getRemoteSeqNumber());
            }
            Long l10 = this.lastAckReceivedCSeqNumber;
            if (l10 == null || l10.longValue() < getRemoteSeqNumber()) {
                return false;
            }
            return true;
        }
    }

    public boolean isAckSent() {
        return isAckSent(-1L);
    }

    public boolean isAssigned() {
        return this.isAssigned;
    }

    public boolean isAtleastOneAckSent() {
        return this.isAcknowledged;
    }

    public boolean isBackToBackUserAgent() {
        return this.isBackToBackUserAgent;
    }

    public boolean isBlockedForReInvite() {
        if (this.ackSem.availablePermits() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public boolean isForked() {
        if (this.originalDialog != null) {
            return true;
        }
        return false;
    }

    public boolean isLastAckPresent() {
        if (this.lastAckSent != null) {
            return true;
        }
        return false;
    }

    public boolean isReInvite() {
        return this.reInviteFlag;
    }

    public synchronized boolean isRequestConsumable(SIPRequest sIPRequest) {
        if (!sIPRequest.getMethod().equals(TokenNames.ACK)) {
            boolean z10 = true;
            if (!isSequenceNumberValidation()) {
                return true;
            }
            if (this.remoteSequenceNumber >= sIPRequest.getCSeq().getSeqNumber()) {
                z10 = false;
            }
            return z10;
        }
        throw new RuntimeException("Illegal method");
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public boolean isSecure() {
        return this.firstTransactionSecure;
    }

    public boolean isSequenceNumberValidation() {
        return this.sequenceNumberValidation;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public boolean isServer() {
        if (!this.firstTransactionSeen) {
            return this.serverTransactionFlag;
        }
        return this.firstTransactionIsServerTransaction;
    }

    public boolean isTerminatedOnBye() {
        return this.terminateOnBye;
    }

    public void printDebugInfo() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("isServer = " + isServer());
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("localTag = " + getLocalTag());
            StackLogger stackLogger3 = logger;
            stackLogger3.logDebug("remoteTag = " + getRemoteTag());
            StackLogger stackLogger4 = logger;
            stackLogger4.logDebug("localSequenceNumer = " + getLocalSeqNumber());
            StackLogger stackLogger5 = logger;
            stackLogger5.logDebug("remoteSequenceNumer = " + getRemoteSeqNumber());
            StackLogger stackLogger6 = logger;
            stackLogger6.logDebug("ackLine:" + getRemoteTag() + Separators.SP + this.ackLine);
        }
    }

    public void releaseAckSem() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("releaseAckSem-enter]]" + this + " sem=" + this.ackSem + " b2bua=" + this.isBackToBackUserAgent);
            logger.logStackTrace();
        }
        if (this.isBackToBackUserAgent) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("releaseAckSem]]" + this + " sem=" + this.ackSem);
                logger.logStackTrace();
            }
            if (this.ackSem.availablePermits() == 0) {
                this.ackSem.release();
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("releaseAckSem]]" + this + " sem=" + this.ackSem);
                }
            }
        }
    }

    public void releaseTimerTaskSem() {
        this.timerTaskLock.release();
    }

    public void removeEventListener(SIPDialogEventListener sIPDialogEventListener) {
        this.eventListeners.remove(sIPDialogEventListener);
    }

    public synchronized void requestConsumed() {
        this.nextSeqno = getRemoteSeqNumber() + 1;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Request Consumed -- next consumable Request Seqno = " + this.nextSeqno);
        }
    }

    public void resendAck() {
        ACKWrapper aCKWrapper = this.lastAckSent;
        if (aCKWrapper != null) {
            AbstractC2561b reparseRequest = aCKWrapper.reparseRequest();
            if (reparseRequest.getHeader(SIPHeaderNames.TIMESTAMP) != null && this.sipStack.generateTimeStampHeader) {
                TimeStamp timeStamp = new TimeStamp();
                try {
                    timeStamp.setTimeStamp((float) System.currentTimeMillis());
                    reparseRequest.setHeader(timeStamp);
                } catch (g unused) {
                }
            }
            sendAck(reparseRequest, false);
        } else if (logger.isLoggingEnabled(32)) {
            logger.logDebug("SIPDialog::resendAck:lastAck sent is NULL hence not resending ACK");
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void sendAck(AbstractC2561b abstractC2561b) {
        sendAck(abstractC2561b, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r4 == false) goto L20;
     */
    @Override // android.gov.nist.javax.sip.DialogExt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendReliableProvisionalResponse(AbstractC2562c abstractC2562c) {
        if (isServer()) {
            SIPResponse sIPResponse = (SIPResponse) abstractC2562c;
            if (abstractC2562c.getStatusCode() != 100) {
                if (abstractC2562c.getStatusCode() / 100 <= 2) {
                    if (sIPResponse.getToTag() != null) {
                        ListIterator headers = abstractC2562c.getHeaders(SIPHeaderNames.REQUIRE);
                        if (headers != null) {
                            boolean z10 = false;
                            while (headers.hasNext() && !z10) {
                                if (((T) headers.next()).getOptionTag().equalsIgnoreCase("100rel")) {
                                    z10 = true;
                                }
                            }
                        }
                        abstractC2562c.addHeader(new Require("100rel"));
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Require header with optionTag 100rel is needed -- adding one");
                        }
                        SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) getFirstTransactionInt();
                        setLastResponse(sIPServerTransaction, sIPResponse);
                        setDialogId(sIPResponse.getDialogId(true));
                        sIPServerTransaction.sendReliableProvisionalResponse(abstractC2562c);
                        startRetransmitTimer(sIPServerTransaction, abstractC2562c);
                        return;
                    }
                    throw new n("Badly formatted response -- To tag mandatory for Reliable Provisional Response");
                }
                throw new n("Response code is not a 1xx response - should be in the range 101 to 199 ");
            }
            throw new n("Cannot send 100 as a reliable provisional response");
        }
        throw new n("Not a Server Dialog");
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void sendRequest(a aVar) {
        sendRequest(aVar, !this.isBackToBackUserAgent);
    }

    public void setAckSendingStrategy(AckSendingStrategy ackSendingStrategy) {
        this.ackSendingStrategy = ackSendingStrategy;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setApplicationData(Object obj) {
        this.applicationData = obj;
    }

    public void setAssigned() {
        this.isAssigned = true;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setBackToBackUserAgent() {
        this.isBackToBackUserAgent = true;
    }

    public void setDialogId(String str) {
        SIPTransaction sIPTransaction = this.firstTransaction;
        if (sIPTransaction != null) {
            sIPTransaction.setDialog(this, str);
        }
        this.dialogId = str;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setEarlyDialogTimeoutSeconds(int i10) {
        if (i10 > 0) {
            this.earlyDialogTimeout = i10;
            return;
        }
        throw new IllegalArgumentException(android.gov.nist.core.a.e("Invalid value ", i10));
    }

    public void setEventHeader(AbstractC2264t abstractC2264t) {
        this.eventHeader = abstractC2264t;
    }

    public void setLastResponse(SIPTransaction sIPTransaction, SIPResponse sIPResponse) {
        Throwable th2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        this.callIdHeader = sIPResponse.getCallId();
        int statusCode = sIPResponse.getStatusCode();
        if (statusCode == 100) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Invalid status code - 100 in setLastResponse - ignoring");
                return;
            }
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
        }
        try {
            this.lastResponseStatusCode = Integer.valueOf(statusCode);
            this.lastResponseTopMostVia = (Via) sIPResponse.getTopmostVia().clone();
            String method = sIPResponse.getCSeqHeader().getMethod();
            this.lastResponseMethod = method;
            long seqNumber = sIPResponse.getCSeq().getSeqNumber();
            if (statusCode / 100 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = z10;
            if (statusCode / 100 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.lastResponseCSeqNumber = seqNumber;
            if (TokenNames.INVITE.equals(method)) {
                this.lastInviteResponseCSeqNumber = seqNumber;
                this.lastInviteResponseCode = statusCode;
            }
            if (sIPResponse.getToTag() != null) {
                this.lastResponseToTag = sIPResponse.getToTag();
            }
            if (sIPResponse.getFromTag() != null) {
                this.lastResponseFromTag = sIPResponse.getFromTag();
            }
            if (sIPTransaction != null) {
                this.lastResponseDialogId = sIPResponse.getDialogId(sIPTransaction.isServerTransaction());
            }
            setAssigned();
            try {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("sipDialog: setLastResponse:" + this + " lastResponse = " + this.lastResponseStatusCode + " response " + sIPResponse.toString() + " topMostViaHeader " + this.lastResponseTopMostVia);
                }
                d state = getState();
                d dVar = d.f24329j0;
                if (state == dVar) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("sipDialog: setLastResponse -- dialog is terminated - ignoring ");
                    }
                    if (method.equals(TokenNames.INVITE) && statusCode == 200) {
                        this.lastInviteOkReceived = Math.max(seqNumber, this.lastInviteOkReceived);
                    }
                    if (sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) && sIPTransaction != null && (sIPTransaction instanceof a) && getState() != dVar) {
                        acquireTimerTaskSem();
                        try {
                            if (getState() == d.f24327h0) {
                                if (this.earlyStateTimerTask != null) {
                                    this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                }
                                logger.logDebug("EarlyStateTimerTask craeted " + (this.earlyDialogTimeout * 1000));
                                this.earlyStateTimerTask = new EarlyStateTimerTask();
                                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                                    this.sipStack.getTimer().schedule(this.earlyStateTimerTask, this.earlyDialogTimeout * 1000);
                                }
                            } else if (this.earlyStateTimerTask != null) {
                                this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                this.earlyStateTimerTask = null;
                            }
                            releaseTimerTaskSem();
                            return;
                        } finally {
                        }
                    }
                    return;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                    logger.logDebug("cseqMethod = " + method);
                    logger.logDebug("dialogState = " + getState());
                    logger.logDebug("method = " + getMethod());
                    logger.logDebug("statusCode = " + statusCode);
                    logger.logDebug("transaction = " + sIPTransaction);
                }
                try {
                    if (sIPTransaction != null && !(sIPTransaction instanceof a)) {
                        if (method.equals(TokenNames.BYE) && z11 && isTerminatedOnBye()) {
                            setState(3);
                        } else {
                            if (getLocalTag() == null && sIPResponse.getTo().getTag() != null && SIPTransactionStack.isDialogCreated(method) && method.equals(getMethod())) {
                                setLocalTag(sIPResponse.getTo().getTag());
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z11) {
                                if (z14) {
                                    if (z12) {
                                        setState(0);
                                        setDialogId(sIPResponse.getDialogId(true));
                                        this.sipStack.putDialog(this);
                                    }
                                } else if (statusCode == 489 && (method.equals(TokenNames.NOTIFY) || method.equals(TokenNames.SUBSCRIBE))) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("RFC 3265 : Not setting dialog to TERMINATED for 489");
                                    }
                                } else if (!isReInvite() && getState() != d.f24328i0) {
                                    setState(3);
                                }
                            } else {
                                if (this.dialogState <= 0 && (method.equals(TokenNames.INVITE) || method.equals(TokenNames.SUBSCRIBE) || method.equals("REFER"))) {
                                    z13 = true;
                                    setState(1);
                                } else {
                                    z13 = true;
                                }
                                if (z12) {
                                    setDialogId(sIPResponse.getDialogId(z13));
                                    this.sipStack.putDialog(this);
                                }
                            }
                        }
                    } else if (SIPTransactionStack.isDialogCreated(method)) {
                        if (getState() == null && z14) {
                            setState(0);
                            if ((sIPResponse.getToTag() != null || this.sipStack.rfc2543Supported) && getRemoteTag() == null) {
                                setRemoteTag(sIPResponse.getToTag());
                                setDialogId(sIPResponse.getDialogId(false));
                                this.sipStack.putDialog(this);
                                addRoute(sIPResponse);
                            }
                        } else if (getState() != null && getState().equals(d.f24327h0) && z14) {
                            if (method.equals(getMethod()) && sIPTransaction != null && (sIPResponse.getToTag() != null || this.sipStack.rfc2543Supported)) {
                                setRemoteTag(sIPResponse.getToTag());
                                setDialogId(sIPResponse.getDialogId(false));
                                this.sipStack.putDialog(this);
                                addRoute(sIPResponse);
                            }
                        } else if (z11) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("pendingRouteUpdateOn202Response : " + this.pendingRouteUpdateOn202Response);
                            }
                            if (method.equals(getMethod()) && (sIPResponse.getToTag() != null || this.sipStack.rfc2543Supported)) {
                                d state2 = getState();
                                d dVar2 = d.f24328i0;
                                if (state2 != dVar2 || (getState() == dVar2 && method.equals(TokenNames.SUBSCRIBE) && this.pendingRouteUpdateOn202Response && z11)) {
                                    if (getState() != dVar2) {
                                        setRemoteTag(sIPResponse.getToTag());
                                        setDialogId(sIPResponse.getDialogId(false));
                                        this.sipStack.putDialog(this);
                                        addRoute(sIPResponse);
                                        setState(1);
                                    }
                                    if (method.equals(TokenNames.SUBSCRIBE) && z11 && this.pendingRouteUpdateOn202Response) {
                                        setRemoteTag(sIPResponse.getToTag());
                                        addRoute(sIPResponse);
                                        this.pendingRouteUpdateOn202Response = false;
                                    }
                                }
                            }
                            if (method.equals(TokenNames.INVITE)) {
                                this.lastInviteOkReceived = Math.max(seqNumber, this.lastInviteOkReceived);
                                if (getState() != null && getState().f24330Y == 1 && sIPTransaction != null) {
                                    doTargetRefresh(sIPResponse);
                                }
                            }
                        } else if (statusCode >= 300 && statusCode <= 699 && (getState() == null || (method.equals(getMethod()) && getState().f24330Y == 0))) {
                            setState(3);
                        }
                        if (getState() != d.f24328i0 && getState() != dVar && getOriginalRequestRecordRouteHeaders() != null) {
                            ListIterator<RecordRoute> listIterator = getOriginalRequestRecordRouteHeaders().listIterator(getOriginalRequestRecordRouteHeaders().size());
                            while (listIterator.hasPrevious()) {
                                RecordRoute previous = listIterator.previous();
                                Route route = (Route) this.routeList.getFirst();
                                if (route == null || !previous.getAddress().equals(route.getAddress())) {
                                    break;
                                }
                                this.routeList.removeFirst();
                            }
                        }
                    } else if (method.equals(TokenNames.NOTIFY) && ((getMethod().equals(TokenNames.SUBSCRIBE) || getMethod().equals("REFER")) && z11 && getState() == null)) {
                        setDialogId(sIPResponse.getDialogId(true));
                        this.sipStack.putDialog(this);
                        setState(1);
                    } else if (method.equals(TokenNames.BYE) && z11 && isTerminatedOnBye()) {
                        setState(3);
                    }
                    if (sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) && sIPTransaction != null && (sIPTransaction instanceof a) && getState() != d.f24329j0) {
                        acquireTimerTaskSem();
                        try {
                            if (getState() == d.f24327h0) {
                                if (this.earlyStateTimerTask != null) {
                                    this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                }
                                logger.logDebug("EarlyStateTimerTask craeted " + (this.earlyDialogTimeout * 1000));
                                this.earlyStateTimerTask = new EarlyStateTimerTask();
                                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                                    this.sipStack.getTimer().schedule(this.earlyStateTimerTask, this.earlyDialogTimeout * 1000);
                                }
                            } else if (this.earlyStateTimerTask != null) {
                                this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                this.earlyStateTimerTask = null;
                            }
                            releaseTimerTaskSem();
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    if (sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) && sIPTransaction != null && (sIPTransaction instanceof a) && getState() != d.f24329j0) {
                        acquireTimerTaskSem();
                        try {
                            if (getState() == d.f24327h0) {
                                if (this.earlyStateTimerTask != null) {
                                    this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                }
                                logger.logDebug("EarlyStateTimerTask craeted " + (this.earlyDialogTimeout * 1000));
                                this.earlyStateTimerTask = new EarlyStateTimerTask();
                                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                                    this.sipStack.getTimer().schedule(this.earlyStateTimerTask, this.earlyDialogTimeout * 1000);
                                }
                            } else if (this.earlyStateTimerTask != null) {
                                this.sipStack.getTimer().cancel(this.earlyStateTimerTask);
                                this.earlyStateTimerTask = null;
                            }
                            releaseTimerTaskSem();
                        } finally {
                            releaseTimerTaskSem();
                        }
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public void setLocalParty(SIPMessage sIPMessage) {
        if (!isServer()) {
            this.localParty = sIPMessage.getFrom().getAddress();
        } else {
            this.localParty = sIPMessage.getTo().getAddress();
        }
    }

    public void setLocalTag(String str) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("set Local tag " + str + " dialog = " + this);
            logger.logStackTrace();
        }
        this.myTag = str;
    }

    public void setOriginalDialog(SIPDialog sIPDialog) {
        this.originalDialog = sIPDialog;
    }

    public void setPendingRouteUpdateOn202Response(SIPRequest sIPRequest) {
        this.pendingRouteUpdateOn202Response = true;
        String tag = sIPRequest.getFromHeader().getTag();
        if (tag != null) {
            setRemoteTag(tag);
        }
    }

    public void setReInviteFlag(boolean z10) {
        this.reInviteFlag = z10;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy) {
        this.releaseReferencesStrategy = releaseReferencesStrategy;
    }

    public void setRemoteParty(SIPMessage sIPMessage) {
        if (!isServer()) {
            this.remoteParty = sIPMessage.getTo().getAddress();
        } else {
            this.remoteParty = sIPMessage.getFrom().getAddress();
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("settingRemoteParty " + this.remoteParty);
        }
    }

    public void setRemoteSequenceNumber(long j6) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setRemoteSeqno " + this + Separators.SLASH + j6);
        }
        this.remoteSequenceNumber = j6;
    }

    public void setRemoteTag(String str) {
        boolean z10;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setRemoteTag(): " + this + " remoteTag = " + this.hisTag + " new tag = " + str);
        }
        String str2 = this.hisTag;
        if (str2 != null && str != null && !str.equals(str2)) {
            if (getState() != d.f24327h0) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Dialog is already established -- ignoring remote tag re-assignment");
                }
            } else if (this.sipStack.isRemoteTagReassignmentAllowed()) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("UNSAFE OPERATION !  tag re-assignment " + this.hisTag + " trying to set to " + str + " can cause unexpected effects ");
                }
                if (this.sipStack.getDialog(this.dialogId) == this) {
                    this.sipStack.removeDialog(this.dialogId);
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.dialogId = null;
                this.hisTag = str;
                if (z10) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("ReInserting Dialog");
                    }
                    this.sipStack.putDialog(this);
                }
            }
        } else if (str != null) {
            this.hisTag = str;
        } else if (logger.isLoggingEnabled()) {
            logger.logWarning("setRemoteTag : called with null argument ");
        }
    }

    public void setRemoteTarget(AbstractC2257l abstractC2257l) {
        this.remoteTarget = abstractC2257l.getAddress();
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Dialog.setRemoteTarget: " + this.remoteTarget);
            logger.logStackTrace();
        }
    }

    public void setResponseTags(SIPResponse sIPResponse) {
        if (getLocalTag() == null && getRemoteTag() == null) {
            String fromTag = sIPResponse.getFromTag();
            if (fromTag != null) {
                if (fromTag.equals(getLocalTag())) {
                    sIPResponse.setToTag(getRemoteTag());
                } else if (fromTag.equals(getRemoteTag())) {
                    sIPResponse.setToTag(getLocalTag());
                }
            } else if (logger.isLoggingEnabled()) {
                logger.logWarning("No from tag in response! Not RFC 3261 compatible.");
            }
        }
    }

    public void setRetransmissionTicks() {
        this.retransmissionTicksLeft = 1;
        this.prevRetransmissionTicks = 1;
    }

    public void setRouteList(RouteList routeList) {
        this.routeList = routeList;
    }

    public void setServerTransactionFlag(boolean z10) {
        this.serverTransactionFlag = z10;
    }

    public void setSipProvider(SipProviderImpl sipProviderImpl) {
        this.sipProvider = sipProviderImpl;
    }

    public void setStack(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
    }

    public void setState(int i10) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("SIPDialog::setState:Setting dialog state for " + this + "newState = " + i10);
            logger.logStackTrace();
            if (i10 != -1 && i10 != this.dialogState && logger.isLoggingEnabled()) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("SIPDialog::setState:" + this + "  old dialog state is " + getState());
                StackLogger stackLogger3 = logger;
                StringBuilder sb2 = new StringBuilder("SIPDialog::setState:");
                sb2.append(this);
                sb2.append("  New dialog state is ");
                d[] dVarArr = d.f24326Z;
                if (i10 >= 0 && i10 < 4) {
                    sb2.append(d.f24326Z[i10]);
                    stackLogger3.logDebug(sb2.toString());
                } else {
                    throw new IllegalArgumentException("Invalid dialogState value");
                }
            }
        }
        if (i10 == 0) {
            addEventListener(getSipProvider());
        }
        this.dialogState = i10;
        if (i10 == 3) {
            removeEventListener(getSipProvider());
            if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                if (this.sipStack.getConnectionLingerTimer() > 0) {
                    this.sipStack.getTimer().schedule(new LingerTimer(), this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    new LingerTimer().runTask();
                }
            }
            stopTimer();
        }
    }

    public void startRetransmitTimer(SIPServerTransaction sIPServerTransaction, AbstractC2562c abstractC2562c) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("startRetransmitTimer() " + abstractC2562c.getStatusCode() + " method " + sIPServerTransaction.getMethod());
        }
        if (sIPServerTransaction.isInviteTransaction() && abstractC2562c.getStatusCode() / 100 == 2) {
            startTimer(sIPServerTransaction);
        }
    }

    public void startTimer(SIPServerTransaction sIPServerTransaction) {
        DialogTimerTask dialogTimerTask = this.timerTask;
        if (dialogTimerTask != null && dialogTimerTask.transaction == sIPServerTransaction) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Timer already running for " + getDialogId());
                return;
            }
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("Starting dialog timer for " + getDialogId());
        }
        acquireTimerTaskSem();
        try {
            DialogTimerTask dialogTimerTask2 = this.timerTask;
            if (dialogTimerTask2 != null) {
                dialogTimerTask2.transaction = sIPServerTransaction;
            } else {
                this.timerTask = new DialogTimerTask(sIPServerTransaction);
                if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                    this.sipStack.getTimer().scheduleWithFixedDelay(this.timerTask, sIPServerTransaction.getBaseTimerInterval(), sIPServerTransaction.getBaseTimerInterval());
                }
            }
            releaseTimerTaskSem();
            setRetransmissionTicks();
        } catch (Throwable th2) {
            releaseTimerTaskSem();
            throw th2;
        }
    }

    public void stopTimer() {
        try {
            acquireTimerTaskSem();
            if (this.timerTask != null) {
                getStack().getTimer().cancel(this.timerTask);
                this.timerTask = null;
            }
            if (this.earlyStateTimerTask != null) {
                getStack().getTimer().cancel(this.earlyStateTimerTask);
                this.earlyStateTimerTask = null;
            }
            releaseTimerTaskSem();
        } catch (Exception unused) {
        }
    }

    public void storeFirstTransactionInfo(SIPDialog sIPDialog, SIPTransaction sIPTransaction) {
        Contact contact;
        sIPDialog.firstTransactionSeen = true;
        sIPDialog.firstTransaction = sIPTransaction;
        boolean isServerTransaction = sIPTransaction.isServerTransaction();
        sIPDialog.firstTransactionIsServerTransaction = isServerTransaction;
        if (isServerTransaction) {
            sIPDialog.firstTransactionSecure = sIPTransaction.getRequest().getRequestURI().getScheme().equalsIgnoreCase("sips");
        } else {
            sIPDialog.firstTransactionSecure = ((SIPClientTransaction) sIPTransaction).getOriginalRequestScheme().equalsIgnoreCase("sips");
        }
        sIPDialog.firstTransactionPort = sIPTransaction.getPort();
        sIPDialog.firstTransactionId = sIPTransaction.getBranchId();
        String method = sIPTransaction.getMethod();
        sIPDialog.firstTransactionMethod = method;
        if ((sIPTransaction instanceof SIPServerTransaction) && method.equals(TokenNames.INVITE)) {
            this.sipStack.removeMergeDialog(this.firstTransactionMergeId);
            sIPDialog.firstTransactionMergeId = sIPTransaction.getMergeId();
            this.sipStack.putMergeDialog(this);
        }
        if (sIPTransaction.isServerTransaction()) {
            SIPResponse lastResponse = ((SIPServerTransaction) sIPTransaction).getLastResponse();
            if (lastResponse != null) {
                contact = lastResponse.getContactHeader();
            } else {
                contact = null;
            }
            sIPDialog.contactHeader = contact;
        } else {
            sIPDialog.contactHeader = ((SIPClientTransaction) sIPTransaction).getOriginalRequestContact();
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("firstTransaction = " + sIPDialog.firstTransaction);
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("firstTransactionIsServerTransaction = " + this.firstTransactionIsServerTransaction);
            StackLogger stackLogger3 = logger;
            stackLogger3.logDebug("firstTransactionSecure = " + this.firstTransactionSecure);
            StackLogger stackLogger4 = logger;
            stackLogger4.logDebug("firstTransactionPort = " + this.firstTransactionPort);
            StackLogger stackLogger5 = logger;
            stackLogger5.logDebug("firstTransactionId = " + this.firstTransactionId);
            StackLogger stackLogger6 = logger;
            stackLogger6.logDebug("firstTransactionMethod = " + this.firstTransactionMethod);
            StackLogger stackLogger7 = logger;
            stackLogger7.logDebug("firstTransactionMergeId = " + this.firstTransactionMergeId);
        }
    }

    public boolean takeAckSem() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("[takeAckSem " + this + " sem=" + this.ackSem);
        }
        try {
            if (!this.ackSem.tryAcquire(2L, TimeUnit.SECONDS)) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Cannot aquire ACK semaphore ");
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Semaphore previously acquired at " + this.stackTrace + " sem=" + this.ackSem);
                    logger.logStackTrace();
                }
                return false;
            } else if (logger.isLoggingEnabled(32)) {
                recordStackTrace();
                return true;
            } else {
                return true;
            }
        } catch (InterruptedException unused) {
            logger.logError("Cannot aquire ACK semaphore");
            return false;
        }
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public void terminateOnBye(boolean z10) {
        this.terminateOnBye = z10;
    }

    public synchronized boolean testAndSetIsDialogTerminatedEventDelivered() {
        boolean z10;
        z10 = this.dialogTerminatedEventDelivered;
        this.dialogTerminatedEventDelivered = true;
        return z10;
    }

    @Override // android.gov.nist.javax.sip.DialogExt
    public SipProviderImpl getSipProvider() {
        return this.sipProvider;
    }

    public boolean isAckSent(long j6) {
        if (getLastTransaction() != null && (getLastTransaction() instanceof a)) {
            return this.lastAckSent != null && j6 <= getLastAckSentCSeq().getSeqNumber();
        }
        return true;
    }

    public void sendRequest(a aVar, boolean z10) {
        if (aVar != null) {
            if (!z10 && aVar.getRequest().getMethod().equals(TokenNames.INVITE)) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::sendRequest " + this + " clientTransaction = " + aVar);
                }
                this.sipStack.getReinviteExecutor().execute(new ReInviteSender(aVar));
                return;
            }
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) aVar;
            SIPRequest originalRequest = sIPClientTransaction.getOriginalRequest();
            this.proxyAuthorizationHeader = (AbstractC2239K) originalRequest.getHeader(SIPHeaderNames.PROXY_AUTHORIZATION);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("SIPDialog::sendRequest:dialog.sendRequest  dialog = " + this + "\ndialogRequest = \n" + originalRequest);
            }
            if (!originalRequest.getMethod().equals(TokenNames.ACK) && !originalRequest.getMethod().equals("CANCEL")) {
                if (this.byeSent && isTerminatedOnBye() && !originalRequest.getMethod().equals(TokenNames.BYE)) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("BYE already sent for " + this);
                    }
                    throw new n("Cannot send request; BYE already sent");
                }
                if (originalRequest.getTopmostVia() == null) {
                    originalRequest.addHeader(sIPClientTransaction.getOutgoingViaHeader());
                }
                if (!getCallId().getCallId().equalsIgnoreCase(originalRequest.getCallId().getCallId())) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("CallID " + getCallId());
                        logger.logError("SIPDialog::sendRequest:RequestCallID = " + originalRequest.getCallId().getCallId());
                        logger.logError("dialog =  " + this);
                    }
                    throw new n("Bad call ID in request");
                }
                sIPClientTransaction.setDialog(this, this.dialogId);
                addTransaction((SIPTransaction) aVar);
                sIPClientTransaction.setTransactionMapped(true);
                From from = (From) originalRequest.getFrom();
                To to = (To) originalRequest.getTo();
                if (getLocalTag() != null && from.getTag() != null && !from.getTag().equals(getLocalTag())) {
                    throw new n("From tag mismatch expecting  " + getLocalTag());
                }
                if (getRemoteTag() != null && to.getTag() != null && !to.getTag().equals(getRemoteTag()) && logger.isLoggingEnabled()) {
                    logger.logWarning("SIPDialog::sendRequest:To header tag mismatch expecting " + getRemoteTag());
                }
                if (getLocalTag() == null && originalRequest.getMethod().equals(TokenNames.NOTIFY)) {
                    if (getMethod().equals(TokenNames.SUBSCRIBE)) {
                        setLocalTag(from.getTag());
                    } else {
                        throw new n("Trying to send NOTIFY without SUBSCRIBE Dialog!");
                    }
                }
                try {
                    if (getLocalTag() != null) {
                        from.setTag(getLocalTag());
                    }
                    if (getRemoteTag() != null) {
                        to.setTag(getRemoteTag());
                    }
                } catch (ParseException e10) {
                    InternalErrorHandler.handleException(e10);
                }
                AbstractC2092b nextHop = sIPClientTransaction.getNextHop();
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("SIPDialog::sendRequest:Using hop = " + nextHop.getHost() + " : " + nextHop.getPort());
                }
                try {
                    MessageChannel createRawMessageChannel = this.sipStack.createRawMessageChannel(getSipProvider().getListeningPoint(nextHop.getTransport()).getIPAddress(), this.firstTransactionPort, nextHop);
                    MessageChannel messageChannel = ((SIPClientTransaction) aVar).getMessageChannel();
                    messageChannel.uncache();
                    if (!this.sipStack.cacheClientConnections) {
                        messageChannel.useCount--;
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("SIPDialog::sendRequest:oldChannel: useCount " + messageChannel.useCount);
                        }
                    }
                    if (createRawMessageChannel == null) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Null message channel using outbound proxy !");
                        }
                        AbstractC2092b outboundProxy = this.sipStack.getRouter(originalRequest).getOutboundProxy();
                        if (outboundProxy != null) {
                            createRawMessageChannel = this.sipStack.createRawMessageChannel(getSipProvider().getListeningPoint(outboundProxy.getTransport()).getIPAddress(), this.firstTransactionPort, outboundProxy);
                            if (createRawMessageChannel != null) {
                                ((SIPClientTransaction) aVar).setEncapsulatedChannel(createRawMessageChannel);
                            }
                        } else {
                            throw new n("No route found! hop=" + nextHop);
                        }
                    } else {
                        ((SIPClientTransaction) aVar).setEncapsulatedChannel(createRawMessageChannel);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("SIPDialog::sendRequest:using message channel " + createRawMessageChannel);
                        }
                    }
                    if (createRawMessageChannel != null) {
                        createRawMessageChannel.useCount++;
                    }
                    if (!this.sipStack.cacheClientConnections && messageChannel.useCount <= 0) {
                        messageChannel.close();
                    }
                    try {
                        long localSeqNumber = originalRequest.getCSeq() == null ? getLocalSeqNumber() : originalRequest.getCSeq().getSeqNumber();
                        if (localSeqNumber > getLocalSeqNumber()) {
                            setLocalSequenceNumber(localSeqNumber);
                        } else {
                            setLocalSequenceNumber(getLocalSeqNumber() + 1);
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("SIPDialog::sendRequest:setting Seq Number to " + getLocalSeqNumber());
                        }
                        originalRequest.getCSeq().setSeqNumber(getLocalSeqNumber());
                    } catch (g e11) {
                        logger.logFatalError(e11.getMessage());
                    }
                    try {
                        ((SIPClientTransaction) aVar).sendMessage(originalRequest);
                        if (!originalRequest.getMethod().equals(TokenNames.BYE)) {
                            return;
                        }
                        this.byeSent = true;
                        if (!isTerminatedOnBye()) {
                            return;
                        }
                        setState(3);
                        return;
                    } catch (IOException e12) {
                        throw new n("error sending message", e12);
                    }
                } catch (Exception e13) {
                    if (logger.isLoggingEnabled()) {
                        logger.logException(e13);
                    }
                    throw new n("Could not create message channel", e13);
                }
            }
            throw new n("Bad Request Method. " + originalRequest.getMethod());
        }
        throw new NullPointerException("null parameter");
    }

    private void sendAck(AbstractC2561b abstractC2561b, boolean z10) {
        SIPRequest sIPRequest = (SIPRequest) abstractC2561b;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("sendAck" + this);
        }
        if (sIPRequest.getMethod().equals(TokenNames.ACK)) {
            if (getState() != null && getState().f24330Y != 0) {
                if (!getCallId().getCallId().equals(sIPRequest.getCallId().getCallId())) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logError("CallID " + getCallId());
                        logger.logError("RequestCallID = " + sIPRequest.getCallId().getCallId());
                        logger.logError("dialog =  " + this);
                    }
                    throw new n("Bad call ID in request");
                }
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("setting from tag For outgoing ACK= " + getLocalTag());
                        logger.logDebug("setting To tag for outgoing ACK = " + getRemoteTag());
                        logger.logDebug("ack = " + sIPRequest);
                    }
                    if (getLocalTag() != null) {
                        sIPRequest.getFrom().setTag(getLocalTag());
                    }
                    if (getRemoteTag() != null) {
                        sIPRequest.getTo().setTag(getRemoteTag());
                    }
                    boolean z11 = !isAckSent(sIPRequest.getCSeq().getSeqNumber());
                    setLastAckSent(sIPRequest);
                    try {
                        this.ackSendingStrategy.send(sIPRequest);
                        this.isAcknowledged = true;
                        this.highestSequenceNumberAcknowledged = Math.max(this.highestSequenceNumberAcknowledged, sIPRequest.getCSeq().getSeqNumber());
                        if (z11 && this.isBackToBackUserAgent) {
                            releaseAckSem();
                        } else if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Not releasing ack sem for " + this + " isAckSent " + z11);
                        }
                    } catch (n e10) {
                        if (logger.isLoggingEnabled()) {
                            logger.logException(e10);
                        }
                        throw e10;
                    } catch (IOException e11) {
                        if (!z10) {
                            AbstractC2092b lastHop = this.ackSendingStrategy.getLastHop();
                            if (lastHop == null) {
                                lastHop = this.sipStack.getNextHop(sIPRequest);
                            }
                            raiseIOException(lastHop.getHost(), lastHop.getPort(), lastHop.getTransport());
                        } else {
                            throw new n("Could not send ack", e11);
                        }
                    } catch (Exception e12) {
                        if (logger.isLoggingEnabled()) {
                            logger.logException(e12);
                        }
                        throw new n("Could not create message channel", e12);
                    }
                    if (this.dialogDeleteTask == null) {
                        return;
                    }
                    getStack().getTimer().cancel(this.dialogDeleteTask);
                    this.dialogDeleteTask = null;
                    return;
                } catch (ParseException e13) {
                    throw new n(e13.getMessage());
                }
            }
            if (logger.isLoggingEnabled(4)) {
                logger.logError("Bad Dialog State for " + this + " dialogID = " + getDialogId());
            }
            throw new n("Bad dialog state " + getState());
        }
        throw new n("Bad request method -- should be ACK");
    }

    private SIPRequest createRequest(String str, String str2) {
        SipUri sipUri;
        AbstractC2268x abstractC2268x;
        AbstractC2268x abstractC2268x2;
        if (str != null && str2 != null) {
            if (!str.equals("CANCEL")) {
                if (getState() != null && ((getState().f24330Y != 3 || str.equalsIgnoreCase(TokenNames.BYE)) && (!isServer() || getState().f24330Y != 0 || !str.equalsIgnoreCase(TokenNames.BYE)))) {
                    if (getRemoteTarget() != null) {
                        sipUri = (SipUri) getRemoteTarget().getURI().clone();
                    } else {
                        sipUri = (SipUri) getRemoteParty().getURI().clone();
                        sipUri.clearUriParms();
                    }
                    SipUri sipUri2 = sipUri;
                    CSeq cSeq = new CSeq();
                    try {
                        cSeq.setMethod(str);
                        cSeq.setSeqNumber(getLocalSeqNumber());
                    } catch (Exception e10) {
                        if (logger.isLoggingEnabled()) {
                            logger.logError("Unexpected error");
                        }
                        InternalErrorHandler.handleException(e10);
                    }
                    ListeningPointImpl listeningPointImpl = (ListeningPointImpl) this.sipProvider.getListeningPoint(str2);
                    if (listeningPointImpl == null) {
                        if (logger.isLoggingEnabled()) {
                            logger.logError("Cannot find listening point for transport ".concat(str2));
                        }
                        throw new n("Cannot find listening point for transport ".concat(str2));
                    }
                    Via viaHeader = listeningPointImpl.getViaHeader();
                    From from = new From();
                    from.setAddress(getLocalParty());
                    To to = new To();
                    to.setAddress(getRemoteParty());
                    SIPRequest createRequest = createRequest(sipUri2, viaHeader, cSeq, from, to);
                    if (SIPRequest.isTargetRefresh(str)) {
                        AbstractC2257l createContactHeader = ((ListeningPointImpl) this.sipProvider.getListeningPoint(listeningPointImpl.getTransport())).createContactHeader();
                        ((AbstractC2094d) createContactHeader.getAddress().getURI()).setSecure(isSecure());
                        createRequest.setHeader(createContactHeader);
                    }
                    try {
                        CSeq cSeq2 = (CSeq) createRequest.getCSeq();
                        cSeq2.setSeqNumber(getLocalSeqNumber() + 1);
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger = logger;
                            stackLogger.logDebug("SIPDialog::createRequest:setting Request Seq Number to " + cSeq2.getSeqNumber());
                        }
                    } catch (g e11) {
                        InternalErrorHandler.handleException(e11);
                    }
                    if (str.equals(TokenNames.SUBSCRIBE) && (abstractC2268x2 = this.eventHeader) != null) {
                        createRequest.addHeader(abstractC2268x2);
                    }
                    if (str.equals(TokenNames.NOTIFY) && (abstractC2268x = this.eventHeader) != null) {
                        createRequest.addHeader(abstractC2268x);
                    }
                    try {
                        if (getLocalTag() != null) {
                            from.setTag(getLocalTag());
                        } else {
                            from.removeTag();
                        }
                        if (getRemoteTag() != null) {
                            to.setTag(getRemoteTag());
                        } else {
                            to.removeTag();
                        }
                    } catch (ParseException e12) {
                        InternalErrorHandler.handleException(e12);
                    }
                    updateRequest(createRequest);
                    return createRequest;
                }
                throw new n("Dialog  " + getDialogId() + " not yet established or terminated " + getState());
            }
            throw new n("Dialog.createRequest(): Invalid request");
        }
        throw new NullPointerException("null argument");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseErrorEvent(int i10) {
        raiseErrorEvent(i10, null);
    }

    public SIPDialog(SIPTransaction sIPTransaction) {
        this(sIPTransaction.getSipProvider());
        SIPRequest sIPRequest = (SIPRequest) sIPTransaction.getRequest();
        this.callIdHeader = sIPRequest.getCallId();
        this.earlyDialogId = sIPRequest.getDialogId(false);
        this.sipStack = sIPTransaction.getSIPStack();
        SipProviderImpl sipProvider = sIPTransaction.getSipProvider();
        this.sipProvider = sipProvider;
        if (sipProvider != null) {
            this.isBackToBackUserAgent = this.sipStack.isBackToBackUserAgent;
            addTransaction(sIPTransaction);
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Creating a dialog : " + this);
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("provider port = " + this.sipProvider.getListeningPoint().getPort());
                logger.logStackTrace();
            }
            addEventListener(this.sipStack);
            this.releaseReferencesStrategy = this.sipStack.getReleaseReferencesStrategy();
            return;
        }
        throw new NullPointerException("Null Provider!");
    }

    public SIPDialog(SIPClientTransaction sIPClientTransaction, SIPResponse sIPResponse) {
        this(sIPClientTransaction);
        if (sIPResponse != null) {
            setLastResponse(sIPClientTransaction, sIPResponse);
            this.isBackToBackUserAgent = this.sipStack.isBackToBackUserAgent;
            return;
        }
        throw new NullPointerException("Null SipResponse");
    }

    public SIPDialog(SipProviderImpl sipProviderImpl, SIPResponse sIPResponse) {
        this(sipProviderImpl);
        this.sipStack = (SIPTransactionStack) sipProviderImpl.getSipStack();
        setLastResponse(null, sIPResponse);
        long seqNumber = sIPResponse.getCSeq().getSeqNumber();
        this.localSequenceNumber = seqNumber;
        this.originalLocalSequenceNumber = seqNumber;
        this.localParty = sIPResponse.getFrom().getAddress();
        this.remoteParty = sIPResponse.getTo().getAddress();
        this.method = sIPResponse.getCSeq().getMethod();
        this.callIdHeader = sIPResponse.getCallId();
        this.serverTransactionFlag = false;
        setLocalTag(sIPResponse.getFrom().getTag());
        setRemoteTag(sIPResponse.getTo().getTag());
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Creating a dialog : " + this);
            logger.logStackTrace();
        }
        SIPTransactionStack sIPTransactionStack = this.sipStack;
        this.isBackToBackUserAgent = sIPTransactionStack.isBackToBackUserAgent;
        addEventListener(sIPTransactionStack);
        this.releaseReferencesStrategy = this.sipStack.getReleaseReferencesStrategy();
    }

    private synchronized void addRoute(SIPResponse sIPResponse) {
        ContactList contactHeaders;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setContact: dialogState: " + this + "state = " + getState());
        }
        if (sIPResponse.getStatusCode() == 100) {
            if (logger.isLoggingEnabled(32)) {
                logger.logStackTrace();
            }
            return;
        }
        int i10 = this.dialogState;
        if (i10 == 3) {
            if (logger.isLoggingEnabled(32)) {
                logger.logStackTrace();
            }
            return;
        }
        if (i10 == 1) {
            if (sIPResponse.getStatusCode() / 100 == 2 && !isServer() && (contactHeaders = sIPResponse.getContactHeaders()) != null && SIPRequest.isTargetRefresh(sIPResponse.getCSeq().getMethod())) {
                setRemoteTarget((AbstractC2257l) contactHeaders.getFirst());
            }
            if (!this.pendingRouteUpdateOn202Response) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logStackTrace();
                }
                return;
            }
        }
        if (!isServer() || this.pendingRouteUpdateOn202Response) {
            if ((getState() != d.f24328i0 && getState() != d.f24329j0) || this.pendingRouteUpdateOn202Response) {
                RecordRouteList recordRouteHeaders = sIPResponse.getRecordRouteHeaders();
                if (recordRouteHeaders != null) {
                    addRoute(recordRouteHeaders);
                } else {
                    this.routeList = new RouteList();
                }
            }
            ContactList contactHeaders2 = sIPResponse.getContactHeaders();
            if (contactHeaders2 != null) {
                setRemoteTarget((AbstractC2257l) contactHeaders2.getFirst());
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logStackTrace();
        }
    }

    public SIPDialog(SIPClientTransaction sIPClientTransaction, SIPTransaction sIPTransaction) {
        this(sIPTransaction);
        this.serverTransactionFlag = false;
        this.lastTransaction = sIPClientTransaction;
        storeFirstTransactionInfo(this, sIPClientTransaction);
        this.terminateOnBye = false;
        this.localSequenceNumber = sIPClientTransaction.getCSeq();
        SIPRequest sIPRequest = (SIPRequest) sIPTransaction.getRequest();
        this.remoteSequenceNumber = sIPRequest.getCSeq().getSeqNumber();
        setDialogId(sIPRequest.getDialogId(true));
        setLocalTag(sIPRequest.getToTag());
        setRemoteTag(sIPRequest.getFromTag());
        setLastResponse(sIPClientTransaction, sIPClientTransaction.getLastResponse());
        this.localParty = sIPRequest.getTo().getAddress();
        this.remoteParty = sIPRequest.getFrom().getAddress();
        addRoute(sIPRequest);
        setState(1);
    }

    public SIPRequest createRequest(SipUri sipUri, Via via, CSeq cSeq, From from, To to) {
        SIPRequest sIPRequest = new SIPRequest();
        String method = cSeq.getMethod();
        sIPRequest.setMethod(method);
        sIPRequest.setRequestURI(sipUri);
        setBranch(via, method);
        sIPRequest.setHeader(via);
        sIPRequest.setHeader(cSeq);
        sIPRequest.setHeader(from);
        sIPRequest.setHeader(to);
        sIPRequest.setHeader(getCallId());
        try {
            sIPRequest.attachHeader(new MaxForwards(70), false);
        } catch (Exception unused) {
        }
        if (MessageFactoryImpl.getDefaultUserAgentHeader() != null) {
            sIPRequest.setHeader(MessageFactoryImpl.getDefaultUserAgentHeader());
        }
        return sIPRequest;
    }

    public synchronized void addRoute(SIPRequest sIPRequest) {
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("setContact: dialogState: " + this + "state = " + getState());
            }
            if (this.dialogState == 1 && SIPRequest.isTargetRefresh(sIPRequest.getMethod())) {
                doTargetRefresh(sIPRequest);
            }
            int i10 = this.dialogState;
            if (i10 != 1 && i10 != 3) {
                ContactList contactHeaders = sIPRequest.getContactHeaders();
                if (contactHeaders != null) {
                    setRemoteTarget((AbstractC2257l) contactHeaders.getFirst());
                }
                if (sIPRequest.getToTag() != null) {
                    return;
                }
                RecordRouteList recordRouteHeaders = sIPRequest.getRecordRouteHeaders();
                if (recordRouteHeaders != null) {
                    addRoute(recordRouteHeaders);
                } else {
                    this.routeList = new RouteList();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
