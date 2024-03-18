package fi;

import id.AbstractC3557B;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final ei.l f30916a = new ei.l(2, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final g f30917b = new Object();

    @Override // fi.n
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // fi.n
    public final boolean b() {
        return ei.d.f29491d.p();
    }

    @Override // fi.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || AbstractC3557B.K(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // fi.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            ei.m mVar = ei.m.f29511a;
            parameters.setApplicationProtocols((String[]) ei.l.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
