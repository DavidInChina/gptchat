package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.C3640e;
import io.sentry.C3686u;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ActivityBreadcrumbsIntegration implements X, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final Application f33915Y;

    /* renamed from: Z  reason: collision with root package name */
    public io.sentry.G f33916Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f33917h0;

    public ActivityBreadcrumbsIntegration(Application application) {
        this.f33915Y = application;
    }

    public final void a(Activity activity, String str) {
        if (this.f33916Z == null) {
            return;
        }
        C3640e c3640e = new C3640e();
        c3640e.f34320h0 = "navigation";
        c3640e.a("state", str);
        c3640e.a("screen", activity.getClass().getSimpleName());
        c3640e.f34322j0 = "ui.lifecycle";
        c3640e.f34323k0 = EnumC3642e1.INFO;
        C3686u c3686u = new C3686u();
        c3686u.c("android:activity", activity);
        this.f33916Z.o(c3640e, c3686u);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33917h0) {
            this.f33915Y.unregisterActivityLifecycleCallbacks(this);
            io.sentry.G g10 = this.f33916Z;
            if (g10 != null) {
                g10.s().getLogger().f(EnumC3642e1.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

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
        this.f33916Z = a5;
        this.f33917h0 = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        io.sentry.H logger = r1Var.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f33917h0));
        if (this.f33917h0) {
            this.f33915Y.registerActivityLifecycleCallbacks(this);
            r1Var.getLogger().f(enumC3642e1, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            r.f.e(ActivityBreadcrumbsIntegration.class);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, "created");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        a(activity, "destroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        a(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        a(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        a(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        a(activity, "stopped");
    }
}
