package X1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class q extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final q f21763Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ q[] f21764Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, X1.q] */
    static {
        ?? r32 = new Enum("Visible", 0);
        f21763Y = r32;
        f21764Z = new q[]{r32, new Enum("Invisible", 1), new Enum("Gone", 2)};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f21764Z.clone();
    }
}
