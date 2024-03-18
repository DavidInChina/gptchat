package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class BlockingQueueDispatchAuditor extends TimerTask {
    private static StackLogger logger = CommonLogger.getLogger(BlockingQueueDispatchAuditor.class);
    private static int timerThreadCount;
    private Queue<? extends Runnable> queue;
    private Timer timer = null;
    private long totalReject = 0;
    private boolean started = false;
    private int timeout = 8000;

    public BlockingQueueDispatchAuditor(Queue<? extends Runnable> queue) {
        this.queue = queue;
    }

    public int getTimeout() {
        return this.timeout;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        int i10;
        try {
            synchronized (this.queue) {
                QueuedMessageDispatchBase queuedMessageDispatchBase = (QueuedMessageDispatchBase) this.queue.peek();
                i10 = 0;
                while (queuedMessageDispatchBase != null) {
                    if (System.currentTimeMillis() - queuedMessageDispatchBase.getReceptionTime() > this.timeout) {
                        this.queue.poll();
                        queuedMessageDispatchBase = (QueuedMessageDispatchBase) this.queue.peek();
                        i10++;
                    } else {
                        queuedMessageDispatchBase = null;
                    }
                }
            }
            if (i10 > 0) {
                this.totalReject += i10;
                StackLogger stackLogger = logger;
                if (stackLogger != null && stackLogger.isLoggingEnabled(8)) {
                    logger.logWarning("Removed stuck messages=" + i10 + " total rejected=" + this.totalReject + " stil in queue=" + this.queue.size());
                }
            }
        } catch (Exception e10) {
            StackLogger stackLogger2 = logger;
            if (stackLogger2 != null && stackLogger2.isLoggingEnabled(8)) {
                logger.logWarning("Problem reaping old requests. This is not a fatal error." + e10);
            }
        }
    }

    public void setTimeout(int i10) {
        this.timeout = i10;
    }

    public void start(int i10) {
        if (this.started) {
            stop();
        }
        this.started = true;
        StringBuilder sb2 = new StringBuilder("BlockingQueueDispatchAuditor-Timer-");
        int i11 = timerThreadCount;
        timerThreadCount = i11 + 1;
        sb2.append(i11);
        Timer timer = new Timer(sb2.toString(), true);
        this.timer = timer;
        long j6 = i10;
        timer.scheduleAtFixedRate(this, j6, j6);
    }

    public void stop() {
        try {
            this.timer.cancel();
            this.timer = null;
        } catch (Exception unused) {
        } catch (Throwable th2) {
            this.started = false;
            throw th2;
        }
        this.started = false;
    }
}
