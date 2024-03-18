package ri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class c extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final c f44995Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final c f44996Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final c f44997h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ c[] f44998i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, ri.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, ri.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, ri.c] */
    static {
        ?? r32 = new Enum("LEFT", 0);
        f44995Y = r32;
        ?? r42 = new Enum("CENTER", 1);
        f44996Z = r42;
        ?? r52 = new Enum("RIGHT", 2);
        f44997h0 = r52;
        f44998i0 = new c[]{r32, r42, r52};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f44998i0.clone();
    }
}
