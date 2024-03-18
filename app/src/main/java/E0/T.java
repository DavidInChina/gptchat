package E0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class T extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final T f4035Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final T f4036Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ T[] f4037h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [E0.T, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [E0.T, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Min", 0);
        f4035Y = r22;
        ?? r32 = new Enum("Max", 1);
        f4036Z = r32;
        f4037h0 = new T[]{r22, r32};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f4037h0.clone();
    }
}
