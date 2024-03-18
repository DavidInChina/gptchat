package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import id.AbstractC3557B;
import io.sentry.EnumC3642e1;
import io.sentry.Z0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import u5.RunnableC5841a;

/* renamed from: io.sentry.android.core.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3610a extends Thread {

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ int f34073q0 = 0;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f34074Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C3617h f34075Z;

    /* renamed from: h0  reason: collision with root package name */
    public final S4.o f34076h0;

    /* renamed from: i0  reason: collision with root package name */
    public final io.sentry.transport.g f34077i0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f34079k0;

    /* renamed from: l0  reason: collision with root package name */
    public final io.sentry.H f34080l0;

    /* renamed from: o0  reason: collision with root package name */
    public final Context f34083o0;

    /* renamed from: p0  reason: collision with root package name */
    public final RunnableC5841a f34084p0;

    /* renamed from: m0  reason: collision with root package name */
    public volatile long f34081m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public final AtomicBoolean f34082n0 = new AtomicBoolean(false);

    /* renamed from: j0  reason: collision with root package name */
    public final long f34078j0 = 500;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3610a(long j6, boolean z10, C3617h c3617h, io.sentry.H h10, Context context) {
        super("|ANR-WatchDog|");
        A9.a aVar = new A9.a(28);
        S4.o oVar = new S4.o(17);
        this.f34077i0 = aVar;
        this.f34079k0 = j6;
        this.f34074Y = z10;
        this.f34075Z = c3617h;
        this.f34080l0 = h10;
        this.f34076h0 = oVar;
        this.f34083o0 = context;
        this.f34084p0 = new RunnableC5841a(this, 16, aVar);
        if (j6 >= 1000) {
            return;
        }
        throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
    }

    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, io.sentry.protocol.k] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> list;
        this.f34084p0.run();
        while (!isInterrupted()) {
            ((Handler) this.f34076h0.f16184Z).post(this.f34084p0);
            try {
                Thread.sleep(this.f34078j0);
                if (this.f34077i0.getCurrentTimeMillis() - this.f34081m0 > this.f34079k0) {
                    if (!this.f34074Y && (Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        this.f34080l0.f(EnumC3642e1.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.f34082n0.set(true);
                    } else {
                        ActivityManager activityManager = (ActivityManager) this.f34083o0.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                list = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f34080l0.d(EnumC3642e1.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                                list = null;
                            }
                            if (list != null) {
                                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : list) {
                                    if (processErrorStateInfo.condition == 2) {
                                    }
                                }
                            }
                        }
                        if (this.f34082n0.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(((Handler) this.f34076h0.f16184Z).getLooper().getThread(), android.gov.nist.core.a.m(new StringBuilder("Application Not Responding for at least "), this.f34079k0, " ms."));
                            C3617h c3617h = this.f34075Z;
                            io.sentry.G g10 = (io.sentry.G) c3617h.f34106Z;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c3617h.f34107h0;
                            C3610a c3610a = AnrIntegration.f33935j0;
                            ((AnrIntegration) c3617h.f34105Y).getClass();
                            sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean equals = Boolean.TRUE.equals(A.f33913b.f33914a);
                            String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (equals) {
                                str = R.a.r("Background ", str);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(applicationNotResponding.f33950Y, str);
                            ?? obj = new Object();
                            obj.f34565Y = "ANR";
                            Z0 z02 = new Z0(new io.sentry.exception.a(obj, applicationNotResponding2, applicationNotResponding2.f33950Y, true));
                            z02.f33904z0 = EnumC3642e1.ERROR;
                            g10.C(z02, AbstractC3557B.t0(new C3628t(equals)));
                        }
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f34080l0.f(EnumC3642e1.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f34080l0.f(EnumC3642e1.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }
}
