package x6;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import z.AbstractC6708l;

/* renamed from: x6.n1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6319n1 {

    /* renamed from: a  reason: collision with root package name */
    public final long f49384a;

    /* renamed from: b  reason: collision with root package name */
    public final J0 f49385b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49386c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49387d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49388e;

    /* renamed from: f  reason: collision with root package name */
    public final C6298g1 f49389f;

    /* renamed from: g  reason: collision with root package name */
    public final int f49390g;

    /* renamed from: h  reason: collision with root package name */
    public final C6304i1 f49391h;

    /* renamed from: i  reason: collision with root package name */
    public final C6313l1 f49392i;

    /* renamed from: j  reason: collision with root package name */
    public final O0 f49393j;

    /* renamed from: k  reason: collision with root package name */
    public final V0 f49394k;

    /* renamed from: l  reason: collision with root package name */
    public final C6310k1 f49395l;

    /* renamed from: m  reason: collision with root package name */
    public final L0 f49396m;

    /* renamed from: n  reason: collision with root package name */
    public final C6283b1 f49397n;

    /* renamed from: o  reason: collision with root package name */
    public final U0 f49398o;

    /* renamed from: p  reason: collision with root package name */
    public final S0 f49399p;

    /* renamed from: q  reason: collision with root package name */
    public final R0 f49400q;

    /* renamed from: r  reason: collision with root package name */
    public final I0 f49401r;

    /* renamed from: s  reason: collision with root package name */
    public final P0 f49402s;

    /* renamed from: t  reason: collision with root package name */
    public final C6295f1 f49403t;

    public C6319n1(long j6, J0 j02, String str, String str2, String str3, C6298g1 c6298g1, int i10, C6304i1 c6304i1, C6313l1 c6313l1, O0 o02, V0 v02, C6310k1 c6310k1, L0 l02, C6283b1 c6283b1, U0 u02, S0 s02, R0 r02, I0 i02, P0 p02, C6295f1 c6295f1) {
        this.f49384a = j6;
        this.f49385b = j02;
        this.f49386c = str;
        this.f49387d = str2;
        this.f49388e = str3;
        this.f49389f = c6298g1;
        this.f49390g = i10;
        this.f49391h = c6304i1;
        this.f49392i = c6313l1;
        this.f49393j = o02;
        this.f49394k = v02;
        this.f49395l = c6310k1;
        this.f49396m = l02;
        this.f49397n = c6283b1;
        this.f49398o = u02;
        this.f49399p = s02;
        this.f49400q = r02;
        this.f49401r = i02;
        this.f49402s = p02;
        this.f49403t = c6295f1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6319n1)) {
            return false;
        }
        C6319n1 c6319n1 = (C6319n1) obj;
        if (this.f49384a == c6319n1.f49384a && AbstractC3557B.K(this.f49385b, c6319n1.f49385b) && AbstractC3557B.K(this.f49386c, c6319n1.f49386c) && AbstractC3557B.K(this.f49387d, c6319n1.f49387d) && AbstractC3557B.K(this.f49388e, c6319n1.f49388e) && AbstractC3557B.K(this.f49389f, c6319n1.f49389f) && this.f49390g == c6319n1.f49390g && AbstractC3557B.K(this.f49391h, c6319n1.f49391h) && AbstractC3557B.K(this.f49392i, c6319n1.f49392i) && AbstractC3557B.K(this.f49393j, c6319n1.f49393j) && AbstractC3557B.K(this.f49394k, c6319n1.f49394k) && AbstractC3557B.K(this.f49395l, c6319n1.f49395l) && AbstractC3557B.K(this.f49396m, c6319n1.f49396m) && AbstractC3557B.K(this.f49397n, c6319n1.f49397n) && AbstractC3557B.K(this.f49398o, c6319n1.f49398o) && AbstractC3557B.K(this.f49399p, c6319n1.f49399p) && AbstractC3557B.K(this.f49400q, c6319n1.f49400q) && AbstractC3557B.K(this.f49401r, c6319n1.f49401r) && AbstractC3557B.K(this.f49402s, c6319n1.f49402s) && AbstractC3557B.K(this.f49403t, c6319n1.f49403t)) {
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
        long j6 = this.f49384a;
        int v10 = E9.f.v(this.f49385b.f49021a, ((int) (j6 ^ (j6 >>> 32))) * 31, 31);
        int i23 = 0;
        String str = this.f49386c;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        int i24 = (v10 + i10) * 31;
        String str2 = this.f49387d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int i25 = (i24 + i11) * 31;
        String str3 = this.f49388e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.hashCode();
        }
        int hashCode = (this.f49389f.hashCode() + ((i25 + i12) * 31)) * 31;
        int i26 = this.f49390g;
        if (i26 == 0) {
            i13 = 0;
        } else {
            i13 = AbstractC6708l.f(i26);
        }
        int hashCode2 = (this.f49391h.hashCode() + ((hashCode + i13) * 31)) * 31;
        C6313l1 c6313l1 = this.f49392i;
        if (c6313l1 == null) {
            i14 = 0;
        } else {
            i14 = c6313l1.hashCode();
        }
        int i27 = (hashCode2 + i14) * 31;
        O0 o02 = this.f49393j;
        if (o02 == null) {
            i15 = 0;
        } else {
            i15 = o02.hashCode();
        }
        int i28 = (i27 + i15) * 31;
        V0 v02 = this.f49394k;
        if (v02 == null) {
            i16 = 0;
        } else {
            i16 = v02.hashCode();
        }
        int i29 = (i28 + i16) * 31;
        C6310k1 c6310k1 = this.f49395l;
        if (c6310k1 == null) {
            i17 = 0;
        } else {
            i17 = c6310k1.hashCode();
        }
        int i30 = (i29 + i17) * 31;
        L0 l02 = this.f49396m;
        if (l02 == null) {
            i18 = 0;
        } else {
            i18 = l02.f49035a.hashCode();
        }
        int i31 = (i30 + i18) * 31;
        C6283b1 c6283b1 = this.f49397n;
        if (c6283b1 == null) {
            i19 = 0;
        } else {
            i19 = c6283b1.hashCode();
        }
        int i32 = (i31 + i19) * 31;
        U0 u02 = this.f49398o;
        if (u02 == null) {
            i20 = 0;
        } else {
            i20 = u02.hashCode();
        }
        int hashCode3 = (this.f49399p.hashCode() + ((i32 + i20) * 31)) * 31;
        R0 r02 = this.f49400q;
        if (r02 == null) {
            i21 = 0;
        } else {
            i21 = r02.f49071a.hashCode();
        }
        int i33 = (hashCode3 + i21) * 31;
        I0 i02 = this.f49401r;
        if (i02 == null) {
            i22 = 0;
        } else {
            i22 = i02.f49006a.hashCode();
        }
        int i34 = (i33 + i22) * 31;
        P0 p02 = this.f49402s;
        if (p02 != null) {
            i23 = p02.hashCode();
        }
        return this.f49403t.hashCode() + ((i34 + i23) * 31);
    }

    public final String toString() {
        return "ResourceEvent(date=" + this.f49384a + ", application=" + this.f49385b + ", service=" + this.f49386c + ", version=" + this.f49387d + ", buildVersion=" + this.f49388e + ", session=" + this.f49389f + ", source=" + AbstractC6301h1.k(this.f49390g) + ", view=" + this.f49391h + ", usr=" + this.f49392i + ", connectivity=" + this.f49393j + ", display=" + this.f49394k + ", synthetics=" + this.f49395l + ", ciTest=" + this.f49396m + ", os=" + this.f49397n + ", device=" + this.f49398o + ", dd=" + this.f49399p + ", context=" + this.f49400q + ", action=" + this.f49401r + ", container=" + this.f49402s + ", resource=" + this.f49403t + Separators.RPAREN;
    }
}
