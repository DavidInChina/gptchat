package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C3976D;
import jh.C3981I;
import jh.C4049n0;
import jh.Q;
import jh.S;
import jh.T;
import jh.U;
import jh.Z;

/* loaded from: classes2.dex */
public final class LivekitEgress$EncodedFileOutput extends AbstractC2497d0 implements T {
    public static final int ALIOSS_FIELD_NUMBER = 7;
    public static final int AZURE_FIELD_NUMBER = 5;
    private static final LivekitEgress$EncodedFileOutput DEFAULT_INSTANCE;
    public static final int DISABLE_MANIFEST_FIELD_NUMBER = 6;
    public static final int FILEPATH_FIELD_NUMBER = 2;
    public static final int FILE_TYPE_FIELD_NUMBER = 1;
    public static final int GCP_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int S3_FIELD_NUMBER = 3;
    private boolean disableManifest_;
    private int fileType_;
    private Object output_;
    private int outputCase_ = 0;
    private String filepath_ = "";

    static {
        LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput = new LivekitEgress$EncodedFileOutput();
        DEFAULT_INSTANCE = livekitEgress$EncodedFileOutput;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$EncodedFileOutput.class, livekitEgress$EncodedFileOutput);
    }

    private LivekitEgress$EncodedFileOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliOSS() {
        if (this.outputCase_ == 7) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzure() {
        if (this.outputCase_ == 5) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableManifest() {
        this.disableManifest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileType() {
        this.fileType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilepath() {
        this.filepath_ = getDefaultInstance().getFilepath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGcp() {
        if (this.outputCase_ == 4) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS3() {
        if (this.outputCase_ == 3) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    public static LivekitEgress$EncodedFileOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        if (this.outputCase_ == 7 && this.output_ != LivekitEgress$AliOSSUpload.getDefaultInstance()) {
            C3976D newBuilder = LivekitEgress$AliOSSUpload.newBuilder((LivekitEgress$AliOSSUpload) this.output_);
            newBuilder.f(livekitEgress$AliOSSUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$AliOSSUpload;
        }
        this.outputCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        if (this.outputCase_ == 5 && this.output_ != LivekitEgress$AzureBlobUpload.getDefaultInstance()) {
            C3981I newBuilder = LivekitEgress$AzureBlobUpload.newBuilder((LivekitEgress$AzureBlobUpload) this.output_);
            newBuilder.f(livekitEgress$AzureBlobUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$AzureBlobUpload;
        }
        this.outputCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        if (this.outputCase_ == 4 && this.output_ != LivekitEgress$GCPUpload.getDefaultInstance()) {
            Z newBuilder = LivekitEgress$GCPUpload.newBuilder((LivekitEgress$GCPUpload) this.output_);
            newBuilder.f(livekitEgress$GCPUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$GCPUpload;
        }
        this.outputCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        if (this.outputCase_ == 3 && this.output_ != LivekitEgress$S3Upload.getDefaultInstance()) {
            C4049n0 newBuilder = LivekitEgress$S3Upload.newBuilder((LivekitEgress$S3Upload) this.output_);
            newBuilder.f(livekitEgress$S3Upload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$S3Upload;
        }
        this.outputCase_ = 3;
    }

    public static Q newBuilder() {
        return (Q) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$EncodedFileOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        this.output_ = livekitEgress$AliOSSUpload;
        this.outputCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        this.output_ = livekitEgress$AzureBlobUpload;
        this.outputCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableManifest(boolean z10) {
        this.disableManifest_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileType(U u10) {
        this.fileType_ = u10.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileTypeValue(int i10) {
        this.fileType_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilepath(String str) {
        str.getClass();
        this.filepath_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilepathBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.filepath_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        this.output_ = livekitEgress$GCPUpload;
        this.outputCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        this.output_ = livekitEgress$S3Upload;
        this.outputCase_ = 3;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\u0007\u0007<\u0000", new Object[]{"output_", "outputCase_", "fileType_", "filepath_", LivekitEgress$S3Upload.class, LivekitEgress$GCPUpload.class, LivekitEgress$AzureBlobUpload.class, "disableManifest_", LivekitEgress$AliOSSUpload.class});
            case 3:
                return new LivekitEgress$EncodedFileOutput();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$EncodedFileOutput.class) {
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

    public LivekitEgress$AliOSSUpload getAliOSS() {
        if (this.outputCase_ == 7) {
            return (LivekitEgress$AliOSSUpload) this.output_;
        }
        return LivekitEgress$AliOSSUpload.getDefaultInstance();
    }

    public LivekitEgress$AzureBlobUpload getAzure() {
        if (this.outputCase_ == 5) {
            return (LivekitEgress$AzureBlobUpload) this.output_;
        }
        return LivekitEgress$AzureBlobUpload.getDefaultInstance();
    }

    public boolean getDisableManifest() {
        return this.disableManifest_;
    }

    public U getFileType() {
        U u10;
        int i10 = this.fileType_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    u10 = null;
                } else {
                    u10 = U.OGG;
                }
            } else {
                u10 = U.MP4;
            }
        } else {
            u10 = U.DEFAULT_FILETYPE;
        }
        if (u10 == null) {
            return U.UNRECOGNIZED;
        }
        return u10;
    }

    public int getFileTypeValue() {
        return this.fileType_;
    }

    public String getFilepath() {
        return this.filepath_;
    }

    public AbstractC2534q getFilepathBytes() {
        return AbstractC2534q.y(this.filepath_);
    }

    public LivekitEgress$GCPUpload getGcp() {
        if (this.outputCase_ == 4) {
            return (LivekitEgress$GCPUpload) this.output_;
        }
        return LivekitEgress$GCPUpload.getDefaultInstance();
    }

    public S getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 != 0) {
            if (i10 != 7) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        return S.f36338h0;
                    }
                    return S.f36337Z;
                }
                return S.f36336Y;
            }
            return S.f36339i0;
        }
        return S.f36340j0;
    }

    public LivekitEgress$S3Upload getS3() {
        if (this.outputCase_ == 3) {
            return (LivekitEgress$S3Upload) this.output_;
        }
        return LivekitEgress$S3Upload.getDefaultInstance();
    }

    public boolean hasAliOSS() {
        if (this.outputCase_ == 7) {
            return true;
        }
        return false;
    }

    public boolean hasAzure() {
        if (this.outputCase_ == 5) {
            return true;
        }
        return false;
    }

    public boolean hasGcp() {
        if (this.outputCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasS3() {
        if (this.outputCase_ == 3) {
            return true;
        }
        return false;
    }

    public static Q newBuilder(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        return (Q) DEFAULT_INSTANCE.createBuilder(livekitEgress$EncodedFileOutput);
    }

    public static LivekitEgress$EncodedFileOutput parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$EncodedFileOutput parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$EncodedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
