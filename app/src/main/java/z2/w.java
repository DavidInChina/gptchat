package z2;

import E2.C0484p;
import E2.C0488u;
import E2.C0492y;
import V1.C1464e;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p2.C5061n;
import p2.H;
import p2.K;
import p2.M;
import p2.S;
import p2.U;
import p2.W;
import p2.X;
import p2.Y;
import p2.e0;
import p2.f0;
import p2.g0;
import p2.o0;
import p2.r0;
import s2.AbstractC5530A;
import s2.AbstractC5532b;
import y2.C6504G;
import y2.C6527n;
import y2.C6536x;

/* loaded from: classes2.dex */
public final class w implements AbstractC6756a {

    /* renamed from: Y  reason: collision with root package name */
    public final AbstractC5532b f51536Y;

    /* renamed from: Z  reason: collision with root package name */
    public final e0 f51537Z;

    /* renamed from: h0  reason: collision with root package name */
    public final f0 f51538h0;

    /* renamed from: i0  reason: collision with root package name */
    public final v f51539i0;

    /* renamed from: j0  reason: collision with root package name */
    public final SparseArray f51540j0;

    /* renamed from: k0  reason: collision with root package name */
    public j1.e f51541k0;

    /* renamed from: l0  reason: collision with root package name */
    public X f51542l0;

    /* renamed from: m0  reason: collision with root package name */
    public s2.y f51543m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f51544n0;

    public w(AbstractC5532b abstractC5532b) {
        abstractC5532b.getClass();
        this.f51536Y = abstractC5532b;
        int i10 = AbstractC5530A.f45131a;
        Looper myLooper = Looper.myLooper();
        this.f51541k0 = new j1.e(myLooper == null ? Looper.getMainLooper() : myLooper, abstractC5532b, new Y(18));
        e0 e0Var = new e0();
        this.f51537Z = e0Var;
        this.f51538h0 = new f0();
        this.f51539i0 = new v(e0Var);
        this.f51540j0 = new SparseArray();
    }

    @Override // p2.V
    public final void A(int i10, boolean z10) {
        C6757b I10 = I();
        N(I10, -1, new f(I10, z10, i10, 0));
    }

