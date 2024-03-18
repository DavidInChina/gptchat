package Y8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class e extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final e f22117Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final e f22118Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final e f22119h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ e[] f22120i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Y8.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Y8.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Y8.e] */
    static {
        ?? r32 = new Enum("IDLE", 0);
        f22117Y = r32;
        ?? r42 = new Enum("SYNCING", 1);
        f22118Z = r42;
        ?? r52 = new Enum("STOPPED", 2);
        f22119h0 = r52;
        f22120i0 = new e[]{r32, r42, r52};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f22120i0.clone();
    }
}
