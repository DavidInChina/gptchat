package E0;

import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class Z extends H0.Q implements Y {

    /* renamed from: e  reason: collision with root package name */
    public final wf.k f4045e;

    /* renamed from: f  reason: collision with root package name */
    public long f4046f = Ng.H.c(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public Z(wf.k kVar) {
        this.f4045e = kVar;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        return AbstractC3557B.K(this.f4045e, ((Z) obj).f4045e);
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    public final int hashCode() {
        return this.f4045e.hashCode();
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
