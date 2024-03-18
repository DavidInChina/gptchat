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
import jh.K0;

/* loaded from: classes.dex */
public final class LivekitEgress$UpdateStreamRequest extends AbstractC2497d0 implements N0 {
    public static final int ADD_OUTPUT_URLS_FIELD_NUMBER = 2;
    private static final LivekitEgress$UpdateStreamRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REMOVE_OUTPUT_URLS_FIELD_NUMBER = 3;
    private String egressId_ = "";
    private AbstractC2535q0 addOutputUrls_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 removeOutputUrls_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$UpdateStreamRequest livekitEgress$UpdateStreamRequest = new LivekitEgress$UpdateStreamRequest();
        DEFAULT_INSTANCE = livekitEgress$UpdateStreamRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$UpdateStreamRequest.class, livekitEgress$UpdateStreamRequest);
    }

    private LivekitEgress$UpdateStreamRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddOutputUrls(String str) {
        str.getClass();
        ensureAddOutputUrlsIsMutable();
        this.addOutputUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddOutputUrlsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureAddOutputUrlsIsMutable();
        this.addOutputUrls_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAddOutputUrls(Iterable<String> iterable) {
        ensureAddOutputUrlsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.addOutputUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRemoveOutputUrls(Iterable<String> iterable) {
        ensureRemoveOutputUrlsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.removeOutputUrls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemoveOutputUrls(String str) {
        str.getClass();
        ensureRemoveOutputUrlsIsMutable();
        this.removeOutputUrls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRemoveOutputUrlsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureRemoveOutputUrlsIsMutable();
        this.removeOutputUrls_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddOutputUrls() {
        this.addOutputUrls_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveOutputUrls() {
        this.removeOutputUrls_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureAddOutputUrlsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.addOutputUrls_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.addOutputUrls_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureRemoveOutputUrlsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.removeOutputUrls_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.removeOutputUrls_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitEgress$UpdateStreamRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static K0 newBuilder() {
        return (K0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$UpdateStreamRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddOutputUrls(int i10, String str) {
        str.getClass();
        ensureAddOutputUrlsIsMutable();
        this.addOutputUrls_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.egressId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveOutputUrls(int i10, String str) {
        str.getClass();
        ensureRemoveOutputUrlsIsMutable();
        this.removeOutputUrls_.set(i10, str);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0208\u0002\u021a\u0003\u021a", new Object[]{"egressId_", "addOutputUrls_", "removeOutputUrls_"});
            case 3:
                return new LivekitEgress$UpdateStreamRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$UpdateStreamRequest.class) {
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

    public String getAddOutputUrls(int i10) {
        return (String) this.addOutputUrls_.get(i10);
    }

    public AbstractC2534q getAddOutputUrlsBytes(int i10) {
        return AbstractC2534q.y((String) this.addOutputUrls_.get(i10));
    }

    public int getAddOutputUrlsCount() {
        return this.addOutputUrls_.size();
    }

    public List<String> getAddOutputUrlsList() {
        return this.addOutputUrls_;
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC2534q getEgressIdBytes() {
        return AbstractC2534q.y(this.egressId_);
    }

    public String getRemoveOutputUrls(int i10) {
        return (String) this.removeOutputUrls_.get(i10);
    }

    public AbstractC2534q getRemoveOutputUrlsBytes(int i10) {
        return AbstractC2534q.y((String) this.removeOutputUrls_.get(i10));
    }

    public int getRemoveOutputUrlsCount() {
        return this.removeOutputUrls_.size();
    }

    public List<String> getRemoveOutputUrlsList() {
        return this.removeOutputUrls_;
    }

    public static K0 newBuilder(LivekitEgress$UpdateStreamRequest livekitEgress$UpdateStreamRequest) {
        return (K0) DEFAULT_INSTANCE.createBuilder(livekitEgress$UpdateStreamRequest);
    }

    public static LivekitEgress$UpdateStreamRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$UpdateStreamRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$UpdateStreamRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
