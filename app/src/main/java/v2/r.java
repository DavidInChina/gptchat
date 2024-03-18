package v2;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import s2.AbstractC5530A;
import x8.p0;

/* loaded from: classes.dex */
public final class r extends AbstractC5964c {

    /* renamed from: f  reason: collision with root package name */
    public final int f47125f;

    /* renamed from: g  reason: collision with root package name */
    public final int f47126g;

    /* renamed from: h  reason: collision with root package name */
    public final String f47127h;

    /* renamed from: i  reason: collision with root package name */
    public final V.s f47128i;

    /* renamed from: m  reason: collision with root package name */
    public HttpURLConnection f47132m;

    /* renamed from: n  reason: collision with root package name */
    public InputStream f47133n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f47134o;

    /* renamed from: p  reason: collision with root package name */
    public int f47135p;

    /* renamed from: q  reason: collision with root package name */
    public long f47136q;

    /* renamed from: r  reason: collision with root package name */
    public long f47137r;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f47124e = false;

    /* renamed from: l  reason: collision with root package name */
    public final w8.g f47131l = null;

    /* renamed from: j  reason: collision with root package name */
    public final V.s f47129j = new V.s(1);

    /* renamed from: k  reason: collision with root package name */
    public final boolean f47130k = false;

    public r(String str, int i10, int i11, V.s sVar) {
        super(true);
        this.f47127h = str;
        this.f47125f = i10;
        this.f47126g = i11;
        this.f47128i = sVar;
    }

