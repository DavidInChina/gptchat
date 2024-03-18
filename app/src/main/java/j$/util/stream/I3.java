package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
final class I3 extends Enum {
    public static final I3 MAYBE_MORE;
    public static final I3 NO_MORE;
    public static final I3 UNLIMITED;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ I3[] f35436a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.util.stream.I3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.util.stream.I3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.I3] */
    static {
        ?? r32 = new Enum("NO_MORE", 0);
        NO_MORE = r32;
        ?? r42 = new Enum("MAYBE_MORE", 1);
        MAYBE_MORE = r42;
        ?? r52 = new Enum("UNLIMITED", 2);
        UNLIMITED = r52;
        f35436a = new I3[]{r32, r42, r52};
    }

    public static I3 valueOf(String str) {
        return (I3) Enum.valueOf(I3.class, str);
    }

    public static I3[] values() {
        return (I3[]) f35436a.clone();
    }
}
