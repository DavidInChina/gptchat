package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class J extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final J f21451Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final J f21452Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final J f21453h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final J f21454i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final J f21455j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final J f21456k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final J f21457l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ J[] f21458m0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Enum, X.J] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Enum, X.J] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, X.J] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, X.J] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, X.J] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, X.J] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, X.J] */
    static {
        ?? r15 = new Enum("BodyLarge", 0);
        f21451Y = r15;
        ?? r02 = new Enum("BodyMedium", 1);
        f21452Z = r02;
        Enum r14 = new Enum("BodySmall", 2);
        Enum r13 = new Enum("DisplayLarge", 3);
        Enum r12 = new Enum("DisplayMedium", 4);
        Enum r11 = new Enum("DisplaySmall", 5);
        Enum r10 = new Enum("HeadlineLarge", 6);
        ?? r92 = new Enum("HeadlineMedium", 7);
        f21453h0 = r92;
        ?? r82 = new Enum("HeadlineSmall", 8);
        f21454i0 = r82;
        ?? r72 = new Enum("LabelLarge", 9);
        f21455j0 = r72;
        Enum r62 = new Enum("LabelMedium", 10);
        ?? r52 = new Enum("LabelSmall", 11);
        f21456k0 = r52;
        ?? r42 = new Enum("TitleLarge", 12);
        f21457l0 = r42;
        f21458m0 = new J[]{r15, r02, r14, r13, r12, r11, r10, r92, r82, r72, r62, r52, r42, new Enum("TitleMedium", 13), new Enum("TitleSmall", 14)};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f21458m0.clone();
    }
}
