package fi;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // fi.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z10 = ei.g.f29495d;
        if (ei.e.b() && Conscrypt.isConscrypt(sSLSocket)) {
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
