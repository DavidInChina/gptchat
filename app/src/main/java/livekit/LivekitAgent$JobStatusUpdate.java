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
import jh.C4013g;
import jh.EnumC4008f;

/* loaded from: classes2.dex */
public final class LivekitAgent$JobStatusUpdate extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$JobStatusUpdate DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int JOB_ID_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int USER_DATA_FIELD_NUMBER = 4;
    private int status_;
    private String jobId_ = "";
    private String error_ = "";
    private String userData_ = "";

    static {
        LivekitAgent$JobStatusUpdate livekitAgent$JobStatusUpdate = new LivekitAgent$JobStatusUpdate();
        DEFAULT_INSTANCE = livekitAgent$JobStatusUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$JobStatusUpdate.class, livekitAgent$JobStatusUpdate);
    }

    private LivekitAgent$JobStatusUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = getDefaultInstance().getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJobId() {
        this.jobId_ = getDefaultInstance().getJobId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserData() {
        this.userData_ = getDefaultInstance().getUserData();
    }

    public static LivekitAgent$JobStatusUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4013g newBuilder() {
        return (C4013g) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$JobStatusUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(String str) {
        str.getClass();
        this.error_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.error_ = abstractC2534q.q0();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(EnumC4008f enumC4008f) {
        this.status_ = enumC4008f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusValue(int i10) {
        this.status_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserData(String str) {
        str.getClass();
        this.userData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserDataBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.userData_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208\u0004\u0208", new Object[]{"jobId_", "status_", "error_", "userData_"});
            case 3:
                return new LivekitAgent$JobStatusUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$JobStatusUpdate.class) {
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

    public String getError() {
        return this.error_;
    }

    public AbstractC2534q getErrorBytes() {
        return AbstractC2534q.y(this.error_);
    }

    public String getJobId() {
        return this.jobId_;
    }

    public AbstractC2534q getJobIdBytes() {
        return AbstractC2534q.y(this.jobId_);
    }

    public EnumC4008f getStatus() {
        EnumC4008f enumC4008f;
        int i10 = this.status_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    enumC4008f = null;
                } else {
                    enumC4008f = EnumC4008f.JS_FAILED;
                }
            } else {
                enumC4008f = EnumC4008f.JS_SUCCESS;
            }
        } else {
            enumC4008f = EnumC4008f.JS_UNKNOWN;
        }
        if (enumC4008f == null) {
            return EnumC4008f.UNRECOGNIZED;
        }
        return enumC4008f;
    }

    public int getStatusValue() {
        return this.status_;
    }

    public String getUserData() {
        return this.userData_;
    }

    public AbstractC2534q getUserDataBytes() {
        return AbstractC2534q.y(this.userData_);
    }

    public static C4013g newBuilder(LivekitAgent$JobStatusUpdate livekitAgent$JobStatusUpdate) {
        return (C4013g) DEFAULT_INSTANCE.createBuilder(livekitAgent$JobStatusUpdate);
    }

    public static LivekitAgent$JobStatusUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(byte[] bArr) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(InputStream inputStream) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$JobStatusUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$JobStatusUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
