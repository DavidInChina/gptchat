package livekit.org.webrtc;

import livekit.org.webrtc.VideoEncoderFactory;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x {
    public static VideoEncoderFactory.VideoEncoderSelector a(VideoEncoderFactory videoEncoderFactory) {
        return null;
    }

    public static VideoCodecInfo[] b(VideoEncoderFactory videoEncoderFactory) {
        return videoEncoderFactory.getSupportedCodecs();
    }
}
