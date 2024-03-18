package G0;

import A.AbstractC0044t0;
import E0.AbstractC0442a;
import id.AbstractC3557B;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class S extends E0.d0 implements W {

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5670k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5671l0;

    /* renamed from: m0  reason: collision with root package name */
    public final E0.K f5672m0 = new E0.K(0, this);

    public static void r0(g0 g0Var) {
        androidx.compose.ui.node.a aVar;
        I i10;
        g0 g0Var2 = g0Var.f5771o0;
        if (g0Var2 != null) {
            aVar = g0Var2.f5770n0;
        } else {
            aVar = null;
        }
        androidx.compose.ui.node.a aVar2 = g0Var.f5770n0;
        if (!AbstractC3557B.K(aVar, aVar2)) {
            aVar2.t().f5661o.f5643y0.g();
            return;
        }
        AbstractC0574c h10 = aVar2.t().f5661o.h();
        if (h10 != null && (i10 = ((M) h10).f5643y0) != null) {
            i10.g();
        }
    }

    @Override // Z0.b
    public final long C(int i10) {
        return R.a.h(J(i10), this);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return t0(K(f6));
    }

    @Override // E0.Q
    public final int G(AbstractC0442a abstractC0442a) {
        int h02;
        if (!n0() || (h02 = h0(abstractC0442a)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long j6 = this.f4057j0;
        int i10 = Z0.i.f22798c;
        return h02 + ((int) (j6 & 4294967295L));
    }

    @Override // Z0.b
    public final float J(int i10) {
        return i10 / b();
    }

    @Override // Z0.b
    public final float K(float f6) {
        return f6 / b();
    }

    @Override // E0.AbstractC0459s
    public boolean P() {
        return false;
    }

    @Override // Z0.b
    public final float R(float f6) {
        return b() * f6;
    }

    @Override // Z0.b
    public final /* synthetic */ int a0(float f6) {
        return R.a.b(f6, this);
    }

    @Override // Z0.b
    public final /* synthetic */ long g0(long j6) {
        return R.a.g(j6, this);
    }

    public abstract int h0(AbstractC0442a abstractC0442a);

    @Override // Z0.b
    public final /* synthetic */ float i0(long j6) {
        return R.a.f(j6, this);
    }

    @Override // E0.P
    public final E0.O j0(int i10, int i11, Map map, wf.k kVar) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new Q(i10, i11, map, kVar, this);
        }
        throw new IllegalStateException(AbstractC0044t0.y("Size(", i10, " x ", i11, ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    public abstract S l0();

    public abstract boolean n0();

    @Override // Z0.b
    public final /* synthetic */ long p(long j6) {
        return R.a.e(j6, this);
    }

    public abstract E0.O p0();

    public abstract long q0();

    public abstract void s0();

    @Override // Z0.b
    public final /* synthetic */ float t(long j6) {
        return R.a.d(j6, this);
    }

    public final /* synthetic */ long t0(float f6) {
        return R.a.h(f6, this);
    }
}
