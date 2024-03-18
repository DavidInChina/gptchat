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
import jh.AbstractC4086u3;
import jh.C4081t3;
import jh.EnumC4076s3;

/* loaded from: classes.dex */
public final class LivekitRtc$StreamStateInfo extends AbstractC2497d0 implements AbstractC4086u3 {
    private static final LivekitRtc$StreamStateInfo DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int TRACK_SID_FIELD_NUMBER = 2;
    private int state_;
    private String participantSid_ = "";
    private String trackSid_ = "";

    static {
        LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo = new LivekitRtc$StreamStateInfo();
        DEFAULT_INSTANCE = livekitRtc$StreamStateInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$StreamStateInfo.class, livekitRtc$StreamStateInfo);
    }

    private LivekitRtc$StreamStateInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$StreamStateInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4081t3 newBuilder() {
        return (C4081t3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$StreamStateInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setState(EnumC4076s3 enumC4076s3) {
        this.state_ = enumC4076s3.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i10) {
        this.state_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.trackSid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\f", new Object[]{"participantSid_", "trackSid_", "state_"});
            case 3:
                return new LivekitRtc$StreamStateInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$StreamStateInfo.class) {
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

    public EnumC4076s3 getState() {
        EnumC4076s3 enumC4076s3;
        int i10 = this.state_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4076s3 = null;
            } else {
                enumC4076s3 = EnumC4076s3.PAUSED;
            }
        } else {
            enumC4076s3 = EnumC4076s3.ACTIVE;
        }
        if (enumC4076s3 == null) {
            return EnumC4076s3.UNRECOGNIZED;
        }
        return enumC4076s3;
    }

    public int getStateValue() {
        return this.state_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static C4081t3 newBuilder(LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        return (C4081t3) DEFAULT_INSTANCE.createBuilder(livekitRtc$StreamStateInfo);
    }

    public static LivekitRtc$StreamStateInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$StreamStateInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$StreamStateInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
