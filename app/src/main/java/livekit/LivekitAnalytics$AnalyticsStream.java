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
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.AbstractC3974B;
import jh.AbstractC4107z;
import jh.C4102y;

/* loaded from: classes2.dex */
public final class LivekitAnalytics$AnalyticsStream extends AbstractC2497d0 implements AbstractC4107z {
    private static final LivekitAnalytics$AnalyticsStream DEFAULT_INSTANCE;
    public static final int FIRS_FIELD_NUMBER = 14;
    public static final int FRAMES_FIELD_NUMBER = 9;
    public static final int JITTER_FIELD_NUMBER = 11;
    public static final int NACKS_FIELD_NUMBER = 12;
    public static final int PACKETS_LOST_FIELD_NUMBER = 8;
    public static final int PADDING_BYTES_FIELD_NUMBER = 7;
    public static final int PADDING_PACKETS_FIELD_NUMBER = 6;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PLIS_FIELD_NUMBER = 13;
    public static final int PRIMARY_BYTES_FIELD_NUMBER = 3;
    public static final int PRIMARY_PACKETS_FIELD_NUMBER = 2;
    public static final int RETRANSMIT_BYTES_FIELD_NUMBER = 5;
    public static final int RETRANSMIT_PACKETS_FIELD_NUMBER = 4;
    public static final int RTT_FIELD_NUMBER = 10;
    public static final int SSRC_FIELD_NUMBER = 1;
    public static final int VIDEO_LAYERS_FIELD_NUMBER = 15;
    private int firs_;
    private int frames_;
    private int jitter_;
    private int nacks_;
    private int packetsLost_;
    private long paddingBytes_;
    private int paddingPackets_;
    private int plis_;
    private long primaryBytes_;
    private int primaryPackets_;
    private long retransmitBytes_;
    private int retransmitPackets_;
    private int rtt_;
    private int ssrc_;
    private AbstractC2535q0 videoLayers_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream = new LivekitAnalytics$AnalyticsStream();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsStream;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsStream.class, livekitAnalytics$AnalyticsStream);
    }

    private LivekitAnalytics$AnalyticsStream() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVideoLayers(Iterable<? extends LivekitAnalytics$AnalyticsVideoLayer> iterable) {
        ensureVideoLayersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.videoLayers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoLayers(LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        livekitAnalytics$AnalyticsVideoLayer.getClass();
        ensureVideoLayersIsMutable();
        this.videoLayers_.add(livekitAnalytics$AnalyticsVideoLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirs() {
        this.firs_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrames() {
        this.frames_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJitter() {
        this.jitter_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNacks() {
        this.nacks_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacketsLost() {
        this.packetsLost_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaddingBytes() {
        this.paddingBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPaddingPackets() {
        this.paddingPackets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlis() {
        this.plis_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryBytes() {
        this.primaryBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryPackets() {
        this.primaryPackets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitBytes() {
        this.retransmitBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetransmitPackets() {
        this.retransmitPackets_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtt() {
        this.rtt_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSsrc() {
        this.ssrc_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVideoLayers() {
        this.videoLayers_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureVideoLayersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.videoLayers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.videoLayers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitAnalytics$AnalyticsStream getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4102y newBuilder() {
        return (C4102y) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsStream parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVideoLayers(int i10) {
        ensureVideoLayersIsMutable();
        this.videoLayers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirs(int i10) {
        this.firs_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrames(int i10) {
        this.frames_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJitter(int i10) {
        this.jitter_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNacks(int i10) {
        this.nacks_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacketsLost(int i10) {
        this.packetsLost_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaddingBytes(long j6) {
        this.paddingBytes_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPaddingPackets(int i10) {
        this.paddingPackets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlis(int i10) {
        this.plis_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryBytes(long j6) {
        this.primaryBytes_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryPackets(int i10) {
        this.primaryPackets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitBytes(long j6) {
        this.retransmitBytes_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetransmitPackets(int i10) {
        this.retransmitPackets_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtt(int i10) {
        this.rtt_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsrc(int i10) {
        this.ssrc_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoLayers(int i10, LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        livekitAnalytics$AnalyticsVideoLayer.getClass();
        ensureVideoLayersIsMutable();
        this.videoLayers_.set(i10, livekitAnalytics$AnalyticsVideoLayer);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u0003\u0004\u000b\u0005\u0003\u0006\u000b\u0007\u0003\b\u000b\t\u000b\n\u000b\u000b\u000b\f\u000b\r\u000b\u000e\u000b\u000f\u001b", new Object[]{"ssrc_", "primaryPackets_", "primaryBytes_", "retransmitPackets_", "retransmitBytes_", "paddingPackets_", "paddingBytes_", "packetsLost_", "frames_", "rtt_", "jitter_", "nacks_", "plis_", "firs_", "videoLayers_", LivekitAnalytics$AnalyticsVideoLayer.class});
            case 3:
                return new LivekitAnalytics$AnalyticsStream();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsStream.class) {
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

    public int getFirs() {
        return this.firs_;
    }

    public int getFrames() {
        return this.frames_;
    }

    public int getJitter() {
        return this.jitter_;
    }

    public int getNacks() {
        return this.nacks_;
    }

    public int getPacketsLost() {
        return this.packetsLost_;
    }

    public long getPaddingBytes() {
        return this.paddingBytes_;
    }

    public int getPaddingPackets() {
        return this.paddingPackets_;
    }

    public int getPlis() {
        return this.plis_;
    }

    public long getPrimaryBytes() {
        return this.primaryBytes_;
    }

    public int getPrimaryPackets() {
        return this.primaryPackets_;
    }

    public long getRetransmitBytes() {
        return this.retransmitBytes_;
    }

    public int getRetransmitPackets() {
        return this.retransmitPackets_;
    }

    public int getRtt() {
        return this.rtt_;
    }

    public int getSsrc() {
        return this.ssrc_;
    }

    public LivekitAnalytics$AnalyticsVideoLayer getVideoLayers(int i10) {
        return (LivekitAnalytics$AnalyticsVideoLayer) this.videoLayers_.get(i10);
    }

    public int getVideoLayersCount() {
        return this.videoLayers_.size();
    }

    public List<LivekitAnalytics$AnalyticsVideoLayer> getVideoLayersList() {
        return this.videoLayers_;
    }

    public AbstractC3974B getVideoLayersOrBuilder(int i10) {
        return (AbstractC3974B) this.videoLayers_.get(i10);
    }

    public List<? extends AbstractC3974B> getVideoLayersOrBuilderList() {
        return this.videoLayers_;
    }

    public static C4102y newBuilder(LivekitAnalytics$AnalyticsStream livekitAnalytics$AnalyticsStream) {
        return (C4102y) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsStream);
    }

    public static LivekitAnalytics$AnalyticsStream parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVideoLayers(int i10, LivekitAnalytics$AnalyticsVideoLayer livekitAnalytics$AnalyticsVideoLayer) {
        livekitAnalytics$AnalyticsVideoLayer.getClass();
        ensureVideoLayersIsMutable();
        this.videoLayers_.add(i10, livekitAnalytics$AnalyticsVideoLayer);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsStream parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsStream) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
