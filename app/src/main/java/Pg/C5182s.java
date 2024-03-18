package pg;

import Bg.A;
import Bg.C0213f;
import Bg.D;
import Bg.I;
import Bg.Q;
import Bg.o0;
import Bg.p0;
import Mf.AbstractC0997f;
import Mf.B;
import id.AbstractC3557B;
import kg.C4290b;
import l8.AbstractC4344b;

/* renamed from: pg.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5182s extends AbstractC5170g {
    public C5182s(C5169f c5169f) {
        super(new C5180q(c5169f));
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        A a5;
        AbstractC3557B.c0("module", b10);
        Q.f2084Z.getClass();
        Q q10 = Q.f2085h0;
        Jf.l j6 = b10.j();
        j6.getClass();
        AbstractC0997f i10 = j6.i(Jf.p.P.g());
        Object obj = this.f43144a;
        AbstractC5181r abstractC5181r = (AbstractC5181r) obj;
        if (abstractC5181r instanceof C5179p) {
            a5 = ((C5179p) obj).f43156a;
        } else if (abstractC5181r instanceof C5180q) {
            C5169f c5169f = ((C5180q) obj).f43157a;
            C4290b c4290b = c5169f.f43142a;
            AbstractC0997f s02 = R4.b.s0(b10, c4290b);
            int i11 = c5169f.f43143b;
            if (s02 == null) {
                Dg.l lVar = Dg.l.f3689i0;
                String c4290b2 = c4290b.toString();
                AbstractC3557B.b0("toString(...)", c4290b2);
                a5 = Dg.m.c(lVar, c4290b2, String.valueOf(i11));
            } else {
                D n10 = s02.n();
                AbstractC3557B.b0("getDefaultType(...)", n10);
                o0 z12 = Bi.c.z1(n10);
                for (int i12 = 0; i12 < i11; i12++) {
                    Jf.l j10 = b10.j();
                    p0 p0Var = p0.f2146h0;
                    z12 = j10.g(z12);
                }
                a5 = z12;
            }
        } else {
            throw new RuntimeException();
        }
        return C0213f.l(q10, i10, AbstractC4344b.F0(new I(a5)));
    }

    public C5182s(C4290b c4290b, int i10) {
        this(new C5169f(c4290b, i10));
    }
}
