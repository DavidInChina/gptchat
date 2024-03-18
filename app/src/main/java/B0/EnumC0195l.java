package B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: B0.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0195l extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0195l f1656Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC0195l f1657Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC0195l f1658h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0195l[] f1659i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [B0.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [B0.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [B0.l, java.lang.Enum] */
    static {
        ?? r32 = new Enum("Initial", 0);
        f1656Y = r32;
        ?? r42 = new Enum("Main", 1);
        f1657Z = r42;
        ?? r52 = new Enum("Final", 2);
        f1658h0 = r52;
        f1659i0 = new EnumC0195l[]{r32, r42, r52};
    }

    public static EnumC0195l valueOf(String str) {
        return (EnumC0195l) Enum.valueOf(EnumC0195l.class, str);
    }

    public static EnumC0195l[] values() {
        return (EnumC0195l[]) f1659i0.clone();
    }
}
