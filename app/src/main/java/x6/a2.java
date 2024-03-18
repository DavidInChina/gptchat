package x6;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49233a;

    /* renamed from: b  reason: collision with root package name */
    public final C6325p1 f49234b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49235c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49236d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49237e;

    /* renamed from: f  reason: collision with root package name */
    public final W1 f49238f;

    /* renamed from: g  reason: collision with root package name */
    public final int f49239g;

    /* renamed from: h  reason: collision with root package name */
    public final Y1 f49240h;

    /* renamed from: i  reason: collision with root package name */
    public final V1 f49241i;

    /* renamed from: j  reason: collision with root package name */
    public final C6336t1 f49242j;

    /* renamed from: k  reason: collision with root package name */
    public final C1 f49243k;

    /* renamed from: l  reason: collision with root package name */
    public final U1 f49244l;

    /* renamed from: m  reason: collision with root package name */
    public final C6330r1 f49245m;

    /* renamed from: n  reason: collision with root package name */
    public final K1 f49246n;

    /* renamed from: o  reason: collision with root package name */
    public final B1 f49247o;

    /* renamed from: p  reason: collision with root package name */
    public final C6354z1 f49248p;

    /* renamed from: q  reason: collision with root package name */
    public final C6345w1 f49249q;

    /* renamed from: r  reason: collision with root package name */
    public final C6339u1 f49250r;

    /* renamed from: s  reason: collision with root package name */
    public final C6345w1 f49251s;

    /* renamed from: t  reason: collision with root package name */
    public final N1 f49252t;

    /* renamed from: u  reason: collision with root package name */
    public final String f49253u = "view";

    public a2(long j6, C6325p1 c6325p1, String str, String str2, String str3, W1 w12, int i10, Y1 y12, V1 v12, C6336t1 c6336t1, C1 c12, U1 u12, C6330r1 c6330r1, K1 k12, B1 b1, C6354z1 c6354z1, C6345w1 c6345w1, C6339u1 c6339u1, C6345w1 c6345w12, N1 n12) {
        this.f49233a = j6;
        this.f49234b = c6325p1;
        this.f49235c = str;
        this.f49236d = str2;
        this.f49237e = str3;
        this.f49238f = w12;
        this.f49239g = i10;
        this.f49240h = y12;
        this.f49241i = v12;
        this.f49242j = c6336t1;
        this.f49243k = c12;
        this.f49244l = u12;
        this.f49245m = c6330r1;
        this.f49246n = k12;
        this.f49247o = b1;
        this.f49248p = c6354z1;
        this.f49249q = c6345w1;
        this.f49250r = c6339u1;
        this.f49251s = c6345w12;
        this.f49252t = n12;
    }

    public static a2 a(a2 a2Var, Y1 y12, V1 v12, C6354z1 c6354z1, C6345w1 c6345w1, int i10) {
        V1 v13;
        B1 b1;
        C6354z1 c6354z12;
        C6345w1 c6345w12;
        long j6 = a2Var.f49233a;
        C6325p1 c6325p1 = a2Var.f49234b;
        String str = a2Var.f49235c;
        String str2 = a2Var.f49236d;
        String str3 = a2Var.f49237e;
        W1 w12 = a2Var.f49238f;
        int i11 = a2Var.f49239g;
        if ((i10 & 256) != 0) {
            v13 = a2Var.f49241i;
        } else {
            v13 = v12;
        }
        C6336t1 c6336t1 = a2Var.f49242j;
        C1 c12 = a2Var.f49243k;
        U1 u12 = a2Var.f49244l;
        C6330r1 c6330r1 = a2Var.f49245m;
        K1 k12 = a2Var.f49246n;
        B1 b12 = a2Var.f49247o;
        if ((i10 & 32768) != 0) {
            b1 = b12;
            c6354z12 = a2Var.f49248p;
        } else {
            b1 = b12;
            c6354z12 = c6354z1;
        }
        if ((i10 & 65536) != 0) {
            c6345w12 = a2Var.f49249q;
        } else {
            c6345w12 = c6345w1;
        }
        C6339u1 c6339u1 = a2Var.f49250r;
        C6345w1 c6345w13 = a2Var.f49251s;
        N1 n12 = a2Var.f49252t;
        a2Var.getClass();
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, c6325p1);
        AbstractC3557B.c0(ParameterNames.SESSION, w12);
        AbstractC3557B.c0("dd", c6354z12);
        return new a2(j6, c6325p1, str, str2, str3, w12, i11, y12, v13, c6336t1, c12, u12, c6330r1, k12, b1, c6354z12, c6345w12, c6339u1, c6345w13, n12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        if (this.f49233a == a2Var.f49233a && AbstractC3557B.K(this.f49234b, a2Var.f49234b) && AbstractC3557B.K(this.f49235c, a2Var.f49235c) && AbstractC3557B.K(this.f49236d, a2Var.f49236d) && AbstractC3557B.K(this.f49237e, a2Var.f49237e) && AbstractC3557B.K(this.f49238f, a2Var.f49238f) && this.f49239g == a2Var.f49239g && AbstractC3557B.K(this.f49240h, a2Var.f49240h) && AbstractC3557B.K(this.f49241i, a2Var.f49241i) && AbstractC3557B.K(this.f49242j, a2Var.f49242j) && AbstractC3557B.K(this.f49243k, a2Var.f49243k) && AbstractC3557B.K(this.f49244l, a2Var.f49244l) && AbstractC3557B.K(this.f49245m, a2Var.f49245m) && AbstractC3557B.K(this.f49246n, a2Var.f49246n) && AbstractC3557B.K(this.f49247o, a2Var.f49247o) && AbstractC3557B.K(this.f49248p, a2Var.f49248p) && AbstractC3557B.K(this.f49249q, a2Var.f49249q) && AbstractC3557B.K(this.f49250r, a2Var.f49250r) && AbstractC3557B.K(this.f49251s, a2Var.f49251s) && AbstractC3557B.K(this.f49252t, a2Var.f49252t)) {
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
        long j6 = this.f49233a;
        int v10 = E9.f.v(this.f49234b.f49414a, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
        int i24 = 0;
        String str = this.f49235c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i25 = (v10 + i10) * 31;
        String str2 = this.f49236d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i26 = (i25 + i11) * 31;
        String str3 = this.f49237e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int hashCode = (this.f49238f.hashCode() + ((i26 + i12) * 31)) * 31;
        int i27 = this.f49239g;
        if (i27 == 0) {
            i13 = 0;
        } else {
            i13 = AbstractC6708l.f(i27);
        }
        int hashCode2 = (this.f49240h.hashCode() + ((hashCode + i13) * 31)) * 31;
        V1 v12 = this.f49241i;
        if (v12 == null) {
            i14 = 0;
        } else {
            i14 = v12.hashCode();
        }
        int i28 = (hashCode2 + i14) * 31;
        C6336t1 c6336t1 = this.f49242j;
        if (c6336t1 == null) {
            i15 = 0;
        } else {
            i15 = c6336t1.hashCode();
        }
        int i29 = (i28 + i15) * 31;
        C1 c12 = this.f49243k;
        if (c12 == null) {
            i16 = 0;
        } else {
            i16 = c12.hashCode();
        }
        int i30 = (i29 + i16) * 31;
        U1 u12 = this.f49244l;
        if (u12 == null) {
            i17 = 0;
        } else {
            i17 = u12.hashCode();
        }
        int i31 = (i30 + i17) * 31;
        C6330r1 c6330r1 = this.f49245m;
        if (c6330r1 == null) {
            i18 = 0;
        } else {
            i18 = c6330r1.f49428a.hashCode();
        }
        int i32 = (i31 + i18) * 31;
        K1 k12 = this.f49246n;
        if (k12 == null) {
            i19 = 0;
        } else {
            i19 = k12.hashCode();
        }
        int i33 = (i32 + i19) * 31;
        B1 b1 = this.f49247o;
        if (b1 == null) {
            i20 = 0;
        } else {
            i20 = b1.hashCode();
        }
        int hashCode3 = (this.f49248p.hashCode() + ((i33 + i20) * 31)) * 31;
        C6345w1 c6345w1 = this.f49249q;
        if (c6345w1 == null) {
            i21 = 0;
        } else {
            i21 = c6345w1.f49468a.hashCode();
        }
        int i34 = (hashCode3 + i21) * 31;
        C6339u1 c6339u1 = this.f49250r;
        if (c6339u1 == null) {
            i22 = 0;
        } else {
            i22 = c6339u1.hashCode();
        }
        int i35 = (i34 + i22) * 31;
        C6345w1 c6345w12 = this.f49251s;
        if (c6345w12 == null) {
            i23 = 0;
        } else {
            i23 = c6345w12.f49468a.hashCode();
        }
        int i36 = (i35 + i23) * 31;
        N1 n12 = this.f49252t;
        if (n12 != null) {
            i24 = AbstractC6708l.f(n12.f49048a);
        }
        return i36 + i24;
    }

    public final String toString() {
        return "ViewEvent(date=" + this.f49233a + ", application=" + this.f49234b + ", service=" + this.f49235c + ", version=" + this.f49236d + ", buildVersion=" + this.f49237e + ", session=" + this.f49238f + ", source=" + AbstractC6301h1.t(this.f49239g) + ", view=" + this.f49240h + ", usr=" + this.f49241i + ", connectivity=" + this.f49242j + ", display=" + this.f49243k + ", synthetics=" + this.f49244l + ", ciTest=" + this.f49245m + ", os=" + this.f49246n + ", device=" + this.f49247o + ", dd=" + this.f49248p + ", context=" + this.f49249q + ", container=" + this.f49250r + ", featureFlags=" + this.f49251s + ", privacy=" + this.f49252t + Separators.RPAREN;
    }
}
