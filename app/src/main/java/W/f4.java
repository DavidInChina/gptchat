package W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class f4 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final f4 f20064Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final f4 f20065Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ f4[] f20066h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, W.f4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, W.f4] */
    static {
        ?? r22 = new Enum("Filled", 0);
        f20064Y = r22;
        ?? r32 = new Enum("Outlined", 1);
        f20065Z = r32;
        f20066h0 = new f4[]{r22, r32};
    }

    public static f4 valueOf(String str) {
        return (f4) Enum.valueOf(f4.class, str);
    }

    public static f4[] values() {
        return (f4[]) f20066h0.clone();
    }
}
