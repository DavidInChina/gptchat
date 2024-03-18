package android.gov.nist.javax.sip.header;

import android.gov.nist.core.a;
import android.javax.sip.g;
import android.javax.sip.n;
import c.AbstractC2230B;

/* loaded from: classes.dex */
public class MaxForwards extends SIPHeader implements AbstractC2230B {
    private static final long serialVersionUID = -3096874323347175943L;
    protected int maxForwards;

    public MaxForwards() {
        super(SIPHeaderNames.MAX_FORWARDS);
    }

    public void decrementMaxForwards() {
        int i10 = this.maxForwards;
        if (i10 > 0) {
            this.maxForwards = i10 - 1;
            return;
        }
        throw new n("has already reached 0!");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbstractC2230B) && getMaxForwards() == ((AbstractC2230B) obj).getMaxForwards()) {
            return true;
        }
        return false;
    }

    @Override // c.AbstractC2230B
    public int getMaxForwards() {
        return this.maxForwards;
    }

    public boolean hasReachedZero() {
        if (this.maxForwards == 0) {
            return true;
        }
        return false;
    }

    public void setMaxForwards(int i10) {
        if (i10 >= 0 && i10 <= 255) {
            this.maxForwards = i10;
            return;
        }
        throw new g(a.e("bad max forwards value ", i10));
    }

    public MaxForwards(int i10) {
        super(SIPHeaderNames.MAX_FORWARDS);
        setMaxForwards(i10);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb2) {
        sb2.append(this.maxForwards);
        return sb2;
    }
}
