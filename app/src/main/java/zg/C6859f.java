package zg;

import Bg.A;
import H.H;
import M3.I;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import fg.C3042j;
import hg.AbstractC3428g;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.C4290b;
import kg.C4294f;
import ug.C5925g;
import yf.AbstractC6583a;

/* renamed from: zg.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6859f extends p {

    /* renamed from: g  reason: collision with root package name */
    public final Cg.i f52028g;

    /* renamed from: h  reason: collision with root package name */
    public final Ag.l f52029h;

    /* renamed from: i  reason: collision with root package name */
    public final Ag.l f52030i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C6862i f52031j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C6859f(C6862i c6862i, Cg.i iVar) {
        super(r2, r3, r4, r5, new H(3, r1));
        AbstractC3557B.c0("kotlinTypeRefiner", iVar);
        this.f52031j = c6862i;
        I i10 = c6862i.f52045q0;
        C3042j c3042j = c6862i.f52038j0;
        List list = c3042j.f30663v0;
        AbstractC3557B.b0("getFunctionList(...)", list);
        List list2 = c3042j.f30664w0;
        AbstractC3557B.b0("getPropertyList(...)", list2);
        List list3 = c3042j.f30665x0;
        AbstractC3557B.b0("getTypeAliasList(...)", list3);
        List<Number> list4 = c3042j.f30657p0;
        AbstractC3557B.b0("getNestedClassNameList(...)", list4);
        AbstractC3428g abstractC3428g = c6862i.f52045q0.f11537b;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list4, 10));
        for (Number number : list4) {
            arrayList.add(R4.b.o1(abstractC3428g, number.intValue()));
        }
        this.f52028g = iVar;
        Ag.u c10 = this.f52075b.c();
        C6857d c6857d = new C6857d(this, 0);
        Ag.q qVar = (Ag.q) c10;
        qVar.getClass();
        this.f52029h = new Ag.l(qVar, c6857d);
        Ag.u c11 = this.f52075b.c();
        C6857d c6857d2 = new C6857d(this, 1);
        Ag.q qVar2 = (Ag.q) c11;
        qVar2.getClass();
        this.f52030i = new Ag.l(qVar2, c6857d2);
    }

    @Override // zg.p, ug.o, ug.n
    public final Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        s(c4294f, dVar);
        return super.a(c4294f, dVar);
    }

    @Override // ug.o, ug.p
    public final Collection d(C5925g c5925g, wf.k kVar) {
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        return (Collection) this.f52029h.mo122invoke();
    }

    @Override // zg.p, ug.o, ug.p
    public final AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC0997f abstractC0997f;
        AbstractC3557B.c0("name", c4294f);
        s(c4294f, dVar);
        U3.n nVar = this.f52031j.f52049u0;
        if (nVar != null && (abstractC0997f = (AbstractC0997f) ((Ag.m) nVar.f17427Z).invoke(c4294f)) != null) {
            return abstractC0997f;
        }
        return super.e(c4294f, dVar);
    }

    @Override // zg.p, ug.o, ug.n
    public final Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        s(c4294f, dVar);
        return super.f(c4294f, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [kf.v] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // zg.p
    public final void h(ArrayList arrayList, wf.k kVar) {
        ?? r12;
        AbstractC3557B.c0("nameFilter", kVar);
        U3.n nVar = this.f52031j.f52049u0;
        if (nVar != null) {
            r12 = new ArrayList();
            for (C4294f c4294f : ((Map) nVar.f17426Y).keySet()) {
                AbstractC3557B.c0("name", c4294f);
                AbstractC0997f abstractC0997f = (AbstractC0997f) ((Ag.m) nVar.f17427Z).invoke(c4294f);
                if (abstractC0997f != null) {
                    r12.add(abstractC0997f);
                }
            }
        } else {
            r12 = 0;
        }
        if (r12 == 0) {
            r12 = kf.v.f37483Y;
        }
        arrayList.addAll(r12);
    }

    @Override // zg.p
    public final void j(C4294f c4294f, ArrayList arrayList) {
        AbstractC3557B.c0("name", c4294f);
        ArrayList arrayList2 = new ArrayList();
        for (A a5 : (Collection) this.f52030i.mo122invoke()) {
            arrayList2.addAll(a5.R().a(c4294f, Tf.d.f17213h0));
        }
        I i10 = this.f52075b;
        arrayList.addAll(((xg.m) i10.f11536a).f50023n.d(c4294f, this.f52031j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((Cg.o) ((xg.m) i10.f11536a).f50026q).f3145e.h(c4294f, arrayList2, arrayList3, this.f52031j, new C6858e(arrayList));
    }

    @Override // zg.p
    public final void k(C4294f c4294f, ArrayList arrayList) {
        AbstractC3557B.c0("name", c4294f);
        ArrayList arrayList2 = new ArrayList();
        for (A a5 : (Collection) this.f52030i.mo122invoke()) {
            arrayList2.addAll(a5.R().f(c4294f, Tf.d.f17213h0));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((Cg.o) ((xg.m) this.f52075b.f11536a).f50026q).f3145e.h(c4294f, arrayList2, arrayList3, this.f52031j, new C6858e(arrayList));
    }

    @Override // zg.p
    public final C4290b l(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        return this.f52031j.f52041m0.d(c4294f);
    }

    @Override // zg.p
    public final Set n() {
        List<A> l10 = this.f52031j.f52047s0.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (A a5 : l10) {
            Set c10 = a5.R().c();
            if (c10 == null) {
                return null;
            }
            kf.s.N1(c10, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // zg.p
    public final Set o() {
        C6862i c6862i = this.f52031j;
        List<A> l10 = c6862i.f52047s0.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (A a5 : l10) {
            kf.s.N1(a5.R().b(), linkedHashSet);
        }
        linkedHashSet.addAll(((xg.m) this.f52075b.f11536a).f50023n.c(c6862i));
        return linkedHashSet;
    }

    @Override // zg.p
    public final Set p() {
        List<A> l10 = this.f52031j.f52047s0.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (A a5 : l10) {
            kf.s.N1(a5.R().g(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // zg.p
    public final boolean r(s sVar) {
        return ((xg.m) this.f52075b.f11536a).f50024o.b(this.f52031j, sVar);
    }

    public final void s(C4294f c4294f, Tf.a aVar) {
        AbstractC3557B.c0("name", c4294f);
        AbstractC3557B.c0("<this>", ((xg.m) this.f52075b.f11536a).f50018i);
        AbstractC3557B.c0("scopeOwner", this.f52031j);
    }
}
