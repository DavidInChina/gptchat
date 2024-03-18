package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class T2 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final T2 f19698Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final T2 f19699Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final T2 f19700h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final T2 f19701i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final T2 f19702j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ T2[] f19703k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, W.T2] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, W.T2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, W.T2] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, W.T2] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, W.T2] */
    static {
        ?? r52 = new Enum("TopBar", 0);
        f19698Y = r52;
        ?? r62 = new Enum("MainContent", 1);
        f19699Z = r62;
        ?? r72 = new Enum("Snackbar", 2);
        f19700h0 = r72;
        ?? r82 = new Enum("Fab", 3);
        f19701i0 = r82;
        ?? r92 = new Enum("BottomBar", 4);
        f19702j0 = r92;
        f19703k0 = new T2[]{r52, r62, r72, r82, r92};
    }

    public static T2 valueOf(String str) {
        return (T2) Enum.valueOf(T2.class, str);
    }

    public static T2[] values() {
        return (T2[]) f19703k0.clone();
    }
}
