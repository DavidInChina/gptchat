package E0;

import l0.AbstractC4325q;

/* loaded from: classes.dex */
public final class A extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public wf.o f3984s0;

    @Override // G0.C
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, r rVar, int i10) {
        return E9.f.d(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, r rVar, int i10) {
        return E9.f.e(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final O e(P p10, M m10, long j6) {
        return (O) this.f3984s0.invoke(p10, m10, new Z0.a(j6));
    }

    @Override // G0.C
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, r rVar, int i10) {
        return E9.f.c(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, r rVar, int i10) {
        return E9.f.b(this, abstractC0459s, rVar, i10);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f3984s0 + ')';
    }
}
