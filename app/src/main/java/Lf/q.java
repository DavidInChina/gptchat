package Lf;

import Bg.D;
import Bg.j0;
import Df.v;
import K4.J;
import Mf.A;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1012v;
import Mf.AbstractC1013w;
import Mf.B;
import Mf.EnumC0998g;
import Mf.h0;
import Pf.AbstractC1165x;
import Pf.C1154l;
import Pf.C1156n;
import Pf.C1164w;
import Pf.G;
import Pf.T;
import Pf.c0;
import Yf.C1697i;
import fg.C3056y;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jf.C3959i;
import kf.x;
import kg.C4290b;
import kg.C4291c;
import kg.C4293e;
import kg.C4294f;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.u;
import l8.AbstractC4344b;
import ng.AbstractC4838e;
import ng.C4846m;
import rg.AbstractC5493d;
import ud.C5902a;
import yf.AbstractC6583a;
import zg.C6862i;

/* loaded from: classes2.dex */
public final class q implements Of.b, Of.e {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ v[] f11113i;

    /* renamed from: a  reason: collision with root package name */
    public final B f11114a;

    /* renamed from: b  reason: collision with root package name */
    public final e f11115b = e.f11081Y;

    /* renamed from: c  reason: collision with root package name */
    public final Ag.l f11116c;

    /* renamed from: d  reason: collision with root package name */
    public final D f11117d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.l f11118e;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.f f11119f;

    /* renamed from: g  reason: collision with root package name */
    public final Ag.l f11120g;

    /* renamed from: h  reason: collision with root package name */
    public final Ag.n f11121h;

