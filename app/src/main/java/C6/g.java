package C6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class g extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final g f2720Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final g f2721Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final g f2722h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final g f2723i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ g[] f2724j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [C6.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [C6.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [C6.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [C6.g, java.lang.Enum] */
    static {
        ?? r42 = new Enum("DATADOG", 0);
        f2720Y = r42;
        ?? r52 = new Enum("B3", 1);
        f2721Z = r52;
        ?? r62 = new Enum("B3MULTI", 2);
        f2722h0 = r62;
        ?? r72 = new Enum("TRACECONTEXT", 3);
        f2723i0 = r72;
        f2724j0 = new g[]{r42, r52, r62, r72};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2724j0.clone();
    }
}
