package fi;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.net.http.X509TrustManagerExtensions;
import id.AbstractC3557B;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c extends A7.b {

    /* renamed from: m  reason: collision with root package name */
    public final X509TrustManager f30905m;

    /* renamed from: n  reason: collision with root package name */
    public final X509TrustManagerExtensions f30906n;

    public c(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f30905m = x509TrustManager;
        this.f30906n = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && ((c) obj).f30905m == this.f30905m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f30905m);
    }

    @Override // A7.b
    public final List n0(String str, List list) {
        AbstractC3557B.c0(ReferencesHeader.CHAIN, list);
        AbstractC3557B.c0("hostname", str);
        try {
            List<X509Certificate> checkServerTrusted = this.f30906n.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC3557B.b0("x509TrustManagerExtensio\u2026ficates, \"RSA\", hostname)", checkServerTrusted);
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }
}
