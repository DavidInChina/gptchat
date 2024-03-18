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
import jh.AbstractC4092w;
import jh.C4097x;

/* loaded from: classes.dex */
public final class LivekitAnalytics$AnalyticsStats extends AbstractC2497d0 implements N0 {
    private static final LivekitAnalytics$AnalyticsStats DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int STATS_FIELD_NUMBER = 1;
    private AbstractC2535q0 stats_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitAnalytics$AnalyticsStats livekitAnalytics$AnalyticsStats = new LivekitAnalytics$AnalyticsStats();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsStats;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsStats.class, livekitAnalytics$AnalyticsStats);
    }

    private LivekitAnalytics$AnalyticsStats() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStats(Iterable<? extends LivekitAnalytics$AnalyticsStat> iterable) {
        ensureStatsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.stats_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStats(LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        livekitAnalytics$AnalyticsStat.getClass();
        ensureStatsIsMutable();
        this.stats_.add(livekitAnalytics$AnalyticsStat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStats() {
        this.stats_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureStatsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.stats_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.stats_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitAnalytics$AnalyticsStats getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4097x newBuilder() {
        return (C4097x) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsStats parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStats(int i10) {
        ensureStatsIsMutable();
        this.stats_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStats(int i10, LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        livekitAnalytics$AnalyticsStat.getClass();
        ensureStatsIsMutable();
        this.stats_.set(i10, livekitAnalytics$AnalyticsStat);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stats_", LivekitAnalytics$AnalyticsStat.class});
            case 3:
                return new LivekitAnalytics$AnalyticsStats();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsStats.class) {
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

    public LivekitAnalytics$AnalyticsStat getStats(int i10) {
        return (LivekitAnalytics$AnalyticsStat) this.stats_.get(i10);
    }

    public int getStatsCount() {
        return this.stats_.size();
    }

    public List<LivekitAnalytics$AnalyticsStat> getStatsList() {
        return this.stats_;
    }

    public AbstractC4092w getStatsOrBuilder(int i10) {
        return (AbstractC4092w) this.stats_.get(i10);
    }

    public List<? extends AbstractC4092w> getStatsOrBuilderList() {
        return this.stats_;
    }

    public static C4097x newBuilder(LivekitAnalytics$AnalyticsStats livekitAnalytics$AnalyticsStats) {
        return (C4097x) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsStats);
    }

    public static LivekitAnalytics$AnalyticsStats parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStats(int i10, LivekitAnalytics$AnalyticsStat livekitAnalytics$AnalyticsStat) {
        livekitAnalytics$AnalyticsStat.getClass();
        ensureStatsIsMutable();
        this.stats_.add(i10, livekitAnalytics$AnalyticsStat);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsStats parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsStats) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
