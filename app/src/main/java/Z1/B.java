package Z1;

import id.AbstractC3557B;
import j2.AbstractC3905g;
import j2.C3901c;

/* loaded from: classes.dex */
public final class B implements X1.l {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC3905g f22817b;

    public B(C3901c c3901c) {
        this.f22817b = c3901c;
    }

    @Override // X1.m
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // X1.m
    public final boolean b(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final boolean c() {
        return ((Boolean) r.f23086Z.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final /* synthetic */ X1.m d(X1.m mVar) {
        return R.a.c(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof B) && AbstractC3557B.K(this.f22817b, ((B) obj).f22817b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22817b.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f22817b + ')';
    }
}
