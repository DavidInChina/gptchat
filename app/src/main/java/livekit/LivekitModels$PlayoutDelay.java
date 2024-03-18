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
import jh.W1;

/* loaded from: classes2.dex */
public final class LivekitModels$PlayoutDelay extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$PlayoutDelay DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 1;
    public static final int MAX_FIELD_NUMBER = 3;
    public static final int MIN_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER;
    private boolean enabled_;
    private int max_;
    private int min_;

    static {
        LivekitModels$PlayoutDelay livekitModels$PlayoutDelay = new LivekitModels$PlayoutDelay();
        DEFAULT_INSTANCE = livekitModels$PlayoutDelay;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$PlayoutDelay.class, livekitModels$PlayoutDelay);
    }

    private LivekitModels$PlayoutDelay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnabled() {
        this.enabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMax() {
        this.max_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMin() {
        this.min_ = 0;
    }

    public static LivekitModels$PlayoutDelay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static W1 newBuilder() {
        return (W1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$PlayoutDelay parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$PlayoutDelay parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnabled(boolean z10) {
        this.enabled_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMax(int i10) {
        this.max_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMin(int i10) {
        this.min_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b", new Object[]{"enabled_", "min_", "max_"});
            case 3:
                return new LivekitModels$PlayoutDelay();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$PlayoutDelay.class) {
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

    public int getMax() {
        return this.max_;
    }

    public int getMin() {
        return this.min_;
    }

    public static W1 newBuilder(LivekitModels$PlayoutDelay livekitModels$PlayoutDelay) {
        return (W1) DEFAULT_INSTANCE.createBuilder(livekitModels$PlayoutDelay);
    }

    public static LivekitModels$PlayoutDelay parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$PlayoutDelay parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$PlayoutDelay parseFrom(byte[] bArr) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$PlayoutDelay parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$PlayoutDelay parseFrom(InputStream inputStream) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$PlayoutDelay parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$PlayoutDelay parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$PlayoutDelay) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
