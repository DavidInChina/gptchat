package Dh;

import Bh.AbstractC0241e;
import Bh.AbstractC0263p;
import Bh.AbstractC0265q;
import Bh.C0242e0;
import Bh.C0244f0;
import Bh.C0245g;
import Bh.C0247h;
import Bh.C0262o0;
import Bh.H;
import Bh.R0;
import Bh.S;
import Bh.W;
import Bh.f1;
import Eh.AbstractC0512k;
import Fh.F;
import Qh.AbstractC1243v;
import Qh.G;
import Rh.C1299f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rh.AbstractC5496c;
import sh.AbstractC5634f;
import sh.C5629a;
import th.C5805m;
import wh.C6247l;
import wh.C6253r;
import yh.l1;
import yh.t1;
import zh.AbstractC6869C;
import zh.AbstractC6884l;
import zh.Q;

/* loaded from: classes.dex */
public final class i extends AbstractC6884l {

    /* renamed from: r  reason: collision with root package name */
    public final g f3719r;

    public i(AbstractC0263p abstractC0263p, C0247h c0247h, W w10, C0244f0 c0244f0, F f6, AbstractC5496c abstractC5496c, ph.f fVar, Gh.b bVar, Fh.n nVar, int i10, AbstractC0512k abstractC0512k, H h10, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v, List list, g gVar) {
        super(abstractC0263p, c0247h, w10, c0244f0, f6, abstractC5496c, fVar, bVar, nVar, i10, abstractC0512k, h10, i11, q10, abstractC0241e, abstractC1243v, list);
        this.f3719r = gVar;
    }

    @Override // zh.AbstractC6884l
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        if (!this.f3719r.equals(((i) obj).f3719r)) {
            return false;
        }
        return true;
    }

    @Override // zh.AbstractC6886n
    public final f1 h() {
        AbstractC0265q abstractC0265q;
        int i10 = C1299f.f15838k0;
        C1299f c1299f = new C1299f(new y7.b(19), ClassLoader.getSystemClassLoader());
        f fVar = (f) this.f3719r;
        W b10 = fVar.b(this.f52134c);
        AbstractC0263p abstractC0263p = this.f52132a;
        if (!((AbstractC5634f) abstractC0263p).h1(512)) {
            List<C6247l> a5 = fVar.a(abstractC0263p);
            ArrayList arrayList = new ArrayList(a5.size());
            for (C6247l c6247l : a5) {
                String str = c6247l.f48550a;
                int c10 = fVar.c(c6247l.f48551b);
                C5629a c5629a = new C5629a(c6247l.f48552c);
                C5629a c5629a2 = new C5629a(c6247l.f48554e);
                t1 t1Var = new t1(c6247l.f48555f);
                f fVar2 = fVar;
                C5805m c5805m = new C5805m(0, c6247l.f48556g);
                l1.a aVar = l1.a.f51045N;
                arrayList.add(new C6247l(str, c10, c5629a, c6247l.f48553d, c5629a2, t1Var, c5805m, c6247l.f48557h, null));
                fVar = fVar2;
            }
            Iterator it = arrayList.iterator();
            abstractC0265q = abstractC0263p;
            while (it.hasNext()) {
                abstractC0265q = abstractC0265q.n((C6247l) it.next());
            }
        } else {
            abstractC0265q = abstractC0263p;
        }
        h hVar = new h(this.f52147p);
        S a10 = b10.b(abstractC0265q, this.f52143l, this.f52144m, this.f52145n, hVar).a(j.SUPER_CLASS, this.f52138g);
        C0247h c0247h = this.f52133b;
        l1 l1Var = a10.f2269a;
        C0245g a11 = c0247h.a(l1Var);
        C0242e0 a12 = this.f52135d.a(l1Var);
        Rh.l1 e10 = Rh.l1.e(this.f52148q, abstractC0263p, c1299f);
        String str2 = R0.f2247u;
        vh.l U02 = l1Var.U0();
        C6253r c6253r = new C6253r(new ArrayList(a10.f2273e.keySet()));
        G g10 = Qh.F.TYPE_INITIALIZER.f14964Z;
        ArrayList arrayList2 = new ArrayList(c6253r.size());
        Iterator<E> it2 = c6253r.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!g10.a(next)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() != c6253r.size()) {
            c6253r = new C6253r(arrayList2);
        }
        return new C0262o0(l1Var, this.f52138g, a11, a10, a12, this.f52148q, U02, a10.f2272d, c6253r, l1Var.A(), a10.f2270b, a10.f2271c, this.f52136e, this.f52137f, this.f52140i, this.f52141j, this.f52139h, this.f52142k, this.f52144m, this.f52146o, e10);
    }

    @Override // zh.AbstractC6884l
    public final int hashCode() {
        return this.f3719r.hashCode() + (super.hashCode() * 31);
    }

    @Override // zh.AbstractC6884l
    public final AbstractC6869C i(AbstractC0263p abstractC0263p, C0247h c0247h, W w10, C0244f0 c0244f0, F f6, AbstractC5496c abstractC5496c, ph.f fVar, Gh.b bVar, Fh.n nVar, int i10, AbstractC0512k abstractC0512k, H h10, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v, List list) {
        return new i(abstractC0263p, c0247h, w10, c0244f0, f6, abstractC5496c, fVar, bVar, nVar, i10, abstractC0512k, h10, i11, q10, abstractC0241e, abstractC1243v, list, this.f3719r);
    }
}
