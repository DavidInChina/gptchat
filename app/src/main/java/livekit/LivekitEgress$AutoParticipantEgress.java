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
import jh.AbstractC4068r0;
import jh.C3977E;
import jh.EnumC3978F;
import jh.T;
import jh.V;
import jh.W;

/* loaded from: classes.dex */
public final class LivekitEgress$AutoParticipantEgress extends AbstractC2497d0 implements N0 {
    public static final int ADVANCED_FIELD_NUMBER = 2;
    private static final LivekitEgress$AutoParticipantEgress DEFAULT_INSTANCE;
    public static final int FILE_OUTPUTS_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 1;
    public static final int SEGMENT_OUTPUTS_FIELD_NUMBER = 4;
    private Object options_;
    private int optionsCase_ = 0;
    private AbstractC2535q0 fileOutputs_ = AbstractC2497d0.emptyProtobufList();
    private AbstractC2535q0 segmentOutputs_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress = new LivekitEgress$AutoParticipantEgress();
        DEFAULT_INSTANCE = livekitEgress$AutoParticipantEgress;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$AutoParticipantEgress.class, livekitEgress$AutoParticipantEgress);
    }

    private LivekitEgress$AutoParticipantEgress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFileOutputs(Iterable<? extends LivekitEgress$EncodedFileOutput> iterable) {
        ensureFileOutputsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.fileOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegmentOutputs(Iterable<? extends LivekitEgress$SegmentedFileOutput> iterable) {
        ensureSegmentOutputsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.segmentOutputs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(livekitEgress$SegmentedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvanced() {
        if (this.optionsCase_ == 2) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileOutputs() {
        this.fileOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.optionsCase_ = 0;
        this.options_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.optionsCase_ == 1) {
            this.optionsCase_ = 0;
            this.options_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentOutputs() {
        this.segmentOutputs_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureFileOutputsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.fileOutputs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.fileOutputs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureSegmentOutputsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.segmentOutputs_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.segmentOutputs_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitEgress$AutoParticipantEgress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        if (this.optionsCase_ == 2 && this.options_ != LivekitEgress$EncodingOptions.getDefaultInstance()) {
            V newBuilder = LivekitEgress$EncodingOptions.newBuilder((LivekitEgress$EncodingOptions) this.options_);
            newBuilder.f(livekitEgress$EncodingOptions);
            this.options_ = newBuilder.c();
        } else {
            this.options_ = livekitEgress$EncodingOptions;
        }
        this.optionsCase_ = 2;
    }

    public static C3977E newBuilder() {
        return (C3977E) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$AutoParticipantEgress parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeSegmentOutputs(int i10) {
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvanced(LivekitEgress$EncodingOptions livekitEgress$EncodingOptions) {
        livekitEgress$EncodingOptions.getClass();
        this.options_ = livekitEgress$EncodingOptions;
        this.optionsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.set(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(W w10) {
        this.options_ = Integer.valueOf(w10.a());
        this.optionsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.optionsCase_ = 1;
        this.options_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.set(i10, livekitEgress$SegmentedFileOutput);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001?\u0000\u0002<\u0000\u0003\u001b\u0004\u001b", new Object[]{"options_", "optionsCase_", LivekitEgress$EncodingOptions.class, "fileOutputs_", LivekitEgress$EncodedFileOutput.class, "segmentOutputs_", LivekitEgress$SegmentedFileOutput.class});
            case 3:
                return new LivekitEgress$AutoParticipantEgress();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$AutoParticipantEgress.class) {
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
        if (this.optionsCase_ == 2) {
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

    public EnumC3978F getOptionsCase() {
        int i10 = this.optionsCase_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return EnumC3978F.f36220Z;
            }
            return EnumC3978F.f36219Y;
        }
        return EnumC3978F.f36221h0;
    }

    public W getPreset() {
        if (this.optionsCase_ == 1) {
            W b10 = W.b(((Integer) this.options_).intValue());
            if (b10 == null) {
                return W.UNRECOGNIZED;
            }
            return b10;
        }
        return W.H264_720P_30;
    }

    public int getPresetValue() {
        if (this.optionsCase_ == 1) {
            return ((Integer) this.options_).intValue();
        }
        return 0;
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

    public boolean hasAdvanced() {
        if (this.optionsCase_ == 2) {
            return true;
        }
        return false;
    }

    public boolean hasPreset() {
        if (this.optionsCase_ == 1) {
            return true;
        }
        return false;
    }

    public static C3977E newBuilder(LivekitEgress$AutoParticipantEgress livekitEgress$AutoParticipantEgress) {
        return (C3977E) DEFAULT_INSTANCE.createBuilder(livekitEgress$AutoParticipantEgress);
    }

    public static LivekitEgress$AutoParticipantEgress parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFileOutputs(int i10, LivekitEgress$EncodedFileOutput livekitEgress$EncodedFileOutput) {
        livekitEgress$EncodedFileOutput.getClass();
        ensureFileOutputsIsMutable();
        this.fileOutputs_.add(i10, livekitEgress$EncodedFileOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegmentOutputs(int i10, LivekitEgress$SegmentedFileOutput livekitEgress$SegmentedFileOutput) {
        livekitEgress$SegmentedFileOutput.getClass();
        ensureSegmentOutputsIsMutable();
        this.segmentOutputs_.add(i10, livekitEgress$SegmentedFileOutput);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(byte[] bArr) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(InputStream inputStream) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$AutoParticipantEgress parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$AutoParticipantEgress) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
