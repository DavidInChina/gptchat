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
import jh.H2;
import jh.I1;

/* loaded from: classes2.dex */
public final class LivekitRoom$SendDataRequest extends AbstractC2497d0 implements N0 {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final LivekitRoom$SendDataRequest DEFAULT_INSTANCE;
    public static final int DESTINATION_IDENTITIES_FIELD_NUMBER = 6;
    public static final int DESTINATION_SIDS_FIELD_NUMBER = 4;
    public static final int KIND_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int TOPIC_FIELD_NUMBER = 5;
    private int bitField0_;
    private int kind_;
    private String room_ = "";
    private AbstractC2534q data_ = AbstractC2534q.f27581Z;
    private AbstractC2535q0 destinationSids_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 destinationIdentities_ = AbstractC2497d0.emptyProtobufList();
    private String topic_ = "";

    static {
        LivekitRoom$SendDataRequest livekitRoom$SendDataRequest = new LivekitRoom$SendDataRequest();
        DEFAULT_INSTANCE = livekitRoom$SendDataRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$SendDataRequest.class, livekitRoom$SendDataRequest);
    }

    private LivekitRoom$SendDataRequest() {
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
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
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
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
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

    public static LivekitRoom$SendDataRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static H2 newBuilder() {
        return (H2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$SendDataRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$SendDataRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(AbstractC2534q abstractC2534q) {
        abstractC2534q.getClass();
        this.data_ = abstractC2534q;
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
    public void setKind(I1 i12) {
        this.kind_ = i12.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.room_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0208\u0002\n\u0003\f\u0004\u021a\u0005\u1208\u0000\u0006\u021a", new Object[]{"bitField0_", "room_", "data_", "kind_", "destinationSids_", "topic_", "destinationIdentities_"});
            case 3:
                return new LivekitRoom$SendDataRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$SendDataRequest.class) {
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

    public AbstractC2534q getData() {
        return this.data_;
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

    @Deprecated
    public String getDestinationSids(int i10) {
        return (String) this.destinationSids_.get(i10);
    }

    @Deprecated
    public AbstractC2534q getDestinationSidsBytes(int i10) {
        return AbstractC2534q.y((String) this.destinationSids_.get(i10));
    }

    @Deprecated
    public int getDestinationSidsCount() {
        return this.destinationSids_.size();
    }

    @Deprecated
    public List<String> getDestinationSidsList() {
        return this.destinationSids_;
    }

    public I1 getKind() {
        I1 i12;
        int i10 = this.kind_;
        if (i10 != 0) {
            if (i10 != 1) {
                i12 = null;
            } else {
                i12 = I1.LOSSY;
            }
        } else {
            i12 = I1.RELIABLE;
        }
        if (i12 == null) {
            return I1.UNRECOGNIZED;
        }
        return i12;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC2534q getRoomBytes() {
        return AbstractC2534q.y(this.room_);
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

    public static H2 newBuilder(LivekitRoom$SendDataRequest livekitRoom$SendDataRequest) {
        return (H2) DEFAULT_INSTANCE.createBuilder(livekitRoom$SendDataRequest);
    }

    public static LivekitRoom$SendDataRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$SendDataRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$SendDataRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$SendDataRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$SendDataRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$SendDataRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$SendDataRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$SendDataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
