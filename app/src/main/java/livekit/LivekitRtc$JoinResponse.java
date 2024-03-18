package livekit;

import com.google.protobuf.AbstractC2489a1;
import com.google.protobuf.AbstractC2493c;
import com.google.protobuf.AbstractC2496d;
import com.google.protobuf.AbstractC2497d0;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2535q0;
import com.google.protobuf.AbstractC2543v;
import com.google.protobuf.EnumC2494c0;
import com.google.protobuf.J;
import com.google.protobuf.N0;
import com.google.protobuf.X;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import jh.A1;
import jh.C3991b2;
import jh.C4001d2;
import jh.Q1;
import jh.S1;
import jh.V2;
import jh.W2;

/* loaded from: classes2.dex */
public final class LivekitRtc$JoinResponse extends AbstractC2497d0 implements N0 {
    public static final int ALTERNATIVE_URL_FIELD_NUMBER = 7;
    public static final int CLIENT_CONFIGURATION_FIELD_NUMBER = 8;
    private static final LivekitRtc$JoinResponse DEFAULT_INSTANCE;
    public static final int ICE_SERVERS_FIELD_NUMBER = 5;
    public static final int OTHER_PARTICIPANTS_FIELD_NUMBER = 3;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 2;
    public static final int PING_INTERVAL_FIELD_NUMBER = 11;
    public static final int PING_TIMEOUT_FIELD_NUMBER = 10;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int SERVER_INFO_FIELD_NUMBER = 12;
    public static final int SERVER_REGION_FIELD_NUMBER = 9;
    public static final int SERVER_VERSION_FIELD_NUMBER = 4;
    public static final int SIF_TRAILER_FIELD_NUMBER = 13;
    public static final int SUBSCRIBER_PRIMARY_FIELD_NUMBER = 6;
    private LivekitModels$ClientConfiguration clientConfiguration_;
    private LivekitModels$ParticipantInfo participant_;
    private int pingInterval_;
    private int pingTimeout_;
    private LivekitModels$Room room_;
    private LivekitModels$ServerInfo serverInfo_;
    private boolean subscriberPrimary_;
    private AbstractC2535q0 otherParticipants_ = AbstractC2497d0.emptyProtobufList();
    private String serverVersion_ = "";
    private AbstractC2535q0 iceServers_ = AbstractC2497d0.emptyProtobufList();
    private String alternativeUrl_ = "";
    private String serverRegion_ = "";
    private AbstractC2534q sifTrailer_ = AbstractC2534q.f27581Z;

