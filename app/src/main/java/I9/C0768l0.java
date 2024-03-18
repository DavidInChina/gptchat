package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: I9.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768l0 implements AbstractC0778q0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8410a;

    public C0768l0(String str) {
        this.f8410a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0768l0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f8410a, ((C0768l0) obj).f8410a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8410a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateTo(route=", AbstractC3557B.F2(this.f8410a), Separators.RPAREN);
    }
}
