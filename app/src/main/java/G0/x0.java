package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class x0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final x0 f5841Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final x0 f5842Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final x0 f5843h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ x0[] f5844i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [G0.x0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [G0.x0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [G0.x0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("ContinueTraversal", 0);
        f5841Y = r32;
        ?? r42 = new Enum("SkipSubtreeAndContinueTraversal", 1);
        f5842Z = r42;
        ?? r52 = new Enum("CancelTraversal", 2);
        f5843h0 = r52;
        f5844i0 = new x0[]{r32, r42, r52};
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f5844i0.clone();
    }
}
