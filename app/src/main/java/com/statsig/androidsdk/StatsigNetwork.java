package com.statsig.androidsdk;

import Qg.AbstractC1206i;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.Metadata;
import nf.AbstractC4825e;
import r9.y;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001Jy\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&\u00a2\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0002H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\b$\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/statsig/androidsdk/StatsigNetwork;", "", "", "api", "Lcom/statsig/androidsdk/StatsigUser;", "user", "", "sinceTime", "Lcom/statsig/androidsdk/StatsigMetadata;", "metadata", "initTimeoutMs", "Landroid/content/SharedPreferences;", "sharedPrefs", "Lcom/statsig/androidsdk/ContextType;", "context", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "Lcom/statsig/androidsdk/HashAlgorithm;", "hashUsed", "", "previousDerivedFields", "Lcom/statsig/androidsdk/InitializeResponse;", "initialize", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;JLandroid/content/SharedPreferences;Lcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/Diagnostics;Lcom/statsig/androidsdk/HashAlgorithm;Ljava/util/Map;Lnf/e;)Ljava/lang/Object;", "LQg/i;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "pollForChanges", "(Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/Long;Lcom/statsig/androidsdk/StatsigMetadata;)LQg/i;", "bodyString", "eventsCount", "Ljf/y;", "apiPostLogs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "apiRetryFailedLogs", "(Ljava/lang/String;Lnf/e;)Ljava/lang/Object;", "requestBody", "addFailedLogRequest", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public interface StatsigNetwork {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object apiPostLogs$default(StatsigNetwork statsigNetwork, String str, String str2, String str3, AbstractC4825e abstractC4825e, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = null;
                }
                return statsigNetwork.apiPostLogs(str, str2, str3, abstractC4825e);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apiPostLogs");
        }

        public static /* synthetic */ Object initialize$default(StatsigNetwork statsigNetwork, String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata, long j6, SharedPreferences sharedPreferences, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map map, AbstractC4825e abstractC4825e, int i10, Object obj) {
            Diagnostics diagnostics2;
            if (obj == null) {
                if ((i10 & 128) != 0) {
                    diagnostics2 = null;
                } else {
                    diagnostics2 = diagnostics;
                }
                return statsigNetwork.initialize(str, statsigUser, l10, statsigMetadata, j6, sharedPreferences, contextType, diagnostics2, hashAlgorithm, map, abstractC4825e);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
        }
    }

    Object addFailedLogRequest(String str, AbstractC4825e abstractC4825e);

    Object apiPostLogs(String str, String str2, String str3, AbstractC4825e abstractC4825e);

    Object apiRetryFailedLogs(String str, AbstractC4825e abstractC4825e);

    Object initialize(String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata, long j6, SharedPreferences sharedPreferences, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, AbstractC4825e abstractC4825e);

    AbstractC1206i pollForChanges(String str, StatsigUser statsigUser, Long l10, StatsigMetadata statsigMetadata);
}
