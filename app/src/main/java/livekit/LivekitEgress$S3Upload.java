package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.G0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import jh.AbstractC4054o0;
import jh.C4049n0;

/* loaded from: classes.dex */
public final class LivekitEgress$S3Upload extends AbstractC2497d0 implements N0 {
    public static final int ACCESS_KEY_FIELD_NUMBER = 1;
    public static final int BUCKET_FIELD_NUMBER = 5;
    public static final int CONTENT_DISPOSITION_FIELD_NUMBER = 9;
    private static final LivekitEgress$S3Upload DEFAULT_INSTANCE;
    public static final int ENDPOINT_FIELD_NUMBER = 4;
    public static final int FORCE_PATH_STYLE_FIELD_NUMBER = 6;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 3;
    public static final int SECRET_FIELD_NUMBER = 2;
    public static final int TAGGING_FIELD_NUMBER = 8;
    private boolean forcePathStyle_;
    private G0 metadata_ = G0.f27399Z;
    private String accessKey_ = "";
    private String secret_ = "";
    private String region_ = "";
    private String endpoint_ = "";
    private String bucket_ = "";
    private String tagging_ = "";
    private String contentDisposition_ = "";

    static {
        LivekitEgress$S3Upload livekitEgress$S3Upload = new LivekitEgress$S3Upload();
        DEFAULT_INSTANCE = livekitEgress$S3Upload;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$S3Upload.class, livekitEgress$S3Upload);
    }

    private LivekitEgress$S3Upload() {
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
    public void clearContentDisposition() {
        this.contentDisposition_ = getDefaultInstance().getContentDisposition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoint() {
        this.endpoint_ = getDefaultInstance().getEndpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForcePathStyle() {
        this.forcePathStyle_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecret() {
        this.secret_ = getDefaultInstance().getSecret();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagging() {
        this.tagging_ = getDefaultInstance().getTagging();
    }

    public static LivekitEgress$S3Upload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableMetadataMap() {
        return internalGetMutableMetadata();
    }

    private G0 internalGetMetadata() {
        return this.metadata_;
    }

    private G0 internalGetMutableMetadata() {
        G0 g02 = this.metadata_;
        if (!g02.f27400Y) {
            this.metadata_ = g02.c();
        }
        return this.metadata_;
    }

    public static C4049n0 newBuilder() {
        return (C4049n0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$S3Upload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$S3Upload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setContentDisposition(String str) {
        str.getClass();
        this.contentDisposition_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentDispositionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.contentDisposition_ = abstractC2534q.q0();
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
    public void setForcePathStyle(boolean z10) {
        this.forcePathStyle_ = z10;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagging(String str) {
        str.getClass();
        this.tagging_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTaggingBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.tagging_ = abstractC2534q.q0();
    }

    public boolean containsMetadata(String str) {
        str.getClass();
        return internalGetMetadata().containsKey(str);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0007\u00072\b\u0208\t\u0208", new Object[]{"accessKey_", "secret_", "region_", "endpoint_", "bucket_", "forcePathStyle_", "metadata_", AbstractC4054o0.f36528a, "tagging_", "contentDisposition_"});
            case 3:
                return new LivekitEgress$S3Upload();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$S3Upload.class) {
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

    public String getContentDisposition() {
        return this.contentDisposition_;
    }

    public AbstractC2534q getContentDispositionBytes() {
        return AbstractC2534q.y(this.contentDisposition_);
    }

    public String getEndpoint() {
        return this.endpoint_;
    }

    public AbstractC2534q getEndpointBytes() {
        return AbstractC2534q.y(this.endpoint_);
    }

    public boolean getForcePathStyle() {
        return this.forcePathStyle_;
    }

    @Deprecated
    public Map<String, String> getMetadata() {
        return getMetadataMap();
    }

    public int getMetadataCount() {
        return internalGetMetadata().size();
    }

    public Map<String, String> getMetadataMap() {
        return Collections.unmodifiableMap(internalGetMetadata());
    }

    public String getMetadataOrDefault(String str, String str2) {
        str.getClass();
        G0 internalGetMetadata = internalGetMetadata();
        if (internalGetMetadata.containsKey(str)) {
            return (String) internalGetMetadata.get(str);
        }
        return str2;
    }

    public String getMetadataOrThrow(String str) {
        str.getClass();
        G0 internalGetMetadata = internalGetMetadata();
        if (internalGetMetadata.containsKey(str)) {
            return (String) internalGetMetadata.get(str);
        }
        throw new IllegalArgumentException();
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

    public String getTagging() {
        return this.tagging_;
    }

    public AbstractC2534q getTaggingBytes() {
        return AbstractC2534q.y(this.tagging_);
    }

    public static C4049n0 newBuilder(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        return (C4049n0) DEFAULT_INSTANCE.createBuilder(livekitEgress$S3Upload);
    }

    public static LivekitEgress$S3Upload parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$S3Upload parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$S3Upload parseFrom(byte[] bArr) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$S3Upload parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$S3Upload parseFrom(InputStream inputStream) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$S3Upload parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$S3Upload parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$S3Upload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
