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
import jh.C4034k0;
import jh.F2;

/* loaded from: classes2.dex */
public final class LivekitRoom$RoomEgress extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$RoomEgress DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 3;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int TRACKS_FIELD_NUMBER = 2;
    private LivekitEgress$AutoParticipantEgress participant_;
    private LivekitEgress$RoomCompositeEgressRequest room_;
    private LivekitEgress$AutoTrackEgress tracks_;

    static {
        LivekitRoom$RoomEgress livekitRoom$RoomEgress = new LivekitRoom$RoomEgress();
        DEFAULT_INSTANCE = livekitRoom$RoomEgress;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$RoomEgress.class, livekitRoom$RoomEgress);
    }

    private LivekitRoom$RoomEgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTracks() {
        this.tracks_ = null;
    }

    public static LivekitRoom$RoomEgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress2 = this.participant_;
        if (livekitEgress$AutoParticipantEgress2 != null && livekitEgress$AutoParticipantEgress2 != LivekitEgress$AutoParticipantEgress.getDefaultInstance()) {
            C3977E newBuilder = LivekitEgress$AutoParticipantEgress.newBuilder(this.participant_);
            newBuilder.f(livekitEgress$AutoParticipantEgress);
            this.participant_ = (LivekitEgress$AutoParticipantEgress) newBuilder.c();
            return;
        }
        this.participant_ = livekitEgress$AutoParticipantEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest2 = this.room_;
        if (livekitEgress$RoomCompositeEgressRequest2 != null && livekitEgress$RoomCompositeEgressRequest2 != LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance()) {
            C4034k0 newBuilder = LivekitEgress$RoomCompositeEgressRequest.newBuilder(this.room_);
            newBuilder.f(livekitEgress$RoomCompositeEgressRequest);
            this.room_ = (LivekitEgress$RoomCompositeEgressRequest) newBuilder.c();
            return;
        }
        this.room_ = livekitEgress$RoomCompositeEgressRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTracks(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress2 = this.tracks_;
        if (livekitEgress$AutoTrackEgress2 != null && livekitEgress$AutoTrackEgress2 != LivekitEgress$AutoTrackEgress.getDefaultInstance()) {
            C3979G newBuilder = LivekitEgress$AutoTrackEgress.newBuilder(this.tracks_);
            newBuilder.f(livekitEgress$AutoTrackEgress);
            this.tracks_ = (LivekitEgress$AutoTrackEgress) newBuilder.c();
            return;
        }
        this.tracks_ = livekitEgress$AutoTrackEgress;
    }

    public static F2 newBuilder() {
        return (F2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$RoomEgress parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomEgress parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        livekitEgress$AutoParticipantEgress.getClass();
        this.participant_ = livekitEgress$AutoParticipantEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        this.room_ = livekitEgress$RoomCompositeEgressRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress) {
        livekitEgress$AutoTrackEgress.getClass();
        this.tracks_ = livekitEgress$AutoTrackEgress;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"room_", "tracks_", "participant_"});
            case 3:
                return new LivekitRoom$RoomEgress();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$RoomEgress.class) {
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

    public LivekitEgress$AutoParticipantEgress getParticipant() {
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress = this.participant_;
        if (livekitEgress$AutoParticipantEgress == null) {
            return LivekitEgress$AutoParticipantEgress.getDefaultInstance();
        }
        return livekitEgress$AutoParticipantEgress;
    }

    public LivekitEgress$RoomCompositeEgressRequest getRoom() {
        LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest = this.room_;
        if (livekitEgress$RoomCompositeEgressRequest == null) {
            return LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance();
        }
        return livekitEgress$RoomCompositeEgressRequest;
    }

    public LivekitEgress$AutoTrackEgress getTracks() {
        LivekitEgress$AutoTrackEgress livekitEgress$AutoTrackEgress = this.tracks_;
        if (livekitEgress$AutoTrackEgress == null) {
            return LivekitEgress$AutoTrackEgress.getDefaultInstance();
        }
        return livekitEgress$AutoTrackEgress;
    }

    public boolean hasParticipant() {
        if (this.participant_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasRoom() {
        if (this.room_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasTracks() {
        if (this.tracks_ != null) {
            return true;
        }
        return false;
    }

    public static F2 newBuilder(LivekitRoom$RoomEgress livekitRoom$RoomEgress) {
        return (F2) DEFAULT_INSTANCE.createBuilder(livekitRoom$RoomEgress);
    }

    public static LivekitRoom$RoomEgress parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$RoomEgress parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$RoomEgress parseFrom(byte[] bArr) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$RoomEgress parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$RoomEgress parseFrom(InputStream inputStream) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomEgress parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$RoomEgress parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$RoomEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
