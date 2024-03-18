package g4;

import id.AbstractC3557B;
import u0.AbstractC5824b;

/* renamed from: g4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3179g extends AbstractC3181i {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5824b f31221a;

    public C3179g(AbstractC5824b abstractC5824b) {
        this.f31221a = abstractC5824b;
    }

    @Override // g4.AbstractC3181i
    public final AbstractC5824b a() {
        return this.f31221a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3179g) && AbstractC3557B.K(this.f31221a, ((C3179g) obj).f31221a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC5824b abstractC5824b = this.f31221a;
        if (abstractC5824b == null) {
            return 0;
        }
        return abstractC5824b.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f31221a + ')';
    }
}
