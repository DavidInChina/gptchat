package p2;

import android.os.Bundle;
import java.util.Arrays;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class W implements AbstractC5057j {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41940o0 = Integer.toString(0, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41941p0 = Integer.toString(1, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f41942q0 = Integer.toString(2, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f41943r0 = Integer.toString(3, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final String f41944s0 = Integer.toString(4, 36);

    /* renamed from: t0  reason: collision with root package name */
    public static final String f41945t0 = Integer.toString(5, 36);

    /* renamed from: u0  reason: collision with root package name */
    public static final String f41946u0 = Integer.toString(6, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final Object f41947Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f41948Z;

    /* renamed from: h0  reason: collision with root package name */
    public final H f41949h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f41950i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f41951j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f41952k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f41953l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f41954m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f41955n0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public W(Object obj, int i10, H h10, Object obj2, int i11, long j6, long j10, int i12, int i13) {
        this.f41947Y = obj;
        this.f41948Z = i10;
        this.f41949h0 = h10;
        this.f41950i0 = obj2;
        this.f41951j0 = i11;
        this.f41952k0 = j6;
        this.f41953l0 = j10;
        this.f41954m0 = i12;
        this.f41955n0 = i13;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        int i10 = this.f41948Z;
        if (i10 != 0) {
            bundle.putInt(f41940o0, i10);
        }
        H h10 = this.f41949h0;
        if (h10 != null) {
            bundle.putBundle(f41941p0, h10.a());
        }
        int i11 = this.f41951j0;
        if (i11 != 0) {
            bundle.putInt(f41942q0, i11);
        }
        long j6 = this.f41952k0;
        if (j6 != 0) {
            bundle.putLong(f41943r0, j6);
        }
        long j10 = this.f41953l0;
        if (j10 != 0) {
            bundle.putLong(f41944s0, j10);
        }
        int i12 = this.f41954m0;
        if (i12 != -1) {
            bundle.putInt(f41945t0, i12);
        }
        int i13 = this.f41955n0;
        if (i13 != -1) {
            bundle.putInt(f41946u0, i13);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w10 = (W) obj;
        if (this.f41948Z == w10.f41948Z && this.f41951j0 == w10.f41951j0 && this.f41952k0 == w10.f41952k0 && this.f41953l0 == w10.f41953l0 && this.f41954m0 == w10.f41954m0 && this.f41955n0 == w10.f41955n0 && M3.H.O(this.f41949h0, w10.f41949h0) && M3.H.O(this.f41947Y, w10.f41947Y) && M3.H.O(this.f41950i0, w10.f41950i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41947Y, Integer.valueOf(this.f41948Z), this.f41949h0, this.f41950i0, Integer.valueOf(this.f41951j0), Long.valueOf(this.f41952k0), Long.valueOf(this.f41953l0), Integer.valueOf(this.f41954m0), Integer.valueOf(this.f41955n0)});
    }
}
