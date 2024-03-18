package M3;

import K4.AbstractC0815c;
import K4.C0822j;
import L3.C0889a;
import android.graphics.Canvas;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.interfaces.Callback;
import i7.C3482a;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.r1;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import v.C5936e;
import v8.AbstractC5995c;
import v8.C5997e;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f11601Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f11602Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f11603h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f11604i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f11605j0;

    public /* synthetic */ u(C0822j c0822j, Callback callback, AbstractC0815c abstractC0815c, List list) {
        this.f11601Y = 4;
        this.f11603h0 = c0822j;
        this.f11604i0 = callback;
        this.f11605j0 = abstractC0815c;
        this.f11602Z = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11601Y) {
            case 0:
                List<s> list = (List) this.f11602Z;
                U3.j jVar = (U3.j) this.f11603h0;
                C0889a c0889a = (C0889a) this.f11604i0;
                WorkDatabase workDatabase = (WorkDatabase) this.f11605j0;
                for (s sVar : list) {
                    sVar.c(jVar.f17418a);
                }
                v.b(c0889a, workDatabase, list);
                return;
            case 1:
                i7.b bVar = (i7.b) this.f11602Z;
                e7.i iVar = (e7.i) this.f11603h0;
                A9.a aVar = (A9.a) this.f11604i0;
                e7.h hVar = (e7.h) this.f11605j0;
                Logger logger = i7.b.f32739f;
                bVar.getClass();
                Logger logger2 = i7.b.f32739f;
                try {
                    f7.h a5 = bVar.f32742c.a(iVar.f29006a);
                    if (a5 == null) {
                        String str = "Transport backend '" + iVar.f29006a + "' is not registered";
                        logger2.warning(str);
                        new IllegalArgumentException(str);
                        aVar.getClass();
                    } else {
                        ((k7.k) bVar.f32744e).k(new C3482a(bVar, iVar, ((c7.d) a5).a(hVar), 0));
                        aVar.getClass();
                    }
                    return;
                } catch (Exception e10) {
                    logger2.warning("Error scheduling event " + e10.getMessage());
                    aVar.getClass();
                    return;
                }
            case 2:
                C5997e c5997e = (C5997e) this.f11602Z;
                C5936e c5936e = (C5936e) this.f11603h0;
                AbstractC2469q0.p(this.f11604i0);
                Runnable runnable = (Runnable) this.f11605j0;
                if (c5997e.f47374f != null) {
                    c5997e.b(c5936e, runnable);
                    return;
                }
                throw new IllegalStateException("mSession is null in launchWhenSessionEstablished");
            case 3:
                C5997e c5997e2 = (C5997e) this.f11602Z;
                ((A9.a) ((AbstractC5995c) this.f11603h0)).h(c5997e2.f47369a, (C5936e) this.f11604i0, c5997e2.f47370b, (Runnable) this.f11605j0);
                return;
            case 4:
                PurchasesOrchestrator$Companion$canMakePayments$2$1.b((C0822j) this.f11603h0, (Callback) this.f11604i0, (AbstractC0815c) this.f11605j0, (List) this.f11602Z);
                return;
            case 5:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.f11602Z;
                io.sentry.G g10 = (io.sentry.G) this.f11603h0;
                r1 r1Var = (r1) this.f11604i0;
                String str2 = (String) this.f11605j0;
                synchronized (envelopeFileObserverIntegration.f33963i0) {
                    try {
                        if (!envelopeFileObserverIntegration.f33962h0) {
                            envelopeFileObserverIntegration.i(g10, r1Var, str2);
                        }
                    } finally {
                    }
                }
                return;
            default:
                View view = (View) this.f11602Z;
                Canvas canvas = (Canvas) this.f11603h0;
                io.sentry.H h10 = (io.sentry.H) this.f11604i0;
                CountDownLatch countDownLatch = (CountDownLatch) this.f11605j0;
                try {
                    view.draw(canvas);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f11601Y = i10;
        this.f11602Z = obj;
        this.f11603h0 = obj2;
        this.f11604i0 = obj3;
        this.f11605j0 = obj4;
    }
}
