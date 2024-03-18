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
import jh.A0;
import jh.C4108z0;

@Deprecated
/* loaded from: classes.dex */
public final class LivekitEgress$StreamInfoList extends AbstractC2497d0 implements N0 {
    private static final LivekitEgress$StreamInfoList DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private AbstractC2535q0 info_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$StreamInfoList livekitEgress$StreamInfoList = new LivekitEgress$StreamInfoList();
        DEFAULT_INSTANCE = livekitEgress$StreamInfoList;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$StreamInfoList.class, livekitEgress$StreamInfoList);
    }

    private LivekitEgress$StreamInfoList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInfo(Iterable<? extends LivekitEgress$StreamInfo> iterable) {
        ensureInfoIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.info_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfo(LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureInfoIsMutable();
        this.info_.add(livekitEgress$StreamInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureInfoIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.info_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.info_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitEgress$StreamInfoList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4108z0 newBuilder() {
        return (C4108z0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StreamInfoList parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfoList parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInfo(int i10) {
        ensureInfoIsMutable();
        this.info_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureInfoIsMutable();
        this.info_.set(i10, livekitEgress$StreamInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"info_", LivekitEgress$StreamInfo.class});
            case 3:
                return new LivekitEgress$StreamInfoList();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$StreamInfoList.class) {
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

    public LivekitEgress$StreamInfo getInfo(int i10) {
        return (LivekitEgress$StreamInfo) this.info_.get(i10);
    }

    public int getInfoCount() {
        return this.info_.size();
    }

    public List<LivekitEgress$StreamInfo> getInfoList() {
        return this.info_;
    }

    public A0 getInfoOrBuilder(int i10) {
        return (A0) this.info_.get(i10);
    }

    public List<? extends A0> getInfoOrBuilderList() {
        return this.info_;
    }

    public static C4108z0 newBuilder(LivekitEgress$StreamInfoList livekitEgress$StreamInfoList) {
        return (C4108z0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StreamInfoList);
    }

    public static LivekitEgress$StreamInfoList parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StreamInfoList parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInfo(int i10, LivekitEgress$StreamInfo livekitEgress$StreamInfo) {
        livekitEgress$StreamInfo.getClass();
        ensureInfoIsMutable();
        this.info_.add(i10, livekitEgress$StreamInfo);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$StreamInfoList parseFrom(byte[] bArr) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StreamInfoList parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$StreamInfoList parseFrom(InputStream inputStream) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamInfoList parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$StreamInfoList parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$StreamInfoList) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
