package z4;

import E0.AbstractC0459s;
import E0.M;
import E0.O;
import E0.P;
import E0.d0;
import G0.C;
import Ng.H;
import id.AbstractC3557B;
import l0.AbstractC4325q;
import y.D;

/* loaded from: classes2.dex */
public final class m extends AbstractC4325q implements C {

    /* renamed from: s0  reason: collision with root package name */
    public int f51698s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f51699t0;

    @Override // G0.C
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.d(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.e(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final O e(P p10, M m10, long j6) {
        long j10;
        AbstractC3557B.c0("$this$measure", p10);
        long q02 = A7.b.q0(j6, H.c(this.f51698s0, this.f51699t0));
        if (Z0.a.g(j6) == Integer.MAX_VALUE && Z0.a.h(j6) != Integer.MAX_VALUE) {
            int i10 = (int) (q02 >> 32);
            int i11 = (this.f51699t0 * i10) / this.f51698s0;
            j10 = A7.b.m(i10, i10, i11, i11);
        } else if (Z0.a.h(j6) == Integer.MAX_VALUE && Z0.a.g(j6) != Integer.MAX_VALUE) {
            int i12 = (int) (q02 & 4294967295L);
            int i13 = (this.f51698s0 * i12) / this.f51699t0;
            j10 = A7.b.m(i13, i13, i12, i12);
        } else {
            int i14 = (int) (q02 >> 32);
            int i15 = (int) (q02 & 4294967295L);
            j10 = A7.b.m(i14, i14, i15, i15);
        }
        d0 o10 = m10.o(j10);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new D(o10, 17));
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
