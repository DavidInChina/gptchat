package B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class W0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final W0 f1213Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final W0 f1214Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ W0[] f1215h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, B.W0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, B.W0] */
    static {
        ?? r22 = new Enum("Vertical", 0);
        f1213Y = r22;
        ?? r32 = new Enum("Horizontal", 1);
        f1214Z = r32;
        f1215h0 = new W0[]{r22, r32};
    }

    public static W0 valueOf(String str) {
        return (W0) Enum.valueOf(W0.class, str);
    }

    public static W0[] values() {
        return (W0[]) f1215h0.clone();
    }
}
