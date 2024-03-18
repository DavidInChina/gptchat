package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import j7.RunnableC3921k;
import java.io.Closeable;
import u5.RunnableC5841a;

/* loaded from: classes.dex */
public final class AppLifecycleIntegration implements X, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public volatile K f33947Y;

    /* renamed from: Z  reason: collision with root package name */
    public SentryAndroidOptions f33948Z;

    /* renamed from: h0  reason: collision with root package name */
    public final S4.o f33949h0 = new S4.o(17);

    public final void a(io.sentry.G g10) {
        SentryAndroidOptions sentryAndroidOptions = this.f33948Z;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f33947Y = new K(g10, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f33948Z.isEnableAutoSessionTracking(), this.f33948Z.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.f25313n0.f25319k0.a(this.f33947Y);
            this.f33948Z.getLogger().f(EnumC3642e1.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            r.f.e(AppLifecycleIntegration.class);
        } catch (Throwable th2) {
            this.f33947Y = null;
            this.f33948Z.getLogger().d(EnumC3642e1.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33947Y == null) {
            return;
        }
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            i();
            return;
        }
        S4.o oVar = this.f33949h0;
        ((Handler) oVar.f16184Z).post(new RunnableC3921k(12, this));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0089 -> B:21:0x00a0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0095 -> B:21:0x00a0). Please submit an issue!!! */
    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        SentryAndroidOptions sentryAndroidOptions;
        io.sentry.A a5 = io.sentry.A.f33710a;
        if (r1Var instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) r1Var;
        } else {
            sentryAndroidOptions = null;
        }
        Ad.l.Z0("SentryAndroidOptions is required", sentryAndroidOptions);
        this.f33948Z = sentryAndroidOptions;
        io.sentry.H logger = sentryAndroidOptions.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f33948Z.isEnableAutoSessionTracking()));
        this.f33948Z.getLogger().f(enumC3642e1, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f33948Z.isEnableAppLifecycleBreadcrumbs()));
        if (this.f33948Z.isEnableAutoSessionTracking() || this.f33948Z.isEnableAppLifecycleBreadcrumbs()) {
            try {
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f25313n0;
                if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
                    a(a5);
                    r1Var = r1Var;
                } else {
                    ((Handler) this.f33949h0.f16184Z).post(new RunnableC5841a(this, 17, a5));
                    r1Var = r1Var;
                }
            } catch (ClassNotFoundException e10) {
                io.sentry.H logger2 = r1Var.getLogger();
                logger2.d(EnumC3642e1.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e10);
                r1Var = logger2;
            } catch (IllegalStateException e11) {
                io.sentry.H logger3 = r1Var.getLogger();
                logger3.d(EnumC3642e1.ERROR, "AppLifecycleIntegration could not be installed", e11);
                r1Var = logger3;
            }
        }
    }

    public final void i() {
        K k10 = this.f33947Y;
        if (k10 != null) {
            ProcessLifecycleOwner.f25313n0.f25319k0.g(k10);
            SentryAndroidOptions sentryAndroidOptions = this.f33948Z;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f33947Y = null;
    }
}
