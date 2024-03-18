package p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class p extends Enum implements o {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f41707Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final p f41708Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final p f41709h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ p[] f41710i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p0.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p0.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p0.p, java.lang.Enum] */
    static {
        ?? r42 = new Enum("Active", 0);
        f41707Y = r42;
        ?? r52 = new Enum("ActiveParent", 1);
        f41708Z = r52;
        Enum r62 = new Enum("Captured", 2);
        ?? r72 = new Enum("Inactive", 3);
        f41709h0 = r72;
        f41710i0 = new p[]{r42, r52, r62, r72};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f41710i0.clone();
    }

    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                throw new RuntimeException();
            }
        }
        return false;
    }
}
