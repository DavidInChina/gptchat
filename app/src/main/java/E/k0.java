package E;

import E0.AbstractC0459s;
import h.C3281g;
import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class k0 extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public g0 f3882s0;

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
        float f6 = 0;
        if (Float.compare(this.f3882s0.b(p10.getLayoutDirection()), f6) >= 0 && Float.compare(this.f3882s0.d(), f6) >= 0 && Float.compare(this.f3882s0.c(p10.getLayoutDirection()), f6) >= 0 && Float.compare(this.f3882s0.a(), f6) >= 0) {
            int a02 = p10.a0(this.f3882s0.c(p10.getLayoutDirection())) + p10.a0(this.f3882s0.b(p10.getLayoutDirection()));
            int a03 = p10.a0(this.f3882s0.a()) + p10.a0(this.f3882s0.d());
            E0.d0 o10 = m10.o(A7.b.n1(j6, -a02, -a03));
            return p10.j0(A7.b.t0(o10.f4053Y + a02, j6), A7.b.s0(o10.f4054Z + a03, j6), kf.w.f37484Y, new C3281g(o10, p10, this, 8));
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
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
