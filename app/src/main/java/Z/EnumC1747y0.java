package Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Z.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1747y0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1747y0 f22770Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1747y0 f22771Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1747y0 f22772h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1747y0 f22773i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1747y0 f22774j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC1747y0 f22775k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1747y0[] f22776l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [Z.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [Z.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Z.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Z.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Z.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [Z.y0, java.lang.Enum] */
    static {
        ?? r62 = new Enum("ShutDown", 0);
        f22770Y = r62;
        ?? r72 = new Enum("ShuttingDown", 1);
        f22771Z = r72;
        ?? r82 = new Enum("Inactive", 2);
        f22772h0 = r82;
        ?? r92 = new Enum("InactivePendingWork", 3);
        f22773i0 = r92;
        ?? r10 = new Enum("Idle", 4);
        f22774j0 = r10;
        ?? r11 = new Enum("PendingWork", 5);
        f22775k0 = r11;
        f22776l0 = new EnumC1747y0[]{r62, r72, r82, r92, r10, r11};
    }

    public static EnumC1747y0 valueOf(String str) {
        return (EnumC1747y0) Enum.valueOf(EnumC1747y0.class, str);
    }

    public static EnumC1747y0[] values() {
        return (EnumC1747y0[]) f22776l0.clone();
    }
}
