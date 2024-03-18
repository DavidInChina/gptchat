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
import jh.C4001d2;
import jh.EnumC4006e2;

/* loaded from: classes.dex */
public final class LivekitModels$ServerInfo extends AbstractC2497d0 implements N0 {
    public static final int DEBUG_INFO_FIELD_NUMBER = 6;
    private static final LivekitModels$ServerInfo DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 1;
    public static final int NODE_ID_FIELD_NUMBER = 5;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PROTOCOL_FIELD_NUMBER = 3;
    public static final int REGION_FIELD_NUMBER = 4;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int edition_;
    private int protocol_;
    private String version_ = "";
    private String region_ = "";
    private String nodeId_ = "";
    private String debugInfo_ = "";

    static {
        LivekitModels$ServerInfo livekitModels$ServerInfo = new LivekitModels$ServerInfo();
        DEFAULT_INSTANCE = livekitModels$ServerInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitModels$ServerInfo.class, livekitModels$ServerInfo);
    }

    private LivekitModels$ServerInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugInfo() {
        this.debugInfo_ = getDefaultInstance().getDebugInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.edition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = getDefaultInstance().getNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocol() {
        this.protocol_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegion() {
        this.region_ = getDefaultInstance().getRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static LivekitModels$ServerInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4001d2 newBuilder() {
        return (C4001d2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitModels$ServerInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ServerInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugInfo(String str) {
        str.getClass();
        this.debugInfo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugInfoBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.debugInfo_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(EnumC4006e2 enumC4006e2) {
        this.edition_ = enumC4006e2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionValue(int i10) {
        this.edition_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(String str) {
        str.getClass();
        this.nodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.nodeId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocol(int i10) {
        this.protocol_ = i10;
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
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.version_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0208\u0006\u0208", new Object[]{"edition_", "version_", "protocol_", "region_", "nodeId_", "debugInfo_"});
            case 3:
                return new LivekitModels$ServerInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitModels$ServerInfo.class) {
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

    public String getDebugInfo() {
        return this.debugInfo_;
    }

    public AbstractC2534q getDebugInfoBytes() {
        return AbstractC2534q.y(this.debugInfo_);
    }

    public EnumC4006e2 getEdition() {
        EnumC4006e2 enumC4006e2;
        int i10 = this.edition_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4006e2 = null;
            } else {
                enumC4006e2 = EnumC4006e2.Cloud;
            }
        } else {
            enumC4006e2 = EnumC4006e2.Standard;
        }
        if (enumC4006e2 == null) {
            return EnumC4006e2.UNRECOGNIZED;
        }
        return enumC4006e2;
    }

    public int getEditionValue() {
        return this.edition_;
    }

    public String getNodeId() {
        return this.nodeId_;
    }

    public AbstractC2534q getNodeIdBytes() {
        return AbstractC2534q.y(this.nodeId_);
    }

    public int getProtocol() {
        return this.protocol_;
    }

    public String getRegion() {
        return this.region_;
    }

    public AbstractC2534q getRegionBytes() {
        return AbstractC2534q.y(this.region_);
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC2534q getVersionBytes() {
        return AbstractC2534q.y(this.version_);
    }

    public static C4001d2 newBuilder(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        return (C4001d2) DEFAULT_INSTANCE.createBuilder(livekitModels$ServerInfo);
    }

    public static LivekitModels$ServerInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ServerInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitModels$ServerInfo parseFrom(byte[] bArr) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitModels$ServerInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitModels$ServerInfo parseFrom(InputStream inputStream) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitModels$ServerInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitModels$ServerInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitModels$ServerInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
