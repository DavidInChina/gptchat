package z2;

import E2.C0492y;
import M3.H;
import p2.X;
import p2.e0;
import p2.g0;
import s2.AbstractC5530A;
import x8.L;
import x8.N;
import x8.P;
import x8.k0;
import x8.p0;
import y2.C6504G;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f51530a;

    /* renamed from: b  reason: collision with root package name */
    public N f51531b = k0.f49573j0;

    /* renamed from: c  reason: collision with root package name */
    public p0 f51532c = p0.f49595l0;

    /* renamed from: d  reason: collision with root package name */
    public C0492y f51533d;

    /* renamed from: e  reason: collision with root package name */
    public C0492y f51534e;

    /* renamed from: f  reason: collision with root package name */
    public C0492y f51535f;

    public v(e0 e0Var) {
        this.f51530a = e0Var;
        L l10 = N.f49523Z;
    }

    public static C0492y b(X x10, N n10, C0492y c0492y, e0 e0Var) {
        Object obj;
        int i10;
        C6504G c6504g = (C6504G) x10;
        g0 m10 = c6504g.m();
        int j6 = c6504g.j();
        if (m10.r()) {
            obj = null;
        } else {
            obj = m10.n(j6);
        }
        if (!c6504g.r() && !m10.r()) {
            i10 = m10.g(j6, e0Var).c(AbstractC5530A.C(c6504g.k()) - e0Var.h());
        } else {
            i10 = -1;
        }
        for (int i11 = 0; i11 < n10.size(); i11++) {
            C0492y c0492y2 = (C0492y) n10.get(i11);
            if (c(c0492y2, obj, c6504g.r(), c6504g.g(), c6504g.h(), i10)) {
                return c0492y2;
            }
        }
        if (n10.isEmpty() && c0492y != null) {
            if (c(c0492y, obj, c6504g.r(), c6504g.g(), c6504g.h(), i10)) {
                return c0492y;
            }
        }
        return null;
    }

    public static boolean c(C0492y c0492y, Object obj, boolean z10, int i10, int i11, int i12) {
        if (!c0492y.f4420a.equals(obj)) {
            return false;
        }
        int i13 = c0492y.f4421b;
        if ((!z10 || i13 != i10 || c0492y.f4422c != i11) && (z10 || i13 != -1 || c0492y.f4424e != i12)) {
            return false;
        }
        return true;
    }

    public final void a(O4.a aVar, C0492y c0492y, g0 g0Var) {
        if (c0492y == null) {
            return;
        }
        if (g0Var.c(c0492y.f4420a) != -1) {
            aVar.b(c0492y, g0Var);
            return;
        }
        g0 g0Var2 = (g0) this.f51532c.get(c0492y);
        if (g0Var2 != null) {
            aVar.b(c0492y, g0Var2);
        }
    }

    public final void d(g0 g0Var) {
        O4.a a5 = P.a();
        if (this.f51531b.isEmpty()) {
            a(a5, this.f51534e, g0Var);
            if (!H.O(this.f51535f, this.f51534e)) {
                a(a5, this.f51535f, g0Var);
            }
            if (!H.O(this.f51533d, this.f51534e) && !H.O(this.f51533d, this.f51535f)) {
                a(a5, this.f51533d, g0Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f51531b.size(); i10++) {
                a(a5, (C0492y) this.f51531b.get(i10), g0Var);
            }
            if (!this.f51531b.contains(this.f51533d)) {
                a(a5, this.f51533d, g0Var);
            }
        }
        this.f51532c = a5.a();
    }
}
