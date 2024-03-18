package A2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import z2.C6754C;
import z2.C6755D;

/* loaded from: classes.dex */
public abstract class F {
    public static void a(AudioTrack audioTrack, C6755D c6755d) {
        LogSessionId logSessionId;
        boolean equals;
        C6754C c6754c = c6755d.f51490a;
        c6754c.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = c6754c.f51489a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
