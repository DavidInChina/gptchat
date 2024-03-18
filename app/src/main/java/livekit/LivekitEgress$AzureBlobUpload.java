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
import jh.C3981I;

/* loaded from: classes.dex */
public final class LivekitEgress$AzureBlobUpload extends AbstractC2497d0 implements N0 {
    public static final int ACCOUNT_KEY_FIELD_NUMBER = 2;
    public static final int ACCOUNT_NAME_FIELD_NUMBER = 1;
    public static final int CONTAINER_NAME_FIELD_NUMBER = 3;
    private static final LivekitEgress$AzureBlobUpload DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER;
    private String accountName_ = "";
    private String accountKey_ = "";
    private String containerName_ = "";

    static {
        LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload = new LivekitEgress$AzureBlobUpload();
        DEFAULT_INSTANCE = livekitEgress$AzureBlobUpload;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$AzureBlobUpload.class, livekitEgress$AzureBlobUpload);
    }

    private LivekitEgress$AzureBlobUpload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountKey() {
        this.accountKey_ = getDefaultInstance().getAccountKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountName() {
        this.accountName_ = getDefaultInstance().getAccountName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContainerName() {
        this.containerName_ = getDefaultInstance().getContainerName();
    }

    public static LivekitEgress$AzureBlobUpload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3981I newBuilder() {
        return (C3981I) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$AzureBlobUpload parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountKey(String str) {
        str.getClass();
        this.accountKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountKeyBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.accountKey_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountName(String str) {
        str.getClass();
        this.accountName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.accountName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContainerName(String str) {
        str.getClass();
        this.containerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContainerNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.containerName_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"accountName_", "accountKey_", "containerName_"});
            case 3:
                return new LivekitEgress$AzureBlobUpload();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$AzureBlobUpload.class) {
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

    public String getAccountKey() {
        return this.accountKey_;
    }

    public AbstractC2534q getAccountKeyBytes() {
        return AbstractC2534q.y(this.accountKey_);
    }

    public String getAccountName() {
        return this.accountName_;
    }

    public AbstractC2534q getAccountNameBytes() {
        return AbstractC2534q.y(this.accountName_);
    }

    public String getContainerName() {
        return this.containerName_;
    }

    public AbstractC2534q getContainerNameBytes() {
        return AbstractC2534q.y(this.containerName_);
    }

    public static C3981I newBuilder(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        return (C3981I) DEFAULT_INSTANCE.createBuilder(livekitEgress$AzureBlobUpload);
    }

    public static LivekitEgress$AzureBlobUpload parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(byte[] bArr) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(InputStream inputStream) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$AzureBlobUpload parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$AzureBlobUpload) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
