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
import jh.AbstractC4026i2;
import jh.C4021h2;

/* loaded from: classes2.dex */
public final class LivekitModels$SpeakerInfo extends AbstractC2497d0 implements AbstractC4026i2 {
    public static final int ACTIVE_FIELD_NUMBER = 3;
    private static final LivekitModels$SpeakerInfo DEFAULT_INSTANCE;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SID_FIELD_NUMBER = 1;
    private boolean active_;
    private float level_;
    private String sid_ = "";

    static {
        LivekitModels$SpeakerInfo livekitModels$SpeakerInfo = new LivekitModels$SpeakerInfo();
        DEFAULT_INSTANCE = livekitModels$SpeakerInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$SpeakerInfo.class, livekitModels$SpeakerInfo);
    }

    private LivekitModels$SpeakerInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.active_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSid() {
        this.sid_ = getDefaultInstance().getSid();
    }

    public static LivekitModels$SpeakerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4021h2 newBuilder() {
        return (C4021h2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$SpeakerInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SpeakerInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(boolean z10) {
        this.active_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(float f6) {
        this.level_ = f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSid(String str) {
        str.getClass();
        this.sid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0001\u0003\u0007", new Object[]{"sid_", "level_", "active_"});
            case 3:
                return new LivekitModels$SpeakerInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$SpeakerInfo.class) {
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

    public boolean getActive() {
        return this.active_;
    }

    public float getLevel() {
        return this.level_;
    }

    public String getSid() {
        return this.sid_;
    }

    public AbstractC2534q getSidBytes() {
        return AbstractC2534q.y(this.sid_);
    }

    public static C4021h2 newBuilder(LivekitModels$SpeakerInfo livekitModels$SpeakerInfo) {
        return (C4021h2) DEFAULT_INSTANCE.createBuilder(livekitModels$SpeakerInfo);
    }

    public static LivekitModels$SpeakerInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$SpeakerInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$SpeakerInfo parseFrom(byte[] bArr) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$SpeakerInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$SpeakerInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$SpeakerInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$SpeakerInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$SpeakerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
