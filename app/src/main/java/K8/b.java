package K8;

import android.gov.nist.core.Separators;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements ParameterizedType, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Type f9535Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Type f9536Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Type[] f9537h0;

    public b(Type type, Type type2, Type... typeArr) {
        Type type3;
        boolean z10;
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z11 = true;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (type == null && !z10) {
                z11 = false;
            }
            Bi.c.A0(z11);
        }
        if (type == null) {
            type3 = null;
        } else {
            type3 = d.r0(type);
        }
        this.f9535Y = type3;
        this.f9536Z = d.r0(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f9537h0 = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f9537h0[i10]);
            d.s0(this.f9537h0[i10]);
            Type[] typeArr3 = this.f9537h0;
            typeArr3[i10] = d.r0(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && d.z0(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f9537h0.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f9535Y;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f9536Z;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f9537h0) ^ this.f9536Z.hashCode();
        Type type = this.f9535Y;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        Type[] typeArr = this.f9537h0;
        int length = typeArr.length;
        Type type = this.f9536Z;
        if (length == 0) {
            return d.T0(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(d.T0(type));
        sb2.append(Separators.LESS_THAN);
        sb2.append(d.T0(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(d.T0(typeArr[i10]));
        }
        sb2.append(Separators.GREATER_THAN);
        return sb2.toString();
    }
}
