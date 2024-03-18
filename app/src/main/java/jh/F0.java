package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class F0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final F0 f36223Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final F0 f36224Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final F0 f36225h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ F0[] f36226i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.F0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.F0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.F0] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36223Y = r32;
        ?? r42 = new Enum("ADVANCED", 1);
        f36224Z = r42;
        ?? r52 = new Enum("OPTIONS_NOT_SET", 2);
        f36225h0 = r52;
        f36226i0 = new F0[]{r32, r42, r52};
    }

    public static F0 valueOf(String str) {
        return (F0) Enum.valueOf(F0.class, str);
    }

    public static F0[] values() {
        return (F0[]) f36226i0.clone();
    }
}
