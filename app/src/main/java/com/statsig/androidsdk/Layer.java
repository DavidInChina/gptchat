package com.statsig.androidsdk;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kf.q;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 S2\u00020\u0001:\u0001SB\u00c3\u0001\b\u0000\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020(\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0002\u0012\u001a\b\u0002\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\u001b\u0012\u001a\b\u0002\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\u001b\u0012\b\b\u0002\u0010E\u001a\u00020\u000f\u0012\b\b\u0002\u0010G\u001a\u00020\u000f\u0012\b\b\u0002\u0010H\u001a\u00020\u000f\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000104\u00a2\u0006\u0004\bL\u0010MB+\b\u0010\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010Q\u001a\u00020(\u00a2\u0006\u0004\bL\u0010RJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0007\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\tH\u0082\b\u00a2\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0018\u00a2\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b\u00a2\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0002\u00a2\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f\u00a2\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000f\u00a2\u0006\u0004\b'\u0010&J\r\u0010)\u001a\u00020(\u00a2\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0002\u00a2\u0006\u0004\b+\u0010$J\u000f\u0010,\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b,\u0010$J!\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\u001bH\u0000\u00a2\u0006\u0004\b-\u0010.J!\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\u001bH\u0000\u00a2\u0006\u0004\b0\u0010.J\u0011\u00103\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\b2\u0010$J\u0017\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000104H\u0000\u00a2\u0006\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010>R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010?R\u0014\u0010@\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010<R\u0016\u0010A\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010<R&\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010I\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010<R\u001c\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010K\u00a8\u0006T"}, d2 = {"Lcom/statsig/androidsdk/Layer;", "", "", SubscriberAttributeKt.JSON_NAME_KEY, "Ljf/y;", "logParameterExposure", "(Ljava/lang/String;)V", TokenNames.T, "default", "", "jsonValue", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getDouble", "(Ljava/lang/String;D)D", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "", "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getName", "()Ljava/lang/String;", "getIsUserInExperiment", "()Z", "getIsExperimentActive", "Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getRuleID", "getGroupName", "getSecondaryExposures$build_release", "()[Ljava/util/Map;", "getSecondaryExposures", "getUndelegatedSecondaryExposures$build_release", "getUndelegatedSecondaryExposures", "getAllocatedExperimentName$build_release", "getAllocatedExperimentName", "", "getExplicitParameters$build_release", "()Ljava/util/Set;", "getExplicitParameters", "Lcom/statsig/androidsdk/StatsigClient;", "client", "Lcom/statsig/androidsdk/StatsigClient;", "name", "Ljava/lang/String;", "details", "Lcom/statsig/androidsdk/EvaluationDetails;", "Ljava/util/Map;", "rule", "groupName", "secondaryExposures", "[Ljava/util/Map;", "undelegatedSecondaryExposures", "isUserInExperiment", "Z", "isExperimentActive", "isDeviceBased", "allocatedExperimentName", "explicitParameters", "Ljava/util/Set;", "<init>", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;[Ljava/util/Map;ZZZLjava/lang/String;Ljava/util/Set;)V", "layerName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "apiDynamicConfig", "evalDetails", "(Lcom/statsig/androidsdk/StatsigClient;Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;Lcom/statsig/androidsdk/EvaluationDetails;)V", "Companion", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Layer {
    public static final Companion Companion = new Companion(null);
    private final String allocatedExperimentName;
    private final StatsigClient client;
    private final EvaluationDetails details;
    private final Set<String> explicitParameters;
    private final String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final Map<String, Object> jsonValue;
    private final String name;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;
    private final Map<String, String>[] undelegatedSecondaryExposures;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/Layer$Companion;", "", "()V", "getUninitialized", "Lcom/statsig/androidsdk/Layer;", "name", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Layer getUninitialized(String str) {
            AbstractC3557B.c0("name", str);
            return new Layer(null, str, new EvaluationDetails(EvaluationReason.Uninitialized, 0L, 2, null), null, null, null, null, null, false, false, false, null, null, 8184, null);
        }
    }

    public Layer(StatsigClient statsigClient, String str, EvaluationDetails evaluationDetails, Map<String, ? extends Object> map, String str2, String str3, Map<String, String>[] mapArr, Map<String, String>[] mapArr2, boolean z10, boolean z11, boolean z12, String str4, Set<String> set) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("details", evaluationDetails);
        AbstractC3557B.c0("jsonValue", map);
        AbstractC3557B.c0("rule", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        AbstractC3557B.c0("undelegatedSecondaryExposures", mapArr2);
        this.client = statsigClient;
        this.name = str;
        this.details = evaluationDetails;
        this.jsonValue = map;
        this.rule = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.undelegatedSecondaryExposures = mapArr2;
        this.isUserInExperiment = z10;
        this.isExperimentActive = z11;
        this.isDeviceBased = z12;
        this.allocatedExperimentName = str4;
        this.explicitParameters = set;
    }

    private final Object get(String str, Object obj, Map map) {
        map.get(str);
        AbstractC3557B.B2();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logParameterExposure(String str) {
        StatsigClient statsigClient = this.client;
        if (statsigClient != null) {
            StatsigClient.logLayerParameterExposure$build_release$default(statsigClient, this, str, false, 4, null);
        }
    }

    public final String getAllocatedExperimentName$build_release() {
        return this.allocatedExperimentName;
    }

    public final Object[] getArray(String str, Object[] objArr) {
        Object[] objArr2;
        ArrayList arrayList;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        Object[] objArr3 = null;
        if (obj instanceof Object[]) {
            objArr2 = (Object[]) obj;
        } else {
            objArr2 = null;
        }
        if (objArr2 == null) {
            Object obj2 = this.jsonValue.get(str);
            if (obj2 instanceof ArrayList) {
                arrayList = (ArrayList) obj2;
            } else {
                arrayList = null;
            }
            if (arrayList == null || (objArr3 = arrayList.toArray(new Object[0])) != null) {
                objArr2 = objArr3;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        if (objArr2 != null) {
            logParameterExposure(str);
        }
        if (objArr2 != null) {
            return objArr2;
        }
        return objArr;
    }

    public final boolean getBoolean(String str, boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Boolean valueOf = Boolean.valueOf(z10);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            logParameterExposure(str);
        }
        if (bool != null) {
            valueOf = bool;
        }
        return valueOf.booleanValue();
    }

    public final DynamicConfig getConfig(String str) {
        Map map;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            logParameterExposure(str);
        }
        if (map2 == null) {
            map = null;
        } else {
            map = map2;
        }
        if (map == null) {
            return null;
        }
        return new DynamicConfig(str, this.details, map, this.rule, this.groupName, null, false, false, false, null, 992, null);
    }

    public final Map<String, Object> getDictionary(String str, Map<String, ? extends Object> map) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map<String, Object> map2 = (Map) obj;
        if (map2 != null) {
            logParameterExposure(str);
        }
        if (map2 != null) {
            return map2;
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Number] */
    public final double getDouble(String str, double d10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Double valueOf = Double.valueOf(d10);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        ?? r42 = (Number) obj;
        if (r42 != 0) {
            logParameterExposure(str);
        }
        if (r42 != 0) {
            valueOf = r42;
        }
        return valueOf.doubleValue();
    }

    public final EvaluationDetails getEvaluationDetails() {
        return this.details;
    }

    public final Set<String> getExplicitParameters$build_release() {
        return this.explicitParameters;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Number] */
    public final int getInt(String str, int i10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Integer valueOf = Integer.valueOf(i10);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        ?? r02 = (Number) obj;
        if (r02 != 0) {
            logParameterExposure(str);
        }
        if (r02 != 0) {
            valueOf = r02;
        }
        return valueOf.intValue();
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Number] */
    public final long getLong(String str, long j6) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Long valueOf = Long.valueOf(j6);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        ?? r42 = (Number) obj;
        if (r42 != 0) {
            logParameterExposure(str);
        }
        if (r42 != 0) {
            valueOf = r42;
        }
        return valueOf.longValue();
    }

    public final String getName() {
        return this.name;
    }

    public final String getRuleID() {
        return this.rule;
    }

    public final Map<String, String>[] getSecondaryExposures$build_release() {
        return this.secondaryExposures;
    }

    public final String getString(String str, String str2) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str3 = (String) obj;
        if (str3 != null) {
            logParameterExposure(str);
        }
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public final Map<String, String>[] getUndelegatedSecondaryExposures$build_release() {
        return this.undelegatedSecondaryExposures;
    }

    public /* synthetic */ Layer(StatsigClient statsigClient, String str, EvaluationDetails evaluationDetails, Map map, String str2, String str3, Map[] mapArr, Map[] mapArr2, boolean z10, boolean z11, boolean z12, String str4, Set set, int i10, g gVar) {
        this(statsigClient, str, evaluationDetails, (i10 & 8) != 0 ? w.f37484Y : map, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? new Map[0] : mapArr, (i10 & 128) != 0 ? new Map[0] : mapArr2, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12, (i10 & 2048) != 0 ? null : str4, (i10 & 4096) != 0 ? null : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Layer(StatsigClient statsigClient, String str, APIDynamicConfig aPIDynamicConfig, EvaluationDetails evaluationDetails) {
        this(statsigClient, str, evaluationDetails, r5, r6, r7, r8, r9, r10, r11, r12, r13, r0 == null ? null : q.B3(r0));
        AbstractC3557B.c0("layerName", str);
        AbstractC3557B.c0("apiDynamicConfig", aPIDynamicConfig);
        AbstractC3557B.c0("evalDetails", evaluationDetails);
        Map<String, Object> value = aPIDynamicConfig.getValue();
        String ruleID = aPIDynamicConfig.getRuleID();
        String groupName = aPIDynamicConfig.getGroupName();
        Map<String, String>[] secondaryExposures = aPIDynamicConfig.getSecondaryExposures();
        Map<String, String>[] undelegatedSecondaryExposures = aPIDynamicConfig.getUndelegatedSecondaryExposures();
        boolean isUserInExperiment = aPIDynamicConfig.isUserInExperiment();
        boolean isExperimentActive = aPIDynamicConfig.isExperimentActive();
        boolean isDeviceBased = aPIDynamicConfig.isDeviceBased();
        String allocatedExperimentName = aPIDynamicConfig.getAllocatedExperimentName();
        String[] explicitParameters = aPIDynamicConfig.getExplicitParameters();
    }
}
