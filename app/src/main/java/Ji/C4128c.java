package ji;

import fi.C3100a;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ji.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4128c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C4131f e10;
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C4131f.f36703h;
                reentrantLock = C4131f.f36703h;
                reentrantLock.lock();
                e10 = C3100a.e();
            } catch (InterruptedException unused) {
            }
            if (e10 == C4131f.f36707l) {
                C4131f.f36707l = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (e10 != null) {
                e10.l();
            }
        }
    }
}
