package Bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class L0 extends Enum implements N0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final L0 f2231Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ L0[] f2232Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.L0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2231Y = r12;
        f2232Z = new L0[]{r12};
    }

    public static L0 valueOf(String str) {
        return (L0) Enum.valueOf(L0.class, str);
    }

    public static L0[] values() {
        return (L0[]) f2232Z.clone();
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        throw new IllegalStateException("Cannot define a method for a package description type");
    }

    @Override // Bh.N0
    public final void k(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        throw new IllegalStateException("Cannot define a field for a package description type");
    }

    @Override // Bh.N0
    public final void o(int i10, boolean z10, boolean z11) {
        if (i10 == 5632) {
            if (!z10) {
                return;
            }
            throw new IllegalStateException("Cannot implement interface for package type");
        }
        throw new IllegalStateException("A package description type must define 5632 as modifier");
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
