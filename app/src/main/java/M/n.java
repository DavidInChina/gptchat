package M;

import Df.H;
import Df.v;
import E0.AbstractC0445d;
import E0.AbstractC0459s;
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
import N.C1030n;
import N.C1034s;
import N.m0;
import N0.B;
import N0.C1046e;
import N0.E;
import N0.y;
import S0.r;
import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import l0.AbstractC4325q;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5252d;
import q0.C5254f;
import r0.AbstractC5350n;
import r0.AbstractC5352p;
import r0.C5344h;
import r0.K;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.AbstractC5651j;
import t0.C5643b;
import t0.C5644c;
import t0.C5653l;
import y.D;
import z.C6672L;

/* loaded from: classes.dex */
public final class n extends AbstractC4325q implements C, AbstractC0590t, v0 {

    /* renamed from: A0  reason: collision with root package name */
    public List f11334A0;

    /* renamed from: B0  reason: collision with root package name */
    public wf.k f11335B0;

    /* renamed from: C0  reason: collision with root package name */
    public h f11336C0;

    /* renamed from: D0  reason: collision with root package name */
    public Map f11337D0;

    /* renamed from: E0  reason: collision with root package name */
    public d f11338E0;

    /* renamed from: F0  reason: collision with root package name */
    public m f11339F0;

    /* renamed from: G0  reason: collision with root package name */
    public final C1724m0 f11340G0 = AbstractC4828h.Z(null, o1.f22665a);

    /* renamed from: s0  reason: collision with root package name */
    public C1046e f11341s0;

    /* renamed from: t0  reason: collision with root package name */
    public E f11342t0;

    /* renamed from: u0  reason: collision with root package name */
    public r f11343u0;

    /* renamed from: v0  reason: collision with root package name */
    public wf.k f11344v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f11345w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f11346x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f11347y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f11348z0;

    public n(C1046e c1046e, E e10, r rVar, wf.k kVar, int i10, boolean z10, int i11, int i12, List list, wf.k kVar2, h hVar) {
        this.f11341s0 = c1046e;
        this.f11342t0 = e10;
        this.f11343u0 = rVar;
        this.f11344v0 = kVar;
        this.f11345w0 = i10;
        this.f11346x0 = z10;
        this.f11347y0 = i11;
        this.f11348z0 = i12;
        this.f11334A0 = list;
        this.f11335B0 = kVar2;
        this.f11336C0 = hVar;
    }

    public final void A0(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (!this.f37732r0) {
            return;
        }
        if (z11 || (z10 && this.f11339F0 != null)) {
            AbstractC0579h.v(this);
        }
        if (z11 || z12 || z13) {
            d B02 = B0();
            C1046e c1046e = this.f11341s0;
            E e10 = this.f11342t0;
            r rVar = this.f11343u0;
            int i10 = this.f11345w0;
            boolean z14 = this.f11346x0;
            int i11 = this.f11347y0;
            int i12 = this.f11348z0;
            List list = this.f11334A0;
            B02.f11272a = c1046e;
            B02.f11273b = e10;
            B02.f11274c = rVar;
            B02.f11275d = i10;
            B02.f11276e = z14;
            B02.f11277f = i11;
            B02.f11278g = i12;
            B02.f11279h = list;
            B02.f11283l = null;
            B02.f11285n = null;
            B02.f11287p = -1;
            B02.f11286o = -1;
            AbstractC0579h.u(this);
            AbstractC0579h.t(this);
        }
        if (z10) {
            AbstractC0579h.t(this);
        }
    }

    @Override // G0.v0
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final d B0() {
        if (this.f11338E0 == null) {
            this.f11338E0 = new d(this.f11341s0, this.f11342t0, this.f11343u0, this.f11345w0, this.f11346x0, this.f11347y0, this.f11348z0, this.f11334A0);
        }
        d dVar = this.f11338E0;
        AbstractC3557B.Z(dVar);
        return dVar;
    }

    public final d C0(Z0.b bVar) {
        d dVar;
        l D02 = D0();
        if (D02 != null && D02.f11330c && (dVar = D02.f11331d) != null) {
            dVar.c(bVar);
            return dVar;
        }
        d B02 = B0();
        B02.c(bVar);
        return B02;
    }

    public final l D0() {
        return (l) this.f11340G0.getValue();
    }

