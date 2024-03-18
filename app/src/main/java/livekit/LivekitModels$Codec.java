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
import jh.D1;
import jh.E1;

/* loaded from: classes2.dex */
public final class LivekitModels$Codec extends AbstractC2497d0 implements E1 {
    private static final LivekitModels$Codec DEFAULT_INSTANCE;
    public static final int FMTP_LINE_FIELD_NUMBER = 2;
    public static final int MIME_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private String mime_ = "";
    private String fmtpLine_ = "";

    static {
        LivekitModels$Codec livekitModels$Codec = new LivekitModels$Codec();
        DEFAULT_INSTANCE = livekitModels$Codec;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$Codec.class, livekitModels$Codec);
    }

    private LivekitModels$Codec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFmtpLine() {
        this.fmtpLine_ = getDefaultInstance().getFmtpLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMime() {
        this.mime_ = getDefaultInstance().getMime();
    }

    public static LivekitModels$Codec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static D1 newBuilder() {
        return (D1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$Codec parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$Codec) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Codec parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFmtpLine(String str) {
        str.getClass();
        this.fmtpLine_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFmtpLineBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.fmtpLine_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMime(String str) {
        str.getClass();
        this.mime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.mime_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"mime_", "fmtpLine_"});
            case 3:
                return new LivekitModels$Codec();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$Codec.class) {
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

    public String getFmtpLine() {
        return this.fmtpLine_;
    }

    public AbstractC2534q getFmtpLineBytes() {
        return AbstractC2534q.y(this.fmtpLine_);
    }

    public String getMime() {
        return this.mime_;
    }

    public AbstractC2534q getMimeBytes() {
        return AbstractC2534q.y(this.mime_);
    }

    public static D1 newBuilder(LivekitModels$Codec livekitModels$Codec) {
        return (D1) DEFAULT_INSTANCE.createBuilder(livekitModels$Codec);
    }

    public static LivekitModels$Codec parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$Codec) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$Codec parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$Codec parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$Codec parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$Codec parseFrom(byte[] bArr) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$Codec parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$Codec parseFrom(InputStream inputStream) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$Codec parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$Codec parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$Codec parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$Codec) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
