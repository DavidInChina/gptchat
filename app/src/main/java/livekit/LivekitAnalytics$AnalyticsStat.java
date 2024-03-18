package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2496d;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2535q0;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.Timestamp;
import com.google.protobuf.X;
import com.google.protobuf.q1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.AbstractC4092w;
import jh.AbstractC4107z;
import jh.C4087v;
import jh.EnumC3975C;

/* loaded from: classes.dex */
public final class LivekitAnalytics$AnalyticsStat extends AbstractC2497d0 implements AbstractC4092w {
    public static final int ANALYTICS_KEY_FIELD_NUMBER = 1;
    private static final LivekitAnalytics$AnalyticsStat DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 2;
    public static final int MEDIAN_SCORE_FIELD_NUMBER = 13;
    public static final int MIME_FIELD_NUMBER = 11;
    public static final int MIN_SCORE_FIELD_NUMBER = 12;
    public static final int NODE_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 7;
    public static final int ROOM_ID_FIELD_NUMBER = 5;
    public static final int ROOM_NAME_FIELD_NUMBER = 6;
    public static final int SCORE_FIELD_NUMBER = 9;
    public static final int STREAMS_FIELD_NUMBER = 10;
    public static final int TIME_STAMP_FIELD_NUMBER = 3;
    public static final int TRACK_ID_FIELD_NUMBER = 8;
    private int kind_;
    private float medianScore_;
    private float minScore_;
    private float score_;
    private Timestamp timeStamp_;
    private String analyticsKey_ = "";
    private String node_ = "";
    private String roomId_ = "";
    private String roomName_ = "";
    private String participantId_ = "";
    private String trackId_ = "";
    private AbstractC2535q0 streams_ = AbstractC2497d0.emptyProtobufList();
    private String mime_ = "";

    static {
        LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat = new LivekitAnalytics$AnalyticsStat();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsStat;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsStat.class, livekitAnalytics$AnalyticsStat);
    }

    private LivekitAnalytics$AnalyticsStat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreams(Iterable<? extends LivekitAnalytics$AnalyticsStream> iterable) {
        ensureStreamsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.streams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreams(LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        livekitAnalytics$AnalyticsStream.getClass();
        ensureStreamsIsMutable();
        this.streams_.add(livekitAnalytics$AnalyticsStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnalyticsKey() {
        this.analyticsKey_ = getDefaultInstance().getAnalyticsKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedianScore() {
        this.medianScore_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMime() {
        this.mime_ = getDefaultInstance().getMime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinScore() {
        this.minScore_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNode() {
        this.node_ = getDefaultInstance().getNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = getDefaultInstance().getRoomId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreams() {
        this.streams_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackId() {
        this.trackId_ = getDefaultInstance().getTrackId();
    }

    private void ensureStreamsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.streams_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.streams_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitAnalytics$AnalyticsStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeStamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timeStamp_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            q1 newBuilder = Timestamp.newBuilder(this.timeStamp_);
            newBuilder.f(timestamp);
            this.timeStamp_ = (Timestamp) newBuilder.c();
            return;
        }
        this.timeStamp_ = timestamp;
    }

    public static C4087v newBuilder() {
        return (C4087v) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsStat parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreams(int i10) {
        ensureStreamsIsMutable();
        this.streams_.remove(i10);
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
    public void setKind(EnumC3975C enumC3975C) {
        this.kind_ = enumC3975C.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedianScore(float f6) {
        this.medianScore_ = f6;
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
    public void setMinScore(float f6) {
        this.minScore_ = f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNode(String str) {
        str.getClass();
        this.node_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.node_ = abstractC2534q.q0();
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
    public void setScore(float f6) {
        this.score_ = f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreams(int i10, LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        livekitAnalytics$AnalyticsStream.getClass();
        ensureStreamsIsMutable();
        this.streams_.set(i10, livekitAnalytics$AnalyticsStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timeStamp_ = timestamp;
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

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001\u0208\u0002\f\u0003\t\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\b\u0208\t\u0001\n\u001b\u000b\u0208\f\u0001\r\u0001", new Object[]{"analyticsKey_", "kind_", "timeStamp_", "node_", "roomId_", "roomName_", "participantId_", "trackId_", "score_", "streams_", LivekitAnalytics$AnalyticsStream.class, "mime_", "minScore_", "medianScore_"});
            case 3:
                return new LivekitAnalytics$AnalyticsStat();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsStat.class) {
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

    public EnumC3975C getKind() {
        EnumC3975C enumC3975C;
        int i10 = this.kind_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC3975C = null;
            } else {
                enumC3975C = EnumC3975C.DOWNSTREAM;
            }
        } else {
            enumC3975C = EnumC3975C.UPSTREAM;
        }
        if (enumC3975C == null) {
            return EnumC3975C.UNRECOGNIZED;
        }
        return enumC3975C;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public float getMedianScore() {
        return this.medianScore_;
    }

    public String getMime() {
        return this.mime_;
    }

    public AbstractC2534q getMimeBytes() {
        return AbstractC2534q.y(this.mime_);
    }

    public float getMinScore() {
        return this.minScore_;
    }

    public String getNode() {
        return this.node_;
    }

    public AbstractC2534q getNodeBytes() {
        return AbstractC2534q.y(this.node_);
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC2534q getParticipantIdBytes() {
        return AbstractC2534q.y(this.participantId_);
    }

    public String getRoomId() {
        return this.roomId_;
    }

    public AbstractC2534q getRoomIdBytes() {
        return AbstractC2534q.y(this.roomId_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public float getScore() {
        return this.score_;
    }

    public LivekitAnalytics$AnalyticsStream getStreams(int i10) {
        return (LivekitAnalytics$AnalyticsStream) this.streams_.get(i10);
    }

    public int getStreamsCount() {
        return this.streams_.size();
    }

    public List<LivekitAnalytics$AnalyticsStream> getStreamsList() {
        return this.streams_;
    }

    public AbstractC4107z getStreamsOrBuilder(int i10) {
        return (AbstractC4107z) this.streams_.get(i10);
    }

    public List<? extends AbstractC4107z> getStreamsOrBuilderList() {
        return this.streams_;
    }

    public Timestamp getTimeStamp() {
        Timestamp timestamp = this.timeStamp_;
        if (timestamp == null) {
            return Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public String getTrackId() {
        return this.trackId_;
    }

    public AbstractC2534q getTrackIdBytes() {
        return AbstractC2534q.y(this.trackId_);
    }

    public boolean hasTimeStamp() {
        if (this.timeStamp_ != null) {
            return true;
        }
        return false;
    }

    public static C4087v newBuilder(LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        return (C4087v) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsStat);
    }

    public static LivekitAnalytics$AnalyticsStat parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreams(int i10, LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        livekitAnalytics$AnalyticsStream.getClass();
        ensureStreamsIsMutable();
        this.streams_.add(i10, livekitAnalytics$AnalyticsStream);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsStat parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsStat) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
