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
import jh.i4;
import jh.j4;

/* loaded from: classes2.dex */
public final class LivekitSip$SIPParticipantInfo extends AbstractC2497d0 implements j4 {
    private static final LivekitSip$SIPParticipantInfo DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 5;
    public static final int ROOM_NAME_FIELD_NUMBER = 4;
    public static final int SIP_CALL_TO_FIELD_NUMBER = 3;
    public static final int SIP_PARTICIPANT_ID_FIELD_NUMBER = 1;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 2;
    private String sipParticipantId_ = "";
    private String sipTrunkId_ = "";
    private String sipCallTo_ = "";
    private String roomName_ = "";
    private String participantIdentity_ = "";

    static {
        LivekitSip$SIPParticipantInfo livekitSip$SIPParticipantInfo = new LivekitSip$SIPParticipantInfo();
        DEFAULT_INSTANCE = livekitSip$SIPParticipantInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$SIPParticipantInfo.class, livekitSip$SIPParticipantInfo);
    }

    private LivekitSip$SIPParticipantInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipCallTo() {
        this.sipCallTo_ = getDefaultInstance().getSipCallTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipParticipantId() {
        this.sipParticipantId_ = getDefaultInstance().getSipParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    public static LivekitSip$SIPParticipantInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static i4 newBuilder() {
        return (i4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPParticipantInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentity(String str) {
        str.getClass();
        this.participantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantIdentity_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.roomName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipCallTo(String str) {
        str.getClass();
        this.sipCallTo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipCallToBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sipCallTo_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipParticipantId(String str) {
        str.getClass();
        this.sipParticipantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipParticipantIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sipParticipantId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkId(String str) {
        str.getClass();
        this.sipTrunkId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sipTrunkId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[]{"sipParticipantId_", "sipTrunkId_", "sipCallTo_", "roomName_", "participantIdentity_"});
            case 3:
                return new LivekitSip$SIPParticipantInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$SIPParticipantInfo.class) {
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

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC2534q getParticipantIdentityBytes() {
        return AbstractC2534q.y(this.participantIdentity_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public String getSipCallTo() {
        return this.sipCallTo_;
    }

    public AbstractC2534q getSipCallToBytes() {
        return AbstractC2534q.y(this.sipCallTo_);
    }

    public String getSipParticipantId() {
        return this.sipParticipantId_;
    }

    public AbstractC2534q getSipParticipantIdBytes() {
        return AbstractC2534q.y(this.sipParticipantId_);
    }

    public String getSipTrunkId() {
        return this.sipTrunkId_;
    }

    public AbstractC2534q getSipTrunkIdBytes() {
        return AbstractC2534q.y(this.sipTrunkId_);
    }

    public static i4 newBuilder(LivekitSip$SIPParticipantInfo livekitSip$SIPParticipantInfo) {
        return (i4) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPParticipantInfo);
    }

    public static LivekitSip$SIPParticipantInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(byte[] bArr) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$SIPParticipantInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$SIPParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
