package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: j$.util.stream.d3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class EnumC3754d3 extends Enum {
    public static final EnumC3754d3 OP;
    public static final EnumC3754d3 SPLITERATOR;
    public static final EnumC3754d3 STREAM;
    public static final EnumC3754d3 TERMINAL_OP;
    public static final EnumC3754d3 UPSTREAM_TERMINAL_OP;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC3754d3[] f35612a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.util.stream.d3] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.util.stream.d3] */
    static {
        ?? r52 = new Enum("SPLITERATOR", 0);
        SPLITERATOR = r52;
        ?? r62 = new Enum("STREAM", 1);
        STREAM = r62;
        ?? r72 = new Enum("OP", 2);
        OP = r72;
        ?? r82 = new Enum("TERMINAL_OP", 3);
        TERMINAL_OP = r82;
        ?? r92 = new Enum("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r92;
        f35612a = new EnumC3754d3[]{r52, r62, r72, r82, r92};
    }

    public static EnumC3754d3 valueOf(String str) {
        return (EnumC3754d3) Enum.valueOf(EnumC3754d3.class, str);
    }

    public static EnumC3754d3[] values() {
        return (EnumC3754d3[]) f35612a.clone();
    }
}
