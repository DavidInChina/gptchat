package L8;

import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import n2.C4711b;

/* loaded from: classes2.dex */
public final class b implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10784Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C4711b f10785Z;

    public /* synthetic */ b(C4711b c4711b, int i10) {
        this.f10784Y = i10;
        this.f10785Z = c4711b;
    }

    public static E b(C4711b c4711b, I8.n nVar, TypeToken typeToken, J8.a aVar) {
        E e10;
        I8.q qVar;
        Object i10 = c4711b.g(TypeToken.get(aVar.value())).i();
        boolean nullSafe = aVar.nullSafe();
        if (i10 instanceof E) {
            e10 = (E) i10;
        } else if (i10 instanceof F) {
            e10 = ((F) i10).a(nVar, typeToken);
        } else {
            boolean z10 = i10 instanceof I8.q;
            if (z10) {
                if (z10) {
                    qVar = (I8.q) i10;
                } else {
                    qVar = null;
                }
                e10 = new v(qVar, nVar, typeToken, null, nullSafe);
                nullSafe = false;
            } else {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + i10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
        }
        if (e10 != null && nullSafe) {
            return e10.a();
        }
        return e10;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        Type type;
        int i10 = this.f10784Y;
        C4711b c4711b = this.f10785Z;
        switch (i10) {
            case 0:
                Type type2 = typeToken.getType();
                Class rawType = typeToken.getRawType();
                if (!Collection.class.isAssignableFrom(rawType)) {
                    return null;
                }
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                Bi.c.A0(Collection.class.isAssignableFrom(rawType));
                Type L02 = K8.d.L0(type2, rawType, K8.d.E0(type2, rawType, Collection.class), new HashMap());
                if (L02 instanceof ParameterizedType) {
                    type = ((ParameterizedType) L02).getActualTypeArguments()[0];
                } else {
                    type = Object.class;
                }
                return new com.auth0.android.request.internal.h(nVar, type, nVar.f(TypeToken.get(type)), c4711b.g(typeToken));
            default:
                J8.a aVar = (J8.a) typeToken.getRawType().getAnnotation(J8.a.class);
                if (aVar == null) {
                    return null;
                }
                return b(c4711b, nVar, typeToken, aVar);
        }
    }
}
