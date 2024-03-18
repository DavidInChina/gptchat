package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public abstract class H {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
