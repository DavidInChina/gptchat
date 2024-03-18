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
import jh.C4005e1;

/* loaded from: classes.dex */
public final class LivekitIngress$InputVideoState extends AbstractC2497d0 implements N0 {
    public static final int AVERAGE_BITRATE_FIELD_NUMBER = 2;
    private static final LivekitIngress$InputVideoState DEFAULT_INSTANCE;
    public static final int FRAMERATE_FIELD_NUMBER = 5;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private int averageBitrate_;
    private double framerate_;
    private int height_;
    private String mimeType_ = "";
    private int width_;

    static {
        LivekitIngress$InputVideoState livekitIngress$InputVideoState = new LivekitIngress$InputVideoState();
        DEFAULT_INSTANCE = livekitIngress$InputVideoState;
        AbstractC2497d0.registerDefaultInstance(LivekitIngress$InputVideoState.class, livekitIngress$InputVideoState);
    }

    private LivekitIngress$InputVideoState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageBitrate() {
        this.averageBitrate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFramerate() {
        this.framerate_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMimeType() {
        this.mimeType_ = getDefaultInstance().getMimeType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static LivekitIngress$InputVideoState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4005e1 newBuilder() {
        return (C4005e1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitIngress$InputVideoState parseDelimitedFrom(InputStream inputStream) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputVideoState parseFrom(ByteBuffer byteBuffer) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageBitrate(int i10) {
        this.averageBitrate_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramerate(double d10) {
        this.framerate_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeType(String str) {
        str.getClass();
        this.mimeType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMimeTypeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.mimeType_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i10) {
        this.width_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u0000", new Object[]{"mimeType_", "averageBitrate_", "width_", "height_", "framerate_"});
            case 3:
                return new LivekitIngress$InputVideoState();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitIngress$InputVideoState.class) {
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

    public int getAverageBitrate() {
        return this.averageBitrate_;
    }

    public double getFramerate() {
        return this.framerate_;
    }

    public int getHeight() {
        return this.height_;
    }

    public String getMimeType() {
        return this.mimeType_;
    }

    public AbstractC2534q getMimeTypeBytes() {
        return AbstractC2534q.y(this.mimeType_);
    }

    public int getWidth() {
        return this.width_;
    }

    public static C4005e1 newBuilder(LivekitIngress$InputVideoState livekitIngress$InputVideoState) {
        return (C4005e1) DEFAULT_INSTANCE.createBuilder(livekitIngress$InputVideoState);
    }

    public static LivekitIngress$InputVideoState parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$InputVideoState parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitIngress$InputVideoState parseFrom(byte[] bArr) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitIngress$InputVideoState parseFrom(byte[] bArr, J j6) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitIngress$InputVideoState parseFrom(InputStream inputStream) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitIngress$InputVideoState parseFrom(InputStream inputStream, J j6) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitIngress$InputVideoState parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitIngress$InputVideoState) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
