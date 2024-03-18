package L8;

import I8.E;
import I8.F;
import com.google.gson.reflect.TypeToken;

/* loaded from: classes2.dex */
public final class u implements F {

    /* renamed from: Y  reason: collision with root package name */
    public final TypeToken f10838Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f10839Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Class f10840h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public final I8.q f10841i0;

    public u(I8.q qVar, TypeToken typeToken, boolean z10) {
        this.f10841i0 = qVar;
        this.f10838Y = typeToken;
        this.f10839Z = z10;
    }

    @Override // I8.F
    public final E a(I8.n nVar, TypeToken typeToken) {
        TypeToken typeToken2 = this.f10838Y;
        if (typeToken2 == null ? this.f10840h0.isAssignableFrom(typeToken.getRawType()) : !(!typeToken2.equals(typeToken) && (!this.f10839Z || typeToken2.getType() != typeToken.getRawType()))) {
            return new v(this.f10841i0, nVar, typeToken, this, true);
        }
        return null;
    }
}
