package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class I0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final I0 f36245Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final I0 f36246Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final I0 f36247h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ I0[] f36248i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jh.I0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [jh.I0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [jh.I0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("FILE", 0);
        f36245Y = r32;
        ?? r42 = new Enum("WEBSOCKET_URL", 1);
        f36246Z = r42;
        ?? r52 = new Enum("OUTPUT_NOT_SET", 2);
        f36247h0 = r52;
        f36248i0 = new I0[]{r32, r42, r52};
    }

    public static I0 valueOf(String str) {
        return (I0) Enum.valueOf(I0.class, str);
    }

    public static I0[] values() {
        return (I0[]) f36248i0.clone();
    }
}
