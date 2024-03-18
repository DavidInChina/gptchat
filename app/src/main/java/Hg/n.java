package Hg;

import Bg.C0213f;
import Bg.Q;
import Bg.m0;
import Mf.AbstractC0997f;
import Mf.AbstractC1013w;
import Mf.b0;
import Mf.h0;
import Pf.c0;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public final class n implements AbstractC0732e {

    /* renamed from: a  reason: collision with root package name */
    public static final n f7784a = new Object();

    @Override // Hg.AbstractC0732e
    public final boolean a(AbstractC1013w abstractC1013w) {
        Bg.D d10;
        AbstractC3557B.c0("functionDescriptor", abstractC1013w);
        h0 h0Var = (h0) abstractC1013w.S().get(1);
        Cf.h hVar = Jf.o.f9138d;
        AbstractC3557B.Z(h0Var);
        Mf.B j6 = AbstractC5493d.j(h0Var);
        hVar.getClass();
        AbstractC0997f s02 = R4.b.s0(j6, Jf.p.Q);
        if (s02 == null) {
            d10 = null;
        } else {
            Q.f2084Z.getClass();
            Q q10 = Q.f2085h0;
            List parameters = s02.f().getParameters();
            AbstractC3557B.b0("getParameters(...)", parameters);
            Object B22 = kf.t.B2(parameters);
            AbstractC3557B.b0("single(...)", B22);
            d10 = C0213f.l(q10, s02, AbstractC4344b.F0(new Bg.I((b0) B22)));
        }
        if (d10 == null) {
            return false;
        }
        Bg.A type = ((c0) h0Var).getType();
        AbstractC3557B.b0("getType(...)", type);
        return Cg.d.f3125a.b(d10, m0.h(type, false));
    }

    @Override // Hg.AbstractC0732e
    public final String b(AbstractC1013w abstractC1013w) {
        return Bi.c.c1(this, abstractC1013w);
    }

    @Override // Hg.AbstractC0732e
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
