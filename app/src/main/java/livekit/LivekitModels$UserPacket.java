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
import jh.C4061p2;

/* loaded from: classes2.dex */
public final class LivekitModels$UserPacket extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$UserPacket DEFAULT_INSTANCE;
    public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 6;
    public static final int DESTINATION_SIDS_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_IDENTITY_FIELD_NUMBER = 5;
    public static final int PARTICIPANT_SID_FIELD_NUMBER = 1;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    public static final int TOPIC_FIELD_NUMBER = 4;
    private int bitField0_;
    private String participantSid_ = "";
    private String participantIdentity_ = "";
    private AbstractC2534q payload_ = AbstractC2534q.f27581Z;
    private AbstractC2535q0 destinationSids_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 destinationIdentities_ = AbstractC2497d0.emptyProtobufList();
    private String topic_ = "";

    static {
        LivekitModels$UserPacket livekitModels$UserPacket = new LivekitModels$UserPacket();
        DEFAULT_INSTANCE = livekitModels$UserPacket;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$UserPacket.class, livekitModels$UserPacket);
    }

    private LivekitModels$UserPacket() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationIdentities(Iterable<String> iterable) {
        ensureDestinationIdentitiesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.destinationIdentities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestinationSids(Iterable<String> iterable) {
        ensureDestinationSidsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.destinationSids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationIdentities(String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationIdentitiesBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationSids(String str) {
        str.getClass();
        ensureDestinationSidsIsMutable();
        this.destinationSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestinationSidsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureDestinationSidsIsMutable();
        this.destinationSids_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationIdentities() {
        this.destinationIdentities_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationSids() {
        this.destinationSids_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantIdentity() {
        this.participantIdentity_ = getDefaultInstance().getParticipantIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantSid() {
        this.participantSid_ = getDefaultInstance().getParticipantSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = getDefaultInstance().getPayload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTopic() {
        this.bitField0_ &= -2;
        this.topic_ = getDefaultInstance().getTopic();
    }

    private void ensureDestinationIdentitiesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.destinationIdentities_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.destinationIdentities_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureDestinationSidsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.destinationSids_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.destinationSids_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$UserPacket getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4061p2 newBuilder() {
        return (C4061p2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$UserPacket parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$UserPacket parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationIdentities(int i10, String str) {
        str.getClass();
        ensureDestinationIdentitiesIsMutable();
        this.destinationIdentities_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationSids(int i10, String str) {
        str.getClass();
        ensureDestinationSidsIsMutable();
        this.destinationSids_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentity(String str) {
        str.getClass();
        this.participantIdentity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantIdentity_ = abstractC2534q.q0();
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
    public void setPayload(AbstractC2534q abstractC2534q) {
        abstractC2534q.getClass();
        this.payload_ = abstractC2534q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopic(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.topic_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopicBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.topic_ = abstractC2534q.q0();
        this.bitField0_ |= 1;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0208\u0002\n\u0003\u021a\u0004\u1208\u0000\u0005\u0208\u0006\u021a", new Object[]{"bitField0_", "participantSid_", "payload_", "destinationSids_", "topic_", "participantIdentity_", "destinationIdentities_"});
            case 3:
                return new LivekitModels$UserPacket();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$UserPacket.class) {
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

    public String getDestinationIdentities(int i10) {
        return (String) this.destinationIdentities_.get(i10);
    }

    public AbstractC2534q getDestinationIdentitiesBytes(int i10) {
        return AbstractC2534q.y((String) this.destinationIdentities_.get(i10));
    }

    public int getDestinationIdentitiesCount() {
        return this.destinationIdentities_.size();
    }

    public List<String> getDestinationIdentitiesList() {
        return this.destinationIdentities_;
    }

    public String getDestinationSids(int i10) {
        return (String) this.destinationSids_.get(i10);
    }

    public AbstractC2534q getDestinationSidsBytes(int i10) {
        return AbstractC2534q.y((String) this.destinationSids_.get(i10));
    }

    public int getDestinationSidsCount() {
        return this.destinationSids_.size();
    }

    public List<String> getDestinationSidsList() {
        return this.destinationSids_;
    }

    public String getParticipantIdentity() {
        return this.participantIdentity_;
    }

    public AbstractC2534q getParticipantIdentityBytes() {
        return AbstractC2534q.y(this.participantIdentity_);
    }

    public String getParticipantSid() {
        return this.participantSid_;
    }

    public AbstractC2534q getParticipantSidBytes() {
        return AbstractC2534q.y(this.participantSid_);
    }

    public AbstractC2534q getPayload() {
        return this.payload_;
    }

    public String getTopic() {
        return this.topic_;
    }

    public AbstractC2534q getTopicBytes() {
        return AbstractC2534q.y(this.topic_);
    }

    public boolean hasTopic() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static C4061p2 newBuilder(LivekitModels$UserPacket livekitModels$UserPacket) {
        return (C4061p2) DEFAULT_INSTANCE.createBuilder(livekitModels$UserPacket);
    }

    public static LivekitModels$UserPacket parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$UserPacket parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$UserPacket parseFrom(byte[] bArr) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$UserPacket parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$UserPacket parseFrom(InputStream inputStream) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$UserPacket parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$UserPacket parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$UserPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
