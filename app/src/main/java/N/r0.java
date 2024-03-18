package N;

import L.P0;
import L.Q0;
import id.AbstractC3557B;
import q0.C5251c;
import x0.AbstractC6263a;
import x0.C6264b;

/* loaded from: classes.dex */
public final class r0 implements L.x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12406a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t0 f12407b;

    public /* synthetic */ r0(t0 t0Var, int i10) {
        this.f12406a = i10;
        this.f12407b = t0Var;
    }

    @Override // L.x0
    public final void c() {
        int i10 = this.f12406a;
        t0 t0Var = this.f12407b;
        switch (i10) {
            case 0:
                t0.a(t0Var, null);
                t0Var.f12427o.setValue(null);
                return;
            default:
                t0.a(t0Var, null);
                t0Var.f12427o.setValue(null);
                t0Var.o(true);
                t0Var.f12424l = null;
                return;
        }
    }

    @Override // L.x0
    public final void d(long j6) {
        Q0 d10;
        Q0 d11;
        Q0 d12;
        int i10 = this.f12406a;
        t0 t0Var = this.f12407b;
        switch (i10) {
            case 0:
                long a5 = P.a(t0Var.i(true));
                P0 p02 = t0Var.f12416d;
                if (p02 != null && (d10 = p02.d()) != null) {
                    long e10 = d10.e(a5);
                    t0Var.f12423k = e10;
                    t0Var.f12427o.setValue(new C5251c(e10));
                    t0Var.f12425m = C5251c.f43619b;
                    t0Var.f12426n.setValue(L.Y.f10081Y);
                    t0Var.o(false);
                    return;
                }
                return;
            default:
                if (((L.Y) t0Var.f12426n.getValue()) == null) {
                    t0Var.f12426n.setValue(L.Y.f10083h0);
                    t0Var.f12428p = -1;
                    t0Var.k();
                    P0 p03 = t0Var.f12416d;
                    if (p03 != null && (d12 = p03.d()) != null && d12.c(j6)) {
                        if (t0Var.j().f16830a.f12512Y.length() != 0) {
                            t0Var.g(false);
                            t0Var.f12424l = Integer.valueOf((int) (t0.b(t0Var, T0.z.a(t0Var.j(), null, N0.D.f12483b, 5), j6, true, false, C1037v.f12441d, true) >> 32));
                        } else {
                            return;
                        }
                    } else {
                        P0 p04 = t0Var.f12416d;
                        if (p04 != null && (d11 = p04.d()) != null) {
                            int a10 = t0Var.f12414b.a(d11.b(j6, true));
                            T0.z d13 = t0.d(t0Var.j().f16830a, U3.f.e(a10, a10));
                            t0Var.g(false);
                            t0Var.m(L.Z.f10087h0);
                            AbstractC6263a abstractC6263a = t0Var.f12420h;
                            if (abstractC6263a != null) {
                                ((C6264b) abstractC6263a).a(M3.H.f11535i);
                            }
                            t0Var.f12415c.invoke(d13);
                        }
                    }
                    t0Var.f12423k = j6;
                    t0Var.f12427o.setValue(new C5251c(j6));
                    t0Var.f12425m = C5251c.f43619b;
                    return;
                }
                return;
        }
    }

    @Override // L.x0
    public final void e() {
        switch (this.f12406a) {
            case 0:
                t0 t0Var = this.f12407b;
                t0.a(t0Var, null);
                t0Var.f12427o.setValue(null);
                return;
            default:
                return;
        }
    }

    @Override // L.x0
    public final void g(long j6) {
        Q0 d10;
        AbstractC6263a abstractC6263a;
        Q0 d11;
        int i10;
        int i11 = this.f12406a;
        t0 t0Var = this.f12407b;
        switch (i11) {
            case 0:
                t0Var.f12425m = C5251c.h(t0Var.f12425m, j6);
                P0 p02 = t0Var.f12416d;
                if (p02 != null && (d10 = p02.d()) != null) {
                    t0Var.f12427o.setValue(new C5251c(C5251c.h(t0Var.f12423k, t0Var.f12425m)));
                    T0.s sVar = t0Var.f12414b;
                    C5251c h10 = t0Var.h();
                    AbstractC3557B.Z(h10);
                    int a5 = sVar.a(d10.b(h10.f43623a, true));
                    long e10 = U3.f.e(a5, a5);
                    if (!N0.D.a(e10, t0Var.j().f16831b)) {
                        P0 p03 = t0Var.f12416d;
                        if ((p03 == null || ((Boolean) p03.f10045q.getValue()).booleanValue()) && (abstractC6263a = t0Var.f12420h) != null) {
                            ((C6264b) abstractC6263a).a(M3.H.f11535i);
                        }
                        t0Var.f12415c.invoke(t0.d(t0Var.j().f16830a, e10));
                        return;
                    }
                    return;
                }
                return;
            default:
                if (t0Var.j().f16830a.f12512Y.length() != 0) {
                    t0Var.f12425m = C5251c.h(t0Var.f12425m, j6);
                    P0 p04 = t0Var.f12416d;
                    if (p04 != null && (d11 = p04.d()) != null) {
                        t0Var.f12427o.setValue(new C5251c(C5251c.h(t0Var.f12423k, t0Var.f12425m)));
                        Integer num = t0Var.f12424l;
                        C1035t c1035t = C1037v.f12441d;
                        if (num == null) {
                            C5251c h11 = t0Var.h();
                            AbstractC3557B.Z(h11);
                            if (!d11.c(h11.f43623a)) {
                                int a10 = t0Var.f12414b.a(d11.b(t0Var.f12423k, true));
                                T0.s sVar2 = t0Var.f12414b;
                                C5251c h12 = t0Var.h();
                                AbstractC3557B.Z(h12);
                                if (a10 == sVar2.a(d11.b(h12.f43623a, true))) {
                                    c1035t = C1037v.f12438a;
                                }
                                T0.z j10 = t0Var.j();
                                C5251c h13 = t0Var.h();
                                AbstractC3557B.Z(h13);
                                t0.b(t0Var, j10, h13.f43623a, false, false, c1035t, true);
                                int i12 = N0.D.f12484c;
                            }
                        }
                        Integer num2 = t0Var.f12424l;
                        if (num2 != null) {
                            i10 = num2.intValue();
                        } else {
                            i10 = d11.b(t0Var.f12423k, false);
                        }
                        C5251c h14 = t0Var.h();
                        AbstractC3557B.Z(h14);
                        int b10 = d11.b(h14.f43623a, false);
                        if (t0Var.f12424l != null || i10 != b10) {
                            T0.z j11 = t0Var.j();
                            C5251c h15 = t0Var.h();
                            AbstractC3557B.Z(h15);
                            t0.b(t0Var, j11, h15.f43623a, false, false, c1035t, true);
                            int i122 = N0.D.f12484c;
                        } else {
                            return;
                        }
                    }
                    t0Var.o(false);
                    return;
                }
                return;
        }
    }

    @Override // L.x0
    public final void b() {
    }

    @Override // L.x0
    public final void f() {
    }
}
