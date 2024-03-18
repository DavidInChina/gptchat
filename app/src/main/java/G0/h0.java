package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class h0 extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final h0 f5785Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final h0 f5786Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ h0[] f5787h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [G0.h0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [G0.h0, java.lang.Enum] */
    static {
        ?? r22 = new Enum("Min", 0);
        f5785Y = r22;
        ?? r32 = new Enum("Max", 1);
        f5786Z = r32;
        f5787h0 = new h0[]{r22, r32};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f5787h0.clone();
    }
}
