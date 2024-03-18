package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3980H extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC3980H f36239Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3980H f36240Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3980H f36241h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC3980H f36242i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3980H[] f36243j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, jh.H] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.H] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.H] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.H] */
    static {
        ?? r42 = new Enum("S3", 0);
        f36239Y = r42;
        ?? r52 = new Enum("GCP", 1);
        f36240Z = r52;
        ?? r62 = new Enum("AZURE", 2);
        f36241h0 = r62;
        ?? r72 = new Enum("OUTPUT_NOT_SET", 3);
        f36242i0 = r72;
        f36243j0 = new EnumC3980H[]{r42, r52, r62, r72};
    }

    public static EnumC3980H valueOf(String str) {
        return (EnumC3980H) Enum.valueOf(EnumC3980H.class, str);
    }

    public static EnumC3980H[] values() {
        return (EnumC3980H[]) f36243j0.clone();
    }
}
