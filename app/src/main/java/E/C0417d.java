package E;

import E0.AbstractC0442a;
import id.AbstractC3557B;
import q1.AbstractC5260f;

/* renamed from: E.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417d extends AbstractC5260f {

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC0442a f3853h;

    public C0417d(AbstractC0442a abstractC0442a) {
        this.f3853h = abstractC0442a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0417d) && AbstractC3557B.K(this.f3853h, ((C0417d) obj).f3853h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3853h.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.f3853h + ')';
    }
}
