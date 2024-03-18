package Eh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class G extends Enum implements F {

    /* renamed from: Y  reason: collision with root package name */
    public static final G f4749Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ G[] f4750Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.G] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4749Y = r12;
        f4750Z = new G[]{r12};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) f4750Z.clone();
    }

    @Override // Eh.F
    public final J a(l1 l1Var) {
        return new H(l1Var);
    }
}
