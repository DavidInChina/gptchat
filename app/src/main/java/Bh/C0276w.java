package Bh;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sh.AbstractC5634f;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import wh.AbstractC6250o;
import yh.l1;

/* renamed from: Bh.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0276w implements A {

    /* renamed from: a  reason: collision with root package name */
    public final C0272u f2394a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f2395b;

    /* renamed from: c  reason: collision with root package name */
    public final xh.e f2396c;

    public C0276w(C0272u c0272u, LinkedHashSet linkedHashSet, xh.e eVar) {
        this.f2394a = c0272u;
        this.f2395b = linkedHashSet;
        this.f2396c = eVar;
    }

    @Override // Bh.A
    public final A a(AbstractC6250o abstractC6250o, AbstractC0270t abstractC0270t) {
        AbstractC6250o abstractC6250o2;
        C0272u d10 = this.f2394a.d((AbstractC6242g) abstractC6250o.y(), abstractC0270t);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        l1 l02 = abstractC6250o.mo118a().l0();
        boolean H02 = abstractC6250o.H0();
        Iterator it = this.f2395b.iterator();
        xh.e eVar = this.f2396c;
        while (it.hasNext()) {
            AbstractC6250o abstractC6250o3 = (AbstractC6250o) it.next();
            if (abstractC6250o3.mo118a().l0().equals(l02)) {
                if (abstractC6250o3.H0() ^ H02) {
                    if (H02) {
                        abstractC6250o2 = abstractC6250o3;
                    } else {
                        abstractC6250o2 = abstractC6250o;
                    }
                    linkedHashSet.add(abstractC6250o2);
                } else {
                    linkedHashSet.add(abstractC6250o);
                    linkedHashSet.add(abstractC6250o3);
                }
            }
            eVar = eVar.c(((AbstractC5634f) abstractC6250o3).g1());
        }
        if (linkedHashSet.isEmpty()) {
            return new C0282z(d10, abstractC6250o, eVar, H02);
        }
        if (linkedHashSet.size() == 1) {
            return new C0282z(d10, (AbstractC6250o) linkedHashSet.iterator().next(), eVar, false);
        }
        return new C0276w(d10, linkedHashSet, eVar);
    }

    @Override // Bh.A
    public final A b(A a5) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = this.f2395b;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            AbstractC6250o abstractC6250o = (AbstractC6250o) it.next();
            l1 l02 = abstractC6250o.mo118a().l0();
            Iterator it2 = a5.d().iterator();
            while (true) {
                if (it2.hasNext()) {
                    l1 l03 = ((AbstractC6250o) it2.next()).mo118a().l0();
                    if (l03.equals(l02) || !l03.K0(l02)) {
                    }
                } else {
                    linkedHashSet.add(abstractC6250o);
                    break;
                }
            }
        }
        for (AbstractC6250o abstractC6250o2 : a5.d()) {
            l1 l04 = abstractC6250o2.mo118a().l0();
            Iterator it3 = linkedHashSet2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((AbstractC6250o) it3.next()).mo118a().l0().K0(l04)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(abstractC6250o2);
                    break;
                }
            }
        }
        int size = linkedHashSet.size();
        xh.e eVar = this.f2396c;
        C0272u c0272u = this.f2394a;
        if (size == 1) {
            return new C0282z(c0272u.b(a5.getKey()), (AbstractC6250o) linkedHashSet.iterator().next(), eVar.c(a5.getVisibility()), false);
        }
        return new C0276w(c0272u.b(a5.getKey()), linkedHashSet, eVar.c(a5.getVisibility()));
    }

    @Override // Bh.A
    public final M c(F f6) {
        Iterator it = this.f2395b.iterator();
        AbstractC6250o abstractC6250o = (AbstractC6250o) it.next();
        while (it.hasNext()) {
            AbstractC6250o abstractC6250o2 = (AbstractC6250o) it.next();
            if (!((E) f6).f2199Y) {
                abstractC6250o = abstractC6250o2;
            }
        }
        AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o;
        return new C0274v(this.f2394a.c(abstractC6236a.k1()), abstractC6236a, this.f2396c);
    }

    @Override // Bh.A
    public final Set d() {
        return this.f2395b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0276w.class != obj.getClass()) {
            return false;
        }
        C0276w c0276w = (C0276w) obj;
        if (this.f2396c.equals(c0276w.f2396c) && this.f2394a.equals(c0276w.f2394a) && this.f2395b.equals(c0276w.f2395b)) {
            return true;
        }
        return false;
    }

    @Override // Bh.A
    public final C0272u getKey() {
        return this.f2394a;
    }

    @Override // Bh.A
    public final xh.e getVisibility() {
        return this.f2396c;
    }

    public final int hashCode() {
        int hashCode = this.f2394a.hashCode();
        int hashCode2 = this.f2395b.hashCode();
        return this.f2396c.hashCode() + ((hashCode2 + ((hashCode + (C0276w.class.hashCode() * 31)) * 31)) * 31);
    }
}
