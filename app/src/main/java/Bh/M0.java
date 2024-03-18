package Bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class M0 extends Enum implements N0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final M0 f2233Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ M0[] f2234Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.M0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2233Y = r12;
        f2234Z = new M0[]{r12};
    }

    public static M0 valueOf(String str) {
        return (M0) Enum.valueOf(M0.class, str);
    }

    public static M0[] values() {
        return (M0[]) f2234Z.clone();
    }

    @Override // Bh.N0
    public final void o(int i10, boolean z10, boolean z11) {
        if ((i10 & 1024) == 0) {
            return;
        }
        throw new IllegalStateException("Cannot define a record class as abstract");
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

    @Override // Bh.N0
    public final void k(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
    }

    @Override // Bh.N0
    public final void b(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
    }
}
