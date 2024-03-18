package jh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: jh.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4029j0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4029j0 f36434Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4029j0 f36435Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4029j0 f36436h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4029j0[] f36437i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [jh.j0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [jh.j0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [jh.j0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("PRESET", 0);
        f36434Y = r32;
        ?? r42 = new Enum("ADVANCED", 1);
        f36435Z = r42;
        ?? r52 = new Enum("OPTIONS_NOT_SET", 2);
        f36436h0 = r52;
        f36437i0 = new EnumC4029j0[]{r32, r42, r52};
    }

    public static EnumC4029j0 valueOf(String str) {
        return (EnumC4029j0) Enum.valueOf(EnumC4029j0.class, str);
    }

    public static EnumC4029j0[] values() {
        return (EnumC4029j0[]) f36437i0.clone();
    }
}
