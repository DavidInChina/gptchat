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
import jh.C4043m;
import jh.EnumC4058p;

/* loaded from: classes2.dex */
public final class LivekitAgent$UpdateWorkerStatus extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$UpdateWorkerStatus DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    static {
        LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus = new LivekitAgent$UpdateWorkerStatus();
        DEFAULT_INSTANCE = livekitAgent$UpdateWorkerStatus;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$UpdateWorkerStatus.class, livekitAgent$UpdateWorkerStatus);
    }

    private LivekitAgent$UpdateWorkerStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static LivekitAgent$UpdateWorkerStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4043m newBuilder() {
        return (C4043m) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$UpdateWorkerStatus parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC4058p enumC4058p) {
        this.status_ = enumC4058p.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"status_"});
            case 3:
                return new LivekitAgent$UpdateWorkerStatus();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$UpdateWorkerStatus.class) {
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

    public EnumC4058p getStatus() {
        EnumC4058p enumC4058p;
        int i10 = this.status_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4058p = null;
            } else {
                enumC4058p = EnumC4058p.WS_FULL;
            }
        } else {
            enumC4058p = EnumC4058p.WS_AVAILABLE;
        }
        if (enumC4058p == null) {
            return EnumC4058p.UNRECOGNIZED;
        }
        return enumC4058p;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public static C4043m newBuilder(LivekitAgent$UpdateWorkerStatus livekitAgent$UpdateWorkerStatus) {
        return (C4043m) DEFAULT_INSTANCE.createBuilder(livekitAgent$UpdateWorkerStatus);
    }

    public static LivekitAgent$UpdateWorkerStatus parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(byte[] bArr) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(InputStream inputStream) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$UpdateWorkerStatus parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$UpdateWorkerStatus) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
