package wa;

import F.AbstractC0539m;
import L0.l;
import L0.u;
import W.AbstractC1521a;
import W.G3;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import jf.y;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.i;
import p9.q;
import wf.AbstractC6216a;
import wf.k;
import wf.n;
import z.C6686a;

/* renamed from: wa.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6155g extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48271Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Sc.c f48272Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Sc.n f48273h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f48274i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ k f48275j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6155g(int i10, Sc.c cVar, Sc.n nVar, AbstractC6216a abstractC6216a, k kVar) {
        super(2);
        this.f48271Y = i10;
        this.f48272Z = cVar;
        this.f48273h0 = nVar;
        this.f48274i0 = abstractC6216a;
        this.f48275j0 = kVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f48271Y) {
            case 0:
                u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(l.a(androidx.compose.foundation.layout.e.g(c4323o, 0.0f, q.f42836g, 1), false, J.a.f8713Y), p9.r.f42842f);
                r rVar2 = (r) abstractC1725n;
                rVar2.W(1991213894);
                Sc.c cVar = this.f48272Z;
                boolean g10 = rVar2.g(cVar);
                Sc.n nVar = this.f48273h0;
                boolean g11 = g10 | rVar2.g(nVar);
                AbstractC6216a abstractC6216a = this.f48274i0;
                boolean g12 = g11 | rVar2.g(abstractC6216a);
                k kVar = this.f48275j0;
                boolean g13 = g12 | rVar2.g(kVar);
                Object K10 = rVar2.K();
                if (g13 || K10 == C1723m.f22654Y) {
                    K10 = new C6686a(cVar, nVar, abstractC6216a, kVar);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC0539m.a(r10, null, null, false, null, null, null, false, (k) K10, rVar2, 0, 254);
                return;
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("ModelsDialog");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                G3.a(a5, AbstractC1521a.a(abstractC1725n), 0L, 0L, i.f42785d, 0.0f, null, R4.b.X(abstractC1725n, -351970641, new C6155g(0, this.f48272Z, this.f48273h0, this.f48274i0, this.f48275j0)), abstractC1725n, 12582912, 109);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f48271Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
