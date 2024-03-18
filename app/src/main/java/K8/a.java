package K8;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class a implements GenericArrayType, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Type f9534Y;

    public a(Type type) {
        Objects.requireNonNull(type);
        this.f9534Y = d.r0(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && d.z0(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f9534Y;
    }

    public final int hashCode() {
        return this.f9534Y.hashCode();
    }

    public final String toString() {
        return d.T0(this.f9534Y) + "[]";
    }
}
