package android.gov.nist.core;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ThreadAuditor {
    private Map<Thread, ThreadHandle> threadHandles = new ConcurrentHashMap();
    private long pingIntervalInMillisecs = 0;

    /* loaded from: classes.dex */
    public class ThreadHandle {
        private ThreadAuditor threadAuditor;
        private boolean isThreadActive = false;
        private Thread thread = Thread.currentThread();

        public ThreadHandle(ThreadAuditor threadAuditor) {
            this.threadAuditor = threadAuditor;
        }

        public long getPingIntervalInMillisecs() {
            return this.threadAuditor.getPingIntervalInMillisecs();
        }

        public Thread getThread() {
            return this.thread;
        }

        public boolean isThreadActive() {
            return this.isThreadActive;
        }

        public void ping() {
            this.threadAuditor.ping(this);
        }

        public void setThreadActive(boolean z10) {
            this.isThreadActive = z10;
        }

        public String toString() {
            return "Thread Name: " + this.thread.getName() + ", Alive: " + this.thread.isAlive();
        }
    }

    public ThreadHandle addCurrentThread() {
        ThreadHandle threadHandle = new ThreadHandle(this);
        if (isEnabled()) {
            this.threadHandles.put(Thread.currentThread(), threadHandle);
        }
        return threadHandle;
    }

    public String auditThreads() {
        String str = null;
        for (ThreadHandle threadHandle : this.threadHandles.values()) {
            if (!threadHandle.isThreadActive()) {
                Thread thread = threadHandle.getThread();
                if (str == null) {
                    str = "Thread Auditor Report:\n";
                }
                StringBuilder r10 = a.r(str, "   Thread [");
                r10.append(thread.getName());
                r10.append("] has failed to respond to an audit request.\n");
                str = r10.toString();
            }
            threadHandle.setThreadActive(false);
        }
        return str;
    }

    public long getPingIntervalInMillisecs() {
        return this.pingIntervalInMillisecs;
    }

    public boolean isEnabled() {
        if (this.pingIntervalInMillisecs > 0) {
            return true;
        }
        return false;
    }

    public void ping(ThreadHandle threadHandle) {
        threadHandle.setThreadActive(true);
    }

    public void removeThread(Thread thread) {
        this.threadHandles.remove(thread);
    }

    public void reset() {
        this.threadHandles.clear();
    }

    public void setPingIntervalInMillisecs(long j6) {
        this.pingIntervalInMillisecs = j6;
    }

    public synchronized String toString() {
        String str;
        Iterator<ThreadHandle> it;
        str = "Thread Auditor - List of monitored threads:\n";
        while (this.threadHandles.values().iterator().hasNext()) {
            str = str + "   " + it.next().toString() + Separators.RETURN;
        }
        return str;
    }
}
