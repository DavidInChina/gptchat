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
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.AbstractC4016g2;
import jh.AbstractC4080t2;
import jh.C4011f2;

/* loaded from: classes.dex */
public final class LivekitModels$SimulcastCodecInfo extends AbstractC2497d0 implements AbstractC4016g2 {
    public static final int CID_FIELD_NUMBER = 3;
    private static final LivekitModels$SimulcastCodecInfo DEFAULT_INSTANCE;
    public static final int LAYERS_FIELD_NUMBER = 4;
    public static final int MID_FIELD_NUMBER = 2;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private String mimeType_ = "";
    private String mid_ = "";
    private String cid_ = "";
    private AbstractC2535q0 layers_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo = new LivekitModels$SimulcastCodecInfo();
        DEFAULT_INSTANCE = livekitModels$SimulcastCodecInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$SimulcastCodecInfo.class, livekitModels$SimulcastCodecInfo);
    }

    private LivekitModels$SimulcastCodecInfo() {
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
    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayers() {
        this.layers_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = getDefaultInstance().getMid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
    }

    private void ensureLayersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.layers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.layers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$SimulcastCodecInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4011f2 newBuilder() {
        return (C4011f2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$SimulcastCodecInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCid(String str) {
        str.getClass();
        this.cid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.cid_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(String str) {
        str.getClass();
        this.mid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.mid_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeType(String str) {
        str.getClass();
        this.mimeType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeTypeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.mimeType_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u001b", new Object[]{"mimeType_", "mid_", "cid_", "layers_", LivekitModels$VideoLayer.class});
            case 3:
                return new LivekitModels$SimulcastCodecInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$SimulcastCodecInfo.class) {
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

    public String getCid() {
        return this.cid_;
    }

    public AbstractC2534q getCidBytes() {
        return AbstractC2534q.y(this.cid_);
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

    public String getMid() {
        return this.mid_;
    }

    public AbstractC2534q getMidBytes() {
        return AbstractC2534q.y(this.mid_);
    }

    public String getMimeType() {
        return this.mimeType_;
    }

    public AbstractC2534q getMimeTypeBytes() {
        return AbstractC2534q.y(this.mimeType_);
    }

    public static C4011f2 newBuilder(LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        return (C4011f2) DEFAULT_INSTANCE.createBuilder(livekitModels$SimulcastCodecInfo);
    }

    public static LivekitModels$SimulcastCodecInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(byte[] bArr) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$SimulcastCodecInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$SimulcastCodecInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
