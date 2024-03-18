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
import jh.AbstractC3974B;
import jh.C3973A;

/* loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsVideoLayer extends AbstractC2497d0 implements AbstractC3974B {
    public static final int BYTES_FIELD_NUMBER = 3;
    private static final LivekitAnalytics$AnalyticsVideoLayer DEFAULT_INSTANCE;
    public static final int FRAMES_FIELD_NUMBER = 4;
    public static final int LAYER_FIELD_NUMBER = 1;
    public static final int PACKETS_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER;
    private long bytes_;
    private int frames_;
    private int layer_;
    private int packets_;

    static {
        LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer = new LivekitAnalytics$AnalyticsVideoLayer();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsVideoLayer;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsVideoLayer.class, livekitAnalytics$AnalyticsVideoLayer);
    }

    private LivekitAnalytics$AnalyticsVideoLayer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytes() {
        this.bytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrames() {
        this.frames_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayer() {
        this.layer_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackets() {
        this.packets_ = 0;
    }

    public static LivekitAnalytics$AnalyticsVideoLayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3973A newBuilder() {
        return (C3973A) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytes(long j6) {
        this.bytes_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrames(int i10) {
        this.frames_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayer(int i10) {
        this.layer_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackets(int i10) {
        this.packets_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u000b\u0003\u0003\u0004\u000b", new Object[]{"layer_", "packets_", "bytes_", "frames_"});
            case 3:
                return new LivekitAnalytics$AnalyticsVideoLayer();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsVideoLayer.class) {
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

    public long getBytes() {
        return this.bytes_;
    }

    public int getFrames() {
        return this.frames_;
    }

    public int getLayer() {
        return this.layer_;
    }

    public int getPackets() {
        return this.packets_;
    }

    public static C3973A newBuilder(LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        return (C3973A) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsVideoLayer);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsVideoLayer parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsVideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
