package com.statsig.androidsdk;

import J8.b;
import id.AbstractC3557B;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse;", "", "()V", "FailedInitializeResponse", "SuccessfulInitializeResponse", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public abstract class InitializeResponse {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse;", "reason", "Lcom/statsig/androidsdk/InitializeFailReason;", "exception", "Ljava/lang/Exception;", "statusCode", "", "(Lcom/statsig/androidsdk/InitializeFailReason;Ljava/lang/Exception;Ljava/lang/Integer;)V", "getException", "()Ljava/lang/Exception;", "getReason", "()Lcom/statsig/androidsdk/InitializeFailReason;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/statsig/androidsdk/InitializeFailReason;Ljava/lang/Exception;Ljava/lang/Integer;)Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "equals", "", "other", "", "hashCode", "toString", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class FailedInitializeResponse extends InitializeResponse {
        @b("exception")
        private final Exception exception;
        @b("reason")
        private final InitializeFailReason reason;
        @b("statusCode")
        private final Integer statusCode;

        public /* synthetic */ FailedInitializeResponse(InitializeFailReason initializeFailReason, Exception exc, Integer num, int i10, g gVar) {
            this(initializeFailReason, (i10 & 2) != 0 ? null : exc, (i10 & 4) != 0 ? null : num);
        }

        public static /* synthetic */ FailedInitializeResponse copy$default(FailedInitializeResponse failedInitializeResponse, InitializeFailReason initializeFailReason, Exception exc, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                initializeFailReason = failedInitializeResponse.reason;
            }
            if ((i10 & 2) != 0) {
                exc = failedInitializeResponse.exception;
            }
            if ((i10 & 4) != 0) {
                num = failedInitializeResponse.statusCode;
            }
            return failedInitializeResponse.copy(initializeFailReason, exc, num);
        }

        public final InitializeFailReason component1() {
            return this.reason;
        }

        public final Exception component2() {
            return this.exception;
        }

        public final Integer component3() {
            return this.statusCode;
        }

        public final FailedInitializeResponse copy(InitializeFailReason initializeFailReason, Exception exc, Integer num) {
            AbstractC3557B.c0("reason", initializeFailReason);
            return new FailedInitializeResponse(initializeFailReason, exc, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FailedInitializeResponse)) {
                return false;
            }
            FailedInitializeResponse failedInitializeResponse = (FailedInitializeResponse) obj;
            return this.reason == failedInitializeResponse.reason && AbstractC3557B.K(this.exception, failedInitializeResponse.exception) && AbstractC3557B.K(this.statusCode, failedInitializeResponse.statusCode);
        }

        public final Exception getException() {
            return this.exception;
        }

        public final InitializeFailReason getReason() {
            return this.reason;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            Exception exc = this.exception;
            int i10 = 0;
            int hashCode2 = (hashCode + (exc == null ? 0 : exc.hashCode())) * 31;
            Integer num = this.statusCode;
            if (num != null) {
                i10 = num.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "FailedInitializeResponse(reason=" + this.reason + ", exception=" + this.exception + ", statusCode=" + this.statusCode + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedInitializeResponse(InitializeFailReason initializeFailReason, Exception exc, Integer num) {
            super(null);
            AbstractC3557B.c0("reason", initializeFailReason);
            this.reason = initializeFailReason;
            this.exception = exc;
            this.statusCode = num;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001By\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\t\u0010#\u001a\u00020\u000eH\u00c6\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0089\u0001\u0010%\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0004H\u00d6\u0001R$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R,\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse;", "featureGates", "", "", "Lcom/statsig/androidsdk/APIFeatureGate;", "configs", "Lcom/statsig/androidsdk/APIDynamicConfig;", "layerConfigs", "hasUpdates", "", "hashUsed", "Lcom/statsig/androidsdk/HashAlgorithm;", "time", "", "derivedFields", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZLcom/statsig/androidsdk/HashAlgorithm;JLjava/util/Map;)V", "getConfigs", "()Ljava/util/Map;", "getDerivedFields", "getFeatureGates", "getHasUpdates", "()Z", "getHashUsed", "()Lcom/statsig/androidsdk/HashAlgorithm;", "getLayerConfigs", "setLayerConfigs", "(Ljava/util/Map;)V", "getTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class SuccessfulInitializeResponse extends InitializeResponse {
        @b("dynamic_configs")
        private final Map<String, APIDynamicConfig> configs;
        @b("derived_fields")
        private final Map<String, String> derivedFields;
        @b("feature_gates")
        private final Map<String, APIFeatureGate> featureGates;
        @b("has_updates")
        private final boolean hasUpdates;
        @b("hash_used")
        private final HashAlgorithm hashUsed;
        @b("layer_configs")
        private Map<String, APIDynamicConfig> layerConfigs;
        @b("time")
        private final long time;

        public /* synthetic */ SuccessfulInitializeResponse(Map map, Map map2, Map map3, boolean z10, HashAlgorithm hashAlgorithm, long j6, Map map4, int i10, g gVar) {
            this(map, map2, map3, z10, (i10 & 16) != 0 ? null : hashAlgorithm, j6, map4);
        }

        public final Map<String, APIFeatureGate> component1() {
            return this.featureGates;
        }

        public final Map<String, APIDynamicConfig> component2() {
            return this.configs;
        }

        public final Map<String, APIDynamicConfig> component3() {
            return this.layerConfigs;
        }

        public final boolean component4() {
            return this.hasUpdates;
        }

        public final HashAlgorithm component5() {
            return this.hashUsed;
        }

        public final long component6() {
            return this.time;
        }

        public final Map<String, String> component7() {
            return this.derivedFields;
        }

        public final SuccessfulInitializeResponse copy(Map<String, APIFeatureGate> map, Map<String, APIDynamicConfig> map2, Map<String, APIDynamicConfig> map3, boolean z10, HashAlgorithm hashAlgorithm, long j6, Map<String, String> map4) {
            return new SuccessfulInitializeResponse(map, map2, map3, z10, hashAlgorithm, j6, map4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessfulInitializeResponse)) {
                return false;
            }
            SuccessfulInitializeResponse successfulInitializeResponse = (SuccessfulInitializeResponse) obj;
            return AbstractC3557B.K(this.featureGates, successfulInitializeResponse.featureGates) && AbstractC3557B.K(this.configs, successfulInitializeResponse.configs) && AbstractC3557B.K(this.layerConfigs, successfulInitializeResponse.layerConfigs) && this.hasUpdates == successfulInitializeResponse.hasUpdates && this.hashUsed == successfulInitializeResponse.hashUsed && this.time == successfulInitializeResponse.time && AbstractC3557B.K(this.derivedFields, successfulInitializeResponse.derivedFields);
        }

        public final Map<String, APIDynamicConfig> getConfigs() {
            return this.configs;
        }

        public final Map<String, String> getDerivedFields() {
            return this.derivedFields;
        }

        public final Map<String, APIFeatureGate> getFeatureGates() {
            return this.featureGates;
        }

        public final boolean getHasUpdates() {
            return this.hasUpdates;
        }

        public final HashAlgorithm getHashUsed() {
            return this.hashUsed;
        }

        public final Map<String, APIDynamicConfig> getLayerConfigs() {
            return this.layerConfigs;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            Map<String, APIFeatureGate> map = this.featureGates;
            int i10 = 0;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, APIDynamicConfig> map2 = this.configs;
            int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, APIDynamicConfig> map3 = this.layerConfigs;
            int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
            boolean z10 = this.hasUpdates;
            if (z10) {
                z10 = true;
            }
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            int i13 = (hashCode3 + i11) * 31;
            HashAlgorithm hashAlgorithm = this.hashUsed;
            int hashCode4 = hashAlgorithm == null ? 0 : hashAlgorithm.hashCode();
            long j6 = this.time;
            int i14 = (((i13 + hashCode4) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            Map<String, String> map4 = this.derivedFields;
            if (map4 != null) {
                i10 = map4.hashCode();
            }
            return i14 + i10;
        }

        public final void setLayerConfigs(Map<String, APIDynamicConfig> map) {
            this.layerConfigs = map;
        }

        public String toString() {
            return "SuccessfulInitializeResponse(featureGates=" + this.featureGates + ", configs=" + this.configs + ", layerConfigs=" + this.layerConfigs + ", hasUpdates=" + this.hasUpdates + ", hashUsed=" + this.hashUsed + ", time=" + this.time + ", derivedFields=" + this.derivedFields + ')';
        }

        public SuccessfulInitializeResponse(Map<String, APIFeatureGate> map, Map<String, APIDynamicConfig> map2, Map<String, APIDynamicConfig> map3, boolean z10, HashAlgorithm hashAlgorithm, long j6, Map<String, String> map4) {
            super(null);
            this.featureGates = map;
            this.configs = map2;
            this.layerConfigs = map3;
            this.hasUpdates = z10;
            this.hashUsed = hashAlgorithm;
            this.time = j6;
            this.derivedFields = map4;
        }
    }

    private InitializeResponse() {
    }

    public /* synthetic */ InitializeResponse(g gVar) {
        this();
    }
}
