package livekit.org.webrtc;

import livekit.org.webrtc.VideoDecoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VideoDecoderWrapper {
    @CalledByNative
    public static VideoDecoder.Callback createDecoderCallback(long j6) {
        return new v(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j6, VideoFrame videoFrame, Integer num, Integer num2);
}
