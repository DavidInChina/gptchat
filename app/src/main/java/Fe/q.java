package Fe;

import id.AbstractC3557B;
import java.util.Map;
import xf.AbstractC6441d;

/* loaded from: classes2.dex */
public final class q implements Map.Entry, AbstractC6441d {

    /* renamed from: Y  reason: collision with root package name */
    public final Object f5345Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f5346Z;

    public q(Object obj, Object obj2) {
        this.f5345Y = obj;
        this.f5346Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!AbstractC3557B.K(entry.getKey(), this.f5345Y) || !AbstractC3557B.K(entry.getValue(), this.f5346Z)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5345Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5346Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5345Y;
        AbstractC3557B.Z(obj);
        Object obj2 = this.f5346Z;
        AbstractC3557B.Z(obj2);
        return obj2.hashCode() + obj.hashCode() + 527;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5346Z = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5345Y);
        sb2.append('=');
        sb2.append(this.f5346Z);
        return sb2.toString();
    }
}
