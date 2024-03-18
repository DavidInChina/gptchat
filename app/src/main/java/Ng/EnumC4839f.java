package ng;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ng.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4839f extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4839f f40340Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4839f f40341Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4839f f40342h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4839f[] f40343i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ng.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ng.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ng.f, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CONFLICTS_ONLY", 0);
        f40340Y = r32;
        ?? r42 = new Enum("SUCCESS_ONLY", 1);
        f40341Z = r42;
        ?? r52 = new Enum("BOTH", 2);
        f40342h0 = r52;
        f40343i0 = new EnumC4839f[]{r32, r42, r52};
    }

    public static EnumC4839f valueOf(String str) {
        return (EnumC4839f) Enum.valueOf(EnumC4839f.class, str);
    }

    public static EnumC4839f[] values() {
        return (EnumC4839f[]) f40343i0.clone();
    }
}
