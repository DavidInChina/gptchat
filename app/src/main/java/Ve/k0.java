package Ve;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class k0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final k0 f18806Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final k0 f18807Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final k0 f18808h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final k0 f18809i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ k0[] f18810j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Ve.k0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ve.k0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Ve.k0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Ve.k0] */
    static {
        ?? r42 = new Enum("CONNECTING", 0);
        f18806Y = r42;
        ?? r52 = new Enum("CONNECTED", 1);
        f18807Z = r52;
        ?? r62 = new Enum("DISCONNECTED", 2);
        f18808h0 = r62;
        ?? r72 = new Enum("RECONNECTING", 3);
        f18809i0 = r72;
        f18810j0 = new k0[]{r42, r52, r62, r72};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f18810j0.clone();
    }
}
