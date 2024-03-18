package H;

import E0.g0;

/* renamed from: H.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0663l implements G.A {

    /* renamed from: a  reason: collision with root package name */
    public final F f6638a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6639b;

    public C0663l(F f6, int i10) {
        this.f6638a = f6;
        this.f6639b = i10;
    }

    @Override // G.A
    public final int a() {
        return this.f6638a.h();
    }

    @Override // G.A
    public final int b() {
        F f6 = this.f6638a;
        return Math.min(f6.h() - 1, ((C0659h) ((AbstractC0660i) kf.t.o2(((x) f6.g()).f6694a))).f6623a + this.f6639b);
    }

    @Override // G.A
    public final void c() {
        g0 g0Var = (g0) this.f6638a.f6568w.getValue();
        if (g0Var != null) {
            ((androidx.compose.ui.node.a) g0Var).k();
        }
    }

    @Override // G.A
    public final boolean d() {
        return !((x) this.f6638a.g()).f6694a.isEmpty();
    }

    @Override // G.A
    public final int e() {
        return Math.max(0, this.f6638a.f6550e - this.f6639b);
    }
}
