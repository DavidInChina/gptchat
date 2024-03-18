package fi;

import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class g implements l {
    @Override // fi.l
    public final boolean a(SSLSocket sSLSocket) {
        if (ei.d.f29491d.p() && (sSLSocket instanceof BCSSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, fi.n] */
    @Override // fi.l
    public final n b(SSLSocket sSLSocket) {
        return new Object();
    }
}
