package M;

import Df.v;
import E0.AbstractC0445d;
import E0.AbstractC0459s;
import E0.C0458q;
import E0.M;
import E0.O;
import E0.P;
import E0.d0;
import G0.AbstractC0579h;
import G0.AbstractC0590t;
import G0.C;
import G0.J;
import G0.v0;
import L0.t;
import L0.u;
import N0.C1042a;
import N0.C1046e;
import N0.E;
import N0.y;
import Ng.H;
import O0.s;
import S0.r;
import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.Map;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.K;
import t0.AbstractC5646e;
import t0.AbstractC5650i;
import t0.AbstractC5651j;
import t0.C5649h;
import t0.C5653l;
import y.D;
import z.C6672L;

/* loaded from: classes.dex */
public final class q extends AbstractC4325q implements C, AbstractC0590t, v0 {

    /* renamed from: A0  reason: collision with root package name */
    public e f11355A0;

    /* renamed from: B0  reason: collision with root package name */
    public p f11356B0;

    /* renamed from: C0  reason: collision with root package name */
    public final C1724m0 f11357C0 = AbstractC4828h.Z(null, o1.f22665a);

    /* renamed from: s0  reason: collision with root package name */
    public String f11358s0;

    /* renamed from: t0  reason: collision with root package name */
    public E f11359t0;

    /* renamed from: u0  reason: collision with root package name */
    public r f11360u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f11361v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f11362w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f11363x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f11364y0;

    /* renamed from: z0  reason: collision with root package name */
    public Map f11365z0;

    public q(String str, E e10, r rVar, int i10, boolean z10, int i11, int i12) {
        this.f11358s0 = str;
        this.f11359t0 = e10;
        this.f11360u0 = rVar;
        this.f11361v0 = i10;
        this.f11362w0 = z10;
        this.f11363x0 = i11;
        this.f11364y0 = i12;
    }

    public final e A0() {
        if (this.f11355A0 == null) {
            this.f11355A0 = new e(this.f11358s0, this.f11359t0, this.f11360u0, this.f11361v0, this.f11362w0, this.f11363x0, this.f11364y0);
        }
        e eVar = this.f11355A0;
        AbstractC3557B.Z(eVar);
        return eVar;
    }

    @Override // G0.v0
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final e B0(Z0.b bVar) {
        e eVar;
        o C02 = C0();
        if (C02 != null && C02.f11351c && (eVar = C02.f11352d) != null) {
            eVar.c(bVar);
            return eVar;
        }
        e A02 = A0();
        A02.c(bVar);
        return A02;
    }

    public final o C0() {
        return (o) this.f11357C0.getValue();
    }

    @Override // G0.v0
    public final void W(L0.j jVar) {
        p pVar = this.f11356B0;
        if (pVar == null) {
            pVar = new p(this, 0);
            this.f11356B0 = pVar;
        }
        C1046e c1046e = new C1046e(this.f11358s0, null, 6);
        v[] vVarArr = t.f10472a;
        jVar.y(L0.r.f10466v, AbstractC4344b.F0(c1046e));
        o C02 = C0();
        if (C02 != null) {
            boolean z10 = C02.f11351c;
            u uVar = L0.r.f10468x;
            v[] vVarArr2 = t.f10472a;
            v vVar = vVarArr2[13];
            Boolean valueOf = Boolean.valueOf(z10);
            uVar.getClass();
            jVar.y(uVar, valueOf);
            C1046e c1046e2 = new C1046e(C02.f11350b, null, 6);
            u uVar2 = L0.r.f10467w;
            v vVar2 = vVarArr2[12];
            uVar2.getClass();
            jVar.y(uVar2, c1046e2);
        }
        jVar.y(L0.i.f10392i, new L0.a(null, new p(this, 1)));
        jVar.y(L0.i.f10393j, new L0.a(null, new p(this, 2)));
        jVar.y(L0.i.f10394k, new L0.a(null, new C6672L(8, this)));
        t.c(jVar, pVar);
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return B0(abstractC0459s).a(i10, abstractC0459s.getLayoutDirection());
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC4828h.t(B0(abstractC0459s).d(abstractC0459s.getLayoutDirection()).b());
    }

