package Z;

import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final Object f22575a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f22576b;

    public V(Integer num, Object obj) {
        this.f22575a = num;
        this.f22576b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        if (AbstractC3557B.K(this.f22575a, v10.f22575a) && AbstractC3557B.K(this.f22576b, v10.f22576b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Object obj = this.f22575a;
        int i11 = 0;
        if (obj instanceof Enum) {
            i10 = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        Object obj2 = this.f22576b;
        if (obj2 instanceof Enum) {
            i11 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i11 + i12;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f22575a + ", right=" + this.f22576b + ')';
    }
}
