package zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class K extends Enum implements L {

    /* renamed from: Y  reason: collision with root package name */
    public static final K f52113Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ K[] f52114Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zh.K, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f52113Y = r12;
        f52114Z = new K[]{r12};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f52114Z.clone();
    }
}
