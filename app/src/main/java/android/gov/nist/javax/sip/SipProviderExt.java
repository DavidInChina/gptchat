package android.gov.nist.javax.sip;

import android.javax.sip.a;
import android.javax.sip.b;
import android.javax.sip.h;
import android.javax.sip.m;
import android.javax.sip.p;
import android.javax.sip.q;
import android.javax.sip.r;
import android.javax.sip.u;
import c.AbstractC2255j;
import d.AbstractC2561b;
import d.AbstractC2562c;

/* loaded from: classes.dex */
public interface SipProviderExt extends q {
    /* synthetic */ void addListeningPoint(h hVar);

    /* synthetic */ void addSipListener(p pVar);

    /* synthetic */ h getListeningPoint();

    /* synthetic */ h getListeningPoint(String str);

    /* synthetic */ h[] getListeningPoints();

    /* synthetic */ AbstractC2255j getNewCallId();

    @Override // android.javax.sip.q
    /* synthetic */ a getNewClientTransaction(AbstractC2561b abstractC2561b);

    /* synthetic */ b getNewDialog(u uVar);

    /* synthetic */ m getNewServerTransaction(AbstractC2561b abstractC2561b);

    /* synthetic */ r getSipStack();

    /* synthetic */ void removeListeningPoint(h hVar);

    /* synthetic */ void removeSipListener(p pVar);

    /* synthetic */ void sendRequest(AbstractC2561b abstractC2561b);

    /* synthetic */ void sendResponse(AbstractC2562c abstractC2562c);

    /* synthetic */ void setAutomaticDialogSupportEnabled(boolean z10);

    void setDialogErrorsAutomaticallyHandled();

    /* synthetic */ void setListeningPoint(h hVar);
}
