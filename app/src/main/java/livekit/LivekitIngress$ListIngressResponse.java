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
import jh.C4015g1;
import jh.V0;

/* loaded from: classes.dex */
public final class LivekitIngress$ListIngressResponse extends AbstractC2497d0 implements N0 {
    private static final LivekitIngress$ListIngressResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private AbstractC2535q0 items_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitIngress$ListIngressResponse livekitIngress$ListIngressResponse = new LivekitIngress$ListIngressResponse();
        DEFAULT_INSTANCE = livekitIngress$ListIngressResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$ListIngressResponse.class, livekitIngress$ListIngressResponse);
    }

    private LivekitIngress$ListIngressResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllItems(Iterable<? extends LivekitIngress$IngressInfo> iterable) {
        ensureItemsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.items_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(livekitIngress$IngressInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearItems() {
        this.items_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.items_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.items_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitIngress$ListIngressResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4015g1 newBuilder() {
        return (C4015g1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$ListIngressResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeItems(int i10) {
        ensureItemsIsMutable();
        this.items_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItems(int i10, LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.set(i10, livekitIngress$IngressInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", LivekitIngress$IngressInfo.class});
            case 3:
                return new LivekitIngress$ListIngressResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$ListIngressResponse.class) {
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

    public LivekitIngress$IngressInfo getItems(int i10) {
        return (LivekitIngress$IngressInfo) this.items_.get(i10);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<LivekitIngress$IngressInfo> getItemsList() {
        return this.items_;
    }

    public V0 getItemsOrBuilder(int i10) {
        return (V0) this.items_.get(i10);
    }

    public List<? extends V0> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C4015g1 newBuilder(LivekitIngress$ListIngressResponse livekitIngress$ListIngressResponse) {
        return (C4015g1) DEFAULT_INSTANCE.createBuilder(livekitIngress$ListIngressResponse);
    }

    public static LivekitIngress$ListIngressResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addItems(int i10, LivekitIngress$IngressInfo livekitIngress$IngressInfo) {
        livekitIngress$IngressInfo.getClass();
        ensureItemsIsMutable();
        this.items_.add(i10, livekitIngress$IngressInfo);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(byte[] bArr) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(InputStream inputStream) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$ListIngressResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$ListIngressResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
