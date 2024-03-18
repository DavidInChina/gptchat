package E;

import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import l0.C4310b;
import l0.C4316h;

/* renamed from: E.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0440y {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f3980a;

    static {
        C0423g c0423g = AbstractC0429m.f3909c;
        f3980a = new m0(2, null, c0423g, c0423g.a(), new D(C4310b.f37705r0));
    }

    public static final E0.N a(AbstractC0427k abstractC0427k, C4316h c4316h, AbstractC1725n abstractC1725n) {
        E0.N n10;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1089876336);
        if (AbstractC3557B.K(abstractC0427k, AbstractC0429m.f3909c) && AbstractC3557B.K(c4316h, C4310b.f37705r0)) {
            n10 = f3980a;
        } else {
            rVar.W(511388516);
            boolean g10 = rVar.g(abstractC0427k) | rVar.g(c4316h);
            Object K10 = rVar.K();
            if (g10 || K10 == C1723m.f22654Y) {
                K10 = new m0(2, null, abstractC0427k, abstractC0427k.a(), new D(c4316h));
                rVar.h0(K10);
            }
            rVar.t(false);
            n10 = (E0.N) K10;
        }
        rVar.t(false);
        return n10;
    }
}
