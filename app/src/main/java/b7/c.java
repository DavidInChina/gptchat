package b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f25648Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final c f25649Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final c f25650h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ c[] f25651i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, b7.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, b7.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, b7.c] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        f25648Y = r32;
        ?? r42 = new Enum("VERY_LOW", 1);
        f25649Z = r42;
        ?? r52 = new Enum("HIGHEST", 2);
        f25650h0 = r52;
        f25651i0 = new c[]{r32, r42, r52};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f25651i0.clone();
    }
}
