package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.DialogTimeoutEvent;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.RouterExt;
import android.gov.nist.javax.sip.header.CallID;
import android.gov.nist.javax.sip.header.Via;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPDialogErrorEvent;
import android.gov.nist.javax.sip.stack.SIPDialogEventListener;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionErrorEvent;
import android.gov.nist.javax.sip.stack.SIPTransactionEventListener;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.a;
import android.javax.sip.b;
import android.javax.sip.d;
import android.javax.sip.g;
import android.javax.sip.h;
import android.javax.sip.k;
import android.javax.sip.l;
import android.javax.sip.m;
import android.javax.sip.n;
import android.javax.sip.p;
import android.javax.sip.q;
import android.javax.sip.r;
import android.javax.sip.s;
import android.javax.sip.t;
import android.javax.sip.u;
import b.AbstractC2092b;
import c.AbstractC2255j;
import d.AbstractC2561b;
import d.AbstractC2562c;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.text.ParseException;
import java.util.EventObject;
import java.util.Iterator;
import java.util.TooManyListenersException;

/* loaded from: classes2.dex */
public class SipProviderImpl implements q, SipProviderExt, SIPTransactionEventListener, SIPDialogEventListener {
    private static StackLogger logger = CommonLogger.getLogger(SipProviderImpl.class);
    private boolean automaticDialogSupportEnabled;
    private boolean dialogErrorsAutomaticallyHandled;
    protected EventScanner eventScanner;
    private ConcurrentHashMap<String, h> listeningPoints;
    private p sipListener;
    protected SipStackImpl sipStack;

