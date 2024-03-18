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
import jh.K2;

/* loaded from: classes.dex */
public final class LivekitRoom$UpdateRoomMetadataRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$UpdateRoomMetadataRequest DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    private String room_ = "";
    private String metadata_ = "";

    static {
        LivekitRoom$UpdateRoomMetadataRequest livekitRoom$UpdateRoomMetadataRequest = new LivekitRoom$UpdateRoomMetadataRequest();
        DEFAULT_INSTANCE = livekitRoom$UpdateRoomMetadataRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$UpdateRoomMetadataRequest.class, livekitRoom$UpdateRoomMetadataRequest);
    }

    private LivekitRoom$UpdateRoomMetadataRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitRoom$UpdateRoomMetadataRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static K2 newBuilder() {
        return (K2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.room_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"room_", "metadata_"});
            case 3:
                return new LivekitRoom$UpdateRoomMetadataRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$UpdateRoomMetadataRequest.class) {
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

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC2534q getMetadataBytes() {
        return AbstractC2534q.y(this.metadata_);
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC2534q getRoomBytes() {
        return AbstractC2534q.y(this.room_);
    }

    public static K2 newBuilder(LivekitRoom$UpdateRoomMetadataRequest livekitRoom$UpdateRoomMetadataRequest) {
        return (K2) DEFAULT_INSTANCE.createBuilder(livekitRoom$UpdateRoomMetadataRequest);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$UpdateRoomMetadataRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$UpdateRoomMetadataRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
