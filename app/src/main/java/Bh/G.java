package Bh;

import Qh.AbstractC1234l;
import Qh.AbstractC1239q;
import Qh.C1223a;
import Qh.C1231i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import wh.C6249n;
import yh.AbstractC6632q;
import yh.k1;
import yh.l1;

/* loaded from: classes2.dex */
public final class G extends K4.J {

    /* renamed from: n0  reason: collision with root package name */
    public final AbstractC0270t f2205n0;

    /* renamed from: o0  reason: collision with root package name */
    public final F f2206o0;

    /* renamed from: p0  reason: collision with root package name */
    public final k1 f2207p0;

    /* renamed from: q0  reason: collision with root package name */
    public final AbstractC1234l f2208q0;

    public G() {
        EnumC0268s enumC0268s = EnumC0268s.f2378Y;
        E e10 = E.LEFT;
        yh.U0 u02 = yh.W0.f50974Y;
        C1223a d10 = C1223a.d(true);
        this.f2205n0 = enumC0268s;
        this.f2206o0 = e10;
        this.f2207p0 = u02;
        this.f2208q0 = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        G g10 = (G) obj;
        if (this.f2205n0.equals(g10.f2205n0) && this.f2206o0.equals(g10.f2206o0) && this.f2207p0.equals(g10.f2207p0) && this.f2208q0.equals(g10.f2208q0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2205n0.hashCode();
        int hashCode2 = this.f2206o0.hashCode();
        int hashCode3 = this.f2207p0.hashCode();
        return this.f2208q0.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (G.class.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final C l0(AbstractC6632q abstractC6632q, HashMap hashMap, C1231i c1231i) {
        C c10;
        LinkedHashMap linkedHashMap;
        A c0276w;
        HashMap hashMap2 = hashMap;
        l1.a L10 = abstractC6632q.L();
        k1 k1Var = this.f2207p0;
        if (L10 == null) {
            c10 = new C();
        } else {
            AbstractC6632q abstractC6632q2 = (AbstractC6632q) L10.k(k1Var);
            C c11 = (C) hashMap2.get(L10);
            if (c11 == null) {
                C l02 = l0(abstractC6632q2, hashMap2, c1231i);
                hashMap2.put(L10, l02);
                c10 = l02;
            } else {
                c10 = c11;
            }
        }
        C c12 = new C();
        Iterator it = abstractC6632q.o0().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = c12.f2189a;
            if (!hasNext) {
                break;
            }
            l1.a aVar = (l1.a) it.next();
            AbstractC6632q abstractC6632q3 = (AbstractC6632q) aVar.k(k1Var);
            C c13 = (C) hashMap2.get(aVar);
            if (c13 == null) {
                c13 = l0(abstractC6632q3, hashMap2, c1231i);
                hashMap2.put(aVar, c13);
            }
            if (linkedHashMap.isEmpty()) {
                c12 = c13;
            } else {
                LinkedHashMap linkedHashMap2 = c13.f2189a;
                if (!linkedHashMap2.isEmpty()) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap);
                    for (A a5 : linkedHashMap2.values()) {
                        A a10 = (A) linkedHashMap3.remove(a5.getKey());
                        if (a10 != null) {
                            Set<AbstractC6250o> d10 = a10.d();
                            Set d11 = a5.d();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.addAll(d10);
                            linkedHashSet.addAll(d11);
                            for (AbstractC6250o abstractC6250o : d10) {
                                l1 l03 = abstractC6250o.mo118a().l0();
                                Iterator it2 = d11.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        AbstractC6250o abstractC6250o2 = (AbstractC6250o) it2.next();
                                        l1 l04 = abstractC6250o2.mo118a().l0();
                                        if (!l03.equals(l04)) {
                                            if (l03.K0(l04)) {
                                                linkedHashSet.remove(abstractC6250o2);
                                                break;
                                            } else if (l03.f0(l04)) {
                                                linkedHashSet.remove(abstractC6250o);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            C0272u b10 = a10.getKey().b(a5.getKey());
                            xh.e c14 = a10.getVisibility().c(a5.getVisibility());
                            if (linkedHashSet.size() == 1) {
                                c0276w = new C0282z(b10, (AbstractC6250o) linkedHashSet.iterator().next(), c14, false);
                            } else {
                                c0276w = new C0276w(b10, linkedHashSet, c14);
                            }
                            a5 = c0276w;
                        }
                        linkedHashMap3.put(a5.getKey(), a5);
                    }
                    c12 = new C(linkedHashMap3);
                }
            }
            hashMap2 = hashMap;
        }
        LinkedHashMap linkedHashMap4 = c10.f2189a;
        if (linkedHashMap4.isEmpty()) {
            c10 = c12;
        } else if (!linkedHashMap.isEmpty()) {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(linkedHashMap4);
            for (A a11 : linkedHashMap.values()) {
                A a12 = (A) linkedHashMap5.remove(a11.getKey());
                if (a12 != null) {
                    a11 = a12.b(a11);
                }
                linkedHashMap5.put(a11.getKey(), a11);
            }
            c10 = new C(linkedHashMap5);
        }
        Qh.r<AbstractC6250o> f6 = ((AbstractC1239q) abstractC6632q.i()).f(c1231i);
        if (!f6.isEmpty()) {
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(c10.f2189a);
            for (AbstractC6250o abstractC6250o3 : f6) {
                AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o3;
                C6249n k12 = abstractC6236a.k1();
                String D02 = abstractC6236a.D0();
                int size = abstractC6236a.getParameters().size();
                AbstractC0270t abstractC0270t = this.f2205n0;
                ((EnumC0268s) abstractC0270t).getClass();
                C0272u c0272u = new C0272u(size, 1, Collections.singletonMap(new r(k12), Collections.emptySet()), D02);
                A a13 = (A) linkedHashMap6.remove(c0272u);
                if (a13 == null) {
                    a13 = new C0278x(c0272u);
                }
                A a14 = a13.a(abstractC6250o3, abstractC0270t);
                linkedHashMap6.put(a14.getKey(), a14);
            }
            return new C(linkedHashMap6);
        }
        return c10;
    }
}
