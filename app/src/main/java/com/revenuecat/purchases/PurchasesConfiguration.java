package com.revenuecat.purchases;

import android.content.Context;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import id.AbstractC3557B;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006("}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration;", "", "builder", "Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "(Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "appUserID", "getAppUserID", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "diagnosticsEnabled", "", "getDiagnosticsEnabled", "()Z", "observerMode", "getObserverMode", ReferencesHeader.SERVICE, "Ljava/util/concurrent/ExecutorService;", "getService", "()Ljava/util/concurrent/ExecutorService;", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", "verificationMode", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "Builder", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public class PurchasesConfiguration {
    private final String apiKey;
    private final String appUserID;
    private final Context context;
    private final DangerousSettings dangerousSettings;
    private final boolean diagnosticsEnabled;
    private final boolean observerMode;
    private final ExecutorService service;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final EntitlementVerificationMode verificationMode;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\b\u00104\u001a\u000205H\u0016J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u00106\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.J\u0010\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0016H\u0007J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0016J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00058@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00108@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR*\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00168@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR&\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020(8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R&\u0010/\u001a\u00020.2\u0006\u0010\t\u001a\u00020.8@@@X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u00069"}, d2 = {"Lcom/revenuecat/purchases/PurchasesConfiguration$Builder;", "", "context", "Landroid/content/Context;", "apiKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "getApiKey$purchases_customEntitlementComputationRelease", "()Ljava/lang/String;", "<set-?>", "appUserID", "getAppUserID$purchases_customEntitlementComputationRelease", "setAppUserID$purchases_customEntitlementComputationRelease", "(Ljava/lang/String;)V", "getContext$purchases_customEntitlementComputationRelease", "()Landroid/content/Context;", "Lcom/revenuecat/purchases/DangerousSettings;", "dangerousSettings", "getDangerousSettings$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/DangerousSettings;", "setDangerousSettings$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/DangerousSettings;)V", "", "diagnosticsEnabled", "getDiagnosticsEnabled$purchases_customEntitlementComputationRelease", "()Z", "setDiagnosticsEnabled$purchases_customEntitlementComputationRelease", "(Z)V", "observerMode", "getObserverMode$purchases_customEntitlementComputationRelease", "setObserverMode$purchases_customEntitlementComputationRelease", "Ljava/util/concurrent/ExecutorService;", ReferencesHeader.SERVICE, "getService$purchases_customEntitlementComputationRelease", "()Ljava/util/concurrent/ExecutorService;", "setService$purchases_customEntitlementComputationRelease", "(Ljava/util/concurrent/ExecutorService;)V", "showInAppMessagesAutomatically", "getShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease", "setShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease", "Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "getStore$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/Store;", "setStore$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/EntitlementVerificationMode;", "verificationMode", "getVerificationMode$purchases_customEntitlementComputationRelease", "()Lcom/revenuecat/purchases/EntitlementVerificationMode;", "setVerificationMode$purchases_customEntitlementComputationRelease", "(Lcom/revenuecat/purchases/EntitlementVerificationMode;)V", "build", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "entitlementVerificationMode", "informationalVerificationModeAndDiagnosticsEnabled", "enabled", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static class Builder {
        private final String apiKey;
        private String appUserID;
        private final Context context;
        private boolean diagnosticsEnabled;
        private boolean observerMode;
        private ExecutorService service;
        private boolean showInAppMessagesAutomatically = true;
        private Store store = Store.PLAY_STORE;
        private EntitlementVerificationMode verificationMode = EntitlementVerificationMode.Companion.getDefault();
        private DangerousSettings dangerousSettings = new DangerousSettings(false, 1, null);

        public Builder(Context context, String str) {
            AbstractC3557B.c0("context", context);
            AbstractC3557B.c0("apiKey", str);
            this.context = context;
            this.apiKey = str;
        }

        public final Builder appUserID(String str) {
            this.appUserID = str;
            return this;
        }

        public PurchasesConfiguration build() {
            return new PurchasesConfiguration(this);
        }

        public final Builder dangerousSettings(DangerousSettings dangerousSettings) {
            AbstractC3557B.c0("dangerousSettings", dangerousSettings);
            this.dangerousSettings = dangerousSettings;
            return this;
        }

        public final Builder diagnosticsEnabled(boolean z10) {
            this.diagnosticsEnabled = z10;
            return this;
        }

        public final Builder entitlementVerificationMode(EntitlementVerificationMode entitlementVerificationMode) {
            AbstractC3557B.c0("verificationMode", entitlementVerificationMode);
            this.verificationMode = entitlementVerificationMode;
            return this;
        }

        public final /* synthetic */ String getApiKey$purchases_customEntitlementComputationRelease() {
            return this.apiKey;
        }

        public final /* synthetic */ String getAppUserID$purchases_customEntitlementComputationRelease() {
            return this.appUserID;
        }

        public final /* synthetic */ Context getContext$purchases_customEntitlementComputationRelease() {
            return this.context;
        }

        public final /* synthetic */ DangerousSettings getDangerousSettings$purchases_customEntitlementComputationRelease() {
            return this.dangerousSettings;
        }

        public final /* synthetic */ boolean getDiagnosticsEnabled$purchases_customEntitlementComputationRelease() {
            return this.diagnosticsEnabled;
        }

        public final /* synthetic */ boolean getObserverMode$purchases_customEntitlementComputationRelease() {
            return this.observerMode;
        }

        public final /* synthetic */ ExecutorService getService$purchases_customEntitlementComputationRelease() {
            return this.service;
        }

        public final /* synthetic */ boolean getShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease() {
            return this.showInAppMessagesAutomatically;
        }

        public final /* synthetic */ Store getStore$purchases_customEntitlementComputationRelease() {
            return this.store;
        }

        public final /* synthetic */ EntitlementVerificationMode getVerificationMode$purchases_customEntitlementComputationRelease() {
            return this.verificationMode;
        }

        @ExperimentalPreviewRevenueCatPurchasesAPI
        public final /* synthetic */ Builder informationalVerificationModeAndDiagnosticsEnabled(boolean z10) {
            if (z10) {
                this.verificationMode = EntitlementVerificationMode.INFORMATIONAL;
                this.diagnosticsEnabled = true;
            } else {
                this.verificationMode = EntitlementVerificationMode.DISABLED;
                this.diagnosticsEnabled = false;
            }
            return this;
        }

        public final Builder observerMode(boolean z10) {
            this.observerMode = z10;
            return this;
        }

        public final Builder service(ExecutorService executorService) {
            AbstractC3557B.c0(ReferencesHeader.SERVICE, executorService);
            this.service = executorService;
            return this;
        }

        public final /* synthetic */ void setAppUserID$purchases_customEntitlementComputationRelease(String str) {
            this.appUserID = str;
        }

        public final /* synthetic */ void setDangerousSettings$purchases_customEntitlementComputationRelease(DangerousSettings dangerousSettings) {
            AbstractC3557B.c0("<set-?>", dangerousSettings);
            this.dangerousSettings = dangerousSettings;
        }

        public final /* synthetic */ void setDiagnosticsEnabled$purchases_customEntitlementComputationRelease(boolean z10) {
            this.diagnosticsEnabled = z10;
        }

        public final /* synthetic */ void setObserverMode$purchases_customEntitlementComputationRelease(boolean z10) {
            this.observerMode = z10;
        }

        public final /* synthetic */ void setService$purchases_customEntitlementComputationRelease(ExecutorService executorService) {
            this.service = executorService;
        }

        public final /* synthetic */ void setShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease(boolean z10) {
            this.showInAppMessagesAutomatically = z10;
        }

        public final /* synthetic */ void setStore$purchases_customEntitlementComputationRelease(Store store) {
            AbstractC3557B.c0("<set-?>", store);
            this.store = store;
        }

        public final /* synthetic */ void setVerificationMode$purchases_customEntitlementComputationRelease(EntitlementVerificationMode entitlementVerificationMode) {
            AbstractC3557B.c0("<set-?>", entitlementVerificationMode);
            this.verificationMode = entitlementVerificationMode;
        }

        public final Builder showInAppMessagesAutomatically(boolean z10) {
            this.showInAppMessagesAutomatically = z10;
            return this;
        }

        public final Builder store(Store store) {
            AbstractC3557B.c0(ProductResponseJsonKeys.STORE, store);
            this.store = store;
            return this;
        }
    }

    public PurchasesConfiguration(Builder builder) {
        AbstractC3557B.c0("builder", builder);
        this.context = builder.getContext$purchases_customEntitlementComputationRelease();
        this.apiKey = builder.getApiKey$purchases_customEntitlementComputationRelease();
        this.appUserID = builder.getAppUserID$purchases_customEntitlementComputationRelease();
        this.observerMode = builder.getObserverMode$purchases_customEntitlementComputationRelease();
        this.service = builder.getService$purchases_customEntitlementComputationRelease();
        this.store = builder.getStore$purchases_customEntitlementComputationRelease();
        this.diagnosticsEnabled = builder.getDiagnosticsEnabled$purchases_customEntitlementComputationRelease();
        this.verificationMode = builder.getVerificationMode$purchases_customEntitlementComputationRelease();
        this.dangerousSettings = builder.getDangerousSettings$purchases_customEntitlementComputationRelease();
        this.showInAppMessagesAutomatically = builder.getShowInAppMessagesAutomatically$purchases_customEntitlementComputationRelease();
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getAppUserID() {
        return this.appUserID;
    }

    public final Context getContext() {
        return this.context;
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getDiagnosticsEnabled() {
        return this.diagnosticsEnabled;
    }

    public final boolean getObserverMode() {
        return this.observerMode;
    }

    public final ExecutorService getService() {
        return this.service;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final EntitlementVerificationMode getVerificationMode() {
        return this.verificationMode;
    }
}
