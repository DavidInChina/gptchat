package y2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
import z2.C6752A;
import z2.C6755D;

/* renamed from: y2.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6498A {
    public static C6755D a(Context context, C6504G c6504g, boolean z10) {
        C6752A c6752a;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        PlaybackSession createPlaybackSession;
        MediaMetricsManager e10 = H0.U.e(context.getSystemService("media_metrics"));
        if (e10 != null) {
            createPlaybackSession = e10.createPlaybackSession();
            c6752a = new C6752A(context, createPlaybackSession);
        } else {
            c6752a = null;
        }
        if (c6752a == null) {
            s2.p.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new C6755D(logSessionId);
        }
        if (z10) {
            c6504g.getClass();
            z2.w wVar = (z2.w) c6504g.f50379r;
            wVar.getClass();
            wVar.f51541k0.a(c6752a);
        }
        sessionId = c6752a.f51464c.getSessionId();
        return new C6755D(sessionId);
    }
}
