package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4039l0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4039l0 f36472Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4039l0 f36473Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4039l0 f36474h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4039l0[] f36475i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jh.l0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [jh.l0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [jh.l0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36472Y = r32;
        ?? r42 = new Enum("ADVANCED", 1);
        f36473Z = r42;
        ?? r52 = new Enum("OPTIONS_NOT_SET", 2);
        f36474h0 = r52;
        f36475i0 = new EnumC4039l0[]{r32, r42, r52};
    }

    public static EnumC4039l0 valueOf(String str) {
        return (EnumC4039l0) Enum.valueOf(EnumC4039l0.class, str);
    }

    public static EnumC4039l0[] values() {
        return (EnumC4039l0[]) f36475i0.clone();
    }
}
