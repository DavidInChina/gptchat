package dh;

import id.AbstractC3557B;
import java.util.Map;
import xf.AbstractC6438a;

/* loaded from: classes2.dex */
public final class T implements Map.Entry, AbstractC6438a {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f28419Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f28420Z;

    public T(Object obj, Object obj2) {
        this.f28419Y = obj;
        this.f28420Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t10 = (T) obj;
        if (AbstractC3557B.K(this.f28419Y, t10.f28419Y) && AbstractC3557B.K(this.f28420Z, t10.f28420Z)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28419Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28420Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f28419Y;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = i10 * 31;
        Object obj2 = this.f28420Z;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i12 + i11;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f28419Y + ", value=" + this.f28420Z + ')';
    }
}
