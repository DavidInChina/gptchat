package pg;

import Bg.A;
import Bg.D;
import Mf.AbstractC0997f;
import Mf.B;
import Mf.EnumC0998g;
import id.AbstractC3557B;
import jf.C3959i;
import kg.C4290b;
import kg.C4294f;
import ng.AbstractC4838e;

/* renamed from: pg.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5172i extends AbstractC5170g {

    /* renamed from: b  reason: collision with root package name */
    public final C4290b f43146b;

    /* renamed from: c  reason: collision with root package name */
    public final C4294f f43147c;

    public C5172i(C4290b c4290b, C4294f c4294f) {
        super(new C3959i(c4290b, c4294f));
        this.f43146b = c4290b;
        this.f43147c = c4294f;
    }

    @Override // pg.AbstractC5170g
    public final A a(B b10) {
        AbstractC3557B.c0("module", b10);
        C4290b c4290b = this.f43146b;
        AbstractC0997f s02 = R4.b.s0(b10, c4290b);
        D d10 = null;
        if (s02 != null) {
            int i10 = AbstractC4838e.f40339a;
            if (!AbstractC4838e.n(s02, EnumC0998g.f12086h0)) {
                s02 = null;
            }
            if (s02 != null) {
                d10 = s02.n();
            }
        }
        if (d10 == null) {
            Dg.l lVar = Dg.l.f3682F0;
            String c4290b2 = c4290b.toString();
            AbstractC3557B.b0("toString(...)", c4290b2);
            String str = this.f43147c.f37507Y;
            AbstractC3557B.b0("toString(...)", str);
            return Dg.m.c(lVar, c4290b2, str);
        }
        return d10;
    }

    @Override // pg.AbstractC5170g
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43146b.i());
        sb2.append('.');
        sb2.append(this.f43147c);
        return sb2.toString();
    }
}
