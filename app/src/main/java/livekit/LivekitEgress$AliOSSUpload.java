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
import jh.C3976D;

/* loaded from: classes2.dex */
public final class LivekitEgress$AliOSSUpload extends AbstractC2497d0 implements N0 {
    public static final int ACCESS_KEY_FIELD_NUMBER = 1;
    public static final int BUCKET_FIELD_NUMBER = 5;
    private static final LivekitEgress$AliOSSUpload DEFAULT_INSTANCE;
    public static final int ENDPOINT_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 3;
    public static final int SECRET_FIELD_NUMBER = 2;
    private String accessKey_ = "";
    private String secret_ = "";
    private String region_ = "";
    private String endpoint_ = "";
    private String bucket_ = "";

    static {
        LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload = new LivekitEgress$AliOSSUpload();
        DEFAULT_INSTANCE = livekitEgress$AliOSSUpload;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$AliOSSUpload.class, livekitEgress$AliOSSUpload);
    }

    private LivekitEgress$AliOSSUpload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessKey() {
        this.accessKey_ = getDefaultInstance().getAccessKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBucket() {
        this.bucket_ = getDefaultInstance().getBucket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoint() {
        this.endpoint_ = getDefaultInstance().getEndpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecret() {
        this.secret_ = getDefaultInstance().getSecret();
    }

    public static LivekitEgress$AliOSSUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3976D newBuilder() {
        return (C3976D) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$AliOSSUpload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessKey(String str) {
        str.getClass();
        this.accessKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessKeyBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.accessKey_ = abstractC2534q.q0();
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
    public void setEndpoint(String str) {
        str.getClass();
        this.endpoint_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpointBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.endpoint_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.region_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecret(String str) {
        str.getClass();
        this.secret_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecretBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.secret_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208", new Object[]{"accessKey_", "secret_", "region_", "endpoint_", "bucket_"});
            case 3:
                return new LivekitEgress$AliOSSUpload();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$AliOSSUpload.class) {
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

    public String getAccessKey() {
        return this.accessKey_;
    }

    public AbstractC2534q getAccessKeyBytes() {
        return AbstractC2534q.y(this.accessKey_);
    }

    public String getBucket() {
        return this.bucket_;
    }

    public AbstractC2534q getBucketBytes() {
        return AbstractC2534q.y(this.bucket_);
    }

    public String getEndpoint() {
        return this.endpoint_;
    }

    public AbstractC2534q getEndpointBytes() {
        return AbstractC2534q.y(this.endpoint_);
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC2534q getRegionBytes() {
        return AbstractC2534q.y(this.region_);
    }

    public String getSecret() {
        return this.secret_;
    }

    public AbstractC2534q getSecretBytes() {
        return AbstractC2534q.y(this.secret_);
    }

    public static C3976D newBuilder(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        return (C3976D) DEFAULT_INSTANCE.createBuilder(livekitEgress$AliOSSUpload);
    }

    public static LivekitEgress$AliOSSUpload parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(byte[] bArr) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(InputStream inputStream) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$AliOSSUpload parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$AliOSSUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
