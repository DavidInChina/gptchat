package fi;

import id.AbstractC3557B;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final ei.l f30921a = new ei.l(3, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final j f30922b = new Object();

    @Override // fi.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // fi.n
    public final boolean b() {
        boolean z10 = ei.g.f29495d;
        return ei.g.f29495d;
    }

    @Override // fi.n
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // fi.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3557B.c0("protocols", list);
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ei.m mVar = ei.m.f29511a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ei.l.c(list).toArray(new String[0]));
        }
    }
}
