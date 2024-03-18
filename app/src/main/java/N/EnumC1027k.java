package N;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: N.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1027k extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1027k f12359Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1027k f12360Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1027k f12361h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1027k[] f12362i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, N.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, N.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, N.k] */
    static {
        ?? r32 = new Enum("TopLeft", 0);
        f12359Y = r32;
        ?? r42 = new Enum("TopRight", 1);
        f12360Z = r42;
        ?? r52 = new Enum("TopMiddle", 2);
        f12361h0 = r52;
        f12362i0 = new EnumC1027k[]{r32, r42, r52};
    }

    public static EnumC1027k valueOf(String str) {
        return (EnumC1027k) Enum.valueOf(EnumC1027k.class, str);
    }

    public static EnumC1027k[] values() {
        return (EnumC1027k[]) f12362i0.clone();
    }
}
