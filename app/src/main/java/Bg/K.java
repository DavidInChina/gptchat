package Bg;

import Mf.AbstractC1000i;
import Pf.AbstractC1149g;
import Pf.AbstractC1158p;
import Pf.C1148f;
import hg.C3422a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC4344b;
import q1.AbstractC5260f;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class K {

    /* renamed from: a  reason: collision with root package name */
    public final M f2076a = C0213f.f2119b;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2077b = false;

    public final void a(Nf.i iVar, Nf.i iVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = iVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((Nf.c) it.next()).a());
        }
        Iterator it2 = iVar2.iterator();
        while (it2.hasNext()) {
            if (hashSet.contains(((Nf.c) it2.next()).a())) {
                ((C0213f) this.f2076a).getClass();
            }
        }
    }

    public final D b(L l10, Q q10, boolean z10, int i10, boolean z11) {
        Q q11;
        C0219l c0219l;
        C0219l c0219l2;
        p0 p0Var = p0.f2146h0;
        Mf.a0 a0Var = l10.f2079b;
        d0 c10 = c(new I(((zg.t) a0Var).y0(), p0Var), l10, null, i10);
        A type = c10.getType();
        AbstractC3557B.b0("getType(...)", type);
        D i11 = K4.J.i(type);
        if (Bi.c.g1(i11)) {
            return i11;
        }
        c10.b();
        a(i11.getAnnotations(), AbstractC0220m.a(q10));
        if (!Bi.c.g1(i11)) {
            if (Bi.c.g1(i11)) {
                q11 = i11.x0();
            } else {
                Q x02 = i11.x0();
                AbstractC3557B.c0("other", x02);
                if (q10.isEmpty() && x02.isEmpty()) {
                    q11 = q10;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection<Number> values = Q.f2084Z.f2082a.values();
                    AbstractC3557B.b0("<get-values>(...)", values);
                    for (Number number : values) {
                        int intValue = number.intValue();
                        N n10 = (N) q10.f7771Y.get(intValue);
                        N n11 = (N) x02.f7771Y.get(intValue);
                        if (n10 == null) {
                            if (n11 != null) {
                                c0219l = (C0219l) n11;
                                C0219l c0219l3 = (C0219l) n10;
                                if (c0219l3 != null) {
                                    c0219l2 = new C0219l(AbstractC5260f.j(c0219l.f2134a, c0219l3.f2134a));
                                    c0219l = c0219l2;
                                }
                            } else {
                                c0219l = null;
                            }
                            Ig.i.b(c0219l, arrayList);
                        } else {
                            C0219l c0219l4 = (C0219l) n10;
                            C0219l c0219l5 = (C0219l) n11;
                            if (c0219l5 == null) {
                                c0219l = c0219l4;
                                Ig.i.b(c0219l, arrayList);
                            } else {
                                c0219l2 = new C0219l(AbstractC5260f.j(c0219l4.f2134a, c0219l5.f2134a));
                                c0219l = c0219l2;
                                Ig.i.b(c0219l, arrayList);
                            }
                        }
                    }
                    q11 = P.a(arrayList);
                }
            }
            i11 = K4.J.U(i11, null, q11, 1);
        }
        D j6 = m0.j(i11, z10);
        AbstractC3557B.b0("let(...)", j6);
        if (z11) {
            C1148f c1148f = ((AbstractC1149g) a0Var).f14094m0;
            AbstractC3557B.b0("getTypeConstructor(...)", c1148f);
            return R4.b.o2(j6, C0213f.n(q10, c1148f, l10.f2080c, z10, ug.m.f46797b));
        }
        return j6;
    }

    public final d0 c(d0 d0Var, L l10, Mf.b0 b0Var, int i10) {
        d0 d0Var2;
        p0 p0Var;
        C0219l c0219l;
        C0219l c0219l2;
        p0 p0Var2;
        p0 p0Var3;
        d0 d0Var3;
        Mf.a0 a0Var = l10.f2079b;
        if (i10 <= 100) {
            if (d0Var.c()) {
                AbstractC3557B.Z(b0Var);
                return m0.k(b0Var);
            }
            A type = d0Var.getType();
            AbstractC3557B.b0("getType(...)", type);
            Y y02 = type.y0();
            AbstractC3557B.c0("constructor", y02);
            AbstractC1000i k10 = y02.k();
            if (k10 instanceof Mf.b0) {
                d0Var2 = (d0) l10.f2081d.get(k10);
            } else {
                d0Var2 = null;
            }
            M m10 = this.f2076a;
            if (d0Var2 == null) {
                D i11 = K4.J.i(d0Var.getType().B0());
                if (!Bi.c.g1(i11) && m0.d(i11, Fg.c.f5372Y, null)) {
                    Y y03 = i11.y0();
                    AbstractC1000i k11 = y03.k();
                    y03.getParameters().size();
                    i11.w0().size();
                    if (k11 instanceof Mf.b0) {
                        d0Var3 = d0Var;
                    } else {
                        int i12 = 0;
                        if (k11 instanceof Mf.a0) {
                            Mf.a0 a0Var2 = (Mf.a0) k11;
                            if (l10.a(a0Var2)) {
                                ((C0213f) m10).getClass();
                                p0 p0Var4 = p0.f2146h0;
                                Dg.l lVar = Dg.l.f3691k0;
                                String str = ((AbstractC1158p) a0Var2).getName().f37507Y;
                                AbstractC3557B.b0("toString(...)", str);
                                return new I(Dg.m.c(lVar, str), p0Var4);
                            }
                            List w02 = i11.w0();
                            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(w02, 10));
                            for (Object obj : w02) {
                                int i13 = i12 + 1;
                                if (i12 >= 0) {
                                    arrayList.add(c((d0) obj, l10, (Mf.b0) y03.getParameters().get(i12), i10 + 1));
                                    i12 = i13;
                                } else {
                                    AbstractC4344b.d1();
                                    throw null;
                                }
                            }
                            d0Var3 = new I(R4.b.o2(b(C3422a.e(l10, a0Var2, arrayList), i11.x0(), i11.z0(), i10 + 1, false), d(i11, l10, i10)), d0Var.b());
                        } else {
                            D d10 = d(i11, l10, i10);
                            j0.d(d10);
                            for (Object obj2 : d10.w0()) {
                                int i14 = i12 + 1;
                                if (i12 >= 0) {
                                    d0 d0Var4 = (d0) obj2;
                                    if (!d0Var4.c()) {
                                        A type2 = d0Var4.getType();
                                        AbstractC3557B.b0("getType(...)", type2);
                                        if (!m0.d(type2, Fg.a.f5370Y, null)) {
                                            d0 d0Var5 = (d0) i11.w0().get(i12);
                                            Mf.b0 b0Var2 = (Mf.b0) i11.y0().getParameters().get(i12);
                                            if (this.f2077b) {
                                                AbstractC3557B.b0("getType(...)", d0Var5.getType());
                                                AbstractC3557B.b0("getType(...)", d0Var4.getType());
                                                AbstractC3557B.Z(b0Var2);
                                                ((C0213f) m10).getClass();
                                            }
                                        }
                                    }
                                    i12 = i14;
                                } else {
                                    AbstractC4344b.d1();
                                    throw null;
                                }
                            }
                            d0Var3 = new I(d10, d0Var.b());
                        }
                    }
                    return d0Var3;
                }
                return d0Var;
            } else if (d0Var2.c()) {
                AbstractC3557B.Z(b0Var);
                return m0.k(b0Var);
            } else {
                o0 B02 = d0Var2.getType().B0();
                p0 b10 = d0Var2.b();
                p0 b11 = d0Var.b();
                if (b11 != b10 && b11 != (p0Var3 = p0.f2146h0)) {
                    if (b10 == p0Var3) {
                        b10 = b11;
                    } else {
                        ((C0213f) m10).getClass();
                        AbstractC3557B.c0("typeAlias", a0Var);
                    }
                }
                if (b0Var == null || (p0Var = b0Var.J()) == null) {
                    p0Var = p0.f2146h0;
                }
                if (p0Var != b10 && p0Var != (p0Var2 = p0.f2146h0)) {
                    if (b10 == p0Var2) {
                        b10 = p0Var2;
                    } else {
                        ((C0213f) m10).getClass();
                        AbstractC3557B.c0("typeAlias", a0Var);
                    }
                }
                a(type.getAnnotations(), B02.getAnnotations());
                D j6 = m0.j(K4.J.i(B02), type.z0());
                AbstractC3557B.b0("makeNullableIfNeeded(...)", j6);
                Q x02 = type.x0();
                if (!Bi.c.g1(j6)) {
                    if (Bi.c.g1(j6)) {
                        x02 = j6.x0();
                    } else {
                        Q x03 = j6.x0();
                        x02.getClass();
                        AbstractC3557B.c0("other", x03);
                        if (!x02.isEmpty() || !x03.isEmpty()) {
                            ArrayList arrayList2 = new ArrayList();
                            Collection<Number> values = Q.f2084Z.f2082a.values();
                            AbstractC3557B.b0("<get-values>(...)", values);
                            for (Number number : values) {
                                int intValue = number.intValue();
                                N n10 = (N) x02.f7771Y.get(intValue);
                                N n11 = (N) x03.f7771Y.get(intValue);
                                if (n10 == null) {
                                    if (n11 != null) {
                                        c0219l = (C0219l) n11;
                                        C0219l c0219l3 = (C0219l) n10;
                                        if (c0219l3 != null) {
                                            c0219l2 = new C0219l(AbstractC5260f.j(c0219l.f2134a, c0219l3.f2134a));
                                            c0219l = c0219l2;
                                        }
                                    } else {
                                        c0219l = null;
                                    }
                                    Ig.i.b(c0219l, arrayList2);
                                } else {
                                    C0219l c0219l4 = (C0219l) n10;
                                    C0219l c0219l5 = (C0219l) n11;
                                    if (c0219l5 == null) {
                                        c0219l = c0219l4;
                                        Ig.i.b(c0219l, arrayList2);
                                    } else {
                                        c0219l2 = new C0219l(AbstractC5260f.j(c0219l4.f2134a, c0219l5.f2134a));
                                        c0219l = c0219l2;
                                        Ig.i.b(c0219l, arrayList2);
                                    }
                                }
                            }
                            x02 = P.a(arrayList2);
                        }
                    }
                    j6 = K4.J.U(j6, null, x02, 1);
                }
                return new I(j6, b10);
            }
        }
        throw new AssertionError("Too deep recursion while expanding type alias " + ((AbstractC1158p) a0Var).getName());
    }

    public final D d(D d10, L l10, int i10) {
        Y y02 = d10.y0();
        List w02 = d10.w0();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(w02, 10));
        int i11 = 0;
        for (Object obj : w02) {
            int i12 = i11 + 1;
            if (i11 >= 0) {
                d0 d0Var = (d0) obj;
                d0 c10 = c(d0Var, l10, (Mf.b0) y02.getParameters().get(i11), i10 + 1);
                if (!c10.c()) {
                    c10 = new I(m0.i(c10.getType(), d0Var.getType().z0()), c10.b());
                }
                arrayList.add(c10);
                i11 = i12;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        return K4.J.U(d10, arrayList, null, 2);
    }
}
