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
import jh.B1;
import jh.C4094w1;
import jh.EnumC3986a2;

/* loaded from: classes.dex */
public final class LivekitInternal$StartSession extends AbstractC2497d0 implements N0 {
    public static final int ADAPTIVE_STREAM_FIELD_NUMBER = 15;
    public static final int AUTO_SUBSCRIBE_FIELD_NUMBER = 9;
    public static final int CLIENT_FIELD_NUMBER = 11;
    public static final int CONNECTION_ID_FIELD_NUMBER = 3;
    private static final LivekitInternal$StartSession DEFAULT_INSTANCE;
    public static final int GRANTS_JSON_FIELD_NUMBER = 14;
    public static final int HIDDEN_FIELD_NUMBER = 10;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 13;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_ID_FIELD_NUMBER = 16;
    public static final int RECONNECT_FIELD_NUMBER = 4;
    public static final int RECONNECT_REASON_FIELD_NUMBER = 17;
    public static final int RECORDER_FIELD_NUMBER = 12;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    public static final int SUBSCRIBER_ALLOW_PAUSE_FIELD_NUMBER = 18;
    private boolean adaptiveStream_;
    private boolean autoSubscribe_;
    private int bitField0_;
    private LivekitModels$ClientInfo client_;
    private boolean hidden_;
    private int reconnectReason_;
    private boolean reconnect_;
    private boolean recorder_;
    private boolean subscriberAllowPause_;
    private String roomName_ = "";
    private String identity_ = "";
    private String connectionId_ = "";
    private String name_ = "";
    private String grantsJson_ = "";
    private String participantId_ = "";

    static {
        LivekitInternal$StartSession livekitInternal$StartSession = new LivekitInternal$StartSession();
        DEFAULT_INSTANCE = livekitInternal$StartSession;
        AbstractC2497d0.registerDefaultInstance(LivekitInternal$StartSession.class, livekitInternal$StartSession);
    }

    private LivekitInternal$StartSession() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdaptiveStream() {
        this.adaptiveStream_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSubscribe() {
        this.autoSubscribe_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClient() {
        this.client_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionId() {
        this.connectionId_ = getDefaultInstance().getConnectionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGrantsJson() {
        this.grantsJson_ = getDefaultInstance().getGrantsJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHidden() {
        this.hidden_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipantId() {
        this.participantId_ = getDefaultInstance().getParticipantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnect() {
        this.reconnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReconnectReason() {
        this.reconnectReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecorder() {
        this.recorder_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriberAllowPause() {
        this.bitField0_ &= -2;
        this.subscriberAllowPause_ = false;
    }

    public static LivekitInternal$StartSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClient(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        LivekitModels$ClientInfo livekitModels$ClientInfo2 = this.client_;
        if (livekitModels$ClientInfo2 != null && livekitModels$ClientInfo2 != LivekitModels$ClientInfo.getDefaultInstance()) {
            B1 newBuilder = LivekitModels$ClientInfo.newBuilder(this.client_);
            newBuilder.f(livekitModels$ClientInfo);
            this.client_ = (LivekitModels$ClientInfo) newBuilder.c();
            return;
        }
        this.client_ = livekitModels$ClientInfo;
    }

    public static C4094w1 newBuilder() {
        return (C4094w1) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitInternal$StartSession parseDelimitedFrom(InputStream inputStream) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$StartSession parseFrom(ByteBuffer byteBuffer) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdaptiveStream(boolean z10) {
        this.adaptiveStream_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSubscribe(boolean z10) {
        this.autoSubscribe_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClient(LivekitModels$ClientInfo livekitModels$ClientInfo) {
        livekitModels$ClientInfo.getClass();
        this.client_ = livekitModels$ClientInfo;
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
    public void setGrantsJson(String str) {
        str.getClass();
        this.grantsJson_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGrantsJsonBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.grantsJson_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHidden(boolean z10) {
        this.hidden_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentity(String str) {
        str.getClass();
        this.identity_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentityBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.identity_ = abstractC2534q.q0();
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
    public void setParticipantId(String str) {
        str.getClass();
        this.participantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipantIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.participantId_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReconnect(boolean z10) {
        this.reconnect_ = z10;
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
    public void setRecorder(boolean z10) {
        this.recorder_ = z10;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriberAllowPause(boolean z10) {
        this.bitField0_ |= 1;
        this.subscriberAllowPause_ = z10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u0012\u000e\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0007\t\u0007\n\u0007\u000b\t\f\u0007\r\u0208\u000e\u0208\u000f\u0007\u0010\u0208\u0011\f\u0012\u1007\u0000", new Object[]{"bitField0_", "roomName_", "identity_", "connectionId_", "reconnect_", "autoSubscribe_", "hidden_", "client_", "recorder_", "name_", "grantsJson_", "adaptiveStream_", "participantId_", "reconnectReason_", "subscriberAllowPause_"});
            case 3:
                return new LivekitInternal$StartSession();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitInternal$StartSession.class) {
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

    public boolean getAdaptiveStream() {
        return this.adaptiveStream_;
    }

    public boolean getAutoSubscribe() {
        return this.autoSubscribe_;
    }

    public LivekitModels$ClientInfo getClient() {
        LivekitModels$ClientInfo livekitModels$ClientInfo = this.client_;
        if (livekitModels$ClientInfo == null) {
            return LivekitModels$ClientInfo.getDefaultInstance();
        }
        return livekitModels$ClientInfo;
    }

    public String getConnectionId() {
        return this.connectionId_;
    }

    public AbstractC2534q getConnectionIdBytes() {
        return AbstractC2534q.y(this.connectionId_);
    }

    public String getGrantsJson() {
        return this.grantsJson_;
    }

    public AbstractC2534q getGrantsJsonBytes() {
        return AbstractC2534q.y(this.grantsJson_);
    }

    public boolean getHidden() {
        return this.hidden_;
    }

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC2534q getIdentityBytes() {
        return AbstractC2534q.y(this.identity_);
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC2534q getNameBytes() {
        return AbstractC2534q.y(this.name_);
    }

    public String getParticipantId() {
        return this.participantId_;
    }

    public AbstractC2534q getParticipantIdBytes() {
        return AbstractC2534q.y(this.participantId_);
    }

    public boolean getReconnect() {
        return this.reconnect_;
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

    public boolean getRecorder() {
        return this.recorder_;
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public boolean getSubscriberAllowPause() {
        return this.subscriberAllowPause_;
    }

    public boolean hasClient() {
        if (this.client_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasSubscriberAllowPause() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public static C4094w1 newBuilder(LivekitInternal$StartSession livekitInternal$StartSession) {
        return (C4094w1) DEFAULT_INSTANCE.createBuilder(livekitInternal$StartSession);
    }

    public static LivekitInternal$StartSession parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$StartSession parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitInternal$StartSession parseFrom(byte[] bArr) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitInternal$StartSession parseFrom(byte[] bArr, J j6) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitInternal$StartSession parseFrom(InputStream inputStream) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitInternal$StartSession parseFrom(InputStream inputStream, J j6) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitInternal$StartSession parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitInternal$StartSession) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
