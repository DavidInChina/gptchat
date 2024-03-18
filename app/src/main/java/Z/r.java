package Z;

import a0.AbstractC1901G;
import a0.C1895A;
import a0.C1896B;
import a0.C1897C;
import a0.C1898D;
import a0.C1900F;
import a0.C1903I;
import a0.C1904a;
import a0.C1905b;
import a0.C1906c;
import a0.C1911h;
import android.os.Trace;
import b0.C2097a;
import b0.C2099c;
import b0.C2100d;
import e0.C2743f;
import h0.C3288a;
import h0.C3291d;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import jf.C3959i;
import k0.AbstractC4152b;
import nf.AbstractC4828h;
import w.AbstractC6064k;
import w.AbstractC6076w;
import w.C6053E;
import w.C6069p;
import w.C6072s;
import w.C6073t;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class r implements AbstractC1725n {

    /* renamed from: A  reason: collision with root package name */
    public int f22681A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f22682B;

    /* renamed from: E  reason: collision with root package name */
    public boolean f22685E;

    /* renamed from: F  reason: collision with root package name */
    public M0 f22686F;

    /* renamed from: G  reason: collision with root package name */
    public N0 f22687G;

    /* renamed from: H  reason: collision with root package name */
    public Q0 f22688H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f22689I;

    /* renamed from: J  reason: collision with root package name */
    public AbstractC1732q0 f22690J;

    /* renamed from: K  reason: collision with root package name */
    public C1904a f22691K;

    /* renamed from: L  reason: collision with root package name */
    public final C1905b f22692L;

    /* renamed from: M  reason: collision with root package name */
    public C1705d f22693M;

    /* renamed from: N  reason: collision with root package name */
    public C1906c f22694N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f22695O;
    public int P;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1707e f22696a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC1738u f22697b;

    /* renamed from: c  reason: collision with root package name */
    public final N0 f22698c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f22699d;

    /* renamed from: e  reason: collision with root package name */
    public final C1904a f22700e;

    /* renamed from: f  reason: collision with root package name */
    public final C1904a f22701f;

    /* renamed from: g  reason: collision with root package name */
    public final D f22702g;

    /* renamed from: i  reason: collision with root package name */
    public C1730p0 f22704i;

    /* renamed from: j  reason: collision with root package name */
    public int f22705j;

    /* renamed from: l  reason: collision with root package name */
    public int f22707l;

    /* renamed from: n  reason: collision with root package name */
    public int[] f22709n;

    /* renamed from: o  reason: collision with root package name */
    public C6069p f22710o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22711p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f22712q;

    /* renamed from: u  reason: collision with root package name */
    public C2100d f22716u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f22717v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f22719x;

    /* renamed from: z  reason: collision with root package name */
    public int f22721z;

    /* renamed from: h  reason: collision with root package name */
    public final k1 f22703h = new k1();

    /* renamed from: k  reason: collision with root package name */
    public final T f22706k = new T();

    /* renamed from: m  reason: collision with root package name */
    public final T f22708m = new T();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f22713r = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    public final T f22714s = new T();

    /* renamed from: t  reason: collision with root package name */
    public AbstractC1732q0 f22715t = C3291d.f31684i0;

    /* renamed from: w  reason: collision with root package name */
    public final T f22718w = new T();

    /* renamed from: y  reason: collision with root package name */
    public int f22720y = -1;

    /* renamed from: C  reason: collision with root package name */
    public final C1731q f22683C = new C1731q(0, this);

    /* renamed from: D  reason: collision with root package name */
    public final k1 f22684D = new k1();

    public r(AbstractC1699a abstractC1699a, AbstractC1738u abstractC1738u, N0 n02, HashSet hashSet, C1904a c1904a, C1904a c1904a2, D d10) {
        this.f22696a = abstractC1699a;
        this.f22697b = abstractC1738u;
        this.f22698c = n02;
        this.f22699d = hashSet;
        this.f22700e = c1904a;
        this.f22701f = c1904a2;
        this.f22702g = d10;
        M0 s10 = n02.s();
        s10.c();
        this.f22686F = s10;
        N0 n03 = new N0();
        this.f22687G = n03;
        Q0 y10 = n03.y();
        y10.e();
        this.f22688H = y10;
        this.f22692L = new C1905b(this, c1904a);
        M0 s11 = this.f22687G.s();
        try {
            C1705d a5 = s11.a(0);
            s11.c();
            this.f22693M = a5;
            this.f22694N = new C1906c();
        } catch (Throwable th2) {
            s11.c();
            throw th2;
        }
    }

    public static final int M(r rVar, int i10, boolean z10, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        C1727o c1727o;
        M0 m02 = rVar.f22686F;
        int[] iArr = m02.f22509b;
        int i13 = i10 * 5;
        if ((iArr[i13 + 1] & 134217728) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int i14 = iArr[i13];
            Object j6 = m02.j(iArr, i10);
            if (i14 == 206 && AbstractC3557B.K(j6, AbstractC1734s.f22728e)) {
                Object g10 = m02.g(i10, 0);
                if (g10 instanceof C1727o) {
                    c1727o = (C1727o) g10;
                } else {
                    c1727o = null;
                }
                if (c1727o != null) {
                    for (r rVar2 : c1727o.f22662Y.f22670e) {
                        rVar2.L();
                        rVar.f22697b.l(rVar2.f22702g);
                    }
                }
                return M3.H.s(iArr, i10);
            } else if (M3.H.q(iArr, i10)) {
                return 1;
            } else {
                return M3.H.s(iArr, i10);
            }
        } else if (M3.H.k(iArr, i10)) {
            int i15 = iArr[i13 + 3] + i10;
            int i16 = 0;
            for (int i17 = i10 + 1; i17 < i15; i17 += iArr[(i17 * 5) + 3]) {
                boolean q10 = M3.H.q(iArr, i17);
                C1905b c1905b = rVar.f22692L;
                if (q10) {
                    c1905b.g();
                    c1905b.f23814h.f22652a.add(m02.i(i17));
                }
                if (!q10 && !z10) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (q10) {
                    i12 = 0;
                } else {
                    i12 = i11 + i16;
                }
                i16 += M(rVar, i17, z12, i12);
                if (q10) {
                    c1905b.g();
                    c1905b.e();
                }
            }
            if (M3.H.q(iArr, i10)) {
                return 1;
            }
            return i16;
        } else if (M3.H.q(iArr, i10)) {
            return 1;
        } else {
            return M3.H.s(iArr, i10);
        }
    }

    public static final void b(r rVar, AbstractC1732q0 abstractC1732q0, Object obj) {
        boolean z10;
        rVar.T(126665345, null);
        rVar.D();
        rVar.i0(obj);
        int i10 = rVar.P;
        try {
            rVar.P = 126665345;
            if (rVar.f22695O) {
                Q0.t(rVar.f22688H);
            }
            if (rVar.f22695O || AbstractC3557B.K(rVar.f22686F.e(), abstractC1732q0)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                rVar.I(abstractC1732q0);
            }
            rVar.Q(202, AbstractC1734s.f22726c, abstractC1732q0, 0);
            rVar.f22690J = null;
            boolean z11 = rVar.f22717v;
            rVar.f22717v = z10;
            U3.f.a0(rVar, new C3288a(new androidx.compose.foundation.layout.c((Object) null, 7, obj), true, 316014703));
            rVar.f22717v = z11;
            rVar.t(false);
            rVar.f22690J = null;
            rVar.P = i10;
            rVar.t(false);
        } catch (Throwable th2) {
            rVar.t(false);
            rVar.f22690J = null;
            rVar.P = i10;
            rVar.t(false);
            throw th2;
        }
    }

    public final boolean A() {
        C1741v0 z10;
        if (B() && !this.f22717v && ((z10 = z()) == null || (z10.f22736a & 4) == 0)) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        C1741v0 z10;
        if (!this.f22695O && !this.f22719x && !this.f22717v && (z10 = z()) != null && (z10.f22736a & 8) == 0) {
            return true;
        }
        return false;
    }

    public final void C(ArrayList arrayList) {
        C1904a c1904a = this.f22701f;
        C1905b c1905b = this.f22692L;
        C1904a c1904a2 = c1905b.f23808b;
        try {
            c1905b.f23808b = c1904a;
            c1904a.getClass();
            c1904a.f23806a.g(a0.y.f23842c);
            if (arrayList.size() <= 0) {
                C1904a c1904a3 = c1905b.f23808b;
                c1904a3.getClass();
                c1904a3.f23806a.g(a0.m.f23830c);
                c1905b.f23812f = 0;
                return;
            }
            C3959i c3959i = (C3959i) arrayList.get(0);
            AbstractC1704c0 abstractC1704c0 = (AbstractC1704c0) c3959i.f36155Y;
            AbstractC1704c0 abstractC1704c02 = (AbstractC1704c0) c3959i.f36156Z;
            abstractC1704c0.getClass();
            abstractC1704c0.getClass();
            throw null;
        } finally {
            c1905b.f23808b = c1904a2;
        }
    }

    public final Object D() {
        boolean z10 = this.f22695O;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (z10) {
            l0();
            return iVar;
        }
        Object h10 = this.f22686F.h();
        if (!this.f22719x || (h10 instanceof C1727o)) {
            return h10;
        }
        return iVar;
    }

    public final boolean E(C2097a c2097a) {
        C1904a c1904a = this.f22700e;
        if (c1904a.f23806a.d()) {
            if (c2097a.f25556c <= 0 && !(!this.f22713r.isEmpty())) {
                return false;
            }
            r(c2097a, null);
            return c1904a.f23806a.e();
        }
        AbstractC1734s.j("Expected applyChanges() to have been called".toString());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r0 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(D d10, D d11, Integer num, List list, AbstractC6216a abstractC6216a) {
        Object obj;
        int i10;
        boolean z10 = this.f22685E;
        int i11 = this.f22705j;
        try {
            this.f22685E = true;
            this.f22705j = 0;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C3959i c3959i = (C3959i) list.get(i12);
                C1741v0 c1741v0 = (C1741v0) c3959i.f36155Y;
                C2099c c2099c = (C2099c) c3959i.f36156Z;
                if (c2099c != null) {
                    Object[] objArr = c2099c.f25559Z;
                    int i13 = c2099c.f25558Y;
                    for (int i14 = 0; i14 < i13; i14++) {
                        Object obj2 = objArr[i14];
                        AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet", obj2);
                        b0(c1741v0, obj2);
                    }
                } else {
                    b0(c1741v0, null);
                }
            }
            if (d10 != null) {
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = -1;
                }
                C1744x c1744x = (C1744x) d10;
                if (d11 != null && !AbstractC3557B.K(d11, c1744x) && i10 >= 0) {
                    c1744x.f22762t0 = (C1744x) d11;
                    c1744x.f22763u0 = i10;
                    obj = abstractC6216a.mo122invoke();
                    c1744x.f22762t0 = null;
                    c1744x.f22763u0 = 0;
                } else {
                    obj = abstractC6216a.mo122invoke();
                }
            }
            obj = abstractC6216a.mo122invoke();
            this.f22685E = z10;
            this.f22705j = i11;
            return obj;
        } catch (Throwable th2) {
            this.f22685E = z10;
            this.f22705j = i11;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r9.f22572b < r3) goto L10;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        U u10;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int m10;
        int i14;
        U u11;
        boolean z12;
        int i15;
        C6072s c6072s;
        int i16;
        int i17;
        jf.y yVar;
        boolean z13 = this.f22685E;
        this.f22685E = true;
        M0 m02 = this.f22686F;
        int i18 = m02.f22516i;
        int m11 = M3.H.m(m02.f22509b, i18) + i18;
        int i19 = this.f22705j;
        int i20 = this.P;
        int i21 = this.f22707l;
        ArrayList arrayList = this.f22713r;
        int m12 = AbstractC1734s.m(this.f22686F.f22514g, arrayList);
        if (m12 < 0) {
            m12 = -(m12 + 1);
        }
        if (m12 < arrayList.size()) {
            u10 = (U) arrayList.get(m12);
        }
        u10 = null;
        int i22 = i18;
        boolean z14 = false;
        while (u10 != null) {
            int i23 = u10.f22572b;
            int m13 = AbstractC1734s.m(i23, arrayList);
            if (m13 >= 0) {
                U u12 = (U) arrayList.remove(m13);
            }
            C2099c c2099c = u10.f22573c;
            C1741v0 c1741v0 = u10.f22571a;
            if (c2099c == null) {
                c1741v0.getClass();
            } else {
                C6073t c6073t = c1741v0.f22742g;
                if (c6073t != null && c2099c.y()) {
                    if (!c2099c.isEmpty()) {
                        Iterator it = c2099c.iterator();
                        while (true) {
                            C6053E c6053e = (C6053E) it;
                            if (!c6053e.hasNext()) {
                                break;
                            }
                            Object next = c6053e.next();
                            if (!(next instanceof J)) {
                                break;
                            }
                            J j6 = (J) next;
                            I i24 = (I) j6;
                            Iterator it2 = it;
                            Z0 z02 = i24.f22500h0;
                            if (z02 == null) {
                                z02 = o1.f22665a;
                            }
                            if (!z02.a(i24.i().f22496f, c6073t.f(j6))) {
                                break;
                            }
                            it = it2;
                        }
                    }
                    k1 k1Var = this.f22684D;
                    k1Var.f22652a.add(c1741v0);
                    AbstractC1743w0 abstractC1743w0 = c1741v0.f22737b;
                    if (abstractC1743w0 != null && (c6072s = c1741v0.f22741f) != null) {
                        c1741v0.c(true);
                        try {
                            Object[] objArr = c6072s.f47626b;
                            int[] iArr = c6072s.f47627c;
                            long[] jArr = c6072s.f47625a;
                            z10 = z13;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i11 = i19;
                                i15 = i20;
                                i12 = i21;
                                int i25 = 0;
                                while (true) {
                                    long j10 = jArr[i25];
                                    long[] jArr2 = jArr;
                                    z12 = z14;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j10 & 255) < 128) {
                                                int i28 = (i25 << 3) + i27;
                                                i16 = m11;
                                                Object obj = objArr[i28];
                                                int i29 = iArr[i28];
                                                abstractC1743w0.b(obj);
                                            } else {
                                                i16 = m11;
                                            }
                                            j10 >>= 8;
                                            i27++;
                                            m11 = i16;
                                        }
                                        i10 = m11;
                                        if (i26 != 8) {
                                            break;
                                        }
                                    } else {
                                        i10 = m11;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    z14 = z12;
                                    jArr = jArr2;
                                    m11 = i10;
                                }
                            } else {
                                i10 = m11;
                                i11 = i19;
                                i15 = i20;
                                i12 = i21;
                                z12 = z14;
                            }
                            c1741v0.c(false);
                        } catch (Throwable th2) {
                            c1741v0.c(false);
                            throw th2;
                        }
                    } else {
                        z10 = z13;
                        i10 = m11;
                        i11 = i19;
                        i15 = i20;
                        i12 = i21;
                        z12 = z14;
                    }
                    ArrayList arrayList2 = k1Var.f22652a;
                    arrayList2.remove(arrayList2.size() - 1);
                    i13 = i15;
                    z14 = z12;
                    z11 = true;
                    m10 = AbstractC1734s.m(this.f22686F.f22514g, arrayList);
                    if (m10 < 0) {
                        m10 = -(m10 + 1);
                    }
                    if (m10 >= arrayList.size()) {
                        u11 = (U) arrayList.get(m10);
                        i14 = i10;
                        if (u11.f22572b < i14) {
                            i21 = i12;
                            i19 = i11;
                            i20 = i13;
                            m11 = i14;
                            u10 = u11;
                            z13 = z10;
                        }
                    } else {
                        i14 = i10;
                    }
                    u11 = null;
                    i21 = i12;
                    i19 = i11;
                    i20 = i13;
                    m11 = i14;
                    u10 = u11;
                    z13 = z10;
                }
            }
            z10 = z13;
            i10 = m11;
            i11 = i19;
            int i30 = i20;
            i12 = i21;
            this.f22686F.k(i23);
            int i31 = this.f22686F.f22514g;
            J(i22, i31, i18);
            int v10 = M3.H.v(this.f22686F.f22509b, i31);
            while (v10 != i18 && !M3.H.q(this.f22686F.f22509b, v10)) {
                v10 = M3.H.v(this.f22686F.f22509b, v10);
            }
            if (M3.H.q(this.f22686F.f22509b, v10)) {
                i17 = 0;
            } else {
                i17 = i11;
            }
            if (v10 != i31) {
                int j02 = (j0(v10) - M3.H.s(this.f22686F.f22509b, i31)) + i17;
                while (i17 < j02 && v10 != i23) {
                    v10++;
                    while (v10 < i23) {
                        int m14 = M3.H.m(this.f22686F.f22509b, v10) + v10;
                        if (i23 >= m14) {
                            i17 += j0(v10);
                            v10 = m14;
                        }
                    }
                    break;
                }
            }
            this.f22705j = i17;
            i13 = i30;
            this.P = l(M3.H.v(this.f22686F.f22509b, i31), i18, i13);
            this.f22690J = null;
            wf.n nVar = c1741v0.f22739d;
            z11 = true;
            if (nVar != null) {
                nVar.invoke(this, 1);
                yVar = jf.y.f36177a;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                this.f22690J = null;
                M0 m03 = this.f22686F;
                int m15 = M3.H.m(m03.f22509b, i18) + i18;
                int i32 = m03.f22514g;
                if (i32 >= i18 && i32 <= m15) {
                    m03.f22516i = i18;
                    m03.f22515h = m15;
                    m03.f22518k = 0;
                    m03.f22519l = 0;
                    i22 = i31;
                    z14 = true;
                    m10 = AbstractC1734s.m(this.f22686F.f22514g, arrayList);
                    if (m10 < 0) {
                    }
                    if (m10 >= arrayList.size()) {
                    }
                    u11 = null;
                    i21 = i12;
                    i19 = i11;
                    i20 = i13;
                    m11 = i14;
                    u10 = u11;
                    z13 = z10;
                } else {
                    AbstractC1734s.j(("Index " + i18 + " is not a parent of " + i32).toString());
                    throw null;
                }
            } else {
                throw new IllegalStateException("Invalid restart scope".toString());
            }
        }
        boolean z15 = z13;
        int i33 = i19;
        int i34 = i20;
        int i35 = i21;
        if (z14) {
            J(i22, i18, i18);
            this.f22686F.m();
            int j03 = j0(i18);
            this.f22705j = i33 + j03;
            this.f22707l = i35 + j03;
        } else {
            O();
        }
        this.P = i34;
        this.f22685E = z15;
    }

    public final void H() {
        int i10;
        M(this, this.f22686F.f22514g, false, 0);
        C1905b c1905b = this.f22692L;
        c1905b.g();
        c1905b.h(false);
        r rVar = c1905b.f23807a;
        M0 m02 = rVar.f22686F;
        if (m02.f22510c > 0) {
            int i11 = m02.f22516i;
            T t10 = c1905b.f23810d;
            int i12 = t10.f22569b;
            if (i12 > 0) {
                i10 = t10.f22568a[i12 - 1];
            } else {
                i10 = -2;
            }
            if (i10 != i11) {
                if (!c1905b.f23809c && c1905b.f23811e) {
                    c1905b.h(false);
                    C1904a c1904a = c1905b.f23808b;
                    c1904a.getClass();
                    c1904a.f23806a.g(a0.o.f23832c);
                    c1905b.f23809c = true;
                }
                if (i11 > 0) {
                    C1705d a5 = m02.a(i11);
                    t10.b(i11);
                    c1905b.h(false);
                    C1904a c1904a2 = c1905b.f23808b;
                    c1904a2.getClass();
                    a0.n nVar = a0.n.f23831c;
                    C1903I c1903i = c1904a2.f23806a;
                    c1903i.h(nVar);
                    AbstractC4828h.m0(c1903i, 0, a5);
                    int i13 = c1903i.f23804g;
                    int i14 = nVar.f23792a;
                    int a10 = C1903I.a(c1903i, i14);
                    int i15 = nVar.f23793b;
                    if (i13 == a10 && c1903i.f23805h == C1903I.a(c1903i, i15)) {
                        c1905b.f23809c = true;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int i16 = 0;
                        for (int i17 = 0; i17 < i14; i17++) {
                            if (((1 << i17) & c1903i.f23804g) != 0) {
                                if (i16 > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(nVar.b(i17));
                                i16++;
                            }
                        }
                        String sb3 = sb2.toString();
                        StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                        int i18 = 0;
                        for (int i19 = 0; i19 < i15; i19++) {
                            if (((1 << i19) & c1903i.f23805h) != 0) {
                                if (i16 > 0) {
                                    u10.append(", ");
                                }
                                u10.append(nVar.c(i19));
                                i18++;
                            }
                        }
                        String sb4 = u10.toString();
                        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                        StringBuilder sb5 = new StringBuilder("Error while pushing ");
                        sb5.append(nVar);
                        sb5.append(". Not all arguments were provided. Missing ");
                        android.gov.nist.core.a.x(sb5, i16, " int arguments (", sb3, ") and ");
                        throw new IllegalStateException(R.a.s(sb5, i18, " object arguments (", sb4, ").").toString());
                    }
                }
            }
        }
        C1904a c1904a3 = c1905b.f23808b;
        c1904a3.getClass();
        c1904a3.f23806a.g(a0.w.f23840c);
        int i20 = c1905b.f23812f;
        M0 m03 = rVar.f22686F;
        c1905b.f23812f = M3.H.m(m03.f22509b, m03.f22514g) + i20;
    }

    public final void I(AbstractC1732q0 abstractC1732q0) {
        C2100d c2100d = this.f22716u;
        if (c2100d == null) {
            c2100d = new C2100d();
            this.f22716u = c2100d;
        }
        c2100d.f25560a.put(this.f22686F.f22514g, abstractC1732q0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i10, int i11, int i12) {
        M0 m02 = this.f22686F;
        if (i10 != i11) {
            if (i10 != i12 && i11 != i12) {
                if (M3.H.v(m02.f22509b, i10) == i11) {
                    i12 = i11;
                } else {
                    int[] iArr = m02.f22509b;
                    if (M3.H.v(iArr, i11) != i10) {
                        int i13 = iArr[(i10 * 5) + 2];
                        if (i13 == iArr[(i11 * 5) + 2]) {
                            i12 = i13;
                        } else {
                            int i14 = i10;
                            int i15 = 0;
                            while (i14 > 0 && i14 != i12) {
                                i14 = M3.H.v(iArr, i14);
                                i15++;
                            }
                            int i16 = i11;
                            int i17 = 0;
                            while (i16 > 0 && i16 != i12) {
                                i16 = M3.H.v(iArr, i16);
                                i17++;
                            }
                            int i18 = i15 - i17;
                            int i19 = i10;
                            for (int i20 = 0; i20 < i18; i20++) {
                                i19 = iArr[(i19 * 5) + 2];
                            }
                            int i21 = i17 - i15;
                            int i22 = i11;
                            for (int i23 = 0; i23 < i21; i23++) {
                                i22 = iArr[(i22 * 5) + 2];
                            }
                            i12 = i19;
                            for (int i24 = i22; i12 != i24; i24 = iArr[(i24 * 5) + 2]) {
                                i12 = iArr[(i12 * 5) + 2];
                            }
                        }
                    }
                }
            }
            while (i10 > 0 && i10 != i12) {
                if (!M3.H.q(m02.f22509b, i10)) {
                    this.f22692L.e();
                }
                i10 = M3.H.v(m02.f22509b, i10);
            }
            s(i11, i12);
        }
        i12 = i10;
        while (i10 > 0) {
            if (!M3.H.q(m02.f22509b, i10)) {
            }
            i10 = M3.H.v(m02.f22509b, i10);
        }
        s(i11, i12);
    }

    public final Object K() {
        boolean z10 = this.f22695O;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (z10) {
            l0();
            return iVar;
        }
        Object h10 = this.f22686F.h();
        if (!this.f22719x || (h10 instanceof C1727o)) {
            if (h10 instanceof H0) {
                return ((H0) h10).f22498a;
            }
            return h10;
        }
        return iVar;
    }

    public final void L() {
        C1905b c1905b = this.f22692L;
        N0 n02 = this.f22698c;
        if (n02.f22521Z > 0 && M3.H.k(n02.f22520Y, 0)) {
            C1904a c1904a = new C1904a();
            this.f22691K = c1904a;
            M0 s10 = n02.s();
            try {
                this.f22686F = s10;
                C1904a c1904a2 = c1905b.f23808b;
                c1905b.f23808b = c1904a;
                M(this, 0, false, 0);
                c1905b.g();
                c1905b.f();
                if (c1905b.f23809c) {
                    C1904a c1904a3 = c1905b.f23808b;
                    c1904a3.getClass();
                    c1904a3.f23806a.g(C1895A.f23786c);
                    if (c1905b.f23809c) {
                        c1905b.h(false);
                        c1905b.h(false);
                        C1904a c1904a4 = c1905b.f23808b;
                        c1904a4.getClass();
                        c1904a4.f23806a.g(a0.l.f23829c);
                        c1905b.f23809c = false;
                    }
                }
                c1905b.f23808b = c1904a2;
            } finally {
                s10.c();
            }
        }
    }

    public final void N() {
        Object obj;
        if (this.f22713r.isEmpty()) {
            this.f22707l = this.f22686F.l() + this.f22707l;
            return;
        }
        M0 m02 = this.f22686F;
        int f6 = m02.f();
        int i10 = m02.f22514g;
        int i11 = m02.f22515h;
        int[] iArr = m02.f22509b;
        if (i10 < i11) {
            obj = m02.j(iArr, i10);
        } else {
            obj = null;
        }
        Object e10 = m02.e();
        c0(obj, f6, e10);
        V(null, M3.H.q(iArr, m02.f22514g));
        G();
        m02.d();
        d0(obj, f6, e10);
    }

    public final void O() {
        int i10;
        M0 m02 = this.f22686F;
        int i11 = m02.f22516i;
        if (i11 >= 0) {
            i10 = M3.H.s(m02.f22509b, i11);
        } else {
            i10 = 0;
        }
        this.f22707l = i10;
        this.f22686F.m();
    }

    public final void P() {
        if (this.f22707l == 0) {
            C1741v0 z10 = z();
            if (z10 != null) {
                z10.f22736a |= 16;
            }
            if (this.f22713r.isEmpty()) {
                O();
                return;
            } else {
                G();
                return;
            }
        }
        AbstractC1734s.j("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(int i10, Object obj, Object obj2, int i11) {
        boolean z10;
        boolean z11;
        C1730p0 c1730p0;
        boolean z12;
        Object obj3;
        Object obj4;
        int i12;
        int i13;
        Object obj5;
        boolean z13;
        a0.s sVar;
        int i14;
        int i15;
        int a5;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Object obj6;
        r rVar = this;
        io.sentry.hints.i iVar = obj;
        l0();
        rVar.c0(iVar, i10, obj2);
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z14 = rVar.f22695O;
        io.sentry.hints.i iVar2 = C1723m.f22654Y;
        if (z14) {
            rVar.f22686F.f22517j++;
            Q0 q02 = rVar.f22688H;
            int i21 = q02.f22560r;
            if (z10) {
                q02.J(iVar2, iVar2, true, i10);
            } else if (obj2 != null) {
                if (iVar == null) {
                    iVar = iVar2;
                }
                q02.J(iVar, obj2, false, i10);
            } else {
                if (iVar == null) {
                    iVar = iVar2;
                }
                q02.J(iVar, iVar2, false, i10);
            }
            C1730p0 c1730p02 = rVar.f22704i;
            if (c1730p02 != null) {
                int i22 = (-2) - i21;
                W w10 = new W(i10, i22, -1, -1);
                c1730p02.f22677e.put(Integer.valueOf(i22), new P(-1, rVar.f22705j - c1730p02.f22674b, 0));
                c1730p02.f22676d.add(w10);
            }
            rVar.y(z10, null);
            return;
        }
        if (i11 == 1 && rVar.f22719x) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.f22704i == null) {
            int f6 = rVar.f22686F.f();
            if (!z11 && f6 == i10) {
                M0 m02 = rVar.f22686F;
                int i23 = m02.f22514g;
                if (i23 < m02.f22515h) {
                    obj6 = m02.j(m02.f22509b, i23);
                } else {
                    obj6 = null;
                }
                if (AbstractC3557B.K(iVar, obj6)) {
                    rVar.V(obj2, z10);
                }
            }
            M0 m03 = rVar.f22686F;
            m03.getClass();
            ArrayList arrayList = new ArrayList();
            if (m03.f22517j <= 0) {
                int i24 = m03.f22514g;
                while (i24 < m03.f22515h) {
                    int i25 = i24 * 5;
                    int[] iArr = m03.f22509b;
                    int i26 = iArr[i25];
                    Object j6 = m03.j(iArr, i24);
                    if (M3.H.q(iArr, i24)) {
                        i20 = 1;
                    } else {
                        i20 = M3.H.s(iArr, i24);
                    }
                    arrayList.add(new W(i26, i24, i20, j6));
                    i24 += iArr[i25 + 3];
                }
            }
            rVar.f22704i = new C1730p0(rVar.f22705j, arrayList);
        }
        C1730p0 c1730p03 = rVar.f22704i;
        if (c1730p03 != null) {
            if (iVar != null) {
                obj3 = new V(Integer.valueOf(i10), iVar);
            } else {
                obj3 = Integer.valueOf(i10);
            }
            HashMap hashMap = (HashMap) c1730p03.f22678f.getValue();
            LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj3);
            if (linkedHashSet != null && (obj4 = kf.t.g2(linkedHashSet)) != null) {
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) hashMap.get(obj3);
                if (linkedHashSet2 != null) {
                    linkedHashSet2.remove(obj4);
                    if (linkedHashSet2.isEmpty()) {
                        hashMap.remove(obj3);
                    }
                }
            } else {
                obj4 = null;
            }
            W w11 = (W) obj4;
            HashMap hashMap2 = c1730p03.f22677e;
            ArrayList arrayList2 = c1730p03.f22676d;
            int i27 = c1730p03.f22674b;
            if (!z11 && w11 != null) {
                arrayList2.add(w11);
                rVar.f22705j = c1730p03.a(w11) + i27;
                int i28 = w11.f22580c;
                P p10 = (P) hashMap2.get(Integer.valueOf(i28));
                if (p10 != null) {
                    i13 = p10.f22533a;
                } else {
                    i13 = -1;
                }
                int i29 = c1730p03.f22675c;
                int i30 = i13 - i29;
                if (i13 > i29) {
                    for (P p11 : hashMap2.values()) {
                        int i31 = p11.f22533a;
                        if (i31 == i13) {
                            p11.f22533a = i29;
                        } else if (i29 <= i31 && i31 < i13) {
                            p11.f22533a = i31 + 1;
                        }
                    }
                } else if (i29 > i13) {
                    for (P p12 : hashMap2.values()) {
                        int i32 = p12.f22533a;
                        if (i32 == i13) {
                            p12.f22533a = i29;
                        } else if (i13 + 1 <= i32 && i32 < i29) {
                            p12.f22533a = i32 - 1;
                        }
                    }
                }
                C1905b c1905b = rVar.f22692L;
                int i33 = c1905b.f23812f;
                r rVar2 = c1905b.f23807a;
                c1905b.f23812f = (i28 - rVar2.f22686F.f22514g) + i33;
                rVar.f22686F.k(i28);
                if (i30 > 0) {
                    c1905b.h(false);
                    M0 m04 = rVar2.f22686F;
                    if (m04.f22510c > 0) {
                        int i34 = m04.f22516i;
                        T t10 = c1905b.f23810d;
                        int i35 = t10.f22569b;
                        if (i35 > 0) {
                            i19 = t10.f22568a[i35 - 1];
                        } else {
                            i19 = -2;
                        }
                        if (i19 != i34) {
                            if (!c1905b.f23809c && c1905b.f23811e) {
                                c1905b.h(false);
                                C1904a c1904a = c1905b.f23808b;
                                c1904a.getClass();
                                c1904a.f23806a.g(a0.o.f23832c);
                                c1905b.f23809c = true;
                            }
                            if (i34 > 0) {
                                C1705d a10 = m04.a(i34);
                                t10.b(i34);
                                c1905b.h(false);
                                C1904a c1904a2 = c1905b.f23808b;
                                c1904a2.getClass();
                                a0.n nVar = a0.n.f23831c;
                                C1903I c1903i = c1904a2.f23806a;
                                c1903i.h(nVar);
                                AbstractC4828h.m0(c1903i, 0, a10);
                                int i36 = c1903i.f23804g;
                                int i37 = nVar.f23792a;
                                int a11 = C1903I.a(c1903i, i37);
                                z13 = z10;
                                int i38 = nVar.f23793b;
                                if (i36 == a11 && c1903i.f23805h == C1903I.a(c1903i, i38)) {
                                    c1905b.f23809c = true;
                                    C1904a c1904a3 = c1905b.f23808b;
                                    c1904a3.getClass();
                                    sVar = a0.s.f23836c;
                                    C1903I c1903i2 = c1904a3.f23806a;
                                    c1903i2.h(sVar);
                                    AbstractC4828h.l0(c1903i2, 0, i30);
                                    i14 = c1903i2.f23804g;
                                    i15 = sVar.f23792a;
                                    a5 = C1903I.a(c1903i2, i15);
                                    i16 = sVar.f23793b;
                                    if (i14 != a5 && c1903i2.f23805h == C1903I.a(c1903i2, i16)) {
                                        rVar = this;
                                        obj5 = obj2;
                                        z12 = z13;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        int i39 = 0;
                                        for (i17 = 0; i17 < i15; i17++) {
                                            if (((1 << i17) & c1903i2.f23804g) != 0) {
                                                if (i39 > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(sVar.b(i17));
                                                i39++;
                                            }
                                        }
                                        String sb3 = sb2.toString();
                                        StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                                        i18 = 0;
                                        int i40 = 0;
                                        while (i18 < i16) {
                                            int i41 = i16;
                                            if (((1 << i18) & c1903i2.f23805h) != 0) {
                                                if (i39 > 0) {
                                                    u10.append(", ");
                                                }
                                                u10.append(sVar.c(i18));
                                                i40++;
                                            }
                                            i18++;
                                            i16 = i41;
                                        }
                                        String sb4 = u10.toString();
                                        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                                        StringBuilder sb5 = new StringBuilder("Error while pushing ");
                                        sb5.append(sVar);
                                        sb5.append(". Not all arguments were provided. Missing ");
                                        android.gov.nist.core.a.x(sb5, i39, " int arguments (", sb3, ") and ");
                                        throw new IllegalStateException(R.a.s(sb5, i40, " object arguments (", sb4, ").").toString());
                                    }
                                } else {
                                    int i42 = 1;
                                    StringBuilder sb6 = new StringBuilder();
                                    int i43 = 0;
                                    int i44 = 0;
                                    while (i43 < i37) {
                                        if (((i42 << i43) & c1903i.f23804g) != 0) {
                                            if (i44 > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(nVar.b(i43));
                                            i44++;
                                        }
                                        i43++;
                                        i42 = 1;
                                    }
                                    String sb7 = sb6.toString();
                                    StringBuilder u11 = R.a.u("StringBuilder().apply(builderAction).toString()", sb7);
                                    int i45 = 0;
                                    int i46 = 0;
                                    while (i45 < i38) {
                                        int i47 = i38;
                                        if (((1 << i45) & c1903i.f23805h) != 0) {
                                            if (i44 > 0) {
                                                u11.append(", ");
                                            }
                                            u11.append(nVar.c(i45));
                                            i46++;
                                        }
                                        i45++;
                                        i38 = i47;
                                    }
                                    String sb8 = u11.toString();
                                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb8);
                                    StringBuilder sb9 = new StringBuilder("Error while pushing ");
                                    sb9.append(nVar);
                                    sb9.append(". Not all arguments were provided. Missing ");
                                    android.gov.nist.core.a.x(sb9, i44, " int arguments (", sb7, ") and ");
                                    throw new IllegalStateException(R.a.s(sb9, i46, " object arguments (", sb8, ").").toString());
                                }
                            }
                        }
                    }
                    z13 = z10;
                    C1904a c1904a32 = c1905b.f23808b;
                    c1904a32.getClass();
                    sVar = a0.s.f23836c;
                    C1903I c1903i22 = c1904a32.f23806a;
                    c1903i22.h(sVar);
                    AbstractC4828h.l0(c1903i22, 0, i30);
                    i14 = c1903i22.f23804g;
                    i15 = sVar.f23792a;
                    a5 = C1903I.a(c1903i22, i15);
                    i16 = sVar.f23793b;
                    if (i14 != a5) {
                    }
                    StringBuilder sb22 = new StringBuilder();
                    int i392 = 0;
                    while (i17 < i15) {
                    }
                    String sb32 = sb22.toString();
                    StringBuilder u102 = R.a.u("StringBuilder().apply(builderAction).toString()", sb32);
                    i18 = 0;
                    int i402 = 0;
                    while (i18 < i16) {
                    }
                    String sb42 = u102.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb42);
                    StringBuilder sb52 = new StringBuilder("Error while pushing ");
                    sb52.append(sVar);
                    sb52.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb52, i392, " int arguments (", sb32, ") and ");
                    throw new IllegalStateException(R.a.s(sb52, i402, " object arguments (", sb42, ").").toString());
                }
                rVar = this;
                obj5 = obj2;
                z12 = z10;
                rVar.V(obj5, z12);
            } else {
                z12 = z10;
                rVar.f22686F.f22517j++;
                rVar.f22695O = true;
                rVar.f22690J = null;
                if (rVar.f22688H.f22563u) {
                    Q0 y10 = rVar.f22687G.y();
                    rVar.f22688H = y10;
                    y10.F();
                    rVar.f22689I = false;
                    rVar.f22690J = null;
                }
                rVar.f22688H.d();
                Q0 q03 = rVar.f22688H;
                int i48 = q03.f22560r;
                if (z12) {
                    q03.J(iVar2, iVar2, true, i10);
                } else if (obj2 != null) {
                    if (iVar == null) {
                        iVar = iVar2;
                    }
                    q03.J(iVar, obj2, false, i10);
                } else {
                    if (iVar == null) {
                        iVar = iVar2;
                    }
                    q03.J(iVar, iVar2, false, i10);
                }
                rVar.f22693M = rVar.f22688H.b(i48);
                int i49 = (-2) - i48;
                W w12 = new W(i10, i49, -1, -1);
                hashMap2.put(Integer.valueOf(i49), new P(-1, rVar.f22705j - i27, 0));
                arrayList2.add(w12);
                ArrayList arrayList3 = new ArrayList();
                if (z12) {
                    i12 = 0;
                } else {
                    i12 = rVar.f22705j;
                }
                c1730p0 = new C1730p0(i12, arrayList3);
                rVar.y(z12, c1730p0);
            }
        } else {
            z12 = z10;
        }
        c1730p0 = null;
        rVar.y(z12, c1730p0);
    }

    public final void R() {
        Q(-127, null, null, 0);
    }

    public final void S(int i10, C1716i0 c1716i0) {
        Q(i10, c1716i0, null, 0);
    }

    public final void T(int i10, Object obj) {
        Q(i10, obj, null, 0);
    }

    public final void U() {
        Q(125, null, null, 1);
        this.f22712q = true;
    }

    public final void V(Object obj, boolean z10) {
        if (z10) {
            M0 m02 = this.f22686F;
            if (m02.f22517j <= 0) {
                if (M3.H.q(m02.f22509b, m02.f22514g)) {
                    m02.n();
                    return;
                }
                throw new IllegalArgumentException("Expected a node group".toString());
            }
            return;
        }
        if (obj != null && this.f22686F.e() != obj) {
            C1905b c1905b = this.f22692L;
            c1905b.getClass();
            c1905b.h(false);
            C1904a c1904a = c1905b.f23808b;
            c1904a.getClass();
            C1896B c1896b = C1896B.f23787c;
            C1903I c1903i = c1904a.f23806a;
            c1903i.h(c1896b);
            AbstractC4828h.m0(c1903i, 0, obj);
            int i10 = c1903i.f23804g;
            int i11 = c1896b.f23792a;
            int a5 = C1903I.a(c1903i, i11);
            int i12 = c1896b.f23793b;
            if (i10 != a5 || c1903i.f23805h != C1903I.a(c1903i, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & c1903i.f23804g) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c1896b.b(i14));
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
                        u10.append(c1896b.c(i16));
                        i15++;
                    }
                }
                String sb4 = u10.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c1896b);
                sb5.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
                throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
            }
        }
        this.f22686F.n();
    }

    public final void W(int i10) {
        Q(i10, null, null, 0);
    }

    public final r X(int i10) {
        C1741v0 c1741v0;
        U u10 = null;
        boolean z10 = false;
        Q(i10, null, null, 0);
        boolean z11 = this.f22695O;
        k1 k1Var = this.f22684D;
        D d10 = this.f22702g;
        if (z11) {
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl", d10);
            C1741v0 c1741v02 = new C1741v0((C1744x) d10);
            k1Var.f22652a.add(c1741v02);
            i0(c1741v02);
            c1741v02.f22740e = this.f22681A;
            c1741v02.f22736a &= -17;
        } else {
            ArrayList arrayList = this.f22713r;
            int m10 = AbstractC1734s.m(this.f22686F.f22516i, arrayList);
            if (m10 >= 0) {
                u10 = (U) arrayList.remove(m10);
            }
            Object h10 = this.f22686F.h();
            if (AbstractC3557B.K(h10, C1723m.f22654Y)) {
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl", d10);
                c1741v0 = new C1741v0((C1744x) d10);
                i0(c1741v0);
            } else {
                AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl", h10);
                c1741v0 = (C1741v0) h10;
            }
            if (u10 == null) {
                int i11 = c1741v0.f22736a;
                if ((i11 & 64) != 0) {
                    z10 = true;
                }
                if (z10) {
                    c1741v0.f22736a = i11 & (-65);
                }
                if (!z10) {
                    c1741v0.f22736a &= -9;
                    k1Var.f22652a.add(c1741v0);
                    c1741v0.f22740e = this.f22681A;
                    c1741v0.f22736a &= -17;
                }
            }
            c1741v0.f22736a |= 8;
            k1Var.f22652a.add(c1741v0);
            c1741v0.f22740e = this.f22681A;
            c1741v0.f22736a &= -17;
        }
        return this;
    }

    public final void Y(Object obj) {
        if (!this.f22695O && this.f22686F.f() == 207 && !AbstractC3557B.K(this.f22686F.e(), obj) && this.f22720y < 0) {
            this.f22720y = this.f22686F.f22514g;
            this.f22719x = true;
        }
        Q(207, null, obj, 0);
    }

    public final void Z() {
        Q(125, null, null, 2);
        this.f22712q = true;
    }

    public final void a() {
        j();
        this.f22703h.f22652a.clear();
        this.f22706k.f22569b = 0;
        this.f22708m.f22569b = 0;
        this.f22714s.f22569b = 0;
        this.f22718w.f22569b = 0;
        this.f22716u = null;
        M0 m02 = this.f22686F;
        if (!m02.f22513f) {
            m02.c();
        }
        Q0 q02 = this.f22688H;
        if (!q02.f22563u) {
            q02.e();
        }
        C1906c c1906c = this.f22694N;
        c1906c.f23820b.b();
        c1906c.f23819a.b();
        n();
        this.P = 0;
        this.f22721z = 0;
        this.f22712q = false;
        this.f22695O = false;
        this.f22719x = false;
        this.f22685E = false;
        this.f22720y = -1;
    }

    public final void a0() {
        N0 n02 = this.f22698c;
        this.f22686F = n02.s();
        Q(100, null, null, 0);
        AbstractC1738u abstractC1738u = this.f22697b;
        abstractC1738u.m();
        this.f22715t = abstractC1738u.e();
        this.f22718w.b(this.f22717v ? 1 : 0);
        this.f22717v = g(this.f22715t);
        this.f22690J = null;
        if (!this.f22711p) {
            this.f22711p = abstractC1738u.c();
        }
        if (!this.f22682B) {
            this.f22682B = abstractC1738u.d();
        }
        Set set = (Set) r9.y.T0(this.f22715t, AbstractC4152b.f36764a);
        if (set != null) {
            set.add(n02);
            abstractC1738u.j(set);
        }
        Q(abstractC1738u.f(), null, null, 0);
    }

    public final boolean b0(C1741v0 c1741v0, Object obj) {
        C1705d c1705d = c1741v0.f22738c;
        if (c1705d == null) {
            return false;
        }
        int r10 = this.f22686F.f22508a.r(c1705d);
        if (!this.f22685E || r10 < this.f22686F.f22514g) {
            return false;
        }
        ArrayList arrayList = this.f22713r;
        int m10 = AbstractC1734s.m(r10, arrayList);
        C2099c c2099c = null;
        if (m10 < 0) {
            int i10 = -(m10 + 1);
            if (obj != null) {
                c2099c = new C2099c();
                c2099c.add(obj);
            }
            arrayList.add(i10, new U(c1741v0, r10, c2099c));
        } else if (obj == null) {
            ((U) arrayList.get(m10)).f22573c = null;
        } else {
            C2099c c2099c2 = ((U) arrayList.get(m10)).f22573c;
            if (c2099c2 != null) {
                c2099c2.add(obj);
            }
        }
        return true;
    }

    public final void c(Object obj, wf.n nVar) {
        int i10 = 0;
        if (this.f22695O) {
            C1906c c1906c = this.f22694N;
            c1906c.getClass();
            C1897C c1897c = C1897C.f23788c;
            C1903I c1903i = c1906c.f23819a;
            c1903i.h(c1897c);
            AbstractC4828h.m0(c1903i, 0, obj);
            AbstractC3557B.a0("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", nVar);
            Ad.l.M(2, nVar);
            AbstractC4828h.m0(c1903i, 1, nVar);
            int i11 = c1903i.f23804g;
            int i12 = c1897c.f23792a;
            int a5 = C1903I.a(c1903i, i12);
            int i13 = c1897c.f23793b;
            if (i11 != a5 || c1903i.f23805h != C1903I.a(c1903i, i13)) {
                StringBuilder sb2 = new StringBuilder();
                int i14 = 0;
                while (i14 < i12) {
                    int i15 = i12;
                    if (((1 << i14) & c1903i.f23804g) != 0) {
                        if (i10 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c1897c.b(i14));
                        i10++;
                    }
                    i14++;
                    i12 = i15;
                }
                String sb3 = sb2.toString();
                StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                int i16 = 0;
                int i17 = 0;
                while (i17 < i13) {
                    int i18 = i13;
                    if (((1 << i17) & c1903i.f23805h) != 0) {
                        if (i10 > 0) {
                            u10.append(", ");
                        }
                        u10.append(c1897c.c(i17));
                        i16++;
                    }
                    i17++;
                    i13 = i18;
                }
                String sb4 = u10.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c1897c);
                sb5.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb5, i10, " int arguments (", sb3, ") and ");
                throw new IllegalStateException(R.a.s(sb5, i16, " object arguments (", sb4, ").").toString());
            }
            return;
        }
        C1905b c1905b = this.f22692L;
        c1905b.f();
        C1904a c1904a = c1905b.f23808b;
        c1904a.getClass();
        C1897C c1897c2 = C1897C.f23788c;
        C1903I c1903i2 = c1904a.f23806a;
        c1903i2.h(c1897c2);
        int i19 = 0;
        AbstractC4828h.m0(c1903i2, 0, obj);
        AbstractC3557B.a0("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>", nVar);
        Ad.l.M(2, nVar);
        AbstractC4828h.m0(c1903i2, 1, nVar);
        int i20 = c1903i2.f23804g;
        int i21 = c1897c2.f23792a;
        int a10 = C1903I.a(c1903i2, i21);
        int i22 = c1897c2.f23793b;
        if (i20 == a10 && c1903i2.f23805h == C1903I.a(c1903i2, i22)) {
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        for (int i23 = 0; i23 < i21; i23++) {
            if (((1 << i23) & c1903i2.f23804g) != 0) {
                if (i19 > 0) {
                    sb6.append(", ");
                }
                sb6.append(c1897c2.b(i23));
                i19++;
            }
        }
        String sb7 = sb6.toString();
        StringBuilder u11 = R.a.u("StringBuilder().apply(builderAction).toString()", sb7);
        int i24 = 0;
        int i25 = 0;
        while (i24 < i22) {
            int i26 = i22;
            if (((1 << i24) & c1903i2.f23805h) != 0) {
                if (i19 > 0) {
                    u11.append(", ");
                }
                u11.append(c1897c2.c(i24));
                i25++;
            }
            i24++;
            i22 = i26;
        }
        String sb8 = u11.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb8);
        StringBuilder sb9 = new StringBuilder("Error while pushing ");
        sb9.append(c1897c2);
        sb9.append(". Not all arguments were provided. Missing ");
        android.gov.nist.core.a.x(sb9, i19, " int arguments (", sb7, ") and ");
        throw new IllegalStateException(R.a.s(sb9, i25, " object arguments (", sb8, ").").toString());
    }

    public final void c0(Object obj, int i10, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i10 == 207 && !AbstractC3557B.K(obj2, C1723m.f22654Y)) {
                this.P = obj2.hashCode() ^ Integer.rotateLeft(this.P, 3);
            } else {
                this.P = Integer.rotateLeft(this.P, 3) ^ i10;
            }
        } else if (obj instanceof Enum) {
            this.P = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.P, 3);
        } else {
            this.P = obj.hashCode() ^ Integer.rotateLeft(this.P, 3);
        }
    }

    public final boolean d(float f6) {
        Object D6 = D();
        if ((D6 instanceof Float) && f6 == ((Number) D6).floatValue()) {
            return false;
        }
        i0(Float.valueOf(f6));
        return true;
    }

    public final void d0(Object obj, int i10, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i10 == 207 && !AbstractC3557B.K(obj2, C1723m.f22654Y)) {
                this.P = Integer.rotateRight(obj2.hashCode() ^ this.P, 3);
            } else {
                this.P = Integer.rotateRight(this.P ^ i10, 3);
            }
        } else if (obj instanceof Enum) {
            this.P = Integer.rotateRight(((Enum) obj).ordinal() ^ this.P, 3);
        } else {
            this.P = Integer.rotateRight(obj.hashCode() ^ this.P, 3);
        }
    }

    public final boolean e(int i10) {
        Object D6 = D();
        if ((D6 instanceof Integer) && i10 == ((Number) D6).intValue()) {
            return false;
        }
        i0(Integer.valueOf(i10));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
        r4 = r3.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a3, code lost:
        if (r3.f47613f != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
        if (((r3.f47608a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
        r4 = r3.f47611d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
        if (r4 <= 8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d2, code lost:
        if (java.lang.Long.compare((r3.f47612e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
        r3.g(w.AbstractC6076w.b(r3.f47611d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00de, code lost:
        r3.g(w.AbstractC6076w.b(r3.f47611d));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
        r4 = r3.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00eb, code lost:
        r3.f47612e++;
        r5 = r3.f47613f;
        r6 = r3.f47608a;
        r7 = r4 >> 3;
        r13 = r6[r7];
        r10 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0105, code lost:
        if (((r13 >> r10) & 255) != 128) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0108, code lost:
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
        r3.f47613f = r5 - r16;
        r6[r7] = ((~(255 << r10)) & r13) | (r11 << r10);
        r0 = r3.f47611d;
        r1 = ((r4 - 7) & r0) + (r0 & 7);
        r0 = r1 >> 3;
        r1 = (r1 & 7) << 3;
        r6[r0] = ((~(255 << r1)) & r6[r0]) | (r11 << r1);
        r0 = ~r4;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [w.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e0(int i10, int i11) {
        int i12;
        int i13 = i10;
        if (j0(i10) != i11) {
            if (i13 < 0) {
                C6069p c6069p = this.f22710o;
                C6069p c6069p2 = c6069p;
                if (c6069p == null) {
                    ?? obj = new Object();
                    obj.f47608a = AbstractC6076w.f47639a;
                    int[] iArr = AbstractC6064k.f47595a;
                    obj.f47609b = iArr;
                    obj.f47610c = iArr;
                    obj.f(AbstractC6076w.d(6));
                    this.f22710o = obj;
                    c6069p2 = obj;
                }
                int i14 = (-862048943) * i13;
                int i15 = i14 ^ (i14 << 16);
                int i16 = i15 >>> 7;
                int i17 = i15 & 127;
                int i18 = c6069p2.f47611d;
                int i19 = i16 & i18;
                int i20 = 0;
                loop0: while (true) {
                    long[] jArr = c6069p2.f47608a;
                    int i21 = i19 >> 3;
                    int i22 = (i19 & 7) << 3;
                    int i23 = 1;
                    int i24 = i20;
                    long j6 = (((-i22) >> 63) & (jArr[i21 + 1] << (64 - i22))) | (jArr[i21] >>> i22);
                    long j10 = i17;
                    int i25 = i17;
                    long j11 = j6 ^ (j10 * 72340172838076673L);
                    long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
                    while (true) {
                        if (j12 == 0) {
                            break;
                        }
                        int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j12) >> 3)) & i18;
                        if (c6069p2.f47609b[numberOfTrailingZeros] == i13) {
                            i12 = numberOfTrailingZeros;
                            break loop0;
                        }
                        j12 &= j12 - 1;
                    }
                    i20 = i24 + 8;
                    i19 = (i19 + i20) & i18;
                    i13 = i10;
                    i17 = i25;
                }
                if (i12 < 0) {
                    i12 = ~i12;
                }
                c6069p2.f47609b[i12] = i10;
                c6069p2.f47610c[i12] = i11;
                return;
            }
            int[] iArr2 = this.f22709n;
            if (iArr2 == null) {
                iArr2 = new int[this.f22686F.f22510c];
                kf.q.e3(iArr2);
                this.f22709n = iArr2;
            }
            iArr2[i10] = i11;
        }
    }

    public final boolean f(long j6) {
        Object D6 = D();
        if ((D6 instanceof Long) && j6 == ((Number) D6).longValue()) {
            return false;
        }
        i0(Long.valueOf(j6));
        return true;
    }

    public final void f0(int i10, int i11) {
        int j02 = j0(i10);
        if (j02 != i11) {
            int i12 = i11 - j02;
            k1 k1Var = this.f22703h;
            int size = k1Var.f22652a.size() - 1;
            while (i10 != -1) {
                int j03 = j0(i10) + i12;
                e0(i10, j03);
                int i13 = size;
                while (true) {
                    if (-1 < i13) {
                        C1730p0 c1730p0 = (C1730p0) k1Var.f22652a.get(i13);
                        if (c1730p0 != null && c1730p0.b(i10, j03)) {
                            size = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f22686F.f22516i;
                } else if (!M3.H.q(this.f22686F.f22509b, i10)) {
                    i10 = M3.H.v(this.f22686F.f22509b, i10);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean g(Object obj) {
        if (!AbstractC3557B.K(D(), obj)) {
            i0(obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e0.f, h0.c] */
    public final C3291d g0(AbstractC1732q0 abstractC1732q0, C3291d c3291d) {
        C3291d c3291d2 = (C3291d) abstractC1732q0;
        c3291d2.getClass();
        ?? c2743f = new C2743f(c3291d2);
        c2743f.f31683l0 = c3291d2;
        c2743f.putAll(c3291d);
        C3291d f6 = c2743f.f();
        S(204, AbstractC1734s.f22727d);
        D();
        i0(f6);
        D();
        i0(c3291d);
        t(false);
        return f6;
    }

    public final boolean h(boolean z10) {
        Object D6 = D();
        if ((D6 instanceof Boolean) && z10 == ((Boolean) D6).booleanValue()) {
            return false;
        }
        i0(Boolean.valueOf(z10));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Z.H0, java.lang.Object] */
    public final void h0(Object obj) {
        if (obj instanceof G0) {
            if (this.f22695O) {
                C1904a c1904a = this.f22692L.f23808b;
                c1904a.getClass();
                a0.v vVar = a0.v.f23839c;
                C1903I c1903i = c1904a.f23806a;
                c1903i.h(vVar);
                AbstractC4828h.m0(c1903i, 0, (G0) obj);
                int i10 = c1903i.f23804g;
                int i11 = vVar.f23792a;
                int a5 = C1903I.a(c1903i, i11);
                int i12 = vVar.f23793b;
                if (i10 != a5 || c1903i.f23805h != C1903I.a(c1903i, i12)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = 0;
                    for (int i14 = 0; i14 < i11; i14++) {
                        if (((1 << i14) & c1903i.f23804g) != 0) {
                            if (i13 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(vVar.b(i14));
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
                            u10.append(vVar.c(i16));
                            i15++;
                        }
                    }
                    String sb4 = u10.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(vVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb5, i13, " int arguments (", sb3, ") and ");
                    throw new IllegalStateException(R.a.s(sb5, i15, " object arguments (", sb4, ").").toString());
                }
            }
            this.f22699d.add(obj);
            ?? obj2 = new Object();
            obj2.f22498a = (G0) obj;
            obj = obj2;
        }
        i0(obj);
    }

    public final boolean i(Object obj) {
        if (D() != obj) {
            i0(obj);
            return true;
        }
        return false;
    }

    public final void i0(Object obj) {
        if (this.f22695O) {
            this.f22688H.L(obj);
            return;
        }
        M0 m02 = this.f22686F;
        int y10 = m02.f22518k - M3.H.y(m02.f22509b, m02.f22516i);
        int i10 = 1;
        C1905b c1905b = this.f22692L;
        c1905b.h(true);
        C1904a c1904a = c1905b.f23808b;
        C1898D c1898d = C1898D.f23789c;
        C1903I c1903i = c1904a.f23806a;
        c1903i.h(c1898d);
        AbstractC4828h.m0(c1903i, 0, obj);
        AbstractC4828h.l0(c1903i, 0, y10 - 1);
        if (c1903i.f23804g == C1903I.a(c1903i, 1) && c1903i.f23805h == C1903I.a(c1903i, 1)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (int i12 = 0; i12 < 1; i12++) {
            if (((1 << i12) & c1903i.f23804g) != 0) {
                if (i11 > 0) {
                    sb2.append(", ");
                }
                sb2.append(c1898d.b(i12));
                i11++;
            }
        }
        String sb3 = sb2.toString();
        StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
        if ((c1903i.f23805h & 1) != 0) {
            if (i11 > 0) {
                u10.append(", ");
            }
            u10.append(c1898d.c(0));
        } else {
            i10 = 0;
        }
        String sb4 = u10.toString();
        AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c1898d);
        sb5.append(". Not all arguments were provided. Missing ");
        android.gov.nist.core.a.x(sb5, i11, " int arguments (", sb3, ") and ");
        throw new IllegalStateException(R.a.s(sb5, i10, " object arguments (", sb4, ").").toString());
    }

    public final void j() {
        this.f22704i = null;
        this.f22705j = 0;
        this.f22707l = 0;
        this.P = 0;
        this.f22712q = false;
        C1905b c1905b = this.f22692L;
        c1905b.f23809c = false;
        c1905b.f23810d.f22569b = 0;
        c1905b.f23812f = 0;
        this.f22684D.f22652a.clear();
        this.f22709n = null;
        this.f22710o = null;
    }

    public final int j0(int i10) {
        int i11;
        if (i10 < 0) {
            C6069p c6069p = this.f22710o;
            if (c6069p == null || c6069p.c(i10) < 0) {
                return 0;
            }
            return c6069p.d(i10);
        }
        int[] iArr = this.f22709n;
        if (iArr != null && (i11 = iArr[i10]) >= 0) {
            return i11;
        }
        return M3.H.s(this.f22686F.f22509b, i10);
    }

    public final void k(C2097a c2097a, C3288a c3288a) {
        if (this.f22700e.f23806a.d()) {
            r(c2097a, c3288a);
        } else {
            AbstractC1734s.j("Expected applyChanges() to have been called".toString());
            throw null;
        }
    }

    public final void k0() {
        boolean z10;
        if (this.f22712q) {
            this.f22712q = false;
            if (!this.f22695O) {
                M0 m02 = this.f22686F;
                Object i10 = m02.i(m02.f22516i);
                C1905b c1905b = this.f22692L;
                c1905b.f23814h.f22652a.add(i10);
                if (this.f22719x && ((z10 = i10 instanceof AbstractC1719k))) {
                    c1905b.f();
                    C1904a c1904a = c1905b.f23808b;
                    c1904a.getClass();
                    if (z10) {
                        c1904a.f23806a.g(C1900F.f23791c);
                        return;
                    }
                    return;
                }
                return;
            }
            AbstractC1734s.j("useNode() called while inserting".toString());
            throw null;
        }
        AbstractC1734s.j("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final int l(int i10, int i11, int i12) {
        int i13;
        Object b10;
        if (i10 != i11) {
            M0 m02 = this.f22686F;
            boolean o10 = M3.H.o(m02.f22509b, i10);
            int[] iArr = m02.f22509b;
            if (o10) {
                Object j6 = m02.j(iArr, i10);
                if (j6 != null) {
                    if (j6 instanceof Enum) {
                        i13 = ((Enum) j6).ordinal();
                    } else {
                        i13 = j6.hashCode();
                    }
                } else {
                    i13 = 0;
                }
            } else {
                int i14 = iArr[i10 * 5];
                if (i14 == 207 && (b10 = m02.b(iArr, i10)) != null && !AbstractC3557B.K(b10, C1723m.f22654Y)) {
                    i14 = b10.hashCode();
                }
                i13 = i14;
            }
            if (i13 == 126665345) {
                return i13;
            }
            return Integer.rotateLeft(l(M3.H.v(this.f22686F.f22509b, i10), i11, i12), 3) ^ i13;
        }
        return i12;
    }

    public final void l0() {
        if (!this.f22712q) {
            return;
        }
        AbstractC1734s.j("A call to createNode(), emitNode() or useNode() expected".toString());
        throw null;
    }

    public final Object m(AbstractC1735s0 abstractC1735s0) {
        return r9.y.T0(p(), abstractC1735s0);
    }

    public final void n() {
        AbstractC1734s.o(this.f22688H.f22563u);
        N0 n02 = new N0();
        this.f22687G = n02;
        Q0 y10 = n02.y();
        y10.e();
        this.f22688H = y10;
    }

    public final void o(AbstractC6216a abstractC6216a) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (this.f22712q) {
            this.f22712q = false;
            if (this.f22695O) {
                T t10 = this.f22706k;
                int i14 = t10.f22568a[t10.f22569b - 1];
                Q0 q02 = this.f22688H;
                C1705d b10 = q02.b(q02.f22562t);
                this.f22707l++;
                C1906c c1906c = this.f22694N;
                a0.p pVar = a0.p.f23833c;
                C1903I c1903i = c1906c.f23819a;
                c1903i.h(pVar);
                AbstractC4828h.m0(c1903i, 0, abstractC6216a);
                AbstractC4828h.l0(c1903i, 0, i14);
                AbstractC4828h.m0(c1903i, 1, b10);
                if (c1903i.f23804g == C1903I.a(c1903i, 1) && c1903i.f23805h == C1903I.a(c1903i, 2)) {
                    a0.u uVar = a0.u.f23838c;
                    C1903I c1903i2 = c1906c.f23820b;
                    c1903i2.h(uVar);
                    AbstractC4828h.l0(c1903i2, 0, i14);
                    AbstractC4828h.m0(c1903i2, 0, b10);
                    if (c1903i2.f23804g == C1903I.a(c1903i2, 1) && c1903i2.f23805h == C1903I.a(c1903i2, 1)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if ((c1903i2.f23804g & 1) != 0) {
                        sb2.append(uVar.b(0));
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    String sb3 = sb2.toString();
                    StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                    if ((c1903i2.f23805h & 1) != 0) {
                        if (i12 > 0) {
                            u10.append(", ");
                        }
                        u10.append(uVar.c(0));
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    String sb4 = u10.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(uVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb5, i12, " int arguments (", sb3, ") and ");
                    throw new IllegalStateException(R.a.s(sb5, i13, " object arguments (", sb4, ").").toString());
                }
                StringBuilder sb6 = new StringBuilder();
                int i15 = 1;
                if ((c1903i.f23804g & 1) != 0) {
                    i11 = 0;
                    sb6.append(pVar.b(0));
                    i10 = 1;
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                String sb7 = sb6.toString();
                StringBuilder u11 = R.a.u("StringBuilder().apply(builderAction).toString()", sb7);
                int i16 = i11;
                while (i11 < 2) {
                    if (((i15 << i11) & c1903i.f23805h) != 0) {
                        if (i10 > 0) {
                            u11.append(", ");
                        }
                        u11.append(pVar.c(i11));
                        i16++;
                    }
                    i11++;
                    i15 = 1;
                }
                String sb8 = u11.toString();
                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb8);
                StringBuilder sb9 = new StringBuilder("Error while pushing ");
                sb9.append(pVar);
                sb9.append(". Not all arguments were provided. Missing ");
                android.gov.nist.core.a.x(sb9, i10, " int arguments (", sb7, ") and ");
                throw new IllegalStateException(R.a.s(sb9, i16, " object arguments (", sb8, ").").toString());
            }
            AbstractC1734s.j("createNode() can only be called when inserting".toString());
            throw null;
        }
        AbstractC1734s.j("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
        throw null;
    }

    public final AbstractC1732q0 p() {
        AbstractC1732q0 abstractC1732q0;
        AbstractC1732q0 abstractC1732q02;
        Object obj;
        Object obj2;
        AbstractC1732q0 abstractC1732q03 = this.f22690J;
        if (abstractC1732q03 != null) {
            return abstractC1732q03;
        }
        int i10 = this.f22686F.f22516i;
        boolean z10 = this.f22695O;
        C1716i0 c1716i0 = AbstractC1734s.f22726c;
        if (z10 && this.f22689I) {
            int i11 = this.f22688H.f22562t;
            while (i11 > 0) {
                Q0 q02 = this.f22688H;
                if (q02.f22544b[q02.o(i11) * 5] == 202) {
                    Q0 q03 = this.f22688H;
                    int o10 = q03.o(i11);
                    if (M3.H.o(q03.f22544b, o10)) {
                        Object[] objArr = q03.f22545c;
                        int[] iArr = q03.f22544b;
                        int i12 = o10 * 5;
                        obj = objArr[M3.H.H(iArr[i12 + 1] >> 30) + iArr[i12 + 4]];
                    } else {
                        obj = null;
                    }
                    if (AbstractC3557B.K(obj, c1716i0)) {
                        Q0 q04 = this.f22688H;
                        int o11 = q04.o(i11);
                        if (M3.H.n(q04.f22544b, o11)) {
                            Object[] objArr2 = q04.f22545c;
                            int[] iArr2 = q04.f22544b;
                            obj2 = objArr2[M3.H.H(iArr2[(o11 * 5) + 1] >> 29) + q04.f(iArr2, o11)];
                        } else {
                            obj2 = C1723m.f22654Y;
                        }
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", obj2);
                        AbstractC1732q0 abstractC1732q04 = (AbstractC1732q0) obj2;
                        this.f22690J = abstractC1732q04;
                        return abstractC1732q04;
                    }
                }
                Q0 q05 = this.f22688H;
                i11 = q05.y(q05.f22544b, i11);
            }
        }
        if (this.f22686F.f22510c > 0) {
            while (i10 > 0) {
                M0 m02 = this.f22686F;
                int[] iArr3 = m02.f22509b;
                if (iArr3[i10 * 5] == 202 && AbstractC3557B.K(m02.j(iArr3, i10), c1716i0)) {
                    C2100d c2100d = this.f22716u;
                    if (c2100d != null && (abstractC1732q02 = (AbstractC1732q0) c2100d.f25560a.get(i10)) != null) {
                        abstractC1732q0 = abstractC1732q02;
                    } else {
                        M0 m03 = this.f22686F;
                        Object b10 = m03.b(m03.f22509b, i10);
                        AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap", b10);
                        abstractC1732q0 = (AbstractC1732q0) b10;
                    }
                    this.f22690J = abstractC1732q0;
                    return abstractC1732q0;
                }
                i10 = M3.H.v(this.f22686F.f22509b, i10);
            }
        }
        AbstractC1732q0 abstractC1732q05 = this.f22715t;
        this.f22690J = abstractC1732q05;
        return abstractC1732q05;
    }

    public final void q(boolean z10) {
        boolean z11;
        if (this.f22707l == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!this.f22695O) {
                if (!z10) {
                    O();
                    return;
                }
                M0 m02 = this.f22686F;
                int i10 = m02.f22514g;
                int i11 = m02.f22515h;
                C1905b c1905b = this.f22692L;
                c1905b.getClass();
                c1905b.h(false);
                C1904a c1904a = c1905b.f23808b;
                c1904a.getClass();
                c1904a.f23806a.g(C1911h.f23825c);
                AbstractC1734s.h(this.f22713r, i10, i11);
                this.f22686F.m();
                return;
            }
            return;
        }
        AbstractC1734s.j("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        kf.r.K1(r4, Z.AbstractC1734s.f22729f);
        r9.f22705j = 0;
        r9.f22685E = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        a0();
        r10 = D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r10 == r11) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r11 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        i0(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = r9.f22683C;
        r3 = nf.AbstractC4828h.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        r3.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        r0 = Z.AbstractC1734s.f22724a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r11 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
        S(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.SUCCESS, r0);
        U3.f.a0(r9, r11);
        t(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r9.f22717v == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
        if (id.AbstractC3557B.K(r10, Z.C1723m.f22654Y) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        S(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.SUCCESS, r0);
        Ad.l.M(2, r10);
        U3.f.a0(r9, (wf.n) r10);
        t(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        N();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        r3.n(r3.f25569h0 - 1);
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r9.f22685E = false;
        r4.clear();
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(C2097a c2097a, C3288a c3288a) {
        if (!this.f22685E) {
            Trace.beginSection("Compose:recompose");
            try {
                this.f22681A = j0.p.i().d();
                this.f22716u = null;
                int i10 = c2097a.f25556c;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.f22713r;
                    if (i11 >= i10) {
                        break;
                    }
                    Object obj = c2097a.f25554a[i11];
                    AbstractC3557B.a0("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap", obj);
                    C2099c c2099c = (C2099c) c2097a.f25555b[i11];
                    C1741v0 c1741v0 = (C1741v0) obj;
                    C1705d c1705d = c1741v0.f22738c;
                    if (c1705d != null) {
                        arrayList.add(new U(c1741v0, c1705d.f22611a, c2099c));
                        i11++;
                    } else {
                        return;
                    }
                }
            } finally {
                Trace.endSection();
            }
        } else {
            AbstractC1734s.j("Reentrant composition is not supported".toString());
            throw null;
        }
    }

    public final void s(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            s(M3.H.v(this.f22686F.f22509b, i10), i11);
            if (M3.H.q(this.f22686F.f22509b, i10)) {
                this.f22692L.f23814h.f22652a.add(this.f22686F.i(i10));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(boolean z10) {
        ArrayList arrayList;
        int i10;
        M0 m02;
        boolean z11;
        boolean z12;
        r rVar;
        C1730p0 c1730p0;
        int i11;
        r rVar2;
        int i12;
        int i13;
        boolean z13;
        N0 n02;
        C1906c c1906c;
        int i14;
        N0 n03;
        a0.q qVar;
        int i15;
        int i16;
        int a5;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        HashSet hashSet;
        ArrayList arrayList2;
        int i24;
        int i25;
        LinkedHashSet linkedHashSet;
        C1730p0 c1730p02;
        int i26;
        int i27;
        Object obj;
        Object obj2;
        r rVar3 = this;
        if (rVar3.f22695O) {
            Q0 q02 = rVar3.f22688H;
            int i28 = q02.f22562t;
            int i29 = q02.f22544b[q02.o(i28) * 5];
            Q0 q03 = rVar3.f22688H;
            int o10 = q03.o(i28);
            if (M3.H.o(q03.f22544b, o10)) {
                Object[] objArr = q03.f22545c;
                int[] iArr = q03.f22544b;
                int i30 = o10 * 5;
                obj = objArr[M3.H.H(iArr[i30 + 1] >> 30) + iArr[i30 + 4]];
            } else {
                obj = null;
            }
            Q0 q04 = rVar3.f22688H;
            int o11 = q04.o(i28);
            if (M3.H.n(q04.f22544b, o11)) {
                Object[] objArr2 = q04.f22545c;
                int[] iArr2 = q04.f22544b;
                obj2 = objArr2[M3.H.H(iArr2[(o11 * 5) + 1] >> 29) + q04.f(iArr2, o11)];
            } else {
                obj2 = C1723m.f22654Y;
            }
            rVar3.d0(obj, i29, obj2);
        } else {
            M0 m03 = rVar3.f22686F;
            int i31 = m03.f22516i;
            int[] iArr3 = m03.f22509b;
            int i32 = iArr3[i31 * 5];
            Object j6 = m03.j(iArr3, i31);
            M0 m04 = rVar3.f22686F;
            rVar3.d0(j6, i32, m04.b(m04.f22509b, i31));
        }
        int i33 = rVar3.f22707l;
        C1730p0 c1730p03 = rVar3.f22704i;
        ArrayList arrayList3 = rVar3.f22713r;
        C1905b c1905b = rVar3.f22692L;
        if (c1730p03 != null) {
            List list = c1730p03.f22673a;
            if (list.size() > 0) {
                ArrayList arrayList4 = c1730p03.f22676d;
                HashSet hashSet2 = new HashSet(arrayList4.size());
                int size = arrayList4.size();
                for (int i34 = 0; i34 < size; i34++) {
                    hashSet2.add(arrayList4.get(i34));
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList4.size();
                int size3 = list.size();
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                while (i36 < size3) {
                    W w10 = (W) list.get(i36);
                    boolean contains = hashSet2.contains(w10);
                    int i38 = c1730p03.f22674b;
                    if (!contains) {
                        hashSet = hashSet2;
                        c1905b.i(c1730p03.a(w10) + i38, w10.f22581d);
                        int i39 = w10.f22580c;
                        c1730p03.b(i39, 0);
                        c1905b.f23812f = (i39 - c1905b.f23807a.f22686F.f22514g) + c1905b.f23812f;
                        rVar3.f22686F.k(i39);
                        H();
                        rVar3.f22686F.l();
                        AbstractC1734s.h(arrayList3, i39, M3.H.m(rVar3.f22686F.f22509b, i39) + i39);
                    } else {
                        hashSet = hashSet2;
                        if (!linkedHashSet2.contains(w10)) {
                            if (i37 >= size2) {
                                hashSet2 = hashSet;
                            } else {
                                W w11 = (W) arrayList4.get(i37);
                                ArrayList arrayList5 = arrayList4;
                                HashMap hashMap = c1730p03.f22677e;
                                if (w11 != w10) {
                                    int a10 = c1730p03.a(w11);
                                    linkedHashSet2.add(w11);
                                    c1730p02 = c1730p03;
                                    if (a10 != i35) {
                                        P p10 = (P) hashMap.get(Integer.valueOf(w11.f22580c));
                                        if (p10 != null) {
                                            i27 = p10.f22535c;
                                        } else {
                                            i27 = w11.f22581d;
                                        }
                                        linkedHashSet = linkedHashSet2;
                                        int i40 = a10 + i38;
                                        int i41 = i38 + i35;
                                        if (i27 > 0) {
                                            i25 = size2;
                                            int i42 = c1905b.f23818l;
                                            if (i42 > 0) {
                                                i24 = size3;
                                                arrayList2 = arrayList3;
                                                if (c1905b.f23816j == i40 - i42 && c1905b.f23817k == i41 - i42) {
                                                    c1905b.f23818l = i42 + i27;
                                                }
                                            } else {
                                                arrayList2 = arrayList3;
                                                i24 = size3;
                                            }
                                            c1905b.g();
                                            c1905b.f23816j = i40;
                                            c1905b.f23817k = i41;
                                            c1905b.f23818l = i27;
                                        } else {
                                            arrayList2 = arrayList3;
                                            i25 = size2;
                                            i24 = size3;
                                            c1905b.getClass();
                                        }
                                        if (a10 > i35) {
                                            for (P p11 : hashMap.values()) {
                                                int i43 = p11.f22534b;
                                                if (a10 <= i43 && i43 < a10 + i27) {
                                                    p11.f22534b = (i43 - a10) + i35;
                                                } else if (i35 <= i43 && i43 < a10) {
                                                    p11.f22534b = i43 + i27;
                                                }
                                            }
                                        } else if (i35 > a10) {
                                            for (P p12 : hashMap.values()) {
                                                int i44 = p12.f22534b;
                                                if (a10 <= i44 && i44 < a10 + i27) {
                                                    p12.f22534b = (i44 - a10) + i35;
                                                } else if (a10 + 1 <= i44 && i44 < i35) {
                                                    p12.f22534b = i44 - i27;
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList2 = arrayList3;
                                        linkedHashSet = linkedHashSet2;
                                        i25 = size2;
                                        i24 = size3;
                                    }
                                } else {
                                    c1730p02 = c1730p03;
                                    arrayList2 = arrayList3;
                                    linkedHashSet = linkedHashSet2;
                                    i25 = size2;
                                    i24 = size3;
                                    i36++;
                                }
                                i37++;
                                P p13 = (P) hashMap.get(Integer.valueOf(w11.f22580c));
                                if (p13 != null) {
                                    i26 = p13.f22535c;
                                } else {
                                    i26 = w11.f22581d;
                                }
                                i35 += i26;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList5;
                                c1730p03 = c1730p02;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i25;
                                size3 = i24;
                                arrayList3 = arrayList2;
                            }
                        }
                    }
                    i36++;
                    hashSet2 = hashSet;
                }
                arrayList = arrayList3;
                c1905b.g();
                if (list.size() > 0) {
                    M0 m05 = rVar3.f22686F;
                    c1905b.f23812f = (m05.f22515h - c1905b.f23807a.f22686F.f22514g) + c1905b.f23812f;
                    m05.m();
                }
                i10 = rVar3.f22705j;
                while (true) {
                    m02 = rVar3.f22686F;
                    if (m02.f22517j > 0 && (i23 = m02.f22514g) != m02.f22515h) {
                        r rVar4 = rVar3;
                        H();
                        c1905b.i(i10, rVar4.f22686F.l());
                        ArrayList arrayList6 = arrayList;
                        AbstractC1734s.h(arrayList6, i23, rVar4.f22686F.f22514g);
                        rVar3 = rVar4;
                        arrayList = arrayList6;
                    }
                }
                z11 = rVar3.f22695O;
                int i45 = -1;
                if (!z11) {
                    if (z10) {
                        C1906c c1906c2 = rVar3.f22694N;
                        C1903I c1903i = c1906c2.f23820b;
                        if (c1903i.e()) {
                            if (!c1903i.d()) {
                                AbstractC1901G[] abstractC1901GArr = c1903i.f23798a;
                                int i46 = c1903i.f23799b - 1;
                                c1903i.f23799b = i46;
                                AbstractC1901G abstractC1901G = abstractC1901GArr[i46];
                                AbstractC3557B.Z(abstractC1901G);
                                c1903i.f23798a[c1903i.f23799b] = null;
                                C1903I c1903i2 = c1906c2.f23819a;
                                c1903i2.h(abstractC1901G);
                                int i47 = c1903i.f23803f;
                                int i48 = c1903i2.f23803f;
                                int i49 = 0;
                                while (true) {
                                    i21 = abstractC1901G.f23793b;
                                    if (i49 >= i21) {
                                        break;
                                    }
                                    i48--;
                                    i47--;
                                    Object[] objArr3 = c1903i2.f23802e;
                                    Object[] objArr4 = c1903i.f23802e;
                                    objArr3[i48] = objArr4[i47];
                                    objArr4[i47] = null;
                                    i49++;
                                }
                                int i50 = c1903i.f23801d;
                                int i51 = c1903i2.f23801d;
                                int i52 = 0;
                                while (true) {
                                    i22 = abstractC1901G.f23792a;
                                    if (i52 >= i22) {
                                        break;
                                    }
                                    i51--;
                                    i50--;
                                    int[] iArr4 = c1903i2.f23800c;
                                    int[] iArr5 = c1903i.f23800c;
                                    iArr4[i51] = iArr5[i50];
                                    iArr5[i50] = 0;
                                    i52++;
                                }
                                c1903i.f23803f -= i21;
                                c1903i.f23801d -= i22;
                                i33 = 1;
                            } else {
                                throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                            }
                        } else {
                            AbstractC1734s.j("Cannot end node insertion, there are no pending operations that can be realized.".toString());
                            throw null;
                        }
                    }
                    M0 m06 = rVar3.f22686F;
                    int i53 = m06.f22517j;
                    if (i53 > 0) {
                        m06.f22517j = i53 - 1;
                        Q0 q05 = rVar3.f22688H;
                        int i54 = q05.f22562t;
                        q05.i();
                        if (rVar3.f22686F.f22517j > 0) {
                            rVar2 = rVar3;
                            z12 = z11;
                        } else {
                            int i55 = (-2) - i54;
                            rVar3.f22688H.j();
                            rVar3.f22688H.e();
                            C1705d c1705d = rVar3.f22693M;
                            if (rVar3.f22694N.f23819a.d()) {
                                N0 n04 = rVar3.f22687G;
                                c1905b.f();
                                c1905b.h(false);
                                M0 m07 = c1905b.f23807a.f22686F;
                                z12 = z11;
                                if (m07.f22510c > 0) {
                                    int i56 = m07.f22516i;
                                    i13 = i33;
                                    T t10 = c1905b.f23810d;
                                    i12 = i55;
                                    int i57 = t10.f22569b;
                                    if (i57 > 0) {
                                        i20 = t10.f22568a[i57 - 1];
                                    } else {
                                        i20 = -2;
                                    }
                                    if (i20 != i56) {
                                        if (!c1905b.f23809c && c1905b.f23811e) {
                                            c1905b.h(false);
                                            C1904a c1904a = c1905b.f23808b;
                                            c1904a.getClass();
                                            c1904a.f23806a.g(a0.o.f23832c);
                                            c1905b.f23809c = true;
                                        }
                                        if (i56 > 0) {
                                            C1705d a11 = m07.a(i56);
                                            t10.b(i56);
                                            c1905b.h(false);
                                            C1904a c1904a2 = c1905b.f23808b;
                                            c1904a2.getClass();
                                            a0.n nVar = a0.n.f23831c;
                                            C1903I c1903i3 = c1904a2.f23806a;
                                            c1903i3.h(nVar);
                                            AbstractC4828h.m0(c1903i3, 0, a11);
                                            int i58 = c1903i3.f23804g;
                                            int i59 = nVar.f23792a;
                                            int a12 = C1903I.a(c1903i3, i59);
                                            n03 = n04;
                                            int i60 = nVar.f23793b;
                                            if (i58 == a12 && c1903i3.f23805h == C1903I.a(c1903i3, i60)) {
                                                c1905b.f23809c = true;
                                                C1904a c1904a3 = c1905b.f23808b;
                                                c1904a3.getClass();
                                                qVar = a0.q.f23834c;
                                                C1903I c1903i4 = c1904a3.f23806a;
                                                c1903i4.h(qVar);
                                                AbstractC4828h.m0(c1903i4, 0, c1705d);
                                                AbstractC4828h.m0(c1903i4, 1, n03);
                                                i15 = c1903i4.f23804g;
                                                i16 = qVar.f23792a;
                                                a5 = C1903I.a(c1903i4, i16);
                                                i17 = qVar.f23793b;
                                                if (i15 != a5 && c1903i4.f23805h == C1903I.a(c1903i4, i17)) {
                                                    z13 = false;
                                                    rVar2 = this;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    int i61 = 0;
                                                    for (i18 = 0; i18 < i16; i18++) {
                                                        if (((1 << i18) & c1903i4.f23804g) != 0) {
                                                            if (i61 > 0) {
                                                                sb2.append(", ");
                                                            }
                                                            sb2.append(qVar.b(i18));
                                                            i61++;
                                                        }
                                                    }
                                                    String sb3 = sb2.toString();
                                                    StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                                                    i19 = 0;
                                                    int i62 = 0;
                                                    while (i19 < i17) {
                                                        int i63 = i17;
                                                        if (((1 << i19) & c1903i4.f23805h) != 0) {
                                                            if (i61 > 0) {
                                                                u10.append(", ");
                                                            }
                                                            u10.append(qVar.c(i19));
                                                            i62++;
                                                        }
                                                        i19++;
                                                        i17 = i63;
                                                    }
                                                    String sb4 = u10.toString();
                                                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                                                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                                                    sb5.append(qVar);
                                                    sb5.append(". Not all arguments were provided. Missing ");
                                                    android.gov.nist.core.a.x(sb5, i61, " int arguments (", sb3, ") and ");
                                                    throw new IllegalStateException(R.a.s(sb5, i62, " object arguments (", sb4, ").").toString());
                                                }
                                            } else {
                                                int i64 = 1;
                                                StringBuilder sb6 = new StringBuilder();
                                                int i65 = 0;
                                                int i66 = 0;
                                                while (i65 < i59) {
                                                    if (((i64 << i65) & c1903i3.f23804g) != 0) {
                                                        if (i66 > 0) {
                                                            sb6.append(", ");
                                                        }
                                                        sb6.append(nVar.b(i65));
                                                        i66++;
                                                    }
                                                    i65++;
                                                    i64 = 1;
                                                }
                                                String sb7 = sb6.toString();
                                                StringBuilder u11 = R.a.u("StringBuilder().apply(builderAction).toString()", sb7);
                                                int i67 = 0;
                                                int i68 = 0;
                                                while (i67 < i60) {
                                                    int i69 = i60;
                                                    if (((1 << i67) & c1903i3.f23805h) != 0) {
                                                        if (i66 > 0) {
                                                            u11.append(", ");
                                                        }
                                                        u11.append(nVar.c(i67));
                                                        i68++;
                                                    }
                                                    i67++;
                                                    i60 = i69;
                                                }
                                                String sb8 = u11.toString();
                                                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb8);
                                                StringBuilder sb9 = new StringBuilder("Error while pushing ");
                                                sb9.append(nVar);
                                                sb9.append(". Not all arguments were provided. Missing ");
                                                android.gov.nist.core.a.x(sb9, i66, " int arguments (", sb7, ") and ");
                                                throw new IllegalStateException(R.a.s(sb9, i68, " object arguments (", sb8, ").").toString());
                                            }
                                        }
                                    }
                                } else {
                                    i13 = i33;
                                    i12 = i55;
                                }
                                n03 = n04;
                                C1904a c1904a32 = c1905b.f23808b;
                                c1904a32.getClass();
                                qVar = a0.q.f23834c;
                                C1903I c1903i42 = c1904a32.f23806a;
                                c1903i42.h(qVar);
                                AbstractC4828h.m0(c1903i42, 0, c1705d);
                                AbstractC4828h.m0(c1903i42, 1, n03);
                                i15 = c1903i42.f23804g;
                                i16 = qVar.f23792a;
                                a5 = C1903I.a(c1903i42, i16);
                                i17 = qVar.f23793b;
                                if (i15 != a5) {
                                }
                                StringBuilder sb22 = new StringBuilder();
                                int i612 = 0;
                                while (i18 < i16) {
                                }
                                String sb32 = sb22.toString();
                                StringBuilder u102 = R.a.u("StringBuilder().apply(builderAction).toString()", sb32);
                                i19 = 0;
                                int i622 = 0;
                                while (i19 < i17) {
                                }
                                String sb42 = u102.toString();
                                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb42);
                                StringBuilder sb52 = new StringBuilder("Error while pushing ");
                                sb52.append(qVar);
                                sb52.append(". Not all arguments were provided. Missing ");
                                android.gov.nist.core.a.x(sb52, i612, " int arguments (", sb32, ") and ");
                                throw new IllegalStateException(R.a.s(sb52, i622, " object arguments (", sb42, ").").toString());
                            }
                            i13 = i33;
                            z12 = z11;
                            i12 = i55;
                            N0 n05 = rVar3.f22687G;
                            C1906c c1906c3 = rVar3.f22694N;
                            c1905b.f();
                            c1905b.h(false);
                            M0 m08 = c1905b.f23807a.f22686F;
                            if (m08.f22510c > 0) {
                                int i70 = m08.f22516i;
                                T t11 = c1905b.f23810d;
                                int i71 = t11.f22569b;
                                c1906c = c1906c3;
                                if (i71 > 0) {
                                    i14 = t11.f22568a[i71 - 1];
                                } else {
                                    i14 = -2;
                                }
                                if (i14 != i70) {
                                    if (!c1905b.f23809c && c1905b.f23811e) {
                                        c1905b.h(false);
                                        C1904a c1904a4 = c1905b.f23808b;
                                        c1904a4.getClass();
                                        c1904a4.f23806a.g(a0.o.f23832c);
                                        c1905b.f23809c = true;
                                    }
                                    if (i70 > 0) {
                                        C1705d a13 = m08.a(i70);
                                        t11.b(i70);
                                        c1905b.h(false);
                                        C1904a c1904a5 = c1905b.f23808b;
                                        c1904a5.getClass();
                                        a0.n nVar2 = a0.n.f23831c;
                                        C1903I c1903i5 = c1904a5.f23806a;
                                        c1903i5.h(nVar2);
                                        AbstractC4828h.m0(c1903i5, 0, a13);
                                        int i72 = c1903i5.f23804g;
                                        int i73 = nVar2.f23792a;
                                        int a14 = C1903I.a(c1903i5, i73);
                                        n02 = n05;
                                        int i74 = nVar2.f23793b;
                                        if (i72 == a14 && c1903i5.f23805h == C1903I.a(c1903i5, i74)) {
                                            c1905b.f23809c = true;
                                        } else {
                                            int i75 = 1;
                                            StringBuilder sb10 = new StringBuilder();
                                            int i76 = 0;
                                            int i77 = 0;
                                            while (i76 < i73) {
                                                if (((i75 << i76) & c1903i5.f23804g) != 0) {
                                                    if (i77 > 0) {
                                                        sb10.append(", ");
                                                    }
                                                    sb10.append(nVar2.b(i76));
                                                    i77++;
                                                }
                                                i76++;
                                                i75 = 1;
                                            }
                                            String sb11 = sb10.toString();
                                            StringBuilder u12 = R.a.u("StringBuilder().apply(builderAction).toString()", sb11);
                                            int i78 = 0;
                                            int i79 = 0;
                                            while (i79 < i74) {
                                                int i80 = i74;
                                                if (((1 << i79) & c1903i5.f23805h) != 0) {
                                                    if (i77 > 0) {
                                                        u12.append(", ");
                                                    }
                                                    u12.append(nVar2.c(i79));
                                                    i78++;
                                                }
                                                i79++;
                                                i74 = i80;
                                            }
                                            String sb12 = u12.toString();
                                            AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb12);
                                            StringBuilder sb13 = new StringBuilder("Error while pushing ");
                                            sb13.append(nVar2);
                                            sb13.append(". Not all arguments were provided. Missing ");
                                            android.gov.nist.core.a.x(sb13, i77, " int arguments (", sb11, ") and ");
                                            throw new IllegalStateException(R.a.s(sb13, i78, " object arguments (", sb12, ").").toString());
                                        }
                                    }
                                }
                                n02 = n05;
                            } else {
                                n02 = n05;
                                c1906c = c1906c3;
                            }
                            C1904a c1904a6 = c1905b.f23808b;
                            c1904a6.getClass();
                            a0.r rVar5 = a0.r.f23835c;
                            C1903I c1903i6 = c1904a6.f23806a;
                            c1903i6.h(rVar5);
                            AbstractC4828h.m0(c1903i6, 0, c1705d);
                            AbstractC4828h.m0(c1903i6, 1, n02);
                            AbstractC4828h.m0(c1903i6, 2, c1906c);
                            int i81 = c1903i6.f23804g;
                            int i82 = rVar5.f23792a;
                            int a15 = C1903I.a(c1903i6, i82);
                            int i83 = rVar5.f23793b;
                            if (i81 == a15 && c1903i6.f23805h == C1903I.a(c1903i6, i83)) {
                                rVar2 = this;
                                rVar2.f22694N = new C1906c();
                                z13 = false;
                            } else {
                                StringBuilder sb14 = new StringBuilder();
                                int i84 = 0;
                                int i85 = 0;
                                while (i84 < i82) {
                                    int i86 = i82;
                                    if (((1 << i84) & c1903i6.f23804g) != 0) {
                                        if (i85 > 0) {
                                            sb14.append(", ");
                                        }
                                        sb14.append(rVar5.b(i84));
                                        i85++;
                                    }
                                    i84++;
                                    i82 = i86;
                                }
                                String sb15 = sb14.toString();
                                StringBuilder u13 = R.a.u("StringBuilder().apply(builderAction).toString()", sb15);
                                int i87 = 0;
                                int i88 = 0;
                                while (i87 < i83) {
                                    int i89 = i83;
                                    if (((1 << i87) & c1903i6.f23805h) != 0) {
                                        if (i85 > 0) {
                                            u13.append(", ");
                                        }
                                        u13.append(rVar5.c(i87));
                                        i88++;
                                    }
                                    i87++;
                                    i83 = i89;
                                }
                                String sb16 = u13.toString();
                                AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb16);
                                StringBuilder sb17 = new StringBuilder("Error while pushing ");
                                sb17.append(rVar5);
                                sb17.append(". Not all arguments were provided. Missing ");
                                android.gov.nist.core.a.x(sb17, i85, " int arguments (", sb15, ") and ");
                                throw new IllegalStateException(R.a.s(sb17, i88, " object arguments (", sb16, ").").toString());
                            }
                            rVar2.f22695O = z13;
                            if (rVar2.f22698c.f22521Z == 0) {
                                i33 = i13;
                            } else {
                                int i90 = i12;
                                int i91 = z13 ? 1 : 0;
                                int i92 = z13 ? 1 : 0;
                                rVar2.e0(i90, i91);
                                i33 = i13;
                                rVar2.f0(i90, i33);
                            }
                        }
                        rVar = rVar2;
                    } else {
                        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
                    }
                } else {
                    z12 = z11;
                    if (z10) {
                        c1905b.e();
                    }
                    int i93 = c1905b.f23807a.f22686F.f22516i;
                    T t12 = c1905b.f23810d;
                    int i94 = t12.f22569b;
                    if (i94 > 0) {
                        i11 = t12.f22568a[i94 - 1];
                    } else {
                        i11 = -1;
                    }
                    if (i11 <= i93) {
                        if (i94 > 0) {
                            i45 = t12.f22568a[i94 - 1];
                        }
                        if (i45 == i93) {
                            c1905b.h(false);
                            t12.a();
                            C1904a c1904a7 = c1905b.f23808b;
                            c1904a7.getClass();
                            c1904a7.f23806a.g(a0.l.f23829c);
                        }
                        rVar = this;
                        int i95 = rVar.f22686F.f22516i;
                        if (i33 != rVar.j0(i95)) {
                            rVar.f0(i95, i33);
                        }
                        if (z10) {
                            i33 = 1;
                        }
                        rVar.f22686F.d();
                        c1905b.g();
                    } else {
                        AbstractC1734s.j("Missed recording an endGroup".toString());
                        throw null;
                    }
                }
                ArrayList arrayList7 = rVar.f22703h.f22652a;
                c1730p0 = (C1730p0) arrayList7.remove(arrayList7.size() - 1);
                if (c1730p0 != null && !z12) {
                    c1730p0.f22675c++;
                }
                rVar.f22704i = c1730p0;
                rVar.f22705j = rVar.f22706k.a() + i33;
                rVar.f22707l = rVar.f22708m.a() + i33;
            }
        }
        arrayList = arrayList3;
        i10 = rVar3.f22705j;
        while (true) {
            m02 = rVar3.f22686F;
            if (m02.f22517j > 0) {
                break;
            }
            r rVar42 = rVar3;
            H();
            c1905b.i(i10, rVar42.f22686F.l());
            ArrayList arrayList62 = arrayList;
            AbstractC1734s.h(arrayList62, i23, rVar42.f22686F.f22514g);
            rVar3 = rVar42;
            arrayList = arrayList62;
        }
        z11 = rVar3.f22695O;
        int i452 = -1;
        if (!z11) {
        }
        ArrayList arrayList72 = rVar.f22703h.f22652a;
        c1730p0 = (C1730p0) arrayList72.remove(arrayList72.size() - 1);
        if (c1730p0 != null) {
            c1730p0.f22675c++;
        }
        rVar.f22704i = c1730p0;
        rVar.f22705j = rVar.f22706k.a() + i33;
        rVar.f22707l = rVar.f22708m.a() + i33;
    }

    public final void u() {
        t(false);
        C1741v0 z10 = z();
        if (z10 != null) {
            int i10 = z10.f22736a;
            if ((i10 & 1) != 0) {
                z10.f22736a = i10 | 2;
            }
        }
    }

    public final C1741v0 v() {
        C1741v0 c1741v0;
        C1741v0 c1741v02;
        boolean z10;
        C1705d c1705d;
        A.a1 a1Var;
        k1 k1Var = this.f22684D;
        if (!k1Var.f22652a.isEmpty()) {
            ArrayList arrayList = k1Var.f22652a;
            c1741v0 = (C1741v0) arrayList.remove(arrayList.size() - 1);
        } else {
            c1741v0 = null;
        }
        if (c1741v0 != null) {
            c1741v0.f22736a &= -9;
        }
        if (c1741v0 != null) {
            int i10 = this.f22681A;
            C6072s c6072s = c1741v0.f22741f;
            if (c6072s != null && (c1741v0.f22736a & 16) == 0) {
                Object[] objArr = c6072s.f47626b;
                int[] iArr = c6072s.f47627c;
                long[] jArr = c6072s.f47625a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    loop0: while (true) {
                        long j6 = jArr[i11];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j6 & 255) < 128) {
                                    int i14 = (i11 << 3) + i13;
                                    Object obj = objArr[i14];
                                    if (iArr[i14] != i10) {
                                        a1Var = new A.a1(c1741v0, i10, c6072s, 2);
                                        break loop0;
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            a1Var = null;
            if (a1Var != null) {
                C1904a c1904a = this.f22692L.f23808b;
                c1904a.getClass();
                a0.k kVar = a0.k.f23828c;
                C1903I c1903i = c1904a.f23806a;
                c1903i.h(kVar);
                AbstractC4828h.m0(c1903i, 0, a1Var);
                AbstractC4828h.m0(c1903i, 1, this.f22702g);
                int i15 = c1903i.f23804g;
                int i16 = kVar.f23792a;
                int a5 = C1903I.a(c1903i, i16);
                int i17 = kVar.f23793b;
                if (i15 != a5 || c1903i.f23805h != C1903I.a(c1903i, i17)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i18 = 0;
                    for (int i19 = 0; i19 < i16; i19++) {
                        if ((c1903i.f23804g & (1 << i19)) != 0) {
                            if (i18 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(kVar.b(i19));
                            i18++;
                        }
                    }
                    String sb3 = sb2.toString();
                    StringBuilder u10 = R.a.u("StringBuilder().apply(builderAction).toString()", sb3);
                    int i20 = 0;
                    for (int i21 = 0; i21 < i17; i21++) {
                        if ((c1903i.f23805h & (1 << i21)) != 0) {
                            if (i18 > 0) {
                                u10.append(", ");
                            }
                            u10.append(kVar.c(i21));
                            i20++;
                        }
                    }
                    String sb4 = u10.toString();
                    AbstractC3557B.b0("StringBuilder().apply(builderAction).toString()", sb4);
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(kVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    android.gov.nist.core.a.x(sb5, i18, " int arguments (", sb3, ") and ");
                    throw new IllegalStateException(R.a.s(sb5, i20, " object arguments (", sb4, ").").toString());
                }
            }
        }
        if (c1741v0 != null) {
            int i22 = c1741v0.f22736a;
            if ((i22 & 16) == 0 && ((i22 & 1) != 0 || this.f22711p)) {
                if (c1741v0.f22738c == null) {
                    if (this.f22695O) {
                        Q0 q02 = this.f22688H;
                        c1705d = q02.b(q02.f22562t);
                    } else {
                        M0 m02 = this.f22686F;
                        c1705d = m02.a(m02.f22516i);
                    }
                    c1741v0.f22738c = c1705d;
                }
                c1741v0.f22736a &= -5;
                c1741v02 = c1741v0;
                z10 = false;
                t(z10);
                return c1741v02;
            }
        }
        z10 = false;
        c1741v02 = null;
        t(z10);
        return c1741v02;
    }

    public final void w() {
        if (this.f22719x && this.f22686F.f22516i == this.f22720y) {
            this.f22720y = -1;
            this.f22719x = false;
        }
        t(false);
    }

    public final void x() {
        boolean z10 = false;
        t(false);
        this.f22697b.b();
        t(false);
        C1905b c1905b = this.f22692L;
        if (c1905b.f23809c) {
            c1905b.h(false);
            c1905b.h(false);
            C1904a c1904a = c1905b.f23808b;
            c1904a.getClass();
            c1904a.f23806a.g(a0.l.f23829c);
            c1905b.f23809c = false;
        }
        c1905b.f();
        if (c1905b.f23810d.f22569b == 0) {
            z10 = true;
        }
        if (z10) {
            if (this.f22703h.f22652a.isEmpty()) {
                j();
                this.f22686F.c();
                return;
            }
            AbstractC1734s.j("Start/end imbalance".toString());
            throw null;
        }
        AbstractC1734s.j("Missed recording an endGroup()".toString());
        throw null;
    }

    public final void y(boolean z10, C1730p0 c1730p0) {
        this.f22703h.f22652a.add(this.f22704i);
        this.f22704i = c1730p0;
        this.f22706k.b(this.f22705j);
        if (z10) {
            this.f22705j = 0;
        }
        this.f22708m.b(this.f22707l);
        this.f22707l = 0;
    }

    public final C1741v0 z() {
        if (this.f22721z == 0) {
            k1 k1Var = this.f22684D;
            if (!k1Var.f22652a.isEmpty()) {
                ArrayList arrayList = k1Var.f22652a;
                return (C1741v0) arrayList.get(arrayList.size() - 1);
            }
        }
        return null;
    }
}
