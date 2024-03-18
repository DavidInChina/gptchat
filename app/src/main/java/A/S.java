package A;

import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import Z.o1;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class S implements AbstractC0040r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final S f107a = new Object();

    @Override // A.AbstractC0040r0
    public final AbstractC0042s0 a(D.l lVar, AbstractC1725n abstractC1725n) {
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.W(1683566979);
        AbstractC1710f0 t10 = Df.H.t(lVar, rVar, 0);
        rVar.W(1206586544);
        rVar.W(-492369756);
        Object K10 = rVar.K();
        io.sentry.hints.i iVar = C1723m.f22654Y;
        if (K10 == iVar) {
            K10 = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);
            rVar.h0(K10);
        }
        rVar.t(false);
        AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) K10;
        rVar.W(1930394772);
        boolean g10 = rVar.g(lVar) | rVar.g(abstractC1710f0);
        Object K11 = rVar.K();
        if (g10 || K11 == iVar) {
            K11 = new D.j(lVar, abstractC1710f0, null);
            rVar.h0(K11);
        }
        rVar.t(false);
        AbstractC1734s.e(lVar, (wf.n) K11, rVar);
        rVar.t(false);
        AbstractC1710f0 a02 = r9.y.a0(lVar, rVar, 0);
        rVar.W(1157296644);
        boolean g11 = rVar.g(lVar);
        Object K12 = rVar.K();
        if (g11 || K12 == iVar) {
            K12 = new Q(t10, abstractC1710f0, a02);
            rVar.h0(K12);
        }
        rVar.t(false);
        Q q10 = (Q) K12;
        rVar.t(false);
        return q10;
    }
}
