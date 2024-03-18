package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class K extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final K f36258Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final K f36259Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final K f36260h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final K f36261i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final K f36262j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ K[] f36263k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, jh.K] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.K] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.K] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, jh.K] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, jh.K] */
    static {
        ?? r52 = new Enum("S3", 0);
        f36258Y = r52;
        ?? r62 = new Enum("GCP", 1);
        f36259Z = r62;
        ?? r72 = new Enum("AZURE", 2);
        f36260h0 = r72;
        ?? r82 = new Enum("ALIOSS", 3);
        f36261i0 = r82;
        ?? r92 = new Enum("OUTPUT_NOT_SET", 4);
        f36262j0 = r92;
        f36263k0 = new K[]{r52, r62, r72, r82, r92};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f36263k0.clone();
    }
}
