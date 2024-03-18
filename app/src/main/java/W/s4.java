package W;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import l0.AbstractC4312d;
import l0.C4317i;

/* loaded from: classes2.dex */
public final class s4 implements N1 {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4312d f20412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20413b;

    public s4(C4317i c4317i, int i10) {
        this.f20412a = c4317i;
        this.f20413b = i10;
    }

    @Override // W.N1
    public final int a(Z0.j jVar, long j6, int i10) {
        int i11 = (int) (j6 & 4294967295L);
        int i12 = this.f20413b;
        if (i10 >= i11 - (i12 * 2)) {
            return R.a.m(1, 0.0f, (i11 - i10) / 2.0f);
        }
        return com.google.android.gms.internal.play_billing.N.p(((C4317i) this.f20412a).a(i10, i11), i12, (i11 - i12) - i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        if (AbstractC3557B.K(this.f20412a, s4Var.f20412a) && this.f20413b == s4Var.f20413b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f20412a.hashCode() * 31) + this.f20413b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f20412a);
        sb2.append(", margin=");
        return AbstractC2469q0.j(sb2, this.f20413b, ')');
    }
}
