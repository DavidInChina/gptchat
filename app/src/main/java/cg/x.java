package Cg;

import Bg.A;
import Bg.C0213f;
import Bg.C0219l;
import Bg.C0224q;
import Bg.C0232z;
import Bg.D;
import Bg.N;
import Bg.P;
import Bg.Q;
import Bg.Y;
import Bg.o0;
import hg.C3422a;
import id.AbstractC3557B;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pg.C5177n;
import pg.EnumC5175l;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f3155a = new Object();

    public static ArrayList a(AbstractCollection abstractCollection, w wVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        AbstractC3557B.b0("iterator(...)", it);
        while (it.hasNext()) {
            D d10 = (D) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    D d11 = (D) it2.next();
                    if (d11 != d10) {
                        AbstractC3557B.Z(d11);
                        AbstractC3557B.Z(d10);
                        if (((Boolean) wVar.invoke(d11, d10)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [Bg.Q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [Bg.Q, Hg.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v19, types: [Bg.D] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [Bg.D, Bg.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final D b(ArrayList arrayList) {
        D d10;
        D d11;
        C0219l c0219l;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D d12 = (D) it.next();
            if (d12.y0() instanceof C0232z) {
                Collection l10 = d12.y0().l();
                AbstractC3557B.b0("getSupertypes(...)", l10);
                Collection<A> collection = l10;
                ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(collection, 10));
                for (A a5 : collection) {
                    AbstractC3557B.Z(a5);
                    D m12 = Ad.l.m1(a5);
                    if (d12.z0()) {
                        m12 = m12.C0(true);
                    }
                    arrayList3.add(m12);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(d12);
            }
        }
        v vVar = v.f3149Y;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            vVar = vVar.a((o0) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            D d13 = (D) it3.next();
            if (vVar == v.f3152i0) {
                if (d13 instanceof k) {
                    k kVar = (k) d13;
                    AbstractC3557B.c0("<this>", kVar);
                    d13 = new k(kVar.f3129Z, kVar.f3130h0, kVar.f3131i0, kVar.f3132j0, kVar.f3133k0, true);
                }
                AbstractC3557B.c0("<this>", d13);
                int i10 = C0224q.f2152i0;
                D j6 = C3422a.j(d13, false);
                if (j6 != null || (j6 = R4.b.F1(d13)) != null) {
                    d13 = j6;
                } else {
                    d13 = d13.C0(false);
                }
            }
            linkedHashSet.add(d13);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((D) it4.next()).x0());
        }
        Iterator it5 = arrayList4.iterator();
        if (it5.hasNext()) {
            ?? next = it5.next();
            while (true) {
                d10 = null;
                if (!it5.hasNext()) {
                    break;
                }
                Q q10 = (Q) it5.next();
                next = (Q) next;
                next.getClass();
                AbstractC3557B.c0("other", q10);
                if (!next.isEmpty() || !q10.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    Collection<Number> values = Q.f2084Z.f2082a.values();
                    AbstractC3557B.b0("<get-values>(...)", values);
                    for (Number number : values) {
                        int intValue = number.intValue();
                        N n10 = (N) next.f7771Y.get(intValue);
                        N n11 = (N) q10.f7771Y.get(intValue);
                        if (n10 == null) {
                            if (n11 != null) {
                                c0219l = (C0219l) n11;
                                if (AbstractC3557B.K((C0219l) n10, c0219l)) {
                                    Ig.i.b(c0219l, arrayList5);
                                }
                            }
                            c0219l = null;
                            Ig.i.b(c0219l, arrayList5);
                        } else {
                            C0219l c0219l2 = (C0219l) n10;
                            if (AbstractC3557B.K((C0219l) n11, c0219l2)) {
                                c0219l = c0219l2;
                                Ig.i.b(c0219l, arrayList5);
                            }
                            c0219l = null;
                            Ig.i.b(c0219l, arrayList5);
                        }
                    }
                    next = P.a(arrayList5);
                }
            }
            Q q11 = (Q) next;
            if (linkedHashSet.size() == 1) {
                d11 = (D) kf.t.A2(linkedHashSet);
            } else {
                ArrayList a10 = a(linkedHashSet, new w(0, this));
                a10.isEmpty();
                EnumC5175l[] enumC5175lArr = EnumC5175l.f43149Y;
                if (!a10.isEmpty()) {
                    Iterator it6 = a10.iterator();
                    if (it6.hasNext()) {
                        ?? next2 = it6.next();
                        while (it6.hasNext()) {
                            D d14 = (D) it6.next();
                            next2 = (D) next2;
                            if (next2 != 0 && d14 != null) {
                                Y y02 = next2.y0();
                                Y y03 = d14.y0();
                                boolean z10 = y02 instanceof C5177n;
                                if (z10 && (y03 instanceof C5177n)) {
                                    C5177n c5177n = (C5177n) y02;
                                    Set set = c5177n.f43153c;
                                    Set set2 = ((C5177n) y03).f43153c;
                                    AbstractC3557B.c0("<this>", set);
                                    AbstractC3557B.c0("other", set2);
                                    Set O22 = kf.t.O2(set);
                                    kf.s.N1(set2, O22);
                                    C5177n c5177n2 = new C5177n(c5177n.f43151a, c5177n.f43152b, O22);
                                    Q.f2084Z.getClass();
                                    Q q12 = Q.f2085h0;
                                    AbstractC3557B.c0("attributes", q12);
                                    next2 = C0213f.n(q12, c5177n2, kf.v.f37483Y, false, Dg.m.a(Dg.i.f3661h0, true, "unknown integer literal type"));
                                } else if (z10) {
                                    if (!((C5177n) y02).f43153c.contains(d14)) {
                                        d14 = null;
                                    }
                                    next2 = d14;
                                } else if ((y03 instanceof C5177n) && ((C5177n) y03).f43153c.contains(next2)) {
                                }
                            }
                            next2 = 0;
                        }
                        d10 = next2;
                    } else {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                }
                if (d10 != null) {
                    d11 = d10;
                } else {
                    n.f3142b.getClass();
                    ArrayList a11 = a(a10, new w(1, m.f3141b));
                    a11.isEmpty();
                    if (a11.size() < 2) {
                        d11 = (D) kf.t.A2(a11);
                    } else {
                        d11 = new C0232z(linkedHashSet).b();
                    }
                }
            }
            return d11.E0(q11);
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
