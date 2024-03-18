package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class G0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final G0 f36234Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final G0 f36235Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final G0 f36236h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final G0 f36237i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ G0[] f36238j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, jh.G0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.G0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.G0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.G0] */
    static {
        ?? r42 = new Enum("FILE", 0);
        f36234Y = r42;
        ?? r52 = new Enum("STREAM", 1);
        f36235Z = r52;
        ?? r62 = new Enum("SEGMENTS", 2);
        f36236h0 = r62;
        ?? r72 = new Enum("OUTPUT_NOT_SET", 3);
        f36237i0 = r72;
        f36238j0 = new G0[]{r42, r52, r62, r72};
    }

    public static G0 valueOf(String str) {
        return (G0) Enum.valueOf(G0.class, str);
    }

    public static G0[] values() {
        return (G0[]) f36238j0.clone();
    }
}
