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
import jh.C3991b2;
import jh.C4041l2;
import jh.L;
import jh.Q1;
import jh.U0;
import jh.n4;

/* loaded from: classes.dex */
public final class LivekitWebhook$WebhookEvent extends AbstractC2497d0 implements N0 {
    public static final int CREATED_AT_FIELD_NUMBER = 7;
    private static final LivekitWebhook$WebhookEvent DEFAULT_INSTANCE;
    public static final int EGRESS_INFO_FIELD_NUMBER = 9;
    public static final int EVENT_FIELD_NUMBER = 1;
    public static final int ID_FIELD_NUMBER = 6;
    public static final int INGRESS_INFO_FIELD_NUMBER = 10;
    public static final int NUM_DROPPED_FIELD_NUMBER = 11;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 3;
    public static final int ROOM_FIELD_NUMBER = 2;
    public static final int TRACK_FIELD_NUMBER = 8;
    private long createdAt_;
    private LivekitEgress$EgressInfo egressInfo_;
    private String event_ = "";
    private String id_ = "";
    private LivekitIngress$IngressInfo ingressInfo_;
    private int numDropped_;
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$Room room_;
    private LivekitModels$TrackInfo track_;

    static {
        LivekitWebhook$WebhookEvent livekitWebhook$WebhookEvent = new LivekitWebhook$WebhookEvent();
        DEFAULT_INSTANCE = livekitWebhook$WebhookEvent;
        AbstractC2497d0.registerDefaultInstance(LivekitWebhook$WebhookEvent.class, livekitWebhook$WebhookEvent);
    }

