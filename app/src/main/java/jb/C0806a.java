package Jb;

import Z.AbstractC1725n;
import l0.AbstractC4326r;
import u0.AbstractC5824b;
import wf.AbstractC6216a;

/* renamed from: Jb.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0806a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8955Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f8956Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC5824b f8957h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0806a(AbstractC6216a abstractC6216a, AbstractC5824b abstractC5824b, int i10) {
        super(2);
        this.f8955Y = i10;
        this.f8956Z = abstractC6216a;
        this.f8957h0 = abstractC5824b;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f8955Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("BaseOnboardingScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Ad.l.r(this.f8956Z, this.f8957h0, a5, abstractC1725n, 64, 4);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("OnboardingToolbar");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                R4.b.o(this.f8956Z, a10, false, null, null, R4.b.X(abstractC1725n, 1803264367, new c(0, this.f8957h0)), abstractC1725n, 196608, 30);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f8955Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
