package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2496d;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2535q0;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.AbstractC3999d0;
import jh.AbstractC4068r0;
import jh.C0;
import jh.C4024i0;
import jh.EnumC4029j0;
import jh.T;
import jh.V;
import jh.W;

/* loaded from: classes2.dex */
public final class LivekitEgress$ParticipantEgressRequest extends AbstractC2497d0 implements N0 {
    public static final int ADVANCED_FIELD_NUMBER = 5;
    private static final LivekitEgress$ParticipantEgressRequest DEFAULT_INSTANCE;
    public static final int FILE_OUTPUTS_FIELD_NUMBER = 6;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int IMAGE_OUTPUTS_FIELD_NUMBER = 9;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 4;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int SCREEN_SHARE_FIELD_NUMBER = 3;
    public static final int SEGMENT_OUTPUTS_FIELD_NUMBER = 8;
    public static final int STREAM_OUTPUTS_FIELD_NUMBER = 7;
    private Object options_;
    private boolean screenShare_;
    private int optionsCase_ = 0;
    private String roomName_ = "";
    private String identity_ = "";
    private AbstractC2535q0 fileOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 streamOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 segmentOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 imageOutputs_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest = new LivekitEgress$ParticipantEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$ParticipantEgressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$ParticipantEgressRequest.class, livekitEgress$ParticipantEgressRequest);
    }

    private LivekitEgress$ParticipantEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileOutputs(Iterable<? extends LivekitEgress$EncodedFileOutput> iterable) {
        ensureFileOutputsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.fileOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImageOutputs(Iterable<? extends LivekitEgress$ImageOutput> iterable) {
        ensureImageOutputsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.imageOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentOutputs(Iterable<? extends LivekitEgress$SegmentedFileOutput> iterable) {
        ensureSegmentOutputsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.segmentOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStreamOutputs(Iterable<? extends LivekitEgress$StreamOutput> iterable) {
        ensureStreamOutputsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.streamOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageOutputs(LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.add(livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamOutputs(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.add(livekitEgress$StreamOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvanced() {
        if (this.optionsCase_ == 5) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileOutputs() {
        this.fileOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageOutputs() {
        this.imageOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.optionsCase_ == 4) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenShare() {
        this.screenShare_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentOutputs() {
        this.segmentOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamOutputs() {
        this.streamOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureFileOutputsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.fileOutputs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.fileOutputs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureImageOutputsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.imageOutputs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.imageOutputs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureSegmentOutputsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.segmentOutputs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.segmentOutputs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureStreamOutputsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.streamOutputs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.streamOutputs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitEgress$ParticipantEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        if (this.optionsCase_ == 5 && this.options_ != LivekitEgress$EncodingOptions.getDefaultInstance()) {
            V newBuilder = LivekitEgress$EncodingOptions.newBuilder((LivekitEgress$EncodingOptions) this.options_);
            newBuilder.f(livekitEgress$EncodingOptions);
            this.options_ = newBuilder.c();
        } else {
            this.options_ = livekitEgress$EncodingOptions;
        }
        this.optionsCase_ = 5;
    }

    public static C4024i0 newBuilder() {
        return (C4024i0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ParticipantEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFileOutputs(int i10) {
        ensureFileOutputsIsMutable();
        this.fileOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImageOutputs(int i10) {
        ensureImageOutputsIsMutable();
        this.imageOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegmentOutputs(int i10) {
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStreamOutputs(int i10) {
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        this.options_ = livekitEgress$EncodingOptions;
        this.optionsCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.set(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.identity_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageOutputs(int i10, LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.set(i10, livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(W w10) {
        this.options_ = Integer.valueOf(w10.a());
        this.optionsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.optionsCase_ = 4;
        this.options_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.roomName_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenShare(boolean z10) {
        this.screenShare_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.set(i10, livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamOutputs(int i10, LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.set(i10, livekitEgress$StreamOutput);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0004\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004?\u0000\u0005<\u0000\u0006\u001b\u0007\u001b\b\u001b\t\u001b", new Object[]{"options_", "optionsCase_", "roomName_", "identity_", "screenShare_", LivekitEgress$EncodingOptions.class, "fileOutputs_", LivekitEgress$EncodedFileOutput.class, "streamOutputs_", LivekitEgress$StreamOutput.class, "segmentOutputs_", LivekitEgress$SegmentedFileOutput.class, "imageOutputs_", LivekitEgress$ImageOutput.class});
            case 3:
                return new LivekitEgress$ParticipantEgressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$ParticipantEgressRequest.class) {
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

    public LivekitEgress$EncodingOptions getAdvanced() {
        if (this.optionsCase_ == 5) {
            return (LivekitEgress$EncodingOptions) this.options_;
        }
        return LivekitEgress$EncodingOptions.getDefaultInstance();
    }

    public LivekitEgress$EncodedFileOutput getFileOutputs(int i10) {
        return (LivekitEgress$EncodedFileOutput) this.fileOutputs_.get(i10);
    }

    public int getFileOutputsCount() {
        return this.fileOutputs_.size();
    }

    public List<LivekitEgress$EncodedFileOutput> getFileOutputsList() {
        return this.fileOutputs_;
    }

    public T getFileOutputsOrBuilder(int i10) {
        return (T) this.fileOutputs_.get(i10);
    }

    public List<? extends T> getFileOutputsOrBuilderList() {
        return this.fileOutputs_;
    }

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC2534q getIdentityBytes() {
        return AbstractC2534q.y(this.identity_);
    }

    public LivekitEgress$ImageOutput getImageOutputs(int i10) {
        return (LivekitEgress$ImageOutput) this.imageOutputs_.get(i10);
    }

    public int getImageOutputsCount() {
        return this.imageOutputs_.size();
    }

    public List<LivekitEgress$ImageOutput> getImageOutputsList() {
        return this.imageOutputs_;
    }

    public AbstractC3999d0 getImageOutputsOrBuilder(int i10) {
        return (AbstractC3999d0) this.imageOutputs_.get(i10);
    }

    public List<? extends AbstractC3999d0> getImageOutputsOrBuilderList() {
        return this.imageOutputs_;
    }

    public EnumC4029j0 getOptionsCase() {
        int i10 = this.optionsCase_;
        if (i10 != 0) {
            if (i10 != 4) {
                if (i10 != 5) {
                    return null;
                }
                return EnumC4029j0.f36435Z;
            }
            return EnumC4029j0.f36434Y;
        }
        return EnumC4029j0.f36436h0;
    }

    public W getPreset() {
        if (this.optionsCase_ == 4) {
            W b10 = W.b(((Integer) this.options_).intValue());
            if (b10 == null) {
                return W.UNRECOGNIZED;
            }
            return b10;
        }
        return W.H264_720P_30;
    }

    public int getPresetValue() {
        if (this.optionsCase_ == 4) {
            return ((Integer) this.options_).intValue();
        }
        return 0;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public boolean getScreenShare() {
        return this.screenShare_;
    }

    public LivekitEgress$SegmentedFileOutput getSegmentOutputs(int i10) {
        return (LivekitEgress$SegmentedFileOutput) this.segmentOutputs_.get(i10);
    }

    public int getSegmentOutputsCount() {
        return this.segmentOutputs_.size();
    }

    public List<LivekitEgress$SegmentedFileOutput> getSegmentOutputsList() {
        return this.segmentOutputs_;
    }

    public AbstractC4068r0 getSegmentOutputsOrBuilder(int i10) {
        return (AbstractC4068r0) this.segmentOutputs_.get(i10);
    }

    public List<? extends AbstractC4068r0> getSegmentOutputsOrBuilderList() {
        return this.segmentOutputs_;
    }

    public LivekitEgress$StreamOutput getStreamOutputs(int i10) {
        return (LivekitEgress$StreamOutput) this.streamOutputs_.get(i10);
    }

    public int getStreamOutputsCount() {
        return this.streamOutputs_.size();
    }

    public List<LivekitEgress$StreamOutput> getStreamOutputsList() {
        return this.streamOutputs_;
    }

    public C0 getStreamOutputsOrBuilder(int i10) {
        return (C0) this.streamOutputs_.get(i10);
    }

    public List<? extends C0> getStreamOutputsOrBuilderList() {
        return this.streamOutputs_;
    }

    public boolean hasAdvanced() {
        if (this.optionsCase_ == 5) {
            return true;
        }
        return false;
    }

    public boolean hasPreset() {
        if (this.optionsCase_ == 4) {
            return true;
        }
        return false;
    }

    public static C4024i0 newBuilder(LivekitEgress$ParticipantEgressRequest livekitEgress$ParticipantEgressRequest) {
        return (C4024i0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ParticipantEgressRequest);
    }

    public static LivekitEgress$ParticipantEgressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImageOutputs(int i10, LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.add(i10, livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(i10, livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStreamOutputs(int i10, LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.add(i10, livekitEgress$StreamOutput);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$ParticipantEgressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$ParticipantEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
