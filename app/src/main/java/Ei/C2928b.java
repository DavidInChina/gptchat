package ei;

import hi.AbstractC3451d;
import id.AbstractC3557B;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: ei.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2928b implements AbstractC3451d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f29485a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f29486b;

    public C2928b(X509TrustManager x509TrustManager, Method method) {
        this.f29485a = x509TrustManager;
        this.f29486b = method;
    }

    @Override // hi.AbstractC3451d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f29486b.invoke(this.f29485a, x509Certificate);
            AbstractC3557B.a0("null cannot be cast to non-null type java.security.cert.TrustAnchor", invoke);
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2928b)) {
            return false;
        }
        C2928b c2928b = (C2928b) obj;
        if (AbstractC3557B.K(this.f29485a, c2928b.f29485a) && AbstractC3557B.K(this.f29486b, c2928b.f29486b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29486b.hashCode() + (this.f29485a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f29485a + ", findByIssuerAndSignatureMethod=" + this.f29486b + ')';
    }
}
