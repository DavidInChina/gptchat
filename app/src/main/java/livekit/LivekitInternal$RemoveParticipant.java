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
import jh.C4074s1;

/* loaded from: classes2.dex */
public final class LivekitInternal$RemoveParticipant extends AbstractC2497d0 implements N0 {
    private static final LivekitInternal$RemoveParticipant DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 1;
    private String participantId_ = "";

    static {
        LivekitInternal$RemoveParticipant livekitInternal$RemoveParticipant = new LivekitInternal$RemoveParticipant();
        DEFAULT_INSTANCE = livekitInternal$RemoveParticipant;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$RemoveParticipant.class, livekitInternal$RemoveParticipant);
    }

    private LivekitInternal$RemoveParticipant() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    public static LivekitInternal$RemoveParticipant getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4074s1 newBuilder() {
        return (C4074s1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$RemoveParticipant parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantId(String str) {
        str.getClass();
        this.participantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantId_ = abstractC2534q.q0();
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"participantId_"});
            case 3:
                return new LivekitInternal$RemoveParticipant();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$RemoveParticipant.class) {
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

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC2534q getParticipantIdBytes() {
        return AbstractC2534q.y(this.participantId_);
    }

    public static C4074s1 newBuilder(LivekitInternal$RemoveParticipant livekitInternal$RemoveParticipant) {
        return (C4074s1) DEFAULT_INSTANCE.createBuilder(livekitInternal$RemoveParticipant);
    }

    public static LivekitInternal$RemoveParticipant parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(byte[] bArr) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(InputStream inputStream) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$RemoveParticipant parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$RemoveParticipant) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
