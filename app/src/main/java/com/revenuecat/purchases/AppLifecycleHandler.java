package com.revenuecat.purchases;

import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/AppLifecycleHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/v;", "owner", "Ljf/y;", "onStart", "(Landroidx/lifecycle/v;)V", "onStop", "onCreate", "onResume", "onPause", "onDestroy", "Lcom/revenuecat/purchases/LifecycleDelegate;", "lifecycleDelegate", "Lcom/revenuecat/purchases/LifecycleDelegate;", "<init>", "(Lcom/revenuecat/purchases/LifecycleDelegate;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class AppLifecycleHandler implements DefaultLifecycleObserver {
    private final LifecycleDelegate lifecycleDelegate;

    public AppLifecycleHandler(LifecycleDelegate lifecycleDelegate) {
        AbstractC3557B.c0("lifecycleDelegate", lifecycleDelegate);
        this.lifecycleDelegate = lifecycleDelegate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
        this.lifecycleDelegate.onAppForegrounded();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(AbstractC2086v abstractC2086v) {
        AbstractC3557B.c0("owner", abstractC2086v);
        this.lifecycleDelegate.onAppBackgrounded();
    }
}
