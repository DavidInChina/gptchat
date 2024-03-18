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
import jh.AbstractC4101x3;
import jh.AbstractC4111z3;
import jh.C4096w3;

/* loaded from: classes.dex */
public final class LivekitRtc$SubscribedCodec extends AbstractC2497d0 implements AbstractC4101x3 {
    public static final int CODEC_FIELD_NUMBER = 1;
    private static final LivekitRtc$SubscribedCodec DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int QUALITIES_FIELD_NUMBER = 2;
    private String codec_ = "";
    private AbstractC2535q0 qualities_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec = new LivekitRtc$SubscribedCodec();
        DEFAULT_INSTANCE = livekitRtc$SubscribedCodec;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SubscribedCodec.class, livekitRtc$SubscribedCodec);
    }

    private LivekitRtc$SubscribedCodec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQualities(Iterable<? extends LivekitRtc$SubscribedQuality> iterable) {
        ensureQualitiesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.qualities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualities(LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureQualitiesIsMutable();
        this.qualities_.add(livekitRtc$SubscribedQuality);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodec() {
        this.codec_ = getDefaultInstance().getCodec();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQualities() {
        this.qualities_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureQualitiesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.qualities_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.qualities_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$SubscribedCodec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4096w3 newBuilder() {
        return (C4096w3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscribedCodec parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQualities(int i10) {
        ensureQualitiesIsMutable();
        this.qualities_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodec(String str) {
        str.getClass();
        this.codec_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.codec_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureQualitiesIsMutable();
        this.qualities_.set(i10, livekitRtc$SubscribedQuality);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[]{"codec_", "qualities_", LivekitRtc$SubscribedQuality.class});
            case 3:
                return new LivekitRtc$SubscribedCodec();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SubscribedCodec.class) {
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

    public String getCodec() {
        return this.codec_;
    }

    public AbstractC2534q getCodecBytes() {
        return AbstractC2534q.y(this.codec_);
    }

    public LivekitRtc$SubscribedQuality getQualities(int i10) {
        return (LivekitRtc$SubscribedQuality) this.qualities_.get(i10);
    }

    public int getQualitiesCount() {
        return this.qualities_.size();
    }

    public List<LivekitRtc$SubscribedQuality> getQualitiesList() {
        return this.qualities_;
    }

    public AbstractC4111z3 getQualitiesOrBuilder(int i10) {
        return (AbstractC4111z3) this.qualities_.get(i10);
    }

    public List<? extends AbstractC4111z3> getQualitiesOrBuilderList() {
        return this.qualities_;
    }

    public static C4096w3 newBuilder(LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        return (C4096w3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscribedCodec);
    }

    public static LivekitRtc$SubscribedCodec parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureQualitiesIsMutable();
        this.qualities_.add(i10, livekitRtc$SubscribedQuality);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SubscribedCodec parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SubscribedCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
