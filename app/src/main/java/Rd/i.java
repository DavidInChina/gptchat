package Rd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class i extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final i f15449Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final i f15450Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ i[] f15451h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Rd.i] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Rd.i] */
    static {
        ?? r22 = new Enum("Initial", 0);
        f15449Y = r22;
        ?? r32 = new Enum("Refresh", 1);
        f15450Z = r32;
        f15451h0 = new i[]{r22, r32};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f15451h0.clone();
    }
}
