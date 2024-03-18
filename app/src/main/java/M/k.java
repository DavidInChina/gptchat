package M;

import E0.AbstractC0461u;
import G0.g0;
import N0.C;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final k f11325c = new k(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0461u f11326a;

    /* renamed from: b  reason: collision with root package name */
    public final C f11327b;

    public k(AbstractC0461u abstractC0461u, C c10) {
        this.f11326a = abstractC0461u;
        this.f11327b = c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [E0.u] */
    public static k a(k kVar, g0 g0Var, C c10, int i10) {
        g0 g0Var2 = g0Var;
        if ((i10 & 1) != 0) {
            g0Var2 = kVar.f11326a;
        }
        if ((i10 & 2) != 0) {
            c10 = kVar.f11327b;
        }
        kVar.getClass();
        return new k(g0Var2, c10);
    }
}
