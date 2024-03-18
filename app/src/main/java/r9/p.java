package r9;

import Z.AbstractC1725n;
import Z.C1723m;
import l0.AbstractC4326r;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44585Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f44586Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f44587h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f44588i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AbstractC6216a abstractC6216a, AbstractC6216a abstractC6216a2, String str, long j6) {
        super(2);
        this.f44585Y = abstractC6216a;
        this.f44586Z = abstractC6216a2;
        this.f44587h0 = str;
        this.f44588i0 = j6;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC4326r a5 = io.sentry.compose.b.a("ConfirmationAlertDialog");
        if ((intValue & 11) == 2) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        Z.r rVar2 = (Z.r) abstractC1725n;
        rVar2.W(-1548844984);
        AbstractC6216a abstractC6216a = this.f44585Y;
        boolean g10 = rVar2.g(abstractC6216a);
        AbstractC6216a abstractC6216a2 = this.f44586Z;
        boolean g11 = g10 | rVar2.g(abstractC6216a2);
        Object K10 = rVar2.K();
        if (g11 || K10 == C1723m.f22654Y) {
            K10 = new o(abstractC6216a, abstractC6216a2, 0);
            rVar2.h0(K10);
        }
        rVar2.t(false);
        Ng.H.f((AbstractC6216a) K10, a5, false, null, null, null, null, null, null, R4.b.X(rVar2, 1397998288, new U.d(this.f44588i0, this.f44587h0)), rVar2, 805306368, 510);
        return jf.y.f36177a;
    }
}
