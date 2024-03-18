package r4;

import id.AbstractC3557B;
import q1.AbstractC5260f;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final h f44440c;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC5260f f44441a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC5260f f44442b;

    static {
        C5365b c5365b = C5365b.f44430h;
        f44440c = new h(c5365b, c5365b);
    }

    public h(AbstractC5260f abstractC5260f, AbstractC5260f abstractC5260f2) {
        this.f44441a = abstractC5260f;
        this.f44442b = abstractC5260f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f44441a, hVar.f44441a) && AbstractC3557B.K(this.f44442b, hVar.f44442b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f44442b.hashCode() + (this.f44441a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f44441a + ", height=" + this.f44442b + ')';
    }
}