    @Override // p2.V
    public final void B(C6527n c6527n) {
        C6757b c6757b;
        C0492y c0492y;
        if ((c6527n instanceof C6527n) && (c0492y = c6527n.f50672r0) != null) {
            c6757b = J(c0492y);
        } else {
            c6757b = I();
        }
        N(c6757b, 10, new h(c6757b, c6527n, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, s2.m] */
    @Override // p2.V
    public final void C(int i10, int i11) {
        N(M(), 24, new Object());
    }

    @Override // E2.C
    public final void D(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1001, new u(L10, c0484p, c0488u, 2));
    }

    @Override // B2.o
    public final void E(int i10, C0492y c0492y) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1027, new r(L10, 2));
    }

    @Override // E2.C
    public final void F(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1000, new u(L10, c0484p, c0488u, 0));
    }

    @Override // p2.V
    public final void G(C5061n c5061n) {
        C6757b I10 = I();
        N(I10, 29, new C1464e(I10, 11, c5061n));
    }

    @Override // p2.V
    public final void H(boolean z10) {
        C6757b I10 = I();
        N(I10, 7, new t(1, I10, z10));
    }

    public final C6757b I() {
        return J(this.f51539i0.f51533d);
    }

    public final C6757b J(C0492y c0492y) {
        g0 g0Var;
        this.f51542l0.getClass();
        if (c0492y == null) {
            g0Var = null;
        } else {
            g0Var = (g0) this.f51539i0.f51532c.get(c0492y);
        }
        if (c0492y != null && g0Var != null) {
            return K(g0Var, g0Var.i(c0492y.f4420a, this.f51537Z).f42024h0, c0492y);
        }
        int i10 = ((C6504G) this.f51542l0).i();
        g0 m10 = ((C6504G) this.f51542l0).m();
        if (i10 >= m10.q()) {
            m10 = g0.f42063Y;
        }
        return K(m10, i10, null);
    }

    public final C6757b K(g0 g0Var, int i10, C0492y c0492y) {
        C0492y c0492y2;
        boolean z10;
        if (g0Var.r()) {
            c0492y2 = null;
        } else {
            c0492y2 = c0492y;
        }
        ((s2.w) this.f51536Y).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (g0Var.equals(((C6504G) this.f51542l0).m()) && i10 == ((C6504G) this.f51542l0).i()) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j6 = 0;
        if (c0492y2 != null && c0492y2.b()) {
            if (z10 && ((C6504G) this.f51542l0).g() == c0492y2.f4421b && ((C6504G) this.f51542l0).h() == c0492y2.f4422c) {
                j6 = ((C6504G) this.f51542l0).k();
            }
        } else if (z10) {
            C6504G c6504g = (C6504G) this.f51542l0;
            c6504g.E();
            j6 = c6504g.f(c6504g.f50360W);
        } else if (!g0Var.r()) {
            j6 = AbstractC5530A.L(g0Var.o(i10, this.f51538h0, 0L).f42057r0);
        }
        C0492y c0492y3 = this.f51539i0.f51533d;
        g0 m10 = ((C6504G) this.f51542l0).m();
        int i11 = ((C6504G) this.f51542l0).i();
        long k10 = ((C6504G) this.f51542l0).k();
        C6504G c6504g2 = (C6504G) this.f51542l0;
        c6504g2.E();
        return new C6757b(elapsedRealtime, g0Var, i10, c0492y2, j6, m10, i11, c0492y3, k10, AbstractC5530A.L(c6504g2.f50360W.f50552q));
    }

    public final C6757b L(int i10, C0492y c0492y) {
        this.f51542l0.getClass();
        if (c0492y != null) {
            if (((g0) this.f51539i0.f51532c.get(c0492y)) != null) {
                return J(c0492y);
            }
            return K(g0.f42063Y, i10, c0492y);
        }
        g0 m10 = ((C6504G) this.f51542l0).m();
        if (i10 >= m10.q()) {
            m10 = g0.f42063Y;
        }
        return K(m10, i10, null);
    }

    public final C6757b M() {
        return J(this.f51539i0.f51535f);
    }

    public final void N(C6757b c6757b, int i10, s2.m mVar) {
        this.f51540j0.put(i10, c6757b);
        this.f51541k0.l(i10, mVar);
    }

    public final void O(X x10, Looper looper) {
        boolean z10;
        if (this.f51542l0 != null && !this.f51539i0.f51531b.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.n(z10);
        x10.getClass();
        this.f51542l0 = x10;
        this.f51543m0 = ((s2.w) this.f51536Y).a(looper, null);
        j1.e eVar = this.f51541k0;
        C1464e c1464e = new C1464e(this, 10, x10);
        this.f51541k0 = new j1.e((CopyOnWriteArraySet) eVar.f35971f, looper, (AbstractC5532b) eVar.f35968c, c1464e, eVar.f35967b);
    }

    @Override // p2.V
    public final void a(int i10) {
        C6757b I10 = I();
        N(I10, 6, new A9.a(I10, i10, 1));
    }

    @Override // p2.V
    public final void b(S s10) {
        C6757b I10 = I();
        N(I10, 12, new C1464e(I10, 5, s10));
    }

    @Override // p2.V
    public final void c(boolean z10) {
        C6757b I10 = I();
        N(I10, 3, new t(0, I10, z10));
    }

    @Override // B2.o
    public final void d(int i10, C0492y c0492y, int i11) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1022, new A9.a(L10, i11, 3));
    }

    @Override // B2.o
    public final void e(int i10, C0492y c0492y) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1026, new r(L10, 3));
    }

    @Override // B2.o
    public final void f(int i10, C0492y c0492y, Exception exc) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1024, new m(L10, exc, 3));
    }

    @Override // B2.o
    public final void g(int i10, C0492y c0492y) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1025, new r(L10, 4));
    }

    @Override // p2.V
    public final void h(C6527n c6527n) {
        C6757b c6757b;
        C0492y c0492y;
        if ((c6527n instanceof C6527n) && (c0492y = c6527n.f50672r0) != null) {
            c6757b = J(c0492y);
        } else {
            c6757b = I();
        }
        N(c6757b, 10, new h(c6757b, c6527n, 0));
    }

    @Override // p2.V
    public final void i(o0 o0Var) {
        C6757b I10 = I();
        N(I10, 2, new C1464e(I10, 6, o0Var));
    }

    @Override // p2.V
    public final void j(int i10, boolean z10) {
        C6757b I10 = I();
        N(I10, 5, new f(I10, z10, i10, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s2.m] */
    @Override // p2.V
    public final void k(float f6) {
        N(M(), 22, new Object());
    }

    @Override // p2.V
    public final void l(M m10) {
        C6757b I10 = I();
        N(I10, 28, new C1464e(I10, 2, m10));
    }

    @Override // p2.V
    public final void m(r2.c cVar) {
        C6757b I10 = I();
        N(I10, 27, new C1464e(I10, 1, cVar));
    }

    @Override // p2.V
    public final void n(int i10) {
        C6757b I10 = I();
        N(I10, 4, new A9.a(I10, i10, 2));
    }

    @Override // E2.C
    public final void o(int i10, C0492y c0492y, C0484p c0484p, C0488u c0488u) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1002, new u(L10, c0484p, c0488u, 1));
    }

    @Override // p2.V
    public final void p(final int i10, final W w10, final W w11) {
        if (i10 == 1) {
            this.f51544n0 = false;
        }
        X x10 = this.f51542l0;
        x10.getClass();
        v vVar = this.f51539i0;
        vVar.f51533d = v.b(x10, vVar.f51531b, vVar.f51534e, vVar.f51530a);
        final C6757b I10 = I();
        N(I10, 11, new s2.m(i10, w10, w11, I10) { // from class: z2.i

            /* renamed from: Y  reason: collision with root package name */
            public final /* synthetic */ int f51510Y;

            @Override // s2.m
            public final void invoke(Object obj) {
                AbstractC6758c abstractC6758c = (AbstractC6758c) obj;
                abstractC6758c.getClass();
                C6752A c6752a = (C6752A) abstractC6758c;
                int i11 = this.f51510Y;
                if (i11 == 1) {
                    c6752a.f51482u = true;
                }
                c6752a.f51472k = i11;
            }
        });
    }

    @Override // p2.V
    public final void q(r0 r0Var) {
        C6757b M10 = M();
        N(M10, 25, new C1464e(M10, 4, r0Var));
    }

    @Override // p2.V
    public final void r(K k10) {
        C6757b I10 = I();
        N(I10, 14, new C1464e(I10, 8, k10));
    }

    @Override // B2.o
    public final void s(int i10, C0492y c0492y) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1023, new r(L10, 5));
    }

    @Override // E2.C
    public final void t(int i10, C0492y c0492y, final C0484p c0484p, final C0488u c0488u, final IOException iOException, final boolean z10) {
        final C6757b L10 = L(i10, c0492y);
        N(L10, 1003, new s2.m(L10, c0484p, c0488u, iOException, z10) { // from class: z2.e

            /* renamed from: Y  reason: collision with root package name */
            public final /* synthetic */ C0488u f51503Y;

            {
                this.f51503Y = c0488u;
            }

            @Override // s2.m
            public final void invoke(Object obj) {
                C6752A c6752a = (C6752A) ((AbstractC6758c) obj);
                c6752a.getClass();
                c6752a.f51483v = this.f51503Y.f4413a;
            }
        });
    }

    @Override // E2.C
    public final void u(int i10, C0492y c0492y, C0488u c0488u) {
        C6757b L10 = L(i10, c0492y);
        N(L10, 1004, new C1464e(L10, 7, c0488u));
    }

    @Override // p2.V
    public final void v(int i10) {
        X x10 = this.f51542l0;
        x10.getClass();
        v vVar = this.f51539i0;
        vVar.f51533d = v.b(x10, vVar.f51531b, vVar.f51534e, vVar.f51530a);
        vVar.d(((C6504G) x10).m());
        C6757b I10 = I();
        N(I10, 0, new A9.a(I10, i10, 0));
    }

    @Override // p2.V
    public final void w(H h10, int i10) {
        C6757b I10 = I();
        N(I10, 1, new C6536x(I10, h10, i10));
    }

    @Override // p2.V
    public final void x(U u10) {
        C6757b I10 = I();
        N(I10, 13, new C1464e(I10, 9, u10));
    }

    @Override // p2.V
    public final void y(boolean z10) {
        C6757b M10 = M();
        N(M10, 23, new t(2, M10, z10));
    }

    @Override // p2.V
    public final void z(List list) {
        C6757b I10 = I();
        N(I10, 27, new C1464e(I10, 3, list));
    }
}
