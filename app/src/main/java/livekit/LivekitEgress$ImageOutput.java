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
import jh.AbstractC3999d0;
import jh.C3976D;
import jh.C3981I;
import jh.C3989b0;
import jh.C4049n0;
import jh.EnumC3984a0;
import jh.EnumC3994c0;
import jh.P1;
import jh.Z;

/* loaded from: classes.dex */
public final class LivekitEgress$ImageOutput extends AbstractC2497d0 implements AbstractC3999d0 {
    public static final int ALIOSS_FIELD_NUMBER = 11;
    public static final int AZURE_FIELD_NUMBER = 10;
    public static final int CAPTURE_INTERVAL_FIELD_NUMBER = 1;
    private static final LivekitEgress$ImageOutput DEFAULT_INSTANCE;
    public static final int DISABLE_MANIFEST_FIELD_NUMBER = 7;
    public static final int FILENAME_PREFIX_FIELD_NUMBER = 4;
    public static final int FILENAME_SUFFIX_FIELD_NUMBER = 5;
    public static final int GCP_FIELD_NUMBER = 9;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int IMAGE_CODEC_FIELD_NUMBER = 6;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int S3_FIELD_NUMBER = 8;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int captureInterval_;
    private boolean disableManifest_;
    private int filenameSuffix_;
    private int height_;
    private int imageCodec_;
    private Object output_;
    private int width_;
    private int outputCase_ = 0;
    private String filenamePrefix_ = "";

