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
import jh.C3983a;

/* loaded from: classes.dex */
public final class LivekitAgent$AgentInfo extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$AgentInfo DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private String id_ = "";
    private String name_ = "";
    private String version_ = "";

    static {
        LivekitAgent$AgentInfo livekitAgent$AgentInfo = new LivekitAgent$AgentInfo();
        DEFAULT_INSTANCE = livekitAgent$AgentInfo;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$AgentInfo.class, livekitAgent$AgentInfo);
    }

    private LivekitAgent$AgentInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    public static LivekitAgent$AgentInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C3983a newBuilder() {
        return (C3983a) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$AgentInfo parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AgentInfo parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.name_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208", new Object[]{"id_", "name_", "version_"});
            case 3:
                return new LivekitAgent$AgentInfo();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$AgentInfo.class) {
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

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public String getVersion() {
        return this.version_;
    }

    public AbstractC2534q getVersionBytes() {
        return AbstractC2534q.y(this.version_);
    }

    public static C3983a newBuilder(LivekitAgent$AgentInfo livekitAgent$AgentInfo) {
        return (C3983a) DEFAULT_INSTANCE.createBuilder(livekitAgent$AgentInfo);
    }

    public static LivekitAgent$AgentInfo parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$AgentInfo parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$AgentInfo parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$AgentInfo parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$AgentInfo parseFrom(byte[] bArr) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$AgentInfo parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$AgentInfo parseFrom(InputStream inputStream) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$AgentInfo parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$AgentInfo parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$AgentInfo parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$AgentInfo) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
