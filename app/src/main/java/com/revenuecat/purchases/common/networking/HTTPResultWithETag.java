package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.common.networking.HTTPResult;
import id.AbstractC3557B;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "", "eTagData", "Lcom/revenuecat/purchases/common/networking/ETagData;", HTTPResultWithETag.SERIALIZATION_NAME_HTTPRESULT, "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "(Lcom/revenuecat/purchases/common/networking/ETagData;Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "getETagData", "()Lcom/revenuecat/purchases/common/networking/ETagData;", "getHttpResult", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "serialize", "", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class HTTPResultWithETag {
    public static final Companion Companion = new Companion(null);
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_HTTPRESULT = "httpResult";
    private static final String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private final ETagData eTagData;
    private final HTTPResult httpResult;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag$Companion;", "", "()V", "SERIALIZATION_NAME_ETAG", "", "SERIALIZATION_NAME_HTTPRESULT", "SERIALIZATION_NAME_LAST_REFRESH_TIME", "deserialize", "Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "serialized", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final HTTPResultWithETag deserialize(String str) {
            AbstractC3557B.c0("serialized", str);
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(HTTPResultWithETag.SERIALIZATION_NAME_ETAG);
            Long valueOf = Long.valueOf(jSONObject.optLong(HTTPResultWithETag.SERIALIZATION_NAME_LAST_REFRESH_TIME, -1L));
            Date date = null;
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                date = new Date(valueOf.longValue());
            }
            String string2 = jSONObject.getString(HTTPResultWithETag.SERIALIZATION_NAME_HTTPRESULT);
            AbstractC3557B.b0(HTTPResultWithETag.SERIALIZATION_NAME_ETAG, string);
            ETagData eTagData = new ETagData(string, date);
            HTTPResult.Companion companion = HTTPResult.Companion;
            AbstractC3557B.b0("serializedHTTPResult", string2);
            return new HTTPResultWithETag(eTagData, companion.deserialize(string2));
        }
    }

    public HTTPResultWithETag(ETagData eTagData, HTTPResult hTTPResult) {
        AbstractC3557B.c0("eTagData", eTagData);
        AbstractC3557B.c0(SERIALIZATION_NAME_HTTPRESULT, hTTPResult);
        this.eTagData = eTagData;
        this.httpResult = hTTPResult;
    }

    public static /* synthetic */ HTTPResultWithETag copy$default(HTTPResultWithETag hTTPResultWithETag, ETagData eTagData, HTTPResult hTTPResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eTagData = hTTPResultWithETag.eTagData;
        }
        if ((i10 & 2) != 0) {
            hTTPResult = hTTPResultWithETag.httpResult;
        }
        return hTTPResultWithETag.copy(eTagData, hTTPResult);
    }

    public final ETagData component1() {
        return this.eTagData;
    }

    public final HTTPResult component2() {
        return this.httpResult;
    }

    public final HTTPResultWithETag copy(ETagData eTagData, HTTPResult hTTPResult) {
        AbstractC3557B.c0("eTagData", eTagData);
        AbstractC3557B.c0(SERIALIZATION_NAME_HTTPRESULT, hTTPResult);
        return new HTTPResultWithETag(eTagData, hTTPResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResultWithETag)) {
            return false;
        }
        HTTPResultWithETag hTTPResultWithETag = (HTTPResultWithETag) obj;
        return AbstractC3557B.K(this.eTagData, hTTPResultWithETag.eTagData) && AbstractC3557B.K(this.httpResult, hTTPResultWithETag.httpResult);
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final HTTPResult getHttpResult() {
        return this.httpResult;
    }

    public int hashCode() {
        return this.httpResult.hashCode() + (this.eTagData.hashCode() * 31);
    }

    public final String serialize() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SERIALIZATION_NAME_ETAG, this.eTagData.getETag());
        Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put(SERIALIZATION_NAME_LAST_REFRESH_TIME, lastRefreshTime.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_HTTPRESULT, this.httpResult.serialize());
        String jSONObject2 = jSONObject.toString();
        AbstractC3557B.b0("JSONObject().apply {\n   \u2026e())\n        }.toString()", jSONObject2);
        return jSONObject2;
    }

    public String toString() {
        return "HTTPResultWithETag(eTagData=" + this.eTagData + ", httpResult=" + this.httpResult + ')';
    }
}
