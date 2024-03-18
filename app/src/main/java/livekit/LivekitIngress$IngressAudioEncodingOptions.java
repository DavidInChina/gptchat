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
import jh.EnumC4104y1;
import jh.Q0;

/* loaded from: classes.dex */
public final class LivekitIngress$IngressAudioEncodingOptions extends AbstractC2497d0 implements N0 {
    public static final int AUDIO_CODEC_FIELD_NUMBER = 1;
    public static final int BITRATE_FIELD_NUMBER = 2;
    public static final int CHANNELS_FIELD_NUMBER = 4;
    private static final LivekitIngress$IngressAudioEncodingOptions DEFAULT_INSTANCE;
    public static final int DISABLE_DTX_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER;
    private int audioCodec_;
    private int bitrate_;
    private int channels_;
    private boolean disableDtx_;

    static {
        LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions = new LivekitIngress$IngressAudioEncodingOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressAudioEncodingOptions;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$IngressAudioEncodingOptions.class, livekitIngress$IngressAudioEncodingOptions);
    }

    private LivekitIngress$IngressAudioEncodingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioCodec() {
        this.audioCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitrate() {
        this.bitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannels() {
        this.channels_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableDtx() {
        this.disableDtx_ = false;
    }

    public static LivekitIngress$IngressAudioEncodingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Q0 newBuilder() {
        return (Q0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setBitrate(int i10) {
        this.bitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannels(int i10) {
        this.channels_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableDtx(boolean z10) {
        this.disableDtx_ = z10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u0007\u0004\u000b", new Object[]{"audioCodec_", "bitrate_", "disableDtx_", "channels_"});
            case 3:
                return new LivekitIngress$IngressAudioEncodingOptions();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$IngressAudioEncodingOptions.class) {
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

    public int getBitrate() {
        return this.bitrate_;
    }

    public int getChannels() {
        return this.channels_;
    }

    public boolean getDisableDtx() {
        return this.disableDtx_;
    }

    public static Q0 newBuilder(LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions) {
        return (Q0) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressAudioEncodingOptions);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$IngressAudioEncodingOptions parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$IngressAudioEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
