package livekit.org.webrtc;

import livekit.org.webrtc.VideoDecoder;
import livekit.org.webrtc.VideoEncoder;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements VideoDecoder.Callback, VideoEncoder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f38582a;

    public /* synthetic */ v(long j6) {
        this.f38582a = j6;
    }

    @Override // livekit.org.webrtc.VideoDecoder.Callback
    public final void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2) {
        VideoDecoderWrapper.nativeOnDecodedFrame(this.f38582a, videoFrame, num, num2);
    }

    @Override // livekit.org.webrtc.VideoEncoder.Callback
    public final void onEncodedFrame(EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        VideoEncoderWrapper.a(this.f38582a, encodedImage, codecSpecificInfo);
    }
}
