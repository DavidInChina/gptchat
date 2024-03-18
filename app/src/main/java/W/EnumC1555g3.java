package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: W.g3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1555g3 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1555g3 f20078Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1555g3 f20079Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1555g3 f20080h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1555g3[] f20081i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, W.g3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, W.g3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, W.g3] */
    static {
        ?? r32 = new Enum("Hidden", 0);
        f20078Y = r32;
        ?? r42 = new Enum("Expanded", 1);
        f20079Z = r42;
        ?? r52 = new Enum("PartiallyExpanded", 2);
        f20080h0 = r52;
        f20081i0 = new EnumC1555g3[]{r32, r42, r52};
    }

    public static EnumC1555g3 valueOf(String str) {
        return (EnumC1555g3) Enum.valueOf(EnumC1555g3.class, str);
    }

    public static EnumC1555g3[] values() {
        return (EnumC1555g3[]) f20081i0.clone();
    }
}
