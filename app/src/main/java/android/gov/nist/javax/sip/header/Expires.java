package android.gov.nist.javax.sip.header;

import android.gov.nist.core.a;
import android.javax.sip.g;
import c.AbstractC2265u;

/* loaded from: classes2.dex */
public class Expires extends SIPHeader implements AbstractC2265u {
    private static final long serialVersionUID = 3134344915465784267L;
    protected int expires;

    public Expires() {
        super(SIPHeaderNames.EXPIRES);
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    public int getExpires() {
        return this.expires;
    }

    public void setExpires(int i10) {
        if (i10 >= 0) {
            this.expires = i10;
            return;
        }
        throw new g(a.e("bad argument ", i10));
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.expires);
        return sb2;
    }
}
