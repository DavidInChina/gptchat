package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C4061p2;
import jh.C4099x1;
import jh.G1;
import jh.I1;
import jh.J1;

/* loaded from: classes2.dex */
public final class LivekitModels$DataPacket extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$DataPacket DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SPEAKER_FIELD_NUMBER = 3;
    public static final int USER_FIELD_NUMBER = 2;
    private int kind_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        LivekitModels$DataPacket livekitModels$DataPacket = new LivekitModels$DataPacket();
        DEFAULT_INSTANCE = livekitModels$DataPacket;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$DataPacket.class, livekitModels$DataPacket);
    }

    private LivekitModels$DataPacket() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeaker() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUser() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static LivekitModels$DataPacket getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeaker(LivekitModels$ActiveSpeakerUpdate livekitModels$ActiveSpeakerUpdate) {
        livekitModels$ActiveSpeakerUpdate.getClass();
        if (this.valueCase_ == 3 && this.value_ != LivekitModels$ActiveSpeakerUpdate.getDefaultInstance()) {
            C4099x1 newBuilder = LivekitModels$ActiveSpeakerUpdate.newBuilder((LivekitModels$ActiveSpeakerUpdate) this.value_);
            newBuilder.f(livekitModels$ActiveSpeakerUpdate);
            this.value_ = newBuilder.c();
        } else {
            this.value_ = livekitModels$ActiveSpeakerUpdate;
        }
        this.valueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUser(LivekitModels$UserPacket livekitModels$UserPacket) {
        livekitModels$UserPacket.getClass();
        if (this.valueCase_ == 2 && this.value_ != LivekitModels$UserPacket.getDefaultInstance()) {
            C4061p2 newBuilder = LivekitModels$UserPacket.newBuilder((LivekitModels$UserPacket) this.value_);
            newBuilder.f(livekitModels$UserPacket);
            this.value_ = newBuilder.c();
        } else {
            this.value_ = livekitModels$UserPacket;
        }
        this.valueCase_ = 2;
    }

    public static G1 newBuilder() {
        return (G1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$DataPacket parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DataPacket parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(I1 i12) {
        this.kind_ = i12.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i10) {
        this.kind_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeaker(LivekitModels$ActiveSpeakerUpdate livekitModels$ActiveSpeakerUpdate) {
        livekitModels$ActiveSpeakerUpdate.getClass();
        this.value_ = livekitModels$ActiveSpeakerUpdate;
        this.valueCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUser(LivekitModels$UserPacket livekitModels$UserPacket) {
        livekitModels$UserPacket.getClass();
        this.value_ = livekitModels$UserPacket;
        this.valueCase_ = 2;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"value_", "valueCase_", "kind_", LivekitModels$UserPacket.class, LivekitModels$ActiveSpeakerUpdate.class});
            case 3:
                return new LivekitModels$DataPacket();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$DataPacket.class) {
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

    public I1 getKind() {
        I1 i12;
        int i10 = this.kind_;
        if (i10 != 0) {
            if (i10 != 1) {
                i12 = null;
            } else {
                i12 = I1.LOSSY;
            }
        } else {
            i12 = I1.RELIABLE;
        }
        if (i12 == null) {
            return I1.UNRECOGNIZED;
        }
        return i12;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public LivekitModels$ActiveSpeakerUpdate getSpeaker() {
        if (this.valueCase_ == 3) {
            return (LivekitModels$ActiveSpeakerUpdate) this.value_;
        }
        return LivekitModels$ActiveSpeakerUpdate.getDefaultInstance();
    }

    public LivekitModels$UserPacket getUser() {
        if (this.valueCase_ == 2) {
            return (LivekitModels$UserPacket) this.value_;
        }
        return LivekitModels$UserPacket.getDefaultInstance();
    }

    public J1 getValueCase() {
        int i10 = this.valueCase_;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return J1.f36255Z;
            }
            return J1.f36254Y;
        }
        return J1.f36256h0;
    }

    public boolean hasSpeaker() {
        if (this.valueCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasUser() {
        if (this.valueCase_ == 2) {
            return true;
        }
        return false;
    }

    public static G1 newBuilder(LivekitModels$DataPacket livekitModels$DataPacket) {
        return (G1) DEFAULT_INSTANCE.createBuilder(livekitModels$DataPacket);
    }

    public static LivekitModels$DataPacket parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$DataPacket parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$DataPacket parseFrom(byte[] bArr) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$DataPacket parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$DataPacket parseFrom(InputStream inputStream) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$DataPacket parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$DataPacket parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$DataPacket) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
