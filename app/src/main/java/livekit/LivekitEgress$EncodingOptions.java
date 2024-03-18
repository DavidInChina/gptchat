package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.EnumC4066q2;
import jh.EnumC4104y1;
import jh.V;

/* loaded from: classes.dex */
public final class LivekitEgress$EncodingOptions extends AbstractC2497d0 implements N0 {
    public static final int AUDIO_BITRATE_FIELD_NUMBER = 6;
    public static final int AUDIO_CODEC_FIELD_NUMBER = 5;
    public static final int AUDIO_FREQUENCY_FIELD_NUMBER = 7;
    public static final int AUDIO_QUALITY_FIELD_NUMBER = 11;
    private static final LivekitEgress$EncodingOptions DEFAULT_INSTANCE;
    public static final int DEPTH_FIELD_NUMBER = 3;
    public static final int FRAMERATE_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 2;
    public static final int KEY_FRAME_INTERVAL_FIELD_NUMBER = 10;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int VIDEO_BITRATE_FIELD_NUMBER = 9;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 8;
    public static final int VIDEO_QUALITY_FIELD_NUMBER = 12;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int audioBitrate_;
    private int audioCodec_;
    private int audioFrequency_;
    private int audioQuality_;
    private int depth_;
    private int framerate_;
    private int height_;
    private double keyFrameInterval_;
    private int videoBitrate_;
    private int videoCodec_;
    private int videoQuality_;
    private int width_;

    static {
        LivekitEgress$EncodingOptions livekitEgress$EncodingOptions = new LivekitEgress$EncodingOptions();
        DEFAULT_INSTANCE = livekitEgress$EncodingOptions;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$EncodingOptions.class, livekitEgress$EncodingOptions);
    }

    private LivekitEgress$EncodingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioBitrate() {
        this.audioBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioCodec() {
        this.audioCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioFrequency() {
        this.audioFrequency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioQuality() {
        this.audioQuality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDepth() {
        this.depth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFramerate() {
        this.framerate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyFrameInterval() {
        this.keyFrameInterval_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoBitrate() {
        this.videoBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoCodec() {
        this.videoCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoQuality() {
        this.videoQuality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitEgress$EncodingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static V newBuilder() {
        return (V) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$EncodingOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EncodingOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioBitrate(int i10) {
        this.audioBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioCodec(EnumC4104y1 enumC4104y1) {
        this.audioCodec_ = enumC4104y1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioCodecValue(int i10) {
        this.audioCodec_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioFrequency(int i10) {
        this.audioFrequency_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioQuality(int i10) {
        this.audioQuality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDepth(int i10) {
        this.depth_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramerate(int i10) {
        this.framerate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyFrameInterval(double d10) {
        this.keyFrameInterval_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoBitrate(int i10) {
        this.videoBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodec(EnumC4066q2 enumC4066q2) {
        this.videoCodec_ = enumC4066q2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodecValue(int i10) {
        this.videoCodec_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoQuality(int i10) {
        this.videoQuality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i10) {
        this.width_ = i10;
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\f\u0006\u0004\u0007\u0004\b\f\t\u0004\n\u0000\u000b\u0004\f\u0004", new Object[]{"width_", "height_", "depth_", "framerate_", "audioCodec_", "audioBitrate_", "audioFrequency_", "videoCodec_", "videoBitrate_", "keyFrameInterval_", "audioQuality_", "videoQuality_"});
            case 3:
                return new LivekitEgress$EncodingOptions();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$EncodingOptions.class) {
                        try {
                            AbstractC2489a1 abstractC2489a13 = PARSER;
                            AbstractC2489a1 abstractC2489a14 = abstractC2489a13;
                            if (abstractC2489a13 == null) {
                                ?? obj3 = new Object();
                                PARSER = obj3;
                                abstractC2489a14 = obj3;
                            }
                        } finally {
                        }
                    }
                }
                return abstractC2489a12;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getAudioBitrate() {
        return this.audioBitrate_;
    }

    public EnumC4104y1 getAudioCodec() {
        EnumC4104y1 b10 = EnumC4104y1.b(this.audioCodec_);
        if (b10 == null) {
            return EnumC4104y1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getAudioCodecValue() {
        return this.audioCodec_;
    }

    public int getAudioFrequency() {
        return this.audioFrequency_;
    }

    public int getAudioQuality() {
        return this.audioQuality_;
    }

    public int getDepth() {
        return this.depth_;
    }

    public int getFramerate() {
        return this.framerate_;
    }

    public int getHeight() {
        return this.height_;
    }

    public double getKeyFrameInterval() {
        return this.keyFrameInterval_;
    }

    public int getVideoBitrate() {
        return this.videoBitrate_;
    }

    public EnumC4066q2 getVideoCodec() {
        EnumC4066q2 b10 = EnumC4066q2.b(this.videoCodec_);
        if (b10 == null) {
            return EnumC4066q2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getVideoCodecValue() {
        return this.videoCodec_;
    }

    public int getVideoQuality() {
        return this.videoQuality_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static V newBuilder(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        return (V) DEFAULT_INSTANCE.createBuilder(livekitEgress$EncodingOptions);
    }

    public static LivekitEgress$EncodingOptions parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$EncodingOptions parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$EncodingOptions parseFrom(byte[] bArr) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$EncodingOptions parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$EncodingOptions parseFrom(InputStream inputStream) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EncodingOptions parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$EncodingOptions parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$EncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
