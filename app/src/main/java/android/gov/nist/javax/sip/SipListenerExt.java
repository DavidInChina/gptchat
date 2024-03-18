package android.gov.nist.javax.sip;

import android.javax.sip.e;
import android.javax.sip.f;
import android.javax.sip.k;
import android.javax.sip.l;
import android.javax.sip.p;
import android.javax.sip.t;
import android.javax.sip.w;

/* loaded from: classes2.dex */
public interface SipListenerExt extends p {
    @Override // android.javax.sip.p
    /* synthetic */ void processDialogTerminated(e eVar);

    void processDialogTimeout(DialogTimeoutEvent dialogTimeoutEvent);

    @Override // android.javax.sip.p
    /* synthetic */ void processIOException(f fVar);

    @Override // android.javax.sip.p
    /* synthetic */ void processRequest(k kVar);

    @Override // android.javax.sip.p
    /* synthetic */ void processResponse(l lVar);

    @Override // android.javax.sip.p
    /* synthetic */ void processTimeout(t tVar);

    @Override // android.javax.sip.p
    /* synthetic */ void processTransactionTerminated(w wVar);
}
