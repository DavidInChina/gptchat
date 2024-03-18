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
import jh.C4036k2;

/* loaded from: classes.dex */
public final class LivekitModels$TimedVersion extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$TimedVersion DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TICKS_FIELD_NUMBER = 2;
    public static final int UNIX_MICRO_FIELD_NUMBER = 1;
    private int ticks_;
    private long unixMicro_;

    static {
        LivekitModels$TimedVersion livekitModels$TimedVersion = new LivekitModels$TimedVersion();
        DEFAULT_INSTANCE = livekitModels$TimedVersion;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$TimedVersion.class, livekitModels$TimedVersion);
    }

    private LivekitModels$TimedVersion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTicks() {
        this.ticks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnixMicro() {
        this.unixMicro_ = 0L;
    }

    public static LivekitModels$TimedVersion getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4036k2 newBuilder() {
        return (C4036k2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$TimedVersion parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TimedVersion parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicks(int i10) {
        this.ticks_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnixMicro(long j6) {
        this.unixMicro_ = j6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"unixMicro_", "ticks_"});
            case 3:
                return new LivekitModels$TimedVersion();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$TimedVersion.class) {
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

    public int getTicks() {
        return this.ticks_;
    }

    public long getUnixMicro() {
        return this.unixMicro_;
    }

    public static C4036k2 newBuilder(LivekitModels$TimedVersion livekitModels$TimedVersion) {
        return (C4036k2) DEFAULT_INSTANCE.createBuilder(livekitModels$TimedVersion);
    }

    public static LivekitModels$TimedVersion parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$TimedVersion parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$TimedVersion parseFrom(byte[] bArr) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$TimedVersion parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$TimedVersion parseFrom(InputStream inputStream) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TimedVersion parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$TimedVersion parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$TimedVersion) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
