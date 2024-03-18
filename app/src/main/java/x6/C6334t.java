package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: x6.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6334t {

    /* renamed from: a  reason: collision with root package name */
    public final F f49438a;

    public C6334t(F f6) {
        this.f49438a = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6334t) && AbstractC3557B.K(this.f49438a, ((C6334t) obj).f49438a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        F f6 = this.f49438a;
        if (f6 == null) {
            return 0;
        }
        return f6.hashCode();
    }

    public final String toString() {
        return "Display(viewport=" + this.f49438a + Separators.RPAREN;
    }
}
