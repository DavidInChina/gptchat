package Fh;

import th.AbstractC5802j;
import yh.AbstractC6612h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class C extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final C f5375Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ C[] f5376Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Fh.C] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f5375Y = r12;
        f5376Z = new C[]{r12};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) f5376Z.clone();
    }

    public final void a(io.sentry.vendor.b bVar, AbstractC6612h abstractC6612h, o oVar) {
        C0541b c0541b = new C0541b(new g(bVar));
        C0541b c0541b2 = (j) abstractC6612h.getType().k(new C0542c(c0541b, oVar, 318767104, ""));
        for (AbstractC5802j abstractC5802j : abstractC6612h.getDeclaredAnnotations()) {
            C0541b c0541b3 = (C0541b) c0541b2;
            c0541b3.a(abstractC5802j, oVar);
            c0541b2 = c0541b3;
        }
    }
}
