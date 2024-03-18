package Rh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class k1 extends Enum implements p1 {

    /* renamed from: Y  reason: collision with root package name */
    public static final k1 f15921Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ k1[] f15922Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Rh.k1] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f15921Y = r12;
        f15922Z = new k1[]{r12};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f15922Z.clone();
    }

    @Override // Rh.p1
    public final o1 a(String str) {
        return new m1(str);
    }
}
