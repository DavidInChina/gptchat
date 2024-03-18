package H2;

import p2.C5065s;
import p2.h0;
import s2.AbstractC5530A;
import x8.C;
import x8.E;
import x8.N;
import x8.i0;
import x8.j0;
import x8.r0;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class o extends n {

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f7304j0;

    /* renamed from: k0  reason: collision with root package name */
    public final i f7305k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f7306l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f7307m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f7308n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f7309o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f7310p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f7311q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f7312r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f7313s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f7314t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f7315u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f7316v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f7317w0;

    /* JADX WARN: Removed duplicated region for block: B:100:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(int i10, h0 h0Var, int i11, i iVar, int i12, int i13, boolean z10) {
        super(i10, i11, h0Var);
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        N n10;
        boolean z15;
        boolean z16;
        C5065s c5065s;
        boolean z17;
        C5065s c5065s2;
        int i17;
        int i18;
        float f6;
        int i19;
        C5065s c5065s3;
        int i20;
        int i21;
        int i22;
        this.f7305k0 = iVar;
        if (iVar.f7270m1) {
            i14 = 24;
        } else {
            i14 = 16;
        }
        int i23 = 1;
        int i24 = 0;
        if (iVar.f7269l1 && (i13 & i14) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7313s0 = z11;
        if (z10 && (((i20 = (c5065s3 = this.f7303i0).f42324v0) == -1 || i20 <= iVar.f42168Y) && ((i21 = c5065s3.f42325w0) == -1 || i21 <= iVar.f42169Z))) {
            float f10 = c5065s3.f42326x0;
            if ((f10 == -1.0f || f10 <= iVar.f42170h0) && ((i22 = c5065s3.f42315m0) == -1 || i22 <= iVar.f42171i0)) {
                z12 = true;
                this.f7304j0 = z12;
                if (z10 && (((i17 = (c5065s2 = this.f7303i0).f42324v0) == -1 || i17 >= iVar.f42172j0) && ((i18 = c5065s2.f42325w0) == -1 || i18 >= iVar.f42173k0))) {
                    f6 = c5065s2.f42326x0;
                    if ((f6 != -1.0f || f6 >= iVar.f42174l0) && ((i19 = c5065s2.f42315m0) == -1 || i19 >= iVar.f42175m0)) {
                        z13 = true;
                        this.f7306l0 = z13;
                        this.f7307m0 = p.f(i12, false);
                        C5065s c5065s4 = this.f7303i0;
                        this.f7308n0 = c5065s4.f42315m0;
                        this.f7309o0 = c5065s4.c();
                        this.f7311q0 = p.b(this.f7303i0.f42312j0, iVar.f42180r0);
                        i15 = this.f7303i0.f42312j0;
                        if (i15 == 0 && (i15 & 1) == 0) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        this.f7312r0 = z14;
                        i16 = 0;
                        while (true) {
                            n10 = iVar.f42179q0;
                            if (i16 >= n10.size()) {
                                String str = this.f7303i0.f42319q0;
                                if (str != null && str.equals(n10.get(i16))) {
                                    break;
                                }
                                i16++;
                            } else {
                                i16 = Integer.MAX_VALUE;
                                break;
                            }
                        }
                        this.f7310p0 = i16;
                        if (AbstractC6463a.b(i12) != 128) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f7315u0 = z15;
                        if (AbstractC6463a.c(i12) != 64) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.f7316v0 = z16;
                        this.f7317w0 = p.c(this.f7303i0.f42319q0);
                        c5065s = this.f7303i0;
                        if ((c5065s.f42312j0 & 16384) == 0) {
                            i iVar2 = this.f7305k0;
                            if (p.f(i12, iVar2.f7279v1) && ((z17 = this.f7304j0) || iVar2.f7268k1)) {
                                if (p.f(i12, false) && this.f7306l0 && z17 && c5065s.f42315m0 != -1 && !iVar2.f42165D0 && !iVar2.f42164C0 && (i14 & i12) != 0) {
                                    i23 = 2;
                                }
                                i24 = i23;
                            }
                        }
                        this.f7314t0 = i24;
                    }
                }
                z13 = false;
                this.f7306l0 = z13;
                this.f7307m0 = p.f(i12, false);
                C5065s c5065s42 = this.f7303i0;
                this.f7308n0 = c5065s42.f42315m0;
                this.f7309o0 = c5065s42.c();
                this.f7311q0 = p.b(this.f7303i0.f42312j0, iVar.f42180r0);
                i15 = this.f7303i0.f42312j0;
                if (i15 == 0) {
                }
                z14 = true;
                this.f7312r0 = z14;
                i16 = 0;
                while (true) {
                    n10 = iVar.f42179q0;
                    if (i16 >= n10.size()) {
                    }
                    i16++;
                }
                this.f7310p0 = i16;
                if (AbstractC6463a.b(i12) != 128) {
                }
                this.f7315u0 = z15;
                if (AbstractC6463a.c(i12) != 64) {
                }
                this.f7316v0 = z16;
                this.f7317w0 = p.c(this.f7303i0.f42319q0);
                c5065s = this.f7303i0;
                if ((c5065s.f42312j0 & 16384) == 0) {
                }
                this.f7314t0 = i24;
            }
        }
        z12 = false;
        this.f7304j0 = z12;
        if (z10) {
            f6 = c5065s2.f42326x0;
            if (f6 != -1.0f) {
            }
            z13 = true;
            this.f7306l0 = z13;
            this.f7307m0 = p.f(i12, false);
            C5065s c5065s422 = this.f7303i0;
            this.f7308n0 = c5065s422.f42315m0;
            this.f7309o0 = c5065s422.c();
            this.f7311q0 = p.b(this.f7303i0.f42312j0, iVar.f42180r0);
            i15 = this.f7303i0.f42312j0;
            if (i15 == 0) {
            }
            z14 = true;
            this.f7312r0 = z14;
            i16 = 0;
            while (true) {
                n10 = iVar.f42179q0;
                if (i16 >= n10.size()) {
                }
                i16++;
            }
            this.f7310p0 = i16;
            if (AbstractC6463a.b(i12) != 128) {
            }
            this.f7315u0 = z15;
            if (AbstractC6463a.c(i12) != 64) {
            }
            this.f7316v0 = z16;
            this.f7317w0 = p.c(this.f7303i0.f42319q0);
            c5065s = this.f7303i0;
            if ((c5065s.f42312j0 & 16384) == 0) {
            }
            this.f7314t0 = i24;
        }
        z13 = false;
        this.f7306l0 = z13;
        this.f7307m0 = p.f(i12, false);
        C5065s c5065s4222 = this.f7303i0;
        this.f7308n0 = c5065s4222.f42315m0;
        this.f7309o0 = c5065s4222.c();
        this.f7311q0 = p.b(this.f7303i0.f42312j0, iVar.f42180r0);
        i15 = this.f7303i0.f42312j0;
        if (i15 == 0) {
        }
        z14 = true;
        this.f7312r0 = z14;
        i16 = 0;
        while (true) {
            n10 = iVar.f42179q0;
            if (i16 >= n10.size()) {
            }
            i16++;
        }
        this.f7310p0 = i16;
        if (AbstractC6463a.b(i12) != 128) {
        }
        this.f7315u0 = z15;
        if (AbstractC6463a.c(i12) != 64) {
        }
        this.f7316v0 = z16;
        this.f7317w0 = p.c(this.f7303i0.f42319q0);
        c5065s = this.f7303i0;
        if ((c5065s.f42312j0 & 16384) == 0) {
        }
        this.f7314t0 = i24;
    }

    public static int c(o oVar, o oVar2) {
        j0 j0Var;
        j0 j0Var2;
        if (oVar.f7304j0 && oVar.f7307m0) {
            j0Var = p.f7318i;
        } else {
            j0Var = p.f7318i.a();
        }
        C c10 = E.f49509a;
        int i10 = oVar.f7308n0;
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(oVar2.f7308n0);
        if (oVar.f7305k0.f42164C0) {
            j0Var2 = p.f7318i.a();
        } else {
            j0Var2 = p.f7319j;
        }
        return c10.b(valueOf, valueOf2, j0Var2).b(Integer.valueOf(oVar.f7309o0), Integer.valueOf(oVar2.f7309o0), j0Var).b(Integer.valueOf(i10), Integer.valueOf(oVar2.f7308n0), j0Var).e();
    }

    public static int d(o oVar, o oVar2) {
        E c10 = E.f49509a.c(oVar.f7307m0, oVar2.f7307m0).a(oVar.f7311q0, oVar2.f7311q0).c(oVar.f7312r0, oVar2.f7312r0).c(oVar.f7304j0, oVar2.f7304j0).c(oVar.f7306l0, oVar2.f7306l0);
        Integer valueOf = Integer.valueOf(oVar.f7310p0);
        Integer valueOf2 = Integer.valueOf(oVar2.f7310p0);
        i0.f49570Y.getClass();
        E b10 = c10.b(valueOf, valueOf2, r0.f49607Y);
        boolean z10 = oVar2.f7315u0;
        boolean z11 = oVar.f7315u0;
        E c11 = b10.c(z11, z10);
        boolean z12 = oVar2.f7316v0;
        boolean z13 = oVar.f7316v0;
        E c12 = c11.c(z13, z12);
        if (z11 && z13) {
            c12 = c12.a(oVar.f7317w0, oVar2.f7317w0);
        }
        return c12.e();
    }

    @Override // H2.n
    public final int a() {
        return this.f7314t0;
    }

    @Override // H2.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f7313s0 || AbstractC5530A.a(this.f7303i0.f42319q0, oVar.f7303i0.f42319q0)) {
            if (!this.f7305k0.f7271n1) {
                if (this.f7315u0 != oVar.f7315u0 || this.f7316v0 != oVar.f7316v0) {
                }
            }
            return true;
        }
        return false;
    }
}
