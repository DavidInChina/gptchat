package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class r0 implements AbstractC5057j {

    /* renamed from: j0  reason: collision with root package name */
    public static final r0 f42253j0 = new r0(1.0f, 0, 0, 0);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f42254k0 = Integer.toString(0, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f42255l0 = Integer.toString(1, 36);

    /* renamed from: m0  reason: collision with root package name */
    public static final String f42256m0 = Integer.toString(2, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42257n0 = Integer.toString(3, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f42258Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f42259Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f42260h0;

    /* renamed from: i0  reason: collision with root package name */
    public final float f42261i0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public r0(float f6, int i10, int i11, int i12) {
        this.f42258Y = i10;
        this.f42259Z = i11;
        this.f42260h0 = i12;
        this.f42261i0 = f6;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f42254k0, this.f42258Y);
        bundle.putInt(f42255l0, this.f42259Z);
        bundle.putInt(f42256m0, this.f42260h0);
        bundle.putFloat(f42257n0, this.f42261i0);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (this.f42258Y == r0Var.f42258Y && this.f42259Z == r0Var.f42259Z && this.f42260h0 == r0Var.f42260h0 && this.f42261i0 == r0Var.f42261i0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f42261i0) + ((((((217 + this.f42258Y) * 31) + this.f42259Z) * 31) + this.f42260h0) * 31);
    }
}
