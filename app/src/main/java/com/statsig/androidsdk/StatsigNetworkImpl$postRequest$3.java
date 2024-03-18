package com.statsig.androidsdk;

import Ad.l;
import Ng.F;
import R4.b;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.android.gms.internal.play_billing.N;
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
import wf.k;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"", TokenNames.T, "LNg/F;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigNetworkImpl$postRequest$3", f = "StatsigNetwork.kt", l = {425, 427, 438, 447}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigNetworkImpl$postRequest$3 extends AbstractC5163j implements n {
    final /* synthetic */ String $api;
    final /* synthetic */ String $bodyString;
    final /* synthetic */ k $callback;
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
    public StatsigNetworkImpl$postRequest$3(String str, String str2, Integer num, StatsigNetworkImpl statsigNetworkImpl, String str3, Diagnostics diagnostics, ContextType contextType, int i10, String str4, k kVar, AbstractC4825e abstractC4825e) {
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
        this.$callback = kVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        StatsigNetworkImpl$postRequest$3 statsigNetworkImpl$postRequest$3 = new StatsigNetworkImpl$postRequest$3(this.$api, this.$endpoint, this.$timeout, this.this$0, this.$eventsCount, this.$diagnostics, this.$contextType, this.$retries, this.$bodyString, this.$callback, abstractC4825e);
        statsigNetworkImpl$postRequest$3.L$0 = obj;
        return statsigNetworkImpl$postRequest$3;
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigNetworkImpl$postRequest$3) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00c6: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:42:0x00c6 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0314 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033d A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #1 {all -> 0x00c5, blocks: (B:38:0x00b5, B:40:0x00c1, B:45:0x00cc, B:47:0x00d5, B:48:0x00e5, B:51:0x012a, B:52:0x0168, B:54:0x017e, B:55:0x0181, B:56:0x0187, B:58:0x018c, B:60:0x0197, B:61:0x019c, B:63:0x01a2, B:65:0x01b0, B:66:0x01b3, B:69:0x01bd, B:76:0x01d1, B:77:0x01d4, B:79:0x01d7, B:82:0x01f5, B:83:0x01fe, B:89:0x021c, B:92:0x0227, B:93:0x0230, B:94:0x0231, B:96:0x0239, B:98:0x023f, B:99:0x0245, B:101:0x0253, B:102:0x0257, B:103:0x025e, B:111:0x026f, B:112:0x0272, B:113:0x0273, B:115:0x027d, B:117:0x0281, B:119:0x0285, B:124:0x02a8, B:126:0x02b0, B:134:0x02da, B:137:0x02e9, B:139:0x02f1, B:152:0x0320, B:153:0x0323, B:159:0x0335, B:161:0x033d), top: B:169:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x003c, Exception -> 0x0040, TryCatch #12 {Exception -> 0x0040, all -> 0x003c, blocks: (B:14:0x0037, B:20:0x004a, B:29:0x0076, B:31:0x007c, B:33:0x0087, B:34:0x0090, B:35:0x00a8, B:37:0x00b3, B:130:0x02c7, B:143:0x0308, B:154:0x0324, B:155:0x032b), top: B:169:0x000f }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x029f -> B:123:0x02a1). Please submit an issue!!! */
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
        HttpURLConnection httpURLConnection5;
        int i11;
        F f6;
        int i12;
        HttpURLConnection httpURLConnection6;
        String str;
        String str2;
        BufferedWriter bufferedWriter;
        InputStream inputStream;
        Marker.ErrorMessage errorMessage;
        String str3;
        int[] iArr;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        I8.n unused;
        I8.n unused2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        ?? r32 = this.label;
        boolean z10 = true;
        ?? r62 = 0;
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
                    this.$callback.invoke(new Integer(i10));
                    if (httpURLConnection4 != null) {
                        return null;
                    }
                    httpURLConnection4.disconnect();
                    return null;
                }
                i11 = this.I$0;
                httpURLConnection5 = (HttpURLConnection) this.L$0;
                N.B0(obj);
                this.$callback.invoke(new Integer(i11));
                if (httpURLConnection5 != null) {
                    return null;
                }
                httpURLConnection5.disconnect();
                return null;
            }
            int i13 = this.I$0;
            HttpURLConnection httpURLConnection7 = (HttpURLConnection) this.L$1;
            f6 = (F) this.L$0;
            try {
                N.B0(obj);
                boolean z11 = true;
                i12 = i13;
                httpURLConnection6 = httpURLConnection7;
                z10 = z11;
                r62 = 0;
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
                                l.S(bufferedWriter, r62);
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
                                        l.S(bufferedReader2, r62);
                                        errorMessage = new Marker.ErrorMessage(x02, String.valueOf(responseCode), r62);
                                    } finally {
                                    }
                                } else {
                                    errorMessage = r62;
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
                                                httpURLConnection6 = httpURLConnection2;
                                                z10 = z11;
                                                r62 = 0;
                                                if (!l.F0(f6)) {
                                                    if (httpURLConnection6 == null) {
                                                        return null;
                                                    }
                                                    httpURLConnection6.disconnect();
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
                                            httpURLConnection5 = httpURLConnection2;
                                            this.$callback.invoke(new Integer(i11));
                                            if (httpURLConnection5 != null) {
                                            }
                                        } else {
                                            this.$callback.invoke(new Integer(responseCode));
                                            httpURLConnection2.disconnect();
                                            return null;
                                        }
                                    } else {
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
                                        this.$callback.invoke(new Integer(i10));
                                        if (httpURLConnection4 != null) {
                                        }
                                    }
                                } else {
                                    if (responseCode == 204 && AbstractC3557B.K(this.$endpoint, "initialize")) {
                                        unused = this.this$0.gson;
                                        AbstractC3557B.B2();
                                        throw null;
                                    }
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
                                        unused2 = this.this$0.gson;
                                        AbstractC3557B.B2();
                                        throw null;
                                    } finally {
                                    }
                                }
                            } catch (Exception e12) {
                                e10 = e12;
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
            } catch (Exception e13) {
                e10 = e13;
                httpURLConnection2 = httpURLConnection7;
                if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                }
                httpURLConnection = httpURLConnection2;
                throw e10;
            } catch (Throwable th6) {
                th2 = th6;
                httpURLConnection = httpURLConnection7;
                if (httpURLConnection != null) {
                }
                throw th2;
            }
        } else {
            N.B0(obj);
            f6 = (F) this.L$0;
            i12 = 1;
            httpURLConnection6 = null;
            if (!l.F0(f6)) {
            }
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Throwable th2;
        Exception e10;
        String str;
        String str2;
        BufferedWriter bufferedWriter;
        GZIPInputStream gZIPInputStream;
        Marker.ErrorMessage errorMessage;
        String str3;
        int[] iArr;
        BufferedReader bufferedReader;
        I8.n unused;
        I8.n unused2;
        F f6 = (F) this.L$0;
        boolean z10 = true;
        int i10 = 1;
        HttpURLConnection httpURLConnection = null;
        while (l.F0(f6)) {
            try {
                try {
                    if (Lg.n.c2(this.$api, Separators.SLASH, false)) {
                        str = AbstractC3557B.v2(this.$api, this.$endpoint);
                    } else {
                        str = this.$api + '/' + this.$endpoint;
                    }
                    URL url = new URL(str);
                    URLConnection openConnection = url.openConnection();
                    if (openConnection != null) {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
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
                                diagnostics.markStart(KeyType.INITIALIZE, StepType.NETWORK_REQUEST, new Marker(null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(i10), null, null, null, null, null, null, 260095, null), this.$contextType);
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
                            l.S(bufferedWriter, null);
                            int responseCode = httpURLConnection2.getResponseCode();
                            if (responseCode < 400) {
                                gZIPInputStream = httpURLConnection2.getInputStream();
                            } else {
                                gZIPInputStream = httpURLConnection2.getErrorStream();
                            }
                            if (responseCode >= 400) {
                                AbstractC3557B.b0("inputStream", gZIPInputStream);
                                InputStreamReader inputStreamReader = new InputStreamReader(gZIPInputStream, charset);
                                if (inputStreamReader instanceof BufferedReader) {
                                    bufferedReader = (BufferedReader) inputStreamReader;
                                } else {
                                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                                }
                                String x02 = P4.a.x0(bufferedReader);
                                l.S(bufferedReader, null);
                                errorMessage = new Marker.ErrorMessage(x02, String.valueOf(responseCode), null);
                            } else {
                                errorMessage = null;
                            }
                            StatsigNetworkImpl statsigNetworkImpl = this.this$0;
                            Diagnostics diagnostics2 = this.$diagnostics;
                            ContextType contextType = this.$contextType;
                            KeyType keyType = KeyType.INITIALIZE;
                            Integer valueOf = Integer.valueOf(responseCode);
                            List<String> list = httpURLConnection2.getHeaderFields().get("x-statsig-region");
                            if (list == null) {
                                str3 = null;
                            } else {
                                str3 = list.get(0);
                            }
                            statsigNetworkImpl.endDiagnostics(diagnostics2, contextType, keyType, valueOf, str3, Integer.valueOf(i10), errorMessage);
                            if (200 > responseCode || responseCode > 299) {
                                iArr = StatsigNetworkKt.RETRY_CODES;
                                if (q.U2(iArr, responseCode)) {
                                    int i11 = this.$retries;
                                    if (i11 > 0) {
                                        int i12 = i10 + 1;
                                        if (i10 < i11) {
                                            b.p0((long) Math.pow(100.0d, i10 + 2), this);
                                            httpURLConnection = httpURLConnection2;
                                            i10 = i12;
                                            z10 = true;
                                        }
                                    }
                                    if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                                        this.this$0.addFailedLogRequest(this.$bodyString, this);
                                        this.$callback.invoke(Integer.valueOf(responseCode));
                                        httpURLConnection2.disconnect();
                                        return null;
                                    }
                                    this.$callback.invoke(Integer.valueOf(responseCode));
                                    httpURLConnection2.disconnect();
                                    return null;
                                }
                                if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                                    this.this$0.addFailedLogRequest(this.$bodyString, this);
                                }
                                this.$callback.invoke(Integer.valueOf(responseCode));
                                httpURLConnection2.disconnect();
                                return null;
                            }
                            if (responseCode == 204 && AbstractC3557B.K(this.$endpoint, "initialize")) {
                                unused = this.this$0.gson;
                                AbstractC3557B.B2();
                                throw null;
                            }
                            String headerField = httpURLConnection2.getHeaderField(SIPHeaderNames.CONTENT_ENCODING);
                            if (headerField != null && headerField.equals("gzip")) {
                                gZIPInputStream = new GZIPInputStream(gZIPInputStream);
                            }
                            AbstractC3557B.b0("stream", gZIPInputStream);
                            InputStreamReader inputStreamReader2 = new InputStreamReader(gZIPInputStream, charset);
                            if (inputStreamReader2 instanceof BufferedReader) {
                                BufferedReader bufferedReader2 = (BufferedReader) inputStreamReader2;
                            } else {
                                new BufferedReader(inputStreamReader2, 8192);
                            }
                            unused2 = this.this$0.gson;
                            AbstractC3557B.B2();
                            throw null;
                        } catch (Exception e11) {
                            e10 = e11;
                            httpURLConnection = httpURLConnection2;
                            if (AbstractC3557B.K(this.$endpoint, "log_event")) {
                                this.this$0.addFailedLogRequest(this.$bodyString, this);
                            }
                            throw e10;
                        } catch (Throwable th3) {
                            th2 = th3;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th2;
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                } catch (Exception e12) {
                    e10 = e12;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        return null;
    }
}