    public final boolean E0(wf.k kVar, wf.k kVar2, h hVar) {
        boolean z10;
        if (!AbstractC3557B.K(this.f11344v0, kVar)) {
            this.f11344v0 = kVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (!AbstractC3557B.K(this.f11335B0, kVar2)) {
            this.f11335B0 = kVar2;
            z10 = true;
        }
        if (!AbstractC3557B.K(this.f11336C0, hVar)) {
            this.f11336C0 = hVar;
            return true;
        }
        return z10;
    }

    public final boolean F0(E e10, List list, int i10, int i11, boolean z10, r rVar, int i12) {
        boolean z11 = !this.f11342t0.d(e10);
        this.f11342t0 = e10;
        if (!AbstractC3557B.K(this.f11334A0, list)) {
            this.f11334A0 = list;
            z11 = true;
        }
        if (this.f11348z0 != i10) {
            this.f11348z0 = i10;
            z11 = true;
        }
        if (this.f11347y0 != i11) {
            this.f11347y0 = i11;
            z11 = true;
        }
        if (this.f11346x0 != z10) {
            this.f11346x0 = z10;
            z11 = true;
        }
        if (!AbstractC3557B.K(this.f11343u0, rVar)) {
            this.f11343u0 = rVar;
            z11 = true;
        }
        if (!AbstractC3557B.D0(this.f11345w0, i12)) {
            this.f11345w0 = i12;
            return true;
        }
        return z11;
    }

    @Override // G0.v0
    public final void W(L0.j jVar) {
        m mVar = this.f11339F0;
        if (mVar == null) {
            mVar = new m(this, 0);
            this.f11339F0 = mVar;
        }
        C1046e c1046e = this.f11341s0;
        v[] vVarArr = t.f10472a;
        jVar.y(L0.r.f10466v, AbstractC4344b.F0(c1046e));
        l D02 = D0();
        if (D02 != null) {
            C1046e c1046e2 = D02.f11329b;
            u uVar = L0.r.f10467w;
            v[] vVarArr2 = t.f10472a;
            v vVar = vVarArr2[12];
            uVar.getClass();
            jVar.y(uVar, c1046e2);
            boolean z10 = D02.f11330c;
            u uVar2 = L0.r.f10468x;
            v vVar2 = vVarArr2[13];
            Boolean valueOf = Boolean.valueOf(z10);
            uVar2.getClass();
            jVar.y(uVar2, valueOf);
        }
        jVar.y(L0.i.f10392i, new L0.a(null, new m(this, 1)));
        jVar.y(L0.i.f10393j, new L0.a(null, new m(this, 2)));
        jVar.y(L0.i.f10394k, new L0.a(null, new C6672L(7, this)));
        t.c(jVar, mVar);
    }

    @Override // G0.C
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return C0(abstractC0459s).a(i10, abstractC0459s.getLayoutDirection());
    }

