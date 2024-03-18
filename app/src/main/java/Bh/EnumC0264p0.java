package Bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Bh.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0264p0 extends Enum implements AbstractC0267r0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0264p0 f2371Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0264p0[] f2372Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.p0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2371Y = r12;
        f2372Z = new EnumC0264p0[]{r12};
    }

    public static EnumC0264p0 valueOf(String str) {
        return (EnumC0264p0) Enum.valueOf(EnumC0264p0.class, str);
    }

    public static EnumC0264p0[] values() {
        return (EnumC0264p0[]) f2372Z.clone();
    }

    @Override // Bh.AbstractC0267r0
    public final void a(Nh.l lVar) {
        Object[] objArr = AbstractC0267r0.f2377e;
        lVar.l(-1, 0, 0, objArr, objArr);
        lVar.n(0);
    }

    @Override // Bh.AbstractC0267r0
    public final void b(int i10, int i11) {
    }
}
