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
import jh.AbstractC4067q3;
import jh.AbstractC4080t2;
import jh.EnumC4051n2;
import jh.EnumC4056o2;
import jh.N2;
import jh.O1;

/* loaded from: classes.dex */
public final class LivekitRtc$AddTrackRequest extends AbstractC2497d0 implements N0 {
    public static final int CID_FIELD_NUMBER = 1;
    private static final LivekitRtc$AddTrackRequest DEFAULT_INSTANCE;
    public static final int DISABLE_DTX_FIELD_NUMBER = 7;
    public static final int DISABLE_RED_FIELD_NUMBER = 13;
    public static final int ENCRYPTION_FIELD_NUMBER = 14;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int LAYERS_FIELD_NUMBER = 9;
    public static final int MUTED_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SID_FIELD_NUMBER = 11;
    public static final int SIMULCAST_CODECS_FIELD_NUMBER = 10;
    public static final int SOURCE_FIELD_NUMBER = 8;
    public static final int STEREO_FIELD_NUMBER = 12;
    public static final int STREAM_FIELD_NUMBER = 15;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private boolean disableDtx_;
    private boolean disableRed_;
    private int encryption_;
    private int height_;
    private boolean muted_;
    private int source_;
    private boolean stereo_;
    private int type_;
    private int width_;
    private String cid_ = "";
    private String name_ = "";
    private AbstractC2535q0 layers_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 simulcastCodecs_ = AbstractC2497d0.emptyProtobufList();
    private String sid_ = "";
    private String stream_ = "";

