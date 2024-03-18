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
import jh.O3;

/* loaded from: classes2.dex */
public final class LivekitRtc$UpdateVideoLayers extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$UpdateVideoLayers DEFAULT_INSTANCE;
    public static final int LAYERS_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private String trackSid_ = "";
    private AbstractC2535q0 layers_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers = new LivekitRtc$UpdateVideoLayers();
        DEFAULT_INSTANCE = livekitRtc$UpdateVideoLayers;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$UpdateVideoLayers.class, livekitRtc$UpdateVideoLayers);
    }

    private LivekitRtc$UpdateVideoLayers() {
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
    public void clearLayers() {
        this.layers_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    private void ensureLayersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.layers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.layers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$UpdateVideoLayers getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static O3 newBuilder() {
        return (O3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateVideoLayers parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.trackSid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"trackSid_", "layers_", LivekitModels$VideoLayer.class});
            case 3:
                return new LivekitRtc$UpdateVideoLayers();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$UpdateVideoLayers.class) {
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

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static O3 newBuilder(LivekitRtc$UpdateVideoLayers livekitRtc$UpdateVideoLayers) {
        return (O3) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateVideoLayers);
    }

    public static LivekitRtc$UpdateVideoLayers parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$UpdateVideoLayers parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$UpdateVideoLayers) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
