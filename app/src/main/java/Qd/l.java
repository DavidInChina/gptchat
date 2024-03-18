package Qd;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public abstract class l implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final HttpURLConnection f14636Y;

    /* renamed from: Z  reason: collision with root package name */
    public final InputStream f14637Z;

    /* renamed from: h0  reason: collision with root package name */
    public final OutputStream f14638h0;

    public l(HttpURLConnection httpURLConnection, InputStream inputStream, GZIPOutputStream gZIPOutputStream) {
        this.f14636Y = httpURLConnection;
        this.f14637Z = inputStream;
        this.f14638h0 = gZIPOutputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14636Y.disconnect();
    }
}
