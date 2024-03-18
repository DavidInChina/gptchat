package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class A3 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final A3 f18981Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final A3 f18982Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ A3[] f18983h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [W.A3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [W.A3, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Dismissed", 0);
        f18981Y = r22;
        ?? r32 = new Enum("ActionPerformed", 1);
        f18982Z = r32;
        f18983h0 = new A3[]{r22, r32};
    }

    public static A3 valueOf(String str) {
        return (A3) Enum.valueOf(A3.class, str);
    }

    public static A3[] values() {
        return (A3[]) f18983h0.clone();
    }
}