    @Override // G0.C
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC4828h.t(C0(abstractC0459s).d(abstractC0459s.getLayoutDirection()).b());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    @Override // G0.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final O e(P p10, M m10, long j6) {
        boolean z10;
        N0.C c10;
        d C02 = C0(p10);
        Z0.l layoutDirection = p10.getLayoutDirection();
        if (C02.f11278g > 1) {
            b bVar = C02.f11280i;
            E e10 = C02.f11273b;
            Z0.b bVar2 = C02.f11282k;
            AbstractC3557B.Z(bVar2);
            b n10 = f8.e.n(bVar, layoutDirection, e10, bVar2, C02.f11274c);
            C02.f11280i = n10;
            j6 = n10.a(C02.f11278g, j6);
        }
        N0.C c11 = C02.f11285n;
        if (c11 != null) {
            N0.i iVar = c11.f12478b;
            if (!iVar.f12524a.a()) {
                B b10 = c11.f12477a;
                if (layoutDirection == b10.f12474h) {
                    long j10 = b10.f12476j;
                    if (Z0.a.b(j6, j10) || (Z0.a.h(j6) == Z0.a.h(j10) && Z0.a.g(j6) >= iVar.f12528e && !iVar.f12526c)) {
                        N0.C c12 = C02.f11285n;
                        AbstractC3557B.Z(c12);
                        if (Z0.a.b(j6, c12.f12477a.f12476j)) {
                            z10 = false;
                            c10 = C02.f11285n;
                            if (c10 != null) {
                                c10.f12478b.f12524a.a();
                                if (z10) {
                                    AbstractC0579h.z(this, 2).L0();
                                    wf.k kVar = this.f11344v0;
                                    if (kVar != null) {
                                        kVar.invoke(c10);
                                    }
                                    h hVar = this.f11336C0;
                                    if (hVar != null) {
                                        hVar.f11313i0 = k.a(hVar.f11313i0, null, c10, 1);
                                    }
                                    this.f11337D0 = AbstractC4268D.a1(new C3959i(AbstractC0445d.f4051a, Integer.valueOf(AbstractC4344b.Y0(c10.f12480d))), new C3959i(AbstractC0445d.f4052b, Integer.valueOf(AbstractC4344b.Y0(c10.f12481e))));
                                }
                                wf.k kVar2 = this.f11335B0;
                                if (kVar2 != null) {
                                    kVar2.invoke(c10.f12482f);
                                }
                                long j11 = c10.f12479c;
                                int i10 = (int) (j11 >> 32);
                                int i11 = (int) (j11 & 4294967295L);
                                d0 o10 = m10.o(H.L(i10, i11));
                                Map map = this.f11337D0;
                                AbstractC3557B.Z(map);
                                return p10.j0(i10, i11, map, new D(o10, 10));
                            }
                            throw new IllegalStateException("You must call layoutWithConstraints first");
                        }
                        N0.C c13 = C02.f11285n;
                        AbstractC3557B.Z(c13);
                        C02.f11285n = C02.e(layoutDirection, j6, c13.f12478b);
                        z10 = true;
                        c10 = C02.f11285n;
                        if (c10 != null) {
                        }
                    }
                }
            }
        }
        C02.f11285n = C02.e(layoutDirection, j6, C02.b(j6, layoutDirection));
        z10 = true;
        c10 = C02.f11285n;
        if (c10 != null) {
        }
    }

    @Override // G0.AbstractC0590t
    public final void f(AbstractC5646e abstractC5646e) {
        C1034s c1034s;
        int i10;
        int i11;
        int i12;
        C5344h c5344h;
        N0.C c10;
        if (!this.f37732r0) {
            return;
        }
        h hVar = this.f11336C0;
        boolean z10 = false;
        if (hVar != null && (c1034s = (C1034s) ((m0) hVar.f11311Z).a().get(Long.valueOf(hVar.f11310Y))) != null) {
            N.r rVar = c1034s.f12409b;
            N.r rVar2 = c1034s.f12408a;
            boolean z11 = c1034s.f12410c;
            if (!z11) {
                i10 = rVar2.f12404b;
            } else {
                i10 = rVar.f12404b;
            }
            if (!z11) {
                i11 = rVar.f12404b;
            } else {
                i11 = rVar2.f12404b;
            }
            if (i10 != i11) {
                C1030n c1030n = hVar.f11314j0;
                if (c1030n != null && (c10 = (N0.C) c1030n.f12385c.mo122invoke()) != null) {
                    i12 = c1030n.b(c10);
                } else {
                    i12 = 0;
                }
                if (i10 > i12) {
                    i10 = i12;
                }
                if (i11 > i12) {
                    i11 = i12;
                }
                N0.C c11 = hVar.f11313i0.f11327b;
                if (c11 != null) {
                    c5344h = c11.o(i10, i11);
                } else {
                    c5344h = null;
                }
                C5344h c5344h2 = c5344h;
                if (c5344h2 != null) {
                    N0.C c12 = hVar.f11313i0.f11327b;
                    if (c12 != null && !AbstractC3557B.D0(c12.f12477a.f12472f, 3) && c12.d()) {
                        float d10 = C5254f.d(((J) abstractC5646e).f5596Y.g());
                        C5644c c5644c = ((J) abstractC5646e).f5596Y;
                        float b10 = C5254f.b(c5644c.g());
                        C5643b c5643b = c5644c.f45612Z;
                        long b11 = c5643b.b();
                        c5643b.a().h();
                        c5643b.f45609a.a(0.0f, 0.0f, d10, b10, 1);
                        AbstractC5648g.i(abstractC5646e, c5344h2, hVar.f11312h0, 0.0f, null, 60);
                        c5643b.a().q();
                        c5643b.c(b11);
                    } else {
                        AbstractC5648g.i(abstractC5646e, c5344h2, hVar.f11312h0, 0.0f, null, 60);
                    }
                }
            }
        }
        AbstractC5352p a5 = ((J) abstractC5646e).f5596Y.f45612Z.a();
        N0.C c13 = C0(abstractC5646e).f11285n;
        if (c13 != null) {
            if (c13.d() && !AbstractC3557B.D0(this.f11345w0, 3)) {
                z10 = true;
            }
            if (z10) {
                long j6 = c13.f12479c;
                C5252d K10 = A7.b.K(C5251c.f43619b, AbstractC4828h.i((int) (j6 >> 32), (int) (j6 & 4294967295L)));
                a5.h();
                a5.t(K10, 1);
            }
            try {
                y yVar = this.f11342t0.f12487a;
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
                AbstractC5350n d11 = yVar.f12628a.d();
                N0.i iVar = c13.f12478b;
                if (d11 != null) {
                    N0.i.b(iVar, a5, d11, this.f11342t0.f12487a.f12628a.a(), k11, jVar2, abstractC5651j2);
                } else {
                    long j10 = r0.r.f44263k;
                    if (j10 == j10) {
                        if (this.f11342t0.c() != j10) {
                            j10 = this.f11342t0.c();
                        } else {
                            j10 = r0.r.f44254b;
                        }
                    }
                    N0.i.a(iVar, a5, j10, k11, jVar2, abstractC5651j2);
                }
                if (z10) {
                    a5.q();
                }
                List list = this.f11334A0;
                if (list != null && !list.isEmpty()) {
                    ((J) abstractC5646e).a();
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
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    @Override // G0.C
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return AbstractC4828h.t(C0(abstractC0459s).d(abstractC0459s.getLayoutDirection()).c());
    }

    @Override // G0.C
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return C0(abstractC0459s).a(i10, abstractC0459s.getLayoutDirection());
    }

    @Override // G0.v0
    public final /* synthetic */ boolean l0() {
        return false;
    }

    @Override // G0.AbstractC0590t
    public final /* synthetic */ void G() {
    }
}
