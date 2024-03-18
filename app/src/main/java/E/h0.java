package E;

import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import nf.AbstractC4828h;

/* loaded from: classes.dex */
public final class h0 implements F0.d, F0.g {

    /* renamed from: b  reason: collision with root package name */
    public final C1724m0 f3871b = AbstractC4828h.Z(new I(), o1.f22665a);

    /* renamed from: c  reason: collision with root package name */
    public final g0 f3872c;

    public h0(g0 g0Var) {
        this.f3872c = g0Var;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // F0.d
    public final void b(F0.h hVar) {
        this.f3871b.setValue(new C0411a(new j0(this.f3872c), (A0) hVar.a(D0.f3761a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        return AbstractC3557B.K(((h0) obj).f3872c, this.f3872c);
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
        return (A0) this.f3871b.getValue();
    }

    public final int hashCode() {
        return this.f3872c.hashCode();
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
