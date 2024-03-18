package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class F extends Enum {
    public static final F LENIENT;
    public static final F SMART;
    public static final F STRICT;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ F[] f34995a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.format.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.time.format.F, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.time.format.F, java.lang.Enum] */
    static {
        ?? r32 = new Enum("STRICT", 0);
        STRICT = r32;
        ?? r42 = new Enum("SMART", 1);
        SMART = r42;
        ?? r52 = new Enum("LENIENT", 2);
        LENIENT = r52;
        f34995a = new F[]{r32, r42, r52};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f34995a.clone();
    }
}
