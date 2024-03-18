package Z;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public final N0 f22543a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f22544b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f22545c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f22546d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f22547e;

    /* renamed from: f  reason: collision with root package name */
    public int f22548f;

    /* renamed from: g  reason: collision with root package name */
    public int f22549g;

    /* renamed from: h  reason: collision with root package name */
    public int f22550h;

    /* renamed from: i  reason: collision with root package name */
    public int f22551i;

    /* renamed from: j  reason: collision with root package name */
    public int f22552j;

    /* renamed from: k  reason: collision with root package name */
    public int f22553k;

    /* renamed from: l  reason: collision with root package name */
    public int f22554l;

    /* renamed from: m  reason: collision with root package name */
    public int f22555m;

    /* renamed from: n  reason: collision with root package name */
    public int f22556n;

    /* renamed from: r  reason: collision with root package name */
    public int f22560r;

    /* renamed from: s  reason: collision with root package name */
    public int f22561s;

    /* renamed from: u  reason: collision with root package name */
    public boolean f22563u;

    /* renamed from: v  reason: collision with root package name */
    public C4.c f22564v;

    /* renamed from: o  reason: collision with root package name */
    public final T f22557o = new T();

    /* renamed from: p  reason: collision with root package name */
    public final T f22558p = new T();

    /* renamed from: q  reason: collision with root package name */
    public final T f22559q = new T();

    /* renamed from: t  reason: collision with root package name */
    public int f22562t = -1;

    public Q0(N0 n02) {
        this.f22543a = n02;
        int[] iArr = n02.f22520Y;
        this.f22544b = iArr;
        Object[] objArr = n02.f22522h0;
        this.f22545c = objArr;
        this.f22546d = n02.f22527m0;
        this.f22547e = n02.f22528n0;
        int i10 = n02.f22521Z;
        this.f22548f = i10;
        this.f22549g = (iArr.length / 5) - i10;
        int i11 = n02.f22523i0;
        this.f22552j = i11;
        this.f22553k = objArr.length - i11;
        this.f22554l = i10;
        this.f22561s = i10;
    }

    public static int h(int i10, int i11, int i12, int i13) {
        if (i10 > i11) {
            return -(((i13 - i12) - i10) + 1);
        }
        return i10;
    }

    public static void t(Q0 q02) {
        int i10 = q02.f22562t;
        int o10 = q02.o(i10);
        int[] iArr = q02.f22544b;
        int i11 = (o10 * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) == 0) {
            iArr[i11] = i12 | 134217728;
            if (!M3.H.k(iArr, o10)) {
                q02.N(q02.y(q02.f22544b, i10));
            }
        }
    }

    public final boolean A() {
        if (this.f22555m == 0) {
            int i10 = this.f22560r;
            int i11 = this.f22550h;
            int E10 = E();
            H(this.f22562t);
            C4.c cVar = this.f22564v;
            if (cVar != null) {
                while (true) {
                    List list = cVar.f2667Y;
                    if (!(!list.isEmpty()) || ((Number) kf.t.f2(list)).intValue() < i10) {
                        break;
                    }
                    cVar.f();
                }
            }
            boolean B10 = B(i10, this.f22560r - i10);
            C(i11, this.f22550h - i11, i10 - 1);
            this.f22560r = i10;
            this.f22550h = i11;
            this.f22556n -= E10;
            return B10;
        }
        AbstractC1734s.j("Cannot remove group while inserting".toString());
        throw null;
    }

    public final boolean B(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f22546d;
            v(i10);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f22547e;
                int i12 = i10 + i11;
                int r10 = M3.H.r(this.f22546d, i12, m() - this.f22549g);
                if (r10 >= this.f22546d.size()) {
                    r10--;
                }
                int i13 = r10 + 1;
                int i14 = 0;
                while (r10 >= 0) {
                    C1705d c1705d = (C1705d) this.f22546d.get(r10);
                    int c10 = c(c1705d);
                    if (c10 < i10) {
                        break;
                    }
                    if (c10 < i12) {
                        c1705d.f22611a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            S s10 = (S) hashMap.remove(c1705d);
                        }
                        if (i14 == 0) {
                            i14 = r10 + 1;
                        }
                        i13 = r10;
                    }
                    r10--;
                }
                if (i13 < i14) {
                    z10 = true;
                }
                if (z10) {
                    this.f22546d.subList(i13, i14).clear();
                }
            }
            this.f22548f = i10;
            this.f22549g += i11;
            int i15 = this.f22554l;
            if (i15 > i10) {
                this.f22554l = Math.max(i10, i15 - i11);
            }
            int i16 = this.f22561s;
            if (i16 >= this.f22548f) {
                this.f22561s = i16 - i11;
            }
            int i17 = this.f22562t;
            if (i17 >= 0 && M3.H.k(this.f22544b, o(i17))) {
                N(i17);
            }
        }
        return z10;
    }

    public final void C(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f22553k;
            int i14 = i10 + i11;
            w(i14, i12);
            this.f22552j = i10;
            this.f22553k = i13 + i11;
            kf.q.d3(i10, i14, null, this.f22545c);
            int i15 = this.f22551i;
            if (i15 >= i10) {
                this.f22551i = i15 - i11;
            }
        }
    }

    public final Object D(int i10, Object obj, int i11) {
        int G10 = G(this.f22544b, o(i10));
        int f6 = f(this.f22544b, o(i10 + 1));
        int i12 = G10 + i11;
        if (i12 >= G10 && i12 < f6) {
            int g10 = g(i12);
            Object[] objArr = this.f22545c;
            Object obj2 = objArr[g10];
            objArr[g10] = obj;
            return obj2;
        }
        AbstractC1734s.j(("Write to an invalid slot index " + i11 + " for group " + i10).toString());
        throw null;
    }

    public final int E() {
        int o10 = o(this.f22560r);
        int m10 = M3.H.m(this.f22544b, o10) + this.f22560r;
        this.f22560r = m10;
        this.f22550h = f(this.f22544b, o(m10));
        if (M3.H.q(this.f22544b, o10)) {
            return 1;
        }
        return M3.H.s(this.f22544b, o10);
    }

    public final void F() {
        int i10 = this.f22561s;
        this.f22560r = i10;
        this.f22550h = f(this.f22544b, o(i10));
    }

    public final int G(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f22545c.length - this.f22553k;
        }
        int y10 = M3.H.y(iArr, i10);
        int i11 = this.f22553k;
        int length = this.f22545c.length;
        if (y10 < 0) {
            return (length - i11) + y10 + 1;
        }
        return y10;
    }

    public final S H(int i10) {
        C1705d K10;
        HashMap hashMap = this.f22547e;
        if (hashMap == null || (K10 = K(i10)) == null) {
            return null;
        }
        return (S) hashMap.get(K10);
    }

    public final void I() {
        if (this.f22555m == 0) {
            io.sentry.hints.i iVar = C1723m.f22654Y;
            J(iVar, iVar, false, 0);
            return;
        }
        AbstractC1734s.j("Key must be supplied when inserting".toString());
        throw null;
    }

    public final void J(Object obj, Object obj2, boolean z10, int i10) {
        Object[] objArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f22562t;
        int i17 = 1;
        if (this.f22555m > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        this.f22559q.b(this.f22556n);
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (objArr != null) {
            r(1);
            int i18 = this.f22560r;
            int o10 = o(i18);
            if (obj != iVar) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (z10 || obj2 == iVar) {
                i17 = 0;
            }
            int[] iArr = this.f22544b;
            int i19 = this.f22562t;
            int i20 = this.f22550h;
            if (z10) {
                i13 = 1073741824;
            } else {
                i13 = 0;
            }
            if (i12 != 0) {
                i14 = 536870912;
            } else {
                i14 = 0;
            }
            if (i17 != 0) {
                i15 = 268435456;
            } else {
                i15 = 0;
            }
            int i21 = o10 * 5;
            iArr[i21] = i10;
            iArr[i21 + 1] = i13 | i14 | i15;
            iArr[i21 + 2] = i19;
            iArr[i21 + 3] = 0;
            iArr[i21 + 4] = i20;
            this.f22551i = i20;
            int i22 = (z10 ? 1 : 0) + i12 + i17;
            if (i22 > 0) {
                s(i22, i18);
                Object[] objArr2 = this.f22545c;
                int i23 = this.f22550h;
                if (z10) {
                    objArr2[i23] = obj2;
                    i23++;
                }
                if (i12 != 0) {
                    objArr2[i23] = obj;
                    i23++;
                }
                if (i17 != 0) {
                    objArr2[i23] = obj2;
                    i23++;
                }
                this.f22550h = i23;
            }
            this.f22556n = 0;
            i11 = i18 + 1;
            this.f22562t = i18;
            this.f22560r = i11;
            if (i16 >= 0) {
                H(i16);
            }
        } else {
            this.f22557o.b(i16);
            this.f22558p.b((m() - this.f22549g) - this.f22561s);
            int i24 = this.f22560r;
            int o11 = o(i24);
            if (!AbstractC3557B.K(obj2, iVar)) {
                if (z10) {
                    O(this.f22560r, obj2);
                } else {
                    M(obj2);
                }
            }
            this.f22550h = G(this.f22544b, o11);
            this.f22551i = f(this.f22544b, o(this.f22560r + 1));
            this.f22556n = M3.H.s(this.f22544b, o11);
            this.f22562t = i24;
            this.f22560r = i24 + 1;
            i11 = i24 + M3.H.m(this.f22544b, o11);
        }
        this.f22561s = i11;
    }

    public final C1705d K(int i10) {
        ArrayList arrayList;
        int o02;
        if (i10 < 0 || i10 >= n() || (o02 = M3.H.o0((arrayList = this.f22546d), i10, n())) < 0) {
            return null;
        }
        return (C1705d) arrayList.get(o02);
    }

    public final void L(Object obj) {
        if (this.f22555m > 0) {
            s(1, this.f22562t);
        }
        Object[] objArr = this.f22545c;
        int i10 = this.f22550h;
        this.f22550h = i10 + 1;
        Object obj2 = objArr[g(i10)];
        int i11 = this.f22550h;
        if (i11 <= this.f22551i) {
            this.f22545c[g(i11 - 1)] = obj;
        } else {
            AbstractC1734s.j("Writing to an invalid slot".toString());
            throw null;
        }
    }

    public final void M(Object obj) {
        int o10 = o(this.f22560r);
        if (M3.H.n(this.f22544b, o10)) {
            Object[] objArr = this.f22545c;
            int[] iArr = this.f22544b;
            objArr[g(M3.H.H(iArr[(o10 * 5) + 1] >> 29) + f(iArr, o10))] = obj;
            return;
        }
        AbstractC1734s.j("Updating the data of a group that was not created with a data slot".toString());
        throw null;
    }

    public final void N(int i10) {
        if (i10 >= 0) {
            C4.c cVar = this.f22564v;
            if (cVar == null) {
                cVar = new C4.c();
                this.f22564v = cVar;
            }
            cVar.e(i10);
        }
    }

    public final void O(int i10, Object obj) {
        int o10 = o(i10);
        int[] iArr = this.f22544b;
        if (o10 < iArr.length && M3.H.q(iArr, o10)) {
            this.f22545c[g(f(this.f22544b, o10))] = obj;
            return;
        }
        AbstractC1734s.j(("Updating the node of a group at " + i10 + " that was not created with as a node group").toString());
        throw null;
    }

    public final void a(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f22555m <= 0) {
                if (i10 == 0) {
                    return;
                }
                int i11 = this.f22560r + i10;
                if (i11 >= this.f22562t && i11 <= this.f22561s) {
                    this.f22560r = i11;
                    int f6 = f(this.f22544b, o(i11));
                    this.f22550h = f6;
                    this.f22551i = f6;
                    return;
                }
                AbstractC1734s.j(("Cannot seek outside the current group (" + this.f22562t + '-' + this.f22561s + ')').toString());
                throw null;
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        AbstractC1734s.j("Cannot seek backwards".toString());
        throw null;
    }

    public final C1705d b(int i10) {
        ArrayList arrayList = this.f22546d;
        int o02 = M3.H.o0(arrayList, i10, n());
        if (o02 < 0) {
            if (i10 > this.f22548f) {
                i10 = -(n() - i10);
            }
            C1705d c1705d = new C1705d(i10);
            arrayList.add(-(o02 + 1), c1705d);
            return c1705d;
        }
        return (C1705d) arrayList.get(o02);
    }

    public final int c(C1705d c1705d) {
        int i10 = c1705d.f22611a;
        if (i10 < 0) {
            return i10 + n();
        }
        return i10;
    }

    public final void d() {
        int i10 = this.f22555m;
        this.f22555m = i10 + 1;
        if (i10 == 0) {
            this.f22558p.b((m() - this.f22549g) - this.f22561s);
        }
    }

    public final void e() {
        this.f22563u = true;
        if (this.f22557o.f22569b == 0) {
            v(n());
            w(this.f22545c.length - this.f22553k, this.f22548f);
            int i10 = this.f22552j;
            kf.q.d3(i10, this.f22553k + i10, null, this.f22545c);
            z();
        }
        int[] iArr = this.f22544b;
        int i11 = this.f22548f;
        Object[] objArr = this.f22545c;
        int i12 = this.f22552j;
        ArrayList arrayList = this.f22546d;
        HashMap hashMap = this.f22547e;
        N0 n02 = this.f22543a;
        n02.getClass();
        if (n02.f22525k0) {
            n02.f22525k0 = false;
            n02.f22520Y = iArr;
            n02.f22521Z = i11;
            n02.f22522h0 = objArr;
            n02.f22523i0 = i12;
            n02.f22527m0 = arrayList;
            n02.f22528n0 = hashMap;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final int f(int[] iArr, int i10) {
        if (i10 >= m()) {
            return this.f22545c.length - this.f22553k;
        }
        int l10 = M3.H.l(iArr, i10);
        int i11 = this.f22553k;
        int length = this.f22545c.length;
        if (l10 < 0) {
            return (length - i11) + l10 + 1;
        }
        return l10;
    }

    public final int g(int i10) {
        if (i10 >= this.f22552j) {
            return i10 + this.f22553k;
        }
        return i10;
    }

    public final void i() {
        boolean z10;
        int i10;
        int i11 = 1;
        int i12 = 0;
        if (this.f22555m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = this.f22560r;
        int i14 = this.f22561s;
        int i15 = this.f22562t;
        int o10 = o(i15);
        int i16 = this.f22556n;
        int i17 = i13 - i15;
        boolean q10 = M3.H.q(this.f22544b, o10);
        T t10 = this.f22559q;
        if (z10) {
            M3.H.z(o10, i17, this.f22544b);
            M3.H.A(o10, i16, this.f22544b);
            int a5 = t10.a();
            if (!q10) {
                i11 = i16;
            }
            this.f22556n = a5 + i11;
            this.f22562t = y(this.f22544b, i15);
        } else if (i13 == i14) {
            int m10 = M3.H.m(this.f22544b, o10);
            int s10 = M3.H.s(this.f22544b, o10);
            M3.H.z(o10, i17, this.f22544b);
            M3.H.A(o10, i16, this.f22544b);
            int a10 = this.f22557o.a();
            this.f22561s = (m() - this.f22549g) - this.f22558p.a();
            this.f22562t = a10;
            int y10 = y(this.f22544b, i15);
            int a11 = t10.a();
            this.f22556n = a11;
            if (y10 == a10) {
                if (!q10) {
                    i12 = i16 - s10;
                }
                this.f22556n = a11 + i12;
                return;
            }
            int i18 = i17 - m10;
            if (q10) {
                i10 = 0;
            } else {
                i10 = i16 - s10;
            }
            if (i18 != 0 || i10 != 0) {
                while (y10 != 0 && y10 != a10 && (i10 != 0 || i18 != 0)) {
                    int o11 = o(y10);
                    if (i18 != 0) {
                        M3.H.z(o11, M3.H.m(this.f22544b, o11) + i18, this.f22544b);
                    }
                    if (i10 != 0) {
                        int[] iArr = this.f22544b;
                        M3.H.A(o11, M3.H.s(iArr, o11) + i10, iArr);
                    }
                    if (M3.H.q(this.f22544b, o11)) {
                        i10 = 0;
                    }
                    y10 = y(this.f22544b, y10);
                }
            }
            this.f22556n += i10;
        } else {
            AbstractC1734s.j("Expected to be at the end of a group".toString());
            throw null;
        }
    }

    public final void j() {
        int i10 = this.f22555m;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.f22555m = i11;
            if (i11 == 0) {
                if (this.f22559q.f22569b == this.f22557o.f22569b) {
                    this.f22561s = (m() - this.f22549g) - this.f22558p.a();
                    return;
                } else {
                    AbstractC1734s.j("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void k(int i10) {
        boolean z10;
        if (this.f22555m <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = this.f22562t;
            if (i11 != i10) {
                if (i10 >= i11 && i10 < this.f22561s) {
                    int i12 = this.f22560r;
                    int i13 = this.f22550h;
                    int i14 = this.f22551i;
                    this.f22560r = i10;
                    I();
                    this.f22560r = i12;
                    this.f22550h = i13;
                    this.f22551i = i14;
                    return;
                }
                AbstractC1734s.j(("Started group at " + i10 + " must be a subgroup of the group at " + i11).toString());
                throw null;
            }
            return;
        }
        AbstractC1734s.j("Cannot call ensureStarted() while inserting".toString());
        throw null;
    }

    public final void l(int i10, int i11, int i12) {
        if (i10 >= this.f22548f) {
            i10 = -((n() - i10) + 2);
        }
        while (i12 < i11) {
            this.f22544b[(o(i12) * 5) + 2] = i10;
            int m10 = M3.H.m(this.f22544b, o(i12)) + i12;
            l(i12, m10, i12 + 1);
            i12 = m10;
        }
    }

    public final int m() {
        return this.f22544b.length / 5;
    }

    public final int n() {
        return m() - this.f22549g;
    }

    public final int o(int i10) {
        if (i10 >= this.f22548f) {
            return i10 + this.f22549g;
        }
        return i10;
    }

    public final int p(int i10) {
        return M3.H.m(this.f22544b, o(i10));
    }

    public final boolean q(int i10, int i11) {
        int i12;
        int i13;
        int p10;
        if (i11 == this.f22562t) {
            i12 = this.f22561s;
        } else {
            T t10 = this.f22557o;
            int i14 = t10.f22569b;
            if (i14 > 0) {
                i13 = t10.f22568a[i14 - 1];
            } else {
                i13 = 0;
            }
            if (i11 > i13) {
                p10 = p(i11);
            } else {
                int i15 = 0;
                while (true) {
                    if (i15 < i14) {
                        if (t10.f22568a[i15] == i11) {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                if (i15 < 0) {
                    p10 = p(i11);
                } else {
                    i12 = (m() - this.f22549g) - this.f22558p.f22568a[i15];
                }
            }
            i12 = p10 + i11;
        }
        if (i10 <= i11 || i10 >= i12) {
            return false;
        }
        return true;
    }

    public final void r(int i10) {
        int i11;
        if (i10 > 0) {
            int i12 = this.f22560r;
            v(i12);
            int i13 = this.f22548f;
            int i14 = this.f22549g;
            int[] iArr = this.f22544b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            int i16 = 0;
            if (i14 < i10) {
                int max = Math.max(Math.max(length * 2, i15 + i10), 32);
                int[] iArr2 = new int[max * 5];
                int i17 = max - i15;
                kf.q.V2(0, 0, i13 * 5, iArr, iArr2);
                kf.q.V2((i13 + i17) * 5, (i14 + i13) * 5, length * 5, iArr, iArr2);
                this.f22544b = iArr2;
                i14 = i17;
            }
            int i18 = this.f22561s;
            if (i18 >= i13) {
                this.f22561s = i18 + i10;
            }
            int i19 = i13 + i10;
            this.f22548f = i19;
            this.f22549g = i14 - i10;
            if (i15 > 0) {
                i11 = f(this.f22544b, o(i12 + i10));
            } else {
                i11 = 0;
            }
            if (this.f22554l >= i13) {
                i16 = this.f22552j;
            }
            int h10 = h(i11, i16, this.f22553k, this.f22545c.length);
            for (int i20 = i13; i20 < i19; i20++) {
                this.f22544b[(i20 * 5) + 4] = h10;
            }
            int i21 = this.f22554l;
            if (i21 >= i13) {
                this.f22554l = i21 + i10;
            }
        }
    }

    public final void s(int i10, int i11) {
        if (i10 > 0) {
            w(this.f22550h, i11);
            int i12 = this.f22552j;
            int i13 = this.f22553k;
            if (i13 < i10) {
                Object[] objArr = this.f22545c;
                int length = objArr.length;
                int i14 = length - i13;
                int max = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[max];
                for (int i15 = 0; i15 < max; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = max - i14;
                kf.q.W2(0, 0, i12, objArr, objArr2);
                kf.q.W2(i12 + i16, i13 + i12, length, objArr, objArr2);
                this.f22545c = objArr2;
                i13 = i16;
            }
            int i17 = this.f22551i;
            if (i17 >= i12) {
                this.f22551i = i17 + i10;
            }
            this.f22552j = i12 + i10;
            this.f22553k = i13 - i10;
        }
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f22560r + " end=" + this.f22561s + " size = " + n() + " gap=" + this.f22548f + '-' + (this.f22548f + this.f22549g) + ')';
    }

    public final void u(N0 n02, int i10) {
        boolean z10;
        if (this.f22555m > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1734s.o(z10);
        if (i10 == 0 && this.f22560r == 0 && this.f22543a.f22521Z == 0) {
            int m10 = M3.H.m(n02.f22520Y, i10);
            int i11 = n02.f22521Z;
            if (m10 == i11) {
                int[] iArr = this.f22544b;
                Object[] objArr = this.f22545c;
                ArrayList arrayList = this.f22546d;
                HashMap hashMap = this.f22547e;
                int[] iArr2 = n02.f22520Y;
                Object[] objArr2 = n02.f22522h0;
                int i12 = n02.f22523i0;
                HashMap hashMap2 = n02.f22528n0;
                this.f22544b = iArr2;
                this.f22545c = objArr2;
                this.f22546d = n02.f22527m0;
                this.f22548f = i11;
                this.f22549g = (iArr2.length / 5) - i11;
                this.f22552j = i12;
                this.f22553k = objArr2.length - i12;
                this.f22554l = i11;
                this.f22547e = hashMap2;
                n02.f22520Y = iArr;
                n02.f22521Z = 0;
                n02.f22522h0 = objArr;
                n02.f22523i0 = 0;
                n02.f22527m0 = arrayList;
                n02.f22528n0 = hashMap;
                return;
            }
        }
        Q0 y10 = n02.y();
        try {
            f8.e.p(y10, i10, this, true, true, false);
        } finally {
            y10.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        r2 = r8.f22544b;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        kf.q.V2(r5 + r4, r4, r6, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
        kf.q.V2(r6, r6 + r5, r4 + r5, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(int i10) {
        int i11;
        C1705d c1705d;
        int i12;
        C1705d c1705d2;
        int i13;
        int i14;
        int i15 = this.f22549g;
        int i16 = this.f22548f;
        if (i16 != i10) {
            boolean z10 = true;
            if (!this.f22546d.isEmpty()) {
                int m10 = m() - this.f22549g;
                if (i16 < i10) {
                    for (int r10 = M3.H.r(this.f22546d, i16, m10); r10 < this.f22546d.size() && (i13 = (c1705d2 = (C1705d) this.f22546d.get(r10)).f22611a) < 0 && (i14 = i13 + m10) < i10; r10++) {
                        c1705d2.f22611a = i14;
                    }
                } else {
                    for (int r11 = M3.H.r(this.f22546d, i10, m10); r11 < this.f22546d.size() && (i12 = (c1705d = (C1705d) this.f22546d.get(r11)).f22611a) >= 0; r11++) {
                        c1705d.f22611a = -(m10 - i12);
                    }
                }
            }
            if (i10 < i16) {
                i16 = i10 + i15;
            }
            int m11 = m();
            if (i16 >= m11) {
                z10 = false;
            }
            AbstractC1734s.o(z10);
            while (i16 < m11) {
                int v10 = M3.H.v(this.f22544b, i16);
                if (v10 > -2) {
                    i11 = v10;
                } else {
                    i11 = (n() + v10) - (-2);
                }
                if (i11 >= i10) {
                    i11 = -((n() - i11) - (-2));
                }
                if (i11 != v10) {
                    this.f22544b[(i16 * 5) + 2] = i11;
                }
                i16++;
                if (i16 == i10) {
                    i16 += i15;
                }
            }
        }
        this.f22548f = i10;
    }

    public final void w(int i10, int i11) {
        int i12 = this.f22553k;
        int i13 = this.f22552j;
        int i14 = this.f22554l;
        if (i13 != i10) {
            Object[] objArr = this.f22545c;
            if (i10 < i13) {
                kf.q.W2(i10 + i12, i10, i13, objArr, objArr);
            } else {
                kf.q.W2(i13, i13 + i12, i10 + i12, objArr, objArr);
            }
        }
        int min = Math.min(i11 + 1, n());
        if (i14 != min) {
            int length = this.f22545c.length - i12;
            if (min < i14) {
                int o10 = o(min);
                int o11 = o(i14);
                int i15 = this.f22548f;
                while (o10 < o11) {
                    int l10 = M3.H.l(this.f22544b, o10);
                    if (l10 >= 0) {
                        this.f22544b[(o10 * 5) + 4] = -((length - l10) + 1);
                        o10++;
                        if (o10 == i15) {
                            o10 += this.f22549g;
                        }
                    } else {
                        AbstractC1734s.j("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int o12 = o(i14);
                int o13 = o(min);
                while (o12 < o13) {
                    int l11 = M3.H.l(this.f22544b, o12);
                    if (l11 < 0) {
                        this.f22544b[(o12 * 5) + 4] = l11 + length + 1;
                        o12++;
                        if (o12 == this.f22548f) {
                            o12 += this.f22549g;
                        }
                    } else {
                        AbstractC1734s.j("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.f22554l = min;
        }
        this.f22552j = i10;
    }

    public final Object x(int i10) {
        int o10 = o(i10);
        if (M3.H.q(this.f22544b, o10)) {
            return this.f22545c[g(f(this.f22544b, o10))];
        }
        return null;
    }

    public final int y(int[] iArr, int i10) {
        int v10 = M3.H.v(iArr, o(i10));
        if (v10 <= -2) {
            return n() + v10 + 2;
        }
        return v10;
    }

    public final void z() {
        boolean z10;
        C4.c cVar = this.f22564v;
        if (cVar != null) {
            while (!cVar.f2667Y.isEmpty()) {
                int f6 = cVar.f();
                int o10 = o(f6);
                int i10 = f6 + 1;
                int p10 = p(f6) + f6;
                while (true) {
                    if (i10 < p10) {
                        if ((this.f22544b[(o(i10) * 5) + 1] & 201326592) != 0) {
                            z10 = true;
                            break;
                        }
                        i10 += p(i10);
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (M3.H.k(this.f22544b, o10) != z10) {
                    int[] iArr = this.f22544b;
                    int i11 = (o10 * 5) + 1;
                    if (z10) {
                        iArr[i11] = iArr[i11] | 67108864;
                    } else {
                        iArr[i11] = iArr[i11] & (-67108865);
                    }
                    int y10 = y(iArr, f6);
                    if (y10 >= 0) {
                        cVar.e(y10);
                    }
                }
            }
        }
    }
}
