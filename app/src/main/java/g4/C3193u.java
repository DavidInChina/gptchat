package g4;

import A.AbstractC0044t0;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import E0.M;
import E0.O;
import E0.P;
import E0.d0;
import Qg.F0;
import Qg.s0;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import nf.AbstractC4825e;
import y.D;

/* renamed from: g4.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3193u implements r4.i, AbstractC0466z {

    /* renamed from: b  reason: collision with root package name */
    public final F0 f31260b = s0.c(new Z0.a(AbstractC3172A.f31190a));

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.e(this, abstractC0459s, rVar, i10);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.g(this, abstractC0459s, rVar, i10);
    }

    @Override // E0.AbstractC0466z
    public final O e(P p10, M m10, long j6) {
        this.f31260b.setValue(new Z0.a(j6));
        d0 o10 = m10.o(j6);
        return p10.j0(o10.f4053Y, o10.f4054Z, kf.w.f37484Y, new D(o10, 15));
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.c(this, abstractC0459s, rVar, i10);
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.a(this, abstractC0459s, rVar, i10);
    }

    @Override // r4.i
    public final Object j(AbstractC4825e abstractC4825e) {
        return L4.a.m0(new M1.w(this.f31260b, 2), abstractC4825e);
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
