package Bh;

import Eh.AbstractC0511j;
import Eh.EnumC0516o;
import Qh.AbstractC1230h;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import vh.AbstractC6048a;
import wh.AbstractC6242g;
import wh.AbstractC6250o;
import wh.AbstractC6256u;
import yh.AbstractC6612h;
import yh.AbstractC6624m;
import yh.AbstractC6635s;
import yh.C6641v;
import yh.H1;
import yh.l1;

/* loaded from: classes2.dex */
public final class B0 extends Vh.a {

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC0252j0 f2174g;

    /* renamed from: h  reason: collision with root package name */
    public final y7.b f2175h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2176i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2177j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f2178k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f2179l;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedHashMap f2180m;

    /* renamed from: n  reason: collision with root package name */
    public final Set f2181n;

    /* renamed from: o  reason: collision with root package name */
    public final LinkedHashMap f2182o;

    /* renamed from: p  reason: collision with root package name */
    public final LinkedHashSet f2183p;

    /* renamed from: q  reason: collision with root package name */
    public S f2184q;

    /* renamed from: r  reason: collision with root package name */
    public AbstractC0279x0 f2185r;

    /* renamed from: s  reason: collision with root package name */
    public AbstractC0511j f2186s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2187t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0 f2188u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C0 c02, io.sentry.vendor.b bVar, AbstractC0252j0 abstractC0252j0, y7.b bVar2, int i10, int i11) {
        super(Sh.I.f16703b, bVar, 0);
        this.f2188u = c02;
        this.f18961d = true;
        this.f18962e = true;
        this.f18963f = true;
        this.f2174g = abstractC0252j0;
        this.f2175h = bVar2;
        this.f2176i = i10;
        this.f2177j = i11;
        this.f2178k = new LinkedHashMap((int) Math.ceil(c02.f2254f.size() / 0.75d));
        for (vh.g gVar : c02.f2254f) {
            AbstractC6048a abstractC6048a = (AbstractC6048a) gVar;
            this.f2178k.put(new E0(abstractC6048a.getName(), abstractC6048a.getDescriptor()), gVar);
        }
        AbstractC6256u<AbstractC6250o> abstractC6256u = c02.f2256h;
        this.f2179l = new LinkedHashMap((int) Math.ceil(abstractC6256u.size() / 0.75d));
        for (AbstractC6250o abstractC6250o : abstractC6256u) {
            this.f2179l.put(new E0(abstractC6250o.D0(), abstractC6250o.getDescriptor()), abstractC6250o);
        }
        AbstractC6624m<AbstractC6612h> abstractC6624m = c02.f2257i;
        this.f2180m = new LinkedHashMap((int) Math.ceil(abstractC6624m.size() / 0.75d));
        for (AbstractC6612h abstractC6612h : abstractC6624m) {
            this.f2180m.put(abstractC6612h.f1(), abstractC6612h);
        }
        l1 l1Var = c02.f2249a;
        if (l1Var.x()) {
            this.f2181n = new LinkedHashSet((int) Math.ceil(l1Var.d0().size() / 0.75d));
            H1 d02 = l1Var.d0();
            AbstractC1230h a5 = AbstractC1235m.a(l1Var);
            AbstractC1239q abstractC1239q = (AbstractC1239q) d02;
            int i12 = abstractC1239q.f15001Y;
            AbstractC1239q abstractC1239q2 = abstractC1239q;
            switch (i12) {
                case 0:
                    ArrayList arrayList = new ArrayList(abstractC1239q.size());
                    Iterator it = abstractC1239q.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!a5.a(next)) {
                            arrayList.add(next);
                        }
                    }
                    int size = arrayList.size();
                    int size2 = abstractC1239q.size();
                    abstractC1239q2 = abstractC1239q;
                    if (size != size2) {
                        abstractC1239q2 = abstractC1239q.y(arrayList);
                        break;
                    }
                    break;
            }
            for (l1 l1Var2 : (H1) abstractC1239q2) {
                this.f2181n.add(l1Var2.D0());
            }
        } else {
            this.f2181n = Collections.emptySet();
        }
        this.f2182o = new LinkedHashMap((int) Math.ceil(l1Var.F().size() / 0.75d));
        for (l1 l1Var3 : l1Var.F()) {
            this.f2182o.put(l1Var3.D0(), l1Var3);
        }
        if (l1Var.x0()) {
            this.f2183p = new LinkedHashSet((int) Math.ceil(l1Var.b1().size() / 0.75d));
            for (l1 l1Var4 : l1Var.b1()) {
                this.f2183p.add(l1Var4.D0());
            }
            return;
        }
        this.f2183p = null;
    }

    @Override // Vh.a
    public final void D() {
        C0 c02 = this.f2188u;
        if (!c02.f2249a.x()) {
            ((io.sentry.vendor.b) this.f34788c).o(c02.f2249a.v().D0());
        }
    }

    @Override // Vh.a
    public final void E() {
        C0 c02 = this.f2188u;
        AbstractC6242g s02 = c02.f2249a.s0();
        if (s02 != null) {
            ((io.sentry.vendor.b) this.f34788c).r(s02.mo118a().D0(), s02.D0(), s02.getDescriptor());
        } else if (c02.f2249a.m() || c02.f2249a.K()) {
            String D02 = c02.f2249a.W().D0();
            String str = R0.f2247u;
            ((io.sentry.vendor.b) this.f34788c).r(D02, null, null);
        }
    }

    public final int F(int i10) {
        if (this.f2187t && (i10 & 131072) != 0) {
            return 131072;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Bh.x0, Bh.g0] */
    @Override // io.sentry.vendor.b
    public final void a(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        EnumC0516o enumC0516o;
        boolean z10;
        String str4;
        String D02;
        ph.f h10 = ph.f.h(i10);
        C0 c02 = this.f2188u;
        S a5 = c02.f2191z.a(Dh.j.LEVEL_TYPE, h10);
        this.f2184q = a5;
        l1 l1Var = c02.f2249a;
        this.f2185r = new C0246g0(l1Var, a5, c02.f2262n);
        if ((this.f2176i & 2) == 0 && h10.d(ph.f.f43190l0)) {
            if ((this.f2177j & 8) == 0) {
                enumC0516o = EnumC0516o.f4796Y;
            } else {
                enumC0516o = EnumC0516o.f4797Z;
            }
        } else {
            enumC0516o = EnumC0516o.f4798h0;
        }
        this.f2186s = c02.f2265q.a(l1Var, c02.f2264p, this.f2174g, h10, c02.f2250b, enumC0516o);
        this.f2187t = h10.e(ph.f.f43189k0);
        AbstractC0511j abstractC0511j = this.f2186s;
        this.f2175h.f50831Z = abstractC0511j;
        io.sentry.vendor.b b10 = c02.f2261m.b(c02.f2249a, (io.sentry.vendor.b) this.f34788c, abstractC0511j, c02.f2268t, c02.f2254f, c02.f2255g, this.f2176i, this.f2177j);
        this.f34788c = b10;
        int i12 = i11 & 32;
        l1 l1Var2 = c02.f2249a;
        int i13 = 0;
        if (i12 != 0 && !l1Var2.E0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int d12 = l1Var2.d1(z10) | F(i11);
        if ((i11 & 16) != 0 && l1Var2.K()) {
            i13 = 16;
        }
        int i14 = d12 | i13;
        String D03 = l1Var2.D0();
        if (AbstractC6635s.f51074Z) {
            str4 = str2;
        } else {
            str4 = l1Var2.N0();
        }
        if (l1Var2.L() == null) {
            if (l1Var2.E0()) {
                D02 = C6641v.l1(Object.class).D0();
            } else {
                String str5 = R0.f2247u;
                D02 = null;
            }
        } else {
            D02 = l1Var2.L().l0().D0();
        }
        b10.a(i10, i14, D03, str4, D02, l1Var2.o0().Q().z0());
    }
}
