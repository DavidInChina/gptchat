package g4;

import id.AbstractC3557B;
import u0.AbstractC5824b;

/* renamed from: g4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3180h extends AbstractC3181i {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5824b f31222a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.q f31223b;

    public C3180h(AbstractC5824b abstractC5824b, q4.q qVar) {
        this.f31222a = abstractC5824b;
        this.f31223b = qVar;
    }

    @Override // g4.AbstractC3181i
    public final AbstractC5824b a() {
        return this.f31222a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3180h)) {
            return false;
        }
        C3180h c3180h = (C3180h) obj;
        if (AbstractC3557B.K(this.f31222a, c3180h.f31222a) && AbstractC3557B.K(this.f31223b, c3180h.f31223b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f31223b.hashCode() + (this.f31222a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f31222a + ", result=" + this.f31223b + ')';
    }
}
