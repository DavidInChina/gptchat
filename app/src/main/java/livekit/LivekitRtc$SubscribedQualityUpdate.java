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
import jh.A3;
import jh.AbstractC4101x3;
import jh.AbstractC4111z3;

/* loaded from: classes.dex */
public final class LivekitRtc$SubscribedQualityUpdate extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$SubscribedQualityUpdate DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SUBSCRIBED_CODECS_FIELD_NUMBER = 3;
    public static final int SUBSCRIBED_QUALITIES_FIELD_NUMBER = 2;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private String trackSid_ = "";
    private AbstractC2535q0 subscribedQualities_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 subscribedCodecs_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate = new LivekitRtc$SubscribedQualityUpdate();
        DEFAULT_INSTANCE = livekitRtc$SubscribedQualityUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SubscribedQualityUpdate.class, livekitRtc$SubscribedQualityUpdate);
    }

    private LivekitRtc$SubscribedQualityUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubscribedCodecs(Iterable<? extends LivekitRtc$SubscribedCodec> iterable) {
        ensureSubscribedCodecsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.subscribedCodecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubscribedQualities(Iterable<? extends LivekitRtc$SubscribedQuality> iterable) {
        ensureSubscribedQualitiesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.subscribedQualities_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedCodecs(LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        livekitRtc$SubscribedCodec.getClass();
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.add(livekitRtc$SubscribedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedQualities(LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.add(livekitRtc$SubscribedQuality);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribedCodecs() {
        this.subscribedCodecs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscribedQualities() {
        this.subscribedQualities_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    private void ensureSubscribedCodecsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.subscribedCodecs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.subscribedCodecs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureSubscribedQualitiesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.subscribedQualities_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.subscribedQualities_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$SubscribedQualityUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static A3 newBuilder() {
        return (A3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscribedQualityUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubscribedCodecs(int i10) {
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSubscribedQualities(int i10) {
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribedCodecs(int i10, LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        livekitRtc$SubscribedCodec.getClass();
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.set(i10, livekitRtc$SubscribedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscribedQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.set(i10, livekitRtc$SubscribedQuality);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0208\u0002\u001b\u0003\u001b", new Object[]{"trackSid_", "subscribedQualities_", LivekitRtc$SubscribedQuality.class, "subscribedCodecs_", LivekitRtc$SubscribedCodec.class});
            case 3:
                return new LivekitRtc$SubscribedQualityUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SubscribedQualityUpdate.class) {
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

    public LivekitRtc$SubscribedCodec getSubscribedCodecs(int i10) {
        return (LivekitRtc$SubscribedCodec) this.subscribedCodecs_.get(i10);
    }

    public int getSubscribedCodecsCount() {
        return this.subscribedCodecs_.size();
    }

    public List<LivekitRtc$SubscribedCodec> getSubscribedCodecsList() {
        return this.subscribedCodecs_;
    }

    public AbstractC4101x3 getSubscribedCodecsOrBuilder(int i10) {
        return (AbstractC4101x3) this.subscribedCodecs_.get(i10);
    }

    public List<? extends AbstractC4101x3> getSubscribedCodecsOrBuilderList() {
        return this.subscribedCodecs_;
    }

    public LivekitRtc$SubscribedQuality getSubscribedQualities(int i10) {
        return (LivekitRtc$SubscribedQuality) this.subscribedQualities_.get(i10);
    }

    public int getSubscribedQualitiesCount() {
        return this.subscribedQualities_.size();
    }

    public List<LivekitRtc$SubscribedQuality> getSubscribedQualitiesList() {
        return this.subscribedQualities_;
    }

    public AbstractC4111z3 getSubscribedQualitiesOrBuilder(int i10) {
        return (AbstractC4111z3) this.subscribedQualities_.get(i10);
    }

    public List<? extends AbstractC4111z3> getSubscribedQualitiesOrBuilderList() {
        return this.subscribedQualities_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static A3 newBuilder(LivekitRtc$SubscribedQualityUpdate livekitRtc$SubscribedQualityUpdate) {
        return (A3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscribedQualityUpdate);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedCodecs(int i10, LivekitRtc$SubscribedCodec livekitRtc$SubscribedCodec) {
        livekitRtc$SubscribedCodec.getClass();
        ensureSubscribedCodecsIsMutable();
        this.subscribedCodecs_.add(i10, livekitRtc$SubscribedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubscribedQualities(int i10, LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        livekitRtc$SubscribedQuality.getClass();
        ensureSubscribedQualitiesIsMutable();
        this.subscribedQualities_.add(i10, livekitRtc$SubscribedQuality);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SubscribedQualityUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SubscribedQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
