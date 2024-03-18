package p2;

import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class a0 extends Z {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f41976j0 = Integer.toString(1, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f41977k0 = Integer.toString(2, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final Y f41978l0 = new Y(1);

    /* renamed from: h0  reason: collision with root package name */
    public final int f41979h0;

    /* renamed from: i0  reason: collision with root package name */
    public final float f41980i0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public a0(int i10) {
        Gi.e.k("maxStars must be a positive integer", i10 > 0);
        this.f41979h0 = i10;
        this.f41980i0 = -1.0f;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(Z.f41957Y, 2);
        bundle.putInt(f41976j0, this.f41979h0);
        bundle.putFloat(f41977k0, this.f41980i0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f41979h0 != a0Var.f41979h0 || this.f41980i0 != a0Var.f41980i0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41979h0), Float.valueOf(this.f41980i0)});
    }

    public a0(int i10, float f6) {
        boolean z10 = true;
        Gi.e.k("maxStars must be a positive integer", i10 > 0);
        Gi.e.k("starRating is out of range [0, maxStars]", (f6 < 0.0f || f6 > ((float) i10)) ? false : z10);
        this.f41979h0 = i10;
        this.f41980i0 = f6;
    }
}
