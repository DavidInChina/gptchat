package Bh;

import Eh.AbstractC0511j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k6.AbstractC4194d;
import wh.AbstractC6250o;
import wh.C6249n;
import yh.l1;

/* loaded from: classes.dex */
public final class W0 implements c1 {

    /* renamed from: Y  reason: collision with root package name */
    public final c1 f2298Y;

    /* renamed from: Z  reason: collision with root package name */
    public final l1 f2299Z;

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC6250o f2300h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Set f2301i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Fh.B f2302j0;

    public W0(c1 c1Var, l1 l1Var, AbstractC6250o abstractC6250o, Set set, Fh.B b10) {
        this.f2298Y = c1Var;
        this.f2299Z = l1Var;
        this.f2300h0 = abstractC6250o;
        this.f2301i0 = set;
        this.f2302j0 = b10;
    }

    @Override // Bh.c1
    public final Hh.a b(Nh.l lVar, AbstractC0511j abstractC0511j) {
        return this.f2298Y.b(lVar, abstractC0511j);
    }

    @Override // Bh.c1
    public final int c() {
        return this.f2298Y.c();
    }

    @Override // Bh.c1
    public final void d(Nh.l lVar) {
        this.f2298Y.d(lVar);
    }

    @Override // Bh.c1
    public final void e(Nh.l lVar, Fh.n nVar) {
        this.f2298Y.e(lVar, nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W0.class != obj.getClass()) {
            return false;
        }
        W0 w02 = (W0) obj;
        if (this.f2298Y.equals(w02.f2298Y) && this.f2299Z.equals(w02.f2299Z) && this.f2300h0.equals(w02.f2300h0) && this.f2301i0.equals(w02.f2301i0) && this.f2302j0.equals(w02.f2302j0)) {
            return true;
        }
        return false;
    }

    @Override // Bh.c1
    public final void f(io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
        Hh.n nVar2;
        c1 c1Var = this.f2298Y;
        c1Var.f(bVar, abstractC0511j, nVar);
        for (C6249n c6249n : this.f2301i0) {
            AbstractC6250o abstractC6250o = this.f2300h0;
            l1 l1Var = this.f2299Z;
            U0 u02 = new U0(abstractC6250o, c6249n, l1Var);
            V0 v02 = new V0(abstractC6250o, l1Var);
            Nh.l m10 = bVar.m(u02.l1(true, c1Var.getVisibility()), abstractC6250o.D0(), u02.getDescriptor(), null, u02.V().Q().z0());
            if (m10 != null) {
                Fh.m mVar = (Fh.m) nVar;
                mVar.getClass();
                this.f2302j0.b(m10, u02, mVar);
                m10.i();
                Hh.n[] nVarArr = new Hh.n[4];
                nVarArr[0] = new Mh.m(u02, new Mh.j(v02)).h();
                nVarArr[1] = E9.f.h(v02).f(l1Var);
                if (abstractC6250o.getReturnType().l0().K0(u02.getReturnType().l0())) {
                    nVar2 = Hh.m.f7819Y;
                } else {
                    nVar2 = Ih.b.h(u02.getReturnType().l0());
                }
                nVarArr[2] = nVar2;
                nVarArr[3] = Mh.i.h(u02.getReturnType());
                List<Hh.n> asList = Arrays.asList(nVarArr);
                ArrayList arrayList = new ArrayList();
                for (Hh.n nVar3 : asList) {
                    if (nVar3 instanceof Hh.j) {
                        arrayList.addAll(((Hh.j) nVar3).f7813Y);
                    } else if (!(nVar3 instanceof Hh.m)) {
                        arrayList.add(nVar3);
                    }
                }
                Hh.l lVar = Hh.l.f7816c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    lVar = lVar.a(((Hh.n) it.next()).e(m10, abstractC0511j));
                }
                m10.y(lVar.f7818b, u02.p());
                m10.j();
            }
        }
    }

    @Override // Bh.c1
    public final void g(Nh.l lVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
        this.f2298Y.g(lVar, abstractC0511j, nVar);
    }

    @Override // Bh.c1
    public final AbstractC6250o getMethod() {
        return this.f2300h0;
    }

    @Override // Bh.c1
    public final xh.e getVisibility() {
        return this.f2298Y.getVisibility();
    }

    public final int hashCode() {
        int hashCode = this.f2298Y.hashCode();
        int t10 = AbstractC4194d.t(this.f2299Z, (hashCode + (W0.class.hashCode() * 31)) * 31, 31);
        int hashCode2 = this.f2301i0.hashCode();
        return this.f2302j0.hashCode() + ((hashCode2 + ((this.f2300h0.hashCode() + t10) * 31)) * 31);
    }
}
