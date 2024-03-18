package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.ims.WWWAuthenticateHeaderIms;
import b.AbstractC2096f;
import c.h0;

/* loaded from: classes.dex */
public class WWWAuthenticate extends AuthenticationHeader implements h0, WWWAuthenticateHeaderIms {
    private static final long serialVersionUID = 115378648697363486L;

    public WWWAuthenticate() {
        super(SIPHeaderNames.WWW_AUTHENTICATE);
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public AbstractC2096f getURI() {
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.AuthenticationHeader
    public void setURI(AbstractC2096f abstractC2096f) {
    }
}
