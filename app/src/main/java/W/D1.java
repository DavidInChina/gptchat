package W;

/* loaded from: classes.dex */
public final class D1 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E0.P f19029Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ E.g0 f19030Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z0.l f19031h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19032i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19033j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ boolean f19034k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19035l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19036m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19037n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ int f19038o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ int f19039p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(int i10, int i11, E.i0 i0Var, E0.P p10, E0.d0 d0Var, E0.d0 d0Var2, E0.d0 d0Var3, E0.d0 d0Var4, E0.d0 d0Var5, Z0.l lVar, boolean z10) {
        super(1);
        this.f19029Y = p10;
        this.f19030Z = i0Var;
        this.f19031h0 = lVar;
        this.f19032i0 = d0Var;
        this.f19033j0 = d0Var2;
        this.f19034k0 = z10;
        this.f19035l0 = d0Var3;
        this.f19036m0 = d0Var4;
        this.f19037n0 = d0Var5;
        this.f19038o0 = i10;
        this.f19039p0 = i11;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        E0.c0 c0Var = (E0.c0) obj;
        E.g0 g0Var = this.f19030Z;
        Z0.l lVar = this.f19031h0;
        float h10 = androidx.compose.foundation.layout.a.h(g0Var, lVar);
        E0.P p10 = this.f19029Y;
        int a02 = p10.a0(h10);
        int a03 = p10.a0(androidx.compose.foundation.layout.a.g(g0Var, lVar));
        int a04 = p10.a0(g0Var.d());
        int i12 = this.f19038o0;
        boolean z10 = this.f19034k0;
        E0.d0 d0Var = this.f19032i0;
        if (d0Var != null) {
            if (z10) {
                i11 = a04;
            } else {
                i11 = R.a.m(1, 0.0f, (i12 - d0Var.f4054Z) / 2.0f);
            }
            E0.c0.g(c0Var, d0Var, a02, i11);
        }
        E0.d0 d0Var2 = this.f19033j0;
        if (d0Var2 != null) {
            int i13 = (this.f19039p0 - a03) - d0Var2.f4053Y;
            if (z10) {
                i10 = a04;
            } else {
                i10 = R.a.m(1, 0.0f, (i12 - d0Var2.f4054Z) / 2.0f);
            }
            E0.c0.g(c0Var, d0Var2, i13, i10);
        }
        int f6 = X3.f(d0Var) + a02;
        E0.d0 d0Var3 = this.f19037n0;
        E0.d0 d0Var4 = this.f19036m0;
        E0.d0 d0Var5 = this.f19035l0;
        if (!z10) {
            a04 = R.a.m(1, 0.0f, (i12 - (X3.e(d0Var3) + (X3.e(d0Var4) + X3.e(d0Var5)))) / 2.0f);
        }
        if (d0Var4 != null) {
            E0.c0.g(c0Var, d0Var4, f6, a04);
        }
        int e10 = X3.e(d0Var4) + a04;
        if (d0Var5 != null) {
            E0.c0.g(c0Var, d0Var5, f6, e10);
        }
        int e11 = X3.e(d0Var5) + e10;
        if (d0Var3 != null) {
            E0.c0.g(c0Var, d0Var3, f6, e11);
        }
        return jf.y.f36177a;
    }
}
