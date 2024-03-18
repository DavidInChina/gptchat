package Bh;

import A.AbstractC0044t0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k6.AbstractC4194d;
import wh.AbstractC6236a;
import wh.AbstractC6250o;
import wh.AbstractC6256u;
import wh.C6249n;
import yh.H1;
import yh.l1;

/* loaded from: classes2.dex */
public final class S implements P {

    /* renamed from: a  reason: collision with root package name */
    public final l1 f2269a;

    /* renamed from: b  reason: collision with root package name */
    public final Eh.A f2270b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0252j0 f2271c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC6256u f2272d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f2273e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2274f;

    public S(l1 l1Var, Eh.A a5, AbstractC0252j0 abstractC0252j0, AbstractC6256u abstractC6256u, LinkedHashMap linkedHashMap, boolean z10) {
        this.f2269a = l1Var;
        this.f2270b = a5;
        this.f2271c = abstractC0252j0;
        this.f2272d = abstractC6256u;
        this.f2273e = linkedHashMap;
        this.f2274f = z10;
    }

    public final c1 a(AbstractC6250o abstractC6250o) {
        AbstractC6250o abstractC6250o2;
        Q q10 = (Q) this.f2273e.get(abstractC6250o);
        if (q10 == null) {
            return new b1(abstractC6250o);
        }
        boolean z10 = this.f2274f;
        boolean z11 = q10.f2245f;
        AbstractC6250o abstractC6250o3 = q10.f2242c;
        if (z11 && !z10) {
            return new b1(abstractC6250o3);
        }
        c1 a5 = q10.f2240a.a(abstractC6250o3, q10.f2241b, q10.f2244e);
        if (z10) {
            HashSet hashSet = new HashSet();
            Iterator it = q10.f2243d.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                abstractC6250o2 = q10.f2242c;
                if (!hasNext) {
                    break;
                }
                C6249n c6249n = (C6249n) it.next();
                AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o2;
                H1 Q = abstractC6236a.getParameters().I0().Q();
                List list = c6249n.f48564b;
                if (Q.size() == list.size()) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < Q.size()) {
                            if (((l1) Q.get(i10)).equals(list.get(i10)) || (!((l1) Q.get(i10)).a1() && !((l1) list.get(i10)).a1())) {
                                i10++;
                            }
                        } else {
                            l1 l02 = abstractC6236a.getReturnType().l0();
                            l1 l1Var = c6249n.f48563a;
                            if (l02.equals(l1Var) || (!l02.a1() && !l1Var.a1())) {
                                hashSet.add(c6249n);
                            }
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                l1 l1Var2 = this.f2269a;
                if (!l1Var2.E0() || AbstractC0044t0.k(a5.c())) {
                    a5 = new W0(a5, l1Var2, abstractC6250o2, hashSet, q10.f2241b);
                }
            }
        }
        return a5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s10 = (S) obj;
        if (this.f2274f == s10.f2274f && this.f2269a.equals(s10.f2269a) && this.f2270b.equals(s10.f2270b) && this.f2271c.equals(s10.f2271c) && this.f2272d.equals(s10.f2272d) && this.f2273e.equals(s10.f2273e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int t10 = AbstractC4194d.t(this.f2269a, S.class.hashCode() * 31, 31);
        int hashCode = this.f2271c.hashCode();
        int hashCode2 = this.f2272d.hashCode();
        return ((this.f2273e.hashCode() + ((hashCode2 + ((hashCode + ((this.f2270b.hashCode() + t10) * 31)) * 31)) * 31)) * 31) + (this.f2274f ? 1 : 0);
    }
}
