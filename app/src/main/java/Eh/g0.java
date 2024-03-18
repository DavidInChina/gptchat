package Eh;

import Bh.AbstractC0265q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class g0 extends Enum implements AbstractC0523w {

    /* renamed from: Y  reason: collision with root package name */
    public static final g0 f4785Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ g0[] f4786Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.g0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4785Y = r12;
        f4786Z = new g0[]{r12};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f4786Z.clone();
    }

    @Override // Eh.AbstractC0523w
    public final Hh.b c(Dh.n nVar) {
        return new f0(nVar);
    }

    @Override // Bh.AbstractC0261o
    public final AbstractC0265q e(AbstractC0265q abstractC0265q) {
        return abstractC0265q;
    }
}
