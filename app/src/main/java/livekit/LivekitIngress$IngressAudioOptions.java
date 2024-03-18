package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.EnumC4051n2;
import jh.Q0;
import jh.R0;
import jh.S0;
import jh.T0;

/* loaded from: classes.dex */
public final class LivekitIngress$IngressAudioOptions extends AbstractC2497d0 implements N0 {
    private static final LivekitIngress$IngressAudioOptions DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private Object encodingOptions_;
    private int source_;
    private int encodingOptionsCase_ = 0;
    private String name_ = "";

    static {
        LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions = new LivekitIngress$IngressAudioOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressAudioOptions;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$IngressAudioOptions.class, livekitIngress$IngressAudioOptions);
    }

    private LivekitIngress$IngressAudioOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodingOptions() {
        this.encodingOptionsCase_ = 0;
        this.encodingOptions_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        if (this.encodingOptionsCase_ == 4) {
            this.encodingOptionsCase_ = 0;
            this.encodingOptions_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreset() {
        if (this.encodingOptionsCase_ == 3) {
            this.encodingOptionsCase_ = 0;
            this.encodingOptions_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    public static LivekitIngress$IngressAudioOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions) {
        livekitIngress$IngressAudioEncodingOptions.getClass();
        if (this.encodingOptionsCase_ == 4 && this.encodingOptions_ != LivekitIngress$IngressAudioEncodingOptions.getDefaultInstance()) {
            Q0 newBuilder = LivekitIngress$IngressAudioEncodingOptions.newBuilder((LivekitIngress$IngressAudioEncodingOptions) this.encodingOptions_);
            newBuilder.f(livekitIngress$IngressAudioEncodingOptions);
            this.encodingOptions_ = newBuilder.c();
        } else {
            this.encodingOptions_ = livekitIngress$IngressAudioEncodingOptions;
        }
        this.encodingOptionsCase_ = 4;
    }

    public static S0 newBuilder() {
        return (S0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressAudioOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(LivekitIngress$IngressAudioEncodingOptions livekitIngress$IngressAudioEncodingOptions) {
        livekitIngress$IngressAudioEncodingOptions.getClass();
        this.encodingOptions_ = livekitIngress$IngressAudioEncodingOptions;
        this.encodingOptionsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(R0 r02) {
        this.encodingOptions_ = Integer.valueOf(r02.a());
        this.encodingOptionsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresetValue(int i10) {
        this.encodingOptionsCase_ = 3;
        this.encodingOptions_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(EnumC4051n2 enumC4051n2) {
        this.source_ = enumC4051n2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i10) {
        this.source_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003?\u0000\u0004<\u0000", new Object[]{"encodingOptions_", "encodingOptionsCase_", "name_", "source_", LivekitIngress$IngressAudioEncodingOptions.class});
            case 3:
                return new LivekitIngress$IngressAudioOptions();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$IngressAudioOptions.class) {
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

    public T0 getEncodingOptionsCase() {
        int i10 = this.encodingOptionsCase_;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return null;
                }
                return T0.f36343Z;
            }
            return T0.f36342Y;
        }
        return T0.f36344h0;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public LivekitIngress$IngressAudioEncodingOptions getOptions() {
        if (this.encodingOptionsCase_ == 4) {
            return (LivekitIngress$IngressAudioEncodingOptions) this.encodingOptions_;
        }
        return LivekitIngress$IngressAudioEncodingOptions.getDefaultInstance();
    }

    public R0 getPreset() {
        int i10 = this.encodingOptionsCase_;
        R0 r02 = R0.OPUS_STEREO_96KBPS;
        if (i10 == 3) {
            int intValue = ((Integer) this.encodingOptions_).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    r02 = null;
                } else {
                    r02 = R0.OPUS_MONO_64KBS;
                }
            }
            if (r02 == null) {
                return R0.UNRECOGNIZED;
            }
            return r02;
        }
        return r02;
    }

    public int getPresetValue() {
        if (this.encodingOptionsCase_ == 3) {
            return ((Integer) this.encodingOptions_).intValue();
        }
        return 0;
    }

    public EnumC4051n2 getSource() {
        EnumC4051n2 b10 = EnumC4051n2.b(this.source_);
        if (b10 == null) {
            return EnumC4051n2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean hasOptions() {
        if (this.encodingOptionsCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasPreset() {
        if (this.encodingOptionsCase_ == 3) {
            return true;
        }
        return false;
    }

    public static S0 newBuilder(LivekitIngress$IngressAudioOptions livekitIngress$IngressAudioOptions) {
        return (S0) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressAudioOptions);
    }

    public static LivekitIngress$IngressAudioOptions parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$IngressAudioOptions parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$IngressAudioOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
