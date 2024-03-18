package K8;

import android.gov.nist.core.Separators;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes2.dex */
public final class c implements WildcardType, Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Type f9538Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Type f9539Z;

    public c(Type[] typeArr, Type[] typeArr2) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (typeArr2.length <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        Bi.c.A0(z10);
        if (typeArr.length == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Bi.c.A0(z11);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            d.s0(typeArr2[0]);
            Bi.c.A0(typeArr[0] != Object.class ? false : z12);
            this.f9539Z = d.r0(typeArr2[0]);
            this.f9538Y = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        d.s0(typeArr[0]);
        this.f9539Z = null;
        this.f9538Y = d.r0(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && d.z0(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f9539Z;
        return type != null ? new Type[]{type} : d.f9540a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f9538Y};
    }

    public final int hashCode() {
        int i10;
        Type type = this.f9539Z;
        if (type != null) {
            i10 = type.hashCode() + 31;
        } else {
            i10 = 1;
        }
        return i10 ^ (this.f9538Y.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f9539Z;
        if (type != null) {
            return "? super " + d.T0(type);
        }
        Type type2 = this.f9538Y;
        if (type2 == Object.class) {
            return Separators.QUESTION;
        }
        return "? extends " + d.T0(type2);
    }
}
