package Ah;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0100t extends Enum implements AbstractC0102v, AbstractC0101u {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0100t f960Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0100t[] f961Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ah.t, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f960Y = r12;
        f961Z = new EnumC0100t[]{r12};
    }

    public static EnumC0100t valueOf(String str) {
        return (EnumC0100t) Enum.valueOf(EnumC0100t.class, str);
    }

    public static EnumC0100t[] values() {
        return (EnumC0100t[]) f961Z.clone();
    }

    @Override // Ah.AbstractC0101u
    public final AbstractC0102v a() {
        return this;
    }

    @Override // Ah.AbstractC0102v
    public final Object b(C0103w c0103w, String str) {
        return c0103w;
    }
}
