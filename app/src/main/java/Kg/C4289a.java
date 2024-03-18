package kg;

import Lg.n;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: kg.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4289a {

    /* renamed from: a  reason: collision with root package name */
    public final C4291c f37491a;

    /* renamed from: b  reason: collision with root package name */
    public final C4294f f37492b;

    static {
        C4291c.j(AbstractC4296h.f37516f);
    }

    public C4289a(C4291c c4291c, C4294f c4294f) {
        AbstractC3557B.c0("packageName", c4291c);
        this.f37491a = c4291c;
        this.f37492b = c4294f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4289a)) {
            return false;
        }
        C4289a c4289a = (C4289a) obj;
        if (AbstractC3557B.K(this.f37491a, c4289a.f37491a) && AbstractC3557B.K(null, null) && AbstractC3557B.K(this.f37492b, c4289a.f37492b) && AbstractC3557B.K(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f37492b.hashCode() + (this.f37491a.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = n.z2(this.f37491a.b(), '.', '/') + Separators.SLASH + this.f37492b;
        AbstractC3557B.b0("toString(...)", str);
        return str;
    }
}
