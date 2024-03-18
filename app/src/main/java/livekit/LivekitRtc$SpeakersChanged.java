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
import jh.AbstractC4026i2;
import jh.C4071r3;

/* loaded from: classes2.dex */
public final class LivekitRtc$SpeakersChanged extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$SpeakersChanged DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SPEAKERS_FIELD_NUMBER = 1;
    private AbstractC2535q0 speakers_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$SpeakersChanged livekitRtc$SpeakersChanged = new LivekitRtc$SpeakersChanged();
        DEFAULT_INSTANCE = livekitRtc$SpeakersChanged;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SpeakersChanged.class, livekitRtc$SpeakersChanged);
    }

    private LivekitRtc$SpeakersChanged() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeakers(Iterable<? extends LivekitModels$SpeakerInfo> iterable) {
        ensureSpeakersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.speakers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeakers(LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        livekitModels$SpeakerInfo.getClass();
        ensureSpeakersIsMutable();
        this.speakers_.add(livekitModels$SpeakerInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakers() {
        this.speakers_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureSpeakersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.speakers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.speakers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$SpeakersChanged getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4071r3 newBuilder() {
        return (C4071r3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SpeakersChanged parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpeakers(int i10) {
        ensureSpeakersIsMutable();
        this.speakers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakers(int i10, LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        livekitModels$SpeakerInfo.getClass();
        ensureSpeakersIsMutable();
        this.speakers_.set(i10, livekitModels$SpeakerInfo);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"speakers_", LivekitModels$SpeakerInfo.class});
            case 3:
                return new LivekitRtc$SpeakersChanged();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SpeakersChanged.class) {
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

    public LivekitModels$SpeakerInfo getSpeakers(int i10) {
        return (LivekitModels$SpeakerInfo) this.speakers_.get(i10);
    }

    public int getSpeakersCount() {
        return this.speakers_.size();
    }

    public List<LivekitModels$SpeakerInfo> getSpeakersList() {
        return this.speakers_;
    }

    public AbstractC4026i2 getSpeakersOrBuilder(int i10) {
        return (AbstractC4026i2) this.speakers_.get(i10);
    }

    public List<? extends AbstractC4026i2> getSpeakersOrBuilderList() {
        return this.speakers_;
    }

    public static C4071r3 newBuilder(LivekitRtc$SpeakersChanged livekitRtc$SpeakersChanged) {
        return (C4071r3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SpeakersChanged);
    }

    public static LivekitRtc$SpeakersChanged parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeakers(int i10, LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        livekitModels$SpeakerInfo.getClass();
        ensureSpeakersIsMutable();
        this.speakers_.add(i10, livekitModels$SpeakerInfo);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(byte[] bArr) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(InputStream inputStream) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SpeakersChanged parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SpeakersChanged) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
