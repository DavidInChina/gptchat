package Fh;

import th.AbstractC5802j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class p extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final p f5396Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ p[] f5397Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, Fh.p] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        f5396Y = r12;
        f5397Z = new p[]{r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f5397Z.clone();
    }

    public final void a(io.sentry.vendor.b bVar, vh.g gVar, o oVar) {
        C0541b c0541b = new C0541b(new C0543d(bVar));
        C0541b c0541b2 = (j) gVar.getType().k(new C0542c(c0541b, oVar, 318767104, ""));
        for (AbstractC5802j abstractC5802j : gVar.getDeclaredAnnotations()) {
            C0541b c0541b3 = (C0541b) c0541b2;
            c0541b3.a(abstractC5802j, oVar);
            c0541b2 = c0541b3;
        }
    }
}
