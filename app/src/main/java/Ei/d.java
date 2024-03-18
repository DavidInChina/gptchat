package ei;

import id.AbstractC3557B;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import jh.H1;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: d  reason: collision with root package name */
    public static final H1 f29491d = new H1(28, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f29492e;

    /* renamed from: c  reason: collision with root package name */
    public final Provider f29493c = new BouncyCastleJsseProvider();

    static {
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, H1.class.getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f29492e = z10;
    }

    @Override // ei.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        if (sSLSocket instanceof BCSSLSocket) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) l.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
            return;
        }
        super.d(sSLSocket, str, list);
    }

    @Override // ei.m
    public final String f(SSLSocket sSLSocket) {
        String applicationProtocol;
        if (!(sSLSocket instanceof BCSSLSocket) || (applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol()) == null || AbstractC3557B.K(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ei.m
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f29493c);
        AbstractC3557B.b0("getInstance(\"TLS\", provider)", sSLContext);
        return sSLContext;
    }

    @Override // ei.m
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC3557B.Z(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC3557B.a0("null cannot be cast to non-null type javax.net.ssl.X509TrustManager", trustManager);
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC3557B.b0("toString(this)", arrays);
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
