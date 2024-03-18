package Xe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Xe.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1680b extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1680b f21884Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1680b f21885Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1680b[] f21886h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Xe.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Xe.b] */
    static {
        ?? r22 = new Enum("FRONT", 0);
        f21884Y = r22;
        ?? r32 = new Enum("BACK", 1);
        f21885Z = r32;
        f21886h0 = new EnumC1680b[]{r22, r32};
    }

    public static EnumC1680b valueOf(String str) {
        return (EnumC1680b) Enum.valueOf(EnumC1680b.class, str);
    }

    public static EnumC1680b[] values() {
        return (EnumC1680b[]) f21886h0.clone();
    }
}
