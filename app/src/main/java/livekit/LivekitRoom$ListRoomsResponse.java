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
import jh.AbstractC3996c2;
import jh.B2;

/* loaded from: classes.dex */
public final class LivekitRoom$ListRoomsResponse extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$ListRoomsResponse DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOMS_FIELD_NUMBER = 1;
    private AbstractC2535q0 rooms_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRoom$ListRoomsResponse livekitRoom$ListRoomsResponse = new LivekitRoom$ListRoomsResponse();
        DEFAULT_INSTANCE = livekitRoom$ListRoomsResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$ListRoomsResponse.class, livekitRoom$ListRoomsResponse);
    }

    private LivekitRoom$ListRoomsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRooms(Iterable<? extends LivekitModels$Room> iterable) {
        ensureRoomsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.rooms_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRooms(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        ensureRoomsIsMutable();
        this.rooms_.add(livekitModels$Room);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRooms() {
        this.rooms_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureRoomsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.rooms_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.rooms_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRoom$ListRoomsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static B2 newBuilder() {
        return (B2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$ListRoomsResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRooms(int i10) {
        ensureRoomsIsMutable();
        this.rooms_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRooms(int i10, LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        ensureRoomsIsMutable();
        this.rooms_.set(i10, livekitModels$Room);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rooms_", LivekitModels$Room.class});
            case 3:
                return new LivekitRoom$ListRoomsResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$ListRoomsResponse.class) {
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

    public LivekitModels$Room getRooms(int i10) {
        return (LivekitModels$Room) this.rooms_.get(i10);
    }

    public int getRoomsCount() {
        return this.rooms_.size();
    }

    public List<LivekitModels$Room> getRoomsList() {
        return this.rooms_;
    }

    public AbstractC3996c2 getRoomsOrBuilder(int i10) {
        return (AbstractC3996c2) this.rooms_.get(i10);
    }

    public List<? extends AbstractC3996c2> getRoomsOrBuilderList() {
        return this.rooms_;
    }

    public static B2 newBuilder(LivekitRoom$ListRoomsResponse livekitRoom$ListRoomsResponse) {
        return (B2) DEFAULT_INSTANCE.createBuilder(livekitRoom$ListRoomsResponse);
    }

    public static LivekitRoom$ListRoomsResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRooms(int i10, LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        ensureRoomsIsMutable();
        this.rooms_.add(i10, livekitModels$Room);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(byte[] bArr) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$ListRoomsResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$ListRoomsResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
