package Df;

import id.AbstractC3557B;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: Df.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402a implements GenericArrayType, Type {

    /* renamed from: Y  reason: collision with root package name */
    public final Type f3642Y;

    public C0402a(Type type) {
        AbstractC3557B.c0("elementType", type);
        this.f3642Y = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (AbstractC3557B.K(this.f3642Y, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f3642Y;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return H.m(this.f3642Y) + "[]";
    }

    public final int hashCode() {
        return this.f3642Y.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
