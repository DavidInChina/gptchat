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
import jh.AbstractC4086u3;
import jh.C4091v3;

/* loaded from: classes2.dex */
public final class LivekitRtc$StreamStateUpdate extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$StreamStateUpdate DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int STREAM_STATES_FIELD_NUMBER = 1;
    private AbstractC2535q0 streamStates_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate = new LivekitRtc$StreamStateUpdate();
        DEFAULT_INSTANCE = livekitRtc$StreamStateUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$StreamStateUpdate.class, livekitRtc$StreamStateUpdate);
    }

    private LivekitRtc$StreamStateUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamStates(Iterable<? extends LivekitRtc$StreamStateInfo> iterable) {
        ensureStreamStatesIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.streamStates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamStates(LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        livekitRtc$StreamStateInfo.getClass();
        ensureStreamStatesIsMutable();
        this.streamStates_.add(livekitRtc$StreamStateInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamStates() {
        this.streamStates_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureStreamStatesIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.streamStates_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.streamStates_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$StreamStateUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4091v3 newBuilder() {
        return (C4091v3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$StreamStateUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamStates(int i10) {
        ensureStreamStatesIsMutable();
        this.streamStates_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamStates(int i10, LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        livekitRtc$StreamStateInfo.getClass();
        ensureStreamStatesIsMutable();
        this.streamStates_.set(i10, livekitRtc$StreamStateInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"streamStates_", LivekitRtc$StreamStateInfo.class});
            case 3:
                return new LivekitRtc$StreamStateUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$StreamStateUpdate.class) {
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

    public LivekitRtc$StreamStateInfo getStreamStates(int i10) {
        return (LivekitRtc$StreamStateInfo) this.streamStates_.get(i10);
    }

    public int getStreamStatesCount() {
        return this.streamStates_.size();
    }

    public List<LivekitRtc$StreamStateInfo> getStreamStatesList() {
        return this.streamStates_;
    }

    public AbstractC4086u3 getStreamStatesOrBuilder(int i10) {
        return (AbstractC4086u3) this.streamStates_.get(i10);
    }

    public List<? extends AbstractC4086u3> getStreamStatesOrBuilderList() {
        return this.streamStates_;
    }

    public static C4091v3 newBuilder(LivekitRtc$StreamStateUpdate livekitRtc$StreamStateUpdate) {
        return (C4091v3) DEFAULT_INSTANCE.createBuilder(livekitRtc$StreamStateUpdate);
    }

    public static LivekitRtc$StreamStateUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamStates(int i10, LivekitRtc$StreamStateInfo livekitRtc$StreamStateInfo) {
        livekitRtc$StreamStateInfo.getClass();
        ensureStreamStatesIsMutable();
        this.streamStates_.add(i10, livekitRtc$StreamStateInfo);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$StreamStateUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$StreamStateUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
