package ei;

import Wh.w;
import android.util.Log;
import hi.AbstractC3451d;
import hi.C3448a;
import hi.C3449b;
import id.AbstractC3557B;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static volatile m f29511a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f29512b;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (r0 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v9, types: [ei.m] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    static {
        ?? f6;
        boolean z10;
        g gVar;
        Level level;
        m mVar = null;
        mVar = null;
        if (l.h()) {
            for (Map.Entry entry : fi.d.f30908b.entrySet()) {
                String str = (String) entry.getValue();
                Logger logger = Logger.getLogger((String) entry.getKey());
                if (fi.d.f30907a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    if (Log.isLoggable(str, 3)) {
                        level = Level.FINE;
                    } else if (Log.isLoggable(str, 4)) {
                        level = Level.INFO;
                    } else {
                        level = Level.WARNING;
                    }
                    logger.setLevel(level);
                    logger.addHandler(fi.e.f30909a);
                }
            }
            if (C2927a.f29482d.p()) {
                mVar = new C2927a();
            }
            if (mVar == null) {
                mVar = c.f29487e.f();
                AbstractC3557B.Z(mVar);
            }
        } else {
            if (AbstractC3557B.K("Conscrypt", Security.getProviders()[0].getName())) {
                if (g.f29495d) {
                    gVar = new g();
                } else {
                    gVar = null;
                }
            }
            if (AbstractC3557B.K("BC", Security.getProviders()[0].getName())) {
                if (d.f29491d.p()) {
                    gVar = new d();
                } else {
                    gVar = null;
                }
            }
            if (AbstractC3557B.K("OpenJSSE", Security.getProviders()[0].getName())) {
                switch (k.f29507d.f36264Y) {
                    case 27:
                        z10 = c.f29488f;
                        break;
                    default:
                        z10 = k.f29508e;
                        break;
                }
                if (z10) {
                    f6 = new k();
                } else {
                    f6 = null;
                }
            }
            if (j.f29506c) {
                mVar = new Object();
            }
            if (mVar == null) {
                f6 = i.f29500h.f();
                if (f6 == null) {
                    f6 = new Object();
                }
                mVar = f6;
            }
        }
        f29511a = mVar;
        f29512b = Logger.getLogger(w.class.getName());
    }

    public static void i(int i10, String str, Throwable th2) {
        Level level;
        AbstractC3557B.c0("message", str);
        if (i10 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f29512b.log(level, str, th2);
    }

    public static /* synthetic */ void j(m mVar, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        mVar.getClass();
        i(i10, str, null);
    }

    public A7.b b(X509TrustManager x509TrustManager) {
        return new C3448a(c(x509TrustManager));
    }

    public AbstractC3451d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC3557B.b0("trustManager.acceptedIssuers", acceptedIssuers);
        return new C3449b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        AbstractC3557B.c0("address", inetSocketAddress);
        socket.connect(inetSocketAddress, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f29512b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        AbstractC3557B.c0("hostname", str);
        return true;
    }

    public void k(String str, Object obj) {
        AbstractC3557B.c0("message", str);
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC3557B.b0("getInstance(\"TLS\")", sSLContext);
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l10 = l();
            l10.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = l10.getSocketFactory();
            AbstractC3557B.b0("newSSLContext().apply {\n\u2026ll)\n      }.socketFactory", socketFactory);
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
