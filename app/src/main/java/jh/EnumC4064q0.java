package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4064q0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4064q0 f36557Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4064q0 f36558Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4064q0 f36559h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC4064q0 f36560i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC4064q0 f36561j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4064q0[] f36562k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, jh.q0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.q0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.q0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, jh.q0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, jh.q0] */
    static {
        ?? r52 = new Enum("S3", 0);
        f36557Y = r52;
        ?? r62 = new Enum("GCP", 1);
        f36558Z = r62;
        ?? r72 = new Enum("AZURE", 2);
        f36559h0 = r72;
        ?? r82 = new Enum("ALIOSS", 3);
        f36560i0 = r82;
        ?? r92 = new Enum("OUTPUT_NOT_SET", 4);
        f36561j0 = r92;
        f36562k0 = new EnumC4064q0[]{r52, r62, r72, r82, r92};
    }

    public static EnumC4064q0 valueOf(String str) {
        return (EnumC4064q0) Enum.valueOf(EnumC4064q0.class, str);
    }

    public static EnumC4064q0[] values() {
        return (EnumC4064q0[]) f36562k0.clone();
    }
}
