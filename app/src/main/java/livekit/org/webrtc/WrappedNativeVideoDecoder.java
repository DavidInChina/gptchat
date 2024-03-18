package livekit.org.webrtc;

import livekit.org.webrtc.VideoDecoder;

/* loaded from: classes.dex */
public abstract class WrappedNativeVideoDecoder implements VideoDecoder {
    @Override // livekit.org.webrtc.VideoDecoder
    public abstract long createNativeVideoDecoder();

    @Override // livekit.org.webrtc.VideoDecoder
    public final VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final String getImplementationName() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override // livekit.org.webrtc.VideoDecoder
    public final VideoCodecStatus release() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
