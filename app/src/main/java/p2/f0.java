package p2;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class f0 implements AbstractC5057j {

    /* renamed from: A0  reason: collision with root package name */
    public static final String f42029A0;

    /* renamed from: B0  reason: collision with root package name */
    public static final String f42030B0;

    /* renamed from: C0  reason: collision with root package name */
    public static final String f42031C0;

    /* renamed from: D0  reason: collision with root package name */
    public static final String f42032D0;

    /* renamed from: E0  reason: collision with root package name */
    public static final String f42033E0;

    /* renamed from: F0  reason: collision with root package name */
    public static final String f42034F0;

    /* renamed from: G0  reason: collision with root package name */
    public static final String f42035G0;

    /* renamed from: H0  reason: collision with root package name */
    public static final String f42036H0;

    /* renamed from: I0  reason: collision with root package name */
    public static final String f42037I0;

    /* renamed from: J0  reason: collision with root package name */
    public static final String f42038J0;

    /* renamed from: K0  reason: collision with root package name */
    public static final String f42039K0;

    /* renamed from: L0  reason: collision with root package name */
    public static final String f42040L0;

    /* renamed from: w0  reason: collision with root package name */
    public static final Object f42041w0 = new Object();

    /* renamed from: x0  reason: collision with root package name */
    public static final Object f42042x0 = new Object();

    /* renamed from: y0  reason: collision with root package name */
    public static final H f42043y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final String f42044z0;

    /* renamed from: Z  reason: collision with root package name */
    public Object f42046Z;

    /* renamed from: i0  reason: collision with root package name */
    public Object f42048i0;

    /* renamed from: j0  reason: collision with root package name */
    public long f42049j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f42050k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f42051l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f42052m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f42053n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f42054o0;

    /* renamed from: p0  reason: collision with root package name */
    public C5047B f42055p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f42056q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f42057r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f42058s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f42059t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f42060u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f42061v0;

    /* renamed from: Y  reason: collision with root package name */
    public Object f42045Y = f42041w0;

    /* renamed from: h0  reason: collision with root package name */
    public H f42047h0 = f42043y0;

    /* JADX WARN: Type inference failed for: r12v0, types: [p2.w, p2.x] */
    static {
        boolean z10;
        C c10;
        C5068v c5068v = new C5068v();
        C5071y c5071y = new C5071y();
        List emptyList = Collections.emptyList();
        x8.k0 k0Var = x8.k0.f49573j0;
        D d10 = D.f41769i0;
        Uri uri = Uri.EMPTY;
        if (((Uri) c5071y.f42360e) != null && ((UUID) c5071y.f42359d) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.n(z10);
        C5072z c5072z = null;
        if (uri != null) {
            if (((UUID) c5071y.f42359d) != null) {
                c5072z = new C5072z(c5071y);
            }
            c10 = new C(uri, null, c5072z, null, emptyList, null, k0Var, null, -9223372036854775807L);
        } else {
            c10 = null;
        }
        f42043y0 = new H("androidx.media3.common.Timeline", new AbstractC5069w(c5068v), c10, new C5047B(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), K.f41848N0, d10);
        int i10 = AbstractC5530A.f45131a;
        f42044z0 = Integer.toString(1, 36);
        f42029A0 = Integer.toString(2, 36);
        f42030B0 = Integer.toString(3, 36);
        f42031C0 = Integer.toString(4, 36);
        f42032D0 = Integer.toString(5, 36);
        f42033E0 = Integer.toString(6, 36);
        f42034F0 = Integer.toString(7, 36);
        f42035G0 = Integer.toString(8, 36);
        f42036H0 = Integer.toString(9, 36);
        f42037I0 = Integer.toString(10, 36);
        f42038J0 = Integer.toString(11, 36);
        f42039K0 = Integer.toString(12, 36);
        f42040L0 = Integer.toString(13, 36);
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        if (!H.f41799l0.equals(this.f42047h0)) {
            bundle.putBundle(f42044z0, this.f42047h0.a());
        }
        long j6 = this.f42049j0;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(f42029A0, j6);
        }
        long j10 = this.f42050k0;
        if (j10 != -9223372036854775807L) {
            bundle.putLong(f42030B0, j10);
        }
        long j11 = this.f42051l0;
        if (j11 != -9223372036854775807L) {
            bundle.putLong(f42031C0, j11);
        }
        boolean z10 = this.f42052m0;
        if (z10) {
            bundle.putBoolean(f42032D0, z10);
        }
        boolean z11 = this.f42053n0;
        if (z11) {
            bundle.putBoolean(f42033E0, z11);
        }
        C5047B c5047b = this.f42055p0;
        if (c5047b != null) {
            bundle.putBundle(f42034F0, c5047b.a());
        }
        boolean z12 = this.f42056q0;
        if (z12) {
            bundle.putBoolean(f42035G0, z12);
        }
        long j12 = this.f42057r0;
        if (j12 != 0) {
            bundle.putLong(f42036H0, j12);
        }
        long j13 = this.f42058s0;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f42037I0, j13);
        }
        int i10 = this.f42059t0;
        if (i10 != 0) {
            bundle.putInt(f42038J0, i10);
        }
        int i11 = this.f42060u0;
        if (i11 != 0) {
            bundle.putInt(f42039K0, i11);
        }
        long j14 = this.f42061v0;
        if (j14 != 0) {
            bundle.putLong(f42040L0, j14);
        }
        return bundle;
    }

    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12 = this.f42054o0;
        if (this.f42055p0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z12 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        Gi.e.n(z11);
        if (this.f42055p0 == null) {
            return false;
        }
        return true;
    }

    public final void c(Object obj, H h10, Object obj2, long j6, long j10, long j11, boolean z10, boolean z11, C5047B c5047b, long j12, long j13, int i10, int i11, long j14) {
        H h11;
        Object obj3;
        boolean z12;
        C c10;
        this.f42045Y = obj;
        if (h10 != null) {
            h11 = h10;
        } else {
            h11 = f42043y0;
        }
        this.f42047h0 = h11;
        if (h10 != null && (c10 = h10.f41808Z) != null) {
            obj3 = c10.f41767m0;
        } else {
            obj3 = null;
        }
        this.f42046Z = obj3;
        this.f42048i0 = obj2;
        this.f42049j0 = j6;
        this.f42050k0 = j10;
        this.f42051l0 = j11;
        this.f42052m0 = z10;
        this.f42053n0 = z11;
        if (c5047b != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f42054o0 = z12;
        this.f42055p0 = c5047b;
        this.f42057r0 = j12;
        this.f42058s0 = j13;
        this.f42059t0 = i10;
        this.f42060u0 = i11;
        this.f42061v0 = j14;
        this.f42056q0 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !f0.class.equals(obj.getClass())) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (AbstractC5530A.a(this.f42045Y, f0Var.f42045Y) && AbstractC5530A.a(this.f42047h0, f0Var.f42047h0) && AbstractC5530A.a(this.f42048i0, f0Var.f42048i0) && AbstractC5530A.a(this.f42055p0, f0Var.f42055p0) && this.f42049j0 == f0Var.f42049j0 && this.f42050k0 == f0Var.f42050k0 && this.f42051l0 == f0Var.f42051l0 && this.f42052m0 == f0Var.f42052m0 && this.f42053n0 == f0Var.f42053n0 && this.f42056q0 == f0Var.f42056q0 && this.f42057r0 == f0Var.f42057r0 && this.f42058s0 == f0Var.f42058s0 && this.f42059t0 == f0Var.f42059t0 && this.f42060u0 == f0Var.f42060u0 && this.f42061v0 == f0Var.f42061v0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f42047h0.hashCode() + ((this.f42045Y.hashCode() + 217) * 31)) * 31;
        Object obj = this.f42048i0;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        int i12 = (hashCode + i10) * 31;
        C5047B c5047b = this.f42055p0;
        if (c5047b != null) {
            i11 = c5047b.hashCode();
        }
        long j6 = this.f42049j0;
        long j10 = this.f42050k0;
        long j11 = this.f42051l0;
        long j12 = this.f42057r0;
        long j13 = this.f42058s0;
        long j14 = this.f42061v0;
        return ((((((((((((((((((((((i12 + i11) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f42052m0 ? 1 : 0)) * 31) + (this.f42053n0 ? 1 : 0)) * 31) + (this.f42056q0 ? 1 : 0)) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f42059t0) * 31) + this.f42060u0) * 31) + ((int) (j14 ^ (j14 >>> 32)));
    }
}
