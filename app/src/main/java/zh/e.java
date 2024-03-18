package Zh;

import id.AbstractC3557B;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ f f23774Y;

    public e(f fVar) {
        this.f23774Y = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a c10;
        long j6;
        while (true) {
            f fVar = this.f23774Y;
            synchronized (fVar) {
                c10 = fVar.c();
            }
            if (c10 == null) {
                return;
            }
            c cVar = c10.f23763c;
            AbstractC3557B.Z(cVar);
            f fVar2 = this.f23774Y;
            boolean isLoggable = f.f23777j.isLoggable(Level.FINE);
            if (isLoggable) {
                cVar.f23767a.f23778a.getClass();
                j6 = System.nanoTime();
                L4.a.U(c10, cVar, "starting");
            } else {
                j6 = -1;
            }
            try {
                f.a(fVar2, c10);
                if (isLoggable) {
                    cVar.f23767a.f23778a.getClass();
                    L4.a.U(c10, cVar, "finished run in ".concat(L4.a.s0(System.nanoTime() - j6)));
                }
            } finally {
            }
        }
    }
}
