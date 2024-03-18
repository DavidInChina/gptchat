package ph;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class h extends Enum implements j {

    /* renamed from: Y  reason: collision with root package name */
    public static final h f43206Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ h[] f43207Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, ph.h] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f43206Y = r12;
        f43207Z = new h[]{r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f43207Z.clone();
    }

    @Override // ph.j
    public final String a(l1 l1Var) {
        return l1Var.getName();
    }
}
