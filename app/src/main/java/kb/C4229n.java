package kb;

import android.gov.nist.core.Separators;

/* renamed from: kb.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4229n implements AbstractC4232q {

    /* renamed from: a  reason: collision with root package name */
    public final int f37262a;

    public C4229n(int i10) {
        this.f37262a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4229n) && this.f37262a == ((C4229n) obj).f37262a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f37262a;
    }

    public final String toString() {
        return android.gov.nist.core.a.l(new StringBuilder("PageIndexUpdate(index="), this.f37262a, Separators.RPAREN);
    }
}
