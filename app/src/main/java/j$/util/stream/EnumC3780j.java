package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: j$.util.stream.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3780j extends Enum {
    public static final EnumC3780j CONCURRENT;
    public static final EnumC3780j IDENTITY_FINISH;
    public static final EnumC3780j UNORDERED;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC3780j[] f35671a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.util.stream.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.util.stream.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.j] */
    static {
        ?? r32 = new Enum("CONCURRENT", 0);
        CONCURRENT = r32;
        ?? r42 = new Enum("UNORDERED", 1);
        UNORDERED = r42;
        ?? r52 = new Enum("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = r52;
        f35671a = new EnumC3780j[]{r32, r42, r52};
    }

    public static EnumC3780j valueOf(String str) {
        return (EnumC3780j) Enum.valueOf(EnumC3780j.class, str);
    }

    public static EnumC3780j[] values() {
        return (EnumC3780j[]) f35671a.clone();
    }
}
