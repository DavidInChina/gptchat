package I9;

import A.C0033n0;
import E.AbstractC0441z;
import Z.AbstractC1725n;
import Z.C1723m;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import wf.AbstractC6216a;

/* renamed from: I9.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766k0 extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8406Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f8407Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0766k0(AbstractC6216a abstractC6216a, int i10) {
        super(3);
        this.f8406Y = i10;
        this.f8407Z = abstractC6216a;
    }

    public final void a(AbstractC0441z abstractC0441z, AbstractC1725n abstractC1725n, int i10) {
        io.sentry.hints.i iVar = C1723m.f22654Y;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f8406Y;
        AbstractC6216a abstractC6216a = this.f8407Z;
        switch (i11) {
            case 0:
                AbstractC3557B.c0("$this$HeroContent", abstractC0441z);
                AbstractC4326r a5 = io.sentry.compose.b.a("HistoryDisabledContent");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(34001161);
                boolean g10 = rVar2.g(abstractC6216a);
                Object K10 = rVar2.K();
                if (g10 || K10 == iVar) {
                    K10 = new C0033n0(abstractC6216a, 19);
                    rVar2.h0(K10);
                }
                rVar2.t(false);
                Ng.H.a((AbstractC6216a) K10, a5, false, null, null, null, null, null, null, AbstractC0757g.f8343a, rVar2, 805306368, 510);
                return;
            case 1:
                AbstractC3557B.c0("$this$HeroContent", abstractC0441z);
                AbstractC4326r a10 = io.sentry.compose.b.a("HistoryEmptyContent");
                if ((i10 & 81) == 16) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Z.r rVar4 = (Z.r) abstractC1725n;
                rVar4.W(1635368927);
                boolean g11 = rVar4.g(abstractC6216a);
                Object K11 = rVar4.K();
                if (g11 || K11 == iVar) {
                    K11 = new C0033n0(abstractC6216a, 20);
                    rVar4.h0(K11);
                }
                rVar4.t(false);
                Ng.H.a((AbstractC6216a) K11, a10, false, null, null, null, null, null, null, AbstractC0759h.f8354a, rVar4, 805306368, 510);
                return;
            default:
                AbstractC3557B.c0("$this$HeroContent", abstractC0441z);
                AbstractC4326r a11 = io.sentry.compose.b.a("InitializationFailedScreen");
                if ((i10 & 81) == 16) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                Ng.H.a(this.f8407Z, AbstractC4194d.a((G0.X) a11, androidx.compose.foundation.layout.e.d(c4323o, 1.0f)), false, null, null, null, null, null, null, Ub.b.f17592a, abstractC1725n, 805306416, 508);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8406Y) {
            case 0:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0441z) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
