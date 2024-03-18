package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C3991b2;
import jh.C4017g3;

/* loaded from: classes.dex */
public final class LivekitRtc$RoomUpdate extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$RoomUpdate DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    private LivekitModels$Room room_;

    static {
        LivekitRtc$RoomUpdate livekitRtc$RoomUpdate = new LivekitRtc$RoomUpdate();
        DEFAULT_INSTANCE = livekitRtc$RoomUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$RoomUpdate.class, livekitRtc$RoomUpdate);
    }

    private LivekitRtc$RoomUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    public static LivekitRtc$RoomUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 != null && livekitModels$Room2 != LivekitModels$Room.getDefaultInstance()) {
            C3991b2 newBuilder = LivekitModels$Room.newBuilder(this.room_);
            newBuilder.f(livekitModels$Room);
            this.room_ = (LivekitModels$Room) newBuilder.c();
            return;
        }
        this.room_ = livekitModels$Room;
    }

    public static C4017g3 newBuilder() {
        return (C4017g3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RoomUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RoomUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"room_"});
            case 3:
                return new LivekitRtc$RoomUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$RoomUpdate.class) {
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

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        if (livekitModels$Room == null) {
            return LivekitModels$Room.getDefaultInstance();
        }
        return livekitModels$Room;
    }

    public boolean hasRoom() {
        if (this.room_ != null) {
            return true;
        }
        return false;
    }

    public static C4017g3 newBuilder(LivekitRtc$RoomUpdate livekitRtc$RoomUpdate) {
        return (C4017g3) DEFAULT_INSTANCE.createBuilder(livekitRtc$RoomUpdate);
    }

    public static LivekitRtc$RoomUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$RoomUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$RoomUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RoomUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$RoomUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RoomUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$RoomUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$RoomUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
