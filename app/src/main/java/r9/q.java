package r9;

import S8.C1363g;
import W.S2;
import Z.AbstractC1725n;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f44589Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44590Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f44591h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(AbstractC6216a abstractC6216a, String str, int i10) {
        super(2);
        this.f44589Y = i10;
        this.f44590Z = abstractC6216a;
        this.f44591h0 = str;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        int i11 = this.f44589Y;
        String str = this.f44591h0;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("ConfirmationAlertDialog");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Ng.H.f(this.f44590Z, a5, false, null, null, null, null, null, null, R4.b.X(abstractC1725n, -908579027, new C1363g(str, 1)), abstractC1725n, 805306368, 510);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("TextSelectionDialog");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                S2.b(a10, R4.b.X(abstractC1725n, -1400467538, new C5383F(this.f44590Z, 4)), null, null, null, 0, 0L, 0L, null, R4.b.X(abstractC1725n, -400261767, new C1363g(str, 5)), abstractC1725n, 805306416, 509);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f44589Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
