package Fh;

import th.AbstractC5802j;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class E extends Enum implements F {

    /* renamed from: Y  reason: collision with root package name */
    public static final E f5380Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ E[] f5381Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Fh.E] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f5380Y = r12;
        f5381Z = new E[]{r12};
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f5381Z.clone();
    }

    @Override // Fh.F
    public final void a(io.sentry.vendor.b bVar, l1 l1Var, m mVar) {
        int i10 = 0;
        j g10 = C0542c.g(new C0541b(new h(bVar)), mVar, true, 0, l1Var.r0());
        l1.a L10 = l1Var.L();
        j jVar = g10;
        if (L10 != null) {
            jVar = (j) L10.k(new C0542c(g10, mVar, 285212416, ""));
        }
        j jVar2 = jVar;
        for (l1.a aVar : l1Var.o0()) {
            i10++;
            jVar2 = (j) aVar.k(new C0542c(jVar2, mVar, ((i10 & 65535) << 8) | 268435456, ""));
        }
        C0541b c0541b = jVar2;
        for (AbstractC5802j abstractC5802j : l1Var.getDeclaredAnnotations()) {
            C0541b c0541b2 = (C0541b) c0541b;
            c0541b2.a(abstractC5802j, mVar);
            c0541b = c0541b2;
        }
    }
}
