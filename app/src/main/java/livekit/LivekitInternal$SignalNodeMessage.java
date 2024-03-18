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
import jh.C4025i1;
import jh.C4037k3;
import jh.C4084u1;
import jh.EnumC4089v1;

/* loaded from: classes.dex */
public final class LivekitInternal$SignalNodeMessage extends AbstractC2497d0 implements N0 {
    public static final int CONNECTION_ID_FIELD_NUMBER = 1;
    private static final LivekitInternal$SignalNodeMessage DEFAULT_INSTANCE;
    public static final int END_SESSION_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int RESPONSE_FIELD_NUMBER = 2;
    private Object message_;
    private int messageCase_ = 0;
    private String connectionId_ = "";

    static {
        LivekitInternal$SignalNodeMessage livekitInternal$SignalNodeMessage = new LivekitInternal$SignalNodeMessage();
        DEFAULT_INSTANCE = livekitInternal$SignalNodeMessage;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$SignalNodeMessage.class, livekitInternal$SignalNodeMessage);
    }

    private LivekitInternal$SignalNodeMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionId() {
        this.connectionId_ = getDefaultInstance().getConnectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndSession() {
        if (this.messageCase_ == 3) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.messageCase_ = 0;
        this.message_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        if (this.messageCase_ == 2) {
            this.messageCase_ = 0;
            this.message_ = null;
        }
    }

    public static LivekitInternal$SignalNodeMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndSession(LivekitInternal$EndSession livekitInternal$EndSession) {
        livekitInternal$EndSession.getClass();
        if (this.messageCase_ == 3 && this.message_ != LivekitInternal$EndSession.getDefaultInstance()) {
            C4025i1 newBuilder = LivekitInternal$EndSession.newBuilder((LivekitInternal$EndSession) this.message_);
            newBuilder.f(livekitInternal$EndSession);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitInternal$EndSession;
        }
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(LivekitRtc$SignalResponse livekitRtc$SignalResponse) {
        livekitRtc$SignalResponse.getClass();
        if (this.messageCase_ == 2 && this.message_ != LivekitRtc$SignalResponse.getDefaultInstance()) {
            C4037k3 newBuilder = LivekitRtc$SignalResponse.newBuilder((LivekitRtc$SignalResponse) this.message_);
            newBuilder.f(livekitRtc$SignalResponse);
            this.message_ = newBuilder.c();
        } else {
            this.message_ = livekitRtc$SignalResponse;
        }
        this.messageCase_ = 2;
    }

    public static C4084u1 newBuilder() {
        return (C4084u1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$SignalNodeMessage parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionId(String str) {
        str.getClass();
        this.connectionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.connectionId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndSession(LivekitInternal$EndSession livekitInternal$EndSession) {
        livekitInternal$EndSession.getClass();
        this.message_ = livekitInternal$EndSession;
        this.messageCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(LivekitRtc$SignalResponse livekitRtc$SignalResponse) {
        livekitRtc$SignalResponse.getClass();
        this.message_ = livekitRtc$SignalResponse;
        this.messageCase_ = 2;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002<\u0000\u0003<\u0000", new Object[]{"message_", "messageCase_", "connectionId_", LivekitRtc$SignalResponse.class, LivekitInternal$EndSession.class});
            case 3:
                return new LivekitInternal$SignalNodeMessage();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$SignalNodeMessage.class) {
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

    public String getConnectionId() {
        return this.connectionId_;
    }

    public AbstractC2534q getConnectionIdBytes() {
        return AbstractC2534q.y(this.connectionId_);
    }

    public LivekitInternal$EndSession getEndSession() {
        if (this.messageCase_ == 3) {
            return (LivekitInternal$EndSession) this.message_;
        }
        return LivekitInternal$EndSession.getDefaultInstance();
    }

    public EnumC4089v1 getMessageCase() {
        int i10 = this.messageCase_;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return EnumC4089v1.f36637Z;
            }
            return EnumC4089v1.f36636Y;
        }
        return EnumC4089v1.f36638h0;
    }

    public LivekitRtc$SignalResponse getResponse() {
        if (this.messageCase_ == 2) {
            return (LivekitRtc$SignalResponse) this.message_;
        }
        return LivekitRtc$SignalResponse.getDefaultInstance();
    }

    public boolean hasEndSession() {
        if (this.messageCase_ == 3) {
            return true;
        }
        return false;
    }

    public boolean hasResponse() {
        if (this.messageCase_ == 2) {
            return true;
        }
        return false;
    }

    public static C4084u1 newBuilder(LivekitInternal$SignalNodeMessage livekitInternal$SignalNodeMessage) {
        return (C4084u1) DEFAULT_INSTANCE.createBuilder(livekitInternal$SignalNodeMessage);
    }

    public static LivekitInternal$SignalNodeMessage parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(byte[] bArr) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(InputStream inputStream) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$SignalNodeMessage parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$SignalNodeMessage) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
