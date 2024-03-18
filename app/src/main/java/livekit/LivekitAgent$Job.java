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
import jh.C3991b2;
import jh.C3998d;
import jh.EnumC4018h;
import jh.Q1;

/* loaded from: classes2.dex */
public final class LivekitAgent$Job extends AbstractC2497d0 implements N0 {
    private static final LivekitAgent$Job DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile AbstractC2489a1 PARSER = null;
    public static final int PARTICIPANT_FIELD_NUMBER = 4;
    public static final int ROOM_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String id_ = "";
    private LivekitModels$ParticipantInfo participant_;
    private LivekitModels$Room room_;
    private int type_;

    static {
        LivekitAgent$Job livekitAgent$Job = new LivekitAgent$Job();
        DEFAULT_INSTANCE = livekitAgent$Job;
        AbstractC2497d0.registerDefaultInstance(LivekitAgent$Job.class, livekitAgent$Job);
    }

    private LivekitAgent$Job() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipant() {
        this.participant_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoom() {
        this.room_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static LivekitAgent$Job getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo2 = this.participant_;
        if (livekitModels$ParticipantInfo2 != null && livekitModels$ParticipantInfo2 != LivekitModels$ParticipantInfo.getDefaultInstance()) {
            Q1 newBuilder = LivekitModels$ParticipantInfo.newBuilder(this.participant_);
            newBuilder.f(livekitModels$ParticipantInfo);
            this.participant_ = (LivekitModels$ParticipantInfo) newBuilder.c();
        } else {
            this.participant_ = livekitModels$ParticipantInfo;
        }
        this.bitField0_ |= 1;
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

    public static C3998d newBuilder() {
        return (C3998d) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitAgent$Job parseDelimitedFrom(InputStream inputStream) {
        return (LivekitAgent$Job) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$Job parseFrom(ByteBuffer byteBuffer) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AbstractC2489a1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC2534q abstractC2534q) {
        AbstractC2493c.checkByteStringIsUtf8(abstractC2534q);
        this.id_ = abstractC2534q.q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipant(LivekitModels$ParticipantInfo livekitModels$ParticipantInfo) {
        livekitModels$ParticipantInfo.getClass();
        this.participant_ = livekitModels$ParticipantInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoom(LivekitModels$Room livekitModels$Room) {
        livekitModels$Room.getClass();
        this.room_ = livekitModels$Room;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(EnumC4018h enumC4018h) {
        this.type_ = enumC4018h.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i10) {
        this.type_ = i10;
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
                return AbstractC2497d0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\t\u0004\u1009\u0000", new Object[]{"bitField0_", "id_", "type_", "room_", "participant_"});
            case 3:
                return new LivekitAgent$Job();
            case 4:
                return new X(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                AbstractC2489a1 abstractC2489a1 = PARSER;
                AbstractC2489a1 abstractC2489a12 = abstractC2489a1;
                if (abstractC2489a1 == null) {
                    synchronized (LivekitAgent$Job.class) {
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

    public String getId() {
        return this.id_;
    }

    public AbstractC2534q getIdBytes() {
        return AbstractC2534q.y(this.id_);
    }

    public LivekitModels$ParticipantInfo getParticipant() {
        LivekitModels$ParticipantInfo livekitModels$ParticipantInfo = this.participant_;
        if (livekitModels$ParticipantInfo == null) {
            return LivekitModels$ParticipantInfo.getDefaultInstance();
        }
        return livekitModels$ParticipantInfo;
    }

    public LivekitModels$Room getRoom() {
        LivekitModels$Room livekitModels$Room = this.room_;
        if (livekitModels$Room == null) {
            return LivekitModels$Room.getDefaultInstance();
        }
        return livekitModels$Room;
    }

    public EnumC4018h getType() {
        EnumC4018h enumC4018h;
        int i10 = this.type_;
        if (i10 != 0) {
            if (i10 != 1) {
                enumC4018h = null;
            } else {
                enumC4018h = EnumC4018h.JT_PUBLISHER;
            }
        } else {
            enumC4018h = EnumC4018h.JT_ROOM;
        }
        if (enumC4018h == null) {
            return EnumC4018h.UNRECOGNIZED;
        }
        return enumC4018h;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasParticipant() {
        if ((this.bitField0_ & 1) != 0) {
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

    public static C3998d newBuilder(LivekitAgent$Job livekitAgent$Job) {
        return (C3998d) DEFAULT_INSTANCE.createBuilder(livekitAgent$Job);
    }

    public static LivekitAgent$Job parseDelimitedFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$Job) AbstractC2497d0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$Job parseFrom(ByteBuffer byteBuffer, J j6) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, byteBuffer, j6);
    }

    public static LivekitAgent$Job parseFrom(AbstractC2534q abstractC2534q) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q);
    }

    public static LivekitAgent$Job parseFrom(AbstractC2534q abstractC2534q, J j6) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2534q, j6);
    }

    public static LivekitAgent$Job parseFrom(byte[] bArr) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitAgent$Job parseFrom(byte[] bArr, J j6) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, bArr, j6);
    }

    public static LivekitAgent$Job parseFrom(InputStream inputStream) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitAgent$Job parseFrom(InputStream inputStream, J j6) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, inputStream, j6);
    }

    public static LivekitAgent$Job parseFrom(AbstractC2543v abstractC2543v) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v);
    }

    public static LivekitAgent$Job parseFrom(AbstractC2543v abstractC2543v, J j6) {
        return (LivekitAgent$Job) AbstractC2497d0.parseFrom(DEFAULT_INSTANCE, abstractC2543v, j6);
    }
}
