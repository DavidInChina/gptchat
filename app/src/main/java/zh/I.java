package zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class I extends Enum implements J {

    /* renamed from: Y  reason: collision with root package name */
    public static final I f52111Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ I[] f52112Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zh.I, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f52111Y = r12;
        f52112Z = new I[]{r12};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f52112Z.clone();
    }
}
