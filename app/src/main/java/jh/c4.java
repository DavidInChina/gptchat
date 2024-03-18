package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class c4 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final c4 f36414Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final c4 f36415Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final c4 f36416h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ c4[] f36417i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.c4] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.c4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.c4] */
    static {
        ?? r32 = new Enum("DISPATCH_RULE_DIRECT", 0);
        f36414Y = r32;
        ?? r42 = new Enum("DISPATCH_RULE_INDIVIDUAL", 1);
        f36415Z = r42;
        ?? r52 = new Enum("RULE_NOT_SET", 2);
        f36416h0 = r52;
        f36417i0 = new c4[]{r32, r42, r52};
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) f36417i0.clone();
    }
}
