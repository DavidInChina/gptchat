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
import jh.B3;
import jh.C3987a3;
import jh.C4022h3;
import jh.C4027i3;
import jh.C4052n3;
import jh.E3;
import jh.EnumC4032j3;
import jh.K3;
import jh.L3;
import jh.M3;
import jh.N2;
import jh.N3;
import jh.O3;
import jh.X2;
import jh.Y2;

/* loaded from: classes2.dex */
public final class LivekitRtc$SignalRequest extends AbstractC2497d0 implements N0 {
    public static final int ADD_TRACK_FIELD_NUMBER = 4;
    public static final int ANSWER_FIELD_NUMBER = 2;
    private static final LivekitRtc$SignalRequest DEFAULT_INSTANCE;
    public static final int LEAVE_FIELD_NUMBER = 8;
    public static final int MUTE_FIELD_NUMBER = 5;
    public static final int OFFER_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PING_FIELD_NUMBER = 14;
    public static final int PING_REQ_FIELD_NUMBER = 16;
    public static final int SIMULATE_FIELD_NUMBER = 13;
    public static final int SUBSCRIPTION_FIELD_NUMBER = 6;
    public static final int SUBSCRIPTION_PERMISSION_FIELD_NUMBER = 11;
    public static final int SYNC_STATE_FIELD_NUMBER = 12;
    public static final int TRACK_SETTING_FIELD_NUMBER = 7;
    public static final int TRICKLE_FIELD_NUMBER = 3;
    public static final int UPDATE_LAYERS_FIELD_NUMBER = 10;
    public static final int UPDATE_METADATA_FIELD_NUMBER = 15;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitRtc$SignalRequest livekitRtc$SignalRequest = new LivekitRtc$SignalRequest();
        DEFAULT_INSTANCE = livekitRtc$SignalRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SignalRequest.class, livekitRtc$SignalRequest);
    }

    private LivekitRtc$SignalRequest() {
    }

    public static /* synthetic */ void access$200(LivekitRtc$SignalRequest livekitRtc$SignalRequest, LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SignalRequest.setOffer(livekitRtc$SessionDescription);
    }

    public void clearAddTrack() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearAnswer() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearLeave() {
        if (this.messageCase_ == 8) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearMessage() {
        this.messageCase_ = 0;
        this.message_ = null;
    }

    public void clearMute() {
        if (this.messageCase_ == 5) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearOffer() {
        if (this.messageCase_ == 1) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearPing() {
        if (this.messageCase_ == 14) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearPingReq() {
        if (this.messageCase_ == 16) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearSimulate() {
        if (this.messageCase_ == 13) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearSubscription() {
        if (this.messageCase_ == 6) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearSubscriptionPermission() {
        if (this.messageCase_ == 11) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearSyncState() {
        if (this.messageCase_ == 12) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearTrackSetting() {
        if (this.messageCase_ == 7) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearTrickle() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearUpdateLayers() {
        if (this.messageCase_ == 10) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public void clearUpdateMetadata() {
        if (this.messageCase_ == 15) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitRtc$SignalRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeAddTrack(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest) {
        livekitRtc$AddTrackRequest.getClass();
        if (this.messageCase_ == 4 && this.message_ != LivekitRtc$AddTrackRequest.getDefaultInstance()) {
            N2 newBuilder = LivekitRtc$AddTrackRequest.newBuilder((LivekitRtc$AddTrackRequest) this.message_);
            newBuilder.f(livekitRtc$AddTrackRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$AddTrackRequest;
        }
        this.messageCase_ = 4;
    }

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

    public void mergeMute(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        livekitRtc$MuteTrackRequest.getClass();
        if (this.messageCase_ == 5 && this.message_ != LivekitRtc$MuteTrackRequest.getDefaultInstance()) {
            Y2 newBuilder = LivekitRtc$MuteTrackRequest.newBuilder((LivekitRtc$MuteTrackRequest) this.message_);
            newBuilder.f(livekitRtc$MuteTrackRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$MuteTrackRequest;
        }
        this.messageCase_ = 5;
    }

    public void mergeOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        if (this.messageCase_ == 1 && this.message_ != LivekitRtc$SessionDescription.getDefaultInstance()) {
            C4022h3 newBuilder = LivekitRtc$SessionDescription.newBuilder((LivekitRtc$SessionDescription) this.message_);
            newBuilder.f(livekitRtc$SessionDescription);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SessionDescription;
        }
        this.messageCase_ = 1;
    }

    public void mergePingReq(LivekitRtc$Ping livekitRtc$Ping) {
        livekitRtc$Ping.getClass();
        if (this.messageCase_ == 16 && this.message_ != LivekitRtc$Ping.getDefaultInstance()) {
            C3987a3 newBuilder = LivekitRtc$Ping.newBuilder((LivekitRtc$Ping) this.message_);
            newBuilder.f(livekitRtc$Ping);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$Ping;
        }
        this.messageCase_ = 16;
    }

    public void mergeSimulate(LivekitRtc$SimulateScenario livekitRtc$SimulateScenario) {
        livekitRtc$SimulateScenario.getClass();
        if (this.messageCase_ == 13 && this.message_ != LivekitRtc$SimulateScenario.getDefaultInstance()) {
            C4052n3 newBuilder = LivekitRtc$SimulateScenario.newBuilder((LivekitRtc$SimulateScenario) this.message_);
            newBuilder.f(livekitRtc$SimulateScenario);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SimulateScenario;
        }
        this.messageCase_ = 13;
    }

    public void mergeSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        if (this.messageCase_ == 6 && this.message_ != LivekitRtc$UpdateSubscription.getDefaultInstance()) {
            M3 newBuilder = LivekitRtc$UpdateSubscription.newBuilder((LivekitRtc$UpdateSubscription) this.message_);
            newBuilder.f(livekitRtc$UpdateSubscription);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$UpdateSubscription;
        }
        this.messageCase_ = 6;
    }

    public void mergeSubscriptionPermission(LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission) {
        livekitRtc$SubscriptionPermission.getClass();
        if (this.messageCase_ == 11 && this.message_ != LivekitRtc$SubscriptionPermission.getDefaultInstance()) {
            B3 newBuilder = LivekitRtc$SubscriptionPermission.newBuilder((LivekitRtc$SubscriptionPermission) this.message_);
            newBuilder.f(livekitRtc$SubscriptionPermission);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SubscriptionPermission;
        }
        this.messageCase_ = 11;
    }

    public void mergeSyncState(LivekitRtc$SyncState livekitRtc$SyncState) {
        livekitRtc$SyncState.getClass();
        if (this.messageCase_ == 12 && this.message_ != LivekitRtc$SyncState.getDefaultInstance()) {
            E3 newBuilder = LivekitRtc$SyncState.newBuilder((LivekitRtc$SyncState) this.message_);
            newBuilder.f(livekitRtc$SyncState);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SyncState;
        }
        this.messageCase_ = 12;
    }

    public void mergeTrackSetting(LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings) {
        livekitRtc$UpdateTrackSettings.getClass();
        if (this.messageCase_ == 7 && this.message_ != LivekitRtc$UpdateTrackSettings.getDefaultInstance()) {
            N3 newBuilder = LivekitRtc$UpdateTrackSettings.newBuilder((LivekitRtc$UpdateTrackSettings) this.message_);
            newBuilder.f(livekitRtc$UpdateTrackSettings);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$UpdateTrackSettings;
        }
        this.messageCase_ = 7;
    }

    public void mergeTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        if (this.messageCase_ == 3 && this.message_ != LivekitRtc$TrickleRequest.getDefaultInstance()) {
            K3 newBuilder = LivekitRtc$TrickleRequest.newBuilder((LivekitRtc$TrickleRequest) this.message_);
            newBuilder.f(livekitRtc$TrickleRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$TrickleRequest;
        }
        this.messageCase_ = 3;
    }

    public void mergeUpdateLayers(LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers) {
        livekitRtc$UpdateVideoLayers.getClass();
        if (this.messageCase_ == 10 && this.message_ != LivekitRtc$UpdateVideoLayers.getDefaultInstance()) {
            O3 newBuilder = LivekitRtc$UpdateVideoLayers.newBuilder((LivekitRtc$UpdateVideoLayers) this.message_);
            newBuilder.f(livekitRtc$UpdateVideoLayers);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$UpdateVideoLayers;
        }
        this.messageCase_ = 10;
    }

    public void mergeUpdateMetadata(LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata) {
        livekitRtc$UpdateParticipantMetadata.getClass();
        if (this.messageCase_ == 15 && this.message_ != LivekitRtc$UpdateParticipantMetadata.getDefaultInstance()) {
            L3 newBuilder = LivekitRtc$UpdateParticipantMetadata.newBuilder((LivekitRtc$UpdateParticipantMetadata) this.message_);
            newBuilder.f(livekitRtc$UpdateParticipantMetadata);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$UpdateParticipantMetadata;
        }
        this.messageCase_ = 15;
    }

    public static C4027i3 newBuilder() {
        return (C4027i3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SignalRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setAddTrack(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest) {
        livekitRtc$AddTrackRequest.getClass();
        this.message_ = livekitRtc$AddTrackRequest;
        this.messageCase_ = 4;
    }

    public void setAnswer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 2;
    }

    public void setLeave(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        livekitRtc$LeaveRequest.getClass();
        this.message_ = livekitRtc$LeaveRequest;
        this.messageCase_ = 8;
    }

    public void setMute(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        livekitRtc$MuteTrackRequest.getClass();
        this.message_ = livekitRtc$MuteTrackRequest;
        this.messageCase_ = 5;
    }

    public void setOffer(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        livekitRtc$SessionDescription.getClass();
        this.message_ = livekitRtc$SessionDescription;
        this.messageCase_ = 1;
    }

    public void setPing(long j6) {
        this.messageCase_ = 14;
        this.message_ = Long.valueOf(j6);
    }

    public void setPingReq(LivekitRtc$Ping livekitRtc$Ping) {
        livekitRtc$Ping.getClass();
        this.message_ = livekitRtc$Ping;
        this.messageCase_ = 16;
    }

    public void setSimulate(LivekitRtc$SimulateScenario livekitRtc$SimulateScenario) {
        livekitRtc$SimulateScenario.getClass();
        this.message_ = livekitRtc$SimulateScenario;
        this.messageCase_ = 13;
    }

    public void setSubscription(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        livekitRtc$UpdateSubscription.getClass();
        this.message_ = livekitRtc$UpdateSubscription;
        this.messageCase_ = 6;
    }

    public void setSubscriptionPermission(LivekitRtc$SubscriptionPermission livekitRtc$SubscriptionPermission) {
        livekitRtc$SubscriptionPermission.getClass();
        this.message_ = livekitRtc$SubscriptionPermission;
        this.messageCase_ = 11;
    }

    public void setSyncState(LivekitRtc$SyncState livekitRtc$SyncState) {
        livekitRtc$SyncState.getClass();
        this.message_ = livekitRtc$SyncState;
        this.messageCase_ = 12;
    }

    public void setTrackSetting(LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings) {
        livekitRtc$UpdateTrackSettings.getClass();
        this.message_ = livekitRtc$UpdateTrackSettings;
        this.messageCase_ = 7;
    }

    public void setTrickle(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        livekitRtc$TrickleRequest.getClass();
        this.message_ = livekitRtc$TrickleRequest;
        this.messageCase_ = 3;
    }

    public void setUpdateLayers(LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers) {
        livekitRtc$UpdateVideoLayers.getClass();
        this.message_ = livekitRtc$UpdateVideoLayers;
        this.messageCase_ = 10;
    }

    public void setUpdateMetadata(LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata) {
        livekitRtc$UpdateParticipantMetadata.getClass();
        this.message_ = livekitRtc$UpdateParticipantMetadata;
        this.messageCase_ = 15;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0001\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e5\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"message_", "messageCase_", LivekitRtc$SessionDescription.class, LivekitRtc$SessionDescription.class, LivekitRtc$TrickleRequest.class, LivekitRtc$AddTrackRequest.class, LivekitRtc$MuteTrackRequest.class, LivekitRtc$UpdateSubscription.class, LivekitRtc$UpdateTrackSettings.class, LivekitRtc$LeaveRequest.class, LivekitRtc$UpdateVideoLayers.class, LivekitRtc$SubscriptionPermission.class, LivekitRtc$SyncState.class, LivekitRtc$SimulateScenario.class, LivekitRtc$UpdateParticipantMetadata.class, LivekitRtc$Ping.class});
            case 3:
                return new LivekitRtc$SignalRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SignalRequest.class) {
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

    public LivekitRtc$AddTrackRequest getAddTrack() {
        if (this.messageCase_ == 4) {
            return (LivekitRtc$AddTrackRequest) this.message_;
        }
        return LivekitRtc$AddTrackRequest.getDefaultInstance();
    }

    public LivekitRtc$SessionDescription getAnswer() {
        if (this.messageCase_ == 2) {
            return (LivekitRtc$SessionDescription) this.message_;
        }
        return LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public LivekitRtc$LeaveRequest getLeave() {
        if (this.messageCase_ == 8) {
            return (LivekitRtc$LeaveRequest) this.message_;
        }
        return LivekitRtc$LeaveRequest.getDefaultInstance();
    }

    public EnumC4032j3 getMessageCase() {
        switch (this.messageCase_) {
            case 0:
                return EnumC4032j3.f36465u0;
            case 1:
                return EnumC4032j3.f36450Y;
            case 2:
                return EnumC4032j3.f36451Z;
            case 3:
                return EnumC4032j3.f36452h0;
            case 4:
                return EnumC4032j3.f36453i0;
            case 5:
                return EnumC4032j3.f36454j0;
            case 6:
                return EnumC4032j3.f36455k0;
            case 7:
                return EnumC4032j3.f36456l0;
            case 8:
                return EnumC4032j3.f36457m0;
            case 9:
            default:
                return null;
            case 10:
                return EnumC4032j3.f36458n0;
            case 11:
                return EnumC4032j3.f36459o0;
            case 12:
                return EnumC4032j3.f36460p0;
            case 13:
                return EnumC4032j3.f36461q0;
            case 14:
                return EnumC4032j3.f36462r0;
            case 15:
                return EnumC4032j3.f36463s0;
            case 16:
                return EnumC4032j3.f36464t0;
        }
    }

    public LivekitRtc$MuteTrackRequest getMute() {
        if (this.messageCase_ == 5) {
            return (LivekitRtc$MuteTrackRequest) this.message_;
        }
        return LivekitRtc$MuteTrackRequest.getDefaultInstance();
    }

    public LivekitRtc$SessionDescription getOffer() {
        if (this.messageCase_ == 1) {
            return (LivekitRtc$SessionDescription) this.message_;
        }
        return LivekitRtc$SessionDescription.getDefaultInstance();
    }

    public long getPing() {
        if (this.messageCase_ == 14) {
            return ((Long) this.message_).longValue();
        }
        return 0L;
    }

    public LivekitRtc$Ping getPingReq() {
        if (this.messageCase_ == 16) {
            return (LivekitRtc$Ping) this.message_;
        }
        return LivekitRtc$Ping.getDefaultInstance();
    }

    public LivekitRtc$SimulateScenario getSimulate() {
        if (this.messageCase_ == 13) {
            return (LivekitRtc$SimulateScenario) this.message_;
        }
        return LivekitRtc$SimulateScenario.getDefaultInstance();
    }

    public LivekitRtc$UpdateSubscription getSubscription() {
        if (this.messageCase_ == 6) {
            return (LivekitRtc$UpdateSubscription) this.message_;
        }
        return LivekitRtc$UpdateSubscription.getDefaultInstance();
    }

    public LivekitRtc$SubscriptionPermission getSubscriptionPermission() {
        if (this.messageCase_ == 11) {
            return (LivekitRtc$SubscriptionPermission) this.message_;
        }
        return LivekitRtc$SubscriptionPermission.getDefaultInstance();
    }

    public LivekitRtc$SyncState getSyncState() {
        if (this.messageCase_ == 12) {
            return (LivekitRtc$SyncState) this.message_;
        }
        return LivekitRtc$SyncState.getDefaultInstance();
    }

    public LivekitRtc$UpdateTrackSettings getTrackSetting() {
        if (this.messageCase_ == 7) {
            return (LivekitRtc$UpdateTrackSettings) this.message_;
        }
        return LivekitRtc$UpdateTrackSettings.getDefaultInstance();
    }

    public LivekitRtc$TrickleRequest getTrickle() {
        if (this.messageCase_ == 3) {
            return (LivekitRtc$TrickleRequest) this.message_;
        }
        return LivekitRtc$TrickleRequest.getDefaultInstance();
    }

    public LivekitRtc$UpdateVideoLayers getUpdateLayers() {
        if (this.messageCase_ == 10) {
            return (LivekitRtc$UpdateVideoLayers) this.message_;
        }
        return LivekitRtc$UpdateVideoLayers.getDefaultInstance();
    }

    public LivekitRtc$UpdateParticipantMetadata getUpdateMetadata() {
        if (this.messageCase_ == 15) {
            return (LivekitRtc$UpdateParticipantMetadata) this.message_;
        }
        return LivekitRtc$UpdateParticipantMetadata.getDefaultInstance();
    }

    public boolean hasAddTrack() {
        if (this.messageCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasAnswer() {
        if (this.messageCase_ == 2) {
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
        if (this.messageCase_ == 5) {
            return true;
        }
        return false;
    }

    public boolean hasOffer() {
        if (this.messageCase_ == 1) {
            return true;
        }
        return false;
    }

    public boolean hasPing() {
        if (this.messageCase_ == 14) {
            return true;
        }
        return false;
    }

    public boolean hasPingReq() {
        if (this.messageCase_ == 16) {
            return true;
        }
        return false;
    }

    public boolean hasSimulate() {
        if (this.messageCase_ == 13) {
            return true;
        }
        return false;
    }

    public boolean hasSubscription() {
        if (this.messageCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasSubscriptionPermission() {
        if (this.messageCase_ == 11) {
            return true;
        }
        return false;
    }

    public boolean hasSyncState() {
        if (this.messageCase_ == 12) {
            return true;
        }
        return false;
    }

    public boolean hasTrackSetting() {
        if (this.messageCase_ == 7) {
            return true;
        }
        return false;
    }

    public boolean hasTrickle() {
        if (this.messageCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasUpdateLayers() {
        if (this.messageCase_ == 10) {
            return true;
        }
        return false;
    }

    public boolean hasUpdateMetadata() {
        if (this.messageCase_ == 15) {
            return true;
        }
        return false;
    }

    public static C4027i3 newBuilder(LivekitRtc$SignalRequest livekitRtc$SignalRequest) {
        return (C4027i3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SignalRequest);
    }

    public static LivekitRtc$SignalRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SignalRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SignalRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SignalRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SignalRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SignalRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SignalRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SignalRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
