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
import jh.M1;
import jh.X2;

/* loaded from: classes2.dex */
public final class LivekitRtc$LeaveRequest extends AbstractC2497d0 implements N0 {
    public static final int CAN_RECONNECT_FIELD_NUMBER = 1;
    private static final LivekitRtc$LeaveRequest DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private boolean canReconnect_;
    private int reason_;

    static {
        LivekitRtc$LeaveRequest livekitRtc$LeaveRequest = new LivekitRtc$LeaveRequest();
        DEFAULT_INSTANCE = livekitRtc$LeaveRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$LeaveRequest.class, livekitRtc$LeaveRequest);
    }

    private LivekitRtc$LeaveRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanReconnect() {
        this.canReconnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    public static LivekitRtc$LeaveRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static X2 newBuilder() {
        return (X2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$LeaveRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$LeaveRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanReconnect(boolean z10) {
        this.canReconnect_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(M1 m12) {
        this.reason_ = m12.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i10) {
        this.reason_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"canReconnect_", "reason_"});
            case 3:
                return new LivekitRtc$LeaveRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$LeaveRequest.class) {
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

    public boolean getCanReconnect() {
        return this.canReconnect_;
    }

    public M1 getReason() {
        M1 m12;
        switch (this.reason_) {
            case 0:
                m12 = M1.UNKNOWN_REASON;
                break;
            case 1:
                m12 = M1.CLIENT_INITIATED;
                break;
            case 2:
                m12 = M1.DUPLICATE_IDENTITY;
                break;
            case 3:
                m12 = M1.SERVER_SHUTDOWN;
                break;
            case 4:
                m12 = M1.PARTICIPANT_REMOVED;
                break;
            case 5:
                m12 = M1.ROOM_DELETED;
                break;
            case 6:
                m12 = M1.STATE_MISMATCH;
                break;
            case 7:
                m12 = M1.JOIN_FAILURE;
                break;
            default:
                m12 = null;
                break;
        }
        if (m12 == null) {
            return M1.UNRECOGNIZED;
        }
        return m12;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public static X2 newBuilder(LivekitRtc$LeaveRequest livekitRtc$LeaveRequest) {
        return (X2) DEFAULT_INSTANCE.createBuilder(livekitRtc$LeaveRequest);
    }

    public static LivekitRtc$LeaveRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$LeaveRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$LeaveRequest parseFrom(byte[] bArr) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$LeaveRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$LeaveRequest parseFrom(InputStream inputStream) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$LeaveRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$LeaveRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$LeaveRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
