package We;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: We.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1654e extends Enum {
    public static final C1653d Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1654e f20990Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1654e f20991Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1654e f20992h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1654e f20993i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1654e f20994j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1654e[] f20995k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, We.d] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, We.e] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, We.e] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, We.e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, We.e] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, We.e] */
    static {
        ?? r52 = new Enum("EXCELLENT", 0);
        f20990Y = r52;
        ?? r62 = new Enum("GOOD", 1);
        f20991Z = r62;
        ?? r72 = new Enum("POOR", 2);
        f20992h0 = r72;
        ?? r82 = new Enum("UNKNOWN", 3);
        f20993i0 = r82;
        ?? r92 = new Enum("LOST", 4);
        f20994j0 = r92;
        f20995k0 = new EnumC1654e[]{r52, r62, r72, r82, r92};
    }

    public static EnumC1654e valueOf(String str) {
        return (EnumC1654e) Enum.valueOf(EnumC1654e.class, str);
    }

    public static EnumC1654e[] values() {
        return (EnumC1654e[]) f20995k0.clone();
    }
}
