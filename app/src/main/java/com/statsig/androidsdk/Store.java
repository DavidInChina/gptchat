package com.statsig.androidsdk;

import Ad.l;
import I8.n;
import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import com.google.gson.reflect.TypeToken;
import com.statsig.androidsdk.InitializeResponse;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.y;
import kf.w;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;

@Metadata(d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010a\u001a\u00020`\u0012\u0006\u0010d\u001a\u00020c\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010f\u001a\u00020\n\u00a2\u0006\u0004\b~\u0010\u007fJ\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\n\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\n\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\b\"\u0010#J)\u0010(\u001a\u00020'2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\b(\u0010)J\u000f\u0010-\u001a\u00020*H\u0000\u00a2\u0006\u0004\b+\u0010,J#\u00103\u001a\u00020*2\u0006\u0010.\u001a\u00020 2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/H\u0000\u00a2\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u00104\u001a\u00020 \u00a2\u0006\u0004\b5\u00106J)\u00107\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\n2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0004\b7\u00108J)\u00109\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\n2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0004\b9\u00108J\u0015\u0010;\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\n\u00a2\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0002\u00a2\u0006\u0004\b=\u0010\u0004J\u0013\u0010>\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b>\u0010?J\r\u0010A\u001a\u00020@\u00a2\u0006\u0004\bA\u0010BJ\r\u0010D\u001a\u00020C\u00a2\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\n\u00a2\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u0013\u00a2\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\bJ\u0010?J\u000f\u0010L\u001a\u00020KH\u0002\u00a2\u0006\u0004\bL\u0010MJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010N\u001a\u00020\nH\u0002\u00a2\u0006\u0004\bP\u0010QJ;\u0010U\u001a\u0004\u0018\u00010O2\u0006\u0010:\u001a\u00020\n2\b\u0010R\u001a\u0004\u0018\u00010O2\u0006\u0010!\u001a\u00020 2\u0006\u0010S\u001a\u00020*2\u0006\u0010T\u001a\u00020 H\u0002\u00a2\u0006\u0004\bU\u0010VJ)\u0010X\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020\n2\u0006\u0010S\u001a\u00020*2\b\u0010W\u001a\u0004\u0018\u00010OH\u0002\u00a2\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020KH\u0002\u00a2\u0006\u0004\bZ\u0010MJ\u0017\u0010\\\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\\\u0010<J!\u0010]\u001a\u00020\u00022\u0006\u0010[\u001a\u00020\n2\b\u0010R\u001a\u0004\u0018\u00010OH\u0002\u00a2\u0006\u0004\b]\u0010^J\u0019\u0010_\u001a\u0004\u0018\u00010O2\u0006\u0010[\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b_\u0010QR\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bf\u0010gR\"\u0010h\u001a\u00020/8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bt\u0010gR\u0016\u0010u\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bu\u0010gR\"\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020K0v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020K8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\by\u0010zR\"\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020O0v8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b{\u0010xR\u0016\u0010|\u001a\u00020@8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b|\u0010}\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/statsig/androidsdk/Store;", "", "Ljf/y;", "syncLoadFromLocalStorage", "()V", "Lcom/statsig/androidsdk/StatsigUser;", "user", "loadAndResetForUser", "(Lcom/statsig/androidsdk/StatsigUser;)V", "", "", "initializeValues", "bootstrap", "(Ljava/util/Map;Lcom/statsig/androidsdk/StatsigUser;)V", "", "getLastUpdateTime", "(Lcom/statsig/androidsdk/StatsigUser;)Ljava/lang/Long;", "getPreviousDerivedFields", "(Lcom/statsig/androidsdk/StatsigUser;)Ljava/util/Map;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "data", "save", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;Lcom/statsig/androidsdk/StatsigUser;Lnf/e;)Ljava/lang/Object;", "gateName", "Lcom/statsig/androidsdk/FeatureGate;", "checkGate", "(Ljava/lang/String;)Lcom/statsig/androidsdk/FeatureGate;", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "experimentName", "", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "Lcom/statsig/androidsdk/StatsigClient;", "client", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "Lcom/statsig/androidsdk/EvaluationDetails;", "getGlobalEvaluationDetails$build_release", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getGlobalEvaluationDetails", "valueExists", "Lcom/statsig/androidsdk/EvaluationReason;", "reasonOverride", "getEvaluationDetails$build_release", "(ZLcom/statsig/androidsdk/EvaluationReason;)Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "value", "overrideGate", "(Ljava/lang/String;Z)V", "overrideConfig", "(Ljava/lang/String;Ljava/util/Map;)V", "overrideLayer", "name", "removeOverride", "(Ljava/lang/String;)V", "removeAllOverrides", "saveOverridesToLocalStorage", "(Lnf/e;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getCurrentCacheValuesAndEvaluationReason", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getCurrentValuesAsString", "()Ljava/lang/String;", "getCachedInitializationResponse", "()Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "persistStickyValues", "Lcom/statsig/androidsdk/Cache;", "loadCacheForCurrentUser", "()Lcom/statsig/androidsdk/Cache;", "hashedConfigName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "getConfigData", "(Ljava/lang/String;)Lcom/statsig/androidsdk/APIDynamicConfig;", "latestValue", "details", "isLayer", "getPossiblyStickyValue", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;ZLcom/statsig/androidsdk/EvaluationDetails;Z)Lcom/statsig/androidsdk/APIDynamicConfig;", "config", "hydrateDynamicConfig", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/APIDynamicConfig;)Lcom/statsig/androidsdk/DynamicConfig;", "createEmptyCache", "expName", "removeStickyValue", "attemptToSaveStickyValue", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;)V", "getStickyValue", "LNg/F;", "statsigScope", "LNg/F;", "Landroid/content/SharedPreferences;", "sharedPrefs", "Landroid/content/SharedPreferences;", "sdkKey", "Ljava/lang/String;", "reason", "Lcom/statsig/androidsdk/EvaluationReason;", "getReason", "()Lcom/statsig/androidsdk/EvaluationReason;", "setReason", "(Lcom/statsig/androidsdk/EvaluationReason;)V", "LI8/n;", "gson", "LI8/n;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "currentUserCacheKeyDeprecated", "currentUserCacheKeyV2", "j$/util/concurrent/ConcurrentHashMap", "cacheById", "Lj$/util/concurrent/ConcurrentHashMap;", "currentCache", "Lcom/statsig/androidsdk/Cache;", "stickyDeviceExperiments", "localOverrides", "Lcom/statsig/androidsdk/StatsigOverrides;", "<init>", "(LNg/F;Landroid/content/SharedPreferences;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/String;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Store {
    private String currentUserCacheKeyDeprecated;
    private String currentUserCacheKeyV2;
    private final String sdkKey;
    private final SharedPreferences sharedPrefs;
    private final F statsigScope;
    private final n gson = StatsigUtil.INSTANCE.getGson$build_release();
    private final CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
    private ConcurrentHashMap<String, Cache> cacheById = new ConcurrentHashMap<>();
    private Cache currentCache = createEmptyCache();
    private ConcurrentHashMap<String, APIDynamicConfig> stickyDeviceExperiments = new ConcurrentHashMap<>();
    private StatsigOverrides localOverrides = StatsigOverrides.Companion.empty();
    private EvaluationReason reason = EvaluationReason.Uninitialized;

    public Store(F f6, SharedPreferences sharedPreferences, StatsigUser statsigUser, String str) {
        AbstractC3557B.c0("statsigScope", f6);
        AbstractC3557B.c0("sharedPrefs", sharedPreferences);
        AbstractC3557B.c0("user", statsigUser);
        AbstractC3557B.c0("sdkKey", str);
        this.statsigScope = f6;
        this.sharedPrefs = sharedPreferences;
        this.sdkKey = str;
        this.currentUserCacheKeyDeprecated = statsigUser.getCacheKeyDEPRECATED$build_release();
        this.currentUserCacheKeyV2 = statsigUser.getCacheKeyWithSDKKey$build_release(str);
    }

    private final void attemptToSaveStickyValue(String str, APIDynamicConfig aPIDynamicConfig) {
        if (aPIDynamicConfig == null) {
            return;
        }
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        if (aPIDynamicConfig.isExperimentActive() && aPIDynamicConfig.isUserInExperiment()) {
            if (aPIDynamicConfig.isDeviceBased()) {
                this.stickyDeviceExperiments.put(hashedString, aPIDynamicConfig);
            } else {
                this.currentCache.getStickyUserExperiments().getExperiments().put(hashedString, aPIDynamicConfig);
            }
        }
    }

    private final Cache createEmptyCache() {
        w wVar = w.f37484Y;
        return new Cache(new InitializeResponse.SuccessfulInitializeResponse(wVar, wVar, wVar, false, null, 0L, wVar), new StickyUserExperiments(new LinkedHashMap()), "", Long.valueOf(System.currentTimeMillis()));
    }

    private final APIDynamicConfig getConfigData(String str) {
        InitializeResponse.SuccessfulInitializeResponse values = this.currentCache.getValues();
        if (values.getConfigs() != null && values.getConfigs().containsKey(str)) {
            return values.getConfigs().get(str);
        }
        return null;
    }

    public static /* synthetic */ EvaluationDetails getEvaluationDetails$build_release$default(Store store, boolean z10, EvaluationReason evaluationReason, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            evaluationReason = null;
        }
        return store.getEvaluationDetails$build_release(z10, evaluationReason);
    }

    public static /* synthetic */ Layer getLayer$default(Store store, StatsigClient statsigClient, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return store.getLayer(statsigClient, str, z10);
    }

    private final APIDynamicConfig getPossiblyStickyValue(String str, APIDynamicConfig aPIDynamicConfig, boolean z10, EvaluationDetails evaluationDetails, boolean z11) {
        APIDynamicConfig aPIDynamicConfig2;
        Boolean bool;
        Map<String, APIDynamicConfig> configs;
        if (!z10) {
            removeStickyValue(str);
            return aPIDynamicConfig;
        }
        APIDynamicConfig stickyValue = getStickyValue(str);
        if (stickyValue == null) {
            attemptToSaveStickyValue(str, aPIDynamicConfig);
            return aPIDynamicConfig;
        }
        Boolean bool2 = null;
        if (z11) {
            String allocatedExperimentName = stickyValue.getAllocatedExperimentName();
            if (allocatedExperimentName == null || (configs = this.currentCache.getValues().getConfigs()) == null) {
                aPIDynamicConfig2 = null;
            } else {
                aPIDynamicConfig2 = configs.get(allocatedExperimentName);
            }
        } else {
            aPIDynamicConfig2 = aPIDynamicConfig;
        }
        if (aPIDynamicConfig2 == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(aPIDynamicConfig2.isExperimentActive());
        }
        Boolean bool3 = Boolean.TRUE;
        if (AbstractC3557B.K(bool, bool3)) {
            evaluationDetails.setReason(EvaluationReason.Sticky);
            return stickyValue;
        }
        if (aPIDynamicConfig != null) {
            bool2 = Boolean.valueOf(aPIDynamicConfig.isExperimentActive());
        }
        if (AbstractC3557B.K(bool2, bool3)) {
            attemptToSaveStickyValue(str, aPIDynamicConfig);
        } else {
            removeStickyValue(str);
        }
        return aPIDynamicConfig;
    }

    private final APIDynamicConfig getStickyValue(String str) {
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        APIDynamicConfig aPIDynamicConfig = this.currentCache.getStickyUserExperiments().getExperiments().get(hashedString);
        if (aPIDynamicConfig == null) {
            return this.stickyDeviceExperiments.get(hashedString);
        }
        return aPIDynamicConfig;
    }

    private final DynamicConfig hydrateDynamicConfig(String str, EvaluationDetails evaluationDetails, APIDynamicConfig aPIDynamicConfig) {
        if (aPIDynamicConfig != null) {
            return new DynamicConfig(str, aPIDynamicConfig, evaluationDetails);
        }
        return new DynamicConfig(str, evaluationDetails, null, null, null, null, false, false, false, null, 1020, null);
    }

    private final Cache loadCacheForCurrentUser() {
        Cache cache = this.cacheById.get(this.currentUserCacheKeyV2);
        if (cache == null) {
            cache = this.cacheById.get(this.currentUserCacheKeyDeprecated);
        }
        if (cache != null) {
            this.reason = EvaluationReason.Cache;
            return cache;
        }
        return createEmptyCache();
    }

    private final void removeStickyValue(String str) {
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        this.currentCache.getStickyUserExperiments().getExperiments().remove(hashedString);
        this.stickyDeviceExperiments.remove(hashedString);
    }

    public final void bootstrap(Map<String, ? extends Object> map, StatsigUser statsigUser) {
        EvaluationReason evaluationReason;
        AbstractC3557B.c0("initializeValues", map);
        AbstractC3557B.c0("user", statsigUser);
        if (BootstrapValidator.INSTANCE.isValid(map, statsigUser)) {
            evaluationReason = EvaluationReason.Bootstrap;
        } else {
            evaluationReason = EvaluationReason.InvalidBootstrap;
        }
        this.reason = evaluationReason;
        try {
            Cache cache = this.currentCache;
            n nVar = this.gson;
            Object e10 = nVar.e(InitializeResponse.SuccessfulInitializeResponse.class, nVar.i(map));
            AbstractC3557B.b0("gson.fromJson(\n                gson.toJson(initializeValues),\n                InitializeResponse.SuccessfulInitializeResponse::class.java,\n            )", e10);
            cache.setValues((InitializeResponse.SuccessfulInitializeResponse) e10);
            this.cacheById.put(this.currentUserCacheKeyV2, this.currentCache);
        } catch (Exception unused) {
        }
    }

    public final FeatureGate checkGate(String str) {
        APIFeatureGate aPIFeatureGate;
        AbstractC3557B.c0("gateName", str);
        Boolean bool = this.localOverrides.getGates().get(str);
        if (bool != null) {
            return new FeatureGate(str, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), bool.booleanValue(), "override", null, null, 48, null);
        }
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        Map<String, APIFeatureGate> featureGates = this.currentCache.getValues().getFeatureGates();
        if (featureGates == null) {
            aPIFeatureGate = null;
        } else {
            aPIFeatureGate = featureGates.get(hashedString);
        }
        if (aPIFeatureGate == null) {
            return new FeatureGate(str, getEvaluationDetails$build_release$default(this, false, null, 2, null), false, null, null, null, 60, null);
        }
        return new FeatureGate(aPIFeatureGate, getEvaluationDetails$build_release$default(this, true, null, 2, null));
    }

    public final StatsigOverrides getAllOverrides() {
        return new StatsigOverrides(this.localOverrides.getGates(), this.localOverrides.getConfigs(), this.localOverrides.getLayers());
    }

    public final InitializeResponse.SuccessfulInitializeResponse getCachedInitializationResponse() {
        return this.currentCache.getValues();
    }

    public final DynamicConfig getConfig(String str) {
        AbstractC3557B.c0("configName", str);
        Map<String, Object> map = this.localOverrides.getConfigs().get(str);
        boolean z10 = false;
        if (map != null) {
            return new DynamicConfig(str, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), map, "override", null, null, false, false, false, null, 1008, null);
        }
        APIDynamicConfig configData = getConfigData(Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed()));
        if (configData != null) {
            z10 = true;
        }
        return hydrateDynamicConfig(str, getEvaluationDetails$build_release$default(this, z10, null, 2, null), configData);
    }

    public final ExternalInitializeResponse getCurrentCacheValuesAndEvaluationReason() {
        return new ExternalInitializeResponse(this.gson.i(this.currentCache.getValues()), getEvaluationDetails$build_release$default(this, true, null, 2, null));
    }

    public final String getCurrentValuesAsString() {
        String i10 = this.gson.i(this.currentCache.getValues());
        AbstractC3557B.b0("gson.toJson(currentCache.values)", i10);
        return i10;
    }

    public final EvaluationDetails getEvaluationDetails$build_release(boolean z10, EvaluationReason evaluationReason) {
        if (z10) {
            return getGlobalEvaluationDetails$build_release();
        }
        EvaluationReason evaluationReason2 = EvaluationReason.Unrecognized;
        EvaluationReason evaluationReason3 = this.reason;
        EvaluationReason evaluationReason4 = EvaluationReason.Uninitialized;
        if (evaluationReason3 == evaluationReason4) {
            evaluationReason2 = evaluationReason4;
        }
        if (evaluationReason == null) {
            evaluationReason = evaluationReason2;
        }
        return new EvaluationDetails(evaluationReason, System.currentTimeMillis());
    }

    public final DynamicConfig getExperiment(String str, boolean z10) {
        APIDynamicConfig aPIDynamicConfig;
        AbstractC3557B.c0("experimentName", str);
        Map<String, Object> map = this.localOverrides.getConfigs().get(str);
        boolean z11 = false;
        if (map != null) {
            return new DynamicConfig(str, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), map, "override", null, null, false, false, false, null, 1008, null);
        }
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        Map<String, APIDynamicConfig> configs = this.currentCache.getValues().getConfigs();
        if (configs == null) {
            aPIDynamicConfig = null;
        } else {
            aPIDynamicConfig = configs.get(hashedString);
        }
        if (aPIDynamicConfig != null) {
            z11 = true;
        }
        EvaluationDetails evaluationDetails$build_release$default = getEvaluationDetails$build_release$default(this, z11, null, 2, null);
        return hydrateDynamicConfig(str, evaluationDetails$build_release$default, getPossiblyStickyValue(str, aPIDynamicConfig, z10, evaluationDetails$build_release$default, false));
    }

    public final EvaluationDetails getGlobalEvaluationDetails$build_release() {
        long j6;
        EvaluationReason evaluationReason = this.reason;
        Long evaluationTime = this.currentCache.getEvaluationTime();
        if (evaluationTime == null) {
            j6 = System.currentTimeMillis();
        } else {
            j6 = evaluationTime.longValue();
        }
        return new EvaluationDetails(evaluationReason, j6);
    }

    public final Long getLastUpdateTime(StatsigUser statsigUser) {
        String str;
        AbstractC3557B.c0("user", statsigUser);
        Cache cache = this.cacheById.get(statsigUser.getCacheKeyWithSDKKey$build_release(this.sdkKey));
        if (cache == null) {
            cache = this.cacheById.get(statsigUser.getCacheKeyDEPRECATED$build_release());
        }
        if (cache == null) {
            str = null;
        } else {
            str = cache.getUserHash();
        }
        if (!AbstractC3557B.K(str, statsigUser.toHashString$build_release()) || cache == null) {
            return null;
        }
        return Long.valueOf(cache.getValues().getTime());
    }

    public final Layer getLayer(StatsigClient statsigClient, String str, boolean z10) {
        APIDynamicConfig aPIDynamicConfig;
        AbstractC3557B.c0("layerName", str);
        Map<String, Object> map = this.localOverrides.getLayers().get(str);
        boolean z11 = false;
        if (map != null) {
            return new Layer(null, str, getEvaluationDetails$build_release(false, EvaluationReason.LocalOverride), map, "override", null, null, null, false, false, false, null, null, 8160, null);
        }
        String hashedString = Hashing.INSTANCE.getHashedString(str, this.currentCache.getValues().getHashUsed());
        Map<String, APIDynamicConfig> layerConfigs = this.currentCache.getValues().getLayerConfigs();
        if (layerConfigs == null) {
            aPIDynamicConfig = null;
        } else {
            aPIDynamicConfig = layerConfigs.get(hashedString);
        }
        if (aPIDynamicConfig != null) {
            z11 = true;
        }
        EvaluationDetails evaluationDetails$build_release$default = getEvaluationDetails$build_release$default(this, z11, null, 2, null);
        APIDynamicConfig possiblyStickyValue = getPossiblyStickyValue(str, aPIDynamicConfig, z10, evaluationDetails$build_release$default, true);
        if (possiblyStickyValue != null) {
            return new Layer(statsigClient, str, possiblyStickyValue, evaluationDetails$build_release$default);
        }
        return new Layer(statsigClient, str, evaluationDetails$build_release$default, null, null, null, null, null, false, false, false, null, null, 8184, null);
    }

    public final Map<String, String> getPreviousDerivedFields(StatsigUser statsigUser) {
        String str;
        AbstractC3557B.c0("user", statsigUser);
        Cache cache = this.cacheById.get(statsigUser.getCacheKeyWithSDKKey$build_release(this.sdkKey));
        if (cache == null) {
            cache = this.cacheById.get(statsigUser.getCacheKeyDEPRECATED$build_release());
        }
        Map<String, String> map = null;
        if (cache == null) {
            str = null;
        } else {
            str = cache.getUserHash();
        }
        boolean K10 = AbstractC3557B.K(str, statsigUser.toHashString$build_release());
        w wVar = w.f37484Y;
        if (!K10) {
            return wVar;
        }
        if (cache != null) {
            map = cache.getValues().getDerivedFields();
        }
        if (map != null) {
            return map;
        }
        return wVar;
    }

    public final EvaluationReason getReason() {
        return this.reason;
    }

    public final void loadAndResetForUser(StatsigUser statsigUser) {
        AbstractC3557B.c0("user", statsigUser);
        this.reason = EvaluationReason.Uninitialized;
        this.currentUserCacheKeyDeprecated = statsigUser.getCacheKeyDEPRECATED$build_release();
        this.currentUserCacheKeyV2 = statsigUser.getCacheKeyWithSDKKey$build_release(this.sdkKey);
        this.currentCache = loadCacheForCurrentUser();
    }

    public final void overrideConfig(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0("configName", str);
        AbstractC3557B.c0("value", map);
        this.localOverrides.getConfigs().put(str, map);
    }

    public final void overrideGate(String str, boolean z10) {
        AbstractC3557B.c0("gateName", str);
        this.localOverrides.getGates().put(str, Boolean.valueOf(z10));
    }

    public final void overrideLayer(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0("layerName", str);
        AbstractC3557B.c0("value", map);
        this.localOverrides.getLayers().put(str, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistStickyValues(AbstractC4825e abstractC4825e) {
        Store$persistStickyValues$1 store$persistStickyValues$1;
        EnumC5000a enumC5000a;
        int i10;
        Store store;
        StatsigUtil statsigUtil;
        SharedPreferences sharedPreferences;
        String i11;
        if (abstractC4825e instanceof Store$persistStickyValues$1) {
            store$persistStickyValues$1 = (Store$persistStickyValues$1) abstractC4825e;
            int i12 = store$persistStickyValues$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                store$persistStickyValues$1.label = i12 - Integer.MIN_VALUE;
                Object obj = store$persistStickyValues$1.result;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = store$persistStickyValues$1.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    store = (Store) store$persistStickyValues$1.L$0;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    StatsigUtil statsigUtil2 = StatsigUtil.INSTANCE;
                    SharedPreferences sharedPreferences2 = this.sharedPrefs;
                    String i13 = this.gson.i(this.cacheById);
                    AbstractC3557B.b0("gson.toJson(cacheById)", i13);
                    store$persistStickyValues$1.L$0 = this;
                    store$persistStickyValues$1.label = 1;
                    if (statsigUtil2.saveStringToSharedPrefs$build_release(sharedPreferences2, "Statsig.CACHE_BY_USER", i13, store$persistStickyValues$1) == enumC5000a) {
                        return enumC5000a;
                    }
                    store = this;
                }
                statsigUtil = StatsigUtil.INSTANCE;
                sharedPreferences = store.sharedPrefs;
                i11 = store.gson.i(store.stickyDeviceExperiments);
                AbstractC3557B.b0("gson.toJson(stickyDeviceExperiments)", i11);
                store$persistStickyValues$1.L$0 = null;
                store$persistStickyValues$1.label = 2;
                if (statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, "Statsig.STICKY_DEVICE_EXPERIMENTS", i11, store$persistStickyValues$1) == enumC5000a) {
                    return enumC5000a;
                }
                return y.f36177a;
            }
        }
        store$persistStickyValues$1 = new Store$persistStickyValues$1(this, abstractC4825e);
        Object obj2 = store$persistStickyValues$1.result;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = store$persistStickyValues$1.label;
        if (i10 == 0) {
        }
        statsigUtil = StatsigUtil.INSTANCE;
        sharedPreferences = store.sharedPrefs;
        i11 = store.gson.i(store.stickyDeviceExperiments);
        AbstractC3557B.b0("gson.toJson(stickyDeviceExperiments)", i11);
        store$persistStickyValues$1.L$0 = null;
        store$persistStickyValues$1.label = 2;
        if (statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, "Statsig.STICKY_DEVICE_EXPERIMENTS", i11, store$persistStickyValues$1) == enumC5000a) {
        }
        return y.f36177a;
    }

    public final void removeAllOverrides() {
        this.localOverrides = StatsigOverrides.Companion.empty();
    }

    public final void removeOverride(String str) {
        AbstractC3557B.c0("name", str);
        this.localOverrides.getConfigs().remove(str);
        this.localOverrides.getGates().remove(str);
        this.localOverrides.getLayers().remove(str);
    }

    public final Object save(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, StatsigUser statsigUser, AbstractC4825e abstractC4825e) {
        EvaluationReason evaluationReason;
        String cacheKeyWithSDKKey$build_release = statsigUser.getCacheKeyWithSDKKey$build_release(this.sdkKey);
        Cache cache = this.cacheById.get(cacheKeyWithSDKKey$build_release);
        if (cache == null) {
            cache = createEmptyCache();
        }
        AbstractC3557B.b0("cacheById[cacheKey] ?: createEmptyCache()", cache);
        cache.setValues(successfulInitializeResponse);
        cache.setEvaluationTime(new Long(System.currentTimeMillis()));
        cache.setUserHash(statsigUser.toHashString$build_release());
        this.cacheById.put(cacheKeyWithSDKKey$build_release, cache);
        if (AbstractC3557B.K(cacheKeyWithSDKKey$build_release, this.currentUserCacheKeyV2)) {
            this.currentCache = cache;
            if (successfulInitializeResponse.getHasUpdates()) {
                evaluationReason = EvaluationReason.Network;
            } else {
                evaluationReason = EvaluationReason.NetworkNotModified;
            }
            setReason(evaluationReason);
        }
        this.cacheById.remove(statsigUser.getCacheKeyDEPRECATED$build_release());
        String i10 = this.gson.i(this.cacheById);
        if (i10.length() / 1024 > 1024 && this.cacheById.size() > 1) {
            ConcurrentHashMap<String, Cache> concurrentHashMap = new ConcurrentHashMap<>();
            this.cacheById = concurrentHashMap;
            concurrentHashMap.put(this.currentUserCacheKeyV2, this.currentCache);
            i10 = this.gson.i(this.cacheById);
        }
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPrefs;
        AbstractC3557B.b0("cacheString", i10);
        Object saveStringToSharedPrefs$build_release = statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, "Statsig.CACHE_BY_USER", i10, abstractC4825e);
        if (saveStringToSharedPrefs$build_release == EnumC5000a.f41328Y) {
            return saveStringToSharedPrefs$build_release;
        }
        return y.f36177a;
    }

    public final Object saveOverridesToLocalStorage(AbstractC4825e abstractC4825e) {
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        SharedPreferences sharedPreferences = this.sharedPrefs;
        String i10 = this.gson.i(this.localOverrides);
        AbstractC3557B.b0("gson.toJson(localOverrides)", i10);
        Object saveStringToSharedPrefs$build_release = statsigUtil.saveStringToSharedPrefs$build_release(sharedPreferences, "Statsig.LOCAL_OVERRIDES", i10, abstractC4825e);
        if (saveStringToSharedPrefs$build_release == EnumC5000a.f41328Y) {
            return saveStringToSharedPrefs$build_release;
        }
        return y.f36177a;
    }

    public final void setReason(EvaluationReason evaluationReason) {
        AbstractC3557B.c0("<set-?>", evaluationReason);
        this.reason = evaluationReason;
    }

    public final void syncLoadFromLocalStorage() {
        StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
        String syncGetFromSharedPrefs$build_release = statsigUtil.syncGetFromSharedPrefs$build_release(this.sharedPrefs, "Statsig.CACHE_BY_USER");
        String syncGetFromSharedPrefs$build_release2 = statsigUtil.syncGetFromSharedPrefs$build_release(this.sharedPrefs, "Statsig.STICKY_DEVICE_EXPERIMENTS");
        String syncGetFromSharedPrefs$build_release3 = statsigUtil.syncGetFromSharedPrefs$build_release(this.sharedPrefs, "Statsig.LOCAL_OVERRIDES");
        if (syncGetFromSharedPrefs$build_release != null) {
            Type type = new TypeToken<Map<String, Cache>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$1
            }.getType();
            try {
                n nVar = this.gson;
                nVar.getClass();
                Object d10 = nVar.d(new StringReader(syncGetFromSharedPrefs$build_release), TypeToken.get(type));
                AbstractC3557B.b0("gson.fromJson(cachedResponse, type)", d10);
                this.cacheById = new ConcurrentHashMap<>((Map) d10);
            } catch (Exception unused) {
                l.O0(this.statsigScope, this.dispatcherProvider.getIo(), null, new Store$syncLoadFromLocalStorage$1(this, null), 2);
            }
        }
        this.stickyDeviceExperiments = new ConcurrentHashMap<>();
        if (syncGetFromSharedPrefs$build_release2 != null) {
            Type type2 = new TypeToken<Map<String, APIDynamicConfig>>() { // from class: com.statsig.androidsdk.Store$syncLoadFromLocalStorage$type$2
            }.getType();
            try {
                n nVar2 = this.gson;
                nVar2.getClass();
                Object d11 = nVar2.d(new StringReader(syncGetFromSharedPrefs$build_release2), TypeToken.get(type2));
                AbstractC3557B.b0("gson.fromJson(cachedDeviceValues, type)", d11);
                this.stickyDeviceExperiments = new ConcurrentHashMap<>((Map) d11);
            } catch (Exception unused2) {
                l.O0(this.statsigScope, this.dispatcherProvider.getIo(), null, new Store$syncLoadFromLocalStorage$2(this, null), 2);
            }
        }
        this.localOverrides = StatsigOverrides.Companion.empty();
        if (syncGetFromSharedPrefs$build_release3 != null) {
            try {
                Object e10 = this.gson.e(StatsigOverrides.class, syncGetFromSharedPrefs$build_release3);
                AbstractC3557B.b0("gson.fromJson(cachedLocalOverrides, StatsigOverrides::class.java)", e10);
                this.localOverrides = (StatsigOverrides) e10;
            } catch (Exception unused3) {
                l.O0(this.statsigScope, this.dispatcherProvider.getIo(), null, new Store$syncLoadFromLocalStorage$3(this, null), 2);
            }
        }
        this.currentCache = loadCacheForCurrentUser();
    }
}
