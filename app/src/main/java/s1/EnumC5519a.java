package s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: s1.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5519a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC5519a f45098Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC5519a f45099Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC5519a f45100h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC5519a f45101i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC5519a f45102j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC5519a[] f45103k0;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC5519a EF6;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Enum, s1.a] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, s1.a] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Enum, s1.a] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, s1.a] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Enum, s1.a] */
    static {
        Enum r62 = new Enum("CLEAR", 0);
        Enum r72 = new Enum("SRC", 1);
        Enum r52 = new Enum("DST", 2);
        Enum r42 = new Enum("SRC_OVER", 3);
        Enum r32 = new Enum("DST_OVER", 4);
        Enum r22 = new Enum("SRC_IN", 5);
        Enum r12 = new Enum("DST_IN", 6);
        Enum r02 = new Enum("SRC_OUT", 7);
        Enum r15 = new Enum("DST_OUT", 8);
        Enum r14 = new Enum("SRC_ATOP", 9);
        Enum r13 = new Enum("DST_ATOP", 10);
        Enum r122 = new Enum("XOR", 11);
        ?? r11 = new Enum("PLUS", 12);
        f45098Y = r11;
        Enum r10 = new Enum("MODULATE", 13);
        ?? r92 = new Enum("SCREEN", 14);
        f45099Z = r92;
        ?? r82 = new Enum("OVERLAY", 15);
        f45100h0 = r82;
        ?? r93 = new Enum("DARKEN", 16);
        f45101i0 = r93;
        ?? r83 = new Enum("LIGHTEN", 17);
        f45102j0 = r83;
        f45103k0 = new EnumC5519a[]{r62, r72, r52, r42, r32, r22, r12, r02, r15, r14, r13, r122, r11, r10, r92, r82, r93, r83, new Enum("COLOR_DODGE", 18), new Enum("COLOR_BURN", 19), new Enum("HARD_LIGHT", 20), new Enum("SOFT_LIGHT", 21), new Enum("DIFFERENCE", 22), new Enum("EXCLUSION", 23), new Enum("MULTIPLY", 24), new Enum("HUE", 25), new Enum("SATURATION", 26), new Enum("COLOR", 27), new Enum("LUMINOSITY", 28)};
    }

    public static EnumC5519a valueOf(String str) {
        return (EnumC5519a) Enum.valueOf(EnumC5519a.class, str);
    }

    public static EnumC5519a[] values() {
        return (EnumC5519a[]) f45103k0.clone();
    }
}
