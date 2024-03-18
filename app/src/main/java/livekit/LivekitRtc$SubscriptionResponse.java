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
import jh.D3;
import jh.EnumC4031j2;

/* loaded from: classes.dex */
public final class LivekitRtc$SubscriptionResponse extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$SubscriptionResponse DEFAULT_INSTANCE;
    public static final int ERR_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private int err_;
    private String trackSid_ = "";

    static {
        LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse = new LivekitRtc$SubscriptionResponse();
        DEFAULT_INSTANCE = livekitRtc$SubscriptionResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SubscriptionResponse.class, livekitRtc$SubscriptionResponse);
    }

    private LivekitRtc$SubscriptionResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErr() {
        this.err_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$SubscriptionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static D3 newBuilder() {
        return (D3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscriptionResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErr(EnumC4031j2 enumC4031j2) {
        this.err_ = enumC4031j2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrValue(int i10) {
        this.err_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.trackSid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f", new Object[]{"trackSid_", "err_"});
            case 3:
                return new LivekitRtc$SubscriptionResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SubscriptionResponse.class) {
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

    public EnumC4031j2 getErr() {
        EnumC4031j2 enumC4031j2;
        int i10 = this.err_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    enumC4031j2 = null;
                } else {
                    enumC4031j2 = EnumC4031j2.SE_TRACK_NOTFOUND;
                }
            } else {
                enumC4031j2 = EnumC4031j2.SE_CODEC_UNSUPPORTED;
            }
        } else {
            enumC4031j2 = EnumC4031j2.SE_UNKNOWN;
        }
        if (enumC4031j2 == null) {
            return EnumC4031j2.UNRECOGNIZED;
        }
        return enumC4031j2;
    }

    public int getErrValue() {
        return this.err_;
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static D3 newBuilder(LivekitRtc$SubscriptionResponse livekitRtc$SubscriptionResponse) {
        return (D3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscriptionResponse);
    }

    public static LivekitRtc$SubscriptionResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SubscriptionResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SubscriptionResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
