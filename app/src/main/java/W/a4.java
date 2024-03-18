package W;

import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class a4 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19909Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f19910Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f19911h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19912i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19913j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19914k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19915l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19916m0;

    /* renamed from: n0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19917n0;

    /* renamed from: o0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19918o0;

    /* renamed from: p0  reason: collision with root package name */
    public final /* synthetic */ E0.d0 f19919p0;

    /* renamed from: q0  reason: collision with root package name */
    public final /* synthetic */ b4 f19920q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ int f19921r0;

    /* renamed from: s0  reason: collision with root package name */
    public final /* synthetic */ E0.P f19922s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(E0.d0 d0Var, int i10, int i11, E0.d0 d0Var2, E0.d0 d0Var3, E0.d0 d0Var4, E0.d0 d0Var5, E0.d0 d0Var6, E0.d0 d0Var7, E0.d0 d0Var8, E0.d0 d0Var9, b4 b4Var, int i12, E0.P p10) {
        super(1);
        this.f19909Y = d0Var;
        this.f19910Z = i10;
        this.f19911h0 = i11;
        this.f19912i0 = d0Var2;
        this.f19913j0 = d0Var3;
        this.f19914k0 = d0Var4;
        this.f19915l0 = d0Var5;
        this.f19916m0 = d0Var6;
        this.f19917n0 = d0Var7;
        this.f19918o0 = d0Var8;
        this.f19919p0 = d0Var9;
        this.f19920q0 = b4Var;
        this.f19921r0 = i12;
        this.f19922s0 = p10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10;
        E0.d0 d0Var;
        E0.c0 c0Var = (E0.c0) obj;
        E0.d0 d0Var2 = this.f19912i0;
        E0.d0 d0Var3 = this.f19918o0;
        E0.P p10 = this.f19922s0;
        E0.d0 d0Var4 = this.f19919p0;
        E0.d0 d0Var5 = this.f19917n0;
        E0.d0 d0Var6 = this.f19916m0;
        E0.d0 d0Var7 = this.f19915l0;
        E0.d0 d0Var8 = this.f19914k0;
        E0.d0 d0Var9 = this.f19913j0;
        int i11 = this.f19911h0;
        int i12 = this.f19910Z;
        b4 b4Var = this.f19920q0;
        E0.d0 d0Var10 = this.f19909Y;
        if (d0Var10 != null) {
            boolean z10 = b4Var.f19941a;
            int i13 = d0Var10.f4054Z;
            int i14 = this.f19921r0;
            int i15 = i13 + i14;
            float b10 = p10.b();
            float f6 = Z3.f19883a;
            E0.c0.f(c0Var, d0Var3, Z0.i.f22797b);
            int e10 = i11 - X3.e(d0Var4);
            if (d0Var8 != null) {
                E0.c0.g(c0Var, d0Var8, 0, R.a.m(1, 0.0f, (e10 - d0Var8.f4054Z) / 2.0f));
            }
            if (d0Var7 != null) {
                E0.c0.g(c0Var, d0Var7, i12 - d0Var7.f4053Y, R.a.m(1, 0.0f, (e10 - d0Var7.f4054Z) / 2.0f));
            }
            if (z10) {
                i10 = R.a.m(1, 0.0f, (e10 - d0Var10.f4054Z) / 2.0f);
            } else {
                i10 = AbstractC4344b.Y0(X3.f19835b * b10);
            }
            E0.c0.g(c0Var, d0Var10, X3.f(d0Var8), i10 - AbstractC4344b.Y0((i10 - i14) * b4Var.f19942b));
            if (d0Var6 != null) {
                d0Var = d0Var6;
                E0.c0.g(c0Var, d0Var, X3.f(d0Var8), i15);
            } else {
                d0Var = d0Var6;
            }
            if (d0Var5 != null) {
                E0.c0.g(c0Var, d0Var5, (i12 - X3.f(d0Var7)) - d0Var5.f4053Y, i15);
            }
            int f10 = X3.f(d0Var) + X3.f(d0Var8);
            E0.c0.g(c0Var, d0Var2, f10, i15);
            if (d0Var9 != null) {
                E0.c0.g(c0Var, d0Var9, f10, i15);
            }
            if (d0Var4 != null) {
                E0.c0.g(c0Var, d0Var4, 0, e10);
            }
        } else {
            boolean z11 = b4Var.f19941a;
            float b11 = p10.b();
            float f11 = Z3.f19883a;
            E0.c0.f(c0Var, d0Var3, Z0.i.f22797b);
            int e11 = i11 - X3.e(d0Var4);
            int Y02 = AbstractC4344b.Y0(b4Var.f19943c.d() * b11);
            if (d0Var8 != null) {
                E0.c0.g(c0Var, d0Var8, 0, R.a.m(1, 0.0f, (e11 - d0Var8.f4054Z) / 2.0f));
            }
            if (d0Var7 != null) {
                E0.c0.g(c0Var, d0Var7, i12 - d0Var7.f4053Y, R.a.m(1, 0.0f, (e11 - d0Var7.f4054Z) / 2.0f));
            }
            if (d0Var6 != null) {
                E0.c0.g(c0Var, d0Var6, X3.f(d0Var8), Z3.d(z11, e11, Y02, d0Var6));
            }
            if (d0Var5 != null) {
                E0.c0.g(c0Var, d0Var5, (i12 - X3.f(d0Var7)) - d0Var5.f4053Y, Z3.d(z11, e11, Y02, d0Var5));
            }
            int f12 = X3.f(d0Var6) + X3.f(d0Var8);
            E0.c0.g(c0Var, d0Var2, f12, Z3.d(z11, e11, Y02, d0Var2));
            if (d0Var9 != null) {
                E0.c0.g(c0Var, d0Var9, f12, Z3.d(z11, e11, Y02, d0Var9));
            }
            if (d0Var4 != null) {
                E0.c0.g(c0Var, d0Var4, 0, e11);
            }
        }
        return jf.y.f36177a;
    }
}
