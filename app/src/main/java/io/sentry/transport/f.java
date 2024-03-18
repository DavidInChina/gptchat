package io.sentry.transport;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.EnumC3642e1;
import io.sentry.EnumC3652i;
import io.sentry.H;
import io.sentry.T0;
import io.sentry.o1;
import io.sentry.r1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import x8.W;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f34743e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final Proxy f34744a;

    /* renamed from: b  reason: collision with root package name */
    public final U3.c f34745b;

    /* renamed from: c  reason: collision with root package name */
    public final r1 f34746c;

    /* renamed from: d  reason: collision with root package name */
    public final o f34747d;

    public f(r1 r1Var, U3.c cVar, o oVar) {
        Proxy proxy;
        String str;
        String str2;
        this.f34745b = cVar;
        this.f34746c = r1Var;
        this.f34747d = oVar;
        o1 proxy2 = r1Var.getProxy();
        if (proxy2 != null && (str = proxy2.f34457b) != null && (str2 = proxy2.f34456a) != null) {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, Integer.parseInt(str)));
            } catch (NumberFormatException e10) {
                this.f34746c.getLogger().b(EnumC3642e1.ERROR, e10, android.gov.nist.core.a.A("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
            }
            this.f34744a = proxy;
            if (proxy == null && r1Var.getProxy() != null) {
                String str3 = r1Var.getProxy().f34458c;
                String str4 = r1Var.getProxy().f34459d;
                if (str3 != null && str4 != null) {
                    Authenticator.setDefault(new l(str3, str4));
                    return;
                }
                return;
            }
        }
        proxy = null;
        this.f34744a = proxy;
        if (proxy == null) {
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
        httpURLConnection.disconnect();
    }

    public static String b(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f34743e));
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = true;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!z10) {
                    sb2.append(Separators.RETURN);
                }
                sb2.append(readLine);
                z10 = false;
            }
            String sb3 = sb2.toString();
            bufferedReader.close();
            if (errorStream != null) {
                errorStream.close();
            }
            return sb3;
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final W c(HttpURLConnection httpURLConnection) {
        r1 r1Var = this.f34746c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    r1Var.getLogger().f(EnumC3642e1.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return r.f34762a;
                }
                H logger = r1Var.getLogger();
                EnumC3642e1 enumC3642e1 = EnumC3642e1.ERROR;
                logger.f(enumC3642e1, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (r1Var.isDebug()) {
                    r1Var.getLogger().f(enumC3642e1, "%s", b(httpURLConnection));
                }
                return new q(responseCode);
            } catch (IOException e10) {
                r1Var.getLogger().b(EnumC3642e1.ERROR, e10, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return new q(-1);
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final W d(T0 t02) {
        URLConnection uRLConnection;
        OutputStream outputStream;
        GZIPOutputStream gZIPOutputStream;
        U3.c cVar = this.f34745b;
        Proxy proxy = this.f34744a;
        if (proxy == null) {
            uRLConnection = ((URL) cVar.f17396Z).openConnection();
        } else {
            uRLConnection = ((URL) cVar.f17396Z).openConnection(proxy);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        for (Map.Entry entry : ((Map) cVar.f17397h0).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        r1 r1Var = this.f34746c;
        httpURLConnection.setConnectTimeout(r1Var.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(r1Var.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = r1Var.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            outputStream = httpURLConnection.getOutputStream();
            gZIPOutputStream = new GZIPOutputStream(outputStream);
        } catch (Throwable th2) {
            try {
                r1Var.getLogger().b(EnumC3642e1.ERROR, th2, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                c(httpURLConnection);
            }
        }
        try {
            r1Var.getSerializer().b(t02, gZIPOutputStream);
            gZIPOutputStream.close();
            if (outputStream != null) {
                outputStream.close();
            }
            return c(httpURLConnection);
        } catch (Throwable th3) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(HttpURLConnection httpURLConnection, int i10) {
        long parseDouble;
        String[] strArr;
        long parseDouble2;
        String[] strArr2;
        IllegalArgumentException e10;
        EnumC3652i enumC3652i;
        String headerField = httpURLConnection.getHeaderField(SIPHeaderNames.RETRY_AFTER);
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        o oVar = this.f34747d;
        r1 r1Var = oVar.f34758b;
        double d10 = 1000.0d;
        g gVar = oVar.f34757a;
        if (headerField2 != null) {
            int i11 = -1;
            String[] split = headerField2.split(Separators.COMMA, -1);
            int length = split.length;
            int i12 = 0;
            while (i12 < length) {
                String[] split2 = split[i12].replace(Separators.SP, "").split(":", i11);
                if (split2.length > 0) {
                    String str = split2[0];
                    if (str != null) {
                        try {
                            parseDouble2 = (long) (Double.parseDouble(str) * d10);
                        } catch (NumberFormatException unused) {
                        }
                        if (split2.length > 1) {
                            String str2 = split2[1];
                            Date date = new Date(gVar.getCurrentTimeMillis() + parseDouble2);
                            if (str2 != null && !str2.isEmpty()) {
                                String[] split3 = str2.split(Separators.SEMICOLON, i11);
                                int length2 = split3.length;
                                int i13 = 0;
                                while (i13 < length2) {
                                    String str3 = split3[i13];
                                    EnumC3652i enumC3652i2 = EnumC3652i.Unknown;
                                    try {
                                        String a5 = io.sentry.util.e.a(str3);
                                        if (a5 != null) {
                                            enumC3652i2 = EnumC3652i.valueOf(a5);
                                            strArr2 = split;
                                        } else {
                                            strArr2 = split;
                                            try {
                                                r1Var.getLogger().f(EnumC3642e1.ERROR, "Couldn't capitalize: %s", str3);
                                            } catch (IllegalArgumentException e11) {
                                                e10 = e11;
                                                r1Var.getLogger().b(EnumC3642e1.INFO, e10, "Unknown category: %s", str3);
                                                enumC3652i = enumC3652i2;
                                                if (EnumC3652i.Unknown.equals(enumC3652i)) {
                                                }
                                                i13++;
                                                split = strArr2;
                                            }
                                        }
                                    } catch (IllegalArgumentException e12) {
                                        e10 = e12;
                                        strArr2 = split;
                                    }
                                    enumC3652i = enumC3652i2;
                                    if (EnumC3652i.Unknown.equals(enumC3652i)) {
                                        oVar.a(enumC3652i, date);
                                    }
                                    i13++;
                                    split = strArr2;
                                }
                            } else {
                                strArr = split;
                                oVar.a(EnumC3652i.All, date);
                                i12++;
                                split = strArr;
                                d10 = 1000.0d;
                                i11 = -1;
                            }
                        }
                    }
                    parseDouble2 = StatsigLoggerKt.FLUSH_TIMER_MS;
                    if (split2.length > 1) {
                    }
                }
                strArr = split;
                i12++;
                split = strArr;
                d10 = 1000.0d;
                i11 = -1;
            }
        } else if (i10 == 429) {
            if (headerField != null) {
                try {
                    parseDouble = (long) (Double.parseDouble(headerField) * 1000.0d);
                } catch (NumberFormatException unused2) {
                }
                oVar.a(EnumC3652i.All, new Date(gVar.getCurrentTimeMillis() + parseDouble));
            }
            parseDouble = StatsigLoggerKt.FLUSH_TIMER_MS;
            oVar.a(EnumC3652i.All, new Date(gVar.getCurrentTimeMillis() + parseDouble));
        }
    }
}
