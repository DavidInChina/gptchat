package com.statsig.androidsdk;

import J8.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.Locale;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.g;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b!\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\"\u001a\u00020\u001b\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010,\u001a\u00020\u001b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u00102\u001a\u00020\u001b\u0012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f\u0012\b\b\u0002\u0010:\u001a\u00020\u001b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\bD\u0010EJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0000\u00a2\u0006\u0004\b\u0010\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R$\u0010/\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\"\u00102\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R0\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u000e\"\u0004\b8\u00109R\"\u0010:\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R$\u0010=\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u00106\u00a8\u0006F"}, d2 = {"Lcom/statsig/androidsdk/StatsigOptions;", "", "Lcom/statsig/androidsdk/Tier;", "tier", "Ljf/y;", "setTier", "(Lcom/statsig/androidsdk/Tier;)V", "", SubscriberAttributeKt.JSON_NAME_KEY, "value", "setEnvironmentParameter", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getEnvironment", "()Ljava/util/Map;", "", "toMap$build_release", "toMap", "api", "Ljava/lang/String;", "getApi", "()Ljava/lang/String;", "setApi", "(Ljava/lang/String;)V", "eventLoggingAPI", "getEventLoggingAPI", "setEventLoggingAPI", "", "disableCurrentActivityLogging", "Z", "getDisableCurrentActivityLogging", "()Z", "setDisableCurrentActivityLogging", "(Z)V", "disableDiagnosticsLogging", "getDisableDiagnosticsLogging", "setDisableDiagnosticsLogging", "", "initTimeoutMs", "J", "getInitTimeoutMs", "()J", "setInitTimeoutMs", "(J)V", "enableAutoValueUpdate", "getEnableAutoValueUpdate", "setEnableAutoValueUpdate", "overrideStableID", "getOverrideStableID", "setOverrideStableID", "loadCacheAsync", "getLoadCacheAsync", "setLoadCacheAsync", "initializeValues", "Ljava/util/Map;", "getInitializeValues", "setInitializeValues", "(Ljava/util/Map;)V", "initializeOffline", "getInitializeOffline", "setInitializeOffline", "disableHashing", "Ljava/lang/Boolean;", "getDisableHashing", "()Ljava/lang/Boolean;", "setDisableHashing", "(Ljava/lang/Boolean;)V", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZJZLjava/lang/String;ZLjava/util/Map;ZLjava/lang/Boolean;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigOptions {
    @b("api")
    private String api;
    @b("disableCurrentActivityLogging")
    private boolean disableCurrentActivityLogging;
    @b("disableDiagnosticsLogging")
    private boolean disableDiagnosticsLogging;
    @b("disableHashing")
    private Boolean disableHashing;
    @b("enableAutoValueUpdate")
    private boolean enableAutoValueUpdate;
    private Map<String, String> environment;
    @b("eventLoggingAPI")
    private String eventLoggingAPI;
    @b("initTimeoutMs")
    private long initTimeoutMs;
    @b("initializeOffline")
    private boolean initializeOffline;
    @b("initializeValues")
    private Map<String, ? extends Object> initializeValues;
    @b("loadCacheAsync")
    private boolean loadCacheAsync;
    @b("overrideStableID")
    private String overrideStableID;

    public StatsigOptions() {
        this(null, null, false, false, 0L, false, null, false, null, false, null, 2047, null);
    }

    public final String getApi() {
        return this.api;
    }

    public final boolean getDisableCurrentActivityLogging() {
        return this.disableCurrentActivityLogging;
    }

    public final boolean getDisableDiagnosticsLogging() {
        return this.disableDiagnosticsLogging;
    }

    public final Boolean getDisableHashing() {
        return this.disableHashing;
    }

    public final boolean getEnableAutoValueUpdate() {
        return this.enableAutoValueUpdate;
    }

    public final Map<String, String> getEnvironment() {
        return this.environment;
    }

    public final String getEventLoggingAPI() {
        return this.eventLoggingAPI;
    }

    public final long getInitTimeoutMs() {
        return this.initTimeoutMs;
    }

    public final boolean getInitializeOffline() {
        return this.initializeOffline;
    }

    public final Map<String, Object> getInitializeValues() {
        return this.initializeValues;
    }

    public final boolean getLoadCacheAsync() {
        return this.loadCacheAsync;
    }

    public final String getOverrideStableID() {
        return this.overrideStableID;
    }

    public final void setApi(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.api = str;
    }

    public final void setDisableCurrentActivityLogging(boolean z10) {
        this.disableCurrentActivityLogging = z10;
    }

    public final void setDisableDiagnosticsLogging(boolean z10) {
        this.disableDiagnosticsLogging = z10;
    }

    public final void setDisableHashing(Boolean bool) {
        this.disableHashing = bool;
    }

    public final void setEnableAutoValueUpdate(boolean z10) {
        this.enableAutoValueUpdate = z10;
    }

    public final void setEnvironmentParameter(String str, String str2) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("value", str2);
        Map<String, String> map = this.environment;
        if (map == null) {
            this.environment = AbstractC4268D.c1(new C3959i(str, str2));
        } else {
            map.put(str, str2);
        }
    }

    public final void setEventLoggingAPI(String str) {
        AbstractC3557B.c0("<set-?>", str);
        this.eventLoggingAPI = str;
    }

    public final void setInitTimeoutMs(long j6) {
        this.initTimeoutMs = j6;
    }

    public final void setInitializeOffline(boolean z10) {
        this.initializeOffline = z10;
    }

    public final void setInitializeValues(Map<String, ? extends Object> map) {
        this.initializeValues = map;
    }

    public final void setLoadCacheAsync(boolean z10) {
        this.loadCacheAsync = z10;
    }

    public final void setOverrideStableID(String str) {
        this.overrideStableID = str;
    }

    public final void setTier(Tier tier) {
        AbstractC3557B.c0("tier", tier);
        String obj = tier.toString();
        if (obj != null) {
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)", lowerCase);
            setEnvironmentParameter("tier", lowerCase);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final Map<String, Object> toMap$build_release() {
        return AbstractC4268D.a1(new C3959i("api", this.api), new C3959i("disableCurrentActivityLogging", Boolean.valueOf(this.disableCurrentActivityLogging)), new C3959i("disableDiagnosticsLogging", Boolean.valueOf(this.disableDiagnosticsLogging)), new C3959i("initTimeoutMs", Long.valueOf(this.initTimeoutMs)), new C3959i("enableAutoValueUpdate", Boolean.valueOf(this.enableAutoValueUpdate)), new C3959i("overrideStableID", this.overrideStableID), new C3959i("loadCacheAsync", Boolean.valueOf(this.loadCacheAsync)), new C3959i("initializeValues", this.initializeValues), new C3959i("disableHashing", this.disableHashing), new C3959i("environment", this.environment));
    }

    public StatsigOptions(String str, String str2, boolean z10, boolean z11, long j6, boolean z12, String str3, boolean z13, Map<String, ? extends Object> map, boolean z14, Boolean bool) {
        AbstractC3557B.c0("api", str);
        AbstractC3557B.c0("eventLoggingAPI", str2);
        this.api = str;
        this.eventLoggingAPI = str2;
        this.disableCurrentActivityLogging = z10;
        this.disableDiagnosticsLogging = z11;
        this.initTimeoutMs = j6;
        this.enableAutoValueUpdate = z12;
        this.overrideStableID = str3;
        this.loadCacheAsync = z13;
        this.initializeValues = map;
        this.initializeOffline = z14;
        this.disableHashing = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StatsigOptions(String str, String str2, boolean z10, boolean z11, long j6, boolean z12, String str3, boolean z13, Map map, boolean z14, Boolean bool, int i10, g gVar) {
        this((i10 & 1) != 0 ? r2 : str, (i10 & 2) == 0 ? str2 : r2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? 5000L : j6, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? false : z13, (i10 & 256) == 0 ? map : null, (i10 & 512) == 0 ? z14 : false, (i10 & 1024) != 0 ? Boolean.FALSE : bool);
        String str4 = "https://api.statsig.com/v1";
    }
}
