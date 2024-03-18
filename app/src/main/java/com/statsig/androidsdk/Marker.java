package com.statsig.androidsdk;

import J8.b;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bM\b\u0086\b\u0018\u00002\u00020\u0001:\u0001gB\u00dd\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010S\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u0010\u0010T\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010U\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u000b\u0010[\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010]\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u0010^\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010`\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00e6\u0001\u0010a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010bJ\u0013\u0010c\u001a\u00020\r2\b\u0010d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010e\u001a\u00020\u000bH\u00d6\u0001J\t\u0010f\u001a\u00020\u000fH\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\"\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b\u0016\u00102\"\u0004\b8\u00104R\"\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\b\u0015\u00102\"\u0004\b9\u00104R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R \u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R \u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010&\"\u0004\b?\u0010(R \u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010&\"\u0004\bA\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00105\u001a\u0004\bH\u00102\"\u0004\bI\u00104R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR \u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010&\"\u0004\bN\u0010(\u00a8\u0006h"}, d2 = {"Lcom/statsig/androidsdk/Marker;", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/statsig/androidsdk/KeyType;", "action", "Lcom/statsig/androidsdk/ActionType;", DiagnosticsEntry.Event.TIMESTAMP_KEY, "", "step", "Lcom/statsig/androidsdk/StepType;", "statusCode", "", "success", "", "url", "", "idListCount", "reason", "sdkRegion", "markerID", "attempt", "isRetry", "isDelta", "configName", "evaluationDetails", "Lcom/statsig/androidsdk/EvaluationDetails;", "error", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "hasNetwork", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/ActionType;Ljava/lang/Double;Lcom/statsig/androidsdk/StepType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Boolean;)V", "getAction", "()Lcom/statsig/androidsdk/ActionType;", "getAttempt", "()Ljava/lang/Integer;", "setAttempt", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConfigName", "()Ljava/lang/String;", "setConfigName", "(Ljava/lang/String;)V", "getError", "()Lcom/statsig/androidsdk/Marker$ErrorMessage;", "setError", "(Lcom/statsig/androidsdk/Marker$ErrorMessage;)V", "getEvaluationDetails", "()Lcom/statsig/androidsdk/EvaluationDetails;", "setEvaluationDetails", "(Lcom/statsig/androidsdk/EvaluationDetails;)V", "getHasNetwork", "()Ljava/lang/Boolean;", "setHasNetwork", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIdListCount", "setIdListCount", "setDelta", "setRetry", "getKey", "()Lcom/statsig/androidsdk/KeyType;", "getMarkerID", "setMarkerID", "getReason", "setReason", "getSdkRegion", "setSdkRegion", "getStatusCode", "setStatusCode", "getStep", "()Lcom/statsig/androidsdk/StepType;", "setStep", "(Lcom/statsig/androidsdk/StepType;)V", "getSuccess", "setSuccess", "getTimestamp", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/ActionType;Ljava/lang/Double;Lcom/statsig/androidsdk/StepType;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/statsig/androidsdk/EvaluationDetails;Lcom/statsig/androidsdk/Marker$ErrorMessage;Ljava/lang/Boolean;)Lcom/statsig/androidsdk/Marker;", "equals", "other", "hashCode", "toString", "ErrorMessage", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class Marker {
    @b("action")
    private final ActionType action;
    @b("attempt")
    private Integer attempt;
    @b("configName")
    private String configName;
    @b("error")
    private ErrorMessage error;
    @b("evaluationDetails")
    private EvaluationDetails evaluationDetails;
    @b("hasNetwork")
    private Boolean hasNetwork;
    @b("idListCount")
    private Integer idListCount;
    @b("isDelta")
    private Boolean isDelta;
    @b("isRetry")
    private Boolean isRetry;
    @b(SubscriberAttributeKt.JSON_NAME_KEY)
    private final KeyType key;
    @b("markerID")
    private String markerID;
    @b("reason")
    private String reason;
    @b("sdkRegion")
    private String sdkRegion;
    @b("statusCode")
    private Integer statusCode;
    @b("step")
    private StepType step;
    @b("success")
    private Boolean success;
    @b(DiagnosticsEntry.Event.TIMESTAMP_KEY)
    private final Double timestamp;
    @b("url")
    private String url;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/statsig/androidsdk/Marker$ErrorMessage;", "", "message", "", "name", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class ErrorMessage {
        @b("code")
        private final String code;
        @b("message")
        private final String message;
        @b("name")
        private final String name;

        public ErrorMessage() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = errorMessage.message;
            }
            if ((i10 & 2) != 0) {
                str2 = errorMessage.name;
            }
            if ((i10 & 4) != 0) {
                str3 = errorMessage.code;
            }
            return errorMessage.copy(str, str2, str3);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.code;
        }

        public final ErrorMessage copy(String str, String str2, String str3) {
            return new ErrorMessage(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorMessage)) {
                return false;
            }
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return AbstractC3557B.K(this.message, errorMessage.message) && AbstractC3557B.K(this.name, errorMessage.name) && AbstractC3557B.K(this.code, errorMessage.code);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.message;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            return "ErrorMessage(message=" + ((Object) this.message) + ", name=" + ((Object) this.name) + ", code=" + ((Object) this.code) + ')';
        }

        public ErrorMessage(String str, String str2, String str3) {
            this.message = str;
            this.name = str2;
            this.code = str3;
        }

        public /* synthetic */ ErrorMessage(String str, String str2, String str3, int i10, g gVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    public Marker() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public final KeyType component1() {
        return this.key;
    }

    public final String component10() {
        return this.sdkRegion;
    }

    public final String component11() {
        return this.markerID;
    }

    public final Integer component12() {
        return this.attempt;
    }

    public final Boolean component13() {
        return this.isRetry;
    }

    public final Boolean component14() {
        return this.isDelta;
    }

    public final String component15() {
        return this.configName;
    }

    public final EvaluationDetails component16() {
        return this.evaluationDetails;
    }

    public final ErrorMessage component17() {
        return this.error;
    }

    public final Boolean component18() {
        return this.hasNetwork;
    }

    public final ActionType component2() {
        return this.action;
    }

    public final Double component3() {
        return this.timestamp;
    }

    public final StepType component4() {
        return this.step;
    }

    public final Integer component5() {
        return this.statusCode;
    }

    public final Boolean component6() {
        return this.success;
    }

    public final String component7() {
        return this.url;
    }

    public final Integer component8() {
        return this.idListCount;
    }

    public final String component9() {
        return this.reason;
    }

    public final Marker copy(KeyType keyType, ActionType actionType, Double d10, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4) {
        return new Marker(keyType, actionType, d10, stepType, num, bool, str, num2, str2, str3, str4, num3, bool2, bool3, str5, evaluationDetails, errorMessage, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) obj;
        return this.key == marker.key && this.action == marker.action && AbstractC3557B.K(this.timestamp, marker.timestamp) && this.step == marker.step && AbstractC3557B.K(this.statusCode, marker.statusCode) && AbstractC3557B.K(this.success, marker.success) && AbstractC3557B.K(this.url, marker.url) && AbstractC3557B.K(this.idListCount, marker.idListCount) && AbstractC3557B.K(this.reason, marker.reason) && AbstractC3557B.K(this.sdkRegion, marker.sdkRegion) && AbstractC3557B.K(this.markerID, marker.markerID) && AbstractC3557B.K(this.attempt, marker.attempt) && AbstractC3557B.K(this.isRetry, marker.isRetry) && AbstractC3557B.K(this.isDelta, marker.isDelta) && AbstractC3557B.K(this.configName, marker.configName) && AbstractC3557B.K(this.evaluationDetails, marker.evaluationDetails) && AbstractC3557B.K(this.error, marker.error) && AbstractC3557B.K(this.hasNetwork, marker.hasNetwork);
    }

    public final ActionType getAction() {
        return this.action;
    }

    public final Integer getAttempt() {
        return this.attempt;
    }

    public final String getConfigName() {
        return this.configName;
    }

    public final ErrorMessage getError() {
        return this.error;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    public final Boolean getHasNetwork() {
        return this.hasNetwork;
    }

    public final Integer getIdListCount() {
        return this.idListCount;
    }

    public final KeyType getKey() {
        return this.key;
    }

    public final String getMarkerID() {
        return this.markerID;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSdkRegion() {
        return this.sdkRegion;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final StepType getStep() {
        return this.step;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Double getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        KeyType keyType = this.key;
        int i10 = 0;
        int hashCode = (keyType == null ? 0 : keyType.hashCode()) * 31;
        ActionType actionType = this.action;
        int hashCode2 = (hashCode + (actionType == null ? 0 : actionType.hashCode())) * 31;
        Double d10 = this.timestamp;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        StepType stepType = this.step;
        int hashCode4 = (hashCode3 + (stepType == null ? 0 : stepType.hashCode())) * 31;
        Integer num = this.statusCode;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.success;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.idListCount;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reason;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkRegion;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.markerID;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.attempt;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isRetry;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDelta;
        int hashCode14 = (hashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.configName;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EvaluationDetails evaluationDetails = this.evaluationDetails;
        int hashCode16 = (hashCode15 + (evaluationDetails == null ? 0 : evaluationDetails.hashCode())) * 31;
        ErrorMessage errorMessage = this.error;
        int hashCode17 = (hashCode16 + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31;
        Boolean bool4 = this.hasNetwork;
        if (bool4 != null) {
            i10 = bool4.hashCode();
        }
        return hashCode17 + i10;
    }

    public final Boolean isDelta() {
        return this.isDelta;
    }

    public final Boolean isRetry() {
        return this.isRetry;
    }

    public final void setAttempt(Integer num) {
        this.attempt = num;
    }

    public final void setConfigName(String str) {
        this.configName = str;
    }

    public final void setDelta(Boolean bool) {
        this.isDelta = bool;
    }

    public final void setError(ErrorMessage errorMessage) {
        this.error = errorMessage;
    }

    public final void setEvaluationDetails(EvaluationDetails evaluationDetails) {
        this.evaluationDetails = evaluationDetails;
    }

    public final void setHasNetwork(Boolean bool) {
        this.hasNetwork = bool;
    }

    public final void setIdListCount(Integer num) {
        this.idListCount = num;
    }

    public final void setMarkerID(String str) {
        this.markerID = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setRetry(Boolean bool) {
        this.isRetry = bool;
    }

    public final void setSdkRegion(String str) {
        this.sdkRegion = str;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStep(StepType stepType) {
        this.step = stepType;
    }

    public final void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "Marker(key=" + this.key + ", action=" + this.action + ", timestamp=" + this.timestamp + ", step=" + this.step + ", statusCode=" + this.statusCode + ", success=" + this.success + ", url=" + ((Object) this.url) + ", idListCount=" + this.idListCount + ", reason=" + ((Object) this.reason) + ", sdkRegion=" + ((Object) this.sdkRegion) + ", markerID=" + ((Object) this.markerID) + ", attempt=" + this.attempt + ", isRetry=" + this.isRetry + ", isDelta=" + this.isDelta + ", configName=" + ((Object) this.configName) + ", evaluationDetails=" + this.evaluationDetails + ", error=" + this.error + ", hasNetwork=" + this.hasNetwork + ')';
    }

    public Marker(KeyType keyType, ActionType actionType, Double d10, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4) {
        this.key = keyType;
        this.action = actionType;
        this.timestamp = d10;
        this.step = stepType;
        this.statusCode = num;
        this.success = bool;
        this.url = str;
        this.idListCount = num2;
        this.reason = str2;
        this.sdkRegion = str3;
        this.markerID = str4;
        this.attempt = num3;
        this.isRetry = bool2;
        this.isDelta = bool3;
        this.configName = str5;
        this.evaluationDetails = evaluationDetails;
        this.error = errorMessage;
        this.hasNetwork = bool4;
    }

    public /* synthetic */ Marker(KeyType keyType, ActionType actionType, Double d10, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : keyType, (i10 & 2) != 0 ? null : actionType, (i10 & 4) != 0 ? null : d10, (i10 & 8) != 0 ? null : stepType, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : str2, (i10 & 512) != 0 ? null : str3, (i10 & 1024) != 0 ? null : str4, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : bool2, (i10 & 8192) != 0 ? null : bool3, (i10 & 16384) != 0 ? null : str5, (i10 & 32768) != 0 ? null : evaluationDetails, (i10 & 65536) != 0 ? null : errorMessage, (i10 & 131072) != 0 ? null : bool4);
    }
}
