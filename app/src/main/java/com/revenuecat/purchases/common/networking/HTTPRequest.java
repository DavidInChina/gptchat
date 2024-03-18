package com.revenuecat.purchases.common.networking;

import id.AbstractC3557B;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "", "fullURL", "Ljava/net/URL;", "headers", "", "", "body", "Lorg/json/JSONObject;", "(Ljava/net/URL;Ljava/util/Map;Lorg/json/JSONObject;)V", "getBody", "()Lorg/json/JSONObject;", "getFullURL", "()Ljava/net/URL;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class HTTPRequest {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String ETAG_LAST_REFRESH_NAME = "X-RC-Last-Refresh-Time";
    public static final String POST_PARAMS_HASH = "X-Post-Params-Hash";
    private final JSONObject body;
    private final URL fullURL;
    private final Map<String, String> headers;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPRequest$Companion;", "", "()V", "ETAG_HEADER_NAME", "", "ETAG_LAST_REFRESH_NAME", "POST_PARAMS_HASH", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public HTTPRequest(URL url, Map<String, String> map, JSONObject jSONObject) {
        AbstractC3557B.c0("fullURL", url);
        AbstractC3557B.c0("headers", map);
        this.fullURL = url;
        this.headers = map;
        this.body = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HTTPRequest copy$default(HTTPRequest hTTPRequest, URL url, Map map, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            url = hTTPRequest.fullURL;
        }
        if ((i10 & 2) != 0) {
            map = hTTPRequest.headers;
        }
        if ((i10 & 4) != 0) {
            jSONObject = hTTPRequest.body;
        }
        return hTTPRequest.copy(url, map, jSONObject);
    }

    public final URL component1() {
        return this.fullURL;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final HTTPRequest copy(URL url, Map<String, String> map, JSONObject jSONObject) {
        AbstractC3557B.c0("fullURL", url);
        AbstractC3557B.c0("headers", map);
        return new HTTPRequest(url, map, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPRequest)) {
            return false;
        }
        HTTPRequest hTTPRequest = (HTTPRequest) obj;
        return AbstractC3557B.K(this.fullURL, hTTPRequest.fullURL) && AbstractC3557B.K(this.headers, hTTPRequest.headers) && AbstractC3557B.K(this.body, hTTPRequest.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final URL getFullURL() {
        return this.fullURL;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int i10;
        int f6 = AbstractC6463a.f(this.headers, this.fullURL.hashCode() * 31, 31);
        JSONObject jSONObject = this.body;
        if (jSONObject == null) {
            i10 = 0;
        } else {
            i10 = jSONObject.hashCode();
        }
        return f6 + i10;
    }

    public String toString() {
        return "HTTPRequest(fullURL=" + this.fullURL + ", headers=" + this.headers + ", body=" + this.body + ')';
    }
}
