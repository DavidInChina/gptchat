package I9;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: I9.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772n0 implements AbstractC0778q0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8420a;

    public C0772n0(String str) {
        AbstractC3557B.c0("gizmoId", str);
        this.f8420a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0772n0)) {
            return false;
        }
        if (AbstractC3557B.K(this.f8420a, ((C0772n0) obj).f8420a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8420a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("NavigateToGizmoConversation(gizmoId=", wd.O.a(this.f8420a), Separators.RPAREN);
    }
}
