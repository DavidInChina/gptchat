package android.gov.nist.javax.sip.stack.timers;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class DefaultSipTimer extends Timer implements SipTimer {
    private static StackLogger logger = CommonLogger.getLogger(DefaultSipTimer.class);
    protected SipStackImpl sipStackImpl;
    protected AtomicBoolean started = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public class DefaultTimerTask extends TimerTask {
        private SIPStackTimerTask task;

        public DefaultTimerTask(SIPStackTimerTask sIPStackTimerTask) {
            this.task = sIPStackTimerTask;
            sIPStackTimerTask.setSipTimerTask(this);
        }

        @Override // java.util.TimerTask
        public boolean cancel() {
            SIPStackTimerTask sIPStackTimerTask = this.task;
            if (sIPStackTimerTask != null) {
                sIPStackTimerTask.cleanUpBeforeCancel();
                this.task = null;
            }
            return super.cancel();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                SIPStackTimerTask sIPStackTimerTask = this.task;
                if (sIPStackTimerTask != null) {
                    sIPStackTimerTask.runTask();
                }
            } catch (Throwable th2) {
                System.out.println("SIP stack timer task failed due to exception:");
                th2.printStackTrace();
            }
        }
    }

    public DefaultSipTimer() {
        super("DefaultSipTimerThread");
    }

    @Override // android.gov.nist.javax.sip.stack.timers.SipTimer
    public boolean cancel(SIPStackTimerTask sIPStackTimerTask) {
        return ((TimerTask) sIPStackTimerTask.getSipTimerTask()).cancel();
    }

    @Override // android.gov.nist.javax.sip.stack.timers.SipTimer
    public boolean isStarted() {
        return this.started.get();
    }

    @Override // android.gov.nist.javax.sip.stack.timers.SipTimer
    public boolean schedule(SIPStackTimerTask sIPStackTimerTask, long j6) {
        if (this.started.get()) {
            super.schedule(new DefaultTimerTask(sIPStackTimerTask), j6);
            return true;
        }
        throw new IllegalStateException("The SIP Stack Timer has been stopped, no new tasks can be scheduled !");
    }

    @Override // android.gov.nist.javax.sip.stack.timers.SipTimer
    public boolean scheduleWithFixedDelay(SIPStackTimerTask sIPStackTimerTask, long j6, long j10) {
        if (this.started.get()) {
            super.schedule(new DefaultTimerTask(sIPStackTimerTask), j6, j10);
            return true;
        }
        throw new IllegalStateException("The SIP Stack Timer has been stopped, no new tasks can be scheduled !");
    }

    @Override // android.gov.nist.javax.sip.stack.timers.SipTimer
    public void start(SipStackImpl sipStackImpl, Properties properties) {
        this.sipStackImpl = sipStackImpl;
        this.started.set(true);
        if (logger.isLoggingEnabled(16)) {
            StackLogger stackLogger = logger;
            stackLogger.logInfo("the sip stack timer " + getClass().getName() + " has been started");
        }
    }

    @Override // android.gov.nist.javax.sip.stack.timers.SipTimer
    public void stop() {
        this.started.set(false);
        cancel();
        logger.logStackTrace(32);
        if (logger.isLoggingEnabled(16)) {
            StackLogger stackLogger = logger;
            stackLogger.logInfo("the sip stack timer " + getClass().getName() + " has been stopped");
        }
    }
}
