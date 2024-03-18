package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class N extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final N f36287Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final N f36288Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final N f36289h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final N f36290i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ N[] f36291j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, jh.N] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.N] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.N] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.N] */
    static {
        ?? r42 = new Enum("STREAM", 0);
        f36287Y = r42;
        ?? r52 = new Enum("FILE", 1);
        f36288Z = r52;
        ?? r62 = new Enum("SEGMENTS", 2);
        f36289h0 = r62;
        ?? r72 = new Enum("RESULT_NOT_SET", 3);
        f36290i0 = r72;
        f36291j0 = new N[]{r42, r52, r62, r72};
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f36291j0.clone();
    }
}
