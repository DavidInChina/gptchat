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
import jh.C3977E;
import jh.C3979G;
import jh.C4079t1;
import jh.W1;

/* loaded from: classes2.dex */
public final class LivekitInternal$RoomInternal extends AbstractC2497d0 implements N0 {
    private static final LivekitInternal$RoomInternal DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_EGRESS_FIELD_NUMBER = 2;
    public static final int PLAYOUT_DELAY_FIELD_NUMBER = 3;
    public static final int SYNC_STREAMS_FIELD_NUMBER = 4;
    public static final int TRACK_EGRESS_FIELD_NUMBER = 1;
    private LivekitEgress$AutoParticipantEgress participantEgress_;
    private LivekitModels$PlayoutDelay playoutDelay_;
    private boolean syncStreams_;
    private LivekitEgress$AutoTrackEgress trackEgress_;

    static {
        LivekitInternal$RoomInternal livekitInternal$RoomInternal = new LivekitInternal$RoomInternal();
        DEFAULT_INSTANCE = livekitInternal$RoomInternal;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$RoomInternal.class, livekitInternal$RoomInternal);
    }

    private LivekitInternal$RoomInternal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantEgress() {
        this.participantEgress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayoutDelay() {
        this.playoutDelay_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncStreams() {
        this.syncStreams_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackEgress() {
        this.trackEgress_ = null;
    }

    public static LivekitInternal$RoomInternal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipantEgress(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress2 = this.participantEgress_;
        if (livekitEgress$AutoParticipantEgress2 != null && livekitEgress$AutoParticipantEgress2 != LivekitEgress$AutoParticipantEgress.getDefaultInstance()) {
            C3977E newBuilder = LivekitEgress$AutoParticipantEgress.newBuilder(this.participantEgress_);
            newBuilder.f(livekitEgress$AutoParticipantEgress);
            this.participantEgress_ = (LivekitEgress$AutoParticipantEgress) newBuilder.c();
            return;
        }
        this.participantEgress_ = livekitEgress$AutoParticipantEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePlayoutDelay(LivekitModels$PlayoutDelay livekitModels$PlayoutDelay) {
        livekitModels$PlayoutDelay.getClass();
        LivekitModels$PlayoutDelay livekitModels$PlayoutDelay2 = this.playoutDelay_;
        if (livekitModels$PlayoutDelay2 != null && livekitModels$PlayoutDelay2 != LivekitModels$PlayoutDelay.getDefaultInstance()) {
            W1 newBuilder = LivekitModels$PlayoutDelay.newBuilder(this.playoutDelay_);
            newBuilder.f(livekitModels$PlayoutDelay);
            this.playoutDelay_ = (LivekitModels$PlayoutDelay) newBuilder.c();
            return;
        }
        this.playoutDelay_ = livekitModels$PlayoutDelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackEgress(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress2 = this.trackEgress_;
        if (livekitEgress$AutoTrackEgress2 != null && livekitEgress$AutoTrackEgress2 != LivekitEgress$AutoTrackEgress.getDefaultInstance()) {
            C3979G newBuilder = LivekitEgress$AutoTrackEgress.newBuilder(this.trackEgress_);
            newBuilder.f(livekitEgress$AutoTrackEgress);
            this.trackEgress_ = (LivekitEgress$AutoTrackEgress) newBuilder.c();
            return;
        }
        this.trackEgress_ = livekitEgress$AutoTrackEgress;
    }

    public static C4079t1 newBuilder() {
        return (C4079t1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$RoomInternal parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RoomInternal parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantEgress(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        this.participantEgress_ = livekitEgress$AutoParticipantEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayoutDelay(LivekitModels$PlayoutDelay livekitModels$PlayoutDelay) {
        livekitModels$PlayoutDelay.getClass();
        this.playoutDelay_ = livekitModels$PlayoutDelay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncStreams(boolean z10) {
        this.syncStreams_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackEgress(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        this.trackEgress_ = livekitEgress$AutoTrackEgress;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\u0007", new Object[]{"trackEgress_", "participantEgress_", "playoutDelay_", "syncStreams_"});
            case 3:
                return new LivekitInternal$RoomInternal();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$RoomInternal.class) {
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

    public LivekitEgress$AutoParticipantEgress getParticipantEgress() {
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress = this.participantEgress_;
        if (livekitEgress$AutoParticipantEgress == null) {
            return LivekitEgress$AutoParticipantEgress.getDefaultInstance();
        }
        return livekitEgress$AutoParticipantEgress;
    }

    public LivekitModels$PlayoutDelay getPlayoutDelay() {
        LivekitModels$PlayoutDelay livekitModels$PlayoutDelay = this.playoutDelay_;
        if (livekitModels$PlayoutDelay == null) {
            return LivekitModels$PlayoutDelay.getDefaultInstance();
        }
        return livekitModels$PlayoutDelay;
    }

    public boolean getSyncStreams() {
        return this.syncStreams_;
    }

    public LivekitEgress$AutoTrackEgress getTrackEgress() {
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress = this.trackEgress_;
        if (livekitEgress$AutoTrackEgress == null) {
            return LivekitEgress$AutoTrackEgress.getDefaultInstance();
        }
        return livekitEgress$AutoTrackEgress;
    }

    public boolean hasParticipantEgress() {
        if (this.participantEgress_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasPlayoutDelay() {
        if (this.playoutDelay_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasTrackEgress() {
        if (this.trackEgress_ != null) {
            return true;
        }
        return false;
    }

    public static C4079t1 newBuilder(LivekitInternal$RoomInternal livekitInternal$RoomInternal) {
        return (C4079t1) DEFAULT_INSTANCE.createBuilder(livekitInternal$RoomInternal);
    }

    public static LivekitInternal$RoomInternal parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$RoomInternal parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$RoomInternal parseFrom(byte[] bArr) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$RoomInternal parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$RoomInternal parseFrom(InputStream inputStream) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RoomInternal parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$RoomInternal parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$RoomInternal) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
