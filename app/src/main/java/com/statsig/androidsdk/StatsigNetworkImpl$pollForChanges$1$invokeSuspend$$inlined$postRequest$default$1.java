package com.statsig.androidsdk;

import Ad.l;
import K8.d;
import Ng.F;
import R4.b;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.N;
import com.google.gson.reflect.TypeToken;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import id.AbstractC3557B;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.GZIPInputStream;
import jf.y;
import kf.q;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@\u00a8\u0006\u0003"}, d2 = {"", TokenNames.T, "LNg/F;", "com/statsig/androidsdk/StatsigNetworkImpl$postRequest$3", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1", f = "StatsigNetwork.kt", l = {425, 427, 438, 447}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 extends AbstractC5163j implements n {
    final /* synthetic */ String $api;
    final /* synthetic */ String $bodyString;
    final /* synthetic */ ContextType $contextType;
    final /* synthetic */ Diagnostics $diagnostics;
    final /* synthetic */ String $endpoint;
    final /* synthetic */ String $eventsCount;
    final /* synthetic */ int $retries;
    final /* synthetic */ Integer $timeout;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ StatsigNetworkImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1(String str, String str2, Integer num, StatsigNetworkImpl statsigNetworkImpl, String str3, Diagnostics diagnostics, ContextType contextType, int i10, String str4, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.$api = str;
        this.$endpoint = str2;
        this.$timeout = num;
        this.this$0 = statsigNetworkImpl;
        this.$eventsCount = str3;
        this.$diagnostics = diagnostics;
        this.$contextType = contextType;
        this.$retries = i10;
        this.$bodyString = str4;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1 = new StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1(this.$api, this.$endpoint, this.$timeout, this.this$0, this.$eventsCount, this.$diagnostics, this.$contextType, this.$retries, this.$bodyString, abstractC4825e);
        statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1.L$0 = obj;
        return statsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1;
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigNetworkImpl$pollForChanges$1$invokeSuspend$$inlined$postRequest$default$1) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00c6: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:42:0x00c6 */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0339 A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:38:0x00b5, B:40:0x00c1, B:45:0x00cc, B:47:0x00d5, B:48:0x00e5, B:51:0x012a, B:52:0x0168, B:54:0x017e, B:55:0x0181, B:56:0x0187, B:58:0x018c, B:60:0x0197, B:61:0x019c, B:63:0x01a2, B:65:0x01b0, B:66:0x01b3, B:69:0x01bd, B:76:0x01d1, B:77:0x01d4, B:79:0x01d7, B:82:0x01f5, B:83:0x01fe, B:90:0x021e, B:92:0x0228, B:95:0x0238, B:97:0x0240, B:99:0x0246, B:100:0x024c, B:102:0x025a, B:103:0x025e, B:104:0x0265, B:107:0x027f, B:115:0x028d, B:116:0x0290, B:117:0x0291, B:119:0x029b, B:121:0x029f, B:123:0x02a3, B:128:0x02c6, B:130:0x02ce, B:137:0x02ed, B:139:0x02f4, B:141:0x02fc, B:151:0x031c, B:152:0x031f, B:158:0x0331, B:160:0x0339), top: B:168:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x003c, Exception -> 0x0040, TryCatch #12 {Exception -> 0x0040, all -> 0x003c, blocks: (B:14:0x0037, B:20:0x004a, B:29:0x0076, B:31:0x007c, B:33:0x0087, B:34:0x0090, B:35:0x00a8, B:37:0x00b3, B:134:0x02e5, B:145:0x0313, B:153:0x0320, B:154:0x0327), top: B:168:0x000f }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x02bd -> B:127:0x02bf). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        Exception e10;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection4;
        int i10;
        int i11;
        F f6;
        int i12;
        HttpURLConnection httpURLConnection5;
        String str;
        String str2;
        BufferedWriter bufferedWriter;
        InputStream inputStream;
        Marker.ErrorMessage errorMessage;
        String str3;
        int[] iArr;
        BufferedReader bufferedReader;
        I8.n nVar;
        I8.n nVar2;
        BufferedReader bufferedReader2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        ?? r32 = this.label;
        boolean z10 = true;
        ?? r92 = 0;
        try {
            try {
            } catch (Throwable th3) {
                th2 = th3;
                httpURLConnection = httpURLConnection3;
            }
        } catch (Exception e11) {
            e10 = e11;
            httpURLConnection2 = r32;
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection = r32;
        }
        if (r32 != 0) {
            if (r32 != 1) {
                if (r32 != 2) {
                    if (r32 != 3) {
                        if (r32 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e10 = (Exception) this.L$1;
                        httpURLConnection = (HttpURLConnection) this.L$0;
                        try {
                            N.B0(obj);
                            throw e10;
                        } catch (Throwable th5) {
                            th2 = th5;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th2;
                        }
                    }
                    i10 = this.I$0;
                    httpURLConnection4 = (HttpURLConnection) this.L$0;
                    N.B0(obj);
                    P4.a.p(i10);
                    httpURLConnection4.disconnect();
                    return null;
                }
                i11 = this.I$0;
                httpURLConnection4 = (HttpURLConnection) this.L$0;
                N.B0(obj);
                P4.a.p(i11);
                httpURLConnection4.disconnect();
                return null;
            }
            int i13 = this.I$0;
            HttpURLConnection httpURLConnection6 = (HttpURLConnection) this.L$1;
            f6 = (F) this.L$0;
            try {
                N.B0(obj);
                boolean z11 = true;
                i12 = i13;
                httpURLConnection5 = httpURLConnection6;
                z10 = z11;
                r92 = 0;
                if (!l.F0(f6)) {
                    if (Lg.n.c2(this.$api, Separators.SLASH, false)) {
                        str = AbstractC3557B.v2(this.$api, this.$endpoint);
                    } else {
                        str = this.$api + '/' + this.$endpoint;
                    }
                    URL url = new URL(str);
                    URLConnection openConnection = url.openConnection();
                    if (openConnection != null) {
                        try {
                            httpURLConnection2 = (HttpURLConnection) openConnection;
                            try {
                                if (AbstractC3557B.K(url.getProtocol(), "http")) {
                                    httpURLConnection2.setDoOutput(z10);
                                }
                                httpURLConnection2.setRequestMethod("POST");
                                Integer num = this.$timeout;
                                if (num != null) {
                                    httpURLConnection2.setConnectTimeout(num.intValue());
                                    httpURLConnection2.setReadTimeout(this.$timeout.intValue());
                                }
                                httpURLConnection2.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json; charset=UTF-8");
                                str2 = this.this$0.sdkKey;
                                httpURLConnection2.setRequestProperty("STATSIG-API-KEY", str2);
                                httpURLConnection2.setRequestProperty("STATSIG-SDK-TYPE", "android-client");
                                httpURLConnection2.setRequestProperty("STATSIG-SDK-VERSION", BuildConfig.VERSION_NAME);
                                httpURLConnection2.setRequestProperty("STATSIG-CLIENT-TIME", String.valueOf(System.currentTimeMillis()));
                                httpURLConnection2.setRequestProperty("STATSIG-EVENT-COUNT", this.$eventsCount);
                                httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
                                httpURLConnection2.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
                                Diagnostics diagnostics = this.$diagnostics;
                                if (diagnostics != null) {
                                    diagnostics.markStart(KeyType.INITIALIZE, StepType.NETWORK_REQUEST, new Marker(null, null, null, null, null, null, null, null, null, null, null, new Integer(i12), null, null, null, null, null, null, 260095, null), this.$contextType);
                                }
                                OutputStream outputStream = httpURLConnection2.getOutputStream();
                                AbstractC3557B.b0("connection.outputStream", outputStream);
                                Charset charset = Lg.a.f11131a;
                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
                                if (outputStreamWriter instanceof BufferedWriter) {
                                    bufferedWriter = (BufferedWriter) outputStreamWriter;
                                } else {
                                    bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
                                }
                                bufferedWriter.write(this.$bodyString);
                                l.S(bufferedWriter, r92);
                                int responseCode = httpURLConnection2.getResponseCode();
                                if (responseCode < 400) {
                                    inputStream = httpURLConnection2.getInputStream();
                                } else {
                                    inputStream = httpURLConnection2.getErrorStream();
                                }
                                if (responseCode >= 400) {
                                    try {
                                        AbstractC3557B.b0("inputStream", inputStream);
                                        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
                                        if (inputStreamReader instanceof BufferedReader) {
                                            bufferedReader2 = (BufferedReader) inputStreamReader;
                                        } else {
                                            bufferedReader2 = new BufferedReader(inputStreamReader, 8192);
                                        }
                                        String x02 = P4.a.x0(bufferedReader2);
                                        l.S(bufferedReader2, r92);
                                        errorMessage = new Marker.ErrorMessage(x02, String.valueOf(responseCode), r92);
                                    } finally {
                                    }
                                } else {
                                    errorMessage = r92;
                                }
                                StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                                Diagnostics diagnostics2 = this.$diagnostics;
                                ContextType contextType = this.$contextType;
                                KeyType keyType = KeyType.INITIALIZE;
                                Integer num2 = new Integer(responseCode);
                                List<String> list = httpURLConnection2.getHeaderFields().get("x-statsig-region");
                                if (list == null) {
                                    str3 = null;
                                } else {
                                    str3 = list.get(0);
                                }
                                statsigNetworkImpl.endDiagnostics(diagnostics2, contextType, keyType, num2, str3, new Integer(i12), errorMessage);
                                if (200 > responseCode || responseCode > 299) {
                                    iArr = StatsigNetworkKt.RETRY_CODES;
                                    if (q.U2(iArr, responseCode)) {
                                        int i14 = this.$retries;
                                        if (i14 > 0) {
                                            int i15 = i12 + 1;
                                            if (i12 < i14) {
                                                this.L$0 = f6;
                                                this.L$1 = httpURLConnection2;
                                                this.I$0 = i15;
                                                z11 = true;
                                                this.label = 1;
                                                if (b.p0((long) Math.pow(100.0d, i12 + 2), this) == enumC5000a) {
                                                    return enumC5000a;
                                                }
                                                i12 = i15;
                                                httpURLConnection5 = httpURLConnection2;
                                                z10 = z11;
                                                r92 = 0;
                                                if (!l.F0(f6)) {
                                                    if (httpURLConnection5 == null) {
                                                        return null;
                                                    }
                                                    httpURLConnection5.disconnect();
                                                    return null;
                                                }
                                            }
                                        }
                                        if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                                            StatsigNetworkImpl statsigNetworkImpl2 = this.this$0;
                                            String str4 = this.$bodyString;
                                            this.L$0 = httpURLConnection2;
                                            this.L$1 = null;
                                            this.I$0 = responseCode;
                                            this.label = 2;
                                            if (statsigNetworkImpl2.addFailedLogRequest(str4, this) == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            i11 = responseCode;
                                            httpURLConnection4 = httpURLConnection2;
                                            P4.a.p(i11);
                                            httpURLConnection4.disconnect();
                                            return null;
                                        }
                                        P4.a.p(responseCode);
                                        httpURLConnection2.disconnect();
                                        return null;
                                    }
                                    if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                                        StatsigNetworkImpl statsigNetworkImpl3 = this.this$0;
                                        String str5 = this.$bodyString;
                                        this.L$0 = httpURLConnection2;
                                        this.L$1 = null;
                                        this.I$0 = responseCode;
                                        this.label = 3;
                                        if (statsigNetworkImpl3.addFailedLogRequest(str5, this) == enumC5000a) {
                                            return enumC5000a;
                                        }
                                    }
                                    i10 = responseCode;
                                    httpURLConnection4 = httpURLConnection2;
                                    P4.a.p(i10);
                                    httpURLConnection4.disconnect();
                                    return null;
                                } else if (responseCode == 204 && AbstractC3557B.K(this.$endpoint, "initialize")) {
                                    nVar2 = this.this$0.gson;
                                    Object e12 = nVar2.e(InitializeResponse.SuccessfulInitializeResponse.class, "{has_updates: false}");
                                    httpURLConnection2.disconnect();
                                    return e12;
                                } else {
                                    String headerField = httpURLConnection2.getHeaderField(SIPHeaderNames.CONTENT_ENCODING);
                                    GZIPInputStream gZIPInputStream = inputStream;
                                    if (headerField != null) {
                                        gZIPInputStream = inputStream;
                                        if (headerField.equals("gzip")) {
                                            gZIPInputStream = new GZIPInputStream(inputStream);
                                        }
                                    }
                                    AbstractC3557B.b0("stream", gZIPInputStream);
                                    InputStreamReader inputStreamReader2 = new InputStreamReader(gZIPInputStream, charset);
                                    if (inputStreamReader2 instanceof BufferedReader) {
                                        bufferedReader = (BufferedReader) inputStreamReader2;
                                    } else {
                                        bufferedReader = new BufferedReader(inputStreamReader2, 8192);
                                    }
                                    try {
                                        nVar = this.this$0.gson;
                                        nVar.getClass();
                                        Object cast = d.U0(InitializeResponse.SuccessfulInitializeResponse.class).cast(nVar.d(bufferedReader, TypeToken.get(InitializeResponse.SuccessfulInitializeResponse.class)));
                                        Throwable th6 = null;
                                        httpURLConnection2.disconnect();
                                        return cast;
                                    } finally {
                                    }
                                }
                            } catch (Exception e13) {
                                e10 = e13;
                                if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                                    StatsigNetworkImpl statsigNetworkImpl4 = this.this$0;
                                    String str6 = this.$bodyString;
                                    this.L$0 = httpURLConnection2;
                                    this.L$1 = e10;
                                    this.label = 4;
                                    if (statsigNetworkImpl4.addFailedLogRequest(str6, this) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                }
                                httpURLConnection = httpURLConnection2;
                                throw e10;
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                                l.S(bufferedWriter, th);
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                    }
                }
            } catch (Exception e14) {
                e10 = e14;
                httpURLConnection2 = httpURLConnection6;
                if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                }
                httpURLConnection = httpURLConnection2;
                throw e10;
            } catch (Throwable th7) {
                th2 = th7;
                httpURLConnection = httpURLConnection6;
                if (httpURLConnection != null) {
                }
                throw th2;
            }
        } else {
            N.B0(obj);
            f6 = (F) this.L$0;
            i12 = 1;
            httpURLConnection5 = null;
            if (!l.F0(f6)) {
            }
        }
    }
}
