package mb;

import id.AbstractC3557B;
import java.util.List;
import p2.C5061n;
import p2.M;
import p2.S;
import p2.U;
import p2.V;
import p2.o0;
import p2.r0;
import x8.W;
import y2.C6527n;

/* renamed from: mb.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4595h implements V {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4603p f39066Y;

    public C4595h(C4603p c4603p) {
        this.f39066Y = c4603p;
    }

    @Override // p2.V
    public final void B(C6527n c6527n) {
        AbstractC3557B.c0("error", c6527n);
        C4603p c4603p = this.f39066Y;
        int i10 = c6527n.f41929Y;
        if (i10 != 0) {
            if (i10 != 1) {
                Ad.l.O0(c4603p.f39079a, null, null, new C4594g(c4603p, c6527n, null), 3);
                return;
            } else {
                Ad.l.O0(c4603p.f39079a, null, null, new C4593f(c4603p, c6527n, null), 3);
                return;
            }
        }
        Ad.l.O0(c4603p.f39079a, null, null, new C4592e(c4603p, c6527n, null), 3);
    }

    @Override // p2.V
    public final void n(int i10) {
        Pc.c a5 = Pc.e.a();
        W.F(a5, "onPlaybackStateChanged state=" + i10, null, 6);
        C4603p c4603p = this.f39066Y;
        if (i10 == 3) {
            Ad.l.O0(c4603p.f39079a, null, null, new C4590c(c4603p, null), 3);
        }
        if (i10 == 4) {
            Ad.l.O0(c4603p.f39079a, null, null, new C4591d(c4603p, null), 3);
        }
    }

    @Override // p2.V
    public final /* synthetic */ void G(C5061n c5061n) {
    }

    @Override // p2.V
    public final /* synthetic */ void H(boolean z10) {
    }

    @Override // p2.V
    public final /* synthetic */ void a(int i10) {
    }

    @Override // p2.V
    public final /* synthetic */ void b(S s10) {
    }

    @Override // p2.V
    public final /* synthetic */ void c(boolean z10) {
    }

    @Override // p2.V
    public final /* synthetic */ void h(C6527n c6527n) {
    }

    @Override // p2.V
    public final /* synthetic */ void i(o0 o0Var) {
    }

    @Override // p2.V
    public final /* synthetic */ void k(float f6) {
    }

    @Override // p2.V
    public final /* synthetic */ void l(M m10) {
    }

    @Override // p2.V
    public final /* synthetic */ void m(r2.c cVar) {
    }

    @Override // p2.V
    public final /* synthetic */ void q(r0 r0Var) {
    }

    @Override // p2.V
    public final /* synthetic */ void r(p2.K k10) {
    }

    @Override // p2.V
    public final /* synthetic */ void v(int i10) {
    }

    @Override // p2.V
    public final /* synthetic */ void x(U u10) {
    }

    @Override // p2.V
    public final /* synthetic */ void y(boolean z10) {
    }

    @Override // p2.V
    public final /* synthetic */ void z(List list) {
    }

    @Override // p2.V
    public final /* synthetic */ void A(int i10, boolean z10) {
    }

    @Override // p2.V
    public final /* synthetic */ void C(int i10, int i11) {
    }

    @Override // p2.V
    public final /* synthetic */ void j(int i10, boolean z10) {
    }

    @Override // p2.V
    public final /* synthetic */ void w(p2.H h10, int i10) {
    }

    @Override // p2.V
    public final /* synthetic */ void p(int i10, p2.W w10, p2.W w11) {
    }
}
