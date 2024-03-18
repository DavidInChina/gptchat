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
import jh.C4035k1;
import jh.EnumC4030j1;

/* loaded from: classes2.dex */
public final class LivekitInternal$ICEConfig extends AbstractC2497d0 implements N0 {
    private static final LivekitInternal$ICEConfig DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PREFERENCE_PUBLISHER_FIELD_NUMBER = 2;
    public static final int PREFERENCE_SUBSCRIBER_FIELD_NUMBER = 1;
    private int preferencePublisher_;
    private int preferenceSubscriber_;

    static {
        LivekitInternal$ICEConfig livekitInternal$ICEConfig = new LivekitInternal$ICEConfig();
        DEFAULT_INSTANCE = livekitInternal$ICEConfig;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$ICEConfig.class, livekitInternal$ICEConfig);
    }

    private LivekitInternal$ICEConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferencePublisher() {
        this.preferencePublisher_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferenceSubscriber() {
        this.preferenceSubscriber_ = 0;
    }

    public static LivekitInternal$ICEConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4035k1 newBuilder() {
        return (C4035k1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$ICEConfig parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$ICEConfig parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferencePublisher(EnumC4030j1 enumC4030j1) {
        this.preferencePublisher_ = enumC4030j1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferencePublisherValue(int i10) {
        this.preferencePublisher_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferenceSubscriber(EnumC4030j1 enumC4030j1) {
        this.preferenceSubscriber_ = enumC4030j1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferenceSubscriberValue(int i10) {
        this.preferenceSubscriber_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"preferenceSubscriber_", "preferencePublisher_"});
            case 3:
                return new LivekitInternal$ICEConfig();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$ICEConfig.class) {
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

    public EnumC4030j1 getPreferencePublisher() {
        EnumC4030j1 b10 = EnumC4030j1.b(this.preferencePublisher_);
        if (b10 == null) {
            return EnumC4030j1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getPreferencePublisherValue() {
        return this.preferencePublisher_;
    }

    public EnumC4030j1 getPreferenceSubscriber() {
        EnumC4030j1 b10 = EnumC4030j1.b(this.preferenceSubscriber_);
        if (b10 == null) {
            return EnumC4030j1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getPreferenceSubscriberValue() {
        return this.preferenceSubscriber_;
    }

    public static C4035k1 newBuilder(LivekitInternal$ICEConfig livekitInternal$ICEConfig) {
        return (C4035k1) DEFAULT_INSTANCE.createBuilder(livekitInternal$ICEConfig);
    }

    public static LivekitInternal$ICEConfig parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$ICEConfig parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$ICEConfig parseFrom(byte[] bArr) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$ICEConfig parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$ICEConfig parseFrom(InputStream inputStream) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$ICEConfig parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$ICEConfig parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$ICEConfig) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
