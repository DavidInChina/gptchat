package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.Expires;
import android.gov.nist.javax.sip.header.RecordRoute;
import android.gov.nist.javax.sip.header.RecordRouteList;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.header.TimeStamp;
import android.gov.nist.javax.sip.header.To;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.IllegalTransactionStateException;
import android.gov.nist.javax.sip.stack.SIPTransactionImpl;
import android.gov.nist.javax.sip.stack.timers.SipTimer;
import android.javax.sip.b;
import android.javax.sip.d;
import android.javax.sip.g;
import android.javax.sip.n;
import android.javax.sip.s;
import android.javax.sip.t;
import android.javax.sip.v;
import b.AbstractC2092b;
import b.AbstractC2094d;
import b.AbstractC2096f;
import d.AbstractC2561b;
import java.io.IOException;
import java.text.ParseException;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class SIPClientTransactionImpl extends SIPTransactionImpl implements SIPClientTransaction {
    private static StackLogger logger = CommonLogger.getLogger(SIPClientTransaction.class);
    private int callingStateTimeoutCount;
    private SIPDialog defaultDialog;
    private String defaultDialogId;
    private SIPRequest lastRequest;
    private AbstractC2092b nextHop;
    private String originalRequestCallId;
    private Contact originalRequestContact;
    private Event originalRequestEventHeader;
    private String originalRequestFromTag;
    private String originalRequestScheme;
    private transient ServerResponseInterface respondTo;
    private Set<String> sipDialogs;
    private transient SIPStackTimerTask transactionTimer;
    private String viaHost;
    private int viaPort;
    private transient Object transactionTimerLock = new Object();
    private AtomicBoolean timerKStarted = new AtomicBoolean(false);
    private boolean transactionTimerCancelled = false;
    private Set<Integer> responsesReceived = new CopyOnWriteArraySet();
    private boolean terminateDialogOnCleanUp = true;
    private boolean notifyOnRetransmit = false;
    private boolean timeoutIfStillInCallingState = false;

    /* loaded from: classes.dex */
    public class ExpiresTimerTask extends SIPStackTimerTask {
        public ExpiresTimerTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPClientTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPClientTransactionImpl sIPClientTransactionImpl = SIPClientTransactionImpl.this;
            SipProviderImpl sipProvider = sIPClientTransactionImpl.getSipProvider();
            if (sIPClientTransactionImpl.getState() != v.f24345m0) {
                s[] sVarArr = s.f24335Z;
                sipProvider.handleEvent(new t(sipProvider, sIPClientTransactionImpl), sIPClientTransactionImpl);
            } else if (SIPClientTransactionImpl.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = SIPClientTransactionImpl.logger;
                stackLogger.logDebug("state = " + sIPClientTransactionImpl.getState());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class TransactionTimer extends SIPStackTimerTask {
        public TransactionTimer() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPClientTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPClientTransactionImpl.this.isTerminated()) {
                try {
                    SIPClientTransactionImpl.this.sipStack.getTimer().cancel(this);
                } catch (IllegalStateException unused) {
                    if (!SIPClientTransactionImpl.this.sipStack.isAlive()) {
                        return;
                    }
                }
                SIPClientTransactionImpl.this.cleanUpOnTerminated();
                return;
            }
            SIPClientTransactionImpl.this.fireTimer();
        }
    }

    public SIPClientTransactionImpl(SIPTransactionStack sIPTransactionStack, MessageChannel messageChannel) {
        super(sIPTransactionStack, messageChannel);
        setBranch(Utils.getInstance().generateBranchId());
        setEncapsulatedChannel(messageChannel);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Creating clientTransaction " + this);
            logger.logStackTrace();
        }
        this.sipDialogs = new CopyOnWriteArraySet();
    }

    private final AbstractC2561b createErrorAck() {
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest != null) {
            if (isInviteTransaction()) {
                SIPResponse sIPResponse = this.lastResponse;
                if (sIPResponse != null) {
                    if (sIPResponse.getStatusCode() < 200) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger = logger;
                            stackLogger.logDebug("lastResponse = " + this.lastResponse);
                        }
                        throw new n("Cannot ACK a provisional response!");
                    }
                    return originalRequest.createErrorAck((To) this.lastResponse.getTo());
                }
                throw new n("bad Transaction state");
            }
            throw new n("Can only ACK an INVITE!");
        }
        throw new n("bad state " + getState());
    }

    private void inviteClientTransaction(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) {
        int statusCode = sIPResponse.getStatusCode();
        boolean z10 = true;
        if (5 == getInternalState()) {
            if (sIPDialog == null || !sIPDialog.isAckSent(sIPResponse.getCSeq().getSeqNumber()) || sIPDialog.getLastAckSentCSeq().getSeqNumber() != sIPResponse.getCSeq().getSeqNumber() || !sIPResponse.getFromTag().equals(sIPDialog.getLastAckSentFromTag())) {
                z10 = false;
            }
            if (sIPDialog != null && z10 && sIPResponse.getCSeq().getMethod().equals(sIPDialog.getMethod())) {
                try {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("resending ACK");
                    }
                    sIPDialog.resendAck();
                } catch (n unused) {
                }
            }
            if (logger.isLoggingEnabled(32) && sIPDialog != null) {
                logger.logDebug("Dialog " + sIPDialog + " current state " + sIPDialog.getState());
            }
            if (sIPDialog == null && statusCode >= 200 && statusCode < 300) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Client Transaction " + this + " branch id " + getBranch() + " doesn't have any dialog and is in TERMINATED state");
                }
                if (this.respondTo != null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("passing 2xx response up to the application");
                    }
                    this.respondTo.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            } else if (sIPDialog != null && sIPDialog.getState() == d.f24327h0 && statusCode >= 200 && statusCode < 300) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Client Transaction " + this + " branch id " + getBranch() + " has a early dialog and is in TERMINATED state");
                }
                sIPResponse.setRetransmission(false);
                if (this.respondTo != null) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("passing 2xx response up to the application");
                    }
                    this.respondTo.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            }
        } else if (getInternalState() == 0) {
            int i10 = statusCode / 100;
            if (i10 == 2) {
                disableRetransmissionTimer();
                disableTimeoutTimer();
                setState(5);
                ServerResponseInterface serverResponseInterface = this.respondTo;
                if (serverResponseInterface != null) {
                    serverResponseInterface.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            } else if (i10 == 1) {
                disableRetransmissionTimer();
                disableTimeoutTimer();
                setState(2);
                ServerResponseInterface serverResponseInterface2 = this.respondTo;
                if (serverResponseInterface2 != null) {
                    serverResponseInterface2.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            } else if (300 <= statusCode && statusCode <= 699) {
                try {
                    sendMessage((SIPRequest) createErrorAck());
                } catch (Exception e10) {
                    logger.logError("Unexpected Exception sending ACK -- sending error AcK ", e10);
                }
                if (getDialog() != null && ((SIPDialog) getDialog()).isBackToBackUserAgent()) {
                    ((SIPDialog) getDialog()).releaseAckSem();
                }
                if (!isReliable()) {
                    setState(3);
                    enableTimeoutTimer(this.timerD);
                } else {
                    setState(5);
                }
                ServerResponseInterface serverResponseInterface3 = this.respondTo;
                if (serverResponseInterface3 != null) {
                    serverResponseInterface3.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
                cleanUpOnTimer();
            }
        } else if (2 == getInternalState()) {
            int i11 = statusCode / 100;
            if (i11 == 1) {
                ServerResponseInterface serverResponseInterface4 = this.respondTo;
                if (serverResponseInterface4 != null) {
                    serverResponseInterface4.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            } else if (i11 == 2) {
                setState(5);
                ServerResponseInterface serverResponseInterface5 = this.respondTo;
                if (serverResponseInterface5 != null) {
                    serverResponseInterface5.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            } else if (300 <= statusCode && statusCode <= 699) {
                try {
                    sendMessage((SIPRequest) createErrorAck());
                } catch (Exception e11) {
                    InternalErrorHandler.handleException(e11);
                }
                if (getDialog() != null) {
                    ((SIPDialog) getDialog()).releaseAckSem();
                }
                if (!isReliable()) {
                    setState(3);
                    enableTimeoutTimer(this.timerD);
                } else {
                    setState(5);
                }
                cleanUpOnTimer();
                ServerResponseInterface serverResponseInterface6 = this.respondTo;
                if (serverResponseInterface6 != null) {
                    serverResponseInterface6.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                }
            }
        } else if (3 == getInternalState() && 300 <= statusCode) {
            try {
                if (statusCode <= 699) {
                    try {
                        sendMessage((SIPRequest) createErrorAck());
                    } catch (Exception e12) {
                        InternalErrorHandler.handleException(e12);
                    }
                }
            } finally {
                semRelease();
            }
        }
    }

    private void nonInviteClientTransaction(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) {
        int statusCode = sIPResponse.getStatusCode();
        if (1 == getInternalState()) {
            if (statusCode / 100 == 1) {
                setState(2);
                enableRetransmissionTimer(getTimerT2());
                enableTimeoutTimer(64);
                ServerResponseInterface serverResponseInterface = this.respondTo;
                if (serverResponseInterface != null) {
                    serverResponseInterface.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                } else {
                    semRelease();
                }
            } else if (200 <= statusCode && statusCode <= 699) {
                if (!isReliable()) {
                    setState(3);
                    scheduleTimerK(this.timerK);
                } else {
                    setState(5);
                }
                ServerResponseInterface serverResponseInterface2 = this.respondTo;
                if (serverResponseInterface2 != null) {
                    serverResponseInterface2.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                } else {
                    semRelease();
                }
                if (isReliable() && 5 == getInternalState()) {
                    cleanUpOnTerminated();
                }
                cleanUpOnTimer();
            }
        } else if (2 == getInternalState()) {
            if (statusCode / 100 == 1) {
                ServerResponseInterface serverResponseInterface3 = this.respondTo;
                if (serverResponseInterface3 != null) {
                    serverResponseInterface3.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                } else {
                    semRelease();
                }
            } else if (200 <= statusCode && statusCode <= 699) {
                disableRetransmissionTimer();
                disableTimeoutTimer();
                if (!isReliable()) {
                    setState(3);
                    scheduleTimerK(this.timerK);
                } else {
                    setState(5);
                }
                ServerResponseInterface serverResponseInterface4 = this.respondTo;
                if (serverResponseInterface4 != null) {
                    serverResponseInterface4.processResponse(sIPResponse, this.encapsulatedChannel, sIPDialog);
                } else {
                    semRelease();
                }
                if (isReliable() && 5 == getInternalState()) {
                    cleanUpOnTerminated();
                }
                cleanUpOnTimer();
            }
        } else {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug(" Not sending response to TU! " + getState());
            }
            semRelease();
        }
    }

    private void scheduleTimerK(long j6) {
        if (this.transactionTimer != null && this.timerKStarted.compareAndSet(false, true)) {
            synchronized (this.transactionTimerLock) {
                try {
                    if (!this.transactionTimerCancelled) {
                        this.sipStack.getTimer().cancel(this.transactionTimer);
                        this.transactionTimer = null;
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger = logger;
                            stackLogger.logDebug("starting TransactionTimerK() : " + getTransactionId() + " time " + j6);
                        }
                        SIPStackTimerTask sIPStackTimerTask = new SIPStackTimerTask() { // from class: android.gov.nist.javax.sip.stack.SIPClientTransactionImpl.1
                            @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                            public Object getThreadHash() {
                                AbstractC2561b request = SIPClientTransactionImpl.this.getRequest();
                                if (request != null && (request instanceof SIPRequest)) {
                                    return ((SIPRequest) request).getCallIdHeader().getCallId();
                                }
                                return null;
                            }

                            @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
                            public void runTask() {
                                if (SIPClientTransactionImpl.logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger2 = SIPClientTransactionImpl.logger;
                                    stackLogger2.logDebug("executing TransactionTimerJ() : " + SIPClientTransactionImpl.this.getTransactionId());
                                }
                                SIPClientTransactionImpl.this.fireTimeoutTimer();
                                SIPClientTransactionImpl.this.cleanUpOnTerminated();
                            }
                        };
                        if (j6 > 0) {
                            this.sipStack.getTimer().schedule(sIPStackTimerTask, j6 * this.baseTimerInterval);
                        } else {
                            sIPStackTimerTask.runTask();
                        }
                        this.transactionTimerCancelled = true;
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public void alertIfStillInCallingStateBy(int i10) {
        this.timeoutIfStillInCallingState = true;
        this.callingStateTimeoutCount = i10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public boolean checkFromTag(SIPResponse sIPResponse) {
        boolean z10;
        boolean z11;
        String originalRequestFromTag = getOriginalRequestFromTag();
        if (this.defaultDialog != null) {
            if (originalRequestFromTag == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (sIPResponse.getFrom().getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 ^ z11) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("From tag mismatch -- dropping response");
                }
                return false;
            } else if (originalRequestFromTag != null && !originalRequestFromTag.equalsIgnoreCase(sIPResponse.getFrom().getTag())) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("From tag mismatch -- dropping response");
                }
                return false;
            }
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void cleanUp() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("cleanup : " + getTransactionId());
            }
            SIPDialog sIPDialog = this.defaultDialog;
            if (sIPDialog != null) {
                this.defaultDialogId = sIPDialog.getDialogId();
                this.defaultDialog = null;
            }
            if (this.originalRequest != null && this.originalRequestBytes == null) {
                if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                this.mergeId = this.originalRequest.getMergeId();
            }
            this.originalRequest = null;
            cleanUpOnTimer();
            this.originalRequestCallId = null;
            this.originalRequestEventHeader = null;
            this.originalRequestFromTag = null;
            this.originalRequestContact = null;
            this.originalRequestScheme = null;
            Set<String> set = this.sipDialogs;
            if (set != null) {
                set.clear();
            }
            this.responsesReceived.clear();
            this.respondTo = null;
            this.transactionTimer = null;
            this.lastResponse = null;
            this.transactionTimerLock = null;
            this.timerKStarted = null;
        }
    }

    public void cleanUpOnTerminated() {
        SIPDialog sIPDialog;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("removing  = " + this + " isReliable " + isReliable());
        }
        if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal && this.originalRequest == null && this.originalRequestBytes != null) {
            try {
                this.originalRequest = (SIPRequest) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.originalRequestBytes, true, false, null);
            } catch (ParseException e10) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("message " + this.originalRequestBytes + " could not be reparsed !", e10);
                }
            }
        }
        this.sipStack.removeTransaction(this);
        if (!this.sipStack.cacheClientConnections && isReliable()) {
            MessageChannel messageChannel = getMessageChannel();
            int i10 = messageChannel.useCount - 1;
            messageChannel.useCount = i10;
            if (i10 <= 0) {
                SIPTransactionImpl.LingerTimer lingerTimer = new SIPTransactionImpl.LingerTimer();
                if (this.sipStack.getConnectionLingerTimer() != 0) {
                    this.sipStack.getTimer().schedule(lingerTimer, this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    lingerTimer.runTask();
                }
            }
        } else {
            if (logger.isLoggingEnabled() && isReliable()) {
                int i11 = getMessageChannel().useCount;
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("Client Use Count = " + i11);
                }
            }
            if (((SipStackImpl) getSIPStack()).isReEntrantListener() && getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
                cleanUp();
            }
        }
        if (this.terminateDialogOnCleanUp && (sIPDialog = this.defaultDialog) != null && sIPDialog.getState() == null) {
            this.defaultDialog.setState(3);
        }
    }

    public void cleanUpOnTimer() {
        String dialogId;
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("cleanupOnTimer: " + getTransactionId());
            }
            SIPDialog sIPDialog = this.defaultDialog;
            if (sIPDialog != null && (dialogId = sIPDialog.getDialogId()) != null && this.sipStack.getDialog(dialogId) != null) {
                this.defaultDialogId = dialogId;
                this.defaultDialog = null;
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null) {
                this.mergeId = sIPRequest.getMergeId();
                this.originalRequest.setTransaction(null);
                this.originalRequest.setInviteTransaction(null);
                this.originalRequest.cleanUp();
                if (this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                if (!getMethod().equalsIgnoreCase(TokenNames.INVITE) && !getMethod().equalsIgnoreCase("CANCEL")) {
                    this.originalRequestFromTag = this.originalRequest.getFromTag();
                    this.originalRequestCallId = this.originalRequest.getCallId().getCallId();
                    this.originalRequestEventHeader = (Event) this.originalRequest.getHeader(SIPHeaderNames.EVENT);
                    this.originalRequestContact = this.originalRequest.getContactHeader();
                    this.originalRequestScheme = this.originalRequest.getRequestURI().getScheme();
                    this.originalRequest = null;
                }
            }
            if (!getMethod().equalsIgnoreCase(TokenNames.SUBSCRIBE)) {
                this.lastResponse = null;
            }
            this.lastRequest = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void clearState() {
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public AbstractC2561b createAck() {
        Contact contact;
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest != null) {
            if (!getMethod().equalsIgnoreCase(TokenNames.ACK)) {
                SIPResponse sIPResponse = this.lastResponse;
                if (sIPResponse != null) {
                    if (sIPResponse.getStatusCode() < 200) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("lastResponse = " + this.lastResponse);
                        }
                        throw new n("Cannot ACK a provisional response!");
                    }
                    SIPRequest createAckRequest = originalRequest.createAckRequest((To) this.lastResponse.getTo());
                    RecordRouteList recordRouteHeaders = this.lastResponse.getRecordRouteHeaders();
                    if (recordRouteHeaders == null) {
                        if (this.lastResponse.getContactHeaders() != null && this.lastResponse.getStatusCode() / 100 != 3) {
                            createAckRequest.setRequestURI((AbstractC2096f) ((Contact) this.lastResponse.getContactHeaders().getFirst()).getAddress().getURI().clone());
                        }
                        return createAckRequest;
                    }
                    createAckRequest.removeHeader(SIPHeaderNames.ROUTE);
                    RouteList routeList = new RouteList();
                    ListIterator<RecordRoute> listIterator = recordRouteHeaders.listIterator(recordRouteHeaders.size());
                    while (listIterator.hasPrevious()) {
                        RecordRoute previous = listIterator.previous();
                        Route route = new Route();
                        route.setAddress((AddressImpl) ((AddressImpl) previous.getAddress()).clone());
                        route.setParameters((NameValueList) previous.getParameters().clone());
                        routeList.add((RouteList) route);
                    }
                    Route route2 = null;
                    if (this.lastResponse.getContactHeaders() != null) {
                        contact = (Contact) this.lastResponse.getContactHeaders().getFirst();
                    } else {
                        contact = null;
                    }
                    if (!((AbstractC2094d) ((Route) routeList.getFirst()).getAddress().getURI()).hasLrParam()) {
                        if (contact != null) {
                            route2 = new Route();
                            route2.setAddress((AddressImpl) ((AddressImpl) contact.getAddress()).clone());
                        }
                        routeList.removeFirst();
                        createAckRequest.setRequestURI(((Route) routeList.getFirst()).getAddress().getURI());
                        if (route2 != null) {
                            routeList.add((RouteList) route2);
                        }
                        createAckRequest.addHeader(routeList);
                    } else if (contact != null) {
                        createAckRequest.setRequestURI((AbstractC2096f) contact.getAddress().getURI().clone());
                        createAckRequest.addHeader(routeList);
                    }
                    return createAckRequest;
                }
                throw new n("bad Transaction state");
            }
            throw new n("Cannot ACK an ACK!");
        }
        throw new n("bad state " + getState());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public AbstractC2561b createCancel() {
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest != null) {
            if (originalRequest.getMethod().equals(TokenNames.INVITE)) {
                if (!originalRequest.getMethod().equalsIgnoreCase(TokenNames.ACK)) {
                    SIPRequest createCancelRequest = originalRequest.createCancelRequest();
                    createCancelRequest.setInviteTransaction(this);
                    return createCancelRequest;
                }
                throw new n("Cannot Cancel ACK!");
            }
            throw new n("Only INIVTE may be cancelled");
        }
        throw new n("Bad state " + getState());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireRetransmissionTimer() {
        try {
            if (getInternalState() >= 0 && this.isMapped) {
                boolean isInviteTransaction = isInviteTransaction();
                int internalState = getInternalState();
                if (!isInviteTransaction || internalState != 0) {
                    if (!isInviteTransaction) {
                        if (1 != internalState && 2 != internalState) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                SIPRequest sIPRequest = this.lastRequest;
                if (sIPRequest != null) {
                    if (this.sipStack.generateTimeStampHeader && sIPRequest.getHeader(SIPHeaderNames.TIMESTAMP) != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        TimeStamp timeStamp = new TimeStamp();
                        try {
                            timeStamp.setTimeStamp((float) currentTimeMillis);
                        } catch (g e10) {
                            InternalErrorHandler.handleException(e10);
                        }
                        this.lastRequest.setHeader(timeStamp);
                    }
                    super.sendMessage(this.lastRequest);
                    if (this.notifyOnRetransmit) {
                        SipProviderImpl sipProvider = getSipProvider();
                        s[] sVarArr = s.f24335Z;
                        getSipProvider().handleEvent(new t(sipProvider, this), this);
                    }
                    if (this.timeoutIfStillInCallingState && getInternalState() == 0) {
                        int i10 = this.callingStateTimeoutCount - 1;
                        this.callingStateTimeoutCount = i10;
                        if (i10 == 0) {
                            SipProviderImpl sipProvider2 = getSipProvider();
                            s[] sVarArr2 = s.f24335Z;
                            getSipProvider().handleEvent(new t(sipProvider2, this), this);
                            this.timeoutIfStillInCallingState = false;
                        }
                    }
                }
            }
        } catch (IOException unused) {
            raiseIOExceptionEvent();
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireTimeoutTimer() {
        SIPClientTransaction sIPClientTransaction;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("fireTimeoutTimer " + this);
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (getInternalState() == 0 || 1 == getInternalState() || 2 == getInternalState()) {
            if (sIPDialog != null && (sIPDialog.getState() == null || sIPDialog.getState() == d.f24327h0)) {
                if (SIPTransactionStack.isDialogCreated(getMethod())) {
                    sIPDialog.delete();
                }
            } else if (sIPDialog != null && getMethod().equalsIgnoreCase(TokenNames.BYE) && sIPDialog.isTerminatedOnBye()) {
                sIPDialog.delete();
            }
        }
        if (3 != getInternalState() && 5 != getInternalState()) {
            raiseErrorEvent(1);
            if (getMethod().equalsIgnoreCase("CANCEL") && (sIPClientTransaction = (SIPClientTransaction) getOriginalRequest().getInviteTransaction()) != null) {
                if ((sIPClientTransaction.getInternalState() == 0 || sIPClientTransaction.getInternalState() == 2) && sIPClientTransaction.getDialog() != null) {
                    sIPClientTransaction.setState(5);
                    return;
                }
                return;
            }
            return;
        }
        setState(5);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public b getDialog() {
        SIPResponse sIPResponse = this.lastResponse;
        SIPDialog dialog = (sIPResponse == null || sIPResponse.getFromTag() == null || sIPResponse.getToTag() == null || sIPResponse.getStatusCode() == 100) ? null : getDialog(sIPResponse.getDialogId(false));
        if (dialog == null) {
            dialog = getDefaultDialog();
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug(" sipDialogs =  " + this.sipDialogs + " default dialog " + getDefaultDialog() + " retval " + dialog);
        }
        return dialog;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public AbstractC2092b getNextHop() {
        return this.nextHop;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public String getOriginalRequestCallId() {
        SIPRequest sIPRequest = this.originalRequest;
        if (sIPRequest == null) {
            return this.originalRequestCallId;
        }
        return sIPRequest.getCallId().getCallId();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public Contact getOriginalRequestContact() {
        SIPRequest sIPRequest = this.originalRequest;
        if (sIPRequest == null) {
            return this.originalRequestContact;
        }
        return sIPRequest.getContactHeader();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public Event getOriginalRequestEvent() {
        SIPRequest sIPRequest = this.originalRequest;
        if (sIPRequest == null) {
            return this.originalRequestEventHeader;
        }
        return (Event) sIPRequest.getHeader(SIPHeaderNames.EVENT);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public String getOriginalRequestFromTag() {
        SIPRequest sIPRequest = this.originalRequest;
        if (sIPRequest == null) {
            return this.originalRequestFromTag;
        }
        return sIPRequest.getFromTag();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public String getOriginalRequestScheme() {
        SIPRequest sIPRequest = this.originalRequest;
        if (sIPRequest == null) {
            return this.originalRequestScheme;
        }
        return sIPRequest.getRequestURI().getScheme();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public Via getOutgoingViaHeader() {
        return getMessageProcessor().getViaHeader();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public MessageChannel getRequestChannel() {
        return this.encapsulatedChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public String getViaHost() {
        return this.viaHost;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public int getViaPort() {
        return this.viaPort;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isMessagePartOfTransaction(SIPMessage sIPMessage) {
        boolean z10;
        Via topmostVia = sIPMessage.getTopmostVia();
        String branch = topmostVia.getBranch();
        boolean z11 = true;
        if (getBranch() != null && branch != null && getBranch().toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE) && branch.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (3 == getInternalState()) {
            if (z10) {
                if (!getBranch().equalsIgnoreCase(topmostVia.getBranch()) || !getMethod().equals(sIPMessage.getCSeq().getMethod())) {
                    z11 = false;
                }
                return z11;
            }
            return getBranch().equals(sIPMessage.getTransactionId());
        } else if (isTerminated()) {
            return false;
        } else {
            if (z10) {
                if (!getBranch().equalsIgnoreCase(topmostVia.getBranch())) {
                    return false;
                }
                return getMethod().equals(sIPMessage.getCSeq().getMethod());
            } else if (getBranch() != null) {
                return getBranch().equalsIgnoreCase(sIPMessage.getTransactionId());
            } else {
                return ((SIPRequest) getRequest()).getTransactionId().equalsIgnoreCase(sIPMessage.getTransactionId());
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public boolean isNotifyOnRetransmit() {
        return this.notifyOnRetransmit;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:8|(11:10|(1:12)|20|(1:22)|23|38|24|(1:26)(1:29)|37|34|35)|15|16|(2:18|19)|20|(0)|23|38|24|(0)(0)|37|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (android.gov.nist.javax.sip.stack.SIPClientTransactionImpl.logger.isLoggingEnabled() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        android.gov.nist.javax.sip.stack.SIPClientTransactionImpl.logger.logException(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        setState(5);
        raiseErrorEvent(2);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033 A[Catch: all -> 0x001c, TryCatch #1 {all -> 0x001c, blocks: (B:4:0x0005, B:8:0x000d, B:10:0x0015, B:15:0x001e, B:20:0x0029, B:22:0x0033, B:23:0x0065, B:24:0x0067, B:26:0x006d, B:29:0x0073, B:30:0x0077, B:32:0x007f, B:33:0x0084), top: B:40:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x001c, IOException -> 0x0071, TryCatch #0 {IOException -> 0x0071, blocks: (B:24:0x0067, B:26:0x006d, B:29:0x0073), top: B:38:0x0067, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x001c, IOException -> 0x0071, TRY_LEAVE, TryCatch #0 {IOException -> 0x0071, blocks: (B:24:0x0067, B:26:0x006d, B:29:0x0073), top: B:38:0x0067, outer: #1 }] */
    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.stack.ServerResponseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) {
        try {
            if (getInternalState() < 0) {
                return;
            }
            if (3 != getInternalState()) {
                if (5 == getInternalState()) {
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("processing " + sIPResponse.getFirstLine() + "current state = " + getState());
                    StackLogger stackLogger2 = logger;
                    StringBuilder sb2 = new StringBuilder("dialog = ");
                    sb2.append(sIPDialog);
                    stackLogger2.logDebug(sb2.toString());
                }
                this.lastResponse = sIPResponse;
                if (!isInviteTransaction()) {
                    inviteClientTransaction(sIPResponse, messageChannel, sIPDialog);
                } else {
                    nonInviteClientTransaction(sIPResponse, messageChannel, sIPDialog);
                }
            }
            if (sIPResponse.getStatusCode() / 100 == 1) {
                return;
            }
            if (logger.isLoggingEnabled(32)) {
            }
            this.lastResponse = sIPResponse;
            if (!isInviteTransaction()) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void sendMessage(SIPMessage sIPMessage) {
        try {
            SIPRequest sIPRequest = (SIPRequest) sIPMessage;
            try {
                sIPRequest.getTopmostVia().setBranch(getBranch());
            } catch (ParseException unused) {
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Sending Message " + sIPMessage);
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("TransactionState " + getState());
            }
            if ((2 == getInternalState() || getInternalState() == 0) && sIPRequest.getMethod().equals(TokenNames.ACK)) {
                if (isReliable()) {
                    setState(5);
                } else {
                    setState(3);
                }
                cleanUpOnTimer();
                super.sendMessage(sIPRequest);
                return;
            }
            try {
                this.lastRequest = sIPRequest;
                if (getInternalState() < 0) {
                    setOriginalRequest(sIPRequest);
                    if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                        setState(0);
                    } else if (sIPRequest.getMethod().equals(TokenNames.ACK)) {
                        setState(5);
                        cleanUpOnTimer();
                    } else {
                        setState(1);
                    }
                    if (!isReliable()) {
                        enableRetransmissionTimer();
                    }
                    if (isInviteTransaction()) {
                        enableTimeoutTimer(64);
                    } else {
                        enableTimeoutTimer(64);
                    }
                }
                super.sendMessage(sIPRequest);
            } catch (IOException e10) {
                setState(5);
                throw e10;
            }
        } finally {
            this.isMapped = true;
            startTransactionTimer();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public void sendRequest() {
        String str;
        int i10;
        SIPDialog defaultDialog;
        SIPRequest originalRequest = getOriginalRequest();
        if (getInternalState() < 0) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("sendRequest() " + originalRequest);
            }
            try {
                originalRequest.checkHeaders();
                if (getMethod().equals(TokenNames.SUBSCRIBE) && originalRequest.getHeader(SIPHeaderNames.EXPIRES) == null && logger.isLoggingEnabled()) {
                    logger.logWarning("Expires header missing in outgoing subscribe -- Notifier will assume implied value on event package");
                }
                try {
                    if (getMethod().equals("CANCEL") && this.sipStack.isCancelClientTransactionChecked()) {
                        SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) this.sipStack.findCancelTransaction(getOriginalRequest(), false);
                        if (sIPClientTransaction != null) {
                            if (sIPClientTransaction.getInternalState() >= 0) {
                                if (!sIPClientTransaction.isInviteTransaction()) {
                                    throw new n("Cannot cancel non-invite requests RFC 3261 9.1");
                                }
                            } else {
                                throw new n("State is null no provisional response yet -- cannot cancel RFC 3261 9.1");
                            }
                        } else {
                            throw new n("Could not find original tx to cancel. RFC 3261 9.1");
                        }
                    } else if (getMethod().equals(TokenNames.BYE) || getMethod().equals(TokenNames.NOTIFY)) {
                        SIPDialog dialog = this.sipStack.getDialog(getOriginalRequest().getDialogId(false));
                        if (getSipProvider().isAutomaticDialogSupportEnabled() && dialog != null) {
                            throw new n("Dialog is present and AutomaticDialogSupport is enabled for  the provider -- Send the Request using the Dialog.sendRequest(transaction)");
                        }
                    }
                    if (isInviteTransaction() && (defaultDialog = getDefaultDialog()) != null && defaultDialog.isBackToBackUserAgent() && !defaultDialog.takeAckSem()) {
                        throw new n("Failed to take ACK semaphore");
                    }
                    this.isMapped = true;
                    if (originalRequest.getHeader(SIPHeaderNames.EXPIRES) != null) {
                        i10 = ((Expires) originalRequest.getHeader(SIPHeaderNames.EXPIRES)).getExpires();
                    } else {
                        i10 = -1;
                    }
                    if (getDefaultDialog() != null && isInviteTransaction() && i10 != -1 && this.expiresTimerTask == null) {
                        this.expiresTimerTask = new ExpiresTimerTask();
                        this.sipStack.getTimer().schedule(this.expiresTimerTask, i10 * 1000);
                    }
                    sendMessage(originalRequest);
                    return;
                } catch (IOException e10) {
                    setState(5);
                    if (this.expiresTimerTask != null) {
                        this.sipStack.getTimer().cancel(this.expiresTimerTask);
                    }
                    if (e10.getMessage() == null) {
                        str = "IO Error sending request";
                    } else {
                        str = e10.getMessage();
                    }
                    throw new n(str, e10);
                }
            } catch (ParseException e11) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("missing required header");
                }
                throw new IllegalTransactionStateException(e11.getMessage(), IllegalTransactionStateException.Reason.MissingRequiredHeader);
            }
        }
        throw new IllegalTransactionStateException("Request already sent", IllegalTransactionStateException.Reason.RequestAlreadySent);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setDialog(SIPDialog sIPDialog, String str) {
        Set<String> set;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setDialog: " + str + " sipDialog = " + sIPDialog);
        }
        if (sIPDialog == null) {
            if (logger.isLoggingEnabled(4)) {
                logger.logError("NULL DIALOG!!");
            }
            throw new NullPointerException("bad dialog null");
        }
        if (this.defaultDialog == null && this.defaultDialogId == null) {
            this.defaultDialog = sIPDialog;
            if (isInviteTransaction() && getSIPStack().getMaxForkTime() != 0) {
                getSIPStack().addForkedClientTransaction(this);
            }
        }
        if (str != null && sIPDialog.getDialogId() != null && (set = this.sipDialogs) != null) {
            set.add(str);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setNextHop(AbstractC2092b abstractC2092b) {
        this.nextHop = abstractC2092b;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public void setNotifyOnRetransmit(boolean z10) {
        this.notifyOnRetransmit = z10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setResponseInterface(ServerResponseInterface serverResponseInterface) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Setting response interface for " + this + " to " + serverResponseInterface);
            if (serverResponseInterface == null) {
                logger.logStackTrace();
                logger.logDebug("WARNING -- setting to null!");
            }
        }
        this.respondTo = serverResponseInterface;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setState(int i10) {
        if (i10 == 5 && isReliable() && !getSIPStack().cacheClientConnections) {
            this.collectionTime = 64;
        }
        if (super.getInternalState() != 3 && (i10 == 3 || i10 == 5)) {
            this.sipStack.decrementActiveClientTransactionCount();
        }
        super.setState(i10);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setTerminateDialogOnCleanUp(boolean z10) {
        this.terminateDialogOnCleanUp = z10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setViaHost(String str) {
        this.viaHost = str;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void setViaPort(int i10) {
        this.viaPort = i10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void startTransactionTimer() {
        Object obj;
        if (this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && (obj = this.transactionTimerLock) != null) {
            synchronized (obj) {
                try {
                    if (!this.transactionTimerCancelled) {
                        this.transactionTimer = new TransactionTimer();
                        SipTimer timer = this.sipStack.getTimer();
                        SIPStackTimerTask sIPStackTimerTask = this.transactionTimer;
                        int i10 = this.baseTimerInterval;
                        timer.scheduleWithFixedDelay(sIPStackTimerTask, i10, i10);
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public void stopExpiresTimer() {
        if (this.expiresTimerTask != null) {
            this.sipStack.getTimer().cancel(this.expiresTimerTask);
            this.expiresTimerTask = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void terminate() {
        setState(5);
        if (!this.transactionTimerStarted.get()) {
            testAndSetTransactionTerminatedEvent();
            this.sipStack.removeTransaction(this);
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (sIPDialog != null) {
            sIPDialog.releaseAckSem();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.ClientTransactionExt
    public SIPDialog getDefaultDialog() {
        String str;
        SIPDialog sIPDialog = this.defaultDialog;
        return (sIPDialog != null || (str = this.defaultDialogId) == null) ? sIPDialog : this.sipStack.getDialog(str);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction
    public SIPDialog getDialog(String str) {
        Set<String> set = this.sipDialogs;
        if (set == null || !set.contains(str)) {
            return null;
        }
        SIPDialog dialog = this.sipStack.getDialog(str);
        return dialog == null ? this.sipStack.getEarlyDialog(str) : dialog;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4 A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:35:0x0096, B:37:0x009a, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c4, B:50:0x00cd, B:52:0x00d5, B:54:0x00dd, B:56:0x00ea, B:58:0x00f4, B:59:0x00fc, B:60:0x0109, B:61:0x0110, B:62:0x0111, B:64:0x0117, B:65:0x0122), top: B:75:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:35:0x0096, B:37:0x009a, B:39:0x00a0, B:41:0x00ae, B:43:0x00b6, B:45:0x00c4, B:50:0x00cd, B:52:0x00d5, B:54:0x00dd, B:56:0x00ea, B:58:0x00f4, B:59:0x00fc, B:60:0x0109, B:61:0x0110, B:62:0x0111, B:64:0x0117, B:65:0x0122), top: B:75:0x0096 }] */
    @Override // android.gov.nist.javax.sip.stack.SIPClientTransaction, android.gov.nist.javax.sip.stack.ServerResponseInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel) {
        SIPDialog sIPDialog;
        SIPDialog sIPDialog2;
        SIPRequest sIPRequest;
        SIPResponse sIPResponse2;
        int statusCode = sIPResponse.getStatusCode();
        boolean z10 = !this.responsesReceived.add(Integer.valueOf(statusCode));
        if (statusCode > 100 && statusCode < 200 && z10 && (sIPResponse2 = this.lastResponse) != null && !sIPResponse.equals(sIPResponse2)) {
            z10 = false;
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("marking response as retransmission " + z10 + " for ctx " + this);
        }
        sIPResponse.setRetransmission(z10);
        String method = sIPResponse.getCSeq().getMethod();
        String dialogId = sIPResponse.getDialogId(false);
        if (method.equals("CANCEL") && (sIPRequest = this.lastRequest) != null) {
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) sIPRequest.getInviteTransaction();
            sIPDialog = sIPClientTransaction != null ? sIPClientTransaction.getDefaultDialog() : null;
        } else {
            sIPDialog = getDialog(dialogId);
        }
        if (sIPDialog == null) {
            if (statusCode > 100 && statusCode < 300 && ((sIPResponse.getToTag() != null || this.sipStack.isRfc2543Supported()) && SIPTransactionStack.isDialogCreated(method))) {
                synchronized (this) {
                    try {
                        if (this.defaultDialog != null) {
                            if (sIPResponse.getFromTag() != null) {
                                String dialogId2 = this.defaultDialog.getDialogId();
                                if (this.defaultDialog.getLastResponseMethod() != null && (!method.equals(TokenNames.SUBSCRIBE) || !this.defaultDialog.getLastResponseMethod().equals(TokenNames.NOTIFY) || !dialogId2.equals(dialogId))) {
                                    sIPDialog2 = this.sipStack.getDialog(dialogId);
                                    if (sIPDialog2 == null && this.defaultDialog.isAssigned()) {
                                        sIPDialog2 = this.sipStack.createDialog(this, sIPResponse);
                                        sIPDialog2.setOriginalDialog(this.defaultDialog);
                                    }
                                    sIPDialog = sIPDialog2;
                                    if (sIPDialog == null) {
                                        setDialog(sIPDialog, sIPDialog.getDialogId());
                                    } else {
                                        logger.logError("dialog is unexpectedly null", new NullPointerException());
                                    }
                                }
                                this.defaultDialog.setLastResponse(this, sIPResponse);
                                sIPDialog2 = this.defaultDialog;
                                sIPDialog = sIPDialog2;
                                if (sIPDialog == null) {
                                }
                            } else {
                                throw new RuntimeException("Response without from-tag");
                            }
                        } else {
                            SIPTransactionStack sIPTransactionStack = this.sipStack;
                            if (sIPTransactionStack.isAutomaticDialogSupportEnabled) {
                                sIPDialog = sIPTransactionStack.createDialog(this, sIPResponse);
                                setDialog(sIPDialog, sIPDialog.getDialogId());
                            }
                        }
                    } finally {
                    }
                }
            } else {
                sIPDialog = this.defaultDialog;
            }
        } else if (5 != getInternalState()) {
            sIPDialog.setLastResponse(this, sIPResponse);
        }
        processResponse(sIPResponse, messageChannel, sIPDialog);
    }
}
