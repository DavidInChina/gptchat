package E;

import id.AbstractC3557B;
import l0.AbstractC4312d;
import l0.C4317i;

/* loaded from: classes.dex */
public final class E extends r.f {

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC4312d f3762f;

    public E(AbstractC4312d abstractC4312d) {
        this.f3762f = abstractC4312d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof E) && AbstractC3557B.K(this.f3762f, ((E) obj).f3762f)) {
            return true;
        }
        return false;
    }

    @Override // r.f
    public final int f(int i10, Z0.l lVar, E0.d0 d0Var, int i11) {
        return ((C4317i) this.f3762f).a(0, i10);
    }

    public final int hashCode() {
        return Float.floatToIntBits(((C4317i) this.f3762f).f37711a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f3762f + ')';
    }
}
