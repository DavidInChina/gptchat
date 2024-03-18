package L8;

import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import n2.C4711b;

/* loaded from: classes2.dex */
public final class k implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final C4711b f10805Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f10806Z = false;

    public k(C4711b c4711b) {
        this.f10805Y = c4711b;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        Type[] typeArr;
        E e10;
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            Bi.c.A0(Map.class.isAssignableFrom(rawType));
            Type L02 = K8.d.L0(type, rawType, K8.d.E0(type, rawType, Map.class), new HashMap());
            typeArr = L02 instanceof ParameterizedType ? ((ParameterizedType) L02).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = typeArr[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            e10 = nVar.f(TypeToken.get(type2));
        } else {
            e10 = A.f10757c;
        }
        return new j(this, nVar, typeArr[0], e10, typeArr[1], nVar.f(TypeToken.get(typeArr[1])), this.f10805Y.g(typeToken));
    }
}