    static {
        LivekitEgress$ImageOutput livekitEgress$ImageOutput = new LivekitEgress$ImageOutput();
        DEFAULT_INSTANCE = livekitEgress$ImageOutput;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$ImageOutput.class, livekitEgress$ImageOutput);
    }

    private LivekitEgress$ImageOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliOSS() {
        if (this.outputCase_ == 11) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzure() {
        if (this.outputCase_ == 10) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCaptureInterval() {
        this.captureInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableManifest() {
        this.disableManifest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilenamePrefix() {
        this.filenamePrefix_ = getDefaultInstance().getFilenamePrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilenameSuffix() {
        this.filenameSuffix_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGcp() {
        if (this.outputCase_ == 9) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageCodec() {
        this.imageCodec_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS3() {
        if (this.outputCase_ == 8) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitEgress$ImageOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        if (this.outputCase_ == 11 && this.output_ != LivekitEgress$AliOSSUpload.getDefaultInstance()) {
            C3976D newBuilder = LivekitEgress$AliOSSUpload.newBuilder((LivekitEgress$AliOSSUpload) this.output_);
            newBuilder.f(livekitEgress$AliOSSUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$AliOSSUpload;
        }
        this.outputCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        if (this.outputCase_ == 10 && this.output_ != LivekitEgress$AzureBlobUpload.getDefaultInstance()) {
            C3981I newBuilder = LivekitEgress$AzureBlobUpload.newBuilder((LivekitEgress$AzureBlobUpload) this.output_);
            newBuilder.f(livekitEgress$AzureBlobUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$AzureBlobUpload;
        }
        this.outputCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        if (this.outputCase_ == 9 && this.output_ != LivekitEgress$GCPUpload.getDefaultInstance()) {
            Z newBuilder = LivekitEgress$GCPUpload.newBuilder((LivekitEgress$GCPUpload) this.output_);
            newBuilder.f(livekitEgress$GCPUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$GCPUpload;
        }
        this.outputCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        if (this.outputCase_ == 8 && this.output_ != LivekitEgress$S3Upload.getDefaultInstance()) {
            C4049n0 newBuilder = LivekitEgress$S3Upload.newBuilder((LivekitEgress$S3Upload) this.output_);
            newBuilder.f(livekitEgress$S3Upload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$S3Upload;
        }
        this.outputCase_ = 8;
    }

    public static C3989b0 newBuilder() {
        return (C3989b0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ImageOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ImageOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        this.output_ = livekitEgress$AliOSSUpload;
        this.outputCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        this.output_ = livekitEgress$AzureBlobUpload;
        this.outputCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCaptureInterval(int i10) {
        this.captureInterval_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableManifest(boolean z10) {
        this.disableManifest_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenamePrefix(String str) {
        str.getClass();
        this.filenamePrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenamePrefixBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.filenamePrefix_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameSuffix(EnumC3984a0 enumC3984a0) {
        this.filenameSuffix_ = enumC3984a0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameSuffixValue(int i10) {
        this.filenameSuffix_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        this.output_ = livekitEgress$GCPUpload;
        this.outputCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageCodec(P1 p12) {
        this.imageCodec_ = p12.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageCodecValue(int i10) {
        this.imageCodec_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        this.output_ = livekitEgress$S3Upload;
        this.outputCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i10) {
        this.width_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u000b\u0002\u0004\u0003\u0004\u0004\u0208\u0005\f\u0006\f\u0007\u0007\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000", new Object[]{"output_", "outputCase_", "captureInterval_", "width_", "height_", "filenamePrefix_", "filenameSuffix_", "imageCodec_", "disableManifest_", LivekitEgress$S3Upload.class, LivekitEgress$GCPUpload.class, LivekitEgress$AzureBlobUpload.class, LivekitEgress$AliOSSUpload.class});
            case 3:
                return new LivekitEgress$ImageOutput();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$ImageOutput.class) {
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
        if (this.outputCase_ == 11) {
            return (LivekitEgress$AliOSSUpload) this.output_;
        }
        return LivekitEgress$AliOSSUpload.getDefaultInstance();
    }

    public LivekitEgress$AzureBlobUpload getAzure() {
        if (this.outputCase_ == 10) {
            return (LivekitEgress$AzureBlobUpload) this.output_;
        }
        return LivekitEgress$AzureBlobUpload.getDefaultInstance();
    }

    public int getCaptureInterval() {
        return this.captureInterval_;
    }

    public boolean getDisableManifest() {
        return this.disableManifest_;
    }

    public String getFilenamePrefix() {
        return this.filenamePrefix_;
    }

    public AbstractC2534q getFilenamePrefixBytes() {
        return AbstractC2534q.y(this.filenamePrefix_);
    }

    public EnumC3984a0 getFilenameSuffix() {
        EnumC3984a0 enumC3984a0;
        int i10 = this.filenameSuffix_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC3984a0 = null;
            } else {
                enumC3984a0 = EnumC3984a0.IMAGE_SUFFIX_TIMESTAMP;
            }
        } else {
            enumC3984a0 = EnumC3984a0.IMAGE_SUFFIX_INDEX;
        }
        if (enumC3984a0 == null) {
            return EnumC3984a0.UNRECOGNIZED;
        }
        return enumC3984a0;
    }

    public int getFilenameSuffixValue() {
        return this.filenameSuffix_;
    }

    public LivekitEgress$GCPUpload getGcp() {
        if (this.outputCase_ == 9) {
            return (LivekitEgress$GCPUpload) this.output_;
        }
        return LivekitEgress$GCPUpload.getDefaultInstance();
    }

    public int getHeight() {
        return this.height_;
    }

    public P1 getImageCodec() {
        P1 p12;
        int i10 = this.imageCodec_;
        if (i10 != 0) {
            if (i10 != 1) {
                p12 = null;
            } else {
                p12 = P1.IC_JPEG;
            }
        } else {
            p12 = P1.IC_DEFAULT;
        }
        if (p12 == null) {
            return P1.UNRECOGNIZED;
        }
        return p12;
    }

    public int getImageCodecValue() {
        return this.imageCodec_;
    }

    public EnumC3994c0 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 != 0) {
            switch (i10) {
                case 8:
                    return EnumC3994c0.f36404Y;
                case 9:
                    return EnumC3994c0.f36405Z;
                case 10:
                    return EnumC3994c0.f36406h0;
                case 11:
                    return EnumC3994c0.f36407i0;
                default:
                    return null;
            }
        }
        return EnumC3994c0.f36408j0;
    }

    public LivekitEgress$S3Upload getS3() {
        if (this.outputCase_ == 8) {
            return (LivekitEgress$S3Upload) this.output_;
        }
        return LivekitEgress$S3Upload.getDefaultInstance();
    }

    public int getWidth() {
        return this.width_;
    }

    public boolean hasAliOSS() {
        if (this.outputCase_ == 11) {
            return true;
        }
        return false;
    }

    public boolean hasAzure() {
        if (this.outputCase_ == 10) {
            return true;
        }
        return false;
    }

    public boolean hasGcp() {
        if (this.outputCase_ == 9) {
            return true;
        }
        return false;
    }

    public boolean hasS3() {
        if (this.outputCase_ == 8) {
            return true;
        }
        return false;
    }

    public static C3989b0 newBuilder(LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        return (C3989b0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ImageOutput);
    }

    public static LivekitEgress$ImageOutput parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ImageOutput parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$ImageOutput parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$ImageOutput parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$ImageOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ImageOutput parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$ImageOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ImageOutput parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ImageOutput parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$ImageOutput parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$ImageOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
