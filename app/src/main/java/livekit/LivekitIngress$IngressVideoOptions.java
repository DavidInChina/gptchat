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
import jh.C3990b1;
import jh.EnumC3985a1;
import jh.EnumC3995c1;
import jh.EnumC4051n2;
import jh.Z0;

/* loaded from: classes.dex */
public final class LivekitIngress$IngressVideoOptions extends AbstractC2497d0 implements N0 {
    private static final LivekitIngress$IngressVideoOptions DEFAULT_INSTANCE;
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
        LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions = new LivekitIngress$IngressVideoOptions();
        DEFAULT_INSTANCE = livekitIngress$IngressVideoOptions;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$IngressVideoOptions.class, livekitIngress$IngressVideoOptions);
    }

    private LivekitIngress$IngressVideoOptions() {
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

    public static LivekitIngress$IngressVideoOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions) {
        livekitIngress$IngressVideoEncodingOptions.getClass();
        if (this.encodingOptionsCase_ == 4 && this.encodingOptions_ != LivekitIngress$IngressVideoEncodingOptions.getDefaultInstance()) {
            Z0 newBuilder = LivekitIngress$IngressVideoEncodingOptions.newBuilder((LivekitIngress$IngressVideoEncodingOptions) this.encodingOptions_);
            newBuilder.f(livekitIngress$IngressVideoEncodingOptions);
            this.encodingOptions_ = newBuilder.c();
        } else {
            this.encodingOptions_ = livekitIngress$IngressVideoEncodingOptions;
        }
        this.encodingOptionsCase_ = 4;
    }

    public static C3990b1 newBuilder() {
        return (C3990b1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$IngressVideoOptions parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setOptions(LivekitIngress$IngressVideoEncodingOptions livekitIngress$IngressVideoEncodingOptions) {
        livekitIngress$IngressVideoEncodingOptions.getClass();
        this.encodingOptions_ = livekitIngress$IngressVideoEncodingOptions;
        this.encodingOptionsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreset(EnumC3985a1 enumC3985a1) {
        this.encodingOptions_ = Integer.valueOf(enumC3985a1.a());
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003?\u0000\u0004<\u0000", new Object[]{"encodingOptions_", "encodingOptionsCase_", "name_", "source_", LivekitIngress$IngressVideoEncodingOptions.class});
            case 3:
                return new LivekitIngress$IngressVideoOptions();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$IngressVideoOptions.class) {
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

    public EnumC3995c1 getEncodingOptionsCase() {
        int i10 = this.encodingOptionsCase_;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 != 4) {
                    return null;
                }
                return EnumC3995c1.f36411Z;
            }
            return EnumC3995c1.f36410Y;
        }
        return EnumC3995c1.f36412h0;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public LivekitIngress$IngressVideoEncodingOptions getOptions() {
        if (this.encodingOptionsCase_ == 4) {
            return (LivekitIngress$IngressVideoEncodingOptions) this.encodingOptions_;
        }
        return LivekitIngress$IngressVideoEncodingOptions.getDefaultInstance();
    }

    public EnumC3985a1 getPreset() {
        if (this.encodingOptionsCase_ == 3) {
            EnumC3985a1 b10 = EnumC3985a1.b(((Integer) this.encodingOptions_).intValue());
            if (b10 == null) {
                return EnumC3985a1.UNRECOGNIZED;
            }
            return b10;
        }
        return EnumC3985a1.H264_720P_30FPS_3_LAYERS;
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

    public static C3990b1 newBuilder(LivekitIngress$IngressVideoOptions livekitIngress$IngressVideoOptions) {
        return (C3990b1) DEFAULT_INSTANCE.createBuilder(livekitIngress$IngressVideoOptions);
    }

    public static LivekitIngress$IngressVideoOptions parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(byte[] bArr) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(InputStream inputStream) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$IngressVideoOptions parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$IngressVideoOptions) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
