package W;

import l8.AbstractC4344b;

/* renamed from: W.z2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1648z2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20650Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f20651Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20652h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20653i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20654j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20655k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20656l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20657m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20658n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20659o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f20660p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ A2 f20661q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ E0.P f20662r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1648z2(int i10, int i11, E0.d0 d0Var, E0.d0 d0Var2, E0.d0 d0Var3, E0.d0 d0Var4, E0.d0 d0Var5, E0.d0 d0Var6, E0.d0 d0Var7, E0.d0 d0Var8, E0.d0 d0Var9, A2 a22, E0.P p10) {
        super(1);
        this.f20650Y = i10;
        this.f20651Z = i11;
        this.f20652h0 = d0Var;
        this.f20653i0 = d0Var2;
        this.f20654j0 = d0Var3;
        this.f20655k0 = d0Var4;
        this.f20656l0 = d0Var5;
        this.f20657m0 = d0Var6;
        this.f20658n0 = d0Var7;
        this.f20659o0 = d0Var8;
        this.f20660p0 = d0Var9;
        this.f20661q0 = a22;
        this.f20662r0 = p10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        float f6;
        int i10;
        E0.c0 c0Var = (E0.c0) obj;
        A2 a22 = this.f20661q0;
        float f10 = a22.f18979c;
        E0.P p10 = this.f20662r0;
        float b10 = p10.b();
        Z0.l layoutDirection = p10.getLayoutDirection();
        float f11 = AbstractC1643y2.f20631a;
        E0.c0.f(c0Var, this.f20659o0, Z0.i.f22797b);
        E0.d0 d0Var = this.f20660p0;
        int e10 = this.f20650Y - X3.e(d0Var);
        E.g0 g0Var = a22.f18980d;
        int Y02 = AbstractC4344b.Y0(g0Var.d() * b10);
        int Y03 = AbstractC4344b.Y0(androidx.compose.foundation.layout.a.h(g0Var, layoutDirection) * b10);
        float f12 = X3.f19836c * b10;
        E0.d0 d0Var2 = this.f20652h0;
        if (d0Var2 != null) {
            E0.c0.g(c0Var, d0Var2, 0, R.a.m(1, 0.0f, (e10 - d0Var2.f4054Z) / 2.0f));
        }
        int i11 = this.f20651Z;
        E0.d0 d0Var3 = this.f20653i0;
        if (d0Var3 != null) {
            E0.c0.g(c0Var, d0Var3, i11 - d0Var3.f4053Y, R.a.m(1, 0.0f, (e10 - d0Var3.f4054Z) / 2.0f));
        }
        boolean z10 = a22.f18978b;
        E0.d0 d0Var4 = this.f20657m0;
        if (d0Var4 != null) {
            if (z10) {
                f6 = 0.0f;
                i10 = R.a.m(1, 0.0f, (e10 - d0Var4.f4054Z) / 2.0f);
            } else {
                f6 = 0.0f;
                i10 = Y02;
            }
            int M10 = K4.J.M(f10, i10, -(d0Var4.f4054Z / 2));
            if (d0Var2 != null) {
                f6 = (X3.f(d0Var2) - f12) * (1 - f10);
            }
            E0.c0.g(c0Var, d0Var4, AbstractC4344b.Y0(f6) + Y03, M10);
        }
        E0.d0 d0Var5 = this.f20654j0;
        if (d0Var5 != null) {
            E0.c0.g(c0Var, d0Var5, X3.f(d0Var2), AbstractC1643y2.f(z10, e10, Y02, d0Var4, d0Var5));
        }
        E0.d0 d0Var6 = this.f20655k0;
        if (d0Var6 != null) {
            E0.c0.g(c0Var, d0Var6, (i11 - X3.f(d0Var3)) - d0Var6.f4053Y, AbstractC1643y2.f(z10, e10, Y02, d0Var4, d0Var6));
        }
        int f13 = X3.f(d0Var5) + X3.f(d0Var2);
        E0.d0 d0Var7 = this.f20656l0;
        E0.c0.g(c0Var, d0Var7, f13, AbstractC1643y2.f(z10, e10, Y02, d0Var4, d0Var7));
        E0.d0 d0Var8 = this.f20658n0;
        if (d0Var8 != null) {
            E0.c0.g(c0Var, d0Var8, f13, AbstractC1643y2.f(z10, e10, Y02, d0Var4, d0Var8));
        }
        if (d0Var != null) {
            E0.c0.g(c0Var, d0Var, 0, e10);
        }
        return jf.y.f36177a;
    }
}
