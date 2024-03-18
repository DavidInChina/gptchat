package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.Timestamp;
import com.google.protobuf.X;
import com.google.protobuf.q1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.AbstractC4072s;
import jh.B1;
import jh.C3991b2;
import jh.C4041l2;
import jh.C4063q;
import jh.EnumC4077t;
import jh.EnumC4085u2;
import jh.L;
import jh.Q1;
import jh.U0;
import jh.Y1;
import jh.r;

/* loaded from: classes.dex */
public final class LivekitAnalytics$AnalyticsEvent extends AbstractC2497d0 implements AbstractC4072s {
    public static final int ANALYTICS_KEY_FIELD_NUMBER = 10;
    public static final int CLIENT_INFO_FIELD_NUMBER = 11;
    public static final int CLIENT_META_FIELD_NUMBER = 12;
    private static final LivekitAnalytics$AnalyticsEvent DEFAULT_INSTANCE;
    public static final int EGRESS_FIELD_NUMBER = 17;
    public static final int EGRESS_ID_FIELD_NUMBER = 13;
    public static final int ERROR_FIELD_NUMBER = 20;
    public static final int INGRESS_FIELD_NUMBER = 18;
    public static final int INGRESS_ID_FIELD_NUMBER = 19;
    public static final int MAX_SUBSCRIBED_VIDEO_QUALITY_FIELD_NUMBER = 14;
    public static final int MIME_FIELD_NUMBER = 16;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 6;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 5;
    public static final int PUBLISHER_FIELD_NUMBER = 15;
    public static final int ROOM_FIELD_NUMBER = 4;
    public static final int ROOM_ID_FIELD_NUMBER = 3;
    public static final int RTP_STATS_FIELD_NUMBER = 21;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TRACK_FIELD_NUMBER = 8;
    public static final int TRACK_ID_FIELD_NUMBER = 7;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VIDEO_LAYER_FIELD_NUMBER = 22;
    private LivekitModels$ClientInfo clientInfo_;
    private LivekitAnalytics$AnalyticsClientMeta clientMeta_;
    private LivekitEgress$EgressInfo egress_;
    private LivekitIngress$IngressInfo ingress_;
    private int maxSubscribedVideoQuality_;
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$ParticipantInfo publisher_;
    private LivekitModels$Room room_;
    private LivekitModels$RTPStats rtpStats_;
    private Timestamp timestamp_;
    private LivekitModels$TrackInfo track_;
    private int type_;
    private int videoLayer_;
    private String roomId_ = "";
    private String participantId_ = "";
    private String trackId_ = "";
    private String analyticsKey_ = "";
    private String egressId_ = "";
    private String ingressId_ = "";
    private String mime_ = "";
    private String error_ = "";

