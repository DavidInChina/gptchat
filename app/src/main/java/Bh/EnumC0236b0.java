package Bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Bh.b0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0236b0 extends Enum implements AbstractC0238c0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0236b0 f2316Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0236b0[] f2317Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.b0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2316Y = r12;
        f2317Z = new EnumC0236b0[]{r12};
    }

    public static EnumC0236b0 valueOf(String str) {
        return (EnumC0236b0) Enum.valueOf(EnumC0236b0.class, str);
    }

    public static EnumC0236b0[] values() {
        return (EnumC0236b0[]) f2317Z.clone();
    }

    @Override // Bh.AbstractC0238c0
    public final X d(Dh.n nVar) {
        return new C0234a0(nVar.f4810a);
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        throw new IllegalStateException("A visibility bridge handler must not apply any preparations");
    }
}
