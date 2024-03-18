package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f48983a;

    /* renamed from: b  reason: collision with root package name */
    public final C6315m0 f48984b;

    /* renamed from: c  reason: collision with root package name */
    public final String f48985c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48986d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48987e;

    /* renamed from: f  reason: collision with root package name */
    public final A0 f48988f;

    /* renamed from: g  reason: collision with root package name */
    public final int f48989g;

    /* renamed from: h  reason: collision with root package name */
    public final B0 f48990h;

    /* renamed from: i  reason: collision with root package name */
    public final F0 f48991i;

    /* renamed from: j  reason: collision with root package name */
    public final C6327q0 f48992j;

    /* renamed from: k  reason: collision with root package name */
    public final C6347x0 f48993k;

    /* renamed from: l  reason: collision with root package name */
    public final E0 f48994l;

    /* renamed from: m  reason: collision with root package name */
    public final C6321o0 f48995m;

    /* renamed from: n  reason: collision with root package name */
    public final C0 f48996n;

    /* renamed from: o  reason: collision with root package name */
    public final C6344w0 f48997o;

    /* renamed from: p  reason: collision with root package name */
    public final C6338u0 f48998p;

    /* renamed from: q  reason: collision with root package name */
    public final C6335t0 f48999q;

    /* renamed from: r  reason: collision with root package name */
    public final C6312l0 f49000r;

    /* renamed from: s  reason: collision with root package name */
    public final C6329r0 f49001s;

    /* renamed from: t  reason: collision with root package name */
    public final C6353z0 f49002t;

    public H0(long j6, C6315m0 c6315m0, String str, String str2, String str3, A0 a02, int i10, B0 b02, F0 f02, C6327q0 c6327q0, C6347x0 c6347x0, E0 e02, C6321o0 c6321o0, C0 c02, C6344w0 c6344w0, C6338u0 c6338u0, C6335t0 c6335t0, C6312l0 c6312l0, C6329r0 c6329r0, C6353z0 c6353z0) {
        this.f48983a = j6;
        this.f48984b = c6315m0;
        this.f48985c = str;
        this.f48986d = str2;
        this.f48987e = str3;
        this.f48988f = a02;
        this.f48989g = i10;
        this.f48990h = b02;
        this.f48991i = f02;
        this.f48992j = c6327q0;
        this.f48993k = c6347x0;
        this.f48994l = e02;
        this.f48995m = c6321o0;
        this.f48996n = c02;
        this.f48997o = c6344w0;
        this.f48998p = c6338u0;
        this.f48999q = c6335t0;
        this.f49000r = c6312l0;
        this.f49001s = c6329r0;
        this.f49002t = c6353z0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (this.f48983a == h02.f48983a && AbstractC3557B.K(this.f48984b, h02.f48984b) && AbstractC3557B.K(this.f48985c, h02.f48985c) && AbstractC3557B.K(this.f48986d, h02.f48986d) && AbstractC3557B.K(this.f48987e, h02.f48987e) && AbstractC3557B.K(this.f48988f, h02.f48988f) && this.f48989g == h02.f48989g && AbstractC3557B.K(this.f48990h, h02.f48990h) && AbstractC3557B.K(this.f48991i, h02.f48991i) && AbstractC3557B.K(this.f48992j, h02.f48992j) && AbstractC3557B.K(this.f48993k, h02.f48993k) && AbstractC3557B.K(this.f48994l, h02.f48994l) && AbstractC3557B.K(this.f48995m, h02.f48995m) && AbstractC3557B.K(this.f48996n, h02.f48996n) && AbstractC3557B.K(this.f48997o, h02.f48997o) && AbstractC3557B.K(this.f48998p, h02.f48998p) && AbstractC3557B.K(this.f48999q, h02.f48999q) && AbstractC3557B.K(this.f49000r, h02.f49000r) && AbstractC3557B.K(this.f49001s, h02.f49001s) && AbstractC3557B.K(this.f49002t, h02.f49002t)) {
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
        long j6 = this.f48983a;
        int v10 = E9.f.v(this.f48984b.f49378a, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
        int i23 = 0;
        String str = this.f48985c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i24 = (v10 + i10) * 31;
        String str2 = this.f48986d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i25 = (i24 + i11) * 31;
        String str3 = this.f48987e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int hashCode = (this.f48988f.hashCode() + ((i25 + i12) * 31)) * 31;
        int i26 = this.f48989g;
        if (i26 == 0) {
            i13 = 0;
        } else {
            i13 = AbstractC6708l.f(i26);
        }
        int hashCode2 = (this.f48990h.hashCode() + ((hashCode + i13) * 31)) * 31;
        F0 f02 = this.f48991i;
        if (f02 == null) {
            i14 = 0;
        } else {
            i14 = f02.hashCode();
        }
        int i27 = (hashCode2 + i14) * 31;
        C6327q0 c6327q0 = this.f48992j;
        if (c6327q0 == null) {
            i15 = 0;
        } else {
            i15 = c6327q0.hashCode();
        }
        int i28 = (i27 + i15) * 31;
        C6347x0 c6347x0 = this.f48993k;
        if (c6347x0 == null) {
            i16 = 0;
        } else {
            i16 = c6347x0.hashCode();
        }
        int i29 = (i28 + i16) * 31;
        E0 e02 = this.f48994l;
        if (e02 == null) {
            i17 = 0;
        } else {
            i17 = e02.hashCode();
        }
        int i30 = (i29 + i17) * 31;
        C6321o0 c6321o0 = this.f48995m;
        if (c6321o0 == null) {
            i18 = 0;
        } else {
            i18 = c6321o0.f49408a.hashCode();
        }
        int i31 = (i30 + i18) * 31;
        C0 c02 = this.f48996n;
        if (c02 == null) {
            i19 = 0;
        } else {
            i19 = c02.hashCode();
        }
        int i32 = (i31 + i19) * 31;
        C6344w0 c6344w0 = this.f48997o;
        if (c6344w0 == null) {
            i20 = 0;
        } else {
            i20 = c6344w0.hashCode();
        }
        int hashCode3 = (this.f48998p.hashCode() + ((i32 + i20) * 31)) * 31;
        C6335t0 c6335t0 = this.f48999q;
        if (c6335t0 == null) {
            i21 = 0;
        } else {
            i21 = c6335t0.f49439a.hashCode();
        }
        int i33 = (hashCode3 + i21) * 31;
        C6312l0 c6312l0 = this.f49000r;
        if (c6312l0 == null) {
            i22 = 0;
        } else {
            i22 = c6312l0.f49371a.hashCode();
        }
        int i34 = (i33 + i22) * 31;
        C6329r0 c6329r0 = this.f49001s;
        if (c6329r0 != null) {
            i23 = c6329r0.hashCode();
        }
        return this.f49002t.hashCode() + ((i34 + i23) * 31);
    }

    public final String toString() {
        return "LongTaskEvent(date=" + this.f48983a + ", application=" + this.f48984b + ", service=" + this.f48985c + ", version=" + this.f48986d + ", buildVersion=" + this.f48987e + ", session=" + this.f48988f + ", source=" + AbstractC6287d.S(this.f48989g) + ", view=" + this.f48990h + ", usr=" + this.f48991i + ", connectivity=" + this.f48992j + ", display=" + this.f48993k + ", synthetics=" + this.f48994l + ", ciTest=" + this.f48995m + ", os=" + this.f48996n + ", device=" + this.f48997o + ", dd=" + this.f48998p + ", context=" + this.f48999q + ", action=" + this.f49000r + ", container=" + this.f49001s + ", longTask=" + this.f49002t + Separators.RPAREN;
    }
}
