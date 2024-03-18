package o1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.android.core.AbstractC3612c;
import q.RunnableC5216j;

/* renamed from: o1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4893h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public Object f40452Y;

    /* renamed from: Z  reason: collision with root package name */
    public Activity f40453Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f40454h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f40455i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f40456j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f40457k0 = false;

    public C4893h(Activity activity) {
        this.f40453Z = activity;
        this.f40454h0 = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f40453Z == activity) {
            this.f40453Z = null;
            this.f40456j0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f40456j0 && !this.f40457k0 && !this.f40455i0) {
            Object obj = this.f40452Y;
            try {
                Object obj2 = AbstractC4894i.f40460c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f40454h0) {
                    AbstractC4894i.f40464g.postAtFrontOfQueue(new RunnableC5216j(AbstractC4894i.f40459b.get(activity), obj2, 4));
                    this.f40457k0 = true;
                    this.f40452Y = null;
                }
            } catch (Throwable th2) {
                AbstractC3612c.d("ActivityRecreator", "Exception while fetching field values", th2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f40453Z == activity) {
            this.f40455i0 = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
