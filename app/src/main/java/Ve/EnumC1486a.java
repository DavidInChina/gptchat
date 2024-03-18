package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ve.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1486a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1486a f18718Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1486a f18719Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1486a f18720h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1486a f18721i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC1486a f18722j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1486a[] f18723k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, Ve.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Ve.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Ve.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, Ve.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, Ve.a] */
    static {
        ?? r52 = new Enum("CONNECTING", 0);
        f18718Y = r52;
        ?? r62 = new Enum("CONNECTED", 1);
        f18719Z = r62;
        ?? r72 = new Enum("DISCONNECTED", 2);
        f18720h0 = r72;
        ?? r82 = new Enum("RECONNECTING", 3);
        f18721i0 = r82;
        ?? r92 = new Enum("RESUMING", 4);
        f18722j0 = r92;
        f18723k0 = new EnumC1486a[]{r52, r62, r72, r82, r92};
    }

    public static EnumC1486a valueOf(String str) {
        return (EnumC1486a) Enum.valueOf(EnumC1486a.class, str);
    }

    public static EnumC1486a[] values() {
        return (EnumC1486a[]) f18723k0.clone();
    }
}
