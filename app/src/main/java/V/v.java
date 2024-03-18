package V;

import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import nf.AbstractC4828h;
import z.AbstractC6657D;
import z.C6735y0;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final C6735y0 f17980a = new C6735y0(15, AbstractC6657D.f51128d, 2);

    public static final e a(boolean z10, float f6, AbstractC1725n abstractC1725n, int i10, int i11) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1635163520);
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if ((i11 & 2) != 0) {
            f6 = Float.NaN;
        }
        AbstractC1710f0 g02 = AbstractC4828h.g0(new r0.r(r0.r.f44263k), rVar);
        Boolean valueOf = Boolean.valueOf(z10);
        Z0.e eVar = new Z0.e(f6);
        rVar.W(511388516);
        boolean g10 = rVar.g(valueOf) | rVar.g(eVar);
        Object K10 = rVar.K();
        if (g10 || K10 == C1723m.f22654Y) {
            K10 = new g(z10, f6, g02);
            rVar.h0(K10);
        }
        rVar.t(false);
        e eVar2 = (e) K10;
        rVar.t(false);
        return eVar2;
    }
}
