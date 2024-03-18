package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.F1;
import jh.P2;
import jh.Q2;

/* loaded from: classes.dex */
public final class LivekitRtc$ConnectionQualityInfo extends AbstractC2497d0 implements Q2 {
    private static final LivekitRtc$ConnectionQualityInfo DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int QUALITY_FIELD_NUMBER = 2;
    public static final int SCORE_FIELD_NUMBER = 3;
    private String participantSid_ = "";
    private int quality_;
    private float score_;

    static {
        LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo = new LivekitRtc$ConnectionQualityInfo();
        DEFAULT_INSTANCE = livekitRtc$ConnectionQualityInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$ConnectionQualityInfo.class, livekitRtc$ConnectionQualityInfo);
    }

    private LivekitRtc$ConnectionQualityInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0.0f;
    }

    public static LivekitRtc$ConnectionQualityInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static P2 newBuilder() {
        return (P2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ConnectionQualityInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSid(String str) {
        str.getClass();
        this.participantSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantSid_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(F1 f12) {
        this.quality_ = f12.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(float f6) {
        this.score_ = f6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0001", new Object[]{"participantSid_", "quality_", "score_"});
            case 3:
                return new LivekitRtc$ConnectionQualityInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$ConnectionQualityInfo.class) {
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

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC2534q getParticipantSidBytes() {
        return AbstractC2534q.y(this.participantSid_);
    }

    public F1 getQuality() {
        F1 f12;
        int i10 = this.quality_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        f12 = null;
                    } else {
                        f12 = F1.LOST;
                    }
                } else {
                    f12 = F1.EXCELLENT;
                }
            } else {
                f12 = F1.GOOD;
            }
        } else {
            f12 = F1.POOR;
        }
        if (f12 == null) {
            return F1.UNRECOGNIZED;
        }
        return f12;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public float getScore() {
        return this.score_;
    }

    public static P2 newBuilder(LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        return (P2) DEFAULT_INSTANCE.createBuilder(livekitRtc$ConnectionQualityInfo);
    }

    public static LivekitRtc$ConnectionQualityInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$ConnectionQualityInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$ConnectionQualityInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
