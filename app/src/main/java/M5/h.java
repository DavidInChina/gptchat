package M5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class h extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f11641Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final h f11642Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final h f11643h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final h f11644i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final h f11645j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ h[] f11646k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [M5.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [M5.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [M5.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [M5.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [M5.h, java.lang.Enum] */
    static {
        ?? r52 = new Enum("UNKNOWN", 0);
        f11641Y = r52;
        ?? r62 = new Enum("CHARGING", 1);
        f11642Z = r62;
        ?? r72 = new Enum("DISCHARGING", 2);
        f11643h0 = r72;
        ?? r82 = new Enum("NOT_CHARGING", 3);
        f11644i0 = r82;
        ?? r92 = new Enum("FULL", 4);
        f11645j0 = r92;
        f11646k0 = new h[]{r52, r62, r72, r82, r92};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f11646k0.clone();
    }
}
