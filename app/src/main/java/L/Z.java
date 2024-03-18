package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class Z extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final Z f10085Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final Z f10086Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final Z f10087h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ Z[] f10088i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, L.Z] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, L.Z] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, L.Z] */
    static {
        ?? r32 = new Enum("None", 0);
        f10085Y = r32;
        ?? r42 = new Enum("Selection", 1);
        f10086Z = r42;
        ?? r52 = new Enum("Cursor", 2);
        f10087h0 = r52;
        f10088i0 = new Z[]{r32, r42, r52};
    }

    public static Z valueOf(String str) {
        return (Z) Enum.valueOf(Z.class, str);
    }

    public static Z[] values() {
        return (Z[]) f10088i0.clone();
    }
}
