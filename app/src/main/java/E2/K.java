package E2;

import io.sentry.C3636c1;
import java.io.IOException;
import p2.C5065s;

/* loaded from: classes.dex */
public final class K implements Y {

    /* renamed from: Y  reason: collision with root package name */
    public final int f4164Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N f4165Z;

    public K(N n10, int i10) {
        this.f4165Z = n10;
        this.f4164Y = i10;
    }

    @Override // E2.Y
    public final boolean j() {
        N n10 = this.f4165Z;
        if (!n10.B() && n10.f4211y0[this.f4164Y].n(n10.f4190Q0)) {
            return true;
        }
        return false;
    }

    @Override // E2.Y
    public final void m() {
        N n10 = this.f4165Z;
        X x10 = n10.f4211y0[this.f4164Y];
        B2.k kVar = x10.f4256h;
        if (kVar != null && kVar.getState() == 1) {
            B2.j f6 = x10.f4256h.f();
            f6.getClass();
            throw f6;
        }
        int a02 = n10.f4195i0.a0(n10.f4181H0);
        I2.n nVar = n10.f4202p0;
        IOException iOException = nVar.f8010c;
        if (iOException == null) {
            I2.j jVar = nVar.f8009b;
            if (jVar != null) {
                if (a02 == Integer.MIN_VALUE) {
                    a02 = jVar.f7996Y;
                }
                IOException iOException2 = jVar.f8000j0;
                if (iOException2 != null && jVar.f8001k0 > a02) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // E2.Y
    public final int o(long j6) {
        N n10 = this.f4165Z;
        int i10 = this.f4164Y;
        int i11 = 0;
        if (!n10.B()) {
            n10.w(i10);
            X x10 = n10.f4211y0[i10];
            boolean z10 = n10.f4190Q0;
            synchronized (x10) {
                int l10 = x10.l(x10.f4267s);
                int i12 = x10.f4267s;
                int i13 = x10.f4264p;
                if (i12 != i13 && j6 >= x10.f4262n[l10]) {
                    if (j6 > x10.f4270v && z10) {
                        i11 = i13 - i12;
                    } else {
                        int i14 = x10.i(l10, i13 - i12, j6, true);
                        if (i14 != -1) {
                            i11 = i14;
                        }
                    }
                }
            }
            x10.u(i11);
            if (i11 == 0) {
                n10.y(i10);
            }
        }
        return i11;
    }

    @Override // E2.Y
    public final int q(C3636c1 c3636c1, x2.h hVar, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        N n10 = this.f4165Z;
        int i12 = this.f4164Y;
        if (n10.B()) {
            return -3;
        }
        n10.w(i12);
        X x10 = n10.f4211y0[i12];
        boolean z13 = n10.f4190Q0;
        x10.getClass();
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        U u10 = x10.f4250b;
        synchronized (x10) {
            try {
                hVar.f48642k0 = false;
                int i13 = x10.f4267s;
                if (i13 != x10.f4264p) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (!z13 && !x10.f4271w) {
                        C5065s c5065s = x10.f4274z;
                        if (c5065s == null || (!z10 && c5065s == x10.f4255g)) {
                            i11 = -3;
                        }
                        x10.p(c5065s, c3636c1);
                        i11 = -5;
                    }
                    hVar.f48626Z = 4;
                    hVar.f48643l0 = Long.MIN_VALUE;
                    i11 = -4;
                } else {
                    C5065s c5065s2 = ((V) x10.f4251c.f(x10.f4265q + i13)).f4245a;
                    if (!z10 && c5065s2 == x10.f4255g) {
                        int l10 = x10.l(x10.f4267s);
                        if (!x10.o(l10)) {
                            hVar.f48642k0 = true;
                            i11 = -3;
                        } else {
                            hVar.f48626Z = x10.f4261m[l10];
                            if (x10.f4267s == x10.f4264p - 1 && (z13 || x10.f4271w)) {
                                hVar.e(536870912);
                            }
                            long j6 = x10.f4262n[l10];
                            hVar.f48643l0 = j6;
                            if (j6 < x10.f4268t) {
                                hVar.e(Integer.MIN_VALUE);
                            }
                            u10.f4242a = x10.f4260l[l10];
                            u10.f4243b = x10.f4259k[l10];
                            u10.f4244c = x10.f4263o[l10];
                            i11 = -4;
                        }
                    }
                    x10.p(c5065s2, c3636c1);
                    i11 = -5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i11 == -4 && !hVar.g(4)) {
            if ((i10 & 1) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ((i10 & 4) == 0) {
                if (z12) {
                    T t10 = x10.f4249a;
                    T.e(t10.f4239e, hVar, x10.f4250b, t10.f4237c);
                } else {
                    T t11 = x10.f4249a;
                    t11.f4239e = T.e(t11.f4239e, hVar, x10.f4250b, t11.f4237c);
                }
            }
            if (!z12) {
                x10.f4267s++;
            }
        }
        if (i11 == -3) {
            n10.y(i12);
        }
        return i11;
    }
}
