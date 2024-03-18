package y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class V extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final V f50156Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final V f50157Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final V f50158h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ V[] f50159i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [y.V, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [y.V, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [y.V, java.lang.Enum] */
    static {
        ?? r32 = new Enum("PreEnter", 0);
        f50156Y = r32;
        ?? r42 = new Enum("Visible", 1);
        f50157Z = r42;
        ?? r52 = new Enum("PostExit", 2);
        f50158h0 = r52;
        f50159i0 = new V[]{r32, r42, r52};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f50159i0.clone();
    }
}
