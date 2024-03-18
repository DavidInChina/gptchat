package io.sentry;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;

/* loaded from: classes.dex */
public final class SpotlightIntegration implements X, AbstractC3657j1, Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public r1 f33861Y;

    /* renamed from: Z  reason: collision with root package name */
    public H f33862Z = C3683s0.f34720Y;

    /* renamed from: h0  reason: collision with root package name */
    public P f33863h0 = C3680q0.f34685b;

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

    public static HttpURLConnection i(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) URI.create(str).toURL().openConnection();
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT, "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33863h0.c(0L);
        r1 r1Var = this.f33861Y;
        if (r1Var != null && r1Var.getBeforeEnvelopeCallback() == this) {
            this.f33861Y.setBeforeEnvelopeCallback(null);
        }
    }

    @Override // io.sentry.X
    public final void h(r1 r1Var) {
        this.f33861Y = r1Var;
        this.f33862Z = r1Var.getLogger();
        if (r1Var.getBeforeEnvelopeCallback() == null && r1Var.isEnableSpotlight()) {
            this.f33863h0 = new C3609a1();
            r1Var.setBeforeEnvelopeCallback(this);
            this.f33862Z.f(EnumC3642e1.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
            return;
        }
        this.f33862Z.f(EnumC3642e1.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
    }
}
