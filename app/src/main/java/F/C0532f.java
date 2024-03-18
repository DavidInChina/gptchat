package F;

import E0.g0;

/* renamed from: F.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532f implements G.A {

    /* renamed from: a  reason: collision with root package name */
    public final J f4922a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4923b;

    public C0532f(J j6, int i10) {
        this.f4922a = j6;
        this.f4923b = i10;
    }

    @Override // G.A
    public final int a() {
        return ((z) this.f4922a.h()).f5015j;
    }

    @Override // G.A
    public final int b() {
        return Math.min(a() - 1, ((A) ((n) kf.t.o2(((z) this.f4922a.h()).f5012g))).f4826a + this.f4923b);
    }

    @Override // G.A
    public final void c() {
        g0 g0Var = this.f4922a.f4884n;
        if (g0Var != null) {
            ((androidx.compose.ui.node.a) g0Var).k();
        }
    }

    @Override // G.A
    public final boolean d() {
        return !((z) this.f4922a.h()).f5012g.isEmpty();
    }

    @Override // G.A
    public final int e() {
        return Math.max(0, this.f4922a.g() - this.f4923b);
    }
}
