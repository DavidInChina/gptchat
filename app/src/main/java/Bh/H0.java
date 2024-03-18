package Bh;

/* loaded from: classes2.dex */
public enum H0 implements N0 {
    CLASSIC(true),
    JAVA_8(false);
    

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f2214Y;

    H0(boolean z10) {
        this.f2214Y = z10;
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        if (!str.equals("<clinit>")) {
            if (!z15) {
                if (this.f2214Y && !z14) {
                    throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define non-virtual method '", str, "' for a pre-Java 8 annotation type"));
                }
                if (!z13 && z16) {
                    throw new IllegalStateException(android.gov.nist.core.a.A("Cannot define method '", str, "' with the given signature as an annotation type method"));
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
    public final void o(int i10, boolean z10, boolean z11) {
        if ((i10 & 512) != 0) {
            return;
        }
        throw new IllegalStateException("Cannot define annotation type without interface modifier");
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
    public final void l(String str) {
    }
}
