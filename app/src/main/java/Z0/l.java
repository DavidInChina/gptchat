package Z0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class l extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final l f22805Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final l f22806Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ l[] f22807h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Z0.l] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Z0.l] */
    static {
        ?? r22 = new Enum("Ltr", 0);
        f22805Y = r22;
        ?? r32 = new Enum("Rtl", 1);
        f22806Z = r32;
        f22807h0 = new l[]{r22, r32};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f22807h0.clone();
    }
}
