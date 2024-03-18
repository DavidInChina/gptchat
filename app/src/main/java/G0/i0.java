package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class i0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final i0 f5790Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final i0 f5791Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ i0[] f5792h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [G0.i0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [G0.i0, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Width", 0);
        f5790Y = r22;
        ?? r32 = new Enum("Height", 1);
        f5791Z = r32;
        f5792h0 = new i0[]{r22, r32};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f5792h0.clone();
    }
}
