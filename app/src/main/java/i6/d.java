package i6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class d extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final d f32722Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final d f32723Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final d f32724h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final d f32725i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final d f32726j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final d f32727k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ d[] f32728l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [i6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [i6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [i6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [i6.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [i6.d, java.lang.Enum] */
    static {
        ?? r62 = new Enum("TAP", 0);
        f32722Y = r62;
        ?? r72 = new Enum("SCROLL", 1);
        f32723Z = r72;
        ?? r82 = new Enum("SWIPE", 2);
        f32724h0 = r82;
        ?? r92 = new Enum("CLICK", 3);
        f32725i0 = r92;
        ?? r10 = new Enum("BACK", 4);
        f32726j0 = r10;
        ?? r11 = new Enum("CUSTOM", 5);
        f32727k0 = r11;
        f32728l0 = new d[]{r62, r72, r82, r92, r10, r11};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f32728l0.clone();
    }
}
