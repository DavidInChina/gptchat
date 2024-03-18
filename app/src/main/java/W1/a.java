package W1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f20672Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final a f20673Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final a f20674h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final a f20675i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final a f20676j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final a f20677k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ a[] f20678l0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, W1.a] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, W1.a] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, W1.a] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, W1.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, W1.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, W1.a] */
    static {
        ?? r92 = new Enum("PENALTY_LOG", 0);
        f20672Y = r92;
        ?? r10 = new Enum("PENALTY_DEATH", 1);
        f20673Z = r10;
        ?? r11 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f20674h0 = r11;
        ?? r12 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f20675i0 = r12;
        ?? r13 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f20676j0 = r13;
        Enum r14 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        Enum r15 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        Enum r32 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        ?? r22 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f20677k0 = r22;
        f20678l0 = new a[]{r92, r10, r11, r12, r13, r14, r15, r32, r22};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20678l0.clone();
    }
}
