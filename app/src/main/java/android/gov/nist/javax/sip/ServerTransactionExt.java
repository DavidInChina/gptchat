package android.gov.nist.javax.sip;

import android.javax.sip.b;
import android.javax.sip.m;
import android.javax.sip.v;
import d.AbstractC2561b;
import d.AbstractC2562c;

/* loaded from: classes.dex */
public interface ServerTransactionExt extends m, TransactionExt {
    /* synthetic */ void enableRetransmissionAlerts();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ Object getApplicationData();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ String getBranchId();

    m getCanceledInviteTransaction();

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ b getDialog();

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ AbstractC2561b getRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ int getRetransmitTimer();

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ v getState();

    /* synthetic */ void sendResponse(AbstractC2562c abstractC2562c);

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setApplicationData(Object obj);

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setRetransmitTimer(int i10);

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void terminate();
}
