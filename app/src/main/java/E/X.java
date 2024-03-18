package E;

import E0.AbstractC0459s;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public abstract class X extends AbstractC4325q implements G0.C {
    public abstract long A0(E0.M m10, long j6);

    public abstract boolean B0();

    public int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.S(i10);
    }

    @Override // G0.C
    public int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.l(i10);
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        long A02 = A0(m10, j6);
        if (B0()) {
            A02 = A7.b.r0(j6, A02);
        }
        E0.d0 o10 = m10.o(A02);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new y.D(o10, 6));
    }

    @Override // G0.C
    public int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.m(i10);
    }

    public int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.c(i10);
    }
}
