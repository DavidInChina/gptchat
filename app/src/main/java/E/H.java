package E;

import E0.AbstractC0459s;
import l0.AbstractC4325q;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class H extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public int f3773s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f3774t0;

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
        int i10;
        int i11;
        int i12;
        int i13;
        if (Z0.a.d(j6) && this.f3773s0 != 1) {
            i11 = com.google.android.gms.internal.play_billing.N.p(AbstractC4344b.Y0(Z0.a.h(j6) * this.f3774t0), Z0.a.j(j6), Z0.a.h(j6));
            i10 = i11;
        } else {
            i11 = Z0.a.j(j6);
            i10 = Z0.a.h(j6);
        }
        if (Z0.a.c(j6) && this.f3773s0 != 2) {
            i13 = com.google.android.gms.internal.play_billing.N.p(AbstractC4344b.Y0(Z0.a.g(j6) * this.f3774t0), Z0.a.i(j6), Z0.a.g(j6));
            i12 = i13;
        } else {
            int i14 = Z0.a.i(j6);
            i12 = Z0.a.g(j6);
            i13 = i14;
        }
        E0.d0 o10 = m10.o(A7.b.m(i11, i10, i13, i12));
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new y.D(o10, 5));
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
