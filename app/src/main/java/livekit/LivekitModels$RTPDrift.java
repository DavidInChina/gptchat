package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.Timestamp;
import com.google.protobuf.X;
import com.google.protobuf.q1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.X1;

/* loaded from: classes2.dex */
public final class LivekitModels$RTPDrift extends AbstractC2497d0 implements N0 {
    public static final int CLOCK_RATE_FIELD_NUMBER = 9;
    private static final LivekitModels$RTPDrift DEFAULT_INSTANCE;
    public static final int DRIFT_MS_FIELD_NUMBER = 8;
    public static final int DRIFT_SAMPLES_FIELD_NUMBER = 7;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 5;
    public static final int END_TIME_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RTP_CLOCK_TICKS_FIELD_NUMBER = 6;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int START_TIME_FIELD_NUMBER = 1;
    private double clockRate_;
    private double driftMs_;
    private long driftSamples_;
    private double duration_;
    private Timestamp endTime_;
    private long endTimestamp_;
    private long rtpClockTicks_;
    private Timestamp startTime_;
    private long startTimestamp_;

    static {
        LivekitModels$RTPDrift livekitModels$RTPDrift = new LivekitModels$RTPDrift();
        DEFAULT_INSTANCE = livekitModels$RTPDrift;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$RTPDrift.class, livekitModels$RTPDrift);
    }

    private LivekitModels$RTPDrift() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClockRate() {
        this.clockRate_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriftMs() {
        this.driftMs_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDriftSamples() {
        this.driftSamples_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDuration() {
        this.duration_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimestamp() {
        this.endTimestamp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtpClockTicks() {
        this.rtpClockTicks_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestamp() {
        this.startTimestamp_ = 0L;
    }

    public static LivekitModels$RTPDrift getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.endTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            q1 newBuilder = Timestamp.newBuilder(this.endTime_);
            newBuilder.f(timestamp);
            this.endTime_ = (Timestamp) newBuilder.c();
            return;
        }
        this.endTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.startTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            q1 newBuilder = Timestamp.newBuilder(this.startTime_);
            newBuilder.f(timestamp);
            this.startTime_ = (Timestamp) newBuilder.c();
            return;
        }
        this.startTime_ = timestamp;
    }

    public static X1 newBuilder() {
        return (X1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$RTPDrift parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPDrift parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClockRate(double d10) {
        this.clockRate_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriftMs(double d10) {
        this.driftMs_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDriftSamples(long j6) {
        this.driftSamples_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(double d10) {
        this.duration_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(Timestamp timestamp) {
        timestamp.getClass();
        this.endTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimestamp(long j6) {
        this.endTimestamp_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtpClockTicks(long j6) {
        this.rtpClockTicks_ = j6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(Timestamp timestamp) {
        timestamp.getClass();
        this.startTime_ = timestamp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestamp(long j6) {
        this.startTimestamp_ = j6;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0000\u0004\u0003\u0005\u0003\u0006\u0003\u0007\u0002\b\u0000\t\u0000", new Object[]{"startTime_", "endTime_", "duration_", "startTimestamp_", "endTimestamp_", "rtpClockTicks_", "driftSamples_", "driftMs_", "clockRate_"});
            case 3:
                return new LivekitModels$RTPDrift();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$RTPDrift.class) {
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

    public double getClockRate() {
        return this.clockRate_;
    }

    public double getDriftMs() {
        return this.driftMs_;
    }

    public long getDriftSamples() {
        return this.driftSamples_;
    }

    public double getDuration() {
        return this.duration_;
    }

    public Timestamp getEndTime() {
        Timestamp timestamp = this.endTime_;
        if (timestamp == null) {
            return Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public long getEndTimestamp() {
        return this.endTimestamp_;
    }

    public long getRtpClockTicks() {
        return this.rtpClockTicks_;
    }

    public Timestamp getStartTime() {
        Timestamp timestamp = this.startTime_;
        if (timestamp == null) {
            return Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public long getStartTimestamp() {
        return this.startTimestamp_;
    }

    public boolean hasEndTime() {
        if (this.endTime_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasStartTime() {
        if (this.startTime_ != null) {
            return true;
        }
        return false;
    }

    public static X1 newBuilder(LivekitModels$RTPDrift livekitModels$RTPDrift) {
        return (X1) DEFAULT_INSTANCE.createBuilder(livekitModels$RTPDrift);
    }

    public static LivekitModels$RTPDrift parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$RTPDrift parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$RTPDrift parseFrom(byte[] bArr) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$RTPDrift parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$RTPDrift parseFrom(InputStream inputStream) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$RTPDrift parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$RTPDrift parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$RTPDrift) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
