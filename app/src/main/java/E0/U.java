package E0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class U extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final U f4038Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final U f4039Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ U[] f4040h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [E0.U, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [E0.U, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Width", 0);
        f4038Y = r22;
        ?? r32 = new Enum("Height", 1);
        f4039Z = r32;
        f4040h0 = new U[]{r22, r32};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f4040h0.clone();
    }
}
