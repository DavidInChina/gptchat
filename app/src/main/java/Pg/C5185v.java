package pg;

import Bg.A;
import Bg.D;
import Mf.B;
import id.AbstractC3557B;

/* renamed from: pg.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5185v extends AbstractC5178o {
    public C5185v(short s10) {
        super(Short.valueOf(s10));
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC3557B.c0("module", b10);
        Jf.l j6 = b10.j();
        j6.getClass();
        D s10 = j6.s(Jf.n.f9128n0);
        if (s10 != null) {
            return s10;
        }
        Jf.l.a(58);
        throw null;
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        return ((Number) this.f43144a).intValue() + ".toShort()";
    }
}
