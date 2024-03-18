package C2;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import z2.C6754C;
import z2.C6755D;

/* loaded from: classes2.dex */
public abstract class n {
    public static void a(h hVar, C6755D c6755d) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        C6754C c6754c = c6755d.f51490a;
        c6754c.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = c6754c.f51489a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = hVar.f2541b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
