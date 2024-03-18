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
import jh.C3997c3;
import jh.V2;

/* loaded from: classes.dex */
public final class LivekitRtc$ReconnectResponse extends AbstractC2497d0 implements N0 {
    public static final int CLIENT_CONFIGURATION_FIELD_NUMBER = 2;
    private static final LivekitRtc$ReconnectResponse DEFAULT_INSTANCE;
    public static final int ICE_SERVERS_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER;
    private LivekitModels$ClientConfiguration clientConfiguration_;
    private AbstractC2535q0 iceServers_ = AbstractC2497d0.emptyProtobufList();

    static {
        LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse = new LivekitRtc$ReconnectResponse();
        DEFAULT_INSTANCE = livekitRtc$ReconnectResponse;
        AbstractC2497d0.registerDefaultInstance(LivekitRtc$ReconnectResponse.class, livekitRtc$ReconnectResponse);
    }

    private LivekitRtc$ReconnectResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIceServers(Iterable<? extends LivekitRtc$ICEServer> iterable) {
        ensureIceServersIsMutable();
        AbstractC2493c.addAll((Iterable) iterable, (List) this.iceServers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(livekitRtc$ICEServer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientConfiguration() {
        this.clientConfiguration_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIceServers() {
        this.iceServers_ = AbstractC2497d0.emptyProtobufList();
    }

    private void ensureIceServersIsMutable() {
        AbstractC2535q0 abstractC2535q0 = this.iceServers_;
        if (!((AbstractC2496d) abstractC2535q0).f27534Y) {
            this.iceServers_ = AbstractC2497d0.mutableCopy(abstractC2535q0);
        }
    }

    public static LivekitRtc$ReconnectResponse getDefaultInstance() {
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

    public static C3997c3 newBuilder() {
        return (C3997c3) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRtc$ReconnectResponse parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r2v15, types: [com.google.protobuf.a1, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC2497d0
    public final Object dynamicMethod(EnumC2494c0 enumC2494c0, Object obj, Object obj2) {
        switch (enumC2494c0.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"iceServers_", LivekitRtc$ICEServer.class, "clientConfiguration_"});
            case 3:
                return new LivekitRtc$ReconnectResponse();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRtc$ReconnectResponse.class) {
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

    public boolean hasClientConfiguration() {
        if (this.clientConfiguration_ != null) {
            return true;
        }
        return false;
    }

    public static C3997c3 newBuilder(LivekitRtc$ReconnectResponse livekitRtc$ReconnectResponse) {
        return (C3997c3) DEFAULT_INSTANCE.createBuilder(livekitRtc$ReconnectResponse);
    }

    public static LivekitRtc$ReconnectResponse parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIceServers(int i10, LivekitRtc$ICEServer livekitRtc$ICEServer) {
        livekitRtc$ICEServer.getClass();
        ensureIceServersIsMutable();
        this.iceServers_.add(i10, livekitRtc$ICEServer);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(byte[] bArr) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(byte[] bArr, J j6) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(InputStream inputStream) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(InputStream inputStream, J j6) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRtc$ReconnectResponse parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRtc$ReconnectResponse) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
