package E2;

import s2.AbstractC5530A;

/* loaded from: classes.dex */
public abstract class k0 extends AbstractC0477i {

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0469a f4375k;

    public k0(AbstractC0469a abstractC0469a) {
        this.f4375k = abstractC0469a;
    }

    @Override // E2.AbstractC0469a
    public final p2.g0 f() {
        return this.f4375k.f();
    }

    @Override // E2.AbstractC0469a
    public final p2.H g() {
        return this.f4375k.g();
    }

    @Override // E2.AbstractC0469a
    public final boolean h() {
        return this.f4375k.h();
    }

    @Override // E2.AbstractC0469a
    public final void k(v2.F f6) {
        this.f4358j = f6;
        this.f4357i = AbstractC5530A.l(null);
        z();
    }

    @Override // E2.AbstractC0469a
    public void r(p2.H h10) {
        this.f4375k.r(h10);
    }

    @Override // E2.AbstractC0477i
    public final C0492y s(Object obj, C0492y c0492y) {
        Void r12 = (Void) obj;
        return x(c0492y);
    }

    @Override // E2.AbstractC0477i
    public final long t(Object obj, long j6) {
        Void r12 = (Void) obj;
        return j6;
    }

    @Override // E2.AbstractC0477i
    public final int u(int i10, Object obj) {
        Void r22 = (Void) obj;
        return i10;
    }

    @Override // E2.AbstractC0477i
    public final void v(Object obj, AbstractC0469a abstractC0469a, p2.g0 g0Var) {
        Void r12 = (Void) obj;
        y(g0Var);
    }

    public abstract void y(p2.g0 g0Var);

    public void z() {
        w(null, this.f4375k);
    }

    public C0492y x(C0492y c0492y) {
        return c0492y;
    }
}