    static {
        LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest = new LivekitRtc$AddTrackRequest();
        DEFAULT_INSTANCE = livekitRtc$AddTrackRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$AddTrackRequest.class, livekitRtc$AddTrackRequest);
    }

    private LivekitRtc$AddTrackRequest() {
    }

    public static /* synthetic */ void access$12700(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest, int i10) {
        livekitRtc$AddTrackRequest.setWidth(i10);
    }

    public static /* synthetic */ void access$12900(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest, int i10) {
        livekitRtc$AddTrackRequest.setHeight(i10);
    }

    public static /* synthetic */ void access$13600(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest, EnumC4051n2 enumC4051n2) {
        livekitRtc$AddTrackRequest.setSource(enumC4051n2);
    }

    public static /* synthetic */ void access$14100(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest, Iterable iterable) {
        livekitRtc$AddTrackRequest.addAllLayers(iterable);
    }

    public static /* synthetic */ void access$14500(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest, LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$AddTrackRequest.addSimulcastCodecs(livekitRtc$SimulcastCodec);
    }

    public void addAllLayers(Iterable<? extends LivekitModels$VideoLayer> iterable) {
        ensureLayersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.layers_);
    }

    public void addAllSimulcastCodecs(Iterable<? extends LivekitRtc$SimulcastCodec> iterable) {
        ensureSimulcastCodecsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.simulcastCodecs_);
    }

    public void addLayers(LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(livekitModels$VideoLayer);
    }

    public void addSimulcastCodecs(LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$SimulcastCodec.getClass();
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.add(livekitRtc$SimulcastCodec);
    }

    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    public void clearDisableDtx() {
        this.disableDtx_ = false;
    }

    public void clearDisableRed() {
        this.disableRed_ = false;
    }

    public void clearEncryption() {
        this.encryption_ = 0;
    }

    public void clearHeight() {
        this.height_ = 0;
    }

    public void clearLayers() {
        this.layers_ = AbstractC2497d0.emptyProtobufList();
    }

    public void clearMuted() {
        this.muted_ = false;
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    public void clearSimulcastCodecs() {
        this.simulcastCodecs_ = AbstractC2497d0.emptyProtobufList();
    }

    public void clearSource() {
        this.source_ = 0;
    }

    public void clearStereo() {
        this.stereo_ = false;
    }

    public void clearStream() {
        this.stream_ = getDefaultInstance().getStream();
    }

    public void clearType() {
        this.type_ = 0;
    }

    public void clearWidth() {
        this.width_ = 0;
    }

    private void ensureLayersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.layers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.layers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureSimulcastCodecsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.simulcastCodecs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.simulcastCodecs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$AddTrackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static N2 newBuilder() {
        return (N2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$AddTrackRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeLayers(int i10) {
        ensureLayersIsMutable();
        this.layers_.remove(i10);
    }

    public void removeSimulcastCodecs(int i10) {
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.remove(i10);
    }

    public void setCid(String str) {
        str.getClass();
        this.cid_ = str;
    }

    public void setCidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.cid_ = abstractC2534q.q0();
    }

    public void setDisableDtx(boolean z10) {
        this.disableDtx_ = z10;
    }

    public void setDisableRed(boolean z10) {
        this.disableRed_ = z10;
    }

    public void setEncryption(O1 o12) {
        this.encryption_ = o12.a();
    }

    public void setEncryptionValue(int i10) {
        this.encryption_ = i10;
    }

    public void setHeight(int i10) {
        this.height_ = i10;
    }

    public void setLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.set(i10, livekitModels$VideoLayer);
    }

    public void setMuted(boolean z10) {
        this.muted_ = z10;
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    public void setSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sid_ = abstractC2534q.q0();
    }

    public void setSimulcastCodecs(int i10, LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$SimulcastCodec.getClass();
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.set(i10, livekitRtc$SimulcastCodec);
    }

    public void setSource(EnumC4051n2 enumC4051n2) {
        this.source_ = enumC4051n2.a();
    }

    public void setSourceValue(int i10) {
        this.source_ = i10;
    }

    public void setStereo(boolean z10) {
        this.stereo_ = z10;
    }

    public void setStream(String str) {
        str.getClass();
        this.stream_ = str;
    }

    public void setStreamBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.stream_ = abstractC2534q.q0();
    }

    public void setType(EnumC4056o2 enumC4056o2) {
        this.type_ = enumC4056o2.a();
    }

    public void setTypeValue(int i10) {
        this.type_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0002\u0000\u0001\u0208\u0002\u0208\u0003\f\u0004\u000b\u0005\u000b\u0006\u0007\u0007\u0007\b\f\t\u001b\n\u001b\u000b\u0208\f\u0007\r\u0007\u000e\f\u000f\u0208", new Object[]{"cid_", "name_", "type_", "width_", "height_", "muted_", "disableDtx_", "source_", "layers_", LivekitModels$VideoLayer.class, "simulcastCodecs_", LivekitRtc$SimulcastCodec.class, "sid_", "stereo_", "disableRed_", "encryption_", "stream_"});
            case 3:
                return new LivekitRtc$AddTrackRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$AddTrackRequest.class) {
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

    public LivekitRtc$SimulcastCodec getSimulcastCodecs(int i10) {
        return (LivekitRtc$SimulcastCodec) this.simulcastCodecs_.get(i10);
    }

    public int getSimulcastCodecsCount() {
        return this.simulcastCodecs_.size();
    }

    public List<LivekitRtc$SimulcastCodec> getSimulcastCodecsList() {
        return this.simulcastCodecs_;
    }

    public AbstractC4067q3 getSimulcastCodecsOrBuilder(int i10) {
        return (AbstractC4067q3) this.simulcastCodecs_.get(i10);
    }

    public List<? extends AbstractC4067q3> getSimulcastCodecsOrBuilderList() {
        return this.simulcastCodecs_;
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

    public static N2 newBuilder(LivekitRtc$AddTrackRequest livekitRtc$AddTrackRequest) {
        return (N2) DEFAULT_INSTANCE.createBuilder(livekitRtc$AddTrackRequest);
    }

    public static LivekitRtc$AddTrackRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public void addLayers(int i10, LivekitModels$VideoLayer livekitModels$VideoLayer) {
        livekitModels$VideoLayer.getClass();
        ensureLayersIsMutable();
        this.layers_.add(i10, livekitModels$VideoLayer);
    }

    public void addSimulcastCodecs(int i10, LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        livekitRtc$SimulcastCodec.getClass();
        ensureSimulcastCodecsIsMutable();
        this.simulcastCodecs_.add(i10, livekitRtc$SimulcastCodec);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$AddTrackRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$AddTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
