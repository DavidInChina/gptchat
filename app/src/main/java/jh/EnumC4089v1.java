package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.v1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4089v1 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4089v1 f36636Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4089v1 f36637Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4089v1 f36638h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4089v1[] f36639i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, jh.v1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, jh.v1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, jh.v1] */
    static {
        ?? r32 = new Enum("RESPONSE", 0);
        f36636Y = r32;
        ?? r42 = new Enum("END_SESSION", 1);
        f36637Z = r42;
        ?? r52 = new Enum("MESSAGE_NOT_SET", 2);
        f36638h0 = r52;
        f36639i0 = new EnumC4089v1[]{r32, r42, r52};
    }

    public static EnumC4089v1 valueOf(String str) {
        return (EnumC4089v1) Enum.valueOf(EnumC4089v1.class, str);
    }

    public static EnumC4089v1[] values() {
        return (EnumC4089v1[]) f36639i0.clone();
    }
}