    static {
        kotlin.jvm.internal.D d10 = C.f37623a;
        f11113i = new v[]{d10.g(new u(d10.b(q.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), d10.g(new u(d10.b(q.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), d10.g(new u(d10.b(q.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [Ag.g, Ag.f] */
    public q(G g10, Ag.u uVar, zc.u uVar2) {
        AbstractC3557B.c0("storageManager", uVar);
        this.f11114a = g10;
        Ag.q qVar = (Ag.q) uVar;
        this.f11116c = new Ag.l(qVar, uVar2);
        C1156n c1156n = new C1156n(new l(g10, new C4291c("java.io"), 0), C4294f.e("Serializable"), A.f12054j0, EnumC0998g.f12085Z, AbstractC4344b.F0(new Bg.B(uVar, new m(this, 0))), uVar);
        c1156n.x0(ug.m.f46797b, x.f37485Y, null);
        this.f11117d = c1156n.n();
        this.f11118e = new Ag.l(qVar, new C5902a(this, 14, uVar));
        this.f11119f = new Ag.g(qVar, new ConcurrentHashMap(3, 1.0f, 2));
        this.f11120g = new Ag.l(qVar, new m(this, 1));
        this.f11121h = qVar.b(new n(this, 0));
    }

    @Override // Of.b
    public final Collection a(C6862i c6862i) {
        EnumC0998g enumC0998g = EnumC0998g.f12084Y;
        kf.v vVar = kf.v.f37483Y;
        if (c6862i.f52044p0 == enumC0998g && g().f11094b) {
            C1697i f6 = f(c6862i);
            if (f6 == null) {
                return vVar;
            }
            AbstractC0997f b10 = e.b(this.f11115b, AbstractC5493d.g(f6), b.f11063f);
            if (b10 == null) {
                return vVar;
            }
            j0 e10 = j0.e(AbstractC4344b.Y(b10, f6));
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) f6.f22354w0.f22370q.mo122invoke()).iterator();
            while (true) {
                C4293e c4293e = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AbstractC0996e abstractC0996e = (AbstractC0996e) next;
                AbstractC1165x abstractC1165x = (AbstractC1165x) abstractC0996e;
                if (abstractC1165x.getVisibility().f12097a.f12122b) {
                    Collection u10 = b10.u();
                    AbstractC3557B.b0("getConstructors(...)", u10);
                    Collection<AbstractC0996e> collection = u10;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        for (AbstractC0996e abstractC0996e2 : collection) {
                            AbstractC3557B.Z(abstractC0996e2);
                            if (C4846m.j(abstractC0996e2, ((C1154l) abstractC0996e).c(e10)) == 1) {
                                break;
                            }
                        }
                    }
                    if (abstractC1165x.S().size() == 1) {
                        List S = abstractC1165x.S();
                        AbstractC3557B.b0("getValueParameters(...)", S);
                        AbstractC1000i k10 = ((c0) ((h0) kf.t.B2(S))).getType().y0().k();
                        if (k10 != null) {
                            c4293e = AbstractC5493d.h(k10);
                        }
                        if (AbstractC3557B.K(c4293e, AbstractC5493d.h(c6862i))) {
                        }
                    }
                    if (!Jf.l.C(abstractC0996e) && !t.f11129f.contains(J.d0(f6, L4.a.e0(abstractC0996e, 3)))) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                AbstractC0996e abstractC0996e3 = (AbstractC0996e) it2.next();
                AbstractC1165x abstractC1165x2 = (AbstractC1165x) abstractC0996e3;
                abstractC1165x2.getClass();
                C1164w C02 = abstractC1165x2.C0(j0.f2127b);
                C02.b(c6862i);
                C02.n(c6862i.n());
                C02.f14150o = true;
                Bg.h0 g10 = e10.g();
                if (g10 != null) {
                    C02.f14136a = g10;
                    if (!t.f11130g.contains(J.d0(f6, L4.a.e0(abstractC0996e3, 3)))) {
                        C02.a((Nf.i) A7.b.X0(this.f11120g, f11113i[2]));
                    }
                    AbstractC1165x z02 = C02.f14159x.z0(C02);
                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor", z02);
                    arrayList2.add((AbstractC0996e) z02);
                } else {
                    C1164w.r(37);
                    throw null;
                }
            }
            return arrayList2;
        }
        return vVar;
    }

    @Override // Of.e
    public final boolean b(C6862i c6862i, zg.s sVar) {
        AbstractC3557B.c0("classDescriptor", c6862i);
        C1697i f6 = f(c6862i);
        if (f6 == null || !sVar.getAnnotations().G(Of.f.f13753a)) {
            return true;
        }
        if (!g().f11094b) {
            return false;
        }
        String e02 = L4.a.e0(sVar, 3);
        Yf.o n02 = f6.n0();
        C4294f name = sVar.getName();
        AbstractC3557B.b0("getName(...)", name);
        Collection<T> a5 = n02.a(name, Tf.d.f17211Y);
        if (!(a5 instanceof Collection) || !a5.isEmpty()) {
            for (T t10 : a5) {
                if (AbstractC3557B.K(L4.a.e0(t10, 3), e02)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Of.b
    public final Collection c(C6862i c6862i) {
        C1697i f6;
        Set b10;
        AbstractC3557B.c0("classDescriptor", c6862i);
        boolean z10 = g().f11094b;
        Set set = x.f37485Y;
        if (z10 && (f6 = f(c6862i)) != null && (b10 = f6.n0().b()) != null) {
            set = b10;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x02c6, code lost:
        if (r7 != 4) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.io.Serializable] */
    @Override // Of.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection d(C4294f c4294f, C6862i c6862i) {
        T t10;
        Nf.i iVar;
        Set set;
        Object obj;
        AbstractC0997f abstractC0997f;
        AbstractC3557B.c0("name", c4294f);
        AbstractC3557B.c0("classDescriptor", c6862i);
        boolean K10 = AbstractC3557B.K(c4294f, a.f11062e);
        kf.v<T> vVar = kf.v.f37483Y;
        v[] vVarArr = f11113i;
        if (K10) {
            C4294f c4294f2 = Jf.l.f9117e;
            if (Jf.l.b(c6862i, Jf.p.f9174g) || Jf.l.r(c6862i) != null) {
                List<C3056y> list = c6862i.f52038j0.f30663v0;
                AbstractC3557B.b0("getFunctionList(...)", list);
                if (!list.isEmpty()) {
                    for (C3056y c3056y : list) {
                        if (AbstractC3557B.K(R4.b.o1(c6862i.f52045q0.f11537b, c3056y.f30771k0), a.f11062e)) {
                            return vVar;
                        }
                    }
                }
                AbstractC1012v m02 = ((T) kf.t.A2(((D) A7.b.X0(this.f11118e, vVarArr[1])).R().a(c4294f, Tf.d.f17211Y))).m0();
                m02.b(c6862i);
                m02.d(Mf.r.f12105e);
                m02.n(c6862i.n());
                m02.p(c6862i.v0());
                AbstractC1013w f6 = m02.f();
                AbstractC3557B.Z(f6);
                return AbstractC4344b.F0((T) f6);
            }
        }
        if (!g().f11094b) {
            return vVar;
        }
        o oVar = new o(c4294f, 0);
        C1697i f10 = f(c6862i);
        if (f10 != null) {
            C4291c g10 = AbstractC5493d.g(f10);
            b bVar = b.f11063f;
            e eVar = this.f11115b;
            eVar.getClass();
            AbstractC3557B.c0("builtIns", bVar);
            AbstractC0997f b10 = e.b(eVar, g10, bVar);
            if (b10 == null) {
                set = x.f37485Y;
            } else {
                String str = d.f11067a;
                C4291c c4291c = (C4291c) d.f11077k.get(AbstractC5493d.h(b10));
                if (c4291c == null) {
                    set = R4.b.W1(b10);
                } else {
                    set = AbstractC4344b.G0(b10, bVar.i(c4291c));
                }
            }
            Iterable<AbstractC0997f> iterable = set;
            if (iterable instanceof List) {
                List list2 = (List) iterable;
                if (!list2.isEmpty()) {
                    obj = list2.get(list2.size() - 1);
                    abstractC0997f = (AbstractC0997f) obj;
                    if (abstractC0997f != null) {
                        int i10 = Ig.g.f8602h0;
                        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(iterable, 10));
                        for (AbstractC0997f abstractC0997f2 : iterable) {
                            arrayList.add(AbstractC5493d.g(abstractC0997f2));
                        }
                        Ig.g gVar = new Ig.g();
                        gVar.addAll(arrayList);
                        String str2 = d.f11067a;
                        boolean containsKey = d.f11076j.containsKey(AbstractC4838e.g(c6862i));
                        C4291c g11 = AbstractC5493d.g(f10);
                        C5902a c5902a = new C5902a(f10, 15, abstractC0997f);
                        Ag.f fVar = this.f11119f;
                        fVar.getClass();
                        Object invoke = fVar.invoke(new Ag.i(g11, c5902a));
                        if (invoke != null) {
                            ug.n n02 = ((AbstractC0997f) invoke).n0();
                            AbstractC3557B.b0("getUnsubstitutedMemberScope(...)", n02);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (Iterable) oVar.invoke(n02)) {
                                T t11 = (T) obj2;
                                if (t11.e() == 1 && t11.getVisibility().f12097a.f12122b && !Jf.l.C(t11)) {
                                    Collection m10 = t11.m();
                                    AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
                                    Collection<AbstractC1013w> collection = m10;
                                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                        for (AbstractC1013w abstractC1013w : collection) {
                                            AbstractC1003l mo20k = abstractC1013w.mo20k();
                                            AbstractC3557B.b0("getContainingDeclaration(...)", mo20k);
                                            if (gVar.contains(AbstractC5493d.g(mo20k))) {
                                                break;
                                            }
                                        }
                                    }
                                    AbstractC1003l mo20k2 = t11.mo20k();
                                    AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k2);
                                    if (!(t.f11128e.contains(J.d0((AbstractC0997f) mo20k2, L4.a.e0(t11, 3))) ^ containsKey)) {
                                        Boolean h10 = Ig.i.h(AbstractC4344b.F0(t11), e.f11082Z, new n(this, 1));
                                        AbstractC3557B.b0("ifAny(...)", h10);
                                        if (!h10.booleanValue()) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                }
                            }
                            vVar = arrayList2;
                        } else {
                            Ag.f.a(3);
                            throw null;
                        }
                    }
                }
                obj = null;
                abstractC0997f = (AbstractC0997f) obj;
                if (abstractC0997f != null) {
                }
            } else {
                Iterator it = iterable.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                    abstractC0997f = (AbstractC0997f) obj;
                    if (abstractC0997f != null) {
                    }
                }
                obj = null;
                abstractC0997f = (AbstractC0997f) obj;
                if (abstractC0997f != null) {
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t12 : vVar) {
            AbstractC1003l mo20k3 = t12.mo20k();
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k3);
            AbstractC1013w c10 = t12.c(j0.e(AbstractC4344b.Y((AbstractC0997f) mo20k3, c6862i)));
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor", c10);
            AbstractC1012v m03 = ((T) c10).m0();
            m03.b(c6862i);
            m03.p(c6862i.v0());
            m03.h();
            AbstractC1003l mo20k4 = t12.mo20k();
            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k4);
            Object f11 = Ig.i.f(AbstractC4344b.F0((AbstractC0997f) mo20k4), new S4.o(20, this), new p(L4.a.e0(t12, 3), new Object(), 0));
            AbstractC3557B.b0("dfs(...)", f11);
            int ordinal = ((k) f11).ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        m03.a((Nf.i) A7.b.X0(this.f11120g, vVarArr[2]));
                    }
                } else {
                    C4294f name = t12.getName();
                    boolean K11 = AbstractC3557B.K(name, r.f11122a);
                    Ag.n nVar = this.f11121h;
                    if (K11) {
                        iVar = (Nf.i) nVar.invoke(new C3959i(t12.getName().b(), "first"));
                    } else if (AbstractC3557B.K(name, r.f11123b)) {
                        iVar = (Nf.i) nVar.invoke(new C3959i(t12.getName().b(), "last"));
                    } else {
                        throw new IllegalStateException(("Unexpected name: " + t12.getName()).toString());
                    }
                    m03.a(iVar);
                }
                AbstractC1013w f12 = m03.f();
                AbstractC3557B.Z(f12);
                t10 = (T) f12;
            } else {
                if (c6862i.h() != A.f12051Z || c6862i.e() == EnumC0998g.f12086h0) {
                    m03.j();
                    AbstractC1013w f122 = m03.f();
                    AbstractC3557B.Z(f122);
                    t10 = (T) f122;
                }
                t10 = null;
            }
            if (t10 != null) {
                arrayList3.add(t10);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (java.io.Serializable.class.isAssignableFrom(java.lang.Class.forName(r6.b().b())) != false) goto L21;
     */
    @Override // Of.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection e(C6862i c6862i) {
        boolean z10;
        AbstractC3557B.c0("classDescriptor", c6862i);
        C4293e h10 = AbstractC5493d.h(c6862i);
        LinkedHashSet linkedHashSet = t.f11124a;
        C4293e c4293e = Jf.p.f9174g;
        if (!AbstractC3557B.K(h10, c4293e) && Jf.p.f9170c0.get(h10) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        D d10 = this.f11117d;
        if (z10) {
            D d11 = (D) A7.b.X0(this.f11118e, f11113i[1]);
            AbstractC3557B.b0("<get-cloneableType>(...)", d11);
            return AbstractC4344b.G0(d11, d10);
        }
        if (!AbstractC3557B.K(h10, c4293e) && Jf.p.f9170c0.get(h10) == null) {
            String str = d.f11067a;
            C4290b f6 = d.f(h10);
            if (f6 != null) {
            }
            return kf.v.f37483Y;
        }
        return AbstractC4344b.F0(d10);
    }

    public final C1697i f(AbstractC0997f abstractC0997f) {
        C4291c b10;
        if (abstractC0997f != null) {
            C4294f c4294f = Jf.l.f9117e;
            if (Jf.l.b(abstractC0997f, Jf.p.f9165a) || !Jf.l.H(abstractC0997f)) {
                return null;
            }
            C4293e h10 = AbstractC5493d.h(abstractC0997f);
            if (!h10.d()) {
                return null;
            }
            String str = d.f11067a;
            C4290b f6 = d.f(h10);
            if (f6 == null || (b10 = f6.b()) == null) {
                return null;
            }
            B b11 = g().f11093a;
            Tf.d dVar = Tf.d.f17211Y;
            AbstractC0997f A02 = P4.a.A0(b11, b10);
            if (!(A02 instanceof C1697i)) {
                return null;
            }
            return (C1697i) A02;
        }
        Jf.l.a(109);
        throw null;
    }

    public final i g() {
        return (i) A7.b.X0(this.f11116c, f11113i[0]);
    }
}