    public static void x(HttpURLConnection httpURLConnection, long j6) {
        int i10;
        if (httpURLConnection != null && (i10 = AbstractC5530A.f45131a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j6 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j6 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d A[Catch: IOException -> 0x0158, TRY_LEAVE, TryCatch #3 {IOException -> 0x0158, blocks: (B:55:0x0145, B:57:0x014d), top: B:114:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bd  */
    @Override // v2.AbstractC5969h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(l lVar) {
        HttpURLConnection httpURLConnection;
        i iVar;
        long j6;
        boolean z10;
        HttpURLConnection httpURLConnection2;
        long j10;
        long parseLong;
        long j11;
        long j12;
        long j13;
        long parseLong2;
        this.f47137r = 0L;
        this.f47136q = 0L;
        r();
        try {
            HttpURLConnection w10 = w(lVar);
            this.f47132m = w10;
            this.f47135p = w10.getResponseCode();
            w10.getResponseMessage();
            int i10 = this.f47135p;
            long j14 = lVar.f47100f;
            long j15 = lVar.f47101g;
            if (i10 >= 200 && i10 <= 299) {
                String contentType = w10.getContentType();
                w8.g gVar = this.f47131l;
                if (gVar != null && !gVar.apply(contentType)) {
                    t();
                    throw new w(R.a.r("Invalid content type: ", contentType), 2003);
                }
                if (this.f47135p != 200 || j14 == 0) {
                    j14 = 0;
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(w10.getHeaderField(SIPHeaderNames.CONTENT_ENCODING));
                if (!equalsIgnoreCase) {
                    if (j15 != -1) {
                        this.f47136q = j15;
                        httpURLConnection2 = w10;
                        j10 = j14;
                    } else {
                        String headerField = w10.getHeaderField(SIPHeaderNames.CONTENT_LENGTH);
                        String headerField2 = w10.getHeaderField("Content-Range");
                        Pattern pattern = z.f47145a;
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                parseLong = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                s2.p.c("HttpUtil", "Unexpected Content-Length [" + headerField + "]");
                            }
                            if (!TextUtils.isEmpty(headerField2)) {
                                Matcher matcher = z.f47145a.matcher(headerField2);
                                if (matcher.matches()) {
                                    try {
                                        String group = matcher.group(2);
                                        group.getClass();
                                        long parseLong3 = Long.parseLong(group);
                                        String group2 = matcher.group(1);
                                        group2.getClass();
                                        httpURLConnection2 = w10;
                                        parseLong2 = (parseLong3 - Long.parseLong(group2)) + 1;
                                        j10 = j14;
                                        j11 = parseLong;
                                    } catch (NumberFormatException unused2) {
                                        httpURLConnection2 = w10;
                                        j10 = j14;
                                        j11 = parseLong;
                                    }
                                    if (j11 < 0) {
                                        j12 = parseLong2;
                                    } else {
                                        if (j11 != parseLong2) {
                                            try {
                                                s2.p.g("HttpUtil", "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
                                                j12 = Math.max(j11, parseLong2);
                                            } catch (NumberFormatException unused3) {
                                                s2.p.c("HttpUtil", "Unexpected Content-Range [" + headerField2 + "]");
                                                j12 = j11;
                                                if (j12 == -1) {
                                                }
                                                this.f47136q = j13;
                                                this.f47133n = httpURLConnection2.getInputStream();
                                                if (equalsIgnoreCase) {
                                                }
                                                this.f47134o = true;
                                                s(lVar);
                                                try {
                                                    y(j10);
                                                    return this.f47136q;
                                                } catch (IOException e10) {
                                                    t();
                                                    if (e10 instanceof w) {
                                                        throw ((w) e10);
                                                    }
                                                    throw new w(e10, 2000, 1);
                                                }
                                            }
                                        }
                                        j12 = j11;
                                    }
                                    if (j12 == -1) {
                                        j13 = j12 - j10;
                                    } else {
                                        j13 = -1;
                                    }
                                    this.f47136q = j13;
                                }
                            }
                            httpURLConnection2 = w10;
                            j10 = j14;
                            j11 = parseLong;
                            j12 = j11;
                            if (j12 == -1) {
                            }
                            this.f47136q = j13;
                        }
                        parseLong = -1;
                        if (!TextUtils.isEmpty(headerField2)) {
                        }
                        httpURLConnection2 = w10;
                        j10 = j14;
                        j11 = parseLong;
                        j12 = j11;
                        if (j12 == -1) {
                        }
                        this.f47136q = j13;
                    }
                } else {
                    httpURLConnection2 = w10;
                    j10 = j14;
                    this.f47136q = j15;
                }
                try {
                    this.f47133n = httpURLConnection2.getInputStream();
                    if (equalsIgnoreCase) {
                        this.f47133n = new GZIPInputStream(this.f47133n);
                    }
                    this.f47134o = true;
                    s(lVar);
                    y(j10);
                    return this.f47136q;
                } catch (IOException e11) {
                    t();
                    throw new w(e11, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = w10.getHeaderFields();
            if (this.f47135p == 416) {
                httpURLConnection = w10;
                String headerField3 = httpURLConnection.getHeaderField("Content-Range");
                Pattern pattern2 = z.f47145a;
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = z.f47146b.matcher(headerField3);
                    if (matcher2.matches()) {
                        z10 = true;
                        String group3 = matcher2.group(1);
                        group3.getClass();
                        j6 = Long.parseLong(group3);
                        if (j14 == j6) {
                            this.f47134o = z10;
                            s(lVar);
                            if (j15 == -1) {
                                return 0L;
                            }
                            return j15;
                        }
                    }
                }
                z10 = true;
                j6 = -1;
                if (j14 == j6) {
                }
            } else {
                httpURLConnection = w10;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                if (errorStream != null) {
                    int i11 = AbstractC5530A.f45131a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = errorStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i12 = AbstractC5530A.f45131a;
                }
            } catch (IOException unused4) {
                int i13 = AbstractC5530A.f45131a;
            }
            t();
            if (this.f47135p == 416) {
                iVar = new i(2008);
            } else {
                iVar = null;
            }
            throw new y(this.f47135p, iVar, headerFields);
        } catch (IOException e12) {
            t();
            throw w.b(e12, 1);
        }
    }

    @Override // v2.AbstractC5969h
    public final void close() {
        try {
            InputStream inputStream = this.f47133n;
            if (inputStream != null) {
                long j6 = this.f47136q;
                long j10 = -1;
                if (j6 != -1) {
                    j10 = j6 - this.f47137r;
                }
                x(this.f47132m, j10);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = AbstractC5530A.f45131a;
                    throw new w(e10, 2000, 3);
                }
            }
        } finally {
            this.f47133n = null;
            t();
            if (this.f47134o) {
                this.f47134o = false;
                q();
            }
        }
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f47132m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // v2.AbstractC5964c, v2.AbstractC5969h
    public final Map j() {
        HttpURLConnection httpURLConnection = this.f47132m;
        if (httpURLConnection == null) {
            return p0.f49595l0;
        }
        return new q(httpURLConnection.getHeaderFields());
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j6 = this.f47136q;
            if (j6 != -1) {
                long j10 = j6 - this.f47137r;
                if (j10 != 0) {
                    i11 = (int) Math.min(i11, j10);
                }
                return -1;
            }
            InputStream inputStream = this.f47133n;
            int i12 = AbstractC5530A.f45131a;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.f47137r += read;
            p(read);
            return read;
        } catch (IOException e10) {
            int i13 = AbstractC5530A.f45131a;
            throw w.b(e10, 2);
        }
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.f47132m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                s2.p.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f47132m = null;
        }
    }

    public final URL u(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new w(R.a.r("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f47124e && !protocol.equals(url.getProtocol())) {
                    throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + Separators.RPAREN, 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new w(e10, 2001, 1);
            }
        }
        throw new w("Null location redirect", 2001);
    }

    public final HttpURLConnection v(URL url, int i10, byte[] bArr, long j6, long j10, boolean z10, boolean z11, Map map) {
        String str;
        String str2;
        boolean z12;
        String str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f47125f);
        httpURLConnection.setReadTimeout(this.f47126g);
        HashMap hashMap = new HashMap();
        V.s sVar = this.f47128i;
        if (sVar != null) {
            hashMap.putAll(sVar.a());
        }
        hashMap.putAll(this.f47129j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.f47145a;
        if (j6 == 0 && j10 == -1) {
            str = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j6);
            sb2.append("-");
            if (j10 != -1) {
                sb2.append((j6 + j10) - 1);
            }
            str = sb2.toString();
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("Range", str);
        }
        String str4 = this.f47127h;
        if (str4 != null) {
            httpURLConnection.setRequestProperty(SIPHeaderNames.USER_AGENT, str4);
        }
        if (z10) {
            str2 = "gzip";
        } else {
            str2 = "identity";
        }
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, str2);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        int i11 = l.f47094k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str3 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str3 = "POST";
            }
        } else {
            str3 = "GET";
        }
        httpURLConnection.setRequestMethod(str3);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final HttpURLConnection w(l lVar) {
        boolean z10;
        HttpURLConnection v10;
        l lVar2 = lVar;
        URL url = new URL(lVar2.f47095a.toString());
        int i10 = 0;
        if ((lVar2.f47103i & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f47124e;
        boolean z12 = this.f47130k;
        int i11 = lVar2.f47097c;
        byte[] bArr = lVar2.f47098d;
        long j6 = lVar2.f47100f;
        long j10 = lVar2.f47101g;
        if (!z11 && !z12) {
            return v(url, i11, bArr, j6, j10, z10, true, lVar2.f47099e);
        }
        URL url2 = url;
        byte[] bArr2 = bArr;
        int i12 = i11;
        while (true) {
            int i13 = i10 + 1;
            if (i10 <= 20) {
                Map map = lVar2.f47099e;
                int i14 = i12;
                long j11 = j10;
                URL url3 = url2;
                long j12 = j6;
                v10 = v(url2, i12, bArr2, j6, j10, z10, false, map);
                int responseCode = v10.getResponseCode();
                String headerField = v10.getHeaderField("Location");
                if ((i14 != 1 && i14 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    v10.disconnect();
                    if (z12 && responseCode == 302) {
                        i12 = i14;
                    } else {
                        bArr2 = null;
                        i12 = 1;
                    }
                    url2 = u(url3, headerField);
                } else {
                    v10.disconnect();
                    url2 = u(url3, headerField);
                    i12 = i14;
                }
                lVar2 = lVar;
                i10 = i13;
                j10 = j11;
                j6 = j12;
            } else {
                throw new w(new NoRouteToHostException(android.gov.nist.core.a.e("Too many redirects: ", i13)), 2001, 1);
            }
        }
        return v10;
    }

    public final void y(long j6) {
        if (j6 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j6 > 0) {
            InputStream inputStream = this.f47133n;
            int i10 = AbstractC5530A.f45131a;
            int read = inputStream.read(bArr, 0, (int) Math.min(j6, 4096));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j6 -= read;
                    p(read);
                } else {
                    throw new w();
                }
            } else {
                throw new w(new InterruptedIOException(), 2000, 1);
            }
        }
    }
}
