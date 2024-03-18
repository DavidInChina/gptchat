package Rh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class r extends Enum implements AbstractC1324s {

    /* renamed from: Y  reason: collision with root package name */
    public static final r f15939Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ r[] f15940Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Rh.r] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f15939Y = r12;
        f15940Z = new r[]{r12};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f15940Z.clone();
    }

    @Override // Rh.AbstractC1324s
    public final AbstractC1291b b(String str) {
        throw new IllegalStateException(R.a.r("Unexpected lookup of component type for ", str));
    }
}
