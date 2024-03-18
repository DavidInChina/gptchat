package N;

import E0.AbstractC0461u;
import L.P0;
import L.Q0;
import Z.C1724m0;
import id.AbstractC3557B;
import q0.C5251c;

/* loaded from: classes2.dex */
public final class c0 implements L.x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12294a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f12295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f12296c;

    public c0(t0 t0Var, boolean z10) {
        this.f12296c = t0Var;
        this.f12295b = z10;
    }

    public final void a() {
        f0 f0Var = (f0) this.f12296c;
        f0Var.k(true);
        f0Var.f12330p.setValue(null);
        f0Var.f12331q.setValue(null);
    }

    @Override // L.x0
    public final void b() {
        switch (this.f12294a) {
            case 0:
                a();
                return;
            default:
                return;
        }
    }

    @Override // L.x0
    public final void c() {
        switch (this.f12294a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = (t0) this.f12296c;
                t0.a(t0Var, null);
                t0Var.f12427o.setValue(null);
                t0Var.o(true);
                return;
        }
    }

    @Override // L.x0
    public final void d(long j6) {
        r rVar;
        switch (this.f12294a) {
            case 0:
                f0 f0Var = (f0) this.f12296c;
                if (f0Var.d() != null) {
                    C1034s f6 = f0Var.f();
                    AbstractC3557B.Z(f6);
                    boolean z10 = this.f12295b;
                    if (z10) {
                        rVar = f6.f12408a;
                    } else {
                        rVar = f6.f12409b;
                    }
                    Object obj = f0Var.f12315a.f12375c.get(Long.valueOf(rVar.f12405c));
                    if (obj != null) {
                        C1030n c1030n = (C1030n) ((AbstractC1032p) obj);
                        AbstractC0461u c10 = c1030n.c();
                        if (c10 != null) {
                            long a5 = c1030n.a(f6, z10);
                            if (!R4.b.B1(a5)) {
                                f0Var.f12326l.setValue(new C5251c(f0Var.i().B(c10, P.a(a5))));
                                f0Var.f12327m.setValue(new C5251c(C5251c.f43619b));
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Current selectable should have layout coordinates.".toString());
                    }
                    throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds".toString());
                }
                return;
            default:
                return;
        }
    }

    @Override // L.x0
    public final void e() {
        switch (this.f12294a) {
            case 0:
                a();
                return;
            default:
                t0 t0Var = (t0) this.f12296c;
                t0.a(t0Var, null);
                t0Var.f12427o.setValue(null);
                t0Var.o(true);
                return;
        }
    }

    @Override // L.x0
    public final void f() {
        C5251c c5251c;
        f0 f0Var;
        C1034s f6;
        r rVar;
        C1030n c1030n;
        AbstractC0461u c10;
        Q0 d10;
        L.Y y10 = L.Y.f10083h0;
        L.Y y11 = L.Y.f10082Z;
        int i10 = this.f12294a;
        boolean z10 = this.f12295b;
        Object obj = this.f12296c;
        switch (i10) {
            case 0:
                f0 f0Var2 = (f0) obj;
                if (z10) {
                    c5251c = (C5251c) f0Var2.f12328n.getValue();
                } else {
                    c5251c = (C5251c) f0Var2.f12329o.getValue();
                }
                if (c5251c != null && (f6 = (f0Var = (f0) obj).f()) != null) {
                    if (z10) {
                        rVar = f6.f12408a;
                    } else {
                        rVar = f6.f12409b;
                    }
                    AbstractC1032p c11 = f0Var.c(rVar);
                    if (c11 != null && (c10 = (c1030n = (C1030n) c11).c()) != null) {
                        long a5 = c1030n.a(f6, z10);
                        if (!R4.b.B1(a5)) {
                            f0Var.f12331q.setValue(new C5251c(f0Var.i().B(c10, P.a(a5))));
                            if (z10) {
                                y10 = y11;
                            }
                            f0Var.f12330p.setValue(y10);
                            f0Var.k(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) obj;
                if (z10) {
                    y10 = y11;
                }
                t0.a(t0Var, y10);
                long a10 = P.a(t0Var.i(z10));
                P0 p02 = t0Var.f12416d;
                if (p02 != null && (d10 = p02.d()) != null) {
                    long e10 = d10.e(a10);
                    t0Var.f12423k = e10;
                    t0Var.f12427o.setValue(new C5251c(e10));
                    t0Var.f12425m = C5251c.f43619b;
                    t0Var.f12428p = -1;
                    P0 p03 = t0Var.f12416d;
                    if (p03 != null) {
                        p03.f10045q.setValue(Boolean.TRUE);
                    }
                    t0Var.o(false);
                    return;
                }
                return;
        }
    }

    @Override // L.x0
    public final void g(long j6) {
        C1035t c1035t = C1037v.f12441d;
        int i10 = this.f12294a;
        Object obj = this.f12296c;
        switch (i10) {
            case 0:
                f0 f0Var = (f0) obj;
                if (f0Var.d() != null) {
                    C1724m0 c1724m0 = f0Var.f12327m;
                    c1724m0.setValue(new C5251c(C5251c.h(((C5251c) c1724m0.getValue()).f43623a, j6)));
                    C1724m0 c1724m02 = f0Var.f12326l;
                    long h10 = C5251c.h(((C5251c) c1724m02.getValue()).f43623a, ((C5251c) c1724m0.getValue()).f43623a);
                    if (f0Var.m(h10, ((C5251c) c1724m02.getValue()).f43623a, this.f12295b, c1035t)) {
                        c1724m02.setValue(new C5251c(h10));
                        c1724m0.setValue(new C5251c(C5251c.f43619b));
                        return;
                    }
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) obj;
                long h11 = C5251c.h(t0Var.f12425m, j6);
                t0Var.f12425m = h11;
                t0Var.f12427o.setValue(new C5251c(C5251c.h(t0Var.f12423k, h11)));
                T0.z j10 = t0Var.j();
                C5251c h12 = t0Var.h();
                AbstractC3557B.Z(h12);
                t0.b(t0Var, j10, h12.f43623a, false, this.f12295b, c1035t, true);
                t0Var.o(false);
                return;
        }
    }

    public c0(boolean z10, f0 f0Var) {
        this.f12295b = z10;
        this.f12296c = f0Var;
    }
}
