package A;

import B.C0115c1;
import B.J1;
import B.Z1;
import nf.AbstractC4825e;
import of.EnumC5000a;
import w.C6077x;

/* loaded from: classes.dex */
public final class I extends AbstractC0016f {
    @Override // A.AbstractC0016f
    public final Object C0(B0.A a5, AbstractC4825e abstractC4825e) {
        long j6 = ((B0.P) a5).f1623y0;
        long c10 = kotlin.jvm.internal.m.c(((int) (j6 >> 32)) / 2, ((int) (j6 & 4294967295L)) / 2);
        int i10 = Z0.i.f22798c;
        this.f196x0.f161c = R4.b.r((int) (c10 >> 32), (int) (c10 & 4294967295L));
        H h10 = new H(this, null, 0);
        C6077x c6077x = new C6077x(4, this);
        B.B0 b02 = Z1.f1251a;
        Object e02 = Ad.l.e0(new J1(a5, h10, c6077x, new C0115c1(a5), null), abstractC4825e);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        jf.y yVar = jf.y.f36177a;
        if (e02 != enumC5000a) {
            e02 = yVar;
        }
        if (e02 == enumC5000a) {
            return e02;
        }
        return yVar;
    }
}
