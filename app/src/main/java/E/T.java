package E;

import A.AbstractC0044t0;
import E0.AbstractC0459s;
import E0.AbstractC0466z;
import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class T implements AbstractC0466z, F0.d, F0.g {

    /* renamed from: b  reason: collision with root package name */
    public final A0 f3818b;

    /* renamed from: c  reason: collision with root package name */
    public final C1724m0 f3819c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f3820d;

    public T(A0 a02) {
        this.f3818b = a02;
        o1 o1Var = o1.f22665a;
        this.f3819c = AbstractC4828h.Z(a02, o1Var);
        this.f3820d = AbstractC4828h.Z(a02, o1Var);
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // F0.d
    public final void b(F0.h hVar) {
        A0 a02 = (A0) hVar.a(D0.f3761a);
        A0 a03 = this.f3818b;
        this.f3819c.setValue(new F(a03, a02));
        this.f3820d.setValue(new w0(a02, a03));
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
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        C1724m0 c1724m0 = this.f3819c;
        int a5 = ((A0) c1724m0.getValue()).a(p10, p10.getLayoutDirection());
        int c10 = ((A0) c1724m0.getValue()).c(p10);
        int b10 = ((A0) c1724m0.getValue()).b(p10, p10.getLayoutDirection()) + a5;
        int d10 = ((A0) c1724m0.getValue()).d(p10) + c10;
        E0.d0 o10 = m10.o(A7.b.n1(j6, -b10, -d10));
        return p10.j0(A7.b.t0(o10.f4053Y + b10, j6), A7.b.s0(o10.f4054Z + d10, j6), kf.w.f37484Y, new S(o10, a5, c10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        return AbstractC3557B.K(((T) obj).f3818b, this.f3818b);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // F0.g
    public final F0.i getKey() {
        return D0.f3761a;
    }

    @Override // F0.g
    public final Object getValue() {
        return (A0) this.f3820d.getValue();
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.c(this, abstractC0459s, rVar, i10);
    }

    public final int hashCode() {
        return this.f3818b.hashCode();
    }

    @Override // E0.AbstractC0466z
    public final /* synthetic */ int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC0044t0.a(this, abstractC0459s, rVar, i10);
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
