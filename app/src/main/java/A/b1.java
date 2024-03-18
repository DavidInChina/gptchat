package A;

import E0.AbstractC0459s;
import Z.C1720k0;
import j0.AbstractC3893i;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class b1 extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public Z0 f174s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f175t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f176u0;

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f176u0) {
            return rVar.S(i10);
        }
        return rVar.S(Integer.MAX_VALUE);
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f176u0) {
            return rVar.l(Integer.MAX_VALUE);
        }
        return rVar.l(i10);
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        B.W0 w02;
        int i10;
        int i11;
        if (this.f176u0) {
            w02 = B.W0.f1213Y;
        } else {
            w02 = B.W0.f1214Z;
        }
        androidx.compose.foundation.a.e(j6, w02);
        int i12 = Integer.MAX_VALUE;
        if (this.f176u0) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = Z0.a.g(j6);
        }
        if (this.f176u0) {
            i12 = Z0.a.h(j6);
        }
        E0.d0 o10 = m10.o(Z0.a.a(j6, 0, i12, 0, i10, 5));
        int i13 = o10.f4053Y;
        int h10 = Z0.a.h(j6);
        if (i13 > h10) {
            i13 = h10;
        }
        int i14 = o10.f4054Z;
        int g10 = Z0.a.g(j6);
        if (i14 > g10) {
            i14 = g10;
        }
        int i15 = o10.f4054Z - i14;
        int i16 = o10.f4053Y - i13;
        if (!this.f176u0) {
            i15 = i16;
        }
        Z0 z02 = this.f174s0;
        C1720k0 c1720k0 = z02.f154d;
        C1720k0 c1720k02 = z02.f151a;
        c1720k0.i(i15);
        int i17 = AbstractC3893i.f35891e;
        AbstractC3893i d10 = io.sentry.hints.i.d();
        try {
            AbstractC3893i j10 = d10.j();
            if (c1720k02.h() > i15) {
                c1720k02.i(i15);
            }
            AbstractC3893i.p(j10);
            d10.c();
            Z0 z03 = this.f174s0;
            if (this.f176u0) {
                i11 = i14;
            } else {
                i11 = i13;
            }
            z03.f152b.i(i11);
            return p10.j0(i13, i14, kf.w.f37484Y, new a1(this, i15, o10, 0));
        } catch (Throwable th2) {
            d10.c();
            throw th2;
        }
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f176u0) {
            return rVar.m(Integer.MAX_VALUE);
        }
        return rVar.m(i10);
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f176u0) {
            return rVar.c(i10);
        }
        return rVar.c(Integer.MAX_VALUE);
    }
}
