package android.gov.nist.javax.sip;

import android.javax.sip.h;
import c.AbstractC2257l;
import c.g0;

/* loaded from: classes2.dex */
public interface ListeningPointExt extends h {
    public static final String WS = "WS";
    public static final String WSS = "WSS";

    AbstractC2257l createContactHeader();

    g0 createViaHeader();

    @Override // android.javax.sip.h
    /* synthetic */ String getIPAddress();

    @Override // android.javax.sip.h
    /* synthetic */ int getPort();

    /* synthetic */ String getSentBy();

    @Override // android.javax.sip.h
    /* synthetic */ String getTransport();

    void sendHeartbeat(String str, int i10);

    /* synthetic */ void setSentBy(String str);
}
