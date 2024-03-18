package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: d1.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2588w extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC2588w f27923Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC2588w[] f27924Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, d1.w] */
    static {
        ?? r32 = new Enum("Inherit", 0);
        f27923Y = r32;
        f27924Z = new EnumC2588w[]{r32, new Enum("SecureOn", 1), new Enum("SecureOff", 2)};
    }

    public static EnumC2588w valueOf(String str) {
        return (EnumC2588w) Enum.valueOf(EnumC2588w.class, str);
    }

    public static EnumC2588w[] values() {
        return (EnumC2588w[]) f27924Z.clone();
    }
}
