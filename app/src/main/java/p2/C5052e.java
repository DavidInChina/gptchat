package p2;

import android.media.AudioAttributes;
import android.os.Bundle;
import s2.AbstractC5530A;

/* renamed from: p2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5052e implements AbstractC5057j {

    /* renamed from: l0  reason: collision with root package name */
    public static final C5052e f42005l0 = new C5052e(0, 0, 1, 1, 0);

    /* renamed from: m0  reason: collision with root package name */
    public static final String f42006m0 = Integer.toString(0, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f42007n0 = Integer.toString(1, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f42008o0 = Integer.toString(2, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f42009p0 = Integer.toString(3, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f42010q0 = Integer.toString(4, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f42011Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f42012Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f42013h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f42014i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f42015j0;

    /* renamed from: k0  reason: collision with root package name */
    public J0.a f42016k0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5052e(int i10, int i11, int i12, int i13, int i14) {
        this.f42011Y = i10;
        this.f42012Z = i11;
        this.f42013h0 = i12;
        this.f42014i0 = i13;
        this.f42015j0 = i14;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f42006m0, this.f42011Y);
        bundle.putInt(f42007n0, this.f42012Z);
        bundle.putInt(f42008o0, this.f42013h0);
        bundle.putInt(f42009p0, this.f42014i0);
        bundle.putInt(f42010q0, this.f42015j0);
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, J0.a] */
    public final J0.a b() {
        if (this.f42016k0 == null) {
            ?? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f42011Y).setFlags(this.f42012Z).setUsage(this.f42013h0);
            int i10 = AbstractC5530A.f45131a;
            if (i10 >= 29) {
                AbstractC5050c.a(usage, this.f42014i0);
            }
            if (i10 >= 32) {
                AbstractC5051d.a(usage, this.f42015j0);
            }
            obj.f8729Y = usage.build();
            this.f42016k0 = obj;
        }
        return this.f42016k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5052e.class != obj.getClass()) {
            return false;
        }
        C5052e c5052e = (C5052e) obj;
        if (this.f42011Y == c5052e.f42011Y && this.f42012Z == c5052e.f42012Z && this.f42013h0 == c5052e.f42013h0 && this.f42014i0 == c5052e.f42014i0 && this.f42015j0 == c5052e.f42015j0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f42011Y) * 31) + this.f42012Z) * 31) + this.f42013h0) * 31) + this.f42014i0) * 31) + this.f42015j0;
    }
}
