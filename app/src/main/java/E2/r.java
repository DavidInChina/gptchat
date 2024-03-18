package E2;

import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class r extends AbstractC0482n {

    /* renamed from: m0  reason: collision with root package name */
    public static final Object f4401m0 = new Object();

    /* renamed from: k0  reason: collision with root package name */
    public final Object f4402k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Object f4403l0;

    public r(p2.g0 g0Var, Object obj, Object obj2) {
        super(g0Var);
        this.f4402k0 = obj;
        this.f4403l0 = obj2;
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final int c(Object obj) {
        Object obj2;
        if (f4401m0.equals(obj) && (obj2 = this.f4403l0) != null) {
            obj = obj2;
        }
        return this.f4386j0.c(obj);
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        this.f4386j0.h(i10, e0Var, z10);
        if (AbstractC5530A.a(e0Var.f42023Z, this.f4403l0) && z10) {
            e0Var.f42023Z = f4401m0;
        }
        return e0Var;
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final Object n(int i10) {
        Object n10 = this.f4386j0.n(i10);
        if (AbstractC5530A.a(n10, this.f4403l0)) {
            return f4401m0;
        }
        return n10;
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        this.f4386j0.o(i10, f0Var, j6);
        if (AbstractC5530A.a(f0Var.f42045Y, this.f4402k0)) {
            f0Var.f42045Y = p2.f0.f42041w0;
        }
        return f0Var;
    }
}
