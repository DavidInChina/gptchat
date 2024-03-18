package Eh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Eh.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0526z extends Enum implements A {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0526z f4818Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0526z[] f4819Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.z] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4818Y = r12;
        f4819Z = new EnumC0526z[]{r12};
    }

    public static EnumC0526z valueOf(String str) {
        return (EnumC0526z) Enum.valueOf(EnumC0526z.class, str);
    }

    public static EnumC0526z[] values() {
        return (EnumC0526z[]) f4819Z.clone();
    }

    @Override // Eh.A
    public final void a(Class cls) {
    }
}
