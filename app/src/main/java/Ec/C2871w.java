package ec;

import A.AbstractC0044t0;
import W.M3;
import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: ec.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2871w extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29257Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2873y f29258Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f29259h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2871w(C2873y c2873y, wf.k kVar, int i10) {
        super(2);
        this.f29257Y = i10;
        this.f29258Z = c2873y;
        this.f29259h0 = kVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        boolean z10;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f29257Y;
        boolean z11 = true;
        wf.k kVar = this.f29259h0;
        C2873y c2873y = this.f29258Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("DataControlsHistorySwitch");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                zd.n nVar = c2873y.f29266a;
                if (nVar != null) {
                    z10 = nVar.f51982a;
                } else {
                    z10 = false;
                }
                boolean z12 = !z10;
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(1192296428);
                boolean g10 = rVar2.g(kVar);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = AbstractC0044t0.v(10, kVar, rVar2);
                }
                rVar2.t(false);
                M3.a(z12, (wf.k) K10, a5, null, false, null, null, rVar2, 0, 124);
                return;
            default:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                boolean K11 = AbstractC3557B.K(c2873y.f29273h, Boolean.TRUE);
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-850164127);
                boolean g11 = rVar4.g(kVar);
                Object K12 = rVar4.K();
                if (g11 || K12 == iVar) {
                    K12 = AbstractC0044t0.v(11, kVar, rVar4);
                }
                wf.k kVar2 = (wf.k) K12;
                rVar4.t(false);
                if (c2873y.f29273h != null) {
                    z11 = false;
                }
                M3.a(K11, kVar2, Bi.c.I1(c4323o, z11, false), null, false, null, null, rVar4, 0, 120);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f29257Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
