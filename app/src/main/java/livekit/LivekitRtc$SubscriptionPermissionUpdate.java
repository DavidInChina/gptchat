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
import jh.C3;

/* loaded from: classes.dex */
public final class LivekitRtc$SubscriptionPermissionUpdate extends AbstractC2497d0 implements N0 {
    public static final int ALLOWED_FIELD_NUMBER = 3;
    private static final LivekitRtc$SubscriptionPermissionUpdate DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int TRACK_SID_FIELD_NUMBER = 2;
    private boolean allowed_;
    private String participantSid_ = "";
    private String trackSid_ = "";

    static {
        LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate = new LivekitRtc$SubscriptionPermissionUpdate();
        DEFAULT_INSTANCE = livekitRtc$SubscriptionPermissionUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SubscriptionPermissionUpdate.class, livekitRtc$SubscriptionPermissionUpdate);
    }

    private LivekitRtc$SubscriptionPermissionUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowed() {
        this.allowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$SubscriptionPermissionUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3 newBuilder() {
        return (C3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowed(boolean z10) {
        this.allowed_ = z10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", new Object[]{"participantSid_", "trackSid_", "allowed_"});
            case 3:
                return new LivekitRtc$SubscriptionPermissionUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SubscriptionPermissionUpdate.class) {
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

    public boolean getAllowed() {
        return this.allowed_;
    }

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC2534q getParticipantSidBytes() {
        return AbstractC2534q.y(this.participantSid_);
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static C3 newBuilder(LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate) {
        return (C3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscriptionPermissionUpdate);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SubscriptionPermissionUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SubscriptionPermissionUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
