package lc;

import F.AbstractC0539m;
import W.AbstractC1521a;
import W.G3;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: lc.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4383G extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f38083Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Ec.o f38084Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f38085h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ wf.k f38086i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4383G(Ec.o oVar, AbstractC1710f0 abstractC1710f0, wf.k kVar, int i10) {
        super(2);
        this.f38083Y = i10;
        this.f38084Z = oVar;
        this.f38085h0 = abstractC1710f0;
        this.f38086i0 = kVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f38083Y;
        Ec.o oVar = this.f38084Z;
        wf.k kVar = this.f38086i0;
        AbstractC1710f0 abstractC1710f0 = this.f38085h0;
        switch (i11) {
            case 0:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r r10 = androidx.compose.foundation.layout.a.r(L0.l.a(androidx.compose.foundation.layout.e.g(c4323o, 0.0f, p9.q.f42836g, 1), false, J.a.f8713Y), p9.r.f42842f);
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-1845046403);
                boolean g10 = rVar2.g(oVar) | rVar2.g(abstractC1710f0) | rVar2.g(kVar);
                Object K10 = rVar2.K();
                if (g10 || K10 == C1723m.f22654Y) {
                    K10 = new C6.a(oVar, abstractC1710f0, kVar, 16);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC0539m.a(r10, null, null, false, null, null, null, false, (wf.k) K10, rVar2, 0, 254);
                return;
            default:
                AbstractC4326r a5 = io.sentry.compose.b.a("SettingsLanguageItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                G3.a(a5, AbstractC1521a.a(abstractC1725n), 0L, 0L, p9.i.f42785d, 0.0f, null, R4.b.X(abstractC1725n, -593173198, new C4383G(oVar, abstractC1710f0, kVar, 0)), abstractC1725n, 12582912, 109);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f38083Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
