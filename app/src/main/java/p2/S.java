package p2;

import android.os.Bundle;
import java.util.Locale;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class S implements AbstractC5057j {

    /* renamed from: i0  reason: collision with root package name */
    public static final S f41931i0 = new S(1.0f, 1.0f);

    /* renamed from: j0  reason: collision with root package name */
    public static final String f41932j0 = Integer.toString(0, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f41933k0 = Integer.toString(1, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final float f41934Y;

    /* renamed from: Z  reason: collision with root package name */
    public final float f41935Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f41936h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public S(float f6, float f10) {
        boolean z10;
        boolean z11 = true;
        if (f6 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.l(z10);
        Gi.e.l(f10 <= 0.0f ? false : z11);
        this.f41934Y = f6;
        this.f41935Z = f10;
        this.f41936h0 = Math.round(f6 * 1000.0f);
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(f41932j0, this.f41934Y);
        bundle.putFloat(f41933k0, this.f41935Z);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s10 = (S) obj;
        if (this.f41934Y == s10.f41934Y && this.f41935Z == s10.f41935Z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f41935Z) + ((Float.floatToRawIntBits(this.f41934Y) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f41934Y), Float.valueOf(this.f41935Z)};
        int i10 = AbstractC5530A.f45131a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
