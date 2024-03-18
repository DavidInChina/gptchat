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
import jh.C3988b;
import jh.C3998d;

/* loaded from: classes2.dex */
public final class LivekitAgent$AvailabilityRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$AvailabilityRequest DEFAULT_INSTANCE;
    public static final int JOB_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private LivekitAgent$Job job_;

    static {
        LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest = new LivekitAgent$AvailabilityRequest();
        DEFAULT_INSTANCE = livekitAgent$AvailabilityRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$AvailabilityRequest.class, livekitAgent$AvailabilityRequest);
    }

    private LivekitAgent$AvailabilityRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJob() {
        this.job_ = null;
    }

    public static LivekitAgent$AvailabilityRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJob(LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        LivekitAgent$Job livekitAgent$Job2 = this.job_;
        if (livekitAgent$Job2 != null && livekitAgent$Job2 != LivekitAgent$Job.getDefaultInstance()) {
            C3998d newBuilder = LivekitAgent$Job.newBuilder(this.job_);
            newBuilder.f(livekitAgent$Job);
            this.job_ = (LivekitAgent$Job) newBuilder.c();
            return;
        }
        this.job_ = livekitAgent$Job;
    }

    public static C3988b newBuilder() {
        return (C3988b) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$AvailabilityRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJob(LivekitAgent$Job livekitAgent$Job) {
        livekitAgent$Job.getClass();
        this.job_ = livekitAgent$Job;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"job_"});
            case 3:
                return new LivekitAgent$AvailabilityRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$AvailabilityRequest.class) {
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

    public LivekitAgent$Job getJob() {
        LivekitAgent$Job livekitAgent$Job = this.job_;
        if (livekitAgent$Job == null) {
            return LivekitAgent$Job.getDefaultInstance();
        }
        return livekitAgent$Job;
    }

    public boolean hasJob() {
        if (this.job_ != null) {
            return true;
        }
        return false;
    }

    public static C3988b newBuilder(LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest) {
        return (C3988b) DEFAULT_INSTANCE.createBuilder(livekitAgent$AvailabilityRequest);
    }

    public static LivekitAgent$AvailabilityRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(byte[] bArr) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(InputStream inputStream) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$AvailabilityRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$AvailabilityRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
