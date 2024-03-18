package H2;

import android.text.TextUtils;
import p2.C5065s;
import p2.h0;
import p2.k0;
import s2.AbstractC5530A;
import x8.E;
import x8.N;
import x8.i0;
import x8.j0;
import x8.r0;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class f extends n implements Comparable {

    /* renamed from: A0  reason: collision with root package name */
    public final boolean f7211A0;

    /* renamed from: B0  reason: collision with root package name */
    public final boolean f7212B0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f7213j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f7214k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f7215l0;

    /* renamed from: m0  reason: collision with root package name */
    public final i f7216m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f7217n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f7218o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f7219p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f7220q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f7221r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f7222s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f7223t0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f7224u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f7225v0;

    /* renamed from: w0  reason: collision with root package name */
    public final int f7226w0;

    /* renamed from: x0  reason: collision with root package name */
    public final int f7227x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int f7228y0;

    /* renamed from: z0  reason: collision with root package name */
    public final int f7229z0;

    public f(int i10, h0 h0Var, int i11, i iVar, int i12, boolean z10, e eVar, int i13) {
        super(i10, i11, h0Var);
        int i14;
        boolean z11;
        int i15;
        int i16;
        boolean z12;
        boolean z13;
        boolean z14;
        int i17;
        boolean z15;
        boolean z16;
        boolean z17;
        this.f7216m0 = iVar;
        if (iVar.f7277t1) {
            i14 = 24;
        } else {
            i14 = 16;
        }
        int i18 = 1;
        int i19 = 0;
        if (iVar.f7273p1 && (i13 & i14) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7221r0 = z11;
        this.f7215l0 = p.h(this.f7303i0.f42310h0);
        this.f7217n0 = p.f(i12, false);
        int i20 = 0;
        while (true) {
            N n10 = iVar.f42181s0;
            i15 = Integer.MAX_VALUE;
            if (i20 < n10.size()) {
                i16 = p.e(this.f7303i0, (String) n10.get(i20), false);
                if (i16 > 0) {
                    break;
                }
                i20++;
            } else {
                i16 = 0;
                i20 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f7219p0 = i20;
        this.f7218o0 = i16;
        this.f7220q0 = p.b(this.f7303i0.f42312j0, iVar.f42182t0);
        C5065s c5065s = this.f7303i0;
        int i21 = c5065s.f42312j0;
        if (i21 != 0 && (i21 & 1) == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f7222s0 = z12;
        if ((c5065s.f42311i0 & 1) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f7225v0 = z13;
        int i22 = c5065s.f42297D0;
        this.f7226w0 = i22;
        this.f7227x0 = c5065s.f42298E0;
        int i23 = c5065s.f42315m0;
        this.f7228y0 = i23;
        if ((i23 == -1 || i23 <= iVar.f42184v0) && ((i22 == -1 || i22 <= iVar.f42183u0) && eVar.apply(c5065s))) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f7214k0 = z14;
        String[] v10 = AbstractC5530A.v();
        int i24 = 0;
        while (true) {
            if (i24 < v10.length) {
                i17 = p.e(this.f7303i0, v10[i24], false);
                if (i17 > 0) {
                    break;
                }
                i24++;
            } else {
                i17 = 0;
                i24 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f7223t0 = i24;
        this.f7224u0 = i17;
        int i25 = 0;
        while (true) {
            N n11 = iVar.f42185w0;
            if (i25 < n11.size()) {
                String str = this.f7303i0.f42319q0;
                if (str != null && str.equals(n11.get(i25))) {
                    i15 = i25;
                    break;
                }
                i25++;
            } else {
                break;
            }
        }
        this.f7229z0 = i15;
        if (AbstractC6463a.b(i12) == 128) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f7211A0 = z15;
        if (AbstractC6463a.c(i12) == 64) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.f7212B0 = z16;
        i iVar2 = this.f7216m0;
        if (p.f(i12, iVar2.f7279v1) && ((z17 = this.f7214k0) || iVar2.f7272o1)) {
            k0 k0Var = iVar2.f42186x0;
            int i26 = k0Var.f42093Y;
            C5065s c5065s2 = this.f7303i0;
            if (i26 != 2 || p.j(iVar2, i12, c5065s2)) {
                if (p.f(i12, false) && z17 && c5065s2.f42315m0 != -1 && !iVar2.f42165D0 && !iVar2.f42164C0 && ((iVar2.f7281x1 || !z10) && k0Var.f42093Y != 2 && (i14 & i12) != 0)) {
                    i18 = 2;
                }
                i19 = i18;
            }
        }
        this.f7213j0 = i19;
    }

    @Override // H2.n
    public final int a() {
        return this.f7213j0;
    }

    @Override // H2.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        int i11;
        f fVar = (f) nVar;
        i iVar = this.f7216m0;
        boolean z10 = iVar.f7275r1;
        C5065s c5065s = fVar.f7303i0;
        C5065s c5065s2 = this.f7303i0;
        if ((z10 || ((i11 = c5065s2.f42297D0) != -1 && i11 == c5065s.f42297D0)) && ((this.f7221r0 || ((str = c5065s2.f42319q0) != null && TextUtils.equals(str, c5065s.f42319q0))) && (iVar.f7274q1 || ((i10 = c5065s2.f42298E0) != -1 && i10 == c5065s.f42298E0)))) {
            if (!iVar.f7276s1) {
                if (this.f7211A0 != fVar.f7211A0 || this.f7212B0 != fVar.f7212B0) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int compareTo(f fVar) {
        j0 j0Var;
        j0 j0Var2;
        boolean z10 = this.f7217n0;
        boolean z11 = this.f7214k0;
        if (z11 && z10) {
            j0Var = p.f7318i;
        } else {
            j0Var = p.f7318i.a();
        }
        E c10 = E.f49509a.c(z10, fVar.f7217n0);
        Integer valueOf = Integer.valueOf(this.f7219p0);
        Integer valueOf2 = Integer.valueOf(fVar.f7219p0);
        i0.f49570Y.getClass();
        r0 r0Var = r0.f49607Y;
        E b10 = c10.b(valueOf, valueOf2, r0Var).a(this.f7218o0, fVar.f7218o0).a(this.f7220q0, fVar.f7220q0).c(this.f7225v0, fVar.f7225v0).c(this.f7222s0, fVar.f7222s0).b(Integer.valueOf(this.f7223t0), Integer.valueOf(fVar.f7223t0), r0Var).a(this.f7224u0, fVar.f7224u0).c(z11, fVar.f7214k0).b(Integer.valueOf(this.f7229z0), Integer.valueOf(fVar.f7229z0), r0Var);
        int i10 = this.f7228y0;
        Integer valueOf3 = Integer.valueOf(i10);
        int i11 = fVar.f7228y0;
        Integer valueOf4 = Integer.valueOf(i11);
        if (this.f7216m0.f42164C0) {
            j0Var2 = p.f7318i.a();
        } else {
            j0Var2 = p.f7319j;
        }
        E b11 = b10.b(valueOf3, valueOf4, j0Var2).c(this.f7211A0, fVar.f7211A0).c(this.f7212B0, fVar.f7212B0).b(Integer.valueOf(this.f7226w0), Integer.valueOf(fVar.f7226w0), j0Var).b(Integer.valueOf(this.f7227x0), Integer.valueOf(fVar.f7227x0), j0Var);
        Integer valueOf5 = Integer.valueOf(i10);
        Integer valueOf6 = Integer.valueOf(i11);
        if (!AbstractC5530A.a(this.f7215l0, fVar.f7215l0)) {
            j0Var = p.f7319j;
        }
        return b11.b(valueOf5, valueOf6, j0Var).e();
    }
}
