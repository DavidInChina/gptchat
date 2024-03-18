package com.statsig.androidsdk;

import android.app.Activity;
import android.app.Application;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Bundle;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010#\u00a8\u0006)"}, d2 = {"Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "", "isApplicationVisible", "()Z", "isApplicationInForeground", "Ljf/y;", "shutdown", "()V", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "Landroid/app/Application;", "Lcom/statsig/androidsdk/LifecycleEventListener;", "listener", "Lcom/statsig/androidsdk/LifecycleEventListener;", "currentActivity", "Landroid/app/Activity;", "", "resumed", TokenNames.f24313I, "paused", "started", "stopped", "<init>", "(Landroid/app/Application;Lcom/statsig/androidsdk/LifecycleEventListener;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class StatsigActivityLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final Application application;
    private Activity currentActivity;
    private final LifecycleEventListener listener;
    private int paused;
    private int resumed;
    private int started;
    private int stopped;

    public StatsigActivityLifecycleListener(Application application, LifecycleEventListener lifecycleEventListener) {
        AbstractC3557B.c0(SIPServerTransaction.CONTENT_TYPE_APPLICATION, application);
        AbstractC3557B.c0("listener", lifecycleEventListener);
        this.application = application;
        this.listener = lifecycleEventListener;
        application.registerActivityLifecycleCallbacks(this);
    }

    private final boolean isApplicationInForeground() {
        if (this.resumed > this.paused) {
            return true;
        }
        return false;
    }

    private final boolean isApplicationVisible() {
        if (this.started > this.stopped) {
            return true;
        }
        return false;
    }

    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.currentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.paused++;
        if (!isApplicationInForeground()) {
            this.listener.onAppBlur();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.currentActivity = activity;
        this.resumed++;
        this.listener.onAppFocus();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("outState", bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.started++;
        this.currentActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        this.stopped++;
        this.currentActivity = null;
        if (!isApplicationVisible()) {
            this.listener.onAppBlur();
        }
    }

    public final void shutdown() {
        this.application.unregisterActivityLifecycleCallbacks(this);
    }
}
