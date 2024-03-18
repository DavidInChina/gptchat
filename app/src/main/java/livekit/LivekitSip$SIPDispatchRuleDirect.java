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
import jh.d4;

/* loaded from: classes.dex */
public final class LivekitSip$SIPDispatchRuleDirect extends AbstractC2497d0 implements N0 {
    private static final LivekitSip$SIPDispatchRuleDirect DEFAULT_INSTANCE;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PIN_FIELD_NUMBER = 2;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    private String roomName_ = "";
    private String pin_ = "";

    static {
        LivekitSip$SIPDispatchRuleDirect livekitSip$SIPDispatchRuleDirect = new LivekitSip$SIPDispatchRuleDirect();
        DEFAULT_INSTANCE = livekitSip$SIPDispatchRuleDirect;
        AbstractC2497d0.registerDefaultInstance(LivekitSip$SIPDispatchRuleDirect.class, livekitSip$SIPDispatchRuleDirect);
    }

    private LivekitSip$SIPDispatchRuleDirect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPin() {
        this.pin_ = getDefaultInstance().getPin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    public static LivekitSip$SIPDispatchRuleDirect getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d4 newBuilder() {
        return (d4) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPDispatchRuleDirect parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPin(String str) {
        str.getClass();
        this.pin_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.pin_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomName(String str) {
        str.getClass();
        this.roomName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomNameBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.roomName_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", new Object[]{"roomName_", "pin_"});
            case 3:
                return new LivekitSip$SIPDispatchRuleDirect();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitSip$SIPDispatchRuleDirect.class) {
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

    public String getPin() {
        return this.pin_;
    }

    public AbstractC2534q getPinBytes() {
        return AbstractC2534q.y(this.pin_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public static d4 newBuilder(LivekitSip$SIPDispatchRuleDirect livekitSip$SIPDispatchRuleDirect) {
        return (d4) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPDispatchRuleDirect);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(byte[] bArr) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(byte[] bArr, J j6) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(InputStream inputStream, J j6) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitSip$SIPDispatchRuleDirect parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitSip$SIPDispatchRuleDirect) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
