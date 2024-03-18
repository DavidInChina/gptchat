package Ah;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class g0 extends Enum implements h0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final g0 f942Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ g0[] f943Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ah.g0, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f942Y = r12;
        f943Z = new g0[]{r12};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f943Z.clone();
    }

    @Override // Ah.h0
    public final e0 a() {
        return c0.f929Y;
    }
}
