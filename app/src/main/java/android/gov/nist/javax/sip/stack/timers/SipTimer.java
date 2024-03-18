package android.gov.nist.javax.sip.stack.timers;

import android.gov.nist.javax.sip.SipStackImpl;
import android.gov.nist.javax.sip.stack.SIPStackTimerTask;
import java.util.Properties;

/* loaded from: classes.dex */
public interface SipTimer {
    boolean cancel(SIPStackTimerTask sIPStackTimerTask);

    boolean isStarted();

    boolean schedule(SIPStackTimerTask sIPStackTimerTask, long j6);

    boolean scheduleWithFixedDelay(SIPStackTimerTask sIPStackTimerTask, long j6, long j10);

    void start(SipStackImpl sipStackImpl, Properties properties);

    void stop();
}
