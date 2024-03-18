package G0;

import E0.AbstractC0442a;
import H0.C0714y;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import r0.AbstractC5352p;
import r0.C5342f;

/* loaded from: classes2.dex */
public final class D extends g0 {

    /* renamed from: N0  reason: collision with root package name */
    public static final C5342f f5591N0;

    /* renamed from: L0  reason: collision with root package name */
    public C f5592L0;

    /* renamed from: M0  reason: collision with root package name */
    public T f5593M0;

    static {
        C5342f f6 = androidx.compose.ui.graphics.a.f();
        int i10 = r0.r.f44264l;
        f6.f(r0.r.f44261i);
        f6.l(1.0f);
        f6.m(1);
        f5591N0 = f6;
    }

    public D(androidx.compose.ui.node.a aVar, C c10) {
        super(aVar);
        C0594x c0594x;
        this.f5592L0 = c10;
        if (aVar.f24844h0 != null) {
            c0594x = new C0594x(this);
        } else {
            c0594x = null;
        }
        this.f5593M0 = c0594x;
    }

    @Override // G0.g0
    public final void B0() {
        if (this.f5593M0 == null) {
            this.f5593M0 = new C0594x(this);
        }
    }

    @Override // G0.g0
    public final T E0() {
        return this.f5593M0;
    }

    @Override // G0.g0
    public final AbstractC4325q G0() {
        return ((AbstractC4325q) this.f5592L0).f37720Y;
    }

    @Override // G0.g0
    public final void Q0(AbstractC5352p abstractC5352p) {
        g0 g0Var = this.f5771o0;
        AbstractC3557B.Z(g0Var);
        g0Var.y0(abstractC5352p);
        if (((C0714y) AbstractC0579h.C(this.f5770n0)).getShowLayoutBounds()) {
            z0(abstractC5352p, f5591N0);
        }
    }

    @Override // E0.r
    public final int S(int i10) {
        C c10 = this.f5592L0;
        g0 g0Var = this.f5771o0;
        AbstractC3557B.Z(g0Var);
        return c10.c(this, g0Var, i10);
    }

    @Override // E0.d0
    public final void X(long j6, float f6, wf.k kVar) {
        R0(j6, f6, kVar);
        if (this.f5670k0) {
            return;
        }
        P0();
        p0().b();
    }

    @Override // E0.r
    public final int c(int i10) {
        C c10 = this.f5592L0;
        g0 g0Var = this.f5771o0;
        AbstractC3557B.Z(g0Var);
        return c10.i(this, g0Var, i10);
    }

    @Override // G0.S
    public final int h0(AbstractC0442a abstractC0442a) {
        T t10 = this.f5593M0;
        if (t10 != null) {
            Integer num = (Integer) t10.f5678s0.get(abstractC0442a);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        return AbstractC0579h.c(this, abstractC0442a);
    }

    @Override // E0.r
    public final int l(int i10) {
        C c10 = this.f5592L0;
        g0 g0Var = this.f5771o0;
        AbstractC3557B.Z(g0Var);
        return c10.d(this, g0Var, i10);
    }

    @Override // E0.r
    public final int m(int i10) {
        C c10 = this.f5592L0;
        g0 g0Var = this.f5771o0;
        AbstractC3557B.Z(g0Var);
        return c10.h(this, g0Var, i10);
    }

    @Override // E0.M
    public final E0.d0 o(long j6) {
        d0(j6);
        C c10 = this.f5592L0;
        g0 g0Var = this.f5771o0;
        AbstractC3557B.Z(g0Var);
        T0(c10.e(this, g0Var, j6));
        O0();
        return this;
    }
}
