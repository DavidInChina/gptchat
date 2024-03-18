package com.statsig.androidsdk;

import Ad.l;
import I8.n;
import Ng.AbstractC1055c0;
import Ng.AbstractC1073l0;
import Ng.C1057d0;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jf.C3959i;
import jf.C3961k;
import jf.y;
import kf.AbstractC4268D;
import kf.q;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;

@Metadata(d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020 \u0012\u0006\u0010F\u001a\u00020E\u00a2\u0006\u0004\b\\\u0010]J7\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0016J\u0013\u0010\u001b\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\"\u0010#J-\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\"\u0010&Ji\u00101\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u00032\u0018\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030*0)2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00052\u0006\u00100\u001a\u00020/2\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\b3\u0010\u001cJ\u0019\u00105\u001a\u00020\u00142\n\b\u0002\u00104\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010M\u001a\n L*\u0004\u0018\u00010K0K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00110U8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bV\u0010WR\"\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020Y0X8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bZ\u0010[\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006^"}, d2 = {"Lcom/statsig/androidsdk/StatsigLogger;", "", "", "", "metadata", "", "isManual", "addManualFlag", "(Ljava/util/Map;Z)Ljava/util/Map;", SubscriberAttributeKt.JSON_NAME_KEY, "shouldLogExposure", "(Ljava/lang/String;)Z", "Lcom/statsig/androidsdk/ContextType;", "context", "", "Lcom/statsig/androidsdk/Marker;", "markers", "Lcom/statsig/androidsdk/LogEvent;", "makeDiagnosticsEvent", "(Lcom/statsig/androidsdk/ContextType;Ljava/util/Collection;)Lcom/statsig/androidsdk/LogEvent;", "Ljf/y;", "addErrorBoundaryDiagnostics", "()V", "event", "log", "(Lcom/statsig/androidsdk/LogEvent;Lnf/e;)Ljava/lang/Object;", "onUpdateUser", "flush", "(Lnf/e;)Ljava/lang/Object;", "name", "Lcom/statsig/androidsdk/FeatureGate;", "gate", "Lcom/statsig/androidsdk/StatsigUser;", "user", "logExposure", "(Ljava/lang/String;Lcom/statsig/androidsdk/FeatureGate;Lcom/statsig/androidsdk/StatsigUser;Z)V", "Lcom/statsig/androidsdk/DynamicConfig;", "config", "(Ljava/lang/String;Lcom/statsig/androidsdk/DynamicConfig;Lcom/statsig/androidsdk/StatsigUser;Z)V", "configName", "ruleID", "", "", "secondaryExposures", "allocatedExperiment", "parameterName", "isExplicitParameter", "Lcom/statsig/androidsdk/EvaluationDetails;", "details", "logLayerExposure", "(Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/String;Ljava/lang/String;ZLcom/statsig/androidsdk/EvaluationDetails;Z)V", "shutdown", "overrideContext", "logDiagnostics", "(Lcom/statsig/androidsdk/ContextType;)V", "LNg/F;", "coroutineScope", "LNg/F;", "sdkKey", "Ljava/lang/String;", "api", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigNetwork", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigUser", "Lcom/statsig/androidsdk/StatsigUser;", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "Lcom/statsig/androidsdk/Diagnostics;", "LI8/n;", "gson", "LI8/n;", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "executor", "Ljava/util/concurrent/ExecutorService;", "LNg/c0;", "singleThreadDispatcher", "LNg/c0;", "LNg/l0;", "timer", "LNg/l0;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "events", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "j$/util/concurrent/ConcurrentHashMap", "", "loggedExposures", "Lj$/util/concurrent/ConcurrentHashMap;", "<init>", "(LNg/F;Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigMetadata;Lcom/statsig/androidsdk/StatsigNetwork;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/Diagnostics;)V", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigLogger {
    private final String api;
    private final F coroutineScope;
    private final Diagnostics diagnostics;
    private final ExecutorService executor;
    private final String sdkKey;
    private final AbstractC1055c0 singleThreadDispatcher;
    private final StatsigMetadata statsigMetadata;
    private final StatsigNetwork statsigNetwork;
    private final StatsigUser statsigUser;
    private final AbstractC1073l0 timer;
    private final n gson = StatsigUtil.INSTANCE.getGson$build_release();
    private ConcurrentLinkedQueue<LogEvent> events = new ConcurrentLinkedQueue<>();
    private ConcurrentHashMap<String, Long> loggedExposures = new ConcurrentHashMap<>();

    public StatsigLogger(F f6, String str, String str2, StatsigMetadata statsigMetadata, StatsigNetwork statsigNetwork, StatsigUser statsigUser, Diagnostics diagnostics) {
        AbstractC3557B.c0("coroutineScope", f6);
        AbstractC3557B.c0("sdkKey", str);
        AbstractC3557B.c0("api", str2);
        AbstractC3557B.c0("statsigMetadata", statsigMetadata);
        AbstractC3557B.c0("statsigNetwork", statsigNetwork);
        AbstractC3557B.c0("statsigUser", statsigUser);
        AbstractC3557B.c0("diagnostics", diagnostics);
        this.coroutineScope = f6;
        this.sdkKey = str;
        this.api = str2;
        this.statsigMetadata = statsigMetadata;
        this.statsigNetwork = statsigNetwork;
        this.statsigUser = statsigUser;
        this.diagnostics = diagnostics;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.executor = newSingleThreadExecutor;
        AbstractC3557B.b0("executor", newSingleThreadExecutor);
        this.singleThreadDispatcher = new C1057d0(newSingleThreadExecutor);
        this.timer = l.O0(f6, null, null, new StatsigLogger$timer$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addErrorBoundaryDiagnostics() {
        Diagnostics diagnostics = this.diagnostics;
        ContextType contextType = ContextType.API_CALL;
        List<Marker> markers = diagnostics.getMarkers(contextType);
        if (markers.isEmpty()) {
            return;
        }
        this.events.add(makeDiagnosticsEvent(contextType, markers));
        this.diagnostics.clearContext(contextType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> addManualFlag(Map<String, String> map, boolean z10) {
        if (z10) {
            map.put("isManualExposure", "true");
        }
        return map;
    }

    public static /* synthetic */ void logDiagnostics$default(StatsigLogger statsigLogger, ContextType contextType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contextType = null;
        }
        statsigLogger.logDiagnostics(contextType);
    }

    private final LogEvent makeDiagnosticsEvent(ContextType contextType, Collection<Marker> collection) {
        LogEvent logEvent = new LogEvent(StatsigLoggerKt.DIAGNOSTICS_EVENT);
        logEvent.setUser(this.statsigUser);
        C3959i[] c3959iArr = new C3959i[2];
        String obj = contextType.toString();
        if (obj != null) {
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)", lowerCase);
            c3959iArr[0] = new C3959i("context", lowerCase);
            c3959iArr[1] = new C3959i("markers", this.gson.i(collection));
            logEvent.setMetadata(AbstractC4268D.a1(c3959iArr));
            return logEvent;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean shouldLogExposure(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l10 = this.loggedExposures.get(str);
        if (l10 == null) {
            l10 = 0L;
        }
        if (l10.longValue() >= currentTimeMillis - 600000) {
            return false;
        }
        this.loggedExposures.put(str, Long.valueOf(currentTimeMillis));
        return true;
    }

    public final Object flush(AbstractC4825e abstractC4825e) {
        Object n12 = l.n1(abstractC4825e, this.singleThreadDispatcher, new StatsigLogger$flush$2(this, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return y.f36177a;
    }

    public final Object log(LogEvent logEvent, AbstractC4825e abstractC4825e) {
        Object n12 = l.n1(abstractC4825e, this.singleThreadDispatcher, new StatsigLogger$log$2(this, logEvent, null));
        if (n12 == EnumC5000a.f41328Y) {
            return n12;
        }
        return y.f36177a;
    }

    public final void logDiagnostics(ContextType contextType) {
        if (contextType == null) {
            contextType = this.diagnostics.getDiagnosticsContext();
        }
        List<Marker> markers = this.diagnostics.getMarkers(contextType);
        if (markers.isEmpty()) {
            return;
        }
        l.O0(this.coroutineScope, this.singleThreadDispatcher, null, new StatsigLogger$logDiagnostics$1(this, makeDiagnosticsEvent(contextType, markers), null), 2);
        Diagnostics.clearContext$default(this.diagnostics, null, 1, null);
    }

    public final void logExposure(String str, FeatureGate featureGate, StatsigUser statsigUser, boolean z10) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("gate", featureGate);
        AbstractC3557B.c0("user", statsigUser);
        if (!shouldLogExposure(str + featureGate.getValue() + featureGate.getRuleID() + featureGate.getDetails().getReason())) {
            return;
        }
        l.O0(this.coroutineScope, this.singleThreadDispatcher, null, new StatsigLogger$logExposure$1(statsigUser, str, featureGate, this, z10, null), 2);
    }

    public final void logLayerExposure(String str, String str2, Map<String, String>[] mapArr, StatsigUser statsigUser, String str3, String str4, boolean z10, EvaluationDetails evaluationDetails, boolean z11) {
        AbstractC3557B.c0("configName", str);
        AbstractC3557B.c0("ruleID", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        AbstractC3557B.c0("allocatedExperiment", str3);
        AbstractC3557B.c0("parameterName", str4);
        AbstractC3557B.c0("details", evaluationDetails);
        LinkedHashMap c12 = AbstractC4268D.c1(new C3959i("config", str), new C3959i("ruleID", str2), new C3959i("allocatedExperiment", str3), new C3959i("parameterName", str4), new C3959i("isExplicitParameter", String.valueOf(z10)), new C3959i("reason", evaluationDetails.getReason().toString()), new C3959i("time", String.valueOf(evaluationDetails.getTime())));
        addManualFlag(c12, z11);
        if (!shouldLogExposure(q.r3(new String[]{str, str2, str3, str4, String.valueOf(z10), evaluationDetails.getReason().toString()}, "|", null, null, null, 62))) {
            return;
        }
        l.O0(this.coroutineScope, this.singleThreadDispatcher, null, new StatsigLogger$logLayerExposure$1(statsigUser, c12, mapArr, this, null), 2);
    }

    public final void onUpdateUser() {
        this.loggedExposures = new ConcurrentHashMap<>();
        this.diagnostics.clearAllContext();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:2|(2:4|(11:6|8|(1:(1:11)(2:12|13))(2:14|(1:16)(1:17))|18|29|19|(1:21)|23|25|(1:27)|28))|7|8|(0)(0)|18|29|19|(0)|23|25|(0)|28) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
        r6 = com.google.android.gms.internal.play_billing.N.w(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:19:0x004f, B:21:0x005b), top: B:29:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shutdown(AbstractC4825e abstractC4825e) {
        StatsigLogger$shutdown$1 statsigLogger$shutdown$1;
        int i10;
        StatsigLogger statsigLogger;
        Object obj;
        y yVar = y.f36177a;
        if (abstractC4825e instanceof StatsigLogger$shutdown$1) {
            statsigLogger$shutdown$1 = (StatsigLogger$shutdown$1) abstractC4825e;
            int i11 = statsigLogger$shutdown$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                statsigLogger$shutdown$1.label = i11 - Integer.MIN_VALUE;
                Object obj2 = statsigLogger$shutdown$1.result;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = statsigLogger$shutdown$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        statsigLogger = (StatsigLogger) statsigLogger$shutdown$1.L$0;
                        N.B0(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj2);
                    this.timer.k(null);
                    statsigLogger$shutdown$1.L$0 = this;
                    statsigLogger$shutdown$1.label = 1;
                    if (flush(statsigLogger$shutdown$1) == enumC5000a) {
                        return enumC5000a;
                    }
                    statsigLogger = this;
                }
                statsigLogger.executor.shutdown();
                if (!statsigLogger.executor.awaitTermination(3L, TimeUnit.SECONDS)) {
                    statsigLogger.executor.shutdownNow();
                }
                obj = yVar;
                if (C3961k.a(obj) != null) {
                    statsigLogger.executor.shutdownNow();
                }
                return yVar;
            }
        }
        statsigLogger$shutdown$1 = new StatsigLogger$shutdown$1(this, abstractC4825e);
        Object obj22 = statsigLogger$shutdown$1.result;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = statsigLogger$shutdown$1.label;
        if (i10 == 0) {
        }
        statsigLogger.executor.shutdown();
        if (!statsigLogger.executor.awaitTermination(3L, TimeUnit.SECONDS)) {
        }
        obj = yVar;
        if (C3961k.a(obj) != null) {
        }
        return yVar;
    }

    public final void logExposure(String str, DynamicConfig dynamicConfig, StatsigUser statsigUser, boolean z10) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("config", dynamicConfig);
        AbstractC3557B.c0("user", statsigUser);
        if (!shouldLogExposure(str + dynamicConfig.getRuleID() + dynamicConfig.getEvaluationDetails().getReason())) {
            return;
        }
        l.O0(this.coroutineScope, this.singleThreadDispatcher, null, new StatsigLogger$logExposure$2(statsigUser, str, dynamicConfig, this, z10, null), 2);
    }
}
