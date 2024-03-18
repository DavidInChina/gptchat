package fi;

import android.net.ssl.SSLSockets;
import android.os.Build;
import id.AbstractC3557B;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: fi.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3101b implements n {
    @Override // fi.n
    public final boolean a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // fi.n
    public final boolean b() {
        ei.m mVar = ei.m.f29511a;
        if (ei.l.h() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // fi.n
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || AbstractC3557B.K(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // fi.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ei.m mVar = ei.m.f29511a;
            sSLParameters.setApplicationProtocols((String[]) ei.l.c(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
