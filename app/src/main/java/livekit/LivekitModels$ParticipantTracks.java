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
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.U1;
import jh.V1;

/* loaded from: classes2.dex */
public final class LivekitModels$ParticipantTracks extends AbstractC2497d0 implements V1 {
    private static final LivekitModels$ParticipantTracks DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int TRACK_SIDS_FIELD_NUMBER = 2;
    private String participantSid_ = "";
    private AbstractC2535q0 trackSids_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitModels$ParticipantTracks livekitModels$ParticipantTracks = new LivekitModels$ParticipantTracks();
        DEFAULT_INSTANCE = livekitModels$ParticipantTracks;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$ParticipantTracks.class, livekitModels$ParticipantTracks);
    }

    private LivekitModels$ParticipantTracks() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSids(Iterable<String> iterable) {
        ensureTrackSidsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.trackSids_);
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
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSids() {
        this.trackSids_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureTrackSidsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.trackSids_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.trackSids_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$ParticipantTracks getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U1 newBuilder() {
        return (U1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ParticipantTracks parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantTracks parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSid(String str) {
        str.getClass();
        this.participantSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantSid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u021a", new Object[]{"participantSid_", "trackSids_"});
            case 3:
                return new LivekitModels$ParticipantTracks();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$ParticipantTracks.class) {
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

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC2534q getParticipantSidBytes() {
        return AbstractC2534q.y(this.participantSid_);
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

    public static U1 newBuilder(LivekitModels$ParticipantTracks livekitModels$ParticipantTracks) {
        return (U1) DEFAULT_INSTANCE.createBuilder(livekitModels$ParticipantTracks);
    }

    public static LivekitModels$ParticipantTracks parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ParticipantTracks parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$ParticipantTracks parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$ParticipantTracks parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$ParticipantTracks parseFrom(byte[] bArr) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ParticipantTracks parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$ParticipantTracks parseFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantTracks parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ParticipantTracks parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$ParticipantTracks parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$ParticipantTracks) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
