package E;

import E0.AbstractC0459s;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public final class W extends X {

    /* renamed from: s0  reason: collision with root package name */
    public int f3827s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3828t0;

    @Override // E.X
    public final long A0(E0.M m10, long j6) {
        int i10;
        if (this.f3827s0 == 1) {
            i10 = m10.S(Z0.a.h(j6));
        } else {
            i10 = m10.c(Z0.a.h(j6));
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 0) {
            return H0.B0.c(0, Integer.MAX_VALUE, i10, i10);
        }
        throw new IllegalArgumentException(AbstractC4194d.v("height(", i10, ") must be >= 0").toString());
    }

    @Override // E.X
    public final boolean B0() {
        return this.f3828t0;
    }

    @Override // E.X, G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f3827s0 == 1) {
            return rVar.S(i10);
        }
        return rVar.c(i10);
    }

    @Override // E.X, G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        if (this.f3827s0 == 1) {
            return rVar.S(i10);
        }
        return rVar.c(i10);
    }
}
