package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final String f49129a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49130b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49131c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49132d;

    /* renamed from: e  reason: collision with root package name */
    public final List f49133e;

    /* renamed from: f  reason: collision with root package name */
    public final Boolean f49134f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49135g;

    /* renamed from: h  reason: collision with root package name */
    public final String f49136h;

    /* renamed from: i  reason: collision with root package name */
    public final int f49137i;

    /* renamed from: j  reason: collision with root package name */
    public final String f49138j;

    /* renamed from: k  reason: collision with root package name */
    public final int f49139k;

    /* renamed from: l  reason: collision with root package name */
    public final C6294f0 f49140l;

    /* renamed from: m  reason: collision with root package name */
    public final List f49141m;

    /* renamed from: n  reason: collision with root package name */
    public final List f49142n;

    /* renamed from: o  reason: collision with root package name */
    public final Boolean f49143o;

    /* renamed from: p  reason: collision with root package name */
    public final C6282b0 f49144p;

    public /* synthetic */ X(String str, int i10, String str2, Boolean bool, String str3, int i11, C6294f0 c6294f0, ArrayList arrayList, int i12) {
        this(null, str, i10, str2, null, bool, null, str3, 0, null, i11, (i12 & 2048) != 0 ? null : c6294f0, (i12 & 4096) != 0 ? null : arrayList, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        if (AbstractC3557B.K(this.f49129a, x10.f49129a) && AbstractC3557B.K(this.f49130b, x10.f49130b) && this.f49131c == x10.f49131c && AbstractC3557B.K(this.f49132d, x10.f49132d) && AbstractC3557B.K(this.f49133e, x10.f49133e) && AbstractC3557B.K(this.f49134f, x10.f49134f) && AbstractC3557B.K(this.f49135g, x10.f49135g) && AbstractC3557B.K(this.f49136h, x10.f49136h) && this.f49137i == x10.f49137i && AbstractC3557B.K(this.f49138j, x10.f49138j) && this.f49139k == x10.f49139k && AbstractC3557B.K(this.f49140l, x10.f49140l) && AbstractC3557B.K(this.f49141m, x10.f49141m) && AbstractC3557B.K(this.f49142n, x10.f49142n) && AbstractC3557B.K(this.f49143o, x10.f49143o) && AbstractC3557B.K(this.f49144p, x10.f49144p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 0;
        String str = this.f49129a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int d10 = AbstractC6708l.d(this.f49131c, E9.f.v(this.f49130b, i10 * 31, 31), 31);
        String str2 = this.f49132d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i24 = (d10 + i11) * 31;
        List list = this.f49133e;
        if (list == null) {
            i12 = 0;
        } else {
            i12 = list.hashCode();
        }
        int i25 = (i24 + i12) * 31;
        Boolean bool = this.f49134f;
        if (bool == null) {
            i13 = 0;
        } else {
            i13 = bool.hashCode();
        }
        int i26 = (i25 + i13) * 31;
        String str3 = this.f49135g;
        if (str3 == null) {
            i14 = 0;
        } else {
            i14 = str3.hashCode();
        }
        int i27 = (i26 + i14) * 31;
        String str4 = this.f49136h;
        if (str4 == null) {
            i15 = 0;
        } else {
            i15 = str4.hashCode();
        }
        int i28 = (i27 + i15) * 31;
        int i29 = this.f49137i;
        if (i29 == 0) {
            i16 = 0;
        } else {
            i16 = AbstractC6708l.f(i29);
        }
        int i30 = (i28 + i16) * 31;
        String str5 = this.f49138j;
        if (str5 == null) {
            i17 = 0;
        } else {
            i17 = str5.hashCode();
        }
        int i31 = (i30 + i17) * 31;
        int i32 = this.f49139k;
        if (i32 == 0) {
            i18 = 0;
        } else {
            i18 = AbstractC6708l.f(i32);
        }
        int i33 = (i31 + i18) * 31;
        C6294f0 c6294f0 = this.f49140l;
        if (c6294f0 == null) {
            i19 = 0;
        } else {
            i19 = c6294f0.hashCode();
        }
        int i34 = (i33 + i19) * 31;
        List list2 = this.f49141m;
        if (list2 == null) {
            i20 = 0;
        } else {
            i20 = list2.hashCode();
        }
        int i35 = (i34 + i20) * 31;
        List list3 = this.f49142n;
        if (list3 == null) {
            i21 = 0;
        } else {
            i21 = list3.hashCode();
        }
        int i36 = (i35 + i21) * 31;
        Boolean bool2 = this.f49143o;
        if (bool2 == null) {
            i22 = 0;
        } else {
            i22 = bool2.hashCode();
        }
        int i37 = (i36 + i22) * 31;
        C6282b0 c6282b0 = this.f49144p;
        if (c6282b0 != null) {
            i23 = c6282b0.hashCode();
        }
        return i37 + i23;
    }

    public final String toString() {
        return "Error(id=" + this.f49129a + ", message=" + this.f49130b + ", source=" + AbstractC6287d.H(this.f49131c) + ", stack=" + this.f49132d + ", causes=" + this.f49133e + ", isCrash=" + this.f49134f + ", fingerprint=" + this.f49135g + ", type=" + this.f49136h + ", handling=" + AbstractC6287d.I(this.f49137i) + ", handlingStack=" + this.f49138j + ", sourceType=" + AbstractC6287d.M(this.f49139k) + ", resource=" + this.f49140l + ", threads=" + this.f49141m + ", binaryImages=" + this.f49142n + ", wasTruncated=" + this.f49143o + ", meta=" + this.f49144p + Separators.RPAREN;
    }

    public X(String str, String str2, int i10, String str3, List list, Boolean bool, String str4, String str5, int i11, String str6, int i12, C6294f0 c6294f0, List list2, List list3, Boolean bool2, C6282b0 c6282b0) {
        AbstractC3557B.c0("message", str2);
        AbstractC2469q0.q("source", i10);
        this.f49129a = str;
        this.f49130b = str2;
        this.f49131c = i10;
        this.f49132d = str3;
        this.f49133e = list;
        this.f49134f = bool;
        this.f49135g = str4;
        this.f49136h = str5;
        this.f49137i = i11;
        this.f49138j = str6;
        this.f49139k = i12;
        this.f49140l = c6294f0;
        this.f49141m = list2;
        this.f49142n = list3;
        this.f49143o = bool2;
        this.f49144p = c6282b0;
    }
}
