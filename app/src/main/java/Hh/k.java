package Hh;

import Eh.AbstractC0511j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class k extends Enum implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final k f7814Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ k[] f7815Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Hh.k] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f7814Y = r12;
        f7815Z = new k[]{r12};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f7815Z.clone();
    }

    @Override // Hh.n
    public final boolean b() {
        return false;
    }

    @Override // Hh.n
    public final l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        throw new IllegalStateException("An illegal stack manipulation must not be applied");
    }
}
