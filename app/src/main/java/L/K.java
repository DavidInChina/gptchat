package L;

import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class K extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9981Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N.t0 f9982Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(N.t0 t0Var, int i10) {
        super(0);
        this.f9981Y = i10;
        this.f9982Z = t0Var;
    }

    public final Boolean a() {
        int i10 = this.f9981Y;
        N.t0 t0Var = this.f9982Z;
        switch (i10) {
            case 0:
                t0Var.l();
                return Boolean.TRUE;
            case 1:
                t0Var.g(true);
                return Boolean.TRUE;
            case 2:
                t0Var.c(true);
                return Boolean.TRUE;
            default:
                t0Var.e();
                return Boolean.TRUE;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final void mo122invoke() {
        int i10 = this.f9981Y;
        N.t0 t0Var = this.f9982Z;
        switch (i10) {
            case 4:
                t0Var.c(true);
                t0Var.k();
                return;
            case 5:
                t0Var.e();
                t0Var.k();
                return;
            case 6:
                t0Var.l();
                t0Var.k();
                return;
            default:
                T0.z d10 = N.t0.d(t0Var.j().f16830a, U3.f.e(0, t0Var.j().f16830a.f12512Y.length()));
                t0Var.f12415c.invoke(d10);
                t0Var.f12429q = T0.z.a(t0Var.f12429q, null, d10.f16831b, 5);
                t0Var.g(true);
                return;
        }
    }
}
