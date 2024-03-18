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
import jh.N1;

/* loaded from: classes.dex */
public final class LivekitModels$Encryption extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$Encryption DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER;

    static {
        LivekitModels$Encryption livekitModels$Encryption = new LivekitModels$Encryption();
        DEFAULT_INSTANCE = livekitModels$Encryption;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$Encryption.class, livekitModels$Encryption);
    }

    private LivekitModels$Encryption() {
    }

    public static LivekitModels$Encryption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static N1 newBuilder() {
        return (N1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$Encryption parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Encryption parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new LivekitModels$Encryption();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$Encryption.class) {
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

    public static N1 newBuilder(LivekitModels$Encryption livekitModels$Encryption) {
        return (N1) DEFAULT_INSTANCE.createBuilder(livekitModels$Encryption);
    }

    public static LivekitModels$Encryption parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$Encryption parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$Encryption parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$Encryption parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$Encryption parseFrom(byte[] bArr) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$Encryption parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$Encryption parseFrom(InputStream inputStream) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Encryption parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$Encryption parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$Encryption parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$Encryption) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
