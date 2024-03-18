package bb;

import F.AbstractC0528b;
import Z.AbstractC1725n;
import Z.AbstractC1734s;
import Z.C1723m;
import cb.C2350T;
import id.AbstractC3557B;

/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f25744Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2350T f25745Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f25746h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i10, C2350T c2350t, wf.k kVar) {
        super(3);
        this.f25744Y = i10;
        this.f25745Z = c2350t;
        this.f25746h0 = kVar;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        io.sentry.hints.i iVar = C1723m.f22654Y;
        int i11 = this.f25744Y;
        wf.k kVar = this.f25746h0;
        C2350T c2350t = this.f25745Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Integer valueOf = Integer.valueOf(c2350t.f26487b.size());
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(-338049394);
                boolean g10 = rVar2.g(kVar) | rVar2.g(c2350t);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = new U(c2350t, null, kVar);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                AbstractC1734s.e(valueOf, (wf.n) K10, rVar2);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                jf.y yVar = jf.y.f36177a;
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(-1819956575);
                boolean g11 = rVar4.g(c2350t) | rVar4.g(kVar);
                Object K11 = rVar4.K();
                if (g11 || K11 == iVar) {
                    K11 = new i0(c2350t, null, kVar);
                    rVar4.h0(K11);
                }
                rVar4.t(false);
                AbstractC1734s.e(yVar, (wf.n) K11, rVar4);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f25744Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
