package Th;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class p extends Enum implements q {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f17309Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ p[] f17310Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Th.p, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f17309Y = r12;
        f17310Z = new p[]{r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f17310Z.clone();
    }

    @Override // Th.q
    public final void a(Class cls, ClassLoader classLoader) {
    }
}
