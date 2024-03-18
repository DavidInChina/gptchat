package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class M0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final M0 f36272Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final M0 f36273Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final M0 f36274h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ M0[] f36275i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.M0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.M0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.M0] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36272Y = r32;
        ?? r42 = new Enum("ADVANCED", 1);
        f36273Z = r42;
        ?? r52 = new Enum("OPTIONS_NOT_SET", 2);
        f36274h0 = r52;
        f36275i0 = new M0[]{r32, r42, r52};
    }

    public static M0 valueOf(String str) {
        return (M0) Enum.valueOf(M0.class, str);
    }

    public static M0[] values() {
        return (M0[]) f36275i0.clone();
    }
}
