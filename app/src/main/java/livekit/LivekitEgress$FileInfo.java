package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.X;
import jh.Y;

/* loaded from: classes2.dex */
public final class LivekitEgress$FileInfo extends AbstractC2497d0 implements Y {
    private static final LivekitEgress$FileInfo DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 6;
    public static final int ENDED_AT_FIELD_NUMBER = 3;
    public static final int FILENAME_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int STARTED_AT_FIELD_NUMBER = 2;
    private long duration_;
    private long endedAt_;
    private String filename_ = "";
    private String location_ = "";
    private long size_;
    private long startedAt_;

    static {
        LivekitEgress$FileInfo livekitEgress$FileInfo = new LivekitEgress$FileInfo();
        DEFAULT_INSTANCE = livekitEgress$FileInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$FileInfo.class, livekitEgress$FileInfo);
    }

    private LivekitEgress$FileInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndedAt() {
        this.endedAt_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFilename() {
        this.filename_ = getDefaultInstance().getFilename();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartedAt() {
        this.startedAt_ = 0L;
    }

    public static LivekitEgress$FileInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static X newBuilder() {
        return (X) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$FileInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$FileInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j6) {
        this.duration_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndedAt(long j6) {
        this.endedAt_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilename(String str) {
        str.getClass();
        this.filename_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFilenameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.filename_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.location_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j6) {
        this.size_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartedAt(long j6) {
        this.startedAt_ = j6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0002", new Object[]{"filename_", "startedAt_", "endedAt_", "size_", "location_", "duration_"});
            case 3:
                return new LivekitEgress$FileInfo();
            case 4:
                return new com.google.protobuf.X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$FileInfo.class) {
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

    public long getDuration() {
        return this.duration_;
    }

    public long getEndedAt() {
        return this.endedAt_;
    }

    public String getFilename() {
        return this.filename_;
    }

    public AbstractC2534q getFilenameBytes() {
        return AbstractC2534q.y(this.filename_);
    }

    public String getLocation() {
        return this.location_;
    }

    public AbstractC2534q getLocationBytes() {
        return AbstractC2534q.y(this.location_);
    }

    public long getSize() {
        return this.size_;
    }

    public long getStartedAt() {
        return this.startedAt_;
    }

    public static X newBuilder(LivekitEgress$FileInfo livekitEgress$FileInfo) {
        return (X) DEFAULT_INSTANCE.createBuilder(livekitEgress$FileInfo);
    }

    public static LivekitEgress$FileInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$FileInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$FileInfo parseFrom(byte[] bArr) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$FileInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$FileInfo parseFrom(InputStream inputStream) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$FileInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$FileInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$FileInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
