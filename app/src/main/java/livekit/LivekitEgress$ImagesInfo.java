package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.AbstractC4009f0;
import jh.C4004e0;

/* loaded from: classes2.dex */
public final class LivekitEgress$ImagesInfo extends AbstractC2497d0 implements AbstractC4009f0 {
    private static final LivekitEgress$ImagesInfo DEFAULT_INSTANCE;
    public static final int ENDED_AT_FIELD_NUMBER = 3;
    public static final int IMAGE_COUNT_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int STARTED_AT_FIELD_NUMBER = 2;
    private long endedAt_;
    private long imageCount_;
    private long startedAt_;

    static {
        LivekitEgress$ImagesInfo livekitEgress$ImagesInfo = new LivekitEgress$ImagesInfo();
        DEFAULT_INSTANCE = livekitEgress$ImagesInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$ImagesInfo.class, livekitEgress$ImagesInfo);
    }

    private LivekitEgress$ImagesInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageCount() {
        this.imageCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    public static LivekitEgress$ImagesInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4004e0 newBuilder() {
        return (C4004e0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ImagesInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ImagesInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j6) {
        this.endedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageCount(long j6) {
        this.imageCount_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j6) {
        this.startedAt_ = j6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002", new Object[]{"imageCount_", "startedAt_", "endedAt_"});
            case 3:
                return new LivekitEgress$ImagesInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$ImagesInfo.class) {
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

    public long getEndedAt() {
        return this.endedAt_;
    }

    public long getImageCount() {
        return this.imageCount_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public static C4004e0 newBuilder(LivekitEgress$ImagesInfo livekitEgress$ImagesInfo) {
        return (C4004e0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ImagesInfo);
    }

    public static LivekitEgress$ImagesInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ImagesInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$ImagesInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ImagesInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$ImagesInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ImagesInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$ImagesInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$ImagesInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
