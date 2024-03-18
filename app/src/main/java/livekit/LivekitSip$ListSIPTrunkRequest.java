package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.Z3;

/* loaded from: classes2.dex */
public final class LivekitSip$ListSIPTrunkRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitSip$ListSIPTrunkRequest DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER;

    static {
        LivekitSip$ListSIPTrunkRequest livekitSip$ListSIPTrunkRequest = new LivekitSip$ListSIPTrunkRequest();
        DEFAULT_INSTANCE = livekitSip$ListSIPTrunkRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$ListSIPTrunkRequest.class, livekitSip$ListSIPTrunkRequest);
    }

    private LivekitSip$ListSIPTrunkRequest() {
    }

    public static LivekitSip$ListSIPTrunkRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Z3 newBuilder() {
        return (Z3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$ListSIPTrunkRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new LivekitSip$ListSIPTrunkRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$ListSIPTrunkRequest.class) {
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

    public static Z3 newBuilder(LivekitSip$ListSIPTrunkRequest livekitSip$ListSIPTrunkRequest) {
        return (Z3) DEFAULT_INSTANCE.createBuilder(livekitSip$ListSIPTrunkRequest);
    }

    public static LivekitSip$ListSIPTrunkRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(byte[] bArr) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$ListSIPTrunkRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$ListSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
