package Hi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class h extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f7873Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final h f7874Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final h f7875h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final h f7876i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ h[] f7877j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Hi.h] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Hi.h] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Hi.h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Hi.h] */
    static {
        ?? r42 = new Enum("FIRST_START_AFTER_CLEAR_DATA", 0);
        f7873Y = r42;
        ?? r52 = new Enum("FIRST_START_AFTER_FRESH_INSTALL", 1);
        f7874Z = r52;
        ?? r62 = new Enum("FIRST_START_AFTER_UPGRADE", 2);
        f7875h0 = r62;
        ?? r72 = new Enum("NORMAL_START", 3);
        f7876i0 = r72;
        f7877j0 = new h[]{r42, r52, r62, r72};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7877j0.clone();
    }
}
