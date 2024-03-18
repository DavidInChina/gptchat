package Dg;

import Ag.q;
import Bg.h0;
import Bg.j0;
import Mf.A;
import Mf.AbstractC0997f;
import Mf.AbstractC1004m;
import Mf.EnumC0998g;
import Mf.U;
import Mf.V;
import Mf.r;
import Pf.C1154l;
import Pf.C1156n;
import id.AbstractC3557B;
import kf.v;
import kg.C4294f;

/* loaded from: classes.dex */
public final class a extends C1156n {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(C4294f c4294f) {
        super(r2, c4294f, r4, r5, r10, q.f870e);
        m mVar = m.f3709a;
        f fVar = m.f3710b;
        A a5 = A.f12053i0;
        EnumC0998g enumC0998g = EnumC0998g.f12084Y;
        v vVar = v.f37483Y;
        U u10 = V.f12075a;
        C1154l c1154l = new C1154l(this, null, Nf.h.f12822a, true, 1, u10);
        c1154l.K0(vVar, r.f12104d);
        i iVar = i.f3664k0;
        String str = c1154l.getName().f37507Y;
        AbstractC3557B.b0("toString(...)", str);
        h b10 = m.b(iVar, str, "");
        l lVar = l.f3677A0;
        c1154l.G0(new j(m.d(lVar, new String[0]), b10, lVar, vVar, false, new String[0]));
        x0(b10, R4.b.W1(c1154l), c1154l);
    }

    @Override // Pf.AbstractC1144b, Pf.D
    public final ug.n C(h0 h0Var, Cg.i iVar) {
        AbstractC3557B.c0("typeSubstitution", h0Var);
        i iVar2 = i.f3664k0;
        String str = getName().f37507Y;
        AbstractC3557B.b0("toString(...)", str);
        return m.b(iVar2, str, h0Var.toString());
    }

    @Override // Pf.AbstractC1144b, Mf.X
    public final AbstractC1004m c(j0 j0Var) {
        AbstractC3557B.c0("substitutor", j0Var);
        return this;
    }

    @Override // Pf.C1156n
    public final String toString() {
        String b10 = getName().b();
        AbstractC3557B.b0("asString(...)", b10);
        return b10;
    }

    @Override // Pf.AbstractC1144b
    public final AbstractC0997f w0(j0 j0Var) {
        AbstractC3557B.c0("substitutor", j0Var);
        return this;
    }
}
