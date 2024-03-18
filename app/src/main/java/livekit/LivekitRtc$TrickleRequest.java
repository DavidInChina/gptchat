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
import jh.EnumC4047m3;
import jh.K3;

/* loaded from: classes2.dex */
public final class LivekitRtc$TrickleRequest extends AbstractC2497d0 implements N0 {
    public static final int CANDIDATEINIT_FIELD_NUMBER = 1;
    private static final LivekitRtc$TrickleRequest DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 2;
    private String candidateInit_ = "";
    private int target_;

    static {
        LivekitRtc$TrickleRequest livekitRtc$TrickleRequest = new LivekitRtc$TrickleRequest();
        DEFAULT_INSTANCE = livekitRtc$TrickleRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$TrickleRequest.class, livekitRtc$TrickleRequest);
    }

    private LivekitRtc$TrickleRequest() {
    }

    public static /* synthetic */ void access$16500(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest, String str) {
        livekitRtc$TrickleRequest.setCandidateInit(str);
    }

    public static /* synthetic */ void access$16900(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest, EnumC4047m3 enumC4047m3) {
        livekitRtc$TrickleRequest.setTarget(enumC4047m3);
    }

    public void clearCandidateInit() {
        this.candidateInit_ = getDefaultInstance().getCandidateInit();
    }

    public void clearTarget() {
        this.target_ = 0;
    }

    public static LivekitRtc$TrickleRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static K3 newBuilder() {
        return (K3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$TrickleRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrickleRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setCandidateInit(String str) {
        str.getClass();
        this.candidateInit_ = str;
    }

    public void setCandidateInitBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.candidateInit_ = abstractC2534q.q0();
    }

    public void setTarget(EnumC4047m3 enumC4047m3) {
        this.target_ = enumC4047m3.a();
    }

    public void setTargetValue(int i10) {
        this.target_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f", new Object[]{"candidateInit_", "target_"});
            case 3:
                return new LivekitRtc$TrickleRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$TrickleRequest.class) {
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

    public String getCandidateInit() {
        return this.candidateInit_;
    }

    public AbstractC2534q getCandidateInitBytes() {
        return AbstractC2534q.y(this.candidateInit_);
    }

    public EnumC4047m3 getTarget() {
        EnumC4047m3 enumC4047m3;
        int i10 = this.target_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4047m3 = null;
            } else {
                enumC4047m3 = EnumC4047m3.SUBSCRIBER;
            }
        } else {
            enumC4047m3 = EnumC4047m3.PUBLISHER;
        }
        if (enumC4047m3 == null) {
            return EnumC4047m3.UNRECOGNIZED;
        }
        return enumC4047m3;
    }

    public int getTargetValue() {
        return this.target_;
    }

    public static K3 newBuilder(LivekitRtc$TrickleRequest livekitRtc$TrickleRequest) {
        return (K3) DEFAULT_INSTANCE.createBuilder(livekitRtc$TrickleRequest);
    }

    public static LivekitRtc$TrickleRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$TrickleRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$TrickleRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$TrickleRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$TrickleRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrickleRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$TrickleRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$TrickleRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
