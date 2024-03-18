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
import jh.AbstractC4007e3;
import jh.C4002d3;

/* loaded from: classes2.dex */
public final class LivekitRtc$RegionInfo extends AbstractC2497d0 implements AbstractC4007e3 {
    private static final LivekitRtc$RegionInfo DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private long distance_;
    private String region_ = "";
    private String url_ = "";

    static {
        LivekitRtc$RegionInfo livekitRtc$RegionInfo = new LivekitRtc$RegionInfo();
        DEFAULT_INSTANCE = livekitRtc$RegionInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$RegionInfo.class, livekitRtc$RegionInfo);
    }

    private LivekitRtc$RegionInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = getDefaultInstance().getUrl();
    }

    public static LivekitRtc$RegionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4002d3 newBuilder() {
        return (C4002d3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$RegionInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(long j6) {
        this.distance_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegion(String str) {
        str.getClass();
        this.region_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.region_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.url_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002", new Object[]{"region_", "url_", "distance_"});
            case 3:
                return new LivekitRtc$RegionInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$RegionInfo.class) {
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

    public long getDistance() {
        return this.distance_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC2534q getRegionBytes() {
        return AbstractC2534q.y(this.region_);
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC2534q getUrlBytes() {
        return AbstractC2534q.y(this.url_);
    }

    public static C4002d3 newBuilder(LivekitRtc$RegionInfo livekitRtc$RegionInfo) {
        return (C4002d3) DEFAULT_INSTANCE.createBuilder(livekitRtc$RegionInfo);
    }

    public static LivekitRtc$RegionInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$RegionInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$RegionInfo parseFrom(byte[] bArr) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$RegionInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$RegionInfo parseFrom(InputStream inputStream) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$RegionInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$RegionInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$RegionInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
