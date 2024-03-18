package Mh;

import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class k extends Enum implements l {

    /* renamed from: Y  reason: collision with root package name */
    public static final k f12168Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ k[] f12169Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Mh.k] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f12168Y = r12;
        f12169Z = new k[]{r12};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f12169Z.clone();
    }

    @Override // Mh.l
    public final Hh.n a(l1 l1Var, int i10) {
        return Hh.m.f7819Y;
    }
}
