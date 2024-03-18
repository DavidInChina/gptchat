package fa;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* loaded from: classes.dex */
public final class t extends AbstractC2965B {
    public static final s Companion = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final String f30079b;

    public t(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f30079b = str;
        } else {
            R4.b.e2(i10, 1, r.f30078b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && AbstractC3557B.K(this.f30079b, ((t) obj).f30079b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f30079b.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("PlainText(content="), this.f30079b, Separators.RPAREN);
    }

    public t(String str) {
        AbstractC3557B.c0("content", str);
        this.f30079b = str;
    }
}
