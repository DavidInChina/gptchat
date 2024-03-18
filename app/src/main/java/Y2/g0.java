package y2;

import E2.AbstractC0482n;
import p2.C5049b;

/* loaded from: classes2.dex */
public final class g0 extends AbstractC0482n {

    /* renamed from: k0  reason: collision with root package name */
    public final Object f50601k0 = new p2.f0();

    /* renamed from: l0  reason: collision with root package name */
    public final Object f50602l0;

    public g0(h0 h0Var, p2.g0 g0Var) {
        super(g0Var);
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        p2.g0 g0Var = this.f4386j0;
        p2.e0 h10 = g0Var.h(i10, e0Var, z10);
        if (g0Var.o(h10.f42024h0, (p2.f0) this.f50601k0, 0L).b()) {
            h10.k(e0Var.f42022Y, e0Var.f42023Z, e0Var.f42024h0, e0Var.f42025i0, e0Var.f42026j0, C5049b.f41981l0, true);
        } else {
            h10.f42027k0 = true;
        }
        return h10;
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        return this.f4386j0.o(i10, f0Var, j6);
    }
}
