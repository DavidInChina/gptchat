package Bh;

/* loaded from: classes2.dex */
public enum I0 implements N0 {
    MANIFEST(true),
    ABSTRACT(false);
    

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f2220Y;

    I0(boolean z10) {
        this.f2220Y = z10;
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        if (z10 && this.f2220Y) {
            throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define abstract method '", str, "' for non-abstract class"));
        }
    }

    @Override // Bh.N0
    public final void l(String str) {
        throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define default value for '", str, "' for non-annotation type"));
    }

    @Override // Bh.N0
    public final void a() {
    }

    @Override // Bh.N0
    public final void c() {
    }

    @Override // Bh.N0
    public final void d() {
    }

    @Override // Bh.N0
    public final void e() {
    }

    @Override // Bh.N0
    public final void f() {
    }

    @Override // Bh.N0
    public final void g() {
    }

    @Override // Bh.N0
    public final void h() {
    }

    @Override // Bh.N0
    public final void i() {
    }

    @Override // Bh.N0
    public final void j() {
    }

    @Override // Bh.N0
    public final void m() {
    }

    @Override // Bh.N0
    public final void n() {
    }

    @Override // Bh.N0
    public final void p() {
    }

    @Override // Bh.N0
    public final void o(int i10, boolean z10, boolean z11) {
    }

    @Override // Bh.N0
    public final void k(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
    }
}
