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
import jh.AbstractC4080t2;
import jh.C4075s2;
import jh.EnumC4085u2;

/* loaded from: classes2.dex */
public final class LivekitModels$VideoLayer extends AbstractC2497d0 implements AbstractC4080t2 {
    public static final int BITRATE_FIELD_NUMBER = 4;
    private static final LivekitModels$VideoLayer DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    public static final int SSRC_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int bitrate_;
    private int height_;
    private int quality_;
    private int ssrc_;
    private int width_;

    static {
        LivekitModels$VideoLayer livekitModels$VideoLayer = new LivekitModels$VideoLayer();
        DEFAULT_INSTANCE = livekitModels$VideoLayer;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$VideoLayer.class, livekitModels$VideoLayer);
    }

    private LivekitModels$VideoLayer() {
    }

    public static /* synthetic */ void access$17900(LivekitModels$VideoLayer livekitModels$VideoLayer, EnumC4085u2 enumC4085u2) {
        livekitModels$VideoLayer.setQuality(enumC4085u2);
    }

    public static /* synthetic */ void access$18100(LivekitModels$VideoLayer livekitModels$VideoLayer, int i10) {
        livekitModels$VideoLayer.setWidth(i10);
    }

    public static /* synthetic */ void access$18300(LivekitModels$VideoLayer livekitModels$VideoLayer, int i10) {
        livekitModels$VideoLayer.setHeight(i10);
    }

    public static /* synthetic */ void access$18500(LivekitModels$VideoLayer livekitModels$VideoLayer, int i10) {
        livekitModels$VideoLayer.setBitrate(i10);
    }

    public static /* synthetic */ void access$18700(LivekitModels$VideoLayer livekitModels$VideoLayer, int i10) {
        livekitModels$VideoLayer.setSsrc(i10);
    }

    public void clearBitrate() {
        this.bitrate_ = 0;
    }

    public void clearHeight() {
        this.height_ = 0;
    }

    public void clearQuality() {
        this.quality_ = 0;
    }

    public void clearSsrc() {
        this.ssrc_ = 0;
    }

    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitModels$VideoLayer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4075s2 newBuilder() {
        return (C4075s2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$VideoLayer parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoLayer parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setBitrate(int i10) {
        this.bitrate_ = i10;
    }

    public void setHeight(int i10) {
        this.height_ = i10;
    }

    public void setQuality(EnumC4085u2 enumC4085u2) {
        this.quality_ = enumC4085u2.a();
    }

    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    public void setSsrc(int i10) {
        this.ssrc_ = i10;
    }

    public void setWidth(int i10) {
        this.width_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"quality_", "width_", "height_", "bitrate_", "ssrc_"});
            case 3:
                return new LivekitModels$VideoLayer();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$VideoLayer.class) {
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

    public int getBitrate() {
        return this.bitrate_;
    }

    public int getHeight() {
        return this.height_;
    }

    public EnumC4085u2 getQuality() {
        EnumC4085u2 b10 = EnumC4085u2.b(this.quality_);
        if (b10 == null) {
            return EnumC4085u2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public int getSsrc() {
        return this.ssrc_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static C4075s2 newBuilder(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        return (C4075s2) DEFAULT_INSTANCE.createBuilder(livekitModels$VideoLayer);
    }

    public static LivekitModels$VideoLayer parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$VideoLayer parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$VideoLayer parseFrom(byte[] bArr) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$VideoLayer parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$VideoLayer parseFrom(InputStream inputStream) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoLayer parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$VideoLayer parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$VideoLayer) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
