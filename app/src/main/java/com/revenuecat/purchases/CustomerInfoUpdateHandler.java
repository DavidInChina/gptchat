package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\b+\u0010,J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R.\u0010$\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0006R\u0018\u0010)\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010*\u00a8\u0006-"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "listener", "Ljf/y;", "afterSetListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "", "appUserID", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function0;", "action", "dispatch", "(Lwf/a;)V", "customerInfo", "cacheAndNotifyListeners", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "notifyListeners", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "value", "updatedCustomerInfoListener", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "lastSentCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/AppConfig;Landroid/os/Handler;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class CustomerInfoUpdateHandler {
    private final AppConfig appConfig;
    private final DeviceCache deviceCache;
    private final Handler handler;
    private final IdentityManager identityManager;
    private CustomerInfo lastSentCustomerInfo;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private UpdatedCustomerInfoListener updatedCustomerInfoListener;

    public CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, Handler handler) {
        AbstractC3557B.c0("deviceCache", deviceCache);
        AbstractC3557B.c0("identityManager", identityManager);
        AbstractC3557B.c0("offlineEntitlementsManager", offlineEntitlementsManager);
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("handler", handler);
        this.deviceCache = deviceCache;
        this.identityManager = identityManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
        this.appConfig = appConfig;
        this.handler = handler;
    }

    private final void afterSetListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        CustomerInfo cachedCustomerInfo;
        if (updatedCustomerInfoListener != null) {
            LogWrapperKt.log(LogIntent.DEBUG, ConfigureStrings.LISTENER_SET);
            if (!this.appConfig.getCustomEntitlementComputation() && (cachedCustomerInfo = getCachedCustomerInfo(this.identityManager.getCurrentAppUserID())) != null) {
                notifyListeners(cachedCustomerInfo);
            }
        }
    }

    private final void dispatch(AbstractC6216a abstractC6216a) {
        if (!AbstractC3557B.K(Thread.currentThread(), this.handler.getLooper().getThread())) {
            this.handler.post(new a(1, abstractC6216a));
        } else {
            abstractC6216a.mo122invoke();
        }
    }

    public static final void dispatch$lambda$5(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("$tmp0", abstractC6216a);
        abstractC6216a.mo122invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        if (offlineCustomerInfo == null) {
            return this.deviceCache.getCachedCustomerInfo(str);
        }
        return offlineCustomerInfo;
    }

    public final void cacheAndNotifyListeners(CustomerInfo customerInfo) {
        AbstractC3557B.c0("customerInfo", customerInfo);
        this.deviceCache.cacheCustomerInfo(this.identityManager.getCurrentAppUserID(), customerInfo);
        notifyListeners(customerInfo);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.updatedCustomerInfoListener;
    }

    public final void notifyListeners(CustomerInfo customerInfo) {
        UpdatedCustomerInfoListener updatedCustomerInfoListener;
        CustomerInfo customerInfo2;
        AbstractC3557B.c0("customerInfo", customerInfo);
        synchronized (this) {
            updatedCustomerInfoListener = this.updatedCustomerInfoListener;
            customerInfo2 = this.lastSentCustomerInfo;
        }
        UpdatedCustomerInfoListener updatedCustomerInfoListener2 = updatedCustomerInfoListener;
        if (updatedCustomerInfoListener2 != null && !AbstractC3557B.K(customerInfo2, customerInfo)) {
            if (customerInfo2 != null) {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.CUSTOMERINFO_UPDATED_NOTIFYING_LISTENER);
            } else {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.SENDING_LATEST_CUSTOMERINFO_TO_LISTENER);
            }
            synchronized (this) {
                this.lastSentCustomerInfo = customerInfo;
            }
            dispatch(new CustomerInfoUpdateHandler$notifyListeners$2$2(updatedCustomerInfoListener2, customerInfo));
        }
    }

    public final void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        synchronized (this) {
            this.updatedCustomerInfoListener = updatedCustomerInfoListener;
        }
        afterSetListener(updatedCustomerInfoListener);
    }

    public /* synthetic */ CustomerInfoUpdateHandler(DeviceCache deviceCache, IdentityManager identityManager, OfflineEntitlementsManager offlineEntitlementsManager, AppConfig appConfig, Handler handler, int i10, g gVar) {
        this(deviceCache, identityManager, offlineEntitlementsManager, appConfig, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
