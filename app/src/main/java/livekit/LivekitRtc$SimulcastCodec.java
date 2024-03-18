package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.AbstractC4067q3;
import jh.C4062p3;

/* loaded from: classes2.dex */
public final class LivekitRtc$SimulcastCodec extends AbstractC2497d0 implements AbstractC4067q3 {
    public static final int CID_FIELD_NUMBER = 2;
    public static final int CODEC_FIELD_NUMBER = 1;
    private static final LivekitRtc$SimulcastCodec DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER;
    private String codec_ = "";
    private String cid_ = "";

    static {
        LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec = new LivekitRtc$SimulcastCodec();
        DEFAULT_INSTANCE = livekitRtc$SimulcastCodec;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SimulcastCodec.class, livekitRtc$SimulcastCodec);
    }

    private LivekitRtc$SimulcastCodec() {
    }

    public static /* synthetic */ void access$11000(LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec, String str) {
        livekitRtc$SimulcastCodec.setCodec(str);
    }

    public static /* synthetic */ void access$11300(LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec, String str) {
        livekitRtc$SimulcastCodec.setCid(str);
    }

    public void clearCid() {
        this.cid_ = getDefaultInstance().getCid();
    }

    public void clearCodec() {
        this.codec_ = getDefaultInstance().getCodec();
    }

    public static LivekitRtc$SimulcastCodec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4062p3 newBuilder() {
        return (C4062p3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SimulcastCodec parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCid(String str) {
        str.getClass();
        this.cid_ = str;
    }

    public void setCidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.cid_ = abstractC2534q.q0();
    }

    public void setCodec(String str) {
        str.getClass();
        this.codec_ = str;
    }

    public void setCodecBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.codec_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"codec_", "cid_"});
            case 3:
                return new LivekitRtc$SimulcastCodec();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SimulcastCodec.class) {
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

    public String getCid() {
        return this.cid_;
    }

    public AbstractC2534q getCidBytes() {
        return AbstractC2534q.y(this.cid_);
    }

    public String getCodec() {
        return this.codec_;
    }

    public AbstractC2534q getCodecBytes() {
        return AbstractC2534q.y(this.codec_);
    }

    public static C4062p3 newBuilder(LivekitRtc$SimulcastCodec livekitRtc$SimulcastCodec) {
        return (C4062p3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SimulcastCodec);
    }

    public static LivekitRtc$SimulcastCodec parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(byte[] bArr) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(InputStream inputStream) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SimulcastCodec parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SimulcastCodec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
