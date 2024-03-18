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
import jh.J3;

/* loaded from: classes2.dex */
public final class LivekitRtc$TrackUnpublishedResponse extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$TrackUnpublishedResponse DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TRACK_SID_FIELD_NUMBER = 1;
    private String trackSid_ = "";

    static {
        LivekitRtc$TrackUnpublishedResponse livekitRtc$TrackUnpublishedResponse = new LivekitRtc$TrackUnpublishedResponse();
        DEFAULT_INSTANCE = livekitRtc$TrackUnpublishedResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$TrackUnpublishedResponse.class, livekitRtc$TrackUnpublishedResponse);
    }

    private LivekitRtc$TrackUnpublishedResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRtc$TrackUnpublishedResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static J3 newBuilder() {
        return (J3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$TrackUnpublishedResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"trackSid_"});
            case 3:
                return new LivekitRtc$TrackUnpublishedResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$TrackUnpublishedResponse.class) {
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

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static J3 newBuilder(LivekitRtc$TrackUnpublishedResponse livekitRtc$TrackUnpublishedResponse) {
        return (J3) DEFAULT_INSTANCE.createBuilder(livekitRtc$TrackUnpublishedResponse);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$TrackUnpublishedResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$TrackUnpublishedResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
