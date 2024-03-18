package android.gov.nist.javax.sip;

import android.javax.sip.a;
import android.javax.sip.b;
import android.javax.sip.v;
import b.AbstractC2092b;
import d.AbstractC2561b;

/* loaded from: classes.dex */
public interface ClientTransactionExt extends a, TransactionExt {
    void alertIfStillInCallingStateBy(int i10);

    /* synthetic */ AbstractC2561b createAck();

    /* synthetic */ AbstractC2561b createCancel();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ Object getApplicationData();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ String getBranchId();

    b getDefaultDialog();

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ b getDialog();

    AbstractC2092b getNextHop();

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ AbstractC2561b getRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ int getRetransmitTimer();

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ v getState();

    boolean isSecure();

    /* synthetic */ void sendRequest();

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setApplicationData(Object obj);

    void setNotifyOnRetransmit(boolean z10);

    @Override // android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void setRetransmitTimer(int i10);

    @Override // android.javax.sip.u, android.gov.nist.javax.sip.TransactionExt
    /* synthetic */ void terminate();
}
