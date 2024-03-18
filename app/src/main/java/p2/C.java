package p2;

import android.net.Uri;
import android.os.Bundle;
import c1.AbstractC2279d;
import java.util.List;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class C implements AbstractC5057j {

    /* renamed from: o0  reason: collision with root package name */
    public static final String f41751o0 = Integer.toString(0, 36);

    /* renamed from: p0  reason: collision with root package name */
    public static final String f41752p0 = Integer.toString(1, 36);

    /* renamed from: q0  reason: collision with root package name */
    public static final String f41753q0 = Integer.toString(2, 36);

    /* renamed from: r0  reason: collision with root package name */
    public static final String f41754r0 = Integer.toString(3, 36);

    /* renamed from: s0  reason: collision with root package name */
    public static final String f41755s0 = Integer.toString(4, 36);

    /* renamed from: t0  reason: collision with root package name */
    public static final String f41756t0 = Integer.toString(5, 36);

    /* renamed from: u0  reason: collision with root package name */
    public static final String f41757u0 = Integer.toString(6, 36);

    /* renamed from: v0  reason: collision with root package name */
    public static final String f41758v0 = Integer.toString(7, 36);

    /* renamed from: w0  reason: collision with root package name */
    public static final A9.a f41759w0 = new A9.a(21);

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f41760Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f41761Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C5072z f41762h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C5067u f41763i0;

    /* renamed from: j0  reason: collision with root package name */
    public final List f41764j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f41765k0;

    /* renamed from: l0  reason: collision with root package name */
    public final x8.N f41766l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Object f41767m0;

    /* renamed from: n0  reason: collision with root package name */
    public final long f41768n0;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C(Uri uri, String str, C5072z c5072z, C5067u c5067u, List list, String str2, x8.N n10, Object obj, long j6) {
        this.f41760Y = uri;
        this.f41761Z = str;
        this.f41762h0 = c5072z;
        this.f41763i0 = c5067u;
        this.f41764j0 = list;
        this.f41765k0 = str2;
        this.f41766l0 = n10;
        x8.K U10 = x8.N.U();
        for (int i10 = 0; i10 < n10.size(); i10++) {
            U10.e0(F.a(((G) n10.get(i10)).b()));
        }
        U10.i0();
        this.f41767m0 = obj;
        this.f41768n0 = j6;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f41751o0, this.f41760Y);
        String str = this.f41761Z;
        if (str != null) {
            bundle.putString(f41752p0, str);
        }
        C5072z c5072z = this.f41762h0;
        if (c5072z != null) {
            bundle.putBundle(f41753q0, c5072z.a());
        }
        C5067u c5067u = this.f41763i0;
        if (c5067u != null) {
            bundle.putBundle(f41754r0, c5067u.a());
        }
        List list = this.f41764j0;
        if (!list.isEmpty()) {
            bundle.putParcelableArrayList(f41755s0, AbstractC2279d.z(list));
        }
        String str2 = this.f41765k0;
        if (str2 != null) {
            bundle.putString(f41756t0, str2);
        }
        x8.N n10 = this.f41766l0;
        if (!n10.isEmpty()) {
            bundle.putParcelableArrayList(f41757u0, AbstractC2279d.z(n10));
        }
        long j6 = this.f41768n0;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(f41758v0, j6);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f41760Y.equals(c10.f41760Y) && AbstractC5530A.a(this.f41761Z, c10.f41761Z) && AbstractC5530A.a(this.f41762h0, c10.f41762h0) && AbstractC5530A.a(this.f41763i0, c10.f41763i0) && this.f41764j0.equals(c10.f41764j0) && AbstractC5530A.a(this.f41765k0, c10.f41765k0) && this.f41766l0.equals(c10.f41766l0) && AbstractC5530A.a(this.f41767m0, c10.f41767m0) && AbstractC5530A.a(Long.valueOf(this.f41768n0), Long.valueOf(c10.f41768n0))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int hashCode = this.f41760Y.hashCode() * 31;
        int i14 = 0;
        String str = this.f41761Z;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i15 = (hashCode + i10) * 31;
        C5072z c5072z = this.f41762h0;
        if (c5072z == null) {
            i11 = 0;
        } else {
            i11 = c5072z.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        C5067u c5067u = this.f41763i0;
        if (c5067u == null) {
            i12 = 0;
        } else {
            i12 = c5067u.hashCode();
        }
        int hashCode2 = (this.f41764j0.hashCode() + ((i16 + i12) * 31)) * 31;
        String str2 = this.f41765k0;
        if (str2 == null) {
            i13 = 0;
        } else {
            i13 = str2.hashCode();
        }
        int hashCode3 = (this.f41766l0.hashCode() + ((hashCode2 + i13) * 31)) * 31;
        Object obj = this.f41767m0;
        if (obj != null) {
            i14 = obj.hashCode();
        }
        return (int) (((hashCode3 + i14) * 31) + this.f41768n0);
    }
}
