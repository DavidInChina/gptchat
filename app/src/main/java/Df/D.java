package Df;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D implements ParameterizedType, Type {

    /* renamed from: Y  reason: collision with root package name */
    public final Class f3628Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Type f3629Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Type[] f3630h0;

    public D(Class cls, Type type, ArrayList arrayList) {
        this.f3628Y = cls;
        this.f3629Z = type;
        this.f3630h0 = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (AbstractC3557B.K(this.f3628Y, parameterizedType.getRawType()) && AbstractC3557B.K(this.f3629Z, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f3630h0, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f3630h0;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f3629Z;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f3628Y;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f3628Y;
        Type type = this.f3629Z;
        if (type != null) {
            sb2.append(H.m(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(H.m(cls));
        }
        Type[] typeArr = this.f3630h0;
        if (typeArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            kf.q.p3(typeArr, sb2, ", ", Separators.LESS_THAN, Separators.GREATER_THAN, -1, "...", C.f3627Y);
        }
        String sb3 = sb2.toString();
        AbstractC3557B.b0("toString(...)", sb3);
        return sb3;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f3628Y.hashCode();
        Type type = this.f3629Z;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return (hashCode ^ i10) ^ Arrays.hashCode(this.f3630h0);
    }

    public final String toString() {
        return getTypeName();
    }
}
