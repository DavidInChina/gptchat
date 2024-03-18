package E;

import E0.AbstractC0459s;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class Y extends X {

    /* renamed from: s0  reason: collision with root package name */
    public int f3829s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3830t0;

    @Override // E.X
    public final long A0(E0.M m10, long j6) {
        int i10;
        if (this.f3829s0 == 1) {
            i10 = m10.l(Z0.a.g(j6));
        } else {
            i10 = m10.m(Z0.a.g(j6));
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 0) {
            return H0.B0.c(i10, i10, 0, Integer.MAX_VALUE);
        }
        throw new IllegalArgumentException(AbstractC4194d.v("width(", i10, ") must be >= 0").toString());
    }

    @Override // E.X
    public final boolean B0() {
        return this.f3830t0;
    }

    @Override // E.X, G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f3829s0 == 1) {
            return rVar.l(i10);
        }
        return rVar.m(i10);
    }

    @Override // E.X, G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f3829s0 == 1) {
            return rVar.l(i10);
        }
        return rVar.m(i10);
    }
}
