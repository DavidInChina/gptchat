package sb;

import android.gov.nist.core.Separators;
import gb.C3235l;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class p implements t {

    /* renamed from: a  reason: collision with root package name */
    public final C3235l f45517a;

    public p(C3235l c3235l) {
        AbstractC3557B.c0("data", c3235l);
        this.f45517a = c3235l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && AbstractC3557B.K(this.f45517a, ((p) obj).f45517a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45517a.hashCode();
    }

    public final String toString() {
        return "ImageThumbsDown(data=" + this.f45517a + Separators.RPAREN;
    }
}
