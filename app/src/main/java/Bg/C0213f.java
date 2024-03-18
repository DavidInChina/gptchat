package Bg;

import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Pf.AbstractC1158p;
import hg.C3422a;
import id.AbstractC3557B;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l8.AbstractC4344b;
import rg.AbstractC5493d;
import yf.AbstractC6583a;

/* renamed from: Bg.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0213f implements M {

    /* renamed from: a  reason: collision with root package name */
    public static final C0213f f2118a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0213f f2119b = new Object();

    public static final boolean a(Eg.k kVar, Eg.g gVar) {
        if (!kVar.E(gVar)) {
            if (gVar instanceof Eg.c) {
                d0 m02 = kVar.m0(kVar.T((Eg.c) gVar));
                if (kVar.l(m02) || !kVar.E(kVar.N(kVar.y(m02)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean b(Eg.k kVar, X x10, Eg.g gVar, Eg.g gVar2, boolean z10) {
        Collection<Eg.f> J10 = kVar.J(gVar);
        if ((J10 instanceof Collection) && J10.isEmpty()) {
            return false;
        }
        for (Eg.f fVar : J10) {
            if (AbstractC3557B.K(kVar.e(fVar), kVar.A(gVar2)) || (z10 && j(f2118a, x10, gVar2, fVar))) {
                return true;
            }
        }
        return false;
    }

    public static List c(X x10, Eg.g gVar, Eg.i iVar) {
        AbstractC0210c abstractC0210c;
        Eg.k kVar = x10.f2093c;
        kVar.z(gVar, iVar);
        boolean l02 = kVar.l0(iVar);
        kf.v vVar = kf.v.f37483Y;
        if (!l02 && kVar.S(gVar)) {
            return vVar;
        }
        if (kVar.a0(iVar)) {
            if (kVar.t(kVar.A(gVar), iVar)) {
                Eg.b bVar = Eg.b.f4732Y;
                D e02 = kVar.e0(gVar);
                if (e02 != null) {
                    gVar = e02;
                }
                return AbstractC4344b.F0(gVar);
            }
            return vVar;
        }
        Ig.f fVar = new Ig.f();
        x10.c();
        ArrayDeque arrayDeque = x10.f2097g;
        AbstractC3557B.Z(arrayDeque);
        Ig.g gVar2 = x10.f2098h;
        AbstractC3557B.Z(gVar2);
        arrayDeque.push(gVar);
        while (!arrayDeque.isEmpty()) {
            if (gVar2.f8604Z <= 1000) {
                Eg.g gVar3 = (Eg.g) arrayDeque.pop();
                AbstractC3557B.Z(gVar3);
                if (gVar2.add(gVar3)) {
                    Eg.b bVar2 = Eg.b.f4732Y;
                    D e03 = kVar.e0(gVar3);
                    if (e03 == null) {
                        e03 = gVar3;
                    }
                    boolean t10 = kVar.t(kVar.A(e03), iVar);
                    V v10 = V.f2089a;
                    Eg.k kVar2 = x10.f2093c;
                    if (t10) {
                        fVar.add(e03);
                        abstractC0210c = v10;
                    } else if (kVar.b0(e03) == 0) {
                        abstractC0210c = U.f2088a;
                    } else {
                        abstractC0210c = kVar2.b(e03);
                    }
                    if (!(!AbstractC3557B.K(abstractC0210c, v10))) {
                        abstractC0210c = null;
                    }
                    if (abstractC0210c != null) {
                        for (Eg.f fVar2 : kVar2.F(kVar2.A(gVar3))) {
                            arrayDeque.add(abstractC0210c.e(x10, fVar2));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + gVar + ". Supertypes = " + kf.t.m2(gVar2, null, null, null, null, 63)).toString());
            }
        }
        x10.a();
        return fVar;
    }

    public static List d(X x10, Eg.g gVar, Eg.i iVar) {
        List c10 = c(x10, gVar, iVar);
        if (c10.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : c10) {
                Eg.k kVar = x10.f2093c;
                Eg.h g02 = kVar.g0((Eg.g) obj);
                int o10 = kVar.o(g02);
                int i10 = 0;
                while (true) {
                    if (i10 < o10) {
                        if (kVar.V(kVar.y(kVar.P(g02, i10))) == null) {
                            i10++;
                        }
                    } else {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return c10;
        }
        return c10;
    }

    public static boolean e(X x10, Eg.f fVar, Eg.f fVar2) {
        AbstractC3557B.c0("state", x10);
        AbstractC3557B.c0("a", fVar);
        AbstractC3557B.c0("b", fVar2);
        if (fVar == fVar2) {
            return true;
        }
        C0213f c0213f = f2118a;
        Eg.k kVar = x10.f2093c;
        if (h(kVar, fVar) && h(kVar, fVar2)) {
            o0 d10 = x10.d(x10.e(fVar));
            o0 d11 = x10.d(x10.e(fVar2));
            D d12 = kVar.d(d10);
            if (!kVar.t(kVar.e(d10), kVar.e(d11))) {
                return false;
            }
            if (kVar.b0(d12) == 0) {
                if (kVar.f(d10) || kVar.f(d11) || kVar.W(d12) == kVar.W(kVar.d(d11))) {
                    return true;
                }
                return false;
            }
        }
        if (j(c0213f, x10, fVar, fVar2) && j(c0213f, x10, fVar2, fVar)) {
            return true;
        }
        return false;
    }

    public static final o0 f(D d10, D d11) {
        AbstractC3557B.c0("lowerBound", d10);
        AbstractC3557B.c0("upperBound", d11);
        if (AbstractC3557B.K(d10, d11)) {
            return d10;
        }
        return new C0228v(d10, d11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        return r7.K(r7.e(r8), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Eg.j g(Eg.k kVar, Eg.f fVar, Eg.g gVar) {
        o0 y10;
        int b02 = kVar.b0(fVar);
        int i10 = 0;
        while (true) {
            d0 d0Var = null;
            if (i10 >= b02) {
                return null;
            }
            d0 C10 = kVar.C(fVar, i10);
            boolean z10 = true;
            if (!kVar.l(C10)) {
                d0Var = C10;
            }
            if (d0Var != null && (y10 = kVar.y(d0Var)) != null) {
                if (!kVar.U(kVar.c0(kVar.d(y10))) || !kVar.U(kVar.c0(kVar.d(gVar)))) {
                    z10 = false;
                }
                if (AbstractC3557B.K(y10, gVar) || (z10 && AbstractC3557B.K(kVar.e(y10), kVar.e(gVar)))) {
                    break;
                }
                Eg.j g10 = g(kVar, y10, gVar);
                if (g10 != null) {
                    return g10;
                }
            }
            i10++;
        }
    }

    public static boolean h(Eg.k kVar, Eg.f fVar) {
        if (kVar.j(kVar.e(fVar))) {
            kVar.w(fVar);
            if (!kVar.L(fVar) && !kVar.q(fVar) && AbstractC3557B.K(kVar.A(kVar.d(fVar)), kVar.A(kVar.N(fVar)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(X x10, Eg.h hVar, Eg.g gVar) {
        boolean z10;
        AbstractC3557B.c0("<this>", x10);
        AbstractC3557B.c0("capturedSubArguments", hVar);
        AbstractC3557B.c0("superType", gVar);
        Eg.k kVar = x10.f2093c;
        Y A10 = kVar.A(gVar);
        int o10 = kVar.o(hVar);
        int h10 = kVar.h(A10);
        if (o10 != h10 || o10 != kVar.b0(gVar)) {
            return false;
        }
        for (int i10 = 0; i10 < h10; i10++) {
            d0 C10 = kVar.C(gVar, i10);
            if (!kVar.l(C10)) {
                o0 y10 = kVar.y(C10);
                d0 P = kVar.P(hVar, i10);
                kVar.r(P);
                Eg.l lVar = Eg.l.f4736i0;
                o0 y11 = kVar.y(P);
                Eg.l h02 = kVar.h0(kVar.K(A10, i10));
                Eg.l r10 = kVar.r(C10);
                if (h02 == lVar) {
                    h02 = r10;
                } else if (r10 != lVar && h02 != r10) {
                    h02 = null;
                }
                if (h02 == null) {
                    return x10.f2091a;
                }
                C0213f c0213f = f2118a;
                if (h02 == lVar) {
                    k(kVar, y11, y10);
                    k(kVar, y10, y11);
                }
                int i11 = x10.f2096f;
                if (i11 <= 100) {
                    x10.f2096f = i11 + 1;
                    int ordinal = h02.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                z10 = e(x10, y11, y10);
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            z10 = j(c0213f, x10, y11, y10);
                        }
                    } else {
                        z10 = j(c0213f, x10, y10, y11);
                    }
                    x10.f2096f--;
                    if (!z10) {
                        return false;
                    }
                } else {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + y11).toString());
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02d3, code lost:
        if (b(r5, r25, r10, r6, true) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02d5, code lost:
        r6 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02df  */
    /* JADX WARN: Type inference failed for: r0v4, types: [Bg.S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, Eg.h, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(C0213f c0213f, X x10, Eg.f fVar, Eg.f fVar2) {
        Boolean bool;
        boolean z10;
        Boolean bool2;
        List<Eg.g> list;
        AbstractC0210c abstractC0210c;
        o0 y10;
        AbstractC0210c abstractC0210c2;
        AbstractC0210c abstractC0210c3;
        D d10;
        Eg.f fVar3;
        boolean z11;
        c0213f.getClass();
        AbstractC3557B.c0("state", x10);
        AbstractC3557B.c0("subType", fVar);
        AbstractC3557B.c0("superType", fVar2);
        boolean z12 = true;
        if (fVar == fVar2) {
            return true;
        }
        x10.b(fVar, fVar2);
        o0 d11 = x10.d(x10.e(fVar));
        o0 d12 = x10.d(x10.e(fVar2));
        Eg.k kVar = x10.f2093c;
        D d13 = kVar.d(d11);
        D N10 = kVar.N(d12);
        boolean X10 = kVar.X(d13);
        C0213f c0213f2 = f2118a;
        if (!X10 && !kVar.X(N10)) {
            kVar.c(d13);
            kVar.k(d13);
            kVar.k(N10);
            C0224q a5 = kVar.a(N10);
            if (a5 == null || (d10 = kVar.Q(a5)) == null) {
                d10 = N10;
            }
            Eg.c O10 = kVar.O(d10);
            if (O10 != null) {
                fVar3 = kVar.i0(O10);
            } else {
                fVar3 = null;
            }
            if (O10 != null && fVar3 != null) {
                if (kVar.W(N10)) {
                    fVar3 = kVar.j0(fVar3);
                } else if (kVar.L(N10)) {
                    fVar3 = kVar.k0(fVar3);
                }
                T[] tArr = T.f2087Y;
                if (j(c0213f2, x10, d13, fVar3)) {
                    bool = Boolean.TRUE;
                }
            }
            Y A10 = kVar.A(N10);
            if (kVar.u(A10)) {
                kVar.W(N10);
                Collection<Eg.f> F10 = kVar.F(A10);
                if (!(F10 instanceof Collection) || !F10.isEmpty()) {
                    for (Eg.f fVar4 : F10) {
                        if (!j(c0213f2, x10, d13, fVar4)) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                bool = Boolean.valueOf(z11);
            } else {
                Y A11 = kVar.A(d13);
                if (!(d13 instanceof Eg.c)) {
                    if (kVar.u(A11)) {
                        Collection<Eg.f> F11 = kVar.F(A11);
                        if (!(F11 instanceof Collection) || !F11.isEmpty()) {
                            for (Eg.f fVar5 : F11) {
                                if (!(fVar5 instanceof Eg.c)) {
                                    break;
                                }
                            }
                        }
                    }
                    bool = null;
                }
                Eg.j g10 = g(kVar, N10, d13);
                if (g10 != null && kVar.g(g10, kVar.A(N10))) {
                    bool = Boolean.TRUE;
                }
                bool = null;
            }
        } else if (x10.f2091a) {
            bool = Boolean.TRUE;
        } else if (kVar.W(d13) && !kVar.W(N10)) {
            bool = Boolean.FALSE;
        } else {
            D I10 = kVar.I(d13, false);
            D I11 = kVar.I(N10, false);
            AbstractC3557B.c0("a", I10);
            AbstractC3557B.c0("b", I11);
            bool = Boolean.valueOf(AbstractC0210c.d(kVar, I10, I11));
        }
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            D d14 = kVar.d(d11);
            D N11 = kVar.N(d12);
            boolean W6 = kVar.W(N11);
            AbstractC0210c abstractC0210c4 = V.f2089a;
            AbstractC0210c abstractC0210c5 = U.f2088a;
            int i10 = 1000;
            if (!W6 && !kVar.L(d14) && !kVar.q(d14) && ((!(d14 instanceof Eg.c) || !kVar.v((Eg.c) d14)) && !AbstractC0210c.a(x10, d14, abstractC0210c5))) {
                if (!kVar.L(N11) && !AbstractC0210c.a(x10, N11, W.f2090a) && !kVar.S(d14)) {
                    Y A12 = kVar.A(N11);
                    AbstractC3557B.c0("end", A12);
                    if (!AbstractC0210c.b(x10, d14, A12)) {
                        x10.c();
                        ArrayDeque arrayDeque = x10.f2097g;
                        AbstractC3557B.Z(arrayDeque);
                        Ig.g gVar = x10.f2098h;
                        AbstractC3557B.Z(gVar);
                        arrayDeque.push(d14);
                        while (!arrayDeque.isEmpty()) {
                            if (gVar.f8604Z <= i10) {
                                Eg.g gVar2 = (Eg.g) arrayDeque.pop();
                                AbstractC3557B.Z(gVar2);
                                if (gVar.add(gVar2)) {
                                    if (kVar.W(gVar2)) {
                                        abstractC0210c3 = abstractC0210c4;
                                    } else {
                                        abstractC0210c3 = abstractC0210c5;
                                    }
                                    if (!(!AbstractC3557B.K(abstractC0210c3, abstractC0210c4))) {
                                        abstractC0210c3 = null;
                                    }
                                    if (abstractC0210c3 == null) {
                                        continue;
                                    } else {
                                        for (Eg.f fVar6 : kVar.F(kVar.A(gVar2))) {
                                            Eg.g e10 = abstractC0210c3.e(x10, fVar6);
                                            if (AbstractC0210c.b(x10, e10, A12)) {
                                                x10.a();
                                            } else {
                                                arrayDeque.add(e10);
                                                i10 = 1000;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(("Too many supertypes for type: " + d14 + ". Supertypes = " + kf.t.m2(gVar, null, null, null, null, 63)).toString());
                            }
                        }
                        x10.a();
                    }
                }
                return false;
            }
            D d15 = kVar.d(d14);
            D N12 = kVar.N(N11);
            if (kVar.E(d15) || kVar.E(N12)) {
                if (a(kVar, d15) && a(kVar, N12)) {
                    bool2 = Boolean.TRUE;
                } else if (kVar.E(d15)) {
                    if (b(kVar, x10, d15, N12, false)) {
                        bool2 = Boolean.TRUE;
                    }
                } else if (kVar.E(N12)) {
                    Y A13 = kVar.A(d15);
                    if (A13 instanceof C0232z) {
                        Collection<Eg.f> F12 = kVar.F(A13);
                        if (!(F12 instanceof Collection) || !F12.isEmpty()) {
                            for (Eg.f fVar7 : F12) {
                                D Z10 = kVar.Z(fVar7);
                                if (Z10 != null && kVar.E(Z10)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                if (bool2 == null) {
                    return bool2.booleanValue();
                }
                Y A14 = kVar.A(N11);
                if ((kVar.t(kVar.A(d14), A14) && kVar.h(A14) == 0) || kVar.f0(kVar.A(N11))) {
                    return true;
                }
                AbstractC3557B.c0("superConstructor", A14);
                if (kVar.S(d14)) {
                    list = d(x10, d14, A14);
                } else if (!kVar.l0(A14) && !kVar.m(A14)) {
                    list = c(x10, d14, A14);
                } else {
                    Ig.f fVar8 = new Ig.f();
                    x10.c();
                    ArrayDeque arrayDeque2 = x10.f2097g;
                    AbstractC3557B.Z(arrayDeque2);
                    Ig.g gVar3 = x10.f2098h;
                    AbstractC3557B.Z(gVar3);
                    arrayDeque2.push(d14);
                    while (!arrayDeque2.isEmpty()) {
                        if (gVar3.f8604Z <= 1000) {
                            Eg.g gVar4 = (Eg.g) arrayDeque2.pop();
                            AbstractC3557B.Z(gVar4);
                            if (gVar3.add(gVar4)) {
                                if (kVar.S(gVar4)) {
                                    fVar8.add(gVar4);
                                    abstractC0210c2 = abstractC0210c4;
                                } else {
                                    abstractC0210c2 = abstractC0210c5;
                                }
                                if (!(!AbstractC3557B.K(abstractC0210c2, abstractC0210c4))) {
                                    abstractC0210c2 = null;
                                }
                                if (abstractC0210c2 != null) {
                                    for (Eg.f fVar9 : kVar.F(kVar.A(gVar4))) {
                                        arrayDeque2.add(abstractC0210c2.e(x10, fVar9));
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException(("Too many supertypes for type: " + d14 + ". Supertypes = " + kf.t.m2(gVar3, null, null, null, null, 63)).toString());
                        }
                    }
                    x10.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fVar8.iterator();
                    while (it.hasNext()) {
                        Eg.g gVar5 = (Eg.g) it.next();
                        AbstractC3557B.Z(gVar5);
                        kf.s.N1(d(x10, gVar5, A14), arrayList);
                    }
                    list = arrayList;
                }
                int i11 = 10;
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
                for (Eg.g gVar6 : list) {
                    D Z11 = kVar.Z(x10.d(gVar6));
                    if (Z11 != null) {
                        gVar6 = Z11;
                    }
                    arrayList2.add(gVar6);
                }
                int size = arrayList2.size();
                if (size != 0) {
                    if (size != 1) {
                        ?? arrayList3 = new ArrayList(kVar.h(A14));
                        int h10 = kVar.h(A14);
                        int i12 = 0;
                        boolean z13 = false;
                        while (i12 < h10) {
                            if (!z13 && kVar.h0(kVar.K(A14, i12)) == Eg.l.f4735h0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (!z13) {
                                ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(arrayList2, i11));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    Eg.g gVar7 = (Eg.g) it2.next();
                                    d0 H6 = kVar.H(gVar7, i12);
                                    if (H6 != null) {
                                        if (kVar.r(H6) != Eg.l.f4736i0) {
                                            H6 = null;
                                        }
                                        if (H6 != null && (y10 = kVar.y(H6)) != null) {
                                            arrayList4.add(y10);
                                        }
                                    }
                                    throw new IllegalStateException(("Incorrect type: " + gVar7 + ", subType: " + d14 + ", superType: " + N11).toString());
                                }
                                arrayList3.add(kVar.R(kVar.M(arrayList4)));
                            }
                            i12++;
                            z12 = true;
                            i11 = 10;
                        }
                        if (z13 || !i(x10, arrayList3, N11)) {
                            C0212e c0212e = new C0212e(arrayList2, x10, kVar, N11);
                            ?? obj = new Object();
                            c0212e.invoke(obj);
                            return obj.f2086a;
                        }
                    } else {
                        return i(x10, kVar.g0((Eg.g) kf.t.f2(arrayList2)), N11);
                    }
                } else {
                    Y A15 = kVar.A(d14);
                    if (kVar.l0(A15)) {
                        z10 = kVar.n(A15);
                    } else if (!kVar.n(kVar.A(d14))) {
                        x10.c();
                        ArrayDeque arrayDeque3 = x10.f2097g;
                        AbstractC3557B.Z(arrayDeque3);
                        Ig.g gVar8 = x10.f2098h;
                        AbstractC3557B.Z(gVar8);
                        arrayDeque3.push(d14);
                        while (!arrayDeque3.isEmpty()) {
                            if (gVar8.f8604Z <= 1000) {
                                Eg.g gVar9 = (Eg.g) arrayDeque3.pop();
                                AbstractC3557B.Z(gVar9);
                                if (gVar8.add(gVar9)) {
                                    if (kVar.S(gVar9)) {
                                        abstractC0210c = abstractC0210c4;
                                    } else {
                                        abstractC0210c = abstractC0210c5;
                                    }
                                    if (!(!AbstractC3557B.K(abstractC0210c, abstractC0210c4))) {
                                        abstractC0210c = null;
                                    }
                                    if (abstractC0210c == null) {
                                        continue;
                                    } else {
                                        for (Eg.f fVar10 : kVar.F(kVar.A(gVar9))) {
                                            Eg.g e11 = abstractC0210c.e(x10, fVar10);
                                            if (kVar.n(kVar.A(e11))) {
                                                x10.a();
                                                return true;
                                            }
                                            arrayDeque3.add(e11);
                                        }
                                        continue;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(("Too many supertypes for type: " + d14 + ". Supertypes = " + kf.t.m2(gVar8, null, null, null, null, 63)).toString());
                            }
                        }
                        x10.a();
                        return false;
                    }
                }
                return true;
            }
            bool2 = null;
            if (bool2 == null) {
            }
        }
        return z10;
    }

    public static void k(Eg.k kVar, Eg.f fVar, Eg.f fVar2) {
        D Z10 = kVar.Z(fVar);
        if (Z10 instanceof Eg.c) {
            Eg.c cVar = (Eg.c) Z10;
            if (kVar.Y(cVar) || !kVar.l(kVar.m0(kVar.T(cVar))) || kVar.n0(cVar) != Eg.b.f4732Y) {
                return;
            }
            kVar.e(fVar2);
        }
    }

    public static final D l(Q q10, AbstractC0997f abstractC0997f, List list) {
        AbstractC3557B.c0("attributes", q10);
        AbstractC3557B.c0("descriptor", abstractC0997f);
        AbstractC3557B.c0("arguments", list);
        Y f6 = abstractC0997f.f();
        AbstractC3557B.b0("getTypeConstructor(...)", f6);
        return m(q10, f6, list, false);
    }

    public static D m(Q q10, Y y10, List list, boolean z10) {
        ug.n nVar;
        ug.n C10;
        AbstractC3557B.c0("attributes", q10);
        AbstractC3557B.c0("constructor", y10);
        AbstractC3557B.c0("arguments", list);
        if (q10.isEmpty() && list.isEmpty() && !z10 && y10.k() != null) {
            AbstractC1000i k10 = y10.k();
            AbstractC3557B.Z(k10);
            D n10 = k10.n();
            AbstractC3557B.b0("getDefaultType(...)", n10);
            return n10;
        }
        AbstractC1000i k11 = y10.k();
        if (k11 instanceof Mf.b0) {
            nVar = ((Mf.b0) k11).n().R();
        } else if (k11 instanceof AbstractC0997f) {
            AbstractC5493d.i(AbstractC5493d.j(k11));
            Cg.h hVar = Cg.h.f3127a;
            Pf.D d10 = null;
            if (list.isEmpty()) {
                AbstractC0997f abstractC0997f = (AbstractC0997f) k11;
                AbstractC3557B.c0("<this>", abstractC0997f);
                if (abstractC0997f instanceof Pf.D) {
                    d10 = (Pf.D) abstractC0997f;
                }
                if (d10 == null || (C10 = d10.k0(hVar)) == null) {
                    nVar = abstractC0997f.n0();
                    AbstractC3557B.b0("getUnsubstitutedMemberScope(...)", nVar);
                }
                nVar = C10;
            } else {
                AbstractC0997f abstractC0997f2 = (AbstractC0997f) k11;
                h0 b10 = a0.f2103b.b(y10, list);
                AbstractC3557B.c0("<this>", abstractC0997f2);
                if (abstractC0997f2 instanceof Pf.D) {
                    d10 = (Pf.D) abstractC0997f2;
                }
                if (d10 == null || (C10 = d10.C(b10, hVar)) == null) {
                    nVar = abstractC0997f2.E(b10);
                    AbstractC3557B.b0("getMemberScope(...)", nVar);
                }
                nVar = C10;
            }
        } else if (k11 instanceof Mf.a0) {
            Dg.i iVar = Dg.i.f3662i0;
            String str = ((AbstractC1158p) ((Mf.a0) k11)).getName().f37507Y;
            AbstractC3557B.b0("toString(...)", str);
            nVar = Dg.m.a(iVar, true, str);
        } else if (y10 instanceof C0232z) {
            nVar = C3422a.f("member scope for intersection type", ((C0232z) y10).f2167b);
        } else {
            throw new IllegalStateException("Unsupported classifier: " + k11 + " for constructor: " + y10);
        }
        return o(q10, y10, list, z10, nVar, new A.B(list, q10, y10, z10));
    }

    public static final D n(Q q10, Y y10, List list, boolean z10, ug.n nVar) {
        AbstractC3557B.c0("attributes", q10);
        AbstractC3557B.c0("constructor", y10);
        AbstractC3557B.c0("arguments", list);
        AbstractC3557B.c0("memberScope", nVar);
        E e10 = new E(y10, list, z10, nVar, new L.J(y10, z10, list, q10, nVar, 2));
        if (!q10.isEmpty()) {
            return new F(e10, q10);
        }
        return e10;
    }

    public static final D o(Q q10, Y y10, List list, boolean z10, ug.n nVar, wf.k kVar) {
        AbstractC3557B.c0("attributes", q10);
        AbstractC3557B.c0("constructor", y10);
        AbstractC3557B.c0("arguments", list);
        AbstractC3557B.c0("memberScope", nVar);
        E e10 = new E(y10, list, z10, nVar, kVar);
        if (!q10.isEmpty()) {
            return new F(e10, q10);
        }
        return e10;
    }
}
