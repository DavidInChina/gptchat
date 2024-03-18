package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a  reason: collision with root package name */
    public final C6316m1 f49114a;

    public V0(C6316m1 c6316m1) {
        this.f49114a = c6316m1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof V0) && AbstractC3557B.K(this.f49114a, ((V0) obj).f49114a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C6316m1 c6316m1 = this.f49114a;
        if (c6316m1 == null) {
            return 0;
        }
        return c6316m1.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f49114a + Separators.RPAREN;
    }
}
