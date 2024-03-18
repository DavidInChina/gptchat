package Rb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: Rb.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274u implements AbstractC1279z {

    /* renamed from: a  reason: collision with root package name */
    public final C1272s f15372a;

    public C1274u(C1272s c1272s) {
        AbstractC3557B.c0("contentId", c1272s);
        this.f15372a = c1272s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1274u) && AbstractC3557B.K(this.f15372a, ((C1274u) obj).f15372a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15372a.hashCode();
    }

    public final String toString() {
        return "LoadReasons(contentId=" + this.f15372a + Separators.RPAREN;
    }
}
