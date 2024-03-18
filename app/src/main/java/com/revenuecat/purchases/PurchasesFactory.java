package com.revenuecat.purchases;

import Lg.n;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.common.Anonymizer;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.FileHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsAnonymizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsFileHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.common.offlineentitlements.OfflineCustomerInfoCalculator;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.paywalls.events.PaywallEventsManager;
import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.CoilImageDownloader;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import id.AbstractC3557B;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u0011\u0012\b\b\u0002\u0010+\u001a\u00020*\u00a2\u0006\u0004\b-\u0010.J1\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0017JQ\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u0012\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007\u00a2\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u00060"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory;", "", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "eventsDispatcher", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "createPaywallEventsManager", "(Landroid/content/Context;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Backend;)Lcom/revenuecat/purchases/paywalls/events/PaywallEventsManager;", "Landroid/app/Application;", "getApplication", "(Landroid/content/Context;)Landroid/app/Application;", "", "permission", "", "hasPermission", "(Landroid/content/Context;Ljava/lang/String;)Z", "Ljava/util/concurrent/ExecutorService;", "createDefaultExecutor", "()Ljava/util/concurrent/ExecutorService;", "createEventsExecutor", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/common/PlatformInfo;", "platformInfo", "Ljava/net/URL;", "proxyURL", "Lcom/revenuecat/purchases/common/BillingAbstract;", "overrideBillingAbstract", "forceServerErrors", "forceSigningError", "runningIntegrationTests", "Lcom/revenuecat/purchases/Purchases;", "createPurchases", "(Lcom/revenuecat/purchases/PurchasesConfiguration;Lcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/common/BillingAbstract;ZZZ)Lcom/revenuecat/purchases/Purchases;", "Ljf/y;", "validateConfiguration", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)V", "Lcom/revenuecat/purchases/APIKeyValidator;", "apiKeyValidator", "Lcom/revenuecat/purchases/APIKeyValidator;", "<init>", "(Lcom/revenuecat/purchases/APIKeyValidator;)V", "LowPriorityThreadFactory", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PurchasesFactory {
    private final APIKeyValidator apiKeyValidator;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesFactory$LowPriorityThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "threadName", "", "(Ljava/lang/String;)V", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class LowPriorityThreadFactory implements ThreadFactory {
        private final String threadName;

        public LowPriorityThreadFactory(String str) {
            AbstractC3557B.c0("threadName", str);
            this.threadName = str;
        }

        public static final void newThread$lambda$1(Runnable runnable) {
            if (runnable != null) {
                Process.setThreadPriority(19);
                runnable.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new a(3, runnable), this.threadName);
        }
    }

    public PurchasesFactory() {
        this(null, 1, null);
    }

    private final ExecutorService createDefaultExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        AbstractC3557B.b0("newSingleThreadScheduledExecutor()", newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    private final ExecutorService createEventsExecutor() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new LowPriorityThreadFactory("revenuecat-events-thread"));
        AbstractC3557B.b0("newSingleThreadScheduled\u2026venuecat-events-thread\"))", newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    private final PaywallEventsManager createPaywallEventsManager(Context context, IdentityManager identityManager, Dispatcher dispatcher, Backend backend) {
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            return new PaywallEventsManager(new EventsFileHelper(new FileHelper(context), PaywallEventsManager.PAYWALL_EVENTS_FILE_PATH, new PurchasesFactory$createPaywallEventsManager$1(PaywallStoredEvent.Companion)), identityManager, dispatcher, backend);
        }
        LogUtilsKt.debugLog("Paywall events are only supported on Android N or newer.");
        return null;
    }

    public static /* synthetic */ Purchases createPurchases$default(PurchasesFactory purchasesFactory, PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        BillingAbstract billingAbstract2;
        boolean z13;
        boolean z14;
        boolean z15;
        if ((i10 & 8) != 0) {
            billingAbstract2 = null;
        } else {
            billingAbstract2 = billingAbstract;
        }
        if ((i10 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z10;
        }
        if ((i10 & 32) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & 64) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        return purchasesFactory.createPurchases(purchasesConfiguration, platformInfo, url, billingAbstract2, z13, z14, z15);
    }

    private final Application getApplication(Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC3557B.a0("null cannot be cast to non-null type android.app.Application", applicationContext);
        return (Application) applicationContext;
    }

    private final boolean hasPermission(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public final Purchases createPurchases(PurchasesConfiguration purchasesConfiguration, PlatformInfo platformInfo, URL url, BillingAbstract billingAbstract, boolean z10, boolean z11, boolean z12) {
        DiagnosticsTracker diagnosticsTracker;
        DiagnosticsFileHelper diagnosticsFileHelper;
        BillingAbstract billingAbstract2;
        DiagnosticsSynchronizer diagnosticsSynchronizer;
        AbstractC3557B.c0("configuration", purchasesConfiguration);
        AbstractC3557B.c0("platformInfo", platformInfo);
        validateConfiguration(purchasesConfiguration);
        Application application = getApplication(purchasesConfiguration.getContext());
        AppConfig appConfig = new AppConfig(purchasesConfiguration.getContext(), purchasesConfiguration.getObserverMode(), purchasesConfiguration.getShowInAppMessagesAutomatically(), platformInfo, url, purchasesConfiguration.getStore(), purchasesConfiguration.getDangerousSettings(), z12, z10, z11);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(application);
        ETagManager eTagManager = new ETagManager(purchasesConfiguration.getContext(), null, null, 6, null);
        Dispatcher dispatcher = new Dispatcher(createDefaultExecutor(), null, z12, 2, null);
        ExecutorService service = purchasesConfiguration.getService();
        if (service == null) {
            service = createDefaultExecutor();
        }
        Dispatcher dispatcher2 = new Dispatcher(service, null, z12, 2, null);
        Dispatcher dispatcher3 = new Dispatcher(createEventsExecutor(), null, z12, 2, null);
        if (purchasesConfiguration.getDiagnosticsEnabled() && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsFileHelper diagnosticsFileHelper2 = new DiagnosticsFileHelper(new FileHelper(purchasesConfiguration.getContext()));
            diagnosticsFileHelper = diagnosticsFileHelper2;
            diagnosticsTracker = new DiagnosticsTracker(appConfig, diagnosticsFileHelper2, new DiagnosticsAnonymizer(new Anonymizer()), dispatcher3);
        } else {
            if (purchasesConfiguration.getDiagnosticsEnabled()) {
                LogUtilsKt.warnLog("Diagnostics are only supported on Android N or newer.");
            }
            diagnosticsFileHelper = null;
            diagnosticsTracker = null;
        }
        SigningManager signingManager = new SigningManager(SignatureVerificationMode.Companion.fromEntitlementVerificationMode$default(SignatureVerificationMode.Companion, purchasesConfiguration.getVerificationMode(), null, 2, null), appConfig, purchasesConfiguration.getApiKey());
        AbstractC3557B.b0("prefs", defaultSharedPreferences);
        DeviceCache deviceCache = new DeviceCache(defaultSharedPreferences, purchasesConfiguration.getApiKey(), null, 4, null);
        HTTPClient hTTPClient = new HTTPClient(appConfig, eTagManager, diagnosticsTracker, signingManager, deviceCache, null, null, 96, null);
        BackendHelper backendHelper = new BackendHelper(purchasesConfiguration.getApiKey(), dispatcher2, appConfig, hTTPClient);
        Backend backend = new Backend(appConfig, dispatcher2, dispatcher3, hTTPClient, backendHelper);
        PurchasesStateCache purchasesStateCache = new PurchasesStateCache(new PurchasesState(null, null, null, false, false, 31, null));
        if (billingAbstract == null) {
            billingAbstract2 = BillingFactory.INSTANCE.createBilling(purchasesConfiguration.getStore(), application, backendHelper, deviceCache, purchasesConfiguration.getObserverMode(), diagnosticsTracker, purchasesStateCache);
        } else {
            billingAbstract2 = billingAbstract;
        }
        SubscriberAttributesPoster subscriberAttributesPoster = new SubscriberAttributesPoster(backendHelper);
        DeviceIdentifiersFetcher createAttributionFetcher = AttributionFetcherFactory.INSTANCE.createAttributionFetcher(purchasesConfiguration.getStore(), dispatcher2);
        SubscriberAttributesCache subscriberAttributesCache = new SubscriberAttributesCache(deviceCache);
        SubscriberAttributesManager subscriberAttributesManager = new SubscriberAttributesManager(subscriberAttributesCache, subscriberAttributesPoster, createAttributionFetcher);
        OfflineEntitlementsManager offlineEntitlementsManager = new OfflineEntitlementsManager(backend, new OfflineCustomerInfoCalculator(new PurchasedProductsFetcher(deviceCache, billingAbstract2, null, 4, null), appConfig, null, 4, null), deviceCache, appConfig);
        OfferingsCache offeringsCache = new OfferingsCache(deviceCache, null, null, 6, null);
        IdentityManager identityManager = new IdentityManager(deviceCache, subscriberAttributesCache, subscriberAttributesManager, offeringsCache, backend, offlineEntitlementsManager);
        CustomerInfoUpdateHandler customerInfoUpdateHandler = new CustomerInfoUpdateHandler(deviceCache, identityManager, offlineEntitlementsManager, appConfig, null, 16, null);
        PaywallPresentedCache paywallPresentedCache = new PaywallPresentedCache();
        BillingAbstract billingAbstract3 = billingAbstract2;
        PostReceiptHelper postReceiptHelper = new PostReceiptHelper(appConfig, backend, billingAbstract3, customerInfoUpdateHandler, deviceCache, subscriberAttributesManager, offlineEntitlementsManager, paywallPresentedCache);
        PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper = new PostTransactionWithProductDetailsHelper(billingAbstract2, postReceiptHelper);
        PostPendingTransactionsHelper postPendingTransactionsHelper = new PostPendingTransactionsHelper(appConfig, deviceCache, billingAbstract3, dispatcher2, identityManager, postTransactionWithProductDetailsHelper);
        CustomerInfoHelper customerInfoHelper = new CustomerInfoHelper(deviceCache, backend, offlineEntitlementsManager, customerInfoUpdateHandler, postPendingTransactionsHelper, null, 32, null);
        OfferingParser createOfferingParser = OfferingParserFactory.INSTANCE.createOfferingParser(purchasesConfiguration.getStore());
        if (diagnosticsFileHelper != null && diagnosticsTracker != null && AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            diagnosticsSynchronizer = new DiagnosticsSynchronizer(purchasesConfiguration.getContext(), diagnosticsFileHelper, diagnosticsTracker, backend, dispatcher3, null, 32, null);
        } else {
            diagnosticsSynchronizer = null;
        }
        SyncPurchasesHelper syncPurchasesHelper = new SyncPurchasesHelper(billingAbstract2, identityManager, customerInfoHelper, postReceiptHelper);
        OfferingsManager offeringsManager = new OfferingsManager(offeringsCache, backend, new OfferingsFactory(billingAbstract2, createOfferingParser, dispatcher), new OfferingImagePreDownloader(false, new CoilImageDownloader(application), 1, null), null, 16, null);
        LogIntent logIntent = LogIntent.DEBUG;
        LogWrapperKt.log(logIntent, ConfigureStrings.DEBUG_ENABLED);
        LogWrapperKt.log(logIntent, String.format(ConfigureStrings.SDK_VERSION, Arrays.copyOf(new Object[]{Purchases.Companion.getFrameworkVersion()}, 1)));
        AbstractC2469q0.t(new Object[]{appConfig.getPackageName()}, 1, ConfigureStrings.PACKAGE_NAME, logIntent);
        LogWrapperKt.log(LogIntent.USER, String.format(ConfigureStrings.INITIAL_APP_USER_ID, Arrays.copyOf(new Object[]{purchasesConfiguration.getAppUserID()}, 1)));
        LogWrapperKt.log(logIntent, String.format(ConfigureStrings.VERIFICATION_MODE_SELECTED, Arrays.copyOf(new Object[]{purchasesConfiguration.getVerificationMode().name()}, 1)));
        return new Purchases(new PurchasesOrchestrator(application, purchasesConfiguration.getAppUserID(), backend, billingAbstract2, deviceCache, identityManager, subscriberAttributesManager, appConfig, customerInfoHelper, customerInfoUpdateHandler, diagnosticsSynchronizer, offlineEntitlementsManager, postReceiptHelper, postTransactionWithProductDetailsHelper, postPendingTransactionsHelper, syncPurchasesHelper, offeringsManager, createPaywallEventsManager(application, identityManager, dispatcher3, backend), paywallPresentedCache, purchasesStateCache, null, 1048576, null));
    }

    public final void validateConfiguration(PurchasesConfiguration purchasesConfiguration) {
        AbstractC3557B.c0("configuration", purchasesConfiguration);
        if (hasPermission(purchasesConfiguration.getContext(), "android.permission.INTERNET")) {
            if (!n.n2(purchasesConfiguration.getApiKey())) {
                if (purchasesConfiguration.getContext().getApplicationContext() instanceof Application) {
                    this.apiKeyValidator.validateAndLog(purchasesConfiguration.getApiKey(), purchasesConfiguration.getStore());
                    return;
                }
                throw new IllegalArgumentException("Needs an application context.".toString());
            }
            throw new IllegalArgumentException("API key must be set. Get this from the RevenueCat web app".toString());
        }
        throw new IllegalArgumentException("Purchases requires INTERNET permission.".toString());
    }

    public PurchasesFactory(APIKeyValidator aPIKeyValidator) {
        AbstractC3557B.c0("apiKeyValidator", aPIKeyValidator);
        this.apiKeyValidator = aPIKeyValidator;
    }

    public /* synthetic */ PurchasesFactory(APIKeyValidator aPIKeyValidator, int i10, g gVar) {
        this((i10 & 1) != 0 ? new APIKeyValidator() : aPIKeyValidator);
    }
}
