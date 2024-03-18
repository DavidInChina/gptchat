package com.revenuecat.purchases.common.verification;

import E9.f;
import Lg.a;
import Lg.n;
import android.gov.nist.core.Separators;
import android.util.Base64;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jf.C3959i;
import kf.q;
import kf.t;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import l8.AbstractC4344b;
import r9.y;
import yf.AbstractC6583a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 %2\u00020\u0001:\u0002%&B\u001f\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020\u0007\u00a2\u0006\u0004\b#\u0010$J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ3\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJQ\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"\u00a8\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "shouldVerifyEndpoint", "(Lcom/revenuecat/purchases/common/networking/Endpoint;)Z", "", "createRandomNonce", "()Ljava/lang/String;", "", "Ljf/i;", "postFieldsToSign", "getPostParamsForSigningHeaderIfNeeded", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/List;)Ljava/lang/String;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Lcom/revenuecat/purchases/VerificationResult;", "verifyResponse", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/VerificationResult;", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "apiKey", "Ljava/lang/String;", "<init>", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "Companion", "Parameters", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SigningManager {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;
    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";
    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e\u00a8\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", "toString", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            AbstractC3557B.c0("salt", bArr);
            AbstractC3557B.c0("apiKey", str);
            AbstractC3557B.c0("urlPath", str3);
            AbstractC3557B.c0("requestTime", str5);
            this.salt = bArr;
            this.apiKey = str;
            this.nonce = str2;
            this.urlPath = str3;
            this.postParamsHashHeader = str4;
            this.requestTime = str5;
            this.eTag = str6;
            this.body = str7;
        }

        public final byte[] component1() {
            return this.salt;
        }

        public final String component2() {
            return this.apiKey;
        }

        public final String component3() {
            return this.nonce;
        }

        public final String component4() {
            return this.urlPath;
        }

        public final String component5() {
            return this.postParamsHashHeader;
        }

        public final String component6() {
            return this.requestTime;
        }

        public final String component7() {
            return this.eTag;
        }

        public final String component8() {
            return this.body;
        }

        public final Parameters copy(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            AbstractC3557B.c0("salt", bArr);
            AbstractC3557B.c0("apiKey", str);
            AbstractC3557B.c0("urlPath", str3);
            AbstractC3557B.c0("requestTime", str5);
            return new Parameters(bArr, str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!AbstractC3557B.K(Parameters.class, cls)) {
                return false;
            }
            AbstractC3557B.a0("null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters", obj);
            Parameters parameters = (Parameters) obj;
            if (Arrays.equals(this.salt, parameters.salt) && AbstractC3557B.K(this.apiKey, parameters.apiKey) && AbstractC3557B.K(this.nonce, parameters.nonce) && AbstractC3557B.K(this.urlPath, parameters.urlPath) && AbstractC3557B.K(this.postParamsHashHeader, parameters.postParamsHashHeader) && AbstractC3557B.K(this.requestTime, parameters.requestTime) && AbstractC3557B.K(this.eTag, parameters.eTag) && AbstractC3557B.K(this.body, parameters.body)) {
                return true;
            }
            return false;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int v10 = f.v(this.apiKey, Arrays.hashCode(this.salt) * 31, 31);
            String str = this.nonce;
            int i13 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int v11 = f.v(this.urlPath, (v10 + i10) * 31, 31);
            String str2 = this.postParamsHashHeader;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int v12 = f.v(this.requestTime, (v11 + i11) * 31, 31);
            String str3 = this.eTag;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i14 = (v12 + i12) * 31;
            String str4 = this.body;
            if (str4 != null) {
                i13 = str4.hashCode();
            }
            return i14 + i13;
        }

        public final byte[] toSignatureToVerify() {
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4;
            byte[] bArr5 = this.salt;
            String str = this.apiKey;
            Charset charset = a.f11131a;
            byte[] bytes = str.getBytes(charset);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
            byte[] t32 = q.t3(bArr5, bytes);
            String str2 = this.nonce;
            if (str2 != null) {
                bArr = Base64.decode(str2, 0);
            } else {
                bArr = null;
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            byte[] t33 = q.t3(t32, bArr);
            byte[] bytes2 = this.urlPath.getBytes(charset);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes2);
            byte[] t34 = q.t3(t33, bytes2);
            String str3 = this.postParamsHashHeader;
            if (str3 != null) {
                bArr2 = str3.getBytes(charset);
                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bArr2);
            } else {
                bArr2 = new byte[0];
            }
            byte[] t35 = q.t3(t34, bArr2);
            byte[] bytes3 = this.requestTime.getBytes(charset);
            AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes3);
            byte[] t36 = q.t3(t35, bytes3);
            String str4 = this.eTag;
            if (str4 != null) {
                bArr3 = str4.getBytes(charset);
                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bArr3);
            } else {
                bArr3 = new byte[0];
            }
            byte[] t37 = q.t3(t36, bArr3);
            String str5 = this.body;
            if (str5 != null) {
                bArr4 = str5.getBytes(charset);
                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bArr4);
            } else {
                bArr4 = new byte[0];
            }
            return q.t3(t37, bArr4);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Parameters(salt=");
            sb2.append(Arrays.toString(this.salt));
            sb2.append(", apiKey=");
            sb2.append(this.apiKey);
            sb2.append(", nonce=");
            sb2.append(this.nonce);
            sb2.append(", urlPath=");
            sb2.append(this.urlPath);
            sb2.append(", postParamsHashHeader=");
            sb2.append(this.postParamsHashHeader);
            sb2.append(", requestTime=");
            sb2.append(this.requestTime);
            sb2.append(", eTag=");
            sb2.append(this.eTag);
            sb2.append(", body=");
            return android.gov.nist.core.a.n(sb2, this.body, ')');
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String str) {
        AbstractC3557B.c0("signatureVerificationMode", signatureVerificationMode);
        AbstractC3557B.c0("appConfig", appConfig);
        AbstractC3557B.c0("apiKey", str);
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = str;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] encode = Base64.encode(bArr, 0);
        AbstractC3557B.b0("encode(bytes, Base64.DEFAULT)", encode);
        return n.U2(new String(encode, a.f11131a)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<C3959i> list) {
        AbstractC3557B.c0("endpoint", endpoint);
        if (list == null || list.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                C3959i c3959i = (C3959i) obj;
                if (i10 > 0) {
                    messageDigest.update((byte) 0);
                }
                byte[] bytes = ((String) c3959i.f36156Z).getBytes(a.f11131a);
                AbstractC3557B.b0("this as java.lang.String).getBytes(charset)", bytes);
                messageDigest.update(bytes);
                arrayList.add(jf.y.f36177a);
                i10 = i11;
            } else {
                AbstractC4344b.d1();
                throw null;
            }
        }
        byte[] digest = messageDigest.digest();
        AbstractC3557B.b0("sha256Digest.digest()", digest);
        String str = "";
        for (byte b10 : digest) {
            StringBuilder p10 = android.gov.nist.core.a.p(str);
            p10.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
            str = p10.toString();
        }
        return t.m2(AbstractC4344b.G0(t.m2(list, Separators.COMMA, null, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30), POST_PARAMS_ALGORITHM, str), ":", null, null, null, 62);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        AbstractC3557B.c0("endpoint", endpoint);
        if (endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify()) {
            return true;
        }
        return false;
    }

    public final VerificationResult verifyResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3557B.c0("urlPath", str);
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: ".concat(str));
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (str2 == null) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{str}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        } else if (str5 == null) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{str}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        } else if (str4 == null && str6 == null) {
            LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{str}, 1)), null, 2, null);
            return VerificationResult.FAILED;
        } else {
            try {
                Signature fromString$purchases_customEntitlementComputationRelease = Signature.Companion.fromString$purchases_customEntitlementComputationRelease(str2);
                Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(fromString$purchases_customEntitlementComputationRelease);
                if (createIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                    LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{str, ((PurchasesError) ((Result.Error) createIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2)), null, 2, null);
                    return VerificationResult.FAILED;
                } else if (createIntermediateKeyVerifierIfVerified instanceof Result.Success) {
                    if (((SignatureVerifier) ((Result.Success) createIntermediateKeyVerifierIfVerified).getValue()).verify(fromString$purchases_customEntitlementComputationRelease.getPayload(), new Parameters(fromString$purchases_customEntitlementComputationRelease.getSalt(), this.apiKey, str3, str, str7, str5, str6, str4).toSignatureToVerify())) {
                        LogUtilsKt.verboseLog(String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{str}, 1)));
                        return VerificationResult.VERIFIED;
                    }
                    LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{str}, 1)), null, 2, null);
                    return VerificationResult.FAILED;
                } else {
                    throw new RuntimeException();
                }
            } catch (InvalidSignatureSizeException e10) {
                LogUtilsKt.errorLog$default(String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{str, e10.getMessage()}, 2)), null, 2, null);
                return VerificationResult.FAILED;
            }
        }
    }
}
