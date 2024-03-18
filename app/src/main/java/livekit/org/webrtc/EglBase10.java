package livekit.org.webrtc;

import javax.microedition.khronos.egl.EGLContext;
import livekit.org.webrtc.EglBase;

/* loaded from: classes2.dex */
public interface EglBase10 extends EglBase {

    /* loaded from: classes.dex */
    public interface Context extends EglBase.Context {
        EGLContext getRawContext();
    }
}
