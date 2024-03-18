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
import jh.Q2;
import jh.R2;

/* loaded from: classes2.dex */
public final class LivekitRtc$ConnectionQualityUpdate extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$ConnectionQualityUpdate DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int UPDATES_FIELD_NUMBER = 1;
    private AbstractC2535q0 updates_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate = new LivekitRtc$ConnectionQualityUpdate();
        DEFAULT_INSTANCE = livekitRtc$ConnectionQualityUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$ConnectionQualityUpdate.class, livekitRtc$ConnectionQualityUpdate);
    }

    private LivekitRtc$ConnectionQualityUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpdates(Iterable<? extends LivekitRtc$ConnectionQualityInfo> iterable) {
        ensureUpdatesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.updates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdates(LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        livekitRtc$ConnectionQualityInfo.getClass();
        ensureUpdatesIsMutable();
        this.updates_.add(livekitRtc$ConnectionQualityInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdates() {
        this.updates_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureUpdatesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.updates_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.updates_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$ConnectionQualityUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static R2 newBuilder() {
        return (R2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ConnectionQualityUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpdates(int i10) {
        ensureUpdatesIsMutable();
        this.updates_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdates(int i10, LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        livekitRtc$ConnectionQualityInfo.getClass();
        ensureUpdatesIsMutable();
        this.updates_.set(i10, livekitRtc$ConnectionQualityInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"updates_", LivekitRtc$ConnectionQualityInfo.class});
            case 3:
                return new LivekitRtc$ConnectionQualityUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$ConnectionQualityUpdate.class) {
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

    public LivekitRtc$ConnectionQualityInfo getUpdates(int i10) {
        return (LivekitRtc$ConnectionQualityInfo) this.updates_.get(i10);
    }

    public int getUpdatesCount() {
        return this.updates_.size();
    }

    public List<LivekitRtc$ConnectionQualityInfo> getUpdatesList() {
        return this.updates_;
    }

    public Q2 getUpdatesOrBuilder(int i10) {
        return (Q2) this.updates_.get(i10);
    }

    public List<? extends Q2> getUpdatesOrBuilderList() {
        return this.updates_;
    }

    public static R2 newBuilder(LivekitRtc$ConnectionQualityUpdate livekitRtc$ConnectionQualityUpdate) {
        return (R2) DEFAULT_INSTANCE.createBuilder(livekitRtc$ConnectionQualityUpdate);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpdates(int i10, LivekitRtc$ConnectionQualityInfo livekitRtc$ConnectionQualityInfo) {
        livekitRtc$ConnectionQualityInfo.getClass();
        ensureUpdatesIsMutable();
        this.updates_.add(i10, livekitRtc$ConnectionQualityInfo);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$ConnectionQualityUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$ConnectionQualityUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
