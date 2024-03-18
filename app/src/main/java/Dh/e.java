package Dh;

import Bh.AbstractC0263p;
import Bh.W;
import Bh.Z;
import Eh.g0;
import Qh.AbstractC1235m;
import Qh.AbstractC1239q;
import Qh.C1242u;
import Qh.F;
import Qh.b0;
import java.util.List;
import wh.AbstractC6256u;
import yh.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes.dex */
public final class e extends f {
    public e() {
        super("IMITATE_SUPER_CLASS_OPENING", 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [Qh.q] */
    @Override // Dh.f
    public final List a(AbstractC0263p abstractC0263p) {
        AbstractC6256u abstractC6256u;
        l1.a L10 = abstractC0263p.L();
        if (L10 == null) {
            abstractC6256u = new AbstractC1239q(1);
        } else {
            abstractC6256u = (AbstractC6256u) ((AbstractC1239q) L10.i()).f(F.CONSTRUCTOR.f14964Z.b(new b0(abstractC0263p)));
        }
        return abstractC6256u.b(AbstractC1235m.a(abstractC0263p));
    }

    @Override // Dh.f
    public final W b(W w10) {
        return w10.a(new C1242u(F.CONSTRUCTOR.f14964Z), new Z(g0.f4785Y));
    }

    @Override // Dh.f
    public final int c(int i10) {
        return 1;
    }
}
