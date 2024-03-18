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
import jh.P0;

/* loaded from: classes.dex */
public final class LivekitIngress$DeleteIngressRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitIngress$DeleteIngressRequest DEFAULT_INSTANCE;
    public static final int INGRESS_ID_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private String ingressId_ = "";

    static {
        LivekitIngress$DeleteIngressRequest livekitIngress$DeleteIngressRequest = new LivekitIngress$DeleteIngressRequest();
        DEFAULT_INSTANCE = livekitIngress$DeleteIngressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$DeleteIngressRequest.class, livekitIngress$DeleteIngressRequest);
    }

    private LivekitIngress$DeleteIngressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIngressId() {
        this.ingressId_ = getDefaultInstance().getIngressId();
    }

    public static LivekitIngress$DeleteIngressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static P0 newBuilder() {
        return (P0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$DeleteIngressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressId(String str) {
        str.getClass();
        this.ingressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIngressIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.ingressId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"ingressId_"});
            case 3:
                return new LivekitIngress$DeleteIngressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$DeleteIngressRequest.class) {
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

    public String getIngressId() {
        return this.ingressId_;
    }

    public AbstractC2534q getIngressIdBytes() {
        return AbstractC2534q.y(this.ingressId_);
    }

    public static P0 newBuilder(LivekitIngress$DeleteIngressRequest livekitIngress$DeleteIngressRequest) {
        return (P0) DEFAULT_INSTANCE.createBuilder(livekitIngress$DeleteIngressRequest);
    }

    public static LivekitIngress$DeleteIngressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(byte[] bArr) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(InputStream inputStream) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$DeleteIngressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$DeleteIngressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
