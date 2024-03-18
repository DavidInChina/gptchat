package pg;

import id.AbstractC3557B;

/* renamed from: pg.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5180q extends AbstractC5181r {

    /* renamed from: a  reason: collision with root package name */
    public final C5169f f43157a;

    public C5180q(C5169f c5169f) {
        this.f43157a = c5169f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5180q) && AbstractC3557B.K(this.f43157a, ((C5180q) obj).f43157a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f43157a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f43157a + ')';
    }
}
