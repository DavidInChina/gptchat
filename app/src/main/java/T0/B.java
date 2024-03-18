package T0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class B extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final B f16732Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final B f16733Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final B f16734h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final B f16735i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ B[] f16736j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, T0.B] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, T0.B] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, T0.B] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, T0.B] */
    static {
        ?? r42 = new Enum("StartInput", 0);
        f16732Y = r42;
        ?? r52 = new Enum("StopInput", 1);
        f16733Z = r52;
        ?? r62 = new Enum("ShowKeyboard", 2);
        f16734h0 = r62;
        ?? r72 = new Enum("HideKeyboard", 3);
        f16735i0 = r72;
        f16736j0 = new B[]{r42, r52, r62, r72};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f16736j0.clone();
    }
}
