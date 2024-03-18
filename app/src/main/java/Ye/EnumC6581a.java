package ye;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ye.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6581a extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC6581a f50899Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC6581a[] f50900Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, ye.a] */
    static {
        ?? r32 = new Enum("QUOTED_WHEN_REQUIRED", 0);
        f50899Y = r32;
        f50900Z = new EnumC6581a[]{r32, new Enum("QUOTED_ALWAYS", 1), new Enum("URI_ENCODE", 2)};
    }

    public static EnumC6581a valueOf(String str) {
        return (EnumC6581a) Enum.valueOf(EnumC6581a.class, str);
    }

    public static EnumC6581a[] values() {
        return (EnumC6581a[]) f50900Z.clone();
    }
}
