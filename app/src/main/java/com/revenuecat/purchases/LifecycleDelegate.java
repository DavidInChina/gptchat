package com.revenuecat.purchases;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0004\u00a8\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/LifecycleDelegate;", "", "Ljf/y;", "onAppBackgrounded", "()V", "onAppForegrounded", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface LifecycleDelegate {
    void onAppBackgrounded();

    void onAppForegrounded();
}