package l0;

import A.C0043t;
import E0.AbstractC0459s;
import E0.M;
import E0.O;
import E0.P;
import E0.d0;
import G0.C;
import kf.w;
import y.AbstractC6463a;

/* renamed from: l0.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4328t extends AbstractC4325q implements C {

    /* renamed from: s0  reason: collision with root package name */
    public float f37735s0;

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
        d0 o10 = m10.o(j6);
        return p10.j0(o10.f4053Y, o10.f4054Z, w.f37484Y, new C0043t(o10, 15, this));
    }

    @Override // G0.C
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.c(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.b(this, abstractC0459s, rVar, i10);
    }

    public final String toString() {
        return AbstractC6463a.k(new StringBuilder("ZIndexModifier(zIndex="), this.f37735s0, ')');
    }
}
