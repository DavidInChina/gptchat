package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6309k0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49346a;

    /* renamed from: b  reason: collision with root package name */
    public final I f49347b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49348c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49349d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49350e;

    /* renamed from: f  reason: collision with root package name */
    public final Y f49351f;

    /* renamed from: g  reason: collision with root package name */
    public final int f49352g;

    /* renamed from: h  reason: collision with root package name */
    public final Z f49353h;

    /* renamed from: i  reason: collision with root package name */
    public final C6303i0 f49354i;

    /* renamed from: j  reason: collision with root package name */
    public final O f49355j;

    /* renamed from: k  reason: collision with root package name */
    public final W f49356k;

    /* renamed from: l  reason: collision with root package name */
    public final C6297g0 f49357l;

    /* renamed from: m  reason: collision with root package name */
    public final M f49358m;

    /* renamed from: n  reason: collision with root package name */
    public final C6285c0 f49359n;

    /* renamed from: o  reason: collision with root package name */
    public final V f49360o;

    /* renamed from: p  reason: collision with root package name */
    public final T f49361p;

    /* renamed from: q  reason: collision with root package name */
    public final S f49362q;

    /* renamed from: r  reason: collision with root package name */
    public final H f49363r;

    /* renamed from: s  reason: collision with root package name */
    public final P f49364s;

    /* renamed from: t  reason: collision with root package name */
    public final X f49365t;

    /* renamed from: u  reason: collision with root package name */
    public final S f49366u;

    public C6309k0(long j6, I i10, String str, String str2, String str3, Y y10, int i11, Z z10, C6303i0 c6303i0, O o10, W w10, C6297g0 c6297g0, M m10, C6285c0 c6285c0, V v10, T t10, S s10, H h10, P p10, X x10, S s11) {
        this.f49346a = j6;
        this.f49347b = i10;
        this.f49348c = str;
        this.f49349d = str2;
        this.f49350e = str3;
        this.f49351f = y10;
        this.f49352g = i11;
        this.f49353h = z10;
        this.f49354i = c6303i0;
        this.f49355j = o10;
        this.f49356k = w10;
        this.f49357l = c6297g0;
        this.f49358m = m10;
        this.f49359n = c6285c0;
        this.f49360o = v10;
        this.f49361p = t10;
        this.f49362q = s10;
        this.f49363r = h10;
        this.f49364s = p10;
        this.f49365t = x10;
        this.f49366u = s11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6309k0)) {
            return false;
        }
        C6309k0 c6309k0 = (C6309k0) obj;
        if (this.f49346a == c6309k0.f49346a && AbstractC3557B.K(this.f49347b, c6309k0.f49347b) && AbstractC3557B.K(this.f49348c, c6309k0.f49348c) && AbstractC3557B.K(this.f49349d, c6309k0.f49349d) && AbstractC3557B.K(this.f49350e, c6309k0.f49350e) && AbstractC3557B.K(this.f49351f, c6309k0.f49351f) && this.f49352g == c6309k0.f49352g && AbstractC3557B.K(this.f49353h, c6309k0.f49353h) && AbstractC3557B.K(this.f49354i, c6309k0.f49354i) && AbstractC3557B.K(this.f49355j, c6309k0.f49355j) && AbstractC3557B.K(this.f49356k, c6309k0.f49356k) && AbstractC3557B.K(this.f49357l, c6309k0.f49357l) && AbstractC3557B.K(this.f49358m, c6309k0.f49358m) && AbstractC3557B.K(this.f49359n, c6309k0.f49359n) && AbstractC3557B.K(this.f49360o, c6309k0.f49360o) && AbstractC3557B.K(this.f49361p, c6309k0.f49361p) && AbstractC3557B.K(this.f49362q, c6309k0.f49362q) && AbstractC3557B.K(this.f49363r, c6309k0.f49363r) && AbstractC3557B.K(this.f49364s, c6309k0.f49364s) && AbstractC3557B.K(this.f49365t, c6309k0.f49365t) && AbstractC3557B.K(this.f49366u, c6309k0.f49366u)) {
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
        int i23;
        long j6 = this.f49346a;
        int v10 = E9.f.v(this.f49347b.f49005a, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
        int i24 = 0;
        String str = this.f49348c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i25 = (v10 + i10) * 31;
        String str2 = this.f49349d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i26 = (i25 + i11) * 31;
        String str3 = this.f49350e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int hashCode = (this.f49351f.hashCode() + ((i26 + i12) * 31)) * 31;
        int i27 = this.f49352g;
        if (i27 == 0) {
            i13 = 0;
        } else {
            i13 = AbstractC6708l.f(i27);
        }
        int hashCode2 = (this.f49353h.hashCode() + ((hashCode + i13) * 31)) * 31;
        C6303i0 c6303i0 = this.f49354i;
        if (c6303i0 == null) {
            i14 = 0;
        } else {
            i14 = c6303i0.hashCode();
        }
        int i28 = (hashCode2 + i14) * 31;
        O o10 = this.f49355j;
        if (o10 == null) {
            i15 = 0;
        } else {
            i15 = o10.hashCode();
        }
        int i29 = (i28 + i15) * 31;
        W w10 = this.f49356k;
        if (w10 == null) {
            i16 = 0;
        } else {
            i16 = w10.hashCode();
        }
        int i30 = (i29 + i16) * 31;
        C6297g0 c6297g0 = this.f49357l;
        if (c6297g0 == null) {
            i17 = 0;
        } else {
            i17 = c6297g0.hashCode();
        }
        int i31 = (i30 + i17) * 31;
        M m10 = this.f49358m;
        if (m10 == null) {
            i18 = 0;
        } else {
            i18 = m10.f49038a.hashCode();
        }
        int i32 = (i31 + i18) * 31;
        C6285c0 c6285c0 = this.f49359n;
        if (c6285c0 == null) {
            i19 = 0;
        } else {
            i19 = c6285c0.hashCode();
        }
        int i33 = (i32 + i19) * 31;
        V v11 = this.f49360o;
        if (v11 == null) {
            i20 = 0;
        } else {
            i20 = v11.hashCode();
        }
        int hashCode3 = (this.f49361p.hashCode() + ((i33 + i20) * 31)) * 31;
        S s10 = this.f49362q;
        if (s10 == null) {
            i21 = 0;
        } else {
            i21 = s10.f49073a.hashCode();
        }
        int i34 = (hashCode3 + i21) * 31;
        H h10 = this.f49363r;
        if (h10 == null) {
            i22 = 0;
        } else {
            i22 = h10.f48982a.hashCode();
        }
        int i35 = (i34 + i22) * 31;
        P p10 = this.f49364s;
        if (p10 == null) {
            i23 = 0;
        } else {
            i23 = p10.hashCode();
        }
        int hashCode4 = (this.f49365t.hashCode() + ((i35 + i23) * 31)) * 31;
        S s11 = this.f49366u;
        if (s11 != null) {
            i24 = s11.f49073a.hashCode();
        }
        return hashCode4 + i24;
    }

    public final String toString() {
        return "ErrorEvent(date=" + this.f49346a + ", application=" + this.f49347b + ", service=" + this.f49348c + ", version=" + this.f49349d + ", buildVersion=" + this.f49350e + ", session=" + this.f49351f + ", source=" + AbstractC6287d.F(this.f49352g) + ", view=" + this.f49353h + ", usr=" + this.f49354i + ", connectivity=" + this.f49355j + ", display=" + this.f49356k + ", synthetics=" + this.f49357l + ", ciTest=" + this.f49358m + ", os=" + this.f49359n + ", device=" + this.f49360o + ", dd=" + this.f49361p + ", context=" + this.f49362q + ", action=" + this.f49363r + ", container=" + this.f49364s + ", error=" + this.f49365t + ", featureFlags=" + this.f49366u + Separators.RPAREN;
    }

    public /* synthetic */ C6309k0(long j6, I i10, String str, String str2, Y y10, int i11, Z z10, C6303i0 c6303i0, O o10, C6297g0 c6297g0, C6285c0 c6285c0, V v10, T t10, S s10, H h10, X x10, S s11, int i12) {
        this(j6, i10, str, str2, null, y10, i11, z10, c6303i0, o10, null, (i12 & 2048) != 0 ? null : c6297g0, null, c6285c0, v10, t10, s10, (131072 & i12) != 0 ? null : h10, null, x10, (i12 & 1048576) != 0 ? null : s11);
    }
}
