package y;

import Z.AbstractC1725n;
import Z.C1723m;
import Z.l1;
import s0.AbstractC5502d;
import z.AbstractC6659E;
import z.AbstractC6704j;
import z.C6737z0;

/* loaded from: classes2.dex */
public abstract class l0 {
    public static final l1 a(long j6, AbstractC6659E abstractC6659E, String str, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-451899108);
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        AbstractC5502d f6 = r0.r.f(j6);
        rVar.W(1157296644);
        boolean g10 = rVar.g(f6);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = (C6737z0) C6481t.f50288l0.invoke(r0.r.f(j6));
            rVar.h0(K10);
        }
        rVar.t(false);
        l1 c10 = AbstractC6704j.c(new r0.r(j6), (C6737z0) K10, abstractC6659E, null, str2, null, rVar, 576 | ((i10 << 6) & 57344), 8);
        rVar.t(false);
        return c10;
    }
}
