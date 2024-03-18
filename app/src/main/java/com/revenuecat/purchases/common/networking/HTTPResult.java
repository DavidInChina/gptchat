package com.revenuecat.purchases.common.networking;

import E9.f;
import Lg.n;
import com.revenuecat.purchases.VerificationResult;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u0000 '2\u00020\u0001:\u0002'(B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J=\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010%\u001a\u00020\u0005J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult;", "", "responseCode", "", "payload", "", "origin", "Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "requestDate", "Ljava/util/Date;", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "(ILjava/lang/String;Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;Ljava/util/Date;Lcom/revenuecat/purchases/VerificationResult;)V", "body", "Lorg/json/JSONObject;", "getBody", "()Lorg/json/JSONObject;", "getOrigin", "()Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "getPayload", "()Ljava/lang/String;", "getRequestDate", "()Ljava/util/Date;", "getResponseCode", "()I", "getVerificationResult", "()Lcom/revenuecat/purchases/VerificationResult;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "serialize", "toString", "Companion", "Origin", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class HTTPResult {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final String SIGNATURE_HEADER_NAME = "X-Signature";
    private final JSONObject body;
    private final Origin origin;
    private final String payload;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Companion;", "", "()V", "ETAG_HEADER_NAME", "", "REQUEST_TIME_HEADER_NAME", "SIGNATURE_HEADER_NAME", "deserialize", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "serialized", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final HTTPResult deserialize(String str) {
            Origin origin;
            Date date;
            VerificationResult verificationResult;
            AbstractC3557B.c0("serialized", str);
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("responseCode");
            String string = jSONObject.getString("payload");
            if (jSONObject.has("origin")) {
                String string2 = jSONObject.getString("origin");
                AbstractC3557B.b0("jsonObject.getString(SERIALIZATION_NAME_ORIGIN)", string2);
                origin = Origin.valueOf(string2);
            } else {
                origin = Origin.CACHE;
            }
            Origin origin2 = origin;
            if (jSONObject.has("requestDate")) {
                date = new Date(jSONObject.getLong("requestDate"));
            } else {
                date = null;
            }
            if (jSONObject.has("verificationResult")) {
                String string3 = jSONObject.getString("verificationResult");
                AbstractC3557B.b0("jsonObject.getString(SER\u2026NAME_VERIFICATION_RESULT)", string3);
                verificationResult = VerificationResult.valueOf(string3);
            } else {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            AbstractC3557B.b0("payload", string);
            return new HTTPResult(i10, string, origin2, date, verificationResult2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResult$Origin;", "", "(Ljava/lang/String;I)V", "BACKEND", "CACHE", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public enum Origin {
        BACKEND,
        CACHE
    }

    public HTTPResult(int i10, String str, Origin origin, Date date, VerificationResult verificationResult) {
        JSONObject jSONObject;
        AbstractC3557B.c0("payload", str);
        AbstractC3557B.c0("origin", origin);
        AbstractC3557B.c0("verificationResult", verificationResult);
        this.responseCode = i10;
        this.payload = str;
        this.origin = origin;
        this.requestDate = date;
        this.verificationResult = verificationResult;
        str = !(n.n2(str) ^ true) ? null : str;
        if (str != null) {
            jSONObject = new JSONObject(str);
        } else {
            jSONObject = new JSONObject();
        }
        this.body = jSONObject;
    }

    public static /* synthetic */ HTTPResult copy$default(HTTPResult hTTPResult, int i10, String str, Origin origin, Date date, VerificationResult verificationResult, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = hTTPResult.responseCode;
        }
        if ((i11 & 2) != 0) {
            str = hTTPResult.payload;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            origin = hTTPResult.origin;
        }
        Origin origin2 = origin;
        if ((i11 & 8) != 0) {
            date = hTTPResult.requestDate;
        }
        Date date2 = date;
        if ((i11 & 16) != 0) {
            verificationResult = hTTPResult.verificationResult;
        }
        return hTTPResult.copy(i10, str2, origin2, date2, verificationResult);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.payload;
    }

    public final Origin component3() {
        return this.origin;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final VerificationResult component5() {
        return this.verificationResult;
    }

    public final HTTPResult copy(int i10, String str, Origin origin, Date date, VerificationResult verificationResult) {
        AbstractC3557B.c0("payload", str);
        AbstractC3557B.c0("origin", origin);
        AbstractC3557B.c0("verificationResult", verificationResult);
        return new HTTPResult(i10, str, origin, date, verificationResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) obj;
        return this.responseCode == hTTPResult.responseCode && AbstractC3557B.K(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && AbstractC3557B.K(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult;
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int i10;
        int hashCode = (this.origin.hashCode() + f.v(this.payload, this.responseCode * 31, 31)) * 31;
        Date date = this.requestDate;
        if (date == null) {
            i10 = 0;
        } else {
            i10 = date.hashCode();
        }
        return this.verificationResult.hashCode() + ((hashCode + i10) * 31);
    }

    public final String serialize() {
        Long l10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("responseCode", this.responseCode);
        jSONObject.put("payload", this.payload);
        jSONObject.put("origin", this.origin.name());
        Date date = this.requestDate;
        if (date != null) {
            l10 = Long.valueOf(date.getTime());
        } else {
            l10 = null;
        }
        jSONObject.put("requestDate", l10);
        jSONObject.put("verificationResult", this.verificationResult.name());
        String jSONObject2 = jSONObject.toString();
        AbstractC3557B.b0("jsonObject.toString()", jSONObject2);
        return jSONObject2;
    }

    public String toString() {
        return "HTTPResult(responseCode=" + this.responseCode + ", payload=" + this.payload + ", origin=" + this.origin + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ')';
    }
}
