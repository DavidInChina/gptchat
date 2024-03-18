package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class S extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final S f36336Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final S f36337Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final S f36338h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final S f36339i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final S f36340j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ S[] f36341k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [jh.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [jh.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [jh.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [jh.S, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [jh.S, java.lang.Enum] */
    static {
        ?? r52 = new Enum("S3", 0);
        f36336Y = r52;
        ?? r62 = new Enum("GCP", 1);
        f36337Z = r62;
        ?? r72 = new Enum("AZURE", 2);
        f36338h0 = r72;
        ?? r82 = new Enum("ALIOSS", 3);
        f36339i0 = r82;
        ?? r92 = new Enum("OUTPUT_NOT_SET", 4);
        f36340j0 = r92;
        f36341k0 = new S[]{r52, r62, r72, r82, r92};
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f36341k0.clone();
    }
}
