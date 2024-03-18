package pg;

import Bg.A;
import Bg.D;
import Mf.B;
import id.AbstractC3557B;

/* renamed from: pg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5167d extends AbstractC5178o {
    public C5167d(byte b10) {
        super(Byte.valueOf(b10));
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC3557B.c0("module", b10);
        Jf.l j6 = b10.j();
        j6.getClass();
        D s10 = j6.s(Jf.n.f9127m0);
        if (s10 != null) {
            return s10;
        }
        Jf.l.a(57);
        throw null;
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        return ((Number) this.f43144a).intValue() + ".toByte()";
    }
}
