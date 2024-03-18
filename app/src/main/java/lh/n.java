package Lh;

import Eh.AbstractC0511j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class n extends Enum implements Hh.n {

    /* renamed from: Y  reason: collision with root package name */
    public static final n f11208Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ n[] f11209Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Lh.n] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f11208Y = r12;
        f11209Z = new n[]{r12};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f11209Z.clone();
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final Hh.l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        lVar.n(1);
        return new Hh.l(1, 1);
    }
}
