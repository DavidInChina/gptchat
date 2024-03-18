package Z;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1079o0;
import Sg.C1394f;
import a0.C1903I;
import a0.C1904a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Arrays;
import nf.AbstractC4828h;
import nf.AbstractC4831k;
import nf.C4832l;
import v.C5934c;
import w.AbstractC6079z;
import w.C6074u;
import wf.AbstractC6216a;

/* renamed from: Z.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1734s {

    /* renamed from: a  reason: collision with root package name */
    public static final C1716i0 f22724a = new C1716i0("provider");

    /* renamed from: b  reason: collision with root package name */
    public static final C1716i0 f22725b = new C1716i0("provider");

    /* renamed from: c  reason: collision with root package name */
    public static final C1716i0 f22726c = new C1716i0("compositionLocalMap");

    /* renamed from: d  reason: collision with root package name */
    public static final C1716i0 f22727d = new C1716i0("providers");

    /* renamed from: e  reason: collision with root package name */
    public static final C1716i0 f22728e = new C1716i0("reference");

    /* renamed from: f  reason: collision with root package name */
    public static final C5934c f22729f = new C5934c(1);

    /* renamed from: g  reason: collision with root package name */
    public static final N f22730g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f22731h = 0;

    public static final void a(Object obj, Object obj2, wf.k kVar, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(1429097729);
        rVar.W(511388516);
        boolean g10 = rVar.g(obj) | rVar.g(obj2);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            rVar.h0(new L(kVar));
        }
        rVar.t(false);
        rVar.t(false);
    }

    public static final void b(Object obj, wf.k kVar, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(-1371986847);
        rVar.W(1157296644);
        boolean g10 = rVar.g(obj);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            rVar.h0(new L(kVar));
        }
        rVar.t(false);
        rVar.t(false);
    }

    public static final void c(Object obj, Object obj2, Object obj3, wf.n nVar, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(-54093371);
        AbstractC4831k g10 = rVar.f22697b.g();
        rVar.W(1618982084);
        boolean g11 = rVar.g(obj) | rVar.g(obj2) | rVar.g(obj3);
        Object K10 = rVar.K();
        if (g11 || K10 == C1723m.f22654Y) {
            rVar.h0(new Y(g10, nVar));
        }
        rVar.t(false);
        rVar.t(false);
    }

    public static final void d(Object obj, Object obj2, wf.n nVar, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(590241125);
        AbstractC4831k g10 = rVar.f22697b.g();
        rVar.W(511388516);
        boolean g11 = rVar.g(obj) | rVar.g(obj2);
        Object K10 = rVar.K();
        if (g11 || K10 == C1723m.f22654Y) {
            rVar.h0(new Y(g10, nVar));
        }
        rVar.t(false);
        rVar.t(false);
    }

    public static final void e(Object obj, wf.n nVar, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(1179185413);
        AbstractC4831k g10 = rVar.f22697b.g();
        rVar.W(1157296644);
        boolean g11 = rVar.g(obj);
        Object K10 = rVar.K();
        if (g11 || K10 == C1723m.f22654Y) {
            rVar.h0(new Y(g10, nVar));
        }
        rVar.t(false);
        rVar.t(false);
    }

    public static final void f(Object[] objArr, wf.n nVar, AbstractC1725n abstractC1725n) {
        r rVar = (r) abstractC1725n;
        rVar.W(-139560008);
        AbstractC4831k g10 = rVar.f22697b.g();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        rVar.W(-568225417);
        boolean z10 = false;
        for (Object obj : copyOf) {
            z10 |= rVar.g(obj);
        }
        Object K10 = rVar.K();
        if (z10 || K10 == C1723m.f22654Y) {
            rVar.h0(new Y(g10, nVar));
        }
        rVar.t(false);
        rVar.t(false);
    }

    public static final void g(AbstractC6216a abstractC6216a, AbstractC1725n abstractC1725n) {
        C1904a c1904a = ((r) abstractC1725n).f22692L.f23808b;
        c1904a.getClass();
        a0.z zVar = a0.z.f23843c;
        C1903I c1903i = c1904a.f23806a;
        c1903i.h(zVar);
        AbstractC4828h.m0(c1903i, 0, abstractC6216a);
        int i10 = c1903i.f23804g;
        int i11 = zVar.f23792a;
        int a5 = C1903I.a(c1903i, i11);
        int i12 = zVar.f23793b;
        if (i10 == a5 && c1903i.f23805h == C1903I.a(c1903i, i12)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            if (((1 << i14) & c1903i.f23804g) != 0) {
                if (i13 > 0) {
                    sb2.append(", ");
                }
                sb2.append(zVar.b(i14));
                i13++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
        int i15 = 0;
        for (int i16 = 0; i16 < i12; i16++) {
            if (((1 << i16) & c1903i.f23805h) != 0) {
                if (i13 > 0) {
                    u10.append(", ");
                }
                u10.append(zVar.c(i16));
                i15++;
            }
        }
        String sb4 = u10.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(zVar);
        sb5.append(". Not all arguments were provided. Missing ");
        android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
        throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
    }

    public static final void h(ArrayList arrayList, int i10, int i11) {
        int m10 = m(i10, arrayList);
        if (m10 < 0) {
            m10 = -(m10 + 1);
        }
        while (m10 < arrayList.size() && ((U) arrayList.get(m10)).f22572b < i11) {
            arrayList.remove(m10);
        }
    }

    public static final void i(M0 m02, ArrayList arrayList, int i10) {
        int[] iArr = m02.f22509b;
        if (M3.H.q(iArr, i10)) {
            arrayList.add(m02.i(i10));
            return;
        }
        int m10 = M3.H.m(iArr, i10) + i10;
        for (int i11 = i10 + 1; i11 < m10; i11 += iArr[(i11 * 5) + 3]) {
            i(m02, arrayList, i11);
        }
    }

    public static final void j(String str) {
        throw new C1721l(android.gov.nist.core.a.A("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final C1394f k(AbstractC1725n abstractC1725n) {
        C4832l c4832l = C4832l.f40334Y;
        C1071k0 c1071k0 = C1071k0.f12951Y;
        c4832l.get(c1071k0);
        AbstractC4831k g10 = ((r) abstractC1725n).f22697b.g();
        return Ad.l.g(g10.plus(new C1079o0((AbstractC1073l0) g10.get(c1071k0))).plus(c4832l));
    }

    public static final void l(Q0 q02, C1742w c1742w) {
        int i10 = q02.f22560r;
        int i11 = q02.f22561s;
        while (i10 < i11) {
            Object x10 = q02.x(i10);
            boolean z10 = x10 instanceof AbstractC1719k;
            ArrayList arrayList = c1742w.f22745c;
            if (z10) {
                arrayList.add((AbstractC1719k) x10);
            }
            int G10 = q02.G(q02.f22544b, q02.o(i10));
            int i12 = i10 + 1;
            int f6 = q02.f(q02.f22544b, q02.o(i12));
            for (int i13 = G10; i13 < f6; i13++) {
                int i14 = i13 - G10;
                Object obj = q02.f22545c[q02.g(i13)];
                boolean z11 = obj instanceof H0;
                io.sentry.hints.i iVar = C1723m.f22654Y;
                if (z11) {
                    G0 g02 = ((H0) obj).f22498a;
                    if (g02 instanceof C1727o) {
                        continue;
                    } else if (obj == q02.D(i10, iVar, i14)) {
                        arrayList.add(g02);
                    } else {
                        j("Slot table is out of sync".toString());
                        throw null;
                    }
                } else if (!(obj instanceof C1741v0)) {
                    continue;
                } else if (obj == q02.D(i10, iVar, i14)) {
                    C1741v0 c1741v0 = (C1741v0) obj;
                    AbstractC1743w0 abstractC1743w0 = c1741v0.f22737b;
                    if (abstractC1743w0 != null) {
                        abstractC1743w0.a();
                    }
                    c1741v0.f22737b = null;
                    c1741v0.f22741f = null;
                    c1741v0.f22742g = null;
                } else {
                    j("Slot table is out of sync".toString());
                    throw null;
                }
            }
            i10 = i12;
        }
    }

    public static final int m(int i10, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int e02 = AbstractC3557B.e0(((U) arrayList.get(i12)).f22572b, i10);
            if (e02 < 0) {
                i11 = i12 + 1;
            } else if (e02 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final void n(Q0 q02, C1742w c1742w) {
        int f6 = q02.f(q02.f22544b, q02.o(q02.f22560r));
        int[] iArr = q02.f22544b;
        int i10 = q02.f22560r;
        P0 p02 = new P0(f6, q02.f(iArr, q02.o(q02.p(i10) + i10)), q02);
        while (p02.hasNext()) {
            Object next = p02.next();
            boolean z10 = next instanceof AbstractC1719k;
            ArrayList arrayList = c1742w.f22745c;
            if (z10) {
                AbstractC1719k abstractC1719k = (AbstractC1719k) next;
                C6074u c6074u = c1742w.f22747e;
                if (c6074u == null) {
                    int i11 = AbstractC6079z.f47646a;
                    c6074u = new C6074u();
                    c1742w.f22747e = c6074u;
                }
                c6074u.f47643b[c6074u.e(abstractC1719k)] = abstractC1719k;
                arrayList.add(abstractC1719k);
            }
            if (next instanceof H0) {
                arrayList.add(((H0) next).f22498a);
            }
            if (next instanceof C1741v0) {
                C1741v0 c1741v0 = (C1741v0) next;
                AbstractC1743w0 abstractC1743w0 = c1741v0.f22737b;
                if (abstractC1743w0 != null) {
                    abstractC1743w0.a();
                }
                c1741v0.f22737b = null;
                c1741v0.f22741f = null;
                c1741v0.f22742g = null;
            }
        }
        q02.A();
    }

    public static final void o(boolean z10) {
        if (z10) {
            return;
        }
        j("Check failed".toString());
        throw null;
    }

    public static final int p(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
