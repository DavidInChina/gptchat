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
import jh.A3;
import jh.C3;
import jh.C3992b3;
import jh.C3997c3;
import jh.C4017g3;
import jh.C4022h3;
import jh.C4037k3;
import jh.C4071r3;
import jh.C4091v3;
import jh.D3;
import jh.EnumC4042l3;
import jh.H3;
import jh.J3;
import jh.K3;
import jh.R2;
import jh.W2;
import jh.X2;
import jh.Y2;
import jh.Z2;

/* loaded from: classes2.dex */
public final class LivekitRtc$SignalResponse extends AbstractC2497d0 implements N0 {
    public static final int ANSWER_FIELD_NUMBER = 2;
    public static final int CONNECTION_QUALITY_FIELD_NUMBER = 12;
    private static final LivekitRtc$SignalResponse DEFAULT_INSTANCE;
    public static final int JOIN_FIELD_NUMBER = 1;
    public static final int LEAVE_FIELD_NUMBER = 8;
    public static final int MUTE_FIELD_NUMBER = 9;
    public static final int OFFER_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PONG_FIELD_NUMBER = 18;
    public static final int PONG_RESP_FIELD_NUMBER = 20;
    public static final int RECONNECT_FIELD_NUMBER = 19;
    public static final int REFRESH_TOKEN_FIELD_NUMBER = 16;
    public static final int ROOM_UPDATE_FIELD_NUMBER = 11;
    public static final int SPEAKERS_CHANGED_FIELD_NUMBER = 10;
    public static final int STREAM_STATE_UPDATE_FIELD_NUMBER = 13;
    public static final int SUBSCRIBED_QUALITY_UPDATE_FIELD_NUMBER = 14;
    public static final int SUBSCRIPTION_PERMISSION_UPDATE_FIELD_NUMBER = 15;
    public static final int SUBSCRIPTION_RESPONSE_FIELD_NUMBER = 21;
    public static final int TRACK_PUBLISHED_FIELD_NUMBER = 6;
    public static final int TRACK_UNPUBLISHED_FIELD_NUMBER = 17;
    public static final int TRICKLE_FIELD_NUMBER = 4;
    public static final int UPDATE_FIELD_NUMBER = 5;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitRtc$SignalResponse livekitRtc$SignalResponse = new LivekitRtc$SignalResponse();
        DEFAULT_INSTANCE = livekitRtc$SignalResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SignalResponse.class, livekitRtc$SignalResponse);
    }

    private LivekitRtc$SignalResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionQuality() {
        if (this.messageCase_ == 12) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJoin() {
        if (this.messageCase_ == 1) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeave() {
        if (this.messageCase_ == 8) {
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
    public void clearMute() {
        if (this.messageCase_ == 9) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffer() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPong() {
        if (this.messageCase_ == 18) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPongResp() {
        if (this.messageCase_ == 20) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnect() {
        if (this.messageCase_ == 19) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshToken() {
        if (this.messageCase_ == 16) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomUpdate() {
        if (this.messageCase_ == 11) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakersChanged() {
        if (this.messageCase_ == 10) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamStateUpdate() {
        if (this.messageCase_ == 13) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribedQualityUpdate() {
        if (this.messageCase_ == 14) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriptionPermissionUpdate() {
        if (this.messageCase_ == 15) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriptionResponse() {
        if (this.messageCase_ == 21) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackPublished() {
        if (this.messageCase_ == 6) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackUnpublished() {
        if (this.messageCase_ == 17) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrickle() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdate() {
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitRtc$SignalResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        if (this.messageCase_ == 2 && this.message_ != LivekitRtc$SessionDescription.getDefaultInstance()) {
            C4022h3 newBuilder = LivekitRtc$SessionDescription.newBuilder((LivekitRtc$SessionDescription) this.message_);
            newBuilder.f(livekitRtc$SessionDescription);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SessionDescription;
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConnectionQuality(LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate) {
        livekitRtc$ConnectionQualityUpdate.getClass();
        if (this.messageCase_ == 12 && this.message_ != LivekitRtc$ConnectionQualityUpdate.getDefaultInstance()) {
            R2 newBuilder = LivekitRtc$ConnectionQualityUpdate.newBuilder((LivekitRtc$ConnectionQualityUpdate) this.message_);
            newBuilder.f(livekitRtc$ConnectionQualityUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$ConnectionQualityUpdate;
        }
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJoin(LivekitRtc$JoinResponse livekitRtc$JoinResponse) {
        livekitRtc$JoinResponse.getClass();
        if (this.messageCase_ == 1 && this.message_ != LivekitRtc$JoinResponse.getDefaultInstance()) {
            W2 newBuilder = LivekitRtc$JoinResponse.newBuilder((LivekitRtc$JoinResponse) this.message_);
            newBuilder.f(livekitRtc$JoinResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$JoinResponse;
        }
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLeave(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        livekitRtc$LeaveRequest.getClass();
        if (this.messageCase_ == 8 && this.message_ != LivekitRtc$LeaveRequest.getDefaultInstance()) {
            X2 newBuilder = LivekitRtc$LeaveRequest.newBuilder((LivekitRtc$LeaveRequest) this.message_);
            newBuilder.f(livekitRtc$LeaveRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$LeaveRequest;
        }
        this.messageCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMute(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        livekitRtc$MuteTrackRequest.getClass();
        if (this.messageCase_ == 9 && this.message_ != LivekitRtc$MuteTrackRequest.getDefaultInstance()) {
            Y2 newBuilder = LivekitRtc$MuteTrackRequest.newBuilder((LivekitRtc$MuteTrackRequest) this.message_);
            newBuilder.f(livekitRtc$MuteTrackRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$MuteTrackRequest;
        }
        this.messageCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        if (this.messageCase_ == 3 && this.message_ != LivekitRtc$SessionDescription.getDefaultInstance()) {
            C4022h3 newBuilder = LivekitRtc$SessionDescription.newBuilder((LivekitRtc$SessionDescription) this.message_);
            newBuilder.f(livekitRtc$SessionDescription);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SessionDescription;
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePongResp(LivekitRtc$Pong livekitRtc$Pong) {
        livekitRtc$Pong.getClass();
        if (this.messageCase_ == 20 && this.message_ != LivekitRtc$Pong.getDefaultInstance()) {
            C3992b3 newBuilder = LivekitRtc$Pong.newBuilder((LivekitRtc$Pong) this.message_);
            newBuilder.f(livekitRtc$Pong);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$Pong;
        }
        this.messageCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReconnect(LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse) {
        livekitRtc$ReconnectResponse.getClass();
        if (this.messageCase_ == 19 && this.message_ != LivekitRtc$ReconnectResponse.getDefaultInstance()) {
            C3997c3 newBuilder = LivekitRtc$ReconnectResponse.newBuilder((LivekitRtc$ReconnectResponse) this.message_);
            newBuilder.f(livekitRtc$ReconnectResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$ReconnectResponse;
        }
        this.messageCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoomUpdate(LivekitRtc$RoomUpdate livekitRtc$RoomUpdate) {
        livekitRtc$RoomUpdate.getClass();
        if (this.messageCase_ == 11 && this.message_ != LivekitRtc$RoomUpdate.getDefaultInstance()) {
            C4017g3 newBuilder = LivekitRtc$RoomUpdate.newBuilder((LivekitRtc$RoomUpdate) this.message_);
            newBuilder.f(livekitRtc$RoomUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$RoomUpdate;
        }
        this.messageCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeakersChanged(LivekitRtc$SpeakersChanged livekitRtc$SpeakersChanged) {
        livekitRtc$SpeakersChanged.getClass();
        if (this.messageCase_ == 10 && this.message_ != LivekitRtc$SpeakersChanged.getDefaultInstance()) {
            C4071r3 newBuilder = LivekitRtc$SpeakersChanged.newBuilder((LivekitRtc$SpeakersChanged) this.message_);
            newBuilder.f(livekitRtc$SpeakersChanged);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SpeakersChanged;
        }
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStreamStateUpdate(LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate) {
        livekitRtc$StreamStateUpdate.getClass();
        if (this.messageCase_ == 13 && this.message_ != LivekitRtc$StreamStateUpdate.getDefaultInstance()) {
            C4091v3 newBuilder = LivekitRtc$StreamStateUpdate.newBuilder((LivekitRtc$StreamStateUpdate) this.message_);
            newBuilder.f(livekitRtc$StreamStateUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$StreamStateUpdate;
        }
        this.messageCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate) {
        livekitRtc$SubscribedQualityUpdate.getClass();
        if (this.messageCase_ == 14 && this.message_ != LivekitRtc$SubscribedQualityUpdate.getDefaultInstance()) {
            A3 newBuilder = LivekitRtc$SubscribedQualityUpdate.newBuilder((LivekitRtc$SubscribedQualityUpdate) this.message_);
            newBuilder.f(livekitRtc$SubscribedQualityUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SubscribedQualityUpdate;
        }
        this.messageCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate) {
        livekitRtc$SubscriptionPermissionUpdate.getClass();
        if (this.messageCase_ == 15 && this.message_ != LivekitRtc$SubscriptionPermissionUpdate.getDefaultInstance()) {
            C3 newBuilder = LivekitRtc$SubscriptionPermissionUpdate.newBuilder((LivekitRtc$SubscriptionPermissionUpdate) this.message_);
            newBuilder.f(livekitRtc$SubscriptionPermissionUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SubscriptionPermissionUpdate;
        }
        this.messageCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSubscriptionResponse(LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse) {
        livekitRtc$SubscriptionResponse.getClass();
        if (this.messageCase_ == 21 && this.message_ != LivekitRtc$SubscriptionResponse.getDefaultInstance()) {
            D3 newBuilder = LivekitRtc$SubscriptionResponse.newBuilder((LivekitRtc$SubscriptionResponse) this.message_);
            newBuilder.f(livekitRtc$SubscriptionResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SubscriptionResponse;
        }
        this.messageCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackPublished(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        if (this.messageCase_ == 6 && this.message_ != LivekitRtc$TrackPublishedResponse.getDefaultInstance()) {
            H3 newBuilder = LivekitRtc$TrackPublishedResponse.newBuilder((LivekitRtc$TrackPublishedResponse) this.message_);
            newBuilder.f(livekitRtc$TrackPublishedResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$TrackPublishedResponse;
        }
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackUnpublished(LivekitRtc$TrackUnpublishedResponse livekitRtc$TrackUnpublishedResponse) {
        livekitRtc$TrackUnpublishedResponse.getClass();
        if (this.messageCase_ == 17 && this.message_ != LivekitRtc$TrackUnpublishedResponse.getDefaultInstance()) {
            J3 newBuilder = LivekitRtc$TrackUnpublishedResponse.newBuilder((LivekitRtc$TrackUnpublishedResponse) this.message_);
            newBuilder.f(livekitRtc$TrackUnpublishedResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$TrackUnpublishedResponse;
        }
        this.messageCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        if (this.messageCase_ == 4 && this.message_ != LivekitRtc$TrickleRequest.getDefaultInstance()) {
            K3 newBuilder = LivekitRtc$TrickleRequest.newBuilder((LivekitRtc$TrickleRequest) this.message_);
            newBuilder.f(livekitRtc$TrickleRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$TrickleRequest;
        }
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdate(LivekitRtc$ParticipantUpdate livekitRtc$ParticipantUpdate) {
        livekitRtc$ParticipantUpdate.getClass();
        if (this.messageCase_ == 5 && this.message_ != LivekitRtc$ParticipantUpdate.getDefaultInstance()) {
            Z2 newBuilder = LivekitRtc$ParticipantUpdate.newBuilder((LivekitRtc$ParticipantUpdate) this.message_);
            newBuilder.f(livekitRtc$ParticipantUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$ParticipantUpdate;
        }
        this.messageCase_ = 5;
    }

    public static C4037k3 newBuilder() {
        return (C4037k3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SignalResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionQuality(LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate) {
        livekitRtc$ConnectionQualityUpdate.getClass();
        this.message_ = livekitRtc$ConnectionQualityUpdate;
        this.messageCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJoin(LivekitRtc$JoinResponse livekitRtc$JoinResponse) {
        livekitRtc$JoinResponse.getClass();
        this.message_ = livekitRtc$JoinResponse;
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeave(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        livekitRtc$LeaveRequest.getClass();
        this.message_ = livekitRtc$LeaveRequest;
        this.messageCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMute(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        livekitRtc$MuteTrackRequest.getClass();
        this.message_ = livekitRtc$MuteTrackRequest;
        this.messageCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPong(long j6) {
        this.messageCase_ = 18;
        this.message_ = Long.valueOf(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPongResp(LivekitRtc$Pong livekitRtc$Pong) {
        livekitRtc$Pong.getClass();
        this.message_ = livekitRtc$Pong;
        this.messageCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnect(LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse) {
        livekitRtc$ReconnectResponse.getClass();
        this.message_ = livekitRtc$ReconnectResponse;
        this.messageCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshToken(String str) {
        str.getClass();
        this.messageCase_ = 16;
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshTokenBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.message_ = abstractC2534q.q0();
        this.messageCase_ = 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomUpdate(LivekitRtc$RoomUpdate livekitRtc$RoomUpdate) {
        livekitRtc$RoomUpdate.getClass();
        this.message_ = livekitRtc$RoomUpdate;
        this.messageCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakersChanged(LivekitRtc$SpeakersChanged livekitRtc$SpeakersChanged) {
        livekitRtc$SpeakersChanged.getClass();
        this.message_ = livekitRtc$SpeakersChanged;
        this.messageCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamStateUpdate(LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate) {
        livekitRtc$StreamStateUpdate.getClass();
        this.message_ = livekitRtc$StreamStateUpdate;
        this.messageCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribedQualityUpdate(LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate) {
        livekitRtc$SubscribedQualityUpdate.getClass();
        this.message_ = livekitRtc$SubscribedQualityUpdate;
        this.messageCase_ = 14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriptionPermissionUpdate(LivekitRtc$SubscriptionPermissionUpdate livekitRtc$SubscriptionPermissionUpdate) {
        livekitRtc$SubscriptionPermissionUpdate.getClass();
        this.message_ = livekitRtc$SubscriptionPermissionUpdate;
        this.messageCase_ = 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriptionResponse(LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse) {
        livekitRtc$SubscriptionResponse.getClass();
        this.message_ = livekitRtc$SubscriptionResponse;
        this.messageCase_ = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackPublished(LivekitRtc$TrackPublishedResponse livekitRtc$TrackPublishedResponse) {
        livekitRtc$TrackPublishedResponse.getClass();
        this.message_ = livekitRtc$TrackPublishedResponse;
        this.messageCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackUnpublished(LivekitRtc$TrackUnpublishedResponse livekitRtc$TrackUnpublishedResponse) {
        livekitRtc$TrackUnpublishedResponse.getClass();
        this.message_ = livekitRtc$TrackUnpublishedResponse;
        this.messageCase_ = 17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        this.message_ = livekitRtc$TrickleRequest;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdate(LivekitRtc$ParticipantUpdate livekitRtc$ParticipantUpdate) {
        livekitRtc$ParticipantUpdate.getClass();
        this.message_ = livekitRtc$ParticipantUpdate;
        this.messageCase_ = 5;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0001\u0000\u0001\u0015\u0014\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010\u023b\u0000\u0011<\u0000\u00125\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000", new Object[]{"message_", "messageCase_", LivekitRtc$JoinResponse.class, LivekitRtc$SessionDescription.class, LivekitRtc$SessionDescription.class, LivekitRtc$TrickleRequest.class, LivekitRtc$ParticipantUpdate.class, LivekitRtc$TrackPublishedResponse.class, LivekitRtc$LeaveRequest.class, LivekitRtc$MuteTrackRequest.class, LivekitRtc$SpeakersChanged.class, LivekitRtc$RoomUpdate.class, LivekitRtc$ConnectionQualityUpdate.class, LivekitRtc$StreamStateUpdate.class, LivekitRtc$SubscribedQualityUpdate.class, LivekitRtc$SubscriptionPermissionUpdate.class, LivekitRtc$TrackUnpublishedResponse.class, LivekitRtc$ReconnectResponse.class, LivekitRtc$Pong.class, LivekitRtc$SubscriptionResponse.class});
            case 3:
                return new LivekitRtc$SignalResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SignalResponse.class) {
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

    public LivekitRtc$SessionDescription getAnswer() {
        if (this.messageCase_ == 2) {
            return (LivekitRtc$SessionDescription) this.message_;
        }
        return LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public LivekitRtc$ConnectionQualityUpdate getConnectionQuality() {
        if (this.messageCase_ == 12) {
            return (LivekitRtc$ConnectionQualityUpdate) this.message_;
        }
        return LivekitRtc$ConnectionQualityUpdate.getDefaultInstance();
    }

    public LivekitRtc$JoinResponse getJoin() {
        if (this.messageCase_ == 1) {
            return (LivekitRtc$JoinResponse) this.message_;
        }
        return LivekitRtc$JoinResponse.getDefaultInstance();
    }

    public LivekitRtc$LeaveRequest getLeave() {
        if (this.messageCase_ == 8) {
            return (LivekitRtc$LeaveRequest) this.message_;
        }
        return LivekitRtc$LeaveRequest.getDefaultInstance();
    }

    public EnumC4042l3 getMessageCase() {
        switch (this.messageCase_) {
            case 0:
                return EnumC4042l3.f36497z0;
            case 1:
                return EnumC4042l3.f36477Y;
            case 2:
                return EnumC4042l3.f36478Z;
            case 3:
                return EnumC4042l3.f36479h0;
            case 4:
                return EnumC4042l3.f36480i0;
            case 5:
                return EnumC4042l3.f36481j0;
            case 6:
                return EnumC4042l3.f36482k0;
            case 7:
            default:
                return null;
            case 8:
                return EnumC4042l3.f36483l0;
            case 9:
                return EnumC4042l3.f36484m0;
            case 10:
                return EnumC4042l3.f36485n0;
            case 11:
                return EnumC4042l3.f36486o0;
            case 12:
                return EnumC4042l3.f36487p0;
            case 13:
                return EnumC4042l3.f36488q0;
            case 14:
                return EnumC4042l3.f36489r0;
            case 15:
                return EnumC4042l3.f36490s0;
            case 16:
                return EnumC4042l3.f36491t0;
            case 17:
                return EnumC4042l3.f36492u0;
            case 18:
                return EnumC4042l3.f36493v0;
            case 19:
                return EnumC4042l3.f36494w0;
            case 20:
                return EnumC4042l3.f36495x0;
            case 21:
                return EnumC4042l3.f36496y0;
        }
    }

    public LivekitRtc$MuteTrackRequest getMute() {
        if (this.messageCase_ == 9) {
            return (LivekitRtc$MuteTrackRequest) this.message_;
        }
        return LivekitRtc$MuteTrackRequest.getDefaultInstance();
    }

    public LivekitRtc$SessionDescription getOffer() {
        if (this.messageCase_ == 3) {
            return (LivekitRtc$SessionDescription) this.message_;
        }
        return LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public long getPong() {
        if (this.messageCase_ == 18) {
            return ((Long) this.message_).longValue();
        }
        return 0L;
    }

    public LivekitRtc$Pong getPongResp() {
        if (this.messageCase_ == 20) {
            return (LivekitRtc$Pong) this.message_;
        }
        return LivekitRtc$Pong.getDefaultInstance();
    }

    public LivekitRtc$ReconnectResponse getReconnect() {
        if (this.messageCase_ == 19) {
            return (LivekitRtc$ReconnectResponse) this.message_;
        }
        return LivekitRtc$ReconnectResponse.getDefaultInstance();
    }

    public String getRefreshToken() {
        if (this.messageCase_ == 16) {
            return (String) this.message_;
        }
        return "";
    }

    public AbstractC2534q getRefreshTokenBytes() {
        String str;
        if (this.messageCase_ == 16) {
            str = (String) this.message_;
        } else {
            str = "";
        }
        return AbstractC2534q.y(str);
    }

    public LivekitRtc$RoomUpdate getRoomUpdate() {
        if (this.messageCase_ == 11) {
            return (LivekitRtc$RoomUpdate) this.message_;
        }
        return LivekitRtc$RoomUpdate.getDefaultInstance();
    }

    public LivekitRtc$SpeakersChanged getSpeakersChanged() {
        if (this.messageCase_ == 10) {
            return (LivekitRtc$SpeakersChanged) this.message_;
        }
        return LivekitRtc$SpeakersChanged.getDefaultInstance();
    }

    public LivekitRtc$StreamStateUpdate getStreamStateUpdate() {
        if (this.messageCase_ == 13) {
            return (LivekitRtc$StreamStateUpdate) this.message_;
        }
        return LivekitRtc$StreamStateUpdate.getDefaultInstance();
    }

    public LivekitRtc$SubscribedQualityUpdate getSubscribedQualityUpdate() {
        if (this.messageCase_ == 14) {
            return (LivekitRtc$SubscribedQualityUpdate) this.message_;
        }
        return LivekitRtc$SubscribedQualityUpdate.getDefaultInstance();
    }

    public LivekitRtc$SubscriptionPermissionUpdate getSubscriptionPermissionUpdate() {
        if (this.messageCase_ == 15) {
            return (LivekitRtc$SubscriptionPermissionUpdate) this.message_;
        }
        return LivekitRtc$SubscriptionPermissionUpdate.getDefaultInstance();
    }

    public LivekitRtc$SubscriptionResponse getSubscriptionResponse() {
        if (this.messageCase_ == 21) {
            return (LivekitRtc$SubscriptionResponse) this.message_;
        }
        return LivekitRtc$SubscriptionResponse.getDefaultInstance();
    }

    public LivekitRtc$TrackPublishedResponse getTrackPublished() {
        if (this.messageCase_ == 6) {
            return (LivekitRtc$TrackPublishedResponse) this.message_;
        }
        return LivekitRtc$TrackPublishedResponse.getDefaultInstance();
    }

    public LivekitRtc$TrackUnpublishedResponse getTrackUnpublished() {
        if (this.messageCase_ == 17) {
            return (LivekitRtc$TrackUnpublishedResponse) this.message_;
        }
        return LivekitRtc$TrackUnpublishedResponse.getDefaultInstance();
    }

    public LivekitRtc$TrickleRequest getTrickle() {
        if (this.messageCase_ == 4) {
            return (LivekitRtc$TrickleRequest) this.message_;
        }
        return LivekitRtc$TrickleRequest.getDefaultInstance();
    }

    public LivekitRtc$ParticipantUpdate getUpdate() {
        if (this.messageCase_ == 5) {
            return (LivekitRtc$ParticipantUpdate) this.message_;
        }
        return LivekitRtc$ParticipantUpdate.getDefaultInstance();
    }

    public boolean hasAnswer() {
        if (this.messageCase_ == 2) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionQuality() {
        if (this.messageCase_ == 12) {
            return true;
        }
        return false;
    }

    public boolean hasJoin() {
        if (this.messageCase_ == 1) {
            return true;
        }
        return false;
    }

    public boolean hasLeave() {
        if (this.messageCase_ == 8) {
            return true;
        }
        return false;
    }

    public boolean hasMute() {
        if (this.messageCase_ == 9) {
            return true;
        }
        return false;
    }

    public boolean hasOffer() {
        if (this.messageCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasPong() {
        if (this.messageCase_ == 18) {
            return true;
        }
        return false;
    }

    public boolean hasPongResp() {
        if (this.messageCase_ == 20) {
            return true;
        }
        return false;
    }

    public boolean hasReconnect() {
        if (this.messageCase_ == 19) {
            return true;
        }
        return false;
    }

    public boolean hasRefreshToken() {
        if (this.messageCase_ == 16) {
            return true;
        }
        return false;
    }

    public boolean hasRoomUpdate() {
        if (this.messageCase_ == 11) {
            return true;
        }
        return false;
    }

    public boolean hasSpeakersChanged() {
        if (this.messageCase_ == 10) {
            return true;
        }
        return false;
    }

    public boolean hasStreamStateUpdate() {
        if (this.messageCase_ == 13) {
            return true;
        }
        return false;
    }

    public boolean hasSubscribedQualityUpdate() {
        if (this.messageCase_ == 14) {
            return true;
        }
        return false;
    }

    public boolean hasSubscriptionPermissionUpdate() {
        if (this.messageCase_ == 15) {
            return true;
        }
        return false;
    }

    public boolean hasSubscriptionResponse() {
        if (this.messageCase_ == 21) {
            return true;
        }
        return false;
    }

    public boolean hasTrackPublished() {
        if (this.messageCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasTrackUnpublished() {
        if (this.messageCase_ == 17) {
            return true;
        }
        return false;
    }

    public boolean hasTrickle() {
        if (this.messageCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasUpdate() {
        if (this.messageCase_ == 5) {
            return true;
        }
        return false;
    }

    public static C4037k3 newBuilder(LivekitRtc$SignalResponse livekitRtc$SignalResponse) {
        return (C4037k3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SignalResponse);
    }

    public static LivekitRtc$SignalResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SignalResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SignalResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SignalResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SignalResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SignalResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SignalResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
