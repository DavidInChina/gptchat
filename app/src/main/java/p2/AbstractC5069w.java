package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* renamed from: p2.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5069w implements AbstractC5057j {

    /* renamed from: k0  reason: collision with root package name */
    public static final C5070x f42343k0 = new AbstractC5069w(new C5068v());

    /* renamed from: l0  reason: collision with root package name */
    public static final String f42344l0 = Integer.toString(0, 36);

    /* renamed from: m0  reason: collision with root package name */
    public static final String f42345m0 = Integer.toString(1, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42346n0 = Integer.toString(2, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f42347o0 = Integer.toString(3, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f42348p0 = Integer.toString(4, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final A9.a f42349q0 = new A9.a(17);

    /* renamed from: Y  reason: collision with root package name */
    public final long f42350Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f42351Z;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f42352h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f42353i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f42354j0;

    /* JADX WARN: Type inference failed for: r1v0, types: [p2.w, p2.x] */
    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public AbstractC5069w(C5068v c5068v) {
        this.f42350Y = c5068v.f42338a;
        this.f42351Z = c5068v.f42339b;
        this.f42352h0 = c5068v.f42340c;
        this.f42353i0 = c5068v.f42341d;
        this.f42354j0 = c5068v.f42342e;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        C5070x c5070x = f42343k0;
        long j6 = c5070x.f42350Y;
        long j10 = this.f42350Y;
        if (j10 != j6) {
            bundle.putLong(f42344l0, j10);
        }
        long j11 = this.f42351Z;
        if (j11 != c5070x.f42351Z) {
            bundle.putLong(f42345m0, j11);
        }
        boolean z10 = c5070x.f42352h0;
        boolean z11 = this.f42352h0;
        if (z11 != z10) {
            bundle.putBoolean(f42346n0, z11);
        }
        boolean z12 = c5070x.f42353i0;
        boolean z13 = this.f42353i0;
        if (z13 != z12) {
            bundle.putBoolean(f42347o0, z13);
        }
        boolean z14 = c5070x.f42354j0;
        boolean z15 = this.f42354j0;
        if (z15 != z14) {
            bundle.putBoolean(f42348p0, z15);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC5069w)) {
            return false;
        }
        AbstractC5069w abstractC5069w = (AbstractC5069w) obj;
        if (this.f42350Y == abstractC5069w.f42350Y && this.f42351Z == abstractC5069w.f42351Z && this.f42352h0 == abstractC5069w.f42352h0 && this.f42353i0 == abstractC5069w.f42353i0 && this.f42354j0 == abstractC5069w.f42354j0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f42350Y;
        long j10 = this.f42351Z;
        return (((((((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f42352h0 ? 1 : 0)) * 31) + (this.f42353i0 ? 1 : 0)) * 31) + (this.f42354j0 ? 1 : 0);
    }
}
