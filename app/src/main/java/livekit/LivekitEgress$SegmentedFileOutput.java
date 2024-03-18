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
import jh.AbstractC4068r0;
import jh.C3976D;
import jh.C3981I;
import jh.C4049n0;
import jh.C4059p0;
import jh.EnumC4064q0;
import jh.EnumC4073s0;
import jh.EnumC4078t0;
import jh.Z;

/* loaded from: classes.dex */
public final class LivekitEgress$SegmentedFileOutput extends AbstractC2497d0 implements AbstractC4068r0 {
    public static final int ALIOSS_FIELD_NUMBER = 9;
    public static final int AZURE_FIELD_NUMBER = 7;
    private static final LivekitEgress$SegmentedFileOutput DEFAULT_INSTANCE;
    public static final int DISABLE_MANIFEST_FIELD_NUMBER = 8;
    public static final int FILENAME_PREFIX_FIELD_NUMBER = 2;
    public static final int FILENAME_SUFFIX_FIELD_NUMBER = 10;
    public static final int GCP_FIELD_NUMBER = 6;
    public static final int LIVE_PLAYLIST_NAME_FIELD_NUMBER = 11;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PLAYLIST_NAME_FIELD_NUMBER = 3;
    public static final int PROTOCOL_FIELD_NUMBER = 1;
    public static final int S3_FIELD_NUMBER = 5;
    public static final int SEGMENT_DURATION_FIELD_NUMBER = 4;
    private boolean disableManifest_;
    private int filenameSuffix_;
    private Object output_;
    private int protocol_;
    private int segmentDuration_;
    private int outputCase_ = 0;
    private String filenamePrefix_ = "";
    private String playlistName_ = "";
    private String livePlaylistName_ = "";

