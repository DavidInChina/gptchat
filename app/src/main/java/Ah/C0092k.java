package Ah;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: Ah.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0092k extends URLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f944a;

    public C0092k(URL url, ByteArrayInputStream byteArrayInputStream) {
        super(url);
        this.f944a = byteArrayInputStream;
    }

    @Override // java.net.URLConnection
    public final void connect() {
        ((URLConnection) this).connected = true;
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        ((URLConnection) this).connected = true;
        return this.f944a;
    }
}
