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
import jh.C4063q;
import jh.EnumC3986a2;

/* loaded from: classes.dex */
public final class LivekitAnalytics$AnalyticsClientMeta extends AbstractC2497d0 implements N0 {
    public static final int CLIENT_ADDR_FIELD_NUMBER = 3;
    public static final int CLIENT_CONNECT_TIME_FIELD_NUMBER = 4;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 5;
    private static final LivekitAnalytics$AnalyticsClientMeta DEFAULT_INSTANCE;
    public static final int NODE_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RECONNECT_REASON_FIELD_NUMBER = 6;
    public static final int REGION_FIELD_NUMBER = 1;
    private int clientConnectTime_;
    private int reconnectReason_;
    private String region_ = "";
    private String node_ = "";
    private String clientAddr_ = "";
    private String connectionType_ = "";

    static {
        LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta = new LivekitAnalytics$AnalyticsClientMeta();
        DEFAULT_INSTANCE = livekitAnalytics$AnalyticsClientMeta;
        AbstractC2497d0.registerDefaultInstance(LivekitAnalytics$AnalyticsClientMeta.class, livekitAnalytics$AnalyticsClientMeta);
    }

    private LivekitAnalytics$AnalyticsClientMeta() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAddr() {
        this.clientAddr_ = getDefaultInstance().getClientAddr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConnectTime() {
        this.clientConnectTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNode() {
        this.node_ = getDefaultInstance().getNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectReason() {
        this.reconnectReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    public static LivekitAnalytics$AnalyticsClientMeta getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4063q newBuilder() {
        return (C4063q) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAddr(String str) {
        str.getClass();
        this.clientAddr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAddrBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.clientAddr_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientConnectTime(int i10) {
        this.clientConnectTime_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.connectionType_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNode(String str) {
        str.getClass();
        this.node_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.node_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectReason(EnumC3986a2 enumC3986a2) {
        this.reconnectReason_ = enumC3986a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnectReasonValue(int i10) {
        this.reconnectReason_ = i10;
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

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u000b\u0005\u0208\u0006\f", new Object[]{"region_", "node_", "clientAddr_", "clientConnectTime_", "connectionType_", "reconnectReason_"});
            case 3:
                return new LivekitAnalytics$AnalyticsClientMeta();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAnalytics$AnalyticsClientMeta.class) {
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

    public String getClientAddr() {
        return this.clientAddr_;
    }

    public AbstractC2534q getClientAddrBytes() {
        return AbstractC2534q.y(this.clientAddr_);
    }

    public int getClientConnectTime() {
        return this.clientConnectTime_;
    }

    public String getConnectionType() {
        return this.connectionType_;
    }

    public AbstractC2534q getConnectionTypeBytes() {
        return AbstractC2534q.y(this.connectionType_);
    }

    public String getNode() {
        return this.node_;
    }

    public AbstractC2534q getNodeBytes() {
        return AbstractC2534q.y(this.node_);
    }

    public EnumC3986a2 getReconnectReason() {
        EnumC3986a2 b10 = EnumC3986a2.b(this.reconnectReason_);
        if (b10 == null) {
            return EnumC3986a2.UNRECOGNIZED;
        }
        return b10;
    }

    public int getReconnectReasonValue() {
        return this.reconnectReason_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC2534q getRegionBytes() {
        return AbstractC2534q.y(this.region_);
    }

    public static C4063q newBuilder(LivekitAnalytics$AnalyticsClientMeta livekitAnalytics$AnalyticsClientMeta) {
        return (C4063q) DEFAULT_INSTANCE.createBuilder(livekitAnalytics$AnalyticsClientMeta);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(byte[] bArr) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(byte[] bArr, J j6) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(InputStream inputStream) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(InputStream inputStream, J j6) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAnalytics$AnalyticsClientMeta parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAnalytics$AnalyticsClientMeta) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
