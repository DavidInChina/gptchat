package com.revenuecat.purchases.common;

import E9.f;
import android.content.Context;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.api.BuildConfig;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.ConfigureStrings;
import id.AbstractC3557B;
import java.net.URL;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0012J\u0013\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020&H\u0016R\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010 R\u001c\u0010\u0010\u001a\u00020\u00058FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010 R\u001c\u0010\u0011\u001a\u00020\u00058FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010 R\u0011\u0010%\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010&\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0013\u0010/\u001a\u0004\u0018\u00010&\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020&\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010(\u00a8\u0006<"}, d2 = {"Lcom/revenuecat/purchases/common/AppConfig;", "", "context", "Landroid/content/Context;", "observerMode", "", "showInAppMessagesAutomatically", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", "proxyURL", "Ljava/net/URL;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "runningTests", "forceServerErrors", "forceSigningErrors", "(Landroid/content/Context;ZZLcom/revenuecat/purchases/common/PlatformInfo;Ljava/net/URL;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/DangerousSettings;ZZZ)V", "baseURL", "getBaseURL", "()Ljava/net/URL;", BuildConfig.FLAVOR, "getCustomEntitlementComputation", "()Z", "getDangerousSettings", "()Lcom/revenuecat/purchases/DangerousSettings;", "enableOfflineEntitlements", "getEnableOfflineEntitlements", "finishTransactions", "getFinishTransactions", "setFinishTransactions", "(Z)V", "getForceServerErrors", "setForceServerErrors", "getForceSigningErrors", "setForceSigningErrors", "languageTag", "", "getLanguageTag", "()Ljava/lang/String;", "packageName", "getPackageName", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "playServicesVersionName", "getPlayServicesVersionName", "playStoreVersionName", "getPlayStoreVersionName", "getShowInAppMessagesAutomatically", "getStore", "()Lcom/revenuecat/purchases/Store;", "versionName", "getVersionName", "equals", "other", "hashCode", "", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class AppConfig {
    public static final Companion Companion = new Companion(null);
    private static final URL diagnosticsURL = new URL("https://api-diagnostics.revenuecat.com/");
    private static final URL paywallEventsURL = new URL("https://api-paywalls.revenuecat.com/");
    private final URL baseURL;
    private final DangerousSettings dangerousSettings;
    private final boolean enableOfflineEntitlements;
    private boolean finishTransactions;
    private boolean forceServerErrors;
    private boolean forceSigningErrors;
    private final String languageTag;
    private final String packageName;
    private final PlatformInfo platformInfo;
    private final String playServicesVersionName;
    private final String playStoreVersionName;
    private final boolean runningTests;
    private final boolean showInAppMessagesAutomatically;
    private final Store store;
    private final String versionName;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/AppConfig$Companion;", "", "()V", "diagnosticsURL", "Ljava/net/URL;", "getDiagnosticsURL", "()Ljava/net/URL;", "paywallEventsURL", "getPaywallEventsURL", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final URL getDiagnosticsURL() {
            return AppConfig.diagnosticsURL;
        }

        public final URL getPaywallEventsURL() {
            return AppConfig.paywallEventsURL;
        }
    }

    public AppConfig(Context context, boolean z10, boolean z11, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, boolean z12, boolean z13, boolean z14) {
        String str;
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("platformInfo", platformInfo);
        AbstractC3557B.c0(ProductResponseJsonKeys.STORE, store);
        AbstractC3557B.c0("dangerousSettings", dangerousSettings);
        this.showInAppMessagesAutomatically = z11;
        this.platformInfo = platformInfo;
        this.store = store;
        this.dangerousSettings = dangerousSettings;
        this.runningTests = z12;
        this.forceServerErrors = z13;
        this.forceSigningErrors = z14;
        this.enableOfflineEntitlements = true;
        Locale locale = UtilsKt.getLocale(context);
        String str2 = "";
        this.languageTag = (locale == null || (str = UtilsKt.toBCP47(locale)) == null) ? str2 : str;
        String versionName = UtilsKt.getVersionName(context);
        this.versionName = versionName != null ? versionName : str2;
        String packageName = context.getPackageName();
        AbstractC3557B.b0("context.packageName", packageName);
        this.packageName = packageName;
        this.finishTransactions = !z10;
        if (url != null) {
            LogWrapperKt.log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET);
        } else {
            url = new URL("https://api.revenuecat.com/");
        }
        this.baseURL = url;
        this.playStoreVersionName = UtilsKt.getPlayStoreVersionName(context);
        this.playServicesVersionName = UtilsKt.getPlayServicesVersionName(context);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3557B.K(AppConfig.class, cls)) {
            return false;
        }
        AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.common.AppConfig", obj);
        AppConfig appConfig = (AppConfig) obj;
        if (AbstractC3557B.K(this.platformInfo, appConfig.platformInfo) && this.store == appConfig.store && AbstractC3557B.K(this.dangerousSettings, appConfig.dangerousSettings) && AbstractC3557B.K(this.languageTag, appConfig.languageTag) && AbstractC3557B.K(this.versionName, appConfig.versionName) && AbstractC3557B.K(this.packageName, appConfig.packageName) && this.finishTransactions == appConfig.finishTransactions && getForceServerErrors() == appConfig.getForceServerErrors() && getForceSigningErrors() == appConfig.getForceSigningErrors() && AbstractC3557B.K(this.baseURL, appConfig.baseURL) && this.showInAppMessagesAutomatically == appConfig.showInAppMessagesAutomatically) {
            return true;
        }
        return false;
    }

    public final URL getBaseURL() {
        return this.baseURL;
    }

    public final boolean getCustomEntitlementComputation() {
        return this.dangerousSettings.getCustomEntitlementComputation$purchases_customEntitlementComputationRelease();
    }

    public final DangerousSettings getDangerousSettings() {
        return this.dangerousSettings;
    }

    public final boolean getEnableOfflineEntitlements() {
        return this.enableOfflineEntitlements;
    }

    public final boolean getFinishTransactions() {
        return this.finishTransactions;
    }

    public final boolean getForceServerErrors() {
        if (this.runningTests && this.forceServerErrors) {
            return true;
        }
        return false;
    }

    public final boolean getForceSigningErrors() {
        if (this.runningTests && this.forceSigningErrors) {
            return true;
        }
        return false;
    }

    public final String getLanguageTag() {
        return this.languageTag;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final PlatformInfo getPlatformInfo() {
        return this.platformInfo;
    }

    public final String getPlayServicesVersionName() {
        return this.playServicesVersionName;
    }

    public final String getPlayStoreVersionName() {
        return this.playStoreVersionName;
    }

    public final boolean getShowInAppMessagesAutomatically() {
        return this.showInAppMessagesAutomatically;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = this.store.hashCode();
        int v10 = f.v(this.packageName, f.v(this.versionName, f.v(this.languageTag, (this.dangerousSettings.hashCode() + ((hashCode + (this.platformInfo.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
        int i13 = 1237;
        if (this.finishTransactions) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (v10 + i10) * 31;
        if (getForceServerErrors()) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (getForceSigningErrors()) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int hashCode2 = (this.baseURL.hashCode() + ((i15 + i12) * 31)) * 31;
        if (this.showInAppMessagesAutomatically) {
            i13 = 1231;
        }
        return hashCode2 + i13;
    }

    public final void setFinishTransactions(boolean z10) {
        this.finishTransactions = z10;
    }

    public final void setForceServerErrors(boolean z10) {
        this.forceServerErrors = z10;
    }

    public final void setForceSigningErrors(boolean z10) {
        this.forceSigningErrors = z10;
    }

    public String toString() {
        return "AppConfig(platformInfo=" + this.platformInfo + ", store=" + this.store + ", dangerousSettings=" + this.dangerousSettings + ", languageTag='" + this.languageTag + "', versionName='" + this.versionName + "', packageName='" + this.packageName + "', finishTransactions=" + this.finishTransactions + ", showInAppMessagesAutomatically=" + this.showInAppMessagesAutomatically + ", baseURL=" + this.baseURL + ')';
    }

    public /* synthetic */ AppConfig(Context context, boolean z10, boolean z11, PlatformInfo platformInfo, URL url, Store store, DangerousSettings dangerousSettings, boolean z12, boolean z13, boolean z14, int i10, g gVar) {
        this(context, z10, z11, platformInfo, url, store, (i10 & 64) != 0 ? new DangerousSettings(true) : dangerousSettings, (i10 & 128) != 0 ? false : z12, (i10 & 256) != 0 ? false : z13, (i10 & 512) != 0 ? false : z14);
    }
}
