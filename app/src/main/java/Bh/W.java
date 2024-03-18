package Bh;

import A.AbstractC0044t0;
import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import Qh.AbstractC1243v;
import Qh.C1223a;
import Qh.C1224b;
import Qh.C1231i;
import Qh.C1237o;
import Qh.C1238p;
import Qh.C1242u;
import Qh.C1244w;
import Qh.C1246y;
import Qh.C1247z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import sh.AbstractC5634f;
import wh.AbstractC6250o;
import wh.C6244i;
import wh.C6253r;

/* loaded from: classes2.dex */
public final class W {

    /* renamed from: a  reason: collision with root package name */
    public final List f2297a;

    public W() {
        this.f2297a = Collections.emptyList();
    }

    public final W a(C1242u c1242u, Z z10) {
        return new W(A7.b.m1(this.f2297a, new T(c1242u, z10, Fh.A.f5373Y, zh.I.f52111Y)));
    }

    public final V b(AbstractC0265q abstractC0265q, H h10, int i10, zh.Q q10, AbstractC1243v abstractC1243v) {
        AbstractC6250o abstractC6250o;
        HashSet hashSet;
        AbstractC0265q e10;
        HashSet hashSet2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet(abstractC0265q.i());
        List<T> list = this.f2297a;
        AbstractC0265q abstractC0265q2 = abstractC0265q;
        for (T t10 : list) {
            if (!hashSet3.add(t10.f2277b) || abstractC0265q2 == (e10 = t10.f2277b.e(abstractC0265q2))) {
                hashSet = hashSet3;
            } else {
                for (AbstractC6250o abstractC6250o2 : e10.i()) {
                    if (!hashSet4.contains(abstractC6250o2)) {
                        hashSet2 = hashSet3;
                        linkedHashMap.put(abstractC6250o2, new U(t10.f2277b, Fh.u.c(abstractC6250o2), abstractC6250o2, Collections.emptySet(), ((AbstractC5634f) abstractC6250o2).g1(), false));
                        hashSet4.add(abstractC6250o2);
                    } else {
                        hashSet2 = hashSet3;
                    }
                    hashSet3 = hashSet2;
                }
                hashSet = hashSet3;
                abstractC0265q2 = e10;
            }
            hashSet3 = hashSet;
        }
        K c10 = h10.c(abstractC0265q2);
        AbstractC1230h abstractC1230h = null;
        for (Object obj : linkedHashMap.keySet()) {
            if (abstractC1230h == null) {
                abstractC1230h = AbstractC1235m.a(obj);
            } else {
                abstractC1230h = abstractC1230h.c(AbstractC1235m.a(obj));
            }
        }
        boolean z10 = false;
        if (abstractC1230h == null) {
            abstractC1230h = C1223a.d(false);
        }
        C1231i b10 = new C1238p(new Qh.K(abstractC1230h).b(new C1247z(new C1237o(new Qh.b0(abstractC0265q2)))).b(new C1246y(new Qh.K(new C1224b(new C1244w(new C1237o(new Qh.K(new Qh.b0(abstractC0265q2))))))))).b(abstractC1243v.a(abstractC0265q2));
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = c10.b().iterator();
        while (it.hasNext()) {
            M m10 = (M) it.next();
            AbstractC6250o e11 = m10.e();
            AbstractC5634f abstractC5634f = (AbstractC5634f) abstractC0265q2;
            boolean z11 = (!abstractC5634f.h1(1) || abstractC5634f.h1(512)) ? z10 : true;
            if (b10.a(e11)) {
                for (T t11 : list) {
                    if (t11.f2276a.a(abstractC0265q2).a(e11)) {
                        Set d10 = m10.d();
                        xh.e visibility = m10.getVisibility();
                        ((zh.I) t11.f2279d).getClass();
                        abstractC6250o = e11;
                        linkedHashMap.put(abstractC6250o, new U(t11.f2277b, t11.f2278c, e11, d10, visibility, false));
                        break;
                    }
                }
            }
            abstractC6250o = e11;
            if (z11 && !AbstractC0044t0.p(m10.c())) {
                AbstractC5634f abstractC5634f2 = (AbstractC5634f) abstractC6250o;
                if (abstractC5634f2.h1(1) && !abstractC5634f2.h1(1024) && !abstractC5634f2.h1(16) && abstractC6250o.mo118a().e1()) {
                    if (q10.a(abstractC6250o)) {
                        linkedHashMap.put(abstractC6250o, new U(EnumC0236b0.f2316Y, Fh.u.c(abstractC6250o), abstractC6250o, Collections.emptySet(), m10.getVisibility(), true));
                    }
                    arrayList.add(abstractC6250o);
                    z10 = false;
                }
            }
            arrayList.add(abstractC6250o);
            z10 = false;
        }
        for (AbstractC6250o abstractC6250o3 : A7.b.m1(((AbstractC1239q) abstractC0265q2.i()).f(new Qh.K(Qh.F.VIRTUAL.f14964Z).b(b10)), new C6244i(abstractC0265q2))) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    T t12 = (T) it2.next();
                    if (t12.f2276a.a(abstractC0265q2).a(abstractC6250o3)) {
                        xh.e g1 = ((AbstractC5634f) abstractC6250o3).g1();
                        Set emptySet = Collections.emptySet();
                        ((zh.I) t12.f2279d).getClass();
                        linkedHashMap.put(abstractC6250o3, new U(t12.f2277b, t12.f2278c, abstractC6250o3, emptySet, g1, false));
                        break;
                    }
                }
            }
            arrayList.add(abstractC6250o3);
        }
        Eh.A e02 = abstractC0265q2.e0();
        AbstractC0252j0 t02 = abstractC0265q2.t0();
        if (AbstractC0044t0.j(i10)) {
            abstractC0265q2 = abstractC0265q2.X0();
        }
        return new V(linkedHashMap, e02, t02, abstractC0265q2, c10, new C6253r(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        if (this.f2297a.equals(((W) obj).f2297a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2297a.hashCode() + (W.class.hashCode() * 31);
    }

    public W(List list) {
        this.f2297a = list;
    }
}
