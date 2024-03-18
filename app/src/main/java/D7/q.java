package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class q extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final q f28116Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ q[] f28117Z;
    /* JADX INFO: Fake field, exist only in values array */
    q EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, d7.q] */
    static {
        Enum r22 = new Enum("UNKNOWN", 0);
        ?? r32 = new Enum("ANDROID_FIREBASE", 1);
        f28116Y = r32;
        f28117Z = new q[]{r22, r32};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f28117Z.clone();
    }
}
