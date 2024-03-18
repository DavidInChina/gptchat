package androidx.compose.foundation.layout;

import E.AbstractC0438w;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4318j;

/* loaded from: classes.dex */
public final class d implements AbstractC0438w {

    /* renamed from: a  reason: collision with root package name */
    public final Z0.b f24735a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24736b;

    public d(Z0.b bVar, long j6) {
        this.f24735a = bVar;
        this.f24736b = j6;
    }

    @Override // E.AbstractC0438w
    public final AbstractC4326r a(AbstractC4326r abstractC4326r, C4318j c4318j) {
        return abstractC4326r.g(new BoxChildDataElement(c4318j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3557B.K(this.f24735a, dVar.f24735a) && Z0.a.b(this.f24736b, dVar.f24736b);
    }

    public final int hashCode() {
        long j6 = this.f24736b;
        return ((int) (j6 ^ (j6 >>> 32))) + (this.f24735a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f24735a + ", constraints=" + ((Object) Z0.a.k(this.f24736b)) + ')';
    }
}
