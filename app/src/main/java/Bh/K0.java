package Bh;

/* loaded from: classes2.dex */
public enum K0 implements N0 {
    CLASSIC(true),
    JAVA_8(false);
    

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f2228Y;

    K0(boolean z10) {
        this.f2228Y = z10;
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        if (!str.equals("<clinit>")) {
            if (!z15) {
                boolean z18 = this.f2228Y;
                if (z18 && !z11) {
                    throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define non-public method '", str, "' for interface type"));
                }
                if (z18 && !z14) {
                    throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define non-virtual method '", str, "' for a pre-Java 8 interface type"));
                }
                if (z18 && !z10) {
                    throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define default method '", str, "' for pre-Java 8 interface type"));
                }
                return;
            }
            throw new IllegalStateException("Cannot define constructor for interface type");
        }
    }

    @Override // Bh.N0
    public final void k(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 && z10 && z12) {
            return;
        }
        throw new IllegalStateException(android.gov.nist.core.a.A("Cannot only define public, static, final field '", str, "' for interface type"));
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
}
