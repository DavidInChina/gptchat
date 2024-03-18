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
import jh.Y2;

/* loaded from: classes.dex */
public final class LivekitRtc$MuteTrackRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$MuteTrackRequest DEFAULT_INSTANCE;
    public static final int MUTED_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    private boolean muted_;
    private String sid_ = "";

    static {
        LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest = new LivekitRtc$MuteTrackRequest();
        DEFAULT_INSTANCE = livekitRtc$MuteTrackRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$MuteTrackRequest.class, livekitRtc$MuteTrackRequest);
    }

    private LivekitRtc$MuteTrackRequest() {
    }

    public static /* synthetic */ void access$17300(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest, String str) {
        livekitRtc$MuteTrackRequest.setSid(str);
    }

    public static /* synthetic */ void access$17600(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest, boolean z10) {
        livekitRtc$MuteTrackRequest.setMuted(z10);
    }

    public void clearMuted() {
        this.muted_ = false;
    }

    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    public static LivekitRtc$MuteTrackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Y2 newBuilder() {
        return (Y2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$MuteTrackRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setMuted(boolean z10) {
        this.muted_ = z10;
    }

    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    public void setSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[]{"sid_", "muted_"});
            case 3:
                return new LivekitRtc$MuteTrackRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$MuteTrackRequest.class) {
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

    public boolean getMuted() {
        return this.muted_;
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC2534q getSidBytes() {
        return AbstractC2534q.y(this.sid_);
    }

    public static Y2 newBuilder(LivekitRtc$MuteTrackRequest livekitRtc$MuteTrackRequest) {
        return (Y2) DEFAULT_INSTANCE.createBuilder(livekitRtc$MuteTrackRequest);
    }

    public static LivekitRtc$MuteTrackRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$MuteTrackRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$MuteTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
