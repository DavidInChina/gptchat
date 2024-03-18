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
import jh.J0;

/* loaded from: classes2.dex */
public final class LivekitEgress$UpdateLayoutRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitEgress$UpdateLayoutRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 1;
    public static final int LAYOUT_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER;
    private String egressId_ = "";
    private String layout_ = "";

    static {
        LivekitEgress$UpdateLayoutRequest livekitEgress$UpdateLayoutRequest = new LivekitEgress$UpdateLayoutRequest();
        DEFAULT_INSTANCE = livekitEgress$UpdateLayoutRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$UpdateLayoutRequest.class, livekitEgress$UpdateLayoutRequest);
    }

    private LivekitEgress$UpdateLayoutRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayout() {
        this.layout_ = getDefaultInstance().getLayout();
    }

    public static LivekitEgress$UpdateLayoutRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static J0 newBuilder() {
        return (J0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$UpdateLayoutRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayout(String str) {
        str.getClass();
        this.layout_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.layout_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"egressId_", "layout_"});
            case 3:
                return new LivekitEgress$UpdateLayoutRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$UpdateLayoutRequest.class) {
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

    public String getLayout() {
        return this.layout_;
    }

    public AbstractC2534q getLayoutBytes() {
        return AbstractC2534q.y(this.layout_);
    }

    public static J0 newBuilder(LivekitEgress$UpdateLayoutRequest livekitEgress$UpdateLayoutRequest) {
        return (J0) DEFAULT_INSTANCE.createBuilder(livekitEgress$UpdateLayoutRequest);
    }

    public static LivekitEgress$UpdateLayoutRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$UpdateLayoutRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$UpdateLayoutRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
