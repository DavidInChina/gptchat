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
import jh.C4070r2;
import jh.EnumC4109z1;

/* loaded from: classes.dex */
public final class LivekitModels$VideoConfiguration extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$VideoConfiguration DEFAULT_INSTANCE;
    public static final int HARDWARE_ENCODER_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private int hardwareEncoder_;

    static {
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration = new LivekitModels$VideoConfiguration();
        DEFAULT_INSTANCE = livekitModels$VideoConfiguration;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$VideoConfiguration.class, livekitModels$VideoConfiguration);
    }

    private LivekitModels$VideoConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHardwareEncoder() {
        this.hardwareEncoder_ = 0;
    }

    public static LivekitModels$VideoConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4070r2 newBuilder() {
        return (C4070r2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$VideoConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareEncoder(EnumC4109z1 enumC4109z1) {
        this.hardwareEncoder_ = enumC4109z1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareEncoderValue(int i10) {
        this.hardwareEncoder_ = i10;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"hardwareEncoder_"});
            case 3:
                return new LivekitModels$VideoConfiguration();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$VideoConfiguration.class) {
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

    public EnumC4109z1 getHardwareEncoder() {
        EnumC4109z1 b10 = EnumC4109z1.b(this.hardwareEncoder_);
        if (b10 == null) {
            return EnumC4109z1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getHardwareEncoderValue() {
        return this.hardwareEncoder_;
    }

    public static C4070r2 newBuilder(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        return (C4070r2) DEFAULT_INSTANCE.createBuilder(livekitModels$VideoConfiguration);
    }

    public static LivekitModels$VideoConfiguration parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$VideoConfiguration parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$VideoConfiguration parseFrom(byte[] bArr) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$VideoConfiguration parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$VideoConfiguration parseFrom(InputStream inputStream) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$VideoConfiguration parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$VideoConfiguration parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$VideoConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
