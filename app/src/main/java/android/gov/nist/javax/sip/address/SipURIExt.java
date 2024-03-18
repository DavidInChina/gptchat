package android.gov.nist.javax.sip.address;

import b.AbstractC2094d;
import java.util.Iterator;

/* loaded from: classes2.dex */
public interface SipURIExt extends AbstractC2094d {
    @Override // b.AbstractC2096f
    /* synthetic */ Object clone();

    @Override // b.AbstractC2094d
    /* synthetic */ String getHeader(String str);

    @Override // b.AbstractC2094d
    /* synthetic */ Iterator getHeaderNames();

    @Override // b.AbstractC2094d
    /* synthetic */ String getHost();

    @Override // b.AbstractC2094d
    /* synthetic */ String getMAddrParam();

    @Override // b.AbstractC2094d
    /* synthetic */ String getMethodParam();

    @Override // c.AbstractC2236H
    /* synthetic */ String getParameter(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ Iterator getParameterNames();

    @Override // b.AbstractC2094d
    /* synthetic */ int getPort();

    @Override // b.AbstractC2096f
    /* synthetic */ String getScheme();

    @Override // b.AbstractC2094d
    /* synthetic */ int getTTLParam();

    @Override // b.AbstractC2094d
    /* synthetic */ String getTransportParam();

    @Override // b.AbstractC2094d
    /* synthetic */ String getUser();

    @Override // b.AbstractC2094d
    /* synthetic */ String getUserParam();

    @Override // b.AbstractC2094d
    /* synthetic */ String getUserPassword();

    boolean hasGrParam();

    @Override // b.AbstractC2094d
    boolean hasLrParam();

    @Override // b.AbstractC2094d
    /* synthetic */ boolean isSecure();

    @Override // b.AbstractC2096f
    /* synthetic */ boolean isSipURI();

    void removeHeader(String str);

    void removeHeaders();

    @Override // c.AbstractC2236H
    /* synthetic */ void removeParameter(String str);

    /* synthetic */ void removePort();

    void setGrParam(String str);

    /* synthetic */ void setHeader(String str, String str2);

    @Override // b.AbstractC2094d
    /* synthetic */ void setHost(String str);

    void setLrParam();

    @Override // b.AbstractC2094d
    /* synthetic */ void setMAddrParam(String str);

    /* synthetic */ void setMethodParam(String str);

    @Override // c.AbstractC2236H
    /* synthetic */ void setParameter(String str, String str2);

    @Override // b.AbstractC2094d
    /* synthetic */ void setPort(int i10);

    @Override // b.AbstractC2094d
    /* synthetic */ void setSecure(boolean z10);

    /* synthetic */ void setTTLParam(int i10);

    @Override // b.AbstractC2094d
    /* synthetic */ void setTransportParam(String str);

    @Override // b.AbstractC2094d
    /* synthetic */ void setUser(String str);

    /* synthetic */ void setUserParam(String str);

    /* synthetic */ void setUserPassword(String str);
}
