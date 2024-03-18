package B5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: Y  reason: collision with root package name */
    public final b f1867Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicInteger f1868Z = new AtomicInteger(0);

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicInteger f1869h0 = new AtomicInteger(0);

    /* renamed from: i0  reason: collision with root package name */
    public final AtomicBoolean f1870i0 = new AtomicBoolean(true);

    /* renamed from: j0  reason: collision with root package name */
    public final AtomicBoolean f1871j0 = new AtomicBoolean(true);

    public c(b bVar) {
        this.f1867Y = bVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        if (this.f1868Z.decrementAndGet() == 0 && !this.f1870i0.getAndSet(true)) {
            this.f1867Y.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        if (this.f1868Z.incrementAndGet() == 1 && this.f1870i0.getAndSet(false)) {
            this.f1867Y.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("outState", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        if (this.f1869h0.incrementAndGet() == 1 && this.f1871j0.getAndSet(false)) {
            this.f1867Y.b();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        if (this.f1869h0.decrementAndGet() == 0 && this.f1870i0.get()) {
            this.f1867Y.d();
            this.f1871j0.set(true);
        }
    }
}
