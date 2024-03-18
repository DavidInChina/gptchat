package Yf;

import Bg.AbstractC0209b;
import Bg.C0213f;
import Bg.Q;
import Bg.Y;
import Bg.j0;
import Bg.k0;
import Bg.p0;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.Z;
import Mf.b0;
import Pf.AbstractC1144b;
import Uf.AbstractC1453o;
import Uf.EnumC1440b;
import bg.AbstractC2201i;
import bg.AbstractC2207o;
import cg.C2425p;
import fg.C3042j;
import hg.C3430i;
import id.AbstractC3557B;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kg.C4290b;
import kg.C4291c;
import kg.C4294f;
import kg.EnumC4299k;
import l8.AbstractC4344b;
import pg.C5186w;
import rg.AbstractC5493d;
import ug.C5928j;
import xg.K;
import yf.AbstractC6583a;
import zg.C6860g;
import zg.C6862i;

/* renamed from: Yf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1696h extends AbstractC0209b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f22339c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Ag.l f22340d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AbstractC1144b f22341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1696h(C1697i c1697i) {
        super(c1697i.f22347p0.e());
        this.f22341e = c1697i;
        Ag.u e10 = c1697i.f22347p0.e();
        C1695g c1695g = new C1695g(c1697i, 0);
        Ag.q qVar = (Ag.q) e10;
        qVar.getClass();
        this.f22340d = new Ag.l(qVar, c1695g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x020a, code lost:
        if (r9 == null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c2  */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v18 */
    @Override // Bg.AbstractC0218k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection b() {
        ?? r72;
        C4291c c4291c;
        Bg.D d10;
        AbstractC0997f abstractC0997f;
        Bg.A a5;
        Y y10;
        C4291c c4291c2;
        AbstractC0997f abstractC0997f2;
        ArrayList arrayList;
        C5186w c5186w;
        String str;
        EnumC4299k enumC4299k;
        String str2;
        C4291c b10;
        Mf.E e10;
        int i10 = this.f22339c;
        AbstractC1144b abstractC1144b = this.f22341e;
        switch (i10) {
            case 0:
                C1697i c1697i = (C1697i) abstractC1144b;
                Class cls = ((Sf.q) c1697i.f22345n0).f16621a;
                Type type = Object.class;
                boolean K10 = AbstractC3557B.K(cls, type);
                kf.v vVar = kf.v.f37483Y;
                if (K10) {
                    r72 = vVar;
                } else {
                    G2.d dVar = new G2.d(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        type = genericSuperclass;
                    }
                    dVar.f(type);
                    Type[] genericInterfaces = cls.getGenericInterfaces();
                    AbstractC3557B.b0("getGenericInterfaces(...)", genericInterfaces);
                    dVar.g(genericInterfaces);
                    ArrayList arrayList2 = dVar.f5857a;
                    List<Type> G02 = AbstractC4344b.G0(arrayList2.toArray(new Type[arrayList2.size()]));
                    r72 = new ArrayList(AbstractC6583a.H1(G02, 10));
                    for (Type type2 : G02) {
                        r72.add(new Sf.s(type2));
                    }
                }
                ArrayList arrayList3 = new ArrayList(r72.size());
                boolean z10 = false;
                ArrayList arrayList4 = new ArrayList(0);
                C4291c c4291c3 = Uf.D.f17739n;
                AbstractC3557B.b0("PURELY_IMPLEMENTS_ANNOTATION", c4291c3);
                Nf.c l10 = c1697i.f22342A0.l(c4291c3);
                if (l10 != null) {
                    Object C22 = kf.t.C2(l10.b().values());
                    if (C22 instanceof C5186w) {
                        c5186w = (C5186w) C22;
                    } else {
                        c5186w = null;
                    }
                    if (c5186w != null && (str = (String) c5186w.f43144a) != null) {
                        EnumC4299k enumC4299k2 = EnumC4299k.f37538Y;
                        int i11 = 0;
                        while (true) {
                            if (i11 < str.length()) {
                                char charAt = str.charAt(i11);
                                int ordinal = enumC4299k2.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            continue;
                                        }
                                    } else if (charAt == '.') {
                                        enumC4299k = EnumC4299k.f37540h0;
                                        enumC4299k2 = enumC4299k;
                                    } else if (!Character.isJavaIdentifierPart(charAt)) {
                                    }
                                    i11++;
                                }
                                if (Character.isJavaIdentifierStart(charAt)) {
                                    enumC4299k = EnumC4299k.f37539Z;
                                    enumC4299k2 = enumC4299k;
                                    i11++;
                                }
                            } else if (enumC4299k2 != EnumC4299k.f37540h0) {
                                c4291c = new C4291c(str);
                            }
                        }
                    }
                }
                c4291c = null;
                if (c4291c == null || c4291c.d() || !c4291c.h(Jf.q.f9203j)) {
                    c4291c = null;
                }
                s3.z zVar = c1697i.f22347p0;
                if (c4291c == null) {
                    LinkedHashMap linkedHashMap = AbstractC1453o.f17828a;
                    c4291c2 = (C4291c) AbstractC1453o.f17829b.get(AbstractC5493d.g(c1697i));
                    break;
                } else {
                    c4291c2 = c4291c;
                }
                Mf.B d11 = zVar.d();
                Tf.d dVar2 = Tf.d.f17218m0;
                int i12 = AbstractC5493d.f44985a;
                AbstractC3557B.c0("<this>", d11);
                c4291c2.d();
                C4291c e11 = c4291c2.e();
                AbstractC3557B.b0("parent(...)", e11);
                C5928j c5928j = ((Pf.A) d11.r(e11)).f13979l0;
                C4294f f6 = c4291c2.f();
                AbstractC3557B.b0("shortName(...)", f6);
                AbstractC1000i e12 = c5928j.e(f6, dVar2);
                if (e12 instanceof AbstractC0997f) {
                    abstractC0997f2 = (AbstractC0997f) e12;
                } else {
                    abstractC0997f2 = null;
                }
                if (abstractC0997f2 != null) {
                    int size = abstractC0997f2.f().getParameters().size();
                    List<b0> parameters = c1697i.f22353v0.getParameters();
                    AbstractC3557B.b0("getParameters(...)", parameters);
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
                        for (b0 b0Var : parameters) {
                            arrayList.add(new Bg.I(b0Var.n(), p0.f2146h0));
                        }
                    } else if (size2 == 1 && size > 1 && c4291c == null) {
                        Bg.I i13 = new Bg.I(((b0) kf.t.B2(parameters)).n(), p0.f2146h0);
                        Cf.e eVar = new Cf.e(1, size, 1);
                        ArrayList arrayList5 = new ArrayList(AbstractC6583a.H1(eVar, 10));
                        Cf.f it = eVar.iterator();
                        while (it.f3111h0) {
                            it.a();
                            arrayList5.add(i13);
                        }
                        arrayList = arrayList5;
                    }
                    Q.f2084Z.getClass();
                    d10 = C0213f.l(Q.f2085h0, abstractC0997f2, arrayList);
                    for (AbstractC2201i abstractC2201i : r72) {
                        Bg.A L10 = ((U3.i) zVar.f45398e).L(abstractC2201i, A7.b.N1(k0.f2131Y, z10, z10, null, 7));
                        y7.b bVar = ((Xf.a) zVar.f45394a).f21969r;
                        bVar.getClass();
                        s3.z zVar2 = zVar;
                        boolean z11 = z10;
                        Bg.A m10 = bVar.m(new C2425p(null, false, zVar, EnumC1440b.f17806j0, true), L10, vVar, null, false);
                        if (m10 == null) {
                            m10 = L10;
                        }
                        if (m10.y0().k() instanceof Mf.E) {
                            arrayList4.add(abstractC2201i);
                        }
                        Y y02 = m10.y0();
                        if (d10 != null) {
                            y10 = d10.y0();
                        } else {
                            y10 = null;
                        }
                        if (!AbstractC3557B.K(y02, y10) && !Jf.l.x(m10)) {
                            arrayList3.add(m10);
                        }
                        zVar = zVar2;
                        z10 = z11;
                    }
                    s3.z zVar3 = zVar;
                    abstractC0997f = c1697i.f22346o0;
                    if (abstractC0997f == null) {
                        a5 = j0.e(AbstractC4344b.Y(abstractC0997f, c1697i)).j(abstractC0997f.n(), p0.f2146h0);
                    } else {
                        a5 = null;
                    }
                    Ig.i.b(a5, arrayList3);
                    Ig.i.b(d10, arrayList3);
                    if (!arrayList4.isEmpty()) {
                        xg.s sVar = ((Xf.a) zVar3.f45394a).f21957f;
                        AbstractC0997f q10 = q();
                        ArrayList arrayList6 = new ArrayList(AbstractC6583a.H1(arrayList4, 10));
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            AbstractC2207o abstractC2207o = (AbstractC2207o) it2.next();
                            AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType", abstractC2207o);
                            arrayList6.add(((Sf.s) ((AbstractC2201i) abstractC2207o)).f16623a.toString());
                        }
                        sVar.b((AbstractC1144b) q10, arrayList6);
                    }
                    if (!(!arrayList3.isEmpty())) {
                        return kf.t.K2(arrayList3);
                    }
                    return AbstractC4344b.F0(zVar3.d().j().e());
                }
                d10 = null;
                while (r4.hasNext()) {
                }
                s3.z zVar32 = zVar;
                abstractC0997f = c1697i.f22346o0;
                if (abstractC0997f == null) {
                }
                Ig.i.b(a5, arrayList3);
                Ig.i.b(d10, arrayList3);
                if (!arrayList4.isEmpty()) {
                }
                if (!(!arrayList3.isEmpty())) {
                }
                break;
            default:
                C6862i c6862i = (C6862i) abstractC1144b;
                C3042j c3042j = c6862i.f52038j0;
                M3.I i14 = c6862i.f52045q0;
                C3430i c3430i = (C3430i) i14.f11539d;
                AbstractC3557B.c0("<this>", c3042j);
                AbstractC3557B.c0("typeTable", c3430i);
                List list = c3042j.f30654m0;
                boolean z12 = !list.isEmpty();
                ?? r42 = list;
                if (!z12) {
                    r42 = 0;
                }
                if (r42 == 0) {
                    List<Integer> list2 = c3042j.f30655n0;
                    AbstractC3557B.b0("getSupertypeIdList(...)", list2);
                    r42 = new ArrayList(AbstractC6583a.H1(list2, 10));
                    for (Integer num : list2) {
                        AbstractC3557B.Z(num);
                        r42.add(c3430i.a(num.intValue()));
                    }
                }
                ArrayList arrayList7 = new ArrayList(AbstractC6583a.H1(r42, 10));
                for (fg.Q q11 : r42) {
                    arrayList7.add(((K) i14.f11543h).g(q11));
                }
                ArrayList w22 = kf.t.w2(((xg.m) i14.f11536a).f50023n.e(c6862i), arrayList7);
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = w22.iterator();
                while (it3.hasNext()) {
                    AbstractC1000i k10 = ((Bg.A) it3.next()).y0().k();
                    if (k10 instanceof Mf.E) {
                        e10 = (Mf.E) k10;
                    } else {
                        e10 = null;
                    }
                    if (e10 != null) {
                        arrayList8.add(e10);
                    }
                }
                if (!arrayList8.isEmpty()) {
                    xg.s sVar2 = ((xg.m) i14.f11536a).f50017h;
                    ArrayList arrayList9 = new ArrayList(AbstractC6583a.H1(arrayList8, 10));
                    Iterator it4 = arrayList8.iterator();
                    while (it4.hasNext()) {
                        Mf.E e13 = (Mf.E) it4.next();
                        C4290b f10 = AbstractC5493d.f(e13);
                        if (f10 != null && (b10 = f10.b()) != null) {
                            str2 = b10.b();
                        } else {
                            str2 = e13.getName().b();
                        }
                        arrayList9.add(str2);
                    }
                    sVar2.b(c6862i, arrayList9);
                }
                return kf.t.K2(w22);
        }
    }

    @Override // Bg.AbstractC0218k
    public final Z f() {
        switch (this.f22339c) {
            case 0:
                return ((Xf.a) ((C1697i) this.f22341e).f22347p0.f45394a).f21964m;
            default:
                return Mf.Y.f12077a;
        }
    }

    @Override // Bg.Y
    public final List getParameters() {
        Ag.l lVar = this.f22340d;
        switch (this.f22339c) {
            case 0:
                return (List) lVar.mo122invoke();
            default:
                return (List) lVar.mo122invoke();
        }
    }

    @Override // Bg.AbstractC0209b, Bg.Y
    public final AbstractC1000i k() {
        switch (this.f22339c) {
            case 0:
                return q();
            default:
                return (C6862i) this.f22341e;
        }
    }

    @Override // Bg.Y
    public final boolean m() {
        return true;
    }

    @Override // Bg.AbstractC0209b
    public final AbstractC0997f q() {
        int i10 = this.f22339c;
        AbstractC1144b abstractC1144b = this.f22341e;
        switch (i10) {
            case 0:
                return (C1697i) abstractC1144b;
            default:
                return (C6862i) abstractC1144b;
        }
    }

    public final String toString() {
        int i10 = this.f22339c;
        AbstractC1144b abstractC1144b = this.f22341e;
        switch (i10) {
            case 0:
                String b10 = ((C1697i) abstractC1144b).getName().b();
                AbstractC3557B.b0("asString(...)", b10);
                return b10;
            default:
                String str = ((C6862i) abstractC1144b).getName().f37507Y;
                AbstractC3557B.b0("toString(...)", str);
                return str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1696h(C6862i c6862i) {
        super(c6862i.f52045q0.c());
        this.f22341e = c6862i;
        Ag.u c10 = c6862i.f52045q0.c();
        C6860g c6860g = new C6860g(c6862i, 0);
        Ag.q qVar = (Ag.q) c10;
        qVar.getClass();
        this.f22340d = new Ag.l(qVar, c6860g);
    }
}
