package Za;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import cb.C2334C;
import dh.C2695d;
import id.AbstractC3557B;
import java.util.List;
import k6.AbstractC4194d;
import kotlinx.serialization.KSerializer;

@AbstractC1998i
/* loaded from: classes2.dex */
public final class Z {
    public static final Y Companion = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final KSerializer[] f23530d = {null, new C2695d(C1842d0.f23549a, 0), null};

    /* renamed from: a  reason: collision with root package name */
    public final C1863o f23531a;

    /* renamed from: b  reason: collision with root package name */
    public final List f23532b;

    /* renamed from: c  reason: collision with root package name */
    public final Rc.o f23533c;

    public Z(int i10, C1863o c1863o, List list, Rc.o oVar) {
        if (3 == (i10 & 3)) {
            this.f23531a = c1863o;
            this.f23532b = list;
            if ((i10 & 4) == 0) {
                this.f23533c = null;
                return;
            } else {
                this.f23533c = oVar;
                return;
            }
        }
        R4.b.e2(i10, 3, X.f23529b);
        throw null;
    }

    public final C2334C a() {
        return this.f23531a.a(this.f23532b, this.f23533c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z10 = (Z) obj;
        if (AbstractC3557B.K(this.f23531a, z10.f23531a) && AbstractC3557B.K(this.f23532b, z10.f23532b) && AbstractC3557B.K(this.f23533c, z10.f23533c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int s10 = AbstractC4194d.s(this.f23532b, this.f23531a.hashCode() * 31, 31);
        Rc.o oVar = this.f23533c;
        if (oVar == null) {
            i10 = 0;
        } else {
            i10 = oVar.hashCode();
        }
        return s10 + i10;
    }

    public final String toString() {
        return "ApiGizmoResource(gizmo=" + this.f23531a + ", tools=" + this.f23532b + ", productFeatures=" + this.f23533c + Separators.RPAREN;
    }
}
