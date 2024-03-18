package E;

import id.AbstractC3557B;
import l0.AbstractC4311c;

/* loaded from: classes.dex */
public final class D extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC4311c f3760f;

    public D(AbstractC4311c abstractC4311c) {
        this.f3760f = abstractC4311c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof D) && AbstractC3557B.K(this.f3760f, ((D) obj).f3760f)) {
            return true;
        }
        return false;
    }

    @Override // r.f
    public final int f(int i10, Z0.l lVar, E0.d0 d0Var, int i11) {
        return this.f3760f.a(0, i10, lVar);
    }

    public final int hashCode() {
        return this.f3760f.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f3760f + ')';
    }
}
