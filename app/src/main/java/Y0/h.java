package Y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class h extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f22027Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final h f22028Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ h[] f22029h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Y0.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Y0.h] */
    static {
        ?? r22 = new Enum("Ltr", 0);
        f22027Y = r22;
        ?? r32 = new Enum("Rtl", 1);
        f22028Z = r32;
        f22029h0 = new h[]{r22, r32};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f22029h0.clone();
    }
}
