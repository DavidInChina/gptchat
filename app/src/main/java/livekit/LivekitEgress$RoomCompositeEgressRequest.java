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
import jh.B0;
import jh.C0;
import jh.C4034k0;
import jh.C4059p0;
import jh.EnumC4039l0;
import jh.EnumC4044m0;
import jh.Q;
import jh.T;
import jh.V;
import jh.W;

/* loaded from: classes2.dex */
public final class LivekitEgress$RoomCompositeEgressRequest extends AbstractC2497d0 implements N0 {
    public static final int ADVANCED_FIELD_NUMBER = 9;
    public static final int AUDIO_ONLY_FIELD_NUMBER = 3;
    public static final int CUSTOM_BASE_URL_FIELD_NUMBER = 5;
    private static final LivekitEgress$RoomCompositeEgressRequest DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 6;
    public static final int FILE_OUTPUTS_FIELD_NUMBER = 11;
    public static final int IMAGE_OUTPUTS_FIELD_NUMBER = 14;
    public static final int LAYOUT_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 8;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int SEGMENTS_FIELD_NUMBER = 10;
    public static final int SEGMENT_OUTPUTS_FIELD_NUMBER = 13;
    public static final int STREAM_FIELD_NUMBER = 7;
    public static final int STREAM_OUTPUTS_FIELD_NUMBER = 12;
    public static final int VIDEO_ONLY_FIELD_NUMBER = 4;
    private boolean audioOnly_;
    private Object options_;
    private Object output_;
    private boolean videoOnly_;
    private int outputCase_ = 0;
    private int optionsCase_ = 0;
    private String roomName_ = "";
    private String layout_ = "";
    private String customBaseUrl_ = "";
    private AbstractC2535q0 fileOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 streamOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 segmentOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 imageOutputs_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest = new LivekitEgress$RoomCompositeEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$RoomCompositeEgressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$RoomCompositeEgressRequest.class, livekitEgress$RoomCompositeEgressRequest);
    }

    private LivekitEgress$RoomCompositeEgressRequest() {
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
        if (this.optionsCase_ == 9) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAudioOnly() {
        this.audioOnly_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomBaseUrl() {
        this.customBaseUrl_ = getDefaultInstance().getCustomBaseUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        if (this.outputCase_ == 6) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileOutputs() {
        this.fileOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageOutputs() {
        this.imageOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLayout() {
        this.layout_ = getDefaultInstance().getLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutput() {
        this.outputCase_ = 0;
        this.output_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.optionsCase_ == 8) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentOutputs() {
        this.segmentOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        if (this.outputCase_ == 10) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStream() {
        if (this.outputCase_ == 7) {
            this.outputCase_ = 0;
            this.output_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreamOutputs() {
        this.streamOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoOnly() {
        this.videoOnly_ = false;
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

    public static LivekitEgress$RoomCompositeEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        if (this.optionsCase_ == 9 && this.options_ != LivekitEgress$EncodingOptions.getDefaultInstance()) {
            V newBuilder = LivekitEgress$EncodingOptions.newBuilder((LivekitEgress$EncodingOptions) this.options_);
            newBuilder.f(livekitEgress$EncodingOptions);
            this.options_ = newBuilder.c();
        } else {
            this.options_ = livekitEgress$EncodingOptions;
        }
        this.optionsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFile(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        if (this.outputCase_ == 6 && this.output_ != LivekitEgress$EncodedFileOutput.getDefaultInstance()) {
            Q newBuilder = LivekitEgress$EncodedFileOutput.newBuilder((LivekitEgress$EncodedFileOutput) this.output_);
            newBuilder.f(livekitEgress$EncodedFileOutput);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$EncodedFileOutput;
        }
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegments(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        if (this.outputCase_ == 10 && this.output_ != LivekitEgress$SegmentedFileOutput.getDefaultInstance()) {
            C4059p0 newBuilder = LivekitEgress$SegmentedFileOutput.newBuilder((LivekitEgress$SegmentedFileOutput) this.output_);
            newBuilder.f(livekitEgress$SegmentedFileOutput);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$SegmentedFileOutput;
        }
        this.outputCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStream(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        if (this.outputCase_ == 7 && this.output_ != LivekitEgress$StreamOutput.getDefaultInstance()) {
            B0 newBuilder = LivekitEgress$StreamOutput.newBuilder((LivekitEgress$StreamOutput) this.output_);
            newBuilder.f(livekitEgress$StreamOutput);
            this.output_ = newBuilder.c();
        } else {
            this.output_ = livekitEgress$StreamOutput;
        }
        this.outputCase_ = 7;
    }

    public static C4034k0 newBuilder() {
        return (C4034k0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        this.optionsCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioOnly(boolean z10) {
        this.audioOnly_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomBaseUrl(String str) {
        str.getClass();
        this.customBaseUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomBaseUrlBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.customBaseUrl_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        this.output_ = livekitEgress$EncodedFileOutput;
        this.outputCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.set(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageOutputs(int i10, LivekitEgress$ImageOutput livekitEgress$ImageOutput) {
        livekitEgress$ImageOutput.getClass();
        ensureImageOutputsIsMutable();
        this.imageOutputs_.set(i10, livekitEgress$ImageOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayout(String str) {
        str.getClass();
        this.layout_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.layout_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(W w10) {
        this.options_ = Integer.valueOf(w10.a());
        this.optionsCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.optionsCase_ = 8;
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
    public void setSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.set(i10, livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        this.output_ = livekitEgress$SegmentedFileOutput;
        this.outputCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStream(LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        this.output_ = livekitEgress$StreamOutput;
        this.outputCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreamOutputs(int i10, LivekitEgress$StreamOutput livekitEgress$StreamOutput) {
        livekitEgress$StreamOutput.getClass();
        ensureStreamOutputsIsMutable();
        this.streamOutputs_.set(i10, livekitEgress$StreamOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoOnly(boolean z10) {
        this.videoOnly_ = z10;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0002\u0000\u0001\u000e\u000e\u0000\u0004\u0000\u0001\u0208\u0002\u0208\u0003\u0007\u0004\u0007\u0005\u0208\u0006<\u0000\u0007<\u0000\b?\u0001\t<\u0001\n<\u0000\u000b\u001b\f\u001b\r\u001b\u000e\u001b", new Object[]{"output_", "outputCase_", "options_", "optionsCase_", "roomName_", "layout_", "audioOnly_", "videoOnly_", "customBaseUrl_", LivekitEgress$EncodedFileOutput.class, LivekitEgress$StreamOutput.class, LivekitEgress$EncodingOptions.class, LivekitEgress$SegmentedFileOutput.class, "fileOutputs_", LivekitEgress$EncodedFileOutput.class, "streamOutputs_", LivekitEgress$StreamOutput.class, "segmentOutputs_", LivekitEgress$SegmentedFileOutput.class, "imageOutputs_", LivekitEgress$ImageOutput.class});
            case 3:
                return new LivekitEgress$RoomCompositeEgressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$RoomCompositeEgressRequest.class) {
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
        if (this.optionsCase_ == 9) {
            return (LivekitEgress$EncodingOptions) this.options_;
        }
        return LivekitEgress$EncodingOptions.getDefaultInstance();
    }

    public boolean getAudioOnly() {
        return this.audioOnly_;
    }

    public String getCustomBaseUrl() {
        return this.customBaseUrl_;
    }

    public AbstractC2534q getCustomBaseUrlBytes() {
        return AbstractC2534q.y(this.customBaseUrl_);
    }

    @Deprecated
    public LivekitEgress$EncodedFileOutput getFile() {
        if (this.outputCase_ == 6) {
            return (LivekitEgress$EncodedFileOutput) this.output_;
        }
        return LivekitEgress$EncodedFileOutput.getDefaultInstance();
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

    public String getLayout() {
        return this.layout_;
    }

    public AbstractC2534q getLayoutBytes() {
        return AbstractC2534q.y(this.layout_);
    }

    public EnumC4039l0 getOptionsCase() {
        int i10 = this.optionsCase_;
        if (i10 != 0) {
            if (i10 != 8) {
                if (i10 != 9) {
                    return null;
                }
                return EnumC4039l0.f36473Z;
            }
            return EnumC4039l0.f36472Y;
        }
        return EnumC4039l0.f36474h0;
    }

    public EnumC4044m0 getOutputCase() {
        int i10 = this.outputCase_;
        if (i10 != 0) {
            if (i10 != 10) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        return null;
                    }
                    return EnumC4044m0.f36499Z;
                }
                return EnumC4044m0.f36498Y;
            }
            return EnumC4044m0.f36500h0;
        }
        return EnumC4044m0.f36501i0;
    }

    public W getPreset() {
        if (this.optionsCase_ == 8) {
            W b10 = W.b(((Integer) this.options_).intValue());
            if (b10 == null) {
                return W.UNRECOGNIZED;
            }
            return b10;
        }
        return W.H264_720P_30;
    }

    public int getPresetValue() {
        if (this.optionsCase_ == 8) {
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

    @Deprecated
    public LivekitEgress$SegmentedFileOutput getSegments() {
        if (this.outputCase_ == 10) {
            return (LivekitEgress$SegmentedFileOutput) this.output_;
        }
        return LivekitEgress$SegmentedFileOutput.getDefaultInstance();
    }

    @Deprecated
    public LivekitEgress$StreamOutput getStream() {
        if (this.outputCase_ == 7) {
            return (LivekitEgress$StreamOutput) this.output_;
        }
        return LivekitEgress$StreamOutput.getDefaultInstance();
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

    public boolean getVideoOnly() {
        return this.videoOnly_;
    }

    public boolean hasAdvanced() {
        if (this.optionsCase_ == 9) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasFile() {
        if (this.outputCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasPreset() {
        if (this.optionsCase_ == 8) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasSegments() {
        if (this.outputCase_ == 10) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean hasStream() {
        if (this.outputCase_ == 7) {
            return true;
        }
        return false;
    }

    public static C4034k0 newBuilder(LivekitEgress$RoomCompositeEgressRequest livekitEgress$RoomCompositeEgressRequest) {
        return (C4034k0) DEFAULT_INSTANCE.createBuilder(livekitEgress$RoomCompositeEgressRequest);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
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

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$RoomCompositeEgressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$RoomCompositeEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
