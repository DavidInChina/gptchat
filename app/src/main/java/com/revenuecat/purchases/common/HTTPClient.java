package com.revenuecat.purchases.common;

import Lg.n;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.networking.ETagManager;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPRequest;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.MapConverter;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import r9.y;

@Metadata(d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 _2\u00020\u0001:\u0001_BE\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010J\u001a\u00020I\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\u0006\u0010P\u001a\u00020O\u0012\u0006\u0010U\u001a\u00020T\u0012\b\b\u0002\u0010X\u001a\u00020W\u0012\b\b\u0002\u0010[\u001a\u00020Z\u00a2\u0006\u0004\b]\u0010^J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016Jq\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001b2\u001a\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001d\u0018\u00010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\b#\u0010$J1\u0010)\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010\"H\u0002\u00a2\u0006\u0004\b)\u0010*J[\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u000b2\u0006\u0010.\u001a\u00020 2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b6\u00107J=\u0010;\u001a\u00020:2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\n =*\u0004\u0018\u00010\u000b0\u000b2\u0006\u0010\u000f\u001a\u000208H\u0002\u00a2\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u000208H\u0002\u00a2\u0006\u0004\b@\u0010?J\u0019\u0010A\u001a\u0004\u0018\u00010%2\u0006\u0010\u000f\u001a\u000208H\u0002\u00a2\u0006\u0004\bA\u0010BJo\u0010C\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001b2\u001a\u0010\u001e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001d\u0018\u00010\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u001b2\b\b\u0002\u0010!\u001a\u00020 \u00a2\u0006\u0004\bC\u0010$J\r\u0010D\u001a\u00020\u0014\u00a2\u0006\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u0004\u0018\u00010L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0017\u0010P\u001a\u00020O8\u0006\u00a2\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b[\u0010\\\u00a8\u0006`"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/io/BufferedReader;", "buffer", "(Ljava/io/InputStream;)Ljava/io/BufferedReader;", "Ljava/io/OutputStream;", "outputStream", "Ljava/io/BufferedWriter;", "(Ljava/io/OutputStream;)Ljava/io/BufferedWriter;", "", "readFully", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "connection", "getInputStream", "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "writer", "body", "Ljf/y;", "writeFully", "(Ljava/io/BufferedWriter;Ljava/lang/String;)V", "Ljava/net/URL;", "baseURL", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "", "Ljf/i;", "postFieldsToSign", "requestHeaders", "", "refreshETag", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "performCall", "(Ljava/net/URL;Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Z)Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Ljava/util/Date;", "requestStartTime", "callSuccessful", "callResult", "trackHttpRequestPerformedIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Date;ZLcom/revenuecat/purchases/common/networking/HTTPResult;)V", "authenticationHeaders", "urlPath", "nonce", "shouldSignResponse", "postFieldsToSignHeader", "getHeaders", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;)Ljava/util/Map;", "Lcom/revenuecat/purchases/common/networking/HTTPRequest;", "request", "getConnection", "(Lcom/revenuecat/purchases/common/networking/HTTPRequest;)Ljava/net/HttpURLConnection;", "getXPlatformHeader", "()Ljava/lang/String;", "Ljava/net/URLConnection;", "payload", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/net/URLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "kotlin.jvm.PlatformType", "getETagHeader", "(Ljava/net/URLConnection;)Ljava/lang/String;", "getRequestTimeHeader", "getRequestDateHeader", "(Ljava/net/URLConnection;)Ljava/util/Date;", "performRequest", "clearCaches", "()V", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "eTagManager", "Lcom/revenuecat/purchases/common/networking/ETagManager;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "signingManager", "Lcom/revenuecat/purchases/common/verification/SigningManager;", "getSigningManager", "()Lcom/revenuecat/purchases/common/verification/SigningManager;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "storefrontProvider", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "mapConverter", "Lcom/revenuecat/purchases/common/networking/MapConverter;", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/networking/ETagManager;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/common/verification/SigningManager;Lcom/revenuecat/purchases/interfaces/StorefrontProvider;Lcom/revenuecat/purchases/common/DateProvider;Lcom/revenuecat/purchases/common/networking/MapConverter;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class HTTPClient {
    public static final Companion Companion = new Companion(null);
    public static final int NO_STATUS_CODE = -1;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final ETagManager eTagManager;
    private final MapConverter mapConverter;
    private final SigningManager signingManager;
    private final StorefrontProvider storefrontProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/HTTPClient$Companion;", "", "()V", "NO_STATUS_CODE", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.AMAZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter) {
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("eTagManager", eTagManager);
        AbstractC3557B.c0("signingManager", signingManager);
        AbstractC3557B.c0("storefrontProvider", storefrontProvider);
        AbstractC3557B.c0("dateProvider", dateProvider);
        AbstractC3557B.c0("mapConverter", mapConverter);
        this.appConfig = appConfig;
        this.eTagManager = eTagManager;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.signingManager = signingManager;
        this.storefrontProvider = storefrontProvider;
        this.dateProvider = dateProvider;
        this.mapConverter = mapConverter;
    }

    private final BufferedReader buffer(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    private final HttpURLConnection getConnection(HTTPRequest hTTPRequest) {
        URLConnection openConnection = hTTPRequest.getFullURL().openConnection();
        AbstractC3557B.a0("null cannot be cast to non-null type java.net.HttpURLConnection", openConnection);
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        for (Map.Entry<String, String> entry : hTTPRequest.getHeaders().entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        JSONObject body = hTTPRequest.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            AbstractC3557B.b0("os", outputStream);
            BufferedWriter buffer = buffer(outputStream);
            String jSONObject = body.toString();
            AbstractC3557B.b0("body.toString()", jSONObject);
            writeFully(buffer, jSONObject);
        }
        return httpURLConnection;
    }

    private final String getETagHeader(URLConnection uRLConnection) {
        return uRLConnection.getHeaderField("X-RevenueCat-ETag");
    }

    private final Map<String, String> getHeaders(Map<String, String> map, String str, boolean z10, String str2, boolean z11, String str3) {
        String str4;
        C3959i[] c3959iArr = new C3959i[14];
        c3959iArr[0] = new C3959i(SIPHeaderNames.CONTENT_TYPE, "application/json");
        c3959iArr[1] = new C3959i("X-Platform", getXPlatformHeader());
        c3959iArr[2] = new C3959i("X-Platform-Flavor", this.appConfig.getPlatformInfo().getFlavor());
        c3959iArr[3] = new C3959i("X-Platform-Flavor-Version", this.appConfig.getPlatformInfo().getVersion());
        c3959iArr[4] = new C3959i("X-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        c3959iArr[5] = new C3959i("X-Version", "7.7.0");
        c3959iArr[6] = new C3959i("X-Client-Locale", this.appConfig.getLanguageTag());
        c3959iArr[7] = new C3959i("X-Client-Version", this.appConfig.getVersionName());
        c3959iArr[8] = new C3959i("X-Client-Bundle-ID", this.appConfig.getPackageName());
        String str5 = "true";
        if (this.appConfig.getFinishTransactions()) {
            str4 = "false";
        } else {
            str4 = str5;
        }
        c3959iArr[9] = new C3959i("X-Observer-Mode-Enabled", str4);
        c3959iArr[10] = new C3959i("X-Nonce", str2);
        c3959iArr[11] = new C3959i(HTTPRequest.POST_PARAMS_HASH, str3);
        if (!this.appConfig.getCustomEntitlementComputation()) {
            str5 = null;
        }
        c3959iArr[12] = new C3959i("X-Custom-Entitlements-Computation", str5);
        c3959iArr[13] = new C3959i("X-Storefront", this.storefrontProvider.getStorefront());
        return MapExtensionsKt.filterNotNullValues(AbstractC4268D.e1(AbstractC4268D.e1(AbstractC4268D.a1(c3959iArr), map), this.eTagManager.getETagHeaders$purchases_customEntitlementComputationRelease(str, z11, z10)));
    }

    private final InputStream getInputStream(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (Exception e10) {
            if ((e10 instanceof IllegalArgumentException) || (e10 instanceof IOException)) {
                LogWrapperKt.log(LogIntent.WARNING, String.format(NetworkStrings.PROBLEM_CONNECTING, Arrays.copyOf(new Object[]{e10.getMessage()}, 1)));
                return httpURLConnection.getErrorStream();
            }
            throw e10;
        }
    }

    private final Date getRequestDateHeader(URLConnection uRLConnection) {
        String requestTimeHeader = getRequestTimeHeader(uRLConnection);
        if (requestTimeHeader != null) {
            return new Date(Long.parseLong(requestTimeHeader));
        }
        return null;
    }

    private final String getRequestTimeHeader(URLConnection uRLConnection) {
        String headerField = uRLConnection.getHeaderField(HTTPResult.REQUEST_TIME_HEADER_NAME);
        if (headerField == null || !(!n.n2(headerField))) {
            return null;
        }
        return headerField;
    }

    private final String getXPlatformHeader() {
        if (WhenMappings.$EnumSwitchMapping$0[this.appConfig.getStore().ordinal()] == 1) {
            return "amazon";
        }
        return "android";
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #1 {all -> 0x009e, blocks: (B:27:0x007a, B:29:0x0097), top: B:60:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HTTPResult performCall(URL url, Endpoint endpoint, Map<String, ? extends Object> map, List<C3959i> list, Map<String, String> map2, boolean z10) {
        JSONObject jSONObject;
        boolean z11;
        String str;
        String str2;
        HttpURLConnection connection;
        InputStream inputStream;
        String str3;
        VerificationResult verificationResult;
        List<C3959i> list2;
        if (map != null) {
            jSONObject = this.mapConverter.convertToJSON$purchases_customEntitlementComputationRelease(map);
        } else {
            jSONObject = null;
        }
        String path = endpoint.getPath();
        String r10 = R.a.r("/v1", path);
        boolean shouldVerifyEndpoint = this.signingManager.shouldVerifyEndpoint(endpoint);
        if (shouldVerifyEndpoint && endpoint.getNeedsNonceToPerformSigning()) {
            z11 = true;
        } else {
            z11 = false;
        }
        try {
            URL url2 = new URL(url, r10);
            if (z11) {
                str = this.signingManager.createRandomNonce();
            } else {
                str = null;
            }
            try {
                if (list != null) {
                    if (shouldVerifyEndpoint) {
                        list2 = list;
                    } else {
                        list2 = null;
                    }
                    if (list2 != null) {
                        str2 = this.signingManager.getPostParamsForSigningHeaderIfNeeded(endpoint, list);
                        connection = getConnection(new HTTPRequest(url2, getHeaders(map2, r10, z10, str, shouldVerifyEndpoint, str2), jSONObject));
                        inputStream = getInputStream(connection);
                        LogUtilsKt.debugLog(String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path}, 2)));
                        int responseCode = connection.getResponseCode();
                        if (inputStream == null) {
                            str3 = readFully(inputStream);
                        } else {
                            str3 = null;
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        connection.disconnect();
                        LogUtilsKt.debugLog(String.format(NetworkStrings.API_REQUEST_COMPLETED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path, Integer.valueOf(responseCode)}, 3)));
                        if (str3 == null) {
                            if (shouldVerifyEndpoint && RCHTTPStatusCodes.INSTANCE.isSuccessful(responseCode)) {
                                verificationResult = verifyResponse(r10, connection, str3, str, str2);
                            } else {
                                verificationResult = VerificationResult.NOT_REQUESTED;
                            }
                            if (verificationResult == VerificationResult.FAILED && (this.signingManager.getSignatureVerificationMode() instanceof SignatureVerificationMode.Enforced)) {
                                throw new SignatureVerificationException(path);
                            }
                            return this.eTagManager.getHTTPResultFromCacheOrBackend$purchases_customEntitlementComputationRelease(responseCode, str3, getETagHeader(connection), r10, z10, getRequestDateHeader(connection), verificationResult);
                        }
                        throw new IOException(NetworkStrings.HTTP_RESPONSE_PAYLOAD_NULL);
                    }
                }
                LogUtilsKt.debugLog(String.format(NetworkStrings.API_REQUEST_STARTED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path}, 2)));
                int responseCode2 = connection.getResponseCode();
                if (inputStream == null) {
                }
                if (inputStream != null) {
                }
                connection.disconnect();
                LogUtilsKt.debugLog(String.format(NetworkStrings.API_REQUEST_COMPLETED, Arrays.copyOf(new Object[]{connection.getRequestMethod(), path, Integer.valueOf(responseCode2)}, 3)));
                if (str3 == null) {
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    inputStream.close();
                }
                connection.disconnect();
                throw th2;
            }
            str2 = null;
            connection = getConnection(new HTTPRequest(url2, getHeaders(map2, r10, z10, str, shouldVerifyEndpoint, str2), jSONObject));
            inputStream = getInputStream(connection);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static /* synthetic */ HTTPResult performRequest$default(HTTPClient hTTPClient, URL url, Endpoint endpoint, Map map, List list, Map map2, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return hTTPClient.performRequest(url, endpoint, map, list, map2, z10);
    }

    private final String readFully(InputStream inputStream) {
        return P4.a.x0(buffer(inputStream));
    }

    private final void trackHttpRequestPerformedIfNeeded(Endpoint endpoint, Date date, boolean z10, HTTPResult hTTPResult) {
        int i10;
        HTTPResult.Origin origin;
        VerificationResult verificationResult;
        boolean z11;
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            long between = DurationExtensionsKt.between(Mg.b.f12127Z, date, this.dateProvider.getNow());
            if (z10) {
                if (hTTPResult != null) {
                    i10 = hTTPResult.getResponseCode();
                } else {
                    i10 = RCHTTPStatusCodes.NOT_MODIFIED;
                }
            } else {
                i10 = -1;
            }
            int i11 = i10;
            if (hTTPResult != null) {
                origin = hTTPResult.getOrigin();
            } else {
                origin = null;
            }
            HTTPResult.Origin origin2 = origin;
            if (hTTPResult == null || (verificationResult = hTTPResult.getVerificationResult()) == null) {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            if (z10 && RCHTTPStatusCodes.INSTANCE.isSuccessful(i11)) {
                z11 = true;
            } else {
                z11 = false;
            }
            diagnosticsTracker.m65trackHttpRequestPerformedNcHsxvU(endpoint, between, z11, i11, origin2, verificationResult2);
        }
    }

    private final VerificationResult verifyResponse(String str, URLConnection uRLConnection, String str2, String str3, String str4) {
        return this.signingManager.verifyResponse(str, uRLConnection.getHeaderField(HTTPResult.SIGNATURE_HEADER_NAME), str3, str2, getRequestTimeHeader(uRLConnection), getETagHeader(uRLConnection), str4);
    }

    private final void writeFully(BufferedWriter bufferedWriter, String str) {
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }

    public final void clearCaches() {
        this.eTagManager.clearCaches$purchases_customEntitlementComputationRelease();
    }

    public final SigningManager getSigningManager() {
        return this.signingManager;
    }

    public final HTTPResult performRequest(URL url, Endpoint endpoint, Map<String, ? extends Object> map, List<C3959i> list, Map<String, String> map2, boolean z10) {
        AbstractC3557B.c0("baseURL", url);
        AbstractC3557B.c0("endpoint", endpoint);
        AbstractC3557B.c0("requestHeaders", map2);
        if (this.appConfig.getForceServerErrors()) {
            LogUtilsKt.warnLog("Forcing server error for request to " + endpoint.getPath());
            return new HTTPResult(500, "", HTTPResult.Origin.BACKEND, null, VerificationResult.NOT_REQUESTED);
        }
        Date now = this.dateProvider.getNow();
        try {
            HTTPResult performCall = performCall(url, endpoint, map, list, map2, z10);
            trackHttpRequestPerformedIfNeeded(endpoint, now, true, performCall);
            if (performCall == null) {
                LogWrapperKt.log(LogIntent.WARNING, NetworkStrings.ETAG_RETRYING_CALL);
                return performRequest(url, endpoint, map, list, map2, true);
            }
            return performCall;
        } catch (Throwable th2) {
            trackHttpRequestPerformedIfNeeded(endpoint, now, false, null);
            throw th2;
        }
    }

    private final BufferedWriter buffer(OutputStream outputStream) {
        return new BufferedWriter(new OutputStreamWriter(outputStream));
    }

    public /* synthetic */ HTTPClient(AppConfig appConfig, ETagManager eTagManager, DiagnosticsTracker diagnosticsTracker, SigningManager signingManager, StorefrontProvider storefrontProvider, DateProvider dateProvider, MapConverter mapConverter, int i10, g gVar) {
        this(appConfig, eTagManager, diagnosticsTracker, signingManager, storefrontProvider, (i10 & 32) != 0 ? new DefaultDateProvider() : dateProvider, (i10 & 64) != 0 ? new MapConverter() : mapConverter);
    }
}
