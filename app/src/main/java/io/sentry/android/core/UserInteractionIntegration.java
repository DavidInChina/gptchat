package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.C1;
import io.sentry.EnumC3642e1;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;
import xe.C6431t;

/* loaded from: classes.dex */
public final class UserInteractionIntegration implements X, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final Application f34058Y;

    /* renamed from: Z  reason: collision with root package name */
    public io.sentry.G f34059Z;

    /* renamed from: h0  reason: collision with root package name */
    public SentryAndroidOptions f34060h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f34061i0 = C6431t.l(this.f34060h0, "androidx.core.view.GestureDetectorCompat");

    public UserInteractionIntegration(Application application) {
        this.f34058Y = application;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34058Y.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f34060h0;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().f(EnumC3642e1.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
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
        this.f34060h0 = sentryAndroidOptions;
        this.f34059Z = a5;
        if (!sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() && !this.f34060h0.isEnableUserInteractionTracing()) {
            z10 = false;
        } else {
            z10 = true;
        }
        io.sentry.H logger = this.f34060h0.getLogger();
        EnumC3642e1 enumC3642e1 = EnumC3642e1.DEBUG;
        logger.f(enumC3642e1, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z10));
        if (z10) {
            if (this.f34061i0) {
                this.f34058Y.registerActivityLifecycleCallbacks(this);
                this.f34060h0.getLogger().f(enumC3642e1, "UserInteractionIntegration installed.", new Object[0]);
                r.f.e(UserInteractionIntegration.class);
                return;
            }
            r1Var.getLogger().f(EnumC3642e1.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f34060h0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.f) {
            io.sentry.android.core.internal.gestures.f fVar = (io.sentry.android.core.internal.gestures.f) callback;
            fVar.f34130h0.e(C1.CANCELLED);
            Window.Callback callback2 = fVar.f34129Z;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f34060h0;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().f(EnumC3642e1.INFO, "Window was null in startTracking", new Object[0]);
            }
        } else if (this.f34059Z != null && this.f34060h0 != null) {
            Window.Callback callback = window.getCallback();
            Window.Callback callback2 = callback;
            if (callback == null) {
                callback2 = new Object();
            }
            window.setCallback(new io.sentry.android.core.internal.gestures.f(callback2, activity, new io.sentry.android.core.internal.gestures.e(activity, this.f34059Z, this.f34060h0), this.f34060h0));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
