package Ch;

import Bh.AbstractC0241e;
import Bh.AbstractC0263p;
import Bh.C0;
import Bh.C0242e0;
import Bh.C0244f0;
import Bh.C0245g;
import Bh.C0247h;
import Bh.H;
import Bh.R0;
import Bh.V;
import Bh.W;
import Bh.f1;
import Eh.AbstractC0512k;
import Fh.F;
import Fh.n;
import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1243v;
import Qh.C1223a;
import Qh.C1225c;
import Qh.C1231i;
import Qh.C1237o;
import Qh.C1245x;
import Qh.C1246y;
import Qh.C1247z;
import Qh.G;
import Rh.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import ph.f;
import rh.AbstractC5496c;
import vh.l;
import wh.AbstractC6250o;
import wh.C6253r;
import yh.H1;
import yh.l1;
import zh.AbstractC6869C;
import zh.AbstractC6878f;
import zh.AbstractC6884l;
import zh.Q;

/* loaded from: classes2.dex */
public final class d extends AbstractC6884l {

    /* renamed from: r  reason: collision with root package name */
    public final l1 f3161r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC6878f f3162s;

    public d(AbstractC0263p abstractC0263p, C0247h c0247h, W w10, C0244f0 c0244f0, F f6, AbstractC5496c abstractC5496c, f fVar, Gh.b bVar, n nVar, int i10, AbstractC0512k abstractC0512k, H h10, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v, List list, l1 l1Var, AbstractC6878f abstractC6878f) {
        super(abstractC0263p, c0247h, w10, c0244f0, f6, abstractC5496c, fVar, bVar, nVar, i10, abstractC0512k, h10, i11, q10, abstractC0241e, abstractC1243v, list);
        this.f3161r = l1Var;
        this.f3162s = abstractC6878f;
    }

    @Override // zh.AbstractC6886n
    public final f1 h() {
        AbstractC1230h abstractC1230h;
        j1 j1Var = new j1(new y7.b(19), this.f3162s);
        AbstractC1230h d10 = C1223a.d(false);
        for (AbstractC6250o abstractC6250o : this.f3161r.i()) {
            if (abstractC6250o.W0()) {
                abstractC1230h = Qh.F.CONSTRUCTOR.f14964Z;
            } else {
                abstractC1230h = AbstractC1235m.c(abstractC6250o.getName());
            }
            C1231i b10 = abstractC1230h.b(new C1247z(new C1237o(AbstractC1235m.a(abstractC6250o.getReturnType().l0()))));
            H1<l1> Q = abstractC6250o.getParameters().I0().Q();
            ArrayList arrayList = new ArrayList();
            for (l1 l1Var : Q) {
                arrayList.add(new C1237o(AbstractC1235m.a(l1Var)));
            }
            d10 = d10.c(b10.b(new C1246y(new C1245x(new C1225c(arrayList)))));
        }
        a aVar = new a(this.f52147p, d10);
        V b11 = this.f52134c.b(this.f52132a, this.f52143l, this.f52144m, this.f52145n, aVar);
        C0247h c0247h = this.f52133b;
        l1 l1Var2 = b11.f2292d;
        C0245g a5 = c0247h.a(l1Var2);
        C0242e0 a10 = this.f52135d.a(l1Var2);
        Rh.l1 e10 = Rh.l1.e(this.f52148q, this.f52132a, j1Var);
        String str = R0.f2247u;
        l U02 = l1Var2.U0();
        C6253r c6253r = new C6253r(new ArrayList(b11.f2289a.keySet()));
        G g10 = Qh.F.TYPE_INITIALIZER.f14964Z;
        ArrayList arrayList2 = new ArrayList(c6253r.size());
        Iterator<E> it = c6253r.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!g10.a(next)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() != c6253r.size()) {
            c6253r = new C6253r(arrayList2);
        }
        return new C0(l1Var2, this.f52138g, a5, a10, this.f52148q, U02, b11.f2294f, c6253r, l1Var2.A(), b11.f2290b, b11.f2291c, this.f52136e, this.f52137f, this.f52140i, this.f52141j, this.f52139h, this.f52142k, this.f52144m, this.f52146o, e10, this.f3161r, this.f3162s, b11);
    }

    @Override // zh.AbstractC6884l
    public final AbstractC6869C i(AbstractC0263p abstractC0263p, C0247h c0247h, W w10, C0244f0 c0244f0, F f6, AbstractC5496c abstractC5496c, f fVar, Gh.b bVar, n nVar, int i10, AbstractC0512k abstractC0512k, H h10, int i11, Q q10, AbstractC0241e abstractC0241e, AbstractC1243v abstractC1243v, List list) {
        return new d(abstractC0263p, c0247h, w10, c0244f0, f6, abstractC5496c, fVar, bVar, nVar, i10, abstractC0512k, h10, i11, q10, abstractC0241e, abstractC1243v, list, this.f3161r, this.f3162s);
    }

    /* renamed from: k */
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f3161r.equals(dVar.f3161r) || !this.f3162s.equals(dVar.f3162s)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final int hashCode() {
        return this.f3162s.hashCode() + AbstractC4194d.t(this.f3161r, super.hashCode() * 31, 31);
    }
}
