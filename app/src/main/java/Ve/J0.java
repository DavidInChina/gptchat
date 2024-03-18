package Ve;

import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class J0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f18671a;

    public J0(String str) {
        this.f18671a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J0) && AbstractC3557B.K(this.f18671a, ((J0) obj).f18671a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18671a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.n(new StringBuilder("Cid(value="), this.f18671a, ')');
    }
}
