package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.c0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3994c0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC3994c0 f36404Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3994c0 f36405Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3994c0 f36406h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC3994c0 f36407i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC3994c0 f36408j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3994c0[] f36409k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, jh.c0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.c0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.c0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, jh.c0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, jh.c0] */
    static {
        ?? r52 = new Enum("S3", 0);
        f36404Y = r52;
        ?? r62 = new Enum("GCP", 1);
        f36405Z = r62;
        ?? r72 = new Enum("AZURE", 2);
        f36406h0 = r72;
        ?? r82 = new Enum("ALIOSS", 3);
        f36407i0 = r82;
        ?? r92 = new Enum("OUTPUT_NOT_SET", 4);
        f36408j0 = r92;
        f36409k0 = new EnumC3994c0[]{r52, r62, r72, r82, r92};
    }

    public static EnumC3994c0 valueOf(String str) {
        return (EnumC3994c0) Enum.valueOf(EnumC3994c0.class, str);
    }

    public static EnumC3994c0[] values() {
        return (EnumC3994c0[]) f36409k0.clone();
    }
}
