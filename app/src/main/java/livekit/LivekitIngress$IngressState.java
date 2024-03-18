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
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.AbstractC4046m2;
import jh.C4000d1;
import jh.C4005e1;
import jh.X0;
import jh.Y0;

/* loaded from: classes.dex */
public final class LivekitIngress$IngressState extends AbstractC2497d0 implements N0 {
    public static final int AUDIO_FIELD_NUMBER = 4;
    private static final LivekitIngress$IngressState DEFAULT_INSTANCE;
    public static final int ENDED_AT_FIELD_NUMBER = 8;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RESOURCE_ID_FIELD_NUMBER = 9;
    public static final int ROOM_ID_FIELD_NUMBER = 5;
    public static final int STARTED_AT_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TRACKS_FIELD_NUMBER = 6;
    public static final int VIDEO_FIELD_NUMBER = 3;
    private LivekitIngress$InputAudioState audio_;
    private long endedAt_;
    private long startedAt_;
    private int status_;
    private LivekitIngress$InputVideoState video_;
    private String error_ = "";
    private String roomId_ = "";
    private String resourceId_ = "";
    private AbstractC2535q0 tracks_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitIngress$IngressState livekitIngress$IngressState = new LivekitIngress$IngressState();
        DEFAULT_INSTANCE = livekitIngress$IngressState;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$IngressState.class, livekitIngress$IngressState);
    }

    private LivekitIngress$IngressState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTracks(Iterable<? extends LivekitModels$TrackInfo> iterable) {
        ensureTracksIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.tracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(livekitModels$TrackInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudio() {
        this.audio_ = null;
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
    public void clearResourceId() {
        this.resourceId_ = getDefaultInstance().getResourceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomId() {
        this.roomId_ = getDefaultInstance().getRoomId();
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
    public void clearTracks() {
        this.tracks_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = null;
    }

    private void ensureTracksIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.tracks_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.tracks_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitIngress$IngressState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAudio(LivekitIngress$InputAudioState livekitIngress$InputAudioState) {
        livekitIngress$InputAudioState.getClass();
        LivekitIngress$InputAudioState livekitIngress$InputAudioState2 = this.audio_;
        if (livekitIngress$InputAudioState2 != null && livekitIngress$InputAudioState2 != LivekitIngress$InputAudioState.getDefaultInstance()) {
            C4000d1 newBuilder = LivekitIngress$InputAudioState.newBuilder(this.audio_);
            newBuilder.f(livekitIngress$InputAudioState);
            this.audio_ = (LivekitIngress$InputAudioState) newBuilder.c();
            return;
        }
        this.audio_ = livekitIngress$InputAudioState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideo(LivekitIngress$InputVideoState livekitIngress$InputVideoState) {
        livekitIngress$InputVideoState.getClass();
        LivekitIngress$InputVideoState livekitIngress$InputVideoState2 = this.video_;
        if (livekitIngress$InputVideoState2 != null && livekitIngress$InputVideoState2 != LivekitIngress$InputVideoState.getDefaultInstance()) {
            C4005e1 newBuilder = LivekitIngress$InputVideoState.newBuilder(this.video_);
            newBuilder.f(livekitIngress$InputVideoState);
            this.video_ = (LivekitIngress$InputVideoState) newBuilder.c();
            return;
        }
        this.video_ = livekitIngress$InputVideoState;
    }

    public static X0 newBuilder() {
        return (X0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTracks(int i10) {
        ensureTracksIsMutable();
        this.tracks_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudio(LivekitIngress$InputAudioState livekitIngress$InputAudioState) {
        livekitIngress$InputAudioState.getClass();
        this.audio_ = livekitIngress$InputAudioState;
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
    public void setResourceId(String str) {
        str.getClass();
        this.resourceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.resourceId_ = abstractC2534q.q0();
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
    public void setStartedAt(long j6) {
        this.startedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Y0 y02) {
        this.status_ = y02.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.set(i10, livekitModels$TrackInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(LivekitIngress$InputVideoState livekitIngress$InputVideoState) {
        livekitIngress$InputVideoState.getClass();
        this.video_ = livekitIngress$InputVideoState;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001\f\u0002\u0208\u0003\t\u0004\t\u0005\u0208\u0006\u001b\u0007\u0002\b\u0002\t\u0208", new Object[]{"status_", "error_", "video_", "audio_", "roomId_", "tracks_", LivekitModels$TrackInfo.class, "startedAt_", "endedAt_", "resourceId_"});
            case 3:
                return new LivekitIngress$IngressState();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$IngressState.class) {
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

    public LivekitIngress$InputAudioState getAudio() {
        LivekitIngress$InputAudioState livekitIngress$InputAudioState = this.audio_;
        if (livekitIngress$InputAudioState == null) {
            return LivekitIngress$InputAudioState.getDefaultInstance();
        }
        return livekitIngress$InputAudioState;
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

    public String getResourceId() {
        return this.resourceId_;
    }

    public AbstractC2534q getResourceIdBytes() {
        return AbstractC2534q.y(this.resourceId_);
    }

    public String getRoomId() {
        return this.roomId_;
    }

    public AbstractC2534q getRoomIdBytes() {
        return AbstractC2534q.y(this.roomId_);
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public Y0 getStatus() {
        Y0 b10 = Y0.b(this.status_);
        if (b10 == null) {
            return Y0.UNRECOGNIZED;
        }
        return b10;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public LivekitModels$TrackInfo getTracks(int i10) {
        return (LivekitModels$TrackInfo) this.tracks_.get(i10);
    }

    public int getTracksCount() {
        return this.tracks_.size();
    }

    public List<LivekitModels$TrackInfo> getTracksList() {
        return this.tracks_;
    }

    public AbstractC4046m2 getTracksOrBuilder(int i10) {
        return (AbstractC4046m2) this.tracks_.get(i10);
    }

    public List<? extends AbstractC4046m2> getTracksOrBuilderList() {
        return this.tracks_;
    }

    public LivekitIngress$InputVideoState getVideo() {
        LivekitIngress$InputVideoState livekitIngress$InputVideoState = this.video_;
        if (livekitIngress$InputVideoState == null) {
            return LivekitIngress$InputVideoState.getDefaultInstance();
        }
        return livekitIngress$InputVideoState;
    }

    public boolean hasAudio() {
        if (this.audio_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasVideo() {
        if (this.video_ != null) {
            return true;
        }
        return false;
    }

    public static X0 newBuilder(LivekitIngress$IngressState livekitIngress$IngressState) {
        return (X0) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressState);
    }

    public static LivekitIngress$IngressState parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressState parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(i10, livekitModels$TrackInfo);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$IngressState parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressState parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$IngressState parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressState parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$IngressState parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$IngressState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
