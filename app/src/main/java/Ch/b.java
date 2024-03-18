package Ch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final b f3158Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ b[] f3159Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Ch.b] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f3158Y = r12;
        f3159Z = new b[]{r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3159Z.clone();
    }
}
