package fc;

import A.AbstractC0044t0;
import W.M3;
import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import mc.C4616c;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30224Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ y f30225Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f30226h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, wf.k kVar, int i10) {
        super(2);
        this.f30224Y = i10;
        this.f30225Z = yVar;
        this.f30226h0 = kVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        int i11 = this.f30224Y;
        wf.k kVar = this.f30226h0;
        y yVar = this.f30225Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C4616c c4616c = yVar.f30237a;
                if (c4616c != null) {
                    z10 = c4616c.f39128d;
                } else {
                    z10 = false;
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-1465010608);
                boolean g10 = rVar2.g(kVar);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = AbstractC0044t0.v(12, kVar, rVar2);
                }
                rVar2.t(false);
                M3.a(z10, (wf.k) K10, a5, null, false, null, null, rVar2, 0, 124);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                C4616c c4616c2 = yVar.f30237a;
                if (c4616c2 != null) {
                    z11 = c4616c2.f39125a;
                } else {
                    z11 = false;
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-1465009862);
                boolean g11 = rVar4.g(kVar);
                Object K11 = rVar4.K();
                if (g11 || K11 == iVar) {
                    K11 = AbstractC0044t0.v(13, kVar, rVar4);
                }
                rVar4.t(false);
                M3.a(z11, (wf.k) K11, a10, null, false, null, null, rVar4, 0, 124);
                return;
            default:
                AbstractC4326r a11 = io.sentry.compose.b.a("DeveloperSettingsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                C4616c c4616c3 = yVar.f30237a;
                if (c4616c3 != null) {
                    z12 = c4616c3.f39126b;
                } else {
                    z12 = false;
                }
                Z.r rVar6 = (Z.r) abstractC1725n;
                rVar6.W(-1465009147);
                boolean g12 = rVar6.g(kVar);
                Object K12 = rVar6.K();
                if (g12 || K12 == iVar) {
                    K12 = AbstractC0044t0.v(14, kVar, rVar6);
                }
                rVar6.t(false);
                M3.a(z12, (wf.k) K12, a11, null, false, null, null, rVar6, 0, 124);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f30224Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
