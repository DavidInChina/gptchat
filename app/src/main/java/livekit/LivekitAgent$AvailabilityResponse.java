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
import jh.C3993c;

/* loaded from: classes.dex */
public final class LivekitAgent$AvailabilityResponse extends AbstractC2497d0 implements N0 {
    public static final int AVAILABLE_FIELD_NUMBER = 2;
    private static final LivekitAgent$AvailabilityResponse DEFAULT_INSTANCE;
    public static final int JOB_ID_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private boolean available_;
    private String jobId_ = "";

    static {
        LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse = new LivekitAgent$AvailabilityResponse();
        DEFAULT_INSTANCE = livekitAgent$AvailabilityResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$AvailabilityResponse.class, livekitAgent$AvailabilityResponse);
    }

    private LivekitAgent$AvailabilityResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailable() {
        this.available_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobId() {
        this.jobId_ = getDefaultInstance().getJobId();
    }

    public static LivekitAgent$AvailabilityResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3993c newBuilder() {
        return (C3993c) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$AvailabilityResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailable(boolean z10) {
        this.available_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobId(String str) {
        str.getClass();
        this.jobId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.jobId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0007", new Object[]{"jobId_", "available_"});
            case 3:
                return new LivekitAgent$AvailabilityResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$AvailabilityResponse.class) {
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

    public boolean getAvailable() {
        return this.available_;
    }

    public String getJobId() {
        return this.jobId_;
    }

    public AbstractC2534q getJobIdBytes() {
        return AbstractC2534q.y(this.jobId_);
    }

    public static C3993c newBuilder(LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse) {
        return (C3993c) DEFAULT_INSTANCE.createBuilder(livekitAgent$AvailabilityResponse);
    }

    public static LivekitAgent$AvailabilityResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(byte[] bArr) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$AvailabilityResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$AvailabilityResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
