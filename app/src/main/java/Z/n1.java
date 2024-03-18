package Z;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class n1 implements l1 {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f22661Y;

    public n1(Object obj) {
        this.f22661Y = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n1) && AbstractC3557B.K(this.f22661Y, ((n1) obj).f22661Y)) {
            return true;
        }
        return false;
    }

    @Override // Z.l1
    public final Object getValue() {
        return this.f22661Y;
    }

    public final int hashCode() {
        Object obj = this.f22661Y;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f22661Y + ')';
    }
}
