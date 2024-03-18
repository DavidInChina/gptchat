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
import jh.C4003e;
import jh.C4028j;
import jh.C4033k;
import jh.EnumC4038l;

/* loaded from: classes.dex */
public final class LivekitAgent$ServerMessage extends AbstractC2497d0 implements N0 {
    public static final int ASSIGNMENT_FIELD_NUMBER = 3;
    public static final int AVAILABILITY_FIELD_NUMBER = 2;
    private static final LivekitAgent$ServerMessage DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGISTER_FIELD_NUMBER = 1;
    private int messageCase_ = 0;
    private Object message_;

    static {
        LivekitAgent$ServerMessage livekitAgent$ServerMessage = new LivekitAgent$ServerMessage();
        DEFAULT_INSTANCE = livekitAgent$ServerMessage;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$ServerMessage.class, livekitAgent$ServerMessage);
    }

    private LivekitAgent$ServerMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssignment() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailability() {
        if (this.messageCase_ == 2) {
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

    public static LivekitAgent$ServerMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAssignment(LivekitAgent$JobAssignment livekitAgent$JobAssignment) {
        livekitAgent$JobAssignment.getClass();
        if (this.messageCase_ == 3 && this.message_ != LivekitAgent$JobAssignment.getDefaultInstance()) {
            C4003e newBuilder = LivekitAgent$JobAssignment.newBuilder((LivekitAgent$JobAssignment) this.message_);
            newBuilder.f(livekitAgent$JobAssignment);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$JobAssignment;
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAvailability(LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest) {
        livekitAgent$AvailabilityRequest.getClass();
        if (this.messageCase_ == 2 && this.message_ != LivekitAgent$AvailabilityRequest.getDefaultInstance()) {
            C3988b newBuilder = LivekitAgent$AvailabilityRequest.newBuilder((LivekitAgent$AvailabilityRequest) this.message_);
            newBuilder.f(livekitAgent$AvailabilityRequest);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$AvailabilityRequest;
        }
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegister(LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse) {
        livekitAgent$RegisterWorkerResponse.getClass();
        if (this.messageCase_ == 1 && this.message_ != LivekitAgent$RegisterWorkerResponse.getDefaultInstance()) {
            C4028j newBuilder = LivekitAgent$RegisterWorkerResponse.newBuilder((LivekitAgent$RegisterWorkerResponse) this.message_);
            newBuilder.f(livekitAgent$RegisterWorkerResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitAgent$RegisterWorkerResponse;
        }
        this.messageCase_ = 1;
    }

    public static C4033k newBuilder() {
        return (C4033k) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$ServerMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$ServerMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssignment(LivekitAgent$JobAssignment livekitAgent$JobAssignment) {
        livekitAgent$JobAssignment.getClass();
        this.message_ = livekitAgent$JobAssignment;
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailability(LivekitAgent$AvailabilityRequest livekitAgent$AvailabilityRequest) {
        livekitAgent$AvailabilityRequest.getClass();
        this.message_ = livekitAgent$AvailabilityRequest;
        this.messageCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegister(LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse) {
        livekitAgent$RegisterWorkerResponse.getClass();
        this.message_ = livekitAgent$RegisterWorkerResponse;
        this.messageCase_ = 1;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"message_", "messageCase_", LivekitAgent$RegisterWorkerResponse.class, LivekitAgent$AvailabilityRequest.class, LivekitAgent$JobAssignment.class});
            case 3:
                return new LivekitAgent$ServerMessage();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$ServerMessage.class) {
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

    public LivekitAgent$JobAssignment getAssignment() {
        if (this.messageCase_ == 3) {
            return (LivekitAgent$JobAssignment) this.message_;
        }
        return LivekitAgent$JobAssignment.getDefaultInstance();
    }

    public LivekitAgent$AvailabilityRequest getAvailability() {
        if (this.messageCase_ == 2) {
            return (LivekitAgent$AvailabilityRequest) this.message_;
        }
        return LivekitAgent$AvailabilityRequest.getDefaultInstance();
    }

    public EnumC4038l getMessageCase() {
        int i10 = this.messageCase_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return EnumC4038l.f36469h0;
                }
                return EnumC4038l.f36468Z;
            }
            return EnumC4038l.f36467Y;
        }
        return EnumC4038l.f36470i0;
    }

    public LivekitAgent$RegisterWorkerResponse getRegister() {
        if (this.messageCase_ == 1) {
            return (LivekitAgent$RegisterWorkerResponse) this.message_;
        }
        return LivekitAgent$RegisterWorkerResponse.getDefaultInstance();
    }

    public boolean hasAssignment() {
        if (this.messageCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasAvailability() {
        if (this.messageCase_ == 2) {
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

    public static C4033k newBuilder(LivekitAgent$ServerMessage livekitAgent$ServerMessage) {
        return (C4033k) DEFAULT_INSTANCE.createBuilder(livekitAgent$ServerMessage);
    }

    public static LivekitAgent$ServerMessage parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$ServerMessage parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$ServerMessage parseFrom(byte[] bArr) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$ServerMessage parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$ServerMessage parseFrom(InputStream inputStream) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$ServerMessage parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$ServerMessage parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$ServerMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
