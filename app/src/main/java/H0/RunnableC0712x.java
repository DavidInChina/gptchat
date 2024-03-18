package H0;

import Ii.AbstractC0804i;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import id.AbstractC3557B;
import jf.C3963m;
import wf.AbstractC6216a;

/* renamed from: H0.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0712x implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7064Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f7065Z;

    public /* synthetic */ RunnableC0712x(AbstractC6216a abstractC6216a, int i10) {
        this.f7064Y = i10;
        this.f7065Z = abstractC6216a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7064Y;
        AbstractC6216a abstractC6216a = this.f7065Z;
        switch (i10) {
            case 0:
                abstractC6216a.mo122invoke();
                return;
            case 1:
                int i11 = c1.l.f26067D0;
                abstractC6216a.mo122invoke();
                return;
            case 2:
                abstractC6216a.mo122invoke();
                return;
            case 3:
                abstractC6216a.mo122invoke();
                return;
            case 4:
                DiagnosticsSynchronizer.a(abstractC6216a);
                return;
            case 5:
                OfferingsManager.a(abstractC6216a);
                return;
            case 6:
                PaywallEventsManager.a(abstractC6216a);
                return;
            default:
                C3963m c3963m = AbstractC0804i.f8654a;
                AbstractC3557B.c0("$tmp0", abstractC6216a);
                abstractC6216a.mo122invoke();
                return;
        }
    }
}
