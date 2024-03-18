package G0;

import id.AbstractC3557B;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public abstract class T extends S implements E0.M {

    /* renamed from: n0  reason: collision with root package name */
    public final g0 f5673n0;

    /* renamed from: p0  reason: collision with root package name */
    public LinkedHashMap f5675p0;

    /* renamed from: r0  reason: collision with root package name */
    public E0.O f5677r0;

    /* renamed from: o0  reason: collision with root package name */
    public long f5674o0 = Z0.i.f22797b;

    /* renamed from: q0  reason: collision with root package name */
    public final E0.L f5676q0 = new E0.L(this);

    /* renamed from: s0  reason: collision with root package name */
    public final LinkedHashMap f5678s0 = new LinkedHashMap();

    public T(g0 g0Var) {
        this.f5673n0 = g0Var;
    }

    public static final void u0(T t10, E0.O o10) {
        jf.y yVar;
        LinkedHashMap linkedHashMap;
        if (o10 != null) {
            t10.getClass();
            t10.b0(Ng.H.c(o10.getWidth(), o10.getHeight()));
            yVar = jf.y.f36177a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            t10.b0(0L);
        }
        if (!AbstractC3557B.K(t10.f5677r0, o10) && o10 != null && ((((linkedHashMap = t10.f5675p0) != null && !linkedHashMap.isEmpty()) || (!o10.a().isEmpty())) && !AbstractC3557B.K(o10.a(), t10.f5675p0))) {
            L l10 = t10.f5673n0.f5770n0.t().f5662p;
            AbstractC3557B.Z(l10);
            l10.f5613u0.g();
            LinkedHashMap linkedHashMap2 = t10.f5675p0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                t10.f5675p0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(o10.a());
        }
        t10.f5677r0 = o10;
    }

    @Override // Z0.b
    public final float O() {
        return this.f5673n0.O();
    }

    @Override // G0.S, E0.AbstractC0459s
    public final boolean P() {
        return true;
    }

    @Override // E0.d0
    public final void X(long j6, float f6, wf.k kVar) {
        if (!Z0.i.a(this.f5674o0, j6)) {
            this.f5674o0 = j6;
            g0 g0Var = this.f5673n0;
            L l10 = g0Var.f5770n0.t().f5662p;
            if (l10 != null) {
                l10.n0();
            }
            S.r0(g0Var);
        }
        if (this.f5670k0) {
            return;
        }
        C0594x c0594x = (C0594x) this;
        switch (c0594x.f5839t0) {
            case 0:
                L y10 = c0594x.f5673n0.f5770n0.y();
                AbstractC3557B.Z(y10);
                y10.q0();
                return;
            default:
                c0594x.p0().b();
                return;
        }
    }

    @Override // Z0.b
    public final float b() {
        return this.f5673n0.b();
    }

    @Override // G0.W
    public final androidx.compose.ui.node.a e0() {
        return this.f5673n0.f5770n0;
    }

    @Override // E0.AbstractC0459s
    public final Z0.l getLayoutDirection() {
        return this.f5673n0.f5770n0.f24860x0;
    }

    @Override // G0.S
    public final S l0() {
        g0 g0Var = this.f5673n0.f5771o0;
        if (g0Var != null) {
            return g0Var.E0();
        }
        return null;
    }

    @Override // G0.S
    public final boolean n0() {
        if (this.f5677r0 != null) {
            return true;
        }
        return false;
    }

    @Override // G0.S
    public final E0.O p0() {
        E0.O o10 = this.f5677r0;
        if (o10 != null) {
            return o10;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    @Override // G0.S
    public final long q0() {
        return this.f5674o0;
    }

    @Override // G0.S
    public final void s0() {
        X(this.f5674o0, 0.0f, null);
    }

    @Override // E0.d0, E0.r
    public final Object u() {
        return this.f5673n0.u();
    }

    public final long v0(T t10) {
        long j6 = Z0.i.f22797b;
        T t11 = this;
        while (!AbstractC3557B.K(t11, t10)) {
            long j10 = t11.f5674o0;
            j6 = kotlin.jvm.internal.m.c(((int) (j6 >> 32)) + ((int) (j10 >> 32)), ((int) (j6 & 4294967295L)) + ((int) (j10 & 4294967295L)));
            g0 g0Var = t11.f5673n0.f5772p0;
            AbstractC3557B.Z(g0Var);
            t11 = g0Var.E0();
            AbstractC3557B.Z(t11);
        }
        return j6;
    }
}
