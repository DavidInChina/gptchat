package j7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: j7.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3915e extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC3915e f36040Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3915e f36041Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3915e f36042h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3915e[] f36043i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j7.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j7.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j7.e] */
    static {
        ?? r32 = new Enum("NETWORK_UNMETERED", 0);
        f36040Y = r32;
        ?? r42 = new Enum("DEVICE_IDLE", 1);
        f36041Z = r42;
        ?? r52 = new Enum("DEVICE_CHARGING", 2);
        f36042h0 = r52;
        f36043i0 = new EnumC3915e[]{r32, r42, r52};
    }

    public static EnumC3915e valueOf(String str) {
        return (EnumC3915e) Enum.valueOf(EnumC3915e.class, str);
    }

    public static EnumC3915e[] values() {
        return (EnumC3915e[]) f36043i0.clone();
    }
}
