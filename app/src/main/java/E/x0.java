package E;

import E0.AbstractC0459s;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class x0 extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public float f3978s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f3979t0;

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        int i11;
        int S = rVar.S(i10);
        if (!Z0.e.a(this.f3979t0, Float.NaN)) {
            i11 = abstractC0459s.a0(this.f3979t0);
        } else {
            i11 = 0;
        }
        if (S < i11) {
            return i11;
        }
        return S;
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        int i11;
        int l10 = rVar.l(i10);
        if (!Z0.e.a(this.f3978s0, Float.NaN)) {
            i11 = abstractC0459s.a0(this.f3978s0);
        } else {
            i11 = 0;
        }
        if (l10 < i11) {
            return i11;
        }
        return l10;
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        int i10;
        int i11 = 0;
        if (!Z0.e.a(this.f3978s0, Float.NaN) && Z0.a.j(j6) == 0) {
            i10 = p10.a0(this.f3978s0);
            int h10 = Z0.a.h(j6);
            if (i10 > h10) {
                i10 = h10;
            }
            if (i10 < 0) {
                i10 = 0;
            }
        } else {
            i10 = Z0.a.j(j6);
        }
        int h11 = Z0.a.h(j6);
        if (!Z0.e.a(this.f3979t0, Float.NaN) && Z0.a.i(j6) == 0) {
            int a02 = p10.a0(this.f3979t0);
            int g10 = Z0.a.g(j6);
            if (a02 > g10) {
                a02 = g10;
            }
            if (a02 >= 0) {
                i11 = a02;
            }
        } else {
            i11 = Z0.a.i(j6);
        }
        E0.d0 o10 = m10.o(A7.b.m(i10, h11, i11, Z0.a.g(j6)));
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new y.D(o10, 8));
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        int i11;
        int m10 = rVar.m(i10);
        if (!Z0.e.a(this.f3978s0, Float.NaN)) {
            i11 = abstractC0459s.a0(this.f3978s0);
        } else {
            i11 = 0;
        }
        if (m10 < i11) {
            return i11;
        }
        return m10;
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        int i11;
        int c10 = rVar.c(i10);
        if (!Z0.e.a(this.f3979t0, Float.NaN)) {
            i11 = abstractC0459s.a0(this.f3979t0);
        } else {
            i11 = 0;
        }
        if (c10 < i11) {
            return i11;
        }
        return c10;
    }
}
