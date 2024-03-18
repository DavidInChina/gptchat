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
import jh.U3;

/* loaded from: classes.dex */
public final class LivekitSip$DeleteSIPTrunkRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitSip$DeleteSIPTrunkRequest DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SIP_TRUNK_ID_FIELD_NUMBER = 1;
    private String sipTrunkId_ = "";

    static {
        LivekitSip$DeleteSIPTrunkRequest livekitSip$DeleteSIPTrunkRequest = new LivekitSip$DeleteSIPTrunkRequest();
        DEFAULT_INSTANCE = livekitSip$DeleteSIPTrunkRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$DeleteSIPTrunkRequest.class, livekitSip$DeleteSIPTrunkRequest);
    }

    private LivekitSip$DeleteSIPTrunkRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipTrunkId() {
        this.sipTrunkId_ = getDefaultInstance().getSipTrunkId();
    }

    public static LivekitSip$DeleteSIPTrunkRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static U3 newBuilder() {
        return (U3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkId(String str) {
        str.getClass();
        this.sipTrunkId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipTrunkIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sipTrunkId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"sipTrunkId_"});
            case 3:
                return new LivekitSip$DeleteSIPTrunkRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$DeleteSIPTrunkRequest.class) {
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

    public String getSipTrunkId() {
        return this.sipTrunkId_;
    }

    public AbstractC2534q getSipTrunkIdBytes() {
        return AbstractC2534q.y(this.sipTrunkId_);
    }

    public static U3 newBuilder(LivekitSip$DeleteSIPTrunkRequest livekitSip$DeleteSIPTrunkRequest) {
        return (U3) DEFAULT_INSTANCE.createBuilder(livekitSip$DeleteSIPTrunkRequest);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(byte[] bArr) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$DeleteSIPTrunkRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$DeleteSIPTrunkRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
