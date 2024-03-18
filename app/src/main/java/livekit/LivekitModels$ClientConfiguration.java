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
import jh.A1;
import jh.C4070r2;
import jh.EnumC4109z1;
import jh.K1;

/* loaded from: classes.dex */
public final class LivekitModels$ClientConfiguration extends AbstractC2497d0 implements N0 {
    private static final LivekitModels$ClientConfiguration DEFAULT_INSTANCE;
    public static final int DISABLED_CODECS_FIELD_NUMBER = 4;
    public static final int FORCE_RELAY_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RESUME_CONNECTION_FIELD_NUMBER = 3;
    public static final int SCREEN_FIELD_NUMBER = 2;
    public static final int VIDEO_FIELD_NUMBER = 1;
    private LivekitModels$DisabledCodecs disabledCodecs_;
    private int forceRelay_;
    private int resumeConnection_;
    private LivekitModels$VideoConfiguration screen_;
    private LivekitModels$VideoConfiguration video_;

    static {
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = new LivekitModels$ClientConfiguration();
        DEFAULT_INSTANCE = livekitModels$ClientConfiguration;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$ClientConfiguration.class, livekitModels$ClientConfiguration);
    }

    private LivekitModels$ClientConfiguration() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabledCodecs() {
        this.disabledCodecs_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceRelay() {
        this.forceRelay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeConnection() {
        this.resumeConnection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreen() {
        this.screen_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideo() {
        this.video_ = null;
    }

    public static LivekitModels$ClientConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisabledCodecs(LivekitModels$DisabledCodecs livekitModels$DisabledCodecs) {
        livekitModels$DisabledCodecs.getClass();
        LivekitModels$DisabledCodecs livekitModels$DisabledCodecs2 = this.disabledCodecs_;
        if (livekitModels$DisabledCodecs2 != null && livekitModels$DisabledCodecs2 != LivekitModels$DisabledCodecs.getDefaultInstance()) {
            K1 newBuilder = LivekitModels$DisabledCodecs.newBuilder(this.disabledCodecs_);
            newBuilder.f(livekitModels$DisabledCodecs);
            this.disabledCodecs_ = (LivekitModels$DisabledCodecs) newBuilder.c();
            return;
        }
        this.disabledCodecs_ = livekitModels$DisabledCodecs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScreen(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration2 = this.screen_;
        if (livekitModels$VideoConfiguration2 != null && livekitModels$VideoConfiguration2 != LivekitModels$VideoConfiguration.getDefaultInstance()) {
            C4070r2 newBuilder = LivekitModels$VideoConfiguration.newBuilder(this.screen_);
            newBuilder.f(livekitModels$VideoConfiguration);
            this.screen_ = (LivekitModels$VideoConfiguration) newBuilder.c();
            return;
        }
        this.screen_ = livekitModels$VideoConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVideo(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration2 = this.video_;
        if (livekitModels$VideoConfiguration2 != null && livekitModels$VideoConfiguration2 != LivekitModels$VideoConfiguration.getDefaultInstance()) {
            C4070r2 newBuilder = LivekitModels$VideoConfiguration.newBuilder(this.video_);
            newBuilder.f(livekitModels$VideoConfiguration);
            this.video_ = (LivekitModels$VideoConfiguration) newBuilder.c();
            return;
        }
        this.video_ = livekitModels$VideoConfiguration;
    }

    public static A1 newBuilder() {
        return (A1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ClientConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabledCodecs(LivekitModels$DisabledCodecs livekitModels$DisabledCodecs) {
        livekitModels$DisabledCodecs.getClass();
        this.disabledCodecs_ = livekitModels$DisabledCodecs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceRelay(EnumC4109z1 enumC4109z1) {
        this.forceRelay_ = enumC4109z1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceRelayValue(int i10) {
        this.forceRelay_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeConnection(EnumC4109z1 enumC4109z1) {
        this.resumeConnection_ = enumC4109z1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeConnectionValue(int i10) {
        this.resumeConnection_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreen(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        this.screen_ = livekitModels$VideoConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideo(LivekitModels$VideoConfiguration livekitModels$VideoConfiguration) {
        livekitModels$VideoConfiguration.getClass();
        this.video_ = livekitModels$VideoConfiguration;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f\u0004\t\u0005\f", new Object[]{"video_", "screen_", "resumeConnection_", "disabledCodecs_", "forceRelay_"});
            case 3:
                return new LivekitModels$ClientConfiguration();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$ClientConfiguration.class) {
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

    public LivekitModels$DisabledCodecs getDisabledCodecs() {
        LivekitModels$DisabledCodecs livekitModels$DisabledCodecs = this.disabledCodecs_;
        if (livekitModels$DisabledCodecs == null) {
            return LivekitModels$DisabledCodecs.getDefaultInstance();
        }
        return livekitModels$DisabledCodecs;
    }

    public EnumC4109z1 getForceRelay() {
        EnumC4109z1 b10 = EnumC4109z1.b(this.forceRelay_);
        if (b10 == null) {
            return EnumC4109z1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getForceRelayValue() {
        return this.forceRelay_;
    }

    public EnumC4109z1 getResumeConnection() {
        EnumC4109z1 b10 = EnumC4109z1.b(this.resumeConnection_);
        if (b10 == null) {
            return EnumC4109z1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getResumeConnectionValue() {
        return this.resumeConnection_;
    }

    public LivekitModels$VideoConfiguration getScreen() {
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration = this.screen_;
        if (livekitModels$VideoConfiguration == null) {
            return LivekitModels$VideoConfiguration.getDefaultInstance();
        }
        return livekitModels$VideoConfiguration;
    }

    public LivekitModels$VideoConfiguration getVideo() {
        LivekitModels$VideoConfiguration livekitModels$VideoConfiguration = this.video_;
        if (livekitModels$VideoConfiguration == null) {
            return LivekitModels$VideoConfiguration.getDefaultInstance();
        }
        return livekitModels$VideoConfiguration;
    }

    public boolean hasDisabledCodecs() {
        if (this.disabledCodecs_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasScreen() {
        if (this.screen_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasVideo() {
        if (this.video_ != null) {
            return true;
        }
        return false;
    }

    public static A1 newBuilder(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        return (A1) DEFAULT_INSTANCE.createBuilder(livekitModels$ClientConfiguration);
    }

    public static LivekitModels$ClientConfiguration parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ClientConfiguration parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$ClientConfiguration parseFrom(byte[] bArr) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ClientConfiguration parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$ClientConfiguration parseFrom(InputStream inputStream) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ClientConfiguration parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$ClientConfiguration parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$ClientConfiguration) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
