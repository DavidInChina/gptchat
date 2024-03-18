package com.statsig.androidsdk;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4267C;
import kf.t;
import kf.w;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 N2\u00020\u0001:\u0001NB\u0089\u0001\u0012\u0006\u00108\u001a\u00020\u0010\u0012\u0006\u0010:\u001a\u00020.\u0012\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\f\u0012\b\b\u0002\u0010>\u001a\u00020\u0010\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0010\u0012\u001a\b\u0002\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\f0 \u0012\b\b\u0002\u0010B\u001a\u00020\u0014\u0012\b\b\u0002\u0010D\u001a\u00020\u0014\u0012\b\b\u0002\u0010E\u001a\u00020\u0014\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\bG\u0010HB!\b\u0010\u0012\u0006\u0010I\u001a\u00020\u0010\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010L\u001a\u00020.\u00a2\u0006\u0004\bG\u0010MJ<\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0018\u00010\u0004\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0004H\u0082\b\u00a2\u0006\u0004\b\u0006\u0010\u0007J:\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0082\b\u00a2\u0006\u0004\b\b\u0010\tJR\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\"\u0006\b\u0000\u0010\n\u0018\u0001\"\u0006\b\u0001\u0010\u000b\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fH\u0082\b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001d\u00a2\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010 \u00a2\u0006\u0004\b!\u0010\"J9\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u00a2\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\f\u00a2\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0010\u00a2\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0014\u00a2\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0014\u00a2\u0006\u0004\b-\u0010,J\r\u0010/\u001a\u00020.\u00a2\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0010\u00a2\u0006\u0004\b1\u0010*J\u000f\u00102\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\b2\u0010*J!\u00105\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\f0 H\u0000\u00a2\u0006\u0004\b3\u00104J\u0011\u00107\u001a\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0004\b6\u0010*R\u0014\u00108\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u00109R\u0016\u0010?\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u00109R&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\f0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010F\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u00109\u00a8\u0006O"}, d2 = {"Lcom/statsig/androidsdk/DynamicConfig;", "", "A", "B", "", "Ljf/i;", "asListOfPairs", "(Ljava/util/List;)Ljava/util/List;", "asPairOf", "(Ljf/i;)Ljf/i;", TokenNames.f24314K, TokenNames.f24320V, "", "default", "asMapOf", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "", SubscriberAttributeKt.JSON_NAME_KEY, "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getDouble", "(Ljava/lang/String;D)D", "", "getInt", "(Ljava/lang/String;I)I", "", "getLong", "(Ljava/lang/String;J)J", "", "getArray", "(Ljava/lang/String;[Ljava/lang/Object;)[Ljava/lang/Object;", "getDictionary", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getValue", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "getIsUserInExperiment", "()Z", "getIsExperimentActive", "Lcom/statsig/androidsdk/EvaluationDetails;", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "getRuleID", "getGroupName", "getSecondaryExposures$build_release", "()[Ljava/util/Map;", "getSecondaryExposures", "getAllocatedExperimentName$build_release", "getAllocatedExperimentName", "name", "Ljava/lang/String;", "details", "Lcom/statsig/androidsdk/EvaluationDetails;", "jsonValue", "Ljava/util/Map;", "rule", "groupName", "secondaryExposures", "[Ljava/util/Map;", "isUserInExperiment", "Z", "isExperimentActive", "isDeviceBased", "allocatedExperimentName", "<init>", "(Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;ZZZLjava/lang/String;)V", "configName", "Lcom/statsig/androidsdk/APIDynamicConfig;", "apiDynamicConfig", "evalDetails", "(Ljava/lang/String;Lcom/statsig/androidsdk/APIDynamicConfig;Lcom/statsig/androidsdk/EvaluationDetails;)V", "Companion", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DynamicConfig {
    public static final Companion Companion = new Companion(null);
    private final String allocatedExperimentName;
    private final EvaluationDetails details;
    private final String groupName;
    private final boolean isDeviceBased;
    private final boolean isExperimentActive;
    private final boolean isUserInExperiment;
    private final Map<String, Object> jsonValue;
    private final String name;
    private final String rule;
    private final Map<String, String>[] secondaryExposures;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/DynamicConfig$Companion;", "", "()V", "getUninitialized", "Lcom/statsig/androidsdk/DynamicConfig;", "name", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final DynamicConfig getUninitialized(String str) {
            AbstractC3557B.c0("name", str);
            return new DynamicConfig(str, new EvaluationDetails(EvaluationReason.Uninitialized, 0L, 2, null), null, null, null, null, false, false, false, null, 1020, null);
        }
    }

    public DynamicConfig(String str, EvaluationDetails evaluationDetails, Map<String, ? extends Object> map, String str2, String str3, Map<String, String>[] mapArr, boolean z10, boolean z11, boolean z12, String str4) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("details", evaluationDetails);
        AbstractC3557B.c0("jsonValue", map);
        AbstractC3557B.c0("rule", str2);
        AbstractC3557B.c0("secondaryExposures", mapArr);
        this.name = str;
        this.details = evaluationDetails;
        this.jsonValue = map;
        this.rule = str2;
        this.groupName = str3;
        this.secondaryExposures = mapArr;
        this.isUserInExperiment = z10;
        this.isExperimentActive = z11;
        this.isDeviceBased = z12;
        this.allocatedExperimentName = str4;
    }

    private final List asListOfPairs(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C3959i) {
                Object obj2 = ((C3959i) obj).f36155Y;
                AbstractC3557B.B2();
                throw null;
            }
        }
        return arrayList;
    }

    private final Map asMapOf(Map map, Map map2) {
        t.e2(map.keySet());
        AbstractC3557B.B2();
        throw null;
    }

    public static Map asMapOf$default(DynamicConfig dynamicConfig, Map map, Map map2, int i10, Object obj) {
        t.e2(map.keySet());
        AbstractC3557B.B2();
        throw null;
    }

    private final C3959i asPairOf(C3959i c3959i) {
        Object obj = c3959i.f36155Y;
        AbstractC3557B.B2();
        throw null;
    }

    public final String getAllocatedExperimentName$build_release() {
        return this.allocatedExperimentName;
    }

    public final Object[] getArray(String str, Object[] objArr) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (obj instanceof Object[]) {
            return (Object[]) obj;
        }
        if (obj instanceof ArrayList) {
            Object[] array = ((Collection) obj).toArray(new Object[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return array;
        }
        return objArr;
    }

    public final boolean getBoolean(String str, boolean z10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        if (this.jsonValue.get(str) instanceof Boolean) {
            Object obj = this.jsonValue.get(str);
            if (obj != null) {
                return ((Boolean) obj).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DynamicConfig getConfig(String str) {
        LinkedHashMap linkedHashMap;
        C3959i c3959i;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (!(obj instanceof Map)) {
            return null;
        }
        Map map = (Map) obj;
        if ((t.e2(map.keySet()) instanceof String) && (t.e2(map.values()) instanceof Object)) {
            List n12 = AbstractC4267C.n1(map);
            ArrayList<C3959i> arrayList = new ArrayList();
            for (Object obj2 : n12) {
                if (obj2 instanceof C3959i) {
                    C3959i c3959i2 = (C3959i) obj2;
                    Object obj3 = c3959i2.f36155Y;
                    if (obj3 instanceof String) {
                        Object obj4 = c3959i2.f36156Z;
                        if (obj4 instanceof Object) {
                            if (obj3 != null) {
                                String str2 = (String) obj3;
                                if (obj4 != null) {
                                    c3959i = new C3959i(str2, obj4);
                                    if (c3959i == null) {
                                        arrayList.add(c3959i);
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                }
                c3959i = null;
                if (c3959i == null) {
                }
            }
            int n02 = P4.a.n0(AbstractC6583a.H1(arrayList, 10));
            if (n02 < 16) {
                n02 = 16;
            }
            linkedHashMap = new LinkedHashMap(n02);
            for (C3959i c3959i3 : arrayList) {
                linkedHashMap.put(c3959i3.f36155Y, c3959i3.f36156Z);
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        return new DynamicConfig(str, this.details, linkedHashMap, this.rule, this.groupName, null, false, false, false, null, 992, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, Object> getDictionary(String str, Map<String, ? extends Object> map) {
        C3959i c3959i;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            LinkedHashMap linkedHashMap = null;
            if ((t.e2(map2.keySet()) instanceof String) && (t.e2(map2.values()) instanceof Object)) {
                List n12 = AbstractC4267C.n1(map2);
                ArrayList<C3959i> arrayList = new ArrayList();
                for (Object obj2 : n12) {
                    if (obj2 instanceof C3959i) {
                        C3959i c3959i2 = (C3959i) obj2;
                        Object obj3 = c3959i2.f36155Y;
                        if (obj3 instanceof String) {
                            Object obj4 = c3959i2.f36156Z;
                            if (obj4 instanceof Object) {
                                if (obj3 != null) {
                                    String str2 = (String) obj3;
                                    if (obj4 != null) {
                                        c3959i = new C3959i(str2, obj4);
                                        if (c3959i == null) {
                                            arrayList.add(c3959i);
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                    }
                    c3959i = null;
                    if (c3959i == null) {
                    }
                }
                int n02 = P4.a.n0(AbstractC6583a.H1(arrayList, 10));
                if (n02 < 16) {
                    n02 = 16;
                }
                linkedHashMap = new LinkedHashMap(n02);
                for (C3959i c3959i3 : arrayList) {
                    linkedHashMap.put(c3959i3.f36155Y, c3959i3.f36156Z);
                }
            }
            return linkedHashMap;
        }
        return map;
    }

    public final double getDouble(String str, double d10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return d10;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return this.details;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getInt(String str, int i10) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i10;
    }

    public final boolean getIsExperimentActive() {
        return this.isExperimentActive;
    }

    public final boolean getIsUserInExperiment() {
        return this.isUserInExperiment;
    }

    public final long getLong(String str, long j6) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        Object obj = this.jsonValue.get(str);
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return j6;
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
        if (this.jsonValue.get(str) instanceof String) {
            Object obj = this.jsonValue.get(str);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return str2;
    }

    public final Map<String, Object> getValue() {
        return this.jsonValue;
    }

    public /* synthetic */ DynamicConfig(String str, EvaluationDetails evaluationDetails, Map map, String str2, String str3, Map[] mapArr, boolean z10, boolean z11, boolean z12, String str4, int i10, g gVar) {
        this(str, evaluationDetails, (i10 & 4) != 0 ? w.f37484Y : map, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? new Map[0] : mapArr, (i10 & 64) != 0 ? false : z10, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicConfig(String str, APIDynamicConfig aPIDynamicConfig, EvaluationDetails evaluationDetails) {
        this(str, evaluationDetails, aPIDynamicConfig.getValue(), aPIDynamicConfig.getRuleID(), aPIDynamicConfig.getGroupName(), aPIDynamicConfig.getSecondaryExposures(), aPIDynamicConfig.isUserInExperiment(), aPIDynamicConfig.isExperimentActive(), aPIDynamicConfig.isDeviceBased(), aPIDynamicConfig.getAllocatedExperimentName());
        AbstractC3557B.c0("configName", str);
        AbstractC3557B.c0("apiDynamicConfig", aPIDynamicConfig);
        AbstractC3557B.c0("evalDetails", evaluationDetails);
    }
}
