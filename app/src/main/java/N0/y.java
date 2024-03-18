package N0;

import A.AbstractC0044t0;
import id.AbstractC3557B;
import jf.C3970t;
import r0.AbstractC5350n;
import r0.K;
import t0.AbstractC5651j;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Y0.o f12628a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12629b;

    /* renamed from: c  reason: collision with root package name */
    public final S0.D f12630c;

    /* renamed from: d  reason: collision with root package name */
    public final S0.z f12631d;

    /* renamed from: e  reason: collision with root package name */
    public final S0.A f12632e;

    /* renamed from: f  reason: collision with root package name */
    public final S0.s f12633f;

    /* renamed from: g  reason: collision with root package name */
    public final String f12634g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12635h;

    /* renamed from: i  reason: collision with root package name */
    public final Y0.a f12636i;

    /* renamed from: j  reason: collision with root package name */
    public final Y0.p f12637j;

    /* renamed from: k  reason: collision with root package name */
    public final U0.d f12638k;

    /* renamed from: l  reason: collision with root package name */
    public final long f12639l;

    /* renamed from: m  reason: collision with root package name */
    public final Y0.j f12640m;

    /* renamed from: n  reason: collision with root package name */
    public final K f12641n;

    /* renamed from: o  reason: collision with root package name */
    public final t f12642o;

    /* renamed from: p  reason: collision with root package name */
    public final AbstractC5651j f12643p;

    public y(long j6, long j10, S0.D d10, S0.z zVar, S0.A a5, S0.s sVar, String str, long j11, Y0.a aVar, Y0.p pVar, U0.d dVar, long j12, Y0.j jVar, K k10, int i10) {
        this((i10 & 1) != 0 ? r0.r.f44263k : j6, (i10 & 2) != 0 ? Z0.n.f22810c : j10, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : zVar, (i10 & 16) != 0 ? null : a5, (i10 & 32) != 0 ? null : sVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Z0.n.f22810c : j11, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar, (i10 & 1024) != 0 ? null : dVar, (i10 & 2048) != 0 ? r0.r.f44263k : j12, (i10 & 4096) != 0 ? null : jVar, (i10 & 8192) != 0 ? null : k10, (t) null, (AbstractC5651j) null);
    }

    public final boolean a(y yVar) {
        if (this == yVar) {
            return true;
        }
        if (Z0.n.a(this.f12629b, yVar.f12629b) && AbstractC3557B.K(this.f12630c, yVar.f12630c) && AbstractC3557B.K(this.f12631d, yVar.f12631d) && AbstractC3557B.K(this.f12632e, yVar.f12632e) && AbstractC3557B.K(this.f12633f, yVar.f12633f) && AbstractC3557B.K(this.f12634g, yVar.f12634g) && Z0.n.a(this.f12635h, yVar.f12635h) && AbstractC3557B.K(this.f12636i, yVar.f12636i) && AbstractC3557B.K(this.f12637j, yVar.f12637j) && AbstractC3557B.K(this.f12638k, yVar.f12638k) && r0.r.c(this.f12639l, yVar.f12639l) && AbstractC3557B.K(this.f12642o, yVar.f12642o)) {
            return true;
        }
        return false;
    }

    public final boolean b(y yVar) {
        if (!AbstractC3557B.K(this.f12628a, yVar.f12628a) || !AbstractC3557B.K(this.f12640m, yVar.f12640m) || !AbstractC3557B.K(this.f12641n, yVar.f12641n) || !AbstractC3557B.K(this.f12643p, yVar.f12643p)) {
            return false;
        }
        return true;
    }

    public final y c(y yVar) {
        if (yVar == null) {
            return this;
        }
        Y0.o oVar = yVar.f12628a;
        return A.a(this, oVar.b(), oVar.d(), oVar.a(), yVar.f12629b, yVar.f12630c, yVar.f12631d, yVar.f12632e, yVar.f12633f, yVar.f12634g, yVar.f12635h, yVar.f12636i, yVar.f12637j, yVar.f12638k, yVar.f12639l, yVar.f12640m, yVar.f12641n, yVar.f12642o, yVar.f12643p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (a(yVar) && b(yVar)) {
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
        Y0.o oVar = this.f12628a;
        long b10 = oVar.b();
        int i22 = r0.r.f44264l;
        int a5 = C3970t.a(b10) * 31;
        AbstractC5350n d10 = oVar.d();
        int i23 = 0;
        if (d10 != null) {
            i10 = d10.hashCode();
        } else {
            i10 = 0;
        }
        int d11 = (Z0.n.d(this.f12629b) + ((Float.floatToIntBits(oVar.a()) + ((a5 + i10) * 31)) * 31)) * 31;
        S0.D d12 = this.f12630c;
        if (d12 != null) {
            i11 = d12.f15975Y;
        } else {
            i11 = 0;
        }
        int i24 = (d11 + i11) * 31;
        S0.z zVar = this.f12631d;
        if (zVar != null) {
            i12 = zVar.f16061a;
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        S0.A a10 = this.f12632e;
        if (a10 != null) {
            i13 = a10.f15966a;
        } else {
            i13 = 0;
        }
        int i26 = (i25 + i13) * 31;
        S0.s sVar = this.f12633f;
        if (sVar != null) {
            i14 = sVar.hashCode();
        } else {
            i14 = 0;
        }
        int i27 = (i26 + i14) * 31;
        String str = this.f12634g;
        if (str != null) {
            i15 = str.hashCode();
        } else {
            i15 = 0;
        }
        int d13 = (Z0.n.d(this.f12635h) + ((i27 + i15) * 31)) * 31;
        Y0.a aVar = this.f12636i;
        if (aVar != null) {
            i16 = Float.floatToIntBits(aVar.f22014a);
        } else {
            i16 = 0;
        }
        int i28 = (d13 + i16) * 31;
        Y0.p pVar = this.f12637j;
        if (pVar != null) {
            i17 = pVar.hashCode();
        } else {
            i17 = 0;
        }
        int i29 = (i28 + i17) * 31;
        U0.d dVar = this.f12638k;
        if (dVar != null) {
            i18 = dVar.f17383Y.hashCode();
        } else {
            i18 = 0;
        }
        int n10 = R.a.n(this.f12639l, (i29 + i18) * 31, 31);
        Y0.j jVar = this.f12640m;
        if (jVar != null) {
            i19 = jVar.f22034a;
        } else {
            i19 = 0;
        }
        int i30 = (n10 + i19) * 31;
        K k10 = this.f12641n;
        if (k10 != null) {
            i20 = k10.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        t tVar = this.f12642o;
        if (tVar != null) {
            i21 = tVar.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        AbstractC5651j abstractC5651j = this.f12643p;
        if (abstractC5651j != null) {
            i23 = abstractC5651j.hashCode();
        }
        return i32 + i23;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        Y0.o oVar = this.f12628a;
        sb2.append((Object) r0.r.i(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.d());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) Z0.n.e(this.f12629b));
        sb2.append(", fontWeight=");
        sb2.append(this.f12630c);
        sb2.append(", fontStyle=");
        sb2.append(this.f12631d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f12632e);
        sb2.append(", fontFamily=");
        sb2.append(this.f12633f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f12634g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) Z0.n.e(this.f12635h));
        sb2.append(", baselineShift=");
        sb2.append(this.f12636i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f12637j);
        sb2.append(", localeList=");
        sb2.append(this.f12638k);
        sb2.append(", background=");
        AbstractC0044t0.B(this.f12639l, sb2, ", textDecoration=");
        sb2.append(this.f12640m);
        sb2.append(", shadow=");
        sb2.append(this.f12641n);
        sb2.append(", platformStyle=");
        sb2.append(this.f12642o);
        sb2.append(", drawStyle=");
        sb2.append(this.f12643p);
        sb2.append(')');
        return sb2.toString();
    }

    public y(long j6, long j10, S0.D d10, S0.z zVar, S0.A a5, S0.s sVar, String str, long j11, Y0.a aVar, Y0.p pVar, U0.d dVar, long j12, Y0.j jVar, K k10, t tVar, AbstractC5651j abstractC5651j) {
        this(j6 != r0.r.f44263k ? new Y0.c(j6) : Y0.m.f22036a, j10, d10, zVar, a5, sVar, str, j11, aVar, pVar, dVar, j12, jVar, k10, tVar, abstractC5651j);
    }

    public y(Y0.o oVar, long j6, S0.D d10, S0.z zVar, S0.A a5, S0.s sVar, String str, long j10, Y0.a aVar, Y0.p pVar, U0.d dVar, long j11, Y0.j jVar, K k10, t tVar, AbstractC5651j abstractC5651j) {
        this.f12628a = oVar;
        this.f12629b = j6;
        this.f12630c = d10;
        this.f12631d = zVar;
        this.f12632e = a5;
        this.f12633f = sVar;
        this.f12634g = str;
        this.f12635h = j10;
        this.f12636i = aVar;
        this.f12637j = pVar;
        this.f12638k = dVar;
        this.f12639l = j11;
        this.f12640m = jVar;
        this.f12641n = k10;
        this.f12642o = tVar;
        this.f12643p = abstractC5651j;
    }
}
