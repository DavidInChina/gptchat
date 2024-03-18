package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: W.s1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1612s1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1612s1 f20402Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1612s1 f20403Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1612s1 f20404h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1612s1[] f20405i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, W.s1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, W.s1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, W.s1] */
    static {
        ?? r32 = new Enum("Focused", 0);
        f20402Y = r32;
        ?? r42 = new Enum("UnfocusedEmpty", 1);
        f20403Z = r42;
        ?? r52 = new Enum("UnfocusedNotEmpty", 2);
        f20404h0 = r52;
        f20405i0 = new EnumC1612s1[]{r32, r42, r52};
    }

    public static EnumC1612s1 valueOf(String str) {
        return (EnumC1612s1) Enum.valueOf(EnumC1612s1.class, str);
    }

    public static EnumC1612s1[] values() {
        return (EnumC1612s1[]) f20405i0.clone();
    }
}
