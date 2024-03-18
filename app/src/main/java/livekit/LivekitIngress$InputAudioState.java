package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C4000d1;

/* loaded from: classes.dex */
public final class LivekitIngress$InputAudioState extends AbstractC2497d0 implements N0 {
    public static final int AVERAGE_BITRATE_FIELD_NUMBER = 2;
    public static final int CHANNELS_FIELD_NUMBER = 3;
    private static final LivekitIngress$InputAudioState DEFAULT_INSTANCE;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 4;
    private int averageBitrate_;
    private int channels_;
    private String mimeType_ = "";
    private int sampleRate_;

    static {
        LivekitIngress$InputAudioState livekitIngress$InputAudioState = new LivekitIngress$InputAudioState();
        DEFAULT_INSTANCE = livekitIngress$InputAudioState;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$InputAudioState.class, livekitIngress$InputAudioState);
    }

    private LivekitIngress$InputAudioState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageBitrate() {
        this.averageBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannels() {
        this.channels_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleRate() {
        this.sampleRate_ = 0;
    }

    public static LivekitIngress$InputAudioState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4000d1 newBuilder() {
        return (C4000d1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$InputAudioState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputAudioState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageBitrate(int i10) {
        this.averageBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannels(int i10) {
        this.channels_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeType(String str) {
        str.getClass();
        this.mimeType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeTypeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.mimeType_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleRate(int i10) {
        this.sampleRate_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"mimeType_", "averageBitrate_", "channels_", "sampleRate_"});
            case 3:
                return new LivekitIngress$InputAudioState();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$InputAudioState.class) {
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

    public int getAverageBitrate() {
        return this.averageBitrate_;
    }

    public int getChannels() {
        return this.channels_;
    }

    public String getMimeType() {
        return this.mimeType_;
    }

    public AbstractC2534q getMimeTypeBytes() {
        return AbstractC2534q.y(this.mimeType_);
    }

    public int getSampleRate() {
        return this.sampleRate_;
    }

    public static C4000d1 newBuilder(LivekitIngress$InputAudioState livekitIngress$InputAudioState) {
        return (C4000d1) DEFAULT_INSTANCE.createBuilder(livekitIngress$InputAudioState);
    }

    public static LivekitIngress$InputAudioState parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$InputAudioState parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$InputAudioState parseFrom(byte[] bArr) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$InputAudioState parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$InputAudioState parseFrom(InputStream inputStream) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputAudioState parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$InputAudioState parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$InputAudioState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
