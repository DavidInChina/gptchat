package di;

import java.io.IOException;
import java.net.SocketTimeoutException;
import ji.C4131f;

/* loaded from: classes2.dex */
public final class z extends C4131f {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C2724A f28678m;

    public z(C2724A c2724a) {
        this.f28678m = c2724a;
    }

    @Override // ji.C4131f
    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // ji.C4131f
    public final void l() {
        this.f28678m.e(EnumC2728b.CANCEL);
        t tVar = this.f28678m.f28516b;
        synchronized (tVar) {
            long j6 = tVar.f28643u0;
            long j10 = tVar.f28642t0;
            if (j6 >= j10) {
                tVar.f28642t0 = j10 + 1;
                tVar.f28644v0 = System.nanoTime() + 1000000000;
                tVar.f28636n0.c(new Zh.b(R.a.t(new StringBuilder(), tVar.f28631i0, " ping"), 2, tVar), 0L);
            }
        }
    }

    public final void m() {
        if (!j()) {
            return;
        }
        throw k(null);
    }
}
