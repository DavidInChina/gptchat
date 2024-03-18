package android.gov.nist.javax.sip;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.Contact;
import android.gov.nist.javax.sip.header.Event;
import android.gov.nist.javax.sip.header.RetryAfter;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.message.MessageFactoryImpl;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.message.SIPResponse;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.MessageChannel;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPDialog;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.gov.nist.javax.sip.stack.SIPTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.gov.nist.javax.sip.stack.ServerRequestInterface;
import android.gov.nist.javax.sip.stack.ServerResponseInterface;
import android.javax.sip.d;
import android.javax.sip.i;
import android.javax.sip.m;
import android.javax.sip.n;
import android.javax.sip.v;
import c.AbstractC2245Q;
import c.Y;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d.AbstractC2562c;
import java.io.IOException;

/* loaded from: classes.dex */
class DialogFilter implements ServerRequestInterface, ServerResponseInterface {
    private static StackLogger logger = CommonLogger.getLogger(DialogFilter.class);
    protected ListeningPointImpl listeningPoint;
    private SIPTransactionStack sipStack;
    protected SIPTransaction transactionChannel;

    public DialogFilter(SIPTransactionStack sIPTransactionStack) {
        this.sipStack = sIPTransactionStack;
    }

    private void sendBadRequestResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction, String str) {
        if (sIPServerTransaction.getState() != v.f24345m0) {
            SIPResponse createResponse = sIPRequest.createResponse(RCHTTPStatusCodes.BAD_REQUEST);
            if (str != null) {
                createResponse.setReasonPhrase(str);
            }
            Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                createResponse.setHeader(defaultServerHeader);
            }
            try {
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                }
                sIPServerTransaction.sendResponse(createResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendCallOrTransactionDoesNotExistResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) {
        if (sIPServerTransaction.getState() != v.f24345m0) {
            SIPResponse createResponse = sIPRequest.createResponse(481);
            Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                createResponse.setHeader(defaultServerHeader);
            }
            try {
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                }
                sIPServerTransaction.sendResponse(createResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendLoopDetectedResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) {
        SIPResponse createResponse = sIPRequest.createResponse(482);
        if (sIPServerTransaction.getState() != v.f24345m0) {
            Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                createResponse.setHeader(defaultServerHeader);
            }
            try {
                this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                sIPServerTransaction.sendResponse(createResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendRequestPendingResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) {
        if (sIPServerTransaction.getState() != v.f24345m0) {
            AbstractC2562c createResponse = sIPRequest.createResponse(491);
            Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                createResponse.setHeader(defaultServerHeader);
            }
            try {
                RetryAfter retryAfter = new RetryAfter();
                retryAfter.setRetryAfter(1);
                createResponse.setHeader(retryAfter);
                if (sIPRequest.getMethod().equals(TokenNames.INVITE)) {
                    this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                }
                sIPServerTransaction.sendResponse(createResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendServerInternalErrorResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) {
        if (sIPServerTransaction.getState() != v.f24345m0) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Sending 500 response for out of sequence message");
            }
            AbstractC2562c createResponse = sIPRequest.createResponse(500);
            createResponse.setReasonPhrase("Request out of order");
            if (MessageFactoryImpl.getDefaultServerHeader() != null) {
                createResponse.setHeader(MessageFactoryImpl.getDefaultServerHeader());
            }
            try {
                RetryAfter retryAfter = new RetryAfter();
                retryAfter.setRetryAfter(10);
                createResponse.setHeader(retryAfter);
                this.sipStack.addTransactionPendingAck(sIPServerTransaction);
                sIPServerTransaction.sendResponse(createResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    private void sendTryingResponse(SIPRequest sIPRequest, SIPServerTransaction sIPServerTransaction) {
        SIPResponse createResponse = sIPRequest.createResponse(100);
        if (sIPServerTransaction.getState() != v.f24345m0) {
            Y defaultServerHeader = MessageFactoryImpl.getDefaultServerHeader();
            if (defaultServerHeader != null) {
                createResponse.setHeader(defaultServerHeader);
            }
            try {
                sIPServerTransaction.sendResponse(createResponse);
                sIPServerTransaction.releaseSem();
            } catch (Exception e10) {
                logger.logError("Problem sending error response", e10);
                sIPServerTransaction.releaseSem();
                this.sipStack.removeTransaction(sIPServerTransaction);
            }
        }
    }

    public String getProcessingInfo() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:399:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08c4  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0879 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.gov.nist.javax.sip.stack.ServerRequestInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel) {
        Object obj;
        String str;
        Object obj2;
        RequestEventExt requestEventExt;
        Object obj3;
        String str2;
        SIPServerTransaction sIPServerTransaction;
        SIPTransaction sIPTransaction;
        Contact myContactHeader;
        if (logger.isLoggingEnabled(32) && this.listeningPoint != null) {
            logger.logDebug("PROCESSING INCOMING REQUEST " + sIPRequest + " transactionChannel = " + this.transactionChannel + " listening point = " + this.listeningPoint.getIPAddress() + ":" + this.listeningPoint.getPort());
        }
        if (this.listeningPoint == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Dropping message: No listening point registered!");
                return;
            }
            return;
        }
        SIPTransactionStack sIPStack = this.transactionChannel.getSIPStack();
        SipProviderImpl provider = this.listeningPoint.getProvider();
        if (provider == null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("No provider - dropping !!");
                return;
            }
            return;
        }
        if (sIPStack == null) {
            InternalErrorHandler.handleException("Egads! no sip stack!");
        }
        SIPServerTransaction sIPServerTransaction2 = (SIPServerTransaction) this.transactionChannel;
        if (sIPServerTransaction2 != null && logger.isLoggingEnabled(32)) {
            logger.logDebug("transaction state = " + sIPServerTransaction2.getState());
        }
        String dialogId = sIPRequest.getDialogId(true);
        SIPDialog dialog = sIPStack.getDialog(dialogId);
        int i10 = SIPConstants.DEFAULT_TLS_PORT;
        if (dialog != null && provider != dialog.getSipProvider() && (myContactHeader = dialog.getMyContactHeader()) != null) {
            SipUri sipUri = (SipUri) myContactHeader.getAddress().getURI();
            String host = sipUri.getHost();
            int port = sipUri.getPort();
            String transportParam = sipUri.getTransportParam();
            if (transportParam == null) {
                transportParam = ParameterNames.UDP;
            }
            if (port == -1) {
                if (!transportParam.equals(ParameterNames.UDP) && !transportParam.equals(ParameterNames.TCP)) {
                    port = 5061;
                } else {
                    port = SIPConstants.DEFAULT_PORT;
                }
            }
            if (host != null && (!host.equals(this.listeningPoint.getIPAddress()) || port != this.listeningPoint.getPort())) {
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger = logger;
                    StringBuilder q10 = a.q("nulling dialog -- listening point mismatch!  ", port, "  lp port = ");
                    q10.append(this.listeningPoint.getPort());
                    stackLogger.logDebug(q10.toString());
                }
                dialog = null;
            }
        }
        if (provider.isDialogErrorsAutomaticallyHandled() && sIPRequest.getToTag() == null && sIPStack.findMergedTransaction(sIPRequest)) {
            sendLoopDetectedResponse(sIPRequest, sIPServerTransaction2);
            return;
        }
        if (logger.isLoggingEnabled(32)) {
            a.w("dialogId = ", dialogId, logger);
            logger.logDebug("dialog = " + dialog);
        }
        if (sIPRequest.getHeader(SIPHeaderNames.ROUTE) != null && sIPServerTransaction2.getDialog() != null) {
            RouteList routeHeaders = sIPRequest.getRouteHeaders();
            HostPort hostPort = ((SipUri) ((Route) routeHeaders.getFirst()).getAddress().getURI()).getHostPort();
            if (hostPort.hasPort()) {
                i10 = hostPort.getPort();
            } else if (!this.listeningPoint.getTransport().equalsIgnoreCase("TLS")) {
                i10 = SIPConstants.DEFAULT_PORT;
            }
            String encode = hostPort.getHost().encode();
            if ((encode.equals(this.listeningPoint.getIPAddress()) || encode.equalsIgnoreCase(this.listeningPoint.getSentBy())) && i10 == this.listeningPoint.getPort()) {
                if (routeHeaders.size() == 1) {
                    sIPRequest.removeHeader(SIPHeaderNames.ROUTE);
                } else {
                    routeHeaders.removeFirst();
                }
            }
        }
        String method = sIPRequest.getMethod();
        if (!method.equals("REFER") || dialog == null || !provider.isDialogErrorsAutomaticallyHandled()) {
            obj3 = "CANCEL";
            str2 = Separators.SP;
            if (method.equals("UPDATE")) {
                if (provider.isAutomaticDialogSupportEnabled() && dialog == null) {
                    sendCallOrTransactionDoesNotExistResponse(sIPRequest, sIPServerTransaction2);
                    return;
                }
            } else {
                if (method.equals(TokenNames.ACK)) {
                    if (sIPServerTransaction2 != null && sIPServerTransaction2.isInviteTransaction()) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Processing ACK for INVITE Tx ");
                        }
                    } else {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger2 = logger;
                            obj = TokenNames.ACK;
                            stackLogger2.logDebug("Processing ACK for dialog " + dialog);
                        } else {
                            obj = TokenNames.ACK;
                        }
                        if (dialog == null) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Dialog does not exist " + sIPRequest.getFirstLine() + " isServerTransaction = true");
                            }
                            SIPServerTransaction retransmissionAlertTransaction = sIPStack.getRetransmissionAlertTransaction(dialogId);
                            if (retransmissionAlertTransaction != null && retransmissionAlertTransaction.isRetransmissionAlertEnabled()) {
                                retransmissionAlertTransaction.disableRetransmissionAlerts();
                            }
                            SIPServerTransaction findTransactionPendingAck = sIPStack.findTransactionPendingAck(sIPRequest);
                            if (findTransactionPendingAck != null) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Found Tx pending ACK");
                                }
                                try {
                                    findTransactionPendingAck.setAckSeen();
                                    sIPStack.removeTransaction(findTransactionPendingAck);
                                    sIPStack.removeTransactionPendingAck(findTransactionPendingAck);
                                    return;
                                } catch (Exception e10) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("Problem terminating transaction", e10);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if (!dialog.handleAck(sIPServerTransaction2)) {
                            if (!dialog.isSequenceNumberValidation()) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Dialog exists with loose dialog validation " + sIPRequest.getFirstLine() + " isServerTransaction = true dialog = " + dialog.getDialogId());
                                }
                                SIPServerTransaction retransmissionAlertTransaction2 = sIPStack.getRetransmissionAlertTransaction(dialogId);
                                if (retransmissionAlertTransaction2 != null && retransmissionAlertTransaction2.isRetransmissionAlertEnabled()) {
                                    retransmissionAlertTransaction2.disableRetransmissionAlerts();
                                }
                                SIPServerTransaction findTransactionPendingAck2 = sIPStack.findTransactionPendingAck(sIPRequest);
                                if (findTransactionPendingAck2 != null) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Found Tx pending ACK");
                                    }
                                    try {
                                        findTransactionPendingAck2.setAckSeen();
                                        sIPStack.removeTransaction(findTransactionPendingAck2);
                                        sIPStack.removeTransactionPendingAck(findTransactionPendingAck2);
                                    } catch (Exception e11) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("Problem terminating transaction", e11);
                                        }
                                    }
                                }
                            } else {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Dropping ACK - cannot find a transaction or dialog");
                                }
                                SIPServerTransaction findTransactionPendingAck3 = sIPStack.findTransactionPendingAck(sIPRequest);
                                if (findTransactionPendingAck3 != null) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Found Tx pending ACK");
                                    }
                                    try {
                                        findTransactionPendingAck3.setAckSeen();
                                        sIPStack.removeTransaction(findTransactionPendingAck3);
                                        sIPStack.removeTransactionPendingAck(findTransactionPendingAck3);
                                    } catch (Exception e12) {
                                        if (logger.isLoggingEnabled()) {
                                            logger.logError("Problem terminating transaction", e12);
                                        }
                                    }
                                }
                                if (sIPStack.isDeliverRetransmittedAckToListener()) {
                                    if (findTransactionPendingAck3 != null && !sIPStack.isNon2XXAckPassedToListener()) {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            dialog.addTransaction(sIPServerTransaction2);
                            sIPServerTransaction2.passToListener();
                            dialog.addRoute(sIPRequest);
                            sIPServerTransaction2.setDialog(dialog, dialogId);
                            if (sIPRequest.getMethod().equals(TokenNames.INVITE) && provider.isDialogErrorsAutomaticallyHandled()) {
                                sIPStack.putInMergeTable(sIPServerTransaction2, sIPRequest);
                            }
                            if (sIPStack.isDeliverTerminatedEventForAck()) {
                                try {
                                    sIPStack.addTransaction(sIPServerTransaction2);
                                    sIPServerTransaction2.scheduleAckRemoval();
                                } catch (IOException unused) {
                                }
                            } else {
                                sIPServerTransaction2.setMapped(true);
                            }
                        }
                    }
                } else {
                    obj = TokenNames.ACK;
                    if (method.equals("PRACK")) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Processing PRACK for dialog " + dialog);
                        }
                        if (dialog == null && provider.isAutomaticDialogSupportEnabled()) {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Dialog does not exist " + sIPRequest.getFirstLine() + " isServerTransaction = true");
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("Sending 481 for PRACK - automatic dialog support is enabled -- cant find dialog!");
                            }
                            try {
                                provider.sendResponse(sIPRequest.createResponse(481));
                            } catch (n e13) {
                                logger.logError("error sending response", e13);
                            }
                            if (sIPServerTransaction2 != null) {
                                sIPStack.removeTransaction(sIPServerTransaction2);
                                sIPServerTransaction2.releaseSem();
                                return;
                            }
                            return;
                        } else if (dialog != null) {
                            if (!dialog.handlePrack(sIPRequest)) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Dropping out of sequence PRACK ");
                                }
                                if (sIPServerTransaction2 != null) {
                                    sIPStack.removeTransaction(sIPServerTransaction2);
                                    sIPServerTransaction2.releaseSem();
                                    return;
                                }
                                return;
                            }
                            try {
                                sIPStack.addTransaction(sIPServerTransaction2);
                                dialog.addTransaction(sIPServerTransaction2);
                                dialog.addRoute(sIPRequest);
                                sIPServerTransaction2.setDialog(dialog, dialogId);
                            } catch (Exception e14) {
                                InternalErrorHandler.handleException(e14);
                            }
                        } else if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Processing PRACK without a DIALOG -- this must be a proxy element");
                        }
                    } else {
                        if (method.equals(TokenNames.BYE)) {
                            if (dialog != null && !dialog.isRequestConsumable(sIPRequest)) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Dropping out of sequence BYE " + dialog.getRemoteSeqNumber() + str2 + sIPRequest.getCSeq().getSeqNumber());
                                }
                                if (dialog.getRemoteSeqNumber() > sIPRequest.getCSeq().getSeqNumber()) {
                                    sendServerInternalErrorResponse(sIPRequest, sIPServerTransaction2);
                                } else if (sIPServerTransaction2.getInternalState() == 2) {
                                    sendTryingResponse(sIPRequest, sIPServerTransaction2);
                                }
                                sIPStack.removeTransaction(sIPServerTransaction2);
                                return;
                            }
                            str = str2;
                            if (dialog == null && provider.isAutomaticDialogSupportEnabled()) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("dropping request -- automatic dialog support enabled and dialog does not exist!");
                                }
                                sendCallOrTransactionDoesNotExistResponse(sIPRequest, sIPServerTransaction2);
                                if (sIPServerTransaction2 != null) {
                                    sIPStack.removeTransaction(sIPServerTransaction2);
                                    sIPServerTransaction2.releaseSem();
                                    return;
                                }
                                return;
                            }
                            if (sIPServerTransaction2 != null && dialog != null) {
                                try {
                                    if (provider == dialog.getSipProvider()) {
                                        sIPStack.addTransaction(sIPServerTransaction2);
                                        dialog.addTransaction(sIPServerTransaction2);
                                        sIPServerTransaction2.setDialog(dialog, dialogId);
                                    }
                                } catch (IOException e15) {
                                    InternalErrorHandler.handleException(e15);
                                }
                            }
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("BYE Tx = " + sIPServerTransaction2 + " isMapped =" + sIPServerTransaction2.isTransactionMapped());
                            }
                            obj2 = obj3;
                        } else {
                            obj2 = obj3;
                            str = str2;
                            if (method.equals(obj2)) {
                                SIPServerTransaction sIPServerTransaction3 = (SIPServerTransaction) sIPStack.findCancelTransaction(sIPRequest, true);
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Got a CANCEL, InviteServerTx = " + sIPServerTransaction3 + " cancel Server Tx ID = " + sIPServerTransaction2 + " isMapped = " + sIPServerTransaction2.isTransactionMapped());
                                }
                                if (sIPRequest.getMethod().equals(obj2)) {
                                    if (sIPServerTransaction3 != null && sIPServerTransaction3.getInternalState() == 5) {
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("Too late to cancel Transaction");
                                        }
                                        try {
                                            sIPServerTransaction2.sendResponse(sIPRequest.createResponse(RCHTTPStatusCodes.SUCCESS));
                                            return;
                                        } catch (Exception e16) {
                                            if (e16.getCause() != null && (e16.getCause() instanceof IOException)) {
                                                sIPServerTransaction3.raiseIOExceptionEvent();
                                                return;
                                            }
                                            return;
                                        }
                                    } else if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Cancel transaction = " + sIPServerTransaction3);
                                    }
                                }
                                if (sIPServerTransaction2 != null && sIPServerTransaction3 != null && sIPServerTransaction3.getDialog() != null) {
                                    sIPServerTransaction2.setDialog((SIPDialog) sIPServerTransaction3.getDialog(), dialogId);
                                    dialog = (SIPDialog) sIPServerTransaction3.getDialog();
                                } else if (sIPServerTransaction3 == null && provider.isAutomaticDialogSupportEnabled() && sIPServerTransaction2 != null) {
                                    AbstractC2562c createResponse = sIPRequest.createResponse(481);
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("dropping request -- automatic dialog support enabled and INVITE ST does not exist!");
                                    }
                                    try {
                                        provider.sendResponse(createResponse);
                                    } catch (n e17) {
                                        InternalErrorHandler.handleException(e17);
                                    }
                                    sIPStack.removeTransaction(sIPServerTransaction2);
                                    sIPServerTransaction2.releaseSem();
                                    return;
                                }
                                if (sIPServerTransaction3 != null) {
                                    sIPServerTransaction3.setPassToListener();
                                    if (sIPServerTransaction2 != null) {
                                        try {
                                            sIPStack.addTransaction(sIPServerTransaction2);
                                            sIPServerTransaction2.setPassToListener();
                                            sIPServerTransaction2.setInviteTransaction(sIPServerTransaction3);
                                            sIPServerTransaction3.acquireSem();
                                        } catch (Exception e18) {
                                            InternalErrorHandler.handleException(e18);
                                        }
                                    }
                                }
                            } else if (method.equals(TokenNames.INVITE)) {
                                if (dialog == null) {
                                    sIPServerTransaction = null;
                                } else {
                                    sIPServerTransaction = dialog.getInviteTransaction();
                                }
                                if (dialog != null && sIPServerTransaction2 != null && sIPServerTransaction != null && sIPRequest.getCSeq().getSeqNumber() > sIPServerTransaction.getCSeq() && provider.isDialogErrorsAutomaticallyHandled() && dialog.isSequenceNumberValidation() && sIPServerTransaction.isInviteTransaction() && sIPServerTransaction.getInternalState() != 3 && sIPServerTransaction.getInternalState() != 5 && sIPServerTransaction.getInternalState() != 4) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Sending 500 response for out of sequence message");
                                    }
                                    sendServerInternalErrorResponse(sIPRequest, sIPServerTransaction2);
                                    return;
                                }
                                if (dialog == null) {
                                    sIPTransaction = null;
                                } else {
                                    sIPTransaction = dialog.getLastTransaction();
                                }
                                if (dialog != null && provider.isDialogErrorsAutomaticallyHandled() && sIPTransaction != null && sIPTransaction.isInviteTransaction() && (sIPTransaction instanceof android.javax.sip.a) && sIPTransaction.getState() != v.f24343k0 && sIPTransaction.getState() != v.f24345m0) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("DialogFilter::processRequest:lastTransaction.getState(): " + sIPTransaction.getState() + " Sending 491 response for clientTx.");
                                    }
                                    sendRequestPendingResponse(sIPRequest, sIPServerTransaction2);
                                    return;
                                } else if (dialog != null && sIPTransaction != null && provider.isDialogErrorsAutomaticallyHandled() && sIPTransaction.isInviteTransaction() && (sIPTransaction instanceof m) && sIPRequest.getCSeq().getSeqNumber() > sIPTransaction.getCSeq() && (sIPTransaction.getInternalState() == 2 || sIPTransaction.getInternalState() == 1)) {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Sending 491 response. Last transaction is in PROCEEDING state.");
                                        logger.logDebug("last Transaction state = " + sIPTransaction + " state " + sIPTransaction.getState());
                                    }
                                    sendRequestPendingResponse(sIPRequest, sIPServerTransaction2);
                                    return;
                                }
                            }
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("CHECK FOR OUT OF SEQ MESSAGE " + dialog + " transaction " + sIPServerTransaction2);
                        }
                        if (dialog != null && sIPServerTransaction2 != null && !method.equals(TokenNames.BYE) && !method.equals(obj2) && !method.equals(obj) && !method.equals("PRACK")) {
                            if (dialog.isRequestConsumable(sIPRequest)) {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Dropping out of sequence message " + dialog.getRemoteSeqNumber() + str + sIPRequest.getCSeq());
                                }
                                if (dialog.getRemoteSeqNumber() > sIPRequest.getCSeq().getSeqNumber() && provider.isDialogErrorsAutomaticallyHandled()) {
                                    sendServerInternalErrorResponse(sIPRequest, sIPServerTransaction2);
                                    return;
                                }
                                try {
                                    sIPServerTransaction2.terminate();
                                    return;
                                } catch (i e19) {
                                    if (logger.isLoggingEnabled()) {
                                        logger.logError("Unexpected exception", e19);
                                        return;
                                    }
                                    return;
                                }
                            }
                            try {
                                if (provider == dialog.getSipProvider()) {
                                    sIPStack.addTransaction(sIPServerTransaction2);
                                    if (!dialog.addTransaction(sIPServerTransaction2)) {
                                        return;
                                    }
                                    dialog.addRoute(sIPRequest);
                                    sIPServerTransaction2.setDialog(dialog, dialogId);
                                }
                            } catch (IOException unused2) {
                                sIPServerTransaction2.raiseIOExceptionEvent();
                                sIPStack.removeTransaction(sIPServerTransaction2);
                                return;
                            }
                        }
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug(sIPRequest.getMethod() + " transaction.isMapped = " + sIPServerTransaction2.isTransactionMapped());
                        }
                        if (dialog != null && method.equals(TokenNames.NOTIFY)) {
                            SIPClientTransaction findSubscribeTransaction = sIPStack.findSubscribeTransaction(sIPRequest, this.listeningPoint);
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("PROCESSING NOTIFY  DIALOG == null " + findSubscribeTransaction);
                            }
                            if (provider.isAutomaticDialogSupportEnabled() && findSubscribeTransaction == null && !sIPStack.isDeliverUnsolicitedNotify()) {
                                try {
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("Could not find Subscription for Notify Tx.");
                                    }
                                    AbstractC2562c createResponse2 = sIPRequest.createResponse(481);
                                    createResponse2.setReasonPhrase("Subscription does not exist");
                                    provider.sendResponse(createResponse2);
                                    return;
                                } catch (Exception e20) {
                                    logger.logError("Exception while sending error response statelessly", e20);
                                    return;
                                }
                            } else if (findSubscribeTransaction != null) {
                                sIPServerTransaction2.setPendingSubscribe(findSubscribeTransaction);
                                SIPDialog defaultDialog = findSubscribeTransaction.getDefaultDialog();
                                if (defaultDialog != null && defaultDialog.getDialogId() != null && defaultDialog.getDialogId().equals(dialogId)) {
                                    sIPServerTransaction2.setDialog(defaultDialog, dialogId);
                                    if (!sIPServerTransaction2.isTransactionMapped()) {
                                        this.sipStack.mapTransaction(sIPServerTransaction2);
                                        sIPServerTransaction2.setPassToListener();
                                        try {
                                            this.sipStack.addTransaction(sIPServerTransaction2);
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    sIPStack.putDialog(defaultDialog);
                                    defaultDialog.addTransaction(findSubscribeTransaction);
                                    findSubscribeTransaction.setDialog(defaultDialog, dialogId);
                                } else {
                                    if (defaultDialog != null && defaultDialog.getDialogId() == null) {
                                        defaultDialog.setDialogId(dialogId);
                                        if (logger.isLoggingEnabled(32)) {
                                            logger.logDebug("Dialog id set on default dialog.");
                                        }
                                    } else {
                                        defaultDialog = findSubscribeTransaction.getDialog(dialogId);
                                    }
                                    if (logger.isLoggingEnabled(32)) {
                                        logger.logDebug("PROCESSING NOTIFY Subscribe DIALOG " + defaultDialog);
                                    }
                                    if (defaultDialog == null && ((provider.isAutomaticDialogSupportEnabled() || findSubscribeTransaction.getDefaultDialog() != null) && sIPStack.isEventForked(((Event) sIPRequest.getHeader(SIPHeaderNames.EVENT)).getEventType()))) {
                                        defaultDialog = sIPStack.createDialog(findSubscribeTransaction, sIPServerTransaction2);
                                    }
                                    if (defaultDialog != null) {
                                        sIPServerTransaction2.setDialog(defaultDialog, dialogId);
                                        d state = defaultDialog.getState();
                                        d dVar = d.f24328i0;
                                        if (state != dVar) {
                                            defaultDialog.setPendingRouteUpdateOn202Response(sIPRequest);
                                        }
                                        defaultDialog.setState(dVar.f24330Y);
                                        sIPStack.putDialog(defaultDialog);
                                        findSubscribeTransaction.setDialog(defaultDialog, dialogId);
                                        if (!sIPServerTransaction2.isTransactionMapped()) {
                                            this.sipStack.mapTransaction(sIPServerTransaction2);
                                            sIPServerTransaction2.setPassToListener();
                                            try {
                                                this.sipStack.addTransaction(sIPServerTransaction2);
                                            } catch (Exception unused4) {
                                            }
                                        }
                                    }
                                }
                                if (sIPServerTransaction2.isTransactionMapped()) {
                                    requestEventExt = new RequestEventExt(provider, sIPServerTransaction2, defaultDialog, sIPRequest);
                                } else {
                                    requestEventExt = new RequestEventExt(provider, null, defaultDialog, sIPRequest);
                                }
                            } else {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("could not find subscribe tx");
                                }
                                requestEventExt = new RequestEventExt(provider, null, null, sIPRequest);
                            }
                        } else if (sIPServerTransaction2 == null && sIPServerTransaction2.isTransactionMapped()) {
                            requestEventExt = new RequestEventExt(provider, sIPServerTransaction2, dialog, sIPRequest);
                        } else {
                            requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                        }
                        requestEventExt.setRemoteIpAddress(sIPRequest.getRemoteAddress().getHostAddress());
                        requestEventExt.setRemotePort(sIPRequest.getRemotePort());
                        provider.handleEvent(requestEventExt, sIPServerTransaction2);
                    }
                }
                obj2 = obj3;
                str = str2;
                if (logger.isLoggingEnabled(32)) {
                }
                if (dialog != null) {
                    if (dialog.isRequestConsumable(sIPRequest)) {
                    }
                }
                if (logger.isLoggingEnabled(32)) {
                }
                if (dialog != null) {
                }
                if (sIPServerTransaction2 == null) {
                }
                requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
                requestEventExt.setRemoteIpAddress(sIPRequest.getRemoteAddress().getHostAddress());
                requestEventExt.setRemotePort(sIPRequest.getRemotePort());
                provider.handleEvent(requestEventExt, sIPServerTransaction2);
            }
        } else if (((AbstractC2245Q) sIPRequest.getHeader("Refer-To")) == null) {
            sendBadRequestResponse(sIPRequest, sIPServerTransaction2, "Refer-To header is missing");
            return;
        } else {
            SIPTransaction lastTransaction = dialog.getLastTransaction();
            if (lastTransaction == null || !provider.isDialogErrorsAutomaticallyHandled()) {
                obj3 = "CANCEL";
                str2 = Separators.SP;
            } else {
                String method2 = lastTransaction.getMethod();
                obj3 = "CANCEL";
                if (lastTransaction instanceof SIPServerTransaction) {
                    int internalState = lastTransaction.getInternalState();
                    str2 = Separators.SP;
                    if ((internalState == 2 || lastTransaction.getInternalState() == 1) && method2.equals(TokenNames.INVITE)) {
                        sendRequestPendingResponse(sIPRequest, sIPServerTransaction2);
                        return;
                    }
                } else {
                    str2 = Separators.SP;
                    if ((lastTransaction instanceof SIPClientTransaction) && method2.equals(TokenNames.INVITE) && lastTransaction.getInternalState() != 5 && lastTransaction.getInternalState() != 3) {
                        sendRequestPendingResponse(sIPRequest, sIPServerTransaction2);
                        return;
                    }
                }
            }
        }
        obj = TokenNames.ACK;
        obj2 = obj3;
        str = str2;
        if (logger.isLoggingEnabled(32)) {
        }
        if (dialog != null) {
        }
        if (logger.isLoggingEnabled(32)) {
        }
        if (dialog != null) {
        }
        if (sIPServerTransaction2 == null) {
        }
        requestEventExt = new RequestEventExt(provider, null, dialog, sIPRequest);
        requestEventExt.setRemoteIpAddress(sIPRequest.getRemoteAddress().getHostAddress());
        requestEventExt.setRemotePort(sIPRequest.getRemotePort());
        provider.handleEvent(requestEventExt, sIPServerTransaction2);
    }

    @Override // android.gov.nist.javax.sip.stack.ServerResponseInterface
    public void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel, SIPDialog sIPDialog) {
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("PROCESSING INCOMING RESPONSE" + ((Object) sIPResponse.encodeMessage(new StringBuilder())));
        }
        if (this.listeningPoint == null) {
            if (!logger.isLoggingEnabled()) {
                return;
            }
            logger.logError("Dropping message: No listening point registered!");
        } else if (this.sipStack.checkBranchId() && !Utils.getInstance().responseBelongsToUs(sIPResponse)) {
            if (!logger.isLoggingEnabled()) {
                return;
            }
            logger.logError("Dropping response - topmost VIA header does not originate from this stack");
        } else {
            SipProviderImpl provider = this.listeningPoint.getProvider();
            if (provider == null) {
                if (!logger.isLoggingEnabled()) {
                    return;
                }
                logger.logError("Dropping message:  no provider");
            } else if (provider.getSipListener() == null) {
                if (!logger.isLoggingEnabled()) {
                    return;
                }
                logger.logError("No listener -- dropping response!");
            } else {
                SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) this.transactionChannel;
                if (logger.isLoggingEnabled(32)) {
                    StackLogger stackLogger2 = logger;
                    stackLogger2.logDebug("Transaction = " + sIPClientTransaction);
                }
                if (sIPClientTransaction == null) {
                    if (sIPDialog != null) {
                        if (sIPResponse.getStatusCode() / 100 != 2) {
                            if (!logger.isLoggingEnabled(32)) {
                                return;
                            }
                            logger.logDebug("Response is not a final response and dialog is found for response -- dropping response!");
                            return;
                        } else if (sIPDialog.getState() == d.f24329j0) {
                            if (!logger.isLoggingEnabled(32)) {
                                return;
                            }
                            logger.logDebug("Dialog is terminated -- dropping response!");
                            return;
                        } else if (sIPDialog.isAckSeen() && sIPDialog.isAckSent() && sIPDialog.isLastAckPresent() && sIPDialog.getLastAckSentCSeq().getSeqNumber() == sIPResponse.getCSeq().getSeqNumber() && sIPResponse.getCSeq().getMethod().equals(sIPDialog.getMethod())) {
                            try {
                                if (logger.isLoggingEnabled(32)) {
                                    logger.logDebug("Retransmission of OK detected: Resending last ACK");
                                }
                                sIPDialog.resendAck();
                                return;
                            } catch (n e10) {
                                logger.logError("could not resend ack", e10);
                            }
                        }
                    }
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger3 = logger;
                        stackLogger3.logDebug("could not find tx, handling statelessly Dialog =  " + sIPDialog);
                    }
                    ResponseEventExt responseEventExt = new ResponseEventExt(provider, sIPClientTransaction, sIPDialog, sIPResponse);
                    if (this.sipStack.getMaxForkTime() != 0 && SIPTransactionStack.isDialogCreated(sIPResponse.getCSeqHeader().getMethod())) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger4 = logger;
                            stackLogger4.logDebug("Trying to find forked Transaction for forked id " + sIPResponse.getForkId());
                        }
                        SIPClientTransaction forkedTransaction = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
                        if (sIPDialog != null && forkedTransaction != null) {
                            sIPDialog.checkRetransmissionForForking(sIPResponse);
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger5 = logger;
                                stackLogger5.logDebug("original dialog " + forkedTransaction.getDefaultDialog() + " forked dialog " + sIPDialog);
                            }
                            if (forkedTransaction.getDefaultDialog() != null && !sIPDialog.equals(forkedTransaction.getDefaultDialog())) {
                                if (logger.isLoggingEnabled(32)) {
                                    StackLogger stackLogger6 = logger;
                                    stackLogger6.logDebug("forkedId= " + sIPResponse.getForkId() + " forked dialog " + sIPDialog + " original tx " + forkedTransaction + " original dialog " + forkedTransaction.getDefaultDialog());
                                }
                                responseEventExt.setOriginalTransaction(forkedTransaction);
                                responseEventExt.setForkedResponse(true);
                                if (sIPClientTransaction == null && sIPDialog.getState() == d.f24327h0 && sIPResponse.getStatusCode() >= 200 && sIPResponse.getStatusCode() < 300) {
                                    sIPDialog.setLastResponse(sIPClientTransaction, sIPResponse);
                                }
                            }
                        }
                    }
                    responseEventExt.setRetransmission(sIPResponse.isRetransmission());
                    responseEventExt.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
                    responseEventExt.setRemotePort(sIPResponse.getRemotePort());
                    provider.handleEvent(responseEventExt, sIPClientTransaction);
                    return;
                }
                ResponseEventExt responseEventExt2 = new ResponseEventExt(provider, sIPClientTransaction, sIPDialog, sIPResponse);
                if (this.sipStack.getMaxForkTime() != 0 && SIPTransactionStack.isDialogCreated(sIPResponse.getCSeqHeader().getMethod())) {
                    SIPClientTransaction forkedTransaction2 = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
                    if (sIPDialog != null && forkedTransaction2 != null) {
                        sIPDialog.checkRetransmissionForForking(sIPResponse);
                        if (forkedTransaction2.getDefaultDialog() != null && !sIPDialog.equals(forkedTransaction2.getDefaultDialog())) {
                            if (logger.isLoggingEnabled(32)) {
                                StackLogger stackLogger7 = logger;
                                stackLogger7.logDebug("forkedId= " + sIPResponse.getForkId() + " forked dialog " + sIPDialog + " original tx " + forkedTransaction2 + " original dialog " + forkedTransaction2.getDefaultDialog());
                            }
                            responseEventExt2.setOriginalTransaction(forkedTransaction2);
                            responseEventExt2.setForkedResponse(true);
                        }
                    }
                }
                if (sIPDialog != null && sIPResponse.getStatusCode() != 100) {
                    sIPDialog.setLastResponse(sIPClientTransaction, sIPResponse);
                    sIPClientTransaction.setDialog(sIPDialog, sIPDialog.getDialogId());
                }
                responseEventExt2.setRetransmission(sIPResponse.isRetransmission());
                responseEventExt2.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
                responseEventExt2.setRemotePort(sIPResponse.getRemotePort());
                provider.handleEvent(responseEventExt2, sIPClientTransaction);
            }
        }
    }

    @Override // android.gov.nist.javax.sip.stack.ServerResponseInterface
    public void processResponse(SIPResponse sIPResponse, MessageChannel messageChannel) {
        String dialogId = sIPResponse.getDialogId(false);
        SIPDialog dialog = this.sipStack.getDialog(dialogId);
        String method = sIPResponse.getCSeq().getMethod();
        if (logger.isLoggingEnabled(32)) {
            StackLogger stackLogger = logger;
            stackLogger.logDebug("PROCESSING INCOMING RESPONSE: " + ((Object) sIPResponse.encodeMessage(new StringBuilder())));
        }
        if (this.sipStack.checkBranchId() && !Utils.getInstance().responseBelongsToUs(sIPResponse)) {
            if (!logger.isLoggingEnabled()) {
                return;
            }
            logger.logError("Detected stray response -- dropping");
            return;
        }
        ListeningPointImpl listeningPointImpl = this.listeningPoint;
        if (listeningPointImpl == null) {
            if (!logger.isLoggingEnabled(32)) {
                return;
            }
            logger.logDebug("Dropping message: No listening point registered!");
            return;
        }
        SipProviderImpl provider = listeningPointImpl.getProvider();
        if (provider == null) {
            if (!logger.isLoggingEnabled(32)) {
                return;
            }
            logger.logDebug("Dropping message:  no provider");
        } else if (provider.getSipListener() == null) {
            if (!logger.isLoggingEnabled(32)) {
                return;
            }
            logger.logDebug("Dropping message:  no sipListener registered!");
        } else {
            SIPClientTransaction sIPClientTransaction = (SIPClientTransaction) this.transactionChannel;
            if (dialog == null && sIPClientTransaction != null && (dialog = sIPClientTransaction.getDialog(dialogId)) != null && dialog.getState() == d.f24329j0) {
                dialog = null;
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("Transaction = " + sIPClientTransaction + " sipDialog = " + dialog);
            }
            SIPTransaction sIPTransaction = this.transactionChannel;
            if (sIPTransaction != null) {
                String fromTag = ((SIPRequest) sIPTransaction.getRequest()).getFromTag();
                if ((fromTag == null) ^ (sIPResponse.getFrom().getTag() == null)) {
                    if (!logger.isLoggingEnabled(32)) {
                        return;
                    }
                    logger.logDebug("From tag mismatch -- dropping response");
                    return;
                } else if (fromTag != null && !fromTag.equalsIgnoreCase(sIPResponse.getFrom().getTag())) {
                    if (!logger.isLoggingEnabled(32)) {
                        return;
                    }
                    logger.logDebug("From tag mismatch -- dropping response");
                    return;
                }
            }
            if (SIPTransactionStack.isDialogCreated(method) && sIPResponse.getStatusCode() != 100 && sIPResponse.getFrom().getTag() != null && sIPResponse.getTo().getTag() != null && dialog == 0) {
                if (!provider.isAutomaticDialogSupportEnabled()) {
                    SIPClientTransaction forkedTransaction = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
                    if (forkedTransaction != null && forkedTransaction.getDefaultDialog() != null) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger3 = logger;
                            stackLogger3.logDebug("Need to create dialog for response = " + sIPResponse);
                        }
                    }
                }
                if (this.transactionChannel == null) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger4 = logger;
                        stackLogger4.logDebug("Creating dialog for forked response " + sIPResponse);
                    }
                    dialog = this.sipStack.createDialog(provider, sIPResponse);
                } else if (dialog == 0) {
                    if (logger.isLoggingEnabled(32)) {
                        StackLogger stackLogger5 = logger;
                        stackLogger5.logDebug("Creating dialog for forked response " + sIPResponse);
                    }
                    dialog = this.sipStack.createDialog((SIPClientTransaction) this.transactionChannel, sIPResponse);
                    this.transactionChannel.setDialog(dialog, sIPResponse.getDialogId(false));
                }
            } else if (dialog != null && sIPClientTransaction == null) {
                d state = dialog.getState();
                d dVar = d.f24329j0;
                if (state != dVar) {
                    if (sIPResponse.getStatusCode() / 100 != 2) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger6 = logger;
                            stackLogger6.logDebug("status code != 200 ; statusCode = " + sIPResponse.getStatusCode());
                        }
                    } else if (dialog.getState() == dVar) {
                        if (logger.isLoggingEnabled(32)) {
                            logger.logDebug("Dialog is terminated -- dropping response!");
                        }
                        if (sIPResponse.getStatusCode() / 100 != 2 || !sIPResponse.getCSeq().getMethod().equals(TokenNames.INVITE)) {
                            return;
                        }
                        try {
                            dialog.sendAck(dialog.createAck(sIPResponse.getCSeq().getSeqNumber()));
                            return;
                        } catch (Exception e10) {
                            logger.logError("Error creating ack", e10);
                            return;
                        }
                    } else if (dialog.isAckSent() && dialog.isLastAckPresent() && dialog.getLastAckSentCSeq().getSeqNumber() == sIPResponse.getCSeq().getSeqNumber() && sIPResponse.getDialogId(false).equals(dialog.getLastAckSentDialogId()) && sIPResponse.getCSeq().getMethod().equals(dialog.getMethod())) {
                        try {
                            if (logger.isLoggingEnabled(32)) {
                                logger.logDebug("resending ACK");
                            }
                            dialog.resendAck();
                            return;
                        } catch (n unused) {
                        }
                    }
                }
            }
            if (logger.isLoggingEnabled(32)) {
                StackLogger stackLogger7 = logger;
                stackLogger7.logDebug("sending response " + sIPResponse.toString() + " to TU for processing ");
            }
            ResponseEventExt responseEventExt = new ResponseEventExt(provider, sIPClientTransaction, dialog, sIPResponse);
            responseEventExt.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
            responseEventExt.setRemotePort(sIPResponse.getRemotePort());
            if (this.sipStack.getMaxForkTime() != 0 && SIPTransactionStack.isDialogCreated(sIPResponse.getCSeqHeader().getMethod())) {
                SIPClientTransaction forkedTransaction2 = this.sipStack.getForkedTransaction(sIPResponse.getForkId());
                if (dialog != 0 && forkedTransaction2 != null) {
                    dialog.checkRetransmissionForForking(sIPResponse);
                    if (forkedTransaction2.getDefaultDialog() != null && !dialog.equals(forkedTransaction2.getDefaultDialog())) {
                        if (logger.isLoggingEnabled(32)) {
                            StackLogger stackLogger8 = logger;
                            stackLogger8.logDebug("forkedId= " + sIPResponse.getForkId() + " forked dialog " + dialog + " original tx " + forkedTransaction2 + " original dialog " + forkedTransaction2.getDefaultDialog());
                        }
                        responseEventExt.setOriginalTransaction(forkedTransaction2);
                        responseEventExt.setForkedResponse(true);
                    }
                }
            }
            if (dialog != null && sIPResponse.getStatusCode() != 100 && sIPResponse.getTo().getTag() != null) {
                dialog.setLastResponse(sIPClientTransaction, sIPResponse);
            }
            responseEventExt.setRetransmission(sIPResponse.isRetransmission());
            responseEventExt.setRemoteIpAddress(sIPResponse.getRemoteAddress().getHostAddress());
            provider.handleEvent(responseEventExt, sIPClientTransaction);
        }
    }
}
