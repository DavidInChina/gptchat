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
import jh.AbstractC4046m2;
import jh.AbstractC4080t2;
import jh.C4041l2;
import jh.EnumC4051n2;
import jh.EnumC4056o2;
import jh.O1;

/* loaded from: classes2.dex */
public final class LivekitModels$TrackInfo extends AbstractC2497d0 implements AbstractC4046m2 {
    public static final int CODECS_FIELD_NUMBER = 13;
    private static final LivekitModels$TrackInfo DEFAULT_INSTANCE;
    public static final int DISABLE_DTX_FIELD_NUMBER = 8;
    public static final int DISABLE_RED_FIELD_NUMBER = 15;
    public static final int ENCRYPTION_FIELD_NUMBER = 16;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    public static final int LAYERS_FIELD_NUMBER = 10;
    public static final int MID_FIELD_NUMBER = 12;
    public static final int MIME_TYPE_FIELD_NUMBER = 11;
    public static final int MUTED_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    public static final int SIMULCAST_FIELD_NUMBER = 7;
    public static final int SOURCE_FIELD_NUMBER = 9;
    public static final int STEREO_FIELD_NUMBER = 14;
    public static final int STREAM_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private boolean disableDtx_;
    private boolean disableRed_;
    private int encryption_;
    private int height_;
    private boolean muted_;
    private boolean simulcast_;
    private int source_;
    private boolean stereo_;
    private int type_;
    private int width_;
    private String sid_ = "";
    private String name_ = "";
    private AbstractC2535q0 layers_ = AbstractC2497d0.emptyProtobufList();
    private String mimeType_ = "";
    private String mid_ = "";
    private AbstractC2535q0 codecs_ = AbstractC2497d0.emptyProtobufList();
    private String stream_ = "";

    static {
        LivekitModels$TrackInfo livekitModels$TrackInfo = new LivekitModels$TrackInfo();
        DEFAULT_INSTANCE = livekitModels$TrackInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$TrackInfo.class, livekitModels$TrackInfo);
    }

    private LivekitModels$TrackInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCodecs(Iterable<? extends LivekitModels$SimulcastCodecInfo> iterable) {
        ensureCodecsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.codecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLayers(Iterable<? extends LivekitModels$VideoLayer> iterable) {
        ensureLayersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.layers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        livekitModels$SimulcastCodecInfo.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(livekitModels$SimulcastCodecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(livekitModels$VideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecs() {
        this.codecs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableDtx() {
        this.disableDtx_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableRed() {
        this.disableRed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncryption() {
        this.encryption_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuted() {
        this.muted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimulcast() {
        this.simulcast_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStereo() {
        this.stereo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStream() {
        this.stream_ = getDefaultInstance().getStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    private void ensureCodecsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.codecs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.codecs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureLayersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.layers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.layers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$TrackInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4041l2 newBuilder() {
        return (C4041l2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$TrackInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TrackInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCodecs(int i10) {
        ensureCodecsIsMutable();
        this.codecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLayers(int i10) {
        ensureLayersIsMutable();
        this.layers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecs(int i10, LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        livekitModels$SimulcastCodecInfo.getClass();
        ensureCodecsIsMutable();
        this.codecs_.set(i10, livekitModels$SimulcastCodecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableDtx(boolean z10) {
        this.disableDtx_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableRed(boolean z10) {
        this.disableRed_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryption(O1 o12) {
        this.encryption_ = o12.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncryptionValue(int i10) {
        this.encryption_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setMuted(boolean z10) {
        this.muted_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sid_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimulcast(boolean z10) {
        this.simulcast_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(EnumC4051n2 enumC4051n2) {
        this.source_ = enumC4051n2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i10) {
        this.source_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStereo(boolean z10) {
        this.stereo_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStream(String str) {
        str.getClass();
        this.stream_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.stream_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC4056o2 enumC4056o2) {
        this.type_ = enumC4056o2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0002\u0000\u0001\u0208\u0002\f\u0003\u0208\u0004\u0007\u0005\u000b\u0006\u000b\u0007\u0007\b\u0007\t\f\n\u001b\u000b\u0208\f\u0208\r\u001b\u000e\u0007\u000f\u0007\u0010\f\u0011\u0208", new Object[]{"sid_", "type_", "name_", "muted_", "width_", "height_", "simulcast_", "disableDtx_", "source_", "layers_", LivekitModels$VideoLayer.class, "mimeType_", "mid_", "codecs_", LivekitModels$SimulcastCodecInfo.class, "stereo_", "disableRed_", "encryption_", "stream_"});
            case 3:
                return new LivekitModels$TrackInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$TrackInfo.class) {
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

    public LivekitModels$SimulcastCodecInfo getCodecs(int i10) {
        return (LivekitModels$SimulcastCodecInfo) this.codecs_.get(i10);
    }

    public int getCodecsCount() {
        return this.codecs_.size();
    }

    public List<LivekitModels$SimulcastCodecInfo> getCodecsList() {
        return this.codecs_;
    }

    public AbstractC4016g2 getCodecsOrBuilder(int i10) {
        return (AbstractC4016g2) this.codecs_.get(i10);
    }

    public List<? extends AbstractC4016g2> getCodecsOrBuilderList() {
        return this.codecs_;
    }

    public boolean getDisableDtx() {
        return this.disableDtx_;
    }

    public boolean getDisableRed() {
        return this.disableRed_;
    }

    public O1 getEncryption() {
        O1 b10 = O1.b(this.encryption_);
        if (b10 == null) {
            return O1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getEncryptionValue() {
        return this.encryption_;
    }

    public int getHeight() {
        return this.height_;
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

    public boolean getMuted() {
        return this.muted_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC2534q getSidBytes() {
        return AbstractC2534q.y(this.sid_);
    }

    public boolean getSimulcast() {
        return this.simulcast_;
    }

    public EnumC4051n2 getSource() {
        EnumC4051n2 b10 = EnumC4051n2.b(this.source_);
        if (b10 == null) {
            return EnumC4051n2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean getStereo() {
        return this.stereo_;
    }

    public String getStream() {
        return this.stream_;
    }

    public AbstractC2534q getStreamBytes() {
        return AbstractC2534q.y(this.stream_);
    }

    public EnumC4056o2 getType() {
        EnumC4056o2 b10 = EnumC4056o2.b(this.type_);
        if (b10 == null) {
            return EnumC4056o2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static C4041l2 newBuilder(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        return (C4041l2) DEFAULT_INSTANCE.createBuilder(livekitModels$TrackInfo);
    }

    public static LivekitModels$TrackInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$TrackInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(int i10, LivekitModels$SimulcastCodecInfo livekitModels$SimulcastCodecInfo) {
        livekitModels$SimulcastCodecInfo.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(i10, livekitModels$SimulcastCodecInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$TrackInfo parseFrom(byte[] bArr) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$TrackInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$TrackInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$TrackInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$TrackInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$TrackInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
