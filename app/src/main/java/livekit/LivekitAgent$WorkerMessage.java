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
import jh.C3993c;
import jh.C4013g;
import jh.C4023i;
import jh.C4043m;
import jh.C4048n;
import jh.EnumC4053o;

/* loaded from: classes2.dex */
public final class LivekitAgent$WorkerMessage extends AbstractC2497d0 implements N0 {
    public static final int AVAILABILITY_FIELD_NUMBER = 2;
    private static final LivekitAgent$WorkerMessage DEFAULT_INSTANCE;
    public static final int JOB_UPDATE_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGISTER_FIELD_NUMBER = 1;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitAgent$WorkerMessage livekitAgent$WorkerMessage = new LivekitAgent$WorkerMessage();
        DEFAULT_INSTANCE = livekitAgent$WorkerMessage;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$WorkerMessage.class, livekitAgent$WorkerMessage);
    }

    private LivekitAgent$WorkerMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailability() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobUpdate() {
        if (this.messageCase_ == 4) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.messageCase_ = 0;
        this.message_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegister() {
        if (this.messageCase_ == 1) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitAgent$WorkerMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailability(LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse) {
        livekitAgent$AvailabilityResponse.getClass();
        if (this.messageCase_ == 2 && this.message_ != LivekitAgent$AvailabilityResponse.getDefaultInstance()) {
            C3993c newBuilder = LivekitAgent$AvailabilityResponse.newBuilder((LivekitAgent$AvailabilityResponse) this.message_);
            newBuilder.f(livekitAgent$AvailabilityResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$AvailabilityResponse;
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeJobUpdate(LivekitAgent$JobStatusUpdate livekitAgent$JobStatusUpdate) {
        livekitAgent$JobStatusUpdate.getClass();
        if (this.messageCase_ == 4 && this.message_ != LivekitAgent$JobStatusUpdate.getDefaultInstance()) {
            C4013g newBuilder = LivekitAgent$JobStatusUpdate.newBuilder((LivekitAgent$JobStatusUpdate) this.message_);
            newBuilder.f(livekitAgent$JobStatusUpdate);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$JobStatusUpdate;
        }
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegister(LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest) {
        livekitAgent$RegisterWorkerRequest.getClass();
        if (this.messageCase_ == 1 && this.message_ != LivekitAgent$RegisterWorkerRequest.getDefaultInstance()) {
            C4023i newBuilder = LivekitAgent$RegisterWorkerRequest.newBuilder((LivekitAgent$RegisterWorkerRequest) this.message_);
            newBuilder.f(livekitAgent$RegisterWorkerRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$RegisterWorkerRequest;
        }
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus) {
        livekitAgent$UpdateWorkerStatus.getClass();
        if (this.messageCase_ == 3 && this.message_ != LivekitAgent$UpdateWorkerStatus.getDefaultInstance()) {
            C4043m newBuilder = LivekitAgent$UpdateWorkerStatus.newBuilder((LivekitAgent$UpdateWorkerStatus) this.message_);
            newBuilder.f(livekitAgent$UpdateWorkerStatus);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$UpdateWorkerStatus;
        }
        this.messageCase_ = 3;
    }

    public static C4048n newBuilder() {
        return (C4048n) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$WorkerMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$WorkerMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailability(LivekitAgent$AvailabilityResponse livekitAgent$AvailabilityResponse) {
        livekitAgent$AvailabilityResponse.getClass();
        this.message_ = livekitAgent$AvailabilityResponse;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJobUpdate(LivekitAgent$JobStatusUpdate livekitAgent$JobStatusUpdate) {
        livekitAgent$JobStatusUpdate.getClass();
        this.message_ = livekitAgent$JobStatusUpdate;
        this.messageCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegister(LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest) {
        livekitAgent$RegisterWorkerRequest.getClass();
        this.message_ = livekitAgent$RegisterWorkerRequest;
        this.messageCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus) {
        livekitAgent$UpdateWorkerStatus.getClass();
        this.message_ = livekitAgent$UpdateWorkerStatus;
        this.messageCase_ = 3;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"message_", "messageCase_", LivekitAgent$RegisterWorkerRequest.class, LivekitAgent$AvailabilityResponse.class, LivekitAgent$UpdateWorkerStatus.class, LivekitAgent$JobStatusUpdate.class});
            case 3:
                return new LivekitAgent$WorkerMessage();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$WorkerMessage.class) {
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

    public LivekitAgent$AvailabilityResponse getAvailability() {
        if (this.messageCase_ == 2) {
            return (LivekitAgent$AvailabilityResponse) this.message_;
        }
        return LivekitAgent$AvailabilityResponse.getDefaultInstance();
    }

    public LivekitAgent$JobStatusUpdate getJobUpdate() {
        if (this.messageCase_ == 4) {
            return (LivekitAgent$JobStatusUpdate) this.message_;
        }
        return LivekitAgent$JobStatusUpdate.getDefaultInstance();
    }

    public EnumC4053o getMessageCase() {
        int i10 = this.messageCase_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return EnumC4053o.f36525i0;
                    }
                    return EnumC4053o.f36524h0;
                }
                return EnumC4053o.f36523Z;
            }
            return EnumC4053o.f36522Y;
        }
        return EnumC4053o.f36526j0;
    }

    public LivekitAgent$RegisterWorkerRequest getRegister() {
        if (this.messageCase_ == 1) {
            return (LivekitAgent$RegisterWorkerRequest) this.message_;
        }
        return LivekitAgent$RegisterWorkerRequest.getDefaultInstance();
    }

    public LivekitAgent$UpdateWorkerStatus getStatus() {
        if (this.messageCase_ == 3) {
            return (LivekitAgent$UpdateWorkerStatus) this.message_;
        }
        return LivekitAgent$UpdateWorkerStatus.getDefaultInstance();
    }

    public boolean hasAvailability() {
        if (this.messageCase_ == 2) {
            return true;
        }
        return false;
    }

    public boolean hasJobUpdate() {
        if (this.messageCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasRegister() {
        if (this.messageCase_ == 1) {
            return true;
        }
        return false;
    }

    public boolean hasStatus() {
        if (this.messageCase_ == 3) {
            return true;
        }
        return false;
    }

    public static C4048n newBuilder(LivekitAgent$WorkerMessage livekitAgent$WorkerMessage) {
        return (C4048n) DEFAULT_INSTANCE.createBuilder(livekitAgent$WorkerMessage);
    }

    public static LivekitAgent$WorkerMessage parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$WorkerMessage parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$WorkerMessage parseFrom(byte[] bArr) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$WorkerMessage parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$WorkerMessage parseFrom(InputStream inputStream) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$WorkerMessage parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$WorkerMessage parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$WorkerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
