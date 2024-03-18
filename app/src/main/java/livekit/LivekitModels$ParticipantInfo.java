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
import jh.AbstractC4046m2;
import jh.Q1;
import jh.R1;
import jh.S1;
import jh.T1;

/* loaded from: classes2.dex */
public final class LivekitModels$ParticipantInfo extends AbstractC2497d0 implements S1 {
    private static final LivekitModels$ParticipantInfo DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int IS_PUBLISHER_FIELD_NUMBER = 13;
    public static final int JOINED_AT_FIELD_NUMBER = 6;
    public static final int METADATA_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 9;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 11;
    public static final int REGION_FIELD_NUMBER = 12;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int STATE_FIELD_NUMBER = 3;
    public static final int TRACKS_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 10;
    private boolean isPublisher_;
    private long joinedAt_;
    private LivekitModels$ParticipantPermission permission_;
    private int state_;
    private int version_;
    private String sid_ = "";
    private String identity_ = "";
    private AbstractC2535q0 tracks_ = AbstractC2497d0.emptyProtobufList();
    private String metadata_ = "";
    private String name_ = "";
    private String region_ = "";

    static {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = new LivekitModels$ParticipantInfo();
        DEFAULT_INSTANCE = livekitModels$ParticipantInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$ParticipantInfo.class, livekitModels$ParticipantInfo);
    }

    private LivekitModels$ParticipantInfo() {
    }

    public static /* synthetic */ void access$7500(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo, String str) {
        livekitModels$ParticipantInfo.setIdentity(str);
    }

    public void addAllTracks(Iterable<? extends LivekitModels$TrackInfo> iterable) {
        ensureTracksIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.tracks_);
    }

    public void addTracks(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(livekitModels$TrackInfo);
    }

    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    public void clearIsPublisher() {
        this.isPublisher_ = false;
    }

    public void clearJoinedAt() {
        this.joinedAt_ = 0L;
    }

    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearPermission() {
        this.permission_ = null;
    }

    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    public void clearState() {
        this.state_ = 0;
    }

    public void clearTracks() {
        this.tracks_ = AbstractC2497d0.emptyProtobufList();
    }

    public void clearVersion() {
        this.version_ = 0;
    }

    private void ensureTracksIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.tracks_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.tracks_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$ParticipantInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergePermission(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission2 = this.permission_;
        if (livekitModels$ParticipantPermission2 != null && livekitModels$ParticipantPermission2 != LivekitModels$ParticipantPermission.getDefaultInstance()) {
            T1 newBuilder = LivekitModels$ParticipantPermission.newBuilder(this.permission_);
            newBuilder.f(livekitModels$ParticipantPermission);
            this.permission_ = (LivekitModels$ParticipantPermission) newBuilder.c();
            return;
        }
        this.permission_ = livekitModels$ParticipantPermission;
    }

    public static Q1 newBuilder() {
        return (Q1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ParticipantInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeTracks(int i10) {
        ensureTracksIsMutable();
        this.tracks_.remove(i10);
    }

    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    public void setIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.identity_ = abstractC2534q.q0();
    }

    public void setIsPublisher(boolean z10) {
        this.isPublisher_ = z10;
    }

    public void setJoinedAt(long j6) {
        this.joinedAt_ = j6;
    }

    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    public void setMetadataBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.metadata_ = abstractC2534q.q0();
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    public void setPermission(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        livekitModels$ParticipantPermission.getClass();
        this.permission_ = livekitModels$ParticipantPermission;
    }

    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    public void setRegionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.region_ = abstractC2534q.q0();
    }

    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    public void setSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sid_ = abstractC2534q.q0();
    }

    public void setState(R1 r12) {
        this.state_ = r12.a();
    }

    public void setStateValue(int i10) {
        this.state_ = i10;
    }

    public void setTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.set(i10, livekitModels$TrackInfo);
    }

    public void setVersion(int i10) {
        this.version_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\r\u000b\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\f\u0004\u001b\u0005\u0208\u0006\u0002\t\u0208\n\u000b\u000b\t\f\u0208\r\u0007", new Object[]{"sid_", "identity_", "state_", "tracks_", LivekitModels$TrackInfo.class, "metadata_", "joinedAt_", "name_", "version_", "permission_", "region_", "isPublisher_"});
            case 3:
                return new LivekitModels$ParticipantInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$ParticipantInfo.class) {
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

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC2534q getIdentityBytes() {
        return AbstractC2534q.y(this.identity_);
    }

    public boolean getIsPublisher() {
        return this.isPublisher_;
    }

    public long getJoinedAt() {
        return this.joinedAt_;
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC2534q getMetadataBytes() {
        return AbstractC2534q.y(this.metadata_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public LivekitModels$ParticipantPermission getPermission() {
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission = this.permission_;
        if (livekitModels$ParticipantPermission == null) {
            return LivekitModels$ParticipantPermission.getDefaultInstance();
        }
        return livekitModels$ParticipantPermission;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC2534q getRegionBytes() {
        return AbstractC2534q.y(this.region_);
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC2534q getSidBytes() {
        return AbstractC2534q.y(this.sid_);
    }

    public R1 getState() {
        R1 r12;
        int i10 = this.state_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        r12 = null;
                    } else {
                        r12 = R1.DISCONNECTED;
                    }
                } else {
                    r12 = R1.ACTIVE;
                }
            } else {
                r12 = R1.JOINED;
            }
        } else {
            r12 = R1.JOINING;
        }
        if (r12 == null) {
            return R1.UNRECOGNIZED;
        }
        return r12;
    }

    public int getStateValue() {
        return this.state_;
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

    public int getVersion() {
        return this.version_;
    }

    public boolean hasPermission() {
        if (this.permission_ != null) {
            return true;
        }
        return false;
    }

    public static Q1 newBuilder(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        return (Q1) DEFAULT_INSTANCE.createBuilder(livekitModels$ParticipantInfo);
    }

    public static LivekitModels$ParticipantInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ParticipantInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public void addTracks(int i10, LivekitModels$TrackInfo livekitModels$TrackInfo) {
        livekitModels$TrackInfo.getClass();
        ensureTracksIsMutable();
        this.tracks_.add(i10, livekitModels$TrackInfo);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$ParticipantInfo parseFrom(byte[] bArr) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ParticipantInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$ParticipantInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$ParticipantInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$ParticipantInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
