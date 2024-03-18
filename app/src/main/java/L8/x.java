package L8;

import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes2.dex */
public final class x implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10853Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f10854Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ E f10855h0;

    public /* synthetic */ x(Object obj, E e10, int i10) {
        this.f10853Y = i10;
        this.f10854Z = obj;
        this.f10855h0 = e10;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        int i10 = this.f10853Y;
        E e10 = this.f10855h0;
        Object obj = this.f10854Z;
        switch (i10) {
            case 0:
                if (typeToken.getRawType() != ((Class) obj)) {
                    return null;
                }
                return e10;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (!((Class) obj).isAssignableFrom(rawType)) {
                    return null;
                }
                return new com.auth0.android.request.internal.h(this, rawType, 3);
            default:
                if (!typeToken.equals((TypeToken) obj)) {
                    return null;
                }
                return e10;
        }
    }

    public final String toString() {
        int i10 = this.f10853Y;
        E e10 = this.f10855h0;
        Object obj = this.f10854Z;
        switch (i10) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + e10 + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + e10 + "]";
            default:
                return super.toString();
        }
    }
}
