package com.revenuecat.purchases.common.caching;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/caching/InMemoryCachedObject;", TokenNames.T, "", "Ljf/y;", "clearCacheTimestamp", "()V", "clearCache", "instance", "cacheInstance", "(Ljava/lang/Object;)V", "Ljava/util/Date;", "date", "updateCacheTimestamp", "(Ljava/util/Date;)V", "lastUpdatedAt", "Ljava/util/Date;", "getLastUpdatedAt$purchases_customEntitlementComputationRelease", "()Ljava/util/Date;", "setLastUpdatedAt$purchases_customEntitlementComputationRelease", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "cachedInstance", "Ljava/lang/Object;", "getCachedInstance", "()Ljava/lang/Object;", "setCachedInstance", "<init>", "(Ljava/util/Date;Lcom/revenuecat/purchases/common/DateProvider;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class InMemoryCachedObject<T> {
    private T cachedInstance;
    private final DateProvider dateProvider;
    private Date lastUpdatedAt;

    public InMemoryCachedObject() {
        this(null, null, 3, null);
    }

    public final void cacheInstance(T t10) {
        this.cachedInstance = t10;
        this.lastUpdatedAt = this.dateProvider.getNow();
    }

    public final void clearCache() {
        clearCacheTimestamp();
        this.cachedInstance = null;
    }

    public final void clearCacheTimestamp() {
        this.lastUpdatedAt = null;
    }

    public final T getCachedInstance() {
        return this.cachedInstance;
    }

    public final Date getLastUpdatedAt$purchases_customEntitlementComputationRelease() {
        return this.lastUpdatedAt;
    }

    public final void setCachedInstance(T t10) {
        this.cachedInstance = t10;
    }

    public final void setLastUpdatedAt$purchases_customEntitlementComputationRelease(Date date) {
        this.lastUpdatedAt = date;
    }

    public final void updateCacheTimestamp(Date date) {
        AbstractC3557B.c0("date", date);
        this.lastUpdatedAt = date;
    }

    public InMemoryCachedObject(Date date, DateProvider dateProvider) {
        AbstractC3557B.c0("dateProvider", dateProvider);
        this.lastUpdatedAt = date;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ InMemoryCachedObject(Date date, DateProvider dateProvider, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : date, (i10 & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
