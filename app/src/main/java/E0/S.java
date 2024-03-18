package E0;

/* loaded from: classes.dex */
public final class S implements M {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4031Y;

    /* renamed from: Z  reason: collision with root package name */
    public final r f4032Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Enum f4033h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Enum f4034i0;

    public /* synthetic */ S(r rVar, Enum r22, Enum r32, int i10) {
        this.f4031Y = i10;
        this.f4032Z = rVar;
        this.f4033h0 = r22;
        this.f4034i0 = r32;
    }

    @Override // E0.r
    public final int S(int i10) {
        int i11 = this.f4031Y;
        r rVar = this.f4032Z;
        switch (i11) {
            case 0:
                return rVar.S(i10);
            default:
                return rVar.S(i10);
        }
    }

    @Override // E0.r
    public final int c(int i10) {
        int i11 = this.f4031Y;
        r rVar = this.f4032Z;
        switch (i11) {
            case 0:
                return rVar.c(i10);
            default:
                return rVar.c(i10);
        }
    }

    @Override // E0.r
    public final int l(int i10) {
        int i11 = this.f4031Y;
        r rVar = this.f4032Z;
        switch (i11) {
            case 0:
                return rVar.l(i10);
            default:
                return rVar.l(i10);
        }
    }

    @Override // E0.r
    public final int m(int i10) {
        int i11 = this.f4031Y;
        r rVar = this.f4032Z;
        switch (i11) {
            case 0:
                return rVar.m(i10);
            default:
                return rVar.m(i10);
        }
    }

    @Override // E0.M
    public final d0 o(long j6) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.f4031Y;
        r rVar = this.f4032Z;
        Enum r22 = this.f4033h0;
        int i15 = 32767;
        Enum r42 = this.f4034i0;
        switch (i14) {
            case 0:
                U u10 = (U) r42;
                U u11 = U.f4038Y;
                T t10 = T.f4036Z;
                if (u10 == u11) {
                    if (((T) r22) == t10) {
                        i11 = rVar.m(Z0.a.g(j6));
                    } else {
                        i11 = rVar.l(Z0.a.g(j6));
                    }
                    if (Z0.a.c(j6)) {
                        i15 = Z0.a.g(j6);
                    }
                    return new C0457p(i11, i15, 1);
                }
                if (((T) r22) == t10) {
                    i10 = rVar.c(Z0.a.h(j6));
                } else {
                    i10 = rVar.S(Z0.a.h(j6));
                }
                if (Z0.a.d(j6)) {
                    i15 = Z0.a.h(j6);
                }
                return new C0457p(i15, i10, 1);
            default:
                G0.i0 i0Var = (G0.i0) r42;
                G0.i0 i0Var2 = G0.i0.f5790Y;
                G0.h0 h0Var = G0.h0.f5786Z;
                if (i0Var == i0Var2) {
                    if (((G0.h0) r22) == h0Var) {
                        i13 = rVar.m(Z0.a.g(j6));
                    } else {
                        i13 = rVar.l(Z0.a.g(j6));
                    }
                    if (Z0.a.c(j6)) {
                        i15 = Z0.a.g(j6);
                    }
                    return new C0457p(i13, i15, 2);
                }
                if (((G0.h0) r22) == h0Var) {
                    i12 = rVar.c(Z0.a.h(j6));
                } else {
                    i12 = rVar.S(Z0.a.h(j6));
                }
                if (Z0.a.d(j6)) {
                    i15 = Z0.a.h(j6);
                }
                return new C0457p(i15, i12, 2);
        }
    }

    @Override // E0.r
    public final Object u() {
        int i10 = this.f4031Y;
        r rVar = this.f4032Z;
        switch (i10) {
            case 0:
                return rVar.u();
            default:
                return rVar.u();
        }
    }
}
