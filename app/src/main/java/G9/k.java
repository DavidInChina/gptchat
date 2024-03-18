package G9;

import E.AbstractC0441z;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.l1;
import cb.C2334C;
import id.AbstractC3557B;
import jf.y;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.o implements wf.q {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ r f6134Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l1 f6135Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f6136h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, AbstractC1710f0 abstractC1710f0, Tc.f fVar) {
        super(5);
        this.f6134Y = rVar;
        this.f6135Z = abstractC1710f0;
        this.f6136h0 = fVar;
    }

    @Override // wf.q
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj4;
        int intValue = num.intValue();
        AbstractC3557B.c0("$this$ScrollableContentScreen", (AbstractC0441z) obj);
        AbstractC3557B.c0("$anonymous$parameter$0$", (q) obj2);
        AbstractC3557B.c0("$anonymous$parameter$1$", (wf.k) obj3);
        L0.u uVar = io.sentry.compose.b.f34309a;
        if ((intValue & 5121) == 1024) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return y.f36177a;
            }
        }
        l1 l1Var = this.f6135Z;
        C2334C c2334c = ((q) l1Var.getValue()).f6156c;
        Sc.n nVar = ((q) l1Var.getValue()).f6155b;
        Ba.c cVar = ((q) l1Var.getValue()).f6158e;
        Tc.f fVar = this.f6136h0;
        j jVar = new j(fVar, 0);
        j jVar2 = new j(fVar, 1);
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1499545111);
        r rVar3 = this.f6134Y;
        boolean g10 = rVar2.g(rVar3);
        Object K10 = rVar2.K();
        Object obj5 = C1723m.f22654Y;
        if (g10 || K10 == obj5) {
            K10 = new i(rVar3, 1);
            rVar2.h0(K10);
        }
        AbstractC6216a abstractC6216a = (AbstractC6216a) K10;
        rVar2.t(false);
        rVar2.W(-1499545222);
        boolean g11 = rVar2.g(rVar3);
        Object K11 = rVar2.K();
        if (g11 || K11 == obj5) {
            K11 = new i(rVar3, 2);
            rVar2.h0(K11);
        }
        rVar2.t(false);
        A7.b.q(c2334c, nVar, cVar, jVar, jVar2, abstractC6216a, (AbstractC6216a) K11, rVar2, 0);
        return y.f36177a;
    }
}
