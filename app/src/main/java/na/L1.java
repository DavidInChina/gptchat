package na;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class L1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f39826a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC4797v0 f39827b;

    public L1(int i10, EnumC4797v0 enumC4797v0) {
        AbstractC3557B.c0("scrollState", enumC4797v0);
        this.f39826a = i10;
        this.f39827b = enumC4797v0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L1)) {
            return false;
        }
        L1 l12 = (L1) obj;
        if (this.f39826a == l12.f39826a && this.f39827b == l12.f39827b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f39827b.hashCode() + (this.f39826a * 31);
    }

    public final String toString() {
        return "InitialScrollState(itemCount=" + this.f39826a + ", scrollState=" + this.f39827b + Separators.RPAREN;
    }
}
