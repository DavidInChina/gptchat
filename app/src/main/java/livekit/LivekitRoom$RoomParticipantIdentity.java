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
import jh.G2;

/* loaded from: classes.dex */
public final class LivekitRoom$RoomParticipantIdentity extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$RoomParticipantIdentity DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    private String room_ = "";
    private String identity_ = "";

    static {
        LivekitRoom$RoomParticipantIdentity livekitRoom$RoomParticipantIdentity = new LivekitRoom$RoomParticipantIdentity();
        DEFAULT_INSTANCE = livekitRoom$RoomParticipantIdentity;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$RoomParticipantIdentity.class, livekitRoom$RoomParticipantIdentity);
    }

    private LivekitRoom$RoomParticipantIdentity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    public static LivekitRoom$RoomParticipantIdentity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static G2 newBuilder() {
        return (G2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$RoomParticipantIdentity parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.identity_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"room_", "identity_"});
            case 3:
                return new LivekitRoom$RoomParticipantIdentity();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$RoomParticipantIdentity.class) {
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

    public String getRoom() {
        return this.room_;
    }

    public AbstractC2534q getRoomBytes() {
        return AbstractC2534q.y(this.room_);
    }

    public static G2 newBuilder(LivekitRoom$RoomParticipantIdentity livekitRoom$RoomParticipantIdentity) {
        return (G2) DEFAULT_INSTANCE.createBuilder(livekitRoom$RoomParticipantIdentity);
    }

    public static LivekitRoom$RoomParticipantIdentity parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(byte[] bArr) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(InputStream inputStream) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$RoomParticipantIdentity parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$RoomParticipantIdentity) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
