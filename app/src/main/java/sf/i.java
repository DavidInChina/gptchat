package Sf;

import bg.AbstractC2198f;
import id.AbstractC3557B;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i extends D implements AbstractC2198f {

    /* renamed from: a  reason: collision with root package name */
    public final Type f16611a;

    /* renamed from: b  reason: collision with root package name */
    public final D f16612b;

    /* renamed from: c  reason: collision with root package name */
    public final kf.v f16613c;

    public i(Type type) {
        D d10;
        D iVar;
        AbstractC3557B.c0("reflectType", type);
        this.f16611a = type;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            AbstractC3557B.b0("getGenericComponentType(...)", genericComponentType);
            boolean z10 = genericComponentType instanceof Class;
            if (z10) {
                Class cls = (Class) genericComponentType;
                if (cls.isPrimitive()) {
                    d10 = new B(cls);
                    this.f16612b = d10;
                    this.f16613c = kf.v.f37483Y;
                }
            }
            if (!(genericComponentType instanceof GenericArrayType) && (!z10 || !((Class) genericComponentType).isArray())) {
                if (genericComponentType instanceof WildcardType) {
                    iVar = new G((WildcardType) genericComponentType);
                } else {
                    iVar = new s(genericComponentType);
                }
            } else {
                iVar = new i(genericComponentType);
            }
        } else {
            if (type instanceof Class) {
                Class cls2 = (Class) type;
                if (cls2.isArray()) {
                    Class<?> componentType = cls2.getComponentType();
                    AbstractC3557B.b0("getComponentType(...)", componentType);
                    if (componentType.isPrimitive()) {
                        iVar = new B(componentType);
                    } else if (!(componentType instanceof GenericArrayType) && !componentType.isArray()) {
                        if (componentType instanceof WildcardType) {
                            iVar = new G((WildcardType) componentType);
                        } else {
                            iVar = new s(componentType);
                        }
                    } else {
                        iVar = new i(componentType);
                    }
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        d10 = iVar;
        this.f16612b = d10;
        this.f16613c = kf.v.f37483Y;
    }

    @Override // Sf.D
    public final Type a() {
        return this.f16611a;
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        return this.f16613c;
    }
}
