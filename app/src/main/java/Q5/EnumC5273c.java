package q5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: q5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5273c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5273c f43919Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5273c f43920Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5273c f43921h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC5273c f43922i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5273c[] f43923j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, q5.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, q5.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, q5.c] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, q5.c] */
    static {
        ?? r52 = new Enum("MOBILE", 0);
        f43919Y = r52;
        ?? r62 = new Enum("TABLET", 1);
        f43920Z = r62;
        ?? r72 = new Enum("TV", 2);
        f43921h0 = r72;
        Enum r82 = new Enum("DESKTOP", 3);
        ?? r92 = new Enum("OTHER", 4);
        f43922i0 = r92;
        f43923j0 = new EnumC5273c[]{r52, r62, r72, r82, r92};
    }

    public static EnumC5273c valueOf(String str) {
        return (EnumC5273c) Enum.valueOf(EnumC5273c.class, str);
    }

    public static EnumC5273c[] values() {
        return (EnumC5273c[]) f43923j0.clone();
    }
}
