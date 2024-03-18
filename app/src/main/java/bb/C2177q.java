package bb;

import android.gov.nist.core.Separators;
import cb.C2337F;
import id.AbstractC3557B;

/* renamed from: bb.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177q implements Ad.s {

    /* renamed from: a  reason: collision with root package name */
    public final String f25888a;

    /* renamed from: b  reason: collision with root package name */
    public final C2337F f25889b;

    public C2177q(String str, C2337F c2337f) {
        this.f25888a = str;
        this.f25889b = c2337f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2177q)) {
            return false;
        }
        C2177q c2177q = (C2177q) obj;
        if (AbstractC3557B.K(this.f25888a, c2177q.f25888a) && AbstractC3557B.K(this.f25889b, c2177q.f25889b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f25888a.hashCode() * 31;
        C2337F c2337f = this.f25889b;
        if (c2337f == null) {
            i10 = 0;
        } else {
            i10 = c2337f.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        String a5 = wd.O.a(this.f25888a);
        return "GizmoPreviewState(gizmoId=" + a5 + ", about=" + this.f25889b + Separators.RPAREN;
    }
}
