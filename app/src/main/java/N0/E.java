package N0;

import A.AbstractC0044t0;
import id.AbstractC3557B;
import r0.K;
import t0.AbstractC5651j;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: d  reason: collision with root package name */
    public static final E f12486d = new E(0, 16777215);

    /* renamed from: a  reason: collision with root package name */
    public final y f12487a;

    /* renamed from: b  reason: collision with root package name */
    public final p f12488b;

    /* renamed from: c  reason: collision with root package name */
    public final u f12489c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(long j6, int i10) {
        this(new y(r3, r0, (S0.D) null, (S0.z) null, (S0.A) null, (S0.s) null, (String) null, r0, (Y0.a) null, (Y0.p) null, (U0.d) null, r0.r.f44263k, (Y0.j) null, (K) null, (t) null, (AbstractC5651j) null), new p(Integer.MIN_VALUE, Integer.MIN_VALUE, r0, null, null, null, 0, Integer.MIN_VALUE, null), null);
        long j10 = (i10 & 1) != 0 ? r0.r.f44263k : j6;
        long j11 = Z0.n.f22810c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [S0.s] */
    public static E a(int i10, int i11, int i12, long j6, long j10, long j11, long j12, u uVar, E e10, S0.E e11, S0.D d10, Y0.g gVar) {
        long j13;
        long j14;
        S0.D d11;
        S0.E e12;
        long j15;
        int i13;
        U0.d dVar;
        int i14;
        long j16;
        Y0.p pVar;
        u uVar2;
        Y0.g gVar2;
        Y0.o oVar;
        t tVar;
        Y0.o oVar2;
        if ((i12 & 1) != 0) {
            j13 = e10.f12487a.f12628a.b();
        } else {
            j13 = j6;
        }
        if ((i12 & 2) != 0) {
            j14 = e10.f12487a.f12629b;
        } else {
            j14 = j10;
        }
        if ((i12 & 4) != 0) {
            d11 = e10.f12487a.f12630c;
        } else {
            d11 = d10;
        }
        y yVar = e10.f12487a;
        S0.z zVar = yVar.f12631d;
        S0.A a5 = yVar.f12632e;
        if ((i12 & 32) != 0) {
            e12 = yVar.f12633f;
        } else {
            e12 = e11;
        }
        String str = yVar.f12634g;
        if ((i12 & 128) != 0) {
            j15 = yVar.f12635h;
        } else {
            j15 = j11;
        }
        Y0.a aVar = yVar.f12636i;
        Y0.p pVar2 = yVar.f12637j;
        U0.d dVar2 = yVar.f12638k;
        long j17 = j15;
        long j18 = yVar.f12639l;
        Y0.j jVar = yVar.f12640m;
        K k10 = yVar.f12641n;
        AbstractC5651j abstractC5651j = yVar.f12643p;
        if ((i12 & 32768) != 0) {
            dVar = dVar2;
            i13 = e10.f12488b.f12549a;
        } else {
            dVar = dVar2;
            i13 = i10;
        }
        if ((65536 & i12) != 0) {
            i14 = e10.f12488b.f12550b;
        } else {
            i14 = i11;
        }
        if ((131072 & i12) != 0) {
            pVar = pVar2;
            j16 = e10.f12488b.f12551c;
        } else {
            pVar = pVar2;
            j16 = j12;
        }
        p pVar3 = e10.f12488b;
        Y0.q qVar = pVar3.f12552d;
        if ((i12 & 524288) != 0) {
            uVar2 = e10.f12489c;
        } else {
            uVar2 = uVar;
        }
        if ((i12 & 1048576) != 0) {
            gVar2 = pVar3.f12554f;
        } else {
            gVar2 = gVar;
        }
        int i15 = pVar3.f12555g;
        int i16 = pVar3.f12556h;
        Y0.r rVar = pVar3.f12557i;
        if (r0.r.c(j13, yVar.f12628a.b())) {
            oVar = yVar.f12628a;
        } else {
            if (j13 != r0.r.f44263k) {
                oVar2 = new Y0.c(j13);
            } else {
                oVar2 = Y0.m.f22036a;
            }
            oVar = oVar2;
        }
        s sVar = null;
        if (uVar2 != null) {
            tVar = uVar2.f12567a;
        } else {
            tVar = null;
        }
        y yVar2 = new y(oVar, j14, d11, zVar, a5, e12, str, j17, aVar, pVar, dVar, j18, jVar, k10, tVar, abstractC5651j);
        if (uVar2 != null) {
            sVar = uVar2.f12568b;
        }
        return new E(yVar2, new p(i13, i14, j16, qVar, sVar, gVar2, i15, i16, rVar), uVar2);
    }

    public static E b(E e10, long j6) {
        Y0.o oVar;
        Y0.r rVar;
        U0.d dVar;
        t tVar;
        s sVar;
        Y0.o oVar2;
        y yVar = e10.f12487a;
        long j10 = yVar.f12629b;
        S0.D d10 = yVar.f12630c;
        S0.z zVar = yVar.f12631d;
        S0.A a5 = yVar.f12632e;
        S0.s sVar2 = yVar.f12633f;
        String str = yVar.f12634g;
        long j11 = yVar.f12635h;
        Y0.a aVar = yVar.f12636i;
        Y0.p pVar = yVar.f12637j;
        U0.d dVar2 = yVar.f12638k;
        long j12 = yVar.f12639l;
        Y0.j jVar = yVar.f12640m;
        K k10 = yVar.f12641n;
        AbstractC5651j abstractC5651j = yVar.f12643p;
        p pVar2 = e10.f12488b;
        int i10 = pVar2.f12549a;
        int i11 = pVar2.f12550b;
        long j13 = pVar2.f12551c;
        Y0.q qVar = pVar2.f12552d;
        u uVar = e10.f12489c;
        Y0.g gVar = pVar2.f12554f;
        int i12 = pVar2.f12555g;
        int i13 = pVar2.f12556h;
        Y0.r rVar2 = pVar2.f12557i;
        if (r0.r.c(j6, yVar.f12628a.b())) {
            oVar = yVar.f12628a;
        } else {
            if (j6 != r0.r.f44263k) {
                oVar2 = new Y0.c(j6);
            } else {
                oVar2 = Y0.m.f22036a;
            }
            oVar = oVar2;
        }
        if (uVar != null) {
            tVar = uVar.f12567a;
            dVar = dVar2;
            rVar = rVar2;
        } else {
            dVar = dVar2;
            rVar = rVar2;
            tVar = null;
        }
        y yVar2 = new y(oVar, j10, d10, zVar, a5, sVar2, str, j11, aVar, pVar, dVar, j12, jVar, k10, tVar, abstractC5651j);
        if (uVar != null) {
            sVar = uVar.f12568b;
        } else {
            sVar = null;
        }
        return new E(yVar2, new p(i10, i11, j13, qVar, sVar, gVar, i12, i13, rVar), uVar);
    }

    public static E f(int i10, int i11, long j6, long j10, long j11, long j12, E e10, S0.s sVar, S0.z zVar, S0.D d10, Y0.j jVar) {
        long j13;
        S0.D d11;
        S0.z zVar2;
        S0.s sVar2;
        long j14;
        Y0.j jVar2;
        int i12;
        long j15;
        if ((i11 & 2) != 0) {
            j13 = Z0.n.f22810c;
        } else {
            j13 = j10;
        }
        if ((i11 & 4) != 0) {
            d11 = null;
        } else {
            d11 = d10;
        }
        if ((i11 & 8) != 0) {
            zVar2 = null;
        } else {
            zVar2 = zVar;
        }
        if ((i11 & 32) != 0) {
            sVar2 = null;
        } else {
            sVar2 = sVar;
        }
        if ((i11 & 128) != 0) {
            j14 = Z0.n.f22810c;
        } else {
            j14 = j11;
        }
        long j16 = r0.r.f44263k;
        if ((i11 & 4096) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((32768 & i11) != 0) {
            i12 = Integer.MIN_VALUE;
        } else {
            i12 = i10;
        }
        if ((i11 & 131072) != 0) {
            j15 = Z0.n.f22810c;
        } else {
            j15 = j12;
        }
        y a5 = A.a(e10.f12487a, j6, null, Float.NaN, j13, d11, zVar2, null, sVar2, null, j14, null, null, null, j16, jVar2, null, null, null);
        p a10 = q.a(e10.f12488b, i12, Integer.MIN_VALUE, j15, null, null, null, 0, Integer.MIN_VALUE, null);
        if (e10.f12487a == a5 && e10.f12488b == a10) {
            return e10;
        }
        return new E(a5, a10);
    }

    public final long c() {
        return this.f12487a.f12628a.b();
    }

    public final boolean d(E e10) {
        if (this != e10) {
            if (!AbstractC3557B.K(this.f12488b, e10.f12488b) || !this.f12487a.a(e10.f12487a)) {
                return false;
            }
        }
        return true;
    }

    public final E e(E e10) {
        if (e10 != null && !AbstractC3557B.K(e10, f12486d)) {
            return new E(this.f12487a.c(e10.f12487a), this.f12488b.a(e10.f12488b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        if (AbstractC3557B.K(this.f12487a, e10.f12487a) && AbstractC3557B.K(this.f12488b, e10.f12488b) && AbstractC3557B.K(this.f12489c, e10.f12489c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f12488b.hashCode() + (this.f12487a.hashCode() * 31)) * 31;
        u uVar = this.f12489c;
        if (uVar != null) {
            i10 = uVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) r0.r.i(c()));
        sb2.append(", brush=");
        y yVar = this.f12487a;
        sb2.append(yVar.f12628a.d());
        sb2.append(", alpha=");
        sb2.append(yVar.f12628a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) Z0.n.e(yVar.f12629b));
        sb2.append(", fontWeight=");
        sb2.append(yVar.f12630c);
        sb2.append(", fontStyle=");
        sb2.append(yVar.f12631d);
        sb2.append(", fontSynthesis=");
        sb2.append(yVar.f12632e);
        sb2.append(", fontFamily=");
        sb2.append(yVar.f12633f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(yVar.f12634g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) Z0.n.e(yVar.f12635h));
        sb2.append(", baselineShift=");
        sb2.append(yVar.f12636i);
        sb2.append(", textGeometricTransform=");
        sb2.append(yVar.f12637j);
        sb2.append(", localeList=");
        sb2.append(yVar.f12638k);
        sb2.append(", background=");
        AbstractC0044t0.B(yVar.f12639l, sb2, ", textDecoration=");
        sb2.append(yVar.f12640m);
        sb2.append(", shadow=");
        sb2.append(yVar.f12641n);
        sb2.append(", drawStyle=");
        sb2.append(yVar.f12643p);
        sb2.append(", textAlign=");
        p pVar = this.f12488b;
        sb2.append((Object) Y0.i.b(pVar.f12549a));
        sb2.append(", textDirection=");
        sb2.append((Object) Y0.k.b(pVar.f12550b));
        sb2.append(", lineHeight=");
        sb2.append((Object) Z0.n.e(pVar.f12551c));
        sb2.append(", textIndent=");
        sb2.append(pVar.f12552d);
        sb2.append(", platformStyle=");
        sb2.append(this.f12489c);
        sb2.append(", lineHeightStyle=");
        sb2.append(pVar.f12554f);
        sb2.append(", lineBreak=");
        sb2.append((Object) Y0.e.a(pVar.f12555g));
        sb2.append(", hyphens=");
        sb2.append((Object) Y0.d.b(pVar.f12556h));
        sb2.append(", textMotion=");
        sb2.append(pVar.f12557i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(long j6, long j10, S0.D d10, S0.z zVar, S0.E e10, int i10) {
        this(new y(r3, r5, r7, r8, (S0.A) null, r10, (String) null, r23, (Y0.a) null, (Y0.p) null, (U0.d) null, r0.r.f44263k, (Y0.j) null, (K) null, (t) null, (AbstractC5651j) null), new p(Integer.MIN_VALUE, Integer.MIN_VALUE, r23, null, null, null, 0, Integer.MIN_VALUE, null), null);
        long j11 = (i10 & 1) != 0 ? r0.r.f44263k : j6;
        long j12 = (i10 & 2) != 0 ? Z0.n.f22810c : j10;
        S0.D d11 = (i10 & 4) != 0 ? null : d10;
        S0.z zVar2 = (i10 & 8) != 0 ? null : zVar;
        S0.E e11 = (i10 & 32) != 0 ? null : e10;
        long j13 = Z0.n.f22810c;
    }

    public E(y yVar, p pVar, u uVar) {
        this.f12487a = yVar;
        this.f12488b = pVar;
        this.f12489c = uVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E(y yVar, p pVar) {
        this(yVar, pVar, (r0 == null && r1 == null) ? null : new u(r0, r1));
        t tVar = yVar.f12642o;
        s sVar = pVar.f12553e;
    }
}
