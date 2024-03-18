package livekit.org.webrtc;

/* loaded from: classes2.dex */
public class LibvpxVp8Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreateEncoder();

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override // livekit.org.webrtc.WrappedNativeVideoEncoder, livekit.org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return false;
    }
}
