package Sf;

import bg.AbstractC2209q;
import id.AbstractC3557B;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class G extends D implements AbstractC2209q {

    /* renamed from: a  reason: collision with root package name */
    public final WildcardType f16597a;

    /* renamed from: b  reason: collision with root package name */
    public final kf.v f16598b = kf.v.f37483Y;

    public G(WildcardType wildcardType) {
        AbstractC3557B.c0("reflectType", wildcardType);
        this.f16597a = wildcardType;
    }

    @Override // Sf.D
    public final Type a() {
        return this.f16597a;
    }

    public final D b() {
        D iVar;
        WildcardType wildcardType = this.f16597a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length <= 1 && lowerBounds.length <= 1) {
            if (lowerBounds.length == 1) {
                Object v32 = kf.q.v3(lowerBounds);
                AbstractC3557B.b0("single(...)", v32);
                Type type = (Type) v32;
                boolean z10 = type instanceof Class;
                if (z10) {
                    Class cls = (Class) type;
                    if (cls.isPrimitive()) {
                        return new B(cls);
                    }
                }
                if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                    if (type instanceof WildcardType) {
                        iVar = new G((WildcardType) type);
                    } else {
                        iVar = new s(type);
                    }
                } else {
                    iVar = new i(type);
                }
            } else {
                if (upperBounds.length == 1) {
                    Type type2 = (Type) kf.q.v3(upperBounds);
                    if (!AbstractC3557B.K(type2, Object.class)) {
                        AbstractC3557B.Z(type2);
                        boolean z11 = type2 instanceof Class;
                        if (z11) {
                            Class cls2 = (Class) type2;
                            if (cls2.isPrimitive()) {
                                return new B(cls2);
                            }
                        }
                        if (!(type2 instanceof GenericArrayType) && (!z11 || !((Class) type2).isArray())) {
                            if (type2 instanceof WildcardType) {
                                iVar = new G((WildcardType) type2);
                            } else {
                                iVar = new s(type2);
                            }
                        } else {
                            iVar = new i(type2);
                        }
                    }
                }
                return null;
            }
            return iVar;
        }
        throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        return this.f16598b;
    }
}
