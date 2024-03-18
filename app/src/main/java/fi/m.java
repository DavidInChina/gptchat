package fi;

import id.AbstractC3557B;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a  reason: collision with root package name */
    public final l f30923a;

    /* renamed from: b  reason: collision with root package name */
    public n f30924b;

    public m(l lVar) {
        this.f30923a = lVar;
    }

    @Override // fi.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f30923a.a(sSLSocket);
    }

    @Override // fi.n
    public final boolean b() {
        return true;
    }

    @Override // fi.n
    public final String c(SSLSocket sSLSocket) {
        n e10 = e(sSLSocket);
        if (e10 != null) {
            return e10.c(sSLSocket);
        }
        return null;
    }

    @Override // fi.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        n e10 = e(sSLSocket);
        if (e10 != null) {
            e10.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f30924b == null && this.f30923a.a(sSLSocket)) {
                this.f30924b = this.f30923a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f30924b;
    }
}
