package I9;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* renamed from: I9.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787v0 implements I0 {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f8459a;

    public C0787v0(C2334C c2334c) {
        AbstractC3557B.c0("gizmo", c2334c);
        this.f8459a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0787v0) && AbstractC3557B.K(this.f8459a, ((C0787v0) obj).f8459a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8459a.hashCode();
    }

    public final String toString() {
        return "ClickGizmo(gizmo=" + this.f8459a + Separators.RPAREN;
    }
}
