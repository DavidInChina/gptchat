package com.auth0.android.request.internal;

import I8.E;
import I8.F;
import L8.C0894a;
import L8.w;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
public final class i implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f26735Y;

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        Type type;
        switch (this.f26735Y) {
            case 0:
                return new h(this, nVar.g(this, typeToken), 0).a();
            case 1:
                Type type2 = typeToken.getType();
                boolean z10 = type2 instanceof GenericArrayType;
                if (!z10 && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                    return null;
                }
                if (z10) {
                    type = ((GenericArrayType) type2).getGenericComponentType();
                } else {
                    type = ((Class) type2).getComponentType();
                }
                return new C0894a(nVar, nVar.f(TypeToken.get(type)), K8.d.F0(type));
            case 2:
                if (typeToken.getRawType() != Date.class) {
                    return null;
                }
                return new L8.c();
            case 3:
                Class rawType = typeToken.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new w(rawType);
            case 4:
                if (typeToken.getRawType() != java.sql.Date.class) {
                    return null;
                }
                return new O8.a();
            case 5:
                if (typeToken.getRawType() != Time.class) {
                    return null;
                }
                return new O8.b();
            default:
                if (typeToken.getRawType() != Timestamp.class) {
                    return null;
                }
                nVar.getClass();
                return new O8.c(nVar.f(TypeToken.get(Date.class)));
        }
    }
}
