package E0;

/* renamed from: E0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455n implements M {

    /* renamed from: Y  reason: collision with root package name */
    public final r f4080Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f4081Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f4082h0;

    public C0455n(r rVar, int i10, int i11) {
        this.f4080Y = rVar;
        this.f4081Z = i10;
        this.f4082h0 = i11;
    }

    @Override // E0.r
    public final int S(int i10) {
        return this.f4080Y.S(i10);
    }

    @Override // E0.r
    public final int c(int i10) {
        return this.f4080Y.c(i10);
    }

    @Override // E0.r
    public final int l(int i10) {
        return this.f4080Y.l(i10);
    }

    @Override // E0.r
    public final int m(int i10) {
        return this.f4080Y.m(i10);
    }

    @Override // E0.M
    public final d0 o(long j6) {
        int i10;
        int i11;
        int i12 = this.f4082h0;
        int i13 = 32767;
        int i14 = this.f4081Z;
        r rVar = this.f4080Y;
        if (i12 == 1) {
            if (i14 == 2) {
                i11 = rVar.m(Z0.a.g(j6));
            } else {
                i11 = rVar.l(Z0.a.g(j6));
            }
            if (Z0.a.c(j6)) {
                i13 = Z0.a.g(j6);
            }
            return new C0457p(i11, i13, 0);
        }
        if (i14 == 2) {
            i10 = rVar.c(Z0.a.h(j6));
        } else {
            i10 = rVar.S(Z0.a.h(j6));
        }
        if (Z0.a.d(j6)) {
            i13 = Z0.a.h(j6);
        }
        return new C0457p(i13, i10, 0);
    }

    @Override // E0.r
    public final Object u() {
        return this.f4080Y.u();
    }
}
