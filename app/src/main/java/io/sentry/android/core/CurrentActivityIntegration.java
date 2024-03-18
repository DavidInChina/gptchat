package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.X;
import io.sentry.r1;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class CurrentActivityIntegration implements X, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final Application f33954Y;

    public CurrentActivityIntegration(Application application) {
        this.f33954Y = application;
    }

    public static void a(Activity activity) {
        C c10 = C.f33952b;
        WeakReference weakReference = c10.f33953a;
        if (weakReference == null || weakReference.get() != activity) {
            c10.f33953a = new WeakReference(activity);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33954Y.unregisterActivityLifecycleCallbacks(this);
        C.f33952b.f33953a = null;
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        this.f33954Y.registerActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        C c10 = C.f33952b;
        WeakReference weakReference = c10.f33953a;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (activity2 == activity) {
            c10.f33953a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Activity activity2;
        C c10 = C.f33952b;
        WeakReference weakReference = c10.f33953a;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (activity2 == activity) {
            c10.f33953a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Activity activity2;
        C c10 = C.f33952b;
        WeakReference weakReference = c10.f33953a;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (activity2 == activity) {
            c10.f33953a = null;
        }
    }
}
