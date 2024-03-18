package Bh;

import A.AbstractC0044t0;
import Eh.AbstractC0511j;
import wh.AbstractC6226B;
import wh.AbstractC6235K;
import wh.AbstractC6236a;

/* loaded from: classes2.dex */
public abstract class a1 implements c1 {
    @Override // Bh.c1
    public final void f(io.sentry.vendor.b bVar, AbstractC0511j abstractC0511j, Fh.n nVar) {
        Nh.l m10 = bVar.m(((AbstractC6236a) getMethod()).l1(AbstractC0044t0.k(c()), getVisibility()), getMethod().D0(), getMethod().getDescriptor(), getMethod().N0(), getMethod().V().Q().z0());
        if (m10 != null) {
            AbstractC6235K<AbstractC6226B> parameters = getMethod().getParameters();
            if (parameters.k0()) {
                for (AbstractC6226B abstractC6226B : parameters) {
                    m10.B(abstractC6226B.u0(), abstractC6226B.getName());
                }
            }
            d(m10);
            g(m10, abstractC0511j, nVar);
            m10.j();
        }
    }
}
