package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class M extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final M f36265Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final M f36266Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final M f36267h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final M f36268i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final M f36269j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final M f36270k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ M[] f36271l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, jh.M] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, jh.M] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, jh.M] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.M] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, jh.M] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, jh.M] */
    static {
        ?? r62 = new Enum("ROOM_COMPOSITE", 0);
        f36265Y = r62;
        ?? r72 = new Enum("WEB", 1);
        f36266Z = r72;
        ?? r82 = new Enum("PARTICIPANT", 2);
        f36267h0 = r82;
        ?? r92 = new Enum("TRACK_COMPOSITE", 3);
        f36268i0 = r92;
        ?? r10 = new Enum("TRACK", 4);
        f36269j0 = r10;
        ?? r11 = new Enum("REQUEST_NOT_SET", 5);
        f36270k0 = r11;
        f36271l0 = new M[]{r62, r72, r82, r92, r10, r11};
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f36271l0.clone();
    }
}
