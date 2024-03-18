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
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.A0;
import jh.AbstractC4009f0;
import jh.AbstractC4088v0;
import jh.C4024i0;
import jh.C4034k0;
import jh.C4083u0;
import jh.C4108z0;
import jh.E0;
import jh.H0;
import jh.L;
import jh.L0;
import jh.M;
import jh.N;
import jh.O;
import jh.P;
import jh.X;
import jh.Y;

/* loaded from: classes2.dex */
public final class LivekitEgress$EgressInfo extends AbstractC2497d0 implements O {
    private static final LivekitEgress$EgressInfo DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    public static final int ENDED_AT_FIELD_NUMBER = 11;
    public static final int ERROR_FIELD_NUMBER = 9;
    public static final int FILE_FIELD_NUMBER = 8;
    public static final int FILE_RESULTS_FIELD_NUMBER = 16;
    public static final int IMAGE_RESULTS_FIELD_NUMBER = 20;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 19;
    public static final int ROOM_COMPOSITE_FIELD_NUMBER = 4;
    public static final int ROOM_ID_FIELD_NUMBER = 2;
    public static final int ROOM_NAME_FIELD_NUMBER = 13;
    public static final int SEGMENTS_FIELD_NUMBER = 12;
    public static final int SEGMENT_RESULTS_FIELD_NUMBER = 17;
    public static final int STARTED_AT_FIELD_NUMBER = 10;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int STREAM_FIELD_NUMBER = 7;
    public static final int STREAM_RESULTS_FIELD_NUMBER = 15;
    public static final int TRACK_COMPOSITE_FIELD_NUMBER = 5;
    public static final int TRACK_FIELD_NUMBER = 6;
    public static final int UPDATED_AT_FIELD_NUMBER = 18;
    public static final int WEB_FIELD_NUMBER = 14;
    private long endedAt_;
    private Object request_;
    private Object result_;
    private long startedAt_;
    private int status_;
    private long updatedAt_;
    private int requestCase_ = 0;
    private int resultCase_ = 0;
    private String egressId_ = "";
    private String roomId_ = "";
    private String roomName_ = "";
    private String error_ = "";
    private AbstractC2535q0 streamResults_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 fileResults_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 segmentResults_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 imageResults_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$EgressInfo livekitEgress$EgressInfo = new LivekitEgress$EgressInfo();
        DEFAULT_INSTANCE = livekitEgress$EgressInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$EgressInfo.class, livekitEgress$EgressInfo);
    }

    private LivekitEgress$EgressInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileResults(Iterable<? extends LivekitEgress$FileInfo> iterable) {
        ensureFileResultsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.fileResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImageResults(Iterable<? extends LivekitEgress$ImagesInfo> iterable) {
        ensureImageResultsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.imageResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentResults(Iterable<? extends LivekitEgress$SegmentsInfo> iterable) {
        ensureSegmentResultsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.segmentResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamResults(Iterable<? extends LivekitEgress$StreamInfo> iterable) {
        ensureStreamResultsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.streamResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileResults(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        ensureFileResultsIsMutable();
        this.fileResults_.add(livekitEgress$FileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageResults(LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        livekitEgress$ImagesInfo.getClass();
        ensureImageResultsIsMutable();
        this.imageResults_.add(livekitEgress$ImagesInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentResults(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        ensureSegmentResultsIsMutable();
        this.segmentResults_.add(livekitEgress$SegmentsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamResults(LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureStreamResultsIsMutable();
        this.streamResults_.add(livekitEgress$StreamInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        if (this.resultCase_ == 8) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileResults() {
        this.fileResults_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageResults() {
        this.imageResults_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        if (this.requestCase_ == 19) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.requestCase_ = 0;
        this.request_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomComposite() {
        if (this.requestCase_ == 4) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
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
    public void clearSegmentResults() {
        this.segmentResults_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        if (this.resultCase_ == 12) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStream() {
        if (this.resultCase_ == 7) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamResults() {
        this.streamResults_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        if (this.requestCase_ == 6) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackComposite() {
        if (this.requestCase_ == 5) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedAt() {
        this.updatedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeb() {
        if (this.requestCase_ == 14) {
            this.requestCase_ = 0;
            this.request_ = null;
        }
    }

    private void ensureFileResultsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.fileResults_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.fileResults_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureImageResultsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.imageResults_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.imageResults_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureSegmentResultsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.segmentResults_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.segmentResults_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureStreamResultsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.streamResults_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.streamResults_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitEgress$EgressInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFile(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        if (this.resultCase_ == 8 && this.result_ != LivekitEgress$FileInfo.getDefaultInstance()) {
            X newBuilder = LivekitEgress$FileInfo.newBuilder((LivekitEgress$FileInfo) this.result_);
            newBuilder.f(livekitEgress$FileInfo);
            this.result_ = newBuilder.c();
        } else {
            this.result_ = livekitEgress$FileInfo;
        }
        this.resultCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest) {
        livekitEgress$ParticipantEgressRequest.getClass();
        if (this.requestCase_ == 19 && this.request_ != LivekitEgress$ParticipantEgressRequest.getDefaultInstance()) {
            C4024i0 newBuilder = LivekitEgress$ParticipantEgressRequest.newBuilder((LivekitEgress$ParticipantEgressRequest) this.request_);
            newBuilder.f(livekitEgress$ParticipantEgressRequest);
            this.request_ = newBuilder.c();
        } else {
            this.request_ = livekitEgress$ParticipantEgressRequest;
        }
        this.requestCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoomComposite(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        if (this.requestCase_ == 4 && this.request_ != LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance()) {
            C4034k0 newBuilder = LivekitEgress$RoomCompositeEgressRequest.newBuilder((LivekitEgress$RoomCompositeEgressRequest) this.request_);
            newBuilder.f(livekitEgress$RoomCompositeEgressRequest);
            this.request_ = newBuilder.c();
        } else {
            this.request_ = livekitEgress$RoomCompositeEgressRequest;
        }
        this.requestCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegments(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        if (this.resultCase_ == 12 && this.result_ != LivekitEgress$SegmentsInfo.getDefaultInstance()) {
            C4083u0 newBuilder = LivekitEgress$SegmentsInfo.newBuilder((LivekitEgress$SegmentsInfo) this.result_);
            newBuilder.f(livekitEgress$SegmentsInfo);
            this.result_ = newBuilder.c();
        } else {
            this.result_ = livekitEgress$SegmentsInfo;
        }
        this.resultCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStream(LivekitEgress$StreamInfoList livekitEgress$StreamInfoList) {
        livekitEgress$StreamInfoList.getClass();
        if (this.resultCase_ == 7 && this.result_ != LivekitEgress$StreamInfoList.getDefaultInstance()) {
            C4108z0 newBuilder = LivekitEgress$StreamInfoList.newBuilder((LivekitEgress$StreamInfoList) this.result_);
            newBuilder.f(livekitEgress$StreamInfoList);
            this.result_ = newBuilder.c();
        } else {
            this.result_ = livekitEgress$StreamInfoList;
        }
        this.resultCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrack(LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest) {
        livekitEgress$TrackEgressRequest.getClass();
        if (this.requestCase_ == 6 && this.request_ != LivekitEgress$TrackEgressRequest.getDefaultInstance()) {
            H0 newBuilder = LivekitEgress$TrackEgressRequest.newBuilder((LivekitEgress$TrackEgressRequest) this.request_);
            newBuilder.f(livekitEgress$TrackEgressRequest);
            this.request_ = newBuilder.c();
        } else {
            this.request_ = livekitEgress$TrackEgressRequest;
        }
        this.requestCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackComposite(LivekitEgress$TrackCompositeEgressRequest livekitEgress$TrackCompositeEgressRequest) {
        livekitEgress$TrackCompositeEgressRequest.getClass();
        if (this.requestCase_ == 5 && this.request_ != LivekitEgress$TrackCompositeEgressRequest.getDefaultInstance()) {
            E0 newBuilder = LivekitEgress$TrackCompositeEgressRequest.newBuilder((LivekitEgress$TrackCompositeEgressRequest) this.request_);
            newBuilder.f(livekitEgress$TrackCompositeEgressRequest);
            this.request_ = newBuilder.c();
        } else {
            this.request_ = livekitEgress$TrackCompositeEgressRequest;
        }
        this.requestCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWeb(LivekitEgress$WebEgressRequest livekitEgress$WebEgressRequest) {
        livekitEgress$WebEgressRequest.getClass();
        if (this.requestCase_ == 14 && this.request_ != LivekitEgress$WebEgressRequest.getDefaultInstance()) {
            L0 newBuilder = LivekitEgress$WebEgressRequest.newBuilder((LivekitEgress$WebEgressRequest) this.request_);
            newBuilder.f(livekitEgress$WebEgressRequest);
            this.request_ = newBuilder.c();
        } else {
            this.request_ = livekitEgress$WebEgressRequest;
        }
        this.requestCase_ = 14;
    }

    public static L newBuilder() {
        return (L) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$EgressInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EgressInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFileResults(int i10) {
        ensureFileResultsIsMutable();
        this.fileResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImageResults(int i10) {
        ensureImageResultsIsMutable();
        this.imageResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegmentResults(int i10) {
        ensureSegmentResultsIsMutable();
        this.segmentResults_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamResults(int i10) {
        ensureStreamResultsIsMutable();
        this.streamResults_.remove(i10);
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
    public void setEndedAt(long j6) {
        this.endedAt_ = j6;
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
    public void setFile(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        this.result_ = livekitEgress$FileInfo;
        this.resultCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileResults(int i10, LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        ensureFileResultsIsMutable();
        this.fileResults_.set(i10, livekitEgress$FileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageResults(int i10, LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        livekitEgress$ImagesInfo.getClass();
        ensureImageResultsIsMutable();
        this.imageResults_.set(i10, livekitEgress$ImagesInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest) {
        livekitEgress$ParticipantEgressRequest.getClass();
        this.request_ = livekitEgress$ParticipantEgressRequest;
        this.requestCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomComposite(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        livekitEgress$RoomCompositeEgressRequest.getClass();
        this.request_ = livekitEgress$RoomCompositeEgressRequest;
        this.requestCase_ = 4;
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
    public void setSegmentResults(int i10, LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        ensureSegmentResultsIsMutable();
        this.segmentResults_.set(i10, livekitEgress$SegmentsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        this.result_ = livekitEgress$SegmentsInfo;
        this.resultCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j6) {
        this.startedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(P p10) {
        this.status_ = p10.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStream(LivekitEgress$StreamInfoList livekitEgress$StreamInfoList) {
        livekitEgress$StreamInfoList.getClass();
        this.result_ = livekitEgress$StreamInfoList;
        this.resultCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamResults(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureStreamResultsIsMutable();
        this.streamResults_.set(i10, livekitEgress$StreamInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(LivekitEgress$TrackEgressRequest livekitEgress$TrackEgressRequest) {
        livekitEgress$TrackEgressRequest.getClass();
        this.request_ = livekitEgress$TrackEgressRequest;
        this.requestCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackComposite(LivekitEgress$TrackCompositeEgressRequest livekitEgress$TrackCompositeEgressRequest) {
        livekitEgress$TrackCompositeEgressRequest.getClass();
        this.request_ = livekitEgress$TrackCompositeEgressRequest;
        this.requestCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedAt(long j6) {
        this.updatedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeb(LivekitEgress$WebEgressRequest livekitEgress$WebEgressRequest) {
        livekitEgress$WebEgressRequest.getClass();
        this.request_ = livekitEgress$WebEgressRequest;
        this.requestCase_ = 14;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0002\u0000\u0001\u0014\u0014\u0000\u0004\u0000\u0001\u0208\u0002\u0208\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0001\b<\u0001\t\u0208\n\u0002\u000b\u0002\f<\u0001\r\u0208\u000e<\u0000\u000f\u001b\u0010\u001b\u0011\u001b\u0012\u0002\u0013<\u0000\u0014\u001b", new Object[]{"request_", "requestCase_", "result_", "resultCase_", "egressId_", "roomId_", "status_", LivekitEgress$RoomCompositeEgressRequest.class, LivekitEgress$TrackCompositeEgressRequest.class, LivekitEgress$TrackEgressRequest.class, LivekitEgress$StreamInfoList.class, LivekitEgress$FileInfo.class, "error_", "startedAt_", "endedAt_", LivekitEgress$SegmentsInfo.class, "roomName_", LivekitEgress$WebEgressRequest.class, "streamResults_", LivekitEgress$StreamInfo.class, "fileResults_", LivekitEgress$FileInfo.class, "segmentResults_", LivekitEgress$SegmentsInfo.class, "updatedAt_", LivekitEgress$ParticipantEgressRequest.class, "imageResults_", LivekitEgress$ImagesInfo.class});
            case 3:
                return new LivekitEgress$EgressInfo();
            case 4:
                return new com.google.protobuf.X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$EgressInfo.class) {
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

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC2534q getEgressIdBytes() {
        return AbstractC2534q.y(this.egressId_);
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getError() {
        return this.error_;
    }

    public AbstractC2534q getErrorBytes() {
        return AbstractC2534q.y(this.error_);
    }

    @Deprecated
    public LivekitEgress$FileInfo getFile() {
        if (this.resultCase_ == 8) {
            return (LivekitEgress$FileInfo) this.result_;
        }
        return LivekitEgress$FileInfo.getDefaultInstance();
    }

    public LivekitEgress$FileInfo getFileResults(int i10) {
        return (LivekitEgress$FileInfo) this.fileResults_.get(i10);
    }

    public int getFileResultsCount() {
        return this.fileResults_.size();
    }

    public List<LivekitEgress$FileInfo> getFileResultsList() {
        return this.fileResults_;
    }

    public Y getFileResultsOrBuilder(int i10) {
        return (Y) this.fileResults_.get(i10);
    }

    public List<? extends Y> getFileResultsOrBuilderList() {
        return this.fileResults_;
    }

    public LivekitEgress$ImagesInfo getImageResults(int i10) {
        return (LivekitEgress$ImagesInfo) this.imageResults_.get(i10);
    }

    public int getImageResultsCount() {
        return this.imageResults_.size();
    }

    public List<LivekitEgress$ImagesInfo> getImageResultsList() {
        return this.imageResults_;
    }

    public AbstractC4009f0 getImageResultsOrBuilder(int i10) {
        return (AbstractC4009f0) this.imageResults_.get(i10);
    }

    public List<? extends AbstractC4009f0> getImageResultsOrBuilderList() {
        return this.imageResults_;
    }

    public LivekitEgress$ParticipantEgressRequest getParticipant() {
        if (this.requestCase_ == 19) {
            return (LivekitEgress$ParticipantEgressRequest) this.request_;
        }
        return LivekitEgress$ParticipantEgressRequest.getDefaultInstance();
    }

    public M getRequestCase() {
        int i10 = this.requestCase_;
        if (i10 != 0) {
            if (i10 != 14) {
                if (i10 != 19) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                return null;
                            }
                            return M.f36269j0;
                        }
                        return M.f36268i0;
                    }
                    return M.f36265Y;
                }
                return M.f36267h0;
            }
            return M.f36266Z;
        }
        return M.f36270k0;
    }

    public N getResultCase() {
        int i10 = this.resultCase_;
        if (i10 != 0) {
            if (i10 != 12) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        return null;
                    }
                    return N.f36288Z;
                }
                return N.f36287Y;
            }
            return N.f36289h0;
        }
        return N.f36290i0;
    }

    public LivekitEgress$RoomCompositeEgressRequest getRoomComposite() {
        if (this.requestCase_ == 4) {
            return (LivekitEgress$RoomCompositeEgressRequest) this.request_;
        }
        return LivekitEgress$RoomCompositeEgressRequest.getDefaultInstance();
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

    public LivekitEgress$SegmentsInfo getSegmentResults(int i10) {
        return (LivekitEgress$SegmentsInfo) this.segmentResults_.get(i10);
    }

    public int getSegmentResultsCount() {
        return this.segmentResults_.size();
    }

    public List<LivekitEgress$SegmentsInfo> getSegmentResultsList() {
        return this.segmentResults_;
    }

    public AbstractC4088v0 getSegmentResultsOrBuilder(int i10) {
        return (AbstractC4088v0) this.segmentResults_.get(i10);
    }

    public List<? extends AbstractC4088v0> getSegmentResultsOrBuilderList() {
        return this.segmentResults_;
    }

    @Deprecated
    public LivekitEgress$SegmentsInfo getSegments() {
        if (this.resultCase_ == 12) {
            return (LivekitEgress$SegmentsInfo) this.result_;
        }
        return LivekitEgress$SegmentsInfo.getDefaultInstance();
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public P getStatus() {
        P p10;
        switch (this.status_) {
            case 0:
                p10 = P.EGRESS_STARTING;
                break;
            case 1:
                p10 = P.EGRESS_ACTIVE;
                break;
            case 2:
                p10 = P.EGRESS_ENDING;
                break;
            case 3:
                p10 = P.EGRESS_COMPLETE;
                break;
            case 4:
                p10 = P.EGRESS_FAILED;
                break;
            case 5:
                p10 = P.EGRESS_ABORTED;
                break;
            case 6:
                p10 = P.EGRESS_LIMIT_REACHED;
                break;
            default:
                p10 = null;
                break;
        }
        if (p10 == null) {
            return P.UNRECOGNIZED;
        }
        return p10;
    }

    public int getStatusValue() {
        return this.status_;
    }

    @Deprecated
    public LivekitEgress$StreamInfoList getStream() {
        if (this.resultCase_ == 7) {
            return (LivekitEgress$StreamInfoList) this.result_;
        }
        return LivekitEgress$StreamInfoList.getDefaultInstance();
    }

    public LivekitEgress$StreamInfo getStreamResults(int i10) {
        return (LivekitEgress$StreamInfo) this.streamResults_.get(i10);
    }

    public int getStreamResultsCount() {
        return this.streamResults_.size();
    }

    public List<LivekitEgress$StreamInfo> getStreamResultsList() {
        return this.streamResults_;
    }

    public A0 getStreamResultsOrBuilder(int i10) {
        return (A0) this.streamResults_.get(i10);
    }

    public List<? extends A0> getStreamResultsOrBuilderList() {
        return this.streamResults_;
    }

    public LivekitEgress$TrackEgressRequest getTrack() {
        if (this.requestCase_ == 6) {
            return (LivekitEgress$TrackEgressRequest) this.request_;
        }
        return LivekitEgress$TrackEgressRequest.getDefaultInstance();
    }

    public LivekitEgress$TrackCompositeEgressRequest getTrackComposite() {
        if (this.requestCase_ == 5) {
            return (LivekitEgress$TrackCompositeEgressRequest) this.request_;
        }
        return LivekitEgress$TrackCompositeEgressRequest.getDefaultInstance();
    }

    public long getUpdatedAt() {
        return this.updatedAt_;
    }

    public LivekitEgress$WebEgressRequest getWeb() {
        if (this.requestCase_ == 14) {
            return (LivekitEgress$WebEgressRequest) this.request_;
        }
        return LivekitEgress$WebEgressRequest.getDefaultInstance();
    }

    @Deprecated
    public boolean hasFile() {
        if (this.resultCase_ == 8) {
            return true;
        }
        return false;
    }

    public boolean hasParticipant() {
        if (this.requestCase_ == 19) {
            return true;
        }
        return false;
    }

    public boolean hasRoomComposite() {
        if (this.requestCase_ == 4) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasSegments() {
        if (this.resultCase_ == 12) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasStream() {
        if (this.resultCase_ == 7) {
            return true;
        }
        return false;
    }

    public boolean hasTrack() {
        if (this.requestCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasTrackComposite() {
        if (this.requestCase_ == 5) {
            return true;
        }
        return false;
    }

    public boolean hasWeb() {
        if (this.requestCase_ == 14) {
            return true;
        }
        return false;
    }

    public static L newBuilder(LivekitEgress$EgressInfo livekitEgress$EgressInfo) {
        return (L) DEFAULT_INSTANCE.createBuilder(livekitEgress$EgressInfo);
    }

    public static LivekitEgress$EgressInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$EgressInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileResults(int i10, LivekitEgress$FileInfo livekitEgress$FileInfo) {
        livekitEgress$FileInfo.getClass();
        ensureFileResultsIsMutable();
        this.fileResults_.add(i10, livekitEgress$FileInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageResults(int i10, LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        livekitEgress$ImagesInfo.getClass();
        ensureImageResultsIsMutable();
        this.imageResults_.add(i10, livekitEgress$ImagesInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentResults(int i10, LivekitEgress$SegmentsInfo livekitEgress$SegmentsInfo) {
        livekitEgress$SegmentsInfo.getClass();
        ensureSegmentResultsIsMutable();
        this.segmentResults_.add(i10, livekitEgress$SegmentsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamResults(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureStreamResultsIsMutable();
        this.streamResults_.add(i10, livekitEgress$StreamInfo);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$EgressInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$EgressInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$EgressInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EgressInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$EgressInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$EgressInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
