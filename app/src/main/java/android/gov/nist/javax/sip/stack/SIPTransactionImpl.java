package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.ReleaseReferencesStrategy;
import android.gov.nist.javax.sip.SIPConstants;
import android.gov.nist.javax.sip.SipProviderImpl;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.ThreadAffinityTask;
import android.gov.nist.javax.sip.address.AddressFactoryImpl;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPClientTransactionImpl;
import android.javax.sip.b;
import android.javax.sip.f;
import android.javax.sip.v;
import b.AbstractC2094d;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.io.IOException;
import java.net.InetAddress;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class SIPTransactionImpl implements SIPTransaction {

    /* renamed from: T4  reason: collision with root package name */
    protected int f24325T4;
    protected transient Object applicationData;
    private String branch;
    protected int collectionTime;
    private int currentState;
    protected transient MessageChannel encapsulatedChannel;
    private transient Set<SIPTransactionEventListener> eventListeners;
    public SIPClientTransactionImpl.ExpiresTimerTask expiresTimerTask;
    protected boolean isMapped;
    protected SIPResponse lastResponse;
    private MaxTxLifeTimeListener maxTxLifeTimeListener;
    private String method;
    protected SIPRequest originalRequest;
    protected String originalRequestBranch;
    protected byte[] originalRequestBytes;
    protected long originalRequestCSeqNumber;
    protected boolean originalRequestHasPort;
    private ReleaseReferencesStrategy releaseReferencesStrategy;
    private transient int retransmissionTimerLastTickCount;
    private transient int retransmissionTimerTicksLeft;
    protected transient SIPTransactionStack sipStack;
    private boolean terminatedEventDelivered;
    protected int timeoutTimerTicksLeft;
    protected int timerI;
    protected int timerK;
    protected boolean toListener;
    protected String transactionId;
    private static StackLogger logger = CommonLogger.getLogger(SIPTransaction.class);
    private static final Pattern EXTRACT_CN = Pattern.compile(".*CN\\s*=\\s*([\\w*\\.\\-_]+).*");
    protected int baseTimerInterval = 500;

    /* renamed from: T2  reason: collision with root package name */
    protected int f24324T2 = 4000 / 500;
    protected int timerD = 32000 / 500;
    protected long auditTag = 0;
    protected AtomicBoolean transactionTimerStarted = new AtomicBoolean(false);
    private Boolean inviteTransaction = null;
    private Boolean dialogCreatingTransaction = null;
    private String forkId = null;
    protected String mergeId = null;
    private transient TransactionSemaphore semaphore = new TransactionSemaphore();

    /* loaded from: classes2.dex */
    public class LingerTimer extends SIPStackTimerTask {
        public LingerTimer() {
            if (SIPTransactionImpl.logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = SIPTransactionImpl.logger;
                stackLogger.logDebug("LingerTimer : " + SIPTransactionImpl.this.getTransactionId());
            }
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            SIPTransactionImpl.this.cleanUp();
        }
    }

    /* loaded from: classes2.dex */
    public class MaxTxLifeTimeListener extends SIPStackTimerTask {
        SIPTransaction sipTransaction;

        public MaxTxLifeTimeListener() {
            this.sipTransaction = SIPTransactionImpl.this;
        }

        @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
        public Object getThreadHash() {
            AbstractC2561b request = SIPTransactionImpl.this.getRequest();
            if (request != null && (request instanceof SIPRequest)) {
                return ((SIPRequest) request).getCallIdHeader().getCallId();
            }
            return null;
        }

        @Override // android.gov.nist.javax.sip.stack.SIPStackTimerTask
        public void runTask() {
            try {
                if (SIPTransactionImpl.logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = SIPTransactionImpl.logger;
                    stackLogger.logDebug("Fired MaxTxLifeTimeListener for tx " + this.sipTransaction + " , tx id " + this.sipTransaction.getTransactionId() + " , state " + this.sipTransaction.getState());
                }
                SIPTransactionImpl.this.raiseErrorEvent(1);
                LingerTimer lingerTimer = new LingerTimer();
                if (SIPTransactionImpl.this.sipStack.getConnectionLingerTimer() != 0) {
                    SIPTransactionImpl.this.sipStack.getTimer().schedule(lingerTimer, SIPTransactionImpl.this.sipStack.getConnectionLingerTimer() * 1000);
                } else {
                    lingerTimer.runTask();
                }
                SIPTransactionImpl.this.maxTxLifeTimeListener = null;
            } catch (Exception e10) {
                SIPTransactionImpl.logger.logError("unexpected exception", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class TransactionSemaphore {
        private static final long serialVersionUID = -1634100711669020804L;
        ReentrantLock lock;
        Semaphore sem;

        public TransactionSemaphore() {
            this.sem = null;
            this.lock = null;
            if (((SipStackImpl) SIPTransactionImpl.this.sipStack).isReEntrantListener()) {
                this.lock = new ReentrantLock();
            } else {
                this.sem = new Semaphore(1, true);
            }
        }

        public boolean acquire() {
            try {
                if (((SipStackImpl) SIPTransactionImpl.this.sipStack).isReEntrantListener()) {
                    this.lock.lock();
                    return true;
                }
                this.sem.acquire();
                return true;
            } catch (Exception e10) {
                SIPTransactionImpl.logger.logError("Unexpected exception acquiring sem", e10);
                InternalErrorHandler.handleException(e10);
                return false;
            }
        }

        public void release() {
            try {
                if (((SipStackImpl) SIPTransactionImpl.this.sipStack).isReEntrantListener()) {
                    if (this.lock.isHeldByCurrentThread()) {
                        this.lock.unlock();
                    }
                } else {
                    this.sem.release();
                }
            } catch (Exception e10) {
                SIPTransactionImpl.logger.logError("Unexpected exception releasing sem", e10);
            }
        }

        public boolean tryAcquire() {
            try {
                if (((SipStackImpl) SIPTransactionImpl.this.sipStack).isReEntrantListener()) {
                    return this.lock.tryLock(SIPTransactionImpl.this.sipStack.maxListenerResponseTime, TimeUnit.SECONDS);
                }
                return this.sem.tryAcquire(SIPTransactionImpl.this.sipStack.maxListenerResponseTime, TimeUnit.SECONDS);
            } catch (Exception e10) {
                SIPTransactionImpl.logger.logError("Unexpected exception trying acquiring sem", e10);
                InternalErrorHandler.handleException(e10);
                return false;
            }
        }
    }

    public SIPTransactionImpl(SIPTransactionStack sIPTransactionStack, MessageChannel messageChannel) {
        int i10 = 5000 / 500;
        this.f24325T4 = i10;
        this.timerI = i10;
        this.timerK = i10;
        this.currentState = -1;
        this.sipStack = sIPTransactionStack;
        this.encapsulatedChannel = messageChannel;
        if (isReliable()) {
            this.encapsulatedChannel.useCount++;
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("use count for encapsulated channel" + this + Separators.SP + this.encapsulatedChannel.useCount);
            }
        }
        this.currentState = -1;
        disableRetransmissionTimer();
        disableTimeoutTimer();
        this.eventListeners = new CopyOnWriteArraySet();
        addEventListener(sIPTransactionStack);
        this.releaseReferencesStrategy = this.sipStack.getReleaseReferencesStrategy();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean acquireSem() {
        boolean z10;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("acquireSem [[[[" + this);
            logger.logStackTrace();
        }
        if (this.sipStack.maxListenerResponseTime == -1) {
            z10 = this.semaphore.acquire();
        } else {
            z10 = this.semaphore.tryAcquire();
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logDebug("acquireSem() returning : " + z10);
        }
        return z10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void addEventListener(SIPTransactionEventListener sIPTransactionEventListener) {
        this.eventListeners.add(sIPTransactionEventListener);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void cancelMaxTxLifeTimeTimer() {
        if (this.maxTxLifeTimeListener != null) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Cancelling MaxTxLifeTimeListener for tx " + this + " , tx id " + getTransactionId() + " , state " + getState());
            }
            this.sipStack.getTimer().cancel(this.maxTxLifeTimeListener);
            this.maxTxLifeTimeListener = null;
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public abstract void cleanUp();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void close() {
        this.encapsulatedChannel.close();
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Closing " + this.encapsulatedChannel);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void disableRetransmissionTimer() {
        this.retransmissionTimerTicksLeft = -1;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void disableTimeoutTimer() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("disableTimeoutTimer " + this);
        }
        this.timeoutTimerTicksLeft = -1;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean doesCancelMatchTransaction(SIPRequest sIPRequest) {
        Via topmostVia;
        SIPRequest originalRequest = getOriginalRequest();
        if (originalRequest == null || getMethod().equals("CANCEL") || (topmostVia = sIPRequest.getTopmostVia()) == null) {
            return false;
        }
        String branch = topmostVia.getBranch();
        if (branch != null && !branch.toLowerCase().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE_LOWER_CASE)) {
            branch = null;
        }
        if (branch != null && getBranch() != null) {
            if (!getBranch().equalsIgnoreCase(branch) || !topmostVia.getSentBy().equals(originalRequest.getTopmostVia().getSentBy())) {
                return false;
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("returning  true");
            }
        } else {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("testing against " + originalRequest);
            }
            if (!originalRequest.getRequestURI().equals(sIPRequest.getRequestURI()) || !originalRequest.getTo().equals(sIPRequest.getTo()) || !originalRequest.getFrom().equals(sIPRequest.getFrom()) || !originalRequest.getCallId().getCallId().equals(sIPRequest.getCallId().getCallId()) || originalRequest.getCSeq().getSeqNumber() != sIPRequest.getCSeq().getSeqNumber() || !topmostVia.equals(originalRequest.getTopmostVia())) {
                return false;
            }
        }
        return true;
    }

    public void enableRetransmissionTimer() {
        enableRetransmissionTimer(1);
    }

    public void enableTimeoutTimer(int i10) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("enableTimeoutTimer " + this + " tickCount " + i10 + " currentTickCount = " + this.timeoutTimerTicksLeft);
        }
        this.timeoutTimerTicksLeft = i10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public List<String> extractCertIdentities() {
        Collection<List<?>> collection;
        if (!(getMessageChannel() instanceof TLSMessageChannel) && !(getMessageChannel() instanceof NioTlsMessageChannel)) {
            throw new UnsupportedOperationException("Not a TLS channel");
        }
        ArrayList arrayList = new ArrayList();
        Certificate[] peerCertificates = getPeerCertificates();
        if (peerCertificates == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("No certificates available");
            }
            return arrayList;
        }
        for (Certificate certificate : peerCertificates) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            try {
                collection = x509Certificate.getSubjectAlternativeNames();
            } catch (CertificateParsingException e10) {
                if (logger.isLoggingEnabled()) {
                    logger.logError("Error parsing TLS certificate", e10);
                }
                collection = null;
            }
            if (collection != null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("found subjAltNames: " + collection);
                }
                for (List<?> list : collection) {
                    if (list.get(0).equals(6)) {
                        try {
                            AbstractC2094d createSipURI = new AddressFactoryImpl().createSipURI((String) list.get(1));
                            if ("sip".equals(createSipURI.getScheme()) && createSipURI.getUser() == null) {
                                String host = createSipURI.getHost();
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("found uri " + list.get(1) + ", hostName " + host);
                                }
                                arrayList.add(host);
                            }
                        } catch (ParseException unused) {
                            if (logger.isLoggingEnabled()) {
                                logger.logError("certificate contains invalid uri: " + list.get(1));
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    for (List<?> list2 : collection) {
                        if (list2.get(0).equals(2)) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("found dns " + list2.get(1));
                            }
                            arrayList.add(list2.get(1).toString());
                        }
                    }
                }
            } else {
                String name = x509Certificate.getSubjectDN().getName();
                try {
                    Matcher matcher = EXTRACT_CN.matcher(name);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("found CN: " + group + " from DN: " + name);
                        }
                        arrayList.add(group);
                    }
                } catch (Exception e11) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("exception while extracting CN", e11);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void fireTimer() {
        int i10 = this.timeoutTimerTicksLeft;
        if (i10 != -1) {
            int i11 = i10 - 1;
            this.timeoutTimerTicksLeft = i11;
            if (i11 == 0) {
                fireTimeoutTimer();
            }
        }
        int i12 = this.retransmissionTimerTicksLeft;
        if (i12 != -1) {
            int i13 = i12 - 1;
            this.retransmissionTimerTicksLeft = i13;
            if (i13 == 0) {
                enableRetransmissionTimer(this.retransmissionTimerLastTickCount * 2);
                fireRetransmissionTimer();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public Object getApplicationData() {
        return this.applicationData;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public long getAuditTag() {
        return this.auditTag;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getBaseTimerInterval() {
        return this.baseTimerInterval;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getBranch() {
        if (this.branch == null) {
            this.branch = this.originalRequestBranch;
        }
        return this.branch;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public String getBranchId() {
        return this.branch;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public long getCSeq() {
        return this.originalRequestCSeqNumber;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public String getCipherSuite() {
        if (getMessageChannel() instanceof TLSMessageChannel) {
            if (((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener() == null || ((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getHandshakeCompletedEvent() == null) {
                return null;
            }
            return ((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getHandshakeCompletedEvent().getCipherSuite();
        } else if (getMessageChannel() instanceof NioTlsMessageChannel) {
            if (((NioTlsMessageChannel) getMessageChannel()).getHandshakeCompletedListener() == null) {
                return null;
            }
            return ((NioTlsMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getCipherSuite();
        } else {
            throw new UnsupportedOperationException("Not a TLS channel");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public abstract b getDialog();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getForkId() {
        return this.forkId;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public String getHost() {
        return this.encapsulatedChannel.getHost();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getInternalState() {
        return this.currentState;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getKey() {
        return this.encapsulatedChannel.getKey();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public SIPResponse getLastResponse() {
        return this.lastResponse;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public Certificate[] getLocalCertificates() {
        if (getMessageChannel() instanceof TLSMessageChannel) {
            if (((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener() == null || ((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getHandshakeCompletedEvent() == null) {
                return null;
            }
            return ((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getHandshakeCompletedEvent().getLocalCertificates();
        } else if (getMessageChannel() instanceof NioTlsMessageChannel) {
            if (((NioTlsMessageChannel) getMessageChannel()).getHandshakeCompletedListener() == null) {
                return null;
            }
            return ((NioTlsMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getLocalCertificates();
        } else {
            throw new UnsupportedOperationException("Not a TLS channel");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getMergeId() {
        String str = this.mergeId;
        if (str == null) {
            return ((SIPRequest) getRequest()).getMergeId();
        }
        return str;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public MessageChannel getMessageChannel() {
        return this.encapsulatedChannel;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public MessageProcessor getMessageProcessor() {
        return this.encapsulatedChannel.getMessageProcessor();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getMethod() {
        return this.method;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public SIPRequest getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public String getPeerAddress() {
        return this.encapsulatedChannel.getPeerAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public Certificate[] getPeerCertificates() {
        if (getMessageChannel() instanceof TLSMessageChannel) {
            if (((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener() == null || ((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getHandshakeCompletedEvent() == null) {
                return null;
            }
            return ((TLSMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getHandshakeCompletedEvent().getPeerCertificates();
        } else if (getMessageChannel() instanceof NioTlsMessageChannel) {
            if (((NioTlsMessageChannel) getMessageChannel()).getHandshakeCompletedListener() == null) {
                return null;
            }
            return ((NioTlsMessageChannel) getMessageChannel()).getHandshakeCompletedListener().getPeerCertificates();
        } else {
            throw new UnsupportedOperationException("Not a TLS channel");
        }
    }

    public InetAddress getPeerInetAddress() {
        return this.encapsulatedChannel.getPeerInetAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public InetAddress getPeerPacketSourceAddress() {
        return this.encapsulatedChannel.getPeerPacketSourceAddress();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getPeerPacketSourcePort() {
        return this.encapsulatedChannel.getPeerPacketSourcePort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public int getPeerPort() {
        return this.encapsulatedChannel.getPeerPort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getPeerProtocol() {
        return this.encapsulatedChannel.getPeerProtocol();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public int getPort() {
        return this.encapsulatedChannel.getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public ReleaseReferencesStrategy getReleaseReferencesStrategy() {
        return this.releaseReferencesStrategy;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public AbstractC2561b getRequest() {
        if (getReleaseReferencesStrategy() != ReleaseReferencesStrategy.None && this.originalRequest == null && this.originalRequestBytes != null) {
            if (logger.isLoggingEnabled(8)) {
                StackLogger stackLogger = logger;
                stackLogger.logWarning("reparsing original request " + this.originalRequestBytes + " since it was eagerly cleaned up, but beware this is not efficient with the aggressive flag set !");
            }
            try {
                this.originalRequest = (SIPRequest) this.sipStack.getMessageParserFactory().createMessageParser(this.sipStack).parseSIPMessage(this.originalRequestBytes, true, false, null);
            } catch (ParseException e10) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("message " + this.originalRequestBytes + " could not be reparsed !", e10);
                }
            }
        }
        return this.originalRequest;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public AbstractC2562c getResponse() {
        return this.lastResponse;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public int getRetransmitTimer() {
        return 500;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public SIPTransactionStack getSIPStack() {
        return this.sipStack;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public v getState() {
        int i10 = this.currentState;
        if (i10 < 0) {
            return null;
        }
        v[] vVarArr = v.f24339Z;
        if (i10 >= 0 && i10 < 6) {
            return v.f24339Z[i10];
        }
        throw new IllegalArgumentException("Invalid transactionState value");
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getT2() {
        return this.f24324T2;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getT4() {
        return this.f24325T4;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public int getTimerD() {
        return this.timerD;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getTimerI() {
        return this.timerI;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getTimerK() {
        return this.timerK;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public int getTimerT2() {
        return this.f24324T2;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public int getTimerT4() {
        return this.f24325T4;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getTransactionId() {
        return this.transactionId;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public String getTransport() {
        return this.encapsulatedChannel.getTransport();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public Via getViaHeader() {
        Via viaHeader = this.encapsulatedChannel.getViaHeader();
        try {
            viaHeader.setBranch(this.branch);
        } catch (ParseException unused) {
        }
        return viaHeader;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public String getViaHost() {
        return getViaHeader().getHost();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int getViaPort() {
        return getViaHeader().getPort();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public int hashCode() {
        String str = this.transactionId;
        if (str == null) {
            return -1;
        }
        return str.hashCode();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isByeTransaction() {
        return getMethod().equals(TokenNames.BYE);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isCancelTransaction() {
        return getMethod().equals("CANCEL");
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isDialogCreatingTransaction() {
        boolean z10;
        if (this.dialogCreatingTransaction == null) {
            if (!isInviteTransaction() && !getMethod().equals(TokenNames.SUBSCRIBE) && !getMethod().equals("REFER")) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.dialogCreatingTransaction = Boolean.valueOf(z10);
        }
        return this.dialogCreatingTransaction.booleanValue();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isInviteTransaction() {
        if (this.inviteTransaction == null) {
            this.inviteTransaction = Boolean.valueOf(getMethod().equals(TokenNames.INVITE));
        }
        return this.inviteTransaction.booleanValue();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public abstract boolean isMessagePartOfTransaction(SIPMessage sIPMessage);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isReliable() {
        return this.encapsulatedChannel.isReliable();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isSecure() {
        return this.encapsulatedChannel.isSecure();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isServerTransaction() {
        return this instanceof SIPServerTransaction;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isTerminated() {
        if (this.currentState == 5) {
            return true;
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean isTransactionMapped() {
        return this.isMapped;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public boolean passToListener() {
        return this.toListener;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void raiseErrorEvent(int i10) {
        SIPTransactionErrorEvent sIPTransactionErrorEvent = new SIPTransactionErrorEvent(this, i10);
        synchronized (this.eventListeners) {
            try {
                for (SIPTransactionEventListener sIPTransactionEventListener : this.eventListeners) {
                    sIPTransactionEventListener.transactionErrorEvent(sIPTransactionErrorEvent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 != 3) {
            this.eventListeners.clear();
            setState(5);
            if ((this instanceof SIPServerTransaction) && isByeTransaction() && getDialog() != null) {
                ((SIPDialog) getDialog()).setState(3);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void raiseIOExceptionEvent() {
        setState(5);
        getSipProvider().handleEvent(new f(getPeerPort(), this, getPeerAddress(), getTransport()), this);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void releaseSem() {
        try {
            this.toListener = false;
            semRelease();
        } catch (Exception e10) {
            logger.logError("Unexpected exception releasing sem", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void removeEventListener(SIPTransactionEventListener sIPTransactionEventListener) {
        this.eventListeners.remove(sIPTransactionEventListener);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void scheduleMaxTxLifeTimeTimer() {
        if (this.maxTxLifeTimeListener == null && getMethod().equalsIgnoreCase(TokenNames.INVITE) && this.sipStack.getMaxTxLifetimeInvite() > 0) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("Scheduling MaxTxLifeTimeListener for tx " + this + " , tx id " + getTransactionId() + " , state " + getState());
            }
            this.maxTxLifeTimeListener = new MaxTxLifeTimeListener();
            this.sipStack.getTimer().schedule(this.maxTxLifeTimeListener, this.sipStack.getMaxTxLifetimeInvite() * 1000);
        }
        if (this.maxTxLifeTimeListener == null && !getMethod().equalsIgnoreCase(TokenNames.INVITE) && this.sipStack.getMaxTxLifetimeNonInvite() > 0) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("Scheduling MaxTxLifeTimeListener for tx " + this + " , tx id " + getTransactionId() + " , state " + getState());
            }
            this.maxTxLifeTimeListener = new MaxTxLifeTimeListener();
            this.sipStack.getTimer().schedule(this.maxTxLifeTimeListener, this.sipStack.getMaxTxLifetimeNonInvite() * 1000);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void semRelease() {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("semRelease ]]]]" + this);
            logger.logStackTrace();
        }
        this.semaphore.release();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void sendMessage(final SIPMessage sIPMessage) {
        final RawMessageChannel rawMessageChannel;
        MessageProcessor[] messageProcessors;
        int i10;
        try {
            rawMessageChannel = (RawMessageChannel) this.encapsulatedChannel;
        } finally {
            startTransactionTimer();
        }
        for (MessageProcessor messageProcessor : this.sipStack.getMessageProcessors()) {
            if (messageProcessor.getIpAddress().getHostAddress().toString().equals(getPeerAddress()) && messageProcessor.getPort() == getPeerPort() && messageProcessor.getTransport().equalsIgnoreCase(getPeerProtocol())) {
                if (rawMessageChannel instanceof TCPMessageChannel) {
                    try {
                        getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.SIPTransactionImpl.1
                            @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                            public Object getThreadHash() {
                                return sIPMessage.getCallId().getCallId();
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    ((TCPMessageChannel) rawMessageChannel).processMessage((SIPMessage) sIPMessage.clone(), SIPTransactionImpl.this.getPeerInetAddress());
                                } catch (Exception e10) {
                                    if (SIPTransactionImpl.logger.isLoggingEnabled(4)) {
                                        SIPTransactionImpl.logger.logError("Error self routing TCP message cause by: ", e10);
                                    }
                                }
                            }
                        });
                    } catch (Exception e10) {
                        logger.logError("Error passing message in self routing TCP", e10);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Self routing message TCP");
                    }
                    return;
                } else if (rawMessageChannel instanceof TLSMessageChannel) {
                    try {
                        getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.SIPTransactionImpl.2
                            @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                            public Object getThreadHash() {
                                return sIPMessage.getCallId().getCallId();
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    ((TLSMessageChannel) rawMessageChannel).processMessage((SIPMessage) sIPMessage.clone(), SIPTransactionImpl.this.getPeerInetAddress());
                                } catch (Exception e11) {
                                    if (SIPTransactionImpl.logger.isLoggingEnabled(4)) {
                                        SIPTransactionImpl.logger.logError("Error self routing TLS message cause by: ", e11);
                                    }
                                }
                            }
                        });
                    } catch (Exception e11) {
                        logger.logError("Error passing message in TLS self routing", e11);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Self routing message TLS");
                    }
                    return;
                } else if (rawMessageChannel instanceof RawMessageChannel) {
                    try {
                        getSIPStack().getSelfRoutingThreadpoolExecutor().execute(new ThreadAffinityTask() { // from class: android.gov.nist.javax.sip.stack.SIPTransactionImpl.3
                            @Override // android.gov.nist.javax.sip.ThreadAffinityIdentifier
                            public Object getThreadHash() {
                                return sIPMessage.getCallId().getCallId();
                            }

                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    rawMessageChannel.processMessage((SIPMessage) sIPMessage.clone());
                                } catch (Exception e12) {
                                    if (SIPTransactionImpl.logger.isLoggingEnabled(4)) {
                                        SIPTransactionImpl.logger.logError("Error self routing message cause by: ", e12);
                                    }
                                }
                            }
                        });
                    } catch (Exception e12) {
                        logger.logError("Error passing message in self routing", e12);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Self routing message");
                    }
                    return;
                }
                startTransactionTimer();
            }
        }
        this.encapsulatedChannel.sendMessage(sIPMessage, getPeerInetAddress(), getPeerPort());
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void setApplicationData(Object obj) {
        this.applicationData = obj;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setAuditTag(long j6) {
        this.auditTag = j6;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setBranch(String str) {
        this.branch = str;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setCollectionTime(int i10) {
        this.collectionTime = i10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public abstract void setDialog(SIPDialog sIPDialog, String str);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setEncapsulatedChannel(MessageChannel messageChannel) {
        this.encapsulatedChannel = messageChannel;
        if (this instanceof SIPClientTransaction) {
            messageChannel.setEncapsulatedClientTransaction((SIPClientTransaction) this);
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setForkId(String str) {
        this.forkId = str;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setOriginalRequest(SIPRequest sIPRequest) {
        String transactionId = sIPRequest.getTransactionId();
        SIPRequest sIPRequest2 = this.originalRequest;
        if (sIPRequest2 != null && !sIPRequest2.getTransactionId().equals(transactionId)) {
            this.sipStack.removeTransactionHash(this);
        }
        this.originalRequest = sIPRequest;
        this.originalRequestCSeqNumber = sIPRequest.getCSeq().getSeqNumber();
        Via topmostVia = sIPRequest.getTopmostVia();
        this.originalRequestBranch = topmostVia.getBranch();
        this.originalRequestHasPort = topmostVia.hasPort();
        if (topmostVia.getPort() == -1) {
            topmostVia.getTransport().equalsIgnoreCase("TLS");
        }
        this.method = sIPRequest.getMethod();
        this.transactionId = transactionId;
        this.originalRequest.setTransaction(this);
        String branch = topmostVia.getBranch();
        if (branch != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Setting Branch id : ".concat(branch));
            }
            setBranch(branch);
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Branch id is null - compute TID!" + sIPRequest.encode());
        }
        setBranch(transactionId);
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setPassToListener() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("setPassToListener()");
        }
        this.toListener = true;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy) {
        this.releaseReferencesStrategy = releaseReferencesStrategy;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void setRetransmitTimer(int i10) {
        if (i10 > 0) {
            if (!this.transactionTimerStarted.get()) {
                this.baseTimerInterval = i10;
                return;
            }
            throw new IllegalStateException("Transaction timer is already started");
        }
        throw new IllegalArgumentException("Retransmit timer must be positive!");
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setState(int i10) {
        int i11 = this.currentState;
        int i12 = 4;
        if (i11 == 3 && i10 != 5 && i10 != 4) {
            i10 = 3;
        }
        if (i11 != 4 || i10 == 5) {
            i12 = i10;
        }
        if (i11 != 5) {
            this.currentState = i12;
            i11 = i12;
        }
        if (i11 == 3) {
            enableTimeoutTimer(64);
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Transaction:setState " + i11 + Separators.SP + this + " branchID = " + getBranch() + " isClient = " + (this instanceof SIPClientTransaction));
            logger.logStackTrace();
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void setTimerD(int i10) {
        if (i10 >= 32000) {
            this.timerD = i10 / this.baseTimerInterval;
            return;
        }
        throw new IllegalArgumentException("To be RFC 3261 compliant, the value of Timer D should be at least 32s");
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void setTimerT2(int i10) {
        this.f24324T2 = i10 / this.baseTimerInterval;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public void setTimerT4(int i10) {
        int i11 = i10 / this.baseTimerInterval;
        this.f24325T4 = i11;
        this.timerI = i11;
        this.timerK = i11;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public void setTransactionMapped(boolean z10) {
        this.isMapped = z10;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public abstract /* synthetic */ void terminate();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    public synchronized boolean testAndSetTransactionTerminatedEvent() {
        boolean z10;
        z10 = !this.terminatedEventDelivered;
        this.terminatedEventDelivered = true;
        return z10;
    }

    public void enableRetransmissionTimer(int i10) {
        if (isInviteTransaction() && (this instanceof SIPClientTransaction)) {
            this.retransmissionTimerTicksLeft = i10;
        } else {
            this.retransmissionTimerTicksLeft = Math.min(i10, getTimerT2());
        }
        this.retransmissionTimerLastTickCount = this.retransmissionTimerTicksLeft;
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    public SipProviderImpl getSipProvider() {
        return getMessageProcessor().getListeningPoint().getProvider();
    }

    public void sendMessage(byte[] bArr, InetAddress inetAddress, int i10, boolean z10) {
        throw new IOException("Cannot send unparsed message through Transaction Channel!");
    }
}
