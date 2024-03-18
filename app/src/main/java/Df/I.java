package Df;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class I implements WildcardType, Type {

    /* renamed from: h0  reason: collision with root package name */
    public static final I f3639h0 = new I(null, null);

    /* renamed from: Y  reason: collision with root package name */
    public final Type f3640Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Type f3641Z;

    public I(Type type, Type type2) {
        this.f3640Y = type;
        this.f3641Z = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f3641Z;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f3641Z;
        if (type != null) {
            return "? super " + H.m(type);
        }
        Type type2 = this.f3640Y;
        if (type2 != null && !AbstractC3557B.K(type2, Object.class)) {
            return "? extends " + H.m(type2);
        }
        return Separators.QUESTION;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f3640Y;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
