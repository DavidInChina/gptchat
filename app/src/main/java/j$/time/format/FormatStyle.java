package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes3.dex */
public final class FormatStyle extends Enum<FormatStyle> {
    public static final FormatStyle FULL;
    public static final FormatStyle LONG;
    public static final FormatStyle MEDIUM;
    public static final FormatStyle SHORT;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ FormatStyle[] f34996a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    static {
        ?? r42 = new Enum("FULL", 0);
        FULL = r42;
        ?? r52 = new Enum("LONG", 1);
        LONG = r52;
        ?? r62 = new Enum("MEDIUM", 2);
        MEDIUM = r62;
        ?? r72 = new Enum("SHORT", 3);
        SHORT = r72;
        f34996a = new FormatStyle[]{r42, r52, r62, r72};
    }

    public static FormatStyle valueOf(String str) {
        return (FormatStyle) Enum.valueOf(FormatStyle.class, str);
    }

    public static FormatStyle[] values() {
        return (FormatStyle[]) f34996a.clone();
    }
}
