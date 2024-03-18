package Bh;

import Eh.AbstractC0511j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC4194d;
import sh.AbstractC5634f;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import yh.l1;

/* loaded from: classes.dex */
public final class Y0 extends a1 implements Hh.b {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC6250o f2306Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6250o f2307Z;

    /* renamed from: h0  reason: collision with root package name */
    public final l1 f2308h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Fh.B f2309i0;

    public Y0(X0 x02, AbstractC6250o abstractC6250o, l1 l1Var, Fh.B b10) {
        this.f2306Y = x02;
        this.f2307Z = abstractC6250o;
        this.f2308h0 = l1Var;
        this.f2309i0 = b10;
    }

    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        List<Hh.n> asList = Arrays.asList(new Mh.m(abstractC6250o, Mh.k.f12168Y).h(), E9.f.i(this.f2307Z).d(this.f2308h0), Mh.i.h(abstractC6250o.getReturnType()));
        ArrayList arrayList = new ArrayList();
        for (Hh.n nVar : asList) {
            if (nVar instanceof Hh.j) {
                arrayList.addAll(((Hh.j) nVar).f7813Y);
            } else if (!(nVar instanceof Hh.m)) {
                arrayList.add(nVar);
            }
        }
        Hh.l lVar2 = Hh.l.f7816c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lVar2 = lVar2.a(((Hh.n) it.next()).e(lVar, abstractC0511j));
        }
        return new Hh.a(lVar2.f7818b, ((AbstractC6236a) abstractC6250o).p());
    }

    @Override // Bh.c1
    public final Hh.a b(Nh.l lVar, AbstractC0511j abstractC0511j) {
        return a(lVar, abstractC0511j, this.f2306Y);
    }

    @Override // Bh.c1
    public final int c() {
        return 3;
    }

    @Override // Bh.c1
    public final void e(Nh.l lVar, Fh.n nVar) {
        Fh.m mVar = (Fh.m) nVar;
        mVar.getClass();
        this.f2309i0.b(lVar, this.f2306Y, mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y0.class != obj.getClass()) {
            return false;
        }
        Y0 y02 = (Y0) obj;
        if (this.f2306Y.equals(y02.f2306Y) && this.f2307Z.equals(y02.f2307Z) && this.f2308h0.equals(y02.f2308h0) && this.f2309i0.equals(y02.f2309i0)) {
            return true;
        }
        return false;
    }

    @Override // Bh.c1
    public final void g(Nh.l lVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
        e(lVar, nVar);
        lVar.i();
        Hh.a a5 = a(lVar, abstractC0511j, this.f2306Y);
        lVar.y(a5.f7801a, a5.f7802b);
    }

    @Override // Bh.c1
    public final AbstractC6250o getMethod() {
        return this.f2306Y;
    }

    @Override // Bh.c1
    public final xh.e getVisibility() {
        return ((AbstractC5634f) this.f2307Z).g1();
    }

    public final int hashCode() {
        int hashCode = this.f2306Y.hashCode();
        int hashCode2 = this.f2307Z.hashCode();
        return this.f2309i0.hashCode() + AbstractC4194d.t(this.f2308h0, (hashCode2 + ((hashCode + (Y0.class.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // Bh.c1
    public final void d(Nh.l lVar) {
    }
}
