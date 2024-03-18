package I;

import B.S;
import E0.AbstractC0461u;
import F.s;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q0.C5252d;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class m extends a implements d {

    /* renamed from: u0  reason: collision with root package name */
    public final h f7939u0;

    /* renamed from: v0  reason: collision with root package name */
    public final F0.j f7940v0;

    public m(S s10) {
        this.f7939u0 = s10;
        F0.j jVar = new F0.j(c.f7914a);
        jVar.f5030i.setValue(this);
        this.f7940v0 = jVar;
    }

    public static final C5252d B0(m mVar, AbstractC0461u abstractC0461u, AbstractC6216a abstractC6216a) {
        C5252d c5252d;
        AbstractC0461u A02 = mVar.A0();
        if (A02 == null) {
            return null;
        }
        if (!abstractC0461u.i()) {
            abstractC0461u = null;
        }
        if (abstractC0461u == null || (c5252d = (C5252d) abstractC6216a.mo122invoke()) == null) {
            return null;
        }
        return c5252d.i(A02.F(abstractC0461u, false).e());
    }

    @Override // I.a, F0.f
    public final Bi.c M() {
        return this.f7940v0;
    }

    @Override // I.d
    public final Object Q(AbstractC0461u abstractC0461u, AbstractC6216a abstractC6216a, AbstractC4825e abstractC4825e) {
        Object e02 = Ad.l.e0(new l(this, abstractC0461u, abstractC6216a, new s(this, abstractC0461u, abstractC6216a, 2), null), abstractC4825e);
        if (e02 == EnumC5000a.f41328Y) {
            return e02;
        }
        return y.f36177a;
    }
}
