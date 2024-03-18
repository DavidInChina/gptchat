package Uf;

import Bg.j0;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import Pf.AbstractC1146d;
import Pf.T;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import ng.AbstractC4841h;
import ng.C4845l;
import ng.C4846m;
import ng.EnumC4839f;
import ng.EnumC4840g;
import z.AbstractC6708l;

/* renamed from: Uf.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1452n implements AbstractC4841h {
    @Override // ng.AbstractC4841h
    public EnumC4840g a(AbstractC0993b abstractC0993b, AbstractC0993b abstractC0993b2, AbstractC0997f abstractC0997f) {
        Bg.A a5;
        AbstractC3557B.c0("superDescriptor", abstractC0993b);
        AbstractC3557B.c0("subDescriptor", abstractC0993b2);
        boolean z10 = abstractC0993b2 instanceof Wf.f;
        EnumC4840g enumC4840g = EnumC4840g.f40346h0;
        if (z10) {
            Wf.f fVar = (Wf.f) abstractC0993b2;
            if (!(!fVar.getTypeParameters().isEmpty())) {
                C4845l i10 = C4846m.i(abstractC0993b, abstractC0993b2);
                if (i10 != null && i10.c() != 0) {
                    return enumC4840g;
                }
                List S = fVar.S();
                AbstractC3557B.b0("getValueParameters(...)", S);
                Kg.s n12 = Kg.m.n1(kf.t.V1(S), C1451m.f17827Y);
                Bg.A a10 = fVar.f14171l0;
                AbstractC3557B.Z(a10);
                Kg.h b1 = Kg.p.b1(Kg.p.e1(n12, Kg.p.e1(a10)));
                AbstractC1146d abstractC1146d = fVar.f14173n0;
                if (abstractC1146d != null) {
                    a5 = abstractC1146d.getType();
                } else {
                    a5 = null;
                }
                Kg.g gVar = new Kg.g(Kg.p.b1(Kg.p.e1(b1, kf.t.V1(AbstractC4344b.H0(a5)))));
                while (gVar.hasNext()) {
                    Bg.A a11 = (Bg.A) gVar.next();
                    if ((!a11.w0().isEmpty()) && !(a11.B0() instanceof Zf.f)) {
                        return enumC4840g;
                    }
                }
                AbstractC0993b abstractC0993b3 = (AbstractC0993b) abstractC0993b.c(j0.e(new Zf.d()));
                if (abstractC0993b3 == null) {
                    return enumC4840g;
                }
                if (abstractC0993b3 instanceof T) {
                    T t10 = (T) abstractC0993b3;
                    if (!t10.getTypeParameters().isEmpty()) {
                        abstractC0993b3 = t10.m0().l().f();
                        AbstractC3557B.Z(abstractC0993b3);
                    }
                }
                int c10 = C4846m.f40356d.n(abstractC0993b3, abstractC0993b2, false).c();
                AbstractC2469q0.u("getResult(...)", c10);
                if (AbstractC1450l.f17826a[AbstractC6708l.f(c10)] == 1) {
                    return EnumC4840g.f40344Y;
                }
                return enumC4840g;
            }
            return enumC4840g;
        }
        return enumC4840g;
    }

    @Override // ng.AbstractC4841h
    public EnumC4839f b() {
        return EnumC4839f.f40341Z;
    }
}
