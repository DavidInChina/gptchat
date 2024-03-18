package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.Utils;
import android.gov.nist.javax.sip.header.ContentType;
import android.gov.nist.javax.sip.header.Expires;
import android.gov.nist.javax.sip.header.RSeq;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
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
import android.javax.sip.e;
import android.javax.sip.n;
import android.javax.sip.s;
import android.javax.sip.t;
import android.javax.sip.v;
import b.AbstractC2092b;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.io.IOException;
import java.net.InetAddress;
import java.text.ParseException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class SIPServerTransactionImpl extends SIPTransactionImpl implements SIPServerTransaction {
    private SIPDialog dialog;
    protected String dialogId;
    private SIPServerTransaction inviteTransaction;
    protected boolean isAckSeen;
    private byte[] lastResponseAsBytes;
    private String lastResponseHost;
    private int lastResponsePort;
    private int lastResponseStatusCode;
    private String lastResponseTransport;
    private String originalRequestFromTag;
    private HostPort originalRequestSentBy;
    private long pendingReliableCSeqNumber;
    private long pendingReliableRSeqNumber;
    private byte[] pendingReliableResponseAsBytes;
    private String pendingReliableResponseMethod;
    private SIPClientTransaction pendingSubscribeTransaction;
    private ProvisionalResponseTask provisionalResponseTask;
    private transient ServerRequestInterface requestOf;
    private boolean retransmissionAlertEnabled;
    private RetransmissionAlertTimerTask retransmissionAlertTimerTask;
    private static StackLogger logger = CommonLogger.getLogger(SIPServerTransaction.class);
    private static boolean interlockProvisionalResponses = true;
    private int rseqNumber = -1;
    private Semaphore provisionalResponseSem = new Semaphore(1);
    private Semaphore terminationSemaphore = new Semaphore(0);

    /* loaded from: classes2.dex */
    public class ProvisionalResponseTask extends SIPStackTimerTask {
        int ticks = 1;
        int ticksLeft = 1;

        public ProvisionalResponseTask() {
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPServerTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            if (sIPServerTransactionImpl.isTerminated()) {
                SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                return;
            }
            int i10 = this.ticksLeft - 1;
            this.ticksLeft = i10;
            if (i10 == -1) {
                sIPServerTransactionImpl.fireReliableResponseRetransmissionTimer();
                int i11 = this.ticks * 2;
                this.ticksLeft = i11;
                this.ticks = i11;
                if (i11 >= 64) {
                    SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                    SIPServerTransactionImpl.this.setState(5);
                    SIPServerTransactionImpl.this.fireTimeoutTimer();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class RetransmissionAlertTimerTask extends SIPStackTimerTask {
        String dialogId;
        int ticks = 1;
        int ticksLeft = 1;

        public RetransmissionAlertTimerTask(String str) {
            this.dialogId = str;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPServerTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            int i10 = this.ticksLeft - 1;
            this.ticksLeft = i10;
            if (i10 == -1) {
                sIPServerTransactionImpl.fireRetransmissionTimer();
                this.ticksLeft = this.ticks * 2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class SendTrying extends SIPStackTimerTask {
        public SendTrying() {
            if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = SIPServerTransactionImpl.logger;
                stackLogger.logDebug("scheduled timer for " + SIPServerTransactionImpl.this);
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPServerTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPServerTransactionImpl sIPServerTransactionImpl = SIPServerTransactionImpl.this;
            int realState = sIPServerTransactionImpl.getRealState();
            if (realState < 0 || 1 == realState) {
                if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = SIPServerTransactionImpl.logger;
                    stackLogger.logDebug(" sending Trying current state = " + sIPServerTransactionImpl.getRealState());
                }
                try {
                    sIPServerTransactionImpl.sendMessage(sIPServerTransactionImpl.getOriginalRequest().createResponse(100, "Trying"));
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = SIPServerTransactionImpl.logger;
                        stackLogger2.logDebug(" trying sent " + sIPServerTransactionImpl.getRealState());
                    }
                } catch (IOException unused) {
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled()) {
                        SIPServerTransactionImpl.logger.logError("IO error sending  TRYING");
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class TransactionTimer extends SIPStackTimerTask {
        public TransactionTimer() {
            if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = SIPServerTransactionImpl.logger;
                stackLogger.logDebug("TransactionTimer() : " + SIPServerTransactionImpl.this.getTransactionId());
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPServerTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            if (SIPServerTransactionImpl.this.isTerminated()) {
                try {
                    SIPServerTransactionImpl.this.sipStack.getTimer().cancel(this);
                } catch (IllegalStateException unused) {
                    if (!SIPServerTransactionImpl.this.sipStack.isAlive()) {
                        return;
                    }
                }
                SIPTransactionImpl.LingerTimer lingerTimer = new SIPTransactionImpl.LingerTimer();
                if (SIPServerTransactionImpl.this.sipStack.getConnectionLingerTimer() != 0) {
                    SIPServerTransactionImpl.this.sipStack.getTimer().schedule(lingerTimer, SIPServerTransactionImpl.this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    lingerTimer.runTask();
                }
            } else {
                SIPServerTransactionImpl.this.fireTimer();
            }
            SIPRequest sIPRequest = SIPServerTransactionImpl.this.originalRequest;
            if (sIPRequest != null) {
                sIPRequest.cleanUp();
            }
        }
    }

    public SIPServerTransactionImpl(SIPTransactionStack sIPTransactionStack, MessageChannel messageChannel) {
        super(sIPTransactionStack, messageChannel);
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Creating Server Transaction" + getBranchId());
            logger.logStackTrace();
        }
    }

    private boolean checkStateTimers(int i10) {
        if (getRealState() == 1) {
            int i11 = i10 / 100;
            if (i11 == 1) {
                setState(2);
            } else if (200 <= i10 && i10 <= 699) {
                if (!isInviteTransaction()) {
                    if (!isReliable() && getInternalState() != 3) {
                        setState(3);
                        startTransactionTimerJ(64L);
                        cleanUpOnTimer();
                    } else {
                        cleanUpOnTimer();
                        setState(5);
                        startTransactionTimerJ(0L);
                    }
                } else if (i11 == 2) {
                    disableRetransmissionTimer();
                    disableTimeoutTimer();
                    this.collectionTime = 64;
                    cleanUpOnTimer();
                    setState(5);
                    if (getDialog() != null) {
                        ((SIPDialog) getDialog()).setRetransmissionTicks();
                    }
                } else {
                    setState(3);
                    if (!isReliable()) {
                        enableRetransmissionTimer();
                    }
                    cleanUpOnTimer();
                    enableTimeoutTimer(64);
                }
            }
        } else if (getRealState() == 2) {
            if (isInviteTransaction()) {
                if (i10 / 100 == 2) {
                    disableRetransmissionTimer();
                    disableTimeoutTimer();
                    this.collectionTime = 64;
                    cleanUpOnTimer();
                    setState(5);
                    if (getDialog() != null) {
                        ((SIPDialog) getDialog()).setRetransmissionTicks();
                    }
                } else if (300 <= i10 && i10 <= 699) {
                    setState(3);
                    if (!isReliable()) {
                        enableRetransmissionTimer();
                    }
                    cleanUpOnTimer();
                    enableTimeoutTimer(64);
                }
            } else if (200 <= i10 && i10 <= 699) {
                setState(3);
                if (!isReliable()) {
                    disableRetransmissionTimer();
                    startTransactionTimerJ(64L);
                } else {
                    setState(5);
                    startTransactionTimerJ(0L);
                }
                cleanUpOnTimer();
            }
        } else if (3 == getRealState()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireReliableResponseRetransmissionTimer() {
        try {
            resendLastResponseAsBytes();
        } catch (IOException e10) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e10);
            }
            setState(5);
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean ackSeen() {
        return this.isAckSeen;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void cleanUp() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("removing" + this);
        }
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("cleanup : " + getTransactionId());
            }
            if (this.originalRequest == null && this.originalRequestBytes != null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                try {
                    this.originalRequest = (SIPRequest) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.originalRequestBytes, true, false, null);
                } catch (ParseException e10) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logDebug("message " + this.originalRequestBytes + "could not be reparsed !", e10);
                    }
                }
            } else if (this.originalRequest != null && this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null && this.originalRequestBytes == null) {
                this.mergeId = sIPRequest.getMergeId();
            }
            this.sipStack.removeTransaction(this);
            cleanUpOnTimer();
            this.originalRequestFromTag = null;
            this.originalRequestSentBy = null;
            if (this.originalRequest != null) {
                this.originalRequest = null;
            }
            if (!isReliable() && this.inviteTransaction != null) {
                this.inviteTransaction = null;
            }
            this.lastResponse = null;
        } else {
            this.sipStack.removeTransaction(this);
        }
        if (!this.sipStack.cacheServerConnections && isReliable()) {
            MessageChannel messageChannel = getMessageChannel();
            int i10 = messageChannel.useCount - 1;
            messageChannel.useCount = i10;
            if (i10 <= 0) {
                close();
                return;
            }
        }
        if (logger.isLoggingEnabled(32) && !this.sipStack.cacheServerConnections && isReliable()) {
            int i11 = getMessageChannel().useCount;
            StackLogger stackLogger4 = logger;
            stackLogger4.logDebug("Use Count = " + i11);
        }
    }

    public void cleanUpOnTimer() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("cleanup on timer : " + getTransactionId());
            }
            if (this.dialog != null && getMethod().equals("CANCEL")) {
                this.dialogId = this.dialog.getDialogId();
            }
            this.dialog = null;
            if (this.inviteTransaction != null && !getMethod().equals("CANCEL")) {
                this.inviteTransaction.releaseSem();
                this.inviteTransaction = null;
            }
            SIPRequest sIPRequest = this.originalRequest;
            if (sIPRequest != null) {
                this.mergeId = sIPRequest.getMergeId();
                this.originalRequest.setTransaction(null);
                this.originalRequest.setInviteTransaction(null);
                if (!getMethod().equalsIgnoreCase(TokenNames.INVITE)) {
                    if (this.originalRequestSentBy == null) {
                        this.originalRequestSentBy = this.originalRequest.getTopmostVia().getSentBy();
                    }
                    if (this.originalRequestFromTag == null) {
                        this.originalRequestFromTag = this.originalRequest.getFromTag();
                    }
                }
                if (this.originalRequestBytes == null && getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.originalRequestBytes = this.originalRequest.encodeAsBytes(getTransport());
                }
                if (!getMethod().equalsIgnoreCase(TokenNames.INVITE) && !getMethod().equalsIgnoreCase("CANCEL")) {
                    this.originalRequest = null;
                }
            }
            if (this.lastResponse != null) {
                if (getReleaseReferencesStrategy() == ReleaseReferencesStrategy.Normal) {
                    this.lastResponseAsBytes = this.lastResponse.encodeAsBytes(getTransport());
                }
                this.lastResponse = null;
            }
            this.pendingReliableResponseAsBytes = null;
            this.pendingReliableResponseMethod = null;
            this.pendingSubscribeTransaction = null;
            this.provisionalResponseSem = null;
            this.retransmissionAlertTimerTask = null;
            this.requestOf = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void disableRetransmissionAlerts() {
        if (this.retransmissionAlertTimerTask != null && this.retransmissionAlertEnabled) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            this.retransmissionAlertEnabled = false;
            String str = this.retransmissionAlertTimerTask.dialogId;
            if (str != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str);
            }
            this.retransmissionAlertTimerTask = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.ServerTransactionExt
    public void enableRetransmissionAlerts() {
        if (getDialog() == null) {
            if (isInviteTransaction()) {
                this.retransmissionAlertEnabled = true;
                return;
            }
            throw new n("Request Method must be INVITE");
        }
        throw new n("Dialog associated with tx");
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return getBranch().equalsIgnoreCase(((SIPServerTransaction) obj).getBranch());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireRetransmissionTimer() {
        try {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("fireRetransmissionTimer() -- " + this + " state " + getState());
            }
            if (isInviteTransaction()) {
                if (this.lastResponse != null || this.lastResponseAsBytes != null) {
                    if (this.retransmissionAlertEnabled && !this.sipStack.isTransactionPendingAck(this)) {
                        SipProviderImpl sipProvider = getSipProvider();
                        s[] sVarArr = s.f24335Z;
                        sipProvider.handleEvent(new t(sipProvider, this), this);
                        return;
                    }
                    if (this.lastResponseStatusCode / 100 >= 2 && !this.isAckSeen) {
                        resendLastResponseAsBytes();
                    }
                }
            }
        } catch (IOException e10) {
            if (logger.isLoggingEnabled()) {
                logger.logException(e10);
            }
            raiseErrorEvent(2);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireTimeoutTimer() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("SIPServerTransaction.fireTimeoutTimer this = " + this + " current state = " + getRealState() + " method = " + getMethod());
        }
        if (isInviteTransaction() && this.sipStack.removeTransactionPendingAck(this) && logger.isLoggingEnabled(32)) {
            logger.logDebug("Found tx pending ACK - timer H has kicked");
        }
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (SIPTransactionStack.isDialogCreated(getMethod()) && (getRealState() == 0 || 1 == getRealState())) {
            sIPDialog.setState(3);
        } else if (getMethod().equals(TokenNames.BYE) && sIPDialog != null && sIPDialog.isTerminatedOnBye()) {
            sIPDialog.setState(3);
        }
        if (3 == getRealState() && isInviteTransaction()) {
            raiseErrorEvent(1);
            setState(5);
            this.sipStack.removeTransaction(this);
        } else if (3 == getRealState() && !isInviteTransaction()) {
            setState(5);
            if (!getMethod().equals("CANCEL")) {
                cleanUp();
            } else {
                this.sipStack.removeTransaction(this);
            }
        } else if (4 == getRealState() && isInviteTransaction()) {
            setState(5);
            this.sipStack.removeTransaction(this);
        } else if (!isInviteTransaction() && (3 == getRealState() || 4 == getRealState())) {
            setState(5);
        } else if (isInviteTransaction() && 5 == getRealState()) {
            raiseErrorEvent(1);
            if (sIPDialog != null) {
                sIPDialog.setState(3);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public b getDialog() {
        String str;
        SIPDialog sIPDialog = this.dialog;
        if (sIPDialog == null && (str = this.dialogId) != null) {
            return this.sipStack.getDialog(str);
        }
        return sIPDialog;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public int getLastResponseStatusCode() {
        return this.lastResponseStatusCode;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public long getPendingReliableCSeqNumber() {
        return this.pendingReliableCSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public long getPendingReliableRSeqNumber() {
        return this.pendingReliableRSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public String getPendingReliableResponseMethod() {
        return this.pendingReliableResponseMethod;
    }

    public int getRealState() {
        return super.getInternalState();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public byte[] getReliableProvisionalResponse() {
        return this.pendingReliableResponseAsBytes;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public MessageChannel getResponseChannel() {
        return this.encapsulatedChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public v getState() {
        if (isInviteTransaction() && 1 == super.getInternalState()) {
            return v.f24342j0;
        }
        return super.getState();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public String getViaHost() {
        return super.getViaHost();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public int getViaPort() {
        return super.getViaPort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isMessagePartOfTransaction(SIPMessage sIPMessage) {
        Via topmostVia;
        boolean z10;
        boolean z11;
        String method = sIPMessage.getCSeq().getMethod();
        SIPRequest originalRequest = getOriginalRequest();
        if ((!isInviteTransaction() && isTerminated()) || (topmostVia = sIPMessage.getTopmostVia()) == null) {
            return false;
        }
        String branch = topmostVia.getBranch();
        if (branch != null && !branch.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
            branch = null;
        }
        if (branch != null && getBranch() != null) {
            if (method.equals("CANCEL")) {
                if (!getMethod().equals("CANCEL") || !getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy())) {
                    return false;
                }
            } else if (originalRequest != null) {
                if (!getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy())) {
                    return false;
                }
            } else if (!getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(this.originalRequestSentBy)) {
                return false;
            }
        } else {
            SIPRequest sIPRequest = (SIPRequest) getRequest();
            String fromTag = sIPRequest.getFromTag();
            String tag = sIPMessage.getFrom().getTag();
            if (fromTag != null && tag != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            String toTag = sIPRequest.getToTag();
            String tag2 = sIPMessage.getTo().getTag();
            if (toTag != null && tag2 != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean z12 = sIPMessage instanceof SIPResponse;
            if (sIPMessage.getCSeq().getMethod().equalsIgnoreCase("CANCEL") && !sIPRequest.getCSeq().getMethod().equalsIgnoreCase("CANCEL")) {
                return false;
            }
            if (!z12 && !sIPRequest.getRequestURI().equals(((SIPRequest) sIPMessage).getRequestURI())) {
                return false;
            }
            if (!z10 && (fromTag == null || !fromTag.equalsIgnoreCase(tag))) {
                return false;
            }
            if ((!z11 && (toTag == null || !toTag.equalsIgnoreCase(tag2))) || !sIPRequest.getCallId().getCallId().equalsIgnoreCase(sIPMessage.getCallId().getCallId()) || sIPRequest.getCSeq().getSeqNumber() != sIPMessage.getCSeq().getSeqNumber()) {
                return false;
            }
            if ((sIPMessage.getCSeq().getMethod().equals("CANCEL") && !getMethod().equals(sIPMessage.getCSeq().getMethod())) || !topmostVia.equals(sIPRequest.getTopmostVia())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean isRetransmissionAlertEnabled() {
        return this.retransmissionAlertEnabled;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void map() {
        int realState = getRealState();
        if (realState < 0 || realState == 1) {
            if (isInviteTransaction() && !this.isMapped && this.sipStack.getTimer() != null) {
                this.isMapped = true;
                this.sipStack.getTimer().schedule(new SendTrying(), 200L);
            } else {
                this.isMapped = true;
            }
        }
        this.sipStack.removePendingTransaction(this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public boolean prackRecieved() {
        if (this.pendingReliableResponseAsBytes == null) {
            return false;
        }
        if (this.provisionalResponseTask != null) {
            this.sipStack.getTimer().cancel(this.provisionalResponseTask);
            this.provisionalResponseTask = null;
        }
        this.pendingReliableResponseAsBytes = null;
        if (interlockProvisionalResponses && getDialog() != null) {
            this.provisionalResponseSem.release();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b5, code lost:
        r0.ackReceived(r9.getCSeq().getSeqNumber());
        r0.ackProcessed = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116 A[Catch: IOException -> 0x0068, TryCatch #0 {IOException -> 0x0068, blocks: (B:5:0x003e, B:8:0x0049, B:10:0x0058, B:12:0x005c, B:16:0x006e, B:18:0x0074, B:20:0x007a, B:22:0x0084, B:24:0x0091, B:25:0x0097, B:26:0x009a, B:28:0x00a2, B:29:0x00aa, B:31:0x00b2, B:32:0x00cc, B:34:0x00d0, B:36:0x00de, B:38:0x00e5, B:41:0x00ec, B:43:0x00f6, B:45:0x00fa, B:46:0x0100, B:47:0x0104, B:48:0x0108, B:49:0x010e, B:51:0x0116, B:54:0x0146, B:56:0x014c, B:58:0x0152, B:60:0x0156, B:63:0x0166, B:64:0x016f, B:65:0x0174, B:67:0x0178, B:68:0x017f, B:69:0x0184, B:71:0x018e, B:73:0x0194, B:75:0x019e, B:77:0x01a2, B:79:0x01aa, B:82:0x01af, B:84:0x01b5, B:85:0x01c2, B:86:0x01ca, B:88:0x01d6, B:90:0x01de, B:91:0x01e5, B:94:0x01f2, B:95:0x01f5, B:97:0x01fd), top: B:104:0x003e }] */
    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.stack.ServerRequestInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        boolean z10;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("processRequest: " + sIPRequest.getFirstLine());
            logger.logDebug("tx state = " + getRealState());
        }
        try {
            if (getRealState() < 0) {
                setOriginalRequest(sIPRequest);
                setState(1);
                setPassToListener();
                if (isInviteTransaction() && this.isMapped) {
                    sendMessage(sIPRequest.createResponse(100, "Trying"));
                }
                z10 = true;
            } else if (isInviteTransaction() && 3 == getRealState() && sIPRequest.getMethod().equals(TokenNames.ACK)) {
                setState(4);
                disableRetransmissionTimer();
                if (!isReliable()) {
                    enableTimeoutTimer(this.timerI);
                } else {
                    setState(5);
                }
                if (this.sipStack.isNon2XXAckPassedToListener()) {
                    this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                    return;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("ACK received for server Tx " + getTransactionId() + " not delivering to application!");
                }
                semRelease();
                return;
            } else if (sIPRequest.getMethod().equals(getMethod())) {
                if (2 != getRealState() && 3 != getRealState()) {
                    if (sIPRequest.getMethod().equals(TokenNames.ACK)) {
                        ServerRequestInterface serverRequestInterface = this.requestOf;
                        if (serverRequestInterface != null) {
                            serverRequestInterface.processRequest(sIPRequest, this.encapsulatedChannel);
                        } else {
                            semRelease();
                        }
                    } else {
                        semRelease();
                    }
                    if (!logger.isLoggingEnabled(32)) {
                        logger.logDebug("completed processing retransmitted request : " + sIPRequest.getFirstLine() + this + " txState = " + getState() + " lastResponse = " + this.lastResponseAsBytes);
                        return;
                    }
                    return;
                }
                semRelease();
                resendLastResponseAsBytes();
                if (!logger.isLoggingEnabled(32)) {
                }
            } else {
                z10 = false;
            }
            if (3 != getRealState() && 5 != getRealState() && this.requestOf != null) {
                if (getMethod().equals(sIPRequest.getMethod())) {
                    if (z10) {
                        this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
                        return;
                    } else {
                        semRelease();
                        return;
                    }
                }
                ServerRequestInterface serverRequestInterface2 = this.requestOf;
                if (serverRequestInterface2 != null) {
                    serverRequestInterface2.processRequest(sIPRequest, this.encapsulatedChannel);
                    return;
                } else {
                    semRelease();
                    return;
                }
            }
            if (SIPTransactionStack.isDialogCreated(getMethod()) && getRealState() == 5 && sIPRequest.getMethod().equals(TokenNames.ACK) && this.requestOf != null) {
                SIPDialog sIPDialog = (SIPDialog) getDialog();
                if (sIPDialog != null && sIPDialog.ackProcessed) {
                    semRelease();
                }
                this.requestOf.processRequest(sIPRequest, this.encapsulatedChannel);
            } else if (sIPRequest.getMethod().equals("CANCEL")) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Too late to cancel Transaction");
                }
                semRelease();
                try {
                    sendMessage(sIPRequest.createResponse(RCHTTPStatusCodes.SUCCESS));
                } catch (IOException unused) {
                }
            } else {
                semRelease();
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping request " + getRealState());
            }
        } catch (IOException e10) {
            if (logger.isLoggingEnabled()) {
                logger.logError("IOException ", e10);
            }
            semRelease();
            raiseIOExceptionEvent();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void releaseSem() {
        if (this.pendingSubscribeTransaction != null) {
            if (!this.sipStack.isDeliverUnsolicitedNotify()) {
                this.pendingSubscribeTransaction.releaseSem();
            }
        } else if (this.inviteTransaction != null && getMethod().equals("CANCEL")) {
            this.inviteTransaction.releaseSem();
        }
        super.releaseSem();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void resendLastResponseAsBytes() {
        if (this.lastResponse != null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("resend last response " + this.lastResponse);
            }
            sendMessage(this.lastResponse);
        } else if (this.lastResponseAsBytes != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("resend last response ".concat(new String(this.lastResponseAsBytes)));
            }
            if (isReliable()) {
                if (logger.isLoggingEnabled(16)) {
                    try {
                        SIPResponse sIPResponse = (SIPResponse) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.lastResponseAsBytes, true, false, null);
                        sIPResponse.setRemoteAddress(getPeerInetAddress());
                        sIPResponse.setRemotePort(getPeerPort());
                        sIPResponse.setLocalPort(getMessageChannel().getPort());
                        sIPResponse.setLocalAddress(getMessageChannel().getMessageProcessor().getIpAddress());
                        getMessageChannel().logMessage(sIPResponse, getPeerInetAddress(), getPeerPort(), System.currentTimeMillis());
                    } catch (ParseException e10) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("couldn't reparse last response ".concat(new String(this.lastResponseAsBytes)), e10);
                        }
                    }
                }
                getMessageChannel().sendMessage(this.lastResponseAsBytes, getPeerInetAddress(), getPeerPort(), false);
                return;
            }
            AbstractC2092b resolveAddress = this.sipStack.addressResolver.resolveAddress(new HopImpl(this.lastResponseHost, this.lastResponsePort, this.lastResponseTransport));
            MessageChannel createRawMessageChannel = getSIPStack().createRawMessageChannel(getSipProvider().getListeningPoint(resolveAddress.getTransport()).getIPAddress(), getPort(), resolveAddress);
            if (createRawMessageChannel != null) {
                if (logger.isLoggingEnabled(16)) {
                    try {
                        SIPResponse sIPResponse2 = (SIPResponse) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.lastResponseAsBytes, true, false, null);
                        sIPResponse2.setRemoteAddress(createRawMessageChannel.getPeerInetAddress());
                        sIPResponse2.setRemotePort(createRawMessageChannel.getPeerPort());
                        sIPResponse2.setLocalPort(createRawMessageChannel.getPort());
                        sIPResponse2.setLocalAddress(createRawMessageChannel.getMessageProcessor().getIpAddress());
                        createRawMessageChannel.logMessage(sIPResponse2, createRawMessageChannel.getPeerInetAddress(), createRawMessageChannel.getPeerPort(), System.currentTimeMillis());
                    } catch (ParseException e11) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("couldn't reparse last response ".concat(new String(this.lastResponseAsBytes)), e11);
                        }
                    }
                }
                createRawMessageChannel.sendMessage(this.lastResponseAsBytes, InetAddress.getByName(resolveAddress.getHost()), resolveAddress.getPort(), false);
                return;
            }
            throw new IOException("Could not create a message channel for " + resolveAddress + " with source IP:Port " + getSipProvider().getListeningPoint(resolveAddress.getTransport()).getIPAddress() + ":" + getPort());
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void scheduleAckRemoval() {
        boolean z10;
        if (getMethod() != null && getMethod().equals(TokenNames.ACK)) {
            startTransactionTimer();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Method is null[");
        if (getMethod() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append("] or method is not ACK[");
        sb2.append(getMethod());
        sb2.append("]");
        throw new IllegalStateException(sb2.toString());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void sendMessage(SIPMessage sIPMessage) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("sipServerTransaction::sendMessage " + sIPMessage.getFirstLine());
        }
        SIPResponse sIPResponse = (SIPResponse) sIPMessage;
        int statusCode = sIPResponse.getStatusCode();
        try {
            try {
                if (this.originalRequestBranch != null) {
                    sIPResponse.getTopmostVia().setBranch(getBranch());
                } else {
                    sIPResponse.getTopmostVia().removeParameter("branch");
                }
                if (!this.originalRequestHasPort) {
                    sIPResponse.getTopmostVia().removePort();
                }
                if (!sIPResponse.getCSeq().getMethod().equals(getMethod())) {
                    sendResponse(sIPResponse);
                    startTransactionTimer();
                } else if (!checkStateTimers(statusCode)) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("checkStateTimers returned false -- not sending message");
                    }
                    startTransactionTimer();
                } else {
                    try {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger2 = logger;
                            stackLogger2.logDebug("sendMessage : tx = " + this + " getState = " + getState());
                        }
                        this.lastResponse = sIPResponse;
                        this.lastResponseStatusCode = sIPResponse.getStatusCode();
                        sendResponse(sIPResponse);
                        startTransactionTimer();
                    } catch (IOException e10) {
                        setState(5);
                        this.collectionTime = 0;
                        throw e10;
                    }
                }
            } catch (ParseException e11) {
                logger.logError("UnexpectedException", e11);
                throw new IOException("Unexpected exception");
            }
        } catch (Throwable th2) {
            startTransactionTimer();
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void sendReliableProvisionalResponse(AbstractC2562c abstractC2562c) {
        if (this.pendingReliableResponseAsBytes == null) {
            SIPResponse sIPResponse = (SIPResponse) abstractC2562c;
            this.pendingReliableResponseAsBytes = sIPResponse.encodeAsBytes(getTransport());
            this.pendingReliableResponseMethod = sIPResponse.getCSeq().getMethod();
            this.pendingReliableCSeqNumber = sIPResponse.getCSeq().getSeqNumber();
            RSeq rSeq = (RSeq) abstractC2562c.getHeader(SIPHeaderNames.RSEQ);
            if (abstractC2562c.getHeader(SIPHeaderNames.RSEQ) == null) {
                rSeq = new RSeq();
                abstractC2562c.setHeader(rSeq);
            }
            try {
                if (this.rseqNumber < 0) {
                    this.rseqNumber = (int) (Math.random() * 1000.0d);
                }
                int i10 = this.rseqNumber + 1;
                this.rseqNumber = i10;
                rSeq.setSeqNumber(i10);
                this.pendingReliableRSeqNumber = rSeq.getSeqNumber();
                this.lastResponse = (SIPResponse) abstractC2562c;
                if (getDialog() != null && interlockProvisionalResponses && !this.provisionalResponseSem.tryAcquire(1L, TimeUnit.SECONDS)) {
                    throw new n("Unacknowledged reliable response");
                }
                this.provisionalResponseTask = new ProvisionalResponseTask();
                this.sipStack.getTimer().scheduleWithFixedDelay(this.provisionalResponseTask, 0L, 500L);
                sendMessage((SIPMessage) abstractC2562c);
                return;
            } catch (Exception e10) {
                InternalErrorHandler.handleException(e10);
                return;
            }
        }
        throw new n("Unacknowledged response");
    }

    public void sendResponse(SIPResponse sIPResponse) {
        String str;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("sipServerTransaction::sendResponse " + sIPResponse.getFirstLine());
        }
        try {
            if (isReliable() && !this.sipStack.isPatchReceivedRport()) {
                getMessageChannel().sendMessage(sIPResponse);
            } else {
                Via topmostVia = sIPResponse.getTopmostVia();
                String transport = topmostVia.getTransport();
                if (transport != null) {
                    int rPort = topmostVia.getRPort();
                    if (rPort == -1) {
                        rPort = topmostVia.getPort();
                    }
                    if (rPort == -1) {
                        rPort = transport.equalsIgnoreCase("TLS") ? SIPConstants.DEFAULT_TLS_PORT : SIPConstants.DEFAULT_PORT;
                    }
                    if (topmostVia.getMAddr() != null) {
                        str = topmostVia.getMAddr();
                    } else {
                        String parameter = topmostVia.getParameter("received");
                        str = parameter == null ? topmostVia.getHost() : parameter;
                    }
                    AbstractC2092b resolveAddress = this.sipStack.addressResolver.resolveAddress(new HopImpl(str, rPort, transport));
                    MessageChannel createRawMessageChannel = getSIPStack().createRawMessageChannel(getSipProvider().getListeningPoint(resolveAddress.getTransport()).getIPAddress(), getPort(), resolveAddress);
                    if (createRawMessageChannel == null) {
                        throw new IOException("Could not create a message channel for " + resolveAddress + " with source IP:Port " + getSipProvider().getListeningPoint(resolveAddress.getTransport()).getIPAddress() + ":" + getPort());
                    }
                    createRawMessageChannel.sendMessage(sIPResponse);
                    this.lastResponseHost = str;
                    this.lastResponsePort = rPort;
                    this.lastResponseTransport = transport;
                } else {
                    throw new IOException("missing transport!");
                }
            }
            this.lastResponseAsBytes = sIPResponse.encodeAsBytes(getTransport());
            this.lastResponse = null;
            startTransactionTimer();
        } catch (Throwable th2) {
            startTransactionTimer();
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setAckSeen() {
        this.isAckSeen = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setDialog(SIPDialog sIPDialog, String str) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("setDialog " + this + " dialog = " + sIPDialog);
        }
        this.dialog = sIPDialog;
        this.dialogId = str;
        if (str != null) {
            sIPDialog.setAssigned();
        }
        if (this.retransmissionAlertEnabled && this.retransmissionAlertTimerTask != null) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            String str2 = this.retransmissionAlertTimerTask.dialogId;
            if (str2 != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str2);
            }
            this.retransmissionAlertTimerTask = null;
        }
        this.retransmissionAlertEnabled = false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setInviteTransaction(SIPServerTransaction sIPServerTransaction) {
        this.inviteTransaction = sIPServerTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setMapped(boolean z10) {
        this.isMapped = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setOriginalRequest(SIPRequest sIPRequest) {
        super.setOriginalRequest(sIPRequest);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setPendingSubscribe(SIPClientTransaction sIPClientTransaction) {
        this.pendingSubscribeTransaction = sIPClientTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void setRequestInterface(ServerRequestInterface serverRequestInterface) {
        this.requestOf = serverRequestInterface;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction
    public void setState(int i10) {
        if (i10 == 5 && isReliable() && !getSIPStack().cacheServerConnections) {
            this.collectionTime = 64;
            this.terminationSemaphore.release();
        }
        super.setState(i10);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void startTransactionTimer() {
        if ((getMethod().equalsIgnoreCase(TokenNames.INVITE) || getMethod().equalsIgnoreCase("CANCEL") || getMethod().equalsIgnoreCase(TokenNames.ACK)) && this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            TransactionTimer transactionTimer = new TransactionTimer();
            if (this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
                SipTimer timer = this.sipStack.getTimer();
                int i10 = this.baseTimerInterval;
                timer.scheduleWithFixedDelay(transactionTimer, i10, i10);
            }
        }
    }

    public void startTransactionTimerJ(long j6) {
        if (this.transactionTimerStarted.compareAndSet(false, true) && this.sipStack.getTimer() != null && this.sipStack.getTimer().isStarted()) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("starting TransactionTimerJ() : " + getTransactionId() + " time " + j6);
            }
            SIPStackTimerTask sIPStackTimerTask = new SIPStackTimerTask() { // from class: android.gov.nist.javax.sip.stack.SIPServerTransactionImpl.1
                @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                public Object getThreadHash() {
                    AbstractC2561b request = SIPServerTransactionImpl.this.getRequest();
                    if (request != null && (request instanceof SIPRequest)) {
                        return ((SIPRequest) request).getCallIdHeader().getCallId();
                    }
                    return null;
                }

                @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
                public void runTask() {
                    if (SIPServerTransactionImpl.logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = SIPServerTransactionImpl.logger;
                        stackLogger2.logDebug("executing TransactionTimerJ() : " + SIPServerTransactionImpl.this.getTransactionId());
                    }
                    SIPServerTransactionImpl.this.fireTimeoutTimer();
                    SIPServerTransactionImpl.this.cleanUp();
                    SIPRequest sIPRequest = SIPServerTransactionImpl.this.originalRequest;
                    if (sIPRequest != null) {
                        sIPRequest.cleanUp();
                    }
                }
            };
            if (j6 > 0) {
                this.sipStack.getTimer().schedule(sIPStackTimerTask, j6 * this.baseTimerInterval);
            } else {
                sIPStackTimerTask.runTask();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionImpl, android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void terminate() {
        setState(5);
        if (this.retransmissionAlertTimerTask != null) {
            this.sipStack.getTimer().cancel(this.retransmissionAlertTimerTask);
            String str = this.retransmissionAlertTimerTask.dialogId;
            if (str != null) {
                this.sipStack.retransmissionAlertTransactions.remove(str);
            }
            this.retransmissionAlertTimerTask = null;
        }
        if (!this.transactionTimerStarted.get()) {
            testAndSetTransactionTerminatedEvent();
            this.sipStack.removeTransaction(this);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction
    public void waitForTermination() {
        try {
            this.terminationSemaphore.acquire();
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.ServerTransactionExt
    public SIPServerTransaction getCanceledInviteTransaction() {
        return this.inviteTransaction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0211, code lost:
        r2.getFrom().setTag(r0);
     */
    @Override // android.gov.nist.javax.sip.stack.SIPServerTransaction, android.gov.nist.javax.sip.ServerTransactionExt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sendResponse(AbstractC2562c abstractC2562c) {
        SIPResponse sIPResponse = (SIPResponse) abstractC2562c;
        SIPDialog sIPDialog = (SIPDialog) getDialog();
        if (abstractC2562c != null) {
            try {
                sIPResponse.checkHeaders();
                String method = sIPResponse.getCSeq().getMethod();
                if (method.equals(getMethod())) {
                    int statusCode = abstractC2562c.getStatusCode();
                    if (getMethod().equals(TokenNames.SUBSCRIBE) && statusCode / 100 == 2) {
                        if (abstractC2562c.getHeader(SIPHeaderNames.EXPIRES) != null) {
                            Expires expires = (Expires) getOriginalRequest().getExpires();
                            Expires expires2 = (Expires) abstractC2562c.getExpires();
                            if (expires != null && expires2.getExpires() > expires.getExpires()) {
                                throw new n("Response Expires time exceeds request Expires time : See RFC 3265 3.1.1");
                            }
                        } else {
                            throw new IllegalTransactionStateException("Expires header is mandatory in 2xx response of SUBSCRIBE", IllegalTransactionStateException.Reason.ExpiresHeaderMandatory);
                        }
                    }
                    if (statusCode == 200 && method.equals(TokenNames.INVITE) && sIPResponse.getHeader(SIPHeaderNames.CONTACT) == null) {
                        throw new IllegalTransactionStateException("Contact Header is mandatory for the OK to the INVITE", IllegalTransactionStateException.Reason.ContactHeaderMandatory);
                    }
                    if (isMessagePartOfTransaction((SIPMessage) abstractC2562c)) {
                        try {
                            ContentType contentTypeHeader = ((SIPResponse) abstractC2562c).getContentTypeHeader();
                            if (this.pendingReliableResponseAsBytes != null && getDialog() != null && getInternalState() != 5 && statusCode / 100 == 2 && contentTypeHeader != null && contentTypeHeader.getContentType().equalsIgnoreCase(SIPServerTransaction.CONTENT_TYPE_APPLICATION) && contentTypeHeader.getContentSubType().equalsIgnoreCase(SIPServerTransaction.CONTENT_SUBTYPE_SDP)) {
                                if (interlockProvisionalResponses) {
                                    try {
                                        if (!this.provisionalResponseSem.tryAcquire(1L, TimeUnit.SECONDS)) {
                                            throw new n("cannot send response -- unacked provisional");
                                        }
                                    } catch (InterruptedException unused) {
                                        logger.logError("Interrupted acuqiring PRACK sem");
                                        throw new n("Cannot aquire PRACK sem");
                                    }
                                } else {
                                    throw new n("cannot send response -- unacked provisional");
                                }
                            } else if (this.pendingReliableResponseAsBytes != null && sIPResponse.isFinalResponse()) {
                                this.sipStack.getTimer().cancel(this.provisionalResponseTask);
                                this.provisionalResponseTask = null;
                            }
                            if (sIPDialog != null) {
                                if (statusCode / 100 == 2 && SIPTransactionStack.isDialogCreated(method)) {
                                    if (sIPDialog.getLocalTag() == null && sIPResponse.getToTag() == null) {
                                        sIPResponse.getTo().setTag(Utils.getInstance().generateTag());
                                    } else if (sIPDialog.getLocalTag() != null && sIPResponse.getToTag() == null) {
                                        if (logger.isLoggingEnabled(32)) {
                                            StackLogger stackLogger = logger;
                                            stackLogger.logDebug("assigning toTag : serverTransaction = " + this + " dialog " + sIPDialog + " tag = " + sIPDialog.getLocalTag());
                                        }
                                        sIPResponse.setToTag(sIPDialog.getLocalTag());
                                    } else if (sIPDialog.getLocalTag() != null && sIPResponse.getToTag() != null && !sIPDialog.getLocalTag().equals(sIPResponse.getToTag())) {
                                        throw new n("Tag mismatch dialogTag is " + sIPDialog.getLocalTag() + " responseTag is " + sIPResponse.getToTag());
                                    }
                                }
                                if (!sIPResponse.getCallId().getCallId().equals(sIPDialog.getCallId().getCallId())) {
                                    throw new n("Dialog mismatch!");
                                }
                            }
                            String str = this.originalRequestFromTag;
                            if (getRequest() != null) {
                                str = ((SIPRequest) getRequest()).getFromTag();
                            }
                            if (str != null && sIPResponse.getFromTag() != null && !sIPResponse.getFromTag().equals(str)) {
                                throw new n("From tag of request does not match response from tag");
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("WARNING -- Null From tag in request!!");
                            }
                            if (sIPDialog != null && statusCode != 100) {
                                sIPDialog.setResponseTags(sIPResponse);
                                d state = sIPDialog.getState();
                                sIPDialog.setLastResponse(this, (SIPResponse) abstractC2562c);
                                if (state == null && sIPDialog.getState() == d.f24329j0) {
                                    sIPDialog.getSipProvider().handleEvent(new e(sIPDialog.getSipProvider(), sIPDialog), this);
                                }
                            } else if (sIPDialog == null && isInviteTransaction() && this.retransmissionAlertEnabled && this.retransmissionAlertTimerTask == null && abstractC2562c.getStatusCode() / 100 == 2) {
                                String dialogId = ((SIPResponse) abstractC2562c).getDialogId(true);
                                this.retransmissionAlertTimerTask = new RetransmissionAlertTimerTask(dialogId);
                                this.sipStack.retransmissionAlertTransactions.put(dialogId, this);
                                this.sipStack.getTimer().scheduleWithFixedDelay(this.retransmissionAlertTimerTask, 0L, 500L);
                            }
                            sendMessage((SIPResponse) abstractC2562c);
                            if (sIPDialog == null) {
                                return;
                            }
                            sIPDialog.startRetransmitTimer(this, (SIPResponse) abstractC2562c);
                            return;
                        } catch (IOException e10) {
                            if (logger.isLoggingEnabled()) {
                                logger.logException(e10);
                            }
                            setState(5);
                            raiseErrorEvent(2);
                            throw new n(e10.getMessage(), e10);
                        } catch (ParseException e11) {
                            if (logger.isLoggingEnabled()) {
                                logger.logException(e11);
                            }
                            setState(5);
                            throw new n(e11.getMessage(), e11);
                        }
                    }
                    throw new n("Response does not belong to this transaction.");
                }
                throw new IllegalTransactionStateException("CSeq method does not match Request method of request that created the tx.", IllegalTransactionStateException.Reason.UnmatchingCSeq);
            } catch (ParseException e12) {
                throw new IllegalTransactionStateException(e12.getMessage(), IllegalTransactionStateException.Reason.MissingRequiredHeader);
            }
        }
        throw new NullPointerException("null response");
    }
}
