package E;

import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class B implements F0.d {

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f3734b;

    /* renamed from: c  reason: collision with root package name */
    public A0 f3735c;

    public B(wf.k kVar) {
        this.f3734b = kVar;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // F0.d
    public final void b(F0.h hVar) {
        A0 a02 = (A0) hVar.a(D0.f3761a);
        if (!AbstractC3557B.K(a02, this.f3735c)) {
            this.f3735c = a02;
            this.f3734b.invoke(a02);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        return AbstractC3557B.K(((B) obj).f3734b, this.f3734b);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    public final int hashCode() {
        return this.f3734b.hashCode();
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
