package Ci;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f3172Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final c f3173Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final c f3174h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ c[] f3175i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Ci.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, Ci.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Ci.c] */
    static {
        ?? r32 = new Enum("URL", 0);
        f3172Y = r32;
        ?? r42 = new Enum("EMAIL", 1);
        f3173Z = r42;
        ?? r52 = new Enum("WWW", 2);
        f3174h0 = r52;
        f3175i0 = new c[]{r32, r42, r52};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3175i0.clone();
    }
}
