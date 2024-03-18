package S8;

import E.AbstractC0429m;
import E.AbstractC0440y;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import W.AbstractC1521a;
import W.G3;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import h0.C3288a;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4310b;
import w9.AbstractC6146c;
import y.AbstractC6463a;
import y.C6473k;

/* loaded from: classes.dex */
public final class X extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16281Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f16282Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.o f16283h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC4326r abstractC4326r, wf.o oVar, int i10) {
        super(2);
        this.f16281Y = i10;
        this.f16282Z = abstractC4326r;
        this.f16283h0 = oVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f16281Y;
        wf.o oVar = this.f16283h0;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                P4.a.c(this.f16282Z, null, this.f16283h0, abstractC1725n, 0, 2);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                P4.a.c(this.f16282Z, null, this.f16283h0, abstractC1725n, 0, 2);
                return;
            case 2:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                G3.a(this.f16282Z, AbstractC1521a.a(abstractC1725n), 0L, 0L, p9.i.f42785d, 0.0f, null, R4.b.X(abstractC1725n, -241131160, new C6473k(16, oVar)), abstractC1725n, 12607488, 108);
                return;
            default:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC4326r n10 = androidx.compose.foundation.a.n(androidx.compose.foundation.layout.a.z(androidx.compose.foundation.layout.a.t(this.f16282Z, 0.0f, AbstractC6146c.f48244a, 1)), androidx.compose.foundation.a.l(abstractC1725n));
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-483455358);
                E0.N a5 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar5);
                rVar5.W(-1323940314);
                int i12 = rVar5.P;
                AbstractC1732q0 p10 = rVar5.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i13 = androidx.compose.ui.layout.a.i(n10);
                if (rVar5.f22696a instanceof AbstractC1707e) {
                    rVar5.Z();
                    if (rVar5.f22695O) {
                        rVar5.o(c0582k);
                    } else {
                        rVar5.k0();
                    }
                    U3.f.n0(rVar5, a5, C0583l.f5808f);
                    U3.f.n0(rVar5, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i12))) {
                        AbstractC6463a.q(i12, rVar5, i12, c0581j);
                    }
                    AbstractC6463a.r(0, i13, new L0(rVar5), rVar5, 2058660585);
                    oVar.invoke(E.A.f3733a, rVar5, 6);
                    rVar5.t(false);
                    AbstractC6463a.u(rVar5, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f16281Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
