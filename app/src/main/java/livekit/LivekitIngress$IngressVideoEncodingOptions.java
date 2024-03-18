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
import jh.AbstractC4080t2;
import jh.EnumC4066q2;
import jh.Z0;

/* loaded from: classes.dex */
public final class LivekitIngress$IngressVideoEncodingOptions extends AbstractC2497d0 implements N0 {
    private static final LivekitIngress$IngressVideoEncodingOptions DEFAULT_INSTANCE;
    public static final int FRAME_RATE_FIELD_NUMBER = 2;
    public static final int LAYERS_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int VIDEO_CODEC_FIELD_NUMBER = 1;
    private double frameRate_;
    private AbstractC2535q0 layers_ = AbstractC2497d0.emptyProtobufList();
    private int videoCodec_;

    static {
        LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions = new LivekitIngress$IngressVideoEncodingOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressVideoEncodingOptions;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$IngressVideoEncodingOptions.class, livekitIngress$IngressVideoEncodingOptions);
    }

    private LivekitIngress$IngressVideoEncodingOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends LivekitModels$VideoLayer> iterable) {
        ensureLayersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrameRate() {
        this.frameRate_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoCodec() {
        this.videoCodec_ = 0;
    }

    private void ensureLayersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.layers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.layers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitIngress$IngressVideoEncodingOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Z0 newBuilder() {
        return (Z0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLayers(int i10) {
        ensureLayersIsMutable();
        this.layers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrameRate(double d10) {
        this.frameRate_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodec(EnumC4066q2 enumC4066q2) {
        this.videoCodec_ = enumC4066q2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoCodecValue(int i10) {
        this.videoCodec_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u0000\u0003\u001b", new Object[]{"videoCodec_", "frameRate_", "layers_", LivekitModels$VideoLayer.class});
            case 3:
                return new LivekitIngress$IngressVideoEncodingOptions();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$IngressVideoEncodingOptions.class) {
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

    public double getFrameRate() {
        return this.frameRate_;
    }

    public LivekitModels$VideoLayer getLayers(int i10) {
        return (LivekitModels$VideoLayer) this.layers_.get(i10);
    }

    public int getLayersCount() {
        return this.layers_.size();
    }

    public List<LivekitModels$VideoLayer> getLayersList() {
        return this.layers_;
    }

    public AbstractC4080t2 getLayersOrBuilder(int i10) {
        return (AbstractC4080t2) this.layers_.get(i10);
    }

    public List<? extends AbstractC4080t2> getLayersOrBuilderList() {
        return this.layers_;
    }

    public EnumC4066q2 getVideoCodec() {
        EnumC4066q2 b10 = EnumC4066q2.b(this.videoCodec_);
        if (b10 == null) {
            return EnumC4066q2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getVideoCodecValue() {
        return this.videoCodec_;
    }

    public static Z0 newBuilder(LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions) {
        return (Z0) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressVideoEncodingOptions);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$IngressVideoEncodingOptions parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$IngressVideoEncodingOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
