package android.gov.nist.javax.sip.header;

import android.gov.nist.core.a;
import android.javax.sip.g;
import c.AbstractC2233E;

/* loaded from: classes2.dex */
public class MinExpires extends SIPHeader implements AbstractC2233E {
    private static final long serialVersionUID = 7001828209606095801L;
    protected int expires;

    public MinExpires() {
        super(SIPHeaderNames.MIN_EXPIRES);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(Integer.toString(this.expires));
        return sb2;
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
}
