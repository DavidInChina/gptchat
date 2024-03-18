package ei;

import id.AbstractC3557B;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f29495d;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f29496c;

    static {
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, e.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (e.a()) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f29495d = z10;
    }

    public g() {
        Provider newProvider = Conscrypt.newProvider();
        AbstractC3557B.b0("newProvider()", newProvider);
        this.f29496c = newProvider;
    }

    @Override // ei.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) l.c(list).toArray(new String[0]));
            return;
        }
        super.d(sSLSocket, str, list);
    }

    @Override // ei.m
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ei.m
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f29496c);
        AbstractC3557B.b0("getInstance(\"TLS\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // ei.m
    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l10 = l();
        l10.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = l10.getSocketFactory();
        AbstractC3557B.b0("newSSLContext().apply {\n\u2026null)\n    }.socketFactory", socketFactory);
        return socketFactory;
    }

    @Override // ei.m
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC3557B.Z(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC3557B.a0("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, f.f29494a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC3557B.b0("toString(this)", arrays);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
