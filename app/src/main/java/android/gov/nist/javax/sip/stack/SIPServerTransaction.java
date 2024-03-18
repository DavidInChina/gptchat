package android.gov.nist.javax.sip.stack;

import android.gov.nist.javax.sip.ServerTransactionExt;
import android.gov.nist.javax.sip.message.SIPMessage;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.b;
import android.javax.sip.m;
import android.javax.sip.v;
import d.AbstractC2562c;

/* loaded from: classes2.dex */
public interface SIPServerTransaction extends SIPTransaction, m, ServerTransactionExt, ServerRequestInterface {
    public static final String CONTENT_SUBTYPE_SDP = "sdp";
    public static final String CONTENT_TYPE_APPLICATION = "application";

    boolean ackSeen();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void cleanUp();

    void disableRetransmissionAlerts();

    @Override // android.gov.nist.javax.sip.ServerTransactionExt
    void enableRetransmissionAlerts();

    boolean equals(Object obj);

    @Override // android.gov.nist.javax.sip.ServerTransactionExt
    SIPServerTransaction getCanceledInviteTransaction();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    b getDialog();

    int getLastResponseStatusCode();

    long getPendingReliableCSeqNumber();

    long getPendingReliableRSeqNumber();

    String getPendingReliableResponseMethod();

    byte[] getReliableProvisionalResponse();

    MessageChannel getResponseChannel();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    v getState();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    String getViaHost();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    int getViaPort();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    boolean isMessagePartOfTransaction(SIPMessage sIPMessage);

    boolean isRetransmissionAlertEnabled();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    boolean isTransactionMapped();

    void map();

    boolean prackRecieved();

    @Override // android.gov.nist.javax.sip.stack.ServerRequestInterface
    void processRequest(SIPRequest sIPRequest, MessageChannel messageChannel);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void releaseSem();

    void resendLastResponseAsBytes();

    void scheduleAckRemoval();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void sendMessage(SIPMessage sIPMessage);

    void sendReliableProvisionalResponse(AbstractC2562c abstractC2562c);

    @Override // android.gov.nist.javax.sip.ServerTransactionExt
    void sendResponse(AbstractC2562c abstractC2562c);

    void setAckSeen();

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setDialog(SIPDialog sIPDialog, String str);

    void setInviteTransaction(SIPServerTransaction sIPServerTransaction);

    void setMapped(boolean z10);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setOriginalRequest(SIPRequest sIPRequest);

    void setPendingSubscribe(SIPClientTransaction sIPClientTransaction);

    void setRequestInterface(ServerRequestInterface serverRequestInterface);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setState(int i10);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction
    void setTransactionMapped(boolean z10);

    @Override // android.gov.nist.javax.sip.stack.SIPTransaction, android.gov.nist.javax.sip.TransactionExt
    void terminate();

    void waitForTermination();
}