    private SipProviderImpl() {
        this.dialogErrorsAutomaticallyHandled = true;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized void addListeningPoint(h hVar) {
        try {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) hVar;
            SipProviderImpl sipProviderImpl = listeningPointImpl.sipProvider;
            if (sipProviderImpl != null && sipProviderImpl != this) {
                throw new n("Listening point assigned to another provider");
            }
            String upperCase = listeningPointImpl.getTransport().toUpperCase();
            if (this.listeningPoints.containsKey(upperCase) && this.listeningPoints.get(upperCase) != hVar) {
                throw new n("Listening point already assigned for transport!");
            }
            listeningPointImpl.sipProvider = this;
            this.listeningPoints.put(upperCase, listeningPointImpl);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void addSipListener(p pVar) {
        SipStackImpl sipStackImpl = this.sipStack;
        p pVar2 = sipStackImpl.sipListener;
        if (pVar2 == null) {
            sipStackImpl.sipListener = pVar;
        } else if (pVar2 != pVar) {
            throw new TooManyListenersException("Stack already has a listener. Only one listener per stack allowed");
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("add SipListener " + pVar);
        }
        this.sipListener = pVar;
    }

    public Object clone() {
        throw new CloneNotSupportedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0196 A[Catch: g -> 0x0174, ParseException -> 0x0177, IOException -> 0x017a, TryCatch #3 {g -> 0x0174, IOException -> 0x017a, ParseException -> 0x0177, blocks: (B:52:0x0153, B:54:0x015d, B:56:0x016b, B:65:0x017d, B:66:0x018c, B:68:0x0196, B:69:0x0199, B:71:0x01a0, B:72:0x01a7, B:74:0x01c1, B:77:0x01d6, B:78:0x01de, B:80:0x01e4, B:82:0x01f4, B:83:0x01fb, B:85:0x01ff, B:86:0x0206), top: B:108:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0 A[Catch: g -> 0x0174, ParseException -> 0x0177, IOException -> 0x017a, TryCatch #3 {g -> 0x0174, IOException -> 0x017a, ParseException -> 0x0177, blocks: (B:52:0x0153, B:54:0x015d, B:56:0x016b, B:65:0x017d, B:66:0x018c, B:68:0x0196, B:69:0x0199, B:71:0x01a0, B:72:0x01a7, B:74:0x01c1, B:77:0x01d6, B:78:0x01de, B:80:0x01e4, B:82:0x01f4, B:83:0x01fb, B:85:0x01ff, B:86:0x0206), top: B:108:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1 A[Catch: g -> 0x0174, ParseException -> 0x0177, IOException -> 0x017a, TryCatch #3 {g -> 0x0174, IOException -> 0x017a, ParseException -> 0x0177, blocks: (B:52:0x0153, B:54:0x015d, B:56:0x016b, B:65:0x017d, B:66:0x018c, B:68:0x0196, B:69:0x0199, B:71:0x01a0, B:72:0x01a7, B:74:0x01c1, B:77:0x01d6, B:78:0x01de, B:80:0x01e4, B:82:0x01f4, B:83:0x01fb, B:85:0x01ff, B:86:0x0206), top: B:108:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ff A[Catch: g -> 0x0174, ParseException -> 0x0177, IOException -> 0x017a, TryCatch #3 {g -> 0x0174, IOException -> 0x017a, ParseException -> 0x0177, blocks: (B:52:0x0153, B:54:0x015d, B:56:0x016b, B:65:0x017d, B:66:0x018c, B:68:0x0196, B:69:0x0199, B:71:0x01a0, B:72:0x01a7, B:74:0x01c1, B:77:0x01d6, B:78:0x01de, B:80:0x01e4, B:82:0x01f4, B:83:0x01fb, B:85:0x01ff, B:86:0x0206), top: B:108:0x0153 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SIPClientTransaction createClientTransaction(AbstractC2561b abstractC2561b, AbstractC2092b abstractC2092b) {
        Via topmostVia;
        SIPClientTransaction createClientTransaction;
        SIPClientTransaction sIPClientTransaction;
        if (abstractC2561b != null) {
            if (abstractC2092b != null) {
                if (this.sipStack.isAlive()) {
                    SIPRequest sIPRequest = (SIPRequest) abstractC2561b;
                    if (sIPRequest.getTransaction() == null) {
                        if (!sIPRequest.getMethod().equals(TokenNames.ACK)) {
                            if (sIPRequest.getTopmostVia() == null) {
                                String transport = abstractC2092b.getTransport();
                                if (transport == null) {
                                    transport = ParameterNames.UDP;
                                }
                                ListeningPointImpl listeningPointImpl = (ListeningPointImpl) getListeningPoint(transport);
                                if (listeningPointImpl == null) {
                                    listeningPointImpl = (ListeningPointImpl) getListeningPoints()[0];
                                }
                                sIPRequest.setHeader(listeningPointImpl.getViaHeader());
                            }
                            try {
                                sIPRequest.checkHeaders();
                                if (sIPRequest.getTopmostVia().getBranch() != null && sIPRequest.getTopmostVia().getBranch().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE) && this.sipStack.findTransaction((SIPMessage) sIPRequest, false) != null) {
                                    throw new n("Transaction already exists!");
                                }
                                if (sIPRequest.getMethod().equalsIgnoreCase("CANCEL") && (sIPClientTransaction = (SIPClientTransaction) this.sipStack.findCancelTransaction(sIPRequest, false)) != null) {
                                    SIPClientTransaction createClientTransaction2 = this.sipStack.createClientTransaction(sIPRequest, sIPClientTransaction.getMessageChannel());
                                    createClientTransaction2.addEventListener(this);
                                    this.sipStack.addTransaction(createClientTransaction2);
                                    if (sIPClientTransaction.getDialog() != null) {
                                        createClientTransaction2.setDialog((SIPDialog) sIPClientTransaction.getDialog(), sIPRequest.getDialogId(false));
                                    }
                                    return createClientTransaction2;
                                }
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger = logger;
                                    stackLogger.logDebug("could not find existing transaction for " + sIPRequest + " creating a new one ");
                                }
                                String transport2 = abstractC2092b.getTransport();
                                ListeningPointImpl listeningPointImpl2 = (ListeningPointImpl) getListeningPoint(transport2);
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger2 = logger;
                                    stackLogger2.logDebug("Got following Listenin point " + listeningPointImpl2 + " for transport " + transport2);
                                }
                                if (listeningPointImpl2 == null) {
                                    listeningPointImpl2 = (ListeningPointImpl) getListeningPoint(sIPRequest.getTopmostVia().getTransport());
                                    if (logger.isLoggingEnabled(32)) {
                                        StackLogger stackLogger3 = logger;
                                        stackLogger3.logDebug("Listenig point was null using new one from Via header " + listeningPointImpl2 + " for transport " + sIPRequest.getTopmostVia().getTransport());
                                    }
                                }
                                SIPDialog dialog = this.sipStack.getDialog(sIPRequest.getDialogId(false));
                                if (dialog != null && dialog.getState() == d.f24329j0) {
                                    this.sipStack.removeDialog(dialog);
                                }
                                try {
                                    if (sIPRequest.getTopmostVia().getBranch() != null) {
                                        if (sIPRequest.getTopmostVia().getBranch().startsWith(SIPConstants.BRANCH_MAGIC_COOKIE)) {
                                            if (this.sipStack.checkBranchId()) {
                                            }
                                            topmostVia = sIPRequest.getTopmostVia();
                                            if (topmostVia.getTransport() == null) {
                                                topmostVia.setTransport(transport2);
                                            }
                                            if (topmostVia.getPort() == -1) {
                                                topmostVia.setPort(listeningPointImpl2.getPort());
                                            }
                                            String branch = sIPRequest.getTopmostVia().getBranch();
                                            createClientTransaction = this.sipStack.createClientTransaction(sIPRequest, this.sipStack.createMessageChannel(sIPRequest, listeningPointImpl2.getMessageProcessor(), abstractC2092b));
                                            if (createClientTransaction == null) {
                                                createClientTransaction.setNextHop(abstractC2092b);
                                                createClientTransaction.setOriginalRequest(sIPRequest);
                                                createClientTransaction.setBranch(branch);
                                                if (SIPTransactionStack.isDialogCreated(sIPRequest.getMethod())) {
                                                    if (dialog != null) {
                                                        createClientTransaction.setDialog(dialog, sIPRequest.getDialogId(false));
                                                    } else if (isAutomaticDialogSupportEnabled()) {
                                                        createClientTransaction.setDialog(this.sipStack.createDialog(createClientTransaction), sIPRequest.getDialogId(false));
                                                    }
                                                } else if (dialog != null) {
                                                    createClientTransaction.setDialog(dialog, sIPRequest.getDialogId(false));
                                                }
                                                createClientTransaction.addEventListener(this);
                                                return createClientTransaction;
                                            }
                                            throw new n("Cound not create tx");
                                        }
                                    }
                                    sIPRequest.getTopmostVia().setBranch(Utils.getInstance().generateBranchId());
                                    topmostVia = sIPRequest.getTopmostVia();
                                    if (topmostVia.getTransport() == null) {
                                    }
                                    if (topmostVia.getPort() == -1) {
                                    }
                                    String branch2 = sIPRequest.getTopmostVia().getBranch();
                                    createClientTransaction = this.sipStack.createClientTransaction(sIPRequest, this.sipStack.createMessageChannel(sIPRequest, listeningPointImpl2.getMessageProcessor(), abstractC2092b));
                                    if (createClientTransaction == null) {
                                    }
                                } catch (g e10) {
                                    InternalErrorHandler.handleException(e10);
                                    throw new n("Unexpected Exception FIXME! ", e10);
                                } catch (IOException e11) {
                                    throw new n("Could not resolve next hop or listening point unavailable! ", e11);
                                } catch (ParseException e12) {
                                    InternalErrorHandler.handleException(e12);
                                    throw new n("Unexpected Exception FIXME! ", e12);
                                }
                            } catch (ParseException e13) {
                                throw new n(e13.getMessage(), e13);
                            }
                        } else {
                            throw new n("Cannot create client transaction for  ACK");
                        }
                    } else {
                        throw new n("Transaction already assigned to request");
                    }
                } else {
                    throw new n("Stack is stopped");
                }
            } else {
                throw new NullPointerException("null hop");
            }
        } else {
            throw new NullPointerException("null request");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.SIPDialogEventListener
    public void dialogErrorEvent(SIPDialogErrorEvent sIPDialogErrorEvent) {
        SIPDialog sIPDialog = (SIPDialog) sIPDialogErrorEvent.getSource();
        DialogTimeoutEvent.Reason reason = DialogTimeoutEvent.Reason.AckNotReceived;
        if (sIPDialogErrorEvent.getErrorID() == 2) {
            reason = DialogTimeoutEvent.Reason.AckNotSent;
        } else if (sIPDialogErrorEvent.getErrorID() == 3) {
            reason = DialogTimeoutEvent.Reason.ReInviteTimeout;
        } else if (sIPDialogErrorEvent.getErrorID() == 4) {
            reason = DialogTimeoutEvent.Reason.EarlyStateTimeout;
        }
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("Dialog TimeoutError occured on " + sIPDialog);
        }
        DialogTimeoutEvent dialogTimeoutEvent = new DialogTimeoutEvent(this, sIPDialog, reason);
        dialogTimeoutEvent.setClientTransaction(sIPDialogErrorEvent.getClientTransaction());
        handleEvent(dialogTimeoutEvent, null);
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public h getListeningPoint(String str) {
        if (str != null) {
            return this.listeningPoints.get(str.toUpperCase());
        }
        throw new NullPointerException("Null transport param");
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized h[] getListeningPoints() {
        ListeningPointImpl[] listeningPointImplArr;
        listeningPointImplArr = new ListeningPointImpl[this.listeningPoints.size()];
        this.listeningPoints.values().toArray(listeningPointImplArr);
        return listeningPointImplArr;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public AbstractC2255j getNewCallId() {
        String generateCallIdentifier = Utils.getInstance().generateCallIdentifier(getListeningPoint().getIPAddress());
        CallID callID = new CallID();
        try {
            callID.setCallId(generateCallIdentifier);
        } catch (ParseException unused) {
        }
        return callID;
    }

    @Override // android.javax.sip.q
    public a getNewClientTransaction(AbstractC2561b abstractC2561b) {
        try {
            AbstractC2092b nextHop = this.sipStack.getNextHop((SIPRequest) abstractC2561b);
            if (nextHop != null) {
                SIPClientTransaction createClientTransaction = createClientTransaction(abstractC2561b, nextHop);
                this.sipStack.addTransaction(createClientTransaction);
                return createClientTransaction;
            }
            throw new n("Cannot resolve next hop -- transaction unavailable");
        } catch (n e10) {
            throw new n("Cannot resolve next hop -- transaction unavailable", e10);
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public b getNewDialog(u uVar) {
        SIPDialog sIPDialog;
        if (uVar != null) {
            if (this.sipStack.isAlive()) {
                if (!isAutomaticDialogSupportEnabled()) {
                    if (SIPTransactionStack.isDialogCreated(uVar.getRequest().getMethod())) {
                        SIPTransaction sIPTransaction = (SIPTransaction) uVar;
                        if (uVar instanceof m) {
                            SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) uVar;
                            SIPResponse lastResponse = sIPServerTransaction.getLastResponse();
                            if (lastResponse != null && lastResponse.getStatusCode() != 100) {
                                throw new n("Cannot set dialog after response has been sent");
                            }
                            SIPRequest sIPRequest = (SIPRequest) uVar.getRequest();
                            sIPDialog = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                            if (sIPDialog == null) {
                                sIPDialog = this.sipStack.createDialog(sIPTransaction);
                                sIPDialog.addTransaction(sIPTransaction);
                                sIPDialog.addRoute(sIPRequest);
                                sIPTransaction.setDialog(sIPDialog, null);
                            } else {
                                sIPTransaction.setDialog(sIPDialog, sIPRequest.getDialogId(true));
                            }
                            if (sIPRequest.getMethod().equals(TokenNames.INVITE) && isDialogErrorsAutomaticallyHandled()) {
                                this.sipStack.putInMergeTable(sIPServerTransaction, sIPRequest);
                            }
                        } else {
                            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) uVar;
                            if (sIPClientTransaction.getLastResponse() == null) {
                                if (this.sipStack.getDialog(((SIPRequest) sIPClientTransaction.getRequest()).getDialogId(false)) == null) {
                                    sIPDialog = this.sipStack.createDialog(sIPTransaction);
                                    sIPClientTransaction.setDialog(sIPDialog, null);
                                } else {
                                    throw new n("Dialog already exists!");
                                }
                            } else {
                                throw new n("Cannot call this method after response is received!");
                            }
                        }
                        sIPDialog.addEventListener(this);
                        return sIPDialog;
                    }
                    throw new n("Dialog cannot be created for this method " + uVar.getRequest().getMethod());
                }
                throw new n(" Error - AUTOMATIC_DIALOG_SUPPORT is on");
            }
            throw new n("Stack is stopped.");
        }
        throw new NullPointerException("Null transaction!");
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public m getNewServerTransaction(AbstractC2561b abstractC2561b) {
        SIPServerTransaction sIPServerTransaction;
        if (this.sipStack.isAlive()) {
            SIPRequest sIPRequest = (SIPRequest) abstractC2561b;
            try {
                sIPRequest.checkHeaders();
                if (abstractC2561b.getMethod().equals(TokenNames.ACK)) {
                    if (logger.isLoggingEnabled()) {
                        logger.logError("Creating server transaction for ACK -- makes no sense!");
                    }
                    throw new n("Cannot create Server transaction for ACK ");
                } else if (sIPRequest.getMethod().equals(TokenNames.NOTIFY) && sIPRequest.getFromTag() != null && sIPRequest.getToTag() == null && this.sipStack.findSubscribeTransaction(sIPRequest, (ListeningPointImpl) getListeningPoint()) == null && !this.sipStack.isDeliverUnsolicitedNotify()) {
                    throw new n("Cannot find matching Subscription (and android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY not set)");
                } else {
                    if (this.sipStack.acquireSem()) {
                        try {
                            if (SIPTransactionStack.isDialogCreated(sIPRequest.getMethod())) {
                                if (this.sipStack.findTransaction((SIPMessage) ((SIPRequest) abstractC2561b), true) == null) {
                                    sIPServerTransaction = (SIPServerTransaction) ((SIPRequest) abstractC2561b).getTransaction();
                                    if (sIPServerTransaction != null) {
                                        if (sIPServerTransaction.getOriginalRequest() == null) {
                                            sIPServerTransaction.setOriginalRequest(sIPRequest);
                                        }
                                        try {
                                            this.sipStack.addTransaction(sIPServerTransaction);
                                            sIPServerTransaction.addEventListener(this);
                                            if (isAutomaticDialogSupportEnabled()) {
                                                SIPDialog dialog = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                                                if (dialog == null) {
                                                    dialog = this.sipStack.createDialog(sIPServerTransaction);
                                                }
                                                sIPServerTransaction.setDialog(dialog, sIPRequest.getDialogId(true));
                                                if (sIPRequest.getMethod().equals(TokenNames.INVITE) && isDialogErrorsAutomaticallyHandled()) {
                                                    this.sipStack.putInMergeTable(sIPServerTransaction, sIPRequest);
                                                }
                                                dialog.addRoute(sIPRequest);
                                                if (dialog.getRemoteTag() != null && dialog.getLocalTag() != null) {
                                                    this.sipStack.putDialog(dialog);
                                                }
                                            }
                                            return sIPServerTransaction;
                                        } catch (IOException unused) {
                                            throw new n("Error sending provisional response");
                                        }
                                    }
                                    throw new n("Transaction not available");
                                }
                                throw new n("server transaction already exists!");
                            }
                            if (isAutomaticDialogSupportEnabled()) {
                                if (((SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) ((SIPRequest) abstractC2561b), true)) == null) {
                                    sIPServerTransaction = (SIPServerTransaction) ((SIPRequest) abstractC2561b).getTransaction();
                                    if (sIPServerTransaction != null) {
                                        if (sIPServerTransaction.getOriginalRequest() == null) {
                                            sIPServerTransaction.setOriginalRequest(sIPRequest);
                                        }
                                        try {
                                            this.sipStack.addTransaction(sIPServerTransaction);
                                            SIPDialog dialog2 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                                            if (dialog2 != null) {
                                                dialog2.addTransaction(sIPServerTransaction);
                                                dialog2.addRoute(sIPRequest);
                                                sIPServerTransaction.setDialog(dialog2, sIPRequest.getDialogId(true));
                                            }
                                        } catch (IOException unused2) {
                                            throw new n("Could not send back provisional response!");
                                        }
                                    } else {
                                        throw new n("Transaction not available!");
                                    }
                                } else {
                                    throw new n("Transaction exists! ");
                                }
                            } else if (((SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) ((SIPRequest) abstractC2561b), true)) == null) {
                                sIPServerTransaction = (SIPServerTransaction) ((SIPRequest) abstractC2561b).getTransaction();
                                if (sIPServerTransaction != null) {
                                    if (sIPServerTransaction.getOriginalRequest() == null) {
                                        sIPServerTransaction.setOriginalRequest(sIPRequest);
                                    }
                                    this.sipStack.mapTransaction(sIPServerTransaction);
                                    SIPDialog dialog3 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                                    if (dialog3 != null) {
                                        dialog3.addTransaction(sIPServerTransaction);
                                        dialog3.addRoute(sIPRequest);
                                        sIPServerTransaction.setDialog(dialog3, sIPRequest.getDialogId(true));
                                    }
                                } else {
                                    sIPServerTransaction = this.sipStack.createServerTransaction((MessageChannel) sIPRequest.getMessageChannel());
                                    if (sIPServerTransaction != null) {
                                        sIPServerTransaction.setOriginalRequest(sIPRequest);
                                        this.sipStack.mapTransaction(sIPServerTransaction);
                                        SIPDialog dialog4 = this.sipStack.getDialog(sIPRequest.getDialogId(true));
                                        if (dialog4 != null) {
                                            dialog4.addTransaction(sIPServerTransaction);
                                            dialog4.addRoute(sIPRequest);
                                            sIPServerTransaction.setDialog(dialog4, sIPRequest.getDialogId(true));
                                        }
                                    } else {
                                        throw new n("Transaction unavailable -- too many servrer transactions");
                                    }
                                }
                            } else {
                                throw new n("Transaction exists! ");
                            }
                            return sIPServerTransaction;
                        } finally {
                            this.sipStack.releaseSem();
                        }
                    }
                    throw new n("Transaction not available -- could not acquire stack lock");
                }
            } catch (ParseException e10) {
                throw new n(e10.getMessage(), e10);
            }
        }
        throw new n("Stack is stopped");
    }

    public p getSipListener() {
        return this.sipListener;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public r getSipStack() {
        return this.sipStack;
    }

    public void handleEvent(EventObject eventObject, SIPTransaction sIPTransaction) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("handleEvent " + eventObject + "currentTransaction = " + sIPTransaction + "this.sipListener = " + getSipListener() + "sipEvent.source = " + eventObject.getSource());
            if (eventObject instanceof k) {
                b dialog = ((k) eventObject).getDialog();
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Dialog = " + dialog);
                }
            } else if (eventObject instanceof l) {
                b dialog2 = ((l) eventObject).getDialog();
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger3 = logger;
                    stackLogger3.logDebug("Dialog = " + dialog2);
                }
            }
            logger.logStackTrace();
        }
        EventWrapper eventWrapper = new EventWrapper(eventObject, sIPTransaction);
        if (!this.sipStack.isReEntrantListener()) {
            this.eventScanner.addEvent(eventWrapper);
        } else {
            this.eventScanner.deliverEvent(eventWrapper);
        }
    }

