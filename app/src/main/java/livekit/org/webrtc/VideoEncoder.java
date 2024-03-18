package livekit.org.webrtc;

import livekit.org.webrtc.EncodedImage;

/* loaded from: classes2.dex */
public interface VideoEncoder {

    /* loaded from: classes2.dex */
    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int[][] iArr;
            int i10 = 0;
            for (int[] iArr2 : this.bitratesBbs) {
                for (int i11 : iArr2) {
                    i10 += i11;
                }
            }
            return i10;
        }
    }

    /* loaded from: classes2.dex */
    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    /* loaded from: classes.dex */
    public static class Capabilities {
        public final boolean lossNotification;

        @CalledByNative("Capabilities")
        public Capabilities(boolean z10) {
            this.lossNotification = z10;
        }
    }

    /* loaded from: classes.dex */
    public static class CodecSpecificInfo {
    }

    /* loaded from: classes.dex */
    public static class CodecSpecificInfoAV1 extends CodecSpecificInfo {
    }

    /* loaded from: classes.dex */
    public static class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    /* loaded from: classes.dex */
    public static class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    /* loaded from: classes.dex */
    public static class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    /* loaded from: classes.dex */
    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    /* loaded from: classes.dex */
    public static class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public EncoderInfo(int i10, boolean z10) {
            this.requestedResolutionAlignment = i10;
            this.applyAlignmentToAllSimulcastLayers = z10;
        }

        @CalledByNative("EncoderInfo")
        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        @CalledByNative("EncoderInfo")
        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }
    }

    /* loaded from: classes.dex */
    public static class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        @CalledByNative("RateControlParameters")
        public RateControlParameters(BitrateAllocation bitrateAllocation, double d10) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d10;
        }
    }

    /* loaded from: classes.dex */
    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i10, int i11, int i12, int i13) {
            this.frameSizePixels = i10;
            this.minStartBitrateBps = i11;
            this.minBitrateBps = i12;
            this.maxBitrateBps = i13;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("ResolutionBitrateLimits")
        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    /* loaded from: classes.dex */
    public static class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
            this(i10, i11, i12, i13, i14, i15, z10, new Capabilities(false));
        }

        @CalledByNative("Settings")
        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Capabilities capabilities) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
            this.startBitrate = i13;
            this.maxFramerate = i14;
            this.numberOfSimulcastStreams = i15;
            this.automaticResizeOn = z10;
            this.capabilities = capabilities;
        }
    }

    @CalledByNative
    long createNativeVideoEncoder();

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    @CalledByNative
    EncoderInfo getEncoderInfo();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    boolean isHardwareEncoder();

    @CalledByNative
    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i10);

    @CalledByNative
    VideoCodecStatus setRates(RateControlParameters rateControlParameters);

    /* loaded from: classes2.dex */
    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public ScalingSettings(int i10, int i11) {
            this.on = true;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }

        public String toString() {
            if (this.on) {
                Integer num = this.low;
                Integer num2 = this.high;
                return "[ " + num + ", " + num2 + " ]";
            }
            return "OFF";
        }

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10) {
            this.on = z10;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10, int i10, int i11) {
            this.on = z10;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }
    }
}
