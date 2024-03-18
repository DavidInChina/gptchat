package E2;

/* loaded from: classes.dex */
public final class O extends AbstractC0482n {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f4213k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public final Object f4214l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q10, b0 b0Var) {
        super(b0Var);
        this.f4214l0 = q10;
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.e0 h(int i10, p2.e0 e0Var, boolean z10) {
        switch (this.f4213k0) {
            case 0:
                super.h(i10, e0Var, z10);
                e0Var.f42027k0 = true;
                return e0Var;
            default:
                return this.f4386j0.h(i10, e0Var, z10);
        }
    }

    @Override // E2.AbstractC0482n, p2.g0
    public final p2.f0 o(int i10, p2.f0 f0Var, long j6) {
        Object obj;
        switch (this.f4213k0) {
            case 0:
                super.o(i10, f0Var, j6);
                f0Var.f42056q0 = true;
                return f0Var;
            default:
                super.o(i10, f0Var, j6);
                p2.H h10 = (p2.H) this.f4214l0;
                f0Var.f42047h0 = h10;
                p2.C c10 = h10.f41808Z;
                if (c10 != null) {
                    obj = c10.f41767m0;
                } else {
                    obj = null;
                }
                f0Var.f42046Z = obj;
                return f0Var;
        }
    }

    public O(p2.g0 g0Var, p2.H h10) {
        super(g0Var);
        this.f4214l0 = h10;
    }
}
