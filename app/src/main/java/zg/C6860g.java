package zg;

import Bg.D;
import G0.C0588q;
import M3.I;
import Mf.A;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.C;
import Mf.C1008q;
import Mf.C1014x;
import Mf.EnumC0998g;
import Mf.G;
import Mf.V;
import Mf.h0;
import Pf.AbstractC1158p;
import Pf.AbstractC1165x;
import Pf.C1154l;
import fg.C3042j;
import fg.C3044l;
import fg.Q;
import hg.AbstractC3427f;
import hg.AbstractC3428g;
import hg.C3430i;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jf.C3959i;
import kg.C4294f;
import l8.AbstractC4344b;
import ng.AbstractC4834a;
import ng.AbstractC4838e;
import wf.AbstractC6216a;
import xg.K;
import xg.z;
import yf.AbstractC6583a;

/* renamed from: zg.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6860g extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f52032Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6862i f52033Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6860g(C6862i c6862i, int i10) {
        super(0);
        this.f52032Y = i10;
        this.f52033Z = c6862i;
    }

    public final Collection a() {
        int i10 = this.f52032Y;
        C6862i c6862i = this.f52033Z;
        switch (i10) {
            case 3:
                List list = c6862i.f52038j0.f30662u0;
                AbstractC3557B.b0("getConstructorList(...)", list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC3427f.f32325n.c(((C3044l) obj).f30676i0).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    I i11 = c6862i.f52045q0;
                    if (hasNext) {
                        C3044l c3044l = (C3044l) it.next();
                        AbstractC3557B.Z(c3044l);
                        arrayList2.add(((z) i11.f11544i).d(c3044l, false));
                    } else {
                        return kf.t.w2(((xg.m) i11.f11536a).f50023n.a(c6862i), kf.t.w2(AbstractC4344b.H0(c6862i.M()), arrayList2));
                    }
                }
            default:
                c6862i.getClass();
                A a5 = A.f12052h0;
                kf.v vVar = kf.v.f37483Y;
                A a10 = c6862i.f52042n0;
                if (a10 == a5) {
                    List<Integer> list2 = c6862i.f52038j0.f30667z0;
                    AbstractC3557B.Z(list2);
                    if (!list2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Integer num : list2) {
                            I i12 = c6862i.f52045q0;
                            AbstractC3428g abstractC3428g = i12.f11537b;
                            AbstractC3557B.Z(num);
                            AbstractC0997f b10 = ((xg.m) i12.f11536a).b(R4.b.f1(abstractC3428g, num.intValue()));
                            if (b10 != null) {
                                arrayList3.add(b10);
                            }
                        }
                        return arrayList3;
                    } else if (a10 == a5) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        AbstractC1003l abstractC1003l = c6862i.f52050v0;
                        if (abstractC1003l instanceof G) {
                            AbstractC4834a.Z0(c6862i, linkedHashSet, ((G) abstractC1003l).R(), false);
                        }
                        AbstractC4834a.Z0(c6862i, linkedHashSet, c6862i.i0(), true);
                        return kf.t.F2(linkedHashSet, new C0588q(24));
                    } else {
                        return vVar;
                    }
                }
                return vVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.ArrayList] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        Object obj;
        C1008q c1008q;
        Object obj2;
        Q q10;
        Eg.g gVar;
        ?? r22;
        int i10 = this.f52032Y;
        C6862i c6862i = this.f52033Z;
        C6856c c6856c = null;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return AbstractC3557B.i0(c6862i);
                    default:
                        return kf.t.K2(((xg.m) c6862i.f52045q0.f11536a).f50014e.j(c6862i.f52036B0));
                }
            case 1:
                switch (i10) {
                    case 0:
                        return AbstractC3557B.i0(c6862i);
                    default:
                        return kf.t.K2(((xg.m) c6862i.f52045q0.f11536a).f50014e.j(c6862i.f52036B0));
                }
            case 2:
                C3042j c3042j = c6862i.f52038j0;
                if ((c3042j.f30649h0 & 4) != 4) {
                    return null;
                }
                AbstractC1000i e10 = c6862i.x0().e(R4.b.o1(c6862i.f52045q0.f11537b, c3042j.f30652k0), Tf.d.f17217l0);
                if (!(e10 instanceof AbstractC0997f)) {
                    return null;
                }
                return (AbstractC0997f) e10;
            case 3:
                return a();
            case 4:
                if (c6862i.f52044p0.a()) {
                    C1154l c1154l = new C1154l(c6862i, null, Nf.h.f12822a, true, 1, V.f12075a);
                    List emptyList = Collections.emptyList();
                    int i11 = AbstractC4838e.f40339a;
                    EnumC0998g enumC0998g = EnumC0998g.f12086h0;
                    EnumC0998g enumC0998g2 = c6862i.f52044p0;
                    if (enumC0998g2 != enumC0998g && !enumC0998g2.a()) {
                        if (AbstractC4838e.q(c6862i)) {
                            c1008q = Mf.r.f12101a;
                            if (c1008q == null) {
                                AbstractC4838e.a(51);
                                throw null;
                            }
                        } else if (AbstractC4838e.k(c6862i)) {
                            c1008q = Mf.r.f12111k;
                            if (c1008q == null) {
                                AbstractC4838e.a(52);
                                throw null;
                            }
                        } else {
                            c1008q = Mf.r.f12105e;
                            if (c1008q == null) {
                                AbstractC4838e.a(53);
                                throw null;
                            }
                        }
                    } else {
                        c1008q = Mf.r.f12101a;
                        if (c1008q == null) {
                            AbstractC4838e.a(49);
                            throw null;
                        }
                    }
                    c1154l.K0(emptyList, c1008q);
                    c1154l.G0(c6862i.n());
                    return c1154l;
                }
                List list = c6862i.f52038j0.f30662u0;
                AbstractC3557B.b0("getConstructorList(...)", list);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (!AbstractC3427f.f32325n.c(((C3044l) obj).f30676i0).booleanValue()) {
                        }
                    } else {
                        obj = null;
                    }
                }
                C3044l c3044l = (C3044l) obj;
                if (c3044l != null) {
                    c6856c = ((z) c6862i.f52045q0.f11544i).d(c3044l, true);
                }
                return c6856c;
            case 5:
                return a();
            default:
                if (!c6862i.isInline() && !c6862i.F()) {
                    return null;
                }
                I i12 = c6862i.f52045q0;
                AbstractC3428g abstractC3428g = i12.f11537b;
                C3430i c3430i = (C3430i) i12.f11539d;
                C6861h c6861h = new C6861h(0, (K) i12.f11543h);
                C6861h c6861h2 = new C6861h(1, c6862i);
                C3042j c3042j2 = c6862i.f52038j0;
                AbstractC3557B.c0("<this>", c3042j2);
                AbstractC3557B.c0("nameResolver", abstractC3428g);
                AbstractC3557B.c0("typeTable", c3430i);
                if (c3042j2.f30638E0.size() > 0) {
                    List<Integer> list2 = c3042j2.f30638E0;
                    AbstractC3557B.b0("getMultiFieldValueClassUnderlyingNameList(...)", list2);
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list2, 10));
                    for (Integer num : list2) {
                        AbstractC3557B.Z(num);
                        arrayList.add(R4.b.o1(abstractC3428g, num.intValue()));
                    }
                    C3959i c3959i = new C3959i(Integer.valueOf(c3042j2.f30641H0.size()), Integer.valueOf(c3042j2.f30640G0.size()));
                    if (AbstractC3557B.K(c3959i, new C3959i(Integer.valueOf(arrayList.size()), 0))) {
                        List<Integer> list3 = c3042j2.f30641H0;
                        AbstractC3557B.b0("getMultiFieldValueClassUnderlyingTypeIdList(...)", list3);
                        r22 = new ArrayList(AbstractC6583a.H1(list3, 10));
                        for (Integer num2 : list3) {
                            AbstractC3557B.Z(num2);
                            r22.add(c3430i.a(num2.intValue()));
                        }
                    } else if (AbstractC3557B.K(c3959i, new C3959i(0, Integer.valueOf(arrayList.size())))) {
                        r22 = c3042j2.f30640G0;
                    } else {
                        throw new IllegalStateException(("class " + R4.b.o1(abstractC3428g, c3042j2.f30651j0) + " has illegal multi-field value class representation").toString());
                    }
                    AbstractC3557B.Z(r22);
                    ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(r22, 10));
                    for (Object obj3 : r22) {
                        arrayList2.add(c6861h.invoke(obj3));
                    }
                    obj2 = new C(kf.t.S2(arrayList, arrayList2));
                } else if ((c3042j2.f30649h0 & 8) == 8) {
                    C4294f o12 = R4.b.o1(abstractC3428g, c3042j2.f30635B0);
                    int i13 = c3042j2.f30649h0;
                    if ((i13 & 16) == 16) {
                        q10 = c3042j2.f30636C0;
                    } else if ((i13 & 32) == 32) {
                        q10 = c3430i.a(c3042j2.f30637D0);
                    } else {
                        q10 = null;
                    }
                    if ((q10 != null && (gVar = (Eg.g) c6861h.invoke(q10)) != null) || (gVar = (Eg.g) c6861h2.invoke(o12)) != null) {
                        obj2 = new C1014x(o12, gVar);
                    } else {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + R4.b.o1(abstractC3428g, c3042j2.f30651j0) + " with property " + o12).toString());
                    }
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    return obj2;
                }
                if (c6862i.f52039k0.a(1, 5, 1)) {
                    return null;
                }
                AbstractC0996e M10 = c6862i.M();
                if (M10 != null) {
                    List S = ((AbstractC1165x) M10).S();
                    AbstractC3557B.b0("getValueParameters(...)", S);
                    C4294f name = ((AbstractC1158p) ((h0) kf.t.f2(S))).getName();
                    AbstractC3557B.b0("getName(...)", name);
                    D y02 = c6862i.y0(name);
                    if (y02 != null) {
                        return new C1014x(name, y02);
                    }
                    throw new IllegalStateException(("Value class has no underlying property: " + c6862i).toString());
                }
                throw new IllegalStateException(("Inline class has no primary constructor: " + c6862i).toString());
        }
    }
}
