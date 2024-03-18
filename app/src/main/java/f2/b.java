package f2;

import X1.l;
import X1.m;
import Z1.r;
import id.AbstractC3557B;
import wf.k;
import wf.n;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: b  reason: collision with root package name */
    public final C2934a f29524b;

    public b(C2934a c2934a) {
        this.f29524b = c2934a;
    }

    @Override // X1.m
    public final Object a(Object obj, n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // X1.m
    public final boolean b(k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final boolean c() {
        return ((Boolean) r.f23086Z.invoke(this)).booleanValue();
    }

    @Override // X1.m
    public final /* synthetic */ m d(m mVar) {
        return R.a.c(this, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && AbstractC3557B.K(this.f29524b, ((b) obj).f29524b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29524b.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.f29524b + ')';
    }
}
