package Ze;

import Xe.m;
import android.content.Context;
import livekit.org.webrtc.CameraEnumerator;
import livekit.org.webrtc.VideoCapturer;

/* loaded from: classes.dex */
public interface c {
    int a();

    CameraEnumerator b(Context context);

    boolean c(Context context);

    VideoCapturer d(Context context, m mVar, i iVar);
}
