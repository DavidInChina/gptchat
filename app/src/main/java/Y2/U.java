package y2;

import E2.C0492y;
import android.util.Pair;
import p2.C5048a;
import p2.C5049b;
import z2.AbstractC6756a;

/* loaded from: classes2.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final p2.e0 f50481a = new p2.e0();

    /* renamed from: b  reason: collision with root package name */
    public final p2.f0 f50482b = new p2.f0();

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC6756a f50483c;

    /* renamed from: d  reason: collision with root package name */
    public final s2.j f50484d;

    /* renamed from: e  reason: collision with root package name */
    public long f50485e;

    /* renamed from: f  reason: collision with root package name */
    public int f50486f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f50487g;

    /* renamed from: h  reason: collision with root package name */
    public S f50488h;

    /* renamed from: i  reason: collision with root package name */
    public S f50489i;

    /* renamed from: j  reason: collision with root package name */
    public S f50490j;

    /* renamed from: k  reason: collision with root package name */
    public int f50491k;

    /* renamed from: l  reason: collision with root package name */
    public Object f50492l;

    /* renamed from: m  reason: collision with root package name */
    public long f50493m;

    public U(AbstractC6756a abstractC6756a, s2.y yVar) {
        this.f50483c = abstractC6756a;
        this.f50484d = yVar;
    }

    public static C0492y m(p2.g0 g0Var, Object obj, long j6, long j10, p2.f0 f0Var, p2.e0 e0Var) {
        int i10;
        g0Var.i(obj, e0Var);
        g0Var.p(e0Var.f42024h0, f0Var);
        int c10 = g0Var.c(obj);
        Object obj2 = obj;
        while (true) {
            int i11 = e0Var.f42028l0.f41989Z;
            if (i11 == 0) {
                break;
            }
            if ((i11 == 1 && e0Var.i(0)) || !e0Var.j(e0Var.f42028l0.f41992j0)) {
                break;
            }
            long j11 = 0;
            if (e0Var.d(0L) != -1) {
                break;
            }
            if (e0Var.f42025i0 != 0) {
                if (e0Var.i(i11 - 1)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                int i12 = i11 - i10;
                for (int i13 = 0; i13 <= i12; i13++) {
                    j11 += e0Var.f42028l0.b(i13).f41974l0;
                }
                if (e0Var.f42025i0 > j11) {
                    break;
                }
            }
            if (c10 > f0Var.f42060u0) {
                break;
            }
            g0Var.h(c10, e0Var, true);
            obj2 = e0Var.f42023Z;
            obj2.getClass();
            c10++;
        }
        g0Var.i(obj2, e0Var);
        int d10 = e0Var.d(j6);
        if (d10 == -1) {
            return new C0492y(obj2, j10, e0Var.c(j6));
        }
        return new C0492y(d10, e0Var.g(d10), -1, j10, obj2);
    }

    public final S a() {
        S s10 = this.f50488h;
        if (s10 == null) {
            return null;
        }
        if (s10 == this.f50489i) {
            this.f50489i = s10.f50468l;
        }
        s10.g();
        int i10 = this.f50491k - 1;
        this.f50491k = i10;
        if (i10 == 0) {
            this.f50490j = null;
            S s11 = this.f50488h;
            this.f50492l = s11.f50458b;
            this.f50493m = s11.f50462f.f50472a.f4423d;
        }
        this.f50488h = this.f50488h.f50468l;
        k();
        return this.f50488h;
    }

    public final void b() {
        if (this.f50491k == 0) {
            return;
        }
        S s10 = this.f50488h;
        Gi.e.o(s10);
        this.f50492l = s10.f50458b;
        this.f50493m = s10.f50462f.f50472a.f4423d;
        while (s10 != null) {
            s10.g();
            s10 = s10.f50468l;
        }
        this.f50488h = null;
        this.f50490j = null;
        this.f50489i = null;
        this.f50491k = 0;
        k();
    }

    public final T c(p2.g0 g0Var, S s10, long j6) {
        long j10;
        long j11;
        long j12;
        Object obj;
        T t10;
        long j13;
        long j14;
        T t11 = s10.f50462f;
        int e10 = g0Var.e(g0Var.c(t11.f50472a.f4420a), this.f50481a, this.f50482b, this.f50486f, this.f50487g);
        if (e10 == -1) {
            return null;
        }
        p2.e0 e0Var = this.f50481a;
        boolean z10 = true;
        int i10 = g0Var.h(e10, e0Var, true).f42024h0;
        Object obj2 = e0Var.f42023Z;
        obj2.getClass();
        C0492y c0492y = t11.f50472a;
        long j15 = c0492y.f4423d;
        if (g0Var.o(i10, this.f50482b, 0L).f42059t0 == e10) {
            Pair l10 = g0Var.l(this.f50482b, this.f50481a, i10, -9223372036854775807L, Math.max(0L, j6));
            if (l10 == null) {
                return null;
            }
            Object obj3 = l10.first;
            long longValue = ((Long) l10.second).longValue();
            S s11 = s10.f50468l;
            if (s11 != null && s11.f50458b.equals(obj3)) {
                j14 = s11.f50462f.f50472a.f4423d;
            } else {
                j14 = this.f50485e;
                this.f50485e = 1 + j14;
            }
            t10 = t11;
            j11 = longValue;
            j10 = -9223372036854775807L;
            j12 = j14;
            obj = obj3;
        } else {
            t10 = t11;
            j11 = 0;
            j10 = 0;
            j12 = j15;
            obj = obj2;
        }
        C0492y m10 = m(g0Var, obj, j11, j12, this.f50482b, this.f50481a);
        if (j10 != -9223372036854775807L) {
            long j16 = t10.f50474c;
            if (j16 != -9223372036854775807L) {
                int i11 = g0Var.i(c0492y.f4420a, e0Var).f42028l0.f41989Z;
                int i12 = e0Var.f42028l0.f41992j0;
                if (i11 <= 0 || !e0Var.j(i12) || (i11 <= 1 && e0Var.e(i12) == Long.MIN_VALUE)) {
                    z10 = false;
                }
                if (m10.b() && z10) {
                    j13 = j16;
                    return e(g0Var, m10, j13, j11);
                } else if (z10) {
                    j11 = j16;
                }
            }
        }
        j13 = j10;
        return e(g0Var, m10, j13, j11);
    }

    public final T d(p2.g0 g0Var, S s10, long j6) {
        boolean z10;
        long j10;
        long j11;
        T t10 = s10.f50462f;
        long j12 = (s10.f50471o + t10.f50476e) - j6;
        if (t10.f50478g) {
            return c(g0Var, s10, j12);
        }
        C0492y c0492y = t10.f50472a;
        Object obj = c0492y.f4420a;
        p2.e0 e0Var = this.f50481a;
        g0Var.i(obj, e0Var);
        boolean b10 = c0492y.b();
        Object obj2 = c0492y.f4420a;
        if (b10) {
            C5049b c5049b = e0Var.f42028l0;
            int i10 = c0492y.f4421b;
            int i11 = c5049b.b(i10).f41969Z;
            if (i11 != -1) {
                int b11 = e0Var.f42028l0.b(i10).b(c0492y.f4422c);
                if (b11 < i11) {
                    return f(g0Var, c0492y.f4420a, i10, b11, t10.f50474c, c0492y.f4423d);
                }
                long j13 = t10.f50474c;
                if (j13 == -9223372036854775807L) {
                    Pair l10 = g0Var.l(this.f50482b, e0Var, e0Var.f42024h0, -9223372036854775807L, Math.max(0L, j12));
                    if (l10 != null) {
                        j13 = ((Long) l10.second).longValue();
                    }
                }
                g0Var.i(obj2, e0Var);
                int i12 = c0492y.f4421b;
                long e10 = e0Var.e(i12);
                if (e10 == Long.MIN_VALUE) {
                    j11 = e0Var.f42025i0;
                } else {
                    j11 = e0Var.f42028l0.b(i12).f41974l0 + e10;
                }
                return g(g0Var, c0492y.f4420a, Math.max(j11, j13), t10.f50474c, c0492y.f4423d);
            }
            return null;
        }
        int i13 = c0492y.f4424e;
        if (i13 != -1 && e0Var.i(i13)) {
            return c(g0Var, s10, j12);
        }
        int g10 = e0Var.g(i13);
        if (e0Var.j(i13) && e0Var.f(i13, g10) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g10 != e0Var.f42028l0.b(i13).f41969Z && !z10) {
            return f(g0Var, c0492y.f4420a, c0492y.f4424e, g10, t10.f50476e, c0492y.f4423d);
        }
        g0Var.i(obj2, e0Var);
        long e11 = e0Var.e(i13);
        if (e11 == Long.MIN_VALUE) {
            j10 = e0Var.f42025i0;
        } else {
            j10 = e0Var.f42028l0.b(i13).f41974l0 + e11;
        }
        return g(g0Var, c0492y.f4420a, j10, t10.f50476e, c0492y.f4423d);
    }

    public final T e(p2.g0 g0Var, C0492y c0492y, long j6, long j10) {
        g0Var.i(c0492y.f4420a, this.f50481a);
        if (c0492y.b()) {
            return f(g0Var, c0492y.f4420a, c0492y.f4421b, c0492y.f4422c, j6, c0492y.f4423d);
        }
        return g(g0Var, c0492y.f4420a, j10, j6, c0492y.f4423d);
    }

    public final T f(p2.g0 g0Var, Object obj, int i10, int i11, long j6, long j10) {
        long j11;
        long j12;
        C0492y c0492y = new C0492y(i10, i11, -1, j10, obj);
        p2.e0 e0Var = this.f50481a;
        long b10 = g0Var.i(obj, e0Var).b(i10, i11);
        if (i11 == e0Var.g(i10)) {
            j11 = e0Var.f42028l0.f41990h0;
        } else {
            j11 = 0;
        }
        boolean j13 = e0Var.j(i10);
        if (b10 != -9223372036854775807L && j11 >= b10) {
            j12 = Math.max(0L, b10 - 1);
        } else {
            j12 = j11;
        }
        return new T(c0492y, j12, j6, -9223372036854775807L, b10, j13, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T g(p2.g0 g0Var, Object obj, long j6, long j10, long j11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j12;
        long j13;
        long j14;
        boolean z14;
        long j15 = j6;
        p2.e0 e0Var = this.f50481a;
        g0Var.i(obj, e0Var);
        int c10 = e0Var.c(j15);
        int i10 = 0;
        if (c10 != -1 && e0Var.i(c10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c10 == -1) {
            C5049b c5049b = e0Var.f42028l0;
            if (c5049b.f41989Z > 0 && e0Var.j(c5049b.f41992j0)) {
                z11 = true;
            }
            z11 = false;
        } else {
            if (e0Var.j(c10) && e0Var.e(c10) == e0Var.f42025i0) {
                C5048a b10 = e0Var.f42028l0.b(c10);
                int i11 = b10.f41969Z;
                if (i11 != -1) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        int i13 = b10.f41972j0[i12];
                        if (i13 != 0 && i13 != 1) {
                        }
                    }
                    z14 = false;
                    if (!z14) {
                        z11 = true;
                        c10 = -1;
                    }
                }
                z14 = true;
                if (!z14) {
                }
            }
            z11 = false;
        }
        C0492y c0492y = new C0492y(obj, j11, c10);
        if (!c0492y.b() && c10 == -1) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean j16 = j(g0Var, c0492y);
        boolean i14 = i(g0Var, c0492y, z12);
        if (c10 != -1 && e0Var.j(c10) && !z10) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c10 != -1 && !z10) {
            j14 = e0Var.e(c10);
        } else if (z11) {
            j14 = e0Var.f42025i0;
        } else {
            j12 = -9223372036854775807L;
            if (j12 == -9223372036854775807L && j12 != Long.MIN_VALUE) {
                j13 = j12;
            } else {
                j13 = e0Var.f42025i0;
            }
            if (j13 != -9223372036854775807L && j15 >= j13) {
                if (!i14 || !z11) {
                    i10 = 1;
                }
                j15 = Math.max(0L, j13 - i10);
            }
            return new T(c0492y, j15, j10, j12, j13, z13, z12, j16, i14);
        }
        j12 = j14;
        if (j12 == -9223372036854775807L) {
        }
        j13 = e0Var.f42025i0;
        if (j13 != -9223372036854775807L) {
            if (!i14) {
            }
            i10 = 1;
            j15 = Math.max(0L, j13 - i10);
        }
        return new T(c0492y, j15, j10, j12, j13, z13, z12, j16, i14);
    }

    public final T h(p2.g0 g0Var, T t10) {
        boolean z10;
        long j6;
        long j10;
        boolean z11;
        C0492y c0492y = t10.f50472a;
        boolean b10 = c0492y.b();
        int i10 = c0492y.f4424e;
        if (!b10 && i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean j11 = j(g0Var, c0492y);
        boolean i11 = i(g0Var, c0492y, z10);
        Object obj = t10.f50472a.f4420a;
        p2.e0 e0Var = this.f50481a;
        g0Var.i(obj, e0Var);
        if (!c0492y.b() && i10 != -1) {
            j6 = e0Var.e(i10);
        } else {
            j6 = -9223372036854775807L;
        }
        boolean b11 = c0492y.b();
        int i12 = c0492y.f4421b;
        if (b11) {
            j10 = e0Var.b(i12, c0492y.f4422c);
        } else if (j6 != -9223372036854775807L && j6 != Long.MIN_VALUE) {
            j10 = j6;
        } else {
            j10 = e0Var.f42025i0;
        }
        if (c0492y.b()) {
            z11 = e0Var.j(i12);
        } else if (i10 != -1 && e0Var.j(i10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new T(c0492y, t10.f50473b, t10.f50474c, j6, j10, z11, z10, j11, i11);
    }

    public final boolean i(p2.g0 g0Var, C0492y c0492y, boolean z10) {
        int c10 = g0Var.c(c0492y.f4420a);
        if (g0Var.o(g0Var.h(c10, this.f50481a, false).f42024h0, this.f50482b, 0L).f42053n0) {
            return false;
        }
        if (g0Var.e(c10, this.f50481a, this.f50482b, this.f50486f, this.f50487g) != -1 || !z10) {
            return false;
        }
        return true;
    }

    public final boolean j(p2.g0 g0Var, C0492y c0492y) {
        boolean z10;
        if (!c0492y.b() && c0492y.f4424e == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Object obj = c0492y.f4420a;
        if (g0Var.o(g0Var.i(obj, this.f50481a).f42024h0, this.f50482b, 0L).f42060u0 != g0Var.c(obj)) {
            return false;
        }
        return true;
    }

    public final void k() {
        C0492y c0492y;
        x8.L l10 = x8.N.f49523Z;
        x8.H h10 = new x8.H();
        for (S s10 = this.f50488h; s10 != null; s10 = s10.f50468l) {
            h10.d0(s10.f50462f.f50472a);
        }
        S s11 = this.f50489i;
        if (s11 == null) {
            c0492y = null;
        } else {
            c0492y = s11.f50462f.f50472a;
        }
        ((s2.y) this.f50484d).c(new Q1.n(this, h10, c0492y, 4));
    }

    public final boolean l(S s10) {
        Gi.e.o(s10);
        boolean z10 = false;
        if (s10.equals(this.f50490j)) {
            return false;
        }
        this.f50490j = s10;
        while (true) {
            s10 = s10.f50468l;
            if (s10 == null) {
                break;
            }
            if (s10 == this.f50489i) {
                this.f50489i = this.f50488h;
                z10 = true;
            }
            s10.g();
            this.f50491k--;
        }
        S s11 = this.f50490j;
        s11.getClass();
        if (s11.f50468l != null) {
            s11.b();
            s11.f50468l = null;
            s11.c();
        }
        k();
        return z10;
    }

    public final C0492y n(p2.g0 g0Var, Object obj, long j6) {
        long j10;
        int c10;
        Object obj2 = obj;
        p2.e0 e0Var = this.f50481a;
        int i10 = g0Var.i(obj2, e0Var).f42024h0;
        Object obj3 = this.f50492l;
        if (obj3 != null && (c10 = g0Var.c(obj3)) != -1 && g0Var.h(c10, e0Var, false).f42024h0 == i10) {
            j10 = this.f50493m;
        } else {
            S s10 = this.f50488h;
            while (true) {
                if (s10 != null) {
                    if (s10.f50458b.equals(obj2)) {
                        j10 = s10.f50462f.f50472a.f4423d;
                        break;
                    }
                    s10 = s10.f50468l;
                } else {
                    S s11 = this.f50488h;
                    while (true) {
                        if (s11 != null) {
                            int c11 = g0Var.c(s11.f50458b);
                            if (c11 != -1 && g0Var.h(c11, e0Var, false).f42024h0 == i10) {
                                j10 = s11.f50462f.f50472a.f4423d;
                                break;
                            }
                            s11 = s11.f50468l;
                        } else {
                            j10 = this.f50485e;
                            this.f50485e = 1 + j10;
                            if (this.f50488h == null) {
                                this.f50492l = obj2;
                                this.f50493m = j10;
                            }
                        }
                    }
                }
            }
        }
        long j11 = j10;
        g0Var.i(obj2, e0Var);
        int i11 = e0Var.f42024h0;
        p2.f0 f0Var = this.f50482b;
        g0Var.p(i11, f0Var);
        boolean z10 = false;
        for (int c12 = g0Var.c(obj); c12 >= f0Var.f42059t0; c12--) {
            boolean z11 = true;
            g0Var.h(c12, e0Var, true);
            if (e0Var.f42028l0.f41989Z <= 0) {
                z11 = false;
            }
            z10 |= z11;
            if (e0Var.d(e0Var.f42025i0) != -1) {
                obj2 = e0Var.f42023Z;
                obj2.getClass();
            }
            if (z10 && (!z11 || e0Var.f42025i0 != 0)) {
                break;
            }
        }
        return m(g0Var, obj2, j6, j11, this.f50482b, this.f50481a);
    }

    public final boolean o(p2.g0 g0Var) {
        S s10;
        S s11 = this.f50488h;
        if (s11 == null) {
            return true;
        }
        int c10 = g0Var.c(s11.f50458b);
        while (true) {
            c10 = g0Var.e(c10, this.f50481a, this.f50482b, this.f50486f, this.f50487g);
            while (true) {
                s11.getClass();
                s10 = s11.f50468l;
                if (s10 == null || s11.f50462f.f50478g) {
                    break;
                }
                s11 = s10;
            }
            if (c10 == -1 || s10 == null || g0Var.c(s10.f50458b) != c10) {
                break;
            }
            s11 = s10;
        }
        boolean l10 = l(s11);
        s11.f50462f = h(g0Var, s11.f50462f);
        return !l10;
    }

    public final boolean p(p2.g0 g0Var, long j6, long j10) {
        T t10;
        long j11;
        boolean z10;
        S s10 = null;
        for (S s11 = this.f50488h; s11 != null; s11 = s11.f50468l) {
            T t11 = s11.f50462f;
            if (s10 == null) {
                t10 = h(g0Var, t11);
            } else {
                T d10 = d(g0Var, s10, j6);
                if (d10 == null) {
                    return !l(s10);
                }
                if (t11.f50473b == d10.f50473b && t11.f50472a.equals(d10.f50472a)) {
                    t10 = d10;
                } else {
                    return !l(s10);
                }
            }
            s11.f50462f = t10.a(t11.f50474c);
            long j12 = t11.f50476e;
            if (j12 != -9223372036854775807L) {
                long j13 = t10.f50476e;
                if (j12 != j13) {
                    s11.i();
                    if (j13 == -9223372036854775807L) {
                        j11 = Long.MAX_VALUE;
                    } else {
                        j11 = s11.f50471o + j13;
                    }
                    if (s11 == this.f50489i && !s11.f50462f.f50477f && (j10 == Long.MIN_VALUE || j10 >= j11)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!l(s11) && !z10) {
                        return true;
                    }
                    return false;
                }
            }
            s10 = s11;
        }
        return true;
    }
}
