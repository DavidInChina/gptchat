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
import jh.C4022h3;

/* loaded from: classes2.dex */
public final class LivekitRtc$SessionDescription extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$SessionDescription DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SDP_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private String type_ = "";
    private String sdp_ = "";

    static {
        LivekitRtc$SessionDescription livekitRtc$SessionDescription = new LivekitRtc$SessionDescription();
        DEFAULT_INSTANCE = livekitRtc$SessionDescription;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SessionDescription.class, livekitRtc$SessionDescription);
    }

    private LivekitRtc$SessionDescription() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdp() {
        this.sdp_ = getDefaultInstance().getSdp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    public static LivekitRtc$SessionDescription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4022h3 newBuilder() {
        return (C4022h3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SessionDescription parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SessionDescription parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdp(String str) {
        str.getClass();
        this.sdp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdpBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sdp_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.type_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"type_", "sdp_"});
            case 3:
                return new LivekitRtc$SessionDescription();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SessionDescription.class) {
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

    public String getSdp() {
        return this.sdp_;
    }

    public AbstractC2534q getSdpBytes() {
        return AbstractC2534q.y(this.sdp_);
    }

    public String getType() {
        return this.type_;
    }

    public AbstractC2534q getTypeBytes() {
        return AbstractC2534q.y(this.type_);
    }

    public static C4022h3 newBuilder(LivekitRtc$SessionDescription livekitRtc$SessionDescription) {
        return (C4022h3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SessionDescription);
    }

    public static LivekitRtc$SessionDescription parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SessionDescription parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SessionDescription parseFrom(byte[] bArr) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SessionDescription parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SessionDescription parseFrom(InputStream inputStream) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SessionDescription parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SessionDescription parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SessionDescription) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
