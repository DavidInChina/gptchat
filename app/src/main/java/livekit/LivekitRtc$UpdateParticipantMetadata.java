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
import jh.L3;

/* loaded from: classes2.dex */
public final class LivekitRtc$UpdateParticipantMetadata extends AbstractC2497d0 implements N0 {
    private static final LivekitRtc$UpdateParticipantMetadata DEFAULT_INSTANCE;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER;
    private String metadata_ = "";
    private String name_ = "";

    static {
        LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata = new LivekitRtc$UpdateParticipantMetadata();
        DEFAULT_INSTANCE = livekitRtc$UpdateParticipantMetadata;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$UpdateParticipantMetadata.class, livekitRtc$UpdateParticipantMetadata);
    }

    private LivekitRtc$UpdateParticipantMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = getDefaultInstance().getMetadata();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static LivekitRtc$UpdateParticipantMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static L3 newBuilder() {
        return (L3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$UpdateParticipantMetadata parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(String str) {
        str.getClass();
        this.metadata_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadataBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.metadata_ = abstractC2534q.q0();
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

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"metadata_", "name_"});
            case 3:
                return new LivekitRtc$UpdateParticipantMetadata();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$UpdateParticipantMetadata.class) {
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

    public String getMetadata() {
        return this.metadata_;
    }

    public AbstractC2534q getMetadataBytes() {
        return AbstractC2534q.y(this.metadata_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public static L3 newBuilder(LivekitRtc$UpdateParticipantMetadata livekitRtc$UpdateParticipantMetadata) {
        return (L3) DEFAULT_INSTANCE.createBuilder(livekitRtc$UpdateParticipantMetadata);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(byte[] bArr) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(InputStream inputStream) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$UpdateParticipantMetadata parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$UpdateParticipantMetadata) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
