package io.sentry.android.core;

import V1.C1464e;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import hd.C3411e;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.C3648g1;
import io.sentry.C3684t;
import io.sentry.C3687u0;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3665m0;
import io.sentry.I1;
import io.sentry.J1;
import io.sentry.R0;
import io.sentry.W;
import io.sentry.X;
import io.sentry.r1;
import j7.RunnableC3921k;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p.View$OnAttachStateChangeListenerC5030f;

/* loaded from: classes.dex */
public final class ActivityLifecycleIntegration implements X, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final Application f33918Y;

    /* renamed from: Z  reason: collision with root package name */
    public final B f33919Z;

    /* renamed from: h0  reason: collision with root package name */
    public io.sentry.G f33920h0;

    /* renamed from: i0  reason: collision with root package name */
    public SentryAndroidOptions f33921i0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f33924l0;

    /* renamed from: o0  reason: collision with root package name */
    public io.sentry.S f33927o0;

    /* renamed from: v0  reason: collision with root package name */
    public final C3614e f33934v0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f33922j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f33923k0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f33925m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public C3684t f33926n0 = null;

    /* renamed from: p0  reason: collision with root package name */
    public final WeakHashMap f33928p0 = new WeakHashMap();

    /* renamed from: q0  reason: collision with root package name */
    public final WeakHashMap f33929q0 = new WeakHashMap();

    /* renamed from: r0  reason: collision with root package name */
    public R0 f33930r0 = AbstractC3619j.f34195a.e();

    /* renamed from: s0  reason: collision with root package name */
    public final Handler f33931s0 = new Handler(Looper.getMainLooper());

    /* renamed from: t0  reason: collision with root package name */
    public Future f33932t0 = null;

    /* renamed from: u0  reason: collision with root package name */
    public final WeakHashMap f33933u0 = new WeakHashMap();

    public ActivityLifecycleIntegration(Application application, B b10, C3614e c3614e) {
        this.f33918Y = application;
        this.f33919Z = b10;
        this.f33934v0 = c3614e;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f33924l0 = true;
        }
    }

    public static void i(io.sentry.S s10, io.sentry.S s11) {
        R0 r02;
        if (s10 != null && !s10.f()) {
            String description = s10.getDescription();
            if (description == null || !description.endsWith(" - Deadline Exceeded")) {
                description = s10.getDescription() + " - Deadline Exceeded";
            }
            s10.m(description);
            if (s11 != null) {
                r02 = s11.t();
            } else {
                r02 = null;
            }
            if (r02 == null) {
                r02 = s10.x();
            }
            j(s10, r02, C1.DEADLINE_EXCEEDED);
        }
    }

    public static void j(io.sentry.S s10, R0 r02, C1 c12) {
        if (s10 != null && !s10.f()) {
            if (c12 == null) {
                if (s10.a() != null) {
                    c12 = s10.a();
                } else {
                    c12 = C1.OK;
                }
            }
            s10.u(c12, r02);
        }
    }

    public final void a() {
        boolean z10;
        C3648g1 c3648g1;
        io.sentry.android.core.performance.c a5 = io.sentry.android.core.performance.b.b().a(this.f33921i0);
        long j6 = 0;
        if (a5.f34219i0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (a5.b()) {
                long j10 = a5.f34217Z;
                long j11 = a5.f34219i0;
                if (j11 != 0) {
                    j6 = j11 - a5.f34218h0;
                }
                j6 += j10;
            }
            c3648g1 = new C3648g1(j6 * 1000000);
        } else {
            c3648g1 = null;
        }
        if (this.f33922j0 && c3648g1 != null) {
            j(this.f33927o0, c3648g1, null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33918Y.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f33921i0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        C3614e c3614e = this.f33934v0;
        synchronized (c3614e) {
            try {
                if (c3614e.c()) {
                    c3614e.d(new RunnableC3921k(10, c3614e), "FrameMetricsAggregator.stop");
                    c3614e.f34093a.f24909a.u();
                }
                c3614e.f34095c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        boolean z10;
        io.sentry.A a5 = io.sentry.A.f33710a;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f33921i0 = sentryAndroidOptions;
        this.f33920h0 = a5;
        if (sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33922j0 = z10;
        this.f33926n0 = this.f33921i0.getFullyDisplayedReporter();
        this.f33923k0 = this.f33921i0.isEnableTimeToFullDisplayTracing();
        this.f33918Y.registerActivityLifecycleCallbacks(this);
        this.f33921i0.getLogger().f(EnumC3642e1.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        r.f.e(ActivityLifecycleIntegration.class);
    }

    public final void k(io.sentry.T t10, io.sentry.S s10, io.sentry.S s11) {
        if (t10 == null || t10.f()) {
            return;
        }
        C1 c12 = C1.DEADLINE_EXCEEDED;
        if (s10 != null && !s10.f()) {
            s10.j(c12);
        }
        i(s11, s10);
        Future future = this.f33932t0;
        if (future != null) {
            future.cancel(false);
            this.f33932t0 = null;
        }
        C1 a5 = t10.a();
        if (a5 == null) {
            a5 = C1.OK;
        }
        t10.j(a5);
        io.sentry.G g10 = this.f33920h0;
        if (g10 != null) {
            g10.p(new C3616g(this, t10, 0));
        }
    }

    public final void m(io.sentry.S s10, io.sentry.S s11) {
        io.sentry.android.core.performance.b b10 = io.sentry.android.core.performance.b.b();
        io.sentry.android.core.performance.c cVar = b10.f34209b;
        if (cVar.b() && cVar.a()) {
            cVar.f34219i0 = SystemClock.uptimeMillis();
        }
        io.sentry.android.core.performance.c cVar2 = b10.f34210c;
        if (cVar2.b() && cVar2.a()) {
            cVar2.f34219i0 = SystemClock.uptimeMillis();
        }
        a();
        SentryAndroidOptions sentryAndroidOptions = this.f33921i0;
        if (sentryAndroidOptions != null && s11 != null) {
            R0 e10 = sentryAndroidOptions.getDateProvider().e();
            long millis = TimeUnit.NANOSECONDS.toMillis(e10.b(s11.x()));
            Long valueOf = Long.valueOf(millis);
            EnumC3665m0 enumC3665m0 = EnumC3665m0.MILLISECOND;
            s11.r("time_to_initial_display", valueOf, enumC3665m0);
            if (s10 != null && s10.f()) {
                s10.h(e10);
                s11.r("time_to_full_display", Long.valueOf(millis), enumC3665m0);
            }
            j(s11, e10, null);
        } else if (s11 != null && !s11.f()) {
            s11.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.android.core.performance.a aVar;
        try {
            if (!this.f33925m0 && (sentryAndroidOptions = this.f33921i0) != null && !sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.performance.b b10 = io.sentry.android.core.performance.b.b();
                if (bundle == null) {
                    aVar = io.sentry.android.core.performance.a.COLD;
                } else {
                    aVar = io.sentry.android.core.performance.a.WARM;
                }
                b10.f34208a = aVar;
            }
            if (this.f33920h0 != null) {
                this.f33920h0.p(new C3411e(AbstractC3557B.j1(activity)));
            }
            p(activity);
            io.sentry.S s10 = (io.sentry.S) this.f33929q0.get(activity);
            this.f33925m0 = true;
            C3684t c3684t = this.f33926n0;
            if (c3684t != null) {
                c3684t.f34723a.add(new C1464e(this, 18, s10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            if (this.f33922j0) {
                io.sentry.S s10 = this.f33927o0;
                C1 c12 = C1.CANCELLED;
                if (s10 != null && !s10.f()) {
                    s10.j(c12);
                }
                io.sentry.S s11 = (io.sentry.S) this.f33928p0.get(activity);
                io.sentry.S s12 = (io.sentry.S) this.f33929q0.get(activity);
                C1 c13 = C1.DEADLINE_EXCEEDED;
                if (s11 != null && !s11.f()) {
                    s11.j(c13);
                }
                i(s12, s11);
                Future future = this.f33932t0;
                if (future != null) {
                    future.cancel(false);
                    this.f33932t0 = null;
                }
                if (this.f33922j0) {
                    k((io.sentry.T) this.f33933u0.get(activity), null, null);
                }
                this.f33927o0 = null;
                this.f33928p0.remove(activity);
                this.f33929q0.remove(activity);
            }
            this.f33933u0.remove(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        try {
            if (!this.f33924l0) {
                this.f33925m0 = true;
                io.sentry.G g10 = this.f33920h0;
                if (g10 == null) {
                    this.f33930r0 = AbstractC3619j.f34195a.e();
                } else {
                    this.f33930r0 = g10.s().getDateProvider().e();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        if (this.f33924l0) {
            this.f33925m0 = true;
            io.sentry.G g10 = this.f33920h0;
            if (g10 == null) {
                this.f33930r0 = AbstractC3619j.f34195a.e();
            } else {
                this.f33930r0 = g10.s().getDateProvider().e();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f33922j0) {
                io.sentry.S s10 = (io.sentry.S) this.f33928p0.get(activity);
                io.sentry.S s11 = (io.sentry.S) this.f33929q0.get(activity);
                View findViewById = activity.findViewById(16908290);
                if (findViewById != null) {
                    RunnableC3615f runnableC3615f = new RunnableC3615f(this, s11, s10, 0);
                    B b10 = this.f33919Z;
                    io.sentry.android.core.internal.util.f fVar = new io.sentry.android.core.internal.util.f(findViewById, runnableC3615f);
                    b10.getClass();
                    if (Build.VERSION.SDK_INT < 26 && (!findViewById.getViewTreeObserver().isAlive() || !findViewById.isAttachedToWindow())) {
                        findViewById.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC5030f(6, fVar));
                    }
                    findViewById.getViewTreeObserver().addOnDrawListener(fVar);
                } else {
                    this.f33931s0.post(new RunnableC3615f(this, s11, s10, 1));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.f33922j0) {
            this.f33934v0.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
    }

    public final void p(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        C3648g1 c3648g1;
        Boolean bool;
        R0 r02;
        String str;
        String str2;
        boolean z10;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f33920h0 != null) {
            WeakHashMap weakHashMap3 = this.f33933u0;
            if (!weakHashMap3.containsKey(activity)) {
                if (!this.f33922j0) {
                    weakHashMap3.put(activity, C3687u0.f34769a);
                    this.f33920h0.p(new C2.r(5));
                    return;
                }
                Iterator it = weakHashMap3.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    weakHashMap = this.f33929q0;
                    weakHashMap2 = this.f33928p0;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    k((io.sentry.T) entry.getValue(), (io.sentry.S) weakHashMap2.get(entry.getKey()), (io.sentry.S) weakHashMap.get(entry.getKey()));
                }
                String simpleName = activity.getClass().getSimpleName();
                io.sentry.android.core.performance.c a5 = io.sentry.android.core.performance.b.b().a(this.f33921i0);
                U3.n nVar = null;
                boolean z11 = false;
                if (AbstractC3612c.k() && a5.b()) {
                    if (a5.b()) {
                        c3648g1 = new C3648g1(a5.f34217Z * 1000000);
                    } else {
                        c3648g1 = null;
                    }
                    if (io.sentry.android.core.performance.b.b().f34208a == io.sentry.android.core.performance.a.COLD) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = null;
                    c3648g1 = null;
                }
                J1 j12 = new J1();
                j12.f33813h = 300000L;
                if (this.f33921i0.isEnableActivityLifecycleTracingAutoFinish()) {
                    j12.f33812g = this.f33921i0.getIdleTimeout();
                    j12.f552b = true;
                }
                j12.f33811f = true;
                j12.f33814i = new C3617h(this, weakReference, simpleName);
                if (!this.f33925m0 && c3648g1 != null && bool != null) {
                    U3.n nVar2 = io.sentry.android.core.performance.b.b().f34215h;
                    io.sentry.android.core.performance.b.b().f34215h = null;
                    nVar = nVar2;
                    r02 = c3648g1;
                } else {
                    r02 = this.f33930r0;
                }
                j12.f33809d = r02;
                if (nVar != null) {
                    z11 = true;
                }
                j12.f33810e = z11;
                io.sentry.T m10 = this.f33920h0.m(new I1(simpleName, io.sentry.protocol.B.COMPONENT, "ui.load", nVar), j12);
                if (m10 != null) {
                    m10.s().f33722n0 = "auto.ui.activity";
                }
                if (!this.f33925m0 && c3648g1 != null && bool != null) {
                    if (bool.booleanValue()) {
                        str = "app.start.cold";
                    } else {
                        str = "app.start.warm";
                    }
                    if (bool.booleanValue()) {
                        str2 = "Cold Start";
                    } else {
                        str2 = "Warm Start";
                    }
                    io.sentry.S k10 = m10.k(str, str2, c3648g1, W.SENTRY);
                    this.f33927o0 = k10;
                    k10.s().f33722n0 = "auto.ui.activity";
                    a();
                }
                String concat = simpleName.concat(" initial display");
                W w10 = W.SENTRY;
                io.sentry.S k11 = m10.k("ui.load.initial_display", concat, r02, w10);
                weakHashMap2.put(activity, k11);
                k11.s().f33722n0 = "auto.ui.activity";
                if (this.f33923k0 && this.f33926n0 != null && this.f33921i0 != null) {
                    io.sentry.S k12 = m10.k("ui.load.full_display", simpleName.concat(" full display"), r02, w10);
                    k12.s().f33722n0 = "auto.ui.activity";
                    try {
                        weakHashMap.put(activity, k12);
                        this.f33932t0 = this.f33921i0.getExecutorService().l(new RunnableC3615f(this, k12, k11, 2), 30000L);
                    } catch (RejectedExecutionException e10) {
                        this.f33921i0.getLogger().d(EnumC3642e1.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
                    }
                }
                this.f33920h0.p(new C3616g(this, m10, 1));
                weakHashMap3.put(activity, m10);
            }
        }
    }
}
