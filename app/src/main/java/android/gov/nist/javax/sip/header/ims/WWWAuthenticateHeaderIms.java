package android.gov.nist.javax.sip.header.ims;

import b.AbstractC2096f;
import c.h0;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface WWWAuthenticateHeaderIms extends h0 {
    public static final String CK = "ck";
    public static final String IK = "ik";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    @Override // c.h0
    /* synthetic */ String getAlgorithm();

    String getCK();

    /* synthetic */ String getDomain();

    String getIK();

    /* synthetic */ String getName();

    @Override // c.h0
    /* synthetic */ String getNonce();

    @Override // c.h0
    /* synthetic */ String getOpaque();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // c.h0
    /* synthetic */ String getQop();

    @Override // c.h0
    /* synthetic */ String getRealm();

    @Override // c.h0
    /* synthetic */ String getScheme();

    /* synthetic */ AbstractC2096f getURI();

    /* synthetic */ boolean isStale();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void setAlgorithm(String str);

    void setCK(String str);

    /* synthetic */ void setDomain(String str);

    void setIK(String str);

    /* synthetic */ void setNonce(String str);

    /* synthetic */ void setOpaque(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    /* synthetic */ void setQop(String str);

    /* synthetic */ void setRealm(String str);

    /* synthetic */ void setScheme(String str);

    /* synthetic */ void setStale(boolean z10);

    /* synthetic */ void setURI(AbstractC2096f abstractC2096f);
}
