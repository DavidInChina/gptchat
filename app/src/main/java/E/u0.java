package E;

import E0.AbstractC0459s;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class u0 extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public float f3961s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f3962t0;

    /* renamed from: u0  reason: collision with root package name */
    public float f3963u0;

    /* renamed from: v0  reason: collision with root package name */
    public float f3964v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f3965w0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r5 != Integer.MAX_VALUE) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A0(Z0.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!Z0.e.a(this.f3963u0, Float.NaN)) {
            i10 = bVar.a0(this.f3963u0);
            if (i10 < 0) {
                i10 = 0;
            }
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (!Z0.e.a(this.f3964v0, Float.NaN)) {
            i11 = bVar.a0(this.f3964v0);
            if (i11 < 0) {
                i11 = 0;
            }
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (!Z0.e.a(this.f3961s0, Float.NaN)) {
            i12 = bVar.a0(this.f3961s0);
            if (i12 > i10) {
                i12 = i10;
            }
            if (i12 < 0) {
                i12 = 0;
            }
        }
        i12 = 0;
        if (!Z0.e.a(this.f3962t0, Float.NaN)) {
            int a02 = bVar.a0(this.f3962t0);
            if (a02 > i11) {
                a02 = i11;
            }
            if (a02 < 0) {
                a02 = 0;
            }
            if (a02 != Integer.MAX_VALUE) {
                i13 = a02;
            }
        }
        return A7.b.m(i12, i10, i13, i11);
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        long A02 = A0(abstractC0459s);
        if (Z0.a.e(A02)) {
            return Z0.a.g(A02);
        }
        return A7.b.s0(rVar.S(i10), A02);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        long A02 = A0(abstractC0459s);
        if (Z0.a.f(A02)) {
            return Z0.a.h(A02);
        }
        return A7.b.t0(rVar.l(i10), A02);
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        long A02 = A0(p10);
        if (this.f3965w0) {
            j10 = A7.b.r0(j6, A02);
        } else {
            if (!Z0.e.a(this.f3961s0, Float.NaN)) {
                i10 = Z0.a.j(A02);
            } else {
                i10 = Z0.a.j(j6);
                int h10 = Z0.a.h(A02);
                if (i10 > h10) {
                    i10 = h10;
                }
            }
            if (!Z0.e.a(this.f3963u0, Float.NaN)) {
                i11 = Z0.a.h(A02);
            } else {
                i11 = Z0.a.h(j6);
                int j11 = Z0.a.j(A02);
                if (i11 < j11) {
                    i11 = j11;
                }
            }
            if (!Z0.e.a(this.f3962t0, Float.NaN)) {
                i12 = Z0.a.i(A02);
            } else {
                i12 = Z0.a.i(j6);
                int g10 = Z0.a.g(A02);
                if (i12 > g10) {
                    i12 = g10;
                }
            }
            if (!Z0.e.a(this.f3964v0, Float.NaN)) {
                i13 = Z0.a.g(A02);
            } else {
                i13 = Z0.a.g(j6);
                int i14 = Z0.a.i(A02);
                if (i13 < i14) {
                    i13 = i14;
                }
            }
            j10 = A7.b.m(i10, i11, i12, i13);
        }
        E0.d0 o10 = m10.o(j10);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new y.D(o10, 7));
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        long A02 = A0(abstractC0459s);
        if (Z0.a.f(A02)) {
            return Z0.a.h(A02);
        }
        return A7.b.t0(rVar.m(i10), A02);
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        long A02 = A0(abstractC0459s);
        if (Z0.a.e(A02)) {
            return Z0.a.g(A02);
        }
        return A7.b.s0(rVar.c(i10), A02);
    }
}
