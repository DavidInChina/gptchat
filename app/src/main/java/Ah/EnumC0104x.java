package Ah;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0104x extends Enum implements AbstractC0105y {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0104x f971Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0104x[] f972Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Ah.x] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f971Y = r12;
        f972Z = new EnumC0104x[]{r12};
    }

    public static EnumC0104x valueOf(String str) {
        return (EnumC0104x) Enum.valueOf(EnumC0104x.class, str);
    }

    public static EnumC0104x[] values() {
        return (EnumC0104x[]) f972Z.clone();
    }
}
