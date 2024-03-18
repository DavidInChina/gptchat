package ed;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import id.AbstractC3557B;
import wf.n;

/* renamed from: ed.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2879e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final n f29284Y;

    public C2879e(Jb.c cVar) {
        this.f29284Y = cVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        n nVar = this.f29284Y;
        if (nVar != null) {
            nVar.invoke(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("outState", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }
}
