package Hh;

import Eh.AbstractC0511j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class m extends Enum implements n {

    /* renamed from: Y  reason: collision with root package name */
    public static final m f7819Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ m[] f7820Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Hh.m] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f7819Y = r12;
        f7820Z = new m[]{r12};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f7820Z.clone();
    }

    @Override // Hh.n
    public final boolean b() {
        return true;
    }

    @Override // Hh.n
    public final l e(Nh.l lVar, AbstractC0511j abstractC0511j) {
        return o.ZERO.a();
    }
}