    @Override // G0.C
    public final O e(P p10, M m10, long j6) {
        long j10;
        boolean z10;
        long q02;
        boolean z11;
        N0.o oVar;
        long q03;
        boolean z12;
        e B02 = B0(p10);
        Z0.l layoutDirection = p10.getLayoutDirection();
        if (B02.f11294g > 1) {
            b bVar = B02.f11300m;
            E e10 = B02.f11289b;
            Z0.b bVar2 = B02.f11296i;
            AbstractC3557B.Z(bVar2);
            b n10 = f8.e.n(bVar, layoutDirection, e10, bVar2, B02.f11290c);
            B02.f11300m = n10;
            j10 = n10.a(B02.f11294g, j6);
        } else {
            j10 = j6;
        }
        C1042a c1042a = B02.f11297j;
        if (c1042a != null && (oVar = B02.f11301n) != null && !oVar.a() && layoutDirection == B02.f11302o && (Z0.a.b(j10, B02.f11303p) || (Z0.a.h(j10) == Z0.a.h(B02.f11303p) && Z0.a.g(j10) >= c1042a.b() && !c1042a.f12495d.f13319c))) {
            if (!Z0.a.b(j10, B02.f11303p)) {
                C1042a c1042a2 = B02.f11297j;
                AbstractC3557B.Z(c1042a2);
                B02.f11299l = A7.b.q0(j10, H.c(AbstractC4828h.t(Math.min(c1042a2.f12492a.f17998i.b(), c1042a2.c())), AbstractC4828h.t(c1042a2.b())));
                if (!AbstractC3557B.D0(B02.f11291d, 3) && (((int) (q03 >> 32)) < c1042a2.c() || ((int) (q03 & 4294967295L)) < c1042a2.b())) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                B02.f11298k = z12;
                B02.f11303p = j10;
            }
            z10 = false;
        } else {
            C1042a b10 = B02.b(j10, layoutDirection);
            B02.f11303p = j10;
            B02.f11299l = A7.b.q0(j10, H.c(AbstractC4828h.t(b10.c()), AbstractC4828h.t(b10.b())));
            if (!AbstractC3557B.D0(B02.f11291d, 3) && (((int) (q02 >> 32)) < b10.c() || ((int) (q02 & 4294967295L)) < b10.b())) {
                z11 = true;
            } else {
                z11 = false;
            }
            B02.f11298k = z11;
            B02.f11297j = b10;
            z10 = true;
        }
        N0.o oVar2 = B02.f11301n;
        if (oVar2 != null) {
            oVar2.a();
        }
        C1042a c1042a3 = B02.f11297j;
        AbstractC3557B.Z(c1042a3);
        long j11 = B02.f11299l;
        if (z10) {
            AbstractC0579h.z(this, 2).L0();
            Map map = this.f11365z0;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            C0458q c0458q = AbstractC0445d.f4051a;
            s sVar = c1042a3.f12495d;
            map.put(c0458q, Integer.valueOf(AbstractC4344b.Y0(sVar.c(0))));
            map.put(AbstractC0445d.f4052b, Integer.valueOf(AbstractC4344b.Y0(sVar.c(sVar.f13321e - 1))));
            this.f11365z0 = map;
        }
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        d0 o10 = m10.o(Df.H.L(i10, i11));
        Map map2 = this.f11365z0;
        AbstractC3557B.Z(map2);
        return p10.j0(i10, i11, map2, new D(o10, 11));
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        if (!this.f37732r0) {
            return;
        }
        C1042a c1042a = A0().f11297j;
        if (c1042a != null) {
            AbstractC5352p a5 = ((J) abstractC5646e).f5596Y.f45612Z.a();
            boolean z10 = A0().f11298k;
            if (z10) {
                C5252d K10 = A7.b.K(C5251c.f43619b, AbstractC4828h.i((int) (A0().f11299l >> 32), (int) (A0().f11299l & 4294967295L)));
                a5.h();
                a5.t(K10, 1);
            }
            try {
                y yVar = this.f11359t0.f12487a;
                Y0.j jVar = yVar.f12640m;
                if (jVar == null) {
                    jVar = Y0.j.f22031b;
                }
                Y0.j jVar2 = jVar;
                K k10 = yVar.f12641n;
                if (k10 == null) {
                    k10 = K.f44202d;
                }
                K k11 = k10;
                AbstractC5651j abstractC5651j = yVar.f12643p;
                if (abstractC5651j == null) {
                    abstractC5651j = C5653l.f45622a;
                }
                AbstractC5651j abstractC5651j2 = abstractC5651j;
                AbstractC5350n d10 = yVar.f12628a.d();
                if (d10 != null) {
                    float a10 = this.f11359t0.f12487a.f12628a.a();
                    AbstractC5650i.f45621D.getClass();
                    c1042a.f(a5, d10, a10, k11, jVar2, abstractC5651j2, C5649h.f45619b);
                } else {
                    long j6 = r0.r.f44263k;
                    if (j6 == j6) {
                        if (this.f11359t0.c() != j6) {
                            j6 = this.f11359t0.c();
                        } else {
                            j6 = r0.r.f44254b;
                        }
                    }
                    long j10 = j6;
                    AbstractC5650i.f45621D.getClass();
                    c1042a.e(a5, j10, k11, jVar2, abstractC5651j2, C5649h.f45619b);
                }
                if (z10) {
                    a5.q();
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (z10) {
                    a5.q();
                }
                throw th2;
            }
        }
        throw new IllegalArgumentException("no paragraph".toString());
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC4828h.t(B0(abstractC0459s).d(abstractC0459s.getLayoutDirection()).c());
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return B0(abstractC0459s).a(i10, abstractC0459s.getLayoutDirection());
    }

    @Override // G0.v0
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
