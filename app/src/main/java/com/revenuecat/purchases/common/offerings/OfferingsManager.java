package com.revenuecat.purchases.common.offerings;

import H0.RunnableC0712x;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import wf.AbstractC6216a;
import wf.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0004\b-\u0010.JG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\b\u001a\u0010\u001bJM\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006/"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsManager;", "", "Lorg/json/JSONObject;", "offeringsJSON", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Ljf/y;", "onError", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createAndCacheOfferings", "(Lorg/json/JSONObject;Lwf/k;Lwf/k;)V", "error", "handleErrorFetchingOfferings", "(Lcom/revenuecat/purchases/PurchasesError;Lwf/k;)V", "Lkotlin/Function0;", "action", "dispatch", "(Lwf/a;)V", "", "appUserID", "", "appInBackground", "fetchCurrent", "getOfferings", "(Ljava/lang/String;ZLwf/k;Lwf/k;Z)V", "onAppForeground", "(Ljava/lang/String;)V", "fetchAndCacheOfferings", "(Ljava/lang/String;ZLwf/k;Lwf/k;)V", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "offeringsFactory", "Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "offeringImagePreDownloader", "Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "<init>", "(Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;Landroid/os/Handler;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class OfferingsManager {
    private final Backend backend;
    private final Handler mainHandler;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler) {
        AbstractC3557B.c0("offeringsCache", offeringsCache);
        AbstractC3557B.c0("backend", backend);
        AbstractC3557B.c0("offeringsFactory", offeringsFactory);
        AbstractC3557B.c0("offeringImagePreDownloader", offeringImagePreDownloader);
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.mainHandler = handler;
    }

    public final void createAndCacheOfferings(JSONObject jSONObject, k kVar, k kVar2) {
        this.offeringsFactory.createOfferings(jSONObject, new OfferingsManager$createAndCacheOfferings$1(this, kVar), new OfferingsManager$createAndCacheOfferings$2(this, jSONObject, kVar2));
    }

    public static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        if ((i10 & 4) != 0) {
            kVar2 = null;
        }
        offeringsManager.createAndCacheOfferings(jSONObject, kVar, kVar2);
    }

    public final void dispatch(AbstractC6216a abstractC6216a) {
        if (!AbstractC3557B.K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            Handler handler = this.mainHandler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0712x(abstractC6216a, 5));
            return;
        }
        abstractC6216a.mo122invoke();
    }

    public static final void dispatch$lambda$0(AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("$tmp0", abstractC6216a);
        abstractC6216a.mo122invoke();
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, k kVar, k kVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            kVar = null;
        }
        if ((i10 & 8) != 0) {
            kVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z10, kVar, kVar2);
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z10, k kVar, k kVar2, boolean z11, int i10, Object obj) {
        k kVar3;
        k kVar4;
        if ((i10 & 4) != 0) {
            kVar3 = null;
        } else {
            kVar3 = kVar;
        }
        if ((i10 & 8) != 0) {
            kVar4 = null;
        } else {
            kVar4 = kVar2;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        offeringsManager.getOfferings(str, z10, kVar3, kVar4, z11);
    }

    public final void handleErrorFetchingOfferings(PurchasesError purchasesError, k kVar) {
        LogIntent logIntent;
        if (R4.b.X1(PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError).contains(purchasesError.getCode())) {
            logIntent = LogIntent.RC_ERROR;
        } else {
            logIntent = LogIntent.GOOGLE_ERROR;
        }
        AbstractC2469q0.t(new Object[]{purchasesError}, 1, OfferingStrings.FETCHING_OFFERINGS_ERROR, logIntent);
        this.offeringsCache.clearOfferingsCacheTimestamp();
        dispatch(new OfferingsManager$handleErrorFetchingOfferings$1(kVar, purchasesError));
    }

    public final void fetchAndCacheOfferings(String str, boolean z10, k kVar, k kVar2) {
        AbstractC3557B.c0("appUserID", str);
        LogWrapperKt.log(LogIntent.RC_SUCCESS, OfferingStrings.OFFERINGS_START_UPDATE_FROM_NETWORK);
        this.backend.getOfferings(str, z10, new OfferingsManager$fetchAndCacheOfferings$1(this, kVar, kVar2), new OfferingsManager$fetchAndCacheOfferings$2(this, kVar, kVar2));
    }

    public final void getOfferings(String str, boolean z10, k kVar, k kVar2, boolean z11) {
        String str2;
        AbstractC3557B.c0("appUserID", str);
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(str, z10, kVar, kVar2);
        } else if (z11) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK);
            fetchAndCacheOfferings(str, z10, kVar, kVar2);
        } else {
            LogIntent logIntent = LogIntent.DEBUG;
            LogWrapperKt.log(logIntent, OfferingStrings.VENDING_OFFERINGS_CACHE);
            dispatch(new OfferingsManager$getOfferings$1(kVar2, cachedOfferings));
            if (this.offeringsCache.isOfferingsCacheStale(z10)) {
                if (z10) {
                    str2 = OfferingStrings.OFFERINGS_STALE_UPDATING_IN_BACKGROUND;
                } else {
                    str2 = OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND;
                }
                LogWrapperKt.log(logIntent, str2);
                fetchAndCacheOfferings$default(this, str, z10, null, null, 12, null);
            }
        }
    }

    public final void onAppForeground(String str) {
        AbstractC3557B.c0("appUserID", str);
        if (this.offeringsCache.isOfferingsCacheStale(false)) {
            LogWrapperKt.log(LogIntent.DEBUG, OfferingStrings.OFFERINGS_STALE_UPDATING_IN_FOREGROUND);
            fetchAndCacheOfferings$default(this, str, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, Handler handler, int i10, g gVar) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, (i10 & 16) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
