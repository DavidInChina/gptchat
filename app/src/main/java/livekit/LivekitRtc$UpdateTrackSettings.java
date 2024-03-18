package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2496d;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2535q0;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.EnumC4085u2;
import jh.N3;

/* loaded from: classes.dex */
public final class LivekitRtc$UpdateTrackSettings extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$UpdateTrackSettings DEFAULT_INSTANCE;
    public static final int DISABLED_FIELD_NUMBER = 3;
    public static final int FPS_FIELD_NUMBER = 7;
    public static final int HEIGHT_FIELD_NUMBER = 6;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 8;
    public static final int QUALITY_FIELD_NUMBER = 4;
    public static final int TRACK_SIDS_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private boolean disabled_;
    private int fps_;
    private int height_;
    private int priority_;
    private int quality_;
    private AbstractC2535q0 trackSids_ = AbstractC2497d0.emptyProtobufList();
    private int width_;

    static {
        LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings = new LivekitRtc$UpdateTrackSettings();
        DEFAULT_INSTANCE = livekitRtc$UpdateTrackSettings;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$UpdateTrackSettings.class, livekitRtc$UpdateTrackSettings);
    }

    private LivekitRtc$UpdateTrackSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrackSids(Iterable<String> iterable) {
        ensureTrackSidsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.trackSids_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSids(String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrackSidsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        ensureTrackSidsIsMutable();
        this.trackSids_.add(abstractC2534q.q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisabled() {
        this.disabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFps() {
        this.fps_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuality() {
        this.quality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSids() {
        this.trackSids_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    private void ensureTrackSidsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.trackSids_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.trackSids_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$UpdateTrackSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static N3 newBuilder() {
        return (N3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateTrackSettings parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisabled(boolean z10) {
        this.disabled_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFps(int i10) {
        this.fps_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i10) {
        this.height_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(int i10) {
        this.priority_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuality(EnumC4085u2 enumC4085u2) {
        this.quality_ = enumC4085u2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQualityValue(int i10) {
        this.quality_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSids(int i10, String str) {
        str.getClass();
        ensureTrackSidsIsMutable();
        this.trackSids_.set(i10, str);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001\u021a\u0003\u0007\u0004\f\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b", new Object[]{"trackSids_", "disabled_", "quality_", "width_", "height_", "fps_", "priority_"});
            case 3:
                return new LivekitRtc$UpdateTrackSettings();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$UpdateTrackSettings.class) {
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

    public boolean getDisabled() {
        return this.disabled_;
    }

    public int getFps() {
        return this.fps_;
    }

    public int getHeight() {
        return this.height_;
    }

    public int getPriority() {
        return this.priority_;
    }

    public EnumC4085u2 getQuality() {
        EnumC4085u2 b10 = EnumC4085u2.b(this.quality_);
        if (b10 == null) {
            return EnumC4085u2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getQualityValue() {
        return this.quality_;
    }

    public String getTrackSids(int i10) {
        return (String) this.trackSids_.get(i10);
    }

    public AbstractC2534q getTrackSidsBytes(int i10) {
        return AbstractC2534q.y((String) this.trackSids_.get(i10));
    }

    public int getTrackSidsCount() {
        return this.trackSids_.size();
    }

    public List<String> getTrackSidsList() {
        return this.trackSids_;
    }

    public int getWidth() {
        return this.width_;
    }

    public static N3 newBuilder(LivekitRtc$UpdateTrackSettings livekitRtc$UpdateTrackSettings) {
        return (N3) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateTrackSettings);
    }

    public static LivekitRtc$UpdateTrackSettings parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$UpdateTrackSettings parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$UpdateTrackSettings) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
