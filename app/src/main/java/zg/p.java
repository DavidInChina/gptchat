package zg;

import M3.I;
import Mf.AbstractC1000i;
import Mf.a0;
import Uf.A;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kg.C4290b;
import kg.C4294f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import ng.C4843j;
import sb.C5605e;
import ug.C5925g;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public abstract class p extends ug.o {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f52074f;

    /* renamed from: b  reason: collision with root package name */
    public final I f52075b;

    /* renamed from: c  reason: collision with root package name */
    public final o f52076c;

    /* renamed from: d  reason: collision with root package name */
    public final Ag.l f52077d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.j f52078e;

    static {
        D d10 = C.f37623a;
        f52074f = new Df.v[]{d10.g(new kotlin.jvm.internal.u(d10.b(p.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), d10.g(new kotlin.jvm.internal.u(d10.b(p.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public p(I i10, List list, List list2, List list3, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("c", i10);
        this.f52075b = i10;
        ((xg.m) i10.f11536a).f50012c.getClass();
        this.f52076c = new o(this, list, list2, list3);
        Ag.u c10 = i10.c();
        C5605e c5605e = new C5605e(abstractC6216a, 20);
        Ag.q qVar = (Ag.q) c10;
        qVar.getClass();
        this.f52077d = new Ag.l(qVar, c5605e);
        Ag.u c11 = i10.c();
        A a5 = new A(12, this);
        Ag.q qVar2 = (Ag.q) c11;
        qVar2.getClass();
        this.f52078e = new Ag.j(qVar2, a5);
    }

    @Override // ug.o, ug.n
    public Collection a(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return this.f52076c.a(c4294f, dVar);
    }

    @Override // ug.o, ug.n
    public final Set b() {
        return (Set) A7.b.X0(this.f52076c.f52071g, o.f52064j[0]);
    }

    @Override // ug.o, ug.n
    public final Set c() {
        Ag.j jVar = this.f52078e;
        Df.v vVar = f52074f[1];
        AbstractC3557B.c0("<this>", jVar);
        AbstractC3557B.c0("p", vVar);
        return (Set) jVar.mo122invoke();
    }

    @Override // ug.o, ug.p
    public AbstractC1000i e(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        if (q(c4294f)) {
            return ((xg.m) this.f52075b.f11536a).b(l(c4294f));
        }
        o oVar = this.f52076c;
        if (oVar.f52067c.keySet().contains(c4294f)) {
            oVar.getClass();
            return (a0) oVar.f52070f.invoke(c4294f);
        }
        return null;
    }

    @Override // ug.o, ug.n
    public Collection f(C4294f c4294f, Tf.d dVar) {
        AbstractC3557B.c0("name", c4294f);
        return this.f52076c.b(c4294f, dVar);
    }

    @Override // ug.o, ug.n
    public final Set g() {
        return (Set) A7.b.X0(this.f52076c.f52072h, o.f52064j[1]);
    }

    public abstract void h(ArrayList arrayList, wf.k kVar);

    public final List i(C5925g c5925g, wf.k kVar) {
        Tf.d dVar = Tf.d.f17214i0;
        AbstractC3557B.c0("kindFilter", c5925g);
        AbstractC3557B.c0("nameFilter", kVar);
        ArrayList arrayList = new ArrayList(0);
        if (c5925g.a(C5925g.f46774e)) {
            h(arrayList, kVar);
        }
        o oVar = this.f52076c;
        oVar.getClass();
        boolean a5 = c5925g.a(C5925g.f46778i);
        C4843j c4843j = C4843j.f40349Y;
        if (a5) {
            ArrayList arrayList2 = new ArrayList();
            for (C4294f c4294f : (Set) A7.b.X0(oVar.f52072h, o.f52064j[1])) {
                if (((Boolean) kVar.invoke(c4294f)).booleanValue()) {
                    arrayList2.addAll(oVar.b(c4294f, dVar));
                }
            }
            kf.r.K1(arrayList2, c4843j);
            arrayList.addAll(arrayList2);
        }
        if (c5925g.a(C5925g.f46777h)) {
            ArrayList arrayList3 = new ArrayList();
            for (C4294f c4294f2 : (Set) A7.b.X0(oVar.f52071g, o.f52064j[0])) {
                if (((Boolean) kVar.invoke(c4294f2)).booleanValue()) {
                    arrayList3.addAll(oVar.a(c4294f2, dVar));
                }
            }
            kf.r.K1(arrayList3, c4843j);
            arrayList.addAll(arrayList3);
        }
        if (c5925g.a(C5925g.f46780k)) {
            for (C4294f c4294f3 : m()) {
                if (((Boolean) kVar.invoke(c4294f3)).booleanValue()) {
                    Ig.i.b(((xg.m) this.f52075b.f11536a).b(l(c4294f3)), arrayList);
                }
            }
        }
        if (c5925g.a(C5925g.f46775f)) {
            for (Object obj : oVar.f52067c.keySet()) {
                if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                    oVar.getClass();
                    AbstractC3557B.c0("name", obj);
                    Ig.i.b((a0) oVar.f52070f.invoke(obj), arrayList);
                }
            }
        }
        return Ig.i.e(arrayList);
    }

    public void j(C4294f c4294f, ArrayList arrayList) {
        AbstractC3557B.c0("name", c4294f);
    }

    public void k(C4294f c4294f, ArrayList arrayList) {
        AbstractC3557B.c0("name", c4294f);
    }

    public abstract C4290b l(C4294f c4294f);

    public final Set m() {
        return (Set) A7.b.X0(this.f52077d, f52074f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(C4294f c4294f) {
        AbstractC3557B.c0("name", c4294f);
        return m().contains(c4294f);
    }

    public boolean r(s sVar) {
        return true;
    }
}
