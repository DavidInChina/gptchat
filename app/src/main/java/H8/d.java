package H8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f7481Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ d[] f7482Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, H8.d] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        f7481Y = r32;
        f7482Z = new d[]{r32, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f7482Z.clone();
    }
}
