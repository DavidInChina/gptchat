package t0;

import id.AbstractC3557B;
import q0.C5254f;
import r0.AbstractC5352p;

/* renamed from: t0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5642a {

    /* renamed from: a  reason: collision with root package name */
    public Z0.b f45605a;

    /* renamed from: b  reason: collision with root package name */
    public Z0.l f45606b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC5352p f45607c;

    /* renamed from: d  reason: collision with root package name */
    public long f45608d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5642a)) {
            return false;
        }
        C5642a c5642a = (C5642a) obj;
        if (AbstractC3557B.K(this.f45605a, c5642a.f45605a) && this.f45606b == c5642a.f45606b && AbstractC3557B.K(this.f45607c, c5642a.f45607c) && C5254f.a(this.f45608d, c5642a.f45608d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f45606b.hashCode();
        int hashCode2 = this.f45607c.hashCode();
        return C5254f.e(this.f45608d) + ((hashCode2 + ((hashCode + (this.f45605a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f45605a + ", layoutDirection=" + this.f45606b + ", canvas=" + this.f45607c + ", size=" + ((Object) C5254f.g(this.f45608d)) + ')';
    }
}
