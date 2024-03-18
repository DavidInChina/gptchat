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
import jh.C4014g0;

/* loaded from: classes2.dex */
public final class LivekitEgress$ListEgressRequest extends AbstractC2497d0 implements N0 {
    public static final int ACTIVE_FIELD_NUMBER = 3;
    private static final LivekitEgress$ListEgressRequest DEFAULT_INSTANCE;
    public static final int EGRESS_ID_FIELD_NUMBER = 2;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_NAME_FIELD_NUMBER = 1;
    private boolean active_;
    private String roomName_ = "";
    private String egressId_ = "";

    static {
        LivekitEgress$ListEgressRequest livekitEgress$ListEgressRequest = new LivekitEgress$ListEgressRequest();
        DEFAULT_INSTANCE = livekitEgress$ListEgressRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitEgress$ListEgressRequest.class, livekitEgress$ListEgressRequest);
    }

    private LivekitEgress$ListEgressRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActive() {
        this.active_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEgressId() {
        this.egressId_ = getDefaultInstance().getEgressId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoomName() {
        this.roomName_ = getDefaultInstance().getRoomName();
    }

    public static LivekitEgress$ListEgressRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C4014g0 newBuilder() {
        return (C4014g0) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitEgress$ListEgressRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActive(boolean z10) {
        this.active_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressId(String str) {
        str.getClass();
        this.egressId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEgressIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.egressId_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0007", new Object[]{"roomName_", "egressId_", "active_"});
            case 3:
                return new LivekitEgress$ListEgressRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitEgress$ListEgressRequest.class) {
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

    public boolean getActive() {
        return this.active_;
    }

    public String getEgressId() {
        return this.egressId_;
    }

    public AbstractC2534q getEgressIdBytes() {
        return AbstractC2534q.y(this.egressId_);
    }

    public String getRoomName() {
        return this.roomName_;
    }

    public AbstractC2534q getRoomNameBytes() {
        return AbstractC2534q.y(this.roomName_);
    }

    public static C4014g0 newBuilder(LivekitEgress$ListEgressRequest livekitEgress$ListEgressRequest) {
        return (C4014g0) DEFAULT_INSTANCE.createBuilder(livekitEgress$ListEgressRequest);
    }

    public static LivekitEgress$ListEgressRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(byte[] bArr) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(InputStream inputStream) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitEgress$ListEgressRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitEgress$ListEgressRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
