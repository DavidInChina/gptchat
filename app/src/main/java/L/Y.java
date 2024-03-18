package L;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class Y extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final Y f10081Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final Y f10082Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final Y f10083h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ Y[] f10084i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, L.Y] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, L.Y] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, L.Y] */
    static {
        ?? r32 = new Enum("Cursor", 0);
        f10081Y = r32;
        ?? r42 = new Enum("SelectionStart", 1);
        f10082Z = r42;
        ?? r52 = new Enum("SelectionEnd", 2);
        f10083h0 = r52;
        f10084i0 = new Y[]{r32, r42, r52};
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f10084i0.clone();
    }
}
