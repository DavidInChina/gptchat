package L;

import B.AbstractC0168u1;
import B.C0108a0;
import B.W0;
import H0.AbstractC0701r0;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import l0.C4323o;
import nf.AbstractC4828h;
import w.C6077x;

/* loaded from: classes2.dex */
public final class L0 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ N0 f9990Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f9991Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ D.m f9992h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(N0 n02, boolean z10, D.m mVar) {
        super(3);
        this.f9990Y = n02;
        this.f9991Z = z10;
        this.f9992h0 = mVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        boolean z12;
        AbstractC4326r abstractC4326r = (AbstractC4326r) obj;
        ((Number) obj3).intValue();
        Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
        rVar.W(805428266);
        if (rVar.m(AbstractC0701r0.f7008k) == Z0.l.f22806Z) {
            z10 = true;
        } else {
            z10 = false;
        }
        N0 n02 = this.f9990Y;
        if (((W0) n02.f10009e.getValue()) != W0.f1213Y && z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        rVar.W(1235672980);
        boolean g10 = rVar.g(n02);
        Object K10 = rVar.K();
        Object obj4 = C1723m.f22654Y;
        if (g10 || K10 == obj4) {
            K10 = new C6077x(17, n02);
            rVar.h0(K10);
        }
        rVar.t(false);
        rVar.W(-180460798);
        AbstractC1710f0 g02 = AbstractC4828h.g0((wf.k) K10, rVar);
        rVar.W(-492369756);
        Object K11 = rVar.K();
        if (K11 == obj4) {
            Object c0108a0 = new C0108a0(new B.F0(g02, 1));
            rVar.h0(c0108a0);
            K11 = c0108a0;
        }
        rVar.t(false);
        AbstractC0168u1 abstractC0168u1 = (AbstractC0168u1) K11;
        rVar.t(false);
        rVar.W(511388516);
        boolean g11 = rVar.g(abstractC0168u1) | rVar.g(n02);
        Object K12 = rVar.K();
        if (g11 || K12 == obj4) {
            K12 = new K0(abstractC0168u1, n02);
            rVar.h0(K12);
        }
        rVar.t(false);
        K0 k02 = (K0) K12;
        C4323o c4323o = C4323o.f37719b;
        W0 w02 = (W0) n02.f10009e.getValue();
        if (this.f9991Z && n02.f10006b.h() != 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4326r c10 = androidx.compose.foundation.gestures.a.c(c4323o, k02, w02, null, z12, z11, null, this.f9992h0);
        rVar.t(false);
        return c10;
    }
}