    public boolean isAutomaticDialogSupportEnabled() {
        return this.automaticDialogSupportEnabled;
    }

    public boolean isDialogErrorsAutomaticallyHandled() {
        return this.dialogErrorsAutomaticallyHandled;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized void removeListeningPoint(h hVar) {
        ListeningPointImpl listeningPointImpl = (ListeningPointImpl) hVar;
        if (!listeningPointImpl.messageProcessor.inUse()) {
            this.listeningPoints.remove(listeningPointImpl.getTransport().toUpperCase());
        } else {
            throw new n("Object is in use");
        }
    }

    public synchronized void removeListeningPoints() {
        Iterator<h> it = this.listeningPoints.values().iterator();
        while (it.hasNext()) {
            ((ListeningPointImpl) it.next()).messageProcessor.stop();
            it.remove();
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void removeSipListener(p pVar) {
        if (pVar == getSipListener()) {
            this.sipListener = null;
        }
        Iterator<SipProviderImpl> sipProviders = this.sipStack.getSipProviders();
        boolean z10 = false;
        while (sipProviders.hasNext()) {
            if (sipProviders.next().getSipListener() != null) {
                z10 = true;
            }
        }
        if (!z10) {
            this.sipStack.sipListener = null;
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void sendRequest(AbstractC2561b abstractC2561b) {
        StringBuilder sb2;
        StackLogger stackLogger;
        MessageChannel messageChannel;
        SIPDialog dialog;
        if (this.sipStack.isAlive()) {
            SIPRequest sIPRequest = (SIPRequest) abstractC2561b;
            if (sIPRequest.getRequestLine() != null && abstractC2561b.getMethod().equals(TokenNames.ACK) && (dialog = this.sipStack.getDialog(((SIPRequest) abstractC2561b).getDialogId(false))) != null && dialog.getState() != null && logger.isLoggingEnabled()) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logWarning("Dialog exists -- you may want to use Dialog.sendAck() " + dialog.getState());
            }
            AbstractC2092b nextHop = this.sipStack.getRouter(sIPRequest).getNextHop(abstractC2561b);
            if (nextHop != null) {
                if (!sIPRequest.isNullRequest() && sIPRequest.getTopmostVia() == null) {
                    throw new n("Invalid SipRequest -- no via header!");
                }
                try {
                    try {
                        if (!sIPRequest.isNullRequest()) {
                            Via topmostVia = sIPRequest.getTopmostVia();
                            String branch = topmostVia.getBranch();
                            if (branch != null) {
                                if (branch.length() == 0) {
                                }
                            }
                            topmostVia.setBranch(sIPRequest.getTransactionId());
                        }
                        if (this.listeningPoints.containsKey(nextHop.getTransport().toUpperCase())) {
                            messageChannel = this.sipStack.createRawMessageChannel(getListeningPoint(nextHop.getTransport()).getIPAddress(), getListeningPoint(nextHop.getTransport()).getPort(), nextHop);
                        } else {
                            messageChannel = null;
                        }
                    } catch (IOException e10) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger3 = logger;
                            stackLogger3.logDebug("Could not create a message channel for " + nextHop.toString() + " listeningPoints = " + this.listeningPoints + " because of an IO issue " + e10.getMessage());
                        }
                        throw new n("IO Exception occured while Sending Request", e10);
                    } catch (ParseException e11) {
                        InternalErrorHandler.handleException(e11);
                        if (logger.isLoggingEnabled(32)) {
                            stackLogger = logger;
                            sb2 = new StringBuilder("done sending ");
                        } else {
                            return;
                        }
                    }
                    if (messageChannel != null) {
                        messageChannel.sendMessage(sIPRequest, nextHop);
                        if (logger.isLoggingEnabled(32)) {
                            stackLogger = logger;
                            sb2 = new StringBuilder("done sending ");
                            sb2.append(abstractC2561b.getMethod());
                            sb2.append(" to hop ");
                            sb2.append(nextHop);
                            stackLogger.logDebug(sb2.toString());
                            return;
                        }
                        return;
                    }
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger4 = logger;
                        stackLogger4.logDebug("Could not create a message channel for " + nextHop.toString() + " listeningPoints = " + this.listeningPoints);
                    }
                    throw new n("Could not create a message channel for " + nextHop.toString());
                } catch (Throwable th2) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger5 = logger;
                        stackLogger5.logDebug("done sending " + abstractC2561b.getMethod() + " to hop " + nextHop);
                    }
                    throw th2;
                }
            }
            throw new n("could not determine next hop!");
        }
        throw new n("Stack is stopped.");
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void sendResponse(AbstractC2562c abstractC2562c) {
        if (this.sipStack.isAlive()) {
            SIPResponse sIPResponse = (SIPResponse) abstractC2562c;
            Via topmostVia = sIPResponse.getTopmostVia();
            if (topmostVia != null) {
                SIPServerTransaction sIPServerTransaction = (SIPServerTransaction) this.sipStack.findTransaction((SIPMessage) abstractC2562c, true);
                if (sIPServerTransaction != null && sIPServerTransaction.getInternalState() != 5 && isAutomaticDialogSupportEnabled()) {
                    throw new n("Transaction exists -- cannot send response statelessly");
                }
                String transport = topmostVia.getTransport();
                String received = topmostVia.getReceived();
                if (received == null) {
                    received = topmostVia.getHost();
                }
                int rPort = topmostVia.getRPort();
                if (rPort == -1 && (rPort = topmostVia.getPort()) == -1) {
                    if (!transport.equalsIgnoreCase("TLS") && !transport.equalsIgnoreCase("SCTP-TLS")) {
                        rPort = SIPConstants.DEFAULT_PORT;
                    } else {
                        rPort = SIPConstants.DEFAULT_TLS_PORT;
                    }
                }
                if (received.indexOf(":") > 0 && received.indexOf("[") < 0) {
                    received = android.gov.nist.core.a.A("[", received, "]");
                }
                AbstractC2092b resolveAddress = this.sipStack.getAddressResolver().resolveAddress(new HopImpl(received, rPort, transport));
                try {
                    ListeningPointImpl listeningPointImpl = (ListeningPointImpl) getListeningPoint(transport);
                    if (listeningPointImpl != null) {
                        MessageChannel createRawMessageChannel = this.sipStack.createRawMessageChannel(getListeningPoint(resolveAddress.getTransport()).getIPAddress(), listeningPointImpl.port, resolveAddress);
                        if (createRawMessageChannel != null) {
                            createRawMessageChannel.sendMessage(sIPResponse);
                            return;
                        }
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger = logger;
                            stackLogger.logDebug("Could not create a message channel for " + resolveAddress.toString() + " listeningPoints = " + this.listeningPoints);
                        }
                        throw new n("Could not create a message channel for " + resolveAddress.toString());
                    }
                    throw new n("whoopsa daisy! no listening point found for transport " + transport);
                } catch (IOException e10) {
                    throw new n(e10.getMessage());
                }
            }
            throw new n("No via header in response!");
        }
        throw new n("Stack is stopped");
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void setAutomaticDialogSupportEnabled(boolean z10) {
        this.automaticDialogSupportEnabled = z10;
        if (z10) {
            this.dialogErrorsAutomaticallyHandled = true;
        }
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public void setDialogErrorsAutomaticallyHandled() {
        this.dialogErrorsAutomaticallyHandled = true;
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public synchronized void setListeningPoint(h hVar) {
        if (hVar != null) {
            ListeningPointImpl listeningPointImpl = (ListeningPointImpl) hVar;
            listeningPointImpl.sipProvider = this;
            String upperCase = listeningPointImpl.getTransport().toUpperCase();
            this.listeningPoints.clear();
            this.listeningPoints.put(upperCase, hVar);
        } else {
            throw new NullPointerException("Null listening point");
        }
    }

    public void stop() {
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Exiting provider");
        }
        Iterator<h> it = this.listeningPoints.values().iterator();
        while (it.hasNext()) {
            ((ListeningPointImpl) it.next()).removeSipProvider();
        }
        this.eventScanner.stop();
    }

    @Override // android.gov.nist.javax.sip.stack.SIPTransactionEventListener
    public void transactionErrorEvent(SIPTransactionErrorEvent sIPTransactionErrorEvent) {
        t tVar;
        t tVar2;
        t tVar3;
        SIPTransaction sIPTransaction = (SIPTransaction) sIPTransactionErrorEvent.getSource();
        if (sIPTransactionErrorEvent.getErrorID() == 2) {
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger = logger;
                stackLogger.logDebug("TransportError occured on " + sIPTransaction);
            }
            Object source = sIPTransactionErrorEvent.getSource();
            s[] sVarArr = s.f24335Z;
            if (source instanceof SIPServerTransaction) {
                tVar3 = new t(this, (m) source);
            } else {
                AbstractC2092b nextHop = ((SIPClientTransaction) source).getNextHop();
                if (this.sipStack.getRouter() instanceof RouterExt) {
                    ((RouterExt) this.sipStack.getRouter()).transactionTimeout(nextHop);
                }
                tVar3 = new t(this, (a) source);
            }
            handleEvent(tVar3, (SIPTransaction) source);
        } else if (sIPTransactionErrorEvent.getErrorID() == 1) {
            Object source2 = sIPTransactionErrorEvent.getSource();
            s[] sVarArr2 = s.f24335Z;
            if (source2 instanceof SIPServerTransaction) {
                tVar2 = new t(this, (m) source2);
            } else {
                AbstractC2092b nextHop2 = ((SIPClientTransaction) source2).getNextHop();
                if (this.sipStack.getRouter() instanceof RouterExt) {
                    ((RouterExt) this.sipStack.getRouter()).transactionTimeout(nextHop2);
                }
                tVar2 = new t(this, (a) source2);
            }
            handleEvent(tVar2, (SIPTransaction) source2);
        } else if (sIPTransactionErrorEvent.getErrorID() == 3) {
            Object source3 = sIPTransactionErrorEvent.getSource();
            if (((u) source3).getDialog() != null) {
                InternalErrorHandler.handleException("Unexpected event !", logger);
            }
            s[] sVarArr3 = s.f24335Z;
            if (source3 instanceof SIPServerTransaction) {
                tVar = new t(this, (m) source3);
            } else {
                tVar = new t(this, (a) source3);
            }
            handleEvent(tVar, (SIPTransaction) source3);
        }
    }

    public SipProviderImpl(SipStackImpl sipStackImpl) {
        this.dialogErrorsAutomaticallyHandled = true;
        EventScanner eventScanner = sipStackImpl.getEventScanner();
        this.eventScanner = eventScanner;
        this.sipStack = sipStackImpl;
        eventScanner.incrementRefcount();
        this.listeningPoints = new ConcurrentHashMap<>();
        this.automaticDialogSupportEnabled = this.sipStack.isAutomaticDialogSupportEnabled();
        this.dialogErrorsAutomaticallyHandled = this.sipStack.isAutomaticDialogErrorHandlingEnabled();
    }

    @Override // android.gov.nist.javax.sip.SipProviderExt
    public h getListeningPoint() {
        if (this.listeningPoints.size() > 0) {
            return this.listeningPoints.values().iterator().next();
        }
        return null;
    }
}
