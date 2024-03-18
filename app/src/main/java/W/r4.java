package W;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import l0.AbstractC4311c;
import l0.C4314f;

/* loaded from: classes2.dex */
public final class r4 implements M1 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4311c f20392a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20393b = 0;

    public r4(C4314f c4314f) {
        this.f20392a = c4314f;
    }

    @Override // W.M1
    public final int a(Z0.j jVar, long j6, int i10, Z0.l lVar) {
        int i11 = (int) (j6 >> 32);
        int i12 = this.f20393b;
        if (i10 >= i11 - (i12 * 2)) {
            float f6 = (i11 - i10) / 2.0f;
            float f10 = 0.0f;
            if (lVar != Z0.l.f22805Y) {
                f10 = 0.0f * (-1);
            }
            return R.a.m(1, f10, f6);
        }
        return com.google.android.gms.internal.play_billing.N.p(this.f20392a.a(i10, i11, lVar), i12, (i11 - i12) - i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        if (AbstractC3557B.K(this.f20392a, r4Var.f20392a) && this.f20393b == r4Var.f20393b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20392a.hashCode() * 31) + this.f20393b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Horizontal(alignment=");
        sb2.append(this.f20392a);
        sb2.append(", margin=");
        return AbstractC2469q0.j(sb2, this.f20393b, ')');
    }
}
