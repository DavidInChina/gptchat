package Sf;

import bg.AbstractC2193a;
import bg.AbstractC2196d;
import bg.AbstractC2201i;
import id.AbstractC3557B;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.C4291c;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class s extends D implements AbstractC2201i {

    /* renamed from: a  reason: collision with root package name */
    public final Type f16623a;

    /* renamed from: b  reason: collision with root package name */
    public final u f16624b;

    public s(Type type) {
        u uVar;
        AbstractC3557B.c0("reflectType", type);
        this.f16623a = type;
        if (type instanceof Class) {
            uVar = new q((Class) type);
        } else if (type instanceof TypeVariable) {
            uVar = new E((TypeVariable) type);
        } else if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC3557B.a0("null cannot be cast to non-null type java.lang.Class<*>", rawType);
            uVar = new q((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
        }
        this.f16624b = uVar;
    }

    @Override // Sf.D
    public final Type a() {
        return this.f16623a;
    }

    public final ArrayList b() {
        AbstractC2196d abstractC2196d;
        AbstractC2196d abstractC2196d2;
        List<Type> c10 = AbstractC1385d.c(this.f16623a);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(c10, 10));
        for (Type type : c10) {
            AbstractC3557B.c0("type", type);
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    abstractC2196d = new B(cls);
                    arrayList.add(abstractC2196d);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    abstractC2196d2 = new G((WildcardType) type);
                } else {
                    abstractC2196d2 = new s(type);
                }
            } else {
                abstractC2196d2 = new i(type);
            }
            abstractC2196d = abstractC2196d2;
            arrayList.add(abstractC2196d);
        }
        return arrayList;
    }

    public final boolean c() {
        boolean z10;
        Type type = this.f16623a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        AbstractC3557B.b0("getTypeParameters(...)", typeParameters);
        if (typeParameters.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(!z10)) {
            return false;
        }
        return true;
    }

    @Override // bg.AbstractC2196d
    public final Collection getAnnotations() {
        return kf.v.f37483Y;
    }

    @Override // Sf.D, bg.AbstractC2196d
    public final AbstractC2193a l(C4291c c4291c) {
        AbstractC3557B.c0("fqName", c4291c);
        return null;
    }
}
