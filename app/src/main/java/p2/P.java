package p2;

import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class P extends Z {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f41921i0 = Integer.toString(1, 36);

    /* renamed from: j0  reason: collision with root package name */
    public static final A9.a f41922j0 = new A9.a(25);

    /* renamed from: h0  reason: collision with root package name */
    public final float f41923h0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public P() {
        this.f41923h0 = -1.0f;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(Z.f41957Y, 1);
        bundle.putFloat(f41921i0, this.f41923h0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof P)) {
            return false;
        }
        if (this.f41923h0 != ((P) obj).f41923h0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41923h0)});
    }

    public P(float f6) {
        Gi.e.k("percent must be in the range of [0, 100]", f6 >= 0.0f && f6 <= 100.0f);
        this.f41923h0 = f6;
    }
}
