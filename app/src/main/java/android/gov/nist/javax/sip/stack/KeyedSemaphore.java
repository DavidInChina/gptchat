package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.core.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class KeyedSemaphore {
    private static final StackLogger logger = CommonLogger.getLogger(KeyedSemaphore.class);
    private final ConcurrentHashMap<String, ReentrantLock> map = new ConcurrentHashMap<>();

    public void enterIOCriticalSection(String str) {
        ReentrantLock reentrantLock = this.map.get(str);
        if (reentrantLock == null) {
            reentrantLock = new ReentrantLock(true);
            ReentrantLock putIfAbsent = this.map.putIfAbsent(str, reentrantLock);
            if (putIfAbsent == null) {
                StackLogger stackLogger = logger;
                if (stackLogger.isLoggingEnabled(32)) {
                    a.w("new Semaphore added for key: ", str, stackLogger);
                }
            } else {
                reentrantLock = putIfAbsent;
            }
        }
        try {
            if (reentrantLock.tryLock(10L, TimeUnit.SECONDS)) {
                return;
            }
            throw new IOException("Could not acquire IO Semaphore'" + str + "' after 10 seconds -- giving up ");
        } catch (InterruptedException unused) {
            throw new IOException("exception in acquiring sem");
        }
    }

    public int getNumberOfSemaphores() {
        return this.map.size();
    }

    public void leaveIOCriticalSection(String str) {
        ReentrantLock reentrantLock = this.map.get(str);
        if (reentrantLock != null) {
            reentrantLock.unlock();
            StackLogger stackLogger = logger;
            if (stackLogger.isLoggingEnabled(32)) {
                stackLogger.logDebug("sem unlocked:" + reentrantLock);
            }
        }
    }

    public void remove(String str) {
        ReentrantLock reentrantLock = this.map.get(str);
        if (reentrantLock != null && !reentrantLock.hasQueuedThreads() && reentrantLock.isHeldByCurrentThread()) {
            this.map.remove(str);
            StackLogger stackLogger = logger;
            stackLogger.logDebug("sem removed:" + reentrantLock);
            while (reentrantLock.isHeldByCurrentThread() && reentrantLock.getHoldCount() > 0) {
                StackLogger stackLogger2 = logger;
                stackLogger2.logDebug("unlocking after remove:" + reentrantLock);
                reentrantLock.unlock();
            }
        }
    }
}
