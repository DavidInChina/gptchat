package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.AbstractC4111z3;
import jh.C4106y3;
import jh.EnumC4085u2;

/* loaded from: classes.dex */
public final class LivekitRtc$SubscribedQuality extends AbstractC2497d0 implements AbstractC4111z3 {
    private static final LivekitRtc$SubscribedQuality DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int QUALITY_FIELD_NUMBER = 1;
    private boolean enabled_;
    private int quality_;

    static {
        LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality = new LivekitRtc$SubscribedQuality();
        DEFAULT_INSTANCE = livekitRtc$SubscribedQuality;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SubscribedQuality.class, livekitRtc$SubscribedQuality);
    }

    private LivekitRtc$SubscribedQuality() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    public static LivekitRtc$SubscribedQuality getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4106y3 newBuilder() {
        return (C4106y3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SubscribedQuality parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z10) {
        this.enabled_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(EnumC4085u2 enumC4085u2) {
        this.quality_ = enumC4085u2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"quality_", "enabled_"});
            case 3:
                return new LivekitRtc$SubscribedQuality();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SubscribedQuality.class) {
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

    public boolean getEnabled() {
        return this.enabled_;
    }

    public EnumC4085u2 getQuality() {
        EnumC4085u2 b10 = EnumC4085u2.b(this.quality_);
        if (b10 == null) {
            return EnumC4085u2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public static C4106y3 newBuilder(LivekitRtc$SubscribedQuality livekitRtc$SubscribedQuality) {
        return (C4106y3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SubscribedQuality);
    }

    public static LivekitRtc$SubscribedQuality parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(byte[] bArr) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(InputStream inputStream) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SubscribedQuality parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SubscribedQuality) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
