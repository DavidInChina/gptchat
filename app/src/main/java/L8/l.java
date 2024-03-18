package L8;

import I8.D;
import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes2.dex */
public final class l implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10807Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f10808Z;

    public /* synthetic */ l(int i10, Object obj) {
        this.f10807Y = i10;
        this.f10808Z = obj;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        int i10 = this.f10807Y;
        Object obj = this.f10808Z;
        switch (i10) {
            case 0:
                if (typeToken.getRawType() != Number.class) {
                    return null;
                }
                return (m) obj;
            default:
                if (typeToken.getRawType() != Object.class) {
                    return null;
                }
                return new n(nVar, (D) obj);
        }
    }
}
