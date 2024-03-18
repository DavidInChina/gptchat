package com.revenuecat.purchases;

import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import id.AbstractC3557B;
import java.net.URL;
import java.util.List;
import kf.v;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 62\u00020\u0001:\u00016B\u0011\b\u0000\u0012\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\b4\u00105J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007H\u0007\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u001f\u00a2\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b\u00a2\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R(\u00103\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u00067"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "listener", "Ljf/y;", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V", "", "", "productIds", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "callback", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "close", "()V", "removeUpdatedCustomerInfoListener", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "switchUser", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "purchasesOrchestrator", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getPurchasesOrchestrator$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getAppUserID", "()Ljava/lang/String;", "appUserID", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "value", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "<init>", "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class Purchases {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private final PurchasesOrchestrator purchasesOrchestrator;
    public static final Companion Companion = new Companion(null);
    private static final String frameworkVersion = "7.7.0";

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\bC\u0010\u001aJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c8F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b!\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010)\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020#8F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b(\u0010\u001a\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010*\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00103\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078F@AX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b2\u0010\u001a\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R \u00104\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u0010\u001a\u001a\u0004\b6\u00107R.\u0010?\u001a\u0004\u0018\u0001092\b\u0010\u0014\u001a\u0004\u0018\u0001098F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b>\u0010\u001a\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u000e8FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\bB\u0010\u001a\u001a\u0004\b@\u0010A\u00a8\u0006D"}, d2 = {"Lcom/revenuecat/purchases/Purchases$Companion;", "", "Landroid/content/Context;", "context", "", "apiKey", "appUserID", "Lcom/revenuecat/purchases/Purchases;", "configureInCustomEntitlementsComputationMode", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/Purchases;", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Ljf/y;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "value", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "getPlatformInfo$annotations", "()V", "platformInfo", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "getLogLevel$annotations", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "getLogHandler$annotations", "logHandler", "backingFieldSharedInstance", "Lcom/revenuecat/purchases/Purchases;", "getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Purchases;", "setBackingFieldSharedInstance$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/Purchases;)V", "getSharedInstance", "setSharedInstance$purchases_customEntitlementComputationRelease", "getSharedInstance$annotations", "sharedInstance", "frameworkVersion", "Ljava/lang/String;", "getFrameworkVersion", "()Ljava/lang/String;", "getFrameworkVersion$annotations", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "getProxyURL$annotations", "proxyURL", "isConfigured", "()Z", "isConfigured$annotations", "<init>", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                list = v.f37483Y;
            }
            companion.canMakePayments(context, list, callback);
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("callback", callback);
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        public final Purchases configureInCustomEntitlementsComputationMode(Context context, String str, String str2) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("apiKey", str);
            AbstractC3557B.c0("appUserID", str2);
            if (isConfigured()) {
                LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS);
            }
            Purchases createPurchases$default = PurchasesFactory.createPurchases$default(new PurchasesFactory(null, 1, null), new PurchasesConfiguration.Builder(context, str).appUserID(str2).dangerousSettings(new DangerousSettings(false, true, 1, null)).build(), getPlatformInfo(), getProxyURL(), null, false, false, false, 120, null);
            Purchases.Companion.setSharedInstance$purchases_customEntitlementComputationRelease(createPurchases$default);
            return createPurchases$default;
        }

        public final Purchases getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease() {
            return Purchases.backingFieldSharedInstance;
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.Companion.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.Companion.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.Companion.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.Companion.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_customEntitlementComputationRelease = getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease();
            if (backingFieldSharedInstance$purchases_customEntitlementComputationRelease != null) {
                return backingFieldSharedInstance$purchases_customEntitlementComputationRelease;
            }
            throw new RuntimeException(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            if (getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease() != null) {
                return true;
            }
            return false;
        }

        public final void setBackingFieldSharedInstance$purchases_customEntitlementComputationRelease(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            AbstractC3557B.c0("value", logHandler);
            PurchasesOrchestrator.Companion.setLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            AbstractC3557B.c0("value", logLevel);
            PurchasesOrchestrator.Companion.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            AbstractC3557B.c0("value", platformInfo);
            PurchasesOrchestrator.Companion.setPlatformInfo(platformInfo);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.Companion.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_customEntitlementComputationRelease(Purchases purchases) {
            AbstractC3557B.c0("value", purchases);
            Purchases backingFieldSharedInstance$purchases_customEntitlementComputationRelease = getBackingFieldSharedInstance$purchases_customEntitlementComputationRelease();
            if (backingFieldSharedInstance$purchases_customEntitlementComputationRelease != null) {
                backingFieldSharedInstance$purchases_customEntitlementComputationRelease.close();
            }
            setBackingFieldSharedInstance$purchases_customEntitlementComputationRelease(purchases);
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("features", list);
            AbstractC3557B.c0("callback", callback);
            if (getSharedInstance().getPurchasesOrchestrator$purchases_customEntitlementComputationRelease().getAppConfig().getStore() != Store.PLAY_STORE) {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
                return;
            }
            PurchasesOrchestrator.Companion.canMakePayments(context, list, callback);
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator) {
        AbstractC3557B.c0("purchasesOrchestrator", purchasesOrchestrator);
        this.purchasesOrchestrator = purchasesOrchestrator;
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        Companion.canMakePayments(context, callback);
    }

    public static final Purchases configureInCustomEntitlementsComputationMode(Context context, String str, String str2) {
        return Companion.configureInCustomEntitlementsComputationMode(context, str, str2);
    }

    public static final String getFrameworkVersion() {
        return Companion.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        LogHandler logHandler;
        synchronized (Purchases.class) {
            logHandler = Companion.getLogHandler();
        }
        return logHandler;
    }

    public static final LogLevel getLogLevel() {
        return Companion.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return Companion.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return Companion.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return Companion.getSharedInstance();
    }

    public static final boolean isConfigured() {
        return Companion.isConfigured();
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        synchronized (Purchases.class) {
            Companion.setLogHandler(logHandler);
        }
    }

    public static final void setLogLevel(LogLevel logLevel) {
        Companion.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        Companion.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        Companion.setProxyURL(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = AbstractC4344b.F0(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final void getOfferings(ReceiveOfferingsCallback receiveOfferingsCallback) {
        AbstractC3557B.c0("listener", receiveOfferingsCallback);
        PurchasesOrchestrator.getOfferings$default(this.purchasesOrchestrator, receiveOfferingsCallback, false, 2, null);
    }

    public final void getProducts(List<String> list, GetStoreProductsCallback getStoreProductsCallback) {
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("callback", getStoreProductsCallback);
        getProducts(list, null, getStoreProductsCallback);
    }

    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator$purchases_customEntitlementComputationRelease() {
        return this.purchasesOrchestrator;
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback purchaseCallback) {
        AbstractC3557B.c0("purchaseParams", purchaseParams);
        AbstractC3557B.c0("callback", purchaseCallback);
        this.purchasesOrchestrator.purchase(purchaseParams, purchaseCallback);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        AbstractC3557B.c0("callback", receiveCustomerInfoCallback);
        this.purchasesOrchestrator.restorePurchases(receiveCustomerInfoCallback);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        AbstractC3557B.c0("activity", activity);
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    public final void switchUser(String str) {
        AbstractC3557B.c0("newAppUserID", str);
        this.purchasesOrchestrator.switchUser(str);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        Companion.canMakePayments(context, list, callback);
    }

    public final void getProducts(List<String> list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback) {
        AbstractC3557B.c0("productIds", list);
        AbstractC3557B.c0("callback", getStoreProductsCallback);
        this.purchasesOrchestrator.getProducts(list, productType, getStoreProductsCallback);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        AbstractC3557B.c0("activity", activity);
        AbstractC3557B.c0("inAppMessageTypes", list);
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, list);
    }
}
