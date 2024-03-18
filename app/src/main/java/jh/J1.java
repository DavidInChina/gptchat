package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class J1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final J1 f36254Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final J1 f36255Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final J1 f36256h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ J1[] f36257i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jh.J1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [jh.J1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [jh.J1, java.lang.Enum] */
    static {
        ?? r32 = new Enum("USER", 0);
        f36254Y = r32;
        ?? r42 = new Enum("SPEAKER", 1);
        f36255Z = r42;
        ?? r52 = new Enum("VALUE_NOT_SET", 2);
        f36256h0 = r52;
        f36257i0 = new J1[]{r32, r42, r52};
    }

    public static J1 valueOf(String str) {
        return (J1) Enum.valueOf(J1.class, str);
    }

    public static J1[] values() {
        return (J1[]) f36257i0.clone();
    }
}
