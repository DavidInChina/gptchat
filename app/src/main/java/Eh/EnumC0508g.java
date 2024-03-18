package Eh;

import Bh.AbstractC0252j0;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Eh.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0508g extends Enum implements AbstractC0512k {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC0508g f4783Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ EnumC0508g[] f4784Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Eh.g] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f4783Y = r12;
        f4784Z = new EnumC0508g[]{r12};
    }

    public static EnumC0508g valueOf(String str) {
        return (EnumC0508g) Enum.valueOf(EnumC0508g.class, str);
    }

    public static EnumC0508g[] values() {
        return (EnumC0508g[]) f4784Z.clone();
    }

    @Override // Eh.AbstractC0512k
    public final C0509h a(l1 l1Var, Gh.b bVar, AbstractC0252j0 abstractC0252j0, ph.f fVar, ph.f fVar2, EnumC0516o enumC0516o) {
        new Sh.J(0).a();
        return new C0509h(l1Var, fVar, abstractC0252j0, enumC0516o);
    }
}
