package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jh.C4052n3;
import jh.EnumC4057o3;
import jh.O2;

/* loaded from: classes.dex */
public final class LivekitRtc$SimulateScenario extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$SimulateScenario DEFAULT_INSTANCE;
    public static final int MIGRATION_FIELD_NUMBER = 3;
    public static final int NODE_FAILURE_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SERVER_LEAVE_FIELD_NUMBER = 4;
    public static final int SPEAKER_UPDATE_FIELD_NUMBER = 1;
    public static final int SUBSCRIBER_BANDWIDTH_FIELD_NUMBER = 6;
    public static final int SWITCH_CANDIDATE_PROTOCOL_FIELD_NUMBER = 5;
    private int scenarioCase_ = 0;
    private Object scenario_;

    static {
        LivekitRtc$SimulateScenario livekitRtc$SimulateScenario = new LivekitRtc$SimulateScenario();
        DEFAULT_INSTANCE = livekitRtc$SimulateScenario;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$SimulateScenario.class, livekitRtc$SimulateScenario);
    }

    private LivekitRtc$SimulateScenario() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMigration() {
        if (this.scenarioCase_ == 3) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeFailure() {
        if (this.scenarioCase_ == 2) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScenario() {
        this.scenarioCase_ = 0;
        this.scenario_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerLeave() {
        if (this.scenarioCase_ == 4) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakerUpdate() {
        if (this.scenarioCase_ == 1) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriberBandwidth() {
        if (this.scenarioCase_ == 6) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitchCandidateProtocol() {
        if (this.scenarioCase_ == 5) {
            this.scenarioCase_ = 0;
            this.scenario_ = null;
        }
    }

    public static LivekitRtc$SimulateScenario getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4052n3 newBuilder() {
        return (C4052n3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$SimulateScenario parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulateScenario parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMigration(boolean z10) {
        this.scenarioCase_ = 3;
        this.scenario_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeFailure(boolean z10) {
        this.scenarioCase_ = 2;
        this.scenario_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerLeave(boolean z10) {
        this.scenarioCase_ = 4;
        this.scenario_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakerUpdate(int i10) {
        this.scenarioCase_ = 1;
        this.scenario_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriberBandwidth(long j6) {
        this.scenarioCase_ = 6;
        this.scenario_ = Long.valueOf(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchCandidateProtocol(O2 o22) {
        this.scenario_ = Integer.valueOf(o22.a());
        this.scenarioCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitchCandidateProtocolValue(int i10) {
        this.scenarioCase_ = 5;
        this.scenario_ = Integer.valueOf(i10);
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u00017\u0000\u0002:\u0000\u0003:\u0000\u0004:\u0000\u0005?\u0000\u00065\u0000", new Object[]{"scenario_", "scenarioCase_"});
            case 3:
                return new LivekitRtc$SimulateScenario();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$SimulateScenario.class) {
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

    public boolean getMigration() {
        if (this.scenarioCase_ == 3) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public boolean getNodeFailure() {
        if (this.scenarioCase_ == 2) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public EnumC4057o3 getScenarioCase() {
        switch (this.scenarioCase_) {
            case 0:
                return EnumC4057o3.f36541l0;
            case 1:
                return EnumC4057o3.f36535Y;
            case 2:
                return EnumC4057o3.f36536Z;
            case 3:
                return EnumC4057o3.f36537h0;
            case 4:
                return EnumC4057o3.f36538i0;
            case 5:
                return EnumC4057o3.f36539j0;
            case 6:
                return EnumC4057o3.f36540k0;
            default:
                return null;
        }
    }

    public boolean getServerLeave() {
        if (this.scenarioCase_ == 4) {
            return ((Boolean) this.scenario_).booleanValue();
        }
        return false;
    }

    public int getSpeakerUpdate() {
        if (this.scenarioCase_ == 1) {
            return ((Integer) this.scenario_).intValue();
        }
        return 0;
    }

    public long getSubscriberBandwidth() {
        if (this.scenarioCase_ == 6) {
            return ((Long) this.scenario_).longValue();
        }
        return 0L;
    }

    public O2 getSwitchCandidateProtocol() {
        int i10 = this.scenarioCase_;
        O2 o22 = O2.UDP;
        if (i10 == 5) {
            int intValue = ((Integer) this.scenario_).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        o22 = null;
                    } else {
                        o22 = O2.TLS;
                    }
                } else {
                    o22 = O2.TCP;
                }
            }
            if (o22 == null) {
                return O2.UNRECOGNIZED;
            }
            return o22;
        }
        return o22;
    }

    public int getSwitchCandidateProtocolValue() {
        if (this.scenarioCase_ == 5) {
            return ((Integer) this.scenario_).intValue();
        }
        return 0;
    }

    public boolean hasMigration() {
        if (this.scenarioCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasNodeFailure() {
        if (this.scenarioCase_ == 2) {
            return true;
        }
        return false;
    }

    public boolean hasServerLeave() {
        if (this.scenarioCase_ == 4) {
            return true;
        }
        return false;
    }

    public boolean hasSpeakerUpdate() {
        if (this.scenarioCase_ == 1) {
            return true;
        }
        return false;
    }

    public boolean hasSubscriberBandwidth() {
        if (this.scenarioCase_ == 6) {
            return true;
        }
        return false;
    }

    public boolean hasSwitchCandidateProtocol() {
        if (this.scenarioCase_ == 5) {
            return true;
        }
        return false;
    }

    public static C4052n3 newBuilder(LivekitRtc$SimulateScenario livekitRtc$SimulateScenario) {
        return (C4052n3) DEFAULT_INSTANCE.createBuilder(livekitRtc$SimulateScenario);
    }

    public static LivekitRtc$SimulateScenario parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SimulateScenario parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$SimulateScenario parseFrom(byte[] bArr) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$SimulateScenario parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$SimulateScenario parseFrom(InputStream inputStream) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$SimulateScenario parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$SimulateScenario parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$SimulateScenario) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
