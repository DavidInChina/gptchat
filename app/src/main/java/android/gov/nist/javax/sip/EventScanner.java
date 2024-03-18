package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.ThreadAuditor;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.javax.sip.d;
import android.javax.sip.e;
import android.javax.sip.f;
import android.javax.sip.k;
import android.javax.sip.l;
import android.javax.sip.p;
import android.javax.sip.t;
import android.javax.sip.w;
import java.util.EventObject;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class EventScanner implements Runnable {
    private static StackLogger logger = CommonLogger.getLogger(EventScanner.class);
    private boolean isStopped;
    private SipStackImpl sipStack;
    private AtomicInteger refCount = new AtomicInteger(0);
    private BlockingQueue<EventWrapper> pendingEvents = new LinkedBlockingQueue();

    public EventScanner(SipStackImpl sipStackImpl) {
        Thread thread = new Thread(this);
        thread.setDaemon(false);
        this.sipStack = sipStackImpl;
        thread.setName("EventScannerThread");
        thread.start();
    }

    private void deliverDialogTerminatedEvent(e eVar, EventWrapper eventWrapper, p pVar) {
        if (pVar != null) {
            try {
                pVar.processDialogTerminated(eVar);
            } catch (AbstractMethodError unused) {
                if (logger.isLoggingEnabled()) {
                    logger.logWarning("Unable to call sipListener.processDialogTerminated");
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
        }
    }

    private void deliverDialogTimeoutEvent(DialogTimeoutEvent dialogTimeoutEvent, EventWrapper eventWrapper, p pVar) {
        if (pVar != null) {
            try {
                if (pVar instanceof SipListenerExt) {
                    ((SipListenerExt) pVar).processDialogTimeout(dialogTimeoutEvent);
                }
            } catch (Exception e10) {
                logger.logException(e10);
                return;
            }
        }
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("DialogTimeoutEvent not delivered");
        }
    }

    private void deliverIOExceptionEvent(f fVar, EventWrapper eventWrapper, p pVar) {
        if (pVar != null) {
            try {
                pVar.processIOException(fVar);
            } catch (Exception e10) {
                logger.logException(e10);
            }
        }
    }

    private void deliverRequestEvent(k kVar, EventWrapper eventWrapper, p pVar) {
        SIPDialog sIPDialog;
        try {
            SIPRequest sIPRequest = (SIPRequest) kVar.getRequest();
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("deliverEvent : " + sIPRequest.getFirstLine() + " transaction " + eventWrapper.transaction + " sipEvent.serverTx = " + kVar.getServerTransaction());
            }
            SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) sIPRequest, true);
            if (sIPServerTransaction != null && !sIPServerTransaction.passToListener()) {
                if (sIPRequest.getMethod().equals(TokenNames.ACK) && sIPServerTransaction.isInviteTransaction() && (sIPServerTransaction.getLastResponseStatusCode() / 100 == 2 || this.sipStack.isNon2XXAckPassedToListener())) {
                    if (!this.sipStack.isNon2XXAckPassedToListener() && logger.isLoggingEnabled(32)) {
                        logger.logDebug("Detected broken client sending ACK with same branch! Passing...");
                    }
                } else {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("transaction already exists! " + sIPServerTransaction);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logDebug("Done processing Message " + ((SIPRequest) kVar.getRequest()).getFirstLine());
                    }
                    SIPTransaction sIPTransaction = eventWrapper.transaction;
                    if (sIPTransaction != null && ((SIPServerTransaction) sIPTransaction).passToListener()) {
                        ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                    }
                    SIPTransaction sIPTransaction2 = eventWrapper.transaction;
                    if (sIPTransaction2 != null) {
                        this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction2);
                    }
                    if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                        eventWrapper.transaction.setState(5);
                        return;
                    }
                    return;
                }
            } else if (this.sipStack.findPendingTransaction(sIPRequest.getTransactionId()) != null) {
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("transaction already exists!!");
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger4 = logger;
                    stackLogger4.logDebug("Done processing Message " + ((SIPRequest) kVar.getRequest()).getFirstLine());
                }
                SIPTransaction sIPTransaction3 = eventWrapper.transaction;
                if (sIPTransaction3 != null && ((SIPServerTransaction) sIPTransaction3).passToListener()) {
                    ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
                }
                SIPTransaction sIPTransaction4 = eventWrapper.transaction;
                if (sIPTransaction4 != null) {
                    this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction4);
                }
                if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                    eventWrapper.transaction.setState(5);
                    return;
                }
                return;
            } else {
                this.sipStack.putPendingTransaction((SIPServerTransaction) eventWrapper.transaction);
            }
            sIPRequest.setTransaction(eventWrapper.transaction);
            try {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger5 = logger;
                    stackLogger5.logDebug("Calling listener " + sIPRequest.getFirstLine());
                    StackLogger stackLogger6 = logger;
                    stackLogger6.logDebug("Calling listener " + eventWrapper.transaction);
                }
                if (pVar != null) {
                    pVar.processRequest(kVar);
                }
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger7 = logger;
                    stackLogger7.logDebug("Done processing Message " + sIPRequest.getFirstLine());
                }
                SIPTransaction sIPTransaction5 = eventWrapper.transaction;
                if (sIPTransaction5 != null && (sIPDialog = (SIPDialog) sIPTransaction5.getDialog()) != null) {
                    sIPDialog.requestConsumed();
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger8 = logger;
                stackLogger8.logDebug("Done processing Message " + ((SIPRequest) kVar.getRequest()).getFirstLine());
            }
            SIPTransaction sIPTransaction6 = eventWrapper.transaction;
            if (sIPTransaction6 != null && ((SIPServerTransaction) sIPTransaction6).passToListener()) {
                ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
            }
            SIPTransaction sIPTransaction7 = eventWrapper.transaction;
            if (sIPTransaction7 != null) {
                this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction7);
            }
            if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                eventWrapper.transaction.setState(5);
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger9 = logger;
                stackLogger9.logDebug("Done processing Message " + ((SIPRequest) kVar.getRequest()).getFirstLine());
            }
            SIPTransaction sIPTransaction8 = eventWrapper.transaction;
            if (sIPTransaction8 != null && ((SIPServerTransaction) sIPTransaction8).passToListener()) {
                ((SIPServerTransaction) eventWrapper.transaction).releaseSem();
            }
            SIPTransaction sIPTransaction9 = eventWrapper.transaction;
            if (sIPTransaction9 != null) {
                this.sipStack.removePendingTransaction((SIPServerTransaction) sIPTransaction9);
            }
            if (eventWrapper.transaction.getMethod().equals(TokenNames.ACK)) {
                eventWrapper.transaction.setState(5);
            }
            throw th2;
        }
    }

    private void deliverResponseEvent(l lVar, EventWrapper eventWrapper, p pVar) {
        try {
            SIPResponse sIPResponse = (SIPResponse) lVar.getResponse();
            SIPDialog sIPDialog = (SIPDialog) lVar.getDialog();
            try {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    stackLogger.logDebug("Calling listener " + pVar + " for " + sIPResponse.getFirstLine());
                }
                if (pVar != null) {
                    SIPTransaction sIPTransaction = eventWrapper.transaction;
                    if (sIPTransaction != null) {
                        sIPTransaction.setPassToListener();
                    }
                    pVar.processResponse(lVar);
                }
                if (sIPDialog != null && ((sIPDialog.getState() == null || !sIPDialog.getState().equals(d.f24329j0)) && (sIPResponse.getStatusCode() == 481 || sIPResponse.getStatusCode() == 408))) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Removing dialog on 408 or 481 response");
                    }
                    sIPDialog.doDeferredDelete();
                }
                if (sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE) && sIPDialog != null && sIPResponse.getStatusCode() == 200) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger2 = logger;
                        stackLogger2.logDebug("Warning! unacknowledged dialog. " + sIPDialog.getState());
                    }
                    sIPDialog.doDeferredDeleteIfNoAckSent(sIPResponse.getCSeq().getSeqNumber());
                }
            } catch (Exception e10) {
                logger.logException(e10);
            }
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) eventWrapper.transaction;
            if (sIPClientTransaction != null && 3 == sIPClientTransaction.getInternalState() && !sIPClientTransaction.getMethod().equals(TokenNames.INVITE)) {
                sIPClientTransaction.clearState();
            }
            SIPTransaction sIPTransaction2 = eventWrapper.transaction;
            if (sIPTransaction2 != null && sIPTransaction2.passToListener()) {
                eventWrapper.transaction.releaseSem();
            }
        } catch (Throwable th2) {
            SIPTransaction sIPTransaction3 = eventWrapper.transaction;
            if (sIPTransaction3 != null && sIPTransaction3.passToListener()) {
                eventWrapper.transaction.releaseSem();
            }
            throw th2;
        }
    }

    private void deliverTimeoutEvent(t tVar, EventWrapper eventWrapper, p pVar) {
        if (pVar != null) {
            try {
                pVar.processTimeout(tVar);
            } catch (Exception e10) {
                logger.logException(e10);
            }
        }
    }

    private void deliverTransactionTerminatedEvent(w wVar, EventWrapper eventWrapper, p pVar) {
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("About to deliver transactionTerminatedEvent");
                StackLogger stackLogger = logger;
                stackLogger.logDebug("tx = " + wVar.f24348Z);
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("tx = " + wVar.f24347Y);
            }
            if (pVar != null) {
                pVar.processTransactionTerminated(wVar);
            }
        } catch (AbstractMethodError unused) {
            if (logger.isLoggingEnabled()) {
                logger.logWarning("Unable to call sipListener.processTransactionTerminated");
            }
        } catch (Exception e10) {
            logger.logException(e10);
        }
    }

    public void addEvent(EventWrapper eventWrapper) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("addEvent " + eventWrapper);
        }
        if (!this.pendingEvents.offer(eventWrapper)) {
            StackLogger stackLogger2 = logger;
            stackLogger2.logWarning("reached queue capacity limit couldn't addEvent " + eventWrapper);
        }
    }

    public void deliverEvent(EventWrapper eventWrapper) {
        p pVar;
        EventObject eventObject = eventWrapper.sipEvent;
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("sipEvent = " + eventObject + "source = " + eventObject.getSource());
        }
        boolean z10 = eventObject instanceof f;
        if (!z10) {
            pVar = ((SipProviderImpl) eventObject.getSource()).getSipListener();
        } else {
            pVar = this.sipStack.getSipListener();
        }
        if (eventObject instanceof k) {
            deliverRequestEvent((k) eventObject, eventWrapper, pVar);
        } else if (eventObject instanceof l) {
            deliverResponseEvent((l) eventObject, eventWrapper, pVar);
        } else if (eventObject instanceof t) {
            deliverTimeoutEvent((t) eventObject, eventWrapper, pVar);
        } else if (eventObject instanceof DialogTimeoutEvent) {
            deliverDialogTimeoutEvent((DialogTimeoutEvent) eventObject, eventWrapper, pVar);
        } else if (z10) {
            deliverIOExceptionEvent((f) eventObject, eventWrapper, pVar);
        } else if (eventObject instanceof w) {
            deliverTransactionTerminatedEvent((w) eventObject, eventWrapper, pVar);
        } else if (eventObject instanceof e) {
            deliverDialogTerminatedEvent((e) eventObject, eventWrapper, pVar);
        } else {
            StackLogger stackLogger2 = logger;
            stackLogger2.logFatalError("bad event" + eventObject);
        }
    }

    public void forceStop() {
        this.isStopped = true;
        this.refCount.set(0);
    }

    public void incrementRefcount() {
        this.refCount.incrementAndGet();
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadAuditor.ThreadHandle threadHandle;
        try {
            if (this.sipStack.getThreadAuditor() != null) {
                threadHandle = this.sipStack.getThreadAuditor().addCurrentThread();
            } else {
                threadHandle = null;
            }
            while (!this.isStopped) {
                if (threadHandle != null) {
                    threadHandle.ping();
                }
                try {
                    deliverEvent(this.pendingEvents.take());
                } catch (InterruptedException e10) {
                    if (logger.isLoggingEnabled(4)) {
                        logger.logError("Interrupted!", e10);
                    }
                    if (logger.isLoggingEnabled(32) && !this.isStopped) {
                        logger.logFatalError("Event scanner exited abnormally");
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("Unexpected exception caught while delivering event -- carrying on bravely", e11);
                    }
                }
            }
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Stopped event scanner!!");
            }
            if (logger.isLoggingEnabled(32) && !this.isStopped) {
                logger.logFatalError("Event scanner exited abnormally");
            }
        } catch (Throwable th2) {
            if (logger.isLoggingEnabled(32) && !this.isStopped) {
                logger.logFatalError("Event scanner exited abnormally");
            }
            throw th2;
        }
    }

    public void stop() {
        if (this.refCount.get() == 0) {
            this.isStopped = true;
        }
    }
}
