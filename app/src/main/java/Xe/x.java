package Xe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class x extends Enum {
    public static final w Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final x f21939Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final x f21940Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final x f21941h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ x[] f21942i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Xe.w] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Xe.x] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Xe.x] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Xe.x] */
    static {
        ?? r32 = new Enum("ACTIVE", 0);
        f21939Y = r32;
        ?? r42 = new Enum("PAUSED", 1);
        f21940Z = r42;
        ?? r52 = new Enum("UNKNOWN", 2);
        f21941h0 = r52;
        f21942i0 = new x[]{r32, r42, r52};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f21942i0.clone();
    }
}
