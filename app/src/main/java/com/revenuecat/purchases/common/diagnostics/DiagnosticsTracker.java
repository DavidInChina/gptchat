package com.revenuecat.purchases.common.diagnostics;

import Mg.b;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.utils.AndroidVersionUtilsKt;
import com.revenuecat.purchases.utils.EventsFileHelper;
import id.AbstractC3557B;
import java.io.IOException;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import u5.RunnableC5841a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 62\u00020\u0001:\u00016B-\u0012\u0006\u0010)\u001a\u00020(\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0+\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00102\u001a\u000201\u00a2\u0006\u0004\b4\u00105JE\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0019\u0010\u0017J3\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0000\u00a2\u0006\u0004\b&\u0010%R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "LMg/b;", "responseTime", "", "wasSuccessful", "", "responseCode", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "resultOrigin", "Lcom/revenuecat/purchases/VerificationResult;", "verificationResult", "Ljf/y;", "trackHttpRequestPerformed-NcHsxvU", "(Lcom/revenuecat/purchases/common/networking/Endpoint;JZILcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Lcom/revenuecat/purchases/VerificationResult;)V", "trackHttpRequestPerformed", "", "productType", "billingResponseCode", "billingDebugMessage", "trackGoogleQueryProductDetailsRequest-Wn2Vu4Y", "(Ljava/lang/String;ILjava/lang/String;J)V", "trackGoogleQueryProductDetailsRequest", "trackGoogleQueryPurchasesRequest-Wn2Vu4Y", "trackGoogleQueryPurchasesRequest", "trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y", "trackGoogleQueryPurchaseHistoryRequest", "useCurrentThread", "trackMaxEventsStoredLimitReached", "(Z)V", "trackProductDetailsNotSupported", "(ILjava/lang/String;)V", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "diagnosticsEntry", "trackEvent", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;)V", "trackEventInCurrentThread$purchases_customEntitlementComputationRelease", "trackEventInCurrentThread", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "diagnosticsFileHelper", "Lcom/revenuecat/purchases/utils/EventsFileHelper;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;", "diagnosticsAnonymizer", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;", "Lcom/revenuecat/purchases/common/Dispatcher;", "diagnosticsDispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/utils/EventsFileHelper;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsAnonymizer;Lcom/revenuecat/purchases/common/Dispatcher;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DiagnosticsTracker {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String ENDPOINT_NAME_KEY = "endpoint_name";
    @Deprecated
    public static final String ETAG_HIT_KEY = "etag_hit";
    @Deprecated
    public static final String PRODUCT_TYPE_QUERIED_KEY = "product_type_queried";
    @Deprecated
    public static final String RESPONSE_CODE_KEY = "response_code";
    @Deprecated
    public static final String RESPONSE_TIME_MILLIS_KEY = "response_time_millis";
    @Deprecated
    public static final String SUCCESSFUL_KEY = "successful";
    @Deprecated
    public static final String VERIFICATION_RESULT_KEY = "verification_result";
    private final AppConfig appConfig;
    private final DiagnosticsAnonymizer diagnosticsAnonymizer;
    private final Dispatcher diagnosticsDispatcher;
    private final EventsFileHelper<DiagnosticsEntry> diagnosticsFileHelper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$Companion;", "", "()V", "ENDPOINT_NAME_KEY", "", "ETAG_HIT_KEY", "PRODUCT_TYPE_QUERIED_KEY", "RESPONSE_CODE_KEY", "RESPONSE_TIME_MILLIS_KEY", "SUCCESSFUL_KEY", "VERIFICATION_RESULT_KEY", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public DiagnosticsTracker(AppConfig appConfig, EventsFileHelper<DiagnosticsEntry> eventsFileHelper, DiagnosticsAnonymizer diagnosticsAnonymizer, Dispatcher dispatcher) {
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("diagnosticsFileHelper", eventsFileHelper);
        AbstractC3557B.c0("diagnosticsAnonymizer", diagnosticsAnonymizer);
        AbstractC3557B.c0("diagnosticsDispatcher", dispatcher);
        this.appConfig = appConfig;
        this.diagnosticsFileHelper = eventsFileHelper;
        this.diagnosticsAnonymizer = diagnosticsAnonymizer;
        this.diagnosticsDispatcher = dispatcher;
    }

    public static /* synthetic */ void a(DiagnosticsTracker diagnosticsTracker, DiagnosticsEntry diagnosticsEntry) {
        trackEvent$lambda$0(diagnosticsTracker, diagnosticsEntry);
    }

    public static final void trackEvent$lambda$0(DiagnosticsTracker diagnosticsTracker, DiagnosticsEntry diagnosticsEntry) {
        AbstractC3557B.c0("this$0", diagnosticsTracker);
        AbstractC3557B.c0("$diagnosticsEntry", diagnosticsEntry);
        diagnosticsTracker.trackEventInCurrentThread$purchases_customEntitlementComputationRelease(diagnosticsEntry);
    }

    public static /* synthetic */ void trackMaxEventsStoredLimitReached$default(DiagnosticsTracker diagnosticsTracker, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        diagnosticsTracker.trackMaxEventsStoredLimitReached(z10);
    }

    public final void trackEvent(DiagnosticsEntry diagnosticsEntry) {
        AbstractC3557B.c0("diagnosticsEntry", diagnosticsEntry);
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new RunnableC5841a(this, 9, diagnosticsEntry), null, 2, null);
    }

    public final void trackEventInCurrentThread$purchases_customEntitlementComputationRelease(DiagnosticsEntry diagnosticsEntry) {
        AbstractC3557B.c0("diagnosticsEntry", diagnosticsEntry);
        if (AndroidVersionUtilsKt.isAndroidNOrNewer()) {
            DiagnosticsEntry anonymizeEntryIfNeeded = this.diagnosticsAnonymizer.anonymizeEntryIfNeeded(diagnosticsEntry);
            LogUtilsKt.verboseLog("Tracking diagnostics event: " + anonymizeEntryIfNeeded);
            try {
                this.diagnosticsFileHelper.appendEvent(anonymizeEntryIfNeeded);
            } catch (IOException e10) {
                LogUtilsKt.verboseLog("Error tracking diagnostics event: " + e10);
            }
        }
    }

    /* renamed from: trackGoogleQueryProductDetailsRequest-Wn2Vu4Y */
    public final void m62trackGoogleQueryProductDetailsRequestWn2Vu4Y(String str, int i10, String str2, long j6) {
        AbstractC3557B.c0("productType", str);
        AbstractC3557B.c0("billingDebugMessage", str2);
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PRODUCT_DETAILS_REQUEST, AbstractC4268D.a1(new C3959i(PRODUCT_TYPE_QUERIED_KEY, str), new C3959i("billing_response_code", Integer.valueOf(i10)), new C3959i("billing_debug_message", str2), new C3959i(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.e(j6)))), null, null, 12, null));
    }

    /* renamed from: trackGoogleQueryPurchaseHistoryRequest-Wn2Vu4Y */
    public final void m63trackGoogleQueryPurchaseHistoryRequestWn2Vu4Y(String str, int i10, String str2, long j6) {
        AbstractC3557B.c0("productType", str);
        AbstractC3557B.c0("billingDebugMessage", str2);
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PURCHASE_HISTORY_REQUEST, AbstractC4268D.a1(new C3959i(PRODUCT_TYPE_QUERIED_KEY, str), new C3959i("billing_response_code", Integer.valueOf(i10)), new C3959i("billing_debug_message", str2), new C3959i(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.e(j6)))), null, null, 12, null));
    }

    /* renamed from: trackGoogleQueryPurchasesRequest-Wn2Vu4Y */
    public final void m64trackGoogleQueryPurchasesRequestWn2Vu4Y(String str, int i10, String str2, long j6) {
        AbstractC3557B.c0("productType", str);
        AbstractC3557B.c0("billingDebugMessage", str2);
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.GOOGLE_QUERY_PURCHASES_REQUEST, AbstractC4268D.a1(new C3959i(PRODUCT_TYPE_QUERIED_KEY, str), new C3959i("billing_response_code", Integer.valueOf(i10)), new C3959i("billing_debug_message", str2), new C3959i(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.e(j6)))), null, null, 12, null));
    }

    /* renamed from: trackHttpRequestPerformed-NcHsxvU */
    public final void m65trackHttpRequestPerformedNcHsxvU(Endpoint endpoint, long j6, boolean z10, int i10, HTTPResult.Origin origin, VerificationResult verificationResult) {
        boolean z11;
        AbstractC3557B.c0("endpoint", endpoint);
        AbstractC3557B.c0("verificationResult", verificationResult);
        if (origin == HTTPResult.Origin.CACHE) {
            z11 = true;
        } else {
            z11 = false;
        }
        trackEvent(new DiagnosticsEntry.Event(DiagnosticsEventName.HTTP_REQUEST_PERFORMED, AbstractC4268D.a1(new C3959i(ENDPOINT_NAME_KEY, endpoint.getName()), new C3959i(RESPONSE_TIME_MILLIS_KEY, Long.valueOf(b.e(j6))), new C3959i(SUCCESSFUL_KEY, Boolean.valueOf(z10)), new C3959i(RESPONSE_CODE_KEY, Integer.valueOf(i10)), new C3959i(ETAG_HIT_KEY, Boolean.valueOf(z11)), new C3959i(VERIFICATION_RESULT_KEY, verificationResult.name())), null, null, 12, null));
        trackEvent(new DiagnosticsEntry.Counter(DiagnosticsCounterName.HTTP_REQUEST_PERFORMED, AbstractC4268D.a1(new C3959i(ENDPOINT_NAME_KEY, endpoint.getName()), new C3959i(SUCCESSFUL_KEY, String.valueOf(z10)), new C3959i(RESPONSE_CODE_KEY, String.valueOf(i10)), new C3959i(ETAG_HIT_KEY, String.valueOf(z11)), new C3959i(VERIFICATION_RESULT_KEY, verificationResult.name())), 1));
    }

    public final void trackMaxEventsStoredLimitReached(boolean z10) {
        DiagnosticsEntry.Event event = new DiagnosticsEntry.Event(DiagnosticsEventName.MAX_EVENTS_STORED_LIMIT_REACHED, w.f37484Y, null, null, 12, null);
        if (z10) {
            trackEventInCurrentThread$purchases_customEntitlementComputationRelease(event);
        } else {
            trackEvent(event);
        }
    }

    public final void trackProductDetailsNotSupported(int i10, String str) {
        AbstractC3557B.c0("billingDebugMessage", str);
        DiagnosticsCounterName diagnosticsCounterName = DiagnosticsCounterName.PRODUCT_DETAILS_NOT_SUPPORTED;
        C3959i[] c3959iArr = new C3959i[4];
        String playStoreVersionName = this.appConfig.getPlayStoreVersionName();
        String str2 = "";
        if (playStoreVersionName == null) {
            playStoreVersionName = str2;
        }
        c3959iArr[0] = new C3959i("play_store_version", playStoreVersionName);
        String playServicesVersionName = this.appConfig.getPlayServicesVersionName();
        if (playServicesVersionName != null) {
            str2 = playServicesVersionName;
        }
        c3959iArr[1] = new C3959i("play_services_version", str2);
        c3959iArr[2] = new C3959i("billing_response_code", String.valueOf(i10));
        c3959iArr[3] = new C3959i("billing_debug_message", str);
        trackEvent(new DiagnosticsEntry.Counter(diagnosticsCounterName, AbstractC4268D.a1(c3959iArr), 1));
    }
}
