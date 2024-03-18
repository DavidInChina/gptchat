package ji;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ji.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4121J extends C4131f {

    /* renamed from: m  reason: collision with root package name */
    public final Socket f36686m;

    public C4121J(Socket socket) {
        this.f36686m = socket;
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
        Socket socket = this.f36686m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (R4.b.t1(e10)) {
                Logger logger = z.f36759a;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + socket, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            Logger logger2 = z.f36759a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
