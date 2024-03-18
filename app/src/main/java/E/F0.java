package E;

import E0.AbstractC0459s;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class F0 extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public int f3770s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3771t0;

    /* renamed from: u0  reason: collision with root package name */
    public wf.n f3772u0;

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
        int i12 = 0;
        if (this.f3770s0 != 1) {
            i10 = 0;
        } else {
            i10 = Z0.a.j(j6);
        }
        if (this.f3770s0 == 2) {
            i12 = Z0.a.i(j6);
        }
        int i13 = Integer.MAX_VALUE;
        if (this.f3770s0 != 1 && this.f3771t0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = Z0.a.h(j6);
        }
        if (this.f3770s0 == 2 || !this.f3771t0) {
            i13 = Z0.a.g(j6);
        }
        E0.d0 o10 = m10.o(A7.b.m(i10, i11, i12, i13));
        int p11 = com.google.android.gms.internal.play_billing.N.p(o10.f4053Y, Z0.a.j(j6), Z0.a.h(j6));
        int p12 = com.google.android.gms.internal.play_billing.N.p(o10.f4054Z, Z0.a.i(j6), Z0.a.g(j6));
        return p10.j0(p11, p12, kf.w.f37484Y, new E0(this, p11, o10, p12, p10));
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
