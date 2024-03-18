package Z;

import id.AbstractC3557B;

/* renamed from: Z.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716i0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f22646a;

    public C1716i0(String str) {
        this.f22646a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1716i0) && AbstractC3557B.K(this.f22646a, ((C1716i0) obj).f22646a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22646a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("OpaqueKey(key="), this.f22646a, ')');
    }
}
