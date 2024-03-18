package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4044m0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4044m0 f36498Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4044m0 f36499Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4044m0 f36500h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC4044m0 f36501i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4044m0[] f36502j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, jh.m0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.m0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, jh.m0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, jh.m0] */
    static {
        ?? r42 = new Enum("FILE", 0);
        f36498Y = r42;
        ?? r52 = new Enum("STREAM", 1);
        f36499Z = r52;
        ?? r62 = new Enum("SEGMENTS", 2);
        f36500h0 = r62;
        ?? r72 = new Enum("OUTPUT_NOT_SET", 3);
        f36501i0 = r72;
        f36502j0 = new EnumC4044m0[]{r42, r52, r62, r72};
    }

    public static EnumC4044m0 valueOf(String str) {
        return (EnumC4044m0) Enum.valueOf(EnumC4044m0.class, str);
    }

    public static EnumC4044m0[] values() {
        return (EnumC4044m0[]) f36502j0.clone();
    }
}
