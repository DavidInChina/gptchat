package Bh;

import A.AbstractC0044t0;
import Eh.AbstractC0512k;
import Eh.C0509h;
import Eh.EnumC0516o;
import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rh.AbstractC5496c;
import wh.AbstractC6242g;
import wh.AbstractC6250o;
import wh.AbstractC6256u;
import yh.AbstractC6612h;
import yh.AbstractC6624m;
import yh.C6641v;
import yh.H1;
import yh.l1;

/* renamed from: Bh.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262o0 extends R0 {

    /* renamed from: w  reason: collision with root package name */
    public final P f2370w;

    public C0262o0(l1 l1Var, ph.f fVar, C0245g c0245g, S s10, C0242e0 c0242e0, List list, vh.l lVar, AbstractC6256u abstractC6256u, AbstractC6256u abstractC6256u2, AbstractC6624m abstractC6624m, Eh.A a5, AbstractC0252j0 abstractC0252j0, Fh.F f6, AbstractC5496c abstractC5496c, Fh.n nVar, int i10, Gh.b bVar, AbstractC0512k abstractC0512k, int i11, AbstractC0241e abstractC0241e, Rh.l1 l1Var2) {
        super(l1Var, fVar, c0245g, c0242e0, list, lVar, abstractC6256u, abstractC6256u2, abstractC6624m, a5, abstractC0252j0, f6, abstractC5496c, nVar, i10, bVar, abstractC0512k, i11, abstractC0241e, l1Var2);
        this.f2370w = s10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [io.sentry.vendor.b] */
    @Override // Bh.R0
    public final F0 a(AbstractC0252j0 abstractC0252j0, AbstractC0258m0 abstractC0258m0) {
        EnumC0516o enumC0516o;
        C0239d c0239d;
        l1 l1Var;
        String str;
        String str2;
        AbstractC5496c abstractC5496c = this.f2261m;
        int a5 = abstractC5496c.a(0);
        int c10 = abstractC5496c.c(0);
        ((EnumC0237c) this.f2267s).getClass();
        C0239d c0239d2 = new C0239d(a5, this.f2268t);
        int i10 = a5 & 2;
        ph.f fVar = this.f2250b;
        if (i10 == 0 && fVar.d(ph.f.f43190l0)) {
            if ((c10 & 8) == 0) {
                enumC0516o = EnumC0516o.f4796Y;
            } else {
                enumC0516o = EnumC0516o.f4797Z;
            }
        } else {
            enumC0516o = EnumC0516o.f4798h0;
        }
        C0509h a10 = this.f2265q.a(this.f2249a, this.f2264p, abstractC0252j0, fVar, fVar, enumC0516o);
        if (AbstractC0044t0.j(this.f2266r)) {
            c0239d = new io.sentry.vendor.b(Sh.I.f16703b, c0239d2, 0);
        } else {
            c0239d = c0239d2;
        }
        io.sentry.vendor.b b10 = this.f2261m.b(this.f2249a, c0239d, a10, this.f2268t, this.f2254f, this.f2255g, a5, c10);
        int i11 = this.f2250b.f43205Y;
        l1 l1Var2 = this.f2249a;
        int d12 = l1Var2.d1(!l1Var2.E0());
        String D02 = l1Var2.D0();
        String N02 = l1Var2.N0();
        if (l1Var2.L() == null) {
            l1Var = C6641v.l1(Object.class);
        } else {
            l1Var = l1Var2.L().l0();
        }
        b10.a(i11, d12, D02, N02, l1Var.D0(), l1Var2.o0().Q().z0());
        if (!l1Var2.x()) {
            b10.o(l1Var2.v().D0());
        }
        AbstractC6242g s02 = l1Var2.s0();
        if (s02 != null) {
            b10.r(s02.mo118a().D0(), s02.D0(), s02.getDescriptor());
        } else if (l1Var2.m() || l1Var2.K()) {
            b10.r(l1Var2.W().D0(), null, null);
        }
        Fh.n nVar = this.f2262n;
        Fh.m mVar = (Fh.m) nVar;
        mVar.getClass();
        this.f2260l.a(b10, l1Var2, mVar);
        if (l1Var2.x()) {
            H1 d02 = l1Var2.d0();
            AbstractC1230h a11 = AbstractC1235m.a(l1Var2);
            AbstractC1239q abstractC1239q = (AbstractC1239q) d02;
            int i12 = abstractC1239q.f15001Y;
            AbstractC1239q abstractC1239q2 = abstractC1239q;
            switch (i12) {
                case 0:
                    ArrayList arrayList = new ArrayList(abstractC1239q.size());
                    Iterator it = abstractC1239q.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!a11.a(next)) {
                            arrayList.add(next);
                        }
                    }
                    int size = arrayList.size();
                    int size2 = abstractC1239q.size();
                    abstractC1239q2 = abstractC1239q;
                    if (size != size2) {
                        abstractC1239q2 = abstractC1239q.y(arrayList);
                        break;
                    }
                    break;
            }
            for (l1 l1Var3 : (H1) abstractC1239q2) {
                b10.p(l1Var3.D0());
            }
        }
        for (l1 l1Var4 : l1Var2.b1()) {
            b10.t(l1Var4.D0());
        }
        l1 mo118a = l1Var2.mo118a();
        if (mo118a != null) {
            b10.k(l1Var2.D0(), l1Var2.u0(), mo118a.D0(), l1Var2.o());
        } else if (l1Var2.m()) {
            b10.k(l1Var2.D0(), l1Var2.u0(), null, l1Var2.o());
        } else if (l1Var2.K()) {
            b10.k(l1Var2.D0(), l1Var2.u0(), null, null);
        }
        for (l1 l1Var5 : l1Var2.F()) {
            String D03 = l1Var5.D0();
            if (l1Var5.c1()) {
                str = l1Var2.D0();
            } else {
                str = null;
            }
            if (l1Var5.K()) {
                str2 = null;
            } else {
                str2 = l1Var5.o();
            }
            b10.k(D03, l1Var5.u0(), str, str2);
        }
        for (AbstractC6612h abstractC6612h : this.f2257i) {
            ((d1) ((C0242e0) this.f2252d).a(abstractC6612h)).a(b10, nVar);
        }
        for (vh.g gVar : this.f2254f) {
            ((S0) ((C0245g) this.f2251c).a(gVar)).a(b10, nVar);
        }
        Iterator it2 = this.f2256h.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            P p10 = this.f2370w;
            if (hasNext) {
                ((S) p10).a((AbstractC6250o) it2.next()).f(b10, a10, nVar);
            } else {
                a10.a(new C0246g0(l1Var2, p10, nVar), b10, nVar);
                b10.g();
                return new F0(this, c0239d2.C(), new ArrayList(a10.f4791h.values()));
            }
        }
    }

    @Override // Bh.R0
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C0262o0.class != obj.getClass()) {
            return false;
        }
        if (!this.f2370w.equals(((C0262o0) obj).f2370w)) {
            return false;
        }
        return true;
    }

    @Override // Bh.R0
    public final int hashCode() {
        return this.f2370w.hashCode() + (super.hashCode() * 31);
    }
}
