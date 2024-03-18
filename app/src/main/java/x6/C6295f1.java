package x6;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.f1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6295f1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f49297a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49298b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49299c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49300d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f49301e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f49302f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f49303g;

    /* renamed from: h  reason: collision with root package name */
    public final C6292e1 f49304h;

    /* renamed from: i  reason: collision with root package name */
    public final W0 f49305i;

    /* renamed from: j  reason: collision with root package name */
    public final N0 f49306j;

    /* renamed from: k  reason: collision with root package name */
    public final C6307j1 f49307k;

    /* renamed from: l  reason: collision with root package name */
    public final Y0 f49308l;

    /* renamed from: m  reason: collision with root package name */
    public final X0 f49309m;

    /* renamed from: n  reason: collision with root package name */
    public final C6289d1 f49310n;

    /* renamed from: o  reason: collision with root package name */
    public final Z0 f49311o;

    public C6295f1(String str, int i10, int i11, String str2, Long l10, Long l11, Long l12, C6292e1 c6292e1, W0 w02, N0 n02, C6307j1 c6307j1, Y0 y02, X0 x02, C6289d1 c6289d1, Z0 z02) {
        AbstractC2469q0.q("type", i10);
        AbstractC3557B.c0("url", str2);
        this.f49297a = str;
        this.f49298b = i10;
        this.f49299c = i11;
        this.f49300d = str2;
        this.f49301e = l10;
        this.f49302f = l11;
        this.f49303g = l12;
        this.f49304h = c6292e1;
        this.f49305i = w02;
        this.f49306j = n02;
        this.f49307k = c6307j1;
        this.f49308l = y02;
        this.f49309m = x02;
        this.f49310n = c6289d1;
        this.f49311o = z02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6295f1)) {
            return false;
        }
        C6295f1 c6295f1 = (C6295f1) obj;
        if (AbstractC3557B.K(this.f49297a, c6295f1.f49297a) && this.f49298b == c6295f1.f49298b && this.f49299c == c6295f1.f49299c && AbstractC3557B.K(this.f49300d, c6295f1.f49300d) && AbstractC3557B.K(this.f49301e, c6295f1.f49301e) && AbstractC3557B.K(this.f49302f, c6295f1.f49302f) && AbstractC3557B.K(this.f49303g, c6295f1.f49303g) && AbstractC3557B.K(this.f49304h, c6295f1.f49304h) && AbstractC3557B.K(this.f49305i, c6295f1.f49305i) && AbstractC3557B.K(this.f49306j, c6295f1.f49306j) && AbstractC3557B.K(this.f49307k, c6295f1.f49307k) && AbstractC3557B.K(this.f49308l, c6295f1.f49308l) && AbstractC3557B.K(this.f49309m, c6295f1.f49309m) && AbstractC3557B.K(this.f49310n, c6295f1.f49310n) && AbstractC3557B.K(this.f49311o, c6295f1.f49311o)) {
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
        int i22 = 0;
        String str = this.f49297a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int d10 = AbstractC6708l.d(this.f49298b, i10 * 31, 31);
        int i23 = this.f49299c;
        if (i23 == 0) {
            i11 = 0;
        } else {
            i11 = AbstractC6708l.f(i23);
        }
        int v10 = E9.f.v(this.f49300d, (d10 + i11) * 31, 31);
        Long l10 = this.f49301e;
        if (l10 == null) {
            i12 = 0;
        } else {
            i12 = l10.hashCode();
        }
        int i24 = (v10 + i12) * 31;
        Long l11 = this.f49302f;
        if (l11 == null) {
            i13 = 0;
        } else {
            i13 = l11.hashCode();
        }
        int i25 = (i24 + i13) * 31;
        Long l12 = this.f49303g;
        if (l12 == null) {
            i14 = 0;
        } else {
            i14 = l12.hashCode();
        }
        int i26 = (i25 + i14) * 31;
        C6292e1 c6292e1 = this.f49304h;
        if (c6292e1 == null) {
            i15 = 0;
        } else {
            i15 = c6292e1.hashCode();
        }
        int i27 = (i26 + i15) * 31;
        W0 w02 = this.f49305i;
        if (w02 == null) {
            i16 = 0;
        } else {
            i16 = w02.hashCode();
        }
        int i28 = (i27 + i16) * 31;
        N0 n02 = this.f49306j;
        if (n02 == null) {
            i17 = 0;
        } else {
            i17 = n02.hashCode();
        }
        int i29 = (i28 + i17) * 31;
        C6307j1 c6307j1 = this.f49307k;
        if (c6307j1 == null) {
            i18 = 0;
        } else {
            i18 = c6307j1.hashCode();
        }
        int i30 = (i29 + i18) * 31;
        Y0 y02 = this.f49308l;
        if (y02 == null) {
            i19 = 0;
        } else {
            i19 = y02.hashCode();
        }
        int i31 = (i30 + i19) * 31;
        X0 x02 = this.f49309m;
        if (x02 == null) {
            i20 = 0;
        } else {
            i20 = x02.hashCode();
        }
        int i32 = (i31 + i20) * 31;
        C6289d1 c6289d1 = this.f49310n;
        if (c6289d1 == null) {
            i21 = 0;
        } else {
            i21 = c6289d1.hashCode();
        }
        int i33 = (i32 + i21) * 31;
        Z0 z02 = this.f49311o;
        if (z02 != null) {
            i22 = z02.hashCode();
        }
        return i33 + i22;
    }

    public final String toString() {
        return "Resource(id=" + this.f49297a + ", type=" + AbstractC6301h1.l(this.f49298b) + ", method=" + AbstractC6287d.X(this.f49299c) + ", url=" + this.f49300d + ", statusCode=" + this.f49301e + ", duration=" + this.f49302f + ", size=" + this.f49303g + ", redirect=" + this.f49304h + ", dns=" + this.f49305i + ", connect=" + this.f49306j + ", ssl=" + this.f49307k + ", firstByte=" + this.f49308l + ", download=" + this.f49309m + ", provider=" + this.f49310n + ", graphql=" + this.f49311o + Separators.RPAREN;
    }
}
