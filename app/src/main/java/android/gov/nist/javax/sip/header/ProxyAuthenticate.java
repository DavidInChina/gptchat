package android.gov.nist.javax.sip.header;

import b.AbstractC2096f;
import c.AbstractC2238J;

/* loaded from: classes.dex */
public class ProxyAuthenticate extends AuthenticationHeader implements AbstractC2238J {
    private static final long serialVersionUID = 3826145955463251116L;

    public ProxyAuthenticate() {
        super(SIPHeaderNames.PROXY_AUTHENTICATE);
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public AbstractC2096f getURI() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public void setURI(AbstractC2096f abstractC2096f) {
    }
}
