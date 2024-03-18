package B3;

import Lg.n;
import fi.l;
import id.AbstractC3557B;
import javax.net.ssl.SSLSocket;
import x3.w;

/* loaded from: classes2.dex */
public final class a implements h, l {

    /* renamed from: Y  reason: collision with root package name */
    public String f1829Y;

    public a(String str) {
        AbstractC3557B.c0("query", str);
        this.f1829Y = str;
    }

    @Override // fi.l
    public boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return n.I2(name, this.f1829Y + '.', false);
    }

    @Override // fi.l
    public fi.n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!AbstractC3557B.K(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new fi.f(cls2);
    }

    @Override // B3.h
    public String i() {
        return this.f1829Y;
    }

    public a() {
        this.f1829Y = "com.google.android.gms.org.conscrypt";
    }

    @Override // B3.h
    public void h(w wVar) {
    }
}
