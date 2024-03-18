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
import jh.C4045m1;
import jh.C4055o1;
import jh.EnumC4050n1;
import jh.EnumC4060p1;

/* loaded from: classes2.dex */
public final class LivekitInternal$Node extends AbstractC2497d0 implements N0 {
    private static final LivekitInternal$Node DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IP_FIELD_NUMBER = 2;
    public static final int NUM_CPUS_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int REGION_FIELD_NUMBER = 7;
    public static final int STATE_FIELD_NUMBER = 6;
    public static final int STATS_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 5;
    private int numCpus_;
    private int state_;
    private LivekitInternal$NodeStats stats_;
    private int type_;
    private String id_ = "";
    private String ip_ = "";
    private String region_ = "";

    static {
        LivekitInternal$Node livekitInternal$Node = new LivekitInternal$Node();
        DEFAULT_INSTANCE = livekitInternal$Node;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$Node.class, livekitInternal$Node);
    }

    private LivekitInternal$Node() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIp() {
        this.ip_ = getDefaultInstance().getIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumCpus() {
        this.numCpus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStats() {
        this.stats_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static LivekitInternal$Node getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStats(LivekitInternal$NodeStats livekitInternal$NodeStats) {
        livekitInternal$NodeStats.getClass();
        LivekitInternal$NodeStats livekitInternal$NodeStats2 = this.stats_;
        if (livekitInternal$NodeStats2 != null && livekitInternal$NodeStats2 != LivekitInternal$NodeStats.getDefaultInstance()) {
            C4055o1 newBuilder = LivekitInternal$NodeStats.newBuilder(this.stats_);
            newBuilder.f(livekitInternal$NodeStats);
            this.stats_ = (LivekitInternal$NodeStats) newBuilder.c();
            return;
        }
        this.stats_ = livekitInternal$NodeStats;
    }

    public static C4045m1 newBuilder() {
        return (C4045m1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$Node parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$Node) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$Node parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.id_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIp(String str) {
        str.getClass();
        this.ip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.ip_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumCpus(int i10) {
        this.numCpus_ = i10;
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
    public void setState(EnumC4050n1 enumC4050n1) {
        this.state_ = enumC4050n1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i10) {
        this.state_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStats(LivekitInternal$NodeStats livekitInternal$NodeStats) {
        livekitInternal$NodeStats.getClass();
        this.stats_ = livekitInternal$NodeStats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC4060p1 enumC4060p1) {
        this.type_ = enumC4060p1.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\t\u0005\f\u0006\f\u0007\u0208", new Object[]{"id_", "ip_", "numCpus_", "stats_", "type_", "state_", "region_"});
            case 3:
                return new LivekitInternal$Node();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$Node.class) {
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

    public String getId() {
        return this.id_;
    }

    public AbstractC2534q getIdBytes() {
        return AbstractC2534q.y(this.id_);
    }

    public String getIp() {
        return this.ip_;
    }

    public AbstractC2534q getIpBytes() {
        return AbstractC2534q.y(this.ip_);
    }

    public int getNumCpus() {
        return this.numCpus_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC2534q getRegionBytes() {
        return AbstractC2534q.y(this.region_);
    }

    public EnumC4050n1 getState() {
        EnumC4050n1 enumC4050n1;
        int i10 = this.state_;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    enumC4050n1 = null;
                } else {
                    enumC4050n1 = EnumC4050n1.SHUTTING_DOWN;
                }
            } else {
                enumC4050n1 = EnumC4050n1.SERVING;
            }
        } else {
            enumC4050n1 = EnumC4050n1.STARTING_UP;
        }
        if (enumC4050n1 == null) {
            return EnumC4050n1.UNRECOGNIZED;
        }
        return enumC4050n1;
    }

    public int getStateValue() {
        return this.state_;
    }

    public LivekitInternal$NodeStats getStats() {
        LivekitInternal$NodeStats livekitInternal$NodeStats = this.stats_;
        if (livekitInternal$NodeStats == null) {
            return LivekitInternal$NodeStats.getDefaultInstance();
        }
        return livekitInternal$NodeStats;
    }

    public EnumC4060p1 getType() {
        EnumC4060p1 b10 = EnumC4060p1.b(this.type_);
        if (b10 == null) {
            return EnumC4060p1.UNRECOGNIZED;
        }
        return b10;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasStats() {
        if (this.stats_ != null) {
            return true;
        }
        return false;
    }

    public static C4045m1 newBuilder(LivekitInternal$Node livekitInternal$Node) {
        return (C4045m1) DEFAULT_INSTANCE.createBuilder(livekitInternal$Node);
    }

    public static LivekitInternal$Node parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$Node) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$Node parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$Node parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$Node parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$Node parseFrom(byte[] bArr) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$Node parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$Node parseFrom(InputStream inputStream) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$Node parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$Node parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$Node parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$Node) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
