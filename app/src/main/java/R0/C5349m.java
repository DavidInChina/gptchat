package r0;

import A.C0043t;
import E0.AbstractC0459s;
import E0.d0;
import l0.AbstractC4325q;

/* renamed from: r0.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5349m extends AbstractC4325q implements G0.C {

    /* renamed from: s0  reason: collision with root package name */
    public wf.k f44251s0;

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
        d0 o10 = m10.o(j6);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new C0043t(o10, 16, this));
    }

    @Override // G0.C
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.c(this, abstractC0459s, rVar, i10);
    }

    @Override // G0.C
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return E9.f.b(this, abstractC0459s, rVar, i10);
    }

    @Override // l0.AbstractC4325q
    public final boolean q0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f44251s0 + ')';
    }
}
