package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C4093w0;

/* loaded from: classes.dex */
public final class LivekitEgress$StopEgressRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitEgress$StopEgressRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private String egressId_ = "";

    static {
        LivekitEgress$StopEgressRequest livekitEgress$StopEgressRequest = new LivekitEgress$StopEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$StopEgressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$StopEgressRequest.class, livekitEgress$StopEgressRequest);
    }

    private LivekitEgress$StopEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    public static LivekitEgress$StopEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4093w0 newBuilder() {
        return (C4093w0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$StopEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"egressId_"});
            case 3:
                return new LivekitEgress$StopEgressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$StopEgressRequest.class) {
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

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC2534q getEgressIdBytes() {
        return AbstractC2534q.y(this.egressId_);
    }

    public static C4093w0 newBuilder(LivekitEgress$StopEgressRequest livekitEgress$StopEgressRequest) {
        return (C4093w0) DEFAULT_INSTANCE.createBuilder(livekitEgress$StopEgressRequest);
    }

    public static LivekitEgress$StopEgressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$StopEgressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$StopEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
