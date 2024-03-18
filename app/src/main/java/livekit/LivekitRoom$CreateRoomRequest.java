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
import jh.C4090v2;
import jh.F2;

/* loaded from: classes2.dex */
public final class LivekitRoom$CreateRoomRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$CreateRoomRequest DEFAULT_INSTANCE;
    public static final int EGRESS_FIELD_NUMBER = 6;
    public static final int EMPTY_TIMEOUT_FIELD_NUMBER = 2;
    public static final int MAX_PARTICIPANTS_FIELD_NUMBER = 3;
    public static final int MAX_PLAYOUT_DELAY_FIELD_NUMBER = 8;
    public static final int METADATA_FIELD_NUMBER = 5;
    public static final int MIN_PLAYOUT_DELAY_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NODE_ID_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SYNC_STREAMS_FIELD_NUMBER = 9;
    private LivekitRoom$RoomEgress egress_;
    private int emptyTimeout_;
    private int maxParticipants_;
    private int maxPlayoutDelay_;
    private int minPlayoutDelay_;
    private boolean syncStreams_;
    private String name_ = "";
    private String nodeId_ = "";
    private String metadata_ = "";

    static {
        LivekitRoom$CreateRoomRequest livekitRoom$CreateRoomRequest = new LivekitRoom$CreateRoomRequest();
        DEFAULT_INSTANCE = livekitRoom$CreateRoomRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$CreateRoomRequest.class, livekitRoom$CreateRoomRequest);
    }

    private LivekitRoom$CreateRoomRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgress() {
        this.egress_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyTimeout() {
        this.emptyTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxParticipants() {
        this.maxParticipants_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPlayoutDelay() {
        this.maxPlayoutDelay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinPlayoutDelay() {
        this.minPlayoutDelay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = getDefaultInstance().getNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyncStreams() {
        this.syncStreams_ = false;
    }

    public static LivekitRoom$CreateRoomRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEgress(LivekitRoom$RoomEgress livekitRoom$RoomEgress) {
        livekitRoom$RoomEgress.getClass();
        LivekitRoom$RoomEgress livekitRoom$RoomEgress2 = this.egress_;
        if (livekitRoom$RoomEgress2 != null && livekitRoom$RoomEgress2 != LivekitRoom$RoomEgress.getDefaultInstance()) {
            F2 newBuilder = LivekitRoom$RoomEgress.newBuilder(this.egress_);
            newBuilder.f(livekitRoom$RoomEgress);
            this.egress_ = (LivekitRoom$RoomEgress) newBuilder.c();
            return;
        }
        this.egress_ = livekitRoom$RoomEgress;
    }

    public static C4090v2 newBuilder() {
        return (C4090v2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$CreateRoomRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgress(LivekitRoom$RoomEgress livekitRoom$RoomEgress) {
        livekitRoom$RoomEgress.getClass();
        this.egress_ = livekitRoom$RoomEgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyTimeout(int i10) {
        this.emptyTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxParticipants(int i10) {
        this.maxParticipants_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPlayoutDelay(int i10) {
        this.maxPlayoutDelay_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.metadata_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinPlayoutDelay(int i10) {
        this.minPlayoutDelay_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(String str) {
        str.getClass();
        this.nodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.nodeId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyncStreams(boolean z10) {
        this.syncStreams_ = z10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u000b\u0003\u000b\u0004\u0208\u0005\u0208\u0006\t\u0007\u000b\b\u000b\t\u0007", new Object[]{"name_", "emptyTimeout_", "maxParticipants_", "nodeId_", "metadata_", "egress_", "minPlayoutDelay_", "maxPlayoutDelay_", "syncStreams_"});
            case 3:
                return new LivekitRoom$CreateRoomRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$CreateRoomRequest.class) {
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

    public LivekitRoom$RoomEgress getEgress() {
        LivekitRoom$RoomEgress livekitRoom$RoomEgress = this.egress_;
        if (livekitRoom$RoomEgress == null) {
            return LivekitRoom$RoomEgress.getDefaultInstance();
        }
        return livekitRoom$RoomEgress;
    }

    public int getEmptyTimeout() {
        return this.emptyTimeout_;
    }

    public int getMaxParticipants() {
        return this.maxParticipants_;
    }

    public int getMaxPlayoutDelay() {
        return this.maxPlayoutDelay_;
    }

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC2534q getMetadataBytes() {
        return AbstractC2534q.y(this.metadata_);
    }

    public int getMinPlayoutDelay() {
        return this.minPlayoutDelay_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public String getNodeId() {
        return this.nodeId_;
    }

    public AbstractC2534q getNodeIdBytes() {
        return AbstractC2534q.y(this.nodeId_);
    }

    public boolean getSyncStreams() {
        return this.syncStreams_;
    }

    public boolean hasEgress() {
        if (this.egress_ != null) {
            return true;
        }
        return false;
    }

    public static C4090v2 newBuilder(LivekitRoom$CreateRoomRequest livekitRoom$CreateRoomRequest) {
        return (C4090v2) DEFAULT_INSTANCE.createBuilder(livekitRoom$CreateRoomRequest);
    }

    public static LivekitRoom$CreateRoomRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$CreateRoomRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$CreateRoomRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
