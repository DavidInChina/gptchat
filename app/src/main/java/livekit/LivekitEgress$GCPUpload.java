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
import jh.Z;

/* loaded from: classes2.dex */
public final class LivekitEgress$GCPUpload extends AbstractC2497d0 implements N0 {
    public static final int BUCKET_FIELD_NUMBER = 2;
    public static final int CREDENTIALS_FIELD_NUMBER = 1;
    private static final LivekitEgress$GCPUpload DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER;
    private String credentials_ = "";
    private String bucket_ = "";

    static {
        LivekitEgress$GCPUpload livekitEgress$GCPUpload = new LivekitEgress$GCPUpload();
        DEFAULT_INSTANCE = livekitEgress$GCPUpload;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$GCPUpload.class, livekitEgress$GCPUpload);
    }

    private LivekitEgress$GCPUpload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucket() {
        this.bucket_ = getDefaultInstance().getBucket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentials() {
        this.credentials_ = getDefaultInstance().getCredentials();
    }

    public static LivekitEgress$GCPUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Z newBuilder() {
        return (Z) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$GCPUpload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$GCPUpload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucket(String str) {
        str.getClass();
        this.bucket_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBucketBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.bucket_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentials(String str) {
        str.getClass();
        this.credentials_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.credentials_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"credentials_", "bucket_"});
            case 3:
                return new LivekitEgress$GCPUpload();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$GCPUpload.class) {
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

    public String getBucket() {
        return this.bucket_;
    }

    public AbstractC2534q getBucketBytes() {
        return AbstractC2534q.y(this.bucket_);
    }

    public String getCredentials() {
        return this.credentials_;
    }

    public AbstractC2534q getCredentialsBytes() {
        return AbstractC2534q.y(this.credentials_);
    }

    public static Z newBuilder(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        return (Z) DEFAULT_INSTANCE.createBuilder(livekitEgress$GCPUpload);
    }

    public static LivekitEgress$GCPUpload parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$GCPUpload parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$GCPUpload parseFrom(byte[] bArr) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$GCPUpload parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$GCPUpload parseFrom(InputStream inputStream) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$GCPUpload parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$GCPUpload parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$GCPUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
