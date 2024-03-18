package android.gov.nist.javax.sip;

import android.javax.sip.a;
import android.javax.sip.b;
import android.javax.sip.d;
import android.javax.sip.q;
import android.javax.sip.u;
import b.AbstractC2091a;
import c.AbstractC2255j;
import d.AbstractC2561b;
import d.AbstractC2562c;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface DialogExt extends b {
    /* synthetic */ AbstractC2561b createAck(long j6);

    /* synthetic */ AbstractC2561b createPrack(AbstractC2562c abstractC2562c);

    /* synthetic */ AbstractC2562c createReliableProvisionalResponse(int i10);

    @Override // android.javax.sip.b
    /* synthetic */ AbstractC2561b createRequest(String str);

    /* synthetic */ void delete();

    void disableSequenceNumberValidation();

    /* synthetic */ Object getApplicationData();

    /* synthetic */ AbstractC2255j getCallId();

    /* synthetic */ String getDialogId();

    /* synthetic */ u getFirstTransaction();

    /* synthetic */ AbstractC2091a getLocalParty();

    /* synthetic */ long getLocalSeqNumber();

    /* synthetic */ int getLocalSequenceNumber();

    /* synthetic */ String getLocalTag();

    b getOriginalDialog();

    ReleaseReferencesStrategy getReleaseReferencesStrategy();

    /* synthetic */ AbstractC2091a getRemoteParty();

    /* synthetic */ long getRemoteSeqNumber();

    /* synthetic */ int getRemoteSequenceNumber();

    /* synthetic */ String getRemoteTag();

    /* synthetic */ AbstractC2091a getRemoteTarget();

    /* synthetic */ Iterator getRouteSet();

    q getSipProvider();

    @Override // android.javax.sip.b
    /* synthetic */ d getState();

    /* synthetic */ void incrementLocalSequenceNumber();

    boolean isForked();

    /* synthetic */ boolean isSecure();

    /* synthetic */ boolean isServer();

    /* synthetic */ void sendAck(AbstractC2561b abstractC2561b);

    /* synthetic */ void sendReliableProvisionalResponse(AbstractC2562c abstractC2562c);

    /* synthetic */ void sendRequest(a aVar);

    /* synthetic */ void setApplicationData(Object obj);

    void setBackToBackUserAgent();

    void setEarlyDialogTimeoutSeconds(int i10);

    void setReleaseReferencesStrategy(ReleaseReferencesStrategy releaseReferencesStrategy);

    /* synthetic */ void terminateOnBye(boolean z10);
}
