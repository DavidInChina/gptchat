package livekit.org.webrtc;

import java.util.List;

/* loaded from: classes2.dex */
public class SoftwareVideoDecoderFactory implements VideoDecoderFactory {
    private static final String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory = nativeCreateFactory();

    private static native long nativeCreateDecoder(long j6, VideoCodecInfo videoCodecInfo);

    private static native long nativeCreateFactory();

    private static native List<VideoCodecInfo> nativeGetSupportedCodecs(long j6);

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        final long nativeCreateDecoder = nativeCreateDecoder(this.nativeFactory, videoCodecInfo);
        if (nativeCreateDecoder == 0) {
            Logging.w(TAG, "Trying to create decoder for unsupported format. " + videoCodecInfo);
            return null;
        }
        return new WrappedNativeVideoDecoder() { // from class: livekit.org.webrtc.SoftwareVideoDecoderFactory.1
            @Override // livekit.org.webrtc.WrappedNativeVideoDecoder, livekit.org.webrtc.VideoDecoder
            public long createNativeVideoDecoder() {
                return nativeCreateDecoder;
            }
        };
    }

    @Override // livekit.org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (VideoCodecInfo[]) nativeGetSupportedCodecs(this.nativeFactory).toArray(new VideoCodecInfo[0]);
    }
}
