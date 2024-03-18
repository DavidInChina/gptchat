package Bh;

import Eh.AbstractC0511j;
import wh.AbstractC6250o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Bh.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0250i0 extends Enum implements AbstractC0252j0 {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0250i0 f2355Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0250i0[] f2356Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Bh.i0] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f2355Y = r12;
        f2356Z = new EnumC0250i0[]{r12};
    }

    public static EnumC0250i0 valueOf(String str) {
        return (EnumC0250i0) Enum.valueOf(EnumC0250i0.class, str);
    }

    public static EnumC0250i0[] values() {
        return (EnumC0250i0[]) f2356Z.clone();
    }

    @Override // Hh.b
    public final Hh.a a(Nh.l lVar, AbstractC0511j abstractC0511j, AbstractC6250o abstractC6250o) {
        return Hh.a.f7800c;
    }

    @Override // Bh.AbstractC0252j0
    public final c1 h(c1 c1Var) {
        return c1Var;
    }
}
