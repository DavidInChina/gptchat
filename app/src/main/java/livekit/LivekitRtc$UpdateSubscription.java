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
import jh.M3;
import jh.V1;

/* loaded from: classes2.dex */
public final class LivekitRtc$UpdateSubscription extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$UpdateSubscription DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_TRACKS_FIELD_NUMBER = 3;
    public static final int SUBSCRIBE_FIELD_NUMBER = 2;
    public static final int TRACK_SIDS_FIELD_NUMBER = 1;
    private boolean subscribe_;
    private AbstractC2535q0 trackSids_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 participantTracks_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription = new LivekitRtc$UpdateSubscription();
        DEFAULT_INSTANCE = livekitRtc$UpdateSubscription;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$UpdateSubscription.class, livekitRtc$UpdateSubscription);
    }

    private LivekitRtc$UpdateSubscription() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipantTracks(Iterable<? extends LivekitModels$ParticipantTracks> iterable) {
        ensureParticipantTracksIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.participantTracks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSids(Iterable<String> iterable) {
        ensureTrackSidsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.trackSids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipantTracks(LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        livekitModels$ParticipantTracks.getClass();
        ensureParticipantTracksIsMutable();
        this.participantTracks_.add(livekitModels$ParticipantTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSids(String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSidsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureTrackSidsIsMutable();
        this.trackSids_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantTracks() {
        this.participantTracks_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribe() {
        this.subscribe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSids() {
        this.trackSids_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureParticipantTracksIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.participantTracks_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.participantTracks_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureTrackSidsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.trackSids_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.trackSids_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$UpdateSubscription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static M3 newBuilder() {
        return (M3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateSubscription parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipantTracks(int i10) {
        ensureParticipantTracksIsMutable();
        this.participantTracks_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantTracks(int i10, LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        livekitModels$ParticipantTracks.getClass();
        ensureParticipantTracksIsMutable();
        this.participantTracks_.set(i10, livekitModels$ParticipantTracks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribe(boolean z10) {
        this.subscribe_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSids(int i10, String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.set(i10, str);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u021a\u0002\u0007\u0003\u001b", new Object[]{"trackSids_", "subscribe_", "participantTracks_", LivekitModels$ParticipantTracks.class});
            case 3:
                return new LivekitRtc$UpdateSubscription();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$UpdateSubscription.class) {
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

    public LivekitModels$ParticipantTracks getParticipantTracks(int i10) {
        return (LivekitModels$ParticipantTracks) this.participantTracks_.get(i10);
    }

    public int getParticipantTracksCount() {
        return this.participantTracks_.size();
    }

    public List<LivekitModels$ParticipantTracks> getParticipantTracksList() {
        return this.participantTracks_;
    }

    public V1 getParticipantTracksOrBuilder(int i10) {
        return (V1) this.participantTracks_.get(i10);
    }

    public List<? extends V1> getParticipantTracksOrBuilderList() {
        return this.participantTracks_;
    }

    public boolean getSubscribe() {
        return this.subscribe_;
    }

    public String getTrackSids(int i10) {
        return (String) this.trackSids_.get(i10);
    }

    public AbstractC2534q getTrackSidsBytes(int i10) {
        return AbstractC2534q.y((String) this.trackSids_.get(i10));
    }

    public int getTrackSidsCount() {
        return this.trackSids_.size();
    }

    public List<String> getTrackSidsList() {
        return this.trackSids_;
    }

    public static M3 newBuilder(LivekitRtc$UpdateSubscription livekitRtc$UpdateSubscription) {
        return (M3) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateSubscription);
    }

    public static LivekitRtc$UpdateSubscription parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipantTracks(int i10, LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        livekitModels$ParticipantTracks.getClass();
        ensureParticipantTracksIsMutable();
        this.participantTracks_.add(i10, livekitModels$ParticipantTracks);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$UpdateSubscription parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$UpdateSubscription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
