package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class r {
    public static final C1867q Companion = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer[] f23600e = {null, new C2695d(C1842d0.f23549a, 0), new C2695d(D.f23445d, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final C1863o f23601a;

    /* renamed from: b  reason: collision with root package name */
    public final List f23602b;

    /* renamed from: c  reason: collision with root package name */
    public final List f23603c;

    /* renamed from: d  reason: collision with root package name */
    public final G f23604d;

    public r(int i10, C1863o c1863o, List list, List list2, G g10) {
        if (1 == (i10 & 1)) {
            this.f23601a = c1863o;
            if ((i10 & 2) == 0) {
                this.f23602b = kf.v.f37483Y;
            } else {
                this.f23602b = list;
            }
            if ((i10 & 4) == 0) {
                this.f23603c = null;
            } else {
                this.f23603c = list2;
            }
            if ((i10 & 8) == 0) {
                this.f23604d = null;
                return;
            } else {
                this.f23604d = g10;
                return;
            }
        }
        R4.b.e2(i10, 1, C1865p.f23596b);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3557B.K(this.f23601a, rVar.f23601a) && AbstractC3557B.K(this.f23602b, rVar.f23602b) && AbstractC3557B.K(this.f23603c, rVar.f23603c) && AbstractC3557B.K(this.f23604d, rVar.f23604d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f23602b, this.f23601a.hashCode() * 31, 31);
        int i11 = 0;
        List list = this.f23603c;
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.hashCode();
        }
        int i12 = (s10 + i10) * 31;
        G g10 = this.f23604d;
        if (g10 != null) {
            i11 = g10.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "ApiGizmoAbout(gizmo=" + this.f23601a + ", tools=" + this.f23602b + ", aboutBlocks=" + this.f23603c + ", reviewStats=" + this.f23604d + Separators.RPAREN;
    }
}
