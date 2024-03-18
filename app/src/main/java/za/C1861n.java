package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: Za.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1861n {
    public static final C1859m Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f23581a;

    public C1861n(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f23581a = str;
        } else {
            R4.b.e2(i10, 1, C1857l.f23574b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1861n) && AbstractC3557B.K(this.f23581a, ((C1861n) obj).f23581a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23581a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return R.a.t(new StringBuilder("VanityMetrics(numConversationsStr="), this.f23581a, Separators.RPAREN);
    }
}
