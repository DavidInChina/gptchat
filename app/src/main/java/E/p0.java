package E;

import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import l0.C4310b;
import l0.C4317i;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f3937a;

    static {
        C0421f c0421f = AbstractC0429m.f3907a;
        f3937a = new m0(1, c0421f, null, c0421f.a(), new E(C4310b.f37702o0));
    }

    public static final E0.N a(AbstractC0425i abstractC0425i, C4317i c4317i, AbstractC1725n abstractC1725n) {
        E0.N n10;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(-837807694);
        if (AbstractC3557B.K(abstractC0425i, AbstractC0429m.f3907a) && AbstractC3557B.K(c4317i, C4310b.f37702o0)) {
            n10 = f3937a;
        } else {
            rVar.W(511388516);
            boolean g10 = rVar.g(abstractC0425i) | rVar.g(c4317i);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = new m0(1, abstractC0425i, null, abstractC0425i.a(), new E(c4317i));
                rVar.h0(K10);
            }
            rVar.t(false);
            n10 = (E0.N) K10;
        }
        rVar.t(false);
        return n10;
    }
}
