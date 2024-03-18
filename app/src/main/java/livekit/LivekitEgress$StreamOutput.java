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
import jh.B0;
import jh.C0;
import jh.D0;

/* loaded from: classes2.dex */
public final class LivekitEgress$StreamOutput extends AbstractC2497d0 implements C0 {
    private static final LivekitEgress$StreamOutput DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    public static final int URLS_FIELD_NUMBER = 2;
    private int protocol_;
    private AbstractC2535q0 urls_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$StreamOutput livekitEgress$StreamOutput = new LivekitEgress$StreamOutput();
        DEFAULT_INSTANCE = livekitEgress$StreamOutput;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$StreamOutput.class, livekitEgress$StreamOutput);
    }

    private LivekitEgress$StreamOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUrls(Iterable<String> iterable) {
        ensureUrlsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.urls_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrls(String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrlsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureUrlsIsMutable();
        this.urls_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrls() {
        this.urls_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureUrlsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.urls_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.urls_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitEgress$StreamOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static B0 newBuilder() {
        return (B0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StreamOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(D0 d02) {
        this.protocol_ = d02.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolValue(int i10) {
        this.protocol_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrls(int i10, String str) {
        str.getClass();
        ensureUrlsIsMutable();
        this.urls_.set(i10, str);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u021a", new Object[]{"protocol_", "urls_"});
            case 3:
                return new LivekitEgress$StreamOutput();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$StreamOutput.class) {
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

    public D0 getProtocol() {
        D0 d02;
        int i10 = this.protocol_;
        if (i10 != 0) {
            if (i10 != 1) {
                d02 = null;
            } else {
                d02 = D0.RTMP;
            }
        } else {
            d02 = D0.DEFAULT_PROTOCOL;
        }
        if (d02 == null) {
            return D0.UNRECOGNIZED;
        }
        return d02;
    }

    public int getProtocolValue() {
        return this.protocol_;
    }

    public String getUrls(int i10) {
        return (String) this.urls_.get(i10);
    }

    public AbstractC2534q getUrlsBytes(int i10) {
        return AbstractC2534q.y((String) this.urls_.get(i10));
    }

    public int getUrlsCount() {
        return this.urls_.size();
    }

    public List<String> getUrlsList() {
        return this.urls_;
    }

    public static B0 newBuilder(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        return (B0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StreamOutput);
    }

    public static LivekitEgress$StreamOutput parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StreamOutput parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$StreamOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StreamOutput parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$StreamOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StreamOutput parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$StreamOutput parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$StreamOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
