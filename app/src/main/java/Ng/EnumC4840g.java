package ng;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ng.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4840g extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4840g f40344Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4840g f40345Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4840g f40346h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4840g[] f40347i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [ng.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ng.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ng.g, java.lang.Enum] */
    static {
        ?? r42 = new Enum("OVERRIDABLE", 0);
        f40344Y = r42;
        Enum r52 = new Enum("CONFLICT", 1);
        ?? r62 = new Enum("INCOMPATIBLE", 2);
        f40345Z = r62;
        ?? r72 = new Enum("UNKNOWN", 3);
        f40346h0 = r72;
        f40347i0 = new EnumC4840g[]{r42, r52, r62, r72};
    }

    public static EnumC4840g valueOf(String str) {
        return (EnumC4840g) Enum.valueOf(EnumC4840g.class, str);
    }

    public static EnumC4840g[] values() {
        return (EnumC4840g[]) f40347i0.clone();
    }
}
