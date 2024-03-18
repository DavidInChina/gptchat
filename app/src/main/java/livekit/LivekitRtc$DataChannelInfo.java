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
import jh.EnumC4047m3;
import jh.S2;
import jh.T2;

/* loaded from: classes.dex */
public final class LivekitRtc$DataChannelInfo extends AbstractC2497d0 implements T2 {
    private static final LivekitRtc$DataChannelInfo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 2;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 3;
    private int id_;
    private String label_ = "";
    private int target_;

    static {
        LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo = new LivekitRtc$DataChannelInfo();
        DEFAULT_INSTANCE = livekitRtc$DataChannelInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$DataChannelInfo.class, livekitRtc$DataChannelInfo);
    }

    private LivekitRtc$DataChannelInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = getDefaultInstance().getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTarget() {
        this.target_ = 0;
    }

    public static LivekitRtc$DataChannelInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static S2 newBuilder() {
        return (S2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$DataChannelInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i10) {
        this.id_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(String str) {
        str.getClass();
        this.label_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabelBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.label_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTarget(EnumC4047m3 enumC4047m3) {
        this.target_ = enumC4047m3.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetValue(int i10) {
        this.target_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u000b\u0003\f", new Object[]{"label_", "id_", "target_"});
            case 3:
                return new LivekitRtc$DataChannelInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$DataChannelInfo.class) {
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

    public int getId() {
        return this.id_;
    }

    public String getLabel() {
        return this.label_;
    }

    public AbstractC2534q getLabelBytes() {
        return AbstractC2534q.y(this.label_);
    }

    public EnumC4047m3 getTarget() {
        EnumC4047m3 enumC4047m3;
        int i10 = this.target_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4047m3 = null;
            } else {
                enumC4047m3 = EnumC4047m3.SUBSCRIBER;
            }
        } else {
            enumC4047m3 = EnumC4047m3.PUBLISHER;
        }
        if (enumC4047m3 == null) {
            return EnumC4047m3.UNRECOGNIZED;
        }
        return enumC4047m3;
    }

    public int getTargetValue() {
        return this.target_;
    }

    public static S2 newBuilder(LivekitRtc$DataChannelInfo livekitRtc$DataChannelInfo) {
        return (S2) DEFAULT_INSTANCE.createBuilder(livekitRtc$DataChannelInfo);
    }

    public static LivekitRtc$DataChannelInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$DataChannelInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$DataChannelInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
