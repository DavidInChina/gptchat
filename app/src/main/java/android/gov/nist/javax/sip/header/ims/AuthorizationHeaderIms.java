package android.gov.nist.javax.sip.header.ims;

import b.AbstractC2096f;
import c.AbstractC2253h;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface AuthorizationHeaderIms extends AbstractC2253h {
    public static final String NO = "no";
    public static final String YES = "yes";

    @Override // c.AbstractC2268x
    /* synthetic */ Object clone();

    /* synthetic */ String getAlgorithm();

    @Override // c.AbstractC2253h
    /* synthetic */ String getCNonce();

    String getIntegrityProtected();

    /* synthetic */ String getName();

    @Override // c.AbstractC2253h
    /* synthetic */ String getNonce();

    /* synthetic */ int getNonceCount();

    /* synthetic */ String getOpaque();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    /* synthetic */ String getQop();

    @Override // c.AbstractC2253h
    /* synthetic */ String getRealm();

    @Override // c.AbstractC2253h
    /* synthetic */ String getResponse();

    /* synthetic */ String getScheme();

    @Override // c.AbstractC2253h
    /* synthetic */ AbstractC2096f getURI();

    @Override // c.AbstractC2253h
    /* synthetic */ String getUsername();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    @Override // c.AbstractC2253h
    /* synthetic */ void setAlgorithm(String str);

    @Override // c.AbstractC2253h
    /* synthetic */ void setCNonce(String str);

    void setIntegrityProtected(String str);

    @Override // c.AbstractC2253h
    /* synthetic */ void setNonce(String str);

    @Override // c.AbstractC2253h
    /* synthetic */ void setNonceCount(int i10);

    @Override // c.AbstractC2253h
    /* synthetic */ void setOpaque(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    @Override // c.AbstractC2253h
    /* synthetic */ void setQop(String str);

    @Override // c.AbstractC2253h
    /* synthetic */ void setRealm(String str);

    @Override // c.AbstractC2253h
    /* synthetic */ void setResponse(String str);

    /* synthetic */ void setScheme(String str);

    /* synthetic */ void setURI(AbstractC2096f abstractC2096f);

    @Override // c.AbstractC2253h
    /* synthetic */ void setUsername(String str);
}
