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
import jh.S1;
import jh.Z2;

/* loaded from: classes.dex */
public final class LivekitRtc$ParticipantUpdate extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$ParticipantUpdate DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANTS_FIELD_NUMBER = 1;
    private AbstractC2535q0 participants_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$ParticipantUpdate livekitRtc$ParticipantUpdate = new LivekitRtc$ParticipantUpdate();
        DEFAULT_INSTANCE = livekitRtc$ParticipantUpdate;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$ParticipantUpdate.class, livekitRtc$ParticipantUpdate);
    }

    private LivekitRtc$ParticipantUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParticipants(Iterable<? extends LivekitModels$ParticipantInfo> iterable) {
        ensureParticipantsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.participants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureParticipantsIsMutable();
        this.participants_.add(livekitModels$ParticipantInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipants() {
        this.participants_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureParticipantsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.participants_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.participants_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$ParticipantUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Z2 newBuilder() {
        return (Z2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ParticipantUpdate parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParticipants(int i10) {
        ensureParticipantsIsMutable();
        this.participants_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureParticipantsIsMutable();
        this.participants_.set(i10, livekitModels$ParticipantInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"participants_", LivekitModels$ParticipantInfo.class});
            case 3:
                return new LivekitRtc$ParticipantUpdate();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$ParticipantUpdate.class) {
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

    public LivekitModels$ParticipantInfo getParticipants(int i10) {
        return (LivekitModels$ParticipantInfo) this.participants_.get(i10);
    }

    public int getParticipantsCount() {
        return this.participants_.size();
    }

    public List<LivekitModels$ParticipantInfo> getParticipantsList() {
        return this.participants_;
    }

    public S1 getParticipantsOrBuilder(int i10) {
        return (S1) this.participants_.get(i10);
    }

    public List<? extends S1> getParticipantsOrBuilderList() {
        return this.participants_;
    }

    public static Z2 newBuilder(LivekitRtc$ParticipantUpdate livekitRtc$ParticipantUpdate) {
        return (Z2) DEFAULT_INSTANCE.createBuilder(livekitRtc$ParticipantUpdate);
    }

    public static LivekitRtc$ParticipantUpdate parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureParticipantsIsMutable();
        this.participants_.add(i10, livekitModels$ParticipantInfo);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(byte[] bArr) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(InputStream inputStream) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$ParticipantUpdate parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$ParticipantUpdate) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
