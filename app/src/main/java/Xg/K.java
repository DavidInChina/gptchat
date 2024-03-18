package xg;

import Bg.C0213f;
import Bg.C0219l;
import Bg.C0223p;
import Bg.C0224q;
import Bg.O;
import Bg.P;
import Bg.Y;
import Bg.d0;
import Bg.m0;
import Bg.p0;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.a0;
import Mf.b0;
import fg.N;
import fg.Q;
import fg.W;
import hg.AbstractC3427f;
import hg.C3422a;
import hg.C3430i;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C4290b;
import kg.C4291c;
import l8.AbstractC4344b;
import rg.AbstractC5493d;
import ud.C5902a;
import yf.AbstractC6583a;
import zg.C6854a;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final M3.I f49979a;

    /* renamed from: b  reason: collision with root package name */
    public final K f49980b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49981c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49982d;

    /* renamed from: e  reason: collision with root package name */
    public final Ag.m f49983e;

    /* renamed from: f  reason: collision with root package name */
    public final Ag.m f49984f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f49985g;

    public K(M3.I i10, K k10, List list, String str, String str2) {
        Map map;
        AbstractC3557B.c0("c", i10);
        AbstractC3557B.c0("debugName", str);
        this.f49979a = i10;
        this.f49980b = k10;
        this.f49981c = str;
        this.f49982d = str2;
        int i11 = 0;
        this.f49983e = ((Ag.q) i10.c()).c(new H(this, 0));
        this.f49984f = ((Ag.q) i10.c()).c(new H(this, 1));
        if (list.isEmpty()) {
            map = kf.w.f37484Y;
        } else {
            map = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W w10 = (W) it.next();
                map.put(Integer.valueOf(w10.f30454i0), new zg.u(this.f49979a, w10, i11));
                i11++;
            }
        }
        this.f49985g = map;
    }

    public static Bg.D a(Bg.D d10, Bg.A a5) {
        Jf.l P02 = Bi.c.P0(d10);
        Nf.i annotations = d10.getAnnotations();
        Bg.A z02 = Ad.l.z0(d10);
        List q02 = Ad.l.q0(d10);
        List<d0> a22 = kf.t.a2(Ad.l.B0(d10));
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(a22, 10));
        for (d0 d0Var : a22) {
            arrayList.add(d0Var.getType());
        }
        return Ad.l.f0(P02, annotations, z02, q02, arrayList, a5, true).C0(d10.z0());
    }

    public static final ArrayList e(Q q10, K k10) {
        Iterable iterable;
        List list = q10.f30397i0;
        AbstractC3557B.b0("getArgumentList(...)", list);
        Q u02 = P4.a.u0(q10, (C3430i) k10.f49979a.f11539d);
        if (u02 != null) {
            iterable = e(u02, k10);
        } else {
            iterable = null;
        }
        if (iterable == null) {
            iterable = kf.v.f37483Y;
        }
        return kf.t.w2(iterable, list);
    }

    public static Bg.Q f(List list, Nf.i iVar, Y y10, AbstractC1003l abstractC1003l) {
        Bg.Q q10;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C0223p) ((O) it.next())).getClass();
            if (iVar.isEmpty()) {
                Bg.Q.f2084Z.getClass();
                q10 = Bg.Q.f2085h0;
            } else {
                P p10 = Bg.Q.f2084Z;
                List F02 = AbstractC4344b.F0(new C0219l(iVar));
                p10.getClass();
                q10 = P.a(F02);
            }
            arrayList.add(q10);
        }
        ArrayList I12 = AbstractC6583a.I1(arrayList);
        Bg.Q.f2084Z.getClass();
        return P.a(I12);
    }

    public static final AbstractC0997f h(K k10, Q q10, int i10) {
        C4290b f12 = R4.b.f1(k10.f49979a.f11537b, i10);
        Kg.s n12 = Kg.m.n1(Kg.p.c1(q10, new H(k10, 2)), J.f49978Y);
        ArrayList arrayList = new ArrayList();
        for (Object obj : n12.f9850a) {
            arrayList.add(n12.f9851b.invoke(obj));
        }
        int f13 = Kg.m.f1(Kg.p.c1(f12, I.f49977Y));
        while (arrayList.size() < f13) {
            arrayList.add(0);
        }
        return ((m) k10.f49979a.f11536a).f50021l.x(f12, arrayList);
    }

    public final List b() {
        return kf.t.K2(this.f49985g.values());
    }

    public final b0 c(int i10) {
        b0 b0Var = (b0) this.f49985g.get(Integer.valueOf(i10));
        if (b0Var == null) {
            K k10 = this.f49980b;
            if (k10 != null) {
                return k10.c(i10);
            }
            return null;
        }
        return b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bg.D d(Q q10, boolean z10) {
        Y y10;
        Q q11;
        Bg.D d10;
        Q q12;
        Bg.D j6;
        Kf.k kVar;
        d0 d0Var;
        Bg.A type;
        C4291c c4291c;
        AbstractC0993b abstractC0993b;
        C4291c c4291c2;
        int size;
        Nf.i iVar;
        boolean z11;
        Object obj;
        p0 p0Var;
        Q q13;
        AbstractC1000i abstractC1000i;
        ?? r82;
        AbstractC3557B.c0("proto", q10);
        boolean o10 = q10.o();
        M3.I i10 = this.f49979a;
        if (o10) {
            if (R4.b.f1(i10.f11537b, q10.f30402n0).f37495c) {
                ((m) i10.f11536a).f50016g.getClass();
            }
        } else if ((q10.f30396h0 & 128) == 128) {
            if (R4.b.f1(i10.f11537b, q10.f30405q0).f37495c) {
                ((m) i10.f11536a).f50016g.getClass();
            }
        }
        if (q10.o()) {
            abstractC1000i = (AbstractC1000i) this.f49983e.invoke(Integer.valueOf(q10.f30402n0));
            if (abstractC1000i == null) {
                abstractC1000i = h(this, q10, q10.f30402n0);
            }
        } else {
            int i11 = q10.f30396h0;
            if ((i11 & 32) == 32) {
                abstractC1000i = c(q10.f30403o0);
                if (abstractC1000i == null) {
                    Dg.m mVar = Dg.m.f3709a;
                    y10 = Dg.m.d(Dg.l.f3700t0, String.valueOf(q10.f30403o0), this.f49982d);
                }
            } else if ((i11 & 64) == 64) {
                String b10 = i10.f11537b.b(q10.f30404p0);
                Iterator it = b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        r82 = it.next();
                        if (AbstractC3557B.K(((b0) r82).getName().b(), b10)) {
                            break;
                        }
                    } else {
                        r82 = 0;
                        break;
                    }
                }
                b0 b0Var = r82;
                if (b0Var == null) {
                    Dg.m mVar2 = Dg.m.f3709a;
                    y10 = Dg.m.d(Dg.l.f3701u0, b10, ((AbstractC1003l) i10.f11538c).toString());
                } else {
                    abstractC1000i = b0Var;
                }
            } else if ((i11 & 128) == 128) {
                abstractC1000i = (AbstractC1000i) this.f49984f.invoke(Integer.valueOf(q10.f30405q0));
                if (abstractC1000i == null) {
                    abstractC1000i = h(this, q10, q10.f30405q0);
                }
            } else {
                Dg.m mVar3 = Dg.m.f3709a;
                y10 = Dg.m.d(Dg.l.f3703w0, new String[0]);
            }
            int i12 = 1;
            if (!Dg.m.f(y10.k())) {
                Dg.m mVar4 = Dg.m.f3709a;
                return Dg.m.e(Dg.l.f3678B0, kf.v.f37483Y, y10, (String[]) Arrays.copyOf(new String[]{y10.toString()}, 1));
            }
            C6854a c6854a = new C6854a(i10.c(), new C5902a(this, 22, q10));
            Bg.Q f6 = f(((m) i10.f11536a).f50027r, c6854a, y10, (AbstractC1003l) i10.f11538c);
            ArrayList e10 = e(q10, this);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(e10, 10));
            Iterator it2 = e10.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    fg.O o11 = (fg.O) next;
                    List parameters = y10.getParameters();
                    AbstractC3557B.b0("getParameters(...)", parameters);
                    b0 b0Var2 = (b0) kf.t.i2(i13, parameters);
                    N n10 = o11.f30373h0;
                    if (n10 == N.STAR) {
                        if (b0Var2 == null) {
                            obj = new Bg.H(((m) i10.f11536a).f50011b.j());
                        } else {
                            obj = new Bg.I(b0Var2);
                        }
                    } else {
                        AbstractC3557B.b0("getProjection(...)", n10);
                        int ordinal = n10.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != i12) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        throw new RuntimeException();
                                    }
                                    throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + n10);
                                }
                                p0Var = p0.f2146h0;
                            } else {
                                p0Var = p0.f2148j0;
                            }
                        } else {
                            p0Var = p0.f2147i0;
                        }
                        C3430i c3430i = (C3430i) i10.f11539d;
                        AbstractC3557B.c0("typeTable", c3430i);
                        int i15 = o11.f30372Z;
                        if ((i15 & 2) == 2) {
                            q13 = o11.f30374i0;
                        } else if ((i15 & 4) == 4) {
                            q13 = c3430i.a(o11.f30375j0);
                        } else {
                            q13 = null;
                        }
                        if (q13 == null) {
                            obj = new Bg.I(Dg.m.c(Dg.l.f3683G0, o11.toString()));
                        } else {
                            obj = new Bg.I(g(q13), p0Var);
                        }
                    }
                    arrayList.add(obj);
                    i13 = i14;
                    i12 = 1;
                } else {
                    AbstractC4344b.d1();
                    throw null;
                }
            }
            List K22 = kf.t.K2(arrayList);
            AbstractC1000i k10 = y10.k();
            if (z10 && (k10 instanceof a0)) {
                a0 a0Var = (a0) k10;
                AbstractC3557B.c0("<this>", a0Var);
                Bg.K k11 = new Bg.K();
                q11 = null;
                Bg.L e11 = C3422a.e(null, a0Var, K22);
                Bg.Q.f2084Z.getClass();
                Bg.Q q14 = Bg.Q.f2085h0;
                AbstractC3557B.c0("attributes", q14);
                Bg.D b11 = k11.b(e11, q14, false, 0, true);
                List list = ((m) i10.f11536a).f50027r;
                ArrayList u22 = kf.t.u2(c6854a, b11.getAnnotations());
                if (u22.isEmpty()) {
                    iVar = Nf.h.f12822a;
                } else {
                    iVar = new Nf.j(0, u22);
                }
                Bg.Q f10 = f(list, iVar, y10, (AbstractC1003l) i10.f11538c);
                if (!m0.f(b11) && !q10.f30398j0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                d10 = b11.C0(z11).E0(f10);
            } else {
                q11 = null;
                if (AbstractC3427f.f32312a.c(q10.f30410v0).booleanValue()) {
                    boolean z12 = q10.f30398j0;
                    int size2 = y10.getParameters().size() - K22.size();
                    if (size2 != 0) {
                        if (size2 == 1 && (size = K22.size() - 1) >= 0) {
                            Y f11 = y10.j().v(size).f();
                            AbstractC3557B.b0("getTypeConstructor(...)", f11);
                            j6 = C0213f.m(f6, f11, K22, z12);
                            if (j6 == null) {
                                Dg.m mVar5 = Dg.m.f3709a;
                                d10 = Dg.m.e(Dg.l.f3702v0, K22, y10, new String[0]);
                            }
                            d10 = j6;
                        }
                        j6 = null;
                        if (j6 == null) {
                        }
                        d10 = j6;
                    } else {
                        j6 = C0213f.m(f6, y10, K22, z12);
                        AbstractC1000i k12 = j6.y0().k();
                        if (k12 != null) {
                            kVar = Ad.l.u0(k12);
                        } else {
                            kVar = null;
                        }
                        if (AbstractC3557B.K(kVar, Kf.g.f9801c) && (d0Var = (d0) kf.t.p2(Ad.l.B0(j6))) != null && (type = d0Var.getType()) != null) {
                            AbstractC1000i k13 = type.y0().k();
                            if (k13 != null) {
                                c4291c = AbstractC5493d.g(k13);
                            } else {
                                c4291c = null;
                            }
                            if (type.w0().size() == 1 && (AbstractC3557B.K(c4291c, Jf.q.f9200g) || AbstractC3557B.K(c4291c, L.f49986a))) {
                                Bg.A type2 = ((d0) kf.t.B2(type.w0())).getType();
                                AbstractC3557B.b0("getType(...)", type2);
                                AbstractC1003l abstractC1003l = (AbstractC1003l) i10.f11538c;
                                if (abstractC1003l instanceof AbstractC0993b) {
                                    abstractC0993b = (AbstractC0993b) abstractC1003l;
                                } else {
                                    abstractC0993b = null;
                                }
                                if (abstractC0993b != null) {
                                    c4291c2 = AbstractC5493d.c(abstractC0993b);
                                } else {
                                    c4291c2 = null;
                                }
                                j6 = AbstractC3557B.K(c4291c2, G.f49974a) ? a(j6, type2) : a(j6, type2);
                            }
                            if (j6 == null) {
                            }
                            d10 = j6;
                        }
                        j6 = null;
                        if (j6 == null) {
                        }
                        d10 = j6;
                    }
                } else {
                    d10 = C0213f.m(f6, y10, K22, q10.f30398j0);
                    if (AbstractC3427f.f32313b.c(q10.f30410v0).booleanValue()) {
                        int i16 = C0224q.f2152i0;
                        j6 = C3422a.j(d10, true);
                        if (j6 == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + d10 + '\'').toString());
                        }
                        d10 = j6;
                    }
                }
            }
            C3430i c3430i2 = (C3430i) i10.f11539d;
            AbstractC3557B.c0("typeTable", c3430i2);
            int i17 = q10.f30396h0;
            if ((i17 & 1024) == 1024) {
                q12 = q10.f30408t0;
            } else if ((i17 & 2048) == 2048) {
                q12 = c3430i2.a(q10.f30409u0);
            } else {
                q12 = q11;
            }
            if (q12 != null) {
                return R4.b.o2(d10, d(q12, false));
            }
            return d10;
        }
        y10 = abstractC1000i.f();
        AbstractC3557B.b0("getTypeConstructor(...)", y10);
        int i122 = 1;
        if (!Dg.m.f(y10.k())) {
        }
    }

    public final Bg.A g(Q q10) {
        Q q11;
        AbstractC3557B.c0("proto", q10);
        if ((q10.f30396h0 & 2) == 2) {
            M3.I i10 = this.f49979a;
            String b10 = i10.f11537b.b(q10.f30399k0);
            Bg.D d10 = d(q10, true);
            C3430i c3430i = (C3430i) i10.f11539d;
            AbstractC3557B.c0("typeTable", c3430i);
            int i11 = q10.f30396h0;
            if ((i11 & 4) == 4) {
                q11 = q10.f30400l0;
            } else if ((i11 & 8) == 8) {
                q11 = c3430i.a(q10.f30401m0);
            } else {
                q11 = null;
            }
            AbstractC3557B.Z(q11);
            return ((m) i10.f11536a).f50019j.a(q10, b10, d10, d(q11, true));
        }
        return d(q10, true);
    }

    public final String toString() {
        K k10;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49981c);
        if (this.f49980b == null) {
            str = "";
        } else {
            str = ". Child of " + k10.f49981c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
