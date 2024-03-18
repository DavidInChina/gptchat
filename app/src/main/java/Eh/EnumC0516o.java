package Eh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Eh.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC0516o extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final C0513l f4796Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final C0514m f4797Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final C0515n f4798h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final Object[] f4799i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0516o[] f4800j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [Eh.l, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Eh.m, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [Eh.n, java.lang.Enum] */
    static {
        ?? r32 = new Enum("GENERATE", 0);
        f4796Y = r32;
        ?? r42 = new Enum("EXPAND", 1);
        f4797Z = r42;
        ?? r52 = new Enum("DISABLED", 2);
        f4798h0 = r52;
        f4800j0 = new EnumC0516o[]{r32, r42, r52};
    }

    public static EnumC0516o valueOf(String str) {
        return (EnumC0516o) Enum.valueOf(EnumC0516o.class, str);
    }

    public static EnumC0516o[] values() {
        return (EnumC0516o[]) f4800j0.clone();
    }
}
