package za;

import android.gov.nist.core.Separators;
import cb.C2364e;
import id.AbstractC3557B;

/* renamed from: za.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6799p implements AbstractC6806w {

    /* renamed from: a  reason: collision with root package name */
    public final C2364e f51797a;

    public C6799p(C2364e c2364e) {
        this.f51797a = c2364e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C6799p) && AbstractC3557B.K(this.f51797a, ((C6799p) obj).f51797a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        C2364e c2364e = this.f51797a;
        if (c2364e == null) {
            return 0;
        }
        return c2364e.hashCode();
    }

    public final String toString() {
        return "GizmoCommandSelected(command=" + this.f51797a + Separators.RPAREN;
    }
}
