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
import jh.C3992b3;

/* loaded from: classes2.dex */
public final class LivekitRtc$Pong extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$Pong DEFAULT_INSTANCE;
    public static final int LAST_PING_TIMESTAMP_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long lastPingTimestamp_;
    private long timestamp_;

    static {
        LivekitRtc$Pong livekitRtc$Pong = new LivekitRtc$Pong();
        DEFAULT_INSTANCE = livekitRtc$Pong;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$Pong.class, livekitRtc$Pong);
    }

    private LivekitRtc$Pong() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastPingTimestamp() {
        this.lastPingTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static LivekitRtc$Pong getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3992b3 newBuilder() {
        return (C3992b3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$Pong parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$Pong parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastPingTimestamp(long j6) {
        this.lastPingTimestamp_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j6) {
        this.timestamp_ = j6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"lastPingTimestamp_", "timestamp_"});
            case 3:
                return new LivekitRtc$Pong();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$Pong.class) {
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

    public long getLastPingTimestamp() {
        return this.lastPingTimestamp_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public static C3992b3 newBuilder(LivekitRtc$Pong livekitRtc$Pong) {
        return (C3992b3) DEFAULT_INSTANCE.createBuilder(livekitRtc$Pong);
    }

    public static LivekitRtc$Pong parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$Pong parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$Pong parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$Pong parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$Pong parseFrom(byte[] bArr) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$Pong parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$Pong parseFrom(InputStream inputStream) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$Pong parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$Pong parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$Pong parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$Pong) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
