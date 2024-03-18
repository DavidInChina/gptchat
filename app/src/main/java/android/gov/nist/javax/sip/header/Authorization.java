package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import c.AbstractC2253h;

/* loaded from: classes2.dex */
public class Authorization extends AuthenticationHeader implements AbstractC2253h, AuthorizationHeaderIms {
    private static final long serialVersionUID = -8897770321892281348L;

    public Authorization() {
        super(SIPHeaderNames.AUTHORIZATION);
    }
}