    static {
        LivekitRtc$JoinResponse livekitRtc$JoinResponse = new LivekitRtc$JoinResponse();
        DEFAULT_INSTANCE = livekitRtc$JoinResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$JoinResponse.class, livekitRtc$JoinResponse);
    }

    private LivekitRtc$JoinResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIceServers(Iterable<? extends LivekitRtc$ICEServer> iterable) {
        ensureIceServersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.iceServers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOtherParticipants(Iterable<? extends LivekitModels$ParticipantInfo> iterable) {
        ensureOtherParticipantsIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.otherParticipants_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOtherParticipants(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.add(livekitModels$ParticipantInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeUrl() {
        this.alternativeUrl_ = getDefaultInstance().getAlternativeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConfiguration() {
        this.clientConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIceServers() {
        this.iceServers_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherParticipants() {
        this.otherParticipants_ = AbstractC2497d0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingInterval() {
        this.pingInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPingTimeout() {
        this.pingTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerInfo() {
        this.serverInfo_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerRegion() {
        this.serverRegion_ = getDefaultInstance().getServerRegion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerVersion() {
        this.serverVersion_ = getDefaultInstance().getServerVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSifTrailer() {
        this.sifTrailer_ = getDefaultInstance().getSifTrailer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubscriberPrimary() {
        this.subscriberPrimary_ = false;
    }

    private void ensureIceServersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.iceServers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.iceServers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    private void ensureOtherParticipantsIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.otherParticipants_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.otherParticipants_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$JoinResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientConfiguration(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        livekitModels$ClientConfiguration.getClass();
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration2 = this.clientConfiguration_;
        if (livekitModels$ClientConfiguration2 != null && livekitModels$ClientConfiguration2 != LivekitModels$ClientConfiguration.getDefaultInstance()) {
            A1 newBuilder = LivekitModels$ClientConfiguration.newBuilder(this.clientConfiguration_);
            newBuilder.f(livekitModels$ClientConfiguration);
            this.clientConfiguration_ = (LivekitModels$ClientConfiguration) newBuilder.c();
            return;
        }
        this.clientConfiguration_ = livekitModels$ClientConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.participant_;
        if (livekitModels$ParticipantInfo2 != null && livekitModels$ParticipantInfo2 != LivekitModels$ParticipantInfo.getDefaultInstance()) {
            Q1 newBuilder = LivekitModels$ParticipantInfo.newBuilder(this.participant_);
            newBuilder.f(livekitModels$ParticipantInfo);
            this.participant_ = (LivekitModels$ParticipantInfo) newBuilder.c();
            return;
        }
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        LivekitModels$Room livekitModels$Room2 = this.room_;
        if (livekitModels$Room2 != null && livekitModels$Room2 != LivekitModels$Room.getDefaultInstance()) {
            C3991b2 newBuilder = LivekitModels$Room.newBuilder(this.room_);
            newBuilder.f(livekitModels$Room);
            this.room_ = (LivekitModels$Room) newBuilder.c();
            return;
        }
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServerInfo(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        livekitModels$ServerInfo.getClass();
        LivekitModels$ServerInfo livekitModels$ServerInfo2 = this.serverInfo_;
        if (livekitModels$ServerInfo2 != null && livekitModels$ServerInfo2 != LivekitModels$ServerInfo.getDefaultInstance()) {
            C4001d2 newBuilder = LivekitModels$ServerInfo.newBuilder(this.serverInfo_);
            newBuilder.f(livekitModels$ServerInfo);
            this.serverInfo_ = (LivekitModels$ServerInfo) newBuilder.c();
            return;
        }
        this.serverInfo_ = livekitModels$ServerInfo;
    }

    public static W2 newBuilder() {
        return (W2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$JoinResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$JoinResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeIceServers(int i10) {
        ensureIceServersIsMutable();
        this.iceServers_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOtherParticipants(int i10) {
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeUrl(String str) {
        str.getClass();
        this.alternativeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeUrlBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.alternativeUrl_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientConfiguration(LivekitModels$ClientConfiguration livekitModels$ClientConfiguration) {
        livekitModels$ClientConfiguration.getClass();
        this.clientConfiguration_ = livekitModels$ClientConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.set(i10, livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.set(i10, livekitModels$ParticipantInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingInterval(int i10) {
        this.pingInterval_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPingTimeout(int i10) {
        this.pingTimeout_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerInfo(LivekitModels$ServerInfo livekitModels$ServerInfo) {
        livekitModels$ServerInfo.getClass();
        this.serverInfo_ = livekitModels$ServerInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRegion(String str) {
        str.getClass();
        this.serverRegion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerRegionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.serverRegion_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersion(String str) {
        str.getClass();
        this.serverVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerVersionBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.serverVersion_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSifTrailer(AbstractC2534q abstractC2534q) {
        abstractC2534q.getClass();
        this.sifTrailer_ = abstractC2534q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubscriberPrimary(boolean z10) {
        this.subscriberPrimary_ = z10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0002\u0000\u0001\t\u0002\t\u0003\u001b\u0004\u0208\u0005\u001b\u0006\u0007\u0007\u0208\b\t\t\u0208\n\u0004\u000b\u0004\f\t\r\n", new Object[]{"room_", "participant_", "otherParticipants_", LivekitModels$ParticipantInfo.class, "serverVersion_", "iceServers_", LivekitRtc$ICEServer.class, "subscriberPrimary_", "alternativeUrl_", "clientConfiguration_", "serverRegion_", "pingTimeout_", "pingInterval_", "serverInfo_", "sifTrailer_"});
            case 3:
                return new LivekitRtc$JoinResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$JoinResponse.class) {
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

    public String getAlternativeUrl() {
        return this.alternativeUrl_;
    }

    public AbstractC2534q getAlternativeUrlBytes() {
        return AbstractC2534q.y(this.alternativeUrl_);
    }

    public LivekitModels$ClientConfiguration getClientConfiguration() {
        LivekitModels$ClientConfiguration livekitModels$ClientConfiguration = this.clientConfiguration_;
        if (livekitModels$ClientConfiguration == null) {
            return LivekitModels$ClientConfiguration.getDefaultInstance();
        }
        return livekitModels$ClientConfiguration;
    }

    public LivekitRtc$ICEServer getIceServers(int i10) {
        return (LivekitRtc$ICEServer) this.iceServers_.get(i10);
    }

    public int getIceServersCount() {
        return this.iceServers_.size();
    }

    public List<LivekitRtc$ICEServer> getIceServersList() {
        return this.iceServers_;
    }

    public V2 getIceServersOrBuilder(int i10) {
        return (V2) this.iceServers_.get(i10);
    }

    public List<? extends V2> getIceServersOrBuilderList() {
        return this.iceServers_;
    }

    public LivekitModels$ParticipantInfo getOtherParticipants(int i10) {
        return (LivekitModels$ParticipantInfo) this.otherParticipants_.get(i10);
    }

    public int getOtherParticipantsCount() {
        return this.otherParticipants_.size();
    }

    public List<LivekitModels$ParticipantInfo> getOtherParticipantsList() {
        return this.otherParticipants_;
    }

    public S1 getOtherParticipantsOrBuilder(int i10) {
        return (S1) this.otherParticipants_.get(i10);
    }

    public List<? extends S1> getOtherParticipantsOrBuilderList() {
        return this.otherParticipants_;
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        if (livekitModels$ParticipantInfo == null) {
            return LivekitModels$ParticipantInfo.getDefaultInstance();
        }
        return livekitModels$ParticipantInfo;
    }

    public int getPingInterval() {
        return this.pingInterval_;
    }

    public int getPingTimeout() {
        return this.pingTimeout_;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        if (livekitModels$Room == null) {
            return LivekitModels$Room.getDefaultInstance();
        }
        return livekitModels$Room;
    }

    public LivekitModels$ServerInfo getServerInfo() {
        LivekitModels$ServerInfo livekitModels$ServerInfo = this.serverInfo_;
        if (livekitModels$ServerInfo == null) {
            return LivekitModels$ServerInfo.getDefaultInstance();
        }
        return livekitModels$ServerInfo;
    }

    public String getServerRegion() {
        return this.serverRegion_;
    }

    public AbstractC2534q getServerRegionBytes() {
        return AbstractC2534q.y(this.serverRegion_);
    }

    public String getServerVersion() {
        return this.serverVersion_;
    }

    public AbstractC2534q getServerVersionBytes() {
        return AbstractC2534q.y(this.serverVersion_);
    }

    public AbstractC2534q getSifTrailer() {
        return this.sifTrailer_;
    }

    public boolean getSubscriberPrimary() {
        return this.subscriberPrimary_;
    }

    public boolean hasClientConfiguration() {
        if (this.clientConfiguration_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasParticipant() {
        if (this.participant_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasRoom() {
        if (this.room_ != null) {
            return true;
        }
        return false;
    }

    public boolean hasServerInfo() {
        if (this.serverInfo_ != null) {
            return true;
        }
        return false;
    }

    public static W2 newBuilder(LivekitRtc$JoinResponse livekitRtc$JoinResponse) {
        return (W2) DEFAULT_INSTANCE.createBuilder(livekitRtc$JoinResponse);
    }

    public static LivekitRtc$JoinResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$JoinResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(i10, livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOtherParticipants(int i10, LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        ensureOtherParticipantsIsMutable();
        this.otherParticipants_.add(i10, livekitModels$ParticipantInfo);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$JoinResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$JoinResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$JoinResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$JoinResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$JoinResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$JoinResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
