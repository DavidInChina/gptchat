package E;

import E0.AbstractC0459s;
import l0.AbstractC4325q;
import l8.AbstractC4344b;

/* renamed from: E.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430n extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public float f3919s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3920t0;

    public final long A0(long j6, boolean z10) {
        int Y02;
        int g10 = Z0.a.g(j6);
        if (g10 != Integer.MAX_VALUE && (Y02 = AbstractC4344b.Y0(g10 * this.f3919s0)) > 0) {
            long c10 = Ng.H.c(Y02, g10);
            if (!z10 || A7.b.i1(j6, c10)) {
                return c10;
            }
            return 0L;
        }
        return 0L;
    }

    public final long B0(long j6, boolean z10) {
        int Y02;
        int h10 = Z0.a.h(j6);
        if (h10 != Integer.MAX_VALUE && (Y02 = AbstractC4344b.Y0(h10 / this.f3919s0)) > 0) {
            long c10 = Ng.H.c(h10, Y02);
            if (!z10 || A7.b.i1(j6, c10)) {
                return c10;
            }
            return 0L;
        }
        return 0L;
    }

    public final long C0(long j6, boolean z10) {
        int i10 = Z0.a.i(j6);
        int Y02 = AbstractC4344b.Y0(i10 * this.f3919s0);
        if (Y02 > 0) {
            long c10 = Ng.H.c(Y02, i10);
            if (!z10 || A7.b.i1(j6, c10)) {
                return c10;
            }
            return 0L;
        }
        return 0L;
    }

    public final long D0(long j6, boolean z10) {
        int j10 = Z0.a.j(j6);
        int Y02 = AbstractC4344b.Y0(j10 / this.f3919s0);
        if (Y02 > 0) {
            long c10 = Ng.H.c(j10, Y02);
            if (!z10 || A7.b.i1(j6, c10)) {
                return c10;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return AbstractC4344b.Y0(i10 / this.f3919s0);
        }
        return rVar.S(i10);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return AbstractC4344b.Y0(i10 * this.f3919s0);
        }
        return rVar.l(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (Z0.k.a(r5, 0) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (Z0.k.a(r5, 0) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r5 = 0;
     */
    @Override // G0.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        long j10;
        if (!this.f3920t0) {
            j10 = B0(j6, true);
            if (Z0.k.a(j10, 0L)) {
                j10 = A0(j6, true);
                if (Z0.k.a(j10, 0L)) {
                    j10 = D0(j6, true);
                    if (Z0.k.a(j10, 0L)) {
                        j10 = C0(j6, true);
                        if (Z0.k.a(j10, 0L)) {
                            j10 = B0(j6, false);
                            if (Z0.k.a(j10, 0L)) {
                                j10 = A0(j6, false);
                                if (Z0.k.a(j10, 0L)) {
                                    j10 = D0(j6, false);
                                    if (Z0.k.a(j10, 0L)) {
                                        j10 = C0(j6, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            j10 = A0(j6, true);
            if (Z0.k.a(j10, 0L)) {
                j10 = B0(j6, true);
                if (Z0.k.a(j10, 0L)) {
                    j10 = C0(j6, true);
                    if (Z0.k.a(j10, 0L)) {
                        j10 = D0(j6, true);
                        if (Z0.k.a(j10, 0L)) {
                            j10 = A0(j6, false);
                            if (Z0.k.a(j10, 0L)) {
                                j10 = B0(j6, false);
                                if (Z0.k.a(j10, 0L)) {
                                    j10 = C0(j6, false);
                                    if (Z0.k.a(j10, 0L)) {
                                        j10 = D0(j6, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!Z0.k.a(j10, 0L)) {
            j6 = H0.B0.d((int) (j10 >> 32), (int) (4294967295L & j10));
        }
        E0.d0 o10 = m10.o(j6);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new y.D(o10, 4));
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return AbstractC4344b.Y0(i10 * this.f3919s0);
        }
        return rVar.m(i10);
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (i10 != Integer.MAX_VALUE) {
            return AbstractC4344b.Y0(i10 / this.f3919s0);
        }
        return rVar.c(i10);
    }
}
