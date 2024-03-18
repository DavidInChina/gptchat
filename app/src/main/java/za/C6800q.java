package za;

import android.gov.nist.core.Separators;
import cb.C2334C;
import id.AbstractC3557B;

/* renamed from: za.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6800q implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final C2334C f51798a;

    public C6800q(C2334C c2334c) {
        this.f51798a = c2334c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6800q) && AbstractC3557B.K(this.f51798a, ((C6800q) obj).f51798a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C2334C c2334c = this.f51798a;
        if (c2334c == null) {
            return 0;
        }
        return c2334c.hashCode();
    }

    public final String toString() {
        return "GizmoSelected(gizmo=" + this.f51798a + Separators.RPAREN;
    }
}
