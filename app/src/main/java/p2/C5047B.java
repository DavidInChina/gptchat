package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* renamed from: p2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5047B implements AbstractC5057j {

    /* renamed from: k0  reason: collision with root package name */
    public static final C5047B f41739k0 = new C5047B(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f41740l0 = Integer.toString(0, 36);

    /* renamed from: m0  reason: collision with root package name */
    public static final String f41741m0 = Integer.toString(1, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f41742n0 = Integer.toString(2, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41743o0 = Integer.toString(3, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41744p0 = Integer.toString(4, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final A9.a f41745q0 = new A9.a(19);

    /* renamed from: Y  reason: collision with root package name */
    public final long f41746Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f41747Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long f41748h0;

    /* renamed from: i0  reason: collision with root package name */
    public final float f41749i0;

    /* renamed from: j0  reason: collision with root package name */
    public final float f41750j0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5047B(long j6, long j10, long j11, float f6, float f10) {
        this.f41746Y = j6;
        this.f41747Z = j10;
        this.f41748h0 = j11;
        this.f41749i0 = f6;
        this.f41750j0 = f10;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        long j6 = this.f41746Y;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(f41740l0, j6);
        }
        long j10 = this.f41747Z;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f41741m0, j10);
        }
        long j11 = this.f41748h0;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f41742n0, j11);
        }
        float f6 = this.f41749i0;
        if (f6 != -3.4028235E38f) {
            bundle.putFloat(f41743o0, f6);
        }
        float f10 = this.f41750j0;
        if (f10 != -3.4028235E38f) {
            bundle.putFloat(f41744p0, f10);
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p2.A, java.lang.Object] */
    public final C5046A b() {
        ?? obj = new Object();
        obj.f41734a = this.f41746Y;
        obj.f41735b = this.f41747Z;
        obj.f41736c = this.f41748h0;
        obj.f41737d = this.f41749i0;
        obj.f41738e = this.f41750j0;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5047B)) {
            return false;
        }
        C5047B c5047b = (C5047B) obj;
        if (this.f41746Y == c5047b.f41746Y && this.f41747Z == c5047b.f41747Z && this.f41748h0 == c5047b.f41748h0 && this.f41749i0 == c5047b.f41749i0 && this.f41750j0 == c5047b.f41750j0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j6 = this.f41746Y;
        long j10 = this.f41747Z;
        long j11 = this.f41748h0;
        int i11 = ((((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f6 = this.f41749i0;
        int i12 = 0;
        if (f6 != 0.0f) {
            i10 = Float.floatToIntBits(f6);
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        float f10 = this.f41750j0;
        if (f10 != 0.0f) {
            i12 = Float.floatToIntBits(f10);
        }
        return i13 + i12;
    }
}