    private LivekitWebhook$WebhookEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedAt() {
        this.createdAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressInfo() {
        this.egressInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = getDefaultInstance().getEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressInfo() {
        this.ingressInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumDropped() {
        this.numDropped_ = 0;
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
    public void clearTrack() {
        this.track_ = null;
    }

    public static LivekitWebhook$WebhookEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEgressInfo(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        LivekitEgress$EgressInfo livekitEgress$EgressInfo2 = this.egressInfo_;
        if (livekitEgress$EgressInfo2 != null && livekitEgress$EgressInfo2 != LivekitEgress$EgressInfo.getDefaultInstance()) {
            L newBuilder = LivekitEgress$EgressInfo.newBuilder(this.egressInfo_);
            newBuilder.f(livekitEgress$EgressInfo);
            this.egressInfo_ = (LivekitEgress$EgressInfo) newBuilder.c();
            return;
        }
        this.egressInfo_ = livekitEgress$EgressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIngressInfo(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        LivekitIngress$IngressInfo livekitIngress$IngressInfo2 = this.ingressInfo_;
        if (livekitIngress$IngressInfo2 != null && livekitIngress$IngressInfo2 != LivekitIngress$IngressInfo.getDefaultInstance()) {
            U0 newBuilder = LivekitIngress$IngressInfo.newBuilder(this.ingressInfo_);
            newBuilder.f(livekitIngress$IngressInfo);
            this.ingressInfo_ = (LivekitIngress$IngressInfo) newBuilder.c();
            return;
        }
        this.ingressInfo_ = livekitIngress$IngressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.participant_;
        if (livekitModels$ParticipantInfo2 != null && livekitModels$ParticipantInfo2 != LivekitModels$ParticipantInfo.getDefaultInstance()) {
            Q1 newBuilder = LivekitModels$ParticipantInfo.newBuilder(this.participant_);
            newBuilder.f(livekitModels$ParticipantInfo);
            this.participant_ = (LivekitModels$ParticipantInfo) newBuilder.c();
            return;
        }
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 != null && livekitModels$Room2 != LivekitModels$Room.getDefaultInstance()) {
            C3991b2 newBuilder = LivekitModels$Room.newBuilder(this.room_);
            newBuilder.f(livekitModels$Room);
            this.room_ = (LivekitModels$Room) newBuilder.c();
            return;
        }
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        LivekitModels$TrackInfo livekitModels$TrackInfo2 = this.track_;
        if (livekitModels$TrackInfo2 != null && livekitModels$TrackInfo2 != LivekitModels$TrackInfo.getDefaultInstance()) {
            C4041l2 newBuilder = LivekitModels$TrackInfo.newBuilder(this.track_);
            newBuilder.f(livekitModels$TrackInfo);
            this.track_ = (LivekitModels$TrackInfo) newBuilder.c();
            return;
        }
        this.track_ = livekitModels$TrackInfo;
    }

    public static n4 newBuilder() {
        return (n4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitWebhook$WebhookEvent parseDelimitedFrom(InputStream inputStream) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(ByteBuffer byteBuffer) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedAt(long j6) {
        this.createdAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressInfo(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        this.egressInfo_ = livekitEgress$EgressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(String str) {
        str.getClass();
        this.event_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.event_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.id_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressInfo(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        this.ingressInfo_ = livekitIngress$IngressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumDropped(int i10) {
        this.numDropped_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        this.track_ = livekitModels$TrackInfo;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\u000b\t\u0000\u0000\u0000\u0001\u0208\u0002\t\u0003\t\u0006\u0208\u0007\u0002\b\t\t\t\n\t\u000b\u0004", new Object[]{"event_", "room_", "participant_", "id_", "createdAt_", "track_", "egressInfo_", "ingressInfo_", "numDropped_"});
            case 3:
                return new LivekitWebhook$WebhookEvent();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitWebhook$WebhookEvent.class) {
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

    public long getCreatedAt() {
        return this.createdAt_;
    }

    public LivekitEgress$EgressInfo getEgressInfo() {
        LivekitEgress$EgressInfo livekitEgress$EgressInfo = this.egressInfo_;
        if (livekitEgress$EgressInfo == null) {
            return LivekitEgress$EgressInfo.getDefaultInstance();
        }
        return livekitEgress$EgressInfo;
    }

    public String getEvent() {
        return this.event_;
    }

    public AbstractC2534q getEventBytes() {
        return AbstractC2534q.y(this.event_);
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC2534q getIdBytes() {
        return AbstractC2534q.y(this.id_);
    }

    public LivekitIngress$IngressInfo getIngressInfo() {
        LivekitIngress$IngressInfo livekitIngress$IngressInfo = this.ingressInfo_;
        if (livekitIngress$IngressInfo == null) {
            return LivekitIngress$IngressInfo.getDefaultInstance();
        }
        return livekitIngress$IngressInfo;
    }

    public int getNumDropped() {
        return this.numDropped_;
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        if (livekitModels$ParticipantInfo == null) {
            return LivekitModels$ParticipantInfo.getDefaultInstance();
        }
        return livekitModels$ParticipantInfo;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        if (livekitModels$Room == null) {
            return LivekitModels$Room.getDefaultInstance();
        }
        return livekitModels$Room;
    }

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        if (livekitModels$TrackInfo == null) {
            return LivekitModels$TrackInfo.getDefaultInstance();
        }
        return livekitModels$TrackInfo;
    }

    public boolean hasEgressInfo() {
        if (this.egressInfo_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasIngressInfo() {
        if (this.ingressInfo_ != null) {
            return true;
        }
        return false;
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

    public boolean hasTrack() {
        if (this.track_ != null) {
            return true;
        }
        return false;
    }

    public static n4 newBuilder(LivekitWebhook$WebhookEvent livekitWebhook$WebhookEvent) {
        return (n4) DEFAULT_INSTANCE.createBuilder(livekitWebhook$WebhookEvent);
    }

    public static LivekitWebhook$WebhookEvent parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(byte[] bArr) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(byte[] bArr, J j6) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(InputStream inputStream) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(InputStream inputStream, J j6) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitWebhook$WebhookEvent parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitWebhook$WebhookEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
