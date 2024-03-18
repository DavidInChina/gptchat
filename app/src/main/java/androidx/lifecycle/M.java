package androidx.lifecycle;

import a1.C1915c;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class M implements Application.ActivityLifecycleCallbacks {
    public static final L Companion = new Object();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        AbstractC3557B.c0("activity", activity);
        activity.registerActivityLifecycleCallbacks(new M());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        int i10 = N.f25303Z;
        C1915c.i(activity, EnumC2081p.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        int i10 = N.f25303Z;
        C1915c.i(activity, EnumC2081p.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        int i10 = N.f25303Z;
        C1915c.i(activity, EnumC2081p.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        int i10 = N.f25303Z;
        C1915c.i(activity, EnumC2081p.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        int i10 = N.f25303Z;
        C1915c.i(activity, EnumC2081p.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        int i10 = N.f25303Z;
        C1915c.i(activity, EnumC2081p.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("bundle", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }
}