    static {
        LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent = new LivekitAnalytics$AnalyticsEvent();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsEvent;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsEvent.class, livekitAnalytics$AnalyticsEvent);
    }

    private LivekitAnalytics$AnalyticsEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnalyticsKey() {
        this.analyticsKey_ = getDefaultInstance().getAnalyticsKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientInfo() {
        this.clientInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientMeta() {
        this.clientMeta_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgress() {
        this.egress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngress() {
        this.ingress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressId() {
        this.ingressId_ = getDefaultInstance().getIngressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSubscribedVideoQuality() {
        this.maxSubscribedVideoQuality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMime() {
        this.mime_ = getDefaultInstance().getMime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublisher() {
        this.publisher_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = getDefaultInstance().getRoomId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpStats() {
        this.rtpStats_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoLayer() {
        this.videoLayer_ = 0;
    }

    public static LivekitAnalytics$AnalyticsEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientInfo(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        LivekitModels$ClientInfo livekitModels$ClientInfo2 = this.clientInfo_;
        if (livekitModels$ClientInfo2 != null && livekitModels$ClientInfo2 != LivekitModels$ClientInfo.getDefaultInstance()) {
            B1 newBuilder = LivekitModels$ClientInfo.newBuilder(this.clientInfo_);
            newBuilder.f(livekitModels$ClientInfo);
            this.clientInfo_ = (LivekitModels$ClientInfo) newBuilder.c();
            return;
        }
        this.clientInfo_ = livekitModels$ClientInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientMeta(LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta) {
        livekitAnalytics$AnalyticsClientMeta.getClass();
        LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta2 = this.clientMeta_;
        if (livekitAnalytics$AnalyticsClientMeta2 != null && livekitAnalytics$AnalyticsClientMeta2 != LivekitAnalytics$AnalyticsClientMeta.getDefaultInstance()) {
            C4063q newBuilder = LivekitAnalytics$AnalyticsClientMeta.newBuilder(this.clientMeta_);
            newBuilder.f(livekitAnalytics$AnalyticsClientMeta);
            this.clientMeta_ = (LivekitAnalytics$AnalyticsClientMeta) newBuilder.c();
            return;
        }
        this.clientMeta_ = livekitAnalytics$AnalyticsClientMeta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEgress(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        LivekitEgress$EgressInfo livekitEgress$EgressInfo2 = this.egress_;
        if (livekitEgress$EgressInfo2 != null && livekitEgress$EgressInfo2 != LivekitEgress$EgressInfo.getDefaultInstance()) {
            L newBuilder = LivekitEgress$EgressInfo.newBuilder(this.egress_);
            newBuilder.f(livekitEgress$EgressInfo);
            this.egress_ = (LivekitEgress$EgressInfo) newBuilder.c();
            return;
        }
        this.egress_ = livekitEgress$EgressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIngress(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        LivekitIngress$IngressInfo livekitIngress$IngressInfo2 = this.ingress_;
        if (livekitIngress$IngressInfo2 != null && livekitIngress$IngressInfo2 != LivekitIngress$IngressInfo.getDefaultInstance()) {
            U0 newBuilder = LivekitIngress$IngressInfo.newBuilder(this.ingress_);
            newBuilder.f(livekitIngress$IngressInfo);
            this.ingress_ = (LivekitIngress$IngressInfo) newBuilder.c();
            return;
        }
        this.ingress_ = livekitIngress$IngressInfo;
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
    public void mergePublisher(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.publisher_;
        if (livekitModels$ParticipantInfo2 != null && livekitModels$ParticipantInfo2 != LivekitModels$ParticipantInfo.getDefaultInstance()) {
            Q1 newBuilder = LivekitModels$ParticipantInfo.newBuilder(this.publisher_);
            newBuilder.f(livekitModels$ParticipantInfo);
            this.publisher_ = (LivekitModels$ParticipantInfo) newBuilder.c();
            return;
        }
        this.publisher_ = livekitModels$ParticipantInfo;
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
    public void mergeRtpStats(LivekitModels$RTPStats livekitModels$RTPStats) {
        livekitModels$RTPStats.getClass();
        LivekitModels$RTPStats livekitModels$RTPStats2 = this.rtpStats_;
        if (livekitModels$RTPStats2 != null && livekitModels$RTPStats2 != LivekitModels$RTPStats.getDefaultInstance()) {
            Y1 newBuilder = LivekitModels$RTPStats.newBuilder(this.rtpStats_);
            newBuilder.f(livekitModels$RTPStats);
            this.rtpStats_ = (LivekitModels$RTPStats) newBuilder.c();
            return;
        }
        this.rtpStats_ = livekitModels$RTPStats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            q1 newBuilder = Timestamp.newBuilder(this.timestamp_);
            newBuilder.f(timestamp);
            this.timestamp_ = (Timestamp) newBuilder.c();
            return;
        }
        this.timestamp_ = timestamp;
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

    public static r newBuilder() {
        return (r) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsEvent parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsKey(String str) {
        str.getClass();
        this.analyticsKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsKeyBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.analyticsKey_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientInfo(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        this.clientInfo_ = livekitModels$ClientInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientMeta(LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta) {
        livekitAnalytics$AnalyticsClientMeta.getClass();
        this.clientMeta_ = livekitAnalytics$AnalyticsClientMeta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgress(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        livekitEgress$EgressInfo.getClass();
        this.egress_ = livekitEgress$EgressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.egressId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(String str) {
        str.getClass();
        this.error_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.error_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngress(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        this.ingress_ = livekitIngress$IngressInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressId(String str) {
        str.getClass();
        this.ingressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.ingressId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSubscribedVideoQuality(EnumC4085u2 enumC4085u2) {
        this.maxSubscribedVideoQuality_ = enumC4085u2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSubscribedVideoQualityValue(int i10) {
        this.maxSubscribedVideoQuality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMime(String str) {
        str.getClass();
        this.mime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.mime_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantId(String str) {
        str.getClass();
        this.participantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublisher(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.publisher_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomId(String str) {
        str.getClass();
        this.roomId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.roomId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpStats(LivekitModels$RTPStats livekitModels$RTPStats) {
        livekitModels$RTPStats.getClass();
        this.rtpStats_ = livekitModels$RTPStats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        this.track_ = livekitModels$TrackInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackId(String str) {
        str.getClass();
        this.trackId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.trackId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC4077t enumC4077t) {
        this.type_ = enumC4077t.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoLayer(int i10) {
        this.videoLayer_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0000\u0001\u0016\u0015\u0000\u0000\u0000\u0001\f\u0002\t\u0003\u0208\u0004\t\u0005\u0208\u0006\t\u0007\u0208\b\t\n\u0208\u000b\t\f\t\r\u0208\u000e\f\u000f\t\u0010\u0208\u0011\t\u0012\t\u0013\u0208\u0014\u0208\u0015\t\u0016\u0004", new Object[]{"type_", "timestamp_", "roomId_", "room_", "participantId_", "participant_", "trackId_", "track_", "analyticsKey_", "clientInfo_", "clientMeta_", "egressId_", "maxSubscribedVideoQuality_", "publisher_", "mime_", "egress_", "ingress_", "ingressId_", "error_", "rtpStats_", "videoLayer_"});
            case 3:
                return new LivekitAnalytics$AnalyticsEvent();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsEvent.class) {
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

    public String getAnalyticsKey() {
        return this.analyticsKey_;
    }

    public AbstractC2534q getAnalyticsKeyBytes() {
        return AbstractC2534q.y(this.analyticsKey_);
    }

    public LivekitModels$ClientInfo getClientInfo() {
        LivekitModels$ClientInfo livekitModels$ClientInfo = this.clientInfo_;
        if (livekitModels$ClientInfo == null) {
            return LivekitModels$ClientInfo.getDefaultInstance();
        }
        return livekitModels$ClientInfo;
    }

    public LivekitAnalytics$AnalyticsClientMeta getClientMeta() {
        LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta = this.clientMeta_;
        if (livekitAnalytics$AnalyticsClientMeta == null) {
            return LivekitAnalytics$AnalyticsClientMeta.getDefaultInstance();
        }
        return livekitAnalytics$AnalyticsClientMeta;
    }

    public LivekitEgress$EgressInfo getEgress() {
        LivekitEgress$EgressInfo livekitEgress$EgressInfo = this.egress_;
        if (livekitEgress$EgressInfo == null) {
            return LivekitEgress$EgressInfo.getDefaultInstance();
        }
        return livekitEgress$EgressInfo;
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC2534q getEgressIdBytes() {
        return AbstractC2534q.y(this.egressId_);
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC2534q getErrorBytes() {
        return AbstractC2534q.y(this.error_);
    }

    public LivekitIngress$IngressInfo getIngress() {
        LivekitIngress$IngressInfo livekitIngress$IngressInfo = this.ingress_;
        if (livekitIngress$IngressInfo == null) {
            return LivekitIngress$IngressInfo.getDefaultInstance();
        }
        return livekitIngress$IngressInfo;
    }

    public String getIngressId() {
        return this.ingressId_;
    }

    public AbstractC2534q getIngressIdBytes() {
        return AbstractC2534q.y(this.ingressId_);
    }

    public EnumC4085u2 getMaxSubscribedVideoQuality() {
        EnumC4085u2 b10 = EnumC4085u2.b(this.maxSubscribedVideoQuality_);
        if (b10 == null) {
            return EnumC4085u2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getMaxSubscribedVideoQualityValue() {
        return this.maxSubscribedVideoQuality_;
    }

    public String getMime() {
        return this.mime_;
    }

    public AbstractC2534q getMimeBytes() {
        return AbstractC2534q.y(this.mime_);
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        if (livekitModels$ParticipantInfo == null) {
            return LivekitModels$ParticipantInfo.getDefaultInstance();
        }
        return livekitModels$ParticipantInfo;
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC2534q getParticipantIdBytes() {
        return AbstractC2534q.y(this.participantId_);
    }

    public LivekitModels$ParticipantInfo getPublisher() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.publisher_;
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

    public String getRoomId() {
        return this.roomId_;
    }

    public AbstractC2534q getRoomIdBytes() {
        return AbstractC2534q.y(this.roomId_);
    }

    public LivekitModels$RTPStats getRtpStats() {
        LivekitModels$RTPStats livekitModels$RTPStats = this.rtpStats_;
        if (livekitModels$RTPStats == null) {
            return LivekitModels$RTPStats.getDefaultInstance();
        }
        return livekitModels$RTPStats;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        if (timestamp == null) {
            return Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public LivekitModels$TrackInfo getTrack() {
        LivekitModels$TrackInfo livekitModels$TrackInfo = this.track_;
        if (livekitModels$TrackInfo == null) {
            return LivekitModels$TrackInfo.getDefaultInstance();
        }
        return livekitModels$TrackInfo;
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC2534q getTrackIdBytes() {
        return AbstractC2534q.y(this.trackId_);
    }

    public EnumC4077t getType() {
        EnumC4077t b10 = EnumC4077t.b(this.type_);
        if (b10 == null) {
            return EnumC4077t.UNRECOGNIZED;
        }
        return b10;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public int getVideoLayer() {
        return this.videoLayer_;
    }

    public boolean hasClientInfo() {
        if (this.clientInfo_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasClientMeta() {
        if (this.clientMeta_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasEgress() {
        if (this.egress_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasIngress() {
        if (this.ingress_ != null) {
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

    public boolean hasPublisher() {
        if (this.publisher_ != null) {
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

    public boolean hasRtpStats() {
        if (this.rtpStats_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasTimestamp() {
        if (this.timestamp_ != null) {
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

    public static r newBuilder(LivekitAnalytics$AnalyticsEvent livekitAnalytics$AnalyticsEvent) {
        return (r) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsEvent);
    }

    public static LivekitAnalytics$AnalyticsEvent parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsEvent parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsEvent) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
