package W;

import E0.AbstractC0459s;
import G0.AbstractC0579h;
import G0.AbstractC0585n;
import l0.AbstractC4325q;

/* loaded from: classes2.dex */
public final class O1 extends AbstractC4325q implements AbstractC0585n, G0.C {
    @Override // G0.C
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.d(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.e(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        boolean z10;
        int i10;
        int i11;
        long j10 = AbstractC1617t1.f20424b;
        E0.d0 o10 = m10.o(j6);
        if (this.f37732r0 && ((Boolean) AbstractC0579h.p(this, AbstractC1617t1.f20423a)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = Math.max(o10.f4053Y, p10.a0(Z0.g.b(j10)));
        } else {
            i10 = o10.f4053Y;
        }
        if (z10) {
            i11 = Math.max(o10.f4054Z, p10.a0(Z0.g.a(j10)));
        } else {
            i11 = o10.f4054Z;
        }
        return p10.j0(i10, i11, kf.w.f37484Y, new E.S(i10, o10, i11));
    }

    @Override // G0.C
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.c(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.b(this, abstractC0459s, rVar, i10);
    }
}
