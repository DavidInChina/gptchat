package L8;

import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes2.dex */
public final class y implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10856Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Class f10857Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Class f10858h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ E f10859i0;

    public /* synthetic */ y(Class cls, Class cls2, E e10, int i10) {
        this.f10856Y = i10;
        this.f10857Z = cls;
        this.f10858h0 = cls2;
        this.f10859i0 = e10;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        int i10 = this.f10856Y;
        E e10 = this.f10859i0;
        Class cls = this.f10858h0;
        Class cls2 = this.f10857Z;
        switch (i10) {
            case 0:
                Class rawType = typeToken.getRawType();
                if (rawType != cls2 && rawType != cls) {
                    return null;
                }
                return e10;
            default:
                Class rawType2 = typeToken.getRawType();
                if (rawType2 != cls2 && rawType2 != cls) {
                    return null;
                }
                return e10;
        }
    }

    public final String toString() {
        int i10 = this.f10856Y;
        E e10 = this.f10859i0;
        Class cls = this.f10858h0;
        Class cls2 = this.f10857Z;
        switch (i10) {
            case 0:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + e10 + "]";
            default:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + e10 + "]";
        }
    }
}
