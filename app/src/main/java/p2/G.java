package p2;

import android.net.Uri;
import android.os.Bundle;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public class G implements AbstractC5057j {

    /* renamed from: m0  reason: collision with root package name */
    public static final String f41784m0 = Integer.toString(0, 36);

    /* renamed from: n0  reason: collision with root package name */
    public static final String f41785n0 = Integer.toString(1, 36);

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41786o0 = Integer.toString(2, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41787p0 = Integer.toString(3, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f41788q0 = Integer.toString(4, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f41789r0 = Integer.toString(5, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final String f41790s0 = Integer.toString(6, 36);

    /* renamed from: t0  reason: collision with root package name */
    public static final A9.a f41791t0 = new A9.a(23);

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f41792Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f41793Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f41794h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f41795i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f41796j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f41797k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f41798l0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public G(F f6) {
        this.f41792Y = f6.f41779c;
        this.f41793Z = (String) f6.f41780d;
        this.f41794h0 = (String) f6.f41781e;
        this.f41795i0 = f6.f41777a;
        this.f41796j0 = f6.f41778b;
        this.f41797k0 = (String) f6.f41782f;
        this.f41798l0 = (String) f6.f41783g;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f41784m0, this.f41792Y);
        String str = this.f41793Z;
        if (str != null) {
            bundle.putString(f41785n0, str);
        }
        String str2 = this.f41794h0;
        if (str2 != null) {
            bundle.putString(f41786o0, str2);
        }
        int i10 = this.f41795i0;
        if (i10 != 0) {
            bundle.putInt(f41787p0, i10);
        }
        int i11 = this.f41796j0;
        if (i11 != 0) {
            bundle.putInt(f41788q0, i11);
        }
        String str3 = this.f41797k0;
        if (str3 != null) {
            bundle.putString(f41789r0, str3);
        }
        String str4 = this.f41798l0;
        if (str4 != null) {
            bundle.putString(f41790s0, str4);
        }
        return bundle;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p2.F, java.lang.Object] */
    public final F b() {
        ?? obj = new Object();
        obj.f41779c = this.f41792Y;
        obj.f41780d = this.f41793Z;
        obj.f41781e = this.f41794h0;
        obj.f41777a = this.f41795i0;
        obj.f41778b = this.f41796j0;
        obj.f41782f = this.f41797k0;
        obj.f41783g = this.f41798l0;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (this.f41792Y.equals(g10.f41792Y) && AbstractC5530A.a(this.f41793Z, g10.f41793Z) && AbstractC5530A.a(this.f41794h0, g10.f41794h0) && this.f41795i0 == g10.f41795i0 && this.f41796j0 == g10.f41796j0 && AbstractC5530A.a(this.f41797k0, g10.f41797k0) && AbstractC5530A.a(this.f41798l0, g10.f41798l0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = this.f41792Y.hashCode() * 31;
        int i13 = 0;
        String str = this.f41793Z;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i14 = (hashCode + i10) * 31;
        String str2 = this.f41794h0;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i15 = (((((i14 + i11) * 31) + this.f41795i0) * 31) + this.f41796j0) * 31;
        String str3 = this.f41797k0;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int i16 = (i15 + i12) * 31;
        String str4 = this.f41798l0;
        if (str4 != null) {
            i13 = str4.hashCode();
        }
        return i16 + i13;
    }
}
