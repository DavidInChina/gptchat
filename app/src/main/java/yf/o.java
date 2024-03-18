package Yf;

import Bg.d0;
import Bg.k0;
import Bg.m0;
import Bg.o0;
import Mf.AbstractC0993b;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1012v;
import Mf.AbstractC1013w;
import Mf.P;
import Mf.h0;
import Pf.AbstractC1146d;
import Pf.AbstractC1158p;
import Pf.T;
import Pf.b0;
import Pf.c0;
import Sf.AbstractC1387f;
import Uf.AbstractC1443e;
import Uf.AbstractC1447i;
import Uf.C1446h;
import Uf.C1448j;
import Uf.Q;
import bg.AbstractC2199g;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.AbstractC3957g;
import kf.AbstractC4273I;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import l8.AbstractC4344b;
import ng.AbstractC4838e;
import ng.C4846m;
import q1.AbstractC5260f;
import rg.AbstractC5493d;
import sg.C5624a;
import ug.C5925g;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class o extends B {

    /* renamed from: n  reason: collision with root package name */
    public final AbstractC0997f f22367n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC2199g f22368o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f22369p;

    /* renamed from: q  reason: collision with root package name */
    public final Ag.l f22370q;

    /* renamed from: r  reason: collision with root package name */
    public final Ag.l f22371r;

    /* renamed from: s  reason: collision with root package name */
    public final Ag.l f22372s;

    /* renamed from: t  reason: collision with root package name */
    public final Ag.l f22373t;

    /* renamed from: u  reason: collision with root package name */
    public final Ag.m f22374u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s3.z zVar, AbstractC0997f abstractC0997f, AbstractC2199g abstractC2199g, boolean z10, o oVar) {
        super(zVar, oVar);
        AbstractC3557B.c0("c", zVar);
        AbstractC3557B.c0("ownerDescriptor", abstractC0997f);
        AbstractC3557B.c0("jClass", abstractC2199g);
        this.f22367n = abstractC0997f;
        this.f22368o = abstractC2199g;
        this.f22369p = z10;
        Ag.u e10 = zVar.e();
        m mVar = new m(this, zVar);
        Ag.q qVar = (Ag.q) e10;
        qVar.getClass();
        this.f22370q = new Ag.l(qVar, mVar);
        Ag.u e11 = zVar.e();
        n nVar = new n(this, 1);
        Ag.q qVar2 = (Ag.q) e11;
        qVar2.getClass();
        this.f22371r = new Ag.l(qVar2, nVar);
        Ag.u e12 = zVar.e();
        m mVar2 = new m(zVar, this);
        Ag.q qVar3 = (Ag.q) e12;
        qVar3.getClass();
        this.f22372s = new Ag.l(qVar3, mVar2);
        Ag.u e13 = zVar.e();
        n nVar2 = new n(this, 0);
        Ag.q qVar4 = (Ag.q) e13;
        qVar4.getClass();
        this.f22373t = new Ag.l(qVar4, nVar2);
        this.f22374u = ((Ag.q) zVar.e()).c(new Oc.c(this, 20, zVar));
    }

    public static T C(T t10, AbstractC1013w abstractC1013w, AbstractCollection abstractCollection) {
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                T t11 = (T) it.next();
                if (!AbstractC3557B.K(t10, t11) && t11.f14167H0 == null && F(t11, abstractC1013w)) {
                    AbstractC1013w f6 = t10.m0().m().f();
                    AbstractC3557B.Z(f6);
                    return (T) f6;
                }
            }
            return t10;
        }
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static T D(T t10) {
        C4291c c4291c;
        List S = t10.S();
        AbstractC3557B.b0("getValueParameters(...)", S);
        h0 h0Var = (h0) kf.t.p2(S);
        if (h0Var != null) {
            AbstractC1000i k10 = ((c0) h0Var).getType().y0().k();
            if (k10 != null) {
                C4293e h10 = AbstractC5493d.h(k10);
                if (!h10.d()) {
                    h10 = null;
                }
                if (h10 != null) {
                    c4291c = h10.g();
                    if (!AbstractC3557B.K(c4291c, Jf.q.f9200g)) {
                        h0Var = null;
                    }
                    if (h0Var != null) {
                        AbstractC1012v m02 = t10.m0();
                        List S10 = t10.S();
                        AbstractC3557B.b0("getValueParameters(...)", S10);
                        T t11 = (T) m02.c(kf.t.a2(S10)).n(((d0) ((c0) h0Var).getType().w0().get(0)).getType()).f();
                        if (t11 != null) {
                            t11.f14160A0 = true;
                        }
                        return t11;
                    }
                }
            }
            c4291c = null;
            if (!AbstractC3557B.K(c4291c, Jf.q.f9200g)) {
            }
            if (h0Var != null) {
            }
        }
        return null;
    }

    public static boolean F(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2) {
        int c10 = C4846m.f40356d.n(abstractC0993b2, abstractC0993b, true).c();
        AbstractC2469q0.u("getResult(...)", c10);
        if (c10 == 1 && !Cf.k.h(abstractC0993b2, abstractC0993b)) {
            return true;
        }
        return false;
    }

    public static boolean G(T t10, T t11) {
        int i10 = AbstractC1443e.f17817m;
        AbstractC3557B.c0("<this>", t10);
        if (AbstractC3557B.K(t10.getName().b(), "removeAt") && AbstractC3557B.K(L4.a.f0(t10), Q.f17795h.f17777e)) {
            t11 = t11.p0();
        }
        AbstractC3557B.Z(t11);
        return F(t11, t10);
    }

    public static T H(P p10, String str, wf.k kVar) {
        T t10;
        Iterator it = ((Iterable) kVar.invoke(C4294f.e(str))).iterator();
        do {
            t10 = null;
            if (!it.hasNext()) {
                break;
            }
            T t11 = (T) it.next();
            if (t11.S().size() == 0) {
                Cg.o oVar = Cg.d.f3125a;
                Bg.A a5 = t11.f14171l0;
                if (a5 != null && oVar.b(a5, p10.getType())) {
                    t10 = t11;
                    continue;
                }
            }
        } while (t10 == null);
        return t10;
    }

    public static T J(P p10, wf.k kVar) {
        T t10;
        Bg.A a5;
        String b10 = p10.getName().b();
        AbstractC3557B.b0("asString(...)", b10);
        Iterator it = ((Iterable) kVar.invoke(C4294f.e(Uf.C.b(b10)))).iterator();
        do {
            t10 = null;
            if (!it.hasNext()) {
                break;
            }
            T t11 = (T) it.next();
            if (t11.S().size() == 1 && (a5 = t11.f14171l0) != null) {
                C4294f c4294f = Jf.l.f9117e;
                if (!Jf.l.D(a5, Jf.p.f9171d)) {
                    continue;
                } else {
                    Cg.o oVar = Cg.d.f3125a;
                    List S = t11.S();
                    AbstractC3557B.b0("getValueParameters(...)", S);
                    if (oVar.a(((c0) ((h0) kf.t.B2(S))).getType(), p10.getType())) {
                        t10 = t11;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (t10 == null);
        return t10;
    }

    public static boolean M(T t10, AbstractC1013w abstractC1013w) {
        String e02 = L4.a.e0(t10, 2);
        AbstractC1013w mo24a = abstractC1013w.mo24a();
        AbstractC3557B.b0("getOriginal(...)", mo24a);
        if (AbstractC3557B.K(e02, L4.a.e0(mo24a, 2)) && !F(t10, abstractC1013w)) {
            return true;
        }
        return false;
    }

    public static final ArrayList v(o oVar, C4294f c4294f) {
        Collection<Sf.z> b10 = ((AbstractC1691c) oVar.f22295e.mo122invoke()).b(c4294f);
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(b10, 10));
        for (Sf.z zVar : b10) {
            arrayList.add(oVar.t(zVar));
        }
        return arrayList;
    }

    public static final ArrayList w(o oVar, C4294f c4294f) {
        LinkedHashSet K10 = oVar.K(c4294f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K10) {
            T t10 = (T) obj;
            AbstractC3557B.c0("<this>", t10);
            if (P4.a.W(t10) == null && C1446h.a(t10) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, Ig.g gVar, l lVar) {
        Wf.g gVar2;
        T t10;
        boolean z10;
        Pf.Q q10;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            if (!E(p10, lVar)) {
                gVar2 = null;
            } else {
                T I10 = I(p10, lVar);
                AbstractC3557B.Z(I10);
                if (p10.Y()) {
                    t10 = J(p10, lVar);
                    AbstractC3557B.Z(t10);
                } else {
                    t10 = null;
                }
                if (t10 != null) {
                    t10.h();
                    I10.h();
                }
                AbstractC0997f abstractC0997f = this.f22367n;
                AbstractC3557B.c0("ownerDescriptor", abstractC0997f);
                Nf.g gVar3 = Nf.h.f12822a;
                Mf.A h10 = I10.h();
                AbstractC1007p visibility = I10.getVisibility();
                if (t10 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Wf.g gVar4 = new Wf.g(abstractC0997f, gVar3, h10, visibility, z10, p10.getName(), I10.g(), null, 1, false, null);
                Bg.A a5 = I10.f14171l0;
                AbstractC3557B.Z(a5);
                kf.v vVar = kf.v.f37483Y;
                gVar4.E0(a5, vVar, p(), null, vVar);
                Pf.P i02 = R4.b.i0(gVar4, I10.getAnnotations(), false, I10.g());
                i02.f14023q0 = I10;
                i02.z0(gVar4.getType());
                if (t10 != null) {
                    List S = t10.S();
                    AbstractC3557B.b0("getValueParameters(...)", S);
                    h0 h0Var = (h0) kf.t.h2(S);
                    if (h0Var != null) {
                        q10 = R4.b.m0(gVar4, t10.getAnnotations(), ((Nf.b) h0Var).getAnnotations(), false, t10.getVisibility(), t10.g());
                        q10.f14023q0 = t10;
                    } else {
                        throw new AssertionError("No parameter found for " + t10);
                    }
                } else {
                    q10 = null;
                }
                gVar4.B0(i02, q10, null, null);
                gVar2 = gVar4;
            }
            if (gVar2 != null) {
                abstractCollection.add(gVar2);
                if (gVar != null) {
                    gVar.add(p10);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z10 = this.f22369p;
        AbstractC0997f abstractC0997f = this.f22367n;
        if (z10) {
            Collection l10 = abstractC0997f.f().l();
            AbstractC3557B.b0("getSupertypes(...)", l10);
            return l10;
        }
        ((Cg.h) ((Cg.o) ((Xf.a) this.f22292b.f45394a).f21972u).f3143c).getClass();
        AbstractC3557B.c0("classDescriptor", abstractC0997f);
        Collection l11 = abstractC0997f.f().l();
        AbstractC3557B.b0("getSupertypes(...)", l11);
        return l11;
    }

    public final boolean E(P p10, wf.k kVar) {
        if (Ad.l.K0(p10)) {
            return false;
        }
        T I10 = I(p10, kVar);
        T J10 = J(p10, kVar);
        if (I10 == null) {
            return false;
        }
        if (!p10.Y()) {
            return true;
        }
        if (J10 == null || J10.h() != I10.h()) {
            return false;
        }
        return true;
    }

    public final T I(P p10, wf.k kVar) {
        Mf.Q q10;
        C4294f c4294f;
        Pf.P d10 = p10.d();
        String str = null;
        if (d10 != null) {
            q10 = (Mf.Q) P4.a.W(d10);
        } else {
            q10 = null;
        }
        if (q10 != null) {
            Jf.l.z(q10);
            AbstractC0994c b10 = AbstractC5493d.b(AbstractC5493d.k(q10), C1448j.f17825Y);
            if (b10 != null && (c4294f = (C4294f) AbstractC1447i.f17821a.get(AbstractC5493d.g(b10))) != null) {
                str = c4294f.b();
            }
        }
        if (str != null && !P4.a.b0(this.f22367n, q10)) {
            return H(p10, str, kVar);
        }
        String b11 = p10.getName().b();
        AbstractC3557B.b0("asString(...)", b11);
        return H(p10, Uf.C.a(b11), kVar);
    }

    public final LinkedHashSet K(C4294f c4294f) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Bg.A a5 : B()) {
            kf.s.N1(a5.R().a(c4294f, Tf.d.f17215j0), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set L(C4294f c4294f) {
        ArrayList arrayList = new ArrayList();
        for (Bg.A a5 : B()) {
            Collection<P> f6 = a5.R().f(c4294f, Tf.d.f17215j0);
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(f6, 10));
            for (P p10 : f6) {
                arrayList2.add(p10);
            }
            kf.s.N1(arrayList2, arrayList);
        }
        return kf.t.P2(arrayList);
    }

    public final boolean N(T t10) {
        Collection<C4294f> collection;
        C4294f name = t10.getName();
        AbstractC3557B.b0("getName(...)", name);
        String b10 = name.b();
        AbstractC3557B.b0("asString(...)", b10);
        C4291c c4291c = Uf.C.f17724a;
        if (!Lg.n.I2(b10, "get", false) && !Lg.n.I2(b10, "is", false)) {
            if (Lg.n.I2(b10, "set", false)) {
                collection = kf.q.h3(new C4294f[]{AbstractC5260f.J(name, "set", null, 4), AbstractC5260f.J(name, "set", "is", 4)});
            } else {
                collection = (List) AbstractC1447i.f17822b.get(name);
                if (collection == null) {
                    collection = kf.v.f37483Y;
                }
            }
        } else {
            C4294f J10 = AbstractC5260f.J(name, "get", null, 12);
            if (J10 == null) {
                J10 = AbstractC5260f.J(name, "is", null, 8);
            }
            collection = AbstractC4344b.H0(J10);
        }
        if (!collection.isEmpty()) {
            for (C4294f c4294f : collection) {
                Set<P> L10 = L(c4294f);
                if (!(L10 instanceof Collection) || !L10.isEmpty()) {
                    for (P p10 : L10) {
                        if (E(p10, new Oc.c(t10, 19, this))) {
                            if (!p10.Y()) {
                                String b11 = t10.getName().b();
                                AbstractC3557B.b0("asString(...)", b11);
                                if (!Lg.n.I2(b11, "set", false)) {
                                }
                            }
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        Cf.k kVar = Q.f17788a;
        C4294f name2 = t10.getName();
        AbstractC3557B.b0("getName(...)", name2);
        C4294f c4294f2 = (C4294f) Q.f17799l.get(name2);
        if (c4294f2 != null) {
            LinkedHashSet K10 = K(c4294f2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : K10) {
                T t11 = (T) obj;
                AbstractC3557B.c0("<this>", t11);
                if (P4.a.W(t11) != null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                AbstractC1012v m02 = t10.m0();
                m02.g(c4294f2);
                m02.q();
                m02.h();
                AbstractC1013w f6 = m02.f();
                AbstractC3557B.Z(f6);
                T t12 = (T) f6;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (G((T) it.next(), t12)) {
                            break;
                        }
                    }
                }
            }
        }
        int i10 = C1446h.f17820m;
        C4294f name3 = t10.getName();
        AbstractC3557B.b0("getName(...)", name3);
        if (C1446h.b(name3)) {
            C4294f name4 = t10.getName();
            AbstractC3557B.b0("getName(...)", name4);
            LinkedHashSet<T> K11 = K(name4);
            ArrayList arrayList2 = new ArrayList();
            for (T t13 : K11) {
                AbstractC1013w a5 = C1446h.a(t13);
                if (a5 != null) {
                    arrayList2.add(a5);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (M(t10, (AbstractC1013w) it2.next())) {
                        break;
                    }
                }
            }
        }
        T D6 = D(t10);
        if (D6 == null) {
            return true;
        }
        C4294f name5 = t10.getName();
        AbstractC3557B.b0("getName(...)", name5);
        LinkedHashSet<T> K12 = K(name5);
        if (K12.isEmpty()) {
            return true;
        }
        for (T t14 : K12) {
            if (t14.isSuspend() && F(D6, t14)) {
                return false;
            }
        }
        return true;
    }

    public final void O(C4294f c4294f, Tf.a aVar) {
        AbstractC3557B.c0("name", c4294f);
        AbstractC3557B.c0("<this>", ((Xf.a) this.f22292b.f45394a).f21965n);
        AbstractC3557B.c0("scopeOwner", this.f22367n);
    }

    @Override // Yf.B, ug.o, ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        O(c4294f, dVar);
        return super.a(c4294f, dVar);
    }

    @Override // ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        Ag.m mVar;
        AbstractC0997f abstractC0997f;
        AbstractC3557B.c0("name", c4294f);
        O(c4294f, dVar);
        o oVar = (o) this.f22293c;
        if (oVar == null || (mVar = oVar.f22374u) == null || (abstractC0997f = (AbstractC0997f) mVar.invoke(c4294f)) == null) {
            return (AbstractC1000i) this.f22374u.invoke(c4294f);
        }
        return abstractC0997f;
    }

    @Override // Yf.B, ug.o, ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        O(c4294f, dVar);
        return super.f(c4294f, dVar);
    }

    @Override // Yf.B
    public final Set h(C5925g c5925g, ug.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        return AbstractC4273I.u2((Set) this.f22371r.mo122invoke(), ((Map) this.f22373t.mo122invoke()).keySet());
    }

    @Override // Yf.B
    public final Set i(C5925g c5925g, ug.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC0997f abstractC0997f = this.f22367n;
        Collection<Bg.A> l10 = abstractC0997f.f().l();
        AbstractC3557B.b0("getSupertypes(...)", l10);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Bg.A a5 : l10) {
            kf.s.N1(a5.R().b(), linkedHashSet);
        }
        Ag.l lVar = this.f22295e;
        linkedHashSet.addAll(((AbstractC1691c) lVar.mo122invoke()).a());
        linkedHashSet.addAll(((AbstractC1691c) lVar.mo122invoke()).d());
        linkedHashSet.addAll(h(c5925g, kVar));
        s3.z zVar = this.f22292b;
        linkedHashSet.addAll(((C5624a) ((Xf.a) zVar.f45394a).f21975x).e(zVar, abstractC0997f));
        return linkedHashSet;
    }

    @Override // Yf.B
    public final void j(ArrayList arrayList, C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        boolean f6 = ((Sf.q) this.f22368o).f();
        AbstractC0997f abstractC0997f = this.f22367n;
        s3.z zVar = this.f22292b;
        if (f6) {
            Ag.l lVar = this.f22295e;
            if (((AbstractC1691c) lVar.mo122invoke()).f(c4294f) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((T) it.next()).S().isEmpty()) {
                            break;
                        }
                    }
                }
                Sf.C f10 = ((AbstractC1691c) lVar.mo122invoke()).f(c4294f);
                AbstractC3557B.Z(f10);
                Wf.f L02 = Wf.f.L0(abstractC0997f, Bi.c.B1(zVar, f10), f10.b(), ((Rf.f) ((Xf.a) zVar.f45394a).f21961j).a(f10), true);
                Bg.A L10 = ((U3.i) zVar.f45398e).L(f10.e(), A7.b.N1(k0.f2132Z, false, false, null, 6));
                AbstractC1146d p10 = p();
                kf.v vVar = kf.v.f37483Y;
                Mf.A.f12050Y.getClass();
                L02.K0(null, p10, vVar, vVar, vVar, L10, Cf.k.d(false, false, true), Mf.r.f12105e, null);
                L02.M0(false, false);
                ((Cf.h) ((Xf.a) zVar.f45394a).f21958g).getClass();
                arrayList.add(L02);
            }
        }
        ((C5624a) ((Xf.a) zVar.f45394a).f21975x).b(zVar, abstractC0997f, c4294f, arrayList);
    }

    @Override // Yf.B
    public final AbstractC1691c k() {
        return new C1689a(this.f22368o, C1698j.f22358Y);
    }

    @Override // Yf.B
    public final void m(LinkedHashSet linkedHashSet, C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        LinkedHashSet<AbstractC1013w> K10 = K(c4294f);
        Cf.k kVar = Q.f17788a;
        if (!Q.f17798k.contains(c4294f)) {
            int i10 = C1446h.f17820m;
            if (!C1446h.b(c4294f)) {
                if (!K10.isEmpty()) {
                    for (AbstractC1013w abstractC1013w : K10) {
                        if (abstractC1013w.isSuspend()) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : K10) {
                    if (N((T) obj)) {
                        arrayList.add(obj);
                    }
                }
                y(linkedHashSet, c4294f, arrayList, false);
                return;
            }
        }
        Ig.g gVar = new Ig.g();
        LinkedHashSet t02 = N.t0(c4294f, K10, kf.v.f37483Y, this.f22367n, xg.s.f50041a, ((Cg.o) ((Xf.a) this.f22292b.f45394a).f21972u).f3145e);
        z(c4294f, linkedHashSet, t02, linkedHashSet, new k(0, this));
        z(c4294f, linkedHashSet, t02, gVar, new k(1, this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : K10) {
            if (N((T) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y(linkedHashSet, c4294f, kf.t.w2(gVar, arrayList2), true);
    }

    @Override // Yf.B
    public final void n(ArrayList arrayList, C4294f c4294f) {
        Sf.z zVar;
        AbstractC3557B.c0("name", c4294f);
        boolean isAnnotation = ((Sf.q) this.f22368o).f16621a.isAnnotation();
        s3.z zVar2 = this.f22292b;
        if (isAnnotation && (zVar = (Sf.z) kf.t.C2(((AbstractC1691c) this.f22295e.mo122invoke()).b(c4294f))) != null) {
            Cf.k kVar = Mf.A.f12050Y;
            Wf.g F02 = Wf.g.F0(this.f22367n, Bi.c.B1(zVar2, zVar), R4.b.h2(zVar.d()), false, zVar.b(), ((Rf.f) ((Xf.a) zVar2.f45394a).f21961j).a(zVar), false);
            Pf.P c02 = R4.b.c0(F02, Nf.h.f12822a);
            F02.B0(c02, null, null, null);
            AbstractC3557B.c0("<this>", zVar2);
            Bg.A l10 = B.l(zVar, new s3.z((Xf.a) zVar2.f45394a, new Xf.g(zVar2, F02, zVar, 0), (AbstractC3957g) zVar2.f45396c));
            kf.v vVar = kf.v.f37483Y;
            F02.E0(l10, vVar, p(), null, vVar);
            c02.z0(l10);
            arrayList.add(F02);
        }
        Set L10 = L(c4294f);
        if (L10.isEmpty()) {
            return;
        }
        Ig.g gVar = new Ig.g();
        Ig.g gVar2 = new Ig.g();
        A(L10, arrayList, gVar, new l(this, 0));
        A(AbstractC4273I.t2(L10, gVar), gVar2, null, new l(this, 1));
        LinkedHashSet u22 = AbstractC4273I.u2(L10, gVar2);
        Xf.a aVar = (Xf.a) zVar2.f45394a;
        arrayList.addAll(N.t0(c4294f, u22, arrayList, this.f22367n, aVar.f21957f, ((Cg.o) aVar.f21972u).f3145e));
    }

    @Override // Yf.B
    public final Set o(C5925g c5925g) {
        AbstractC3557B.c0("kindFilter", c5925g);
        if (((Sf.q) this.f22368o).f16621a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((AbstractC1691c) this.f22295e.mo122invoke()).e());
        Collection<Bg.A> l10 = this.f22367n.f().l();
        AbstractC3557B.b0("getSupertypes(...)", l10);
        for (Bg.A a5 : l10) {
            kf.s.N1(a5.R().g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // Yf.B
    public final AbstractC1146d p() {
        AbstractC0997f abstractC0997f = this.f22367n;
        if (abstractC0997f != null) {
            int i10 = AbstractC4838e.f40339a;
            return abstractC0997f.v0();
        }
        AbstractC4838e.a(0);
        throw null;
    }

    @Override // Yf.B
    public final AbstractC1003l q() {
        return this.f22367n;
    }

    @Override // Yf.B
    public final boolean r(Wf.f fVar) {
        if (((Sf.q) this.f22368o).f16621a.isAnnotation()) {
            return false;
        }
        return N(fVar);
    }

    @Override // Yf.B
    public final w s(Sf.z zVar, ArrayList arrayList, Bg.A a5, List list) {
        AbstractC3557B.c0("method", zVar);
        AbstractC3557B.c0("valueParameters", list);
        ((Cf.k) ((Xf.a) this.f22292b.f45394a).f21956e).getClass();
        if (this.f22367n != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return new w(list, arrayList, emptyList, a5);
            }
            v7.u.a(3);
            throw null;
        }
        Cf.k.b(1);
        throw null;
    }

    @Override // Yf.B
    public final String toString() {
        return "Lazy Java member scope for " + ((Sf.q) this.f22368o).b();
    }

    public final void x(ArrayList arrayList, Wf.b bVar, int i10, Sf.z zVar, Bg.A a5, Bg.A a10) {
        AbstractC1387f abstractC1387f;
        boolean z10;
        o oVar;
        o0 o0Var;
        Nf.g gVar = Nf.h.f12822a;
        C4294f b10 = zVar.b();
        if (a5 != null) {
            o0 h10 = m0.h(a5, false);
            Object defaultValue = zVar.f16629a.getDefaultValue();
            if (defaultValue != null) {
                abstractC1387f = Cf.k.g(defaultValue, null);
            } else {
                abstractC1387f = null;
            }
            if (abstractC1387f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (a10 != null) {
                oVar = this;
                o0Var = m0.h(a10, false);
            } else {
                oVar = this;
                o0Var = null;
            }
            arrayList.add(new b0(bVar, null, i10, gVar, b10, h10, z10, false, false, o0Var, ((Rf.f) ((Xf.a) oVar.f22292b.f45394a).f21961j).a(zVar)));
            return;
        }
        m0.a(2);
        throw null;
    }

    public final void y(LinkedHashSet linkedHashSet, C4294f c4294f, ArrayList arrayList, boolean z10) {
        Xf.a aVar = (Xf.a) this.f22292b.f45394a;
        LinkedHashSet<T> t02 = N.t0(c4294f, arrayList, linkedHashSet, this.f22367n, aVar.f21957f, ((Cg.o) aVar.f21972u).f3145e);
        if (!z10) {
            linkedHashSet.addAll(t02);
            return;
        }
        ArrayList w22 = kf.t.w2(t02, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(t02, 10));
        for (T t10 : t02) {
            T t11 = (T) P4.a.X(t10);
            if (t11 != null) {
                t10 = C(t10, t11, w22);
            }
            arrayList2.add(t10);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(C4294f c4294f, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, k kVar) {
        T t10;
        T t11;
        Object obj;
        T t12;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            T t13 = (T) it.next();
            T t14 = (T) P4.a.W(t13);
            T t15 = null;
            if (t14 != null) {
                String U10 = P4.a.U(t14);
                AbstractC3557B.Z(U10);
                for (T t16 : (Collection) kVar.invoke(C4294f.e(U10))) {
                    AbstractC1012v m02 = t16.m0();
                    m02.g(c4294f);
                    m02.q();
                    m02.h();
                    AbstractC1013w f6 = m02.f();
                    AbstractC3557B.Z(f6);
                    T t17 = (T) f6;
                    if (G(t14, t17)) {
                        t10 = C(t17, t14, linkedHashSet);
                        break;
                    }
                }
            }
            t10 = null;
            Ig.i.b(t10, abstractSet);
            AbstractC1013w a5 = C1446h.a(t13);
            if (a5 != null) {
                C4294f name = ((AbstractC1158p) a5).getName();
                AbstractC3557B.b0("getName(...)", name);
                Iterator it2 = ((Iterable) kVar.invoke(name)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (M((T) obj, a5)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                T t18 = (T) obj;
                if (t18 != null) {
                    AbstractC1012v m03 = t18.m0();
                    List<h0> S = a5.S();
                    AbstractC3557B.b0("getValueParameters(...)", S);
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(S, 10));
                    for (h0 h0Var : S) {
                        arrayList.add(((c0) h0Var).getType());
                    }
                    List S10 = t18.S();
                    AbstractC3557B.b0("getValueParameters(...)", S10);
                    m03.c(AbstractC3557B.p0(arrayList, S10, a5));
                    m03.q();
                    m03.h();
                    m03.i();
                    t12 = (T) m03.f();
                } else {
                    t12 = null;
                }
                if (t12 != null) {
                    if (!N(t12)) {
                        t12 = null;
                    }
                    if (t12 != null) {
                        t11 = C(t12, a5, linkedHashSet);
                        Ig.i.b(t11, abstractSet);
                        if (!t13.isSuspend()) {
                            C4294f name2 = t13.getName();
                            AbstractC3557B.b0("getName(...)", name2);
                            Iterator it3 = ((Iterable) kVar.invoke(name2)).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                T D6 = D((T) it3.next());
                                if (D6 == null || !F(D6, t13)) {
                                    D6 = null;
                                    continue;
                                }
                                if (D6 != null) {
                                    t15 = D6;
                                    break;
                                }
                            }
                        }
                        Ig.i.b(t15, abstractSet);
                    }
                }
            }
            t11 = null;
            Ig.i.b(t11, abstractSet);
            if (!t13.isSuspend()) {
            }
            Ig.i.b(t15, abstractSet);
        }
    }
}
