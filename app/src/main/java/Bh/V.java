package Bh;

import Eh.EnumC0521u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import k6.AbstractC4194d;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import wh.AbstractC6256u;
import wh.C6253r;
import yh.l1;

/* loaded from: classes2.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f2289a;

    /* renamed from: b  reason: collision with root package name */
    public final Eh.A f2290b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0252j0 f2291c;

    /* renamed from: d  reason: collision with root package name */
    public final l1 f2292d;

    /* renamed from: e  reason: collision with root package name */
    public final K f2293e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC6256u f2294f;

    public V(LinkedHashMap linkedHashMap, Eh.A a5, AbstractC0252j0 abstractC0252j0, l1 l1Var, K k10, C6253r c6253r) {
        this.f2289a = linkedHashMap;
        this.f2290b = a5;
        this.f2291c = abstractC0252j0;
        this.f2292d = l1Var;
        this.f2293e = k10;
        this.f2294f = c6253r;
    }

    public final S a(Dh.j jVar, ph.f fVar) {
        EnumC0521u enumC0521u;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (fVar.d(ph.f.f43192n0)) {
            enumC0521u = EnumC0521u.f4807Y;
        } else {
            enumC0521u = EnumC0521u.f4808Z;
        }
        K k10 = this.f2293e;
        l1 l1Var = this.f2292d;
        Dh.n nVar = new Dh.n(l1Var, k10, enumC0521u, jVar.f3723Y);
        for (Map.Entry entry : this.f2289a.entrySet()) {
            X x10 = (X) hashMap.get(((U) entry.getValue()).f2280a);
            if (x10 == null) {
                x10 = ((U) entry.getValue()).f2280a.d(nVar);
                hashMap.put(((U) entry.getValue()).f2280a, x10);
            }
            X x11 = x10;
            Fh.B b10 = (Fh.B) hashMap2.get(((U) entry.getValue()).f2281b);
            if (b10 == null) {
                b10 = ((U) entry.getValue()).f2281b.a(l1Var);
                hashMap2.put(((U) entry.getValue()).f2281b, b10);
            }
            Fh.B b11 = b10;
            Object key = entry.getKey();
            AbstractC6250o abstractC6250o = ((U) entry.getValue()).f2282c;
            U u10 = (U) entry.getValue();
            u10.getClass();
            HashSet hashSet = new HashSet(u10.f2283d);
            hashSet.remove(((AbstractC6236a) u10.f2282c).k1());
            linkedHashMap.put(key, new Q(x11, b11, abstractC6250o, hashSet, ((U) entry.getValue()).f2284e, ((U) entry.getValue()).f2285f));
            hashMap = hashMap;
        }
        boolean d10 = fVar.d(ph.f.f43189k0);
        return new S(this.f2292d, this.f2290b, this.f2291c, this.f2294f, linkedHashMap, d10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        V v10 = (V) obj;
        if (this.f2289a.equals(v10.f2289a) && this.f2290b.equals(v10.f2290b) && this.f2291c.equals(v10.f2291c) && this.f2292d.equals(v10.f2292d) && this.f2293e.equals(v10.f2293e) && this.f2294f.equals(v10.f2294f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2289a.hashCode();
        int hashCode2 = this.f2290b.hashCode();
        int hashCode3 = this.f2291c.hashCode();
        int t10 = AbstractC4194d.t(this.f2292d, (hashCode3 + ((hashCode2 + ((hashCode + (V.class.hashCode() * 31)) * 31)) * 31)) * 31, 31);
        return this.f2294f.hashCode() + ((this.f2293e.hashCode() + t10) * 31);
    }
}
