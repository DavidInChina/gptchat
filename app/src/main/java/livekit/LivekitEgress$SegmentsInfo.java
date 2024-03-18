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
import jh.AbstractC4088v0;
import jh.C4083u0;

/* loaded from: classes.dex */
public final class LivekitEgress$SegmentsInfo extends AbstractC2497d0 implements AbstractC4088v0 {
    private static final LivekitEgress$SegmentsInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int ENDED_AT_FIELD_NUMBER = 7;
    public static final int LIVE_PLAYLIST_LOCATION_FIELD_NUMBER = 9;
    public static final int LIVE_PLAYLIST_NAME_FIELD_NUMBER = 8;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PLAYLIST_LOCATION_FIELD_NUMBER = 4;
    public static final int PLAYLIST_NAME_FIELD_NUMBER = 1;
    public static final int SEGMENT_COUNT_FIELD_NUMBER = 5;
    public static final int SIZE_FIELD_NUMBER = 3;
    public static final int STARTED_AT_FIELD_NUMBER = 6;
    private long duration_;
    private long endedAt_;
    private long segmentCount_;
    private long size_;
    private long startedAt_;
    private String playlistName_ = "";
    private String livePlaylistName_ = "";
    private String playlistLocation_ = "";
    private String livePlaylistLocation_ = "";

    static {
        LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo = new LivekitEgress$SegmentsInfo();
        DEFAULT_INSTANCE = livekitEgress$SegmentsInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$SegmentsInfo.class, livekitEgress$SegmentsInfo);
    }

    private LivekitEgress$SegmentsInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLivePlaylistLocation() {
        this.livePlaylistLocation_ = getDefaultInstance().getLivePlaylistLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLivePlaylistName() {
        this.livePlaylistName_ = getDefaultInstance().getLivePlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistLocation() {
        this.playlistLocation_ = getDefaultInstance().getPlaylistLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistName() {
        this.playlistName_ = getDefaultInstance().getPlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentCount() {
        this.segmentCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    public static LivekitEgress$SegmentsInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4083u0 newBuilder() {
        return (C4083u0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$SegmentsInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j6) {
        this.duration_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j6) {
        this.endedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistLocation(String str) {
        str.getClass();
        this.livePlaylistLocation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistLocationBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.livePlaylistLocation_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistName(String str) {
        str.getClass();
        this.livePlaylistName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.livePlaylistName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistLocation(String str) {
        str.getClass();
        this.playlistLocation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistLocationBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.playlistLocation_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistName(String str) {
        str.getClass();
        this.playlistName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.playlistName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentCount(long j6) {
        this.segmentCount_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j6) {
        this.size_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j6) {
        this.startedAt_ = j6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0002\u0006\u0002\u0007\u0002\b\u0208\t\u0208", new Object[]{"playlistName_", "duration_", "size_", "playlistLocation_", "segmentCount_", "startedAt_", "endedAt_", "livePlaylistName_", "livePlaylistLocation_"});
            case 3:
                return new LivekitEgress$SegmentsInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$SegmentsInfo.class) {
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

    public long getDuration() {
        return this.duration_;
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getLivePlaylistLocation() {
        return this.livePlaylistLocation_;
    }

    public AbstractC2534q getLivePlaylistLocationBytes() {
        return AbstractC2534q.y(this.livePlaylistLocation_);
    }

    public String getLivePlaylistName() {
        return this.livePlaylistName_;
    }

    public AbstractC2534q getLivePlaylistNameBytes() {
        return AbstractC2534q.y(this.livePlaylistName_);
    }

    public String getPlaylistLocation() {
        return this.playlistLocation_;
    }

    public AbstractC2534q getPlaylistLocationBytes() {
        return AbstractC2534q.y(this.playlistLocation_);
    }

    public String getPlaylistName() {
        return this.playlistName_;
    }

    public AbstractC2534q getPlaylistNameBytes() {
        return AbstractC2534q.y(this.playlistName_);
    }

    public long getSegmentCount() {
        return this.segmentCount_;
    }

    public long getSize() {
        return this.size_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public static C4083u0 newBuilder(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        return (C4083u0) DEFAULT_INSTANCE.createBuilder(livekitEgress$SegmentsInfo);
    }

    public static LivekitEgress$SegmentsInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$SegmentsInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$SegmentsInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
