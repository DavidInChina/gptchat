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
import jh.C2;
import jh.C4027i3;
import jh.C4040l1;
import jh.C4065q1;
import jh.C4094w1;
import jh.C4095w2;
import jh.EnumC4069r1;
import jh.G2;
import jh.H2;
import jh.J2;
import jh.K2;
import jh.L2;

/* loaded from: classes.dex */
public final class LivekitInternal$RTCNodeMessage extends AbstractC2497d0 implements N0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 13;
    private static final LivekitInternal$RTCNodeMessage DEFAULT_INSTANCE;
    public static final int DELETE_ROOM_FIELD_NUMBER = 7;
    public static final int IDENTITY_FIELD_NUMBER = 16;
    public static final int KEEP_ALIVE_FIELD_NUMBER = 12;
    public static final int MUTE_TRACK_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_KEY_B62_FIELD_NUMBER = 14;
    public static final int PARTICIPANT_KEY_FIELD_NUMBER = 1;
    public static final int REMOVE_PARTICIPANT_FIELD_NUMBER = 4;
    public static final int REQUEST_FIELD_NUMBER = 3;
    public static final int ROOM_NAME_FIELD_NUMBER = 15;
    public static final int SENDER_TIME_FIELD_NUMBER = 11;
    public static final int SEND_DATA_FIELD_NUMBER = 9;
    public static final int START_SESSION_FIELD_NUMBER = 2;
    public static final int UPDATE_PARTICIPANT_FIELD_NUMBER = 6;
    public static final int UPDATE_ROOM_METADATA_FIELD_NUMBER = 10;
    public static final int UPDATE_SUBSCRIPTIONS_FIELD_NUMBER = 8;
    private Object message_;
    private long senderTime_;
    private int messageCase_ = 0;
    private String participantKey_ = "";
    private String connectionId_ = "";
    private String participantKeyB62_ = "";
    private String roomName_ = "";
    private String identity_ = "";

    static {
        LivekitInternal$RTCNodeMessage livekitInternal$RTCNodeMessage = new LivekitInternal$RTCNodeMessage();
        DEFAULT_INSTANCE = livekitInternal$RTCNodeMessage;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$RTCNodeMessage.class, livekitInternal$RTCNodeMessage);
    }

    private LivekitInternal$RTCNodeMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionId() {
        this.connectionId_ = getDefaultInstance().getConnectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteRoom() {
        if (this.messageCase_ == 7) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeepAlive() {
        if (this.messageCase_ == 12) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.messageCase_ = 0;
        this.message_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuteTrack() {
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantKey() {
        this.participantKey_ = getDefaultInstance().getParticipantKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantKeyB62() {
        this.participantKeyB62_ = getDefaultInstance().getParticipantKeyB62();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveParticipant() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendData() {
        if (this.messageCase_ == 9) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderTime() {
        this.senderTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartSession() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateParticipant() {
        if (this.messageCase_ == 6) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateRoomMetadata() {
        if (this.messageCase_ == 10) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateSubscriptions() {
        if (this.messageCase_ == 8) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitInternal$RTCNodeMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteRoom(LivekitRoom$DeleteRoomRequest livekitRoom$DeleteRoomRequest) {
        livekitRoom$DeleteRoomRequest.getClass();
        if (this.messageCase_ == 7 && this.message_ != LivekitRoom$DeleteRoomRequest.getDefaultInstance()) {
            C4095w2 newBuilder = LivekitRoom$DeleteRoomRequest.newBuilder((LivekitRoom$DeleteRoomRequest) this.message_);
            newBuilder.f(livekitRoom$DeleteRoomRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$DeleteRoomRequest;
        }
        this.messageCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKeepAlive(LivekitInternal$KeepAlive livekitInternal$KeepAlive) {
        livekitInternal$KeepAlive.getClass();
        if (this.messageCase_ == 12 && this.message_ != LivekitInternal$KeepAlive.getDefaultInstance()) {
            C4040l1 newBuilder = LivekitInternal$KeepAlive.newBuilder((LivekitInternal$KeepAlive) this.message_);
            newBuilder.f(livekitInternal$KeepAlive);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitInternal$KeepAlive;
        }
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMuteTrack(LivekitRoom$MuteRoomTrackRequest livekitRoom$MuteRoomTrackRequest) {
        livekitRoom$MuteRoomTrackRequest.getClass();
        if (this.messageCase_ == 5 && this.message_ != LivekitRoom$MuteRoomTrackRequest.getDefaultInstance()) {
            C2 newBuilder = LivekitRoom$MuteRoomTrackRequest.newBuilder((LivekitRoom$MuteRoomTrackRequest) this.message_);
            newBuilder.f(livekitRoom$MuteRoomTrackRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$MuteRoomTrackRequest;
        }
        this.messageCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveParticipant(LivekitRoom$RoomParticipantIdentity livekitRoom$RoomParticipantIdentity) {
        livekitRoom$RoomParticipantIdentity.getClass();
        if (this.messageCase_ == 4 && this.message_ != LivekitRoom$RoomParticipantIdentity.getDefaultInstance()) {
            G2 newBuilder = LivekitRoom$RoomParticipantIdentity.newBuilder((LivekitRoom$RoomParticipantIdentity) this.message_);
            newBuilder.f(livekitRoom$RoomParticipantIdentity);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$RoomParticipantIdentity;
        }
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        livekitRtc$SignalRequest.getClass();
        if (this.messageCase_ == 3 && this.message_ != LivekitRtc$SignalRequest.getDefaultInstance()) {
            C4027i3 newBuilder = LivekitRtc$SignalRequest.newBuilder((LivekitRtc$SignalRequest) this.message_);
            newBuilder.f(livekitRtc$SignalRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SignalRequest;
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSendData(LivekitRoom$SendDataRequest livekitRoom$SendDataRequest) {
        livekitRoom$SendDataRequest.getClass();
        if (this.messageCase_ == 9 && this.message_ != LivekitRoom$SendDataRequest.getDefaultInstance()) {
            H2 newBuilder = LivekitRoom$SendDataRequest.newBuilder((LivekitRoom$SendDataRequest) this.message_);
            newBuilder.f(livekitRoom$SendDataRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$SendDataRequest;
        }
        this.messageCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartSession(LivekitInternal$StartSession livekitInternal$StartSession) {
        livekitInternal$StartSession.getClass();
        if (this.messageCase_ == 2 && this.message_ != LivekitInternal$StartSession.getDefaultInstance()) {
            C4094w1 newBuilder = LivekitInternal$StartSession.newBuilder((LivekitInternal$StartSession) this.message_);
            newBuilder.f(livekitInternal$StartSession);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitInternal$StartSession;
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateParticipant(LivekitRoom$UpdateParticipantRequest livekitRoom$UpdateParticipantRequest) {
        livekitRoom$UpdateParticipantRequest.getClass();
        if (this.messageCase_ == 6 && this.message_ != LivekitRoom$UpdateParticipantRequest.getDefaultInstance()) {
            J2 newBuilder = LivekitRoom$UpdateParticipantRequest.newBuilder((LivekitRoom$UpdateParticipantRequest) this.message_);
            newBuilder.f(livekitRoom$UpdateParticipantRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$UpdateParticipantRequest;
        }
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateRoomMetadata(LivekitRoom$UpdateRoomMetadataRequest livekitRoom$UpdateRoomMetadataRequest) {
        livekitRoom$UpdateRoomMetadataRequest.getClass();
        if (this.messageCase_ == 10 && this.message_ != LivekitRoom$UpdateRoomMetadataRequest.getDefaultInstance()) {
            K2 newBuilder = LivekitRoom$UpdateRoomMetadataRequest.newBuilder((LivekitRoom$UpdateRoomMetadataRequest) this.message_);
            newBuilder.f(livekitRoom$UpdateRoomMetadataRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$UpdateRoomMetadataRequest;
        }
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateSubscriptions(LivekitRoom$UpdateSubscriptionsRequest livekitRoom$UpdateSubscriptionsRequest) {
        livekitRoom$UpdateSubscriptionsRequest.getClass();
        if (this.messageCase_ == 8 && this.message_ != LivekitRoom$UpdateSubscriptionsRequest.getDefaultInstance()) {
            L2 newBuilder = LivekitRoom$UpdateSubscriptionsRequest.newBuilder((LivekitRoom$UpdateSubscriptionsRequest) this.message_);
            newBuilder.f(livekitRoom$UpdateSubscriptionsRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRoom$UpdateSubscriptionsRequest;
        }
        this.messageCase_ = 8;
    }

    public static C4065q1 newBuilder() {
        return (C4065q1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$RTCNodeMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionId(String str) {
        str.getClass();
        this.connectionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.connectionId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteRoom(LivekitRoom$DeleteRoomRequest livekitRoom$DeleteRoomRequest) {
        livekitRoom$DeleteRoomRequest.getClass();
        this.message_ = livekitRoom$DeleteRoomRequest;
        this.messageCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.identity_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeepAlive(LivekitInternal$KeepAlive livekitInternal$KeepAlive) {
        livekitInternal$KeepAlive.getClass();
        this.message_ = livekitInternal$KeepAlive;
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuteTrack(LivekitRoom$MuteRoomTrackRequest livekitRoom$MuteRoomTrackRequest) {
        livekitRoom$MuteRoomTrackRequest.getClass();
        this.message_ = livekitRoom$MuteRoomTrackRequest;
        this.messageCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantKey(String str) {
        str.getClass();
        this.participantKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantKeyB62(String str) {
        str.getClass();
        this.participantKeyB62_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantKeyB62Bytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantKeyB62_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantKeyBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantKey_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveParticipant(LivekitRoom$RoomParticipantIdentity livekitRoom$RoomParticipantIdentity) {
        livekitRoom$RoomParticipantIdentity.getClass();
        this.message_ = livekitRoom$RoomParticipantIdentity;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        livekitRtc$SignalRequest.getClass();
        this.message_ = livekitRtc$SignalRequest;
        this.messageCase_ = 3;
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
    public void setSendData(LivekitRoom$SendDataRequest livekitRoom$SendDataRequest) {
        livekitRoom$SendDataRequest.getClass();
        this.message_ = livekitRoom$SendDataRequest;
        this.messageCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderTime(long j6) {
        this.senderTime_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartSession(LivekitInternal$StartSession livekitInternal$StartSession) {
        livekitInternal$StartSession.getClass();
        this.message_ = livekitInternal$StartSession;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateParticipant(LivekitRoom$UpdateParticipantRequest livekitRoom$UpdateParticipantRequest) {
        livekitRoom$UpdateParticipantRequest.getClass();
        this.message_ = livekitRoom$UpdateParticipantRequest;
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateRoomMetadata(LivekitRoom$UpdateRoomMetadataRequest livekitRoom$UpdateRoomMetadataRequest) {
        livekitRoom$UpdateRoomMetadataRequest.getClass();
        this.message_ = livekitRoom$UpdateRoomMetadataRequest;
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateSubscriptions(LivekitRoom$UpdateSubscriptionsRequest livekitRoom$UpdateSubscriptionsRequest) {
        livekitRoom$UpdateSubscriptionsRequest.getClass();
        this.message_ = livekitRoom$UpdateSubscriptionsRequest;
        this.messageCase_ = 8;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0001\u0000\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0208\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\u0002\f<\u0000\r\u0208\u000e\u0208\u000f\u0208\u0010\u0208", new Object[]{"message_", "messageCase_", "participantKey_", LivekitInternal$StartSession.class, LivekitRtc$SignalRequest.class, LivekitRoom$RoomParticipantIdentity.class, LivekitRoom$MuteRoomTrackRequest.class, LivekitRoom$UpdateParticipantRequest.class, LivekitRoom$DeleteRoomRequest.class, LivekitRoom$UpdateSubscriptionsRequest.class, LivekitRoom$SendDataRequest.class, LivekitRoom$UpdateRoomMetadataRequest.class, "senderTime_", LivekitInternal$KeepAlive.class, "connectionId_", "participantKeyB62_", "roomName_", "identity_"});
            case 3:
                return new LivekitInternal$RTCNodeMessage();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$RTCNodeMessage.class) {
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

    public String getConnectionId() {
        return this.connectionId_;
    }

    public AbstractC2534q getConnectionIdBytes() {
        return AbstractC2534q.y(this.connectionId_);
    }

    public LivekitRoom$DeleteRoomRequest getDeleteRoom() {
        if (this.messageCase_ == 7) {
            return (LivekitRoom$DeleteRoomRequest) this.message_;
        }
        return LivekitRoom$DeleteRoomRequest.getDefaultInstance();
    }

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC2534q getIdentityBytes() {
        return AbstractC2534q.y(this.identity_);
    }

    public LivekitInternal$KeepAlive getKeepAlive() {
        if (this.messageCase_ == 12) {
            return (LivekitInternal$KeepAlive) this.message_;
        }
        return LivekitInternal$KeepAlive.getDefaultInstance();
    }

    public EnumC4069r1 getMessageCase() {
        int i10 = this.messageCase_;
        if (i10 != 0) {
            if (i10 != 12) {
                switch (i10) {
                    case 2:
                        return EnumC4069r1.f36571Y;
                    case 3:
                        return EnumC4069r1.f36572Z;
                    case 4:
                        return EnumC4069r1.f36573h0;
                    case 5:
                        return EnumC4069r1.f36574i0;
                    case 6:
                        return EnumC4069r1.f36575j0;
                    case 7:
                        return EnumC4069r1.f36576k0;
                    case 8:
                        return EnumC4069r1.f36577l0;
                    case 9:
                        return EnumC4069r1.f36578m0;
                    case 10:
                        return EnumC4069r1.f36579n0;
                    default:
                        return null;
                }
            }
            return EnumC4069r1.f36580o0;
        }
        return EnumC4069r1.f36581p0;
    }

    public LivekitRoom$MuteRoomTrackRequest getMuteTrack() {
        if (this.messageCase_ == 5) {
            return (LivekitRoom$MuteRoomTrackRequest) this.message_;
        }
        return LivekitRoom$MuteRoomTrackRequest.getDefaultInstance();
    }

    public String getParticipantKey() {
        return this.participantKey_;
    }

    public String getParticipantKeyB62() {
        return this.participantKeyB62_;
    }

    public AbstractC2534q getParticipantKeyB62Bytes() {
        return AbstractC2534q.y(this.participantKeyB62_);
    }

    public AbstractC2534q getParticipantKeyBytes() {
        return AbstractC2534q.y(this.participantKey_);
    }

    public LivekitRoom$RoomParticipantIdentity getRemoveParticipant() {
        if (this.messageCase_ == 4) {
            return (LivekitRoom$RoomParticipantIdentity) this.message_;
        }
        return LivekitRoom$RoomParticipantIdentity.getDefaultInstance();
    }

    public LivekitRtc$SignalRequest getRequest() {
        if (this.messageCase_ == 3) {
            return (LivekitRtc$SignalRequest) this.message_;
        }
        return LivekitRtc$SignalRequest.getDefaultInstance();
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public LivekitRoom$SendDataRequest getSendData() {
        if (this.messageCase_ == 9) {
            return (LivekitRoom$SendDataRequest) this.message_;
        }
        return LivekitRoom$SendDataRequest.getDefaultInstance();
    }

    public long getSenderTime() {
        return this.senderTime_;
    }

    public LivekitInternal$StartSession getStartSession() {
        if (this.messageCase_ == 2) {
            return (LivekitInternal$StartSession) this.message_;
        }
        return LivekitInternal$StartSession.getDefaultInstance();
    }

    public LivekitRoom$UpdateParticipantRequest getUpdateParticipant() {
        if (this.messageCase_ == 6) {
            return (LivekitRoom$UpdateParticipantRequest) this.message_;
        }
        return LivekitRoom$UpdateParticipantRequest.getDefaultInstance();
    }

    public LivekitRoom$UpdateRoomMetadataRequest getUpdateRoomMetadata() {
        if (this.messageCase_ == 10) {
            return (LivekitRoom$UpdateRoomMetadataRequest) this.message_;
        }
        return LivekitRoom$UpdateRoomMetadataRequest.getDefaultInstance();
    }

    public LivekitRoom$UpdateSubscriptionsRequest getUpdateSubscriptions() {
        if (this.messageCase_ == 8) {
            return (LivekitRoom$UpdateSubscriptionsRequest) this.message_;
        }
        return LivekitRoom$UpdateSubscriptionsRequest.getDefaultInstance();
    }

    public boolean hasDeleteRoom() {
        if (this.messageCase_ == 7) {
            return true;
        }
        return false;
    }

    public boolean hasKeepAlive() {
        if (this.messageCase_ == 12) {
            return true;
        }
        return false;
    }

    public boolean hasMuteTrack() {
        if (this.messageCase_ == 5) {
            return true;
        }
        return false;
    }

    public boolean hasRemoveParticipant() {
        if (this.messageCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasRequest() {
        if (this.messageCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasSendData() {
        if (this.messageCase_ == 9) {
            return true;
        }
        return false;
    }

    public boolean hasStartSession() {
        if (this.messageCase_ == 2) {
            return true;
        }
        return false;
    }

    public boolean hasUpdateParticipant() {
        if (this.messageCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasUpdateRoomMetadata() {
        if (this.messageCase_ == 10) {
            return true;
        }
        return false;
    }

    public boolean hasUpdateSubscriptions() {
        if (this.messageCase_ == 8) {
            return true;
        }
        return false;
    }

    public static C4065q1 newBuilder(LivekitInternal$RTCNodeMessage livekitInternal$RTCNodeMessage) {
        return (C4065q1) DEFAULT_INSTANCE.createBuilder(livekitInternal$RTCNodeMessage);
    }

    public static LivekitInternal$RTCNodeMessage parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(byte[] bArr) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(InputStream inputStream) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$RTCNodeMessage parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$RTCNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
