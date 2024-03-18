package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3978F extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC3978F f36219Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC3978F f36220Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC3978F f36221h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC3978F[] f36222i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.F] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.F] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.F] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36219Y = r32;
        ?? r42 = new Enum("ADVANCED", 1);
        f36220Z = r42;
        ?? r52 = new Enum("OPTIONS_NOT_SET", 2);
        f36221h0 = r52;
        f36222i0 = new EnumC3978F[]{r32, r42, r52};
    }

    public static EnumC3978F valueOf(String str) {
        return (EnumC3978F) Enum.valueOf(EnumC3978F.class, str);
    }

    public static EnumC3978F[] values() {
        return (EnumC3978F[]) f36222i0.clone();
    }
}
