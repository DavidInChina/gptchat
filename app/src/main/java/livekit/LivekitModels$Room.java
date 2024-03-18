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
import jh.AbstractC3996c2;
import jh.C3991b2;
import jh.E1;

/* loaded from: classes2.dex */
public final class LivekitModels$Room extends AbstractC2497d0 implements AbstractC3996c2 {
    public static final int ACTIVE_RECORDING_FIELD_NUMBER = 10;
    public static final int CREATION_TIME_FIELD_NUMBER = 5;
    private static final LivekitModels$Room DEFAULT_INSTANCE;
    public static final int EMPTY_TIMEOUT_FIELD_NUMBER = 3;
    public static final int ENABLED_CODECS_FIELD_NUMBER = 7;
    public static final int MAX_PARTICIPANTS_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUM_PARTICIPANTS_FIELD_NUMBER = 9;
    public static final int NUM_PUBLISHERS_FIELD_NUMBER = 11;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int TURN_PASSWORD_FIELD_NUMBER = 6;
    private boolean activeRecording_;
    private long creationTime_;
    private int emptyTimeout_;
    private int maxParticipants_;
    private int numParticipants_;
    private int numPublishers_;
    private String sid_ = "";
    private String name_ = "";
    private String turnPassword_ = "";
    private AbstractC2535q0 enabledCodecs_ = AbstractC2497d0.emptyProtobufList();
    private String metadata_ = "";

    static {
        LivekitModels$Room livekitModels$Room = new LivekitModels$Room();
        DEFAULT_INSTANCE = livekitModels$Room;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$Room.class, livekitModels$Room);
    }

    private LivekitModels$Room() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnabledCodecs(Iterable<? extends LivekitModels$Codec> iterable) {
        ensureEnabledCodecsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.enabledCodecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledCodecs(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActiveRecording() {
        this.activeRecording_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationTime() {
        this.creationTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmptyTimeout() {
        this.emptyTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabledCodecs() {
        this.enabledCodecs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxParticipants() {
        this.maxParticipants_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumParticipants() {
        this.numParticipants_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumPublishers() {
        this.numPublishers_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTurnPassword() {
        this.turnPassword_ = getDefaultInstance().getTurnPassword();
    }

    private void ensureEnabledCodecsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.enabledCodecs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.enabledCodecs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$Room getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3991b2 newBuilder() {
        return (C3991b2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$Room parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$Room) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Room parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnabledCodecs(int i10) {
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActiveRecording(boolean z10) {
        this.activeRecording_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationTime(long j6) {
        this.creationTime_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmptyTimeout(int i10) {
        this.emptyTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabledCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.set(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxParticipants(int i10) {
        this.maxParticipants_ = i10;
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
    public void setNumParticipants(int i10) {
        this.numParticipants_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumPublishers(int i10) {
        this.numPublishers_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sid_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnPassword(String str) {
        str.getClass();
        this.turnPassword_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTurnPasswordBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.turnPassword_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u000b\u0005\u0002\u0006\u0208\u0007\u001b\b\u0208\t\u000b\n\u0007\u000b\u000b", new Object[]{"sid_", "name_", "emptyTimeout_", "maxParticipants_", "creationTime_", "turnPassword_", "enabledCodecs_", LivekitModels$Codec.class, "metadata_", "numParticipants_", "activeRecording_", "numPublishers_"});
            case 3:
                return new LivekitModels$Room();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$Room.class) {
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

    public boolean getActiveRecording() {
        return this.activeRecording_;
    }

    public long getCreationTime() {
        return this.creationTime_;
    }

    public int getEmptyTimeout() {
        return this.emptyTimeout_;
    }

    public LivekitModels$Codec getEnabledCodecs(int i10) {
        return (LivekitModels$Codec) this.enabledCodecs_.get(i10);
    }

    public int getEnabledCodecsCount() {
        return this.enabledCodecs_.size();
    }

    public List<LivekitModels$Codec> getEnabledCodecsList() {
        return this.enabledCodecs_;
    }

    public E1 getEnabledCodecsOrBuilder(int i10) {
        return (E1) this.enabledCodecs_.get(i10);
    }

    public List<? extends E1> getEnabledCodecsOrBuilderList() {
        return this.enabledCodecs_;
    }

    public int getMaxParticipants() {
        return this.maxParticipants_;
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

    public int getNumParticipants() {
        return this.numParticipants_;
    }

    public int getNumPublishers() {
        return this.numPublishers_;
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC2534q getSidBytes() {
        return AbstractC2534q.y(this.sid_);
    }

    public String getTurnPassword() {
        return this.turnPassword_;
    }

    public AbstractC2534q getTurnPasswordBytes() {
        return AbstractC2534q.y(this.turnPassword_);
    }

    public static C3991b2 newBuilder(LivekitModels$Room livekitModels$Room) {
        return (C3991b2) DEFAULT_INSTANCE.createBuilder(livekitModels$Room);
    }

    public static LivekitModels$Room parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$Room) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$Room parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$Room parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnabledCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureEnabledCodecsIsMutable();
        this.enabledCodecs_.add(i10, livekitModels$Codec);
    }

    public static LivekitModels$Room parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$Room parseFrom(byte[] bArr) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$Room parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$Room parseFrom(InputStream inputStream) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Room parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$Room parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$Room parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$Room) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
