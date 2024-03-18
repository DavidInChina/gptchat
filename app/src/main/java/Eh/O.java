package Eh;

import Bh.AbstractC0265q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class O extends Enum implements L {

    /* renamed from: Y  reason: collision with root package name */
    public static final O f4757Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ O[] f4758Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.O] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4757Y = r12;
        f4758Z = new O[]{r12};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f4758Z.clone();
    }

    @Override // Eh.L
    public final T b(Dh.n nVar) {
        return new Q(nVar.f4810a);
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return abstractC0265q;
    }
}
