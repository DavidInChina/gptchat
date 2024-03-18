package d9;

import H0.AbstractC0701r0;
import L0.u;
import Z.AbstractC1725n;
import Z.m1;
import Z.r;
import jf.y;
import l0.AbstractC4326r;
import m.AbstractActivityC4532l;
import nf.AbstractC4828h;
import pd.s;
import x8.W;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f28155Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Tc.f f28156Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ pd.g f28157h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4326r f28158i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Tc.f fVar, pd.g gVar, AbstractC4326r abstractC4326r) {
        super(2);
        this.f28156Z = fVar;
        this.f28157h0 = gVar;
        this.f28158i0 = abstractC4326r;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f28155Y;
        AbstractC4326r abstractC4326r = this.f28158i0;
        pd.g gVar = this.f28157h0;
        switch (i11) {
            case 0:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                s sVar = (s) AbstractC4828h.z(gVar.f808e, abstractC1725n).getValue();
                r rVar2 = (r) abstractC1725n;
                rVar2.T(-1135577790, sVar);
                Pc.c a5 = Pc.e.a();
                W.M(a5, "Root view state: " + sVar, null, 6);
                q.c(this.f28156Z, sVar, this.f28157h0, abstractC4326r.g(androidx.compose.foundation.layout.e.f24739c), rVar2, 8, 0);
                rVar2.t(false);
                return;
            default:
                u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                r rVar4 = (r) abstractC1725n;
                m1 m1Var = AbstractC0701r0.f7012o;
                Tc.f fVar = this.f28156Z;
                A7.b.k(m1Var.b(new Tc.q((AbstractActivityC4532l) rVar4.m(p9.m.f42797a), fVar)), R4.b.X(rVar4, 1470446021, new n(gVar, fVar, abstractC4326r)), rVar4, 56);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f28155Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pd.g gVar, Tc.f fVar, AbstractC4326r abstractC4326r) {
        super(2);
        this.f28157h0 = gVar;
        this.f28156Z = fVar;
        this.f28158i0 = abstractC4326r;
    }
}
