package xi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f50068Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final a f50069Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ a[] f50070h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, xi.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, xi.a] */
    static {
        ?? r32 = new Enum("NONE", 0);
        f50068Y = r32;
        Enum r42 = new Enum("BLOCKS", 1);
        ?? r52 = new Enum("BLOCKS_AND_INLINES", 2);
        f50069Z = r52;
        f50070h0 = new a[]{r32, r42, r52};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f50070h0.clone();
    }
}
