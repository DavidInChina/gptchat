package Gf;

import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class X implements Type {

    /* renamed from: Y  reason: collision with root package name */
    public final Type[] f6373Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f6374Z;

    public X(Type[] typeArr) {
        AbstractC3557B.c0("types", typeArr);
        this.f6373Y = typeArr;
        this.f6374Z = Arrays.hashCode(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            if (Arrays.equals(this.f6373Y, ((X) obj).f6373Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return kf.q.r3(this.f6373Y, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.f6374Z;
    }

    public final String toString() {
        return getTypeName();
    }
}
