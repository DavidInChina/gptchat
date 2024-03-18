package Rh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Rh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1295d extends Enum implements AbstractC1297e {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC1295d f15806Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC1295d[] f15807Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Rh.d] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f15806Y = r12;
        f15807Z = new EnumC1295d[]{r12};
    }

    public static EnumC1295d valueOf(String str) {
        return (EnumC1295d) Enum.valueOf(EnumC1295d.class, str);
    }

    public static EnumC1295d[] values() {
        return (EnumC1295d[]) f15807Z.clone();
    }

    @Override // Rh.AbstractC1297e
    public final o1 a(String str) {
        return null;
    }

    @Override // Rh.AbstractC1297e
    public final o1 c(String str, o1 o1Var) {
        return o1Var;
    }
}
