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
import jh.E1;
import jh.K1;

/* loaded from: classes2.dex */
public final class LivekitModels$DisabledCodecs extends AbstractC2497d0 implements N0 {
    public static final int CODECS_FIELD_NUMBER = 1;
    private static final LivekitModels$DisabledCodecs DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PUBLISH_FIELD_NUMBER = 2;
    private AbstractC2535q0 codecs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 publish_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitModels$DisabledCodecs livekitModels$DisabledCodecs = new LivekitModels$DisabledCodecs();
        DEFAULT_INSTANCE = livekitModels$DisabledCodecs;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$DisabledCodecs.class, livekitModels$DisabledCodecs);
    }

    private LivekitModels$DisabledCodecs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCodecs(Iterable<? extends LivekitModels$Codec> iterable) {
        ensureCodecsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.codecs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublish(Iterable<? extends LivekitModels$Codec> iterable) {
        ensurePublishIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.publish_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublish(LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensurePublishIsMutable();
        this.publish_.add(livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodecs() {
        this.codecs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublish() {
        this.publish_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureCodecsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.codecs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.codecs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensurePublishIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.publish_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.publish_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitModels$DisabledCodecs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static K1 newBuilder() {
        return (K1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$DisabledCodecs parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DisabledCodecs parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removePublish(int i10) {
        ensurePublishIsMutable();
        this.publish_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureCodecsIsMutable();
        this.codecs_.set(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublish(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensurePublishIsMutable();
        this.publish_.set(i10, livekitModels$Codec);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"codecs_", LivekitModels$Codec.class, "publish_", LivekitModels$Codec.class});
            case 3:
                return new LivekitModels$DisabledCodecs();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$DisabledCodecs.class) {
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

    public LivekitModels$Codec getCodecs(int i10) {
        return (LivekitModels$Codec) this.codecs_.get(i10);
    }

    public int getCodecsCount() {
        return this.codecs_.size();
    }

    public List<LivekitModels$Codec> getCodecsList() {
        return this.codecs_;
    }

    public E1 getCodecsOrBuilder(int i10) {
        return (E1) this.codecs_.get(i10);
    }

    public List<? extends E1> getCodecsOrBuilderList() {
        return this.codecs_;
    }

    public LivekitModels$Codec getPublish(int i10) {
        return (LivekitModels$Codec) this.publish_.get(i10);
    }

    public int getPublishCount() {
        return this.publish_.size();
    }

    public List<LivekitModels$Codec> getPublishList() {
        return this.publish_;
    }

    public E1 getPublishOrBuilder(int i10) {
        return (E1) this.publish_.get(i10);
    }

    public List<? extends E1> getPublishOrBuilderList() {
        return this.publish_;
    }

    public static K1 newBuilder(LivekitModels$DisabledCodecs livekitModels$DisabledCodecs) {
        return (K1) DEFAULT_INSTANCE.createBuilder(livekitModels$DisabledCodecs);
    }

    public static LivekitModels$DisabledCodecs parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$DisabledCodecs parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCodecs(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensureCodecsIsMutable();
        this.codecs_.add(i10, livekitModels$Codec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublish(int i10, LivekitModels$Codec livekitModels$Codec) {
        livekitModels$Codec.getClass();
        ensurePublishIsMutable();
        this.publish_.add(i10, livekitModels$Codec);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$DisabledCodecs parseFrom(byte[] bArr) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$DisabledCodecs parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$DisabledCodecs parseFrom(InputStream inputStream) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DisabledCodecs parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$DisabledCodecs parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$DisabledCodecs) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
