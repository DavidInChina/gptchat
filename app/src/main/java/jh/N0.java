package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class N0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final N0 f36292Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final N0 f36293Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final N0 f36294h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final N0 f36295i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ N0[] f36296j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, jh.N0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.N0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.N0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.N0] */
    static {
        ?? r42 = new Enum("FILE", 0);
        f36292Y = r42;
        ?? r52 = new Enum("STREAM", 1);
        f36293Z = r52;
        ?? r62 = new Enum("SEGMENTS", 2);
        f36294h0 = r62;
        ?? r72 = new Enum("OUTPUT_NOT_SET", 3);
        f36295i0 = r72;
        f36296j0 = new N0[]{r42, r52, r62, r72};
    }

    public static N0 valueOf(String str) {
        return (N0) Enum.valueOf(N0.class, str);
    }

    public static N0[] values() {
        return (N0[]) f36296j0.clone();
    }
}
