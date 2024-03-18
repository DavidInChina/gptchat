package com.revenuecat.purchases.utils;

import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/DefaultTimestampProvider;", "Lcom/revenuecat/purchases/utils/TimestampProvider;", "()V", "currentTimeMillis", "", "getCurrentTimeMillis", "()J", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class DefaultTimestampProvider implements TimestampProvider {
    @Override // com.revenuecat.purchases.utils.TimestampProvider
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}