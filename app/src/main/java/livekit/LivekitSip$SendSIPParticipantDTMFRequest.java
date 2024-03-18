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
import jh.m4;

/* loaded from: classes.dex */
public final class LivekitSip$SendSIPParticipantDTMFRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitSip$SendSIPParticipantDTMFRequest DEFAULT_INSTANCE;
    public static final int DIGITS_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int SIP_PARTICIPANT_ID_FIELD_NUMBER = 1;
    private String sipParticipantId_ = "";
    private String digits_ = "";

    static {
        LivekitSip$SendSIPParticipantDTMFRequest livekitSip$SendSIPParticipantDTMFRequest = new LivekitSip$SendSIPParticipantDTMFRequest();
        DEFAULT_INSTANCE = livekitSip$SendSIPParticipantDTMFRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$SendSIPParticipantDTMFRequest.class, livekitSip$SendSIPParticipantDTMFRequest);
    }

    private LivekitSip$SendSIPParticipantDTMFRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDigits() {
        this.digits_ = getDefaultInstance().getDigits();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSipParticipantId() {
        this.sipParticipantId_ = getDefaultInstance().getSipParticipantId();
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static m4 newBuilder() {
        return (m4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigits(String str) {
        str.getClass();
        this.digits_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDigitsBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.digits_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipParticipantId(String str) {
        str.getClass();
        this.sipParticipantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSipParticipantIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.sipParticipantId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"sipParticipantId_", "digits_"});
            case 3:
                return new LivekitSip$SendSIPParticipantDTMFRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$SendSIPParticipantDTMFRequest.class) {
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

    public String getDigits() {
        return this.digits_;
    }

    public AbstractC2534q getDigitsBytes() {
        return AbstractC2534q.y(this.digits_);
    }

    public String getSipParticipantId() {
        return this.sipParticipantId_;
    }

    public AbstractC2534q getSipParticipantIdBytes() {
        return AbstractC2534q.y(this.sipParticipantId_);
    }

    public static m4 newBuilder(LivekitSip$SendSIPParticipantDTMFRequest livekitSip$SendSIPParticipantDTMFRequest) {
        return (m4) DEFAULT_INSTANCE.createBuilder(livekitSip$SendSIPParticipantDTMFRequest);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(byte[] bArr) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(InputStream inputStream) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$SendSIPParticipantDTMFRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$SendSIPParticipantDTMFRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
