package xg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: xg.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6447b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6447b f49992Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC6447b f49993Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6447b f49994h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC6447b f49995i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6447b[] f49996j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, xg.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, xg.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, xg.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, xg.b] */
    static {
        ?? r42 = new Enum("FUNCTION", 0);
        f49992Y = r42;
        ?? r52 = new Enum("PROPERTY", 1);
        f49993Z = r52;
        ?? r62 = new Enum("PROPERTY_GETTER", 2);
        f49994h0 = r62;
        ?? r72 = new Enum("PROPERTY_SETTER", 3);
        f49995i0 = r72;
        f49996j0 = new EnumC6447b[]{r42, r52, r62, r72};
    }

    public static EnumC6447b valueOf(String str) {
        return (EnumC6447b) Enum.valueOf(EnumC6447b.class, str);
    }

    public static EnumC6447b[] values() {
        return (EnumC6447b[]) f49996j0.clone();
    }
}
