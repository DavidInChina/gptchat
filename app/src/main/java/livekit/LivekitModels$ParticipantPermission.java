package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2496d;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2524m0;
import com.google.protobuf.AbstractC2527n0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.C2506g0;
import com.google.protobuf.C2530o0;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.EnumC4051n2;
import jh.L1;
import jh.T1;

/* loaded from: classes.dex */
public final class LivekitModels$ParticipantPermission extends AbstractC2497d0 implements N0 {
    public static final int AGENT_FIELD_NUMBER = 11;
    public static final int CAN_PUBLISH_DATA_FIELD_NUMBER = 3;
    public static final int CAN_PUBLISH_FIELD_NUMBER = 2;
    public static final int CAN_PUBLISH_SOURCES_FIELD_NUMBER = 9;
    public static final int CAN_SUBSCRIBE_FIELD_NUMBER = 1;
    public static final int CAN_UPDATE_METADATA_FIELD_NUMBER = 10;
    private static final LivekitModels$ParticipantPermission DEFAULT_INSTANCE;
    public static final int HIDDEN_FIELD_NUMBER = 7;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RECORDER_FIELD_NUMBER = 8;
    private static final AbstractC2527n0 canPublishSources_converter_ = new L1(2);
    private boolean agent_;
    private boolean canPublishData_;
    private int canPublishSourcesMemoizedSerializedSize;
    private AbstractC2524m0 canPublishSources_ = AbstractC2497d0.emptyIntList();
    private boolean canPublish_;
    private boolean canSubscribe_;
    private boolean canUpdateMetadata_;
    private boolean hidden_;
    private boolean recorder_;

    static {
        LivekitModels$ParticipantPermission livekitModels$ParticipantPermission = new LivekitModels$ParticipantPermission();
        DEFAULT_INSTANCE = livekitModels$ParticipantPermission;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$ParticipantPermission.class, livekitModels$ParticipantPermission);
    }

    private LivekitModels$ParticipantPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCanPublishSources(Iterable<? extends EnumC4051n2> iterable) {
        ensureCanPublishSourcesIsMutable();
        for (EnumC4051n2 enumC4051n2 : iterable) {
            ((C2506g0) this.canPublishSources_).s(enumC4051n2.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCanPublishSourcesValue(Iterable<Integer> iterable) {
        ensureCanPublishSourcesIsMutable();
        for (Integer num : iterable) {
            ((C2506g0) this.canPublishSources_).s(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCanPublishSources(EnumC4051n2 enumC4051n2) {
        enumC4051n2.getClass();
        ensureCanPublishSourcesIsMutable();
        ((C2506g0) this.canPublishSources_).s(enumC4051n2.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCanPublishSourcesValue(int i10) {
        ensureCanPublishSourcesIsMutable();
        ((C2506g0) this.canPublishSources_).s(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgent() {
        this.agent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPublish() {
        this.canPublish_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPublishData() {
        this.canPublishData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanPublishSources() {
        this.canPublishSources_ = AbstractC2497d0.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanSubscribe() {
        this.canSubscribe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanUpdateMetadata() {
        this.canUpdateMetadata_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        this.hidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecorder() {
        this.recorder_ = false;
    }

    private void ensureCanPublishSourcesIsMutable() {
        AbstractC2524m0 abstractC2524m0 = this.canPublishSources_;
        if (!((AbstractC2496d) abstractC2524m0).f27534Y) {
            this.canPublishSources_ = AbstractC2497d0.mutableCopy(abstractC2524m0);
        }
    }

    public static LivekitModels$ParticipantPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static T1 newBuilder() {
        return (T1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ParticipantPermission parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantPermission parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgent(boolean z10) {
        this.agent_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublish(boolean z10) {
        this.canPublish_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublishData(boolean z10) {
        this.canPublishData_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublishSources(int i10, EnumC4051n2 enumC4051n2) {
        enumC4051n2.getClass();
        ensureCanPublishSourcesIsMutable();
        AbstractC2524m0 abstractC2524m0 = this.canPublishSources_;
        int a5 = enumC4051n2.a();
        C2506g0 c2506g0 = (C2506g0) abstractC2524m0;
        c2506g0.f();
        c2506g0.y(i10);
        int[] iArr = c2506g0.f27545Z;
        int i11 = iArr[i10];
        iArr[i10] = a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanPublishSourcesValue(int i10, int i11) {
        ensureCanPublishSourcesIsMutable();
        C2506g0 c2506g0 = (C2506g0) this.canPublishSources_;
        c2506g0.f();
        c2506g0.y(i10);
        int[] iArr = c2506g0.f27545Z;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanSubscribe(boolean z10) {
        this.canSubscribe_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanUpdateMetadata(boolean z10) {
        this.canUpdateMetadata_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(boolean z10) {
        this.hidden_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecorder(boolean z10) {
        this.recorder_ = z10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\u000b\b\u0000\u0001\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0007\u0007\b\u0007\t,\n\u0007\u000b\u0007", new Object[]{"canSubscribe_", "canPublish_", "canPublishData_", "hidden_", "recorder_", "canPublishSources_", "canUpdateMetadata_", "agent_"});
            case 3:
                return new LivekitModels$ParticipantPermission();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$ParticipantPermission.class) {
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

    public boolean getAgent() {
        return this.agent_;
    }

    public boolean getCanPublish() {
        return this.canPublish_;
    }

    public boolean getCanPublishData() {
        return this.canPublishData_;
    }

    public EnumC4051n2 getCanPublishSources(int i10) {
        EnumC4051n2 b10 = EnumC4051n2.b(((C2506g0) this.canPublishSources_).I(i10));
        if (b10 == null) {
            return EnumC4051n2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getCanPublishSourcesCount() {
        return ((C2506g0) this.canPublishSources_).size();
    }

    public List<EnumC4051n2> getCanPublishSourcesList() {
        return new C2530o0(this.canPublishSources_, canPublishSources_converter_);
    }

    public int getCanPublishSourcesValue(int i10) {
        return ((C2506g0) this.canPublishSources_).I(i10);
    }

    public List<Integer> getCanPublishSourcesValueList() {
        return this.canPublishSources_;
    }

    public boolean getCanSubscribe() {
        return this.canSubscribe_;
    }

    public boolean getCanUpdateMetadata() {
        return this.canUpdateMetadata_;
    }

    public boolean getHidden() {
        return this.hidden_;
    }

    public boolean getRecorder() {
        return this.recorder_;
    }

    public static T1 newBuilder(LivekitModels$ParticipantPermission livekitModels$ParticipantPermission) {
        return (T1) DEFAULT_INSTANCE.createBuilder(livekitModels$ParticipantPermission);
    }

    public static LivekitModels$ParticipantPermission parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ParticipantPermission parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$ParticipantPermission parseFrom(byte[] bArr) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ParticipantPermission parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$ParticipantPermission parseFrom(InputStream inputStream) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ParticipantPermission parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$ParticipantPermission parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$ParticipantPermission) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
