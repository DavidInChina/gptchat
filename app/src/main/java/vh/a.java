package Vh;

import A.AbstractC0044t0;
import Bh.A0;
import Bh.AbstractC0273u0;
import Bh.AbstractC0275v0;
import Bh.B0;
import Bh.C0;
import Bh.C0242e0;
import Bh.C0245g;
import Bh.C0269s0;
import Bh.C0283z0;
import Bh.D0;
import Bh.E0;
import Bh.R0;
import Bh.S;
import Bh.S0;
import Bh.c1;
import Bh.d1;
import E9.f;
import Eh.AbstractC0510i;
import Fh.m;
import Fh.n;
import I5.h;
import Nh.l;
import io.sentry.android.core.z;
import io.sentry.vendor.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import sh.AbstractC5634f;
import vh.g;
import wh.AbstractC6236a;
import wh.AbstractC6242g;
import wh.AbstractC6250o;
import wh.C6244i;
import xh.c;
import yh.AbstractC6612h;
import yh.AbstractC6635s;
import yh.l1;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: d  reason: collision with root package name */
    public boolean f18961d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18962e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18963f;

    public final void A() {
        if (this.f18963f) {
            this.f18963f = false;
            B0 b02 = (B0) this;
            C0 c02 = b02.f2188u;
            m mVar = (m) c02.f2262n;
            mVar.getClass();
            c02.f2260l.a((b) b02.f34788c, c02.f2249a, mVar);
        }
    }

    public final void B() {
        if (this.f18961d) {
            this.f18961d = false;
            D();
        }
    }

    public final void C() {
        if (this.f18962e) {
            this.f18962e = false;
            E();
        }
    }

    public abstract void D();

    public abstract void E();

    @Override // io.sentry.vendor.b
    public final b d(String str, boolean z10) {
        B();
        C();
        B0 b02 = (B0) this;
        if (f.m(b02.f2188u.f2263o)) {
            return ((b) b02.f34788c).d(str, z10);
        }
        int i10 = D0.f2194y;
        return null;
    }

    @Override // io.sentry.vendor.b
    public final void f(z zVar) {
        B();
        C();
        super.f(zVar);
    }

    @Override // io.sentry.vendor.b
    public final void g() {
        n nVar;
        String str;
        String str2;
        B();
        C();
        A();
        B0 b02 = (B0) this;
        for (String str3 : b02.f2181n) {
            ((b) b02.f34788c).p(str3);
        }
        LinkedHashSet<String> linkedHashSet = b02.f2183p;
        if (linkedHashSet != null) {
            for (String str4 : linkedHashSet) {
                ((b) b02.f34788c).t(str4);
            }
        }
        C0 c02 = b02.f2188u;
        l1 mo118a = c02.f2249a.mo118a();
        l1 l1Var = c02.f2249a;
        if (mo118a != null) {
            ((b) b02.f34788c).k(l1Var.D0(), l1Var.u0(), mo118a.D0(), l1Var.o());
        } else if (l1Var.m()) {
            String D02 = l1Var.D0();
            String str5 = R0.f2247u;
            ((b) b02.f34788c).k(D02, l1Var.u0(), null, l1Var.o());
        } else if (l1Var.K()) {
            String D03 = l1Var.D0();
            String str6 = R0.f2247u;
            ((b) b02.f34788c).k(D03, l1Var.u0(), null, null);
        }
        for (l1 l1Var2 : b02.f2182o.values()) {
            b bVar = (b) b02.f34788c;
            String D04 = l1Var2.D0();
            if (l1Var2.c1()) {
                str = l1Var.D0();
            } else {
                String str7 = R0.f2247u;
                str = null;
            }
            if (l1Var2.K()) {
                String str8 = R0.f2247u;
                str2 = null;
            } else {
                str2 = l1Var2.o();
            }
            bVar.k(D04, l1Var2.u0(), str, str2);
        }
        Iterator it = b02.f2180m.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            nVar = c02.f2262n;
            if (!hasNext) {
                break;
            }
            ((d1) ((C0242e0) c02.f2252d).a((AbstractC6612h) it.next())).a((b) b02.f34788c, nVar);
        }
        for (g gVar : b02.f2178k.values()) {
            ((S0) ((C0245g) c02.f2251c).a(gVar)).a((b) b02.f34788c, nVar);
        }
        for (AbstractC6250o abstractC6250o : b02.f2179l.values()) {
            b02.f2184q.a(abstractC6250o).f((b) b02.f34788c, b02.f2186s, nVar);
        }
        b02.f2185r.a((b) b02.f34788c, b02.f2186s);
        ((b) b02.f34788c).g();
    }

    @Override // io.sentry.vendor.b
    public final b j(int i10, Object obj, String str, String str2, String str3) {
        B();
        C();
        A();
        B0 b02 = (B0) this;
        g gVar = (g) b02.f2178k.remove(new E0(str, str2));
        if (gVar != null) {
            ((C0245g) b02.f2188u.f2251c).a(gVar);
        }
        return ((b) b02.f34788c).j(i10, obj, str, str2, str3);
    }

    @Override // io.sentry.vendor.b
    public final void k(String str, int i10, String str2, String str3) {
        String str4;
        B();
        C();
        A();
        B0 b02 = (B0) this;
        C0 c02 = b02.f2188u;
        if (!str.equals(c02.f2249a.D0())) {
            l1 l1Var = (l1) b02.f2182o.remove(str);
            if (l1Var == null) {
                ((b) b02.f34788c).k(str, i10, str2, str3);
                return;
            }
            b bVar = (b) b02.f34788c;
            String str5 = null;
            if (!l1Var.c1() && (str2 == null || str3 != null || !l1Var.K())) {
                String str6 = R0.f2247u;
                str4 = null;
            } else {
                str4 = c02.f2249a.D0();
            }
            if (l1Var.K()) {
                String str7 = R0.f2247u;
            } else {
                str5 = l1Var.o();
            }
            bVar.k(str, l1Var.u0(), str4, str5);
        }
    }

    @Override // io.sentry.vendor.b
    public final l m(int i10, String str, String str2, String str3, String[] strArr) {
        String str4;
        String str5;
        boolean z10;
        boolean z11;
        AbstractC0275v0 abstractC0273u0;
        B();
        C();
        A();
        B0 b02 = (B0) this;
        boolean equals = str.equals("<clinit>");
        int i11 = 0;
        C0 c02 = b02.f2188u;
        boolean z12 = true;
        if (equals) {
            l m10 = ((b) b02.f34788c).m(i10, str, str2, str3, strArr);
            if (m10 == null) {
                int i12 = D0.f2194y;
                return null;
            }
            b02.f2186s.getClass();
            l1 l1Var = c02.f2249a;
            S s10 = b02.f2184q;
            if ((b02.f2176i & 2) == 0 && ((AbstractC0510i) b02.f2186s).f4794b.d(ph.f.f43190l0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b02.f2177j & 8) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c1 a5 = s10.a(new C6244i(l1Var));
            boolean k10 = AbstractC0044t0.k(a5.c());
            n nVar = c02.f2262n;
            if (k10) {
                abstractC0273u0 = new C0269s0(m10, l1Var, a5, nVar, z10, z11);
            } else {
                abstractC0273u0 = new AbstractC0273u0(m10, l1Var, a5, nVar, z10, z11);
            }
            AbstractC0275v0 abstractC0275v0 = abstractC0273u0;
            b02.f2185r = abstractC0275v0;
            return abstractC0275v0;
        }
        AbstractC6250o abstractC6250o = (AbstractC6250o) b02.f2179l.remove(new E0(str, str2));
        if (abstractC6250o == null) {
            return ((b) b02.f34788c).m(i10, str, str2, str3, strArr);
        }
        if ((i10 & 1024) == 0) {
            z12 = false;
        }
        c1 a10 = b02.f2184q.a(abstractC6250o);
        if (!AbstractC0044t0.i(a10.c())) {
            b bVar = (b) b02.f34788c;
            AbstractC6236a abstractC6236a = (AbstractC6236a) abstractC6250o;
            int u02 = abstractC6236a.u0();
            if (abstractC6236a.getDeclaredAnnotations().isAnnotationPresent(Deprecated.class)) {
                i11 = 131072;
            }
            int F10 = u02 | i11 | b02.F(i10);
            String D02 = abstractC6236a.D0();
            String descriptor = abstractC6236a.getDescriptor();
            if (AbstractC6635s.f51074Z) {
                str5 = str3;
            } else {
                str5 = abstractC6236a.N0();
            }
            return bVar.m(F10, D02, descriptor, str5, abstractC6236a.V().Q().z0());
        }
        AbstractC6250o method = a10.getMethod();
        b bVar2 = (b) b02.f34788c;
        Set<c> singleton = Collections.singleton(a10.getVisibility());
        boolean k11 = AbstractC0044t0.k(a10.c());
        AbstractC6236a abstractC6236a2 = (AbstractC6236a) method;
        int u03 = abstractC6236a2.u0();
        if (abstractC6236a2.getDeclaredAnnotations().isAnnotationPresent(Deprecated.class)) {
            i11 = 131072;
        }
        int i13 = u03 | i11;
        if (k11) {
            i13 &= -1281;
        } else if ((i13 & 1280) == 0) {
            i13 |= 1024;
        }
        for (c cVar : singleton) {
            i13 = (i13 & (~cVar.b())) | cVar.a();
        }
        int F11 = i13 | b02.F(i10);
        String D03 = abstractC6236a2.D0();
        String descriptor2 = abstractC6236a2.getDescriptor();
        if (AbstractC6635s.f51074Z) {
            str4 = str3;
        } else {
            str4 = abstractC6236a2.N0();
        }
        l m11 = bVar2.m(F11, D03, descriptor2, str4, abstractC6236a2.V().Q().z0());
        if (m11 == null) {
            int i14 = D0.f2194y;
            return null;
        } else if (z12) {
            return new C0283z0(b02, m11, a10);
        } else {
            if (((AbstractC5634f) abstractC6250o).h1(256)) {
                c02.getClass();
                AbstractC6242g abstractC6242g = (AbstractC6242g) abstractC6236a2.y();
                return new C0283z0(b02, m11, a10);
            }
            c02.getClass();
            return new A0(b02, m11, a10, new Ch.c((AbstractC6242g) abstractC6236a2.y()));
        }
    }

    @Override // io.sentry.vendor.b
    public final void o(String str) {
        this.f18961d = false;
        ((B0) this).D();
    }

    @Override // io.sentry.vendor.b
    public final void p(String str) {
        B();
        C();
        A();
        B0 b02 = (B0) this;
        if (b02.f2188u.f2249a.x() && b02.f2181n.remove(str)) {
            ((b) b02.f34788c).p(str);
        }
    }

    @Override // io.sentry.vendor.b
    public final void r(String str, String str2, String str3) {
        B();
        this.f18962e = false;
        B0 b02 = (B0) this;
        try {
            b02.E();
        } catch (Throwable unused) {
            ((b) b02.f34788c).r(str, str2, str3);
        }
    }

    @Override // io.sentry.vendor.b
    public final void t(String str) {
        B();
        C();
        A();
        B0 b02 = (B0) this;
        LinkedHashSet linkedHashSet = b02.f2183p;
        if (linkedHashSet != null && linkedHashSet.remove(str)) {
            ((b) b02.f34788c).t(str);
        }
    }

    @Override // io.sentry.vendor.b
    public final b v(String str, String str2, String str3) {
        B();
        C();
        A();
        B0 b02 = (B0) this;
        AbstractC6612h abstractC6612h = (AbstractC6612h) b02.f2180m.remove(str);
        if (abstractC6612h != null) {
            ((C0242e0) b02.f2188u.f2252d).a(abstractC6612h);
        }
        return ((b) b02.f34788c).v(str, str2, str3);
    }

    @Override // io.sentry.vendor.b
    public final b y(int i10, h hVar, String str, boolean z10) {
        B();
        C();
        B0 b02 = (B0) this;
        if (f.m(b02.f2188u.f2263o)) {
            return ((b) b02.f34788c).y(i10, hVar, str, z10);
        }
        int i11 = D0.f2194y;
        return null;
    }
}
