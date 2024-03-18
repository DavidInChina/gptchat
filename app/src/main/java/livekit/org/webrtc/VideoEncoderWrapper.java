package livekit.org.webrtc;

import livekit.org.webrtc.VideoEncoder;

/* loaded from: classes.dex */
public class VideoEncoderWrapper {
    public static /* synthetic */ void a(long j6, EncodedImage encodedImage, VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
        nativeOnEncodedFrame(j6, encodedImage);
    }

    @CalledByNative
    public static VideoEncoder.Callback createEncoderCallback(long j6) {
        return new v(j6);
    }

    @CalledByNative
    public static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    @CalledByNative
    public static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    @CalledByNative
    public static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.on;
    }

    public static native void nativeOnEncodedFrame(long j6, EncodedImage encodedImage);
}
