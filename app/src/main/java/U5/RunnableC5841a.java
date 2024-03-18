package u5;

import K4.AbstractC0815c;
import K4.C0822j;
import Wh.C1663h;
import android.app.Activity;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.Choreographer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.interfaces.Callback;
import id.AbstractC3557B;
import io.sentry.A1;
import io.sentry.C3661l;
import io.sentry.C3696z;
import io.sentry.EnumC3642e1;
import io.sentry.G;
import io.sentry.H;
import io.sentry.P;
import io.sentry.SpotlightIntegration;
import io.sentry.T;
import io.sentry.T0;
import io.sentry.android.core.AppLifecycleIntegration;
import io.sentry.android.core.C3610a;
import io.sentry.android.core.TempSensorBreadcrumbsIntegration;
import io.sentry.protocol.C;
import io.sentry.protocol.C3676c;
import io.sentry.r1;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import kf.w;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.C5089a;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import r6.C5370b;
import v5.C5974a;
import v5.C5975b;
import y5.C6544c;
import y6.C6545a;
import yf.AbstractC6583a;
import z6.C6775a;

/* renamed from: u5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5841a implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f46412Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f46413Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f46414h0;

    public /* synthetic */ RunnableC5841a(Object obj, int i10, Object obj2) {
        this.f46412Y = i10;
        this.f46413Z = obj;
        this.f46414h0 = obj2;
    }

    private final void a() {
        C5370b c5370b = (C5370b) this.f46413Z;
        L4.a aVar = (L4.a) this.f46414h0;
        int i10 = C5370b.f44444k;
        AbstractC3557B.c0("this$0", c5370b);
        AbstractC3557B.c0("$event", aVar);
        synchronized (c5370b.f44451g) {
            c5370b.f44451g.b(aVar, c5370b.f44446b);
        }
        c5370b.f44447c.postDelayed(c5370b.f44452h, C5370b.f44443j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x031a, code lost:
        r8 = r7.createDeviceProtectedStorageContext();
     */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, P5.c] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, Y8.a] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, Y8.a] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Context createDeviceProtectedStorageContext;
        i6.f fVar;
        String str;
        boolean z10 = true;
        switch (this.f46412Y) {
            case 0:
                f fVar2 = (f) this.f46413Z;
                C5975b c5975b = (C5975b) this.f46414h0;
                AbstractC3557B.c0("this$0", fVar2);
                AbstractC3557B.c0("$configuration", c5975b);
                AbstractC5368c h10 = fVar2.h("rum");
                if (h10 != null) {
                    C3959i[] c3959iArr = new C3959i[8];
                    c3959iArr[0] = new C3959i("type", "telemetry_configuration");
                    c3959iArr[1] = new C3959i("track_errors", Boolean.valueOf(c5975b.f47257f));
                    C5974a c5974a = c5975b.f47252a;
                    c3959iArr[2] = new C3959i("batch_size", Long.valueOf(AbstractC4194d.r(c5974a.f47245d)));
                    c3959iArr[3] = new C3959i("batch_upload_frequency", Long.valueOf(AbstractC4194d.i(c5974a.f47246e)));
                    if (c5974a.f47247f == null) {
                        z10 = false;
                    }
                    c3959iArr[4] = new C3959i("use_proxy", Boolean.valueOf(z10));
                    Boolean bool = Boolean.FALSE;
                    c3959iArr[5] = new C3959i("use_local_encryption", bool);
                    c3959iArr[6] = new C3959i("batch_processing_level", Integer.valueOf(AbstractC4194d.p(c5974a.f47250i)));
                    c3959iArr[7] = new C3959i("use_persistence_strategy_factory", bool);
                    ((y5.h) h10).a(AbstractC4268D.a1(c3959iArr));
                    return;
                }
                return;
            case 1:
                y5.d dVar = (y5.d) this.f46413Z;
                Context context = (Context) this.f46414h0;
                C1663h[] c1663hArr = y5.d.f50776I;
                AbstractC3557B.c0("this$0", dVar);
                AbstractC3557B.c0("$appContext", context);
                if (Build.VERSION.SDK_INT >= 24 && createDeviceProtectedStorageContext != null) {
                    context = createDeviceProtectedStorageContext;
                }
                List<O5.a> G02 = AbstractC4344b.G0(O5.a.NTP_0, O5.a.NTP_1, O5.a.NTP_2, O5.a.NTP_3);
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(G02, 10));
                for (O5.a aVar : G02) {
                    arrayList.add(aVar.f13396Y);
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(30L);
                long millis2 = timeUnit.toMillis(5L);
                O5.c cVar = new O5.c(dVar.f50783a);
                long j6 = W8.b.f20819a;
                long j10 = W8.b.f20820b;
                ?? obj = new Object();
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
                AbstractC3557B.b0("context.getSharedPrefere\u2026ME, Context.MODE_PRIVATE)", sharedPreferences);
                Pd.a aVar2 = new Pd.a(sharedPreferences);
                if (!(obj instanceof X8.a)) {
                    Y8.g gVar = new Y8.g(new Y8.c(obj, new Object(), new Object()), obj, new Y8.d(aVar2, obj), cVar, arrayList, j6, millis2, millis, j10);
                    X8.a aVar3 = new X8.a(gVar, obj);
                    try {
                        gVar.b();
                    } catch (IllegalStateException e10) {
                        P4.a.m0(dVar.f50783a, 5, EnumC5090b.f42739Z, C6544c.f50769h0, e10, false, 48);
                    }
                    dVar.f50790h = new O5.b(aVar3);
                    dVar.f50795m = aVar3;
                    return;
                }
                throw new IllegalArgumentException("Local clock should implement Clock instead of KronosClock");
            case 2:
                wf.k kVar = (wf.k) this.f46413Z;
                R5.a aVar4 = (R5.a) this.f46414h0;
                AbstractC3557B.c0("$callback", kVar);
                AbstractC3557B.c0("$strategy", aVar4);
                kVar.invoke(new F5.a(aVar4));
                return;
            case 3:
                H5.h hVar = (H5.h) this.f46413Z;
                AbstractC3557B.c0("this$0", hVar);
                Object obj2 = this.f46414h0;
                AbstractC3557B.c0("$element", obj2);
                hVar.f7467a.a(obj2);
                return;
            case 4:
                a();
                return;
            case 5:
                y6.d dVar2 = (y6.d) this.f46413Z;
                Activity activity = (Activity) this.f46414h0;
                AbstractC3557B.c0("this$0", dVar2);
                AbstractC3557B.c0("$activity", activity);
                AbstractC5091c d10 = dVar2.d();
                int i10 = ((C6545a) dVar2.f50828h0).f50822a;
                switch (i10) {
                    case 0:
                        switch (i10) {
                            case 0:
                                break;
                            default:
                                return;
                        }
                    default:
                        switch (i10) {
                            case 0:
                                break;
                            default:
                                return;
                        }
                }
                try {
                    r5.d dVar3 = dVar2.f50826Y;
                    if (dVar3 != null) {
                        fVar = i6.b.a(dVar3);
                    } else {
                        AbstractC5091c.f42742a.getClass();
                        P4.a.m0(C5089a.f42737b, 3, EnumC5090b.f42738Y, y6.b.f50824h0, null, false, 56);
                        fVar = null;
                    }
                    if (fVar != null) {
                        fVar.o(activity, w.f37484Y);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    P4.a.l0(d10, 5, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), C6775a.f51741Z, e11, 48);
                    return;
                }
            case 6:
                int i11 = JobInfoSchedulerService.f26757Y;
                ((JobInfoSchedulerService) this.f46413Z).jobFinished((JobParameters) this.f46414h0, false);
                return;
            case 7:
                PurchasesOrchestrator$Companion$canMakePayments$2$1.a((AbstractC0815c) this.f46413Z, (Callback) this.f46414h0);
                return;
            case 8:
                Dispatcher.b((Runnable) this.f46413Z, (Dispatcher) this.f46414h0);
                return;
            case 9:
                DiagnosticsTracker.a((DiagnosticsTracker) this.f46413Z, (DiagnosticsEntry) this.f46414h0);
                return;
            case 10:
                BillingWrapper.onBillingSetupFinished$lambda$18((C0822j) this.f46413Z, (BillingWrapper) this.f46414h0);
                return;
            case 11:
                BillingWrapper.sendErrorsToAllPendingRequests$lambda$31$lambda$30((wf.k) this.f46413Z, (PurchasesError) this.f46414h0);
                return;
            case 12:
                ((C3661l) this.f46413Z).g((T) this.f46414h0);
                return;
            case 13:
                ((P) this.f46414h0).c(((C3696z) this.f46413Z).f34851a.getShutdownTimeoutMillis());
                return;
            case 14:
                ((G) this.f46413Z).l(((r1) this.f46414h0).getFlushTimeoutMillis());
                return;
            case 15:
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.f46413Z;
                T0 t02 = (T0) this.f46414h0;
                spotlightIntegration.getClass();
                try {
                    r1 r1Var = spotlightIntegration.f33861Y;
                    if (r1Var != null) {
                        if (r1Var.getSpotlightConnectionUrl() != null) {
                            str = spotlightIntegration.f33861Y.getSpotlightConnectionUrl();
                        } else if (io.sentry.util.d.f34775a) {
                            str = "http://10.0.2.2:8969/stream";
                        } else {
                            str = "http://localhost:8969/stream";
                        }
                        HttpURLConnection i12 = SpotlightIntegration.i(str);
                        OutputStream outputStream = i12.getOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            spotlightIntegration.f33861Y.getSerializer().b(t02, gZIPOutputStream);
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            spotlightIntegration.f33862Z.f(EnumC3642e1.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(i12.getResponseCode()));
                            SpotlightIntegration.a(i12);
                            return;
                        } catch (Throwable th2) {
                            try {
                                gZIPOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                } catch (Exception e12) {
                    spotlightIntegration.f33862Z.d(EnumC3642e1.ERROR, "An exception occurred while creating the connection to spotlight.", e12);
                    return;
                }
            case 16:
                C3610a c3610a = (C3610a) this.f46413Z;
                int i13 = C3610a.f34073q0;
                c3610a.getClass();
                c3610a.f34081m0 = ((io.sentry.transport.g) this.f46414h0).getCurrentTimeMillis();
                c3610a.f34082n0.set(false);
                return;
            case 17:
                ((AppLifecycleIntegration) this.f46413Z).a((G) this.f46414h0);
                return;
            case 18:
                TempSensorBreadcrumbsIntegration tempSensorBreadcrumbsIntegration = (TempSensorBreadcrumbsIntegration) this.f46413Z;
                r1 r1Var2 = (r1) this.f46414h0;
                synchronized (tempSensorBreadcrumbsIntegration.f34050k0) {
                    try {
                        if (!tempSensorBreadcrumbsIntegration.f34049j0) {
                            tempSensorBreadcrumbsIntegration.a(r1Var2);
                        }
                    } finally {
                    }
                }
                return;
            case 19:
                io.sentry.android.core.internal.util.k kVar2 = (io.sentry.android.core.internal.util.k) this.f46413Z;
                H h11 = (H) this.f46414h0;
                int i14 = io.sentry.android.core.internal.util.k.f34181u0;
                kVar2.getClass();
                try {
                    kVar2.f34191o0 = Choreographer.getInstance();
                    return;
                } catch (Throwable th4) {
                    h11.d(EnumC3642e1.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th4);
                    return;
                }
            case 20:
                io.sentry.cache.f fVar3 = (io.sentry.cache.f) this.f46413Z;
                C c10 = (C) this.f46414h0;
                if (c10 == null) {
                    io.sentry.cache.a.a(fVar3.f34296a, ".scope-cache", "user.json");
                    return;
                } else {
                    fVar3.k("user.json", c10);
                    return;
                }
            case 21:
                io.sentry.cache.f fVar4 = (io.sentry.cache.f) this.f46413Z;
                String str2 = (String) this.f46414h0;
                if (str2 == null) {
                    io.sentry.cache.a.a(fVar4.f34296a, ".scope-cache", "transaction.json");
                    return;
                } else {
                    fVar4.k("transaction.json", str2);
                    return;
                }
            case 22:
                ((io.sentry.cache.f) this.f46413Z).k("tags.json", (Map) this.f46414h0);
                return;
            case 23:
                io.sentry.cache.f fVar5 = (io.sentry.cache.f) this.f46413Z;
                A1 a12 = (A1) this.f46414h0;
                if (a12 == null) {
                    io.sentry.cache.a.a(fVar5.f34296a, ".scope-cache", "trace.json");
                    return;
                } else {
                    fVar5.k("trace.json", a12);
                    return;
                }
            case 24:
                ((io.sentry.cache.f) this.f46413Z).k("breadcrumbs.json", (Collection) this.f46414h0);
                return;
            case 25:
                io.sentry.cache.f fVar6 = (io.sentry.cache.f) this.f46413Z;
                Runnable runnable = (Runnable) this.f46414h0;
                fVar6.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable th5) {
                    fVar6.f34296a.getLogger().d(EnumC3642e1.ERROR, "Serialization task failed", th5);
                    return;
                }
            case 26:
                ((io.sentry.cache.f) this.f46413Z).k("contexts.json", (C3676c) this.f46414h0);
                return;
            case 27:
                wf.k kVar3 = (wf.k) this.f46413Z;
                wf.k kVar4 = (wf.k) this.f46414h0;
                AbstractC3557B.c0("$block", kVar3);
                AbstractC3557B.c0("$transform", kVar4);
                kVar3.invoke(kVar4);
                return;
            default:
                wf.k kVar5 = (wf.k) this.f46413Z;
                Throwable th6 = (Throwable) this.f46414h0;
                AbstractC3557B.c0("$block", kVar5);
                AbstractC3557B.c0("$throwable", th6);
                kVar5.invoke(new kh.j(3, th6));
                return;
        }
    }
}
