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
import jh.A2;

/* loaded from: classes2.dex */
public final class LivekitRoom$ListRoomsRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$ListRoomsRequest DEFAULT_INSTANCE;
    public static final int NAMES_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private AbstractC2535q0 names_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRoom$ListRoomsRequest livekitRoom$ListRoomsRequest = new LivekitRoom$ListRoomsRequest();
        DEFAULT_INSTANCE = livekitRoom$ListRoomsRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$ListRoomsRequest.class, livekitRoom$ListRoomsRequest);
    }

    private LivekitRoom$ListRoomsRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNames(Iterable<String> iterable) {
        ensureNamesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.names_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNames(String str) {
        str.getClass();
        ensureNamesIsMutable();
        this.names_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNamesBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureNamesIsMutable();
        this.names_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNames() {
        this.names_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureNamesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.names_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.names_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRoom$ListRoomsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static A2 newBuilder() {
        return (A2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$ListRoomsRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNames(int i10, String str) {
        str.getClass();
        ensureNamesIsMutable();
        this.names_.set(i10, str);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u021a", new Object[]{"names_"});
            case 3:
                return new LivekitRoom$ListRoomsRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$ListRoomsRequest.class) {
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

    public String getNames(int i10) {
        return (String) this.names_.get(i10);
    }

    public AbstractC2534q getNamesBytes(int i10) {
        return AbstractC2534q.y((String) this.names_.get(i10));
    }

    public int getNamesCount() {
        return this.names_.size();
    }

    public List<String> getNamesList() {
        return this.names_;
    }

    public static A2 newBuilder(LivekitRoom$ListRoomsRequest livekitRoom$ListRoomsRequest) {
        return (A2) DEFAULT_INSTANCE.createBuilder(livekitRoom$ListRoomsRequest);
    }

    public static LivekitRoom$ListRoomsRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$ListRoomsRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$ListRoomsRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
