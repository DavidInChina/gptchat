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
import jh.C4023i;
import jh.EnumC4018h;

/* loaded from: classes.dex */
public final class LivekitAgent$RegisterWorkerRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$RegisterWorkerRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 3;
    public static final int WORKER_ID_FIELD_NUMBER = 2;
    private int type_;
    private String workerId_ = "";
    private String version_ = "";
    private String name_ = "";

    static {
        LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest = new LivekitAgent$RegisterWorkerRequest();
        DEFAULT_INSTANCE = livekitAgent$RegisterWorkerRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$RegisterWorkerRequest.class, livekitAgent$RegisterWorkerRequest);
    }

    private LivekitAgent$RegisterWorkerRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWorkerId() {
        this.workerId_ = getDefaultInstance().getWorkerId();
    }

    public static LivekitAgent$RegisterWorkerRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4023i newBuilder() {
        return (C4023i) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$RegisterWorkerRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC4018h enumC4018h) {
        this.type_ = enumC4018h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.version_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0208\u0004\u0208", new Object[]{"type_", "workerId_", "version_", "name_"});
            case 3:
                return new LivekitAgent$RegisterWorkerRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$RegisterWorkerRequest.class) {
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

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public EnumC4018h getType() {
        EnumC4018h enumC4018h;
        int i10 = this.type_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4018h = null;
            } else {
                enumC4018h = EnumC4018h.JT_PUBLISHER;
            }
        } else {
            enumC4018h = EnumC4018h.JT_ROOM;
        }
        if (enumC4018h == null) {
            return EnumC4018h.UNRECOGNIZED;
        }
        return enumC4018h;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC2534q getVersionBytes() {
        return AbstractC2534q.y(this.version_);
    }

    public String getWorkerId() {
        return this.workerId_;
    }

    public AbstractC2534q getWorkerIdBytes() {
        return AbstractC2534q.y(this.workerId_);
    }

    public static C4023i newBuilder(LivekitAgent$RegisterWorkerRequest livekitAgent$RegisterWorkerRequest) {
        return (C4023i) DEFAULT_INSTANCE.createBuilder(livekitAgent$RegisterWorkerRequest);
    }

    public static LivekitAgent$RegisterWorkerRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(byte[] bArr) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(InputStream inputStream) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$RegisterWorkerRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$RegisterWorkerRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
