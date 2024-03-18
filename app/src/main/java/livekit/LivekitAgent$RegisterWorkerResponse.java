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
import jh.C4028j;

/* loaded from: classes.dex */
public final class LivekitAgent$RegisterWorkerResponse extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$RegisterWorkerResponse DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SERVER_VERSION_FIELD_NUMBER = 2;
    public static final int WORKER_ID_FIELD_NUMBER = 1;
    private String workerId_ = "";
    private String serverVersion_ = "";

    static {
        LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse = new LivekitAgent$RegisterWorkerResponse();
        DEFAULT_INSTANCE = livekitAgent$RegisterWorkerResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$RegisterWorkerResponse.class, livekitAgent$RegisterWorkerResponse);
    }

    private LivekitAgent$RegisterWorkerResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerVersion() {
        this.serverVersion_ = getDefaultInstance().getServerVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkerId() {
        this.workerId_ = getDefaultInstance().getWorkerId();
    }

    public static LivekitAgent$RegisterWorkerResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4028j newBuilder() {
        return (C4028j) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$RegisterWorkerResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersion(String str) {
        str.getClass();
        this.serverVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.serverVersion_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkerId(String str) {
        str.getClass();
        this.workerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkerIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.workerId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"workerId_", "serverVersion_"});
            case 3:
                return new LivekitAgent$RegisterWorkerResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$RegisterWorkerResponse.class) {
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

    public String getServerVersion() {
        return this.serverVersion_;
    }

    public AbstractC2534q getServerVersionBytes() {
        return AbstractC2534q.y(this.serverVersion_);
    }

    public String getWorkerId() {
        return this.workerId_;
    }

    public AbstractC2534q getWorkerIdBytes() {
        return AbstractC2534q.y(this.workerId_);
    }

    public static C4028j newBuilder(LivekitAgent$RegisterWorkerResponse livekitAgent$RegisterWorkerResponse) {
        return (C4028j) DEFAULT_INSTANCE.createBuilder(livekitAgent$RegisterWorkerResponse);
    }

    public static LivekitAgent$RegisterWorkerResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(byte[] bArr) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$RegisterWorkerResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$RegisterWorkerResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
