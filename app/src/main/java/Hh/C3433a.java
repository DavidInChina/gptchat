package hh;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import id.AbstractC3557B;
import java.lang.reflect.Proxy;
import java.util.Iterator;

/* renamed from: hh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3433a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32343Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Application.ActivityLifecycleCallbacks f32344Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC3440h f32345h0;

    public C3433a(C3434b c3434b) {
        this.f32345h0 = c3434b;
        Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, ih.f.f33253a);
        if (newProxyInstance != null) {
            this.f32344Z = (Application.ActivityLifecycleCallbacks) newProxyInstance;
            return;
        }
        throw new ClassCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f32343Y) {
            case 0:
                AbstractC3557B.d0("p0", activity);
                this.f32344Z.onActivityCreated(activity, bundle);
                return;
            default:
                AbstractC3557B.d0("activity", activity);
                Iterator it = ((C3439g) this.f32345h0).f32357a.iterator();
                while (it.hasNext()) {
                    ((wf.k) it.next()).invoke(activity);
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f32343Y) {
            case 0:
                AbstractC3557B.d0("activity", activity);
                ((C3434b) this.f32345h0).f32348c.a(activity.getClass().getName().concat(" received Activity#onDestroy() callback"), activity);
                return;
            default:
                AbstractC3557B.d0("p0", activity);
                this.f32344Z.onActivityDestroyed(activity);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i10 = this.f32343Y;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f32344Z;
        switch (i10) {
            case 0:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityPaused(activity);
                return;
            default:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityPaused(activity);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i10 = this.f32343Y;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f32344Z;
        switch (i10) {
            case 0:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityResumed(activity);
                return;
            default:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityResumed(activity);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i10 = this.f32343Y;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f32344Z;
        switch (i10) {
            case 0:
                AbstractC3557B.d0("p0", activity);
                AbstractC3557B.d0("p1", bundle);
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                return;
            default:
                AbstractC3557B.d0("p0", activity);
                AbstractC3557B.d0("p1", bundle);
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10 = this.f32343Y;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f32344Z;
        switch (i10) {
            case 0:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityStarted(activity);
                return;
            default:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityStarted(activity);
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f32343Y;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f32344Z;
        switch (i10) {
            case 0:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityStopped(activity);
                return;
            default:
                AbstractC3557B.d0("p0", activity);
                activityLifecycleCallbacks.onActivityStopped(activity);
                return;
        }
    }

    public C3433a(C3439g c3439g) {
        this.f32345h0 = c3439g;
        Object newProxyInstance = Proxy.newProxyInstance(Application.ActivityLifecycleCallbacks.class.getClassLoader(), new Class[]{Application.ActivityLifecycleCallbacks.class}, ih.f.f33253a);
        if (newProxyInstance != null) {
            this.f32344Z = (Application.ActivityLifecycleCallbacks) newProxyInstance;
            return;
        }
        throw new ClassCastException("null cannot be cast to non-null type android.app.Application.ActivityLifecycleCallbacks");
    }
}
