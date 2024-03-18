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
import jh.C2;

/* loaded from: classes.dex */
public final class LivekitRoom$MuteRoomTrackRequest extends AbstractC2497d0 implements N0 {
    private static final LivekitRoom$MuteRoomTrackRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_FIELD_NUMBER = 2;
    public static final int MUTED_FIELD_NUMBER = 4;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int ROOM_FIELD_NUMBER = 1;
    public static final int TRACK_SID_FIELD_NUMBER = 3;
    private boolean muted_;
    private String room_ = "";
    private String identity_ = "";
    private String trackSid_ = "";

    static {
        LivekitRoom$MuteRoomTrackRequest livekitRoom$MuteRoomTrackRequest = new LivekitRoom$MuteRoomTrackRequest();
        DEFAULT_INSTANCE = livekitRoom$MuteRoomTrackRequest;
        AbstractC2497d0.registerDefaultInstance(LivekitRoom$MuteRoomTrackRequest.class, livekitRoom$MuteRoomTrackRequest);
    }

    private LivekitRoom$MuteRoomTrackRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentity() {
        this.identity_ = getDefaultInstance().getIdentity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMuted() {
        this.muted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = getDefaultInstance().getRoom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackSid() {
        this.trackSid_ = getDefaultInstance().getTrackSid();
    }

    public static LivekitRoom$MuteRoomTrackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C2 newBuilder() {
        return (C2) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitRoom$MuteRoomTrackRequest parseDelimitedFrom(InputStream inputStream) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(ByteBuffer byteBuffer) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setMuted(boolean z10) {
        this.muted_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(String str) {
        str.getClass();
        this.room_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoomBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.room_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSid(String str) {
        str.getClass();
        this.trackSid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackSidBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.trackSid_ = abstractC2534q.q0();
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0007", new Object[]{"room_", "identity_", "trackSid_", "muted_"});
            case 3:
                return new LivekitRoom$MuteRoomTrackRequest();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitRoom$MuteRoomTrackRequest.class) {
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

    public String getIdentity() {
        return this.identity_;
    }

    public AbstractC2534q getIdentityBytes() {
        return AbstractC2534q.y(this.identity_);
    }

    public boolean getMuted() {
        return this.muted_;
    }

    public String getRoom() {
        return this.room_;
    }

    public AbstractC2534q getRoomBytes() {
        return AbstractC2534q.y(this.room_);
    }

    public String getTrackSid() {
        return this.trackSid_;
    }

    public AbstractC2534q getTrackSidBytes() {
        return AbstractC2534q.y(this.trackSid_);
    }

    public static C2 newBuilder(LivekitRoom$MuteRoomTrackRequest livekitRoom$MuteRoomTrackRequest) {
        return (C2) DEFAULT_INSTANCE.createBuilder(livekitRoom$MuteRoomTrackRequest);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(byte[] bArr) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(byte[] bArr, J j6) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(InputStream inputStream) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(InputStream inputStream, J j6) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitRoom$MuteRoomTrackRequest parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitRoom$MuteRoomTrackRequest) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
