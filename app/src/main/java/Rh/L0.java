package Rh;

import java.util.List;
import th.AbstractC5806n;
import yh.G1;
import yh.l1;

/* loaded from: classes2.dex */
public final class L0 extends yh.C0 {

    /* renamed from: Z  reason: collision with root package name */
    public final yh.l1 f15648Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M0 f15649h0;

    public L0(M0 m02, yh.l1 l1Var) {
        this.f15649h0 = m02;
        this.f15648Z = l1Var;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        M0 m02 = this.f15649h0;
        p1 p1Var = m02.f15673y0.f15814i0;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < this.f15648Z.S(); i10++) {
            sb2.append('.');
        }
        return B0.i(p1Var, (List) m02.f15667s0.get(sb2.toString()));
    }

    @Override // yh.l1.a
    public final l1.a getOwnerType() {
        yh.l1 l1Var = this.f15648Z;
        yh.l1 mo118a = l1Var.mo118a();
        if (mo118a == null) {
            return null;
        }
        boolean r10 = l1Var.r();
        M0 m02 = this.f15649h0;
        if (!r10 && mo118a.V0()) {
            return new L0(m02, mo118a);
        }
        return new H0(m02, mo118a);
    }

    @Override // yh.AbstractC6632q
    public final yh.l1 l0() {
        return this.f15648Z;
    }

    @Override // yh.l1.a
    public final G1 y0() {
        return new K0(this, this.f15648Z.r0());
    }
}
