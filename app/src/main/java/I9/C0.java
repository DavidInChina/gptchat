package I9;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class C0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f8155a;

    public C0(C2334C c2334c) {
        AbstractC3557B.c0("gizmo", c2334c);
        this.f8155a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0) && AbstractC3557B.K(this.f8155a, ((C0) obj).f8155a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8155a.hashCode();
    }

    public final String toString() {
        return "PinGizmo(gizmo=" + this.f8155a + Separators.RPAREN;
    }
}
