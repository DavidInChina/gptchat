package B2;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
import z2.C6754C;
import z2.C6755D;

/* loaded from: classes2.dex */
public abstract class C {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, C6755D c6755d) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        C6754C c6754c = c6755d.f51490a;
        c6754c.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = c6754c.f51489a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            A1.b.f(playbackComponent).setLogSessionId(logSessionId2);
        }
    }
}