    static {
        LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput = new LivekitEgress$SegmentedFileOutput();
        DEFAULT_INSTANCE = livekitEgress$SegmentedFileOutput;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$SegmentedFileOutput.class, livekitEgress$SegmentedFileOutput);
    }

    private LivekitEgress$SegmentedFileOutput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliOSS() {
        if (this.outputCase_ == 9) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzure() {
        if (this.outputCase_ == 7) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
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
        if (this.outputCase_ == 6) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLivePlaylistName() {
        this.livePlaylistName_ = getDefaultInstance().getLivePlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaylistName() {
        this.playlistName_ = getDefaultInstance().getPlaylistName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearS3() {
        if (this.outputCase_ == 5) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentDuration() {
        this.segmentDuration_ = 0;
    }

    public static LivekitEgress$SegmentedFileOutput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        if (this.outputCase_ == 9 && this.output_ != LivekitEgress$AliOSSUpload.getDefaultInstance()) {
            C3976D newBuilder = LivekitEgress$AliOSSUpload.newBuilder((LivekitEgress$AliOSSUpload) this.output_);
            newBuilder.f(livekitEgress$AliOSSUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$AliOSSUpload;
        }
        this.outputCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        if (this.outputCase_ == 7 && this.output_ != LivekitEgress$AzureBlobUpload.getDefaultInstance()) {
            C3981I newBuilder = LivekitEgress$AzureBlobUpload.newBuilder((LivekitEgress$AzureBlobUpload) this.output_);
            newBuilder.f(livekitEgress$AzureBlobUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$AzureBlobUpload;
        }
        this.outputCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        if (this.outputCase_ == 6 && this.output_ != LivekitEgress$GCPUpload.getDefaultInstance()) {
            Z newBuilder = LivekitEgress$GCPUpload.newBuilder((LivekitEgress$GCPUpload) this.output_);
            newBuilder.f(livekitEgress$GCPUpload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$GCPUpload;
        }
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        if (this.outputCase_ == 5 && this.output_ != LivekitEgress$S3Upload.getDefaultInstance()) {
            C4049n0 newBuilder = LivekitEgress$S3Upload.newBuilder((LivekitEgress$S3Upload) this.output_);
            newBuilder.f(livekitEgress$S3Upload);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$S3Upload;
        }
        this.outputCase_ = 5;
    }

    public static C4059p0 newBuilder() {
        return (C4059p0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$SegmentedFileOutput parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliOSS(LivekitEgress$AliOSSUpload livekitEgress$AliOSSUpload) {
        livekitEgress$AliOSSUpload.getClass();
        this.output_ = livekitEgress$AliOSSUpload;
        this.outputCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzure(LivekitEgress$AzureBlobUpload livekitEgress$AzureBlobUpload) {
        livekitEgress$AzureBlobUpload.getClass();
        this.output_ = livekitEgress$AzureBlobUpload;
        this.outputCase_ = 7;
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
    public void setFilenameSuffix(EnumC4078t0 enumC4078t0) {
        this.filenameSuffix_ = enumC4078t0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameSuffixValue(int i10) {
        this.filenameSuffix_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcp(LivekitEgress$GCPUpload livekitEgress$GCPUpload) {
        livekitEgress$GCPUpload.getClass();
        this.output_ = livekitEgress$GCPUpload;
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistName(String str) {
        str.getClass();
        this.livePlaylistName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLivePlaylistNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.livePlaylistName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistName(String str) {
        str.getClass();
        this.playlistName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaylistNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.playlistName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(EnumC4073s0 enumC4073s0) {
        this.protocol_ = enumC4073s0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolValue(int i10) {
        this.protocol_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setS3(LivekitEgress$S3Upload livekitEgress$S3Upload) {
        livekitEgress$S3Upload.getClass();
        this.output_ = livekitEgress$S3Upload;
        this.outputCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentDuration(int i10) {
        this.segmentDuration_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0208\u0004\u000b\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\t<\u0000\n\f\u000b\u0208", new Object[]{"output_", "outputCase_", "protocol_", "filenamePrefix_", "playlistName_", "segmentDuration_", LivekitEgress$S3Upload.class, LivekitEgress$GCPUpload.class, LivekitEgress$AzureBlobUpload.class, "disableManifest_", LivekitEgress$AliOSSUpload.class, "filenameSuffix_", "livePlaylistName_"});
            case 3:
                return new LivekitEgress$SegmentedFileOutput();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$SegmentedFileOutput.class) {
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
        if (this.outputCase_ == 9) {
            return (LivekitEgress$AliOSSUpload) this.output_;
        }
        return LivekitEgress$AliOSSUpload.getDefaultInstance();
    }

    public LivekitEgress$AzureBlobUpload getAzure() {
        if (this.outputCase_ == 7) {
            return (LivekitEgress$AzureBlobUpload) this.output_;
        }
        return LivekitEgress$AzureBlobUpload.getDefaultInstance();
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

    public EnumC4078t0 getFilenameSuffix() {
        EnumC4078t0 enumC4078t0;
        int i10 = this.filenameSuffix_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4078t0 = null;
            } else {
                enumC4078t0 = EnumC4078t0.TIMESTAMP;
            }
        } else {
            enumC4078t0 = EnumC4078t0.INDEX;
        }
        if (enumC4078t0 == null) {
            return EnumC4078t0.UNRECOGNIZED;
        }
        return enumC4078t0;
    }

    public int getFilenameSuffixValue() {
        return this.filenameSuffix_;
    }

    public LivekitEgress$GCPUpload getGcp() {
        if (this.outputCase_ == 6) {
            return (LivekitEgress$GCPUpload) this.output_;
        }
        return LivekitEgress$GCPUpload.getDefaultInstance();
    }

    public String getLivePlaylistName() {
        return this.livePlaylistName_;
    }

    public AbstractC2534q getLivePlaylistNameBytes() {
        return AbstractC2534q.y(this.livePlaylistName_);
    }

    public EnumC4064q0 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 != 0) {
            if (i10 != 9) {
                if (i10 != 5) {
                    if (i10 != 6) {
                        if (i10 != 7) {
                            return null;
                        }
                        return EnumC4064q0.f36559h0;
                    }
                    return EnumC4064q0.f36558Z;
                }
                return EnumC4064q0.f36557Y;
            }
            return EnumC4064q0.f36560i0;
        }
        return EnumC4064q0.f36561j0;
    }

    public String getPlaylistName() {
        return this.playlistName_;
    }

    public AbstractC2534q getPlaylistNameBytes() {
        return AbstractC2534q.y(this.playlistName_);
    }

    public EnumC4073s0 getProtocol() {
        EnumC4073s0 enumC4073s0;
        int i10 = this.protocol_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4073s0 = null;
            } else {
                enumC4073s0 = EnumC4073s0.HLS_PROTOCOL;
            }
        } else {
            enumC4073s0 = EnumC4073s0.DEFAULT_SEGMENTED_FILE_PROTOCOL;
        }
        if (enumC4073s0 == null) {
            return EnumC4073s0.UNRECOGNIZED;
        }
        return enumC4073s0;
    }

    public int getProtocolValue() {
        return this.protocol_;
    }

    public LivekitEgress$S3Upload getS3() {
        if (this.outputCase_ == 5) {
            return (LivekitEgress$S3Upload) this.output_;
        }
        return LivekitEgress$S3Upload.getDefaultInstance();
    }

    public int getSegmentDuration() {
        return this.segmentDuration_;
    }

    public boolean hasAliOSS() {
        if (this.outputCase_ == 9) {
            return true;
        }
        return false;
    }

    public boolean hasAzure() {
        if (this.outputCase_ == 7) {
            return true;
        }
        return false;
    }

    public boolean hasGcp() {
        if (this.outputCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasS3() {
        if (this.outputCase_ == 5) {
            return true;
        }
        return false;
    }

    public static C4059p0 newBuilder(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        return (C4059p0) DEFAULT_INSTANCE.createBuilder(livekitEgress$SegmentedFileOutput);
    }

    public static LivekitEgress$SegmentedFileOutput parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(byte[] bArr) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(InputStream inputStream) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$SegmentedFileOutput parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$SegmentedFileOutput) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
