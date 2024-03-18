package A;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class B0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final B0 f14Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final B0 f15Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final B0 f16h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ B0[] f17i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, A.B0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, A.B0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, A.B0] */
    static {
        ?? r32 = new Enum("Default", 0);
        f14Y = r32;
        ?? r42 = new Enum("UserInput", 1);
        f15Z = r42;
        ?? r52 = new Enum("PreventUserInput", 2);
        f16h0 = r52;
        f17i0 = new B0[]{r32, r42, r52};
    }

    public static B0 valueOf(String str) {
        return (B0) Enum.valueOf(B0.class, str);
    }

    public static B0[] values() {
        return (B0[]) f17i0.clone();
    }
}
