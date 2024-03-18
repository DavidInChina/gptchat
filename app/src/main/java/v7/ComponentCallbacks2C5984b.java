package v7;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: v7.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C5984b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j0  reason: collision with root package name */
    public static final ComponentCallbacks2C5984b f47292j0 = new ComponentCallbacks2C5984b();

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicBoolean f47293Y = new AtomicBoolean();

    /* renamed from: Z  reason: collision with root package name */
    public final AtomicBoolean f47294Z = new AtomicBoolean();

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f47295h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public boolean f47296i0 = false;

    public final void a(q qVar) {
        synchronized (f47292j0) {
            this.f47295h0.add(qVar);
        }
    }

    public final void b(boolean z10) {
        synchronized (f47292j0) {
            try {
                Iterator it = this.f47295h0.iterator();
                while (it.hasNext()) {
                    H7.d dVar = ((q) it.next()).f47326a.f47313r0;
                    dVar.sendMessage(dVar.obtainMessage(1, Boolean.valueOf(z10)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f47294Z;
        boolean compareAndSet = this.f47293Y.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f47294Z;
        boolean compareAndSet = this.f47293Y.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f47293Y.compareAndSet(false, true)) {
            this.f47294Z.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
